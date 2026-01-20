from google.protobuf.internal import containers as _containers
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Iterable as _Iterable, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class TargetMetrics(_message.Message):
    __slots__ = ("target", "metrics", "entropy", "number_of_classes", "avg_sample_per_class", "inconsistent_label_ratio", "avg_labels_per_inconsistent_sample", "percent_samples_not_in_target_vocab", "js_divergence_classes")
    class Metric(_message.Message):
        __slots__ = ("precision", "confidence", "answer_rate", "true_positive", "true_negative", "false_positive", "false_negative", "mcc", "accuracy", "balanced_accuracy", "precision_bound_epsilon")
        PRECISION_FIELD_NUMBER: _ClassVar[int]
        CONFIDENCE_FIELD_NUMBER: _ClassVar[int]
        ANSWER_RATE_FIELD_NUMBER: _ClassVar[int]
        TRUE_POSITIVE_FIELD_NUMBER: _ClassVar[int]
        TRUE_NEGATIVE_FIELD_NUMBER: _ClassVar[int]
        FALSE_POSITIVE_FIELD_NUMBER: _ClassVar[int]
        FALSE_NEGATIVE_FIELD_NUMBER: _ClassVar[int]
        MCC_FIELD_NUMBER: _ClassVar[int]
        ACCURACY_FIELD_NUMBER: _ClassVar[int]
        BALANCED_ACCURACY_FIELD_NUMBER: _ClassVar[int]
        PRECISION_BOUND_EPSILON_FIELD_NUMBER: _ClassVar[int]
        precision: float
        confidence: float
        answer_rate: float
        true_positive: int
        true_negative: int
        false_positive: int
        false_negative: int
        mcc: float
        accuracy: float
        balanced_accuracy: float
        precision_bound_epsilon: float
        def __init__(self, precision: _Optional[float] = ..., confidence: _Optional[float] = ..., answer_rate: _Optional[float] = ..., true_positive: _Optional[int] = ..., true_negative: _Optional[int] = ..., false_positive: _Optional[int] = ..., false_negative: _Optional[int] = ..., mcc: _Optional[float] = ..., accuracy: _Optional[float] = ..., balanced_accuracy: _Optional[float] = ..., precision_bound_epsilon: _Optional[float] = ...) -> None: ...
    TARGET_FIELD_NUMBER: _ClassVar[int]
    METRICS_FIELD_NUMBER: _ClassVar[int]
    ENTROPY_FIELD_NUMBER: _ClassVar[int]
    NUMBER_OF_CLASSES_FIELD_NUMBER: _ClassVar[int]
    AVG_SAMPLE_PER_CLASS_FIELD_NUMBER: _ClassVar[int]
    INCONSISTENT_LABEL_RATIO_FIELD_NUMBER: _ClassVar[int]
    AVG_LABELS_PER_INCONSISTENT_SAMPLE_FIELD_NUMBER: _ClassVar[int]
    PERCENT_SAMPLES_NOT_IN_TARGET_VOCAB_FIELD_NUMBER: _ClassVar[int]
    JS_DIVERGENCE_CLASSES_FIELD_NUMBER: _ClassVar[int]
    target: str
    metrics: _containers.RepeatedCompositeFieldContainer[TargetMetrics.Metric]
    entropy: float
    number_of_classes: int
    avg_sample_per_class: float
    inconsistent_label_ratio: float
    avg_labels_per_inconsistent_sample: float
    percent_samples_not_in_target_vocab: float
    js_divergence_classes: float
    def __init__(self, target: _Optional[str] = ..., metrics: _Optional[_Iterable[_Union[TargetMetrics.Metric, _Mapping]]] = ..., entropy: _Optional[float] = ..., number_of_classes: _Optional[int] = ..., avg_sample_per_class: _Optional[float] = ..., inconsistent_label_ratio: _Optional[float] = ..., avg_labels_per_inconsistent_sample: _Optional[float] = ..., percent_samples_not_in_target_vocab: _Optional[float] = ..., js_divergence_classes: _Optional[float] = ...) -> None: ...
