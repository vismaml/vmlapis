# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: asgt/modelregistry/v1/model_registry.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from asgt.type import model_pb2 as asgt_dot_type_dot_model__pb2
from asgt.type import dataset_pb2 as asgt_dot_type_dot_dataset__pb2
from asgt.type import revision_pb2 as asgt_dot_type_dot_revision__pb2
from asgt.type import target_metrics_pb2 as asgt_dot_type_dot_target__metrics__pb2
from asgt.type import train_statistics_pb2 as asgt_dot_type_dot_train__statistics__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='asgt/modelregistry/v1/model_registry.proto',
  package='asgt.modelregistry.v1',
  syntax='proto3',
  serialized_options=b'ZGgithub.com/e-conomic/vmlapis/gen/go/asgt/modelregistry/v1;modelregistry',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n*asgt/modelregistry/v1/model_registry.proto\x12\x15\x61sgt.modelregistry.v1\x1a\x1bgoogle/protobuf/empty.proto\x1a\x15\x61sgt/type/model.proto\x1a\x17\x61sgt/type/dataset.proto\x1a\x18\x61sgt/type/revision.proto\x1a\x1e\x61sgt/type/target_metrics.proto\x1a asgt/type/train_statistics.proto\"\xed\x03\n\x14RegisterModelRequest\x12,\n\x07\x64\x61taset\x18\x01 \x01(\x0b\x32\x12.asgt.type.DatasetR\x07\x64\x61taset\x12/\n\x08revision\x18\x02 \x01(\x0b\x32\x13.asgt.type.RevisionR\x08revision\x12#\n\rmodel_version\x18\x03 \x01(\x03R\x0cmodelVersion\x12R\n\x07metrics\x18\x04 \x03(\x0b\x32\x38.asgt.modelregistry.v1.RegisterModelRequest.MetricsEntryR\x07metrics\x12?\n\x0etarget_metrics\x18\x05 \x03(\x0b\x32\x18.asgt.type.TargetMetricsR\rtargetMetrics\x12\x39\n\ninput_type\x18\x06 \x01(\x0e\x32\x1a.asgt.type.Model.InputTypeR\tinputType\x12\x45\n\x10train_statistics\x18\x07 \x01(\x0b\x32\x1a.asgt.type.TrainStatisticsR\x0ftrainStatistics\x1a:\n\x0cMetricsEntry\x12\x10\n\x03key\x18\x01 \x01(\tR\x03key\x12\x14\n\x05value\x18\x02 \x01(\x05R\x05value:\x02\x38\x01\"F\n\x16GetCurrentModelRequest\x12,\n\x07\x64\x61taset\x18\x01 \x01(\x0b\x32\x12.asgt.type.DatasetR\x07\x64\x61taset\"A\n\x17GetCurrentModelResponse\x12&\n\x05model\x18\x01 \x01(\x0b\x32\x10.asgt.type.ModelR\x05model2\xd7\x01\n\rModelRegistry\x12T\n\rRegisterModel\x12+.asgt.modelregistry.v1.RegisterModelRequest\x1a\x16.google.protobuf.Empty\x12p\n\x0fGetCurrentModel\x12-.asgt.modelregistry.v1.GetCurrentModelRequest\x1a..asgt.modelregistry.v1.GetCurrentModelResponseBIZGgithub.com/e-conomic/vmlapis/gen/go/asgt/modelregistry/v1;modelregistryb\x06proto3'
  ,
  dependencies=[google_dot_protobuf_dot_empty__pb2.DESCRIPTOR,asgt_dot_type_dot_model__pb2.DESCRIPTOR,asgt_dot_type_dot_dataset__pb2.DESCRIPTOR,asgt_dot_type_dot_revision__pb2.DESCRIPTOR,asgt_dot_type_dot_target__metrics__pb2.DESCRIPTOR,asgt_dot_type_dot_train__statistics__pb2.DESCRIPTOR,])




_REGISTERMODELREQUEST_METRICSENTRY = _descriptor.Descriptor(
  name='MetricsEntry',
  full_name='asgt.modelregistry.v1.RegisterModelRequest.MetricsEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='asgt.modelregistry.v1.RegisterModelRequest.MetricsEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='key', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='asgt.modelregistry.v1.RegisterModelRequest.MetricsEntry.value', index=1,
      number=2, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='value', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'8\001',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=674,
  serialized_end=732,
)

_REGISTERMODELREQUEST = _descriptor.Descriptor(
  name='RegisterModelRequest',
  full_name='asgt.modelregistry.v1.RegisterModelRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='dataset', full_name='asgt.modelregistry.v1.RegisterModelRequest.dataset', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='dataset', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='revision', full_name='asgt.modelregistry.v1.RegisterModelRequest.revision', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='revision', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='model_version', full_name='asgt.modelregistry.v1.RegisterModelRequest.model_version', index=2,
      number=3, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='modelVersion', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='metrics', full_name='asgt.modelregistry.v1.RegisterModelRequest.metrics', index=3,
      number=4, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='metrics', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='target_metrics', full_name='asgt.modelregistry.v1.RegisterModelRequest.target_metrics', index=4,
      number=5, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='targetMetrics', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='input_type', full_name='asgt.modelregistry.v1.RegisterModelRequest.input_type', index=5,
      number=6, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='inputType', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='train_statistics', full_name='asgt.modelregistry.v1.RegisterModelRequest.train_statistics', index=6,
      number=7, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='trainStatistics', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_REGISTERMODELREQUEST_METRICSENTRY, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=239,
  serialized_end=732,
)


