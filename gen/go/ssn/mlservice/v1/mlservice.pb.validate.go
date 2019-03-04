// Code generated by protoc-gen-validate. DO NOT EDIT.
// source: ssn/mlservice/v1/mlservice.proto

package mlservice

import (
	"bytes"
	"errors"
	"fmt"
	"net"
	"net/mail"
	"net/url"
	"regexp"
	"strings"
	"time"
	"unicode/utf8"

	"github.com/golang/protobuf/ptypes"
)

// ensure the imports are used
var (
	_ = bytes.MinRead
	_ = errors.New("")
	_ = fmt.Print
	_ = utf8.UTFMax
	_ = (*regexp.Regexp)(nil)
	_ = (*strings.Reader)(nil)
	_ = net.IPv4len
	_ = time.Duration(0)
	_ = (*url.URL)(nil)
	_ = (*mail.Address)(nil)
	_ = ptypes.DynamicAny{}
)

// Validate checks the field values on PredictedField with the rules defined in
// the proto definition for this message. If any rules are violated, an error
// is returned.
func (m *PredictedField) Validate() error {
	if m == nil {
		return nil
	}

	// no validation rules for Value

	// no validation rules for Confidence

	return nil
}

// PredictedFieldValidationError is the validation error returned by
// PredictedField.Validate if the designated constraints aren't met.
type PredictedFieldValidationError struct {
	field  string
	reason string
	cause  error
	key    bool
}

// Field function returns field value.
func (e PredictedFieldValidationError) Field() string { return e.field }

// Reason function returns reason value.
func (e PredictedFieldValidationError) Reason() string { return e.reason }

// Cause function returns cause value.
func (e PredictedFieldValidationError) Cause() error { return e.cause }

// Key function returns key value.
func (e PredictedFieldValidationError) Key() bool { return e.key }

// ErrorName returns error name.
func (e PredictedFieldValidationError) ErrorName() string { return "PredictedFieldValidationError" }

// Error satisfies the builtin error interface
func (e PredictedFieldValidationError) Error() string {
	cause := ""
	if e.cause != nil {
		cause = fmt.Sprintf(" | caused by: %v", e.cause)
	}

	key := ""
	if e.key {
		key = "key for "
	}

	return fmt.Sprintf(
		"invalid %sPredictedField.%s: %s%s",
		key,
		e.field,
		e.reason,
		cause)
}

var _ error = PredictedFieldValidationError{}

var _ interface {
	Field() string
	Reason() string
	Key() bool
	Cause() error
	ErrorName() string
} = PredictedFieldValidationError{}

// Validate checks the field values on MlRequest with the rules defined in the
// proto definition for this message. If any rules are violated, an error is returned.
func (m *MlRequest) Validate() error {
	if m == nil {
		return nil
	}

	for idx, item := range m.GetOcrResponses() {
		_, _ = idx, item

		if v, ok := interface{}(item).(interface{ Validate() error }); ok {
			if err := v.Validate(); err != nil {
				return MlRequestValidationError{
					field:  fmt.Sprintf("OcrResponses[%v]", idx),
					reason: "embedded message failed validation",
					cause:  err,
				}
			}
		}

	}

	return nil
}

// MlRequestValidationError is the validation error returned by
// MlRequest.Validate if the designated constraints aren't met.
type MlRequestValidationError struct {
	field  string
	reason string
	cause  error
	key    bool
}

// Field function returns field value.
func (e MlRequestValidationError) Field() string { return e.field }

// Reason function returns reason value.
func (e MlRequestValidationError) Reason() string { return e.reason }

// Cause function returns cause value.
func (e MlRequestValidationError) Cause() error { return e.cause }

// Key function returns key value.
func (e MlRequestValidationError) Key() bool { return e.key }

// ErrorName returns error name.
func (e MlRequestValidationError) ErrorName() string { return "MlRequestValidationError" }

