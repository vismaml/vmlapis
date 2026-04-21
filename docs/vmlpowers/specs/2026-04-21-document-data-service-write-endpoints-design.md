# DocumentDataService — Write Endpoints Design Spec

**Date:** 2026-04-21
**Status:** Approved
**Extends:** `2026-04-21-document-data-service-design.md`

---

## Overview

Defines the write side of `DocumentDataService`. Two endpoints with distinct semantics:

| Endpoint | Semantics | Covers |
|---|---|---|
| `SetDocumentBlobs` | Upsert — presence-based, replaces set fields | file URI, render URIs, TextAnnotation URI |
| `AddAnnotations` | Upsert by key — latest-wins per `(feature, source, source_id)` | field annotations (all types) |

---

## Why Two Endpoints

Blobs and annotations have fundamentally different write semantics:

- **Blobs** — set once, occasionally overwritten. No history. Presence of a field in the request = intent to write it.
- **Annotations** — latest-wins upsert keyed by `(feature, source, source_id)`. History is preserved by varying `source_id`. A model re-run under the same `source_id` replaces the previous result; a new model version uses a different `source_id` and coexists.

Combining them in one endpoint would require awkward field mask semantics to distinguish "update blobs" from "append annotations".

---

## Service Definition

```proto
service DocumentDataService {
  // Read
  rpc GetDocumentData(GetDocumentDataRequest) returns (GetDocumentDataResponse) {
    option (google.api.http) = {get: "/v1/consumers/{consumer}/documents/{feedback_id}"};
  }

  // Write
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

## `SetDocumentBlobs`

Presence-based upsert — only fields present in the request are written. Absent fields are left untouched.

```proto
message SetDocumentBlobsRequest {
  string          consumer    = 1;
  string          feedback_id = 2;
  optional string file_uri    = 3; // set → write; absent → skip
  repeated string render_uris = 4; // non-empty → write; empty → skip
  optional string ta_uri      = 5; // set → write; absent → skip
}

message SetDocumentBlobsResponse {}
```

---

## `AddAnnotations`

Upsert by `(consumer, feedback_id, feature, source, source_id)`. A second call with the same key replaces the previous entry — latest-wins. To preserve both versions, use a different `source_id` (e.g. append a timestamp or model version).

```proto
message AddAnnotationsRequest {
  string consumer    = 1;
  string feedback_id = 2;
  repeated InternalFieldAnnotation annotations = 3;
}

message AddAnnotationsResponse {}
```

`InternalFieldAnnotation` carries `feature`, `customer_requested`, and the `oneof data` branch — same message used in `GetDocumentDataResponse`. No separate write type needed.

---

## Update Semantics

| Scenario | Action |
|---|---|
| First feedback for a field | INSERT — new `(feature, FEEDBACK, source_id)` row |
| Same consumer sends feedback again | UPSERT — replaces previous row, same key |
| New model version predicts same field | INSERT — different `source_id` (model version), new row coexists |
| DS annotator revises a label | UPSERT — same `source_id`, replaces previous label |
| DS annotator wants to preserve old label | Use a versioned `source_id` (e.g. `annotator_id:v2`) |

---

## Scope

**In scope:**
- `SetDocumentBlobs` — GCS URI management
- `AddAnnotations` — upsert for all `InternalFieldAnnotation` types (standard fields, purchase lines, VAT distribution, QR codes, QA)

**Out of scope:**
- Delete endpoints — separate design needed
- Batch write across multiple documents — separate design needed
