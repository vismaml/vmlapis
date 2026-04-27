# Feedback → DocumentDataService Integration Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use vmlpowers:subagent-driven-development (recommended) or vmlpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Add fire-and-forget calls to DocumentDataService at the end of DataService.Feedback to populate the unified Spanner store with document blobs, prediction annotations, and feedback annotations.

**Architecture:** A new `mapper` package under `go/pkg/documentdata/mapper/` converts the flat `TrueValues`/`PredictionValues` proto messages into `InternalFieldAnnotation` entries using a table-driven approach with proto field numbers. The DataService gets a `DocumentDataServiceClient` injected via constructor. After the BQ insert succeeds, a goroutine fires three gRPC calls (SetDocumentBlobs, AddAnnotations×2) on a detached context.

**Tech Stack:** Go, gRPC, protobuf reflection (`protoreflect`), `google.golang.org/protobuf/types/known/wrapperspb`

**Design spec:** `docs/vmlpowers/specs/2026-04-24-feedback-documentdata-integration.md`

---

## File Structure

| Action | Path | Responsibility |
|--------|------|----------------|
| Create | `go/pkg/documentdata/mapper/mapper.go` | Field definitions table, MapTrueValues, MapPredictions, BuildSetDocumentBlobsRequest |
| Create | `go/pkg/documentdata/mapper/normalize.go` | PurchaseLineCandidate→PurchaseLine, VatDistributionCandidate→VatDistribution conversions |
| Create | `go/pkg/documentdata/mapper/mapper_test.go` | Tests for all mapping functions |
| Modify | `go/services/dataservice/v1/dataservice.go` | Add docDataClient + config fields to DataService struct |
| Modify | `go/services/dataservice/v1/handler.go` | Add sendToDocumentData goroutine after BQ insert |
| Modify | `go/cmd/dataservice/v1/main.go` | Wire DocumentDataService gRPC client |
| Modify | `manifests/base/dataservice/dataservice.yaml` | Add DATASERVICE_DOCUMENT_DATA_NETLOC env var |
| Modify | `manifests/overlays/sandbox/dataservice/dataservice.yaml` | Add DATASERVICE_DOCUMENT_DATA_ENVIRONMENT env var |

---

### Task 1: Create mapper package — field definitions and standard field mapping

**Files:**
- Create: `go/pkg/documentdata/mapper/mapper.go`

**Context:**
- `TrueValues` has 37 `StringValue` fields, 3 `DoubleValue` fields, and 5 `Date` fields (40 standard scalar fields) plus 3 complex fields (purchase_lines, answers, vat_distribution) plus 2 more Date fields (check_in_date, check_out_date)
- `PredictionValues` has the same fields but all repeated
- Use proto field numbers to extract values via `protoreflect` — avoids 40+ explicit getter functions
- The proto field numbers are identical between `TrueValues` and `PredictionValues`
- `PredictionConfidences` has the same field numbers (1-42) with `repeated FloatValue`
- `PredictionMetadata` has the same field numbers (1-42) with `repeated ModelSpec`
- Complex fields (41=purchase_lines, 42=answers, 43=vat_distribution) are handled separately in Task 2

- [ ] **Step 1: Create the mapper package with field definitions and helpers**

