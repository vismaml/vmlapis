from google.api import annotations_pb2 as _annotations_pb2
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Optional as _Optional

DESCRIPTOR: _descriptor.FileDescriptor

class ValetKeyRequest(_message.Message):
    __slots__ = ("sub", "exp")
    SUB_FIELD_NUMBER: _ClassVar[int]
    EXP_FIELD_NUMBER: _ClassVar[int]
    sub: str
    exp: int
    def __init__(self, sub: _Optional[str] = ..., exp: _Optional[int] = ...) -> None: ...

class ValetKeyResponse(_message.Message):
    __slots__ = ("id", "token")
    ID_FIELD_NUMBER: _ClassVar[int]
    TOKEN_FIELD_NUMBER: _ClassVar[int]
    id: str
    token: str
    def __init__(self, id: _Optional[str] = ..., token: _Optional[str] = ...) -> None: ...
