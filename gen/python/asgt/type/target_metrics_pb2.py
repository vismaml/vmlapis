# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: asgt/type/target_metrics.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1e\x61sgt/type/target_metrics.proto\x12\tasgt.type\"\xe4\x02\n\rTargetMetrics\x12\x16\n\x06target\x18\x01 \x01(\tR\x06target\x12\x39\n\x07metrics\x18\x02 \x03(\x0b\x32\x1f.asgt.type.TargetMetrics.MetricR\x07metrics\x1a\xff\x01\n\x06Metric\x12\x1c\n\tprecision\x18\x01 \x01(\x02R\tprecision\x12\x1e\n\nconfidence\x18\x02 \x01(\x02R\nconfidence\x12\x1f\n\x0b\x61nswer_rate\x18\x03 \x01(\x02R\nanswerRate\x12#\n\rtrue_positive\x18\x04 \x01(\x05R\x0ctruePositive\x12#\n\rtrue_negative\x18\x05 \x01(\x05R\x0ctrueNegative\x12%\n\x0e\x66\x61lse_positive\x18\x06 \x01(\x05R\rfalsePositive\x12%\n\x0e\x66\x61lse_negative\x18\x07 \x01(\x05R\rfalseNegativeB8Z6github.com/e-conomic/vmlapis/gen/go/asgt/type;asgttypeb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'asgt.type.target_metrics_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'Z6github.com/e-conomic/vmlapis/gen/go/asgt/type;asgttype'
  _globals['_TARGETMETRICS']._serialized_start=46
  _globals['_TARGETMETRICS']._serialized_end=402
  _globals['_TARGETMETRICS_METRIC']._serialized_start=147
  _globals['_TARGETMETRICS_METRIC']._serialized_end=402
# @@protoc_insertion_point(module_scope)
