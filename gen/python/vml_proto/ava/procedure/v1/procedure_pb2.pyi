from google.protobuf.internal import containers as _containers
from google.protobuf.internal import enum_type_wrapper as _enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Iterable as _Iterable, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class SourceKind(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
    __slots__ = ()
    SOURCE_KIND_UNSPECIFIED: _ClassVar[SourceKind]
    SOURCE_KIND_CASE: _ClassVar[SourceKind]
    SOURCE_KIND_DERIVED: _ClassVar[SourceKind]
    SOURCE_KIND_LOOKUP: _ClassVar[SourceKind]
    SOURCE_KIND_INFERRED: _ClassVar[SourceKind]

class FactType(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
    __slots__ = ()
    FACT_TYPE_UNSPECIFIED: _ClassVar[FactType]
    FACT_TYPE_STRING: _ClassVar[FactType]
    FACT_TYPE_DATE: _ClassVar[FactType]
    FACT_TYPE_BOOL: _ClassVar[FactType]
    FACT_TYPE_INT: _ClassVar[FactType]
    FACT_TYPE_FLOAT: _ClassVar[FactType]
    FACT_TYPE_ENUM: _ClassVar[FactType]

class StepKind(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
    __slots__ = ()
    STEP_KIND_UNSPECIFIED: _ClassVar[StepKind]
    STEP_KIND_TEST: _ClassVar[StepKind]
    STEP_KIND_JUDGMENT: _ClassVar[StepKind]

class Origin(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
    __slots__ = ()
    ORIGIN_UNSPECIFIED: _ClassVar[Origin]
    ORIGIN_MINED: _ClassVar[Origin]
    ORIGIN_HUMAN: _ClassVar[Origin]
SOURCE_KIND_UNSPECIFIED: SourceKind
SOURCE_KIND_CASE: SourceKind
SOURCE_KIND_DERIVED: SourceKind
SOURCE_KIND_LOOKUP: SourceKind
SOURCE_KIND_INFERRED: SourceKind
FACT_TYPE_UNSPECIFIED: FactType
FACT_TYPE_STRING: FactType
FACT_TYPE_DATE: FactType
FACT_TYPE_BOOL: FactType
FACT_TYPE_INT: FactType
FACT_TYPE_FLOAT: FactType
FACT_TYPE_ENUM: FactType
STEP_KIND_UNSPECIFIED: StepKind
STEP_KIND_TEST: StepKind
STEP_KIND_JUDGMENT: StepKind
ORIGIN_UNSPECIFIED: Origin
ORIGIN_MINED: Origin
ORIGIN_HUMAN: Origin

class Procedure(_message.Message):
    __slots__ = ("inputs", "outputs", "root_step_id", "steps")
    INPUTS_FIELD_NUMBER: _ClassVar[int]
    OUTPUTS_FIELD_NUMBER: _ClassVar[int]
    ROOT_STEP_ID_FIELD_NUMBER: _ClassVar[int]
    STEPS_FIELD_NUMBER: _ClassVar[int]
    inputs: InputContract
    outputs: OutputContract
    root_step_id: str
    steps: _containers.RepeatedCompositeFieldContainer[Step]
    def __init__(self, inputs: _Optional[_Union[InputContract, _Mapping]] = ..., outputs: _Optional[_Union[OutputContract, _Mapping]] = ..., root_step_id: _Optional[str] = ..., steps: _Optional[_Iterable[_Union[Step, _Mapping]]] = ...) -> None: ...

class InputContract(_message.Message):
    __slots__ = ("facts",)
    FACTS_FIELD_NUMBER: _ClassVar[int]
    facts: _containers.RepeatedCompositeFieldContainer[FactBinding]
    def __init__(self, facts: _Optional[_Iterable[_Union[FactBinding, _Mapping]]] = ...) -> None: ...

class FactBinding(_message.Message):
    __slots__ = ("fact_name", "type", "sources", "values")
    FACT_NAME_FIELD_NUMBER: _ClassVar[int]
    TYPE_FIELD_NUMBER: _ClassVar[int]
    SOURCES_FIELD_NUMBER: _ClassVar[int]
    VALUES_FIELD_NUMBER: _ClassVar[int]
    fact_name: str
    type: FactType
    sources: _containers.RepeatedCompositeFieldContainer[FactSource]
    values: _containers.RepeatedScalarFieldContainer[str]
    def __init__(self, fact_name: _Optional[str] = ..., type: _Optional[_Union[FactType, str]] = ..., sources: _Optional[_Iterable[_Union[FactSource, _Mapping]]] = ..., values: _Optional[_Iterable[str]] = ...) -> None: ...

class FactSource(_message.Message):
    __slots__ = ("field", "args", "kind", "name", "group")
    FIELD_FIELD_NUMBER: _ClassVar[int]
    ARGS_FIELD_NUMBER: _ClassVar[int]
    KIND_FIELD_NUMBER: _ClassVar[int]
    NAME_FIELD_NUMBER: _ClassVar[int]
    GROUP_FIELD_NUMBER: _ClassVar[int]
    field: str
    args: _containers.RepeatedScalarFieldContainer[str]
    kind: SourceKind
    name: str
    group: str
    def __init__(self, field: _Optional[str] = ..., args: _Optional[_Iterable[str]] = ..., kind: _Optional[_Union[SourceKind, str]] = ..., name: _Optional[str] = ..., group: _Optional[str] = ...) -> None: ...

class OutputContract(_message.Message):
    __slots__ = ("produces",)
    PRODUCES_FIELD_NUMBER: _ClassVar[int]
    produces: _containers.RepeatedScalarFieldContainer[str]
    def __init__(self, produces: _Optional[_Iterable[str]] = ...) -> None: ...

class Step(_message.Message):
    __slots__ = ("step_id", "kind", "question", "guidance", "judgment", "branches", "origin")
    STEP_ID_FIELD_NUMBER: _ClassVar[int]
    KIND_FIELD_NUMBER: _ClassVar[int]
    QUESTION_FIELD_NUMBER: _ClassVar[int]
    GUIDANCE_FIELD_NUMBER: _ClassVar[int]
    JUDGMENT_FIELD_NUMBER: _ClassVar[int]
    BRANCHES_FIELD_NUMBER: _ClassVar[int]
    ORIGIN_FIELD_NUMBER: _ClassVar[int]
    step_id: str
    kind: StepKind
    question: str
    guidance: str
    judgment: Judgment
    branches: _containers.RepeatedCompositeFieldContainer[Branch]
    origin: Origin
    def __init__(self, step_id: _Optional[str] = ..., kind: _Optional[_Union[StepKind, str]] = ..., question: _Optional[str] = ..., guidance: _Optional[str] = ..., judgment: _Optional[_Union[Judgment, _Mapping]] = ..., branches: _Optional[_Iterable[_Union[Branch, _Mapping]]] = ..., origin: _Optional[_Union[Origin, str]] = ...) -> None: ...

class Judgment(_message.Message):
    __slots__ = ("prompt_ref", "requires_span", "reads")
    PROMPT_REF_FIELD_NUMBER: _ClassVar[int]
    REQUIRES_SPAN_FIELD_NUMBER: _ClassVar[int]
    READS_FIELD_NUMBER: _ClassVar[int]
    prompt_ref: str
    requires_span: bool
    reads: _containers.RepeatedScalarFieldContainer[str]
    def __init__(self, prompt_ref: _Optional[str] = ..., requires_span: bool = ..., reads: _Optional[_Iterable[str]] = ...) -> None: ...

class Branch(_message.Message):
    __slots__ = ("branch_id", "label", "criterion", "when", "sets", "next_step_id", "is_escalation", "rationale")
    class SetsEntry(_message.Message):
        __slots__ = ("key", "value")
        KEY_FIELD_NUMBER: _ClassVar[int]
        VALUE_FIELD_NUMBER: _ClassVar[int]
        key: str
        value: str
        def __init__(self, key: _Optional[str] = ..., value: _Optional[str] = ...) -> None: ...
    BRANCH_ID_FIELD_NUMBER: _ClassVar[int]
    LABEL_FIELD_NUMBER: _ClassVar[int]
    CRITERION_FIELD_NUMBER: _ClassVar[int]
    WHEN_FIELD_NUMBER: _ClassVar[int]
    SETS_FIELD_NUMBER: _ClassVar[int]
    NEXT_STEP_ID_FIELD_NUMBER: _ClassVar[int]
    IS_ESCALATION_FIELD_NUMBER: _ClassVar[int]
    RATIONALE_FIELD_NUMBER: _ClassVar[int]
    branch_id: str
    label: str
    criterion: str
    when: str
    sets: _containers.ScalarMap[str, str]
    next_step_id: str
    is_escalation: bool
    rationale: str
    def __init__(self, branch_id: _Optional[str] = ..., label: _Optional[str] = ..., criterion: _Optional[str] = ..., when: _Optional[str] = ..., sets: _Optional[_Mapping[str, str]] = ..., next_step_id: _Optional[str] = ..., is_escalation: bool = ..., rationale: _Optional[str] = ...) -> None: ...
