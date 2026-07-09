from google.api import annotations_pb2 as _annotations_pb2
from google.protobuf import timestamp_pb2 as _timestamp_pb2
from google.protobuf import wrappers_pb2 as _wrappers_pb2
from ssn.type import address_pb2 as _address_pb2
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

class InternalEntry(_message.Message):
    __slots__ = ("source", "source_id", "created_at", "candidate_id", "candidate", "line", "distribution", "qr_code_data", "swiss_qr_bill", "answer", "address")
    SOURCE_FIELD_NUMBER: _ClassVar[int]
    SOURCE_ID_FIELD_NUMBER: _ClassVar[int]
    CREATED_AT_FIELD_NUMBER: _ClassVar[int]
    CANDIDATE_ID_FIELD_NUMBER: _ClassVar[int]
    CANDIDATE_FIELD_NUMBER: _ClassVar[int]
    LINE_FIELD_NUMBER: _ClassVar[int]
    DISTRIBUTION_FIELD_NUMBER: _ClassVar[int]
    QR_CODE_DATA_FIELD_NUMBER: _ClassVar[int]
    SWISS_QR_BILL_FIELD_NUMBER: _ClassVar[int]
    ANSWER_FIELD_NUMBER: _ClassVar[int]
    ADDRESS_FIELD_NUMBER: _ClassVar[int]
    source: CandidateSource
    source_id: str
    created_at: _timestamp_pb2.Timestamp
    candidate_id: int
    candidate: _candidate_pb2.Candidate
    line: _candidate_pb2.PurchaseLine
    distribution: _candidate_pb2.VatDistribution
    qr_code_data: _qr_pb2.QrCodeData
    swiss_qr_bill: _qr_pb2.SwissQrBill
    answer: _candidate_pb2.AnswerCandidate
    address: _address_pb2.StructuredAddress
    def __init__(self, source: _Optional[_Union[CandidateSource, str]] = ..., source_id: _Optional[str] = ..., created_at: _Optional[_Union[_timestamp_pb2.Timestamp, _Mapping]] = ..., candidate_id: _Optional[int] = ..., candidate: _Optional[_Union[_candidate_pb2.Candidate, _Mapping]] = ..., line: _Optional[_Union[_candidate_pb2.PurchaseLine, _Mapping]] = ..., distribution: _Optional[_Union[_candidate_pb2.VatDistribution, _Mapping]] = ..., qr_code_data: _Optional[_Union[_qr_pb2.QrCodeData, _Mapping]] = ..., swiss_qr_bill: _Optional[_Union[_qr_pb2.SwissQrBill, _Mapping]] = ..., answer: _Optional[_Union[_candidate_pb2.AnswerCandidate, _Mapping]] = ..., address: _Optional[_Union[_address_pb2.StructuredAddress, _Mapping]] = ...) -> None: ...

class InternalFieldAnnotation(_message.Message):
    __slots__ = ("feature", "entries")
    FEATURE_FIELD_NUMBER: _ClassVar[int]
    ENTRIES_FIELD_NUMBER: _ClassVar[int]
    feature: str
    entries: _containers.RepeatedCompositeFieldContainer[InternalEntry]
    def __init__(self, feature: _Optional[str] = ..., entries: _Optional[_Iterable[_Union[InternalEntry, _Mapping]]] = ...) -> None: ...

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
    __slots__ = ("feedback_id", "consumer", "file_url", "render_urls", "text_annotation_url", "fields", "expires_at", "requested_features", "updated_at", "tags")
    FEEDBACK_ID_FIELD_NUMBER: _ClassVar[int]
    CONSUMER_FIELD_NUMBER: _ClassVar[int]
    FILE_URL_FIELD_NUMBER: _ClassVar[int]
    RENDER_URLS_FIELD_NUMBER: _ClassVar[int]
    TEXT_ANNOTATION_URL_FIELD_NUMBER: _ClassVar[int]
    FIELDS_FIELD_NUMBER: _ClassVar[int]
    EXPIRES_AT_FIELD_NUMBER: _ClassVar[int]
    REQUESTED_FEATURES_FIELD_NUMBER: _ClassVar[int]
    UPDATED_AT_FIELD_NUMBER: _ClassVar[int]
    TAGS_FIELD_NUMBER: _ClassVar[int]
    feedback_id: str
    consumer: str
    file_url: str
    render_urls: _containers.RepeatedScalarFieldContainer[str]
    text_annotation_url: _wrappers_pb2.StringValue
    fields: _containers.RepeatedCompositeFieldContainer[InternalFieldAnnotation]
    expires_at: _timestamp_pb2.Timestamp
    requested_features: _containers.RepeatedScalarFieldContainer[str]
    updated_at: _timestamp_pb2.Timestamp
    tags: _containers.RepeatedScalarFieldContainer[str]
    def __init__(self, feedback_id: _Optional[str] = ..., consumer: _Optional[str] = ..., file_url: _Optional[str] = ..., render_urls: _Optional[_Iterable[str]] = ..., text_annotation_url: _Optional[_Union[_wrappers_pb2.StringValue, _Mapping]] = ..., fields: _Optional[_Iterable[_Union[InternalFieldAnnotation, _Mapping]]] = ..., expires_at: _Optional[_Union[_timestamp_pb2.Timestamp, _Mapping]] = ..., requested_features: _Optional[_Iterable[str]] = ..., updated_at: _Optional[_Union[_timestamp_pb2.Timestamp, _Mapping]] = ..., tags: _Optional[_Iterable[str]] = ...) -> None: ...

