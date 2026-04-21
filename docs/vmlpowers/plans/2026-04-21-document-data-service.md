# DocumentDataService Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use vmlpowers:subagent-driven-development (recommended) or vmlpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Write the `DocumentDataService` proto file and wire it into the Makefile build.

**Architecture:** Single proto file under `proto/ssn/documentdataservice/v1/`. Defines core shared types (`CandidateSource`, `InternalCandidate`, `InternalFieldAnnotation` with `oneof data`), complex field wrappers (purchase lines, VAT distribution, QR codes, QA), and three RPCs (`GetDocumentData`, `SetDocumentBlobs`, `AddAnnotations`). The new proto is added to the Spanner descriptor build since its types will be stored as PROTO columns in Spanner.

**Tech Stack:** Protocol Buffers (proto3), buf CLI, `google/api/annotations.proto` (HTTP bindings), `google/protobuf/wrappers.proto`, `ssn/type/candidate.proto`, `ssn/type/qr.proto`

---

### Task 1: Create the proto file

**Files:**
- Create: `proto/ssn/documentdataservice/v1/documentdataservice.proto`

- [ ] **Step 1: Create the directory**

```bash
mkdir -p proto/ssn/documentdataservice/v1
```

- [ ] **Step 2: Write the proto file**

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
  CANDIDATE_SOURCE_PREDICTION  = 1; // produced by a model
  CANDIDATE_SOURCE_FEEDBACK    = 2; // submitted by consumer as correction
  CANDIDATE_SOURCE_LABEL       = 3; // annotated by a human (DS)
}

// ---- Core candidate wrapper ----

// InternalCandidate wraps a standard ssn.type.Candidate with provenance.
// Used for all standard SSN fields (TOTAL_INCL_VAT, CURRENCY, CHECK_IN_DATE, etc.)
message InternalCandidate {
  ssn.type.Candidate candidate = 1;
  CandidateSource    source    = 2;
  // model_id for PREDICTION; annotator id for LABEL/FEEDBACK
  string             source_id = 3;
}

// ---- Field data wrappers ----

// FieldData holds standard field candidates (ssn.type.Candidate-based fields).
message FieldData {
  repeated InternalCandidate candidates = 1;
}

// InternalPurchaseLine wraps ssn.type.PurchaseLine (new format only).
// Old PurchaseLineCandidate data is normalized to PurchaseLine at ingestion.
message InternalPurchaseLine {
  ssn.type.PurchaseLine line      = 1;
  CandidateSource       source    = 2;
  string                source_id = 3;
}

// PurchaseLineData holds purchase line annotations for feature "PURCHASE_LINES".
message PurchaseLineData {
  repeated InternalPurchaseLine lines = 1;
}

// InternalVatDistribution wraps ssn.type.VatDistribution (new format only).
// Old VatDistributionCandidate data is normalized to VatDistribution at ingestion.
message InternalVatDistribution {
  ssn.type.VatDistribution distribution = 1;
  CandidateSource          source       = 2;
  string                   source_id    = 3;
}

// VatDistributionData holds VAT distribution annotations for feature "VAT_DISTRIBUTION".
message VatDistributionData {
  repeated InternalVatDistribution distributions = 1;
}

// InternalQrCode wraps either QrCodeData or SwissQrBill — both are QR extractions.
message InternalQrCode {
  oneof qr_type {
    ssn.type.QrCodeData  qr_code_data  = 1;
    ssn.type.SwissQrBill swiss_qr_bill = 2;
  }
  CandidateSource source    = 3;
  string          source_id = 4;
}

// QrData holds QR code annotations for feature "QR_CODES".
message QrData {
  repeated InternalQrCode qr_codes = 1;
}

// InternalAnswerCandidate wraps ssn.type.AnswerCandidate.
// AnswerCandidate carries the question as part of the data and cannot be
// represented as a standard Candidate.
message InternalAnswerCandidate {
  ssn.type.AnswerCandidate answer    = 1;
  CandidateSource          source    = 2;
  string                   source_id = 3;
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
  string feature            = 1;
  bool   customer_requested = 2;

  oneof data {
    FieldData            field_data            = 3; // standard fields
    PurchaseLineData     purchase_line_data    = 4; // PURCHASE_LINES
    VatDistributionData  vat_distribution_data = 5; // VAT_DISTRIBUTION
    QrData               qr_data              = 6; // QR_CODES
    AnswerData           answer_data          = 7; // QA
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
  string feedback_id         = 1;
  string consumer            = 2;
  bool   include_predictions = 3;
  bool   include_feedbacks   = 4;
  bool   include_labels      = 5;
}

message GetDocumentDataResponse {
  string feedback_id = 1;
  string consumer    = 2;

  // Authorized GCS URLs (signed, with expiration).
  string                       file_url            = 3; // always present
  repeated string              render_urls         = 4; // empty = not rendered yet; one per page in order
  google.protobuf.StringValue  text_annotation_url = 5; // absent = TA not stored

  // Field annotations filtered by include_* flags.
  // InternalFieldAnnotation entries with customer_requested=true and empty
  // candidates are always returned — they carry the "field not found" signal.
  repeated InternalFieldAnnotation fields = 6;
}

message SetDocumentBlobsRequest {
  string                      feedback_id = 1;
  string                      consumer    = 2;
  google.protobuf.StringValue file_uri    = 3; // set → write; absent → leave untouched
  repeated string             render_uris = 4; // non-empty → write; empty → leave untouched
  google.protobuf.StringValue ta_uri      = 5; // set → write; absent → leave untouched
}

message SetDocumentBlobsResponse {}

message AddAnnotationsRequest {
  string feedback_id                           = 1;
  string consumer                              = 2;
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

### Task 2: Lint the proto file

- [ ] **Step 1: Run buf lint**

```bash
buf lint proto/ssn/documentdataservice
```

Expected: no output (zero lint errors). Fix any errors before proceeding.

Common lint issues:
- Enum values must be `UPPER_SNAKE_CASE` with the enum name as prefix ✓ (already done)
- Field names must be `lower_snake_case` ✓
- Message names must be `UpperCamelCase` ✓
- RPCs must use unique request/response message types ✓

- [ ] **Step 2: Run buf build to verify compilation**

```bash
buf build proto
```

Expected: exits 0 with no output. If errors, check import paths match actual file locations under `proto/`.

- [ ] **Step 3: Run full code generation via make**

```bash
make all
```

`make all` runs all buf generate commands locally (no Docker). Expected: exits 0. Generated files appear under `gen/go/ssn/documentdataservice/v1/`.

---

### Task 3: Update Makefile — add to Spanner descriptor

The `spanner_descriptor.bin` is used by `vml-spanner` for native PROTO columns. The new proto types (`InternalFieldAnnotation`, `InternalCandidate`, etc.) will be stored as PROTO columns in Spanner and must be included.

**Files:**
- Modify: `Makefile`

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

Replace with:

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

- [ ] **Step 2: Verify the Makefile change looks correct**

```bash
grep -A 10 "spanner_descriptor.bin" Makefile
```

Expected: the new `--path proto/ssn/documentdataservice/v1/documentdataservice.proto` line is present.

---

### Task 4: Format and commit

- [ ] **Step 1: Format the proto file**

```bash
buf format proto/ssn/documentdataservice -w
```

- [ ] **Step 2: Stage generated files and proto**

```bash
git add proto/ssn/documentdataservice/v1/documentdataservice.proto Makefile
git add gen/
```

- [ ] **Step 3: Commit**

```bash
git commit -m "add DocumentDataService proto and Makefile wiring"
```

- [ ] **Step 4: Push**

```bash
git push
```
