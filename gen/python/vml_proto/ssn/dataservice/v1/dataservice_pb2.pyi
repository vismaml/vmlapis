from gen_bq_schema import bq_field_pb2 as _bq_field_pb2
from gen_bq_schema import bq_table_pb2 as _bq_table_pb2
from google.api import annotations_pb2 as _annotations_pb2
from google.protobuf import empty_pb2 as _empty_pb2
from google.protobuf import wrappers_pb2 as _wrappers_pb2
from google.type import date_pb2 as _date_pb2
from ssn.type import candidate_pb2 as _candidate_pb2
from ssn.type import text_annotation_pb2 as _text_annotation_pb2
from ssn.type import tier_pb2 as _tier_pb2
from google.protobuf.internal import containers as _containers
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Iterable as _Iterable, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class Document(_message.Message):
    __slots__ = ("ta", "bytes", "id", "consumer", "tags", "true_values", "prediction_values", "feedback_time", "prediction_confidences", "prediction_metadata")
    TA_FIELD_NUMBER: _ClassVar[int]
    BYTES_FIELD_NUMBER: _ClassVar[int]
    ID_FIELD_NUMBER: _ClassVar[int]
    CONSUMER_FIELD_NUMBER: _ClassVar[int]
    TAGS_FIELD_NUMBER: _ClassVar[int]
    TRUE_VALUES_FIELD_NUMBER: _ClassVar[int]
    PREDICTION_VALUES_FIELD_NUMBER: _ClassVar[int]
    FEEDBACK_TIME_FIELD_NUMBER: _ClassVar[int]
    PREDICTION_CONFIDENCES_FIELD_NUMBER: _ClassVar[int]
    PREDICTION_METADATA_FIELD_NUMBER: _ClassVar[int]
    ta: _text_annotation_pb2.TextAnnotation
    bytes: bytes
    id: str
    consumer: str
    tags: _containers.RepeatedScalarFieldContainer[str]
    true_values: TrueValues
    prediction_values: PredictionValues
    feedback_time: int
    prediction_confidences: PredictionConfidences
    prediction_metadata: PredictionMetadata
    def __init__(self, ta: _Optional[_Union[_text_annotation_pb2.TextAnnotation, _Mapping]] = ..., bytes: _Optional[bytes] = ..., id: _Optional[str] = ..., consumer: _Optional[str] = ..., tags: _Optional[_Iterable[str]] = ..., true_values: _Optional[_Union[TrueValues, _Mapping]] = ..., prediction_values: _Optional[_Union[PredictionValues, _Mapping]] = ..., feedback_time: _Optional[int] = ..., prediction_confidences: _Optional[_Union[PredictionConfidences, _Mapping]] = ..., prediction_metadata: _Optional[_Union[PredictionMetadata, _Mapping]] = ...) -> None: ...