```go
// go/pkg/documentdata/mapper/mapper.go
package mapper

import (
	"fmt"
	"strconv"
	"strings"

	pb "github.com/e-conomic/vmlapis/gen/go/ssn/dataservice/v1"
	dds "github.com/e-conomic/vmlapis/gen/go/ssn/documentdataservice/v1"
	ssntype "github.com/e-conomic/vmlapis/gen/go/ssn/type"
	"google.golang.org/genproto/googleapis/type/date"
	"google.golang.org/protobuf/proto"
	"google.golang.org/protobuf/reflect/protoreflect"
	"google.golang.org/protobuf/types/known/wrapperspb"
)

// fieldType distinguishes the three scalar types used in TrueValues/PredictionValues.
type fieldType int

const (
	ftString fieldType = iota // google.protobuf.StringValue
	ftDouble                  // google.protobuf.DoubleValue
	ftDate                    // google.type.Date
)

// fieldDef maps a proto field number to its DocumentDataService feature name and type.
type fieldDef struct {
	feature  string
	fieldNum protoreflect.FieldNumber
	ftype    fieldType
}

// standardFields defines the mapping for all 42 standard scalar fields.
// Field numbers match TrueValues, PredictionValues, PredictionConfidences, and PredictionMetadata.
var standardFields = []fieldDef{
	{"TOTAL_INCL_VAT", 1, ftDouble},
	{"TOTAL_VAT", 2, ftDouble},
	{"TOTAL_EXCL_VAT", 3, ftDouble},
	{"ORDER_DATE", 4, ftDate},
	{"PAYMENT_DUE_DATE", 5, ftDate},
	{"DOCUMENT_TYPE", 6, ftString},
	{"CURRENCY", 7, ftString},
	{"CREDIT_CARD_LAST_FOUR", 8, ftString},
	{"PAYMENT_METHOD", 9, ftString},
	{"OCR_LINE_DK_TYPE", 10, ftString},
	{"OCR_LINE_DK_PAYMENT_ID", 11, ftString},
	{"OCR_LINE_DK_CREDITOR_ID", 12, ftString},
	{"OCR_LINE_SE_PAYMENT_ID", 13, ftString},
	{"OCR_LINE_SE_BANKGIRO_CREDITOR_ID", 14, ftString},
	{"OCR_LINE_SE_PLUSGIRO_CREDITOR_ID", 15, ftString},
	{"OCR_LINE_NO_PAYMENT_ID", 16, ftString},
	{"OCR_LINE_FI_PAYMENT_ID", 17, ftString},
	{"OCR_LINE_NL_PAYMENT_ID", 18, ftString},
	{"SUPPLIER_CORPORATE_ID", 19, ftString},
	{"SUPPLIER_COUNTRY_CODE", 20, ftString},
	{"INVOICE_NUMBER", 21, ftString},
	{"IBAN", 22, ftString},
	{"ORDER_REFERENCE", 23, ftString},
	{"BANK_ACCOUNT_NUMBER", 24, ftString},
	{"BANK_REGISTRATION_NUMBER", 25, ftString},
	{"SUPPLIER_NAME", 26, ftString},
	{"BIC", 27, ftString},
	{"DOCUMENT_NUMBER", 28, ftString},
	{"DOCUMENT_DATE", 29, ftDate},
	{"ORDER_NUMBER", 30, ftString},
	{"SUPPLIER_VAT_NUMBER", 31, ftString},
	{"SUPPLIER_ORGANISATION_NUMBER", 32, ftString},
	{"SUPPLIER_ADDRESS", 33, ftString},
	{"CUSTOMER_NUMBER", 34, ftString},
	{"RECEIVER_ORDER_NUMBER", 35, ftString},
	{"OCR_LINE_BE_PAYMENT_ID", 36, ftString},
	{"RECEIVER_ADDRESS", 37, ftString},
	{"RECEIVER_COUNTRY_CODE", 38, ftString},
	{"RECEIVER_NAME", 39, ftString},
	{"RECEIVER_VAT_NUMBER", 40, ftString},
	// 41, 42, 43 are complex fields — handled separately
	{"CHECK_IN_DATE", 44, ftDate},
	{"CHECK_OUT_DATE", 45, ftDate},
}

// extractStringValue extracts the string representation of a proto field value.
func extractStringValue(msg protoreflect.Message, fd protoreflect.FieldDescriptor, ftype fieldType) string {
	val := msg.Get(fd)
	if !msg.Has(fd) {
		return ""
	}

	switch ftype {
	case ftString:
		// StringValue wrapper — get the inner "value" field
		innerMsg := val.Message()
		valFd := innerMsg.Descriptor().Fields().ByName("value")
		return innerMsg.Get(valFd).String()
	case ftDouble:
		// DoubleValue wrapper — get the inner "value" field
		innerMsg := val.Message()
		valFd := innerMsg.Descriptor().Fields().ByName("value")
		return strconv.FormatFloat(innerMsg.Get(valFd).Float(), 'f', -1, 64)
	case ftDate:
		// google.type.Date
		innerMsg := val.Message()
		year := innerMsg.Get(innerMsg.Descriptor().Fields().ByName("year")).Int()
		month := innerMsg.Get(innerMsg.Descriptor().Fields().ByName("month")).Int()
		day := innerMsg.Get(innerMsg.Descriptor().Fields().ByName("day")).Int()
		return fmt.Sprintf("%04d-%02d-%02d", year, month, day)
	}
	return ""
}

// extractRepeatedStringValues extracts string values from a repeated field in PredictionValues.
func extractRepeatedStringValues(msg protoreflect.Message, fd protoreflect.FieldDescriptor, ftype fieldType) []string {
	list := msg.Get(fd).List()
	if list.Len() == 0 {
		return nil
	}
	vals := make([]string, 0, list.Len())
	for i := 0; i < list.Len(); i++ {
		innerMsg := list.Get(i).Message()
		switch ftype {
		case ftString:
			valFd := innerMsg.Descriptor().Fields().ByName("value")
			vals = append(vals, innerMsg.Get(valFd).String())
		case ftDouble:
			valFd := innerMsg.Descriptor().Fields().ByName("value")
			vals = append(vals, strconv.FormatFloat(innerMsg.Get(valFd).Float(), 'f', -1, 64))
		case ftDate:
			year := innerMsg.Get(innerMsg.Descriptor().Fields().ByName("year")).Int()
			month := innerMsg.Get(innerMsg.Descriptor().Fields().ByName("month")).Int()
			day := innerMsg.Get(innerMsg.Descriptor().Fields().ByName("day")).Int()
			vals = append(vals, fmt.Sprintf("%04d-%02d-%02d", year, month, day))
		}
	}
	return vals
}

// extractRepeatedFloats extracts confidence values from PredictionConfidences.
func extractRepeatedFloats(msg protoreflect.Message, fd protoreflect.FieldDescriptor) []float32 {
	list := msg.Get(fd).List()
	if list.Len() == 0 {
		return nil
	}
	vals := make([]float32, 0, list.Len())
	for i := 0; i < list.Len(); i++ {
		innerMsg := list.Get(i).Message()
		valFd := innerMsg.Descriptor().Fields().ByName("value")
		vals = append(vals, float32(innerMsg.Get(valFd).Float()))
	}
	return vals
}

// extractModelSpecs extracts ModelSpec entries from PredictionMetadata.
func extractModelSpecs(msg protoreflect.Message, fd protoreflect.FieldDescriptor) []*ssntype.ModelSpec {
	list := msg.Get(fd).List()
	if list.Len() == 0 {
		return nil
	}
	specs := make([]*ssntype.ModelSpec, 0, list.Len())
	for i := 0; i < list.Len(); i++ {
		spec := &ssntype.ModelSpec{}
		proto.Merge(spec, list.Get(i).Message().Interface().(proto.Message))
		specs = append(specs, spec)
	}
	return specs
}

// modelSpecToSourceID converts a ModelSpec to a source_id string.
func modelSpecToSourceID(ms *ssntype.ModelSpec) string {
	if ms == nil {
		return "unknown"
	}
	name := ms.GetModelName()
	if name == "" {
		return "unknown"
	}
	if ms.GetModelVer() != nil {
		return fmt.Sprintf("%s:v%d", name, ms.GetModelVer().GetValue())
	}
	return name
}

// MapTrueValuesToAnnotations converts feedback true values to InternalFieldAnnotation entries.
// Each non-nil field produces one annotation with source=FEEDBACK and source_id=consumer.
func MapTrueValuesToAnnotations(tv *pb.TrueValues, consumer string) []*dds.InternalFieldAnnotation {
	if tv == nil {
		return nil
	}

	var annotations []*dds.InternalFieldAnnotation
	msg := tv.ProtoReflect()

	for _, fd := range standardFields {
		protoFd := msg.Descriptor().Fields().ByNumber(fd.fieldNum)
		if protoFd == nil || !msg.Has(protoFd) {
			continue
		}

		val := extractStringValue(msg, protoFd, fd.ftype)
		if val == "" {
			continue
		}

		annotations = append(annotations, &dds.InternalFieldAnnotation{
			Feature: fd.feature,
			Data: &dds.InternalFieldAnnotation_FieldData{
				FieldData: &dds.FieldData{
					Candidates: []*dds.InternalCandidate{{
						Candidate: &ssntype.Candidate{Value: val},
						Source:    dds.CandidateSource_CANDIDATE_SOURCE_FEEDBACK,
						SourceId:  consumer,
					}},
				},
			},
		})
	}

	// Complex fields handled in normalize.go
	annotations = append(annotations, mapTrueValuesComplexFields(tv, consumer)...)

	return annotations
}

// MapPredictionToAnnotations converts prediction values to InternalFieldAnnotation entries.
// Each non-empty repeated field produces one annotation with source=PREDICTION.
func MapPredictionToAnnotations(
	pv *pb.PredictionValues,
	pc *pb.PredictionConfidences,
	pm *pb.PredictionMetadata,
) []*dds.InternalFieldAnnotation {
	if pv == nil {
		return nil
	}

	var annotations []*dds.InternalFieldAnnotation
	pvMsg := pv.ProtoReflect()

	// Optional: confidences and metadata
	var pcMsg, pmMsg protoreflect.Message
	if pc != nil {
		pcMsg = pc.ProtoReflect()
	}
	if pm != nil {
		pmMsg = pm.ProtoReflect()
	}

	for _, fd := range standardFields {
		protoFd := pvMsg.Descriptor().Fields().ByNumber(fd.fieldNum)
		if protoFd == nil {
			continue
		}

		vals := extractRepeatedStringValues(pvMsg, protoFd, fd.ftype)
		if len(vals) == 0 {
			continue
		}

		// Get confidences for this field
		var confs []float32
		if pcMsg != nil {
			confFd := pcMsg.Descriptor().Fields().ByNumber(fd.fieldNum)
			if confFd != nil {
				confs = extractRepeatedFloats(pcMsg, confFd)
			}
		}

		// Get model specs for this field
		var specs []*ssntype.ModelSpec
		if pmMsg != nil {
			metaFd := pmMsg.Descriptor().Fields().ByNumber(fd.fieldNum)
			if metaFd != nil {
				specs = extractModelSpecs(pmMsg, metaFd)
			}
		}

		candidates := make([]*dds.InternalCandidate, 0, len(vals))
		for i, val := range vals {
			c := &ssntype.Candidate{Value: val}
			if i < len(confs) {
				c.Confidence = &ssntype.Confidence{
					Level: ssntype.Confidence_Level(ssntype.Confidence_Level_value["UNKNOWN"]),
				}
				// Store raw confidence as the float value
			}

			sourceID := "unknown"
			if i < len(specs) {
				sourceID = modelSpecToSourceID(specs[i])
			} else if len(specs) > 0 {
				sourceID = modelSpecToSourceID(specs[0])
			}

			candidates = append(candidates, &dds.InternalCandidate{
				Candidate: c,
				Source:    dds.CandidateSource_CANDIDATE_SOURCE_PREDICTION,
				SourceId:  sourceID,
			})
		}

		annotations = append(annotations, &dds.InternalFieldAnnotation{
			Feature: fd.feature,
			Data: &dds.InternalFieldAnnotation_FieldData{
				FieldData: &dds.FieldData{
					Candidates: candidates,
				},
			},
		})
	}

	// Complex fields handled in normalize.go
	annotations = append(annotations, mapPredictionComplexFields(pv, pm)...)

	return annotations
}

// BuildSetDocumentBlobsRequest constructs the SetDocumentBlobs request.
func BuildSetDocumentBlobsRequest(feedbackID, consumer, permImgBucket, permTABucket, blobID, env string, tags []string) *dds.SetDocumentBlobsRequest {
	req := &dds.SetDocumentBlobsRequest{
		FeedbackId:  feedbackID,
		Consumer:    consumer,
		FileUri:     &wrapperspb.StringValue{Value: fmt.Sprintf("gs://%s/%s", permImgBucket, blobID)},
		TaUri:       &wrapperspb.StringValue{Value: fmt.Sprintf("gs://%s/%s", permTABucket, blobID)},
		Environment: env,
	}
	if len(tags) > 0 {
		req.Tags = tags
	}
	return req
}
```

