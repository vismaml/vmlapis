from google.protobuf.internal import enum_type_wrapper as _enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class RasterizePdfRequest(_message.Message):
    __slots__ = ("data", "dpi", "format", "color", "pages")
    class Format(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
        __slots__ = ()
        PNG: _ClassVar[RasterizePdfRequest.Format]
        JPEG: _ClassVar[RasterizePdfRequest.Format]
        WEBP: _ClassVar[RasterizePdfRequest.Format]
    PNG: RasterizePdfRequest.Format
    JPEG: RasterizePdfRequest.Format
    WEBP: RasterizePdfRequest.Format
    class ColorSpace(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
        __slots__ = ()
        GRAY: _ClassVar[RasterizePdfRequest.ColorSpace]
        COLOR: _ClassVar[RasterizePdfRequest.ColorSpace]
    GRAY: RasterizePdfRequest.ColorSpace
    COLOR: RasterizePdfRequest.ColorSpace
    class PageOption(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
        __slots__ = ()
        FIRST_LAST: _ClassVar[RasterizePdfRequest.PageOption]
        FIRST: _ClassVar[RasterizePdfRequest.PageOption]
        LAST: _ClassVar[RasterizePdfRequest.PageOption]
        ALL: _ClassVar[RasterizePdfRequest.PageOption]
        FIRST_FIVE: _ClassVar[RasterizePdfRequest.PageOption]
    FIRST_LAST: RasterizePdfRequest.PageOption
    FIRST: RasterizePdfRequest.PageOption
    LAST: RasterizePdfRequest.PageOption
    ALL: RasterizePdfRequest.PageOption
    FIRST_FIVE: RasterizePdfRequest.PageOption
    DATA_FIELD_NUMBER: _ClassVar[int]
    DPI_FIELD_NUMBER: _ClassVar[int]
    FORMAT_FIELD_NUMBER: _ClassVar[int]
    COLOR_FIELD_NUMBER: _ClassVar[int]
    PAGES_FIELD_NUMBER: _ClassVar[int]
    data: bytes
    dpi: int
    format: RasterizePdfRequest.Format
    color: RasterizePdfRequest.ColorSpace
    pages: RasterizePdfRequest.PageOption
    def __init__(self, data: _Optional[bytes] = ..., dpi: _Optional[int] = ..., format: _Optional[_Union[RasterizePdfRequest.Format, str]] = ..., color: _Optional[_Union[RasterizePdfRequest.ColorSpace, str]] = ..., pages: _Optional[_Union[RasterizePdfRequest.PageOption, str]] = ...) -> None: ...

class RasterizePdfResponse(_message.Message):
    __slots__ = ("index", "data", "width", "height", "scale")
    INDEX_FIELD_NUMBER: _ClassVar[int]
    DATA_FIELD_NUMBER: _ClassVar[int]
    WIDTH_FIELD_NUMBER: _ClassVar[int]
    HEIGHT_FIELD_NUMBER: _ClassVar[int]
    SCALE_FIELD_NUMBER: _ClassVar[int]
    index: int
    data: bytes
    width: int
    height: int
    scale: float
    def __init__(self, index: _Optional[int] = ..., data: _Optional[bytes] = ..., width: _Optional[int] = ..., height: _Optional[int] = ..., scale: _Optional[float] = ...) -> None: ...
