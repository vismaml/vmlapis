from google.type import date_pb2 as _date_pb2
from ssn.type import candidate_pb2 as _candidate_pb2
from ssn.type import text_annotation_pb2 as _text_annotation_pb2
from google.protobuf.internal import containers as _containers
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Iterable as _Iterable, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class FeatureGenRequest(_message.Message):
    __slots__ = ("truth_labels", "text_annotation", "id")
    class TruthLabels(_message.Message):
        __slots__ = ("total_incl_vat", "total_vat", "total_excl_vat", "order_date", "payment_due_date", "document_type", "currency", "credit_card_number", "payment_method", "ocr_line_dk_type", "ocr_line_dk_payment_id", "ocr_line_dk_creditor_id", "ocr_line_se_payment_id", "ocr_line_se_bankgiro_creditor_id", "ocr_line_se_plusgiro_creditor_id", "ocr_line_no_payment_id", "ocr_line_fi_payment_id", "ocr_line_nl_payment_id", "supplier_corporate_id", "supplier_country_code", "invoice_number", "iban", "bank_account_number", "bank_registration_number", "supplier_name", "bic", "document_number", "document_date", "order_number", "supplier_vat_number", "supplier_organisation_number", "supplier_address", "credit_card_last_four", "customer_number", "receiver_order_number", "ocr_line_be_payment_id", "receiver_address", "receiver_country_code", "receiver_name", "receiver_vat_number")
        TOTAL_INCL_VAT_FIELD_NUMBER: _ClassVar[int]
        TOTAL_VAT_FIELD_NUMBER: _ClassVar[int]
        TOTAL_EXCL_VAT_FIELD_NUMBER: _ClassVar[int]
        ORDER_DATE_FIELD_NUMBER: _ClassVar[int]
        PAYMENT_DUE_DATE_FIELD_NUMBER: _ClassVar[int]
        DOCUMENT_TYPE_FIELD_NUMBER: _ClassVar[int]
        CURRENCY_FIELD_NUMBER: _ClassVar[int]
        CREDIT_CARD_NUMBER_FIELD_NUMBER: _ClassVar[int]
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
        CREDIT_CARD_LAST_FOUR_FIELD_NUMBER: _ClassVar[int]
        CUSTOMER_NUMBER_FIELD_NUMBER: _ClassVar[int]
        RECEIVER_ORDER_NUMBER_FIELD_NUMBER: _ClassVar[int]
        OCR_LINE_BE_PAYMENT_ID_FIELD_NUMBER: _ClassVar[int]
        RECEIVER_ADDRESS_FIELD_NUMBER: _ClassVar[int]
        RECEIVER_COUNTRY_CODE_FIELD_NUMBER: _ClassVar[int]
        RECEIVER_NAME_FIELD_NUMBER: _ClassVar[int]
        RECEIVER_VAT_NUMBER_FIELD_NUMBER: _ClassVar[int]
        total_incl_vat: float
        total_vat: float
        total_excl_vat: float
        order_date: _date_pb2.Date
        payment_due_date: _date_pb2.Date
        document_type: str
        currency: str
        credit_card_number: str
        payment_method: str
        ocr_line_dk_type: str
        ocr_line_dk_payment_id: str
        ocr_line_dk_creditor_id: str
        ocr_line_se_payment_id: str
        ocr_line_se_bankgiro_creditor_id: str
        ocr_line_se_plusgiro_creditor_id: str
        ocr_line_no_payment_id: str
        ocr_line_fi_payment_id: str
        ocr_line_nl_payment_id: str
        supplier_corporate_id: str
        supplier_country_code: str
        invoice_number: str
        iban: str
        bank_account_number: str
        bank_registration_number: str
        supplier_name: str
        bic: str
        document_number: str
        document_date: _date_pb2.Date
        order_number: str
        supplier_vat_number: str
        supplier_organisation_number: str
        supplier_address: str
        credit_card_last_four: str
        customer_number: str
        receiver_order_number: str
        ocr_line_be_payment_id: str
        receiver_address: str
        receiver_country_code: str
        receiver_name: str
        receiver_vat_number: str
        def __init__(self, total_incl_vat: _Optional[float] = ..., total_vat: _Optional[float] = ..., total_excl_vat: _Optional[float] = ..., order_date: _Optional[_Union[_date_pb2.Date, _Mapping]] = ..., payment_due_date: _Optional[_Union[_date_pb2.Date, _Mapping]] = ..., document_type: _Optional[str] = ..., currency: _Optional[str] = ..., credit_card_number: _Optional[str] = ..., payment_method: _Optional[str] = ..., ocr_line_dk_type: _Optional[str] = ..., ocr_line_dk_payment_id: _Optional[str] = ..., ocr_line_dk_creditor_id: _Optional[str] = ..., ocr_line_se_payment_id: _Optional[str] = ..., ocr_line_se_bankgiro_creditor_id: _Optional[str] = ..., ocr_line_se_plusgiro_creditor_id: _Optional[str] = ..., ocr_line_no_payment_id: _Optional[str] = ..., ocr_line_fi_payment_id: _Optional[str] = ..., ocr_line_nl_payment_id: _Optional[str] = ..., supplier_corporate_id: _Optional[str] = ..., supplier_country_code: _Optional[str] = ..., invoice_number: _Optional[str] = ..., iban: _Optional[str] = ..., bank_account_number: _Optional[str] = ..., bank_registration_number: _Optional[str] = ..., supplier_name: _Optional[str] = ..., bic: _Optional[str] = ..., document_number: _Optional[str] = ..., document_date: _Optional[_Union[_date_pb2.Date, _Mapping]] = ..., order_number: _Optional[str] = ..., supplier_vat_number: _Optional[str] = ..., supplier_organisation_number: _Optional[str] = ..., supplier_address: _Optional[str] = ..., credit_card_last_four: _Optional[str] = ..., customer_number: _Optional[str] = ..., receiver_order_number: _Optional[str] = ..., ocr_line_be_payment_id: _Optional[str] = ..., receiver_address: _Optional[str] = ..., receiver_country_code: _Optional[str] = ..., receiver_name: _Optional[str] = ..., receiver_vat_number: _Optional[str] = ...) -> None: ...
    TRUTH_LABELS_FIELD_NUMBER: _ClassVar[int]
    TEXT_ANNOTATION_FIELD_NUMBER: _ClassVar[int]
    ID_FIELD_NUMBER: _ClassVar[int]
    truth_labels: FeatureGenRequest.TruthLabels
    text_annotation: _text_annotation_pb2.TextAnnotation
    id: str
    def __init__(self, truth_labels: _Optional[_Union[FeatureGenRequest.TruthLabels, _Mapping]] = ..., text_annotation: _Optional[_Union[_text_annotation_pb2.TextAnnotation, _Mapping]] = ..., id: _Optional[str] = ...) -> None: ...