- [ ] **Step 2: Verify it compiles**

```bash
cd go && go build ./pkg/documentdata/mapper/
```

Expected: compilation error because `mapTrueValuesComplexFields` and `mapPredictionComplexFields` don't exist yet. That's OK — we create normalize.go next.

---

### Task 2: Create normalize.go — complex field conversions

**Files:**
- Create: `go/pkg/documentdata/mapper/normalize.go`

**Context:**
- `PurchaseLineCandidate` (old format) has flat string fields → convert to `PurchaseLine` (new format) with `repeated Candidate` per attribute
- `VatDistributionCandidate` (old format) has flat string fields → convert to `VatDistribution` (new format) with `repeated Candidate` per attribute
- `AnswerCandidate` maps directly to `InternalAnswerCandidate`
- Both `TrueValues` and `PredictionValues` use the same candidate types for complex fields

- [ ] **Step 1: Create normalize.go with complex field mapping**

```go
// go/pkg/documentdata/mapper/normalize.go
package mapper

import (
	pb "github.com/e-conomic/vmlapis/gen/go/ssn/dataservice/v1"
	dds "github.com/e-conomic/vmlapis/gen/go/ssn/documentdataservice/v1"
	ssntype "github.com/e-conomic/vmlapis/gen/go/ssn/type"
)

// candidateFromString creates a Candidate with a string value, skipping empty strings.
func candidateFromString(val string) []*ssntype.Candidate {
	if val == "" {
		return nil
	}
	return []*ssntype.Candidate{{Value: val}}
}

// normalizePurchaseLine converts PurchaseLineCandidate (old) to PurchaseLine (new).
func normalizePurchaseLine(plc *ssntype.PurchaseLineCandidate) *ssntype.PurchaseLine {
	if plc == nil {
		return nil
	}
	return &ssntype.PurchaseLine{
		PageRef:            plc.GetPageRef(),
		Code:               candidateFromString(plc.GetCode()),
		Description:        candidateFromString(plc.GetDescription()),
		Quantity:           candidateFromString(plc.GetQuantity()),
		ItemNumber:         candidateFromString(plc.GetItemNumber()),
		Unit:               candidateFromString(plc.GetUnit()),
		TotalDiscount:      candidateFromString(plc.GetTotalDiscount()),
		PercentageDiscount: candidateFromString(plc.GetPercentageDiscount()),
		TotalInclVat:       candidateFromString(plc.GetTotalInclVat()),
		TotalExclVat:       candidateFromString(plc.GetTotalExclVat()),
		TotalVat:           candidateFromString(plc.GetTotalVat()),
		PercentageVat:      candidateFromString(plc.GetPercentageVat()),
		UnitPriceInclVat:   candidateFromString(plc.GetUnitPriceInclVat()),
		UnitPriceExclVat:   candidateFromString(plc.GetUnitPriceExclVat()),
		Total:              candidateFromString(plc.GetTotal()),
		UnitPrice:          candidateFromString(plc.GetUnitPrice()),
		ModelMetadata:      plc.GetModelMetadata(),
	}
}

// normalizeVatDistribution converts VatDistributionCandidate (old) to VatDistribution (new).
func normalizeVatDistribution(vdc *ssntype.VatDistributionCandidate) *ssntype.VatDistribution {
	if vdc == nil {
		return nil
	}
	return &ssntype.VatDistribution{
		PageRef:      vdc.GetPageRef(),
		Percentage:   candidateFromString(vdc.GetPercentage()),
		TotalInclVat: candidateFromString(vdc.GetInclVat()),
		TotalExclVat: candidateFromString(vdc.GetExclVat()),
		TotalVat:     candidateFromString(vdc.GetAmount()),
		ModelMetadata: vdc.GetModelMetadata(),
	}
}

// mapTrueValuesComplexFields maps purchase_lines, vat_distribution, and answers from TrueValues.
func mapTrueValuesComplexFields(tv *pb.TrueValues, consumer string) []*dds.InternalFieldAnnotation {
	var annotations []*dds.InternalFieldAnnotation

	// Purchase lines
	if pls := tv.GetPurchaseLines(); len(pls) > 0 {
		lines := make([]*dds.InternalPurchaseLine, 0, len(pls))
		for _, plc := range pls {
			pl := normalizePurchaseLine(plc)
			if pl != nil {
				lines = append(lines, &dds.InternalPurchaseLine{
					Line:     pl,
					Source:   dds.CandidateSource_CANDIDATE_SOURCE_FEEDBACK,
					SourceId: consumer,
				})
			}
		}
		if len(lines) > 0 {
			annotations = append(annotations, &dds.InternalFieldAnnotation{
				Feature: "PURCHASE_LINES",
				Data: &dds.InternalFieldAnnotation_PurchaseLineData{
					PurchaseLineData: &dds.PurchaseLineData{Lines: lines},
				},
			})
		}
	}

	// VAT distribution
	if vds := tv.GetVatDistribution(); len(vds) > 0 {
		dists := make([]*dds.InternalVatDistribution, 0, len(vds))
		for _, vdc := range vds {
			vd := normalizeVatDistribution(vdc)
			if vd != nil {
				dists = append(dists, &dds.InternalVatDistribution{
					Distribution: vd,
					Source:       dds.CandidateSource_CANDIDATE_SOURCE_FEEDBACK,
					SourceId:     consumer,
				})
			}
		}
		if len(dists) > 0 {
			annotations = append(annotations, &dds.InternalFieldAnnotation{
				Feature: "VAT_DISTRIBUTION",
				Data: &dds.InternalFieldAnnotation_VatDistributionData{
					VatDistributionData: &dds.VatDistributionData{Distributions: dists},
				},
			})
		}
	}

	// QA answers
	if answers := tv.GetAnswers(); len(answers) > 0 {
		internal := make([]*dds.InternalAnswerCandidate, 0, len(answers))
		for _, ac := range answers {
			internal = append(internal, &dds.InternalAnswerCandidate{
				Answer:   ac,
				Source:   dds.CandidateSource_CANDIDATE_SOURCE_FEEDBACK,
				SourceId: consumer,
			})
		}
		annotations = append(annotations, &dds.InternalFieldAnnotation{
			Feature: "QA",
			Data: &dds.InternalFieldAnnotation_AnswerData{
				AnswerData: &dds.AnswerData{Answers: internal},
			},
		})
	}

	return annotations
}

// mapPredictionComplexFields maps purchase_lines, vat_distribution, and answers from PredictionValues.
func mapPredictionComplexFields(pv *pb.PredictionValues, pm *pb.PredictionMetadata) []*dds.InternalFieldAnnotation {
	var annotations []*dds.InternalFieldAnnotation

	// Purchase lines
	if pls := pv.GetPurchaseLines(); len(pls) > 0 {
		lines := make([]*dds.InternalPurchaseLine, 0, len(pls))
		for _, plc := range pls {
			pl := normalizePurchaseLine(plc)
			if pl != nil {
				sourceID := "unknown"
				if plc.GetModelMetadata() != nil {
					sourceID = modelSpecToSourceID(plc.GetModelMetadata())
				}
				lines = append(lines, &dds.InternalPurchaseLine{
					Line:     pl,
					Source:   dds.CandidateSource_CANDIDATE_SOURCE_PREDICTION,
					SourceId: sourceID,
				})
			}
		}
		if len(lines) > 0 {
			annotations = append(annotations, &dds.InternalFieldAnnotation{
				Feature: "PURCHASE_LINES",
				Data: &dds.InternalFieldAnnotation_PurchaseLineData{
					PurchaseLineData: &dds.PurchaseLineData{Lines: lines},
				},
			})
		}
	}

	// VAT distribution
	if vds := pv.GetVatDistribution(); len(vds) > 0 {
		dists := make([]*dds.InternalVatDistribution, 0, len(vds))
		for _, vdc := range vds {
			vd := normalizeVatDistribution(vdc)
			if vd != nil {
				sourceID := "unknown"
				if vdc.GetModelMetadata() != nil {
					sourceID = modelSpecToSourceID(vdc.GetModelMetadata())
				}
				dists = append(dists, &dds.InternalVatDistribution{
					Distribution: vd,
					Source:       dds.CandidateSource_CANDIDATE_SOURCE_PREDICTION,
					SourceId:     sourceID,
				})
			}
		}
		if len(dists) > 0 {
			annotations = append(annotations, &dds.InternalFieldAnnotation{
				Feature: "VAT_DISTRIBUTION",
				Data: &dds.InternalFieldAnnotation_VatDistributionData{
					VatDistributionData: &dds.VatDistributionData{Distributions: dists},
				},
			})
		}
	}

	// QA answers
	if answers := pv.GetAnswers(); len(answers) > 0 {
		internal := make([]*dds.InternalAnswerCandidate, 0, len(answers))
		for _, ac := range answers {
			sourceID := "unknown"
			if ac.GetModelMetadata() != nil {
				sourceID = modelSpecToSourceID(ac.GetModelMetadata())
			}
			internal = append(internal, &dds.InternalAnswerCandidate{
				Answer:   ac,
				Source:   dds.CandidateSource_CANDIDATE_SOURCE_PREDICTION,
				SourceId: sourceID,
			})
		}
		annotations = append(annotations, &dds.InternalFieldAnnotation{
			Feature: "QA",
			Data: &dds.InternalFieldAnnotation_AnswerData{
				AnswerData: &dds.AnswerData{Answers: internal},
			},
		})
	}

	return annotations
}
```