// Error satisfies the builtin error interface
func (e MlRequestValidationError) Error() string {
	cause := ""
	if e.cause != nil {
		cause = fmt.Sprintf(" | caused by: %v", e.cause)
	}

	key := ""
	if e.key {
		key = "key for "
	}

	return fmt.Sprintf(
		"invalid %sMlRequest.%s: %s%s",
		key,
		e.field,
		e.reason,
		cause)
}

var _ error = MlRequestValidationError{}

var _ interface {
	Field() string
	Reason() string
	Key() bool
	Cause() error
	ErrorName() string
} = MlRequestValidationError{}

// Validate checks the field values on MlResponse with the rules defined in the
// proto definition for this message. If any rules are violated, an error is returned.
func (m *MlResponse) Validate() error {
	if m == nil {
		return nil
	}

	if v, ok := interface{}(m.GetOrderDate()).(interface{ Validate() error }); ok {
		if err := v.Validate(); err != nil {
			return MlResponseValidationError{
				field:  "OrderDate",
				reason: "embedded message failed validation",
				cause:  err,
			}
		}
	}

	if v, ok := interface{}(m.GetPaymentDueDate()).(interface{ Validate() error }); ok {
		if err := v.Validate(); err != nil {
			return MlResponseValidationError{
				field:  "PaymentDueDate",
				reason: "embedded message failed validation",
				cause:  err,
			}
		}
	}

	if v, ok := interface{}(m.GetCurrency()).(interface{ Validate() error }); ok {
		if err := v.Validate(); err != nil {
			return MlResponseValidationError{
				field:  "Currency",
				reason: "embedded message failed validation",
				cause:  err,
			}
		}
	}

	if v, ok := interface{}(m.GetTotalVat()).(interface{ Validate() error }); ok {
		if err := v.Validate(); err != nil {
			return MlResponseValidationError{
				field:  "TotalVat",
				reason: "embedded message failed validation",
				cause:  err,
			}
		}
	}

	if v, ok := interface{}(m.GetTotalInclVat()).(interface{ Validate() error }); ok {
		if err := v.Validate(); err != nil {
			return MlResponseValidationError{
				field:  "TotalInclVat",
				reason: "embedded message failed validation",
				cause:  err,
			}
		}
	}

	if v, ok := interface{}(m.GetTotalExclVat()).(interface{ Validate() error }); ok {
		if err := v.Validate(); err != nil {
			return MlResponseValidationError{
				field:  "TotalExclVat",
				reason: "embedded message failed validation",
				cause:  err,
			}
		}
	}

	for idx, item := range m.GetSupplierCorporateId() {
		_, _ = idx, item

		if v, ok := interface{}(item).(interface{ Validate() error }); ok {
			if err := v.Validate(); err != nil {
				return MlResponseValidationError{
					field:  fmt.Sprintf("SupplierCorporateId[%v]", idx),
					reason: "embedded message failed validation",
					cause:  err,
				}
			}
		}

	}

	if v, ok := interface{}(m.GetSupplierCountryCode()).(interface{ Validate() error }); ok {
		if err := v.Validate(); err != nil {
			return MlResponseValidationError{
				field:  "SupplierCountryCode",
				reason: "embedded message failed validation",
				cause:  err,
			}
		}
	}

	if v, ok := interface{}(m.GetDocumentType()).(interface{ Validate() error }); ok {
		if err := v.Validate(); err != nil {
			return MlResponseValidationError{
				field:  "DocumentType",
				reason: "embedded message failed validation",
				cause:  err,
			}
		}
	}

	if v, ok := interface{}(m.GetPaymentMethod()).(interface{ Validate() error }); ok {
		if err := v.Validate(); err != nil {
			return MlResponseValidationError{
				field:  "PaymentMethod",
				reason: "embedded message failed validation",
				cause:  err,
			}
		}
	}

	if v, ok := interface{}(m.GetCreditCardLastFourDigits()).(interface{ Validate() error }); ok {
		if err := v.Validate(); err != nil {
			return MlResponseValidationError{
				field:  "CreditCardLastFourDigits",
				reason: "embedded message failed validation",
				cause:  err,
			}
		}
	}

	if v, ok := interface{}(m.GetInvoiceNumber()).(interface{ Validate() error }); ok {
		if err := v.Validate(); err != nil {
			return MlResponseValidationError{
				field:  "InvoiceNumber",
				reason: "embedded message failed validation",
				cause:  err,
			}
		}
	}

	switch m.OcrLine.(type) {

	case *MlResponse_OcrIneDk:

		if v, ok := interface{}(m.GetOcrIneDk()).(interface{ Validate() error }); ok {
			if err := v.Validate(); err != nil {
				return MlResponseValidationError{
					field:  "OcrIneDk",
					reason: "embedded message failed validation",
					cause:  err,
				}
			}
		}

	case *MlResponse_OcrLineSe_:

		if v, ok := interface{}(m.GetOcrLineSe()).(interface{ Validate() error }); ok {
			if err := v.Validate(); err != nil {
				return MlResponseValidationError{
					field:  "OcrLineSe",
					reason: "embedded message failed validation",
					cause:  err,
				}
			}
		}

	case *MlResponse_OcrLineNo_:

		if v, ok := interface{}(m.GetOcrLineNo()).(interface{ Validate() error }); ok {
			if err := v.Validate(); err != nil {
				return MlResponseValidationError{
					field:  "OcrLineNo",
					reason: "embedded message failed validation",
					cause:  err,
				}
			}
		}

	case *MlResponse_OcrLineFi_:

		if v, ok := interface{}(m.GetOcrLineFi()).(interface{ Validate() error }); ok {
			if err := v.Validate(); err != nil {
				return MlResponseValidationError{
					field:  "OcrLineFi",
					reason: "embedded message failed validation",
					cause:  err,
				}
			}
		}

	case *MlResponse_OcrLineNl_:

		if v, ok := interface{}(m.GetOcrLineNl()).(interface{ Validate() error }); ok {
			if err := v.Validate(); err != nil {
				return MlResponseValidationError{
					field:  "OcrLineNl",
					reason: "embedded message failed validation",
					cause:  err,
				}
			}
		}

	}

	return nil
}

