from google.protobuf import timestamp_pb2 as _timestamp_pb2
from ssn.type import candidate_pb2 as _candidate_pb2
from google.protobuf.internal import containers as _containers
from google.protobuf.internal import enum_type_wrapper as _enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Iterable as _Iterable, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class TrustVerdict(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
    __slots__ = ()
    TRUST_VERDICT_UNSPECIFIED: _ClassVar[TrustVerdict]
    NEW: _ClassVar[TrustVerdict]
    KNOWN: _ClassVar[TrustVerdict]

class EnrichmentStatus(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
    __slots__ = ()
    ENRICHMENT_STATUS_UNSPECIFIED: _ClassVar[EnrichmentStatus]
    PENDING: _ClassVar[EnrichmentStatus]
    ENRICHED: _ClassVar[EnrichmentStatus]
    FAILED: _ClassVar[EnrichmentStatus]
TRUST_VERDICT_UNSPECIFIED: TrustVerdict
NEW: TrustVerdict
KNOWN: TrustVerdict
ENRICHMENT_STATUS_UNSPECIFIED: EnrichmentStatus
PENDING: EnrichmentStatus
ENRICHED: EnrichmentStatus
FAILED: EnrichmentStatus

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

class BankAccountVerdict(_message.Message):
    __slots__ = ("account_key", "verdict", "observed_count_tenant", "observed_count_global", "first_seen", "last_seen")
    ACCOUNT_KEY_FIELD_NUMBER: _ClassVar[int]
    VERDICT_FIELD_NUMBER: _ClassVar[int]
    OBSERVED_COUNT_TENANT_FIELD_NUMBER: _ClassVar[int]
    OBSERVED_COUNT_GLOBAL_FIELD_NUMBER: _ClassVar[int]
    FIRST_SEEN_FIELD_NUMBER: _ClassVar[int]
    LAST_SEEN_FIELD_NUMBER: _ClassVar[int]
    account_key: str
    verdict: TrustVerdict
    observed_count_tenant: int
    observed_count_global: int
    first_seen: _timestamp_pb2.Timestamp
    last_seen: _timestamp_pb2.Timestamp
    def __init__(self, account_key: _Optional[str] = ..., verdict: _Optional[_Union[TrustVerdict, str]] = ..., observed_count_tenant: _Optional[int] = ..., observed_count_global: _Optional[int] = ..., first_seen: _Optional[_Union[_timestamp_pb2.Timestamp, _Mapping]] = ..., last_seen: _Optional[_Union[_timestamp_pb2.Timestamp, _Mapping]] = ...) -> None: ...

class EnrichedCompany(_message.Message):
    __slots__ = ("company_key", "registry_name", "registry_address", "vat_valid", "industry", "enrichment_status")
    COMPANY_KEY_FIELD_NUMBER: _ClassVar[int]
    REGISTRY_NAME_FIELD_NUMBER: _ClassVar[int]
    REGISTRY_ADDRESS_FIELD_NUMBER: _ClassVar[int]
    VAT_VALID_FIELD_NUMBER: _ClassVar[int]
    INDUSTRY_FIELD_NUMBER: _ClassVar[int]
    ENRICHMENT_STATUS_FIELD_NUMBER: _ClassVar[int]
    company_key: str
    registry_name: str
    registry_address: str
    vat_valid: bool
    industry: str
    enrichment_status: EnrichmentStatus
    def __init__(self, company_key: _Optional[str] = ..., registry_name: _Optional[str] = ..., registry_address: _Optional[str] = ..., vat_valid: bool = ..., industry: _Optional[str] = ..., enrichment_status: _Optional[_Union[EnrichmentStatus, str]] = ...) -> None: ...

class ProcessInvoiceCompanyDataResponse(_message.Message):
    __slots__ = ("supplier", "bank_account_verdicts")
    SUPPLIER_FIELD_NUMBER: _ClassVar[int]
    BANK_ACCOUNT_VERDICTS_FIELD_NUMBER: _ClassVar[int]
    supplier: EnrichedCompany
    bank_account_verdicts: _containers.RepeatedCompositeFieldContainer[BankAccountVerdict]
    def __init__(self, supplier: _Optional[_Union[EnrichedCompany, _Mapping]] = ..., bank_account_verdicts: _Optional[_Iterable[_Union[BankAccountVerdict, _Mapping]]] = ...) -> None: ...
