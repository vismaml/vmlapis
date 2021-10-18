// Code generated by protoc-gen-validate. DO NOT EDIT.
// source: asgt/v2alpha/type/trainings_response.proto

package asgttype

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

	"google.golang.org/protobuf/types/known/anypb"
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
	_ = anypb.Any{}
)

// Validate checks the field values on Training with the rules defined in the
// proto definition for this message. If any rules are violated, an error is returned.
func (m *Training) Validate() error {
	if m == nil {
		return nil
	}

	if v, ok := interface{}(m.GetCreatedAt()).(interface{ Validate() error }); ok {
		if err := v.Validate(); err != nil {
			return TrainingValidationError{
				field:  "CreatedAt",
				reason: "embedded message failed validation",
				cause:  err,
			}
		}
	}

	// no validation rules for Status

	// no validation rules for TrainingStatus

	// no validation rules for TrainngStatusMessage

	if v, ok := interface{}(m.GetFinishTime()).(interface{ Validate() error }); ok {
		if err := v.Validate(); err != nil {
			return TrainingValidationError{
				field:  "FinishTime",
				reason: "embedded message failed validation",
				cause:  err,
			}
		}
	}

	return nil
}

// TrainingValidationError is the validation error returned by
// Training.Validate if the designated constraints aren't met.
type TrainingValidationError struct {
	field  string
	reason string
	cause  error
	key    bool
}

// Field function returns field value.
func (e TrainingValidationError) Field() string { return e.field }

// Reason function returns reason value.
func (e TrainingValidationError) Reason() string { return e.reason }

// Cause function returns cause value.
func (e TrainingValidationError) Cause() error { return e.cause }

// Key function returns key value.
func (e TrainingValidationError) Key() bool { return e.key }

// ErrorName returns error name.
func (e TrainingValidationError) ErrorName() string { return "TrainingValidationError" }

// Error satisfies the builtin error interface
func (e TrainingValidationError) Error() string {
	cause := ""
	if e.cause != nil {
		cause = fmt.Sprintf(" | caused by: %v", e.cause)
	}

	key := ""
	if e.key {
		key = "key for "
	}

	return fmt.Sprintf(
		"invalid %sTraining.%s: %s%s",
		key,
		e.field,
		e.reason,
		cause)
}

var _ error = TrainingValidationError{}

var _ interface {
	Field() string
	Reason() string
	Key() bool
	Cause() error
	ErrorName() string
} = TrainingValidationError{}

// Validate checks the field values on TrainingsResponse with the rules defined
// in the proto definition for this message. If any rules are violated, an
// error is returned.
func (m *TrainingsResponse) Validate() error {
	if m == nil {
		return nil
	}

	for idx, item := range m.GetTrainings() {
		_, _ = idx, item

		if v, ok := interface{}(item).(interface{ Validate() error }); ok {
			if err := v.Validate(); err != nil {
				return TrainingsResponseValidationError{
					field:  fmt.Sprintf("Trainings[%v]", idx),
					reason: "embedded message failed validation",
					cause:  err,
				}
			}
		}

	}

	return nil
}

// TrainingsResponseValidationError is the validation error returned by
// TrainingsResponse.Validate if the designated constraints aren't met.
type TrainingsResponseValidationError struct {
	field  string
	reason string
	cause  error
	key    bool
}

// Field function returns field value.
func (e TrainingsResponseValidationError) Field() string { return e.field }

// Reason function returns reason value.
func (e TrainingsResponseValidationError) Reason() string { return e.reason }

// Cause function returns cause value.
func (e TrainingsResponseValidationError) Cause() error { return e.cause }

// Key function returns key value.
func (e TrainingsResponseValidationError) Key() bool { return e.key }

// ErrorName returns error name.
func (e TrainingsResponseValidationError) ErrorName() string {
	return "TrainingsResponseValidationError"
}

// Error satisfies the builtin error interface
func (e TrainingsResponseValidationError) Error() string {
	cause := ""
	if e.cause != nil {
		cause = fmt.Sprintf(" | caused by: %v", e.cause)
	}

	key := ""
	if e.key {
		key = "key for "
	}

	return fmt.Sprintf(
		"invalid %sTrainingsResponse.%s: %s%s",
		key,
		e.field,
		e.reason,
		cause)
}

var _ error = TrainingsResponseValidationError{}

var _ interface {
	Field() string
	Reason() string
	Key() bool
	Cause() error
	ErrorName() string
} = TrainingsResponseValidationError{}