class TrueValues(_message.Message):
    __slots__ = ("total_incl_vat", "total_vat", "total_excl_vat", "order_date", "payment_due_date", "document_type", "currency", "credit_card_last_four", "payment_method", "ocr_line_dk_type", "ocr_line_dk_payment_id", "ocr_line_dk_creditor_id", "ocr_line_se_payment_id", "ocr_line_se_bankgiro_creditor_id", "ocr_line_se_plusgiro_creditor_id", "ocr_line_no_payment_id", "ocr_line_fi_payment_id", "ocr_line_nl_payment_id", "supplier_corporate_id", "supplier_country_code", "invoice_number", "iban", "order_reference", "bank_account_number", "bank_registration_number", "supplier_name", "bic", "document_number", "document_date", "order_number", "supplier_vat_number", "supplier_organisation_number", "supplier_address", "customer_number", "receiver_order_number", "ocr_line_be_payment_id", "receiver_address", "receiver_country_code", "receiver_name", "receiver_vat_number", "purchase_lines", "answers", "vat_distribution")
    TOTAL_INCL_VAT_FIELD_NUMBER: _ClassVar[int]
    TOTAL_VAT_FIELD_NUMBER: _ClassVar[int]
    TOTAL_EXCL_VAT_FIELD_NUMBER: _ClassVar[int]
    ORDER_DATE_FIELD_NUMBER: _ClassVar[int]
    PAYMENT_DUE_DATE_FIELD_NUMBER: _ClassVar[int]
    DOCUMENT_TYPE_FIELD_NUMBER: _ClassVar[int]
    CURRENCY_FIELD_NUMBER: _ClassVar[int]
    CREDIT_CARD_LAST_FOUR_FIELD_NUMBER: _ClassVar[int]
    PAYMENT_METHOD_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_DK_TYPE_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_DK_PAYMENT_ID_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_DK_CREDITOR_ID_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_SE_PAYMENT_ID_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_SE_BANKGIRO_CREDITOR_ID_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_SE_PLUSGIRO_CREDITOR_ID_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_NO_PAYMENT_ID_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_FI_PAYMENT_ID_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_NL_PAYMENT_ID_FIELD_NUMBER: _ClassVar[int]
    SUPPLIER_CORPORATE_ID_FIELD_NUMBER: _ClassVar[int]
    SUPPLIER_COUNTRY_CODE_FIELD_NUMBER: _ClassVar[int]
    INVOICE_NUMBER_FIELD_NUMBER: _ClassVar[int]
    IBAN_FIELD_NUMBER: _ClassVar[int]
    ORDER_REFERENCE_FIELD_NUMBER: _ClassVar[int]
    BANK_ACCOUNT_NUMBER_FIELD_NUMBER: _ClassVar[int]
    BANK_REGISTRATION_NUMBER_FIELD_NUMBER: _ClassVar[int]
    SUPPLIER_NAME_FIELD_NUMBER: _ClassVar[int]
    BIC_FIELD_NUMBER: _ClassVar[int]
    DOCUMENT_NUMBER_FIELD_NUMBER: _ClassVar[int]
    DOCUMENT_DATE_FIELD_NUMBER: _ClassVar[int]
    ORDER_NUMBER_FIELD_NUMBER: _ClassVar[int]
    SUPPLIER_VAT_NUMBER_FIELD_NUMBER: _ClassVar[int]
    SUPPLIER_ORGANISATION_NUMBER_FIELD_NUMBER: _ClassVar[int]
    SUPPLIER_ADDRESS_FIELD_NUMBER: _ClassVar[int]
    CUSTOMER_NUMBER_FIELD_NUMBER: _ClassVar[int]
    RECEIVER_ORDER_NUMBER_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_BE_PAYMENT_ID_FIELD_NUMBER: _ClassVar[int]
    RECEIVER_ADDRESS_FIELD_NUMBER: _ClassVar[int]
    RECEIVER_COUNTRY_CODE_FIELD_NUMBER: _ClassVar[int]
    RECEIVER_NAME_FIELD_NUMBER: _ClassVar[int]
    RECEIVER_VAT_NUMBER_FIELD_NUMBER: _ClassVar[int]
    PURCHASE_LINES_FIELD_NUMBER: _ClassVar[int]
    ANSWERS_FIELD_NUMBER: _ClassVar[int]
    VAT_DISTRIBUTION_FIELD_NUMBER: _ClassVar[int]
    total_incl_vat: _wrappers_pb2.DoubleValue
    total_vat: _wrappers_pb2.DoubleValue
    total_excl_vat: _wrappers_pb2.DoubleValue
    order_date: _date_pb2.Date
    payment_due_date: _date_pb2.Date
    document_type: _wrappers_pb2.StringValue
    currency: _wrappers_pb2.StringValue
    credit_card_last_four: _wrappers_pb2.StringValue
    payment_method: _wrappers_pb2.StringValue
    ocr_line_dk_type: _wrappers_pb2.StringValue
    ocr_line_dk_payment_id: _wrappers_pb2.StringValue
    ocr_line_dk_creditor_id: _wrappers_pb2.StringValue
    ocr_line_se_payment_id: _wrappers_pb2.StringValue
    ocr_line_se_bankgiro_creditor_id: _wrappers_pb2.StringValue
    ocr_line_se_plusgiro_creditor_id: _wrappers_pb2.StringValue
    ocr_line_no_payment_id: _wrappers_pb2.StringValue
    ocr_line_fi_payment_id: _wrappers_pb2.StringValue
    ocr_line_nl_payment_id: _wrappers_pb2.StringValue
    supplier_corporate_id: _wrappers_pb2.StringValue
    supplier_country_code: _wrappers_pb2.StringValue
    invoice_number: _wrappers_pb2.StringValue
    iban: _wrappers_pb2.StringValue
    order_reference: _wrappers_pb2.StringValue
    bank_account_number: _wrappers_pb2.StringValue
    bank_registration_number: _wrappers_pb2.StringValue
    supplier_name: _wrappers_pb2.StringValue
    bic: _wrappers_pb2.StringValue
    document_number: _wrappers_pb2.StringValue
    document_date: _date_pb2.Date
    order_number: _wrappers_pb2.StringValue
    supplier_vat_number: _wrappers_pb2.StringValue
    supplier_organisation_number: _wrappers_pb2.StringValue
    supplier_address: _wrappers_pb2.StringValue
    customer_number: _wrappers_pb2.StringValue
    receiver_order_number: _wrappers_pb2.StringValue
    ocr_line_be_payment_id: _wrappers_pb2.StringValue
    receiver_address: _wrappers_pb2.StringValue
    receiver_country_code: _wrappers_pb2.StringValue
    receiver_name: _wrappers_pb2.StringValue
    receiver_vat_number: _wrappers_pb2.StringValue
    purchase_lines: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.PurchaseLineCandidate]
    answers: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.AnswerCandidate]
    vat_distribution: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.VatDistributionCandidate]
    def __init__(self, total_incl_vat: _Optional[_Union[_wrappers_pb2.DoubleValue, _Mapping]] = ..., total_vat: _Optional[_Union[_wrappers_pb2.DoubleValue, _Mapping]] = ..., total_excl_vat: _Optional[_Union[_wrappers_pb2.DoubleValue, _Mapping]] = ..., order_date: _Optional[_Union[_date_pb2.Date, _Mapping]] = ..., payment_due_date: _Optional[_Union[_date_pb2.Date, _Mapping]] = ..., document_type: _Optional[_Union[_wrappers_pb2.StringValue, _Mapping]] = ..., currency: _Optional[_Union[_wrappers_pb2.StringValue, _Mapping]] = ..., credit_card_last_four: _Optional[_Union[_wrappers_pb2.StringValue, _Mapping]] = ..., payment_method: _Optional[_Union[_wrappers_pb2.StringValue, _Mapping]] = ..., ocr_line_dk_type: _Optional[_Union[_wrappers_pb2.StringValue, _Mapping]] = ..., ocr_line_dk_payment_id: _Optional[_Union[_wrappers_pb2.StringValue, _Mapping]] = ..., ocr_line_dk_creditor_id: _Optional[_Union[_wrappers_pb2.StringValue, _Mapping]] = ..., ocr_line_se_payment_id: _Optional[_Union[_wrappers_pb2.StringValue, _Mapping]] = ..., ocr_line_se_bankgiro_creditor_id: _Optional[_Union[_wrappers_pb2.StringValue, _Mapping]] = ..., ocr_line_se_plusgiro_creditor_id: _Optional[_Union[_wrappers_pb2.StringValue, _Mapping]] = ..., ocr_line_no_payment_id: _Optional[_Union[_wrappers_pb2.StringValue, _Mapping]] = ..., ocr_line_fi_payment_id: _Optional[_Union[_wrappers_pb2.StringValue, _Mapping]] = ..., ocr_line_nl_payment_id: _Optional[_Union[_wrappers_pb2.StringValue, _Mapping]] = ..., supplier_corporate_id: _Optional[_Union[_wrappers_pb2.StringValue, _Mapping]] = ..., supplier_country_code: _Optional[_Union[_wrappers_pb2.StringValue, _Mapping]] = ..., invoice_number: _Optional[_Union[_wrappers_pb2.StringValue, _Mapping]] = ..., iban: _Optional[_Union[_wrappers_pb2.StringValue, _Mapping]] = ..., order_reference: _Optional[_Union[_wrappers_pb2.StringValue, _Mapping]] = ..., bank_account_number: _Optional[_Union[_wrappers_pb2.StringValue, _Mapping]] = ..., bank_registration_number: _Optional[_Union[_wrappers_pb2.StringValue, _Mapping]] = ..., supplier_name: _Optional[_Union[_wrappers_pb2.StringValue, _Mapping]] = ..., bic: _Optional[_Union[_wrappers_pb2.StringValue, _Mapping]] = ..., document_number: _Optional[_Union[_wrappers_pb2.StringValue, _Mapping]] = ..., document_date: _Optional[_Union[_date_pb2.Date, _Mapping]] = ..., order_number: _Optional[_Union[_wrappers_pb2.StringValue, _Mapping]] = ..., supplier_vat_number: _Optional[_Union[_wrappers_pb2.StringValue, _Mapping]] = ..., supplier_organisation_number: _Optional[_Union[_wrappers_pb2.StringValue, _Mapping]] = ..., supplier_address: _Optional[_Union[_wrappers_pb2.StringValue, _Mapping]] = ..., customer_number: _Optional[_Union[_wrappers_pb2.StringValue, _Mapping]] = ..., receiver_order_number: _Optional[_Union[_wrappers_pb2.StringValue, _Mapping]] = ..., ocr_line_be_payment_id: _Optional[_Union[_wrappers_pb2.StringValue, _Mapping]] = ..., receiver_address: _Optional[_Union[_wrappers_pb2.StringValue, _Mapping]] = ..., receiver_country_code: _Optional[_Union[_wrappers_pb2.StringValue, _Mapping]] = ..., receiver_name: _Optional[_Union[_wrappers_pb2.StringValue, _Mapping]] = ..., receiver_vat_number: _Optional[_Union[_wrappers_pb2.StringValue, _Mapping]] = ..., purchase_lines: _Optional[_Iterable[_Union[_candidate_pb2.PurchaseLineCandidate, _Mapping]]] = ..., answers: _Optional[_Iterable[_Union[_candidate_pb2.AnswerCandidate, _Mapping]]] = ..., vat_distribution: _Optional[_Iterable[_Union[_candidate_pb2.VatDistributionCandidate, _Mapping]]] = ...) -> None: ...