class FeatureGenResponse(_message.Message):
    __slots__ = ()
    def __init__(self) -> None: ...

class PredictRequest(_message.Message):
    __slots__ = ("top_n_most_confident",)
    TOP_N_MOST_CONFIDENT_FIELD_NUMBER: _ClassVar[int]
    top_n_most_confident: int
    def __init__(self, top_n_most_confident: _Optional[int] = ...) -> None: ...

class PredictResponse(_message.Message):
    __slots__ = ("order_date", "payment_due_date", "currency", "total_vat", "total_incl_vat", "total_excl_vat", "supplier_corporate_id", "supplier_country_code", "document_type", "payment_method", "credit_card_number", "invoice_number", "ocr_line_dk_type", "ocr_line_dk_payment_id", "ocr_line_dk_creditor_id", "ocr_line_se_payment_id", "ocr_line_se_bankgiro_creditor_id", "ocr_line_se_plusgiro_creditor_id", "ocr_line_no_payment_id", "ocr_line_fi_payment_id", "ocr_line_nl_payment_id", "iban", "lines", "bank_account_number", "bank_registration_number", "bic", "document_number", "document_date", "order_number", "supplier_name", "supplier_vat_number", "supplier_organisation_number", "supplier_address", "credit_card_last_four", "customer_number", "receiver_order_number", "ocr_line_be_payment_id", "receiver_address", "receiver_country_code", "receiver_name", "receiver_vat_number")
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
    CREDIT_CARD_NUMBER_FIELD_NUMBER: _ClassVar[int]
    INVOICE_NUMBER_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_DK_TYPE_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_DK_PAYMENT_ID_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_DK_CREDITOR_ID_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_SE_PAYMENT_ID_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_SE_BANKGIRO_CREDITOR_ID_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_SE_PLUSGIRO_CREDITOR_ID_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_NO_PAYMENT_ID_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_FI_PAYMENT_ID_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_NL_PAYMENT_ID_FIELD_NUMBER: _ClassVar[int]
    IBAN_FIELD_NUMBER: _ClassVar[int]
    LINES_FIELD_NUMBER: _ClassVar[int]
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
    CREDIT_CARD_LAST_FOUR_FIELD_NUMBER: _ClassVar[int]
    CUSTOMER_NUMBER_FIELD_NUMBER: _ClassVar[int]
    RECEIVER_ORDER_NUMBER_FIELD_NUMBER: _ClassVar[int]
    OCR_LINE_BE_PAYMENT_ID_FIELD_NUMBER: _ClassVar[int]
    RECEIVER_ADDRESS_FIELD_NUMBER: _ClassVar[int]
    RECEIVER_COUNTRY_CODE_FIELD_NUMBER: _ClassVar[int]
    RECEIVER_NAME_FIELD_NUMBER: _ClassVar[int]
    RECEIVER_VAT_NUMBER_FIELD_NUMBER: _ClassVar[int]
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
    credit_card_number: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    invoice_number: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    ocr_line_dk_type: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    ocr_line_dk_payment_id: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    ocr_line_dk_creditor_id: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    ocr_line_se_payment_id: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    ocr_line_se_bankgiro_creditor_id: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    ocr_line_se_plusgiro_creditor_id: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    ocr_line_no_payment_id: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    ocr_line_fi_payment_id: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    ocr_line_nl_payment_id: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    iban: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    lines: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.LineCandidate]
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
    credit_card_last_four: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    customer_number: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    receiver_order_number: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    ocr_line_be_payment_id: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    receiver_address: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    receiver_country_code: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    receiver_name: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    receiver_vat_number: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    def __init__(self, order_date: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., payment_due_date: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., currency: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., total_vat: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., total_incl_vat: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., total_excl_vat: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., supplier_corporate_id: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., supplier_country_code: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., document_type: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., payment_method: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., credit_card_number: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., invoice_number: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., ocr_line_dk_type: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., ocr_line_dk_payment_id: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., ocr_line_dk_creditor_id: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., ocr_line_se_payment_id: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., ocr_line_se_bankgiro_creditor_id: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., ocr_line_se_plusgiro_creditor_id: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., ocr_line_no_payment_id: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., ocr_line_fi_payment_id: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., ocr_line_nl_payment_id: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., iban: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., lines: _Optional[_Iterable[_Union[_candidate_pb2.LineCandidate, _Mapping]]] = ..., bank_account_number: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., bank_registration_number: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., bic: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., document_number: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., document_date: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., order_number: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., supplier_name: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., supplier_vat_number: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., supplier_organisation_number: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., supplier_address: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., credit_card_last_four: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., customer_number: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., receiver_order_number: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., ocr_line_be_payment_id: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., receiver_address: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., receiver_country_code: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., receiver_name: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., receiver_vat_number: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ...) -> None: ...