_GETCURRENTMODELREQUEST = _descriptor.Descriptor(
  name='GetCurrentModelRequest',
  full_name='asgt.modelregistry.v1.GetCurrentModelRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='dataset', full_name='asgt.modelregistry.v1.GetCurrentModelRequest.dataset', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='dataset', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=734,
  serialized_end=804,
)


_GETCURRENTMODELRESPONSE = _descriptor.Descriptor(
  name='GetCurrentModelResponse',
  full_name='asgt.modelregistry.v1.GetCurrentModelResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='model', full_name='asgt.modelregistry.v1.GetCurrentModelResponse.model', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='model', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=806,
  serialized_end=871,
)

_REGISTERMODELREQUEST_METRICSENTRY.containing_type = _REGISTERMODELREQUEST
_REGISTERMODELREQUEST.fields_by_name['dataset'].message_type = asgt_dot_type_dot_dataset__pb2._DATASET
_REGISTERMODELREQUEST.fields_by_name['revision'].message_type = asgt_dot_type_dot_revision__pb2._REVISION
_REGISTERMODELREQUEST.fields_by_name['metrics'].message_type = _REGISTERMODELREQUEST_METRICSENTRY
_REGISTERMODELREQUEST.fields_by_name['target_metrics'].message_type = asgt_dot_type_dot_target__metrics__pb2._TARGETMETRICS
_REGISTERMODELREQUEST.fields_by_name['input_type'].enum_type = asgt_dot_type_dot_model__pb2._MODEL_INPUTTYPE
_REGISTERMODELREQUEST.fields_by_name['train_statistics'].message_type = asgt_dot_type_dot_train__statistics__pb2._TRAINSTATISTICS
_GETCURRENTMODELREQUEST.fields_by_name['dataset'].message_type = asgt_dot_type_dot_dataset__pb2._DATASET
_GETCURRENTMODELRESPONSE.fields_by_name['model'].message_type = asgt_dot_type_dot_model__pb2._MODEL
DESCRIPTOR.message_types_by_name['RegisterModelRequest'] = _REGISTERMODELREQUEST
DESCRIPTOR.message_types_by_name['GetCurrentModelRequest'] = _GETCURRENTMODELREQUEST
DESCRIPTOR.message_types_by_name['GetCurrentModelResponse'] = _GETCURRENTMODELRESPONSE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

RegisterModelRequest = _reflection.GeneratedProtocolMessageType('RegisterModelRequest', (_message.Message,), {

  'MetricsEntry' : _reflection.GeneratedProtocolMessageType('MetricsEntry', (_message.Message,), {
    'DESCRIPTOR' : _REGISTERMODELREQUEST_METRICSENTRY,
    '__module__' : 'asgt.modelregistry.v1.model_registry_pb2'
    # @@protoc_insertion_point(class_scope:asgt.modelregistry.v1.RegisterModelRequest.MetricsEntry)
    })
  ,
  'DESCRIPTOR' : _REGISTERMODELREQUEST,
  '__module__' : 'asgt.modelregistry.v1.model_registry_pb2'
  # @@protoc_insertion_point(class_scope:asgt.modelregistry.v1.RegisterModelRequest)
  })
_sym_db.RegisterMessage(RegisterModelRequest)
_sym_db.RegisterMessage(RegisterModelRequest.MetricsEntry)

GetCurrentModelRequest = _reflection.GeneratedProtocolMessageType('GetCurrentModelRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETCURRENTMODELREQUEST,
  '__module__' : 'asgt.modelregistry.v1.model_registry_pb2'
  # @@protoc_insertion_point(class_scope:asgt.modelregistry.v1.GetCurrentModelRequest)
  })
_sym_db.RegisterMessage(GetCurrentModelRequest)

GetCurrentModelResponse = _reflection.GeneratedProtocolMessageType('GetCurrentModelResponse', (_message.Message,), {
  'DESCRIPTOR' : _GETCURRENTMODELRESPONSE,
  '__module__' : 'asgt.modelregistry.v1.model_registry_pb2'
  # @@protoc_insertion_point(class_scope:asgt.modelregistry.v1.GetCurrentModelResponse)
  })
_sym_db.RegisterMessage(GetCurrentModelResponse)


DESCRIPTOR._options = None
_REGISTERMODELREQUEST_METRICSENTRY._options = None

_MODELREGISTRY = _descriptor.ServiceDescriptor(
  name='ModelRegistry',
  full_name='asgt.modelregistry.v1.ModelRegistry',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  create_key=_descriptor._internal_create_key,
  serialized_start=874,
  serialized_end=1089,
  methods=[
  _descriptor.MethodDescriptor(
    name='RegisterModel',
    full_name='asgt.modelregistry.v1.ModelRegistry.RegisterModel',
    index=0,
    containing_service=None,
    input_type=_REGISTERMODELREQUEST,
    output_type=google_dot_protobuf_dot_empty__pb2._EMPTY,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='GetCurrentModel',
    full_name='asgt.modelregistry.v1.ModelRegistry.GetCurrentModel',
    index=1,
    containing_service=None,
    input_type=_GETCURRENTMODELREQUEST,
    output_type=_GETCURRENTMODELRESPONSE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_MODELREGISTRY)

DESCRIPTOR.services_by_name['ModelRegistry'] = _MODELREGISTRY

# @@protoc_insertion_point(module_scope)
