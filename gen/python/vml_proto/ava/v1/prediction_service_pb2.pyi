from google.api import annotations_pb2 as _annotations_pb2
from google.protobuf import wrappers_pb2 as _wrappers_pb2
from protoc_gen_openapiv2.options import annotations_pb2 as _annotations_pb2_1
from validate import validate_pb2 as _validate_pb2
from google.protobuf.internal import containers as _containers
from google.protobuf.internal import enum_type_wrapper as _enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from collections.abc import Iterable as _Iterable, Mapping as _Mapping
from typing import ClassVar as _ClassVar, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class Model(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
    __slots__ = ()
    QWEN: _ClassVar[Model]
    CLEF: _ClassVar[Model]
    BERT: _ClassVar[Model]
    RERANKER: _ClassVar[Model]
QWEN: Model
CLEF: Model
BERT: Model
RERANKER: Model

class DecideRequest(_message.Message):
    __slots__ = ("dataset_name", "output_name", "fields", "model")
    class FieldsEntry(_message.Message):
        __slots__ = ("key", "value")
        KEY_FIELD_NUMBER: _ClassVar[int]
        VALUE_FIELD_NUMBER: _ClassVar[int]
        key: str
        value: str
        def __init__(self, key: _Optional[str] = ..., value: _Optional[str] = ...) -> None: ...
    DATASET_NAME_FIELD_NUMBER: _ClassVar[int]
    OUTPUT_NAME_FIELD_NUMBER: _ClassVar[int]
    FIELDS_FIELD_NUMBER: _ClassVar[int]
    MODEL_FIELD_NUMBER: _ClassVar[int]
    dataset_name: str
    output_name: str
    fields: _containers.ScalarMap[str, str]
    model: Model
    def __init__(self, dataset_name: _Optional[str] = ..., output_name: _Optional[str] = ..., fields: _Optional[_Mapping[str, str]] = ..., model: _Optional[_Union[Model, str]] = ...) -> None: ...

class DecideResponse(_message.Message):
    __slots__ = ("value", "escalated", "steps", "procedure_version")
    VALUE_FIELD_NUMBER: _ClassVar[int]
    ESCALATED_FIELD_NUMBER: _ClassVar[int]
    STEPS_FIELD_NUMBER: _ClassVar[int]
    PROCEDURE_VERSION_FIELD_NUMBER: _ClassVar[int]
    value: str
    escalated: bool
    steps: _containers.RepeatedCompositeFieldContainer[WalkedStep]
    procedure_version: int
    def __init__(self, value: _Optional[str] = ..., escalated: _Optional[bool] = ..., steps: _Optional[_Iterable[_Union[WalkedStep, _Mapping]]] = ..., procedure_version: _Optional[int] = ...) -> None: ...

class WalkedStep(_message.Message):
    __slots__ = ("question", "answer", "confidence")
    QUESTION_FIELD_NUMBER: _ClassVar[int]
    ANSWER_FIELD_NUMBER: _ClassVar[int]
    CONFIDENCE_FIELD_NUMBER: _ClassVar[int]
    question: str
    answer: str
    confidence: Confidence
    def __init__(self, question: _Optional[str] = ..., answer: _Optional[str] = ..., confidence: _Optional[_Union[Confidence, _Mapping]] = ...) -> None: ...

class Confidence(_message.Message):
    __slots__ = ("level", "value")
    class Level(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
        __slots__ = ()
        UNKNOWN: _ClassVar[Confidence.Level]
        VERY_LOW: _ClassVar[Confidence.Level]
        LOW: _ClassVar[Confidence.Level]
        MID: _ClassVar[Confidence.Level]
        HIGH: _ClassVar[Confidence.Level]
        VERY_HIGH: _ClassVar[Confidence.Level]
    UNKNOWN: Confidence.Level
    VERY_LOW: Confidence.Level
    LOW: Confidence.Level
    MID: Confidence.Level
    HIGH: Confidence.Level
    VERY_HIGH: Confidence.Level
    LEVEL_FIELD_NUMBER: _ClassVar[int]
    VALUE_FIELD_NUMBER: _ClassVar[int]
    level: Confidence.Level
    value: _wrappers_pb2.FloatValue
    def __init__(self, level: _Optional[_Union[Confidence.Level, str]] = ..., value: _Optional[_Union[_wrappers_pb2.FloatValue, _Mapping]] = ...) -> None: ...
