from google.api import annotations_pb2 as _annotations_pb2
from protoc_gen_openapiv2.options import annotations_pb2 as _annotations_pb2_1
from validate import validate_pb2 as _validate_pb2
from google.protobuf.internal import containers as _containers
from google.protobuf.internal import enum_type_wrapper as _enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Iterable as _Iterable, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class ConfidenceLevel(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
    __slots__ = ()
    UNKNOWN: _ClassVar[ConfidenceLevel]
    VERY_LOW: _ClassVar[ConfidenceLevel]
    LOW: _ClassVar[ConfidenceLevel]
    MID: _ClassVar[ConfidenceLevel]
    HIGH: _ClassVar[ConfidenceLevel]
    VERY_HIGH: _ClassVar[ConfidenceLevel]
UNKNOWN: ConfidenceLevel
VERY_LOW: ConfidenceLevel
LOW: ConfidenceLevel
MID: ConfidenceLevel
HIGH: ConfidenceLevel
VERY_HIGH: ConfidenceLevel

class ProductTypeSuggestOptions(_message.Message):
    __slots__ = ("min_confidence",)
    MIN_CONFIDENCE_FIELD_NUMBER: _ClassVar[int]
    min_confidence: ConfidenceLevel
    def __init__(self, min_confidence: _Optional[_Union[ConfidenceLevel, str]] = ...) -> None: ...

class ProductTypeBatchSuggestRequest(_message.Message):
    __slots__ = ("texts", "options")
    TEXTS_FIELD_NUMBER: _ClassVar[int]
    OPTIONS_FIELD_NUMBER: _ClassVar[int]
    texts: _containers.RepeatedScalarFieldContainer[str]
    options: ProductTypeSuggestOptions
    def __init__(self, texts: _Optional[_Iterable[str]] = ..., options: _Optional[_Union[ProductTypeSuggestOptions, _Mapping]] = ...) -> None: ...

class ProductTypeBatchSuggestResponse(_message.Message):
    __slots__ = ("suggestions",)
    SUGGESTIONS_FIELD_NUMBER: _ClassVar[int]
    suggestions: _containers.RepeatedCompositeFieldContainer[ProductTypeSuggestion]
    def __init__(self, suggestions: _Optional[_Iterable[_Union[ProductTypeSuggestion, _Mapping]]] = ...) -> None: ...

class ProductTypeSuggestion(_message.Message):
    __slots__ = ("candidates",)
    CANDIDATES_FIELD_NUMBER: _ClassVar[int]
    candidates: _containers.RepeatedCompositeFieldContainer[ProductTypeCandidate]
    def __init__(self, candidates: _Optional[_Iterable[_Union[ProductTypeCandidate, _Mapping]]] = ...) -> None: ...

class ProductTypeCandidate(_message.Message):
    __slots__ = ("label", "confidence", "confidence_level")
    LABEL_FIELD_NUMBER: _ClassVar[int]
    CONFIDENCE_FIELD_NUMBER: _ClassVar[int]
    CONFIDENCE_LEVEL_FIELD_NUMBER: _ClassVar[int]
    label: str
    confidence: float
    confidence_level: ConfidenceLevel
    def __init__(self, label: _Optional[str] = ..., confidence: _Optional[float] = ..., confidence_level: _Optional[_Union[ConfidenceLevel, str]] = ...) -> None: ...
