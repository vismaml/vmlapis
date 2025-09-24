from asgt.type import dataset_pb2 as _dataset_pb2
from asgt.type import revision_pb2 as _revision_pb2
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class TrainModelTask(_message.Message):
    __slots__ = ("dataset", "revision", "model_version")
    DATASET_FIELD_NUMBER: _ClassVar[int]
    REVISION_FIELD_NUMBER: _ClassVar[int]
    MODEL_VERSION_FIELD_NUMBER: _ClassVar[int]
    dataset: _dataset_pb2.Dataset
    revision: _revision_pb2.Revision
    model_version: int
    def __init__(self, dataset: _Optional[_Union[_dataset_pb2.Dataset, _Mapping]] = ..., revision: _Optional[_Union[_revision_pb2.Revision, _Mapping]] = ..., model_version: _Optional[int] = ...) -> None: ...
