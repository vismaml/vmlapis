from google.protobuf.internal import containers as _containers
from google.protobuf.internal import enum_type_wrapper as _enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Iterable as _Iterable, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class TargetStat(_message.Message):
    __slots__ = ("class_name", "relative_dataset_proportion", "absolute_dataset_proportion")
    CLASS_NAME_FIELD_NUMBER: _ClassVar[int]
    RELATIVE_DATASET_PROPORTION_FIELD_NUMBER: _ClassVar[int]
    ABSOLUTE_DATASET_PROPORTION_FIELD_NUMBER: _ClassVar[int]
    class_name: str
    relative_dataset_proportion: float
    absolute_dataset_proportion: int
    def __init__(self, class_name: _Optional[str] = ..., relative_dataset_proportion: _Optional[float] = ..., absolute_dataset_proportion: _Optional[int] = ...) -> None: ...

class TargetStats(_message.Message):
    __slots__ = ("target_stats",)
    TARGET_STATS_FIELD_NUMBER: _ClassVar[int]
    target_stats: _containers.RepeatedCompositeFieldContainer[TargetStat]
    def __init__(self, target_stats: _Optional[_Iterable[_Union[TargetStat, _Mapping]]] = ...) -> None: ...

class FeatureStat(_message.Message):
    __slots__ = ("feature_name", "feature_type", "information_gain")
    class Type(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
        __slots__ = ()
        INT: _ClassVar[FeatureStat.Type]
        FLOAT: _ClassVar[FeatureStat.Type]
        STRING: _ClassVar[FeatureStat.Type]
        BYTES: _ClassVar[FeatureStat.Type]
        STRUCT: _ClassVar[FeatureStat.Type]
    INT: FeatureStat.Type
    FLOAT: FeatureStat.Type
    STRING: FeatureStat.Type
    BYTES: FeatureStat.Type
    STRUCT: FeatureStat.Type
    FEATURE_NAME_FIELD_NUMBER: _ClassVar[int]
    FEATURE_TYPE_FIELD_NUMBER: _ClassVar[int]
    INFORMATION_GAIN_FIELD_NUMBER: _ClassVar[int]
    feature_name: str
    feature_type: FeatureStat.Type
    information_gain: float
    def __init__(self, feature_name: _Optional[str] = ..., feature_type: _Optional[_Union[FeatureStat.Type, str]] = ..., information_gain: _Optional[float] = ...) -> None: ...

class FeatureStats(_message.Message):
    __slots__ = ("feature_stats",)
    FEATURE_STATS_FIELD_NUMBER: _ClassVar[int]
    feature_stats: _containers.RepeatedCompositeFieldContainer[FeatureStat]
    def __init__(self, feature_stats: _Optional[_Iterable[_Union[FeatureStat, _Mapping]]] = ...) -> None: ...

class TrainStatistics(_message.Message):
    __slots__ = ("target_stats_by_target", "feature_stats_by_target", "similarity_index")
    class TargetStatsByTargetEntry(_message.Message):
        __slots__ = ("key", "value")
        KEY_FIELD_NUMBER: _ClassVar[int]
        VALUE_FIELD_NUMBER: _ClassVar[int]
        key: str
        value: TargetStats
        def __init__(self, key: _Optional[str] = ..., value: _Optional[_Union[TargetStats, _Mapping]] = ...) -> None: ...
    class FeatureStatsByTargetEntry(_message.Message):
        __slots__ = ("key", "value")
        KEY_FIELD_NUMBER: _ClassVar[int]
        VALUE_FIELD_NUMBER: _ClassVar[int]
        key: str
        value: FeatureStats
        def __init__(self, key: _Optional[str] = ..., value: _Optional[_Union[FeatureStats, _Mapping]] = ...) -> None: ...
    TARGET_STATS_BY_TARGET_FIELD_NUMBER: _ClassVar[int]
    FEATURE_STATS_BY_TARGET_FIELD_NUMBER: _ClassVar[int]
    SIMILARITY_INDEX_FIELD_NUMBER: _ClassVar[int]
    target_stats_by_target: _containers.MessageMap[str, TargetStats]
    feature_stats_by_target: _containers.MessageMap[str, FeatureStats]
    similarity_index: float
    def __init__(self, target_stats_by_target: _Optional[_Mapping[str, TargetStats]] = ..., feature_stats_by_target: _Optional[_Mapping[str, FeatureStats]] = ..., similarity_index: _Optional[float] = ...) -> None: ...
