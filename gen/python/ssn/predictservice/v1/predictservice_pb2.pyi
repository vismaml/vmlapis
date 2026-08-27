from google.protobuf.internal import containers as _containers
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Iterable as _Iterable, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class InferParameter(_message.Message):
    __slots__ = ("bool_param", "int64_param", "string_param", "double_param", "uint64_param")
    BOOL_PARAM_FIELD_NUMBER: _ClassVar[int]
    INT64_PARAM_FIELD_NUMBER: _ClassVar[int]
    STRING_PARAM_FIELD_NUMBER: _ClassVar[int]
    DOUBLE_PARAM_FIELD_NUMBER: _ClassVar[int]
    UINT64_PARAM_FIELD_NUMBER: _ClassVar[int]
    bool_param: bool
    int64_param: int
    string_param: str
    double_param: float
    uint64_param: int
    def __init__(self, bool_param: bool = ..., int64_param: _Optional[int] = ..., string_param: _Optional[str] = ..., double_param: _Optional[float] = ..., uint64_param: _Optional[int] = ...) -> None: ...

class InferTensorContents(_message.Message):
    __slots__ = ("bool_contents", "int_contents", "int64_contents", "uint_contents", "uint64_contents", "fp32_contents", "fp64_contents", "bytes_contents")
    BOOL_CONTENTS_FIELD_NUMBER: _ClassVar[int]
    INT_CONTENTS_FIELD_NUMBER: _ClassVar[int]
    INT64_CONTENTS_FIELD_NUMBER: _ClassVar[int]
    UINT_CONTENTS_FIELD_NUMBER: _ClassVar[int]
    UINT64_CONTENTS_FIELD_NUMBER: _ClassVar[int]
    FP32_CONTENTS_FIELD_NUMBER: _ClassVar[int]
    FP64_CONTENTS_FIELD_NUMBER: _ClassVar[int]
    BYTES_CONTENTS_FIELD_NUMBER: _ClassVar[int]
    bool_contents: _containers.RepeatedScalarFieldContainer[bool]
    int_contents: _containers.RepeatedScalarFieldContainer[int]
    int64_contents: _containers.RepeatedScalarFieldContainer[int]
    uint_contents: _containers.RepeatedScalarFieldContainer[int]
    uint64_contents: _containers.RepeatedScalarFieldContainer[int]
    fp32_contents: _containers.RepeatedScalarFieldContainer[float]
    fp64_contents: _containers.RepeatedScalarFieldContainer[float]
    bytes_contents: _containers.RepeatedScalarFieldContainer[bytes]
    def __init__(self, bool_contents: _Optional[_Iterable[bool]] = ..., int_contents: _Optional[_Iterable[int]] = ..., int64_contents: _Optional[_Iterable[int]] = ..., uint_contents: _Optional[_Iterable[int]] = ..., uint64_contents: _Optional[_Iterable[int]] = ..., fp32_contents: _Optional[_Iterable[float]] = ..., fp64_contents: _Optional[_Iterable[float]] = ..., bytes_contents: _Optional[_Iterable[bytes]] = ...) -> None: ...

