from asgt.type import dataset_pb2 as _dataset_pb2
from google.protobuf import timestamp_pb2 as _timestamp_pb2
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class Training(_message.Message):
    __slots__ = ("created_at", "status", "training_status", "training_status_message", "finish_time", "dataset", "schedule_time")
    CREATED_AT_FIELD_NUMBER: _ClassVar[int]
    STATUS_FIELD_NUMBER: _ClassVar[int]
    TRAINING_STATUS_FIELD_NUMBER: _ClassVar[int]
    TRAINING_STATUS_MESSAGE_FIELD_NUMBER: _ClassVar[int]
    FINISH_TIME_FIELD_NUMBER: _ClassVar[int]
    DATASET_FIELD_NUMBER: _ClassVar[int]
    SCHEDULE_TIME_FIELD_NUMBER: _ClassVar[int]
    created_at: _timestamp_pb2.Timestamp
    status: str
    training_status: str
    training_status_message: str
    finish_time: _timestamp_pb2.Timestamp
    dataset: _dataset_pb2.Dataset
    schedule_time: _timestamp_pb2.Timestamp
    def __init__(self, created_at: _Optional[_Union[_timestamp_pb2.Timestamp, _Mapping]] = ..., status: _Optional[str] = ..., training_status: _Optional[str] = ..., training_status_message: _Optional[str] = ..., finish_time: _Optional[_Union[_timestamp_pb2.Timestamp, _Mapping]] = ..., dataset: _Optional[_Union[_dataset_pb2.Dataset, _Mapping]] = ..., schedule_time: _Optional[_Union[_timestamp_pb2.Timestamp, _Mapping]] = ...) -> None: ...
