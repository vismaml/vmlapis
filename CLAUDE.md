# vmlapis

Proto definitions and generated client/server code for the VML platform (SSN, ASGT, CV).

## Code Generation

**Always use `make` — never run `buf generate` directly.**

Running `buf generate` directly with `--include-imports` will regenerate shared dependency files (google/api, protobuf, validate) that should not be touched, creating noise in the diff.

| Command | When to use |
|---|---|
| `make docker` | **Default** — formats proto, checks breaking changes against master, generates via Docker. Use for PRs. |
| `make all` | Fast local generation (no Docker, no format/lint). Use during development. |

```bash
# Development iteration
cd vmlapis
make all

# Before opening a PR
make docker
```

`make docker` requires `BUF_TOKEN` to be set:
```bash
export BUF_TOKEN=<your_token>
```

## Adding a New Service

Two places to update in the Makefile:

1. **`gen/descriptor.bin`** (customer-facing services only) — add `--path proto/<package>/v1/<file>.proto` to the `buf build proto -o gen/descriptor.bin` block (line ~53).

2. **`gen/spanner_descriptor.bin`** (services with Spanner PROTO columns) — add the proto path to the `buf build proto --as-file-descriptor-set -o gen/spanner_descriptor.bin` block (line ~67).

If neither applies (internal service, no Spanner proto columns), no Makefile change is needed.

## Proto Conventions

**Field alignment:** Use single-space separation between type and field name — no column alignment. Match the style of existing messages in the same file.

**Enum design — `CandidateSource`:** The enum encodes annotation *provenance* — who produced the annotation. Three values only: `PREDICTION` (model), `FEEDBACK` (consumer correction), `LABEL` (human annotator). Do not add system or tool names (e.g. `GEO`, `OCR`, `NLP`) — those are sub-steps within the prediction pipeline. If a specific tool needs to be identified, use `source_id` (e.g. `source_id = "geo-service-v1"`).

**Breaking changes:** `make docker` checks for breaking changes against `master`. If buf complains about a dependency introducing breaking changes (not your code), comment out the `buf breaking proto` line, regenerate, then restore it — see the README for details.

## Spanner Descriptor

`gen/spanner_descriptor.bin` is consumed by `vml-spanner` for native PROTO columns. Copy it after regeneration:
```bash
cp gen/spanner_descriptor.bin ../vml-spanner/spanner_descriptor.bin
```

## Repo Structure

```
proto/
├── ssn/
│   ├── annotator/v1/       # Smartscan document annotation (customer-facing)
│   ├── asyncton/v1/        # Async transaction processing (customer-facing)
│   ├── dataservice/v1/     # Training data / feedback storage
│   ├── documentdataservice/v1/  # Internal unified document data layer
│   ├── access/v1/          # Customer access control
│   ├── geo/v1/             # Address geocoding (internal)
│   ├── ocrservice/v1/      # OCR (internal)
│   ├── pdfservice/v1/      # PDF rendering (internal)
│   └── type/               # Shared SSN types (Candidate, TextAnnotation, QR, Address, …)
├── asgt/
│   ├── data/v1/            # ASGT data service (customer-facing)
│   ├── jester/v1/          # ASGT jester (customer-facing)
│   ├── v2/                 # ASGT v2 API (customer-facing)
│   └── type/               # Shared ASGT types
└── cv/
    └── scanner/v1/         # CV scanner (customer-facing)
gen/
├── go/                     # Generated Go stubs
├── java/                   # Generated Java stubs
├── python/                 # Generated Python stubs
├── js/                     # Generated JS stubs
├── csharp/                 # Generated C# stubs
├── descriptor.bin          # Binary descriptor for customer-facing services
└── spanner_descriptor.bin  # Binary descriptor for Spanner PROTO columns
```

## Dependencies

**Remote dependencies** (buf registry):
```bash
buf mod update proto   # updates buf.lock
```

**Local dependencies** (`deps/` directory) — copy updated `.proto` files manually from upstream repos.

After updating dependencies, re-run `make docker`.

## Package Management (vml-buf tool)

`scripts/vml-buf` manages buf plugin versions across all language targets.

```bash
uv tool install --editable ./scripts/vml-buf

vml-buf check          # check if plugin versions are in sync
vml-buf update         # update plugins to latest
vml-buf update --minor-only  # safe updates only
vml-buf sync           # sync code to lock file versions
vml-buf sync-packages python go java csharp javascript  # sync language deps
```

## Publishing

Generated packages are published automatically on merge to master:
- **Python** → GCP Artifact Registry
- **Java** → Maven (GCP Artifact Registry)
- **C#** → NuGet under `VMLAssets` organisation