// MlResponseValidationError is the validation error returned by
// MlResponse.Validate if the designated constraints aren't met.
type MlResponseValidationError struct {
	field  string
	reason string
	cause  error
	key    bool
}

// Field function returns field value.
func (e MlResponseValidationError) Field() string { return e.field }

// Reason function returns reason value.
func (e MlResponseValidationError) Reason() string { return e.reason }

// Cause function returns cause value.
func (e MlResponseValidationError) Cause() error { return e.cause }

// Key function returns key value.
func (e MlResponseValidationError) Key() bool { return e.key }

// ErrorName returns error name.
func (e MlResponseValidationError) ErrorName() string { return "MlResponseValidationError" }

// Error satisfies the builtin error interface
func (e MlResponseValidationError) Error() string {
	cause := ""
	if e.cause != nil {
		cause = fmt.Sprintf(" | caused by: %v", e.cause)
	}

	key := ""
	if e.key {
		key = "key for "
	}

	return fmt.Sprintf(
		"invalid %sMlResponse.%s: %s%s",
		key,
		e.field,
		e.reason,
		cause)
}

var _ error = MlResponseValidationError{}

var _ interface {
	Field() string
	Reason() string
	Key() bool
	Cause() error
	ErrorName() string
} = MlResponseValidationError{}

