"""Shared Pydantic models for buf plugin management."""

from typing import Any

from packaging.version import Version
from packaging.version import parse
from pydantic import AliasChoices
from pydantic import BaseModel
from pydantic import Field
from pydantic import model_validator


class GitHubContentItem(BaseModel):
    name: str
    type: str


class GitHubVersionResponse(BaseModel):
    items: list[GitHubContentItem]

    @property
    def version_dirs(self) -> list[str]:
        """Get all version directory names that start with 'v' or 'V'"""
        return [item.name for item in self.items if item.type == "dir" and item.name.startswith(("v", "V"))]

    @property
    def parsed_versions(self) -> list[tuple[str, Version]]:
        """Get version names with their parsed Version objects, filtering invalid ones"""
        versions = []
        for version_name in self.version_dirs:
            try:
                parsed = parse(version_name)
                versions.append((version_name, parsed))
            except Exception:
                continue
        return versions


class PluginDependency(BaseModel):
    p_name: str | None = None
    version: str | None = None

    def __init__(self, **kwargs):
        if "plugin" in kwargs and ":" in kwargs["plugin"]:
            p_name, version = kwargs["plugin"].split(":", 1)
            kwargs = {"p_name": p_name, "version": version}

        super().__init__(**kwargs)


class RegistryDeps(BaseModel):
    name: str = Field(validation_alias=AliasChoices("name", "module", "package"))
    version: str


class GoRegistry(BaseModel):
    min_version: float | None = None
    deps: list[RegistryDeps] | None = None


class NugetRegistry(BaseModel):
    target_frameworks: list[str] | None = None
    deps: list[RegistryDeps] | None = None


class MavenRegistry(BaseModel):
    deps: list[str] | None = None


class NpmRegistry(BaseModel):
    import_style: str | None = None
    deps: list[RegistryDeps] | None = None


class PythonRegistry(BaseModel):
    package_type: str | None = None
    requires_python: str | None = None
    deps: list[str] | None = None


class Registry(BaseModel):
    opts: list[str] | None = None
    go: GoRegistry | None = None
    nuget: NugetRegistry | None = None
    maven: MavenRegistry | None = None
    npm: NpmRegistry | None = None
    python: PythonRegistry | None = None

    @model_validator(mode="after")
    def at_least_one_registry(self):
        registries = [self.go, self.nuget, self.maven, self.npm, self.python]
        if not any(registries):
            raise ValueError("At least one registry must be specified")
        return self

    def get_active_registry(self) -> GoRegistry | NugetRegistry | MavenRegistry | NpmRegistry | PythonRegistry:
        """Get the first non-null registry"""
        for registry in [self.go, self.nuget, self.maven, self.npm, self.python]:
            if registry is not None:
                return registry
        raise ValueError("No active registry found")


class Plugin(BaseModel):
    name: str
    plugin_version: str
    output_languages: list[str] = ["application_plugins"]
    deps: list[PluginDependency] | None = None
    registry: Registry | None = None


class Plugins(BaseModel):
    plugins: list[Plugin]

    def model_dump(self, *args, **kwargs) -> dict[str, Any]:
        self.plugins.sort(key=lambda x: (x.output_languages[0], x.name))
        data = super().model_dump(*args, **kwargs)
        return data

    def without_plugins(self, plugin_names: list[str]) -> "Plugins":
        """Return a new Plugins instance without the specified plugins."""
        return Plugins(plugins=[plugin for plugin in self.plugins if plugin.name not in plugin_names])


class BuffGenFile(BaseModel):
    plugins: list[PluginDependency]
