from google.protobuf.internal import enum_type_wrapper as _enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from typing import ClassVar as _ClassVar

DESCRIPTOR: _descriptor.FileDescriptor

class ModelType(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
    __slots__ = ()
    DEFAULT: _ClassVar[ModelType]
    TENSORFLOW: _ClassVar[ModelType]
    ONNX: _ClassVar[ModelType]
DEFAULT: ModelType
TENSORFLOW: ModelType
ONNX: ModelType
