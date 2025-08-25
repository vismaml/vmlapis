import subprocess
from enum import StrEnum
from pathlib import Path
from typing import Annotated

import tomllib
import typer
from lxml import etree
from packaging.requirements import Requirement
from packaging.specifiers import Specifier
from packaging.specifiers import SpecifierSet
from packaging.version import Version
from rich import print
from rich.console import Console
from rich.progress import Progress
from rich.progress import SpinnerColumn
from rich.progress import TextColumn

from models import GoRegistry
from models import MavenRegistry
from models import NpmRegistry
from models import NugetRegistry
from models import Plugins
from models import PythonRegistry

app = typer.Typer()
console = Console()

VERSION_FILE = Path("buf-versions-3.toml")


def load_plugins() -> Plugins:
    """Load and parse buf-versions-3.toml using Pydantic models."""
    if not VERSION_FILE.exists():
        console.print(f"[red]❌ {VERSION_FILE} not found[/red]")
        raise typer.Exit(1)

    with open(VERSION_FILE, "rb") as f:
        data = tomllib.load(f)

    return Plugins.model_validate(data)


def sync_python(plugins: Plugins, progress, python_path: Path):
    filtered: list[PythonRegistry] = [x.registry.python for x in plugins.plugins if (x.registry and x.registry.python)]
    ## Python version
    requires_python_set = set([Specifier(x.requires_python) for x in filtered if x.requires_python])
    if requires_python_set:
        requires_python = max(requires_python_set, key=lambda x: x.version)
        if len(requires_python_set) > 1:
            typer.echo(f"❌ Python version conflict using {requires_python} from {requires_python_set}", err=True)

        # Write to File
        sed_cmd = ["sed", "-i.bak", "-e"]
        sed_cmd.extend([f's/requires-python = "[^"]*"/requires-python = "{requires_python}"/', "pyproject.toml"])
        subprocess.run(sed_cmd, cwd=python_path)
        subprocess.run(["rm", "-f", "pyproject.toml.bak"], cwd=python_path)

    ## Dependencies
    deps = [Requirement(dep) for x in filtered for dep in (x.deps or [])]
    deps_combined = {}
    for dep in deps:
        sps = deps_combined.get(dep.name, SpecifierSet())
        sps &= dep.specifier

        for sp in dep.specifier:
            if not sps.contains(sp.version):
                max_version = max(sps, key=lambda x: x.version)
                typer.echo(f"❌ Version conflict for {dep.name} - {sps} : Using {max_version}", err=True)
                sps = SpecifierSet([max_version])
                break

        deps_combined[dep.name] = sps

    if deps_combined:
        progress.add_task(description="uv add packages...", total=None)
        uv_added = ["uv", "add"]
        uv_added.extend([f"{name} {str(req)}" for name, req in deps_combined.items()])
        uv_added.extend(["--frozen", "-q"])
        subprocess.run(uv_added, cwd=python_path)


def sync_go(plugins: Plugins, progress, go_path: Path):
    filtered: list[GoRegistry] = [x.registry.go for x in plugins.plugins if (x.registry and x.registry.go)]
    min_versions = max([x.min_version for x in filtered if x.min_version], default=None)
    if min_versions:
        subprocess.run(["go", "mod", "edit", f"-go={min_versions}"], cwd=go_path)

    deps = [dep for x in filtered for dep in (x.deps or [])]
    deps_dict = {}
    for dep in deps:
        deps_dict[dep.name] = deps_dict.get(dep.name, []) + [Version(dep.version)]

    safe_deps = {}
    for name, versions in deps_dict.items():
        versions = set(versions)
        safe_deps[name] = max(versions)
        if len(versions) > 1:
            typer.echo(
                f"❌ Version conflict for {name} - {versions} : Using v{safe_deps[name]}",
                err=True,
            )

    for k, v in safe_deps.items():
        progress.add_task(description=f"go get {k}@{v}...", total=None)
        subprocess.run(["go", "get", f"{k}@v{v}"], cwd=go_path)


def sync_java(plugins: Plugins, progress, java_path: Path):
    pom_path = java_path / "pom.xml"
    parser = etree.XMLParser(remove_blank_text=True)

    filtered: list[MavenRegistry] = [x.registry.maven for x in plugins.plugins if (x.registry and x.registry.maven)]
    deps = [dep for x in filtered for dep in (x.deps or [])]

    deps_dict = {}
    for dep in deps:
        parts = dep.split(":")
        group_id, artifact_id, version = parts[0], parts[1], parts[2]
        key = f"{group_id}:{artifact_id}"
        deps_dict[key] = deps_dict.get(key, []) + [Version(version)]

    safe_deps = {}
    for artifact, versions in deps_dict.items():
        versions = set(versions)
        safe_deps[artifact] = max(versions)
        if len(versions) > 1:
            typer.echo(
                f"❌ Version conflict for {artifact} - {versions} : Using {safe_deps[artifact]}",
                err=True,
            )

    if safe_deps:
        progress.add_task(description="Java update pom...", total=None)
        tree = etree.parse(pom_path, parser)
        root = tree.getroot()
        ns = {"mv": root.nsmap[None]}
        dependencies = root.find("mv:dependencies", namespaces=ns)

        for artifact, version in safe_deps.items():
            group_id, artifact_id = artifact.split(":")
            dep = dependencies.xpath(f'.//mv:groupId[text()="{group_id}"]', namespaces=ns)
            existing_dep = dependencies.xpath(
                f'.//mv:dependency[mv:groupId[text()="{group_id}"] and mv:artifactId[text()="{artifact_id}"]]',
                namespaces=ns,
            )

            if len(existing_dep) == 1:
                version_elem = existing_dep[0].find("mv:version", namespaces=ns)
                version_elem.text = str(version)
                print(f"Updated {group_id}:{artifact_id} to {version}")
            else:
                # Add new dependency
                new_dep = etree.SubElement(dependencies, "dependency")
                etree.SubElement(new_dep, "groupId").text = group_id
                etree.SubElement(new_dep, "artifactId").text = artifact_id
                etree.SubElement(new_dep, "version").text = str(version)
                print(f"Added {group_id}:{artifact_id} at {version}")

        tree.write(pom_path, pretty_print=True, xml_declaration=True, encoding="UTF-8")


