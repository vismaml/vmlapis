from google.protobuf import wrappers_pb2 as _wrappers_pb2
from ssn.type import geometry_pb2 as _geometry_pb2
from google.protobuf.internal import enum_type_wrapper as _enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Mapping as _Mapping, Optional as _Optional, Union as _Union

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

class Candidate(_message.Message):
    __slots__ = ("value", "text", "confidence", "bounding_box", "type", "page_ref", "model_metadata")
    class Type(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
        __slots__ = ()
        UNKNOWN: _ClassVar[Candidate.Type]
        FIELD: _ClassVar[Candidate.Type]
        DOCUMENT: _ClassVar[Candidate.Type]
    UNKNOWN: Candidate.Type
    FIELD: Candidate.Type
    DOCUMENT: Candidate.Type
    VALUE_FIELD_NUMBER: _ClassVar[int]
    TEXT_FIELD_NUMBER: _ClassVar[int]
    CONFIDENCE_FIELD_NUMBER: _ClassVar[int]
    BOUNDING_BOX_FIELD_NUMBER: _ClassVar[int]
    TYPE_FIELD_NUMBER: _ClassVar[int]
    PAGE_REF_FIELD_NUMBER: _ClassVar[int]
    MODEL_METADATA_FIELD_NUMBER: _ClassVar[int]
    value: str
    text: str
    confidence: Confidence
    bounding_box: _geometry_pb2.BoundingPoly
    type: Candidate.Type
    page_ref: int
    model_metadata: ModelSpec
    def __init__(self, value: _Optional[str] = ..., text: _Optional[str] = ..., confidence: _Optional[_Union[Confidence, _Mapping]] = ..., bounding_box: _Optional[_Union[_geometry_pb2.BoundingPoly, _Mapping]] = ..., type: _Optional[_Union[Candidate.Type, str]] = ..., page_ref: _Optional[int] = ..., model_metadata: _Optional[_Union[ModelSpec, _Mapping]] = ...) -> None: ...

class ModelSpec(_message.Message):
    __slots__ = ("model_name", "model_ver")
    MODEL_NAME_FIELD_NUMBER: _ClassVar[int]
    MODEL_VER_FIELD_NUMBER: _ClassVar[int]
    model_name: str
    model_ver: _wrappers_pb2.Int64Value
    def __init__(self, model_name: _Optional[str] = ..., model_ver: _Optional[_Union[_wrappers_pb2.Int64Value, _Mapping]] = ...) -> None: ...

class LineCandidate(_message.Message):
    __slots__ = ("text", "amount", "page_ref")
    TEXT_FIELD_NUMBER: _ClassVar[int]
    AMOUNT_FIELD_NUMBER: _ClassVar[int]
    PAGE_REF_FIELD_NUMBER: _ClassVar[int]
    text: str
    amount: float
    page_ref: int
    def __init__(self, text: _Optional[str] = ..., amount: _Optional[float] = ..., page_ref: _Optional[int] = ...) -> None: ...

class PurchaseLineCandidate(_message.Message):
    __slots__ = ("page_ref", "code", "description", "quantity", "item_number", "unit", "total_discount", "percentage_discount", "total_incl_vat", "total_excl_vat", "total_vat", "percentage_vat", "unit_price_incl_vat", "unit_price_excl_vat", "total", "unit_price", "model_metadata")
    PAGE_REF_FIELD_NUMBER: _ClassVar[int]
    CODE_FIELD_NUMBER: _ClassVar[int]
    DESCRIPTION_FIELD_NUMBER: _ClassVar[int]
    QUANTITY_FIELD_NUMBER: _ClassVar[int]
    ITEM_NUMBER_FIELD_NUMBER: _ClassVar[int]
    UNIT_FIELD_NUMBER: _ClassVar[int]
    TOTAL_DISCOUNT_FIELD_NUMBER: _ClassVar[int]
    PERCENTAGE_DISCOUNT_FIELD_NUMBER: _ClassVar[int]
    TOTAL_INCL_VAT_FIELD_NUMBER: _ClassVar[int]
    TOTAL_EXCL_VAT_FIELD_NUMBER: _ClassVar[int]
    TOTAL_VAT_FIELD_NUMBER: _ClassVar[int]
    PERCENTAGE_VAT_FIELD_NUMBER: _ClassVar[int]
    UNIT_PRICE_INCL_VAT_FIELD_NUMBER: _ClassVar[int]
    UNIT_PRICE_EXCL_VAT_FIELD_NUMBER: _ClassVar[int]
    TOTAL_FIELD_NUMBER: _ClassVar[int]
    UNIT_PRICE_FIELD_NUMBER: _ClassVar[int]
    MODEL_METADATA_FIELD_NUMBER: _ClassVar[int]
    page_ref: int
    code: str
    description: str
    quantity: str
    item_number: str
    unit: str
    total_discount: str
    percentage_discount: str
    total_incl_vat: str
    total_excl_vat: str
    total_vat: str
    percentage_vat: str
    unit_price_incl_vat: str
    unit_price_excl_vat: str
    total: str
    unit_price: str
    model_metadata: ModelSpec
    def __init__(self, page_ref: _Optional[int] = ..., code: _Optional[str] = ..., description: _Optional[str] = ..., quantity: _Optional[str] = ..., item_number: _Optional[str] = ..., unit: _Optional[str] = ..., total_discount: _Optional[str] = ..., percentage_discount: _Optional[str] = ..., total_incl_vat: _Optional[str] = ..., total_excl_vat: _Optional[str] = ..., total_vat: _Optional[str] = ..., percentage_vat: _Optional[str] = ..., unit_price_incl_vat: _Optional[str] = ..., unit_price_excl_vat: _Optional[str] = ..., total: _Optional[str] = ..., unit_price: _Optional[str] = ..., model_metadata: _Optional[_Union[ModelSpec, _Mapping]] = ...) -> None: ...

class AnswerCandidate(_message.Message):
    __slots__ = ("question", "answer", "confidence", "model_metadata", "page_ref")
    QUESTION_FIELD_NUMBER: _ClassVar[int]
    ANSWER_FIELD_NUMBER: _ClassVar[int]
    CONFIDENCE_FIELD_NUMBER: _ClassVar[int]
    MODEL_METADATA_FIELD_NUMBER: _ClassVar[int]
    PAGE_REF_FIELD_NUMBER: _ClassVar[int]
    question: str
    answer: str
    confidence: Confidence
    model_metadata: ModelSpec
    page_ref: int
    def __init__(self, question: _Optional[str] = ..., answer: _Optional[str] = ..., confidence: _Optional[_Union[Confidence, _Mapping]] = ..., model_metadata: _Optional[_Union[ModelSpec, _Mapping]] = ..., page_ref: _Optional[int] = ...) -> None: ...

class PageText(_message.Message):
    __slots__ = ("page_ref", "text")
    PAGE_REF_FIELD_NUMBER: _ClassVar[int]
    TEXT_FIELD_NUMBER: _ClassVar[int]
    page_ref: int
    text: str
    def __init__(self, page_ref: _Optional[int] = ..., text: _Optional[str] = ...) -> None: ...

class VatDistributionCandidate(_message.Message):
    __slots__ = ("percentage", "amount", "model_metadata", "page_ref", "excl_vat", "incl_vat")
    PERCENTAGE_FIELD_NUMBER: _ClassVar[int]
    AMOUNT_FIELD_NUMBER: _ClassVar[int]
    MODEL_METADATA_FIELD_NUMBER: _ClassVar[int]
    PAGE_REF_FIELD_NUMBER: _ClassVar[int]
    EXCL_VAT_FIELD_NUMBER: _ClassVar[int]
    INCL_VAT_FIELD_NUMBER: _ClassVar[int]
    percentage: str
    amount: str
    model_metadata: ModelSpec
    page_ref: int
    excl_vat: str
    incl_vat: str
    def __init__(self, percentage: _Optional[str] = ..., amount: _Optional[str] = ..., model_metadata: _Optional[_Union[ModelSpec, _Mapping]] = ..., page_ref: _Optional[int] = ..., excl_vat: _Optional[str] = ..., incl_vat: _Optional[str] = ...) -> None: ...

class DocumentMetadata(_message.Message):
    __slots__ = ("page_count",)
    PAGE_COUNT_FIELD_NUMBER: _ClassVar[int]
    page_count: int
    def __init__(self, page_count: _Optional[int] = ...) -> None: ...