// Validate checks the field values on MlResponse_OcrLineDk with the rules
// defined in the proto definition for this message. If any rules are
// violated, an error is returned.
func (m *MlResponse_OcrLineDk) Validate() error {
	if m == nil {
		return nil
	}

	if v, ok := interface{}(m.GetType()).(interface{ Validate() error }); ok {
		if err := v.Validate(); err != nil {
			return MlResponse_OcrLineDkValidationError{
				field:  "Type",
				reason: "embedded message failed validation",
				cause:  err,
			}
		}
	}

	if v, ok := interface{}(m.GetPaymentId()).(interface{ Validate() error }); ok {
		if err := v.Validate(); err != nil {
			return MlResponse_OcrLineDkValidationError{
				field:  "PaymentId",
				reason: "embedded message failed validation",
				cause:  err,
			}
		}
	}

	if v, ok := interface{}(m.GetCreditorId()).(interface{ Validate() error }); ok {
		if err := v.Validate(); err != nil {
			return MlResponse_OcrLineDkValidationError{
				field:  "CreditorId",
				reason: "embedded message failed validation",
				cause:  err,
			}
		}
	}

	return nil
}

// MlResponse_OcrLineDkValidationError is the validation error returned by
// MlResponse_OcrLineDk.Validate if the designated constraints aren't met.
type MlResponse_OcrLineDkValidationError struct {
	field  string
	reason string
	cause  error
	key    bool
}

// Field function returns field value.
func (e MlResponse_OcrLineDkValidationError) Field() string { return e.field }

// Reason function returns reason value.
func (e MlResponse_OcrLineDkValidationError) Reason() string { return e.reason }

// Cause function returns cause value.
func (e MlResponse_OcrLineDkValidationError) Cause() error { return e.cause }

// Key function returns key value.
func (e MlResponse_OcrLineDkValidationError) Key() bool { return e.key }

// ErrorName returns error name.
func (e MlResponse_OcrLineDkValidationError) ErrorName() string {
	return "MlResponse_OcrLineDkValidationError"
}

// Error satisfies the builtin error interface
func (e MlResponse_OcrLineDkValidationError) Error() string {
	cause := ""
	if e.cause != nil {
		cause = fmt.Sprintf(" | caused by: %v", e.cause)
	}

	key := ""
	if e.key {
		key = "key for "
	}

	return fmt.Sprintf(
		"invalid %sMlResponse_OcrLineDk.%s: %s%s",
		key,
		e.field,
		e.reason,
		cause)
}

var _ error = MlResponse_OcrLineDkValidationError{}

var _ interface {
	Field() string
	Reason() string
	Key() bool
	Cause() error
	ErrorName() string
} = MlResponse_OcrLineDkValidationError{}

// Validate checks the field values on MlResponse_OcrLineSe with the rules
// defined in the proto definition for this message. If any rules are
// violated, an error is returned.
func (m *MlResponse_OcrLineSe) Validate() error {
	if m == nil {
		return nil
	}

	if v, ok := interface{}(m.GetPaymentId()).(interface{ Validate() error }); ok {
		if err := v.Validate(); err != nil {
			return MlResponse_OcrLineSeValidationError{
				field:  "PaymentId",
				reason: "embedded message failed validation",
				cause:  err,
			}
		}
	}

	if v, ok := interface{}(m.GetBankgiroCreditorId()).(interface{ Validate() error }); ok {
		if err := v.Validate(); err != nil {
			return MlResponse_OcrLineSeValidationError{
				field:  "BankgiroCreditorId",
				reason: "embedded message failed validation",
				cause:  err,
			}
		}
	}

	if v, ok := interface{}(m.GetPlusgiroCreditorId()).(interface{ Validate() error }); ok {
		if err := v.Validate(); err != nil {
			return MlResponse_OcrLineSeValidationError{
				field:  "PlusgiroCreditorId",
				reason: "embedded message failed validation",
				cause:  err,
			}
		}
	}

	return nil
}

// MlResponse_OcrLineSeValidationError is the validation error returned by
// MlResponse_OcrLineSe.Validate if the designated constraints aren't met.
type MlResponse_OcrLineSeValidationError struct {
	field  string
	reason string
	cause  error
	key    bool
}

