from google.protobuf.internal import containers as _containers
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Iterable as _Iterable, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class Vertex(_message.Message):
    __slots__ = ("x", "y")
    X_FIELD_NUMBER: _ClassVar[int]
    Y_FIELD_NUMBER: _ClassVar[int]
    x: int
    y: int
    def __init__(self, x: _Optional[int] = ..., y: _Optional[int] = ...) -> None: ...

class NormalizedVertex(_message.Message):
    __slots__ = ("x", "y")
    X_FIELD_NUMBER: _ClassVar[int]
    Y_FIELD_NUMBER: _ClassVar[int]
    x: float
    y: float
    def __init__(self, x: _Optional[float] = ..., y: _Optional[float] = ...) -> None: ...

class BoundingPoly(_message.Message):
    __slots__ = ("vertices", "normalized_vertices")
    VERTICES_FIELD_NUMBER: _ClassVar[int]
    NORMALIZED_VERTICES_FIELD_NUMBER: _ClassVar[int]
    vertices: _containers.RepeatedCompositeFieldContainer[Vertex]
    normalized_vertices: _containers.RepeatedCompositeFieldContainer[NormalizedVertex]
    def __init__(self, vertices: _Optional[_Iterable[_Union[Vertex, _Mapping]]] = ..., normalized_vertices: _Optional[_Iterable[_Union[NormalizedVertex, _Mapping]]] = ...) -> None: ...
