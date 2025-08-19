from asgt.type import model_file_pb2 as _model_file_pb2
from asgt.type import prediction_pb2 as _prediction_pb2
from asgt.type import target_metrics_pb2 as _target_metrics_pb2
from gen_bq_schema import bq_field_pb2 as _bq_field_pb2
from google.protobuf import timestamp_pb2 as _timestamp_pb2
from google.protobuf.internal import containers as _containers
from google.protobuf.internal import enum_type_wrapper as _enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Iterable as _Iterable, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class Model(_message.Message):
    __slots__ = ("version", "created_at", "dataset_size", "training_size", "confidence_scores", "input_type", "dataset_type", "model_files", "target_to_confidence_thresholds")
    class InputType(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
        __slots__ = ()
        FEATURE_TENSORS: _ClassVar[Model.InputType]
        EXAMPLE_TENSOR: _ClassVar[Model.InputType]
    FEATURE_TENSORS: Model.InputType
    EXAMPLE_TENSOR: Model.InputType
    class TargetToConfidenceThresholdsEntry(_message.Message):
        __slots__ = ("key", "value")
        KEY_FIELD_NUMBER: _ClassVar[int]
        VALUE_FIELD_NUMBER: _ClassVar[int]
        key: str
        value: ConfidenceThresholds
        def __init__(self, key: _Optional[str] = ..., value: _Optional[_Union[ConfidenceThresholds, _Mapping]] = ...) -> None: ...
    VERSION_FIELD_NUMBER: _ClassVar[int]
    CREATED_AT_FIELD_NUMBER: _ClassVar[int]
    DATASET_SIZE_FIELD_NUMBER: _ClassVar[int]
    TRAINING_SIZE_FIELD_NUMBER: _ClassVar[int]
    CONFIDENCE_SCORES_FIELD_NUMBER: _ClassVar[int]
    INPUT_TYPE_FIELD_NUMBER: _ClassVar[int]
    DATASET_TYPE_FIELD_NUMBER: _ClassVar[int]
    MODEL_FILES_FIELD_NUMBER: _ClassVar[int]
    TARGET_TO_CONFIDENCE_THRESHOLDS_FIELD_NUMBER: _ClassVar[int]
    version: int
    created_at: _timestamp_pb2.Timestamp
    dataset_size: int
    training_size: int
    confidence_scores: _containers.RepeatedCompositeFieldContainer[_target_metrics_pb2.TargetMetrics]
    input_type: Model.InputType
    dataset_type: str
    model_files: _containers.RepeatedCompositeFieldContainer[_model_file_pb2.ModelFile]
    target_to_confidence_thresholds: _containers.MessageMap[str, ConfidenceThresholds]
    def __init__(self, version: _Optional[int] = ..., created_at: _Optional[_Union[_timestamp_pb2.Timestamp, _Mapping]] = ..., dataset_size: _Optional[int] = ..., training_size: _Optional[int] = ..., confidence_scores: _Optional[_Iterable[_Union[_target_metrics_pb2.TargetMetrics, _Mapping]]] = ..., input_type: _Optional[_Union[Model.InputType, str]] = ..., dataset_type: _Optional[str] = ..., model_files: _Optional[_Iterable[_Union[_model_file_pb2.ModelFile, _Mapping]]] = ..., target_to_confidence_thresholds: _Optional[_Mapping[str, ConfidenceThresholds]] = ...) -> None: ...

class ConfidenceThresholds(_message.Message):
    __slots__ = ("confidence_thresholds",)
    CONFIDENCE_THRESHOLDS_FIELD_NUMBER: _ClassVar[int]
    confidence_thresholds: _containers.RepeatedCompositeFieldContainer[_prediction_pb2.Confidence]
    def __init__(self, confidence_thresholds: _Optional[_Iterable[_Union[_prediction_pb2.Confidence, _Mapping]]] = ...) -> None: ...
