// Code generated by protoc-gen-validate. DO NOT EDIT.
// source: asgt/data/v1/data_service.proto

package data

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

// define the regex for a UUID once up-front
var _data_service_uuidPattern = regexp.MustCompile("^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$")

// Validate checks the field values on CreateRequest with the rules defined in
// the proto definition for this message. If any rules are violated, an error
// is returned.
func (m *CreateRequest) Validate() error {
	if m == nil {
		return nil
	}

	// no validation rules for Name

	// no validation rules for Type

	for idx, item := range m.GetTargets() {
		_, _ = idx, item

		if len(item) > 256 {
			return CreateRequestValidationError{
				field:  fmt.Sprintf("Targets[%v]", idx),
				reason: "value length must be at most 256 bytes",
			}
		}

		if !_CreateRequest_Targets_Pattern.MatchString(item) {
			return CreateRequestValidationError{
				field:  fmt.Sprintf("Targets[%v]", idx),
				reason: "value does not match regex pattern \"^[0-9A-Za-z]+$\"",
			}
		}

	}

	for idx, item := range m.GetSamples() {
		_, _ = idx, item

		if v, ok := interface{}(item).(interface{ Validate() error }); ok {
			if err := v.Validate(); err != nil {
				return CreateRequestValidationError{
					field:  fmt.Sprintf("Samples[%v]", idx),
					reason: "embedded message failed validation",
					cause:  err,
				}
			}
		}

	}

	if v, ok := interface{}(m.GetRetentionPolicy()).(interface{ Validate() error }); ok {
		if err := v.Validate(); err != nil {
			return CreateRequestValidationError{
				field:  "RetentionPolicy",
				reason: "embedded message failed validation",
				cause:  err,
			}
		}
	}

	return nil
}

// CreateRequestValidationError is the validation error returned by
// CreateRequest.Validate if the designated constraints aren't met.
type CreateRequestValidationError struct {
	field  string
	reason string
	cause  error
	key    bool
}

// Field function returns field value.
func (e CreateRequestValidationError) Field() string { return e.field }

// Reason function returns reason value.
func (e CreateRequestValidationError) Reason() string { return e.reason }

// Cause function returns cause value.
func (e CreateRequestValidationError) Cause() error { return e.cause }

// Key function returns key value.
func (e CreateRequestValidationError) Key() bool { return e.key }

// ErrorName returns error name.
func (e CreateRequestValidationError) ErrorName() string { return "CreateRequestValidationError" }

// Error satisfies the builtin error interface
func (e CreateRequestValidationError) Error() string {
	cause := ""
	if e.cause != nil {
		cause = fmt.Sprintf(" | caused by: %v", e.cause)
	}

	key := ""
	if e.key {
		key = "key for "
	}

	return fmt.Sprintf(
		"invalid %sCreateRequest.%s: %s%s",
		key,
		e.field,
		e.reason,
		cause)
}

var _ error = CreateRequestValidationError{}

var _ interface {
	Field() string
	Reason() string
	Key() bool
	Cause() error
	ErrorName() string
} = CreateRequestValidationError{}

var _CreateRequest_Targets_Pattern = regexp.MustCompile("^[0-9A-Za-z]+$")

// Validate checks the field values on AppendDataRequest with the rules defined
// in the proto definition for this message. If any rules are violated, an
// error is returned.
func (m *AppendDataRequest) Validate() error {
	if m == nil {
		return nil
	}

	// no validation rules for Name

	// no validation rules for Type

	for idx, item := range m.GetSamples() {
		_, _ = idx, item

		if v, ok := interface{}(item).(interface{ Validate() error }); ok {
			if err := v.Validate(); err != nil {
				return AppendDataRequestValidationError{
					field:  fmt.Sprintf("Samples[%v]", idx),
					reason: "embedded message failed validation",
					cause:  err,
				}
			}
		}

	}

	return nil
}

// AppendDataRequestValidationError is the validation error returned by
// AppendDataRequest.Validate if the designated constraints aren't met.
type AppendDataRequestValidationError struct {
	field  string
	reason string
	cause  error
	key    bool
}

// Field function returns field value.
func (e AppendDataRequestValidationError) Field() string { return e.field }

// Reason function returns reason value.
func (e AppendDataRequestValidationError) Reason() string { return e.reason }

// Cause function returns cause value.
func (e AppendDataRequestValidationError) Cause() error { return e.cause }

// Key function returns key value.
func (e AppendDataRequestValidationError) Key() bool { return e.key }

// ErrorName returns error name.
func (e AppendDataRequestValidationError) ErrorName() string {
	return "AppendDataRequestValidationError"
}

// Error satisfies the builtin error interface
func (e AppendDataRequestValidationError) Error() string {
	cause := ""
	if e.cause != nil {
		cause = fmt.Sprintf(" | caused by: %v", e.cause)
	}

	key := ""
	if e.key {
		key = "key for "
	}

	return fmt.Sprintf(
		"invalid %sAppendDataRequest.%s: %s%s",
		key,
		e.field,
		e.reason,
		cause)
}

