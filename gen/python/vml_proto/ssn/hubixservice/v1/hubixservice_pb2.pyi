import datetime

from google.protobuf import empty_pb2 as _empty_pb2
from google.protobuf import timestamp_pb2 as _timestamp_pb2
from ssn.type import candidate_pb2 as _candidate_pb2
from google.protobuf.internal import containers as _containers
from google.protobuf.internal import enum_type_wrapper as _enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from collections.abc import Iterable as _Iterable, Mapping as _Mapping
from typing import ClassVar as _ClassVar, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class StartVerificationRequest(_message.Message):
    __slots__ = ("subject", "idempotency_key", "document", "country_hint")
    SUBJECT_FIELD_NUMBER: _ClassVar[int]
    IDEMPOTENCY_KEY_FIELD_NUMBER: _ClassVar[int]
    DOCUMENT_FIELD_NUMBER: _ClassVar[int]
    COUNTRY_HINT_FIELD_NUMBER: _ClassVar[int]
    subject: str
    idempotency_key: str
    document: bytes
    country_hint: str
    def __init__(self, subject: _Optional[str] = ..., idempotency_key: _Optional[str] = ..., document: _Optional[bytes] = ..., country_hint: _Optional[str] = ...) -> None: ...

class GetVerificationRequest(_message.Message):
    __slots__ = ("verification_id",)
    VERIFICATION_ID_FIELD_NUMBER: _ClassVar[int]
    verification_id: str
    def __init__(self, verification_id: _Optional[str] = ...) -> None: ...

class DeleteVerificationsRequest(_message.Message):
    __slots__ = ("subject",)
    SUBJECT_FIELD_NUMBER: _ClassVar[int]
    subject: str
    def __init__(self, subject: _Optional[str] = ...) -> None: ...

class Verification(_message.Message):
    __slots__ = ("verification_id", "subject", "idempotency_key", "state", "reason_code", "submitted_at", "completed_at", "fields")
    class State(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
        __slots__ = ()
        STATE_UNSPECIFIED: _ClassVar[Verification.State]
        STATE_ACCEPTED: _ClassVar[Verification.State]
        STATE_SUBMITTED: _ClassVar[Verification.State]
        STATE_VERIFIED: _ClassVar[Verification.State]
        STATE_SKIPPED: _ClassVar[Verification.State]
        STATE_EXPIRED: _ClassVar[Verification.State]
        STATE_FAILED: _ClassVar[Verification.State]
    STATE_UNSPECIFIED: Verification.State
    STATE_ACCEPTED: Verification.State
    STATE_SUBMITTED: Verification.State
    STATE_VERIFIED: Verification.State
    STATE_SKIPPED: Verification.State
    STATE_EXPIRED: Verification.State
    STATE_FAILED: Verification.State
    VERIFICATION_ID_FIELD_NUMBER: _ClassVar[int]
    SUBJECT_FIELD_NUMBER: _ClassVar[int]
    IDEMPOTENCY_KEY_FIELD_NUMBER: _ClassVar[int]
    STATE_FIELD_NUMBER: _ClassVar[int]
    REASON_CODE_FIELD_NUMBER: _ClassVar[int]
    SUBMITTED_AT_FIELD_NUMBER: _ClassVar[int]
    COMPLETED_AT_FIELD_NUMBER: _ClassVar[int]
    FIELDS_FIELD_NUMBER: _ClassVar[int]
    verification_id: str
    subject: str
    idempotency_key: str
    state: Verification.State
    reason_code: str
    submitted_at: _timestamp_pb2.Timestamp
    completed_at: _timestamp_pb2.Timestamp
    fields: _containers.RepeatedCompositeFieldContainer[VerifiedField]
    def __init__(self, verification_id: _Optional[str] = ..., subject: _Optional[str] = ..., idempotency_key: _Optional[str] = ..., state: _Optional[_Union[Verification.State, str]] = ..., reason_code: _Optional[str] = ..., submitted_at: _Optional[_Union[datetime.datetime, _timestamp_pb2.Timestamp, _Mapping]] = ..., completed_at: _Optional[_Union[datetime.datetime, _timestamp_pb2.Timestamp, _Mapping]] = ..., fields: _Optional[_Iterable[_Union[VerifiedField, _Mapping]]] = ...) -> None: ...

class VerifiedField(_message.Message):
    __slots__ = ("name", "candidate")
    NAME_FIELD_NUMBER: _ClassVar[int]
    CANDIDATE_FIELD_NUMBER: _ClassVar[int]
    name: str
    candidate: _candidate_pb2.Candidate
    def __init__(self, name: _Optional[str] = ..., candidate: _Optional[_Union[_candidate_pb2.Candidate, _Mapping]] = ...) -> None: ...