- [ ] **Step 2: Verify both files compile**

```bash
cd go && go build ./pkg/documentdata/mapper/
```

Expected: exit 0, no errors.

- [ ] **Step 3: Commit**

```bash
git add go/pkg/documentdata/mapper/
git commit -m "feat: add documentdata mapper package for feedback integration"
```

---

### Task 3: Tests for the mapper

**Files:**
- Create: `go/pkg/documentdata/mapper/mapper_test.go`

**Context:**
- Use `github.com/stretchr/testify/assert` — the standard assertion library in this codebase
- Test the three public functions: `MapTrueValuesToAnnotations`, `MapPredictionToAnnotations`, `BuildSetDocumentBlobsRequest`
- Test normalization functions indirectly through the public API

- [ ] **Step 1: Write mapper tests**

```go
// go/pkg/documentdata/mapper/mapper_test.go
package mapper

import (
	"testing"

	pb "github.com/e-conomic/vmlapis/gen/go/ssn/dataservice/v1"
	dds "github.com/e-conomic/vmlapis/gen/go/ssn/documentdataservice/v1"
	ssntype "github.com/e-conomic/vmlapis/gen/go/ssn/type"
	"github.com/stretchr/testify/assert"
	"google.golang.org/genproto/googleapis/type/date"
	"google.golang.org/protobuf/types/known/wrapperspb"
)

func TestMapTrueValuesToAnnotations_NilInput(t *testing.T) {
	result := MapTrueValuesToAnnotations(nil, "consumer")
	assert.Nil(t, result)
}

func TestMapTrueValuesToAnnotations_StandardFields(t *testing.T) {
	tv := &pb.TrueValues{
		TotalInclVat: &wrapperspb.DoubleValue{Value: 123.45},
		Currency:     &wrapperspb.StringValue{Value: "DKK"},
		DocumentDate: &date.Date{Year: 2026, Month: 4, Day: 24},
	}

	result := MapTrueValuesToAnnotations(tv, "test-consumer")

	assert.Len(t, result, 3)

	// Check TOTAL_INCL_VAT
	found := findAnnotation(result, "TOTAL_INCL_VAT")
	assert.NotNil(t, found)
	fd := found.GetFieldData()
	assert.Len(t, fd.GetCandidates(), 1)
	assert.Equal(t, "123.45", fd.GetCandidates()[0].GetCandidate().GetValue())
	assert.Equal(t, dds.CandidateSource_CANDIDATE_SOURCE_FEEDBACK, fd.GetCandidates()[0].GetSource())
	assert.Equal(t, "test-consumer", fd.GetCandidates()[0].GetSourceId())

	// Check CURRENCY
	found = findAnnotation(result, "CURRENCY")
	assert.NotNil(t, found)
	assert.Equal(t, "DKK", found.GetFieldData().GetCandidates()[0].GetCandidate().GetValue())

	// Check DOCUMENT_DATE
	found = findAnnotation(result, "DOCUMENT_DATE")
	assert.NotNil(t, found)
	assert.Equal(t, "2026-04-24", found.GetFieldData().GetCandidates()[0].GetCandidate().GetValue())
}

func TestMapTrueValuesToAnnotations_PurchaseLines(t *testing.T) {
	tv := &pb.TrueValues{
		PurchaseLines: []*ssntype.PurchaseLineCandidate{
			{
				Description: "Widget",
				Quantity:    "2",
				Total:       "100.00",
			},
		},
	}

	result := MapTrueValuesToAnnotations(tv, "consumer")

	found := findAnnotation(result, "PURCHASE_LINES")
	assert.NotNil(t, found)
	pld := found.GetPurchaseLineData()
	assert.Len(t, pld.GetLines(), 1)
	assert.Equal(t, dds.CandidateSource_CANDIDATE_SOURCE_FEEDBACK, pld.GetLines()[0].GetSource())

	// Verify normalization: string field → repeated Candidate
	pl := pld.GetLines()[0].GetLine()
	assert.Len(t, pl.GetDescription(), 1)
	assert.Equal(t, "Widget", pl.GetDescription()[0].GetValue())
}

func TestMapTrueValuesToAnnotations_VatDistribution(t *testing.T) {
	tv := &pb.TrueValues{
		VatDistribution: []*ssntype.VatDistributionCandidate{
			{
				Percentage: "25",
				Amount:     "50.00",
			},
		},
	}

	result := MapTrueValuesToAnnotations(tv, "consumer")

	found := findAnnotation(result, "VAT_DISTRIBUTION")
	assert.NotNil(t, found)
	vdd := found.GetVatDistributionData()
	assert.Len(t, vdd.GetDistributions(), 1)
}

func TestMapTrueValuesToAnnotations_Answers(t *testing.T) {
	tv := &pb.TrueValues{
		Answers: []*ssntype.AnswerCandidate{
			{
				Question: "What is the total?",
				Answer:   "123.45",
			},
		},
	}

	result := MapTrueValuesToAnnotations(tv, "consumer")

	found := findAnnotation(result, "QA")
	assert.NotNil(t, found)
	ad := found.GetAnswerData()
	assert.Len(t, ad.GetAnswers(), 1)
	assert.Equal(t, "What is the total?", ad.GetAnswers()[0].GetAnswer().GetQuestion())
}

func TestMapPredictionToAnnotations_StandardFields(t *testing.T) {
	pv := &pb.PredictionValues{
		TotalInclVat: []*wrapperspb.DoubleValue{{Value: 100.0}, {Value: 200.0}},
		Currency:     []*wrapperspb.StringValue{{Value: "DKK"}, {Value: "EUR"}},
	}
	pc := &pb.PredictionConfidences{
		TotalInclVat: []*wrapperspb.FloatValue{{Value: 0.95}, {Value: 0.80}},
	}
	pm := &pb.PredictionMetadata{
		TotalInclVat: []*ssntype.ModelSpec{
			{ModelName: "ssn-total", ModelVer: &wrapperspb.Int64Value{Value: 3}},
		},
	}

	result := MapPredictionToAnnotations(pv, pc, pm)

	// TOTAL_INCL_VAT should have 2 candidates
	found := findAnnotation(result, "TOTAL_INCL_VAT")
	assert.NotNil(t, found)
	fd := found.GetFieldData()
	assert.Len(t, fd.GetCandidates(), 2)
	assert.Equal(t, "100", fd.GetCandidates()[0].GetCandidate().GetValue())
	assert.Equal(t, dds.CandidateSource_CANDIDATE_SOURCE_PREDICTION, fd.GetCandidates()[0].GetSource())
	assert.Equal(t, "ssn-total:v3", fd.GetCandidates()[0].GetSourceId())
	// Second candidate falls back to first model spec
	assert.Equal(t, "ssn-total:v3", fd.GetCandidates()[1].GetSourceId())
}

func TestMapPredictionToAnnotations_NilInput(t *testing.T) {
	result := MapPredictionToAnnotations(nil, nil, nil)
	assert.Nil(t, result)
}

func TestBuildSetDocumentBlobsRequest(t *testing.T) {
	req := BuildSetDocumentBlobsRequest("fb-123", "consumer-a", "perm-img-bucket", "perm-ta-bucket", "consumer-a/fb-123", "snbx", []string{"tag1"})

	assert.Equal(t, "fb-123", req.GetFeedbackId())
	assert.Equal(t, "consumer-a", req.GetConsumer())
	assert.Equal(t, "gs://perm-img-bucket/consumer-a/fb-123", req.GetFileUri().GetValue())
	assert.Equal(t, "gs://perm-ta-bucket/consumer-a/fb-123", req.GetTaUri().GetValue())
	assert.Equal(t, "snbx", req.GetEnvironment())
	assert.Equal(t, []string{"tag1"}, req.GetTags())
}

func TestModelSpecToSourceID(t *testing.T) {
	assert.Equal(t, "unknown", modelSpecToSourceID(nil))
	assert.Equal(t, "unknown", modelSpecToSourceID(&ssntype.ModelSpec{}))
	assert.Equal(t, "my-model", modelSpecToSourceID(&ssntype.ModelSpec{ModelName: "my-model"}))
	assert.Equal(t, "my-model:v5", modelSpecToSourceID(&ssntype.ModelSpec{
		ModelName: "my-model",
		ModelVer:  &wrapperspb.Int64Value{Value: 5},
	}))
}

// findAnnotation finds an InternalFieldAnnotation by feature name.
func findAnnotation(annotations []*dds.InternalFieldAnnotation, feature string) *dds.InternalFieldAnnotation {
	for _, a := range annotations {
		if a.GetFeature() == feature {
			return a
		}
	}
	return nil
}
```

