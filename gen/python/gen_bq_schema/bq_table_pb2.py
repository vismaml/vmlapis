# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gen_bq_schema/bq_table.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import descriptor_pb2 as google_dot_protobuf_dot_descriptor__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='gen_bq_schema/bq_table.proto',
  package='gen_bq_schema',
  syntax='proto3',
  serialized_options=b'Z?github.com/e-conomic/vmlapis/gen/go/gen_bq_schema;gen_bq_schema',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\x1cgen_bq_schema/bq_table.proto\x12\rgen_bq_schema\x1a google/protobuf/descriptor.proto\"D\n\x16\x42igQueryMessageOptions\x12\x12\n\ntable_name\x18\x01 \x01(\t\x12\x16\n\x0euse_json_names\x18\x02 \x01(\x08:^\n\rbigquery_opts\x12\x1f.google.protobuf.MessageOptions\x18\xfd\x07 \x01(\x0b\x32%.gen_bq_schema.BigQueryMessageOptionsBAZ?github.com/e-conomic/vmlapis/gen/go/gen_bq_schema;gen_bq_schemab\x06proto3'
  ,
  dependencies=[google_dot_protobuf_dot_descriptor__pb2.DESCRIPTOR,])


BIGQUERY_OPTS_FIELD_NUMBER = 1021
bigquery_opts = _descriptor.FieldDescriptor(
  name='bigquery_opts', full_name='gen_bq_schema.bigquery_opts', index=0,
  number=1021, type=11, cpp_type=10, label=1,
  has_default_value=False, default_value=None,
  message_type=None, enum_type=None, containing_type=None,
  is_extension=True, extension_scope=None,
  serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key)


_BIGQUERYMESSAGEOPTIONS = _descriptor.Descriptor(
  name='BigQueryMessageOptions',
  full_name='gen_bq_schema.BigQueryMessageOptions',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='table_name', full_name='gen_bq_schema.BigQueryMessageOptions.table_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='use_json_names', full_name='gen_bq_schema.BigQueryMessageOptions.use_json_names', index=1,
      number=2, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
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
  serialized_start=81,
  serialized_end=149,
)

DESCRIPTOR.message_types_by_name['BigQueryMessageOptions'] = _BIGQUERYMESSAGEOPTIONS
DESCRIPTOR.extensions_by_name['bigquery_opts'] = bigquery_opts
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

BigQueryMessageOptions = _reflection.GeneratedProtocolMessageType('BigQueryMessageOptions', (_message.Message,), {
  'DESCRIPTOR' : _BIGQUERYMESSAGEOPTIONS,
  '__module__' : 'gen_bq_schema.bq_table_pb2'
  # @@protoc_insertion_point(class_scope:gen_bq_schema.BigQueryMessageOptions)
  })
_sym_db.RegisterMessage(BigQueryMessageOptions)

bigquery_opts.message_type = _BIGQUERYMESSAGEOPTIONS
google_dot_protobuf_dot_descriptor__pb2.MessageOptions.RegisterExtension(bigquery_opts)

DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
