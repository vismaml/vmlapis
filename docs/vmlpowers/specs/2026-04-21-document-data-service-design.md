# DocumentDataService — Design Spec

**Date:** 2026-04-21
**Updated:** 2026-04-23
**Status:** Approved

---

## Overview

`DocumentDataService` is an internal unification layer for retrieving and writing document data across the sync (annotator) and async (asyncton) pipelines. It provides gRPC endpoints that return document blobs, rendered pages, TextAnnotation, and field-level candidates (predictions, feedback, labels) for a given document, identified by `(consumer, feedback_id)`.

The service supports **cross-environment access** — callers specify a target environment (`snbx`, `stag`, `prod`) in every request. The service holds Spanner connections to all environments and routes accordingly. Each environment's service account has read access to all other environments' Spanner databases and GCS buckets.

---

## Architecture

```
Spanner (per env: snbx/stag/prod)              ──┐
GCS (per env: file bytes, renders, TA)           ──┤──► DocumentDataService ──► caller
                                                   │    - routes by environment
                                                   │    - signs GCS URLs
                                                   │    - filters by requested sources
```

**Storage split:**
- **Spanner** — stores field-level candidates with source + state (one database per environment)
- **GCS** — stores raw document bytes, per-page rendered images, serialized `ssn.type.TextAnnotation`
- The service returns **signed/authorized GCS URLs** (with expiration) for large blobs, never inline bytes

**Multi-environment model:**
- The `environment` field in every request selects which Spanner database + GCS project to use
- Service config holds connection strings for all three environments
- Service account has `spanner.databaseUser` on own env, `spanner.databaseReader` on other envs
- Service account has `storage.objectViewer` on all envs (for URL signing)

**Indexing:** A daily Spanner → BigQuery export handles all ad-hoc filtering, data exploration, and model-based queries. Spanner itself is optimized for fast write and point-read by `(consumer, feedback_id)`.

---

## Core Proto Types

### `CandidateSource` enum

Predictions, feedback, and labels are unified under a single `source` concept. A single feature can have multiple candidates from different sources — each is a separate entry.

```proto
enum CandidateSource {
  CANDIDATE_SOURCE_UNSPECIFIED = 0;
  CANDIDATE_SOURCE_PREDICTION  = 1; // produced by a model
  CANDIDATE_SOURCE_FEEDBACK    = 2; // submitted by consumer as correction
  CANDIDATE_SOURCE_LABEL       = 3; // annotated by a human (DS)
}
```

### `InternalCandidate`

Wraps `ssn.type.Candidate` with provenance. Used for all standard SSN fields (`TOTAL_INCL_VAT`, `CURRENCY`, `CHECK_IN_DATE`, etc.).

```proto
message InternalCandidate {
  ssn.type.Candidate candidate = 1;
  CandidateSource    source    = 2;
  string             source_id = 3; // model_id for predictions; annotator id for labels/feedback
}
```

### `InternalFieldAnnotation`

Groups all candidates for a single feature. Pure annotation data — no document-level metadata.

```proto
message InternalFieldAnnotation {
  string feature = 1;

  oneof data {
    FieldData            field_data            = 2; // standard fields (Candidate-based)
    PurchaseLineData     purchase_line_data    = 3; // PURCHASE_LINES
    VatDistributionData  vat_distribution_data = 4; // VAT_DISTRIBUTION
    QrData               qr_data              = 5; // QR_CODES / SWISS_QR_BILLS
    AnswerData           answer_data          = 6; // QA
  }
}
```

### Requested features

Which features the customer originally requested is **document-level metadata**, stored as `requested_features` on the `documents` table (and in `SetDocumentBlobsRequest` / `GetDocumentDataResponse`). This is separate from annotations — a feature can be requested but produce zero annotations (field not found), or annotated ad-hoc without being requested.

| `requested_features` contains feature? | Annotations exist? | Meaning |
|---|---|---|
| yes | no | Requested; not found on document |
| yes | yes (PREDICTION) | Requested and predicted |
| yes | yes (PREDICTION + LABEL) | Requested, predicted, and labeled |
| no | yes (LABEL) | Ad-hoc human annotation |
| no | yes (PREDICTION) | Ad-hoc model run |

---

## Complex Field Types

Standard fields use `ssn.type.Candidate` and fit into `FieldData`. Purchase lines, VAT distribution, QR codes, and QA cannot — they are structured types with different shapes. The `oneof data` on `InternalFieldAnnotation` handles this.