- [ ] **Step 2: Run tests**

```bash
cd go && go test ./pkg/documentdata/mapper/ -v
```

Expected: all tests pass.

- [ ] **Step 3: Commit**

```bash
git add go/pkg/documentdata/mapper/mapper_test.go
git commit -m "test: add mapper tests for feedback-documentdata integration"
```

---

### Task 4: Add DocumentDataService client to DataService struct

**Files:**
- Modify: `go/services/dataservice/v1/dataservice.go`

**Context:**
- The `DataService` struct holds all dependencies
- `NewDataService` constructor takes all deps as parameters
- The client should be optional (nil = disabled) to avoid breaking existing tests
- The client interface is `dds.DocumentDataServiceClient` from `gen/go/ssn/documentdataservice/v1`
- Also need bucket names (strings) and environment for constructing the SetDocumentBlobs request

- [ ] **Step 1: Update DataService struct and constructor**

Add these imports to `dataservice.go`:

```go
dds "github.com/e-conomic/vmlapis/gen/go/ssn/documentdataservice/v1"
```

Add these fields to the `DataService` struct after `parserClient`:

```go
docDataClient  dds.DocumentDataServiceClient
permImgBucketName string
permTABucketName  string
docDataEnv        string
```

Update `NewDataService` to accept the new parameters — add them at the end:

