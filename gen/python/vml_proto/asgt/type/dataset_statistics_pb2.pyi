from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Optional as _Optional

DESCRIPTOR: _descriptor.FileDescriptor

class DatasetStatistics(_message.Message):
    __slots__ = ("lexical_diversity_split_on_space", "lexical_diversity_split_on_special", "percent_empty_strings", "percent_pure_numbers_remove_spaces", "percent_pure_numbers_remove_special", "percent_special_characters", "percent_digits", "percent_letters", "percent_duplicates_in_dataset")
    LEXICAL_DIVERSITY_SPLIT_ON_SPACE_FIELD_NUMBER: _ClassVar[int]
    LEXICAL_DIVERSITY_SPLIT_ON_SPECIAL_FIELD_NUMBER: _ClassVar[int]
    PERCENT_EMPTY_STRINGS_FIELD_NUMBER: _ClassVar[int]
    PERCENT_PURE_NUMBERS_REMOVE_SPACES_FIELD_NUMBER: _ClassVar[int]
    PERCENT_PURE_NUMBERS_REMOVE_SPECIAL_FIELD_NUMBER: _ClassVar[int]
    PERCENT_SPECIAL_CHARACTERS_FIELD_NUMBER: _ClassVar[int]
    PERCENT_DIGITS_FIELD_NUMBER: _ClassVar[int]
    PERCENT_LETTERS_FIELD_NUMBER: _ClassVar[int]
    PERCENT_DUPLICATES_IN_DATASET_FIELD_NUMBER: _ClassVar[int]
    lexical_diversity_split_on_space: float
    lexical_diversity_split_on_special: float
    percent_empty_strings: float
    percent_pure_numbers_remove_spaces: float
    percent_pure_numbers_remove_special: float
    percent_special_characters: float
    percent_digits: float
    percent_letters: float
    percent_duplicates_in_dataset: float
    def __init__(self, lexical_diversity_split_on_space: _Optional[float] = ..., lexical_diversity_split_on_special: _Optional[float] = ..., percent_empty_strings: _Optional[float] = ..., percent_pure_numbers_remove_spaces: _Optional[float] = ..., percent_pure_numbers_remove_special: _Optional[float] = ..., percent_special_characters: _Optional[float] = ..., percent_digits: _Optional[float] = ..., percent_letters: _Optional[float] = ..., percent_duplicates_in_dataset: _Optional[float] = ...) -> None: ...
