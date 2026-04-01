from ssn.type import candidate_pb2 as _candidate_pb2
from google.protobuf.internal import containers as _containers
from google.protobuf.internal import enum_type_wrapper as _enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Iterable as _Iterable, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class AddressFeature(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
    __slots__ = ()
    ADDRESS_FEATURE_UNSPECIFIED: _ClassVar[AddressFeature]
    SUPPLIER_ADDRESS: _ClassVar[AddressFeature]
    RECEIVER_ADDRESS: _ClassVar[AddressFeature]
ADDRESS_FEATURE_UNSPECIFIED: AddressFeature
SUPPLIER_ADDRESS: AddressFeature
RECEIVER_ADDRESS: AddressFeature

class StructuredAddress(_message.Message):
    __slots__ = ("street", "house_number", "postal_code", "city", "state", "country", "country_code", "latitude", "longitude", "formatted_address")
    STREET_FIELD_NUMBER: _ClassVar[int]
    HOUSE_NUMBER_FIELD_NUMBER: _ClassVar[int]
    POSTAL_CODE_FIELD_NUMBER: _ClassVar[int]
    CITY_FIELD_NUMBER: _ClassVar[int]
    STATE_FIELD_NUMBER: _ClassVar[int]
    COUNTRY_FIELD_NUMBER: _ClassVar[int]
    COUNTRY_CODE_FIELD_NUMBER: _ClassVar[int]
    LATITUDE_FIELD_NUMBER: _ClassVar[int]
    LONGITUDE_FIELD_NUMBER: _ClassVar[int]
    FORMATTED_ADDRESS_FIELD_NUMBER: _ClassVar[int]
    street: str
    house_number: str
    postal_code: str
    city: str
    state: str
    country: str
    country_code: str
    latitude: float
    longitude: float
    formatted_address: str
    def __init__(self, street: _Optional[str] = ..., house_number: _Optional[str] = ..., postal_code: _Optional[str] = ..., city: _Optional[str] = ..., state: _Optional[str] = ..., country: _Optional[str] = ..., country_code: _Optional[str] = ..., latitude: _Optional[float] = ..., longitude: _Optional[float] = ..., formatted_address: _Optional[str] = ...) -> None: ...

class ValidateAddressRequest(_message.Message):
    __slots__ = ("raw_address", "feature", "document_id")
    RAW_ADDRESS_FIELD_NUMBER: _ClassVar[int]
    FEATURE_FIELD_NUMBER: _ClassVar[int]
    DOCUMENT_ID_FIELD_NUMBER: _ClassVar[int]
    raw_address: str
    feature: AddressFeature
    document_id: str
    def __init__(self, raw_address: _Optional[str] = ..., feature: _Optional[_Union[AddressFeature, str]] = ..., document_id: _Optional[str] = ...) -> None: ...

class ValidateAddressResponse(_message.Message):
    __slots__ = ("valid", "confidence", "address", "raw_input", "feature")
    VALID_FIELD_NUMBER: _ClassVar[int]
    CONFIDENCE_FIELD_NUMBER: _ClassVar[int]
    ADDRESS_FIELD_NUMBER: _ClassVar[int]
    RAW_INPUT_FIELD_NUMBER: _ClassVar[int]
    FEATURE_FIELD_NUMBER: _ClassVar[int]
    valid: bool
    confidence: _candidate_pb2.Confidence
    address: StructuredAddress
    raw_input: str
    feature: AddressFeature
    def __init__(self, valid: bool = ..., confidence: _Optional[_Union[_candidate_pb2.Confidence, _Mapping]] = ..., address: _Optional[_Union[StructuredAddress, _Mapping]] = ..., raw_input: _Optional[str] = ..., feature: _Optional[_Union[AddressFeature, str]] = ...) -> None: ...

class ValidateAddressesRequest(_message.Message):
    __slots__ = ("addresses",)
    ADDRESSES_FIELD_NUMBER: _ClassVar[int]
    addresses: _containers.RepeatedCompositeFieldContainer[ValidateAddressRequest]
    def __init__(self, addresses: _Optional[_Iterable[_Union[ValidateAddressRequest, _Mapping]]] = ...) -> None: ...

class ValidateAddressesResponse(_message.Message):
    __slots__ = ("results",)
    RESULTS_FIELD_NUMBER: _ClassVar[int]
    results: _containers.RepeatedCompositeFieldContainer[ValidateAddressResponse]
    def __init__(self, results: _Optional[_Iterable[_Union[ValidateAddressResponse, _Mapping]]] = ...) -> None: ...
