# Protobuf API definitions for VML

## Requirements

- `cd` into the cloned `vmlapis` directory
- Run docker on your computer
- Have `buf` installed
- Have `buf` [account](https://buf.build/signup)
- Have buf token generated and set as environment variable named BUF_TOKEN `export BUF_TOKEN=<your_token>`

```bash
brew install bufbuild/buf/buf
```

## Code generation

Generation is done with a dockerfile (docker command is included in the makefile). Just run:

```bash
make
```
### Update with cli 
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
uv tool install --editable ./scripts/vml-buf 
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
...

# Sync all languages
vml-buf sync-packages python go java csharp javascript

```
### Adding new service

If you added new file with service to the proto-definitions. Add it to the Makefile.
Search:
```bash
	buf build proto -o gen/descriptor.bin \
```

### Linting and breaking changes

The files in the `proto/` directory are automatically formatted by the [Buf's linter](https://docs.buf.build/lint/overview).

Code is checked for breaking changes against the `master` branch. If generation fails at the `buf breaking` command during the `make` process, follow the instructions from the output to make the new code backwards-compatible.

> :warning: **If you're getting breaking-changes in dependencies:** We're currently using quite strict breaking-changes check and it can happen that Buf will complain about a dependency introducing breaking-changes into our code. Use common sense here, based on the check's error messages. If it's an acceptable "breaking change" just comment out the `buf breaking proto` line in the `Makefile`, re-generate the code, and de-comment the line again (so the check will run again next time, skipping the current version).

### Updating dependecies

Dependencies are currently updated manually. They should be be updated periodically when new changes are rolled out with newer versions of vml-apis. To update them:

- Remote dependencies - Run `buf mod update proto` in the cloned `vmlapis` directory. This will update the `buf.lock` file and download the newest version of the remote dependencies.
- Local dependencies - You need to copy the new `.proto` files into the `/deps` directory. You'll find the newer files in the respective github repositories or documentation of the dependency provider.

After that, re-generate the code again.

### Examples
In the `examples` directory you can find examples of how to use the generated code. You can find in-depth documentation [here](http://docs.vml.visma.ai/)

### Publishing
We're currently publishing packages for Python and Java(Maven) to Artifact Registry and NuGet package to NuGet.org under the `VMLAssets` organization.

