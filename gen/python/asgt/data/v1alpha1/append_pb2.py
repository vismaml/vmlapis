# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: asgt/data/v1alpha1/append.proto

import sys
_b=sys.version_info[0]<3 and (lambda x:x) or (lambda x:x.encode('latin1'))
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from vml_proto.asgt.type import sample_pb2 as asgt_dot_type_dot_sample__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='asgt/data/v1alpha1/append.proto',
  package='asgt.dataservice.v1alpha1',
  syntax='proto3',
  serialized_options=_b('Z\004data'),
  serialized_pb=_b('\n\x1f\x61sgt/data/v1alpha1/append.proto\x12\x19\x61sgt.dataservice.v1alpha1\x1a\x16\x61sgt/type/sample.proto\"S\n\x11\x41ppendDataRequest\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x0c\n\x04type\x18\x02 \x01(\t\x12\"\n\x07samples\x18\x03 \x03(\x0b\x32\x11.asgt.type.SampleB\x06Z\x04\x64\x61tab\x06proto3')
  ,
  dependencies=[asgt_dot_type_dot_sample__pb2.DESCRIPTOR,])




_APPENDDATAREQUEST = _descriptor.Descriptor(
  name='AppendDataRequest',
  full_name='asgt.dataservice.v1alpha1.AppendDataRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='asgt.dataservice.v1alpha1.AppendDataRequest.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='type', full_name='asgt.dataservice.v1alpha1.AppendDataRequest.type', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='samples', full_name='asgt.dataservice.v1alpha1.AppendDataRequest.samples', index=2,
      number=3, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
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
  serialized_start=86,
  serialized_end=169,
)

_APPENDDATAREQUEST.fields_by_name['samples'].message_type = asgt_dot_type_dot_sample__pb2._SAMPLE
DESCRIPTOR.message_types_by_name['AppendDataRequest'] = _APPENDDATAREQUEST
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

AppendDataRequest = _reflection.GeneratedProtocolMessageType('AppendDataRequest', (_message.Message,), dict(
  DESCRIPTOR = _APPENDDATAREQUEST,
  __module__ = 'asgt.data.v1alpha1.append_pb2'
  # @@protoc_insertion_point(class_scope:asgt.dataservice.v1alpha1.AppendDataRequest)
  ))
_sym_db.RegisterMessage(AppendDataRequest)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