class PredictionValues(_message.Message):
    __slots__ = ("total_incl_vat", "total_vat", "total_excl_vat", "order_date", "payment_due_date", "document_type", "currency", "credit_card_last_four", "payment_method", "ocr_line_dk_type", "ocr_line_dk_payment_id", "ocr_line_dk_creditor_id", "ocr_line_se_payment_id", "ocr_line_se_bankgiro_creditor_id", "ocr_line_se_plusgiro_creditor_id", "ocr_line_no_payment_id", "ocr_line_fi_payment_id", "ocr_line_nl_payment_id", "supplier_corporate_id", "supplier_country_code", "invoice_number", "iban", "order_reference", "bank_account_number", "bank_registration_number", "supplier_name", "bic", "document_number", "document_date", "order_number", "supplier_vat_number", "supplier_organisation_number", "supplier_address", "customer_number", "receiver_order_number", "ocr_line_be_payment_id", "receiver_address", "receiver_country_code", "receiver_name", "receiver_vat_number", "purchase_lines", "answers", "vat_distribution")
    TOTAL_INCL_VAT_FIELD_NUMBER: _ClassVar[int]
    TOTAL_VAT_FIELD_NUMBER: _ClassVar[int]
    TOTAL_EXCL_VAT_FIELD_NUMBER: _ClassVar[int]
    ORDER_DATE_FIELD_NUMBER: _ClassVar[int]
    PAYMENT_DUE_DATE_FIELD_NUMBER: _ClassVar[int]
    DOCUMENT_TYPE_FIELD_NUMBER: _ClassVar[int]
    CURRENCY_FIELD_NUMBER: _ClassVar[int]
    CREDIT_CARD_LAST_FOUR_FIELD_NUMBER: _ClassVar[int]
    PAYMENT_METHOD_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_DK_TYPE_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_DK_PAYMENT_ID_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_DK_CREDITOR_ID_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_SE_PAYMENT_ID_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_SE_BANKGIRO_CREDITOR_ID_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_SE_PLUSGIRO_CREDITOR_ID_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_NO_PAYMENT_ID_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_FI_PAYMENT_ID_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_NL_PAYMENT_ID_FIELD_NUMBER: _ClassVar[int]
    SUPPLIER_CORPORATE_ID_FIELD_NUMBER: _ClassVar[int]
    SUPPLIER_COUNTRY_CODE_FIELD_NUMBER: _ClassVar[int]
    INVOICE_NUMBER_FIELD_NUMBER: _ClassVar[int]
    IBAN_FIELD_NUMBER: _ClassVar[int]
    ORDER_REFERENCE_FIELD_NUMBER: _ClassVar[int]
    BANK_ACCOUNT_NUMBER_FIELD_NUMBER: _ClassVar[int]
    BANK_REGISTRATION_NUMBER_FIELD_NUMBER: _ClassVar[int]
    SUPPLIER_NAME_FIELD_NUMBER: _ClassVar[int]
    BIC_FIELD_NUMBER: _ClassVar[int]
    DOCUMENT_NUMBER_FIELD_NUMBER: _ClassVar[int]
    DOCUMENT_DATE_FIELD_NUMBER: _ClassVar[int]
    ORDER_NUMBER_FIELD_NUMBER: _ClassVar[int]
    SUPPLIER_VAT_NUMBER_FIELD_NUMBER: _ClassVar[int]
    SUPPLIER_ORGANISATION_NUMBER_FIELD_NUMBER: _ClassVar[int]
    SUPPLIER_ADDRESS_FIELD_NUMBER: _ClassVar[int]
    CUSTOMER_NUMBER_FIELD_NUMBER: _ClassVar[int]
    RECEIVER_ORDER_NUMBER_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_BE_PAYMENT_ID_FIELD_NUMBER: _ClassVar[int]
    RECEIVER_ADDRESS_FIELD_NUMBER: _ClassVar[int]
    RECEIVER_COUNTRY_CODE_FIELD_NUMBER: _ClassVar[int]
    RECEIVER_NAME_FIELD_NUMBER: _ClassVar[int]
    RECEIVER_VAT_NUMBER_FIELD_NUMBER: _ClassVar[int]
    PURCHASE_LINES_FIELD_NUMBER: _ClassVar[int]
    ANSWERS_FIELD_NUMBER: _ClassVar[int]
    VAT_DISTRIBUTION_FIELD_NUMBER: _ClassVar[int]
    total_incl_vat: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.DoubleValue]
    total_vat: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.DoubleValue]
    total_excl_vat: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.DoubleValue]
    order_date: _containers.RepeatedCompositeFieldContainer[_date_pb2.Date]
    payment_due_date: _containers.RepeatedCompositeFieldContainer[_date_pb2.Date]
    document_type: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.StringValue]
    currency: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.StringValue]
    credit_card_last_four: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.StringValue]
    payment_method: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.StringValue]
    ocr_line_dk_type: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.StringValue]
    ocr_line_dk_payment_id: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.StringValue]
    ocr_line_dk_creditor_id: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.StringValue]
    ocr_line_se_payment_id: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.StringValue]
    ocr_line_se_bankgiro_creditor_id: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.StringValue]
    ocr_line_se_plusgiro_creditor_id: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.StringValue]
    ocr_line_no_payment_id: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.StringValue]
    ocr_line_fi_payment_id: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.StringValue]
    ocr_line_nl_payment_id: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.StringValue]
    supplier_corporate_id: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.StringValue]
    supplier_country_code: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.StringValue]
    invoice_number: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.StringValue]
    iban: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.StringValue]
    order_reference: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.StringValue]
    bank_account_number: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.StringValue]
    bank_registration_number: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.StringValue]
    supplier_name: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.StringValue]
    bic: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.StringValue]
    document_number: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.StringValue]
    document_date: _containers.RepeatedCompositeFieldContainer[_date_pb2.Date]
    order_number: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.StringValue]
    supplier_vat_number: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.StringValue]
    supplier_organisation_number: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.StringValue]
    supplier_address: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.StringValue]
    customer_number: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.StringValue]
    receiver_order_number: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.StringValue]
    ocr_line_be_payment_id: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.StringValue]
    receiver_address: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.StringValue]
    receiver_country_code: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.StringValue]
    receiver_name: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.StringValue]
    receiver_vat_number: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.StringValue]
    purchase_lines: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.PurchaseLineCandidate]
    answers: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.AnswerCandidate]
    vat_distribution: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.VatDistributionCandidate]
    def __init__(self, total_incl_vat: _Optional[_Iterable[_Union[_wrappers_pb2.DoubleValue, _Mapping]]] = ..., total_vat: _Optional[_Iterable[_Union[_wrappers_pb2.DoubleValue, _Mapping]]] = ..., total_excl_vat: _Optional[_Iterable[_Union[_wrappers_pb2.DoubleValue, _Mapping]]] = ..., order_date: _Optional[_Iterable[_Union[_date_pb2.Date, _Mapping]]] = ..., payment_due_date: _Optional[_Iterable[_Union[_date_pb2.Date, _Mapping]]] = ..., document_type: _Optional[_Iterable[_Union[_wrappers_pb2.StringValue, _Mapping]]] = ..., currency: _Optional[_Iterable[_Union[_wrappers_pb2.StringValue, _Mapping]]] = ..., credit_card_last_four: _Optional[_Iterable[_Union[_wrappers_pb2.StringValue, _Mapping]]] = ..., payment_method: _Optional[_Iterable[_Union[_wrappers_pb2.StringValue, _Mapping]]] = ..., ocr_line_dk_type: _Optional[_Iterable[_Union[_wrappers_pb2.StringValue, _Mapping]]] = ..., ocr_line_dk_payment_id: _Optional[_Iterable[_Union[_wrappers_pb2.StringValue, _Mapping]]] = ..., ocr_line_dk_creditor_id: _Optional[_Iterable[_Union[_wrappers_pb2.StringValue, _Mapping]]] = ..., ocr_line_se_payment_id: _Optional[_Iterable[_Union[_wrappers_pb2.StringValue, _Mapping]]] = ..., ocr_line_se_bankgiro_creditor_id: _Optional[_Iterable[_Union[_wrappers_pb2.StringValue, _Mapping]]] = ..., ocr_line_se_plusgiro_creditor_id: _Optional[_Iterable[_Union[_wrappers_pb2.StringValue, _Mapping]]] = ..., ocr_line_no_payment_id: _Optional[_Iterable[_Union[_wrappers_pb2.StringValue, _Mapping]]] = ..., ocr_line_fi_payment_id: _Optional[_Iterable[_Union[_wrappers_pb2.StringValue, _Mapping]]] = ..., ocr_line_nl_payment_id: _Optional[_Iterable[_Union[_wrappers_pb2.StringValue, _Mapping]]] = ..., supplier_corporate_id: _Optional[_Iterable[_Union[_wrappers_pb2.StringValue, _Mapping]]] = ..., supplier_country_code: _Optional[_Iterable[_Union[_wrappers_pb2.StringValue, _Mapping]]] = ..., invoice_number: _Optional[_Iterable[_Union[_wrappers_pb2.StringValue, _Mapping]]] = ..., iban: _Optional[_Iterable[_Union[_wrappers_pb2.StringValue, _Mapping]]] = ..., order_reference: _Optional[_Iterable[_Union[_wrappers_pb2.StringValue, _Mapping]]] = ..., bank_account_number: _Optional[_Iterable[_Union[_wrappers_pb2.StringValue, _Mapping]]] = ..., bank_registration_number: _Optional[_Iterable[_Union[_wrappers_pb2.StringValue, _Mapping]]] = ..., supplier_name: _Optional[_Iterable[_Union[_wrappers_pb2.StringValue, _Mapping]]] = ..., bic: _Optional[_Iterable[_Union[_wrappers_pb2.StringValue, _Mapping]]] = ..., document_number: _Optional[_Iterable[_Union[_wrappers_pb2.StringValue, _Mapping]]] = ..., document_date: _Optional[_Iterable[_Union[_date_pb2.Date, _Mapping]]] = ..., order_number: _Optional[_Iterable[_Union[_wrappers_pb2.StringValue, _Mapping]]] = ..., supplier_vat_number: _Optional[_Iterable[_Union[_wrappers_pb2.StringValue, _Mapping]]] = ..., supplier_organisation_number: _Optional[_Iterable[_Union[_wrappers_pb2.StringValue, _Mapping]]] = ..., supplier_address: _Optional[_Iterable[_Union[_wrappers_pb2.StringValue, _Mapping]]] = ..., customer_number: _Optional[_Iterable[_Union[_wrappers_pb2.StringValue, _Mapping]]] = ..., receiver_order_number: _Optional[_Iterable[_Union[_wrappers_pb2.StringValue, _Mapping]]] = ..., ocr_line_be_payment_id: _Optional[_Iterable[_Union[_wrappers_pb2.StringValue, _Mapping]]] = ..., receiver_address: _Optional[_Iterable[_Union[_wrappers_pb2.StringValue, _Mapping]]] = ..., receiver_country_code: _Optional[_Iterable[_Union[_wrappers_pb2.StringValue, _Mapping]]] = ..., receiver_name: _Optional[_Iterable[_Union[_wrappers_pb2.StringValue, _Mapping]]] = ..., receiver_vat_number: _Optional[_Iterable[_Union[_wrappers_pb2.StringValue, _Mapping]]] = ..., purchase_lines: _Optional[_Iterable[_Union[_candidate_pb2.PurchaseLineCandidate, _Mapping]]] = ..., answers: _Optional[_Iterable[_Union[_candidate_pb2.AnswerCandidate, _Mapping]]] = ..., vat_distribution: _Optional[_Iterable[_Union[_candidate_pb2.VatDistributionCandidate, _Mapping]]] = ...) -> None: ...