var _ error = AppendDataRequestValidationError{}

var _ interface {
	Field() string
	Reason() string
	Key() bool
	Cause() error
	ErrorName() string
} = AppendDataRequestValidationError{}

// Validate checks the field values on DeleteRequest with the rules defined in
// the proto definition for this message. If any rules are violated, an error
// is returned.
func (m *DeleteRequest) Validate() error {
	if m == nil {
		return nil
	}

	// no validation rules for Type

	switch m.Match.(type) {

	case *DeleteRequest_Name:
		// no validation rules for Name

	case *DeleteRequest_Tag:
		// no validation rules for Tag

	}

	return nil
}

// DeleteRequestValidationError is the validation error returned by
// DeleteRequest.Validate if the designated constraints aren't met.
type DeleteRequestValidationError struct {
	field  string
	reason string
	cause  error
	key    bool
}

// Field function returns field value.
func (e DeleteRequestValidationError) Field() string { return e.field }

// Reason function returns reason value.
func (e DeleteRequestValidationError) Reason() string { return e.reason }

// Cause function returns cause value.
func (e DeleteRequestValidationError) Cause() error { return e.cause }

// Key function returns key value.
func (e DeleteRequestValidationError) Key() bool { return e.key }

// ErrorName returns error name.
func (e DeleteRequestValidationError) ErrorName() string { return "DeleteRequestValidationError" }

// Error satisfies the builtin error interface
func (e DeleteRequestValidationError) Error() string {
	cause := ""
	if e.cause != nil {
		cause = fmt.Sprintf(" | caused by: %v", e.cause)
	}

	key := ""
	if e.key {
		key = "key for "
	}

	return fmt.Sprintf(
		"invalid %sDeleteRequest.%s: %s%s",
		key,
		e.field,
		e.reason,
		cause)
}

var _ error = DeleteRequestValidationError{}

var _ interface {
	Field() string
	Reason() string
	Key() bool
	Cause() error
	ErrorName() string
} = DeleteRequestValidationError{}

// Validate checks the field values on GetInfoRequest with the rules defined in
// the proto definition for this message. If any rules are violated, an error
// is returned.
func (m *GetInfoRequest) Validate() error {
	if m == nil {
		return nil
	}

	// no validation rules for Name

	// no validation rules for Type

	return nil
}

// GetInfoRequestValidationError is the validation error returned by
// GetInfoRequest.Validate if the designated constraints aren't met.
type GetInfoRequestValidationError struct {
	field  string
	reason string
	cause  error
	key    bool
}

// Field function returns field value.
func (e GetInfoRequestValidationError) Field() string { return e.field }

// Reason function returns reason value.
func (e GetInfoRequestValidationError) Reason() string { return e.reason }

// Cause function returns cause value.
func (e GetInfoRequestValidationError) Cause() error { return e.cause }

// Key function returns key value.
func (e GetInfoRequestValidationError) Key() bool { return e.key }

// ErrorName returns error name.
func (e GetInfoRequestValidationError) ErrorName() string { return "GetInfoRequestValidationError" }

// Error satisfies the builtin error interface
func (e GetInfoRequestValidationError) Error() string {
	cause := ""
	if e.cause != nil {
		cause = fmt.Sprintf(" | caused by: %v", e.cause)
	}

	key := ""
	if e.key {
		key = "key for "
	}

	return fmt.Sprintf(
		"invalid %sGetInfoRequest.%s: %s%s",
		key,
		e.field,
		e.reason,
		cause)
}

var _ error = GetInfoRequestValidationError{}

var _ interface {
	Field() string
	Reason() string
	Key() bool
	Cause() error
	ErrorName() string
} = GetInfoRequestValidationError{}

// Validate checks the field values on UpdateDatasetRequest with the rules
// defined in the proto definition for this message. If any rules are
// violated, an error is returned.
func (m *UpdateDatasetRequest) Validate() error {
	if m == nil {
		return nil
	}

	// no validation rules for Name

	// no validation rules for Type

	if v, ok := interface{}(m.GetRetentionPolicy()).(interface{ Validate() error }); ok {
		if err := v.Validate(); err != nil {
			return UpdateDatasetRequestValidationError{
				field:  "RetentionPolicy",
				reason: "embedded message failed validation",
				cause:  err,
			}
		}
	}

	return nil
}

// UpdateDatasetRequestValidationError is the validation error returned by
// UpdateDatasetRequest.Validate if the designated constraints aren't met.
type UpdateDatasetRequestValidationError struct {
	field  string
	reason string
	cause  error
	key    bool
}

// Field function returns field value.
func (e UpdateDatasetRequestValidationError) Field() string { return e.field }

// Reason function returns reason value.
func (e UpdateDatasetRequestValidationError) Reason() string { return e.reason }

// Cause function returns cause value.
func (e UpdateDatasetRequestValidationError) Cause() error { return e.cause }