class FeatureGenPredictRequest(_message.Message):
    __slots__ = ("feature_gen_request", "predict_request")
    FEATURE_GEN_REQUEST_FIELD_NUMBER: _ClassVar[int]
    PREDICT_REQUEST_FIELD_NUMBER: _ClassVar[int]
    feature_gen_request: FeatureGenRequest
    predict_request: PredictRequest
    def __init__(self, feature_gen_request: _Optional[_Union[FeatureGenRequest, _Mapping]] = ..., predict_request: _Optional[_Union[PredictRequest, _Mapping]] = ...) -> None: ...

class PurchaseLinesRequest(_message.Message):
    __slots__ = ("text_annotation", "image")
    TEXT_ANNOTATION_FIELD_NUMBER: _ClassVar[int]
    IMAGE_FIELD_NUMBER: _ClassVar[int]
    text_annotation: _text_annotation_pb2.TextAnnotation
    image: bytes
    def __init__(self, text_annotation: _Optional[_Union[_text_annotation_pb2.TextAnnotation, _Mapping]] = ..., image: _Optional[bytes] = ...) -> None: ...

class PurchaseLinesResponse(_message.Message):
    __slots__ = ("purchase_lines",)
    PURCHASE_LINES_FIELD_NUMBER: _ClassVar[int]
    purchase_lines: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.PurchaseLineCandidate]
    def __init__(self, purchase_lines: _Optional[_Iterable[_Union[_candidate_pb2.PurchaseLineCandidate, _Mapping]]] = ...) -> None: ...