### Standard field wrapper

```proto
message FieldData {
  repeated InternalCandidate candidates = 1;
}
```

### Purchase line wrapper

Only the new `ssn.type.PurchaseLine` format is stored. Old `PurchaseLineCandidate` data is converted at ingestion.

```proto
message InternalPurchaseLine {
  ssn.type.PurchaseLine line      = 1;
  CandidateSource       source    = 2;
  string                source_id = 3;
}

message PurchaseLineData {
  repeated InternalPurchaseLine lines = 1;
}
```

### VAT distribution wrapper

Only the new `ssn.type.VatDistribution` format is stored. Old `VatDistributionCandidate` data is converted at ingestion.

```proto
message InternalVatDistribution {
  ssn.type.VatDistribution distribution = 1;
  CandidateSource          source       = 2;
  string                   source_id    = 3;
}

message VatDistributionData {
  repeated InternalVatDistribution distributions = 1;
}
```

### QR code wrapper

Two QR types (`QrCodeData` and `SwissQrBill`) are distinguished via a `oneof`.

```proto
message InternalQrCode {
  oneof qr_type {
    ssn.type.QrCodeData  qr_code_data  = 1;
    ssn.type.SwissQrBill swiss_qr_bill = 2;
  }
  CandidateSource source    = 3;
  string          source_id = 4;
}

message QrData {
  repeated InternalQrCode qr_codes = 1;
}
```

### QA wrapper

`AnswerCandidate` carries the question as part of the data and cannot be represented as a standard `Candidate`.

```proto
message InternalAnswerCandidate {
  ssn.type.AnswerCandidate answer    = 1;
  CandidateSource          source    = 2;
  string                   source_id = 3;
}

message AnswerData {
  repeated InternalAnswerCandidate answers = 1;
}
```

### Feature → data branch mapping

| `feature` | `oneof data` branch | Inner type |
|---|---|---|
| `"TOTAL_INCL_VAT"`, `"CURRENCY"`, etc. | `field_data` | `repeated InternalCandidate` → `ssn.type.Candidate` |
| `"CHECK_IN_DATE"`, `"CHECK_OUT_DATE"` | `field_data` | `repeated InternalCandidate` (flattened from `HotelDates` at ingestion) |
| `"PURCHASE_LINES"` | `purchase_line_data` | `repeated InternalPurchaseLine` → `ssn.type.PurchaseLine` |
| `"VAT_DISTRIBUTION"` | `vat_distribution_data` | `repeated InternalVatDistribution` → `ssn.type.VatDistribution` |
| `"QR_CODES"` / `"SWISS_QR_BILLS"` | `qr_data` | `repeated InternalQrCode` |
| `"QA"` | `answer_data` | `repeated InternalAnswerCandidate` → `ssn.type.AnswerCandidate` |

### Ingestion normalization

Services writing to the unified store are responsible for converting old formats:

| Source data | Ingestion action |
|---|---|
| `ssn.type.PurchaseLineCandidate` | Convert to `ssn.type.PurchaseLine` |
| `ssn.type.VatDistributionCandidate` | Convert to `ssn.type.VatDistribution` |
| `ssn.type.HotelDates` | Flatten into `CHECK_IN_DATE` and `CHECK_OUT_DATE` as separate `FieldData` entries |
| All other types | Store as-is |

---

## Service Definition

**File:** `proto/ssn/documentdataservice/v1/documentdataservice.proto`
**Package:** `ssn.documentdataservice.v1`
**Go package:** `github.com/e-conomic/vmlapis/gen/go/ssn/documentdataservice/v1;documentdataservice`

```proto
service DocumentDataService {
  rpc GetDocumentData(GetDocumentDataRequest) returns (GetDocumentDataResponse) {
    option (google.api.http) = {get: "/v1/consumers/{consumer}/documents/{feedback_id}"};
  }

  rpc SetDocumentBlobs(SetDocumentBlobsRequest) returns (SetDocumentBlobsResponse) {
    option (google.api.http) = {
      put: "/v1/consumers/{consumer}/documents/{feedback_id}/blobs"
      body: "*"
    };
  }

  rpc AddAnnotations(AddAnnotationsRequest) returns (AddAnnotationsResponse) {
    option (google.api.http) = {
      post: "/v1/consumers/{consumer}/documents/{feedback_id}/annotations"
      body: "*"
    };
  }
}
```

