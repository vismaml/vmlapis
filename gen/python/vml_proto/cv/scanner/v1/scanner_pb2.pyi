from google.api import annotations_pb2 as _annotations_pb2
from google.api import http_pb2 as _http_pb2
from ssn.annotator.v1 import annotator_pb2 as _annotator_pb2
from ssn.type import candidate_pb2 as _candidate_pb2
from google.protobuf.internal import containers as _containers
from google.protobuf.internal import enum_type_wrapper as _enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Iterable as _Iterable, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class ScanCVRequest(_message.Message):
    __slots__ = ("document", "features", "tags")
    DOCUMENT_FIELD_NUMBER: _ClassVar[int]
    FEATURES_FIELD_NUMBER: _ClassVar[int]
    TAGS_FIELD_NUMBER: _ClassVar[int]
    document: _annotator_pb2.Document
    features: _containers.RepeatedCompositeFieldContainer[Feature]
    tags: _containers.RepeatedScalarFieldContainer[str]
    def __init__(self, document: _Optional[_Union[_annotator_pb2.Document, _Mapping]] = ..., features: _Optional[_Iterable[_Union[Feature, _Mapping]]] = ..., tags: _Optional[_Iterable[str]] = ...) -> None: ...

class ScanCVResponse(_message.Message):
    __slots__ = ("first_name", "last_name", "date_of_birth", "phone", "email", "country", "nationality", "postal_code", "postal_area", "municipality", "county", "address", "employer_name", "position_title", "date", "institution_name", "institution_type", "area_of_education", "degree", "average_grade", "name", "level")
    FIRST_NAME_FIELD_NUMBER: _ClassVar[int]
    LAST_NAME_FIELD_NUMBER: _ClassVar[int]
    DATE_OF_BIRTH_FIELD_NUMBER: _ClassVar[int]
    PHONE_FIELD_NUMBER: _ClassVar[int]
    EMAIL_FIELD_NUMBER: _ClassVar[int]
    COUNTRY_FIELD_NUMBER: _ClassVar[int]
    NATIONALITY_FIELD_NUMBER: _ClassVar[int]
    POSTAL_CODE_FIELD_NUMBER: _ClassVar[int]
    POSTAL_AREA_FIELD_NUMBER: _ClassVar[int]
    MUNICIPALITY_FIELD_NUMBER: _ClassVar[int]
    COUNTY_FIELD_NUMBER: _ClassVar[int]
    ADDRESS_FIELD_NUMBER: _ClassVar[int]
    EMPLOYER_NAME_FIELD_NUMBER: _ClassVar[int]
    POSITION_TITLE_FIELD_NUMBER: _ClassVar[int]
    DATE_FIELD_NUMBER: _ClassVar[int]
    INSTITUTION_NAME_FIELD_NUMBER: _ClassVar[int]
    INSTITUTION_TYPE_FIELD_NUMBER: _ClassVar[int]
    AREA_OF_EDUCATION_FIELD_NUMBER: _ClassVar[int]
    DEGREE_FIELD_NUMBER: _ClassVar[int]
    AVERAGE_GRADE_FIELD_NUMBER: _ClassVar[int]
    NAME_FIELD_NUMBER: _ClassVar[int]
    LEVEL_FIELD_NUMBER: _ClassVar[int]
    first_name: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    last_name: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    date_of_birth: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    phone: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    email: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    country: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    nationality: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    postal_code: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    postal_area: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    municipality: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    county: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    address: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    employer_name: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    position_title: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    date: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    institution_name: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    institution_type: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    area_of_education: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    degree: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    average_grade: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    name: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    level: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    def __init__(self, first_name: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., last_name: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., date_of_birth: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., phone: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., email: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., country: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., nationality: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., postal_code: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., postal_area: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., municipality: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., county: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., address: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., employer_name: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., position_title: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., date: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., institution_name: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., institution_type: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., area_of_education: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., degree: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., average_grade: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., name: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., level: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ...) -> None: ...

class Feature(_message.Message):
    __slots__ = ("type", "max_results")
    class Type(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
        __slots__ = ()
        FIRST_NAME: _ClassVar[Feature.Type]
        LAST_NAME: _ClassVar[Feature.Type]
        DATE_OF_BIRTH: _ClassVar[Feature.Type]
        PHONE: _ClassVar[Feature.Type]
        EMAIL: _ClassVar[Feature.Type]
        COUNTRY: _ClassVar[Feature.Type]
        NATIONALITY: _ClassVar[Feature.Type]
        POSTAL_CODE: _ClassVar[Feature.Type]
        POSTAL_AREA: _ClassVar[Feature.Type]
        MUNICIPALITY: _ClassVar[Feature.Type]
        COUNTY: _ClassVar[Feature.Type]
        ADDRESS: _ClassVar[Feature.Type]
        EMPLOYER_NAME: _ClassVar[Feature.Type]
        POSITION_TITLE: _ClassVar[Feature.Type]
        DATE: _ClassVar[Feature.Type]
        INSTITUTE_NAME: _ClassVar[Feature.Type]
        INSTITUTE_TYPE: _ClassVar[Feature.Type]
        AREA_OF_EDUCATION: _ClassVar[Feature.Type]
        DEGREE: _ClassVar[Feature.Type]
        AVERAGE_GRADE: _ClassVar[Feature.Type]
        NAME: _ClassVar[Feature.Type]
        LEVEL: _ClassVar[Feature.Type]
    FIRST_NAME: Feature.Type
    LAST_NAME: Feature.Type
    DATE_OF_BIRTH: Feature.Type
    PHONE: Feature.Type
    EMAIL: Feature.Type
    COUNTRY: Feature.Type
    NATIONALITY: Feature.Type
    POSTAL_CODE: Feature.Type
    POSTAL_AREA: Feature.Type
    MUNICIPALITY: Feature.Type
    COUNTY: Feature.Type
    ADDRESS: Feature.Type
    EMPLOYER_NAME: Feature.Type
    POSITION_TITLE: Feature.Type
    DATE: Feature.Type
    INSTITUTE_NAME: Feature.Type
    INSTITUTE_TYPE: Feature.Type
    AREA_OF_EDUCATION: Feature.Type
    DEGREE: Feature.Type
    AVERAGE_GRADE: Feature.Type
    NAME: Feature.Type
    LEVEL: Feature.Type
    TYPE_FIELD_NUMBER: _ClassVar[int]
    MAX_RESULTS_FIELD_NUMBER: _ClassVar[int]
    type: Feature.Type
    max_results: int
    def __init__(self, type: _Optional[_Union[Feature.Type, str]] = ..., max_results: _Optional[int] = ...) -> None: ...
