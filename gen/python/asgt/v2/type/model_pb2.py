# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: asgt/v2/type/model.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from vml_proto.asgt.type import dataset_pb2 as asgt_dot_type_dot_dataset__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x18\x61sgt/v2/type/model.proto\x12\x0c\x61sgt.v2.type\x1a\x17\x61sgt/type/dataset.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\x8a\x01\n\x05Model\x12\x39\n\ncreated_at\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.TimestampR\tcreatedAt\x12,\n\x07\x64\x61taset\x18\x02 \x01(\x0b\x32\x12.asgt.type.DatasetR\x07\x64\x61taset\x12\x18\n\x07targets\x18\x03 \x03(\tR\x07targetsB;Z9github.com/e-conomic/vmlapis/gen/go/asgt/v2/type;asgttypeb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'asgt.v2.type.model_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'Z9github.com/e-conomic/vmlapis/gen/go/asgt/v2/type;asgttype'
  _globals['_MODEL']._serialized_start=101
  _globals['_MODEL']._serialized_end=239
# @@protoc_insertion_point(module_scope)
