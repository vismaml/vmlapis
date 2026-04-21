# DocumentDataService Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use vmlpowers:subagent-driven-development (recommended) or vmlpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Write the `DocumentDataService` proto file and wire it into the Makefile build so that code generation produces Go, Python, Java, C#, and JS bindings, and the new types are included in the Spanner proto bundle.

**Architecture:** Single proto file at `proto/ssn/documentdataservice/v1/documentdataservice.proto`. Defines core shared types (`CandidateSource`, `InternalCandidate`, `InternalFieldAnnotation` with `oneof data`), complex field wrappers (purchase lines, VAT distribution, QR codes, QA), and three RPCs (`GetDocumentData`, `SetDocumentBlobs`, `AddAnnotations`). The proto is added to the Spanner descriptor build since its types will be stored as PROTO columns in Spanner.

**Tech Stack:** Protocol Buffers (proto3), buf CLI (`STANDARD` lint ruleset), `google/api/annotations.proto` (HTTP bindings), `google/protobuf/wrappers.proto` (optional string fields), `ssn/type/candidate.proto`, `ssn/type/qr.proto`

**Design spec:** `docs/vmlpowers/specs/2026-04-21-document-data-service-design.md`

---

### Task 1: Create the proto file

**Files:**
- Create: `proto/ssn/documentdataservice/v1/documentdataservice.proto`

**Context:**
- The repo stores proto definitions under `proto/` with the pattern `proto/<domain>/<service>/v1/<service>.proto`
- Existing examples: `proto/ssn/asyncton/v1/asyncton.proto`, `proto/ssn/mlservice/v2/mlservice.proto`
- `ssn.type.Candidate`, `PurchaseLine`, `VatDistribution`, `AnswerCandidate` are all in `ssn/type/candidate.proto`
- `ssn.type.QrCodeData`, `SwissQrBill` are in `ssn/type/qr.proto`
- The codebase uses `google.protobuf.StringValue` (from `google/protobuf/wrappers.proto`) for optional string fields — NOT proto3 `optional string`
- buf lint `STANDARD` ruleset requires: enum values prefixed with enum name in `UPPER_SNAKE_CASE`, unique request/response types per RPC (no sharing `google.protobuf.Empty` across multiple RPCs), `UpperCamelCase` messages, `lower_snake_case` fields

- [ ] **Step 1: Create the directory**

```bash
mkdir -p proto/ssn/documentdataservice/v1
```

- [ ] **Step 2: Write the proto file**

Create `proto/ssn/documentdataservice/v1/documentdataservice.proto` with this exact content:

