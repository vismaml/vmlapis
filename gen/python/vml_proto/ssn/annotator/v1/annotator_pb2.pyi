from google.api import annotations_pb2 as _annotations_pb2
from protoc_gen_openapiv2.options import annotations_pb2 as _annotations_pb2_1
from ssn.type import candidate_pb2 as _candidate_pb2
from ssn.type import text_annotation_pb2 as _text_annotation_pb2
from ssn.type import tier_pb2 as _tier_pb2
from google.protobuf.internal import containers as _containers
from google.protobuf.internal import enum_type_wrapper as _enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Iterable as _Iterable, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class Feature(_message.Message):
    __slots__ = ("type", "max_results", "min_confidence")
    class Type(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
        __slots__ = ()
        DEFAULT: _ClassVar[Feature.Type]
        TEXT_ANNOTATION: _ClassVar[Feature.Type]
        ORDER_DATE: _ClassVar[Feature.Type]
        PAYMENT_DUE_DATE: _ClassVar[Feature.Type]
        CURRENCY: _ClassVar[Feature.Type]
        TOTAL_VAT: _ClassVar[Feature.Type]
        TOTAL_INCL_VAT: _ClassVar[Feature.Type]
        TOTAL_EXCL_VAT: _ClassVar[Feature.Type]
        SUPPLIER_CORPORATE_ID: _ClassVar[Feature.Type]
        SUPPLIER_COUNTRY_CODE: _ClassVar[Feature.Type]
        DOCUMENT_TYPE: _ClassVar[Feature.Type]
        PAYMENT_METHOD: _ClassVar[Feature.Type]
        CREDIT_CARD_LAST_FOUR: _ClassVar[Feature.Type]
        INVOICE_NUMBER: _ClassVar[Feature.Type]
        OCR_LINE_DK_TYPE: _ClassVar[Feature.Type]
        OCR_LINE_DK_PAYMENT_ID: _ClassVar[Feature.Type]
        OCR_LINE_DK_CREDITOR_ID: _ClassVar[Feature.Type]
        OCR_LINE_SE_PAYMENT_ID: _ClassVar[Feature.Type]
        OCR_LINE_SE_BANKGIRO_CREDITOR_ID: _ClassVar[Feature.Type]
        OCR_LINE_SE_PLUSGIRO_CREDITOR_ID: _ClassVar[Feature.Type]
        OCR_LINE_NO_PAYMENT_ID: _ClassVar[Feature.Type]
        OCR_LINE_FI_PAYMENT_ID: _ClassVar[Feature.Type]
        OCR_LINE_NL_PAYMENT_ID: _ClassVar[Feature.Type]
        OCR_LINE_BE_PAYMENT_ID: _ClassVar[Feature.Type]
        TEXT: _ClassVar[Feature.Type]
        IBAN: _ClassVar[Feature.Type]
        LINES: _ClassVar[Feature.Type]
        PREVIEW: _ClassVar[Feature.Type]
        BANK_ACCOUNT_NUMBER: _ClassVar[Feature.Type]
        BANK_REGISTRATION_NUMBER: _ClassVar[Feature.Type]
        BIC: _ClassVar[Feature.Type]
        DOCUMENT_NUMBER: _ClassVar[Feature.Type]
        DOCUMENT_DATE: _ClassVar[Feature.Type]
        ORDER_NUMBER: _ClassVar[Feature.Type]
        SUPPLIER_NAME: _ClassVar[Feature.Type]
        SUPPLIER_VAT_NUMBER: _ClassVar[Feature.Type]
        SUPPLIER_ORGANISATION_NUMBER: _ClassVar[Feature.Type]
        SUPPLIER_ADDRESS: _ClassVar[Feature.Type]
        CUSTOMER_NUMBER: _ClassVar[Feature.Type]
        RECEIVER_ORDER_NUMBER: _ClassVar[Feature.Type]
        RECEIVER_ADDRESS: _ClassVar[Feature.Type]
        RECEIVER_COUNTRY_CODE: _ClassVar[Feature.Type]
        RECEIVER_NAME: _ClassVar[Feature.Type]
        RECEIVER_VAT_NUMBER: _ClassVar[Feature.Type]
        PURCHASE_LINES: _ClassVar[Feature.Type]
        PAGE_TEXTS: _ClassVar[Feature.Type]
        VAT_DISTRIBUTION: _ClassVar[Feature.Type]
        LANGUAGE_CODE: _ClassVar[Feature.Type]
    DEFAULT: Feature.Type
    TEXT_ANNOTATION: Feature.Type
    ORDER_DATE: Feature.Type
    PAYMENT_DUE_DATE: Feature.Type
    CURRENCY: Feature.Type
    TOTAL_VAT: Feature.Type
    TOTAL_INCL_VAT: Feature.Type
    TOTAL_EXCL_VAT: Feature.Type
    SUPPLIER_CORPORATE_ID: Feature.Type
    SUPPLIER_COUNTRY_CODE: Feature.Type
    DOCUMENT_TYPE: Feature.Type
    PAYMENT_METHOD: Feature.Type
    CREDIT_CARD_LAST_FOUR: Feature.Type
    INVOICE_NUMBER: Feature.Type
    OCR_LINE_DK_TYPE: Feature.Type
    OCR_LINE_DK_PAYMENT_ID: Feature.Type
    OCR_LINE_DK_CREDITOR_ID: Feature.Type
    OCR_LINE_SE_PAYMENT_ID: Feature.Type
    OCR_LINE_SE_BANKGIRO_CREDITOR_ID: Feature.Type
    OCR_LINE_SE_PLUSGIRO_CREDITOR_ID: Feature.Type
    OCR_LINE_NO_PAYMENT_ID: Feature.Type
    OCR_LINE_FI_PAYMENT_ID: Feature.Type
    OCR_LINE_NL_PAYMENT_ID: Feature.Type
    OCR_LINE_BE_PAYMENT_ID: Feature.Type
    TEXT: Feature.Type
    IBAN: Feature.Type
    LINES: Feature.Type
    PREVIEW: Feature.Type
    BANK_ACCOUNT_NUMBER: Feature.Type
    BANK_REGISTRATION_NUMBER: Feature.Type
    BIC: Feature.Type
    DOCUMENT_NUMBER: Feature.Type
    DOCUMENT_DATE: Feature.Type
    ORDER_NUMBER: Feature.Type
    SUPPLIER_NAME: Feature.Type
    SUPPLIER_VAT_NUMBER: Feature.Type
    SUPPLIER_ORGANISATION_NUMBER: Feature.Type
    SUPPLIER_ADDRESS: Feature.Type
    CUSTOMER_NUMBER: Feature.Type
    RECEIVER_ORDER_NUMBER: Feature.Type
    RECEIVER_ADDRESS: Feature.Type
    RECEIVER_COUNTRY_CODE: Feature.Type
    RECEIVER_NAME: Feature.Type
    RECEIVER_VAT_NUMBER: Feature.Type
    PURCHASE_LINES: Feature.Type
    PAGE_TEXTS: Feature.Type
    VAT_DISTRIBUTION: Feature.Type
    LANGUAGE_CODE: Feature.Type
    TYPE_FIELD_NUMBER: _ClassVar[int]
    MAX_RESULTS_FIELD_NUMBER: _ClassVar[int]
    MIN_CONFIDENCE_FIELD_NUMBER: _ClassVar[int]
    type: Feature.Type
    max_results: int
    min_confidence: _candidate_pb2.Confidence.Level
    def __init__(self, type: _Optional[_Union[Feature.Type, str]] = ..., max_results: _Optional[int] = ..., min_confidence: _Optional[_Union[_candidate_pb2.Confidence.Level, str]] = ...) -> None: ...

class DocumentAnnotatorRequest(_message.Message):
    __slots__ = ("document", "features", "tags", "tier", "segments", "questions")
    DOCUMENT_FIELD_NUMBER: _ClassVar[int]
    FEATURES_FIELD_NUMBER: _ClassVar[int]
    TAGS_FIELD_NUMBER: _ClassVar[int]
    TIER_FIELD_NUMBER: _ClassVar[int]
    SEGMENTS_FIELD_NUMBER: _ClassVar[int]
    QUESTIONS_FIELD_NUMBER: _ClassVar[int]
    document: Document
    features: _containers.RepeatedCompositeFieldContainer[Feature]
    tags: _containers.RepeatedScalarFieldContainer[str]
    tier: _tier_pb2.Tier
    segments: _containers.RepeatedScalarFieldContainer[str]
    questions: _containers.RepeatedScalarFieldContainer[str]
    def __init__(self, document: _Optional[_Union[Document, _Mapping]] = ..., features: _Optional[_Iterable[_Union[Feature, _Mapping]]] = ..., tags: _Optional[_Iterable[str]] = ..., tier: _Optional[_Union[_tier_pb2.Tier, str]] = ..., segments: _Optional[_Iterable[str]] = ..., questions: _Optional[_Iterable[str]] = ...) -> None: ...

class DocumentAnnotatorResponse(_message.Message):
    __slots__ = ("order_date", "payment_due_date", "currency", "total_vat", "total_incl_vat", "total_excl_vat", "supplier_corporate_id", "supplier_country_code", "document_type", "payment_method", "credit_card_last_four", "invoice_number", "text_annotation", "ocr_line_dk_type", "ocr_line_dk_payment_id", "ocr_line_dk_creditor_id", "ocr_line_se_payment_id", "ocr_line_se_bankgiro_creditor_id", "ocr_line_se_plusgiro_creditor_id", "ocr_line_no_payment_id", "ocr_line_fi_payment_id", "ocr_line_nl_payment_id", "ocr_line_be_payment_id", "text", "feedback_id", "iban", "lines", "preview", "bank_account_number", "bank_registration_number", "bic", "document_number", "document_date", "order_number", "supplier_name", "supplier_vat_number", "supplier_organisation_number", "supplier_address", "customer_number", "receiver_order_number", "receiver_address", "receiver_country_code", "receiver_name", "receiver_vat_number", "purchase_lines", "answers", "page_texts", "vat_distribution", "document_metadata", "language_code")
    ORDER_DATE_FIELD_NUMBER: _ClassVar[int]
    PAYMENT_DUE_DATE_FIELD_NUMBER: _ClassVar[int]
    CURRENCY_FIELD_NUMBER: _ClassVar[int]
    TOTAL_VAT_FIELD_NUMBER: _ClassVar[int]
    TOTAL_INCL_VAT_FIELD_NUMBER: _ClassVar[int]
    TOTAL_EXCL_VAT_FIELD_NUMBER: _ClassVar[int]
    SUPPLIER_CORPORATE_ID_FIELD_NUMBER: _ClassVar[int]
    SUPPLIER_COUNTRY_CODE_FIELD_NUMBER: _ClassVar[int]
    DOCUMENT_TYPE_FIELD_NUMBER: _ClassVar[int]
    PAYMENT_METHOD_FIELD_NUMBER: _ClassVar[int]
    CREDIT_CARD_LAST_FOUR_FIELD_NUMBER: _ClassVar[int]
    INVOICE_NUMBER_FIELD_NUMBER: _ClassVar[int]
    TEXT_ANNOTATION_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_DK_TYPE_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_DK_PAYMENT_ID_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_DK_CREDITOR_ID_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_SE_PAYMENT_ID_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_SE_BANKGIRO_CREDITOR_ID_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_SE_PLUSGIRO_CREDITOR_ID_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_NO_PAYMENT_ID_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_FI_PAYMENT_ID_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_NL_PAYMENT_ID_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_BE_PAYMENT_ID_FIELD_NUMBER: _ClassVar[int]
    TEXT_FIELD_NUMBER: _ClassVar[int]
    FEEDBACK_ID_FIELD_NUMBER: _ClassVar[int]
    IBAN_FIELD_NUMBER: _ClassVar[int]
    LINES_FIELD_NUMBER: _ClassVar[int]
    PREVIEW_FIELD_NUMBER: _ClassVar[int]
    BANK_ACCOUNT_NUMBER_FIELD_NUMBER: _ClassVar[int]
    BANK_REGISTRATION_NUMBER_FIELD_NUMBER: _ClassVar[int]
    BIC_FIELD_NUMBER: _ClassVar[int]
    DOCUMENT_NUMBER_FIELD_NUMBER: _ClassVar[int]
    DOCUMENT_DATE_FIELD_NUMBER: _ClassVar[int]
    ORDER_NUMBER_FIELD_NUMBER: _ClassVar[int]
    SUPPLIER_NAME_FIELD_NUMBER: _ClassVar[int]
    SUPPLIER_VAT_NUMBER_FIELD_NUMBER: _ClassVar[int]
    SUPPLIER_ORGANISATION_NUMBER_FIELD_NUMBER: _ClassVar[int]
    SUPPLIER_ADDRESS_FIELD_NUMBER: _ClassVar[int]
    CUSTOMER_NUMBER_FIELD_NUMBER: _ClassVar[int]
    RECEIVER_ORDER_NUMBER_FIELD_NUMBER: _ClassVar[int]
    RECEIVER_ADDRESS_FIELD_NUMBER: _ClassVar[int]
    RECEIVER_COUNTRY_CODE_FIELD_NUMBER: _ClassVar[int]
    RECEIVER_NAME_FIELD_NUMBER: _ClassVar[int]
    RECEIVER_VAT_NUMBER_FIELD_NUMBER: _ClassVar[int]
    PURCHASE_LINES_FIELD_NUMBER: _ClassVar[int]
    ANSWERS_FIELD_NUMBER: _ClassVar[int]
    PAGE_TEXTS_FIELD_NUMBER: _ClassVar[int]
    VAT_DISTRIBUTION_FIELD_NUMBER: _ClassVar[int]
    DOCUMENT_METADATA_FIELD_NUMBER: _ClassVar[int]
    LANGUAGE_CODE_FIELD_NUMBER: _ClassVar[int]
    order_date: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    payment_due_date: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    currency: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    total_vat: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    total_incl_vat: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    total_excl_vat: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    supplier_corporate_id: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    supplier_country_code: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    document_type: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    payment_method: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    credit_card_last_four: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    invoice_number: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    text_annotation: _text_annotation_pb2.TextAnnotation
    ocr_line_dk_type: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    ocr_line_dk_payment_id: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    ocr_line_dk_creditor_id: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    ocr_line_se_payment_id: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    ocr_line_se_bankgiro_creditor_id: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    ocr_line_se_plusgiro_creditor_id: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    ocr_line_no_payment_id: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    ocr_line_fi_payment_id: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    ocr_line_nl_payment_id: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    ocr_line_be_payment_id: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    text: str
    feedback_id: str
    iban: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    lines: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.LineCandidate]
    preview: str
    bank_account_number: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    bank_registration_number: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    bic: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    document_number: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    document_date: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    order_number: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    supplier_name: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    supplier_vat_number: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    supplier_organisation_number: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    supplier_address: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    customer_number: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    receiver_order_number: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    receiver_address: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    receiver_country_code: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    receiver_name: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    receiver_vat_number: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    purchase_lines: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.PurchaseLineCandidate]
    answers: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.AnswerCandidate]
    page_texts: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.PageText]
    vat_distribution: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.VatDistributionCandidate]
    document_metadata: _candidate_pb2.DocumentMetadata
    language_code: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    def __init__(self, order_date: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., payment_due_date: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., currency: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., total_vat: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., total_incl_vat: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., total_excl_vat: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., supplier_corporate_id: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., supplier_country_code: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., document_type: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., payment_method: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., credit_card_last_four: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., invoice_number: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., text_annotation: _Optional[_Union[_text_annotation_pb2.TextAnnotation, _Mapping]] = ..., ocr_line_dk_type: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., ocr_line_dk_payment_id: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., ocr_line_dk_creditor_id: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., ocr_line_se_payment_id: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., ocr_line_se_bankgiro_creditor_id: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., ocr_line_se_plusgiro_creditor_id: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., ocr_line_no_payment_id: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., ocr_line_fi_payment_id: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., ocr_line_nl_payment_id: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., ocr_line_be_payment_id: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., text: _Optional[str] = ..., feedback_id: _Optional[str] = ..., iban: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., lines: _Optional[_Iterable[_Union[_candidate_pb2.LineCandidate, _Mapping]]] = ..., preview: _Optional[str] = ..., bank_account_number: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., bank_registration_number: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., bic: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., document_number: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., document_date: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., order_number: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., supplier_name: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., supplier_vat_number: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., supplier_organisation_number: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., supplier_address: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., customer_number: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., receiver_order_number: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., receiver_address: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., receiver_country_code: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., receiver_name: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., receiver_vat_number: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., purchase_lines: _Optional[_Iterable[_Union[_candidate_pb2.PurchaseLineCandidate, _Mapping]]] = ..., answers: _Optional[_Iterable[_Union[_candidate_pb2.AnswerCandidate, _Mapping]]] = ..., page_texts: _Optional[_Iterable[_Union[_candidate_pb2.PageText, _Mapping]]] = ..., vat_distribution: _Optional[_Iterable[_Union[_candidate_pb2.VatDistributionCandidate, _Mapping]]] = ..., document_metadata: _Optional[_Union[_candidate_pb2.DocumentMetadata, _Mapping]] = ..., language_code: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ...) -> None: ...