// Field function returns field value.
func (e MlResponse_OcrLineSeValidationError) Field() string { return e.field }

// Reason function returns reason value.
func (e MlResponse_OcrLineSeValidationError) Reason() string { return e.reason }

// Cause function returns cause value.
func (e MlResponse_OcrLineSeValidationError) Cause() error { return e.cause }

// Key function returns key value.
func (e MlResponse_OcrLineSeValidationError) Key() bool { return e.key }

// ErrorName returns error name.
func (e MlResponse_OcrLineSeValidationError) ErrorName() string {
	return "MlResponse_OcrLineSeValidationError"
}

// Error satisfies the builtin error interface
func (e MlResponse_OcrLineSeValidationError) Error() string {
	cause := ""
	if e.cause != nil {
		cause = fmt.Sprintf(" | caused by: %v", e.cause)
	}

	key := ""
	if e.key {
		key = "key for "
	}

	return fmt.Sprintf(
		"invalid %sMlResponse_OcrLineSe.%s: %s%s",
		key,
		e.field,
		e.reason,
		cause)
}

var _ error = MlResponse_OcrLineSeValidationError{}

var _ interface {
	Field() string
	Reason() string
	Key() bool
	Cause() error
	ErrorName() string
} = MlResponse_OcrLineSeValidationError{}

// Validate checks the field values on MlResponse_OcrLineNo with the rules
// defined in the proto definition for this message. If any rules are
// violated, an error is returned.
func (m *MlResponse_OcrLineNo) Validate() error {
	if m == nil {
		return nil
	}

	if v, ok := interface{}(m.GetPaymentId()).(interface{ Validate() error }); ok {
		if err := v.Validate(); err != nil {
			return MlResponse_OcrLineNoValidationError{
				field:  "PaymentId",
				reason: "embedded message failed validation",
				cause:  err,
			}
		}
	}

	return nil
}

// MlResponse_OcrLineNoValidationError is the validation error returned by
// MlResponse_OcrLineNo.Validate if the designated constraints aren't met.
type MlResponse_OcrLineNoValidationError struct {
	field  string
	reason string
	cause  error
	key    bool
}

// Field function returns field value.
func (e MlResponse_OcrLineNoValidationError) Field() string { return e.field }

// Reason function returns reason value.
func (e MlResponse_OcrLineNoValidationError) Reason() string { return e.reason }

// Cause function returns cause value.
func (e MlResponse_OcrLineNoValidationError) Cause() error { return e.cause }

// Key function returns key value.
func (e MlResponse_OcrLineNoValidationError) Key() bool { return e.key }

// ErrorName returns error name.
func (e MlResponse_OcrLineNoValidationError) ErrorName() string {
	return "MlResponse_OcrLineNoValidationError"
}

// Error satisfies the builtin error interface
func (e MlResponse_OcrLineNoValidationError) Error() string {
	cause := ""
	if e.cause != nil {
		cause = fmt.Sprintf(" | caused by: %v", e.cause)
	}

	key := ""
	if e.key {
		key = "key for "
	}

	return fmt.Sprintf(
		"invalid %sMlResponse_OcrLineNo.%s: %s%s",
		key,
		e.field,
		e.reason,
		cause)
}

var _ error = MlResponse_OcrLineNoValidationError{}

var _ interface {
	Field() string
	Reason() string
	Key() bool
	Cause() error
	ErrorName() string
} = MlResponse_OcrLineNoValidationError{}

// Validate checks the field values on MlResponse_OcrLineNl with the rules
// defined in the proto definition for this message. If any rules are
// violated, an error is returned.
func (m *MlResponse_OcrLineNl) Validate() error {
	if m == nil {
		return nil
	}

	if v, ok := interface{}(m.GetPaymentId()).(interface{ Validate() error }); ok {
		if err := v.Validate(); err != nil {
			return MlResponse_OcrLineNlValidationError{
				field:  "PaymentId",
				reason: "embedded message failed validation",
				cause:  err,
			}
		}
	}

	return nil
}

