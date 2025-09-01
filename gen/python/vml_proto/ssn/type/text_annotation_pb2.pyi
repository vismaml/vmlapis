from ssn.type import geometry_pb2 as _geometry_pb2
from google.protobuf.internal import containers as _containers
from google.protobuf.internal import enum_type_wrapper as _enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Iterable as _Iterable, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class TextAnnotation(_message.Message):
    __slots__ = ("pages", "text")
    class DetectedLanguage(_message.Message):
        __slots__ = ("language_code", "confidence")
        LANGUAGE_CODE_FIELD_NUMBER: _ClassVar[int]
        CONFIDENCE_FIELD_NUMBER: _ClassVar[int]
        language_code: str
        confidence: float
        def __init__(self, language_code: _Optional[str] = ..., confidence: _Optional[float] = ...) -> None: ...
    class DetectedBreak(_message.Message):
        __slots__ = ("type", "is_prefix")
        class BreakType(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
            __slots__ = ()
            UNKNOWN: _ClassVar[TextAnnotation.DetectedBreak.BreakType]
            SPACE: _ClassVar[TextAnnotation.DetectedBreak.BreakType]
            SURE_SPACE: _ClassVar[TextAnnotation.DetectedBreak.BreakType]
            EOL_SURE_SPACE: _ClassVar[TextAnnotation.DetectedBreak.BreakType]
            HYPHEN: _ClassVar[TextAnnotation.DetectedBreak.BreakType]
            LINE_BREAK: _ClassVar[TextAnnotation.DetectedBreak.BreakType]
        UNKNOWN: TextAnnotation.DetectedBreak.BreakType
        SPACE: TextAnnotation.DetectedBreak.BreakType
        SURE_SPACE: TextAnnotation.DetectedBreak.BreakType
        EOL_SURE_SPACE: TextAnnotation.DetectedBreak.BreakType
        HYPHEN: TextAnnotation.DetectedBreak.BreakType
        LINE_BREAK: TextAnnotation.DetectedBreak.BreakType
        TYPE_FIELD_NUMBER: _ClassVar[int]
        IS_PREFIX_FIELD_NUMBER: _ClassVar[int]
        type: TextAnnotation.DetectedBreak.BreakType
        is_prefix: bool
        def __init__(self, type: _Optional[_Union[TextAnnotation.DetectedBreak.BreakType, str]] = ..., is_prefix: bool = ...) -> None: ...
    class TextProperty(_message.Message):
        __slots__ = ("detected_languages", "detected_break")
        DETECTED_LANGUAGES_FIELD_NUMBER: _ClassVar[int]
        DETECTED_BREAK_FIELD_NUMBER: _ClassVar[int]
        detected_languages: _containers.RepeatedCompositeFieldContainer[TextAnnotation.DetectedLanguage]
        detected_break: TextAnnotation.DetectedBreak
        def __init__(self, detected_languages: _Optional[_Iterable[_Union[TextAnnotation.DetectedLanguage, _Mapping]]] = ..., detected_break: _Optional[_Union[TextAnnotation.DetectedBreak, _Mapping]] = ...) -> None: ...
    PAGES_FIELD_NUMBER: _ClassVar[int]
    TEXT_FIELD_NUMBER: _ClassVar[int]
    pages: _containers.RepeatedCompositeFieldContainer[Page]
    text: str
    def __init__(self, pages: _Optional[_Iterable[_Union[Page, _Mapping]]] = ..., text: _Optional[str] = ...) -> None: ...

class Page(_message.Message):
    __slots__ = ("property", "width", "height", "blocks", "confidence")
    PROPERTY_FIELD_NUMBER: _ClassVar[int]
    WIDTH_FIELD_NUMBER: _ClassVar[int]
    HEIGHT_FIELD_NUMBER: _ClassVar[int]
    BLOCKS_FIELD_NUMBER: _ClassVar[int]
    CONFIDENCE_FIELD_NUMBER: _ClassVar[int]
    property: TextAnnotation.TextProperty
    width: int
    height: int
    blocks: _containers.RepeatedCompositeFieldContainer[Block]
    confidence: float
    def __init__(self, property: _Optional[_Union[TextAnnotation.TextProperty, _Mapping]] = ..., width: _Optional[int] = ..., height: _Optional[int] = ..., blocks: _Optional[_Iterable[_Union[Block, _Mapping]]] = ..., confidence: _Optional[float] = ...) -> None: ...

class Block(_message.Message):
    __slots__ = ("property", "bounding_box", "paragraphs", "block_type", "confidence")
    class BlockType(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
        __slots__ = ()
        UNKNOWN: _ClassVar[Block.BlockType]
        TEXT: _ClassVar[Block.BlockType]
        TABLE: _ClassVar[Block.BlockType]
        PICTURE: _ClassVar[Block.BlockType]
        RULER: _ClassVar[Block.BlockType]
        BARCODE: _ClassVar[Block.BlockType]
    UNKNOWN: Block.BlockType
    TEXT: Block.BlockType
    TABLE: Block.BlockType
    PICTURE: Block.BlockType
    RULER: Block.BlockType
    BARCODE: Block.BlockType
    PROPERTY_FIELD_NUMBER: _ClassVar[int]
    BOUNDING_BOX_FIELD_NUMBER: _ClassVar[int]
    PARAGRAPHS_FIELD_NUMBER: _ClassVar[int]
    BLOCK_TYPE_FIELD_NUMBER: _ClassVar[int]
    CONFIDENCE_FIELD_NUMBER: _ClassVar[int]
    property: TextAnnotation.TextProperty
    bounding_box: _geometry_pb2.BoundingPoly
    paragraphs: _containers.RepeatedCompositeFieldContainer[Paragraph]
    block_type: Block.BlockType
    confidence: float
    def __init__(self, property: _Optional[_Union[TextAnnotation.TextProperty, _Mapping]] = ..., bounding_box: _Optional[_Union[_geometry_pb2.BoundingPoly, _Mapping]] = ..., paragraphs: _Optional[_Iterable[_Union[Paragraph, _Mapping]]] = ..., block_type: _Optional[_Union[Block.BlockType, str]] = ..., confidence: _Optional[float] = ...) -> None: ...

class Paragraph(_message.Message):
    __slots__ = ("property", "bounding_box", "words", "confidence")
    PROPERTY_FIELD_NUMBER: _ClassVar[int]
    BOUNDING_BOX_FIELD_NUMBER: _ClassVar[int]
    WORDS_FIELD_NUMBER: _ClassVar[int]
    CONFIDENCE_FIELD_NUMBER: _ClassVar[int]
    property: TextAnnotation.TextProperty
    bounding_box: _geometry_pb2.BoundingPoly
    words: _containers.RepeatedCompositeFieldContainer[Word]
    confidence: float
    def __init__(self, property: _Optional[_Union[TextAnnotation.TextProperty, _Mapping]] = ..., bounding_box: _Optional[_Union[_geometry_pb2.BoundingPoly, _Mapping]] = ..., words: _Optional[_Iterable[_Union[Word, _Mapping]]] = ..., confidence: _Optional[float] = ...) -> None: ...

class Word(_message.Message):
    __slots__ = ("property", "bounding_box", "symbols", "confidence")
    PROPERTY_FIELD_NUMBER: _ClassVar[int]
    BOUNDING_BOX_FIELD_NUMBER: _ClassVar[int]
    SYMBOLS_FIELD_NUMBER: _ClassVar[int]
    CONFIDENCE_FIELD_NUMBER: _ClassVar[int]
    property: TextAnnotation.TextProperty
    bounding_box: _geometry_pb2.BoundingPoly
    symbols: _containers.RepeatedCompositeFieldContainer[Symbol]
    confidence: float
    def __init__(self, property: _Optional[_Union[TextAnnotation.TextProperty, _Mapping]] = ..., bounding_box: _Optional[_Union[_geometry_pb2.BoundingPoly, _Mapping]] = ..., symbols: _Optional[_Iterable[_Union[Symbol, _Mapping]]] = ..., confidence: _Optional[float] = ...) -> None: ...

class Symbol(_message.Message):
    __slots__ = ("property", "bounding_box", "text", "confidence")
    PROPERTY_FIELD_NUMBER: _ClassVar[int]
    BOUNDING_BOX_FIELD_NUMBER: _ClassVar[int]
    TEXT_FIELD_NUMBER: _ClassVar[int]
    CONFIDENCE_FIELD_NUMBER: _ClassVar[int]
    property: TextAnnotation.TextProperty
    bounding_box: _geometry_pb2.BoundingPoly
    text: str
    confidence: float
    def __init__(self, property: _Optional[_Union[TextAnnotation.TextProperty, _Mapping]] = ..., bounding_box: _Optional[_Union[_geometry_pb2.BoundingPoly, _Mapping]] = ..., text: _Optional[str] = ..., confidence: _Optional[float] = ...) -> None: ...
