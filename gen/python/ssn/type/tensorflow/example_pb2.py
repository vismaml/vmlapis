# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: ssn/type/tensorflow/example.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from vml_proto.ssn.type.tensorflow import feature_pb2 as ssn_dot_type_dot_tensorflow_dot_feature__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n!ssn/type/tensorflow/example.proto\x12\ntensorflow\x1a!ssn/type/tensorflow/feature.proto\";\n\x07\x45xample\x12\x30\n\x08\x66\x65\x61tures\x18\x01 \x01(\x0b\x32\x14.tensorflow.FeaturesR\x08\x66\x65\x61tures\"\x80\x01\n\x0fSequenceExample\x12.\n\x07\x63ontext\x18\x01 \x01(\x0b\x32\x14.tensorflow.FeaturesR\x07\x63ontext\x12=\n\rfeature_lists\x18\x02 \x01(\x0b\x32\x18.tensorflow.FeatureListsR\x0c\x66\x65\x61tureListsBh\n\x16org.tensorflow.exampleB\rExampleProtosP\x01Z:github.com/e-conomic/tensorflow/tensorflow/go/core/example\xf8\x01\x01\x62\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'ssn.type.tensorflow.example_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\026org.tensorflow.exampleB\rExampleProtosP\001Z:github.com/e-conomic/tensorflow/tensorflow/go/core/example\370\001\001'
  _EXAMPLE._serialized_start=84
  _EXAMPLE._serialized_end=143
  _SEQUENCEEXAMPLE._serialized_start=146
  _SEQUENCEEXAMPLE._serialized_end=274
# @@protoc_insertion_point(module_scope)
