import difflib
import json
import re
import subprocess
from pathlib import Path
from typing import NamedTuple
from urllib.request import urlopen

import tomli_w
import tomllib
import typer
from packaging.version import parse
from rich import print
from rich.console import Console
from rich.progress import track
from rich.table import Table
from typing_extensions import Annotated
from yaml import Loader as YAMLLoader
from yaml import load as yaml_load

from models import BuffGenFile
from models import GitHubVersionResponse
from models import Plugin
from models import Plugins

VERSION_FILE = Path("buf-versions-3.toml")
NO_VERSION = "NA!"


class VersionDiff(NamedTuple):
    locked: str
    code: str


def fetch_plugin_dependencies(plugin_name: str, version: str) -> Plugin:
    """Fetch plugin dependencies from local plugin files."""
    org, plugin = plugin_name.replace("buf.build/", "").split("/")
    url = f"https://raw.githubusercontent.com/bufbuild/plugins/main/plugins/{org}/{plugin}/{version}/buf.plugin.yaml"

    try:
        with urlopen(url) as response:
            data = yaml_load(response.read().decode("utf-8"), Loader=YAMLLoader)

        return Plugin.model_validate(data)
    except Exception as e:
        typer.echo(f"Could not get dependencies for {plugin_name}/{version}: {e}")
        return Plugin(name=plugin_name, plugin_version=NO_VERSION)


def fetch_latest_versions(plugin: Plugin, minor_only: bool = False, patch_only: bool = False) -> Plugin:
    """Find the latest version for a plugin."""
    org, plugin_name = plugin.name.replace("buf.build/", "").split("/")
    current_parsed = parse(plugin.plugin_version)
    latest_version = plugin.plugin_version
    latest_parsed = current_parsed
    url = f"https://api.github.com/repos/bufbuild/plugins/contents/plugins/{org}/{plugin_name}"

    try:
        with urlopen(url) as response:
            data = json.loads(response.read().decode("utf-8"))

        # Use the Pydantic model to handle filtering
        github_response = GitHubVersionResponse(items=data)

        for version_name, version_parsed in github_response.parsed_versions:
            if latest_parsed < version_parsed:
                if patch_only:
                    # only update if bigger but major and minor is the same
                    if current_parsed.major != version_parsed.major or current_parsed.minor != version_parsed.minor:
                        continue
                elif minor_only:
                    # only update if bigger but major is the same
                    if current_parsed.major != version_parsed.major:
                        continue

                latest_parsed = version_parsed
                latest_version = version_name

        # Return updated plugin with new version if changed
        if latest_version != plugin.plugin_version:
            return fetch_plugin_dependencies(plugin.name, latest_version), 0
        return plugin, 0

    except Exception as e:
        typer.echo(f"Plugin not found in: {url} \n {e}")
        return plugin, 1


def update_code_plugin_versions(plugins_to_update: dict[str, str], dry_run=True) -> list[tuple[str, str, str, str]]:
    updates = []
    for file_path in Path(".").glob("buf.gen.*.yaml"):  # TODO maybe make a arg
        with open(file_path) as f:
            raw_data = f.read()

        data = yaml_load(raw_data, Loader=YAMLLoader)
        buffile = BuffGenFile.model_validate(data)
        result = None
        for plugin in buffile.plugins:
            if plugin.p_name in plugins_to_update:
                if plugin.version != plugins_to_update[plugin.p_name]:
                    escaped_plugin = re.escape(plugin.p_name)
                    old_version = plugin.version
                    new_version = plugins_to_update[plugin.p_name]
                    updates.append((str(file_path), plugin.p_name, old_version, new_version))
                    # Build sed command based on dry_run
                    sed_cmd = ["sed"]
                    if not dry_run:
                        sed_cmd.extend(["-i.bak", "-e"])
                    sed_cmd.extend(
                        [
                            f"s|{escaped_plugin}:{re.escape(old_version)}|{escaped_plugin}:{new_version}|g",
                            str(file_path),
                        ]
                    )

                    result = subprocess.run(sed_cmd, capture_output=dry_run, text=True, check=True)

                    # Remove backup
                    if not dry_run:
                        subprocess.run(["rm", "-f", f"{str(file_path)}.bak"])

        if result and dry_run:
            current_lines = raw_data.splitlines(keepends=True)
            updated_lines = result.stdout.splitlines(keepends=True)

            diff = difflib.unified_diff(current_lines, updated_lines, fromfile=str(file_path), tofile=str(file_path))
            print()
            print("".join(diff))

    return updates


