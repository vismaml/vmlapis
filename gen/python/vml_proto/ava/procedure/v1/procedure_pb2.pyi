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
    SOURCE_KIND_INFERRED: _ClassVar[SourceKind]

class FactType(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
    __slots__ = ()
    FACT_TYPE_UNSPECIFIED: _ClassVar[FactType]
    FACT_TYPE_STRING: _ClassVar[FactType]
    FACT_TYPE_FLOAT: _ClassVar[FactType]
    FACT_TYPE_DATE: _ClassVar[FactType]
    FACT_TYPE_BOOL: _ClassVar[FactType]
    FACT_TYPE_INT: _ClassVar[FactType]
    FACT_TYPE_ENUM: _ClassVar[FactType]
SOURCE_KIND_UNSPECIFIED: SourceKind
SOURCE_KIND_CASE: SourceKind
SOURCE_KIND_DERIVED: SourceKind
SOURCE_KIND_INFERRED: SourceKind
FACT_TYPE_UNSPECIFIED: FactType
FACT_TYPE_STRING: FactType
FACT_TYPE_FLOAT: FactType
FACT_TYPE_DATE: FactType
FACT_TYPE_BOOL: FactType
FACT_TYPE_INT: FactType
FACT_TYPE_ENUM: FactType

class Procedure(_message.Message):
    __slots__ = ("facts", "produces", "root_step_id", "steps")
    FACTS_FIELD_NUMBER: _ClassVar[int]
    PRODUCES_FIELD_NUMBER: _ClassVar[int]
    ROOT_STEP_ID_FIELD_NUMBER: _ClassVar[int]
    STEPS_FIELD_NUMBER: _ClassVar[int]
    facts: _containers.RepeatedCompositeFieldContainer[Fact]
    produces: str
    root_step_id: str
    steps: _containers.RepeatedCompositeFieldContainer[Step]
    def __init__(self, facts: _Optional[_Iterable[_Union[Fact, _Mapping]]] = ..., produces: _Optional[str] = ..., root_step_id: _Optional[str] = ..., steps: _Optional[_Iterable[_Union[Step, _Mapping]]] = ...) -> None: ...

class Fact(_message.Message):
    __slots__ = ("name", "type", "permitted", "sources")
    NAME_FIELD_NUMBER: _ClassVar[int]
    TYPE_FIELD_NUMBER: _ClassVar[int]
    PERMITTED_FIELD_NUMBER: _ClassVar[int]
    SOURCES_FIELD_NUMBER: _ClassVar[int]
    name: str
    type: FactType
    permitted: _containers.RepeatedScalarFieldContainer[str]
    sources: _containers.RepeatedCompositeFieldContainer[FactSource]
    def __init__(self, name: _Optional[str] = ..., type: _Optional[_Union[FactType, str]] = ..., permitted: _Optional[_Iterable[str]] = ..., sources: _Optional[_Iterable[_Union[FactSource, _Mapping]]] = ...) -> None: ...

class FactSource(_message.Message):
    __slots__ = ("kind", "name", "field", "args", "question", "guidance")
    KIND_FIELD_NUMBER: _ClassVar[int]
    NAME_FIELD_NUMBER: _ClassVar[int]
    FIELD_FIELD_NUMBER: _ClassVar[int]
    ARGS_FIELD_NUMBER: _ClassVar[int]
    QUESTION_FIELD_NUMBER: _ClassVar[int]
    GUIDANCE_FIELD_NUMBER: _ClassVar[int]
    kind: SourceKind
    name: str
    field: str
    args: _containers.RepeatedScalarFieldContainer[str]
    question: str
    guidance: str
    def __init__(self, kind: _Optional[_Union[SourceKind, str]] = ..., name: _Optional[str] = ..., field: _Optional[str] = ..., args: _Optional[_Iterable[str]] = ..., question: _Optional[str] = ..., guidance: _Optional[str] = ...) -> None: ...

class Step(_message.Message):
    __slots__ = ("step_id", "question", "guidance", "branches")
    STEP_ID_FIELD_NUMBER: _ClassVar[int]
    QUESTION_FIELD_NUMBER: _ClassVar[int]
    GUIDANCE_FIELD_NUMBER: _ClassVar[int]
    BRANCHES_FIELD_NUMBER: _ClassVar[int]
    step_id: str
    question: str
    guidance: str
    branches: _containers.RepeatedCompositeFieldContainer[Branch]
    def __init__(self, step_id: _Optional[str] = ..., question: _Optional[str] = ..., guidance: _Optional[str] = ..., branches: _Optional[_Iterable[_Union[Branch, _Mapping]]] = ...) -> None: ...

class Branch(_message.Message):
    __slots__ = ("branch_id", "label", "criterion", "when", "output_value", "next_step_id", "is_escalation", "rationale")
    BRANCH_ID_FIELD_NUMBER: _ClassVar[int]
    LABEL_FIELD_NUMBER: _ClassVar[int]
    CRITERION_FIELD_NUMBER: _ClassVar[int]
    WHEN_FIELD_NUMBER: _ClassVar[int]
    OUTPUT_VALUE_FIELD_NUMBER: _ClassVar[int]
    NEXT_STEP_ID_FIELD_NUMBER: _ClassVar[int]
    IS_ESCALATION_FIELD_NUMBER: _ClassVar[int]
    RATIONALE_FIELD_NUMBER: _ClassVar[int]
    branch_id: str
    label: str
    criterion: str
    when: str
    output_value: str
    next_step_id: str
    is_escalation: bool
    rationale: str
    def __init__(self, branch_id: _Optional[str] = ..., label: _Optional[str] = ..., criterion: _Optional[str] = ..., when: _Optional[str] = ..., output_value: _Optional[str] = ..., next_step_id: _Optional[str] = ..., is_escalation: bool = ..., rationale: _Optional[str] = ...) -> None: ...
