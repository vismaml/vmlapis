from google.protobuf import descriptor_pb2 as _descriptor_pb2
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Optional as _Optional

DESCRIPTOR: _descriptor.FileDescriptor
BIGQUERY_OPTS_FIELD_NUMBER: _ClassVar[int]
bigquery_opts: _descriptor.FieldDescriptor

class BigQueryMessageOptions(_message.Message):
    __slots__ = ("table_name", "use_json_names")
    TABLE_NAME_FIELD_NUMBER: _ClassVar[int]
    USE_JSON_NAMES_FIELD_NUMBER: _ClassVar[int]
    table_name: str
    use_json_names: bool
    def __init__(self, table_name: _Optional[str] = ..., use_json_names: bool = ...) -> None: ...