class PredictionConfidences(_message.Message):
    __slots__ = ("total_incl_vat", "total_vat", "total_excl_vat", "order_date", "payment_due_date", "document_type", "currency", "credit_card_last_four", "payment_method", "ocr_line_dk_type", "ocr_line_dk_payment_id", "ocr_line_dk_creditor_id", "ocr_line_se_payment_id", "ocr_line_se_bankgiro_creditor_id", "ocr_line_se_plusgiro_creditor_id", "ocr_line_no_payment_id", "ocr_line_fi_payment_id", "ocr_line_nl_payment_id", "supplier_corporate_id", "supplier_country_code", "invoice_number", "iban", "order_reference", "bank_account_number", "bank_registration_number", "supplier_name", "bic", "document_number", "document_date", "order_number", "supplier_vat_number", "supplier_organisation_number", "supplier_address", "customer_number", "receiver_order_number", "ocr_line_be_payment_id", "receiver_address", "receiver_country_code", "receiver_name", "receiver_vat_number")
    TOTAL_INCL_VAT_FIELD_NUMBER: _ClassVar[int]
    TOTAL_VAT_FIELD_NUMBER: _ClassVar[int]
    TOTAL_EXCL_VAT_FIELD_NUMBER: _ClassVar[int]
    ORDER_DATE_FIELD_NUMBER: _ClassVar[int]
    PAYMENT_DUE_DATE_FIELD_NUMBER: _ClassVar[int]
    DOCUMENT_TYPE_FIELD_NUMBER: _ClassVar[int]
    CURRENCY_FIELD_NUMBER: _ClassVar[int]
    CREDIT_CARD_LAST_FOUR_FIELD_NUMBER: _ClassVar[int]
    PAYMENT_METHOD_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_DK_TYPE_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_DK_PAYMENT_ID_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_DK_CREDITOR_ID_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_SE_PAYMENT_ID_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_SE_BANKGIRO_CREDITOR_ID_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_SE_PLUSGIRO_CREDITOR_ID_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_NO_PAYMENT_ID_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_FI_PAYMENT_ID_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_NL_PAYMENT_ID_FIELD_NUMBER: _ClassVar[int]
    SUPPLIER_CORPORATE_ID_FIELD_NUMBER: _ClassVar[int]
    SUPPLIER_COUNTRY_CODE_FIELD_NUMBER: _ClassVar[int]
    INVOICE_NUMBER_FIELD_NUMBER: _ClassVar[int]
    IBAN_FIELD_NUMBER: _ClassVar[int]
    ORDER_REFERENCE_FIELD_NUMBER: _ClassVar[int]
    BANK_ACCOUNT_NUMBER_FIELD_NUMBER: _ClassVar[int]
    BANK_REGISTRATION_NUMBER_FIELD_NUMBER: _ClassVar[int]
    SUPPLIER_NAME_FIELD_NUMBER: _ClassVar[int]
    BIC_FIELD_NUMBER: _ClassVar[int]
    DOCUMENT_NUMBER_FIELD_NUMBER: _ClassVar[int]
    DOCUMENT_DATE_FIELD_NUMBER: _ClassVar[int]
    ORDER_NUMBER_FIELD_NUMBER: _ClassVar[int]
    SUPPLIER_VAT_NUMBER_FIELD_NUMBER: _ClassVar[int]
    SUPPLIER_ORGANISATION_NUMBER_FIELD_NUMBER: _ClassVar[int]
    SUPPLIER_ADDRESS_FIELD_NUMBER: _ClassVar[int]
    CUSTOMER_NUMBER_FIELD_NUMBER: _ClassVar[int]
    RECEIVER_ORDER_NUMBER_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_BE_PAYMENT_ID_FIELD_NUMBER: _ClassVar[int]
    RECEIVER_ADDRESS_FIELD_NUMBER: _ClassVar[int]
    RECEIVER_COUNTRY_CODE_FIELD_NUMBER: _ClassVar[int]
    RECEIVER_NAME_FIELD_NUMBER: _ClassVar[int]
    RECEIVER_VAT_NUMBER_FIELD_NUMBER: _ClassVar[int]
    total_incl_vat: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.FloatValue]
    total_vat: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.FloatValue]
    total_excl_vat: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.FloatValue]
    order_date: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.FloatValue]
    payment_due_date: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.FloatValue]
    document_type: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.FloatValue]
    currency: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.FloatValue]
    credit_card_last_four: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.FloatValue]
    payment_method: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.FloatValue]
    ocr_line_dk_type: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.FloatValue]
    ocr_line_dk_payment_id: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.FloatValue]
    ocr_line_dk_creditor_id: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.FloatValue]
    ocr_line_se_payment_id: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.FloatValue]
    ocr_line_se_bankgiro_creditor_id: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.FloatValue]
    ocr_line_se_plusgiro_creditor_id: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.FloatValue]
    ocr_line_no_payment_id: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.FloatValue]
    ocr_line_fi_payment_id: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.FloatValue]
    ocr_line_nl_payment_id: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.FloatValue]
    supplier_corporate_id: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.FloatValue]
    supplier_country_code: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.FloatValue]
    invoice_number: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.FloatValue]
    iban: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.FloatValue]
    order_reference: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.FloatValue]
    bank_account_number: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.FloatValue]
    bank_registration_number: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.FloatValue]
    supplier_name: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.FloatValue]
    bic: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.FloatValue]
    document_number: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.FloatValue]
    document_date: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.FloatValue]
    order_number: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.FloatValue]
    supplier_vat_number: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.FloatValue]
    supplier_organisation_number: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.FloatValue]
    supplier_address: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.FloatValue]
    customer_number: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.FloatValue]
    receiver_order_number: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.FloatValue]
    ocr_line_be_payment_id: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.FloatValue]
    receiver_address: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.FloatValue]
    receiver_country_code: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.FloatValue]
    receiver_name: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.FloatValue]
    receiver_vat_number: _containers.RepeatedCompositeFieldContainer[_wrappers_pb2.FloatValue]
    def __init__(self, total_incl_vat: _Optional[_Iterable[_Union[_wrappers_pb2.FloatValue, _Mapping]]] = ..., total_vat: _Optional[_Iterable[_Union[_wrappers_pb2.FloatValue, _Mapping]]] = ..., total_excl_vat: _Optional[_Iterable[_Union[_wrappers_pb2.FloatValue, _Mapping]]] = ..., order_date: _Optional[_Iterable[_Union[_wrappers_pb2.FloatValue, _Mapping]]] = ..., payment_due_date: _Optional[_Iterable[_Union[_wrappers_pb2.FloatValue, _Mapping]]] = ..., document_type: _Optional[_Iterable[_Union[_wrappers_pb2.FloatValue, _Mapping]]] = ..., currency: _Optional[_Iterable[_Union[_wrappers_pb2.FloatValue, _Mapping]]] = ..., credit_card_last_four: _Optional[_Iterable[_Union[_wrappers_pb2.FloatValue, _Mapping]]] = ..., payment_method: _Optional[_Iterable[_Union[_wrappers_pb2.FloatValue, _Mapping]]] = ..., ocr_line_dk_type: _Optional[_Iterable[_Union[_wrappers_pb2.FloatValue, _Mapping]]] = ..., ocr_line_dk_payment_id: _Optional[_Iterable[_Union[_wrappers_pb2.FloatValue, _Mapping]]] = ..., ocr_line_dk_creditor_id: _Optional[_Iterable[_Union[_wrappers_pb2.FloatValue, _Mapping]]] = ..., ocr_line_se_payment_id: _Optional[_Iterable[_Union[_wrappers_pb2.FloatValue, _Mapping]]] = ..., ocr_line_se_bankgiro_creditor_id: _Optional[_Iterable[_Union[_wrappers_pb2.FloatValue, _Mapping]]] = ..., ocr_line_se_plusgiro_creditor_id: _Optional[_Iterable[_Union[_wrappers_pb2.FloatValue, _Mapping]]] = ..., ocr_line_no_payment_id: _Optional[_Iterable[_Union[_wrappers_pb2.FloatValue, _Mapping]]] = ..., ocr_line_fi_payment_id: _Optional[_Iterable[_Union[_wrappers_pb2.FloatValue, _Mapping]]] = ..., ocr_line_nl_payment_id: _Optional[_Iterable[_Union[_wrappers_pb2.FloatValue, _Mapping]]] = ..., supplier_corporate_id: _Optional[_Iterable[_Union[_wrappers_pb2.FloatValue, _Mapping]]] = ..., supplier_country_code: _Optional[_Iterable[_Union[_wrappers_pb2.FloatValue, _Mapping]]] = ..., invoice_number: _Optional[_Iterable[_Union[_wrappers_pb2.FloatValue, _Mapping]]] = ..., iban: _Optional[_Iterable[_Union[_wrappers_pb2.FloatValue, _Mapping]]] = ..., order_reference: _Optional[_Iterable[_Union[_wrappers_pb2.FloatValue, _Mapping]]] = ..., bank_account_number: _Optional[_Iterable[_Union[_wrappers_pb2.FloatValue, _Mapping]]] = ..., bank_registration_number: _Optional[_Iterable[_Union[_wrappers_pb2.FloatValue, _Mapping]]] = ..., supplier_name: _Optional[_Iterable[_Union[_wrappers_pb2.FloatValue, _Mapping]]] = ..., bic: _Optional[_Iterable[_Union[_wrappers_pb2.FloatValue, _Mapping]]] = ..., document_number: _Optional[_Iterable[_Union[_wrappers_pb2.FloatValue, _Mapping]]] = ..., document_date: _Optional[_Iterable[_Union[_wrappers_pb2.FloatValue, _Mapping]]] = ..., order_number: _Optional[_Iterable[_Union[_wrappers_pb2.FloatValue, _Mapping]]] = ..., supplier_vat_number: _Optional[_Iterable[_Union[_wrappers_pb2.FloatValue, _Mapping]]] = ..., supplier_organisation_number: _Optional[_Iterable[_Union[_wrappers_pb2.FloatValue, _Mapping]]] = ..., supplier_address: _Optional[_Iterable[_Union[_wrappers_pb2.FloatValue, _Mapping]]] = ..., customer_number: _Optional[_Iterable[_Union[_wrappers_pb2.FloatValue, _Mapping]]] = ..., receiver_order_number: _Optional[_Iterable[_Union[_wrappers_pb2.FloatValue, _Mapping]]] = ..., ocr_line_be_payment_id: _Optional[_Iterable[_Union[_wrappers_pb2.FloatValue, _Mapping]]] = ..., receiver_address: _Optional[_Iterable[_Union[_wrappers_pb2.FloatValue, _Mapping]]] = ..., receiver_country_code: _Optional[_Iterable[_Union[_wrappers_pb2.FloatValue, _Mapping]]] = ..., receiver_name: _Optional[_Iterable[_Union[_wrappers_pb2.FloatValue, _Mapping]]] = ..., receiver_vat_number: _Optional[_Iterable[_Union[_wrappers_pb2.FloatValue, _Mapping]]] = ...) -> None: ...

