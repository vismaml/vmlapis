from google.api import annotations_pb2 as _annotations_pb2
from google.protobuf import empty_pb2 as _empty_pb2
from protoc_gen_openapiv2.options import annotations_pb2 as _annotations_pb2_1
from validate import validate_pb2 as _validate_pb2
from google.protobuf.internal import containers as _containers
from google.protobuf.internal import enum_type_wrapper as _enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Iterable as _Iterable, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class ProductType(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
    __slots__ = ()
    UNDEFINED: _ClassVar[ProductType]
    ACCOUNTING_AUDIT: _ClassVar[ProductType]
    ACCOUNTING_SOFTWARE: _ClassVar[ProductType]
    ADVERTISING: _ClassVar[ProductType]
    ALCOHOL_TOBACCO: _ClassVar[ProductType]
    MEDICAL_LAB_EQUIPMENT: _ClassVar[ProductType]
    BANKING_INVESTMENT: _ClassVar[ProductType]
    BOOKS: _ClassVar[ProductType]
    BUSINESS_CONSULTING: _ClassVar[ProductType]
    CHEMICALS: _ClassVar[ProductType]
    CLEANING_SERVICES: _ClassVar[ProductType]
    CLEANING_SUPPLIES: _ClassVar[ProductType]
    CLOTHING: _ClassVar[ProductType]
    ELECTRONICS: _ClassVar[ProductType]
    CONSTRUCTION_MATERIALS: _ClassVar[ProductType]
    DECORATIONS_ART: _ClassVar[ProductType]
    DEFENSE_SECURITY: _ClassVar[ProductType]
    DEPOSITS: _ClassVar[ProductType]
    DOMESTIC_APPLIANCES: _ClassVar[ProductType]
    EDUCATION_TRAINING: _ClassVar[ProductType]
    ENERGY: _ClassVar[ProductType]
    FACILITY_MAINTENANCE: _ClassVar[ProductType]
    AGRICULTURE: _ClassVar[ProductType]
    FEES: _ClassVar[ProductType]
    FINES: _ClassVar[ProductType]
    FOOD_BEVERAGES: _ClassVar[ProductType]
    FUEL_LUBRICANTS: _ClassVar[ProductType]
    FURNITURE: _ClassVar[ProductType]
    GIFTS: _ClassVar[ProductType]
    GLASS_CERAMICS: _ClassVar[ProductType]
    GOVERNMENT_SERVICES: _ClassVar[ProductType]
    GRAPHIC_DESIGN: _ClassVar[ProductType]
    FITNESS_CLUBS: _ClassVar[ProductType]
    HEALTHCARE: _ClassVar[ProductType]
    HOTELS: _ClassVar[ProductType]
    INDUSTRIAL_MACHINERY: _ClassVar[ProductType]
    MANUFACTURING: _ClassVar[ProductType]
    INSURANCE: _ClassVar[ProductType]
    INTERNET_MEDIA: _ClassVar[ProductType]
    PROPERTY_RENTAL: _ClassVar[ProductType]
    LEGAL: _ClassVar[ProductType]
    PLANTS_ANIMALS: _ClassVar[ProductType]
    MACHINERY_LEASING: _ClassVar[ProductType]
    MARKETING: _ClassVar[ProductType]
    MEETINGS: _ClassVar[ProductType]
    MUSIC: _ClassVar[ProductType]
    OFFICE_SUPPLIES: _ClassVar[ProductType]
    PACKAGING: _ClassVar[ProductType]
    PARKING: _ClassVar[ProductType]
    PASSENGER_TRANSPORT: _ClassVar[ProductType]
    PAYMENTS: _ClassVar[ProductType]
    PAYROLL: _ClassVar[ProductType]
    PERSONAL_SERVICES: _ClassVar[ProductType]
    PERSONAL_CARE: _ClassVar[ProductType]
    PHARMACEUTICALS: _ClassVar[ProductType]
    MEDIA_SERVICES: _ClassVar[ProductType]
    RECREATIONAL_SERVICES: _ClassVar[ProductType]
    RESEARCH_TECH_CONSULTING: _ClassVar[ProductType]
    RESTAURANTS: _ClassVar[ProductType]
    RETIREMENT: _ClassVar[ProductType]
    LOGISTICS: _ClassVar[ProductType]
    SOFTWARE: _ClassVar[ProductType]
    SPORTS_EQUIPMENT: _ClassVar[ProductType]
    STORAGE: _ClassVar[ProductType]
    TAXATION: _ClassVar[ProductType]
    TELEPHONY: _ClassVar[ProductType]
    TEXTILES: _ClassVar[ProductType]
    JEWELRY: _ClassVar[ProductType]
    TOLLS: _ClassVar[ProductType]
    TOYS: _ClassVar[ProductType]
    TRADE_REPAIR: _ClassVar[ProductType]
    VEHICLE_RENTALS: _ClassVar[ProductType]
    VEHICLES: _ClassVar[ProductType]
    WATER_WASTE: _ClassVar[ProductType]
    WEBSITE: _ClassVar[ProductType]

class ConfidenceLevel(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
    __slots__ = ()
    UNKNOWN: _ClassVar[ConfidenceLevel]
    VERY_LOW: _ClassVar[ConfidenceLevel]
    LOW: _ClassVar[ConfidenceLevel]
    MID: _ClassVar[ConfidenceLevel]
    HIGH: _ClassVar[ConfidenceLevel]
    VERY_HIGH: _ClassVar[ConfidenceLevel]
UNDEFINED: ProductType
ACCOUNTING_AUDIT: ProductType
ACCOUNTING_SOFTWARE: ProductType
ADVERTISING: ProductType
ALCOHOL_TOBACCO: ProductType
MEDICAL_LAB_EQUIPMENT: ProductType
BANKING_INVESTMENT: ProductType
BOOKS: ProductType
BUSINESS_CONSULTING: ProductType
CHEMICALS: ProductType
CLEANING_SERVICES: ProductType
CLEANING_SUPPLIES: ProductType
CLOTHING: ProductType
ELECTRONICS: ProductType
CONSTRUCTION_MATERIALS: ProductType
DECORATIONS_ART: ProductType
DEFENSE_SECURITY: ProductType
DEPOSITS: ProductType
DOMESTIC_APPLIANCES: ProductType
EDUCATION_TRAINING: ProductType
ENERGY: ProductType
FACILITY_MAINTENANCE: ProductType
AGRICULTURE: ProductType
FEES: ProductType
FINES: ProductType
FOOD_BEVERAGES: ProductType
FUEL_LUBRICANTS: ProductType
FURNITURE: ProductType
GIFTS: ProductType
GLASS_CERAMICS: ProductType
GOVERNMENT_SERVICES: ProductType
GRAPHIC_DESIGN: ProductType
FITNESS_CLUBS: ProductType
HEALTHCARE: ProductType
HOTELS: ProductType
INDUSTRIAL_MACHINERY: ProductType
MANUFACTURING: ProductType
INSURANCE: ProductType
INTERNET_MEDIA: ProductType
PROPERTY_RENTAL: ProductType
LEGAL: ProductType
PLANTS_ANIMALS: ProductType
MACHINERY_LEASING: ProductType
MARKETING: ProductType
MEETINGS: ProductType
MUSIC: ProductType
OFFICE_SUPPLIES: ProductType
PACKAGING: ProductType
PARKING: ProductType
PASSENGER_TRANSPORT: ProductType
PAYMENTS: ProductType
PAYROLL: ProductType
PERSONAL_SERVICES: ProductType
PERSONAL_CARE: ProductType
PHARMACEUTICALS: ProductType
MEDIA_SERVICES: ProductType
RECREATIONAL_SERVICES: ProductType
RESEARCH_TECH_CONSULTING: ProductType
RESTAURANTS: ProductType
RETIREMENT: ProductType
LOGISTICS: ProductType
SOFTWARE: ProductType
SPORTS_EQUIPMENT: ProductType
STORAGE: ProductType
TAXATION: ProductType
TELEPHONY: ProductType
TEXTILES: ProductType
JEWELRY: ProductType
TOLLS: ProductType
TOYS: ProductType
TRADE_REPAIR: ProductType
VEHICLE_RENTALS: ProductType
VEHICLES: ProductType
WATER_WASTE: ProductType
WEBSITE: ProductType
UNKNOWN: ConfidenceLevel
VERY_LOW: ConfidenceLevel
LOW: ConfidenceLevel
MID: ConfidenceLevel
HIGH: ConfidenceLevel
VERY_HIGH: ConfidenceLevel

class ProductTypeBatchSuggestRequest(_message.Message):
    __slots__ = ("texts",)
    TEXTS_FIELD_NUMBER: _ClassVar[int]
    texts: _containers.RepeatedScalarFieldContainer[str]
    def __init__(self, texts: _Optional[_Iterable[str]] = ...) -> None: ...

class ProductTypeBatchSuggestResponse(_message.Message):
    __slots__ = ("suggestions",)
    SUGGESTIONS_FIELD_NUMBER: _ClassVar[int]
    suggestions: _containers.RepeatedCompositeFieldContainer[ProductTypeSuggestion]
    def __init__(self, suggestions: _Optional[_Iterable[_Union[ProductTypeSuggestion, _Mapping]]] = ...) -> None: ...

class ProductTypeSuggestion(_message.Message):
    __slots__ = ("id", "candidates")
    ID_FIELD_NUMBER: _ClassVar[int]
    CANDIDATES_FIELD_NUMBER: _ClassVar[int]
    id: str
    candidates: _containers.RepeatedCompositeFieldContainer[ProductTypeCandidate]
    def __init__(self, id: _Optional[str] = ..., candidates: _Optional[_Iterable[_Union[ProductTypeCandidate, _Mapping]]] = ...) -> None: ...

class ProductTypeCandidate(_message.Message):
    __slots__ = ("type", "label", "confidence", "confidence_level")
    TYPE_FIELD_NUMBER: _ClassVar[int]
    LABEL_FIELD_NUMBER: _ClassVar[int]
    CONFIDENCE_FIELD_NUMBER: _ClassVar[int]
    CONFIDENCE_LEVEL_FIELD_NUMBER: _ClassVar[int]
    type: ProductType
    label: str
    confidence: float
    confidence_level: ConfidenceLevel
    def __init__(self, type: _Optional[_Union[ProductType, str]] = ..., label: _Optional[str] = ..., confidence: _Optional[float] = ..., confidence_level: _Optional[_Union[ConfidenceLevel, str]] = ...) -> None: ...

class ProductTypeFeedbackRequest(_message.Message):
    __slots__ = ("feedback_id", "feedback_category")
    FEEDBACK_ID_FIELD_NUMBER: _ClassVar[int]
    FEEDBACK_CATEGORY_FIELD_NUMBER: _ClassVar[int]
    feedback_id: str
    feedback_category: str
    def __init__(self, feedback_id: _Optional[str] = ..., feedback_category: _Optional[str] = ...) -> None: ...
