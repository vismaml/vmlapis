# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: ssn/type/candidate.proto

import sys
_b=sys.version_info[0]<3 and (lambda x:x) or (lambda x:x.encode('latin1'))
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2
from vml_proto.ssn.type import geometry_pb2 as ssn_dot_type_dot_geometry__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='ssn/type/candidate.proto',
  package='ssn.type',
  syntax='proto3',
  serialized_options=_b('Z\004type'),
  serialized_pb=_b('\n\x18ssn/type/candidate.proto\x12\x08ssn.type\x1a\x1egoogle/protobuf/wrappers.proto\x1a\x17ssn/type/geometry.proto\"\xb2\x01\n\nConfidence\x12)\n\x05level\x18\x01 \x01(\x0e\x32\x1a.ssn.type.Confidence.Level\x12*\n\x05value\x18\x02 \x01(\x0b\x32\x1b.google.protobuf.FloatValue\"M\n\x05Level\x12\x0b\n\x07UNKNOWN\x10\x00\x12\x0c\n\x08VERY_LOW\x10\x01\x12\x07\n\x03LOW\x10\x02\x12\x07\n\x03MID\x10\x03\x12\x08\n\x04HIGH\x10\x04\x12\r\n\tVERY_HIGH\x10\x05\"\xe8\x01\n\tCandidate\x12\r\n\x05value\x18\x01 \x01(\t\x12\x0c\n\x04text\x18\x02 \x01(\t\x12(\n\nconfidence\x18\x03 \x01(\x0b\x32\x14.ssn.type.Confidence\x12,\n\x0c\x62ounding_box\x18\x04 \x01(\x0b\x32\x16.ssn.type.BoundingPoly\x12&\n\x04type\x18\x05 \x01(\x0e\x32\x18.ssn.type.Candidate.Type\x12\x10\n\x08page_ref\x18\x06 \x01(\r\",\n\x04Type\x12\x0b\n\x07UNKNOWN\x10\x00\x12\t\n\x05\x46IELD\x10\x01\x12\x0c\n\x08\x44OCUMENT\x10\x02\x42\x06Z\x04typeb\x06proto3')
  ,
  dependencies=[google_dot_protobuf_dot_wrappers__pb2.DESCRIPTOR,ssn_dot_type_dot_geometry__pb2.DESCRIPTOR,])



_CONFIDENCE_LEVEL = _descriptor.EnumDescriptor(
  name='Level',
  full_name='ssn.type.Confidence.Level',
  filename=None,
  file=DESCRIPTOR,
  values=[
    _descriptor.EnumValueDescriptor(
      name='UNKNOWN', index=0, number=0,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='VERY_LOW', index=1, number=1,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='LOW', index=2, number=2,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='MID', index=3, number=3,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='HIGH', index=4, number=4,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='VERY_HIGH', index=5, number=5,
      serialized_options=None,
      type=None),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=197,
  serialized_end=274,
)
_sym_db.RegisterEnumDescriptor(_CONFIDENCE_LEVEL)

_CANDIDATE_TYPE = _descriptor.EnumDescriptor(
  name='Type',
  full_name='ssn.type.Candidate.Type',
  filename=None,
  file=DESCRIPTOR,
  values=[
    _descriptor.EnumValueDescriptor(
      name='UNKNOWN', index=0, number=0,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='FIELD', index=1, number=1,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='DOCUMENT', index=2, number=2,
      serialized_options=None,
      type=None),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=465,
  serialized_end=509,
)
_sym_db.RegisterEnumDescriptor(_CANDIDATE_TYPE)


_CONFIDENCE = _descriptor.Descriptor(
  name='Confidence',
  full_name='ssn.type.Confidence',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='level', full_name='ssn.type.Confidence.level', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='value', full_name='ssn.type.Confidence.value', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
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
  serialized_end=274,
)


_CANDIDATE = _descriptor.Descriptor(
  name='Candidate',
  full_name='ssn.type.Candidate',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='value', full_name='ssn.type.Candidate.value', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='text', full_name='ssn.type.Candidate.text', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='confidence', full_name='ssn.type.Candidate.confidence', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='bounding_box', full_name='ssn.type.Candidate.bounding_box', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='type', full_name='ssn.type.Candidate.type', index=4,
      number=5, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='page_ref', full_name='ssn.type.Candidate.page_ref', index=5,
      number=6, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
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
  serialized_start=277,
  serialized_end=509,
)

_CONFIDENCE.fields_by_name['level'].enum_type = _CONFIDENCE_LEVEL
_CONFIDENCE.fields_by_name['value'].message_type = google_dot_protobuf_dot_wrappers__pb2._FLOATVALUE
_CONFIDENCE_LEVEL.containing_type = _CONFIDENCE
_CANDIDATE.fields_by_name['confidence'].message_type = _CONFIDENCE
_CANDIDATE.fields_by_name['bounding_box'].message_type = ssn_dot_type_dot_geometry__pb2._BOUNDINGPOLY
_CANDIDATE.fields_by_name['type'].enum_type = _CANDIDATE_TYPE
_CANDIDATE_TYPE.containing_type = _CANDIDATE
DESCRIPTOR.message_types_by_name['Confidence'] = _CONFIDENCE
DESCRIPTOR.message_types_by_name['Candidate'] = _CANDIDATE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Confidence = _reflection.GeneratedProtocolMessageType('Confidence', (_message.Message,), dict(
  DESCRIPTOR = _CONFIDENCE,
  __module__ = 'ssn.type.candidate_pb2'
  # @@protoc_insertion_point(class_scope:ssn.type.Confidence)
  ))
_sym_db.RegisterMessage(Confidence)

Candidate = _reflection.GeneratedProtocolMessageType('Candidate', (_message.Message,), dict(
  DESCRIPTOR = _CANDIDATE,
  __module__ = 'ssn.type.candidate_pb2'
  # @@protoc_insertion_point(class_scope:ssn.type.Candidate)
  ))
_sym_db.RegisterMessage(Candidate)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
