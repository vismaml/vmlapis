# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: ssn/type/candidate.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2
from ssn.type import geometry_pb2 as ssn_dot_type_dot_geometry__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='ssn/type/candidate.proto',
  package='ssn.type',
  syntax='proto3',
  serialized_options=b'Z4github.com/e-conomic/vmlapis/gen/go/ssn/type;ssntype',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\x18ssn/type/candidate.proto\x12\x08ssn.type\x1a\x1egoogle/protobuf/wrappers.proto\x1a\x17ssn/type/geometry.proto\"\xc0\x01\n\nConfidence\x12\x30\n\x05level\x18\x01 \x01(\x0e\x32\x1a.ssn.type.Confidence.LevelR\x05level\x12\x31\n\x05value\x18\x02 \x01(\x0b\x32\x1b.google.protobuf.FloatValueR\x05value\"M\n\x05Level\x12\x0b\n\x07UNKNOWN\x10\x00\x12\x0c\n\x08VERY_LOW\x10\x01\x12\x07\n\x03LOW\x10\x02\x12\x07\n\x03MID\x10\x03\x12\x08\n\x04HIGH\x10\x04\x12\r\n\tVERY_HIGH\x10\x05\"\xd9\x02\n\tCandidate\x12\x14\n\x05value\x18\x01 \x01(\tR\x05value\x12\x12\n\x04text\x18\x02 \x01(\tR\x04text\x12\x34\n\nconfidence\x18\x03 \x01(\x0b\x32\x14.ssn.type.ConfidenceR\nconfidence\x12\x39\n\x0c\x62ounding_box\x18\x04 \x01(\x0b\x32\x16.ssn.type.BoundingPolyR\x0b\x62oundingBox\x12,\n\x04type\x18\x05 \x01(\x0e\x32\x18.ssn.type.Candidate.TypeR\x04type\x12\x19\n\x08page_ref\x18\x06 \x01(\rR\x07pageRef\x12:\n\x0emodel_metadata\x18\x07 \x01(\x0b\x32\x13.ssn.type.ModelSpecR\rmodelMetadata\",\n\x04Type\x12\x0b\n\x07UNKNOWN\x10\x00\x12\t\n\x05\x46IELD\x10\x01\x12\x0c\n\x08\x44OCUMENT\x10\x02\"d\n\tModelSpec\x12\x1d\n\nmodel_name\x18\x01 \x01(\tR\tmodelName\x12\x38\n\tmodel_ver\x18\x02 \x01(\x0b\x32\x1b.google.protobuf.Int64ValueR\x08modelVer\"V\n\rLineCandidate\x12\x12\n\x04text\x18\x01 \x01(\tR\x04text\x12\x16\n\x06\x61mount\x18\x02 \x01(\x01R\x06\x61mount\x12\x19\n\x08page_ref\x18\x06 \x01(\rR\x07pageRefB6Z4github.com/e-conomic/vmlapis/gen/go/ssn/type;ssntypeb\x06proto3'
  ,
  dependencies=[google_dot_protobuf_dot_wrappers__pb2.DESCRIPTOR,ssn_dot_type_dot_geometry__pb2.DESCRIPTOR,])



_CONFIDENCE_LEVEL = _descriptor.EnumDescriptor(
  name='Level',
  full_name='ssn.type.Confidence.Level',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='UNKNOWN', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='VERY_LOW', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='LOW', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MID', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='HIGH', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='VERY_HIGH', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=211,
  serialized_end=288,
)
_sym_db.RegisterEnumDescriptor(_CONFIDENCE_LEVEL)

_CANDIDATE_TYPE = _descriptor.EnumDescriptor(
  name='Type',
  full_name='ssn.type.Candidate.Type',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='UNKNOWN', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='FIELD', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DOCUMENT', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=592,
  serialized_end=636,
)
_sym_db.RegisterEnumDescriptor(_CANDIDATE_TYPE)


_CONFIDENCE = _descriptor.Descriptor(
  name='Confidence',
  full_name='ssn.type.Confidence',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='level', full_name='ssn.type.Confidence.level', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='level', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='ssn.type.Confidence.value', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='value', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _CONFIDENCE_LEVEL,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=96,
  serialized_end=288,
)


