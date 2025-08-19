from asgt.type import data_pb2 as _data_pb2
from asgt.type import model_pb2 as _model_pb2
from asgt.type import prediction_pb2 as _prediction_pb2
from asgt.type import target_value_pb2 as _target_value_pb2
from gen_bq_schema import bq_field_pb2 as _bq_field_pb2
from gen_bq_schema import bq_table_pb2 as _bq_table_pb2
from google.protobuf.internal import containers as _containers
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Iterable as _Iterable, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class Entry(_message.Message):
    __slots__ = ("id", "consumer", "dataset_name", "dataset_type", "dataset_id", "tags", "data", "target_values", "model", "prediction", "time_added")
    ID_FIELD_NUMBER: _ClassVar[int]
    CONSUMER_FIELD_NUMBER: _ClassVar[int]
    DATASET_NAME_FIELD_NUMBER: _ClassVar[int]
    DATASET_TYPE_FIELD_NUMBER: _ClassVar[int]
    DATASET_ID_FIELD_NUMBER: _ClassVar[int]
    TAGS_FIELD_NUMBER: _ClassVar[int]
    DATA_FIELD_NUMBER: _ClassVar[int]
    TARGET_VALUES_FIELD_NUMBER: _ClassVar[int]
    MODEL_FIELD_NUMBER: _ClassVar[int]
    PREDICTION_FIELD_NUMBER: _ClassVar[int]
    TIME_ADDED_FIELD_NUMBER: _ClassVar[int]
    id: str
    consumer: str
    dataset_name: str
    dataset_type: str
    dataset_id: str
    tags: _containers.RepeatedScalarFieldContainer[str]
    data: _data_pb2.Data
    target_values: _containers.RepeatedCompositeFieldContainer[_target_value_pb2.TargetValue]
    model: _model_pb2.Model
    prediction: _containers.RepeatedCompositeFieldContainer[_prediction_pb2.Prediction.Target]
    time_added: int
    def __init__(self, id: _Optional[str] = ..., consumer: _Optional[str] = ..., dataset_name: _Optional[str] = ..., dataset_type: _Optional[str] = ..., dataset_id: _Optional[str] = ..., tags: _Optional[_Iterable[str]] = ..., data: _Optional[_Union[_data_pb2.Data, _Mapping]] = ..., target_values: _Optional[_Iterable[_Union[_target_value_pb2.TargetValue, _Mapping]]] = ..., model: _Optional[_Union[_model_pb2.Model, _Mapping]] = ..., prediction: _Optional[_Iterable[_Union[_prediction_pb2.Prediction.Target, _Mapping]]] = ..., time_added: _Optional[int] = ...) -> None: ...