class SetDocumentBlobsRequest(_message.Message):
    __slots__ = ("feedback_id", "consumer", "file_uri", "render_uris", "ta_uri", "expires_at", "environment", "requested_features", "tags", "content", "ta_content", "render_contents")
    FEEDBACK_ID_FIELD_NUMBER: _ClassVar[int]
    CONSUMER_FIELD_NUMBER: _ClassVar[int]
    FILE_URI_FIELD_NUMBER: _ClassVar[int]
    RENDER_URIS_FIELD_NUMBER: _ClassVar[int]
    TA_URI_FIELD_NUMBER: _ClassVar[int]
    EXPIRES_AT_FIELD_NUMBER: _ClassVar[int]
    ENVIRONMENT_FIELD_NUMBER: _ClassVar[int]
    REQUESTED_FEATURES_FIELD_NUMBER: _ClassVar[int]
    TAGS_FIELD_NUMBER: _ClassVar[int]
    CONTENT_FIELD_NUMBER: _ClassVar[int]
    TA_CONTENT_FIELD_NUMBER: _ClassVar[int]
    RENDER_CONTENTS_FIELD_NUMBER: _ClassVar[int]
    feedback_id: str
    consumer: str
    file_uri: _wrappers_pb2.StringValue
    render_uris: _containers.RepeatedScalarFieldContainer[str]
    ta_uri: _wrappers_pb2.StringValue
    expires_at: _timestamp_pb2.Timestamp
    environment: str
    requested_features: _containers.RepeatedScalarFieldContainer[str]
    tags: _containers.RepeatedScalarFieldContainer[str]
    content: bytes
    ta_content: bytes
    render_contents: _containers.RepeatedScalarFieldContainer[bytes]
    def __init__(self, feedback_id: _Optional[str] = ..., consumer: _Optional[str] = ..., file_uri: _Optional[_Union[_wrappers_pb2.StringValue, _Mapping]] = ..., render_uris: _Optional[_Iterable[str]] = ..., ta_uri: _Optional[_Union[_wrappers_pb2.StringValue, _Mapping]] = ..., expires_at: _Optional[_Union[_timestamp_pb2.Timestamp, _Mapping]] = ..., environment: _Optional[str] = ..., requested_features: _Optional[_Iterable[str]] = ..., tags: _Optional[_Iterable[str]] = ..., content: _Optional[bytes] = ..., ta_content: _Optional[bytes] = ..., render_contents: _Optional[_Iterable[bytes]] = ...) -> None: ...

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

class DeleteDocumentRequest(_message.Message):
    __slots__ = ("feedback_id", "consumer")
    FEEDBACK_ID_FIELD_NUMBER: _ClassVar[int]
    CONSUMER_FIELD_NUMBER: _ClassVar[int]
    feedback_id: str
    consumer: str
    def __init__(self, feedback_id: _Optional[str] = ..., consumer: _Optional[str] = ...) -> None: ...

class DeleteDocumentResponse(_message.Message):
    __slots__ = ()
    def __init__(self) -> None: ...

class DeleteAnnotationsRequest(_message.Message):
    __slots__ = ("feedback_id", "consumer", "feature", "source", "source_id")
    FEEDBACK_ID_FIELD_NUMBER: _ClassVar[int]
    CONSUMER_FIELD_NUMBER: _ClassVar[int]
    FEATURE_FIELD_NUMBER: _ClassVar[int]
    SOURCE_FIELD_NUMBER: _ClassVar[int]
    SOURCE_ID_FIELD_NUMBER: _ClassVar[int]
    feedback_id: str
    consumer: str
    feature: str
    source: str
    source_id: str
    def __init__(self, feedback_id: _Optional[str] = ..., consumer: _Optional[str] = ..., feature: _Optional[str] = ..., source: _Optional[str] = ..., source_id: _Optional[str] = ...) -> None: ...

class DeleteAnnotationsResponse(_message.Message):
    __slots__ = ()
    def __init__(self) -> None: ...
