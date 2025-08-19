from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Optional as _Optional

DESCRIPTOR: _descriptor.FileDescriptor

class RetentionPolicy(_message.Message):
    __slots__ = ("max_days",)
    MAX_DAYS_FIELD_NUMBER: _ClassVar[int]
    max_days: int
    def __init__(self, max_days: _Optional[int] = ...) -> None: ...