// Key function returns key value.
func (e UpdateDatasetRequestValidationError) Key() bool { return e.key }

// ErrorName returns error name.
func (e UpdateDatasetRequestValidationError) ErrorName() string {
	return "UpdateDatasetRequestValidationError"
}

// Error satisfies the builtin error interface
func (e UpdateDatasetRequestValidationError) Error() string {
	cause := ""
	if e.cause != nil {
		cause = fmt.Sprintf(" | caused by: %v", e.cause)
	}

	key := ""
	if e.key {
		key = "key for "
	}

	return fmt.Sprintf(
		"invalid %sUpdateDatasetRequest.%s: %s%s",
		key,
		e.field,
		e.reason,
		cause)
}

var _ error = UpdateDatasetRequestValidationError{}

var _ interface {
	Field() string
	Reason() string
	Key() bool
	Cause() error
	ErrorName() string
} = UpdateDatasetRequestValidationError{}

// Validate checks the field values on GetInfoResponse with the rules defined
// in the proto definition for this message. If any rules are violated, an
// error is returned.
func (m *GetInfoResponse) Validate() error {
	if m == nil {
		return nil
	}

	if v, ok := interface{}(m.GetDataset()).(interface{ Validate() error }); ok {
		if err := v.Validate(); err != nil {
			return GetInfoResponseValidationError{
				field:  "Dataset",
				reason: "embedded message failed validation",
				cause:  err,
			}
		}
	}

	if v, ok := interface{}(m.GetModel()).(interface{ Validate() error }); ok {
		if err := v.Validate(); err != nil {
			return GetInfoResponseValidationError{
				field:  "Model",
				reason: "embedded message failed validation",
				cause:  err,
			}
		}
	}

	return nil
}

// GetInfoResponseValidationError is the validation error returned by
// GetInfoResponse.Validate if the designated constraints aren't met.
type GetInfoResponseValidationError struct {
	field  string
	reason string
	cause  error
	key    bool
}

// Field function returns field value.
func (e GetInfoResponseValidationError) Field() string { return e.field }

// Reason function returns reason value.
func (e GetInfoResponseValidationError) Reason() string { return e.reason }

// Cause function returns cause value.
func (e GetInfoResponseValidationError) Cause() error { return e.cause }

// Key function returns key value.
func (e GetInfoResponseValidationError) Key() bool { return e.key }

// ErrorName returns error name.
func (e GetInfoResponseValidationError) ErrorName() string { return "GetInfoResponseValidationError" }

// Error satisfies the builtin error interface
func (e GetInfoResponseValidationError) Error() string {
	cause := ""
	if e.cause != nil {
		cause = fmt.Sprintf(" | caused by: %v", e.cause)
	}

	key := ""
	if e.key {
		key = "key for "
	}

	return fmt.Sprintf(
		"invalid %sGetInfoResponse.%s: %s%s",
		key,
		e.field,
		e.reason,
		cause)
}

var _ error = GetInfoResponseValidationError{}

var _ interface {
	Field() string
	Reason() string
	Key() bool
	Cause() error
	ErrorName() string
} = GetInfoResponseValidationError{}

// Validate checks the field values on RegisterQueryStatsRequest with the rules
// defined in the proto definition for this message. If any rules are
// violated, an error is returned.
func (m *RegisterQueryStatsRequest) Validate() error {
	if m == nil {
		return nil
	}

	// no validation rules for Dataset

	// no validation rules for ModelType

	// no validation rules for BatchSize

	return nil
}

// RegisterQueryStatsRequestValidationError is the validation error returned by
// RegisterQueryStatsRequest.Validate if the designated constraints aren't met.
type RegisterQueryStatsRequestValidationError struct {
	field  string
	reason string
	cause  error
	key    bool
}

// Field function returns field value.
func (e RegisterQueryStatsRequestValidationError) Field() string { return e.field }

// Reason function returns reason value.
func (e RegisterQueryStatsRequestValidationError) Reason() string { return e.reason }

// Cause function returns cause value.
func (e RegisterQueryStatsRequestValidationError) Cause() error { return e.cause }

// Key function returns key value.
func (e RegisterQueryStatsRequestValidationError) Key() bool { return e.key }

// ErrorName returns error name.
func (e RegisterQueryStatsRequestValidationError) ErrorName() string {
	return "RegisterQueryStatsRequestValidationError"
}

// Error satisfies the builtin error interface
func (e RegisterQueryStatsRequestValidationError) Error() string {
	cause := ""
	if e.cause != nil {
		cause = fmt.Sprintf(" | caused by: %v", e.cause)
	}

	key := ""
	if e.key {
		key = "key for "
	}

	return fmt.Sprintf(
		"invalid %sRegisterQueryStatsRequest.%s: %s%s",
		key,
		e.field,
		e.reason,
		cause)
}

var _ error = RegisterQueryStatsRequestValidationError{}

var _ interface {
	Field() string
	Reason() string
	Key() bool
	Cause() error
	ErrorName() string
} = RegisterQueryStatsRequestValidationError{}
