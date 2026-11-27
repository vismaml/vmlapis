import datetime

from google.api import annotations_pb2 as _annotations_pb2
from google.protobuf import timestamp_pb2 as _timestamp_pb2
from google.protobuf import wrappers_pb2 as _wrappers_pb2
from protoc_gen_openapiv2.options import annotations_pb2 as _annotations_pb2_1
from validate import validate_pb2 as _validate_pb2
from google.protobuf.internal import containers as _containers
from google.protobuf.internal import enum_type_wrapper as _enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from collections.abc import Mapping as _Mapping
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
    __slots__ = ("value", "escalated", "procedure_version", "decision_ref", "escalation", "decided_at", "path")
    VALUE_FIELD_NUMBER: _ClassVar[int]
    ESCALATED_FIELD_NUMBER: _ClassVar[int]
    PROCEDURE_VERSION_FIELD_NUMBER: _ClassVar[int]
    DECISION_REF_FIELD_NUMBER: _ClassVar[int]
    ESCALATION_FIELD_NUMBER: _ClassVar[int]
    DECIDED_AT_FIELD_NUMBER: _ClassVar[int]
    PATH_FIELD_NUMBER: _ClassVar[int]
    value: str
    escalated: bool
    procedure_version: int
    decision_ref: str
    escalation: Escalation
    decided_at: _timestamp_pb2.Timestamp
    path: DecisionNode
    def __init__(self, value: _Optional[str] = ..., escalated: _Optional[bool] = ..., procedure_version: _Optional[int] = ..., decision_ref: _Optional[str] = ..., escalation: _Optional[_Union[Escalation, _Mapping]] = ..., decided_at: _Optional[_Union[datetime.datetime, _timestamp_pb2.Timestamp, _Mapping]] = ..., path: _Optional[_Union[DecisionNode, _Mapping]] = ...) -> None: ...

class Escalation(_message.Message):
    __slots__ = ("kind", "step_id")
    class Kind(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
        __slots__ = ()
        KIND_UNSPECIFIED: _ClassVar[Escalation.Kind]
        MISSING_INFORMATION: _ClassVar[Escalation.Kind]
        NO_MATCHING_BRANCH: _ClassVar[Escalation.Kind]
        PROCEDURE_ESCALATION: _ClassVar[Escalation.Kind]
        EVALUATION_ERROR: _ClassVar[Escalation.Kind]
    KIND_UNSPECIFIED: Escalation.Kind
    MISSING_INFORMATION: Escalation.Kind
    NO_MATCHING_BRANCH: Escalation.Kind
    PROCEDURE_ESCALATION: Escalation.Kind
    EVALUATION_ERROR: Escalation.Kind
    KIND_FIELD_NUMBER: _ClassVar[int]
    STEP_ID_FIELD_NUMBER: _ClassVar[int]
    kind: Escalation.Kind
    step_id: str
    def __init__(self, kind: _Optional[_Union[Escalation.Kind, str]] = ..., step_id: _Optional[str] = ...) -> None: ...

class GetDecisionRequest(_message.Message):
    __slots__ = ("dataset_name", "decision_ref", "output_name")
    DATASET_NAME_FIELD_NUMBER: _ClassVar[int]
    DECISION_REF_FIELD_NUMBER: _ClassVar[int]
    OUTPUT_NAME_FIELD_NUMBER: _ClassVar[int]
    dataset_name: str
    decision_ref: str
    output_name: str
    def __init__(self, dataset_name: _Optional[str] = ..., decision_ref: _Optional[str] = ..., output_name: _Optional[str] = ...) -> None: ...

class GetProcedureRequest(_message.Message):
    __slots__ = ("dataset_name", "output_name", "version")
    DATASET_NAME_FIELD_NUMBER: _ClassVar[int]
    OUTPUT_NAME_FIELD_NUMBER: _ClassVar[int]
    VERSION_FIELD_NUMBER: _ClassVar[int]
    dataset_name: str
    output_name: str
    version: int
    def __init__(self, dataset_name: _Optional[str] = ..., output_name: _Optional[str] = ..., version: _Optional[int] = ...) -> None: ...

class GetProcedureResponse(_message.Message):
    __slots__ = ("procedure_version", "tree")
    PROCEDURE_VERSION_FIELD_NUMBER: _ClassVar[int]
    TREE_FIELD_NUMBER: _ClassVar[int]
    procedure_version: int
    tree: ProcedureNode
    def __init__(self, procedure_version: _Optional[int] = ..., tree: _Optional[_Union[ProcedureNode, _Mapping]] = ...) -> None: ...

class ProcedureNode(_message.Message):
    __slots__ = ("predicate", "answers", "target_name", "target_value")
    class AnswersEntry(_message.Message):
        __slots__ = ("key", "value")
        KEY_FIELD_NUMBER: _ClassVar[int]
        VALUE_FIELD_NUMBER: _ClassVar[int]
        key: str
        value: ProcedureNode
        def __init__(self, key: _Optional[str] = ..., value: _Optional[_Union[ProcedureNode, _Mapping]] = ...) -> None: ...
    PREDICATE_FIELD_NUMBER: _ClassVar[int]
    ANSWERS_FIELD_NUMBER: _ClassVar[int]
    TARGET_NAME_FIELD_NUMBER: _ClassVar[int]
    TARGET_VALUE_FIELD_NUMBER: _ClassVar[int]
    predicate: str
    answers: _containers.MessageMap[str, ProcedureNode]
    target_name: str
    target_value: str
    def __init__(self, predicate: _Optional[str] = ..., answers: _Optional[_Mapping[str, ProcedureNode]] = ..., target_name: _Optional[str] = ..., target_value: _Optional[str] = ...) -> None: ...

class DecisionNode(_message.Message):
    __slots__ = ("predicate", "answer", "confidence", "answers", "target_name", "target_value", "escalation")
    class AnswersEntry(_message.Message):
        __slots__ = ("key", "value")
        KEY_FIELD_NUMBER: _ClassVar[int]
        VALUE_FIELD_NUMBER: _ClassVar[int]
        key: str
        value: DecisionNode
        def __init__(self, key: _Optional[str] = ..., value: _Optional[_Union[DecisionNode, _Mapping]] = ...) -> None: ...
    PREDICATE_FIELD_NUMBER: _ClassVar[int]
    ANSWER_FIELD_NUMBER: _ClassVar[int]
    CONFIDENCE_FIELD_NUMBER: _ClassVar[int]
    ANSWERS_FIELD_NUMBER: _ClassVar[int]
    TARGET_NAME_FIELD_NUMBER: _ClassVar[int]
    TARGET_VALUE_FIELD_NUMBER: _ClassVar[int]
    ESCALATION_FIELD_NUMBER: _ClassVar[int]
    predicate: str
    answer: str
    confidence: Confidence
    answers: _containers.MessageMap[str, DecisionNode]
    target_name: str
    target_value: str
    escalation: Escalation
    def __init__(self, predicate: _Optional[str] = ..., answer: _Optional[str] = ..., confidence: _Optional[_Union[Confidence, _Mapping]] = ..., answers: _Optional[_Mapping[str, DecisionNode]] = ..., target_name: _Optional[str] = ..., target_value: _Optional[str] = ..., escalation: _Optional[_Union[Escalation, _Mapping]] = ...) -> None: ...

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