```proto
syntax = "proto3";

package ssn.documentdataservice.v1;

import "google/api/annotations.proto";
import "google/protobuf/wrappers.proto";
import "ssn/type/candidate.proto";
import "ssn/type/qr.proto";

option go_package = "github.com/e-conomic/vmlapis/gen/go/ssn/documentdataservice/v1;documentdataservice";

// ---- Source provenance ----

// CandidateSource identifies the origin of a candidate value.
// Predictions, feedback, and labels are unified — the source field
// distinguishes them. Multiple candidates for the same feature from
// different sources coexist as separate entries.
enum CandidateSource {
  CANDIDATE_SOURCE_UNSPECIFIED = 0;
  CANDIDATE_SOURCE_PREDICTION = 1;
  CANDIDATE_SOURCE_FEEDBACK = 2;
  CANDIDATE_SOURCE_LABEL = 3;
}

// ---- Core candidate wrapper ----

// InternalCandidate wraps a standard ssn.type.Candidate with provenance.
// Used for all standard SSN fields (TOTAL_INCL_VAT, CURRENCY, CHECK_IN_DATE, etc.)
message InternalCandidate {
  ssn.type.Candidate candidate = 1;
  CandidateSource source = 2;
  // model_id for PREDICTION; annotator id for LABEL/FEEDBACK
  string source_id = 3;
}

// ---- Field data wrappers ----

// FieldData holds standard field candidates (ssn.type.Candidate-based fields).
message FieldData {
  repeated InternalCandidate candidates = 1;
}

// InternalPurchaseLine wraps ssn.type.PurchaseLine (new format only).
// Old PurchaseLineCandidate data is normalized to PurchaseLine at ingestion.
message InternalPurchaseLine {
  ssn.type.PurchaseLine line = 1;
  CandidateSource source = 2;
  string source_id = 3;
}

// PurchaseLineData holds purchase line annotations for feature "PURCHASE_LINES".
message PurchaseLineData {
  repeated InternalPurchaseLine lines = 1;
}

// InternalVatDistribution wraps ssn.type.VatDistribution (new format only).
// Old VatDistributionCandidate data is normalized to VatDistribution at ingestion.
message InternalVatDistribution {
  ssn.type.VatDistribution distribution = 1;
  CandidateSource source = 2;
  string source_id = 3;
}

// VatDistributionData holds VAT distribution annotations for feature "VAT_DISTRIBUTION".
message VatDistributionData {
  repeated InternalVatDistribution distributions = 1;
}

// InternalQrCode wraps either QrCodeData or SwissQrBill — both are QR extractions.
message InternalQrCode {
  oneof qr_type {
    ssn.type.QrCodeData qr_code_data = 1;
    ssn.type.SwissQrBill swiss_qr_bill = 2;
  }
  CandidateSource source = 3;
  string source_id = 4;
}

// QrData holds QR code annotations for feature "QR_CODES".
message QrData {
  repeated InternalQrCode qr_codes = 1;
}

// InternalAnswerCandidate wraps ssn.type.AnswerCandidate.
// AnswerCandidate carries the question as part of the data and cannot be
// represented as a standard Candidate.
message InternalAnswerCandidate {
  ssn.type.AnswerCandidate answer = 1;
  CandidateSource source = 2;
  string source_id = 3;
}

// AnswerData holds QA annotations for feature "QA".
message AnswerData {
  repeated InternalAnswerCandidate answers = 1;
}

// ---- Unified field annotation ----

// InternalFieldAnnotation groups all candidates for a single feature.
//
// customer_requested lives on the feature (not the candidate) because a feature
// can be requested but produce zero candidates (field not found on document).
//
// State table:
//   customer_requested=true,  candidates empty   → requested, not found on document
//   customer_requested=true,  candidates present → requested and annotated
//   customer_requested=false, candidates present → ad-hoc annotation (not originally requested)
message InternalFieldAnnotation {
  // Feature name, e.g. "TOTAL_INCL_VAT", "PURCHASE_LINES", "QA", "CHECK_IN_DATE"
  string feature = 1;
  bool customer_requested = 2;

  oneof data {
    FieldData field_data = 3;
    PurchaseLineData purchase_line_data = 4;
    VatDistributionData vat_distribution_data = 5;
    QrData qr_data = 6;
    AnswerData answer_data = 7;
  }
}

// ---- Service ----

service DocumentDataService {
  // GetDocumentData returns document blobs (as signed GCS URLs) and field
  // annotations for a given document. Large blobs (file, renders, TextAnnotation)
  // are returned as signed GCS URLs — never inline bytes.
  rpc GetDocumentData(GetDocumentDataRequest) returns (GetDocumentDataResponse) {
    option (google.api.http) = {get: "/v1/consumers/{consumer}/documents/{feedback_id}"};
  }

  // SetDocumentBlobs upserts GCS URIs for the document's blobs.
  // Presence-based: only fields present in the request are written.
  // Absent optional fields leave existing values untouched.
  rpc SetDocumentBlobs(SetDocumentBlobsRequest) returns (SetDocumentBlobsResponse) {
    option (google.api.http) = {
      put: "/v1/consumers/{consumer}/documents/{feedback_id}/blobs"
      body: "*"
    };
  }

  // AddAnnotations upserts field annotations by (feature, source, source_id).
  // Latest-wins: a second call with the same key replaces the previous entry.
  // To preserve history, use a distinct source_id (e.g. append a version suffix).
  rpc AddAnnotations(AddAnnotationsRequest) returns (AddAnnotationsResponse) {
    option (google.api.http) = {
      post: "/v1/consumers/{consumer}/documents/{feedback_id}/annotations"
      body: "*"
    };
  }
}

// ---- Request / Response messages ----

message GetDocumentDataRequest {
  string feedback_id = 1;
  string consumer = 2;
  bool include_predictions = 3;
  bool include_feedbacks = 4;
  bool include_labels = 5;
}

message GetDocumentDataResponse {
  string feedback_id = 1;
  string consumer = 2;

  // Authorized GCS URLs (signed, with expiration).
  string file_url = 3;
  // One per page in order. Empty = not rendered yet.
  repeated string render_urls = 4;
  // Absent = TextAnnotation not stored.
  google.protobuf.StringValue text_annotation_url = 5;

  // Field annotations filtered by include_* flags.
  // InternalFieldAnnotation entries with customer_requested=true and empty
  // candidates are always returned — they carry the "field not found" signal.
  repeated InternalFieldAnnotation fields = 6;
}

message SetDocumentBlobsRequest {
  string feedback_id = 1;
  string consumer = 2;
  // Set → write; absent → leave untouched.
  google.protobuf.StringValue file_uri = 3;
  // Non-empty → write; empty → leave untouched.
  repeated string render_uris = 4;
  // Set → write; absent → leave untouched.
  google.protobuf.StringValue ta_uri = 5;
}

message SetDocumentBlobsResponse {}

message AddAnnotationsRequest {
  string feedback_id = 1;
  string consumer = 2;
  repeated InternalFieldAnnotation annotations = 3;
}

message AddAnnotationsResponse {}
```