class PredictionMetadata(_message.Message):
    __slots__ = ("total_incl_vat", "total_vat", "total_excl_vat", "order_date", "payment_due_date", "document_type", "currency", "credit_card_last_four", "payment_method", "ocr_line_dk_type", "ocr_line_dk_payment_id", "ocr_line_dk_creditor_id", "ocr_line_se_payment_id", "ocr_line_se_bankgiro_creditor_id", "ocr_line_se_plusgiro_creditor_id", "ocr_line_no_payment_id", "ocr_line_fi_payment_id", "ocr_line_nl_payment_id", "supplier_corporate_id", "supplier_country_code", "invoice_number", "iban", "order_reference", "bank_account_number", "bank_registration_number", "supplier_name", "bic", "document_number", "document_date", "order_number", "supplier_vat_number", "supplier_organisation_number", "supplier_address", "customer_number", "receiver_order_number", "ocr_line_be_payment_id", "receiver_address", "receiver_country_code", "receiver_name", "receiver_vat_number")
    TOTAL_INCL_VAT_FIELD_NUMBER: _ClassVar[int]
    TOTAL_VAT_FIELD_NUMBER: _ClassVar[int]
    TOTAL_EXCL_VAT_FIELD_NUMBER: _ClassVar[int]
    ORDER_DATE_FIELD_NUMBER: _ClassVar[int]
    PAYMENT_DUE_DATE_FIELD_NUMBER: _ClassVar[int]
    DOCUMENT_TYPE_FIELD_NUMBER: _ClassVar[int]
    CURRENCY_FIELD_NUMBER: _ClassVar[int]
    CREDIT_CARD_LAST_FOUR_FIELD_NUMBER: _ClassVar[int]
    PAYMENT_METHOD_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_DK_TYPE_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_DK_PAYMENT_ID_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_DK_CREDITOR_ID_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_SE_PAYMENT_ID_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_SE_BANKGIRO_CREDITOR_ID_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_SE_PLUSGIRO_CREDITOR_ID_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_NO_PAYMENT_ID_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_FI_PAYMENT_ID_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_NL_PAYMENT_ID_FIELD_NUMBER: _ClassVar[int]
    SUPPLIER_CORPORATE_ID_FIELD_NUMBER: _ClassVar[int]
    SUPPLIER_COUNTRY_CODE_FIELD_NUMBER: _ClassVar[int]
    INVOICE_NUMBER_FIELD_NUMBER: _ClassVar[int]
    IBAN_FIELD_NUMBER: _ClassVar[int]
    ORDER_REFERENCE_FIELD_NUMBER: _ClassVar[int]
    BANK_ACCOUNT_NUMBER_FIELD_NUMBER: _ClassVar[int]
    BANK_REGISTRATION_NUMBER_FIELD_NUMBER: _ClassVar[int]
    SUPPLIER_NAME_FIELD_NUMBER: _ClassVar[int]
    BIC_FIELD_NUMBER: _ClassVar[int]
    DOCUMENT_NUMBER_FIELD_NUMBER: _ClassVar[int]
    DOCUMENT_DATE_FIELD_NUMBER: _ClassVar[int]
    ORDER_NUMBER_FIELD_NUMBER: _ClassVar[int]
    SUPPLIER_VAT_NUMBER_FIELD_NUMBER: _ClassVar[int]
    SUPPLIER_ORGANISATION_NUMBER_FIELD_NUMBER: _ClassVar[int]
    SUPPLIER_ADDRESS_FIELD_NUMBER: _ClassVar[int]
    CUSTOMER_NUMBER_FIELD_NUMBER: _ClassVar[int]
    RECEIVER_ORDER_NUMBER_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_BE_PAYMENT_ID_FIELD_NUMBER: _ClassVar[int]
    RECEIVER_ADDRESS_FIELD_NUMBER: _ClassVar[int]
    RECEIVER_COUNTRY_CODE_FIELD_NUMBER: _ClassVar[int]
    RECEIVER_NAME_FIELD_NUMBER: _ClassVar[int]
    RECEIVER_VAT_NUMBER_FIELD_NUMBER: _ClassVar[int]
    total_incl_vat: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.ModelSpec]
    total_vat: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.ModelSpec]
    total_excl_vat: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.ModelSpec]
    order_date: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.ModelSpec]
    payment_due_date: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.ModelSpec]
    document_type: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.ModelSpec]
    currency: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.ModelSpec]
    credit_card_last_four: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.ModelSpec]
    payment_method: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.ModelSpec]
    ocr_line_dk_type: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.ModelSpec]
    ocr_line_dk_payment_id: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.ModelSpec]
    ocr_line_dk_creditor_id: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.ModelSpec]
    ocr_line_se_payment_id: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.ModelSpec]
    ocr_line_se_bankgiro_creditor_id: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.ModelSpec]
    ocr_line_se_plusgiro_creditor_id: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.ModelSpec]
    ocr_line_no_payment_id: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.ModelSpec]
    ocr_line_fi_payment_id: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.ModelSpec]
    ocr_line_nl_payment_id: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.ModelSpec]
    supplier_corporate_id: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.ModelSpec]
    supplier_country_code: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.ModelSpec]
    invoice_number: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.ModelSpec]
    iban: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.ModelSpec]
    order_reference: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.ModelSpec]
    bank_account_number: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.ModelSpec]
    bank_registration_number: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.ModelSpec]
    supplier_name: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.ModelSpec]
    bic: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.ModelSpec]
    document_number: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.ModelSpec]
    document_date: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.ModelSpec]
    order_number: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.ModelSpec]
    supplier_vat_number: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.ModelSpec]
    supplier_organisation_number: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.ModelSpec]
    supplier_address: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.ModelSpec]
    customer_number: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.ModelSpec]
    receiver_order_number: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.ModelSpec]
    ocr_line_be_payment_id: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.ModelSpec]
    receiver_address: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.ModelSpec]
    receiver_country_code: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.ModelSpec]
    receiver_name: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.ModelSpec]
    receiver_vat_number: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.ModelSpec]
    def __init__(self, total_incl_vat: _Optional[_Iterable[_Union[_candidate_pb2.ModelSpec, _Mapping]]] = ..., total_vat: _Optional[_Iterable[_Union[_candidate_pb2.ModelSpec, _Mapping]]] = ..., total_excl_vat: _Optional[_Iterable[_Union[_candidate_pb2.ModelSpec, _Mapping]]] = ..., order_date: _Optional[_Iterable[_Union[_candidate_pb2.ModelSpec, _Mapping]]] = ..., payment_due_date: _Optional[_Iterable[_Union[_candidate_pb2.ModelSpec, _Mapping]]] = ..., document_type: _Optional[_Iterable[_Union[_candidate_pb2.ModelSpec, _Mapping]]] = ..., currency: _Optional[_Iterable[_Union[_candidate_pb2.ModelSpec, _Mapping]]] = ..., credit_card_last_four: _Optional[_Iterable[_Union[_candidate_pb2.ModelSpec, _Mapping]]] = ..., payment_method: _Optional[_Iterable[_Union[_candidate_pb2.ModelSpec, _Mapping]]] = ..., ocr_line_dk_type: _Optional[_Iterable[_Union[_candidate_pb2.ModelSpec, _Mapping]]] = ..., ocr_line_dk_payment_id: _Optional[_Iterable[_Union[_candidate_pb2.ModelSpec, _Mapping]]] = ..., ocr_line_dk_creditor_id: _Optional[_Iterable[_Union[_candidate_pb2.ModelSpec, _Mapping]]] = ..., ocr_line_se_payment_id: _Optional[_Iterable[_Union[_candidate_pb2.ModelSpec, _Mapping]]] = ..., ocr_line_se_bankgiro_creditor_id: _Optional[_Iterable[_Union[_candidate_pb2.ModelSpec, _Mapping]]] = ..., ocr_line_se_plusgiro_creditor_id: _Optional[_Iterable[_Union[_candidate_pb2.ModelSpec, _Mapping]]] = ..., ocr_line_no_payment_id: _Optional[_Iterable[_Union[_candidate_pb2.ModelSpec, _Mapping]]] = ..., ocr_line_fi_payment_id: _Optional[_Iterable[_Union[_candidate_pb2.ModelSpec, _Mapping]]] = ..., ocr_line_nl_payment_id: _Optional[_Iterable[_Union[_candidate_pb2.ModelSpec, _Mapping]]] = ..., supplier_corporate_id: _Optional[_Iterable[_Union[_candidate_pb2.ModelSpec, _Mapping]]] = ..., supplier_country_code: _Optional[_Iterable[_Union[_candidate_pb2.ModelSpec, _Mapping]]] = ..., invoice_number: _Optional[_Iterable[_Union[_candidate_pb2.ModelSpec, _Mapping]]] = ..., iban: _Optional[_Iterable[_Union[_candidate_pb2.ModelSpec, _Mapping]]] = ..., order_reference: _Optional[_Iterable[_Union[_candidate_pb2.ModelSpec, _Mapping]]] = ..., bank_account_number: _Optional[_Iterable[_Union[_candidate_pb2.ModelSpec, _Mapping]]] = ..., bank_registration_number: _Optional[_Iterable[_Union[_candidate_pb2.ModelSpec, _Mapping]]] = ..., supplier_name: _Optional[_Iterable[_Union[_candidate_pb2.ModelSpec, _Mapping]]] = ..., bic: _Optional[_Iterable[_Union[_candidate_pb2.ModelSpec, _Mapping]]] = ..., document_number: _Optional[_Iterable[_Union[_candidate_pb2.ModelSpec, _Mapping]]] = ..., document_date: _Optional[_Iterable[_Union[_candidate_pb2.ModelSpec, _Mapping]]] = ..., order_number: _Optional[_Iterable[_Union[_candidate_pb2.ModelSpec, _Mapping]]] = ..., supplier_vat_number: _Optional[_Iterable[_Union[_candidate_pb2.ModelSpec, _Mapping]]] = ..., supplier_organisation_number: _Optional[_Iterable[_Union[_candidate_pb2.ModelSpec, _Mapping]]] = ..., supplier_address: _Optional[_Iterable[_Union[_candidate_pb2.ModelSpec, _Mapping]]] = ..., customer_number: _Optional[_Iterable[_Union[_candidate_pb2.ModelSpec, _Mapping]]] = ..., receiver_order_number: _Optional[_Iterable[_Union[_candidate_pb2.ModelSpec, _Mapping]]] = ..., ocr_line_be_payment_id: _Optional[_Iterable[_Union[_candidate_pb2.ModelSpec, _Mapping]]] = ..., receiver_address: _Optional[_Iterable[_Union[_candidate_pb2.ModelSpec, _Mapping]]] = ..., receiver_country_code: _Optional[_Iterable[_Union[_candidate_pb2.ModelSpec, _Mapping]]] = ..., receiver_name: _Optional[_Iterable[_Union[_candidate_pb2.ModelSpec, _Mapping]]] = ..., receiver_vat_number: _Optional[_Iterable[_Union[_candidate_pb2.ModelSpec, _Mapping]]] = ...) -> None: ...

