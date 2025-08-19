from google.api import annotations_pb2 as _annotations_pb2
from google.protobuf import empty_pb2 as _empty_pb2
from protoc_gen_openapiv2.options import annotations_pb2 as _annotations_pb2_1
from ssn.annotator.v1 import annotator_pb2 as _annotator_pb2
from ssn.type import candidate_pb2 as _candidate_pb2
from ssn.type import text_annotation_pb2 as _text_annotation_pb2
from validate import validate_pb2 as _validate_pb2
from google.protobuf.internal import containers as _containers
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Iterable as _Iterable, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class CreateTransactionRequest(_message.Message):
    __slots__ = ("document", "tags", "features", "custom_id")
    DOCUMENT_FIELD_NUMBER: _ClassVar[int]
    TAGS_FIELD_NUMBER: _ClassVar[int]
    FEATURES_FIELD_NUMBER: _ClassVar[int]
    CUSTOM_ID_FIELD_NUMBER: _ClassVar[int]
    document: _annotator_pb2.Document
    tags: _containers.RepeatedScalarFieldContainer[str]
    features: _containers.RepeatedScalarFieldContainer[str]
    custom_id: str
    def __init__(self, document: _Optional[_Union[_annotator_pb2.Document, _Mapping]] = ..., tags: _Optional[_Iterable[str]] = ..., features: _Optional[_Iterable[str]] = ..., custom_id: _Optional[str] = ...) -> None: ...

class CreateTransactionResponse(_message.Message):
    __slots__ = ("id", "custom_id")
    ID_FIELD_NUMBER: _ClassVar[int]
    CUSTOM_ID_FIELD_NUMBER: _ClassVar[int]
    id: str
    custom_id: str
    def __init__(self, id: _Optional[str] = ..., custom_id: _Optional[str] = ...) -> None: ...

class GetTransactionResultsRequest(_message.Message):
    __slots__ = ("id", "custom_id", "min_confidence", "max_results")
    ID_FIELD_NUMBER: _ClassVar[int]
    CUSTOM_ID_FIELD_NUMBER: _ClassVar[int]
    MIN_CONFIDENCE_FIELD_NUMBER: _ClassVar[int]
    MAX_RESULTS_FIELD_NUMBER: _ClassVar[int]
    id: str
    custom_id: str
    min_confidence: _candidate_pb2.Confidence.Level
    max_results: int
    def __init__(self, id: _Optional[str] = ..., custom_id: _Optional[str] = ..., min_confidence: _Optional[_Union[_candidate_pb2.Confidence.Level, str]] = ..., max_results: _Optional[int] = ...) -> None: ...

class GetTransactionResultsResponse(_message.Message):
    __slots__ = ("id", "annotations", "error_message", "custom_id")
    ID_FIELD_NUMBER: _ClassVar[int]
    ANNOTATIONS_FIELD_NUMBER: _ClassVar[int]
    ERROR_MESSAGE_FIELD_NUMBER: _ClassVar[int]
    CUSTOM_ID_FIELD_NUMBER: _ClassVar[int]
    id: str
    annotations: _containers.RepeatedCompositeFieldContainer[Annotation]
    error_message: str
    custom_id: str
    def __init__(self, id: _Optional[str] = ..., annotations: _Optional[_Iterable[_Union[Annotation, _Mapping]]] = ..., error_message: _Optional[str] = ..., custom_id: _Optional[str] = ...) -> None: ...

class Annotation(_message.Message):
    __slots__ = ("feature", "candidates", "purchase_line_candidates", "answer_candidates", "text_annotation", "page_texts")
    FEATURE_FIELD_NUMBER: _ClassVar[int]
    CANDIDATES_FIELD_NUMBER: _ClassVar[int]
    PURCHASE_LINE_CANDIDATES_FIELD_NUMBER: _ClassVar[int]
    ANSWER_CANDIDATES_FIELD_NUMBER: _ClassVar[int]
    TEXT_ANNOTATION_FIELD_NUMBER: _ClassVar[int]
    PAGE_TEXTS_FIELD_NUMBER: _ClassVar[int]
    feature: str
    candidates: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    purchase_line_candidates: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.PurchaseLineCandidate]
    answer_candidates: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.AnswerCandidate]
    text_annotation: _text_annotation_pb2.TextAnnotation
    page_texts: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.PageText]
    def __init__(self, feature: _Optional[str] = ..., candidates: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., purchase_line_candidates: _Optional[_Iterable[_Union[_candidate_pb2.PurchaseLineCandidate, _Mapping]]] = ..., answer_candidates: _Optional[_Iterable[_Union[_candidate_pb2.AnswerCandidate, _Mapping]]] = ..., text_annotation: _Optional[_Union[_text_annotation_pb2.TextAnnotation, _Mapping]] = ..., page_texts: _Optional[_Iterable[_Union[_candidate_pb2.PageText, _Mapping]]] = ...) -> None: ...

class GetTransactionStatusRequest(_message.Message):
    __slots__ = ("id", "custom_id")
    ID_FIELD_NUMBER: _ClassVar[int]
    CUSTOM_ID_FIELD_NUMBER: _ClassVar[int]
    id: str
    custom_id: str
    def __init__(self, id: _Optional[str] = ..., custom_id: _Optional[str] = ...) -> None: ...

class GetTransactionStatusResponse(_message.Message):
    __slots__ = ("id", "status", "error_message", "custom_id")
    ID_FIELD_NUMBER: _ClassVar[int]
    STATUS_FIELD_NUMBER: _ClassVar[int]
    ERROR_MESSAGE_FIELD_NUMBER: _ClassVar[int]
    CUSTOM_ID_FIELD_NUMBER: _ClassVar[int]
    id: str
    status: str
    error_message: str
    custom_id: str
    def __init__(self, id: _Optional[str] = ..., status: _Optional[str] = ..., error_message: _Optional[str] = ..., custom_id: _Optional[str] = ...) -> None: ...

class DeleteTransactionRequest(_message.Message):
    __slots__ = ("id", "custom_id")
    ID_FIELD_NUMBER: _ClassVar[int]
    CUSTOM_ID_FIELD_NUMBER: _ClassVar[int]
    id: str
    custom_id: str
    def __init__(self, id: _Optional[str] = ..., custom_id: _Optional[str] = ...) -> None: ...

class DeleteTagRequest(_message.Message):
    __slots__ = ("tag_name",)
    TAG_NAME_FIELD_NUMBER: _ClassVar[int]
    tag_name: str
    def __init__(self, tag_name: _Optional[str] = ...) -> None: ...
