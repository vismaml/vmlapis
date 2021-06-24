# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: asgt/data/v1/bq_entries.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from vml_proto.asgt.type import data_pb2 as asgt_dot_type_dot_data__pb2
from vml_proto.asgt.type import model_pb2 as asgt_dot_type_dot_model__pb2
from vml_proto.asgt.type import prediction_pb2 as asgt_dot_type_dot_prediction__pb2
from vml_proto.asgt.type import target_value_pb2 as asgt_dot_type_dot_target__value__pb2
from vml_proto.gen_bq_schema import bq_field_pb2 as gen__bq__schema_dot_bq__field__pb2
from vml_proto.gen_bq_schema import bq_table_pb2 as gen__bq__schema_dot_bq__table__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='asgt/data/v1/bq_entries.proto',
  package='asgt.dataservice.v1',
  syntax='proto3',
  serialized_options=b'Z5github.com/e-conomic/vmlapis/gen/go/asgt/data/v1;data',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\x1d\x61sgt/data/v1/bq_entries.proto\x12\x13\x61sgt.dataservice.v1\x1a\x14\x61sgt/type/data.proto\x1a\x15\x61sgt/type/model.proto\x1a\x1a\x61sgt/type/prediction.proto\x1a\x1c\x61sgt/type/target_value.proto\x1a\x1cgen_bq_schema/bq_field.proto\x1a\x1cgen_bq_schema/bq_table.proto\"\xfa\x03\n\x05\x45ntry\x12>\n\x02id\x18\x01 \x01(\tB2\xea?/\"-ID, matches Envoy request id if feedback data\x12\x17\n\x08\x63onsumer\x18\x02 \x01(\tB\x05\xea?\x02\x08\x01\x12\x1b\n\x0c\x64\x61taset_name\x18\x03 \x01(\tB\x05\xea?\x02\x08\x01\x12\x1b\n\x0c\x64\x61taset_type\x18\x0c \x01(\tB\x05\xea?\x02\x08\x01\x12/\n\ndataset_id\x18\x0b \x01(\tB\x1b\xea?\x18\x08\x01\"\x14unique ID of dataset\x12T\n\x04tags\x18\x04 \x03(\tBF\xea?C\"ATags defined by consumer, enriched by service if valetkey is used\x12\x1d\n\x04\x64\x61ta\x18\x05 \x01(\x0b\x32\x0f.asgt.type.Data\x12-\n\rtarget_values\x18\x06 \x03(\x0b\x32\x16.asgt.type.TargetValue\x12\x1f\n\x05model\x18\t \x01(\x0b\x32\x10.asgt.type.Model\x12\x30\n\nprediction\x18\n \x03(\x0b\x32\x1c.asgt.type.Prediction.Target\x12$\n\ntime_added\x18\x08 \x01(\x04\x42\x10\xea?\r\x08\x01\x12\tTIMESTAMP:\x10\xea?\r\n\x0bsample_dataB7Z5github.com/e-conomic/vmlapis/gen/go/asgt/data/v1;datab\x06proto3'
  ,
  dependencies=[asgt_dot_type_dot_data__pb2.DESCRIPTOR,asgt_dot_type_dot_model__pb2.DESCRIPTOR,asgt_dot_type_dot_prediction__pb2.DESCRIPTOR,asgt_dot_type_dot_target__value__pb2.DESCRIPTOR,gen__bq__schema_dot_bq__field__pb2.DESCRIPTOR,gen__bq__schema_dot_bq__table__pb2.DESCRIPTOR,])




_ENTRY = _descriptor.Descriptor(
  name='Entry',
  full_name='asgt.dataservice.v1.Entry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='asgt.dataservice.v1.Entry.id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\352?/\"-ID, matches Envoy request id if feedback data', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='consumer', full_name='asgt.dataservice.v1.Entry.consumer', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\352?\002\010\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='dataset_name', full_name='asgt.dataservice.v1.Entry.dataset_name', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\352?\002\010\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='dataset_type', full_name='asgt.dataservice.v1.Entry.dataset_type', index=3,
      number=12, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\352?\002\010\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='dataset_id', full_name='asgt.dataservice.v1.Entry.dataset_id', index=4,
      number=11, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\352?\030\010\001\"\024unique ID of dataset', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='tags', full_name='asgt.dataservice.v1.Entry.tags', index=5,
      number=4, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\352?C\"ATags defined by consumer, enriched by service if valetkey is used', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='data', full_name='asgt.dataservice.v1.Entry.data', index=6,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='target_values', full_name='asgt.dataservice.v1.Entry.target_values', index=7,
      number=6, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='model', full_name='asgt.dataservice.v1.Entry.model', index=8,
      number=9, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='prediction', full_name='asgt.dataservice.v1.Entry.prediction', index=9,
      number=10, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='time_added', full_name='asgt.dataservice.v1.Entry.time_added', index=10,
      number=8, type=4, cpp_type=4, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\352?\r\010\001\022\tTIMESTAMP', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\352?\r\n\013sample_data',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=218,
  serialized_end=724,
)

_ENTRY.fields_by_name['data'].message_type = asgt_dot_type_dot_data__pb2._DATA
_ENTRY.fields_by_name['target_values'].message_type = asgt_dot_type_dot_target__value__pb2._TARGETVALUE
_ENTRY.fields_by_name['model'].message_type = asgt_dot_type_dot_model__pb2._MODEL
_ENTRY.fields_by_name['prediction'].message_type = asgt_dot_type_dot_prediction__pb2._PREDICTION_TARGET
DESCRIPTOR.message_types_by_name['Entry'] = _ENTRY
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Entry = _reflection.GeneratedProtocolMessageType('Entry', (_message.Message,), {
  'DESCRIPTOR' : _ENTRY,
  '__module__' : 'asgt.data.v1.bq_entries_pb2'
  # @@protoc_insertion_point(class_scope:asgt.dataservice.v1.Entry)
  })
_sym_db.RegisterMessage(Entry)


DESCRIPTOR._options = None
_ENTRY.fields_by_name['id']._options = None
_ENTRY.fields_by_name['consumer']._options = None
_ENTRY.fields_by_name['dataset_name']._options = None
_ENTRY.fields_by_name['dataset_type']._options = None
_ENTRY.fields_by_name['dataset_id']._options = None
_ENTRY.fields_by_name['tags']._options = None
_ENTRY.fields_by_name['time_added']._options = None
_ENTRY._options = None
# @@protoc_insertion_point(module_scope)
