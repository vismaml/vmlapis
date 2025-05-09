# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# NO CHECKED-IN PROTOBUF GENCODE
# source: asgt/jester/v1/jester.proto
# Protobuf Python Version: 5.29.3
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import runtime_version as _runtime_version
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
_runtime_version.ValidateProtobufRuntimeVersion(
    _runtime_version.Domain.PUBLIC,
    5,
    29,
    3,
    '',
    'asgt/jester/v1/jester.proto'
)
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from vml_proto.asgt.type import data_pb2 as asgt_dot_type_dot_data__pb2
from vml_proto.asgt.type import model_pb2 as asgt_dot_type_dot_model__pb2
from vml_proto.asgt.type import model_type_pb2 as asgt_dot_type_dot_model__type__pb2
from vml_proto.asgt.type import prediction_pb2 as asgt_dot_type_dot_prediction__pb2
from vml_proto.google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from vml_proto.protoc_gen_openapiv2.options import annotations_pb2 as protoc__gen__openapiv2_dot_options_dot_annotations__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1b\x61sgt/jester/v1/jester.proto\x12\x0e\x61sgt.jester.v1\x1a\x14\x61sgt/type/data.proto\x1a\x15\x61sgt/type/model.proto\x1a\x1a\x61sgt/type/model_type.proto\x1a\x1a\x61sgt/type/prediction.proto\x1a\x1cgoogle/api/annotations.proto\x1a.protoc-gen-openapiv2/options/annotations.proto\"u\n\x12SuggestionResponse\x12\x37\n\x0bpredictions\x18\x01 \x03(\x0b\x32\x15.asgt.type.PredictionR\x0bpredictions\x12&\n\x05model\x18\x02 \x01(\x0b\x32\x10.asgt.type.ModelR\x05model\"\xb7\x01\n\x11SuggestionOptions\x12)\n\x10suggestion_limit\x18\x01 \x01(\x05R\x0fsuggestionLimit\x12\x42\n\x0emin_confidence\x18\x02 \x01(\x0e\x32\x1b.asgt.type.Confidence.LevelR\rminConfidence\x12\x33\n\nmodel_type\x18\x03 \x01(\x0e\x32\x14.asgt.type.ModelTypeR\tmodelType\"\xb5\x01\n\x11SuggestionRequest\x12\x12\n\x04name\x18\x01 \x01(\tR\x04name\x12\x12\n\x04type\x18\x02 \x01(\tR\x04type\x12\'\n\x06inputs\x18\x03 \x03(\x0b\x32\x0f.asgt.type.DataR\x06inputs\x12;\n\x07options\x18\x04 \x01(\x0b\x32!.asgt.jester.v1.SuggestionOptionsR\x07options\x12\x12\n\x04tags\x18\x05 \x03(\tR\x04tags2\xda\x01\n\x06Jester\x12v\n\x07Suggest\x12!.asgt.jester.v1.SuggestionRequest\x1a\".asgt.jester.v1.SuggestionResponse\"$\x82\xd3\xe4\x93\x02\x1e\"\x19/v1/{type}/{name}:suggest:\x01*\x12X\n\x0fInternalSuggest\x12!.asgt.jester.v1.SuggestionRequest\x1a\".asgt.jester.v1.SuggestionResponseBxZ9github.com/e-conomic/vmlapis/gen/go/asgt/jester/v1;jester\x92\x41:\x12\x11\n\x0b\x41utoSuggest2\x02v1*\x01\x02\x32\x10\x61pplication/json:\x10\x61pplication/jsonb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'asgt.jester.v1.jester_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'Z9github.com/e-conomic/vmlapis/gen/go/asgt/jester/v1;jester\222A:\022\021\n\013AutoSuggest2\002v1*\001\0022\020application/json:\020application/json'
  _globals['_JESTER'].methods_by_name['Suggest']._loaded_options = None
  _globals['_JESTER'].methods_by_name['Suggest']._serialized_options = b'\202\323\344\223\002\036\"\031/v1/{type}/{name}:suggest:\001*'
  _globals['_SUGGESTIONRESPONSE']._serialized_start=226
  _globals['_SUGGESTIONRESPONSE']._serialized_end=343
  _globals['_SUGGESTIONOPTIONS']._serialized_start=346
  _globals['_SUGGESTIONOPTIONS']._serialized_end=529
  _globals['_SUGGESTIONREQUEST']._serialized_start=532
  _globals['_SUGGESTIONREQUEST']._serialized_end=713
  _globals['_JESTER']._serialized_start=716
  _globals['_JESTER']._serialized_end=934
# @@protoc_insertion_point(module_scope)
