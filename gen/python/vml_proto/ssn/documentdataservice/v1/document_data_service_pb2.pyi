from google.api import annotations_pb2 as _annotations_pb2
from ssn.asyncton.v1 import asyncton_pb2 as _asyncton_pb2
from google.protobuf.internal import containers as _containers
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Iterable as _Iterable, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class GetDocumentDataRequest(_message.Message):
    __slots__ = ("feedback_id",)
    FEEDBACK_ID_FIELD_NUMBER: _ClassVar[int]
    feedback_id: str
    def __init__(self, feedback_id: _Optional[str] = ...) -> None: ...

class GetDocumentDataResponse(_message.Message):
    __slots__ = ("feedback_id", "document_bytes", "predictions", "labels")
    FEEDBACK_ID_FIELD_NUMBER: _ClassVar[int]
    DOCUMENT_BYTES_FIELD_NUMBER: _ClassVar[int]
    PREDICTIONS_FIELD_NUMBER: _ClassVar[int]
    LABELS_FIELD_NUMBER: _ClassVar[int]
    feedback_id: str
    document_bytes: bytes
    predictions: _containers.RepeatedCompositeFieldContainer[_asyncton_pb2.Annotation]
    labels: _containers.RepeatedCompositeFieldContainer[_asyncton_pb2.Annotation]
    def __init__(self, feedback_id: _Optional[str] = ..., document_bytes: _Optional[bytes] = ..., predictions: _Optional[_Iterable[_Union[_asyncton_pb2.Annotation, _Mapping]]] = ..., labels: _Optional[_Iterable[_Union[_asyncton_pb2.Annotation, _Mapping]]] = ...) -> None: ...
