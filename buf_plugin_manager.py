# /// script
# requires-python = ">=3.11"
# dependencies = [
#   "pyyaml",
#   "toml",
#   "packaging",
#   "tomli-w",
#   "typer-slim[standard]",
# ]
# ///

## uv run buf_plugin_manager.py

import json
import pickle
import urllib.request
from pathlib import Path
import typer
from typing_extensions import Annotated

import tomli_w
import tomllib
from packaging.version import parse
from yaml import load as yaml_load
from yaml import dump as yaml_dump

from yaml import Dumper as YAMLDumper

try:
    from yaml import CLoader as YAMLLoader
except ImportError:
    from yaml import Loader as YAMLLoader


class IndentYAMLDumper(YAMLDumper):
    def increase_indent(self, flow=False, indentless=False):
        return super(IndentYAMLDumper, self).increase_indent(flow, False)
    

def pass_plugin_info(plugin):
    lang = plugin.get("output_languages")

    if not lang or len(lang) > 1:
        return None, None, None

    lang = lang[0]

    registry = plugin.get("registry", {})

    # Extract dependencies based on language
    deps = []
    # print(json.dumps(plugin, indent=2))

    if lang == "python":
        lang_registry = registry.get("python", {})
        deps = lang_registry.get("deps", [])
        lang_version = lang_registry.get("requires_python")
    elif lang == "go":
        lang_registry = registry.get("go", {})
        deps = lang_registry.get("deps", [])
        lang_version = lang_registry.get("min_version")
    elif lang == "javascript":
        lang_registry = registry.get("npm", {})
        deps = lang_registry.get("deps", [])
        lang_version = None
    elif lang == "java":
        lang_registry = registry.get("maven", {})
        deps = lang_registry.get("deps", [])
        lang_version = None
    elif lang == "csharp":
        lang_registry = registry.get("nuget", {})
        deps = lang_registry.get("deps", [])
        lang_version = lang_registry.get("target_frameworks")

    return lang, lang_version, deps


def get_lang_dependencies(plugin_name, version):
    org, plugin = plugin_name.replace("buf.build/", "").split("/")

    try:
        url = f"https://raw.githubusercontent.com/bufbuild/plugins/main/plugins/{org}/{plugin}/{version}/buf.plugin.yaml"
        with urllib.request.urlopen(url) as response:
            plugin = yaml_load(response.read().decode("utf-8"), Loader=YAMLLoader)

        return pass_plugin_info(plugin)

    except Exception as e:
        print(f"Could not dep for {plugin_name}/{version}: {e}")


def get_latest_version(plugin_name: str) -> str:
    """Get latest version from GitHub."""
    # Extract org/plugin from buf.build/org/plugin
    org, plugin = plugin_name.replace("buf.build/", "").split("/")
    max_version_parsed = parse(0.0)
    max_version = None

    try:
        # Get directory listing from GitHub API
        url = f"https://api.github.com/repos/bufbuild/plugins/contents/plugins/{org}/{plugin}"
        with urllib.request.urlopen(url) as response:
            dirs = json.loads(response.read().decode("utf-8"))

        for item in dirs:
            if item["type"] == "dir" and item["name"][0] in ("v", "V"):
                _version_parsed = parse(item["name"])
                if (
                    not _version_parsed.is_prerelease()
                ) and _version_parsed > max_version_parsed:
                    max_version_split = _version_parsed
                    max_version = item["name"]

        return max_version, max_version_split

    except Exception as e:
        print(f"Could not get latest version for {plugin_name}: {e}")
    return None, max_version_split


def go_trough_plugins(root_path: str = "", plugins_to_update = None) -> dict[str, str]:
    """
    Find all plugins used in buf.gen.yaml files within a directory tree.
    Args:
        root_path (str, optional)
    Returns:
        Dict[str, str]: A dictionary mapping plugin names to their versions.
    Raises:
        Exception: Catches and prints errors when reading or parsing YAML files,
                  but continues processing remaining files.
        ValueError: if same plugin have different versions
    """
    plugins = {}
    root_path = Path(root_path)
    # Find all buf.gen.yaml files
    buf_files = list(root_path.glob("buf.gen.*.yaml"))

    for file_path in buf_files:
        try:
            change = True
            with open(file_path, "r") as f:
                content = yaml_load(f, Loader=YAMLLoader)

            for plugin in content.get("plugins", []):
                if "plugin" not in plugin:
                    continue

                p, v = plugin["plugin"].split(":")

                if plugins_to_update and v != plugins_to_update[p]:
                    v = plugins_to_update[p]
                    plugin["plugin"] = f"{p}:{v}"
                    change = True                        

                if p in plugins and v != plugins[p]:
                    raise ValueError(f"Same plugin '{p}' found with different versions: '{plugins[p]}' and '{v}'")
                
                plugins[p] = v
            
            if change:
                with open(file_path, "w") as f:
                    yaml_dump(data=content, stream=f, Dumper=IndentYAMLDumper, sort_keys=False, indent=2)

        except Exception as e:
            print(f"Error reading {file_path}: {e}")

    return plugins