// MlResponse_OcrLineNlValidationError is the validation error returned by
// MlResponse_OcrLineNl.Validate if the designated constraints aren't met.
type MlResponse_OcrLineNlValidationError struct {
	field  string
	reason string
	cause  error
	key    bool
}

// Field function returns field value.
func (e MlResponse_OcrLineNlValidationError) Field() string { return e.field }

// Reason function returns reason value.
func (e MlResponse_OcrLineNlValidationError) Reason() string { return e.reason }

// Cause function returns cause value.
func (e MlResponse_OcrLineNlValidationError) Cause() error { return e.cause }

// Key function returns key value.
func (e MlResponse_OcrLineNlValidationError) Key() bool { return e.key }

// ErrorName returns error name.
func (e MlResponse_OcrLineNlValidationError) ErrorName() string {
	return "MlResponse_OcrLineNlValidationError"
}

// Error satisfies the builtin error interface
func (e MlResponse_OcrLineNlValidationError) Error() string {
	cause := ""
	if e.cause != nil {
		cause = fmt.Sprintf(" | caused by: %v", e.cause)
	}

	key := ""
	if e.key {
		key = "key for "
	}

	return fmt.Sprintf(
		"invalid %sMlResponse_OcrLineNl.%s: %s%s",
		key,
		e.field,
		e.reason,
		cause)
}

var _ error = MlResponse_OcrLineNlValidationError{}

var _ interface {
	Field() string
	Reason() string
	Key() bool
	Cause() error
	ErrorName() string
} = MlResponse_OcrLineNlValidationError{}

// Validate checks the field values on MlResponse_OcrLineFi with the rules
// defined in the proto definition for this message. If any rules are
// violated, an error is returned.
func (m *MlResponse_OcrLineFi) Validate() error {
	if m == nil {
		return nil
	}

	if v, ok := interface{}(m.GetPaymentId()).(interface{ Validate() error }); ok {
		if err := v.Validate(); err != nil {
			return MlResponse_OcrLineFiValidationError{
				field:  "PaymentId",
				reason: "embedded message failed validation",
				cause:  err,
			}
		}
	}

	return nil
}

// MlResponse_OcrLineFiValidationError is the validation error returned by
// MlResponse_OcrLineFi.Validate if the designated constraints aren't met.
type MlResponse_OcrLineFiValidationError struct {
	field  string
	reason string
	cause  error
	key    bool
}

// Field function returns field value.
func (e MlResponse_OcrLineFiValidationError) Field() string { return e.field }

// Reason function returns reason value.
func (e MlResponse_OcrLineFiValidationError) Reason() string { return e.reason }

// Cause function returns cause value.
func (e MlResponse_OcrLineFiValidationError) Cause() error { return e.cause }

// Key function returns key value.
func (e MlResponse_OcrLineFiValidationError) Key() bool { return e.key }

// ErrorName returns error name.
func (e MlResponse_OcrLineFiValidationError) ErrorName() string {
	return "MlResponse_OcrLineFiValidationError"
}

// Error satisfies the builtin error interface
func (e MlResponse_OcrLineFiValidationError) Error() string {
	cause := ""
	if e.cause != nil {
		cause = fmt.Sprintf(" | caused by: %v", e.cause)
	}

	key := ""
	if e.key {
		key = "key for "
	}

	return fmt.Sprintf(
		"invalid %sMlResponse_OcrLineFi.%s: %s%s",
		key,
		e.field,
		e.reason,
		cause)
}

var _ error = MlResponse_OcrLineFiValidationError{}

var _ interface {
	Field() string
	Reason() string
	Key() bool
	Cause() error
	ErrorName() string
} = MlResponse_OcrLineFiValidationError{}
