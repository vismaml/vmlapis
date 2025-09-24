from ssn.type import candidate_pb2 as _candidate_pb2
from ssn.type import text_annotation_pb2 as _text_annotation_pb2
from google.protobuf.internal import containers as _containers
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Iterable as _Iterable, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class LinesRequest(_message.Message):
    __slots__ = ("text_annotation", "image")
    TEXT_ANNOTATION_FIELD_NUMBER: _ClassVar[int]
    IMAGE_FIELD_NUMBER: _ClassVar[int]
    text_annotation: _text_annotation_pb2.TextAnnotation
    image: bytes
    def __init__(self, text_annotation: _Optional[_Union[_text_annotation_pb2.TextAnnotation, _Mapping]] = ..., image: _Optional[bytes] = ...) -> None: ...

class LinesResponse(_message.Message):
    __slots__ = ("purchase_lines",)
    PURCHASE_LINES_FIELD_NUMBER: _ClassVar[int]
    purchase_lines: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.PurchaseLineCandidate]
    def __init__(self, purchase_lines: _Optional[_Iterable[_Union[_candidate_pb2.PurchaseLineCandidate, _Mapping]]] = ...) -> None: ...
