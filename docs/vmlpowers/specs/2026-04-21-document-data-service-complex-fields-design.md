# DocumentDataService — Complex Fields Extension Design Spec

**Date:** 2026-04-21
**Status:** Approved
**Extends:** `2026-04-21-document-data-service-design.md`

---

## Overview

Extends `InternalFieldAnnotation` to support purchase lines, VAT distribution, and QR codes alongside standard field candidates. These types cannot be represented as `repeated InternalCandidate` (which wraps `ssn.type.Candidate`) because they are structured line-item or extraction types with different shapes.

---

## The Two-Structure Problem

Purchase lines and VAT distribution each have two existing representations:

| Type | Old format | New format |
|---|---|---|
| Purchase lines | `ssn.type.PurchaseLineCandidate` — flat strings, no confidence | `ssn.type.PurchaseLine` — each sub-field is `repeated Candidate` with confidence + bounding box |
| VAT distribution | `ssn.type.VatDistributionCandidate` — flat strings | `ssn.type.VatDistribution` — each sub-field is `repeated Candidate` |

**Decision: new format only.** Old format data (`PurchaseLineCandidate`, `VatDistributionCandidate`) is normalized to new format at ingestion time. The unified store never holds the old format.

---

## Design

### `oneof` on `InternalFieldAnnotation`

The existing `repeated InternalCandidate candidates` field is replaced with a `oneof data` block. The `feature` name continues to identify the type (`"PURCHASE_LINES"`, `"VAT_DISTRIBUTION"`, `"QR_CODES"`, `"TOTAL_INCL_VAT"`, etc.) and the `oneof` branch carries the appropriate data shape.

```proto
message InternalFieldAnnotation {
  string feature           = 1;
  bool customer_requested  = 2;

  oneof data {
    FieldData            field_data             = 3; // standard fields (Candidate-based)
    PurchaseLineData     purchase_line_data     = 4; // PURCHASE_LINES
    VatDistributionData  vat_distribution_data  = 5; // VAT_DISTRIBUTION
    QrData               qr_data               = 6; // QR_CODES / SWISS_QR_BILLS
    AnswerData           answer_data            = 7; // QA
  }
}
```

### Standard field wrapper (unchanged semantics)

```proto
message FieldData {
  repeated InternalCandidate candidates = 1;
}
```

`InternalCandidate` is unchanged from the base design:

```proto
message InternalCandidate {
  ssn.type.Candidate candidate = 1;
  CandidateSource    source    = 2;
  string             source_id = 3;
}
```

### Purchase line wrapper

Only the new `ssn.type.PurchaseLine` format is stored. Old `PurchaseLineCandidate` data is converted on ingestion.

```proto
message InternalPurchaseLine {
  ssn.type.PurchaseLine line      = 1;
  CandidateSource       source    = 2;
  string                source_id = 3; // model_id or annotator_id
}

message PurchaseLineData {
  repeated InternalPurchaseLine lines = 1;
}
```

### VAT distribution wrapper

Only the new `ssn.type.VatDistribution` format is stored. Old `VatDistributionCandidate` data is converted on ingestion.

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

### QA wrapper

`AnswerCandidate` carries the `question` as part of the data — it cannot be represented as a standard `Candidate`. The `feature` is a constant `"QA"` and each entry holds its own question+answer pair.

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

### QR code wrapper

QR codes are extracted facts, not ML predictions — there are no confidence scores or bounding boxes. Two QR types exist (`QrCodeData` and `SwissQrBill`) and are distinguished via a `oneof`.

Source provenance is kept for consistency (model/version that extracted them).

```proto
message InternalQrCode {
  oneof qr_type {
    ssn.type.QrCodeData  qr_code_data = 1;
    ssn.type.SwissQrBill swiss_qr_bill = 2;
  }
  CandidateSource source    = 3;
  string          source_id = 4;
}

message QrData {
  repeated InternalQrCode qr_codes = 1;
}
```

---

## Full `InternalFieldAnnotation` picture

| `feature` | `oneof data` branch | Inner type |
|---|---|---|
| `"TOTAL_INCL_VAT"`, `"CURRENCY"`, etc. | `field_data` | `repeated InternalCandidate` → `ssn.type.Candidate` |
| `"PURCHASE_LINES"` | `purchase_line_data` | `repeated InternalPurchaseLine` → `ssn.type.PurchaseLine` |
| `"VAT_DISTRIBUTION"` | `vat_distribution_data` | `repeated InternalVatDistribution` → `ssn.type.VatDistribution` |
| `"QR_CODES"` / `"SWISS_QR_BILLS"` | `qr_data` | `repeated InternalQrCode` → `ssn.type.QrCodeData` or `ssn.type.SwissQrBill` |
| `"CHECK_IN_DATE"`, `"CHECK_OUT_DATE"` | `field_data` | `repeated InternalCandidate` → `ssn.type.Candidate` (flattened from `ssn.type.HotelDates` at ingestion) |
| `"QA"` | `answer_data` | `repeated InternalAnswerCandidate` → `ssn.type.AnswerCandidate` |

`customer_requested` and source provenance (`CandidateSource`, `source_id`) apply uniformly across all types.

---

## Ingestion normalization

Services writing to the unified store are responsible for converting old formats:

| Source data | Ingestion action |
|---|---|
| `ssn.type.PurchaseLineCandidate` | Convert to `ssn.type.PurchaseLine` — map string fields to single `Candidate` with no confidence/bounding box |
| `ssn.type.VatDistributionCandidate` | Convert to `ssn.type.VatDistribution` — same approach |
| `ssn.type.PurchaseLine` | Store as-is |
| `ssn.type.VatDistribution` | Store as-is |
| `ssn.type.QrCodeData` / `ssn.type.SwissQrBill` | Store as-is |
| `ssn.type.HotelDates` | Flatten into `CHECK_IN_DATE` and `CHECK_OUT_DATE` as separate `FieldData` entries — both are plain `Candidate` fields, no wrapper needed |
| `ssn.type.AnswerCandidate` | Store as-is in `AnswerData` under feature `"QA"` |

---

## Scope

**In scope:**
- `ssn.type.PurchaseLine` (new format only)
- `ssn.type.VatDistribution` (new format only)
- `ssn.type.QrCodeData` and `ssn.type.SwissQrBill`
- `ssn.type.AnswerCandidate` (QA)
- Normalization of old formats at ingestion

**Out of scope:**
- `ssn.type.PageText` — covered by `TextAnnotation` stored in GCS, not needed separately
