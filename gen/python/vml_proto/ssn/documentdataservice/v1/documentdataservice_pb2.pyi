from google.api import annotations_pb2 as _annotations_pb2
from google.protobuf import timestamp_pb2 as _timestamp_pb2
from google.protobuf import wrappers_pb2 as _wrappers_pb2
from ssn.type import candidate_pb2 as _candidate_pb2
from ssn.type import qr_pb2 as _qr_pb2
from google.protobuf.internal import containers as _containers
from google.protobuf.internal import enum_type_wrapper as _enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Iterable as _Iterable, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class CandidateSource(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
    __slots__ = ()
    CANDIDATE_SOURCE_UNSPECIFIED: _ClassVar[CandidateSource]
    CANDIDATE_SOURCE_PREDICTION: _ClassVar[CandidateSource]
    CANDIDATE_SOURCE_FEEDBACK: _ClassVar[CandidateSource]
    CANDIDATE_SOURCE_LABEL: _ClassVar[CandidateSource]
CANDIDATE_SOURCE_UNSPECIFIED: CandidateSource
CANDIDATE_SOURCE_PREDICTION: CandidateSource
CANDIDATE_SOURCE_FEEDBACK: CandidateSource
CANDIDATE_SOURCE_LABEL: CandidateSource

class InternalCandidate(_message.Message):
    __slots__ = ("candidate", "source", "source_id")
    CANDIDATE_FIELD_NUMBER: _ClassVar[int]
    SOURCE_FIELD_NUMBER: _ClassVar[int]
    SOURCE_ID_FIELD_NUMBER: _ClassVar[int]
    candidate: _candidate_pb2.Candidate
    source: CandidateSource
    source_id: str
    def __init__(self, candidate: _Optional[_Union[_candidate_pb2.Candidate, _Mapping]] = ..., source: _Optional[_Union[CandidateSource, str]] = ..., source_id: _Optional[str] = ...) -> None: ...

class FieldData(_message.Message):
    __slots__ = ("candidates",)
    CANDIDATES_FIELD_NUMBER: _ClassVar[int]
    candidates: _containers.RepeatedCompositeFieldContainer[InternalCandidate]
    def __init__(self, candidates: _Optional[_Iterable[_Union[InternalCandidate, _Mapping]]] = ...) -> None: ...

class InternalPurchaseLine(_message.Message):
    __slots__ = ("line", "source", "source_id")
    LINE_FIELD_NUMBER: _ClassVar[int]
    SOURCE_FIELD_NUMBER: _ClassVar[int]
    SOURCE_ID_FIELD_NUMBER: _ClassVar[int]
    line: _candidate_pb2.PurchaseLine
    source: CandidateSource
    source_id: str
    def __init__(self, line: _Optional[_Union[_candidate_pb2.PurchaseLine, _Mapping]] = ..., source: _Optional[_Union[CandidateSource, str]] = ..., source_id: _Optional[str] = ...) -> None: ...

class PurchaseLineData(_message.Message):
    __slots__ = ("lines",)
    LINES_FIELD_NUMBER: _ClassVar[int]
    lines: _containers.RepeatedCompositeFieldContainer[InternalPurchaseLine]
    def __init__(self, lines: _Optional[_Iterable[_Union[InternalPurchaseLine, _Mapping]]] = ...) -> None: ...

class InternalVatDistribution(_message.Message):
    __slots__ = ("distribution", "source", "source_id")
    DISTRIBUTION_FIELD_NUMBER: _ClassVar[int]
    SOURCE_FIELD_NUMBER: _ClassVar[int]
    SOURCE_ID_FIELD_NUMBER: _ClassVar[int]
    distribution: _candidate_pb2.VatDistribution
    source: CandidateSource
    source_id: str
    def __init__(self, distribution: _Optional[_Union[_candidate_pb2.VatDistribution, _Mapping]] = ..., source: _Optional[_Union[CandidateSource, str]] = ..., source_id: _Optional[str] = ...) -> None: ...

class VatDistributionData(_message.Message):
    __slots__ = ("distributions",)
    DISTRIBUTIONS_FIELD_NUMBER: _ClassVar[int]
    distributions: _containers.RepeatedCompositeFieldContainer[InternalVatDistribution]
    def __init__(self, distributions: _Optional[_Iterable[_Union[InternalVatDistribution, _Mapping]]] = ...) -> None: ...

class InternalQrCode(_message.Message):
    __slots__ = ("qr_code_data", "swiss_qr_bill", "source", "source_id")
    QR_CODE_DATA_FIELD_NUMBER: _ClassVar[int]
    SWISS_QR_BILL_FIELD_NUMBER: _ClassVar[int]
    SOURCE_FIELD_NUMBER: _ClassVar[int]
    SOURCE_ID_FIELD_NUMBER: _ClassVar[int]
    qr_code_data: _qr_pb2.QrCodeData
    swiss_qr_bill: _qr_pb2.SwissQrBill
    source: CandidateSource
    source_id: str
    def __init__(self, qr_code_data: _Optional[_Union[_qr_pb2.QrCodeData, _Mapping]] = ..., swiss_qr_bill: _Optional[_Union[_qr_pb2.SwissQrBill, _Mapping]] = ..., source: _Optional[_Union[CandidateSource, str]] = ..., source_id: _Optional[str] = ...) -> None: ...

class QrData(_message.Message):
    __slots__ = ("qr_codes",)
    QR_CODES_FIELD_NUMBER: _ClassVar[int]
    qr_codes: _containers.RepeatedCompositeFieldContainer[InternalQrCode]
    def __init__(self, qr_codes: _Optional[_Iterable[_Union[InternalQrCode, _Mapping]]] = ...) -> None: ...

class InternalAnswerCandidate(_message.Message):
    __slots__ = ("answer", "source", "source_id")
    ANSWER_FIELD_NUMBER: _ClassVar[int]
    SOURCE_FIELD_NUMBER: _ClassVar[int]
    SOURCE_ID_FIELD_NUMBER: _ClassVar[int]
    answer: _candidate_pb2.AnswerCandidate
    source: CandidateSource
    source_id: str
    def __init__(self, answer: _Optional[_Union[_candidate_pb2.AnswerCandidate, _Mapping]] = ..., source: _Optional[_Union[CandidateSource, str]] = ..., source_id: _Optional[str] = ...) -> None: ...

class AnswerData(_message.Message):
    __slots__ = ("answers",)
    ANSWERS_FIELD_NUMBER: _ClassVar[int]
    answers: _containers.RepeatedCompositeFieldContainer[InternalAnswerCandidate]
    def __init__(self, answers: _Optional[_Iterable[_Union[InternalAnswerCandidate, _Mapping]]] = ...) -> None: ...

class InternalFieldAnnotation(_message.Message):
    __slots__ = ("feature", "field_data", "purchase_line_data", "vat_distribution_data", "qr_data", "answer_data")
    FEATURE_FIELD_NUMBER: _ClassVar[int]
    FIELD_DATA_FIELD_NUMBER: _ClassVar[int]
    PURCHASE_LINE_DATA_FIELD_NUMBER: _ClassVar[int]
    VAT_DISTRIBUTION_DATA_FIELD_NUMBER: _ClassVar[int]
    QR_DATA_FIELD_NUMBER: _ClassVar[int]
    ANSWER_DATA_FIELD_NUMBER: _ClassVar[int]
    feature: str
    field_data: FieldData
    purchase_line_data: PurchaseLineData
    vat_distribution_data: VatDistributionData
    qr_data: QrData
    answer_data: AnswerData
    def __init__(self, feature: _Optional[str] = ..., field_data: _Optional[_Union[FieldData, _Mapping]] = ..., purchase_line_data: _Optional[_Union[PurchaseLineData, _Mapping]] = ..., vat_distribution_data: _Optional[_Union[VatDistributionData, _Mapping]] = ..., qr_data: _Optional[_Union[QrData, _Mapping]] = ..., answer_data: _Optional[_Union[AnswerData, _Mapping]] = ...) -> None: ...

class GetDocumentDataRequest(_message.Message):
    __slots__ = ("feedback_id", "consumer", "include_predictions", "include_feedbacks", "include_labels", "environment")
    FEEDBACK_ID_FIELD_NUMBER: _ClassVar[int]
    CONSUMER_FIELD_NUMBER: _ClassVar[int]
    INCLUDE_PREDICTIONS_FIELD_NUMBER: _ClassVar[int]
    INCLUDE_FEEDBACKS_FIELD_NUMBER: _ClassVar[int]
    INCLUDE_LABELS_FIELD_NUMBER: _ClassVar[int]
    ENVIRONMENT_FIELD_NUMBER: _ClassVar[int]
    feedback_id: str
    consumer: str
    include_predictions: bool
    include_feedbacks: bool
    include_labels: bool
    environment: str
    def __init__(self, feedback_id: _Optional[str] = ..., consumer: _Optional[str] = ..., include_predictions: bool = ..., include_feedbacks: bool = ..., include_labels: bool = ..., environment: _Optional[str] = ...) -> None: ...

class GetDocumentDataResponse(_message.Message):
    __slots__ = ("feedback_id", "consumer", "file_url", "render_urls", "text_annotation_url", "fields", "expires_at", "requested_features")
    FEEDBACK_ID_FIELD_NUMBER: _ClassVar[int]
    CONSUMER_FIELD_NUMBER: _ClassVar[int]
    FILE_URL_FIELD_NUMBER: _ClassVar[int]
    RENDER_URLS_FIELD_NUMBER: _ClassVar[int]
    TEXT_ANNOTATION_URL_FIELD_NUMBER: _ClassVar[int]
    FIELDS_FIELD_NUMBER: _ClassVar[int]
    EXPIRES_AT_FIELD_NUMBER: _ClassVar[int]
    REQUESTED_FEATURES_FIELD_NUMBER: _ClassVar[int]
    feedback_id: str
    consumer: str
    file_url: str
    render_urls: _containers.RepeatedScalarFieldContainer[str]
    text_annotation_url: _wrappers_pb2.StringValue
    fields: _containers.RepeatedCompositeFieldContainer[InternalFieldAnnotation]
    expires_at: _timestamp_pb2.Timestamp
    requested_features: _containers.RepeatedScalarFieldContainer[str]
    def __init__(self, feedback_id: _Optional[str] = ..., consumer: _Optional[str] = ..., file_url: _Optional[str] = ..., render_urls: _Optional[_Iterable[str]] = ..., text_annotation_url: _Optional[_Union[_wrappers_pb2.StringValue, _Mapping]] = ..., fields: _Optional[_Iterable[_Union[InternalFieldAnnotation, _Mapping]]] = ..., expires_at: _Optional[_Union[_timestamp_pb2.Timestamp, _Mapping]] = ..., requested_features: _Optional[_Iterable[str]] = ...) -> None: ...

class SetDocumentBlobsRequest(_message.Message):
    __slots__ = ("feedback_id", "consumer", "file_uri", "render_uris", "ta_uri", "expires_at", "environment")
    FEEDBACK_ID_FIELD_NUMBER: _ClassVar[int]
    CONSUMER_FIELD_NUMBER: _ClassVar[int]
    FILE_URI_FIELD_NUMBER: _ClassVar[int]
    RENDER_URIS_FIELD_NUMBER: _ClassVar[int]
    TA_URI_FIELD_NUMBER: _ClassVar[int]
    EXPIRES_AT_FIELD_NUMBER: _ClassVar[int]
    ENVIRONMENT_FIELD_NUMBER: _ClassVar[int]
    feedback_id: str
    consumer: str
    file_uri: _wrappers_pb2.StringValue
    render_uris: _containers.RepeatedScalarFieldContainer[str]
    ta_uri: _wrappers_pb2.StringValue
    expires_at: _timestamp_pb2.Timestamp
    environment: str
    def __init__(self, feedback_id: _Optional[str] = ..., consumer: _Optional[str] = ..., file_uri: _Optional[_Union[_wrappers_pb2.StringValue, _Mapping]] = ..., render_uris: _Optional[_Iterable[str]] = ..., ta_uri: _Optional[_Union[_wrappers_pb2.StringValue, _Mapping]] = ..., expires_at: _Optional[_Union[_timestamp_pb2.Timestamp, _Mapping]] = ..., environment: _Optional[str] = ...) -> None: ...

class SetDocumentBlobsResponse(_message.Message):
    __slots__ = ()
    def __init__(self) -> None: ...

class AddAnnotationsRequest(_message.Message):
    __slots__ = ("feedback_id", "consumer", "annotations", "environment")
    FEEDBACK_ID_FIELD_NUMBER: _ClassVar[int]
    CONSUMER_FIELD_NUMBER: _ClassVar[int]
    ANNOTATIONS_FIELD_NUMBER: _ClassVar[int]
    ENVIRONMENT_FIELD_NUMBER: _ClassVar[int]
    feedback_id: str
    consumer: str
    annotations: _containers.RepeatedCompositeFieldContainer[InternalFieldAnnotation]
    environment: str
    def __init__(self, feedback_id: _Optional[str] = ..., consumer: _Optional[str] = ..., annotations: _Optional[_Iterable[_Union[InternalFieldAnnotation, _Mapping]]] = ..., environment: _Optional[str] = ...) -> None: ...

class AddAnnotationsResponse(_message.Message):
    __slots__ = ()
    def __init__(self) -> None: ...
