from asgt.type import dataset_pb2 as _dataset_pb2
from asgt.type import retention_policy_pb2 as _retention_policy_pb2
from asgt.v2.type import example_pb2 as _example_pb2
from asgt.v2.type import model_pb2 as _model_pb2
from asgt.v2.type import training_pb2 as _training_pb2
from google.api import annotations_pb2 as _annotations_pb2
from google.protobuf import empty_pb2 as _empty_pb2
from protoc_gen_openapiv2.options import annotations_pb2 as _annotations_pb2_1
from validate import validate_pb2 as _validate_pb2
from google.protobuf.internal import containers as _containers
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Iterable as _Iterable, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class GetDatasetRequest(_message.Message):
    __slots__ = ("dataset_name",)
    DATASET_NAME_FIELD_NUMBER: _ClassVar[int]
    dataset_name: str
    def __init__(self, dataset_name: _Optional[str] = ...) -> None: ...

class CreateDatasetRequest(_message.Message):
    __slots__ = ("dataset_name", "tags", "retention_policy")
    DATASET_NAME_FIELD_NUMBER: _ClassVar[int]
    TAGS_FIELD_NUMBER: _ClassVar[int]
    RETENTION_POLICY_FIELD_NUMBER: _ClassVar[int]
    dataset_name: str
    tags: _containers.RepeatedScalarFieldContainer[str]
    retention_policy: _retention_policy_pb2.RetentionPolicy
    def __init__(self, dataset_name: _Optional[str] = ..., tags: _Optional[_Iterable[str]] = ..., retention_policy: _Optional[_Union[_retention_policy_pb2.RetentionPolicy, _Mapping]] = ...) -> None: ...

class CreateOrUpdateDatasetRequest(_message.Message):
    __slots__ = ("dataset_name",)
    DATASET_NAME_FIELD_NUMBER: _ClassVar[int]
    dataset_name: str
    def __init__(self, dataset_name: _Optional[str] = ...) -> None: ...

class DeleteDatasetRequest(_message.Message):
    __slots__ = ("dataset_name",)
    DATASET_NAME_FIELD_NUMBER: _ClassVar[int]
    dataset_name: str
    def __init__(self, dataset_name: _Optional[str] = ...) -> None: ...

class DeleteTagRequest(_message.Message):
    __slots__ = ("tag_name",)
    TAG_NAME_FIELD_NUMBER: _ClassVar[int]
    tag_name: str
    def __init__(self, tag_name: _Optional[str] = ...) -> None: ...

class CreateExampleRequest(_message.Message):
    __slots__ = ("dataset_name", "example")
    DATASET_NAME_FIELD_NUMBER: _ClassVar[int]
    EXAMPLE_FIELD_NUMBER: _ClassVar[int]
    dataset_name: str
    example: _example_pb2.Example
    def __init__(self, dataset_name: _Optional[str] = ..., example: _Optional[_Union[_example_pb2.Example, _Mapping]] = ...) -> None: ...

class CreateOrUpdateExampleRequest(_message.Message):
    __slots__ = ("dataset_name", "example")
    DATASET_NAME_FIELD_NUMBER: _ClassVar[int]
    EXAMPLE_FIELD_NUMBER: _ClassVar[int]
    dataset_name: str
    example: _example_pb2.Example
    def __init__(self, dataset_name: _Optional[str] = ..., example: _Optional[_Union[_example_pb2.Example, _Mapping]] = ...) -> None: ...

class BatchCreateExampleRequest(_message.Message):
    __slots__ = ("dataset_name", "examples")
    DATASET_NAME_FIELD_NUMBER: _ClassVar[int]
    EXAMPLES_FIELD_NUMBER: _ClassVar[int]
    dataset_name: str
    examples: _containers.RepeatedCompositeFieldContainer[_example_pb2.Example]
    def __init__(self, dataset_name: _Optional[str] = ..., examples: _Optional[_Iterable[_Union[_example_pb2.Example, _Mapping]]] = ...) -> None: ...

class TruncateDatasetRequest(_message.Message):
    __slots__ = ("dataset_name",)
    DATASET_NAME_FIELD_NUMBER: _ClassVar[int]
    dataset_name: str
    def __init__(self, dataset_name: _Optional[str] = ...) -> None: ...

class TrainingRequestOptions(_message.Message):
    __slots__ = ("limit",)
    LIMIT_FIELD_NUMBER: _ClassVar[int]
    limit: int
    def __init__(self, limit: _Optional[int] = ...) -> None: ...

class ModelRequestOptions(_message.Message):
    __slots__ = ("limit",)
    LIMIT_FIELD_NUMBER: _ClassVar[int]
    limit: int
    def __init__(self, limit: _Optional[int] = ...) -> None: ...

class GetDatasetTrainingsRequest(_message.Message):
    __slots__ = ("dataset_name", "options")
    DATASET_NAME_FIELD_NUMBER: _ClassVar[int]
    OPTIONS_FIELD_NUMBER: _ClassVar[int]
    dataset_name: str
    options: TrainingRequestOptions
    def __init__(self, dataset_name: _Optional[str] = ..., options: _Optional[_Union[TrainingRequestOptions, _Mapping]] = ...) -> None: ...

class GetDatasetModelsRequest(_message.Message):
    __slots__ = ("dataset_name", "options")
    DATASET_NAME_FIELD_NUMBER: _ClassVar[int]
    OPTIONS_FIELD_NUMBER: _ClassVar[int]
    dataset_name: str
    options: ModelRequestOptions
    def __init__(self, dataset_name: _Optional[str] = ..., options: _Optional[_Union[ModelRequestOptions, _Mapping]] = ...) -> None: ...

class GetTrainingsRequest(_message.Message):
    __slots__ = ("options",)
    OPTIONS_FIELD_NUMBER: _ClassVar[int]
    options: TrainingRequestOptions
    def __init__(self, options: _Optional[_Union[TrainingRequestOptions, _Mapping]] = ...) -> None: ...

class TrainingsResponse(_message.Message):
    __slots__ = ("trainings",)
    TRAININGS_FIELD_NUMBER: _ClassVar[int]
    trainings: _containers.RepeatedCompositeFieldContainer[_training_pb2.Training]
    def __init__(self, trainings: _Optional[_Iterable[_Union[_training_pb2.Training, _Mapping]]] = ...) -> None: ...

class ModelsResponse(_message.Message):
    __slots__ = ("models",)
    MODELS_FIELD_NUMBER: _ClassVar[int]
    models: _containers.RepeatedCompositeFieldContainer[_model_pb2.Model]
    def __init__(self, models: _Optional[_Iterable[_Union[_model_pb2.Model, _Mapping]]] = ...) -> None: ...
