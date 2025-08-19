from asgt.type import dataset_pb2 as _dataset_pb2
from asgt.type import dataset_statistics_pb2 as _dataset_statistics_pb2
from asgt.type import model_pb2 as _model_pb2
from asgt.type import model_type_pb2 as _model_type_pb2
from asgt.type import prediction_pb2 as _prediction_pb2
from asgt.type import revision_pb2 as _revision_pb2
from asgt.type import target_metrics_pb2 as _target_metrics_pb2
from asgt.type import train_statistics_pb2 as _train_statistics_pb2
from google.protobuf import empty_pb2 as _empty_pb2
from google.protobuf.internal import containers as _containers
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Iterable as _Iterable, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class RegisterModelRequest(_message.Message):
    __slots__ = ("dataset", "revision", "model_version", "metrics", "target_metrics", "input_type", "train_statistics", "dataset_statistics", "target_to_confidence_thresholds", "metric_version")
    class MetricsEntry(_message.Message):
        __slots__ = ("key", "value")
        KEY_FIELD_NUMBER: _ClassVar[int]
        VALUE_FIELD_NUMBER: _ClassVar[int]
        key: str
        value: int
        def __init__(self, key: _Optional[str] = ..., value: _Optional[int] = ...) -> None: ...
    class TargetToConfidenceThresholdsEntry(_message.Message):
        __slots__ = ("key", "value")
        KEY_FIELD_NUMBER: _ClassVar[int]
        VALUE_FIELD_NUMBER: _ClassVar[int]
        key: str
        value: _model_pb2.ConfidenceThresholds
        def __init__(self, key: _Optional[str] = ..., value: _Optional[_Union[_model_pb2.ConfidenceThresholds, _Mapping]] = ...) -> None: ...
    DATASET_FIELD_NUMBER: _ClassVar[int]
    REVISION_FIELD_NUMBER: _ClassVar[int]
    MODEL_VERSION_FIELD_NUMBER: _ClassVar[int]
    METRICS_FIELD_NUMBER: _ClassVar[int]
    TARGET_METRICS_FIELD_NUMBER: _ClassVar[int]
    INPUT_TYPE_FIELD_NUMBER: _ClassVar[int]
    TRAIN_STATISTICS_FIELD_NUMBER: _ClassVar[int]
    DATASET_STATISTICS_FIELD_NUMBER: _ClassVar[int]
    TARGET_TO_CONFIDENCE_THRESHOLDS_FIELD_NUMBER: _ClassVar[int]
    METRIC_VERSION_FIELD_NUMBER: _ClassVar[int]
    dataset: _dataset_pb2.Dataset
    revision: _revision_pb2.Revision
    model_version: int
    metrics: _containers.ScalarMap[str, int]
    target_metrics: _containers.RepeatedCompositeFieldContainer[_target_metrics_pb2.TargetMetrics]
    input_type: _model_pb2.Model.InputType
    train_statistics: _train_statistics_pb2.TrainStatistics
    dataset_statistics: _dataset_statistics_pb2.DatasetStatistics
    target_to_confidence_thresholds: _containers.MessageMap[str, _model_pb2.ConfidenceThresholds]
    metric_version: str
    def __init__(self, dataset: _Optional[_Union[_dataset_pb2.Dataset, _Mapping]] = ..., revision: _Optional[_Union[_revision_pb2.Revision, _Mapping]] = ..., model_version: _Optional[int] = ..., metrics: _Optional[_Mapping[str, int]] = ..., target_metrics: _Optional[_Iterable[_Union[_target_metrics_pb2.TargetMetrics, _Mapping]]] = ..., input_type: _Optional[_Union[_model_pb2.Model.InputType, str]] = ..., train_statistics: _Optional[_Union[_train_statistics_pb2.TrainStatistics, _Mapping]] = ..., dataset_statistics: _Optional[_Union[_dataset_statistics_pb2.DatasetStatistics, _Mapping]] = ..., target_to_confidence_thresholds: _Optional[_Mapping[str, _model_pb2.ConfidenceThresholds]] = ..., metric_version: _Optional[str] = ...) -> None: ...

class GetCurrentModelRequest(_message.Message):
    __slots__ = ("dataset", "model_type")
    DATASET_FIELD_NUMBER: _ClassVar[int]
    MODEL_TYPE_FIELD_NUMBER: _ClassVar[int]
    dataset: _dataset_pb2.Dataset
    model_type: _model_type_pb2.ModelType
    def __init__(self, dataset: _Optional[_Union[_dataset_pb2.Dataset, _Mapping]] = ..., model_type: _Optional[_Union[_model_type_pb2.ModelType, str]] = ...) -> None: ...

class GetCurrentModelResponse(_message.Message):
    __slots__ = ("model",)
    MODEL_FIELD_NUMBER: _ClassVar[int]
    model: _model_pb2.Model
    def __init__(self, model: _Optional[_Union[_model_pb2.Model, _Mapping]] = ...) -> None: ...