```go
func NewDataService(
	debugImgBucket, tempImgBucket, tempTABucket, tempPredBucket, permImgBucket, permTABucket *storage.BucketHandle,
	bqFeedback, bqStats, bqDeletion bigdata.IBQRepository,
	metrics *Metrics, dsmetrics dsmetrics.IDSMetrics,
	dbClient *sql.DB,
	parserClient parser.IParserServiceClient,
	docDataClient dds.DocumentDataServiceClient,
	permImgBucketName, permTABucketName, docDataEnv string,
) *DataService {
	return &DataService{
		debugImgBucket:    debugImgBucket,
		tempImgBucket:     tempImgBucket,
		tempTABucket:      tempTABucket,
		tempPredBucket:    tempPredBucket,
		permImgBucket:     permImgBucket,
		permTABucket:      permTABucket,
		bqFeedback:        bqFeedback,
		bqStats:           bqStats,
		bqDeletion:        bqDeletion,
		metrics:           metrics,
		dsmetrics:         dsmetrics,
		dbClient:          dbClient,
		parserClient:      parserClient,
		docDataClient:     docDataClient,
		permImgBucketName: permImgBucketName,
		permTABucketName:  permTABucketName,
		docDataEnv:        docDataEnv,
	}
}
```

- [ ] **Step 2: Fix the test setup to pass the new parameters**

