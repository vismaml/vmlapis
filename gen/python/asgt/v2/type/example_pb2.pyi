from asgt.v2.type import data_pb2 as _data_pb2
from asgt.v2.type import target_value_pb2 as _target_value_pb2
from validate import validate_pb2 as _validate_pb2
from google.protobuf.internal import containers as _containers
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Iterable as _Iterable, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class Example(_message.Message):
    __slots__ = ["data", "id", "target_values"]
    DATA_FIELD_NUMBER: _ClassVar[int]
    ID_FIELD_NUMBER: _ClassVar[int]
    TARGET_VALUES_FIELD_NUMBER: _ClassVar[int]
    data: _data_pb2.Data
    id: str
    target_values: _containers.RepeatedCompositeFieldContainer[_target_value_pb2.TargetValue]
    def __init__(self, data: _Optional[_Union[_data_pb2.Data, _Mapping]] = ..., target_values: _Optional[_Iterable[_Union[_target_value_pb2.TargetValue, _Mapping]]] = ..., id: _Optional[str] = ...) -> None: ...
