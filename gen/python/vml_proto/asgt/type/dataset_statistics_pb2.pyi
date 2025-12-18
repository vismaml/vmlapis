from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Optional as _Optional

DESCRIPTOR: _descriptor.FileDescriptor

class DatasetStatistics(_message.Message):
    __slots__ = ("lexical_diversity_split_on_space", "lexical_diversity_split_on_special", "percent_empty_strings", "percent_pure_numbers_remove_spaces", "percent_pure_numbers_remove_special", "percent_special_characters", "percent_digits", "percent_letters", "percent_duplicates_in_dataset", "entropy", "number_of_classes", "avg_sample_per_class", "inconsistent_label_ratio", "avg_labels_per_inconsistent_sample", "missing_data_ratio", "test_set_avg_unknown_token_ratio", "vocab_size", "percent_samples_not_in_target_vocab", "avg_unknown_token_ratio", "js_divergence_classes", "js_divergence_tokens")
    LEXICAL_DIVERSITY_SPLIT_ON_SPACE_FIELD_NUMBER: _ClassVar[int]
    LEXICAL_DIVERSITY_SPLIT_ON_SPECIAL_FIELD_NUMBER: _ClassVar[int]
    PERCENT_EMPTY_STRINGS_FIELD_NUMBER: _ClassVar[int]
    PERCENT_PURE_NUMBERS_REMOVE_SPACES_FIELD_NUMBER: _ClassVar[int]
    PERCENT_PURE_NUMBERS_REMOVE_SPECIAL_FIELD_NUMBER: _ClassVar[int]
    PERCENT_SPECIAL_CHARACTERS_FIELD_NUMBER: _ClassVar[int]
    PERCENT_DIGITS_FIELD_NUMBER: _ClassVar[int]
    PERCENT_LETTERS_FIELD_NUMBER: _ClassVar[int]
    PERCENT_DUPLICATES_IN_DATASET_FIELD_NUMBER: _ClassVar[int]
    ENTROPY_FIELD_NUMBER: _ClassVar[int]
    NUMBER_OF_CLASSES_FIELD_NUMBER: _ClassVar[int]
    AVG_SAMPLE_PER_CLASS_FIELD_NUMBER: _ClassVar[int]
    INCONSISTENT_LABEL_RATIO_FIELD_NUMBER: _ClassVar[int]
    AVG_LABELS_PER_INCONSISTENT_SAMPLE_FIELD_NUMBER: _ClassVar[int]
    MISSING_DATA_RATIO_FIELD_NUMBER: _ClassVar[int]
    TEST_SET_AVG_UNKNOWN_TOKEN_RATIO_FIELD_NUMBER: _ClassVar[int]
    VOCAB_SIZE_FIELD_NUMBER: _ClassVar[int]
    PERCENT_SAMPLES_NOT_IN_TARGET_VOCAB_FIELD_NUMBER: _ClassVar[int]
    AVG_UNKNOWN_TOKEN_RATIO_FIELD_NUMBER: _ClassVar[int]
    JS_DIVERGENCE_CLASSES_FIELD_NUMBER: _ClassVar[int]
    JS_DIVERGENCE_TOKENS_FIELD_NUMBER: _ClassVar[int]
    lexical_diversity_split_on_space: float
    lexical_diversity_split_on_special: float
    percent_empty_strings: float
    percent_pure_numbers_remove_spaces: float
    percent_pure_numbers_remove_special: float
    percent_special_characters: float
    percent_digits: float
    percent_letters: float
    percent_duplicates_in_dataset: float
    entropy: float
    number_of_classes: int
    avg_sample_per_class: float
    inconsistent_label_ratio: float
    avg_labels_per_inconsistent_sample: float
    missing_data_ratio: float
    test_set_avg_unknown_token_ratio: float
    vocab_size: int
    percent_samples_not_in_target_vocab: float
    avg_unknown_token_ratio: float
    js_divergence_classes: float
    js_divergence_tokens: float
    def __init__(self, lexical_diversity_split_on_space: _Optional[float] = ..., lexical_diversity_split_on_special: _Optional[float] = ..., percent_empty_strings: _Optional[float] = ..., percent_pure_numbers_remove_spaces: _Optional[float] = ..., percent_pure_numbers_remove_special: _Optional[float] = ..., percent_special_characters: _Optional[float] = ..., percent_digits: _Optional[float] = ..., percent_letters: _Optional[float] = ..., percent_duplicates_in_dataset: _Optional[float] = ..., entropy: _Optional[float] = ..., number_of_classes: _Optional[int] = ..., avg_sample_per_class: _Optional[float] = ..., inconsistent_label_ratio: _Optional[float] = ..., avg_labels_per_inconsistent_sample: _Optional[float] = ..., missing_data_ratio: _Optional[float] = ..., test_set_avg_unknown_token_ratio: _Optional[float] = ..., vocab_size: _Optional[int] = ..., percent_samples_not_in_target_vocab: _Optional[float] = ..., avg_unknown_token_ratio: _Optional[float] = ..., js_divergence_classes: _Optional[float] = ..., js_divergence_tokens: _Optional[float] = ...) -> None: ...