In `go/services/dataservice/v1/handler_test.go`, update `setUpDataService()` line 68 — add `nil, "", "", ""` at the end of the `NewDataService` call:

```go
dataService := NewDataService(
	client.Bucket("debugImg"),
	client.Bucket("tempImg"),
	client.Bucket("tempTA"),
	client.Bucket("tempPred"),
	client.Bucket("permImg"),
	client.Bucket("permTA"),
	nil,
	nil,
	nil,
	otelMetrics,
	nil,
	nil, // dbClient
	nil, // parserClient
	nil, // docDataClient
	"", "", "", // bucket names, env
)
```

- [ ] **Step 3: Fix the main.go call to pass the new parameters**

In `go/cmd/dataservice/v1/main.go`, update the `NewDataService` call at line 136 — add `nil, "", "", ""` for now (we'll wire properly in Task 6):

```go
return dataservice.NewDataService(debugImgBucket, tempImgBucket, tempTABucket, tempPredBucket,
	permImgBucket, permTABucket, bqFeedback, bqStats, bqDeletion, otelMetrics, dsmetrics, dbClient, parserClient,
	nil, "", "", ""), nil
```

- [ ] **Step 4: Verify tests pass**

```bash
cd go && go test ./services/dataservice/v1/ -v -run TestFeedback
```

Expected: existing tests still pass.

- [ ] **Step 5: Commit**

```bash
git add go/services/dataservice/v1/dataservice.go go/services/dataservice/v1/handler_test.go go/cmd/dataservice/v1/main.go
git commit -m "feat: add DocumentDataService client to DataService struct"
```

---

### Task 5: Add sendToDocumentData to handler

**Files:**
- Modify: `go/services/dataservice/v1/handler.go`

**Context:**
- Add after the BQ insert succeeds (line ~129, before `return &empty.Empty{}, nil`)
- Use a goroutine with a detached context (30s timeout)
- Import the mapper package and the DocumentDataService generated client

- [ ] **Step 1: Add the sendToDocumentData method and call it from Feedback**

Add these imports to `handler.go`:

```go
"time"
dds "github.com/e-conomic/vmlapis/gen/go/ssn/documentdataservice/v1"
"github.com/vismaml/vml/go/pkg/documentdata/mapper"
```

Add this method to handler.go:

```go
// sendToDocumentData fires SetDocumentBlobs + AddAnnotations calls to DocumentDataService.
// Runs in a goroutine — errors are logged, never propagated.
func (d *DataService) sendToDocumentData(
	feedbackID, consumer, blobID string,
	tags []string,
	trueValues *pb.TrueValues,
	pred *pb.Document,
) {
	ctx, cancel := context.WithTimeout(context.Background(), 30*time.Second)
	defer cancel()

	logger := zap.L().With(
		zap.String("feedback_id", feedbackID),
		zap.String("consumer", consumer),
	)

	// 1. SetDocumentBlobs
	blobReq := mapper.BuildSetDocumentBlobsRequest(
		feedbackID, consumer,
		d.permImgBucketName, d.permTABucketName,
		blobID, d.docDataEnv, tags,
	)
	if _, err := d.docDataClient.SetDocumentBlobs(ctx, blobReq); err != nil {
		logger.Warn("documentdata: SetDocumentBlobs failed", zap.Error(err))
	}

	// 2. AddAnnotations — predictions
	predAnnotations := mapper.MapPredictionToAnnotations(
		pred.GetPredictionValues(),
		pred.GetPredictionConfidences(),
		pred.GetPredictionMetadata(),
	)
	if len(predAnnotations) > 0 {
		if _, err := d.docDataClient.AddAnnotations(ctx, &dds.AddAnnotationsRequest{
			FeedbackId:  feedbackID,
			Consumer:    consumer,
			Annotations: predAnnotations,
			Environment: d.docDataEnv,
		}); err != nil {
			logger.Warn("documentdata: AddAnnotations (predictions) failed", zap.Error(err))
		}
	}

	// 3. AddAnnotations — feedback (true values)
	fbAnnotations := mapper.MapTrueValuesToAnnotations(trueValues, consumer)
	if len(fbAnnotations) > 0 {
		if _, err := d.docDataClient.AddAnnotations(ctx, &dds.AddAnnotationsRequest{
			FeedbackId:  feedbackID,
			Consumer:    consumer,
			Annotations: fbAnnotations,
			Environment: d.docDataEnv,
		}); err != nil {
			logger.Warn("documentdata: AddAnnotations (feedback) failed", zap.Error(err))
		}
	}
}
```

Then in the `Feedback` method, add this just before the final `return &empty.Empty{}, nil` (after the BQ insert success, around line 129):

```go
	// Fire-and-forget: populate DocumentDataService
	if d.docDataClient != nil {
		go d.sendToDocumentData(req.GetId(), headers.Username, blobID, req.GetTags(), req.GetTrueValues(), pred)
	}

	return &empty.Empty{}, nil
```

- [ ] **Step 2: Verify it compiles**

```bash
cd go && go build ./services/dataservice/v1/
```

Expected: exit 0.

- [ ] **Step 3: Verify existing tests still pass**

```bash
cd go && go test ./services/dataservice/v1/ -v
```

Expected: all tests pass (docDataClient is nil in tests, so the goroutine never fires).

- [ ] **Step 4: Commit**

```bash
git add go/services/dataservice/v1/handler.go
git commit -m "feat: add fire-and-forget DocumentDataService calls in Feedback handler"
```

---

### Task 6: Wire up gRPC client in main.go and update manifests

**Files:**
- Modify: `go/cmd/dataservice/v1/main.go`
- Modify: `manifests/base/dataservice/dataservice.yaml`

**Context:**
- Add `DocumentDataNetloc` and `DocumentDataEnvironment` to the `Configuration` struct (NOT the top-level `Config`)
- Create a gRPC client connection to DocumentDataService
- Both fields are optional — if `DocumentDataNetloc` is empty, pass nil client (disabled)
- Use `grpc.NewClient` (the standard Go gRPC dial function)
- Follow the same pattern as other gRPC client connections in the codebase

- [ ] **Step 1: Add config fields to Configuration struct in dataservice.go**

In `go/services/dataservice/v1/dataservice.go`, add to the `Configuration` struct:

```go
DocumentDataNetloc      string `required:"false" split_words:"true"`
DocumentDataEnvironment string `required:"false" split_words:"true" default:"snbx"`
```

- [ ] **Step 2: Wire up client in main.go**

In `go/cmd/dataservice/v1/main.go`, add this import:

```go
dds "github.com/e-conomic/vmlapis/gen/go/ssn/documentdataservice/v1"
"google.golang.org/grpc/credentials/insecure"
```

In `initDataService()`, before the final `return` statement, add:

```go
	// Initialize DocumentDataService client (optional)
	var docDataClient dds.DocumentDataServiceClient
	if cfg.DocumentDataNetloc != "" {
		conn, err := grpc.NewClient(cfg.DocumentDataNetloc, grpc.WithTransportCredentials(insecure.NewCredentials()))
		if err != nil {
			return nil, fmt.Errorf("failed to connect to DocumentDataService: %w", err)
		}
		docDataClient = dds.NewDocumentDataServiceClient(conn)
	}
```

Update the `return` statement to pass the new parameters:

```go
	return dataservice.NewDataService(debugImgBucket, tempImgBucket, tempTABucket, tempPredBucket,
		permImgBucket, permTABucket, bqFeedback, bqStats, bqDeletion, otelMetrics, dsmetrics, dbClient, parserClient,
		docDataClient, cfg.PermImgBucket, cfg.PermTABucket, cfg.DocumentDataEnvironment), nil
```

- [ ] **Step 3: Add env vars to base dataservice manifest**

In `manifests/base/dataservice/dataservice.yaml`, add after `DATASERVICE_AUTHSERVICE_NETLOC`:

```yaml
            - name: DATASERVICE_DOCUMENT_DATA_NETLOC
              value: "documentdataservice.ssn.svc.cluster.local:50051"
            - name: DATASERVICE_DOCUMENT_DATA_ENVIRONMENT
              value: "snbx"
```

Note: `DOCUMENT_DATA_ENVIRONMENT` should be overridden per environment overlay (staging → "stag", production → "prod"). For now sandbox is the only overlay that exists.

- [ ] **Step 4: Verify it compiles**

```bash
cd go && go build ./cmd/dataservice/v1/
```

Expected: exit 0.

- [ ] **Step 5: Commit**

```bash
git add go/services/dataservice/v1/dataservice.go go/cmd/dataservice/v1/main.go manifests/base/dataservice/dataservice.yaml
git commit -m "feat: wire DocumentDataService gRPC client in dataservice main"
```

---

### Task 7: Run all tests and final verification

**Files:** None (verification only)

- [ ] **Step 1: Run all dataservice tests**

```bash
cd go && go test ./services/dataservice/v1/ -v
```

Expected: all tests pass.

- [ ] **Step 2: Run mapper tests**

```bash
cd go && go test ./pkg/documentdata/mapper/ -v
```

Expected: all tests pass.

- [ ] **Step 3: Build the dataservice binary**

```bash
cd go && go build ./cmd/dataservice/v1/
```

Expected: exit 0.

- [ ] **Step 4: Verify no lint issues**

```bash
cd go && golangci-lint run ./pkg/documentdata/mapper/ ./services/dataservice/v1/ ./cmd/dataservice/v1/
```

Expected: no issues.
