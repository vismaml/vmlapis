from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Optional as _Optional

DESCRIPTOR: _descriptor.FileDescriptor

class StructuredAddress(_message.Message):
    __slots__ = ("street", "postal_code", "city", "country", "country_code")
    STREET_FIELD_NUMBER: _ClassVar[int]
    POSTAL_CODE_FIELD_NUMBER: _ClassVar[int]
    CITY_FIELD_NUMBER: _ClassVar[int]
    COUNTRY_FIELD_NUMBER: _ClassVar[int]
    COUNTRY_CODE_FIELD_NUMBER: _ClassVar[int]
    street: str
    postal_code: str
    city: str
    country: str
    country_code: str
    def __init__(self, street: _Optional[str] = ..., postal_code: _Optional[str] = ..., city: _Optional[str] = ..., country: _Optional[str] = ..., country_code: _Optional[str] = ...) -> None: ...
