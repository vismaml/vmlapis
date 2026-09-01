from ssn.type import candidate_pb2 as _candidate_pb2
from google.protobuf.internal import containers as _containers
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Iterable as _Iterable, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class ProcessInvoiceCompanyDataRequest(_message.Message):
    __slots__ = ("project_name", "transaction_id", "supplier_name", "supplier_vat_number", "supplier_organisation_number", "supplier_country_code", "supplier_address", "receiver_name", "receiver_vat_number", "receiver_organisation_number", "receiver_country_code", "receiver_address", "iban", "bic", "bank_account_number", "bank_registration_number", "product_types")
    PROJECT_NAME_FIELD_NUMBER: _ClassVar[int]
    TRANSACTION_ID_FIELD_NUMBER: _ClassVar[int]
    SUPPLIER_NAME_FIELD_NUMBER: _ClassVar[int]
    SUPPLIER_VAT_NUMBER_FIELD_NUMBER: _ClassVar[int]
    SUPPLIER_ORGANISATION_NUMBER_FIELD_NUMBER: _ClassVar[int]
    SUPPLIER_COUNTRY_CODE_FIELD_NUMBER: _ClassVar[int]
    SUPPLIER_ADDRESS_FIELD_NUMBER: _ClassVar[int]
    RECEIVER_NAME_FIELD_NUMBER: _ClassVar[int]
    RECEIVER_VAT_NUMBER_FIELD_NUMBER: _ClassVar[int]
    RECEIVER_ORGANISATION_NUMBER_FIELD_NUMBER: _ClassVar[int]
    RECEIVER_COUNTRY_CODE_FIELD_NUMBER: _ClassVar[int]
    RECEIVER_ADDRESS_FIELD_NUMBER: _ClassVar[int]
    IBAN_FIELD_NUMBER: _ClassVar[int]
    BIC_FIELD_NUMBER: _ClassVar[int]
    BANK_ACCOUNT_NUMBER_FIELD_NUMBER: _ClassVar[int]
    BANK_REGISTRATION_NUMBER_FIELD_NUMBER: _ClassVar[int]
    PRODUCT_TYPES_FIELD_NUMBER: _ClassVar[int]
    project_name: str
    transaction_id: str
    supplier_name: _candidate_pb2.Candidate
    supplier_vat_number: _candidate_pb2.Candidate
    supplier_organisation_number: _candidate_pb2.Candidate
    supplier_country_code: _candidate_pb2.Candidate
    supplier_address: _candidate_pb2.Candidate
    receiver_name: _candidate_pb2.Candidate
    receiver_vat_number: _candidate_pb2.Candidate
    receiver_organisation_number: _candidate_pb2.Candidate
    receiver_country_code: _candidate_pb2.Candidate
    receiver_address: _candidate_pb2.Candidate
    iban: _candidate_pb2.Candidate
    bic: _candidate_pb2.Candidate
    bank_account_number: _candidate_pb2.Candidate
    bank_registration_number: _candidate_pb2.Candidate
    product_types: _containers.RepeatedScalarFieldContainer[str]
    def __init__(self, project_name: _Optional[str] = ..., transaction_id: _Optional[str] = ..., supplier_name: _Optional[_Union[_candidate_pb2.Candidate, _Mapping]] = ..., supplier_vat_number: _Optional[_Union[_candidate_pb2.Candidate, _Mapping]] = ..., supplier_organisation_number: _Optional[_Union[_candidate_pb2.Candidate, _Mapping]] = ..., supplier_country_code: _Optional[_Union[_candidate_pb2.Candidate, _Mapping]] = ..., supplier_address: _Optional[_Union[_candidate_pb2.Candidate, _Mapping]] = ..., receiver_name: _Optional[_Union[_candidate_pb2.Candidate, _Mapping]] = ..., receiver_vat_number: _Optional[_Union[_candidate_pb2.Candidate, _Mapping]] = ..., receiver_organisation_number: _Optional[_Union[_candidate_pb2.Candidate, _Mapping]] = ..., receiver_country_code: _Optional[_Union[_candidate_pb2.Candidate, _Mapping]] = ..., receiver_address: _Optional[_Union[_candidate_pb2.Candidate, _Mapping]] = ..., iban: _Optional[_Union[_candidate_pb2.Candidate, _Mapping]] = ..., bic: _Optional[_Union[_candidate_pb2.Candidate, _Mapping]] = ..., bank_account_number: _Optional[_Union[_candidate_pb2.Candidate, _Mapping]] = ..., bank_registration_number: _Optional[_Union[_candidate_pb2.Candidate, _Mapping]] = ..., product_types: _Optional[_Iterable[str]] = ...) -> None: ...

class ProcessInvoiceCompanyDataResponse(_message.Message):
    __slots__ = ("supplier_vat_valid",)
    SUPPLIER_VAT_VALID_FIELD_NUMBER: _ClassVar[int]
    supplier_vat_valid: bool
    def __init__(self, supplier_vat_valid: bool = ...) -> None: ...

class VerifySupplierRequest(_message.Message):
    __slots__ = ("country_code", "vat_number", "organisation_number")
    COUNTRY_CODE_FIELD_NUMBER: _ClassVar[int]
    VAT_NUMBER_FIELD_NUMBER: _ClassVar[int]
    ORGANISATION_NUMBER_FIELD_NUMBER: _ClassVar[int]
    country_code: str
    vat_number: str
    organisation_number: str
    def __init__(self, country_code: _Optional[str] = ..., vat_number: _Optional[str] = ..., organisation_number: _Optional[str] = ...) -> None: ...

class VerifySupplierResponse(_message.Message):
    __slots__ = ("verified",)
    VERIFIED_FIELD_NUMBER: _ClassVar[int]
    verified: bool
    def __init__(self, verified: bool = ...) -> None: ...