def get_code_plugins_and_versions(quiet: bool = False) -> dict[str, str]:
    plugins = {}
    for file_path in Path(".").glob("buf.gen.*.yaml"):  # TODO maybe make a arg
        with open(file_path) as f:
            data = yaml_load(f, Loader=YAMLLoader)
        buffile = BuffGenFile.model_validate(data)

        for plugin in buffile.plugins:
            if plugin.p_name in plugins:
                if plugin.version != plugins[plugin.p_name]:
                    if not quiet:
                        typer.echo(
                            f"❌ Version conflict for {plugin.p_name}: {plugin.version} vs {plugins[plugin.p_name]}",
                            err=True,
                        )
                    raise typer.Exit(1)
            elif plugin.p_name:
                plugins[plugin.p_name] = plugin.version

    return plugins


def calculate_differences(lock_versions: dict[str, str], code_versions: dict[str, str]) -> dict[str, VersionDiff]:
    """Calculate differences between code and locked versions."""
    differences = {}

    for plugin in set(code_versions.keys()) | set(lock_versions.keys()):
        lock_ver = lock_versions.get(plugin, NO_VERSION)
        code_ver = code_versions.get(plugin, NO_VERSION)

        if lock_ver != code_ver:
            differences[plugin] = VersionDiff(locked=lock_ver, code=code_ver)

    return differences


def get_lock_file_versions(version_file: Path | Plugins, quiet: bool) -> tuple[Plugins, dict[str, str]]:
    try:
        if isinstance(version_file, Plugins):
            lock_plugins = version_file
        else:
            with open(version_file, "rb") as f:
                data = tomllib.load(f)
            lock_plugins = Plugins.model_validate(data)
        lock_versions = {x.name: x.plugin_version for x in lock_plugins.plugins}
    except Exception as e:
        if not quiet:
            typer.echo(f"Error loading versionfile: {e}")
        raise typer.Exit(1) from e
    # Get versions from the code

    return lock_plugins, lock_versions


### The CLI calls

app = typer.Typer()
console = Console()


@app.command()
def check(
    version_file: Annotated[Path, Plugins, typer.Option(help="Path to version file")] = VERSION_FILE,
    quiet: Annotated[bool, typer.Option(help="Dont print")] = False,
) -> int:
    """Check if version file and code versions are in sync"""
    # get lock versions
    _, lock_versions = get_lock_file_versions(version_file, quiet)
    # get versions from code
    code_versions = get_code_plugins_and_versions(quiet=quiet)
    differences = calculate_differences(lock_versions, code_versions)

    if differences:
        if not quiet:
            typer.echo("❌ Version mismatch detected")
            table = Table(title="Version Differences")
            table.add_column("Plugin", style="cyan")
            table.add_column("Version File", style="yellow")
            table.add_column("Code", style="green")
            for plugin, diff in differences.items():
                table.add_row(plugin, diff.locked, diff.code)
            console.print(table)
        raise typer.Exit(1)

    if not quiet:
        print("✅ All plugins are in sync!")


def write_lock_file(locked_plugins, new_lock_versions, version_file, differences, dry_run):
    if dry_run:
        if differences:
            current_lines = tomli_w.dumps(locked_plugins.model_dump(exclude_none=True, by_alias=True)).splitlines(
                keepends=True
            )
            new_lines = tomli_w.dumps(new_lock_versions.model_dump(exclude_none=True, by_alias=True)).splitlines(
                keepends=True
            )

            diff = difflib.unified_diff(current_lines, new_lines, fromfile="current lock file", tofile="new lock file")
            print()
            print("".join(diff))
        else:
            print("🎉 No diff was found")

    else:
        with open(version_file, "wb") as f:
            tomli_w.dump(new_lock_versions.model_dump(exclude_none=True, by_alias=True), f)
        print("🎉 Versions have been captured!")


