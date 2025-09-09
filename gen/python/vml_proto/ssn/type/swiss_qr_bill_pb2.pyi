from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class SwissQrBill(_message.Message):
    __slots__ = ("payment", "is_valid", "validation_error")
    PAYMENT_FIELD_NUMBER: _ClassVar[int]
    IS_VALID_FIELD_NUMBER: _ClassVar[int]
    VALIDATION_ERROR_FIELD_NUMBER: _ClassVar[int]
    payment: SwissQrPayment
    is_valid: bool
    validation_error: str
    def __init__(self, payment: _Optional[_Union[SwissQrPayment, _Mapping]] = ..., is_valid: bool = ..., validation_error: _Optional[str] = ...) -> None: ...

class SwissQrPayment(_message.Message):
    __slots__ = ("qr_type", "version", "coding_type", "account", "creditor_address_type", "creditor_name", "creditor_field_1", "creditor_field_2", "creditor_field_3", "creditor_field_4", "creditor_country", "ultimate_creditor_address_type", "ultimate_creditor_name", "ultimate_creditor_field_1", "ultimate_creditor_field_2", "ultimate_creditor_field_3", "ultimate_creditor_field_4", "ultimate_creditor_country", "amount", "currency", "ultimate_debtor_address_type", "ultimate_debtor_name", "ultimate_debtor_field_1", "ultimate_debtor_field_2", "ultimate_debtor_field_3", "ultimate_debtor_field_4", "ultimate_debtor_country", "payment_reference_type", "payment_reference", "unstructured_message", "bill_information", "trailer")
    QR_TYPE_FIELD_NUMBER: _ClassVar[int]
    VERSION_FIELD_NUMBER: _ClassVar[int]
    CODING_TYPE_FIELD_NUMBER: _ClassVar[int]
    ACCOUNT_FIELD_NUMBER: _ClassVar[int]
    CREDITOR_ADDRESS_TYPE_FIELD_NUMBER: _ClassVar[int]
    CREDITOR_NAME_FIELD_NUMBER: _ClassVar[int]
    CREDITOR_FIELD_1_FIELD_NUMBER: _ClassVar[int]
    CREDITOR_FIELD_2_FIELD_NUMBER: _ClassVar[int]
    CREDITOR_FIELD_3_FIELD_NUMBER: _ClassVar[int]
    CREDITOR_FIELD_4_FIELD_NUMBER: _ClassVar[int]
    CREDITOR_COUNTRY_FIELD_NUMBER: _ClassVar[int]
    ULTIMATE_CREDITOR_ADDRESS_TYPE_FIELD_NUMBER: _ClassVar[int]
    ULTIMATE_CREDITOR_NAME_FIELD_NUMBER: _ClassVar[int]
    ULTIMATE_CREDITOR_FIELD_1_FIELD_NUMBER: _ClassVar[int]
    ULTIMATE_CREDITOR_FIELD_2_FIELD_NUMBER: _ClassVar[int]
    ULTIMATE_CREDITOR_FIELD_3_FIELD_NUMBER: _ClassVar[int]
    ULTIMATE_CREDITOR_FIELD_4_FIELD_NUMBER: _ClassVar[int]
    ULTIMATE_CREDITOR_COUNTRY_FIELD_NUMBER: _ClassVar[int]
    AMOUNT_FIELD_NUMBER: _ClassVar[int]
    CURRENCY_FIELD_NUMBER: _ClassVar[int]
    ULTIMATE_DEBTOR_ADDRESS_TYPE_FIELD_NUMBER: _ClassVar[int]
    ULTIMATE_DEBTOR_NAME_FIELD_NUMBER: _ClassVar[int]
    ULTIMATE_DEBTOR_FIELD_1_FIELD_NUMBER: _ClassVar[int]
    ULTIMATE_DEBTOR_FIELD_2_FIELD_NUMBER: _ClassVar[int]
    ULTIMATE_DEBTOR_FIELD_3_FIELD_NUMBER: _ClassVar[int]
    ULTIMATE_DEBTOR_FIELD_4_FIELD_NUMBER: _ClassVar[int]
    ULTIMATE_DEBTOR_COUNTRY_FIELD_NUMBER: _ClassVar[int]
    PAYMENT_REFERENCE_TYPE_FIELD_NUMBER: _ClassVar[int]
    PAYMENT_REFERENCE_FIELD_NUMBER: _ClassVar[int]
    UNSTRUCTURED_MESSAGE_FIELD_NUMBER: _ClassVar[int]
    BILL_INFORMATION_FIELD_NUMBER: _ClassVar[int]
    TRAILER_FIELD_NUMBER: _ClassVar[int]
    qr_type: str
    version: str
    coding_type: str
    account: str
    creditor_address_type: str
    creditor_name: str
    creditor_field_1: str
    creditor_field_2: str
    creditor_field_3: str
    creditor_field_4: str
    creditor_country: str
    ultimate_creditor_address_type: str
    ultimate_creditor_name: str
    ultimate_creditor_field_1: str
    ultimate_creditor_field_2: str
    ultimate_creditor_field_3: str
    ultimate_creditor_field_4: str
    ultimate_creditor_country: str
    amount: str
    currency: str
    ultimate_debtor_address_type: str
    ultimate_debtor_name: str
    ultimate_debtor_field_1: str
    ultimate_debtor_field_2: str
    ultimate_debtor_field_3: str
    ultimate_debtor_field_4: str
    ultimate_debtor_country: str
    payment_reference_type: str
    payment_reference: str
    unstructured_message: str
    bill_information: str
    trailer: str
    def __init__(self, qr_type: _Optional[str] = ..., version: _Optional[str] = ..., coding_type: _Optional[str] = ..., account: _Optional[str] = ..., creditor_address_type: _Optional[str] = ..., creditor_name: _Optional[str] = ..., creditor_field_1: _Optional[str] = ..., creditor_field_2: _Optional[str] = ..., creditor_field_3: _Optional[str] = ..., creditor_field_4: _Optional[str] = ..., creditor_country: _Optional[str] = ..., ultimate_creditor_address_type: _Optional[str] = ..., ultimate_creditor_name: _Optional[str] = ..., ultimate_creditor_field_1: _Optional[str] = ..., ultimate_creditor_field_2: _Optional[str] = ..., ultimate_creditor_field_3: _Optional[str] = ..., ultimate_creditor_field_4: _Optional[str] = ..., ultimate_creditor_country: _Optional[str] = ..., amount: _Optional[str] = ..., currency: _Optional[str] = ..., ultimate_debtor_address_type: _Optional[str] = ..., ultimate_debtor_name: _Optional[str] = ..., ultimate_debtor_field_1: _Optional[str] = ..., ultimate_debtor_field_2: _Optional[str] = ..., ultimate_debtor_field_3: _Optional[str] = ..., ultimate_debtor_field_4: _Optional[str] = ..., ultimate_debtor_country: _Optional[str] = ..., payment_reference_type: _Optional[str] = ..., payment_reference: _Optional[str] = ..., unstructured_message: _Optional[str] = ..., bill_information: _Optional[str] = ..., trailer: _Optional[str] = ...) -> None: ...
