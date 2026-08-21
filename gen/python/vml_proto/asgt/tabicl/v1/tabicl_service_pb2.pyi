from asgt.type import data_pb2 as _data_pb2
from asgt.type import prediction_pb2 as _prediction_pb2
from validate import validate_pb2 as _validate_pb2
from google.protobuf.internal import containers as _containers
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Iterable as _Iterable, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class BatchSuggestRequest(_message.Message):
    __slots__ = ("dataset_name", "consumer_name", "inputs", "suggest_limit")
    DATASET_NAME_FIELD_NUMBER: _ClassVar[int]
    CONSUMER_NAME_FIELD_NUMBER: _ClassVar[int]
    INPUTS_FIELD_NUMBER: _ClassVar[int]
    SUGGEST_LIMIT_FIELD_NUMBER: _ClassVar[int]
    dataset_name: str
    consumer_name: str
    inputs: _containers.RepeatedCompositeFieldContainer[_data_pb2.Data]
    suggest_limit: int
    def __init__(self, dataset_name: _Optional[str] = ..., consumer_name: _Optional[str] = ..., inputs: _Optional[_Iterable[_Union[_data_pb2.Data, _Mapping]]] = ..., suggest_limit: _Optional[int] = ...) -> None: ...

class BatchSuggestResponse(_message.Message):
    __slots__ = ("predictions",)
    PREDICTIONS_FIELD_NUMBER: _ClassVar[int]
    predictions: _containers.RepeatedCompositeFieldContainer[_prediction_pb2.Prediction]
    def __init__(self, predictions: _Optional[_Iterable[_Union[_prediction_pb2.Prediction, _Mapping]]] = ...) -> None: ...
