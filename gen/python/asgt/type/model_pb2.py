# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: asgt/type/model.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from vml_proto.asgt.type import model_file_pb2 as asgt_dot_type_dot_model__file__pb2
from vml_proto.asgt.type import prediction_pb2 as asgt_dot_type_dot_prediction__pb2
from vml_proto.asgt.type import target_metrics_pb2 as asgt_dot_type_dot_target__metrics__pb2
from vml_proto.gen_bq_schema import bq_field_pb2 as gen__bq__schema_dot_bq__field__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x15\x61sgt/type/model.proto\x12\tasgt.type\x1a\x1a\x61sgt/type/model_file.proto\x1a\x1a\x61sgt/type/prediction.proto\x1a\x1e\x61sgt/type/target_metrics.proto\x1a\x1cgen_bq_schema/bq_field.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xb2\x04\n\x05Model\x12\x1f\n\x07version\x18\x03 \x01(\x03\x42\x05\xea?\x02\x08\x01R\x07version\x12\x39\n\ncreated_at\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.TimestampR\tcreatedAt\x12(\n\x0c\x64\x61taset_size\x18\x05 \x01(\x05\x42\x05\xea?\x02\x18\x01R\x0b\x64\x61tasetSize\x12*\n\rtraining_size\x18\x06 \x01(\x05\x42\x05\xea?\x02\x18\x01R\x0ctrainingSize\x12L\n\x11\x63onfidence_scores\x18\x07 \x03(\x0b\x32\x18.asgt.type.TargetMetricsB\x05\xea?\x02\x18\x01R\x10\x63onfidenceScores\x12\x39\n\ninput_type\x18\x08 \x01(\x0e\x32\x1a.asgt.type.Model.InputTypeR\tinputType\x12!\n\x0c\x64\x61taset_type\x18\t \x01(\tR\x0b\x64\x61tasetType\x12<\n\x0bmodel_files\x18\n \x03(\x0b\x32\x14.asgt.type.ModelFileB\x05\xea?\x02\x18\x01R\nmodelFiles\x12Q\n\x15\x63onfidence_thresholds\x18\x0b \x03(\x0b\x32\x15.asgt.type.ConfidenceB\x05\xea?\x02\x18\x01R\x14\x63onfidenceThresholds\"4\n\tInputType\x12\x13\n\x0f\x46\x45\x41TURE_TENSORS\x10\x00\x12\x12\n\x0e\x45XAMPLE_TENSOR\x10\x01J\x04\x08\x01\x10\x03\x42\x38Z6github.com/e-conomic/vmlapis/gen/go/asgt/type;asgttypeb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'asgt.type.model_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'Z6github.com/e-conomic/vmlapis/gen/go/asgt/type;asgttype'
  _MODEL.fields_by_name['version']._options = None
  _MODEL.fields_by_name['version']._serialized_options = b'\352?\002\010\001'
  _MODEL.fields_by_name['dataset_size']._options = None
  _MODEL.fields_by_name['dataset_size']._serialized_options = b'\352?\002\030\001'
  _MODEL.fields_by_name['training_size']._options = None
  _MODEL.fields_by_name['training_size']._serialized_options = b'\352?\002\030\001'
  _MODEL.fields_by_name['confidence_scores']._options = None
  _MODEL.fields_by_name['confidence_scores']._serialized_options = b'\352?\002\030\001'
  _MODEL.fields_by_name['model_files']._options = None
  _MODEL.fields_by_name['model_files']._serialized_options = b'\352?\002\030\001'
  _MODEL.fields_by_name['confidence_thresholds']._options = None
  _MODEL.fields_by_name['confidence_thresholds']._serialized_options = b'\352?\002\030\001'
  _globals['_MODEL']._serialized_start=188
  _globals['_MODEL']._serialized_end=750
  _globals['_MODEL_INPUTTYPE']._serialized_start=692
  _globals['_MODEL_INPUTTYPE']._serialized_end=744
# @@protoc_insertion_point(module_scope)
