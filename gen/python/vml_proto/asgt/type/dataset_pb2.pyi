from asgt.type import retention_policy_pb2 as _retention_policy_pb2
from google.protobuf import timestamp_pb2 as _timestamp_pb2
from google.protobuf.internal import containers as _containers
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Iterable as _Iterable, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class Dataset(_message.Message):
    __slots__ = ("consumer", "name", "type", "tags", "targets", "retention_policy", "created_at", "updated_at", "size", "truncated_at")
    CONSUMER_FIELD_NUMBER: _ClassVar[int]
    NAME_FIELD_NUMBER: _ClassVar[int]
    TYPE_FIELD_NUMBER: _ClassVar[int]
    TAGS_FIELD_NUMBER: _ClassVar[int]
    TARGETS_FIELD_NUMBER: _ClassVar[int]
    RETENTION_POLICY_FIELD_NUMBER: _ClassVar[int]
    CREATED_AT_FIELD_NUMBER: _ClassVar[int]
    UPDATED_AT_FIELD_NUMBER: _ClassVar[int]
    SIZE_FIELD_NUMBER: _ClassVar[int]
    TRUNCATED_AT_FIELD_NUMBER: _ClassVar[int]
    consumer: str
    name: str
    type: str
    tags: _containers.RepeatedScalarFieldContainer[str]
    targets: _containers.RepeatedScalarFieldContainer[str]
    retention_policy: _retention_policy_pb2.RetentionPolicy
    created_at: _timestamp_pb2.Timestamp
    updated_at: _timestamp_pb2.Timestamp
    size: int
    truncated_at: _timestamp_pb2.Timestamp
    def __init__(self, consumer: _Optional[str] = ..., name: _Optional[str] = ..., type: _Optional[str] = ..., tags: _Optional[_Iterable[str]] = ..., targets: _Optional[_Iterable[str]] = ..., retention_policy: _Optional[_Union[_retention_policy_pb2.RetentionPolicy, _Mapping]] = ..., created_at: _Optional[_Union[_timestamp_pb2.Timestamp, _Mapping]] = ..., updated_at: _Optional[_Union[_timestamp_pb2.Timestamp, _Mapping]] = ..., size: _Optional[int] = ..., truncated_at: _Optional[_Union[_timestamp_pb2.Timestamp, _Mapping]] = ...) -> None: ...