def sync_csharp(plugins: Plugins, progress, csharp_path: Path):
    filtered: list[NugetRegistry] = [x.registry.nuget for x in plugins.plugins if (x.registry and x.registry.nuget)]

    deps = [dep for x in filtered for dep in (x.deps or [])]
    deps_dict = {}

    for dep in deps:
        deps_dict[dep.name] = deps_dict.get(dep.name, []) + [Version(dep.version)]

    safe_deps = {}
    for package, versions in deps_dict.items():
        versions = set(versions)
        safe_deps[package] = max(versions)
        if len(versions) > 1:
            typer.echo(
                f"❌ Version conflict for {package} - {versions} : Using {safe_deps[package]}",
                err=True,
            )

    for package, version in safe_deps.items():
        progress.add_task(description=f"dotnet add {package}@{str(version)}...", total=None)
        subprocess.run(
            ["dotnet", "add", "vmlapis.csproj", "package", package, "-v", str(version), "-n"],
            capture_output=True, cwd=csharp_path
        )


def sync_javascript(plugins: Plugins, progress, javascript_path: Path):
    filtered: list[NpmRegistry] = [x.registry.npm for x in plugins.plugins if (x.registry and x.registry.npm)]

    deps = [dep for x in filtered for dep in (x.deps or [])]
    deps_combined = {}
    for dep in deps:
        dep.version = SpecifierSet(dep.version.replace("^", "~="))
        sps = deps_combined.get(dep.name, SpecifierSet())
        sps &= dep.version
        for sp in dep.version:
            print(sp)
            if not sps.contains(sp.version):
                max_version = max(sps, key=lambda x: x.version)
                typer.echo(f"❌ Version conflict for {dep.name} - {sps} : Using {max_version}", err=True)
                sps = SpecifierSet([max_version])
                break
        deps_combined[dep.name] = sps

    # Install packages with specific versions
    for package, version in deps_combined.items():
        version = str(version).replace("~=", "^")
        progress.add_task(description=f"npm install {package}@{version}...", total=None)
        subprocess.run(["npm", "install", f"{package}@{version}", "--package-lock-only"], cwd=javascript_path)


class Language(StrEnum):
    PYTHON = "python"
    GO = "go"
    CSHARP = "csharp"
    JAVA = "java"
    JAVASCRIPT = "javascript"


@app.command(name="sync-packages")
def sync_command(
    language: Annotated[
        list[Language], typer.Argument(help="Language to sync (python, go, csharp, java, javascript, all)")
    ],
    python_path: Annotated[Path, typer.Option("--python-path", "-p")] = Path("./"),
    go_path: Annotated[Path, typer.Option("--go-path", "-g")] = Path("./"),
    java_path: Annotated[Path, typer.Option("--java-path", "-j")] = Path("./java-package"),
    csharp_path: Annotated[Path, typer.Option("--csharp-path", "-c")] = Path("./"),
    javascript_path: Annotated[Path, typer.Option("--javascript-path", "-js")] = Path("./"),
) -> None:
    """Sync dependencies for a specific language from buf-versions-3.toml."""
    ending_messages = []
    plugins = load_plugins()
    with Progress(
        SpinnerColumn(),
        TextColumn("[progress.description]{task.description}"),
        transient=False,
    ) as progress:
        try:
            if Language.PYTHON in language:
                print(python_path)
                sync_python(plugins, progress, python_path)
                ending_messages.append("🐍 python synced")
            if Language.GO in language:
                sync_go(plugins, progress, go_path)
                ending_messages.append("🐹 go synced")
            if Language.JAVA in language:
                sync_java(plugins, progress, java_path)
                ending_messages.append("☕ java synced")
            if Language.CSHARP in language:
                sync_csharp(plugins, progress, csharp_path)
                ending_messages.append("🔷 csharp synced")
            if Language.JAVASCRIPT in language:
                sync_javascript(plugins, progress, javascript_path)
                ending_messages.append("📦 javascript synced")
        except Exception as e:
            print(f"[red]❌ Failed to sync {language} dependencies: {e}[/red]")

    for message in ending_messages:
        print(message)


if __name__ == "__main__":
    app()
