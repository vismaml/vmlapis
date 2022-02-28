# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: asgt/jester/v1/jester.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from vml_proto.asgt.type import data_pb2 as asgt_dot_type_dot_data__pb2
from vml_proto.asgt.type import model_pb2 as asgt_dot_type_dot_model__pb2
from vml_proto.asgt.type import prediction_pb2 as asgt_dot_type_dot_prediction__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from options import annotations_pb2 as options_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='asgt/jester/v1/jester.proto',
  package='asgt.jester.v1',
  syntax='proto3',
  serialized_options=b'Z9github.com/e-conomic/vmlapis/gen/go/asgt/jester/v1;jester\222A:\022\021\n\013AutoSuggest2\002v1*\001\0022\020application/json:\020application/json',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\x1b\x61sgt/jester/v1/jester.proto\x12\x0e\x61sgt.jester.v1\x1a\x14\x61sgt/type/data.proto\x1a\x15\x61sgt/type/model.proto\x1a\x1a\x61sgt/type/prediction.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x19options/annotations.proto\"a\n\x12SuggestionResponse\x12*\n\x0bpredictions\x18\x01 \x03(\x0b\x32\x15.asgt.type.Prediction\x12\x1f\n\x05model\x18\x02 \x01(\x0b\x32\x10.asgt.type.Model\"b\n\x11SuggestionOptions\x12\x18\n\x10suggestion_limit\x18\x01 \x01(\x05\x12\x33\n\x0emin_confidence\x18\x02 \x01(\x0e\x32\x1b.asgt.type.Confidence.Level\"\x92\x01\n\x11SuggestionRequest\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x0c\n\x04type\x18\x02 \x01(\t\x12\x1f\n\x06inputs\x18\x03 \x03(\x0b\x32\x0f.asgt.type.Data\x12\x32\n\x07options\x18\x04 \x01(\x0b\x32!.asgt.jester.v1.SuggestionOptions\x12\x0c\n\x04tags\x18\x05 \x03(\t2\x80\x01\n\x06Jester\x12v\n\x07Suggest\x12!.asgt.jester.v1.SuggestionRequest\x1a\".asgt.jester.v1.SuggestionResponse\"$\x82\xd3\xe4\x93\x02\x1e\"\x19/v1/{type}/{name}:suggest:\x01*BxZ9github.com/e-conomic/vmlapis/gen/go/asgt/jester/v1;jester\x92\x41:\x12\x11\n\x0b\x41utoSuggest2\x02v1*\x01\x02\x32\x10\x61pplication/json:\x10\x61pplication/jsonb\x06proto3'
  ,
  dependencies=[asgt_dot_type_dot_data__pb2.DESCRIPTOR,asgt_dot_type_dot_model__pb2.DESCRIPTOR,asgt_dot_type_dot_prediction__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,options_dot_annotations__pb2.DESCRIPTOR,])




_SUGGESTIONRESPONSE = _descriptor.Descriptor(
  name='SuggestionResponse',
  full_name='asgt.jester.v1.SuggestionResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='predictions', full_name='asgt.jester.v1.SuggestionResponse.predictions', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='model', full_name='asgt.jester.v1.SuggestionResponse.model', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
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
  serialized_start=177,
  serialized_end=274,
)


_SUGGESTIONOPTIONS = _descriptor.Descriptor(
  name='SuggestionOptions',
  full_name='asgt.jester.v1.SuggestionOptions',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='suggestion_limit', full_name='asgt.jester.v1.SuggestionOptions.suggestion_limit', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='min_confidence', full_name='asgt.jester.v1.SuggestionOptions.min_confidence', index=1,
      number=2, type=14, cpp_type=8, label=1,
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
  serialized_start=276,
  serialized_end=374,
)


_SUGGESTIONREQUEST = _descriptor.Descriptor(
  name='SuggestionRequest',
  full_name='asgt.jester.v1.SuggestionRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='asgt.jester.v1.SuggestionRequest.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='type', full_name='asgt.jester.v1.SuggestionRequest.type', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='inputs', full_name='asgt.jester.v1.SuggestionRequest.inputs', index=2,
      number=3, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='options', full_name='asgt.jester.v1.SuggestionRequest.options', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='tags', full_name='asgt.jester.v1.SuggestionRequest.tags', index=4,
      number=5, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
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
  serialized_start=377,
  serialized_end=523,
)

_SUGGESTIONRESPONSE.fields_by_name['predictions'].message_type = asgt_dot_type_dot_prediction__pb2._PREDICTION
_SUGGESTIONRESPONSE.fields_by_name['model'].message_type = asgt_dot_type_dot_model__pb2._MODEL
_SUGGESTIONOPTIONS.fields_by_name['min_confidence'].enum_type = asgt_dot_type_dot_prediction__pb2._CONFIDENCE_LEVEL
_SUGGESTIONREQUEST.fields_by_name['inputs'].message_type = asgt_dot_type_dot_data__pb2._DATA
_SUGGESTIONREQUEST.fields_by_name['options'].message_type = _SUGGESTIONOPTIONS
DESCRIPTOR.message_types_by_name['SuggestionResponse'] = _SUGGESTIONRESPONSE
DESCRIPTOR.message_types_by_name['SuggestionOptions'] = _SUGGESTIONOPTIONS
DESCRIPTOR.message_types_by_name['SuggestionRequest'] = _SUGGESTIONREQUEST
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

SuggestionResponse = _reflection.GeneratedProtocolMessageType('SuggestionResponse', (_message.Message,), {
  'DESCRIPTOR' : _SUGGESTIONRESPONSE,
  '__module__' : 'asgt.jester.v1.jester_pb2'
  # @@protoc_insertion_point(class_scope:asgt.jester.v1.SuggestionResponse)
  })
_sym_db.RegisterMessage(SuggestionResponse)

SuggestionOptions = _reflection.GeneratedProtocolMessageType('SuggestionOptions', (_message.Message,), {
  'DESCRIPTOR' : _SUGGESTIONOPTIONS,
  '__module__' : 'asgt.jester.v1.jester_pb2'
  # @@protoc_insertion_point(class_scope:asgt.jester.v1.SuggestionOptions)
  })
_sym_db.RegisterMessage(SuggestionOptions)

SuggestionRequest = _reflection.GeneratedProtocolMessageType('SuggestionRequest', (_message.Message,), {
  'DESCRIPTOR' : _SUGGESTIONREQUEST,
  '__module__' : 'asgt.jester.v1.jester_pb2'
  # @@protoc_insertion_point(class_scope:asgt.jester.v1.SuggestionRequest)
  })
_sym_db.RegisterMessage(SuggestionRequest)


DESCRIPTOR._options = None

_JESTER = _descriptor.ServiceDescriptor(
  name='Jester',
  full_name='asgt.jester.v1.Jester',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  create_key=_descriptor._internal_create_key,
  serialized_start=526,
  serialized_end=654,
  methods=[
  _descriptor.MethodDescriptor(
    name='Suggest',
    full_name='asgt.jester.v1.Jester.Suggest',
    index=0,
    containing_service=None,
    input_type=_SUGGESTIONREQUEST,
    output_type=_SUGGESTIONRESPONSE,
    serialized_options=b'\202\323\344\223\002\036\"\031/v1/{type}/{name}:suggest:\001*',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_JESTER)

DESCRIPTOR.services_by_name['Jester'] = _JESTER

# @@protoc_insertion_point(module_scope)
