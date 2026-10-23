from google.protobuf.internal import containers as _containers
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from collections.abc import Iterable as _Iterable
from typing import ClassVar as _ClassVar, Optional as _Optional

DESCRIPTOR: _descriptor.FileDescriptor

class ExtractRequest(_message.Message):
    __slots__ = ("bq_id", "consumer_name", "sources")
    BQ_ID_FIELD_NUMBER: _ClassVar[int]
    CONSUMER_NAME_FIELD_NUMBER: _ClassVar[int]
    SOURCES_FIELD_NUMBER: _ClassVar[int]
    bq_id: str
    consumer_name: str
    sources: _containers.RepeatedScalarFieldContainer[str]
    def __init__(self, bq_id: _Optional[str] = ..., consumer_name: _Optional[str] = ..., sources: _Optional[_Iterable[str]] = ...) -> None: ...

class ExtractResponse(_message.Message):
    __slots__ = ("workflow_ids",)
    WORKFLOW_IDS_FIELD_NUMBER: _ClassVar[int]
    workflow_ids: _containers.RepeatedScalarFieldContainer[str]
    def __init__(self, workflow_ids: _Optional[_Iterable[str]] = ...) -> None: ...
