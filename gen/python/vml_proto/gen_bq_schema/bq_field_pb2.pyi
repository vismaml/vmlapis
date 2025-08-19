from google.protobuf import descriptor_pb2 as _descriptor_pb2
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Optional as _Optional

DESCRIPTOR: _descriptor.FileDescriptor
BIGQUERY_FIELD_NUMBER: _ClassVar[int]
bigquery: _descriptor.FieldDescriptor

class BigQueryFieldOptions(_message.Message):
    __slots__ = ("require", "type_override", "ignore", "description", "name")
    REQUIRE_FIELD_NUMBER: _ClassVar[int]
    TYPE_OVERRIDE_FIELD_NUMBER: _ClassVar[int]
    IGNORE_FIELD_NUMBER: _ClassVar[int]
    DESCRIPTION_FIELD_NUMBER: _ClassVar[int]
    NAME_FIELD_NUMBER: _ClassVar[int]
    require: bool
    type_override: str
    ignore: bool
    description: str
    name: str
    def __init__(self, require: bool = ..., type_override: _Optional[str] = ..., ignore: bool = ..., description: _Optional[str] = ..., name: _Optional[str] = ...) -> None: ...