class CreateDocumentRequest(_message.Message):
    __slots__ = ("document",)
    DOCUMENT_FIELD_NUMBER: _ClassVar[int]
    document: Document
    def __init__(self, document: _Optional[_Union[Document, _Mapping]] = ...) -> None: ...

class CreateDocumentResponse(_message.Message):
    __slots__ = ("id",)
    ID_FIELD_NUMBER: _ClassVar[int]
    id: str
    def __init__(self, id: _Optional[str] = ...) -> None: ...

class ReadDocumentRequest(_message.Message):
    __slots__ = ("id",)
    ID_FIELD_NUMBER: _ClassVar[int]
    id: str
    def __init__(self, id: _Optional[str] = ...) -> None: ...

class ReadDocumentResponse(_message.Message):
    __slots__ = ("document",)
    DOCUMENT_FIELD_NUMBER: _ClassVar[int]
    document: Document
    def __init__(self, document: _Optional[_Union[Document, _Mapping]] = ...) -> None: ...

class PrepareFeedbackRequest(_message.Message):
    __slots__ = ("id", "ta", "document_bytes", "predictions", "tags", "confidences", "prediction_metadata", "tier", "segments")
    ID_FIELD_NUMBER: _ClassVar[int]
    TA_FIELD_NUMBER: _ClassVar[int]
    DOCUMENT_BYTES_FIELD_NUMBER: _ClassVar[int]
    PREDICTIONS_FIELD_NUMBER: _ClassVar[int]
    TAGS_FIELD_NUMBER: _ClassVar[int]
    CONFIDENCES_FIELD_NUMBER: _ClassVar[int]
    PREDICTION_METADATA_FIELD_NUMBER: _ClassVar[int]
    TIER_FIELD_NUMBER: _ClassVar[int]
    SEGMENTS_FIELD_NUMBER: _ClassVar[int]
    id: str
    ta: _text_annotation_pb2.TextAnnotation
    document_bytes: bytes
    predictions: PredictionValues
    tags: _containers.RepeatedScalarFieldContainer[str]
    confidences: PredictionConfidences
    prediction_metadata: PredictionMetadata
    tier: _tier_pb2.Tier
    segments: _containers.RepeatedScalarFieldContainer[str]
    def __init__(self, id: _Optional[str] = ..., ta: _Optional[_Union[_text_annotation_pb2.TextAnnotation, _Mapping]] = ..., document_bytes: _Optional[bytes] = ..., predictions: _Optional[_Union[PredictionValues, _Mapping]] = ..., tags: _Optional[_Iterable[str]] = ..., confidences: _Optional[_Union[PredictionConfidences, _Mapping]] = ..., prediction_metadata: _Optional[_Union[PredictionMetadata, _Mapping]] = ..., tier: _Optional[_Union[_tier_pb2.Tier, str]] = ..., segments: _Optional[_Iterable[str]] = ...) -> None: ...

