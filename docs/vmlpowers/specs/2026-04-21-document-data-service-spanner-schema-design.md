# DocumentDataService — Spanner Schema Design

**Date:** 2026-04-21
**Status:** Approved
**Extends:** `2026-04-21-document-data-service-design.md`, `2026-04-21-document-data-service-complex-fields-design.md`

---

## Overview

Defines the Spanner table structure for the unified document data store. Spanner is the **write and point-read store** — all ad-hoc querying and data exploration happens via a daily Spanner → BigQuery export.

---

## Key Design Decisions

- **Primary key**: `(consumer, feedback_id)` — UUID-based `feedback_id` (Envoy request ID) ensures random distribution across Spanner splits at 25M docs/month. No hash sharding needed.
- **Large blobs** (file bytes, rendered pages, TextAnnotation) live in GCS. Spanner stores only URIs.
- **Interleaving** co-locates all data for a document on the same Spanner split — a full document read is a single range scan.
- **No read-modify-write** — new model predictions are always pure INSERTs, never updates to existing rows.
- **Standard vs complex fields** split across two sibling child tables under `FieldAnnotations`.

---

## Schema

```sql
-- Level 1: Document metadata and GCS URIs
CREATE TABLE Documents (
  consumer     STRING(MAX) NOT NULL,
  feedback_id  STRING(MAX) NOT NULL,
  file_uri     STRING(MAX),
  render_uris  ARRAY<STRING(MAX)>,   -- one URI per rendered page, in page order
  ta_uri       STRING(MAX),          -- GCS URI for serialized ssn.type.TextAnnotation
  created_at   TIMESTAMP NOT NULL OPTIONS (allow_commit_timestamp=true),
) PRIMARY KEY (consumer, feedback_id);


-- Level 2: One row per feature per document
-- Holds customer_requested for both standard and complex feature types
CREATE TABLE FieldAnnotations (
  consumer           STRING(MAX) NOT NULL,
  feedback_id        STRING(MAX) NOT NULL,
  feature            STRING(MAX) NOT NULL,  -- e.g. "TOTAL_INCL_VAT", "PURCHASE_LINES"
  customer_requested BOOL NOT NULL DEFAULT (false),
) PRIMARY KEY (consumer, feedback_id, feature),
  INTERLEAVE IN PARENT Documents ON DELETE CASCADE;


-- Level 3a: Standard field candidates
-- One row per (feature, source, model/annotator)
-- Covers: all ssn.type.Candidate fields + CHECK_IN_DATE / CHECK_OUT_DATE (flattened from HotelDates)
CREATE TABLE Candidates (
  consumer    STRING(MAX) NOT NULL,
  feedback_id STRING(MAX) NOT NULL,
  feature     STRING(MAX) NOT NULL,
  source      STRING(MAX) NOT NULL,   -- "PREDICTION" | "FEEDBACK" | "LABEL"
  source_id   STRING(MAX) NOT NULL,   -- model_id or annotator_id
  candidate   PROTO<ssn.type.Candidate>,
  created_at  TIMESTAMP NOT NULL OPTIONS (allow_commit_timestamp=true),
) PRIMARY KEY (consumer, feedback_id, feature, source, source_id),
  INTERLEAVE IN PARENT FieldAnnotations ON DELETE CASCADE;


-- Level 3b: Complex type annotations
-- One row per (feature, source, model run)
-- Covers: PURCHASE_LINES, VAT_DISTRIBUTION, QR_CODES / SWISS_QR_BILLS, QA
-- data column holds serialized proto: PurchaseLineData | VatDistributionData | QrData
CREATE TABLE ComplexAnnotations (
  consumer    STRING(MAX) NOT NULL,
  feedback_id STRING(MAX) NOT NULL,
  feature     STRING(MAX) NOT NULL,   -- "PURCHASE_LINES" | "VAT_DISTRIBUTION" | "QR_CODES"
  source      STRING(MAX) NOT NULL,
  source_id   STRING(MAX) NOT NULL,
  data        BYTES(MAX),
  created_at  TIMESTAMP NOT NULL OPTIONS (allow_commit_timestamp=true),
) PRIMARY KEY (consumer, feedback_id, feature, source, source_id),
  INTERLEAVE IN PARENT FieldAnnotations ON DELETE CASCADE;
```

---

## Table Hierarchy

```
Documents
└── FieldAnnotations  (feature)
      ├── Candidates          — standard fields (TOTAL_INCL_VAT, CURRENCY, CHECK_IN_DATE, ...)
      └── ComplexAnnotations  — complex fields (PURCHASE_LINES, VAT_DISTRIBUTION, QR_CODES)
```

---

## Feature → Table Mapping

| Feature | Table | Data type |
|---|---|---|
| `TOTAL_INCL_VAT`, `CURRENCY`, `DOCUMENT_DATE`, etc. | `Candidates` | `PROTO<ssn.type.Candidate>` |
| `CHECK_IN_DATE`, `CHECK_OUT_DATE` | `Candidates` | `PROTO<ssn.type.Candidate>` (flattened from `HotelDates`) |
| `PURCHASE_LINES` | `ComplexAnnotations` | serialized `PurchaseLineData` |
| `VAT_DISTRIBUTION` | `ComplexAnnotations` | serialized `VatDistributionData` |
| `QR_CODES` / `SWISS_QR_BILLS` | `ComplexAnnotations` | serialized `QrData` |
| `QA` | `ComplexAnnotations` | serialized `AnswerData` |

---

## Write Patterns

| Operation | Action |
|---|---|
| New document ingested | INSERT into `Documents` + `FieldAnnotations` |
| Model prediction (standard field) | INSERT into `Candidates` |
| Model prediction (purchase lines) | INSERT into `ComplexAnnotations` |
| Human label | INSERT into `Candidates` or `ComplexAnnotations` with `source = "LABEL"` |
| New model run on existing document | INSERT new rows — never read-modify-write |

---

## BigQuery Export

Daily export via Spanner → BigQuery:

- `Candidates` — exports as flat rows, `candidate` proto column decoded natively via proto bundle
- `ComplexAnnotations` — `data` column requires proto deserialization in BQ (proto bundle for `PurchaseLineData`, `VatDistributionData`, `QrData`)
- All filtering, joins, and ad-hoc queries happen in BQ — Spanner has no secondary indexes on these tables