- [ ] **Step 3: Verify file was created**

```bash
ls proto/ssn/documentdataservice/v1/
```
Expected output: `documentdataservice.proto`

---

### Task 2: Lint, format, and build the proto

**Files:**
- Modify (format only): `proto/ssn/documentdataservice/v1/documentdataservice.proto`

**Context:**
- `buf lint` uses the `STANDARD` ruleset configured in `proto/buf.yaml`
- `buf format -w` rewrites files in place to canonical formatting
- `buf build` compiles all protos — exits 0 on success, non-zero with errors
- Run lint BEFORE format so that lint errors are visible against the original source (format may shuffle things in a way that makes errors harder to trace)

- [ ] **Step 1: Run buf lint on the new proto**

```bash
buf lint proto/ssn/documentdataservice
```

Expected: no output, exit code 0. If there are lint errors, fix them before proceeding. Common issues:
- Enum values not prefixed with enum name → already handled (`CANDIDATE_SOURCE_` prefix)
- RPC response sharing → already handled (dedicated `SetDocumentBlobsResponse`, `AddAnnotationsResponse`)

- [ ] **Step 2: Run buf build to verify compilation**

```bash
buf build proto
```

Expected: exits 0 with no output. If errors appear, check that import paths match actual file locations under `proto/`.

- [ ] **Step 3: Format the proto file**

```bash
buf format proto/ssn/documentdataservice -w
```

Expected: no output. The file may be reformatted in place (whitespace, field alignment). This is normal.

---

### Task 3: Update Makefile — add to Spanner descriptor

**Files:**
- Modify: `Makefile`

**Context:**
- The `spanner_descriptor.bin` is built by `buf build proto --as-file-descriptor-set` with explicit `--path` flags for each proto that defines types stored as PROTO columns in Spanner.
- The new proto's types (`InternalFieldAnnotation`, `InternalCandidate`, `PurchaseLineData`, etc.) will be stored in Spanner PROTO columns and must be included.
- The current spanner descriptor block is at approximately lines 67-73 of the Makefile.