@app.command()
def capture(
    version_file: Annotated[Path, typer.Option(help="Path to version file")] = VERSION_FILE,
    dry_run: Annotated[bool, typer.Option(help="Show what would be done without making changes")] = False,
    use_cache: Annotated[bool, typer.Option(help="Only check for dependencies if there is a diff")] = True,
) -> None:
    """Update version file with versions found in code, and code dependencies"""
    # Check if version_file is a Path and doesn't exist, create empty Plugins
    if not version_file.exists():
        locked_plugins, lock_versions = Plugins(plugins=[]), {}
    else:
        locked_plugins, lock_versions = get_lock_file_versions(version_file, quiet=False)

    code_versions = get_code_plugins_and_versions(quiet=False)
    if use_cache:
        differences = calculate_differences(lock_versions, code_versions)
    else:
        differences = {k: VersionDiff(NO_VERSION, v) for k, v in code_versions.items()}

    # Remove plugins from locked_plugins that are in differences
    new_lock_versions = locked_plugins.without_plugins(differences.keys())

    for plugin_name, versions in track(differences.items(), description="🔗 Fetching dependencies.."):
        if versions.code != NO_VERSION:
            plugin = fetch_plugin_dependencies(plugin_name, versions.code)
            new_lock_versions.plugins.append(plugin)

    write_lock_file(locked_plugins, new_lock_versions, version_file, differences, dry_run)


@app.command()
def update(
    version_file: Annotated[Path, Plugins, typer.Option(help="Path to version file")] = VERSION_FILE,
    plugins: Annotated[list[str], typer.Option("--plugins", "-p", help="Update specific plugin(s) only")] = None,
    minor_only: Annotated[bool, typer.Option("--minor-only", help="Only update minor versions")] = False,
    patch_only: Annotated[bool, typer.Option("--patch-only", help="Only update patch versions")] = False,
    dry_run: Annotated[bool, typer.Option("--dry-run", help="Show what would be done without making changes")] = False,
) -> None:
    """Fetch and update to latest plugin versions"""
    error_code = 0
    locked_plugins, lock_versions = get_lock_file_versions(version_file, quiet=False)

    # Filter plugins if specific ones are requested
    plugins_to_update = locked_plugins.plugins
    seen = set()
    if plugins:
        plugins_to_update = []
        for plugin_filter in plugins:
            # Find plugins that contain the filter string (case insensitive)
            matching_plugins = [
                plugin for plugin in locked_plugins.plugins if plugin_filter.lower() in plugin.name.lower()
            ]

            plugins_to_update.extend(matching_plugins)

        # Remove duplicates while preserving order

        plugins_to_update = [
            plugin for plugin in plugins_to_update if plugin.name not in seen and not seen.add(plugin.name)
        ]

        if not plugins_to_update:
            typer.echo(f"❌ No plugins found matching: {', '.join(plugins)}")
            raise typer.Exit(1)

        typer.echo(f"📦 Updating {len(plugins_to_update)} plugins matching: {', '.join(plugins)}")

    locked_plugins_new = Plugins(plugins=[])
    for plugin in track(plugins_to_update, description="📦 Fetching newest versions.. 🚀"):
        seen.add(plugin.name)
        p, e = fetch_latest_versions(plugin, minor_only=minor_only, patch_only=patch_only)
        error_code += e
        locked_plugins_new.plugins.append(p)

    for plugin in locked_plugins.plugins:
        if plugin.name not in seen:
            locked_plugins_new.plugins.append(plugin)

    typer.echo("🖍️  Write lock file")
    write_lock_file(locked_plugins, locked_plugins_new, version_file, locked_plugins_new.plugins, dry_run)
    typer.echo("🔄  sync gen files")
    sync(locked_plugins_new, dry_run)

    if dry_run:
        typer.echo("🚧 Dry run mode - no files will be modified. Mismatches may appear in subsequent checks 🚧")
    check(version_file, False)

    print(f"Exit code {error_code}")
    raise typer.Exit(error_code)


@app.command()
def sync(
    version_file: Annotated[Path, Plugins, typer.Option(help="Path to version file")] = VERSION_FILE,
    dry_run: Annotated[bool, typer.Option(help="Show what would be done without making changes")] = False,
) -> None:
    """Sync code with versions from version file"""
    _, lock_versions = get_lock_file_versions(version_file, quiet=False)
    updates = update_code_plugin_versions(lock_versions, dry_run)

    if updates:
        typer.echo()
        table = Table(title="✅ all synced")
        table.add_column("File", style="cyan")
        table.add_column("Plugin", style="yellow")
        table.add_column("Old version", style="red")
        table.add_column("New version", style="green")
        for file_path, plugin, old_version, new_version in updates:
            table.add_row(file_path, plugin, old_version, new_version)
        console.print(table)
    else:
        print("🟡 [italic yellow]No versions to update[/italic yellow]")


if __name__ == "__main__":
    app()