def main():
    all_plugins = go_trough_plugins("./")

    hej = {"title": "Versions and dependencies of the used plugins"}

    for name, v in all_plugins.items():
        print(name, v)
        lang, lang_version, deps = get_lang_dependencies(name, v)
        if lang is None:
            lang = "non_lang"

        print(lang, lang_version, deps)

        the_l = hej.get(lang, {})

        if lang_version:
            if "version" in the_l and lang_version != the_l["version"]:
                print(
                    f"warning the lang version is not the same, {lang}: {the_l['version']} != {lang_version}"
                )

                the_l["version"] = max(
                    the_l["version"], lang_version, key=lambda x: parse(x)
                )
                print(f"using newest: {the_l['version']}")

            else:
                the_l["version"] = lang_version

        the_l_plug = the_l.get("plugins", [])
        the_l_plug.append({"name": name, "version": v})
        the_l["plugins"] = the_l_plug

        the_l_dep = the_l.get("dependencies", [])
        if deps:
            the_l_dep.extend(deps)
        # Remove duplicates while preserving order, handling both strings and dicts
        seen = set()
        unique_deps = []
        for dep in the_l_dep:
            if isinstance(dep, dict):
                # For dicts, use a string representation as key
                dep_key = str(sorted(dep.items()))
            else:
                # For strings, use the string itself
                dep_key = dep

            if dep_key not in seen:
                seen.add(dep_key)
                unique_deps.append(dep)

        if unique_deps:
            the_l["dependencies"] = unique_deps

        hej[lang] = the_l

    with open("package_versions.pkl", "wb") as f:
        pickle.dump(hej, f)

    print(hej)
    print("------")
    print(json.dumps(hej, indent=2))
    print("------")

    with open("package_versions.toml", "wb") as f:
        tomli_w.dump(hej, f)


def check_sync_status():
    found = go_trough_plugins()
    
    # load package_versions.toml
    with open("package_versions.toml", "rb") as f:
        stored_data = tomllib.load(f)
    # Extract plugins from stored data

    stored_plugins = {}
    for lang_data in stored_data.values():
        if isinstance(lang_data, dict) and "plugins" in lang_data:
            for plugin in lang_data["plugins"]:
                if plugin["name"] in stored_plugins:
                    raise ValueError(f"{plugin['name']} appears more then once in package_versions.toml") 
                stored_plugins[plugin["name"]] = plugin["version"]
    
    # Compare plugins and versions
    in_sync = True
    
    # Check for plugins in found but not in stored
    for plugin, version in found.items():
        if plugin not in stored_plugins:
            print(f"NEW PLUGIN: {plugin}:{version} found but not in package_versions.toml")
            in_sync = False
        elif stored_plugins[plugin] != version:
            print(f"VERSION MISMATCH: {plugin} - found: {version}, stored: {stored_plugins[plugin]}")
            in_sync = False
    
    # Check for plugins in stored but not found
    for plugin, version in stored_plugins.items():
        if plugin not in found:
            print(f"REMOVED PLUGIN: {plugin}:{version} in package_versions.toml but not found in buf.gen.*.yaml files")
            in_sync = False

    return in_sync, stored_plugins

def sync_versions():
    n_sync, stored_plugins = check_sync_status()

    if not n_sync:
        go_trough_plugins("", stored_plugins)

def test(plugin: Annotated[str, typer.Argument(help="Name of the plugin you want to look at")]):

    print("plugin", plugin)

    in_sync, _ = check_sync_status()

        # Summary
    if in_sync:
        print("✅ All plugins are in sync!")
    else:
        print("❌ Plugins are out of sync. Consider running main() to update package_versions.toml")

    
    sync_versions()

if __name__ == "__main__":
    


    typer.run(test)