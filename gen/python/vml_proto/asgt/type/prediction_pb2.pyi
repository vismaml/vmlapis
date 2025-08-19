from gen_bq_schema import bq_field_pb2 as _bq_field_pb2
from google.protobuf import wrappers_pb2 as _wrappers_pb2
from google.protobuf.internal import containers as _containers
from google.protobuf.internal import enum_type_wrapper as _enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Iterable as _Iterable, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

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

class Prediction(_message.Message):
    __slots__ = ("targets",)
    class Target(_message.Message):
        __slots__ = ("name", "candidates")
        class Candidate(_message.Message):
            __slots__ = ("value", "confidence")
            VALUE_FIELD_NUMBER: _ClassVar[int]
            CONFIDENCE_FIELD_NUMBER: _ClassVar[int]
            value: str
            confidence: Confidence
            def __init__(self, value: _Optional[str] = ..., confidence: _Optional[_Union[Confidence, _Mapping]] = ...) -> None: ...
        NAME_FIELD_NUMBER: _ClassVar[int]
        CANDIDATES_FIELD_NUMBER: _ClassVar[int]
        name: str
        candidates: _containers.RepeatedCompositeFieldContainer[Prediction.Target.Candidate]
        def __init__(self, name: _Optional[str] = ..., candidates: _Optional[_Iterable[_Union[Prediction.Target.Candidate, _Mapping]]] = ...) -> None: ...
    TARGETS_FIELD_NUMBER: _ClassVar[int]
    targets: _containers.RepeatedCompositeFieldContainer[Prediction.Target]
    def __init__(self, targets: _Optional[_Iterable[_Union[Prediction.Target, _Mapping]]] = ...) -> None: ...