class DocQARequest(_message.Message):
    __slots__ = ("text_annotation", "image", "questions")
    TEXT_ANNOTATION_FIELD_NUMBER: _ClassVar[int]
    IMAGE_FIELD_NUMBER: _ClassVar[int]
    QUESTIONS_FIELD_NUMBER: _ClassVar[int]
    text_annotation: _text_annotation_pb2.TextAnnotation
    image: bytes
    questions: _containers.RepeatedScalarFieldContainer[str]
    def __init__(self, text_annotation: _Optional[_Union[_text_annotation_pb2.TextAnnotation, _Mapping]] = ..., image: _Optional[bytes] = ..., questions: _Optional[_Iterable[str]] = ...) -> None: ...

class DocQAResponse(_message.Message):
    __slots__ = ("answers",)
    ANSWERS_FIELD_NUMBER: _ClassVar[int]
    answers: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.AnswerCandidate]
    def __init__(self, answers: _Optional[_Iterable[_Union[_candidate_pb2.AnswerCandidate, _Mapping]]] = ...) -> None: ...

class VatDistributionRequest(_message.Message):
    __slots__ = ("text_annotation", "country_code", "images")
    TEXT_ANNOTATION_FIELD_NUMBER: _ClassVar[int]
    COUNTRY_CODE_FIELD_NUMBER: _ClassVar[int]
    IMAGES_FIELD_NUMBER: _ClassVar[int]
    text_annotation: _text_annotation_pb2.TextAnnotation
    country_code: str
    images: _containers.RepeatedScalarFieldContainer[bytes]
    def __init__(self, text_annotation: _Optional[_Union[_text_annotation_pb2.TextAnnotation, _Mapping]] = ..., country_code: _Optional[str] = ..., images: _Optional[_Iterable[bytes]] = ...) -> None: ...

class VatDistributionResponse(_message.Message):
    __slots__ = ("vat_distribution_candidates",)
    VAT_DISTRIBUTION_CANDIDATES_FIELD_NUMBER: _ClassVar[int]
    vat_distribution_candidates: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.VatDistributionCandidate]
    def __init__(self, vat_distribution_candidates: _Optional[_Iterable[_Union[_candidate_pb2.VatDistributionCandidate, _Mapping]]] = ...) -> None: ...
