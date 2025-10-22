from ssn.type import candidate_pb2 as _candidate_pb2
from google.protobuf.internal import containers as _containers
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Iterable as _Iterable, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class HotelDates(_message.Message):
    __slots__ = ("check_in_date", "check_out_date")
    CHECK_IN_DATE_FIELD_NUMBER: _ClassVar[int]
    CHECK_OUT_DATE_FIELD_NUMBER: _ClassVar[int]
    check_in_date: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    check_out_date: _containers.RepeatedCompositeFieldContainer[_candidate_pb2.Candidate]
    def __init__(self, check_in_date: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ..., check_out_date: _Optional[_Iterable[_Union[_candidate_pb2.Candidate, _Mapping]]] = ...) -> None: ...