---

## Read Endpoint — `GetDocumentData`

Returns document blobs (as signed GCS URLs) and field annotations filtered by the `include_*` flags.

```proto
message GetDocumentDataRequest {
  string feedback_id         = 1;
  string consumer            = 2;
  bool   include_predictions = 3;
  bool   include_feedbacks   = 4;
  bool   include_labels      = 5;
  // Target environment: "snbx", "stag", "prod".
  string environment         = 6;
}

message GetDocumentDataResponse {
  string feedback_id = 1;
  string consumer    = 2;

  // Authorized GCS URLs (signed, with expiration)
  string                       file_url            = 3; // always present
  repeated string              render_urls         = 4; // empty = not rendered yet; one per page in order
  google.protobuf.StringValue  text_annotation_url = 5; // absent = TA not stored

  // Field annotations filtered by include_* flags
  repeated InternalFieldAnnotation fields = 6;

  // When this document expires and will be garbage-collected.
  google.protobuf.Timestamp expires_at = 7;

  // Features the customer originally requested for this document.
  repeated string requested_features = 8;
}
```

`InternalFieldAnnotation` entries with `customer_requested = true` and empty candidates are always returned — they carry the "field not found" signal.

---

## Write Endpoints

Two endpoints with distinct semantics:

| Endpoint | Semantics | Covers |
|---|---|---|
| `SetDocumentBlobs` | Upsert — presence-based, replaces set fields | file URI, render URIs, TextAnnotation URI, expiration, requested features |
| `AddAnnotations` | Upsert by key — latest-wins per `(feature, source, source_id)` | field annotations (all types) |

### `SetDocumentBlobs`

Presence-based upsert — only fields present in the request are written. Absent fields are left untouched.

```proto
message SetDocumentBlobsRequest {
  string                      feedback_id = 1;
  string                      consumer    = 2;
  google.protobuf.StringValue file_uri    = 3; // set → write; absent → skip
  repeated string             render_uris = 4; // non-empty → write; empty → skip
  google.protobuf.StringValue ta_uri      = 5; // set → write; absent → skip
  google.protobuf.Timestamp   expires_at          = 6; // set → write; absent → skip
  // Target environment: "snbx", "stag", "prod".
  string                      environment         = 7;
  // Non-empty → write; empty → leave untouched.
  repeated string             requested_features  = 8;
}

message SetDocumentBlobsResponse {}
```

### `AddAnnotations`

Upsert by `(consumer, feedback_id, feature, source, source_id)`. Latest-wins — a second call with the same key replaces the previous entry. To preserve both versions, use a different `source_id`.

```proto
message AddAnnotationsRequest {
  string feedback_id                       = 1;
  string consumer                          = 2;
  repeated InternalFieldAnnotation annotations = 3;
  // Target environment: "snbx", "stag", "prod".
  string environment                       = 4;
}

message AddAnnotationsResponse {}
```

**Update semantics:**

| Scenario | Action |
|---|---|
| First feedback for a field | INSERT — new `(feature, FEEDBACK, source_id)` row |
| Same consumer sends feedback again | UPSERT — replaces previous row, same key |
| New model version predicts same field | INSERT — different `source_id` (model version), new row coexists |
| DS annotator revises a label | UPSERT — same `source_id`, replaces previous label |
| DS annotator wants to preserve old label | Use a versioned `source_id` (e.g. `annotator_id:v2`) |

---

## Spanner Schema

Spanner is the **write and point-read store** — all ad-hoc querying happens via a daily Spanner → BigQuery export.

**Key design decisions:**
- Primary key `(consumer, feedback_id)` — UUID-based `feedback_id` (Envoy request ID) ensures random distribution across Spanner splits at 25M docs/month. No hash sharding needed.
- Large blobs live in GCS; Spanner stores only URIs.
- Interleaving co-locates all data for a document on the same Spanner split — a full document read is a single range scan.
- No read-modify-write — new model predictions are always pure INSERTs.
- `expires_at` on the `documents` table drives a `ROW DELETION POLICY` — expired documents and all interleaved children are garbage-collected automatically.

