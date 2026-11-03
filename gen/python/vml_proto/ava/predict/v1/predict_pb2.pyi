from ava.procedure.v1 import procedure_pb2 as _procedure_pb2
from google.api import annotations_pb2 as _annotations_pb2
from google.protobuf.internal import containers as _containers
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from collections.abc import Iterable as _Iterable, Mapping as _Mapping
from typing import ClassVar as _ClassVar, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class PredictRequest(_message.Message):
    __slots__ = ("dataset_name", "output_name", "text")
    DATASET_NAME_FIELD_NUMBER: _ClassVar[int]
    OUTPUT_NAME_FIELD_NUMBER: _ClassVar[int]
    TEXT_FIELD_NUMBER: _ClassVar[int]
    dataset_name: str
    output_name: str
    text: str
    def __init__(self, dataset_name: _Optional[str] = ..., output_name: _Optional[str] = ..., text: _Optional[str] = ...) -> None: ...

class PredictResponse(_message.Message):
    __slots__ = ("workflow_id", "output_value", "escalation_reason", "reasoning", "procedure_dataset", "version", "facts", "trace")
    WORKFLOW_ID_FIELD_NUMBER: _ClassVar[int]
    OUTPUT_VALUE_FIELD_NUMBER: _ClassVar[int]
    ESCALATION_REASON_FIELD_NUMBER: _ClassVar[int]
    REASONING_FIELD_NUMBER: _ClassVar[int]
    PROCEDURE_DATASET_FIELD_NUMBER: _ClassVar[int]
    VERSION_FIELD_NUMBER: _ClassVar[int]
    FACTS_FIELD_NUMBER: _ClassVar[int]
    TRACE_FIELD_NUMBER: _ClassVar[int]
    workflow_id: str
    output_value: str
    escalation_reason: str
    reasoning: str
    procedure_dataset: str
    version: int
    facts: _containers.RepeatedCompositeFieldContainer[Fact]
    trace: Trace
    def __init__(self, workflow_id: _Optional[str] = ..., output_value: _Optional[str] = ..., escalation_reason: _Optional[str] = ..., reasoning: _Optional[str] = ..., procedure_dataset: _Optional[str] = ..., version: _Optional[int] = ..., facts: _Optional[_Iterable[_Union[Fact, _Mapping]]] = ..., trace: _Optional[_Union[Trace, _Mapping]] = ...) -> None: ...

class Fact(_message.Message):
    __slots__ = ("name", "type", "permitted", "sources", "value")
    NAME_FIELD_NUMBER: _ClassVar[int]
    TYPE_FIELD_NUMBER: _ClassVar[int]
    PERMITTED_FIELD_NUMBER: _ClassVar[int]
    SOURCES_FIELD_NUMBER: _ClassVar[int]
    VALUE_FIELD_NUMBER: _ClassVar[int]
    name: str
    type: _procedure_pb2.FactType
    permitted: _containers.RepeatedScalarFieldContainer[str]
    sources: _containers.RepeatedCompositeFieldContainer[FactSource]
    value: str
    def __init__(self, name: _Optional[str] = ..., type: _Optional[_Union[_procedure_pb2.FactType, str]] = ..., permitted: _Optional[_Iterable[str]] = ..., sources: _Optional[_Iterable[_Union[FactSource, _Mapping]]] = ..., value: _Optional[str] = ...) -> None: ...

class FactSource(_message.Message):
    __slots__ = ("kind", "name", "field", "args", "question", "guidance", "value", "skipped", "probability")
    KIND_FIELD_NUMBER: _ClassVar[int]
    NAME_FIELD_NUMBER: _ClassVar[int]
    FIELD_FIELD_NUMBER: _ClassVar[int]
    ARGS_FIELD_NUMBER: _ClassVar[int]
    QUESTION_FIELD_NUMBER: _ClassVar[int]
    GUIDANCE_FIELD_NUMBER: _ClassVar[int]
    VALUE_FIELD_NUMBER: _ClassVar[int]
    SKIPPED_FIELD_NUMBER: _ClassVar[int]
    PROBABILITY_FIELD_NUMBER: _ClassVar[int]
    kind: _procedure_pb2.SourceKind
    name: str
    field: str
    args: _containers.RepeatedScalarFieldContainer[str]
    question: str
    guidance: str
    value: str
    skipped: str
    probability: float
    def __init__(self, kind: _Optional[_Union[_procedure_pb2.SourceKind, str]] = ..., name: _Optional[str] = ..., field: _Optional[str] = ..., args: _Optional[_Iterable[str]] = ..., question: _Optional[str] = ..., guidance: _Optional[str] = ..., value: _Optional[str] = ..., skipped: _Optional[str] = ..., probability: _Optional[float] = ...) -> None: ...

class Trace(_message.Message):
    __slots__ = ("output_name", "steps")
    OUTPUT_NAME_FIELD_NUMBER: _ClassVar[int]
    STEPS_FIELD_NUMBER: _ClassVar[int]
    output_name: str
    steps: _containers.RepeatedCompositeFieldContainer[TraceStep]
    def __init__(self, output_name: _Optional[str] = ..., steps: _Optional[_Iterable[_Union[TraceStep, _Mapping]]] = ...) -> None: ...

class TraceStep(_message.Message):
    __slots__ = ("step_id", "branch_id", "question", "answer", "evidence", "output_value", "next_step_id", "reason")
    STEP_ID_FIELD_NUMBER: _ClassVar[int]
    BRANCH_ID_FIELD_NUMBER: _ClassVar[int]
    QUESTION_FIELD_NUMBER: _ClassVar[int]
    ANSWER_FIELD_NUMBER: _ClassVar[int]
    EVIDENCE_FIELD_NUMBER: _ClassVar[int]
    OUTPUT_VALUE_FIELD_NUMBER: _ClassVar[int]
    NEXT_STEP_ID_FIELD_NUMBER: _ClassVar[int]
    REASON_FIELD_NUMBER: _ClassVar[int]
    step_id: str
    branch_id: str
    question: str
    answer: str
    evidence: Evidence
    output_value: str
    next_step_id: str
    reason: str
    def __init__(self, step_id: _Optional[str] = ..., branch_id: _Optional[str] = ..., question: _Optional[str] = ..., answer: _Optional[str] = ..., evidence: _Optional[_Union[Evidence, _Mapping]] = ..., output_value: _Optional[str] = ..., next_step_id: _Optional[str] = ..., reason: _Optional[str] = ...) -> None: ...

class Evidence(_message.Message):
    __slots__ = ("cel", "tested", "read", "unknown")
    class ReadEntry(_message.Message):
        __slots__ = ("key", "value")
        KEY_FIELD_NUMBER: _ClassVar[int]
        VALUE_FIELD_NUMBER: _ClassVar[int]
        key: str
        value: str
        def __init__(self, key: _Optional[str] = ..., value: _Optional[str] = ...) -> None: ...
    CEL_FIELD_NUMBER: _ClassVar[int]
    TESTED_FIELD_NUMBER: _ClassVar[int]
    READ_FIELD_NUMBER: _ClassVar[int]
    UNKNOWN_FIELD_NUMBER: _ClassVar[int]
    cel: str
    tested: _containers.RepeatedScalarFieldContainer[str]
    read: _containers.ScalarMap[str, str]
    unknown: _containers.RepeatedScalarFieldContainer[str]
    def __init__(self, cel: _Optional[str] = ..., tested: _Optional[_Iterable[str]] = ..., read: _Optional[_Mapping[str, str]] = ..., unknown: _Optional[_Iterable[str]] = ...) -> None: ...