_CANDIDATE = _descriptor.Descriptor(
  name='Candidate',
  full_name='ssn.type.Candidate',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='value', full_name='ssn.type.Candidate.value', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='value', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='text', full_name='ssn.type.Candidate.text', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='text', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='confidence', full_name='ssn.type.Candidate.confidence', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='confidence', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='bounding_box', full_name='ssn.type.Candidate.bounding_box', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='boundingBox', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='type', full_name='ssn.type.Candidate.type', index=4,
      number=5, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='type', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='page_ref', full_name='ssn.type.Candidate.page_ref', index=5,
      number=6, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='pageRef', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='model_metadata', full_name='ssn.type.Candidate.model_metadata', index=6,
      number=7, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='modelMetadata', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _CANDIDATE_TYPE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=291,
  serialized_end=636,
)


_MODELSPEC = _descriptor.Descriptor(
  name='ModelSpec',
  full_name='ssn.type.ModelSpec',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='model_name', full_name='ssn.type.ModelSpec.model_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='modelName', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='model_ver', full_name='ssn.type.ModelSpec.model_ver', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='modelVer', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=638,
  serialized_end=738,
)


_LINECANDIDATE = _descriptor.Descriptor(
  name='LineCandidate',
  full_name='ssn.type.LineCandidate',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='text', full_name='ssn.type.LineCandidate.text', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='text', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='amount', full_name='ssn.type.LineCandidate.amount', index=1,
      number=2, type=1, cpp_type=5, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='amount', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='page_ref', full_name='ssn.type.LineCandidate.page_ref', index=2,
      number=6, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='pageRef', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=740,
  serialized_end=826,
)

_CONFIDENCE.fields_by_name['level'].enum_type = _CONFIDENCE_LEVEL
_CONFIDENCE.fields_by_name['value'].message_type = google_dot_protobuf_dot_wrappers__pb2._FLOATVALUE
_CONFIDENCE_LEVEL.containing_type = _CONFIDENCE
_CANDIDATE.fields_by_name['confidence'].message_type = _CONFIDENCE
_CANDIDATE.fields_by_name['bounding_box'].message_type = ssn_dot_type_dot_geometry__pb2._BOUNDINGPOLY
_CANDIDATE.fields_by_name['type'].enum_type = _CANDIDATE_TYPE
_CANDIDATE.fields_by_name['model_metadata'].message_type = _MODELSPEC
_CANDIDATE_TYPE.containing_type = _CANDIDATE
_MODELSPEC.fields_by_name['model_ver'].message_type = google_dot_protobuf_dot_wrappers__pb2._INT64VALUE
DESCRIPTOR.message_types_by_name['Confidence'] = _CONFIDENCE
DESCRIPTOR.message_types_by_name['Candidate'] = _CANDIDATE
DESCRIPTOR.message_types_by_name['ModelSpec'] = _MODELSPEC
DESCRIPTOR.message_types_by_name['LineCandidate'] = _LINECANDIDATE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Confidence = _reflection.GeneratedProtocolMessageType('Confidence', (_message.Message,), {
  'DESCRIPTOR' : _CONFIDENCE,
  '__module__' : 'ssn.type.candidate_pb2'
  # @@protoc_insertion_point(class_scope:ssn.type.Confidence)
  })
_sym_db.RegisterMessage(Confidence)

Candidate = _reflection.GeneratedProtocolMessageType('Candidate', (_message.Message,), {
  'DESCRIPTOR' : _CANDIDATE,
  '__module__' : 'ssn.type.candidate_pb2'
  # @@protoc_insertion_point(class_scope:ssn.type.Candidate)
  })
_sym_db.RegisterMessage(Candidate)

ModelSpec = _reflection.GeneratedProtocolMessageType('ModelSpec', (_message.Message,), {
  'DESCRIPTOR' : _MODELSPEC,
  '__module__' : 'ssn.type.candidate_pb2'
  # @@protoc_insertion_point(class_scope:ssn.type.ModelSpec)
  })
_sym_db.RegisterMessage(ModelSpec)

LineCandidate = _reflection.GeneratedProtocolMessageType('LineCandidate', (_message.Message,), {
  'DESCRIPTOR' : _LINECANDIDATE,
  '__module__' : 'ssn.type.candidate_pb2'
  # @@protoc_insertion_point(class_scope:ssn.type.LineCandidate)
  })
_sym_db.RegisterMessage(LineCandidate)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
