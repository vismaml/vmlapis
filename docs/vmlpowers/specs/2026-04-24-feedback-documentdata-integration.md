# Feedback → DocumentDataService Integration

**Date:** 2026-04-24
**Status:** Approved

---

## Overview

Add fire-and-forget calls to `DocumentDataService` at the end of the `DataService.Feedback` method. After the existing BQ insert succeeds, the service populates the new unified Spanner store with:

1. `SetDocumentBlobs` — permanent GCS URIs for the document image and TextAnnotation
2. `AddAnnotations` (PREDICTION) — prediction values with confidence and model metadata
3. `AddAnnotations` (FEEDBACK) — consumer-submitted true values

Failures are logged but never fail the Feedback response.

---

## Data Flow

```
Feedback method (existing)
  ├── read prediction from temp GCS
  ├── copy temp IMG → perm IMG
  ├── copy temp TA → perm TA
  ├── calculate metrics
  ├── insert BQ feedback row
  ├── return &empty.Empty{} to caller
  │
  └── (goroutine, detached context, fire-and-forget)
      ├── SetDocumentBlobs(file_uri, ta_uri, tags)
      ├── AddAnnotations(predictions → CANDIDATE_SOURCE_PREDICTION)
      └── AddAnnotations(true_values → CANDIDATE_SOURCE_FEEDBACK)
```

---

## Field Mapping

### SetDocumentBlobs

| SetDocumentBlobsRequest field | Source |
|---|---|
| `feedback_id` | `req.GetId()` |
| `consumer` | `headers.Username` |
| `file_uri` | `gs://<permImgBucket.BucketName()>/<blobID>` |
| `ta_uri` | `gs://<permTABucket.BucketName()>/<blobID>` |
| `tags` | `req.GetTags()` |
| `environment` | configured via env var `DATASERVICE_DOCUMENTDATA_ENVIRONMENT` |

### Standard Fields (40 fields)

Each standard field in `TrueValues` / `PredictionValues` maps to an `InternalFieldAnnotation` with `FieldData` containing one `InternalCandidate` per value.

| TrueValues field | Feature name | Candidate.value |
|---|---|---|
| `total_incl_vat` | `TOTAL_INCL_VAT` | formatted float string |
| `currency` | `CURRENCY` | string value |
| `order_date` | `ORDER_DATE` | formatted date string |
| `payment_due_date` | `PAYMENT_DUE_DATE` | formatted date string |
| `document_date` | `DOCUMENT_DATE` | formatted date string |
| `check_in_date` | `CHECK_IN_DATE` | formatted date string |
| `check_out_date` | `CHECK_OUT_DATE` | formatted date string |
| ... (all 40 fields follow the same pattern) | `UPPER_SNAKE_CASE(field_name)` | string representation |

**Prediction annotations:**
- `source` = `CANDIDATE_SOURCE_PREDICTION`
- `source_id` = model name from `PredictionMetadata` (per-field if available, else service-level)
- `confidence` on the `Candidate` = corresponding `PredictionConfidences` value

**Feedback annotations:**
- `source` = `CANDIDATE_SOURCE_FEEDBACK`
- `source_id` = `headers.Username` (the consumer)
- No confidence values

### Complex Fields

| TrueValues field | Feature name | Data branch | Normalization |
|---|---|---|---|
| `purchase_lines` | `PURCHASE_LINES` | `purchase_line_data` | `PurchaseLineCandidate` → `PurchaseLine` |
| `vat_distribution` | `VAT_DISTRIBUTION` | `vat_distribution_data` | `VatDistributionCandidate` → `VatDistribution` |
| `answers` | `QA` | `answer_data` | `AnswerCandidate` maps directly |

---

## Code Changes

### New file: `go/pkg/documentdata/mapper/mapper.go`

Mapper package with pure functions:

- `MapTrueValuesToAnnotations(tv *pb.TrueValues, consumer string) []*dds.InternalFieldAnnotation` — converts feedback true values to annotations with `source=FEEDBACK`
- `MapPredictionToAnnotations(pv *pb.PredictionValues, pc *pb.PredictionConfidences, pm *pb.PredictionMetadata) []*dds.InternalFieldAnnotation` — converts predictions to annotations with `source=PREDICTION`
- `BuildSetDocumentBlobsRequest(feedbackID, consumer, fileURI, taURI, env string, tags []string) *dds.SetDocumentBlobsRequest`

Helper functions for type conversion:
- `floatToString(v float64) string`
- `dateToString(d *date.Date) string`
- `purchaseLineCandidateToPurchaseLine(plc *ssntype.PurchaseLineCandidate) *ssntype.PurchaseLine`
- `vatDistCandidateToVatDistribution(vdc *ssntype.VatDistributionCandidate) *ssntype.VatDistribution`

### Modified: `go/services/dataservice/v1/dataservice.go`

Add a `DocumentDataService` gRPC client to the `DataService` struct:

```go
type DataService struct {
    // ... existing fields ...
    docDataClient dds.DocumentDataServiceClient // nil = disabled
}
```

`NewDataService` gets an additional optional parameter. If nil, the integration is a no-op.

### Modified: `go/services/dataservice/v1/handler.go`

After the BQ insert succeeds (line ~131), add:

```go
// Fire-and-forget: populate DocumentDataService
if d.docDataClient != nil {
    go d.sendToDocumentData(req, pred, headers.Username, blobID, req.GetTags())
}
```

New method `sendToDocumentData` on DataService:
- Creates a detached context with 30s timeout
- Calls SetDocumentBlobs
- Calls AddAnnotations twice (predictions, feedback)
- Logs all errors at Warn level

### Modified: `go/cmd/dataservice/v1/main.go`

- Add `DocumentDataNetloc` and `DocumentDataEnvironment` to Config
- Create a gRPC client connection to DocumentDataService
- Pass the client to `NewDataService`

### Modified: manifests

- Add `DATASERVICE_DOCUMENT_DATA_NETLOC` env var to base manifest (value: `documentdataservice.ssn.svc.cluster.local:50051`)
- Add `DATASERVICE_DOCUMENT_DATA_ENVIRONMENT` env var to sandbox overlay (value: `snbx`)

---

## Error Handling

- All DocumentDataService calls run in a goroutine after the response is sent
- A detached context (not the request context) is used with a 30s timeout
- Individual call failures are logged at `Warn` level and do not affect subsequent calls
- If `docDataClient` is nil (not configured), the entire integration is skipped silently
- The Feedback method's response and error behavior is completely unchanged
