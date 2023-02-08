"""
@generated by mypy-protobuf.  Do not edit manually!
isort:skip_file
"""
import builtins
import google.protobuf.descriptor
import google.protobuf.internal.containers
import google.protobuf.message
import typing
import typing_extensions

DESCRIPTOR: google.protobuf.descriptor.FileDescriptor

class Vertex(google.protobuf.message.Message):
    """A vertex represents a 2D point in the image.
    NOTE: the vertex coordinates are in the same scale as the original image.
    """
    DESCRIPTOR: google.protobuf.descriptor.Descriptor
    X_FIELD_NUMBER: builtins.int
    Y_FIELD_NUMBER: builtins.int
    x: builtins.int
    """X coordinate."""

    y: builtins.int
    """Y coordinate."""

    def __init__(self,
        *,
        x: builtins.int = ...,
        y: builtins.int = ...,
        ) -> None: ...
    def ClearField(self, field_name: typing_extensions.Literal["x",b"x","y",b"y"]) -> None: ...
global___Vertex = Vertex

class NormalizedVertex(google.protobuf.message.Message):
    """A vertex represents a 2D point in the image.
    NOTE: the normalized vertex coordinates are relative to the original image
    and range from 0 to 1.
    """
    DESCRIPTOR: google.protobuf.descriptor.Descriptor
    X_FIELD_NUMBER: builtins.int
    Y_FIELD_NUMBER: builtins.int
    x: builtins.float
    """X coordinate."""

    y: builtins.float
    """Y coordinate."""

    def __init__(self,
        *,
        x: builtins.float = ...,
        y: builtins.float = ...,
        ) -> None: ...
    def ClearField(self, field_name: typing_extensions.Literal["x",b"x","y",b"y"]) -> None: ...
global___NormalizedVertex = NormalizedVertex

class BoundingPoly(google.protobuf.message.Message):
    """A bounding polygon for the detected image annotation."""
    DESCRIPTOR: google.protobuf.descriptor.Descriptor
    VERTICES_FIELD_NUMBER: builtins.int
    NORMALIZED_VERTICES_FIELD_NUMBER: builtins.int
    @property
    def vertices(self) -> google.protobuf.internal.containers.RepeatedCompositeFieldContainer[global___Vertex]:
        """The bounding polygon vertices."""
        pass
    @property
    def normalized_vertices(self) -> google.protobuf.internal.containers.RepeatedCompositeFieldContainer[global___NormalizedVertex]:
        """The bounding polygon normalized vertices."""
        pass
    def __init__(self,
        *,
        vertices: typing.Optional[typing.Iterable[global___Vertex]] = ...,
        normalized_vertices: typing.Optional[typing.Iterable[global___NormalizedVertex]] = ...,
        ) -> None: ...
    def ClearField(self, field_name: typing_extensions.Literal["normalized_vertices",b"normalized_vertices","vertices",b"vertices"]) -> None: ...
global___BoundingPoly = BoundingPoly
