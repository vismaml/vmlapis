# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: asgt/v2/type/target_value.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='asgt/v2/type/target_value.proto',
  package='asgt.v2.type',
  syntax='proto3',
  serialized_options=b'Z9github.com/e-conomic/vmlapis/gen/go/asgt/v2/type;asgttype',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\x1f\x61sgt/v2/type/target_value.proto\x12\x0c\x61sgt.v2.type\x1a\x17validate/validate.proto\"a\n\x0bTargetValue\x12<\n\x04name\x18\x01 \x01(\tB(\xfa\x42%r#(\x80\x02\x32\x1e^[A-Za-z0-9.][A-Za-z0-9_.>-]*$R\x04name\x12\x14\n\x05value\x18\x02 \x01(\tR\x05valueB;Z9github.com/e-conomic/vmlapis/gen/go/asgt/v2/type;asgttypeb\x06proto3'
  ,
  dependencies=[validate_dot_validate__pb2.DESCRIPTOR,])




_TARGETVALUE = _descriptor.Descriptor(
  name='TargetValue',
  full_name='asgt.v2.type.TargetValue',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='asgt.v2.type.TargetValue.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B%r#(\200\0022\036^[A-Za-z0-9.][A-Za-z0-9_.>-]*$', json_name='name', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='asgt.v2.type.TargetValue.value', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='value', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=74,
  serialized_end=171,
)

DESCRIPTOR.message_types_by_name['TargetValue'] = _TARGETVALUE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

TargetValue = _reflection.GeneratedProtocolMessageType('TargetValue', (_message.Message,), {
  'DESCRIPTOR' : _TARGETVALUE,
  '__module__' : 'asgt.v2.type.target_value_pb2'
  # @@protoc_insertion_point(class_scope:asgt.v2.type.TargetValue)
  })
_sym_db.RegisterMessage(TargetValue)


DESCRIPTOR._options = None
_TARGETVALUE.fields_by_name['name']._options = None
# @@protoc_insertion_point(module_scope)