- [ ] **Step 1: Add the new proto path to the spanner descriptor build**

Find this block in `Makefile`:

```makefile
	buf build proto --as-file-descriptor-set -o gen/spanner_descriptor.bin \
		--path proto/ssn/asyncton/v1/asyncton.proto \
		--path proto/ssn/mlservice/v2/mlservice.proto \
		--path proto/ssn/type/candidate.proto \
		--path proto/ssn/type/text_annotation.proto \
		--path proto/ssn/type/qr.proto \
		--path proto/asgt/v2/product_service.proto
```

Add the new path after the asyncton line (alphabetical within ssn/):

```makefile
	buf build proto --as-file-descriptor-set -o gen/spanner_descriptor.bin \
		--path proto/ssn/asyncton/v1/asyncton.proto \
		--path proto/ssn/documentdataservice/v1/documentdataservice.proto \
		--path proto/ssn/mlservice/v2/mlservice.proto \
		--path proto/ssn/type/candidate.proto \
		--path proto/ssn/type/text_annotation.proto \
		--path proto/ssn/type/qr.proto \
		--path proto/asgt/v2/product_service.proto
```

- [ ] **Step 2: Verify the Makefile change**

Run:
```bash
grep -A 10 "spanner_descriptor.bin" Makefile
```

Expected: the new `--path proto/ssn/documentdataservice/v1/documentdataservice.proto` line is visible between asyncton and mlservice.

---

### Task 4: Generate code, verify, and commit

**Files:**
- Generated (by `make all`): `gen/go/ssn/documentdataservice/v1/`, plus corresponding files in `gen/python/`, `gen/java/`, `gen/csharp/`, `gen/js/`, `gen/openapiv2/`, `gen/spanner_descriptor.bin`, `gen/descriptor.bin`

**Context:**
- `make all` wipes `gen/` and regenerates everything from scratch (all languages, all services). It runs ~12 steps including code generation, mock generation, and Python import rewriting.
- The new proto will be picked up automatically by the general code generation steps (`buf generate proto --template buf.gen.all.yaml` and the gRPC generation steps) because they operate on the entire `proto/` directory.
- The spanner descriptor step will include the new proto because of the Makefile change in Task 3.
- `make all` requires local tools: `buf`, `protoc-gen-go`, `protoc-gen-go-grpc`, `protoc-gen-grpc-gateway`, `protoc-gen-validate`, `mockgen`. If `protoc-gen-validate` is not in PATH, the `make all` may fail at the validation step — this is a pre-existing environment issue unrelated to the new proto.

- [ ] **Step 1: Run make all**

```bash
make all
```

Expected: exits 0. If it fails at a step unrelated to the new proto (e.g., `protoc-gen-validate`), check whether `gen/go/ssn/documentdataservice/v1/` was generated before the failure — earlier steps may have succeeded.

- [ ] **Step 2: Verify generated Go files exist**

```bash
ls gen/go/ssn/documentdataservice/v1/
```

Expected output should include:
- `documentdataservice.pb.go` — message definitions
- `documentdataservice_grpc.pb.go` — gRPC service stubs
- `documentdataservice.pb.gw.go` — gRPC-gateway (REST) reverse proxy

- [ ] **Step 3: Verify the new proto is in the spanner descriptor**

```bash
buf build proto --as-file-descriptor-set -o /dev/null \
    --path proto/ssn/documentdataservice/v1/documentdataservice.proto
```

Expected: exits 0. This confirms the proto compiles cleanly as a standalone descriptor.

- [ ] **Step 4: Stage all changes**

```bash
git add proto/ssn/documentdataservice/v1/documentdataservice.proto Makefile
git add gen/
```

- [ ] **Step 5: Commit**

```bash
git commit -m "add DocumentDataService proto and wire into Makefile build"
```

- [ ] **Step 6: Push**

```bash
git push
```