class FeedbackRequest(_message.Message):
    __slots__ = ("id", "true_values", "tags")
    ID_FIELD_NUMBER: _ClassVar[int]
    TRUE_VALUES_FIELD_NUMBER: _ClassVar[int]
    TAGS_FIELD_NUMBER: _ClassVar[int]
    id: str
    true_values: TrueValues
    tags: _containers.RepeatedScalarFieldContainer[str]
    def __init__(self, id: _Optional[str] = ..., true_values: _Optional[_Union[TrueValues, _Mapping]] = ..., tags: _Optional[_Iterable[str]] = ...) -> None: ...

class MetricsRequest(_message.Message):
    __slots__ = ("start_time", "end_time", "fields", "tags", "country_codes", "document_types")
    START_TIME_FIELD_NUMBER: _ClassVar[int]
    END_TIME_FIELD_NUMBER: _ClassVar[int]
    FIELDS_FIELD_NUMBER: _ClassVar[int]
    TAGS_FIELD_NUMBER: _ClassVar[int]
    COUNTRY_CODES_FIELD_NUMBER: _ClassVar[int]
    DOCUMENT_TYPES_FIELD_NUMBER: _ClassVar[int]
    start_time: int
    end_time: int
    fields: _containers.RepeatedScalarFieldContainer[str]
    tags: _containers.RepeatedScalarFieldContainer[str]
    country_codes: _containers.RepeatedScalarFieldContainer[str]
    document_types: _containers.RepeatedScalarFieldContainer[str]
    def __init__(self, start_time: _Optional[int] = ..., end_time: _Optional[int] = ..., fields: _Optional[_Iterable[str]] = ..., tags: _Optional[_Iterable[str]] = ..., country_codes: _Optional[_Iterable[str]] = ..., document_types: _Optional[_Iterable[str]] = ...) -> None: ...

