# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: asgt/dataservice/v1alpha1/dataset.proto

import sys
_b=sys.version_info[0]<3 and (lambda x:x) or (lambda x:x.encode('latin1'))
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from vml_proto.asgt.dataservice.v1alpha1 import data_pb2 as asgt_dot_dataservice_dot_v1alpha1_dot_data__pb2
from gen_bq_schema import bq_field_pb2 as gen__bq__schema_dot_bq__field__pb2
from gen_bq_schema import bq_table_pb2 as gen__bq__schema_dot_bq__table__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='asgt/dataservice/v1alpha1/dataset.proto',
  package='asgt.dataservice.v1alpha1',
  syntax='proto3',
  serialized_options=_b('Z\013dataservice'),
  serialized_pb=_b('\n\'asgt/dataservice/v1alpha1/dataset.proto\x12\x19\x61sgt.dataservice.v1alpha1\x1a$asgt/dataservice/v1alpha1/data.proto\x1a\x1cgen_bq_schema/bq_field.proto\x1a\x1cgen_bq_schema/bq_table.proto\"\xa7\x02\n\x07\x44\x61taset\x12\x17\n\x08\x63onsumer\x18\x01 \x01(\tB\x05\xea?\x02\x08\x01\x12\x13\n\x04name\x18\x02 \x01(\tB\x05\xea?\x02\x08\x01\x12<\n\x04type\x18\x03 \x01(\x0e\x32\'.asgt.dataservice.v1alpha1.Dataset.TypeB\x05\xea?\x02\x08\x01\x12\x0f\n\x07targets\x18\x04 \x03(\t\x12K\n\x10retention_policy\x18\x05 \x01(\x0b\x32*.asgt.dataservice.v1alpha1.RetentionPolicyB\x05\xea?\x02\x08\x01\x12\x13\n\x04hash\x18\x06 \x01(\tB\x05\xea?\x02\x08\x01\".\n\x04Type\x12\x08\n\x04\x42\x41NK\x10\x00\x12\x13\n\x0fSCANNED_INVOICE\x10\x01\x12\x07\n\x03\x45IL\x10\x02:\r\xea?\n\n\x08\x64\x61tasetsB\rZ\x0b\x64\x61taserviceb\x06proto3')
  ,
  dependencies=[asgt_dot_dataservice_dot_v1alpha1_dot_data__pb2.DESCRIPTOR,gen__bq__schema_dot_bq__field__pb2.DESCRIPTOR,gen__bq__schema_dot_bq__table__pb2.DESCRIPTOR,])



_DATASET_TYPE = _descriptor.EnumDescriptor(
  name='Type',
  full_name='asgt.dataservice.v1alpha1.Dataset.Type',
  filename=None,
  file=DESCRIPTOR,
  values=[
    _descriptor.EnumValueDescriptor(
      name='BANK', index=0, number=0,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='SCANNED_INVOICE', index=1, number=1,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='EIL', index=2, number=2,
      serialized_options=None,
      type=None),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=403,
  serialized_end=449,
)
_sym_db.RegisterEnumDescriptor(_DATASET_TYPE)


_DATASET = _descriptor.Descriptor(
  name='Dataset',
  full_name='asgt.dataservice.v1alpha1.Dataset',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='consumer', full_name='asgt.dataservice.v1alpha1.Dataset.consumer', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=_b('\352?\002\010\001'), file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='name', full_name='asgt.dataservice.v1alpha1.Dataset.name', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=_b('\352?\002\010\001'), file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='type', full_name='asgt.dataservice.v1alpha1.Dataset.type', index=2,
      number=3, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=_b('\352?\002\010\001'), file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='targets', full_name='asgt.dataservice.v1alpha1.Dataset.targets', index=3,
      number=4, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='retention_policy', full_name='asgt.dataservice.v1alpha1.Dataset.retention_policy', index=4,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=_b('\352?\002\010\001'), file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='hash', full_name='asgt.dataservice.v1alpha1.Dataset.hash', index=5,
      number=6, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=_b('\352?\002\010\001'), file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _DATASET_TYPE,
  ],
  serialized_options=_b('\352?\n\n\010datasets'),
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=169,
  serialized_end=464,
)

_DATASET.fields_by_name['type'].enum_type = _DATASET_TYPE
_DATASET.fields_by_name['retention_policy'].message_type = asgt_dot_dataservice_dot_v1alpha1_dot_data__pb2._RETENTIONPOLICY
_DATASET_TYPE.containing_type = _DATASET
DESCRIPTOR.message_types_by_name['Dataset'] = _DATASET
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Dataset = _reflection.GeneratedProtocolMessageType('Dataset', (_message.Message,), dict(
  DESCRIPTOR = _DATASET,
  __module__ = 'asgt.dataservice.v1alpha1.dataset_pb2'
  # @@protoc_insertion_point(class_scope:asgt.dataservice.v1alpha1.Dataset)
  ))
_sym_db.RegisterMessage(Dataset)


DESCRIPTOR._options = None
_DATASET.fields_by_name['consumer']._options = None
_DATASET.fields_by_name['name']._options = None
_DATASET.fields_by_name['type']._options = None
_DATASET.fields_by_name['retention_policy']._options = None
_DATASET.fields_by_name['hash']._options = None
_DATASET._options = None
# @@protoc_insertion_point(module_scope)
