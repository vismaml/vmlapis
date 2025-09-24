from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Optional as _Optional

DESCRIPTOR: _descriptor.FileDescriptor

class QrCodeData(_message.Message):
    __slots__ = ("content",)
    CONTENT_FIELD_NUMBER: _ClassVar[int]
    content: str
    def __init__(self, content: _Optional[str] = ...) -> None: ...

class SwissQrBill(_message.Message):
    __slots__ = ("qr_type", "version", "coding_type", "account", "creditor_address_type", "creditor_name", "creditor_address_line_1", "creditor_address_line_2", "creditor_address_postal_code", "creditor_address_city", "creditor_address_country", "ultimate_creditor_address_type", "ultimate_creditor_name", "ultimate_creditor_address_line_1", "ultimate_creditor_address_line_2", "ultimate_creditor_address_postal_code", "ultimate_creditor_address_city", "ultimate_creditor_address_country", "amount", "currency", "ultimate_debtor_address_type", "ultimate_debtor_name", "ultimate_debtor_address_line_1", "ultimate_debtor_address_line_2", "ultimate_debtor_address_postal_code", "ultimate_debtor_address_city", "ultimate_debtor_address_country", "payment_reference_type", "payment_reference", "unstructured_message", "trailer", "billing_information", "av1_parameters", "av2_parameters")
    QR_TYPE_FIELD_NUMBER: _ClassVar[int]
    VERSION_FIELD_NUMBER: _ClassVar[int]
    CODING_TYPE_FIELD_NUMBER: _ClassVar[int]
    ACCOUNT_FIELD_NUMBER: _ClassVar[int]
    CREDITOR_ADDRESS_TYPE_FIELD_NUMBER: _ClassVar[int]
    CREDITOR_NAME_FIELD_NUMBER: _ClassVar[int]
    CREDITOR_ADDRESS_LINE_1_FIELD_NUMBER: _ClassVar[int]
    CREDITOR_ADDRESS_LINE_2_FIELD_NUMBER: _ClassVar[int]
    CREDITOR_ADDRESS_POSTAL_CODE_FIELD_NUMBER: _ClassVar[int]
    CREDITOR_ADDRESS_CITY_FIELD_NUMBER: _ClassVar[int]
    CREDITOR_ADDRESS_COUNTRY_FIELD_NUMBER: _ClassVar[int]
    ULTIMATE_CREDITOR_ADDRESS_TYPE_FIELD_NUMBER: _ClassVar[int]
    ULTIMATE_CREDITOR_NAME_FIELD_NUMBER: _ClassVar[int]
    ULTIMATE_CREDITOR_ADDRESS_LINE_1_FIELD_NUMBER: _ClassVar[int]
    ULTIMATE_CREDITOR_ADDRESS_LINE_2_FIELD_NUMBER: _ClassVar[int]
    ULTIMATE_CREDITOR_ADDRESS_POSTAL_CODE_FIELD_NUMBER: _ClassVar[int]
    ULTIMATE_CREDITOR_ADDRESS_CITY_FIELD_NUMBER: _ClassVar[int]
    ULTIMATE_CREDITOR_ADDRESS_COUNTRY_FIELD_NUMBER: _ClassVar[int]
    AMOUNT_FIELD_NUMBER: _ClassVar[int]
    CURRENCY_FIELD_NUMBER: _ClassVar[int]
    ULTIMATE_DEBTOR_ADDRESS_TYPE_FIELD_NUMBER: _ClassVar[int]
    ULTIMATE_DEBTOR_NAME_FIELD_NUMBER: _ClassVar[int]
    ULTIMATE_DEBTOR_ADDRESS_LINE_1_FIELD_NUMBER: _ClassVar[int]
    ULTIMATE_DEBTOR_ADDRESS_LINE_2_FIELD_NUMBER: _ClassVar[int]
    ULTIMATE_DEBTOR_ADDRESS_POSTAL_CODE_FIELD_NUMBER: _ClassVar[int]
    ULTIMATE_DEBTOR_ADDRESS_CITY_FIELD_NUMBER: _ClassVar[int]
    ULTIMATE_DEBTOR_ADDRESS_COUNTRY_FIELD_NUMBER: _ClassVar[int]
    PAYMENT_REFERENCE_TYPE_FIELD_NUMBER: _ClassVar[int]
    PAYMENT_REFERENCE_FIELD_NUMBER: _ClassVar[int]
    UNSTRUCTURED_MESSAGE_FIELD_NUMBER: _ClassVar[int]
    TRAILER_FIELD_NUMBER: _ClassVar[int]
    BILLING_INFORMATION_FIELD_NUMBER: _ClassVar[int]
    AV1_PARAMETERS_FIELD_NUMBER: _ClassVar[int]
    AV2_PARAMETERS_FIELD_NUMBER: _ClassVar[int]
    qr_type: str
    version: str
    coding_type: str
    account: str
    creditor_address_type: str
    creditor_name: str
    creditor_address_line_1: str
    creditor_address_line_2: str
    creditor_address_postal_code: str
    creditor_address_city: str
    creditor_address_country: str
    ultimate_creditor_address_type: str
    ultimate_creditor_name: str
    ultimate_creditor_address_line_1: str
    ultimate_creditor_address_line_2: str
    ultimate_creditor_address_postal_code: str
    ultimate_creditor_address_city: str
    ultimate_creditor_address_country: str
    amount: str
    currency: str
    ultimate_debtor_address_type: str
    ultimate_debtor_name: str
    ultimate_debtor_address_line_1: str
    ultimate_debtor_address_line_2: str
    ultimate_debtor_address_postal_code: str
    ultimate_debtor_address_city: str
    ultimate_debtor_address_country: str
    payment_reference_type: str
    payment_reference: str
    unstructured_message: str
    trailer: str
    billing_information: str
    av1_parameters: str
    av2_parameters: str
    def __init__(self, qr_type: _Optional[str] = ..., version: _Optional[str] = ..., coding_type: _Optional[str] = ..., account: _Optional[str] = ..., creditor_address_type: _Optional[str] = ..., creditor_name: _Optional[str] = ..., creditor_address_line_1: _Optional[str] = ..., creditor_address_line_2: _Optional[str] = ..., creditor_address_postal_code: _Optional[str] = ..., creditor_address_city: _Optional[str] = ..., creditor_address_country: _Optional[str] = ..., ultimate_creditor_address_type: _Optional[str] = ..., ultimate_creditor_name: _Optional[str] = ..., ultimate_creditor_address_line_1: _Optional[str] = ..., ultimate_creditor_address_line_2: _Optional[str] = ..., ultimate_creditor_address_postal_code: _Optional[str] = ..., ultimate_creditor_address_city: _Optional[str] = ..., ultimate_creditor_address_country: _Optional[str] = ..., amount: _Optional[str] = ..., currency: _Optional[str] = ..., ultimate_debtor_address_type: _Optional[str] = ..., ultimate_debtor_name: _Optional[str] = ..., ultimate_debtor_address_line_1: _Optional[str] = ..., ultimate_debtor_address_line_2: _Optional[str] = ..., ultimate_debtor_address_postal_code: _Optional[str] = ..., ultimate_debtor_address_city: _Optional[str] = ..., ultimate_debtor_address_country: _Optional[str] = ..., payment_reference_type: _Optional[str] = ..., payment_reference: _Optional[str] = ..., unstructured_message: _Optional[str] = ..., trailer: _Optional[str] = ..., billing_information: _Optional[str] = ..., av1_parameters: _Optional[str] = ..., av2_parameters: _Optional[str] = ...) -> None: ...