class ModelInferRequest(_message.Message):
    __slots__ = ("model_name", "model_version", "id", "parameters", "inputs", "outputs", "raw_input_contents")
    class InferInputTensor(_message.Message):
        __slots__ = ("name", "datatype", "shape", "parameters", "contents")
        class ParametersEntry(_message.Message):
            __slots__ = ("key", "value")
            KEY_FIELD_NUMBER: _ClassVar[int]
            VALUE_FIELD_NUMBER: _ClassVar[int]
            key: str
            value: InferParameter
            def __init__(self, key: _Optional[str] = ..., value: _Optional[_Union[InferParameter, _Mapping]] = ...) -> None: ...
        NAME_FIELD_NUMBER: _ClassVar[int]
        DATATYPE_FIELD_NUMBER: _ClassVar[int]
        SHAPE_FIELD_NUMBER: _ClassVar[int]
        PARAMETERS_FIELD_NUMBER: _ClassVar[int]
        CONTENTS_FIELD_NUMBER: _ClassVar[int]
        name: str
        datatype: str
        shape: _containers.RepeatedScalarFieldContainer[int]
        parameters: _containers.MessageMap[str, InferParameter]
        contents: InferTensorContents
        def __init__(self, name: _Optional[str] = ..., datatype: _Optional[str] = ..., shape: _Optional[_Iterable[int]] = ..., parameters: _Optional[_Mapping[str, InferParameter]] = ..., contents: _Optional[_Union[InferTensorContents, _Mapping]] = ...) -> None: ...
    class InferRequestedOutputTensor(_message.Message):
        __slots__ = ("name", "parameters")
        class ParametersEntry(_message.Message):
            __slots__ = ("key", "value")
            KEY_FIELD_NUMBER: _ClassVar[int]
            VALUE_FIELD_NUMBER: _ClassVar[int]
            key: str
            value: InferParameter
            def __init__(self, key: _Optional[str] = ..., value: _Optional[_Union[InferParameter, _Mapping]] = ...) -> None: ...
        NAME_FIELD_NUMBER: _ClassVar[int]
        PARAMETERS_FIELD_NUMBER: _ClassVar[int]
        name: str
        parameters: _containers.MessageMap[str, InferParameter]
        def __init__(self, name: _Optional[str] = ..., parameters: _Optional[_Mapping[str, InferParameter]] = ...) -> None: ...
    class ParametersEntry(_message.Message):
        __slots__ = ("key", "value")
        KEY_FIELD_NUMBER: _ClassVar[int]
        VALUE_FIELD_NUMBER: _ClassVar[int]
        key: str
        value: InferParameter
        def __init__(self, key: _Optional[str] = ..., value: _Optional[_Union[InferParameter, _Mapping]] = ...) -> None: ...
    MODEL_NAME_FIELD_NUMBER: _ClassVar[int]
    MODEL_VERSION_FIELD_NUMBER: _ClassVar[int]
    ID_FIELD_NUMBER: _ClassVar[int]
    PARAMETERS_FIELD_NUMBER: _ClassVar[int]
    INPUTS_FIELD_NUMBER: _ClassVar[int]
    OUTPUTS_FIELD_NUMBER: _ClassVar[int]
    RAW_INPUT_CONTENTS_FIELD_NUMBER: _ClassVar[int]
    model_name: str
    model_version: str
    id: str
    parameters: _containers.MessageMap[str, InferParameter]
    inputs: _containers.RepeatedCompositeFieldContainer[ModelInferRequest.InferInputTensor]
    outputs: _containers.RepeatedCompositeFieldContainer[ModelInferRequest.InferRequestedOutputTensor]
    raw_input_contents: _containers.RepeatedScalarFieldContainer[bytes]
    def __init__(self, model_name: _Optional[str] = ..., model_version: _Optional[str] = ..., id: _Optional[str] = ..., parameters: _Optional[_Mapping[str, InferParameter]] = ..., inputs: _Optional[_Iterable[_Union[ModelInferRequest.InferInputTensor, _Mapping]]] = ..., outputs: _Optional[_Iterable[_Union[ModelInferRequest.InferRequestedOutputTensor, _Mapping]]] = ..., raw_input_contents: _Optional[_Iterable[bytes]] = ...) -> None: ...

class ModelInferResponse(_message.Message):
    __slots__ = ("model_name", "model_version", "id", "parameters", "outputs", "raw_output_contents")
    class InferOutputTensor(_message.Message):
        __slots__ = ("name", "datatype", "shape", "parameters", "contents")
        class ParametersEntry(_message.Message):
            __slots__ = ("key", "value")
            KEY_FIELD_NUMBER: _ClassVar[int]
            VALUE_FIELD_NUMBER: _ClassVar[int]
            key: str
            value: InferParameter
            def __init__(self, key: _Optional[str] = ..., value: _Optional[_Union[InferParameter, _Mapping]] = ...) -> None: ...
        NAME_FIELD_NUMBER: _ClassVar[int]
        DATATYPE_FIELD_NUMBER: _ClassVar[int]
        SHAPE_FIELD_NUMBER: _ClassVar[int]
        PARAMETERS_FIELD_NUMBER: _ClassVar[int]
        CONTENTS_FIELD_NUMBER: _ClassVar[int]
        name: str
        datatype: str
        shape: _containers.RepeatedScalarFieldContainer[int]
        parameters: _containers.MessageMap[str, InferParameter]
        contents: InferTensorContents
        def __init__(self, name: _Optional[str] = ..., datatype: _Optional[str] = ..., shape: _Optional[_Iterable[int]] = ..., parameters: _Optional[_Mapping[str, InferParameter]] = ..., contents: _Optional[_Union[InferTensorContents, _Mapping]] = ...) -> None: ...
    class ParametersEntry(_message.Message):
        __slots__ = ("key", "value")
        KEY_FIELD_NUMBER: _ClassVar[int]
        VALUE_FIELD_NUMBER: _ClassVar[int]
        key: str
        value: InferParameter
        def __init__(self, key: _Optional[str] = ..., value: _Optional[_Union[InferParameter, _Mapping]] = ...) -> None: ...
    MODEL_NAME_FIELD_NUMBER: _ClassVar[int]
    MODEL_VERSION_FIELD_NUMBER: _ClassVar[int]
    ID_FIELD_NUMBER: _ClassVar[int]
    PARAMETERS_FIELD_NUMBER: _ClassVar[int]
    OUTPUTS_FIELD_NUMBER: _ClassVar[int]
    RAW_OUTPUT_CONTENTS_FIELD_NUMBER: _ClassVar[int]
    model_name: str
    model_version: str
    id: str
    parameters: _containers.MessageMap[str, InferParameter]
    outputs: _containers.RepeatedCompositeFieldContainer[ModelInferResponse.InferOutputTensor]
    raw_output_contents: _containers.RepeatedScalarFieldContainer[bytes]
    def __init__(self, model_name: _Optional[str] = ..., model_version: _Optional[str] = ..., id: _Optional[str] = ..., parameters: _Optional[_Mapping[str, InferParameter]] = ..., outputs: _Optional[_Iterable[_Union[ModelInferResponse.InferOutputTensor, _Mapping]]] = ..., raw_output_contents: _Optional[_Iterable[bytes]] = ...) -> None: ...
