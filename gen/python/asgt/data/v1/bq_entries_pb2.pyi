"""
@generated by mypy-protobuf.  Do not edit manually!
isort:skip_file
"""
import asgt.type.data_pb2
import asgt.type.model_pb2
import asgt.type.prediction_pb2
import asgt.type.target_value_pb2
import builtins
import google.protobuf.descriptor
import google.protobuf.internal.containers
import google.protobuf.message
import typing
import typing_extensions

DESCRIPTOR: google.protobuf.descriptor.FileDescriptor

class Entry(google.protobuf.message.Message):
    """BQ schema gen - could be used for adding direct developer data endpoints"""
    DESCRIPTOR: google.protobuf.descriptor.Descriptor
    ID_FIELD_NUMBER: builtins.int
    CONSUMER_FIELD_NUMBER: builtins.int
    DATASET_NAME_FIELD_NUMBER: builtins.int
    DATASET_TYPE_FIELD_NUMBER: builtins.int
    DATASET_ID_FIELD_NUMBER: builtins.int
    TAGS_FIELD_NUMBER: builtins.int
    DATA_FIELD_NUMBER: builtins.int
    TARGET_VALUES_FIELD_NUMBER: builtins.int
    MODEL_FIELD_NUMBER: builtins.int
    PREDICTION_FIELD_NUMBER: builtins.int
    TIME_ADDED_FIELD_NUMBER: builtins.int
    id: typing.Text
    consumer: typing.Text
    dataset_name: typing.Text
    dataset_type: typing.Text
    dataset_id: typing.Text
    @property
    def tags(self) -> google.protobuf.internal.containers.RepeatedScalarFieldContainer[typing.Text]: ...
    @property
    def data(self) -> asgt.type.data_pb2.Data: ...
    @property
    def target_values(self) -> google.protobuf.internal.containers.RepeatedCompositeFieldContainer[asgt.type.target_value_pb2.TargetValue]: ...
    @property
    def model(self) -> asgt.type.model_pb2.Model: ...
    @property
    def prediction(self) -> google.protobuf.internal.containers.RepeatedCompositeFieldContainer[asgt.type.prediction_pb2.Prediction.Target]: ...
    time_added: builtins.int
    def __init__(self,
        *,
        id: typing.Text = ...,
        consumer: typing.Text = ...,
        dataset_name: typing.Text = ...,
        dataset_type: typing.Text = ...,
        dataset_id: typing.Text = ...,
        tags: typing.Optional[typing.Iterable[typing.Text]] = ...,
        data: typing.Optional[asgt.type.data_pb2.Data] = ...,
        target_values: typing.Optional[typing.Iterable[asgt.type.target_value_pb2.TargetValue]] = ...,
        model: typing.Optional[asgt.type.model_pb2.Model] = ...,
        prediction: typing.Optional[typing.Iterable[asgt.type.prediction_pb2.Prediction.Target]] = ...,
        time_added: builtins.int = ...,
        ) -> None: ...
    def HasField(self, field_name: typing_extensions.Literal["data",b"data","model",b"model"]) -> builtins.bool: ...
    def ClearField(self, field_name: typing_extensions.Literal["consumer",b"consumer","data",b"data","dataset_id",b"dataset_id","dataset_name",b"dataset_name","dataset_type",b"dataset_type","id",b"id","model",b"model","prediction",b"prediction","tags",b"tags","target_values",b"target_values","time_added",b"time_added"]) -> None: ...
global___Entry = Entry
