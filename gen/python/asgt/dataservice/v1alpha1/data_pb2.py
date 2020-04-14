# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: asgt/dataservice/v1alpha1/data.proto

import sys
_b=sys.version_info[0]<3 and (lambda x:x) or (lambda x:x.encode('latin1'))
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='asgt/dataservice/v1alpha1/data.proto',
  package='asgt.dataservice.v1alpha1',
  syntax='proto3',
  serialized_options=_b('Z\013dataservice'),
  serialized_pb=_b('\n$asgt/dataservice/v1alpha1/data.proto\x12\x19\x61sgt.dataservice.v1alpha1\x1a\x1egoogle/protobuf/wrappers.proto\"*\n\tDataTuple\x12\x0e\n\x06target\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t\"\xae\x01\n\nPrediction\x12\x0e\n\x06target\x18\x01 \x01(\t\x12\x43\n\ncandidates\x18\x02 \x03(\x0b\x32/.asgt.dataservice.v1alpha1.Prediction.Candidate\x1aK\n\tCandidate\x12\r\n\x05value\x18\x01 \x01(\t\x12/\n\nconfidence\x18\x02 \x01(\x0b\x32\x1b.google.protobuf.FloatValue\"B\n\rDeleteRequest\x12\x12\n\nmodel_type\x18\x01 \x01(\t\x12\x0f\n\x07\x64\x61taset\x18\x02 \x01(\t\x12\x0c\n\x04tags\x18\x03 \x03(\t\"\xc3\x01\n\x0f\x46\x65\x65\x64\x62\x61\x63kRequest\x12\x0f\n\x07\x64\x61taset\x18\x01 \x01(\t\x12\x0c\n\x04tags\x18\x02 \x03(\t\x12\x41\n\x07\x65ntries\x18\x03 \x03(\x0b\x32\x30.asgt.dataservice.v1alpha1.FeedbackRequest.Entry\x1aN\n\x05\x45ntry\x12\n\n\x02id\x18\x01 \x01(\t\x12\x39\n\x0btrue_values\x18\x02 \x03(\x0b\x32$.asgt.dataservice.v1alpha1.DataTuple\"F\n\x0fRetentionPolicy\x12\x12\n\x08max_days\x18\x01 \x01(\x03H\x00\x12\x15\n\x0bmax_records\x18\x02 \x01(\x03H\x00\x42\x08\n\x06policyB\rZ\x0b\x64\x61taserviceb\x06proto3')
  ,
  dependencies=[google_dot_protobuf_dot_wrappers__pb2.DESCRIPTOR,])




_DATATUPLE = _descriptor.Descriptor(
  name='DataTuple',
  full_name='asgt.dataservice.v1alpha1.DataTuple',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='target', full_name='asgt.dataservice.v1alpha1.DataTuple.target', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='value', full_name='asgt.dataservice.v1alpha1.DataTuple.value', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
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
  serialized_start=99,
  serialized_end=141,
)


_PREDICTION_CANDIDATE = _descriptor.Descriptor(
  name='Candidate',
  full_name='asgt.dataservice.v1alpha1.Prediction.Candidate',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='value', full_name='asgt.dataservice.v1alpha1.Prediction.Candidate.value', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='confidence', full_name='asgt.dataservice.v1alpha1.Prediction.Candidate.confidence', index=1,
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
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=243,
  serialized_end=318,
)

