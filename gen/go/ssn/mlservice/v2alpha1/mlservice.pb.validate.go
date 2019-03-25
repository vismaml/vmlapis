// Code generated by protoc-gen-validate. DO NOT EDIT.
// source: ssn/mlservice/v2alpha1/mlservice.proto

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

// Validate checks the field values on MlRequest with the rules defined in the
// proto definition for this message. If any rules are violated, an error is returned.
func (m *MlRequest) Validate() error {
	if m == nil {
		return nil
	}

	if v, ok := interface{}(m.GetDocumentAnnotatorRequest()).(interface{ Validate() error }); ok {
		if err := v.Validate(); err != nil {
			return MlRequestValidationError{
				field:  "DocumentAnnotatorRequest",
				reason: "embedded message failed validation",
				cause:  err,
			}
		}
	}

	if v, ok := interface{}(m.GetTextAnnotation()).(interface{ Validate() error }); ok {
		if err := v.Validate(); err != nil {
			return MlRequestValidationError{
				field:  "TextAnnotation",
				reason: "embedded message failed validation",
				cause:  err,
			}
		}
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

	if v, ok := interface{}(m.GetDocumentAnnotatorResponse()).(interface{ Validate() error }); ok {
		if err := v.Validate(); err != nil {
			return MlResponseValidationError{
				field:  "DocumentAnnotatorResponse",
				reason: "embedded message failed validation",
				cause:  err,
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