```sql
-- Level 1: Document metadata and GCS URIs
CREATE TABLE documents (
  consumer     STRING(MAX) NOT NULL,
  feedback_id  STRING(MAX) NOT NULL,
  file_uri     STRING(MAX),
  render_uris  ARRAY<STRING(MAX)>,   -- one URI per rendered page, in page order
  ta_uri       STRING(MAX),          -- GCS URI for serialized ssn.type.TextAnnotation
  created_at          TIMESTAMP NOT NULL OPTIONS (allow_commit_timestamp=true),
  updated_at          TIMESTAMP NOT NULL OPTIONS (allow_commit_timestamp=true),
  expires_at          TIMESTAMP,            -- when this document should be garbage-collected
  requested_features  ARRAY<STRING(MAX)>,   -- features the customer originally requested
) PRIMARY KEY (consumer, feedback_id),
  ROW DELETION POLICY (OLDER_THAN(expires_at, INTERVAL 1 DAY));


-- Level 2: One row per feature per document
CREATE TABLE field_annotations (
  consumer    STRING(MAX) NOT NULL,
  feedback_id STRING(MAX) NOT NULL,
  feature     STRING(MAX) NOT NULL,
) PRIMARY KEY (consumer, feedback_id, feature),
  INTERLEAVE IN PARENT documents ON DELETE CASCADE;


-- Level 3a: Standard field candidates
-- Covers: all ssn.type.Candidate fields + CHECK_IN_DATE / CHECK_OUT_DATE (flattened from HotelDates)
CREATE TABLE candidates (
  consumer    STRING(MAX) NOT NULL,
  feedback_id STRING(MAX) NOT NULL,
  feature     STRING(MAX) NOT NULL,
  source      STRING(MAX) NOT NULL,   -- "PREDICTION" | "FEEDBACK" | "LABEL"
  source_id   STRING(MAX) NOT NULL,   -- model_id or annotator_id
  candidate   ssn.type.Candidate,
  created_at  TIMESTAMP NOT NULL OPTIONS (allow_commit_timestamp=true),
) PRIMARY KEY (consumer, feedback_id, feature, source, source_id),
  INTERLEAVE IN PARENT field_annotations ON DELETE CASCADE;


-- Level 3b: Complex type annotations
-- Covers: PURCHASE_LINES, VAT_DISTRIBUTION, QR_CODES / SWISS_QR_BILLS, QA
-- data column holds serialized proto: PurchaseLineData | VatDistributionData | QrData | AnswerData
CREATE TABLE complex_annotations (
  consumer    STRING(MAX) NOT NULL,
  feedback_id STRING(MAX) NOT NULL,
  feature     STRING(MAX) NOT NULL,
  source      STRING(MAX) NOT NULL,
  source_id   STRING(MAX) NOT NULL,
  data        BYTES(MAX),
  created_at  TIMESTAMP NOT NULL OPTIONS (allow_commit_timestamp=true),
) PRIMARY KEY (consumer, feedback_id, feature, source, source_id),
  INTERLEAVE IN PARENT field_annotations ON DELETE CASCADE;
```

**Table hierarchy:**

```
documents
└── field_annotations  (feature)
      ├── candidates          — standard fields (TOTAL_INCL_VAT, CURRENCY, CHECK_IN_DATE, ...)
      └── complex_annotations — complex fields (PURCHASE_LINES, VAT_DISTRIBUTION, QR_CODES, QA)
```

**Feature → table mapping:**

| Feature | Table | Data type |
|---|---|---|
| `TOTAL_INCL_VAT`, `CURRENCY`, `DOCUMENT_DATE`, etc. | `candidates` | `ssn.type.Candidate` (proto column) |
| `CHECK_IN_DATE`, `CHECK_OUT_DATE` | `candidates` | `ssn.type.Candidate` (flattened from `HotelDates`) |
| `PURCHASE_LINES` | `complex_annotations` | serialized `PurchaseLineData` |
| `VAT_DISTRIBUTION` | `complex_annotations` | serialized `VatDistributionData` |
| `QR_CODES` / `SWISS_QR_BILLS` | `complex_annotations` | serialized `QrData` |
| `QA` | `complex_annotations` | serialized `AnswerData` |

**BigQuery export:**
- `candidates` — exports as flat rows, `candidate` proto column decoded natively via proto bundle
- `complex_annotations` — `data` column requires proto deserialization in BQ (proto bundle for `PurchaseLineData`, `VatDistributionData`, `QrData`, `AnswerData`)
- All filtering, joins, and ad-hoc queries happen in BQ — Spanner has no secondary indexes on these tables