_PREDICTION = _descriptor.Descriptor(
  name='Prediction',
  full_name='asgt.dataservice.v1alpha1.Prediction',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='target', full_name='asgt.dataservice.v1alpha1.Prediction.target', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='candidates', full_name='asgt.dataservice.v1alpha1.Prediction.candidates', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[_PREDICTION_CANDIDATE, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=144,
  serialized_end=318,
)


_DELETEREQUEST = _descriptor.Descriptor(
  name='DeleteRequest',
  full_name='asgt.dataservice.v1alpha1.DeleteRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='model_type', full_name='asgt.dataservice.v1alpha1.DeleteRequest.model_type', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='dataset', full_name='asgt.dataservice.v1alpha1.DeleteRequest.dataset', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='tags', full_name='asgt.dataservice.v1alpha1.DeleteRequest.tags', index=2,
      number=3, type=9, cpp_type=9, label=3,
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
  serialized_start=320,
  serialized_end=386,
)


_FEEDBACKREQUEST_ENTRY = _descriptor.Descriptor(
  name='Entry',
  full_name='asgt.dataservice.v1alpha1.FeedbackRequest.Entry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='asgt.dataservice.v1alpha1.FeedbackRequest.Entry.id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='true_values', full_name='asgt.dataservice.v1alpha1.FeedbackRequest.Entry.true_values', index=1,
      number=2, type=11, cpp_type=10, label=3,
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
  serialized_start=506,
  serialized_end=584,
)

_FEEDBACKREQUEST = _descriptor.Descriptor(
  name='FeedbackRequest',
  full_name='asgt.dataservice.v1alpha1.FeedbackRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='dataset', full_name='asgt.dataservice.v1alpha1.FeedbackRequest.dataset', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='tags', full_name='asgt.dataservice.v1alpha1.FeedbackRequest.tags', index=1,
      number=2, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='entries', full_name='asgt.dataservice.v1alpha1.FeedbackRequest.entries', index=2,
      number=3, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[_FEEDBACKREQUEST_ENTRY, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=389,
  serialized_end=584,
)


_RETENTIONPOLICY = _descriptor.Descriptor(
  name='RetentionPolicy',
  full_name='asgt.dataservice.v1alpha1.RetentionPolicy',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='max_days', full_name='asgt.dataservice.v1alpha1.RetentionPolicy.max_days', index=0,
      number=1, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='max_records', full_name='asgt.dataservice.v1alpha1.RetentionPolicy.max_records', index=1,
      number=2, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
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
    _descriptor.OneofDescriptor(
      name='policy', full_name='asgt.dataservice.v1alpha1.RetentionPolicy.policy',
      index=0, containing_type=None, fields=[]),
  ],
  serialized_start=586,
  serialized_end=656,
)

_PREDICTION_CANDIDATE.fields_by_name['confidence'].message_type = google_dot_protobuf_dot_wrappers__pb2._FLOATVALUE
_PREDICTION_CANDIDATE.containing_type = _PREDICTION
_PREDICTION.fields_by_name['candidates'].message_type = _PREDICTION_CANDIDATE
_FEEDBACKREQUEST_ENTRY.fields_by_name['true_values'].message_type = _DATATUPLE
_FEEDBACKREQUEST_ENTRY.containing_type = _FEEDBACKREQUEST
_FEEDBACKREQUEST.fields_by_name['entries'].message_type = _FEEDBACKREQUEST_ENTRY
_RETENTIONPOLICY.oneofs_by_name['policy'].fields.append(
  _RETENTIONPOLICY.fields_by_name['max_days'])
_RETENTIONPOLICY.fields_by_name['max_days'].containing_oneof = _RETENTIONPOLICY.oneofs_by_name['policy']
_RETENTIONPOLICY.oneofs_by_name['policy'].fields.append(
  _RETENTIONPOLICY.fields_by_name['max_records'])
_RETENTIONPOLICY.fields_by_name['max_records'].containing_oneof = _RETENTIONPOLICY.oneofs_by_name['policy']
DESCRIPTOR.message_types_by_name['DataTuple'] = _DATATUPLE
DESCRIPTOR.message_types_by_name['Prediction'] = _PREDICTION
DESCRIPTOR.message_types_by_name['DeleteRequest'] = _DELETEREQUEST
DESCRIPTOR.message_types_by_name['FeedbackRequest'] = _FEEDBACKREQUEST
DESCRIPTOR.message_types_by_name['RetentionPolicy'] = _RETENTIONPOLICY
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

DataTuple = _reflection.GeneratedProtocolMessageType('DataTuple', (_message.Message,), dict(
  DESCRIPTOR = _DATATUPLE,
  __module__ = 'asgt.dataservice.v1alpha1.data_pb2'
  # @@protoc_insertion_point(class_scope:asgt.dataservice.v1alpha1.DataTuple)
  ))
_sym_db.RegisterMessage(DataTuple)

Prediction = _reflection.GeneratedProtocolMessageType('Prediction', (_message.Message,), dict(

  Candidate = _reflection.GeneratedProtocolMessageType('Candidate', (_message.Message,), dict(
    DESCRIPTOR = _PREDICTION_CANDIDATE,
    __module__ = 'asgt.dataservice.v1alpha1.data_pb2'
    # @@protoc_insertion_point(class_scope:asgt.dataservice.v1alpha1.Prediction.Candidate)
    ))
  ,
  DESCRIPTOR = _PREDICTION,
  __module__ = 'asgt.dataservice.v1alpha1.data_pb2'
  # @@protoc_insertion_point(class_scope:asgt.dataservice.v1alpha1.Prediction)
  ))
_sym_db.RegisterMessage(Prediction)
_sym_db.RegisterMessage(Prediction.Candidate)

DeleteRequest = _reflection.GeneratedProtocolMessageType('DeleteRequest', (_message.Message,), dict(
  DESCRIPTOR = _DELETEREQUEST,
  __module__ = 'asgt.dataservice.v1alpha1.data_pb2'
  # @@protoc_insertion_point(class_scope:asgt.dataservice.v1alpha1.DeleteRequest)
  ))
_sym_db.RegisterMessage(DeleteRequest)

FeedbackRequest = _reflection.GeneratedProtocolMessageType('FeedbackRequest', (_message.Message,), dict(

  Entry = _reflection.GeneratedProtocolMessageType('Entry', (_message.Message,), dict(
    DESCRIPTOR = _FEEDBACKREQUEST_ENTRY,
    __module__ = 'asgt.dataservice.v1alpha1.data_pb2'
    # @@protoc_insertion_point(class_scope:asgt.dataservice.v1alpha1.FeedbackRequest.Entry)
    ))
  ,
  DESCRIPTOR = _FEEDBACKREQUEST,
  __module__ = 'asgt.dataservice.v1alpha1.data_pb2'
  # @@protoc_insertion_point(class_scope:asgt.dataservice.v1alpha1.FeedbackRequest)
  ))
_sym_db.RegisterMessage(FeedbackRequest)
_sym_db.RegisterMessage(FeedbackRequest.Entry)

RetentionPolicy = _reflection.GeneratedProtocolMessageType('RetentionPolicy', (_message.Message,), dict(
  DESCRIPTOR = _RETENTIONPOLICY,
  __module__ = 'asgt.dataservice.v1alpha1.data_pb2'
  # @@protoc_insertion_point(class_scope:asgt.dataservice.v1alpha1.RetentionPolicy)
  ))
_sym_db.RegisterMessage(RetentionPolicy)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
