# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# NO CHECKED-IN PROTOBUF GENCODE
# source: ssn/type/geometry.proto
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
    'ssn/type/geometry.proto'
)
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x17ssn/type/geometry.proto\x12\x08ssn.type\"$\n\x06Vertex\x12\x0c\n\x01x\x18\x01 \x01(\x05R\x01x\x12\x0c\n\x01y\x18\x02 \x01(\x05R\x01y\".\n\x10NormalizedVertex\x12\x0c\n\x01x\x18\x01 \x01(\x02R\x01x\x12\x0c\n\x01y\x18\x02 \x01(\x02R\x01y\"\x89\x01\n\x0c\x42oundingPoly\x12,\n\x08vertices\x18\x01 \x03(\x0b\x32\x10.ssn.type.VertexR\x08vertices\x12K\n\x13normalized_vertices\x18\x02 \x03(\x0b\x32\x1a.ssn.type.NormalizedVertexR\x12normalizedVerticesB6Z4github.com/e-conomic/vmlapis/gen/go/ssn/type;ssntypeb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'ssn.type.geometry_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'Z4github.com/e-conomic/vmlapis/gen/go/ssn/type;ssntype'
  _globals['_VERTEX']._serialized_start=37
  _globals['_VERTEX']._serialized_end=73
  _globals['_NORMALIZEDVERTEX']._serialized_start=75
  _globals['_NORMALIZEDVERTEX']._serialized_end=121
  _globals['_BOUNDINGPOLY']._serialized_start=124
  _globals['_BOUNDINGPOLY']._serialized_end=261
# @@protoc_insertion_point(module_scope)