class Document(_message.Message):
    __slots__ = ("content", "source")
    CONTENT_FIELD_NUMBER: _ClassVar[int]
    SOURCE_FIELD_NUMBER: _ClassVar[int]
    content: bytes
    source: DocumentSource
    def __init__(self, content: _Optional[bytes] = ..., source: _Optional[_Union[DocumentSource, _Mapping]] = ...) -> None: ...

class DocumentSource(_message.Message):
    __slots__ = ("http_uri",)
    HTTP_URI_FIELD_NUMBER: _ClassVar[int]
    http_uri: str
    def __init__(self, http_uri: _Optional[str] = ...) -> None: ...

class DocumentQuestionRequest(_message.Message):
    __slots__ = ("document", "questions")
    DOCUMENT_FIELD_NUMBER: _ClassVar[int]
    QUESTIONS_FIELD_NUMBER: _ClassVar[int]
    document: Document
    questions: _containers.RepeatedScalarFieldContainer[str]
    def __init__(self, document: _Optional[_Union[Document, _Mapping]] = ..., questions: _Optional[_Iterable[str]] = ...) -> None: ...

class DocumentQuestionResponse(_message.Message):
    __slots__ = ("answers",)
    ANSWERS_FIELD_NUMBER: _ClassVar[int]
    answers: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.AnswerCandidate]
    def __init__(self, answers: _Optional[_Iterable[_Union[_candidate_pb2.AnswerCandidate, _Mapping]]] = ...) -> None: ...
