# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# NO CHECKED-IN PROTOBUF GENCODE
# source: asgt/v2/type/example.proto
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
    'asgt/v2/type/example.proto'
)
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from vml_proto.asgt.v2.type import data_pb2 as asgt_dot_v2_dot_type_dot_data__pb2
from vml_proto.asgt.v2.type import target_value_pb2 as asgt_dot_v2_dot_type_dot_target__value__pb2
from vml_proto.validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1a\x61sgt/v2/type/example.proto\x12\x0c\x61sgt.v2.type\x1a\x17\x61sgt/v2/type/data.proto\x1a\x1f\x61sgt/v2/type/target_value.proto\x1a\x17validate/validate.proto\"\x9a\x01\n\x07\x45xample\x12&\n\x04\x64\x61ta\x18\x01 \x01(\x0b\x32\x12.asgt.v2.type.DataR\x04\x64\x61ta\x12J\n\rtarget_values\x18\x02 \x03(\x0b\x32\x19.asgt.v2.type.TargetValueB\n\xfa\x42\x07\x92\x01\x04\x08\x01(\x00R\x0ctargetValues\x12\x1b\n\x02id\x18\x03 \x01(\tB\x0b\xfa\x42\x08r\x06\xb0\x01\x01\xd0\x01\x01R\x02idB;Z9github.com/e-conomic/vmlapis/gen/go/asgt/v2/type;asgttypeb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'asgt.v2.type.example_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'Z9github.com/e-conomic/vmlapis/gen/go/asgt/v2/type;asgttype'
  _globals['_EXAMPLE'].fields_by_name['target_values']._loaded_options = None
  _globals['_EXAMPLE'].fields_by_name['target_values']._serialized_options = b'\372B\007\222\001\004\010\001(\000'
  _globals['_EXAMPLE'].fields_by_name['id']._loaded_options = None
  _globals['_EXAMPLE'].fields_by_name['id']._serialized_options = b'\372B\010r\006\260\001\001\320\001\001'
  _globals['_EXAMPLE']._serialized_start=128
  _globals['_EXAMPLE']._serialized_end=282
# @@protoc_insertion_point(module_scope)