class FeedbackMetrics(_message.Message):
    __slots__ = ("document_count", "feedback_count", "overall_correctness", "field_correctness")
    DOCUMENT_COUNT_FIELD_NUMBER: _ClassVar[int]
    FEEDBACK_COUNT_FIELD_NUMBER: _ClassVar[int]
    OVERALL_CORRECTNESS_FIELD_NUMBER: _ClassVar[int]
    FIELD_CORRECTNESS_FIELD_NUMBER: _ClassVar[int]
    document_count: int
    feedback_count: int
    overall_correctness: Correctness
    field_correctness: _containers.RepeatedCompositeFieldContainer[Correctness]
    def __init__(self, document_count: _Optional[int] = ..., feedback_count: _Optional[int] = ..., overall_correctness: _Optional[_Union[Correctness, _Mapping]] = ..., field_correctness: _Optional[_Iterable[_Union[Correctness, _Mapping]]] = ...) -> None: ...

class Correctness(_message.Message):
    __slots__ = ("field", "correct_percentage", "incomplete_percentage", "error_percentage", "support")
    FIELD_FIELD_NUMBER: _ClassVar[int]
    CORRECT_PERCENTAGE_FIELD_NUMBER: _ClassVar[int]
    INCOMPLETE_PERCENTAGE_FIELD_NUMBER: _ClassVar[int]
    ERROR_PERCENTAGE_FIELD_NUMBER: _ClassVar[int]
    SUPPORT_FIELD_NUMBER: _ClassVar[int]
    field: str
    correct_percentage: float
    incomplete_percentage: float
    error_percentage: float
    support: int
    def __init__(self, field: _Optional[str] = ..., correct_percentage: _Optional[float] = ..., incomplete_percentage: _Optional[float] = ..., error_percentage: _Optional[float] = ..., support: _Optional[int] = ...) -> None: ...

class DeleteRequest(_message.Message):
    __slots__ = ("tags",)
    TAGS_FIELD_NUMBER: _ClassVar[int]
    tags: _containers.RepeatedScalarFieldContainer[str]
    def __init__(self, tags: _Optional[_Iterable[str]] = ...) -> None: ...

class CallsPerMonth(_message.Message):
    __slots__ = ("calls", "month_name")
    CALLS_FIELD_NUMBER: _ClassVar[int]
    MONTH_NAME_FIELD_NUMBER: _ClassVar[int]
    calls: int
    month_name: str
    def __init__(self, calls: _Optional[int] = ..., month_name: _Optional[str] = ...) -> None: ...

class CallsPerMonthResponse(_message.Message):
    __slots__ = ("calls_per_month",)
    CALLS_PER_MONTH_FIELD_NUMBER: _ClassVar[int]
    calls_per_month: _containers.RepeatedCompositeFieldContainer[CallsPerMonth]
    def __init__(self, calls_per_month: _Optional[_Iterable[_Union[CallsPerMonth, _Mapping]]] = ...) -> None: ...
