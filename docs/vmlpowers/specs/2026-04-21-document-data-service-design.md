# DocumentDataService — Design Spec

**Date:** 2026-04-21
**Status:** Approved

---

## Overview

`DocumentDataService` is an internal unification layer for retrieving document data from both the sync (annotator) and async (asyncton) pipelines. It provides a single gRPC endpoint that returns document blobs, rendered pages, text annotation, and field-level candidates (predictions, feedback, labels) for a given document, identified by `feedback_id`.

---

## Architecture

```
Spanner (InternalFieldAnnotation protobufs)  ──┐
GCS (file bytes, rendered pages, TextAnnotation) ──┤──► DocumentDataService ──► caller
                                                   │    - signs GCS URLs
                                                   │    - filters by requested sources
```

**Storage split:**
- **Spanner** — stores `InternalFieldAnnotation` protos (field-level candidates with source + state)
- **GCS** — stores raw document bytes, per-page rendered images, serialized `ssn.type.TextAnnotation`
- The service returns **signed/authorized GCS URLs** (with expiration) for large blobs, never inline bytes

**Indexing:** A daily Spanner → BigQuery export handles all ad-hoc filtering, data exploration, and model-based queries. Spanner itself is optimized for fast write and point-read by `(consumer, feedback_id)` — both are required to locate a document's blobs in GCS.

---

## Core Messages

### `CandidateSource` enum

Predictions, feedback, and labels are unified under a single `source` concept. A single feature can have multiple candidates from different sources — each is a separate `InternalCandidate` entry.

```proto
enum CandidateSource {
  CANDIDATE_SOURCE_UNSPECIFIED = 0;
  CANDIDATE_SOURCE_PREDICTION  = 1; // produced by a model
  CANDIDATE_SOURCE_FEEDBACK    = 2; // submitted by consumer as correction
  CANDIDATE_SOURCE_LABEL       = 3; // annotated by a human (DS)
}
```

### `InternalCandidate`

Wraps `ssn.type.Candidate` with provenance. Only standard field candidates are in scope — purchase lines, VAT distribution, answer candidates, QR codes, and page texts are excluded.

```proto
message InternalCandidate {
  ssn.type.Candidate candidate = 1;
  CandidateSource    source    = 2;
  string             source_id = 3; // model_id for predictions; annotator id for labels/feedback
}
```

### `InternalFieldAnnotation`

Groups all candidates for a single feature. `customer_requested` lives here (not on the candidate) because a feature can be requested but produce zero candidates (field not found on document).

```proto
message InternalFieldAnnotation {
  string   feature            = 1;
  bool     customer_requested = 2;
  repeated InternalCandidate candidates = 3;
}
```

**State table:**

| `customer_requested` | `candidates` | Meaning |
|---|---|---|
| true | empty | Feature was requested; not found on document |
| true | non-empty (PREDICTION) | Requested and predicted |
| true | non-empty (PREDICTION + LABEL) | Requested, predicted, and labeled |
| false | non-empty (LABEL) | Ad-hoc human annotation (not originally requested) |
| false | non-empty (PREDICTION) | Ad-hoc model run |

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
}

message GetDocumentDataRequest {
  string feedback_id          = 1;
  string consumer             = 2;
  bool   include_predictions  = 3;
  bool   include_feedbacks    = 4;
  bool   include_labels       = 5;
}

message GetDocumentDataResponse {
  string feedback_id = 1;
  string consumer    = 2;

  // Authorized GCS URLs (signed, with expiration)
  string          file_url            = 3; // always present
  repeated string render_urls         = 4; // empty = not rendered yet
  optional string text_annotation_url = 5; // absent = TA not stored

  // Field annotations filtered by include_* flags in request
  // empty = none requested or none found
  repeated InternalFieldAnnotation fields = 6;
}
```

The `include_*` flags map to `CandidateSource` values: candidates not matching any requested source are omitted from `fields`. `InternalFieldAnnotation` entries with `customer_requested = true` and empty candidates are always returned (they carry the "field not found" signal).

---

## Scope

**In scope:**
- Standard SSN field candidates (`ssn.type.Candidate`) only
- Sync (annotator) and async (asyncton) as data sources
- GCS-backed blobs returned as signed URLs

**Out of scope:**
- Purchase lines, VAT distribution, answer candidates, QR codes, page texts
- Streaming / server-side pagination (iterate in future versions)
- Write path (ingestion into Spanner/GCS is handled by existing pipelines)
