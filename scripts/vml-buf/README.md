# VML Buf

VML Buf plugin and package management tools for managing Buf plugin versions and syncing language-specific dependencies.

## Features

- **Plugin Version Management**: Update and sync Buf plugin versions across your project
- **Package Syncing**: Sync language package dependencies to match versions in `buf-versions-3.toml`
- **Multi-language Support**: Python, Go, Java, C#, and JavaScript/TypeScript
- **Conflict Resolution**: Automatically resolves version conflicts by choosing the highest compatible version
- **Docker Integration**: Uses Docker containers for package management to avoid local toolchain requirements

## Installation

Install as a uv tool:

```bash
uv tool install --editable .
```

Or install in development mode:

```bash
uv pip install --editable .
```

## Usage

### Plugin Version Management

```bash
# Check if plugin versions are in sync
vml-buf check

# Update plugins to latest versions  
vml-buf update

# Update only specific plugins
vml-buf update --plugins grpc --plugins protobuf

# Update only minor/patch versions
vml-buf update --minor-only
vml-buf update --patch-only

# Capture current plugin versions from code
vml-buf capture

# Sync code with lock file versions
vml-buf sync
```

### Package Dependency Syncing

```bash
# Sync specific language dependencies
vml-buf sync-packages python
vml-buf sync-packages go
vml-buf sync-packages java
vml-buf sync-packages csharp
vml-buf sync-packages javascript

# Sync all languages
vml-buf sync-packages python go java csharp javascript

```