from google.protobuf import wrappers_pb2 as _wrappers_pb2
from ssn.annotator.v1 import annotator_pb2 as _annotator_pb2
from ssn.type import swiss_qr_bill_pb2 as _swiss_qr_bill_pb2
from ssn.type import text_annotation_pb2 as _text_annotation_pb2
from google.protobuf.internal import containers as _containers
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Iterable as _Iterable, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class GetTextAnnotationRequest(_message.Message):
    __slots__ = ("document", "preview", "preview_last")
    DOCUMENT_FIELD_NUMBER: _ClassVar[int]
    PREVIEW_FIELD_NUMBER: _ClassVar[int]
    PREVIEW_LAST_FIELD_NUMBER: _ClassVar[int]
    document: _annotator_pb2.Document
    preview: bool
    preview_last: bool
    def __init__(self, document: _Optional[_Union[_annotator_pb2.Document, _Mapping]] = ..., preview: bool = ..., preview_last: bool = ...) -> None: ...

class GetTextAnnotationResponse(_message.Message):
    __slots__ = ("text_annotation", "image", "last_image")
    TEXT_ANNOTATION_FIELD_NUMBER: _ClassVar[int]
    IMAGE_FIELD_NUMBER: _ClassVar[int]
    LAST_IMAGE_FIELD_NUMBER: _ClassVar[int]
    text_annotation: _text_annotation_pb2.TextAnnotation
    image: _wrappers_pb2.BytesValue
    last_image: _wrappers_pb2.BytesValue
    def __init__(self, text_annotation: _Optional[_Union[_text_annotation_pb2.TextAnnotation, _Mapping]] = ..., image: _Optional[_Union[_wrappers_pb2.BytesValue, _Mapping]] = ..., last_image: _Optional[_Union[_wrappers_pb2.BytesValue, _Mapping]] = ...) -> None: ...

class AsyncCreateOperationRequest(_message.Message):
    __slots__ = ("input_paths", "output_path")
    INPUT_PATHS_FIELD_NUMBER: _ClassVar[int]
    OUTPUT_PATH_FIELD_NUMBER: _ClassVar[int]
    input_paths: _containers.RepeatedScalarFieldContainer[str]
    output_path: str
    def __init__(self, input_paths: _Optional[_Iterable[str]] = ..., output_path: _Optional[str] = ...) -> None: ...

class AsyncCreateOperationResponse(_message.Message):
    __slots__ = ("operation_name",)
    OPERATION_NAME_FIELD_NUMBER: _ClassVar[int]
    operation_name: str
    def __init__(self, operation_name: _Optional[str] = ...) -> None: ...

class AsyncGetOperationStatusRequest(_message.Message):
    __slots__ = ("operation_name",)
    OPERATION_NAME_FIELD_NUMBER: _ClassVar[int]
    operation_name: str
    def __init__(self, operation_name: _Optional[str] = ...) -> None: ...

class AsyncGetOperationStatusResponse(_message.Message):
    __slots__ = ("operation_name", "done", "status_code", "error_message")
    OPERATION_NAME_FIELD_NUMBER: _ClassVar[int]
    DONE_FIELD_NUMBER: _ClassVar[int]
    STATUS_CODE_FIELD_NUMBER: _ClassVar[int]
    ERROR_MESSAGE_FIELD_NUMBER: _ClassVar[int]
    operation_name: str
    done: bool
    status_code: int
    error_message: str
    def __init__(self, operation_name: _Optional[str] = ..., done: bool = ..., status_code: _Optional[int] = ..., error_message: _Optional[str] = ...) -> None: ...

class OcrScanImageRequest(_message.Message):
    __slots__ = ("data",)
    DATA_FIELD_NUMBER: _ClassVar[int]
    data: bytes
    def __init__(self, data: _Optional[bytes] = ...) -> None: ...

class OcrScanImageResponse(_message.Message):
    __slots__ = ("tess_hocr",)
    TESS_HOCR_FIELD_NUMBER: _ClassVar[int]
    tess_hocr: str
    def __init__(self, tess_hocr: _Optional[str] = ...) -> None: ...

class GetQrCodesRequest(_message.Message):
    __slots__ = ("document",)
    DOCUMENT_FIELD_NUMBER: _ClassVar[int]
    document: _annotator_pb2.Document
    def __init__(self, document: _Optional[_Union[_annotator_pb2.Document, _Mapping]] = ...) -> None: ...

class GetQrCodesResponse(_message.Message):
    __slots__ = ("qr_codes",)
    QR_CODES_FIELD_NUMBER: _ClassVar[int]
    qr_codes: _containers.RepeatedCompositeFieldContainer[QrCodeData]
    def __init__(self, qr_codes: _Optional[_Iterable[_Union[QrCodeData, _Mapping]]] = ...) -> None: ...

class QrCodeData(_message.Message):
    __slots__ = ("content", "page_ref", "type", "swiss_qr_bill")
    CONTENT_FIELD_NUMBER: _ClassVar[int]
    PAGE_REF_FIELD_NUMBER: _ClassVar[int]
    TYPE_FIELD_NUMBER: _ClassVar[int]
    SWISS_QR_BILL_FIELD_NUMBER: _ClassVar[int]
    content: str
    page_ref: int
    type: str
    swiss_qr_bill: _swiss_qr_bill_pb2.SwissQrBill
    def __init__(self, content: _Optional[str] = ..., page_ref: _Optional[int] = ..., type: _Optional[str] = ..., swiss_qr_bill: _Optional[_Union[_swiss_qr_bill_pb2.SwissQrBill, _Mapping]] = ...) -> None: ...
