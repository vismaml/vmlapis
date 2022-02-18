# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: asgt/type/train_model_task.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from vml_proto.asgt.type import dataset_pb2 as asgt_dot_type_dot_dataset__pb2
from vml_proto.asgt.type import revision_pb2 as asgt_dot_type_dot_revision__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='asgt/type/train_model_task.proto',
  package='asgt.type',
  syntax='proto3',
  serialized_options=b'Z6github.com/e-conomic/vmlapis/gen/go/asgt/type;asgttype',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n asgt/type/train_model_task.proto\x12\tasgt.type\x1a\x17\x61sgt/type/dataset.proto\x1a\x18\x61sgt/type/revision.proto\"s\n\x0eTrainModelTask\x12#\n\x07\x64\x61taset\x18\x01 \x01(\x0b\x32\x12.asgt.type.Dataset\x12%\n\x08revision\x18\x02 \x01(\x0b\x32\x13.asgt.type.Revision\x12\x15\n\rmodel_version\x18\x04 \x01(\x03\x42\x38Z6github.com/e-conomic/vmlapis/gen/go/asgt/type;asgttypeb\x06proto3'
  ,
  dependencies=[asgt_dot_type_dot_dataset__pb2.DESCRIPTOR,asgt_dot_type_dot_revision__pb2.DESCRIPTOR,])




_TRAINMODELTASK = _descriptor.Descriptor(
  name='TrainModelTask',
  full_name='asgt.type.TrainModelTask',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='dataset', full_name='asgt.type.TrainModelTask.dataset', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='revision', full_name='asgt.type.TrainModelTask.revision', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='model_version', full_name='asgt.type.TrainModelTask.model_version', index=2,
      number=4, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=98,
  serialized_end=213,
)

_TRAINMODELTASK.fields_by_name['dataset'].message_type = asgt_dot_type_dot_dataset__pb2._DATASET
_TRAINMODELTASK.fields_by_name['revision'].message_type = asgt_dot_type_dot_revision__pb2._REVISION
DESCRIPTOR.message_types_by_name['TrainModelTask'] = _TRAINMODELTASK
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

TrainModelTask = _reflection.GeneratedProtocolMessageType('TrainModelTask', (_message.Message,), {
  'DESCRIPTOR' : _TRAINMODELTASK,
  '__module__' : 'asgt.type.train_model_task_pb2'
  # @@protoc_insertion_point(class_scope:asgt.type.TrainModelTask)
  })
_sym_db.RegisterMessage(TrainModelTask)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
