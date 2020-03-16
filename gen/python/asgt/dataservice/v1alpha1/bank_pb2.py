# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: asgt/dataservice/v1alpha1/bank.proto

import sys
_b=sys.version_info[0]<3 and (lambda x:x) or (lambda x:x.encode('latin1'))
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from asgt.dataservice.v1alpha1 import data_pb2 as asgt_dot_dataservice_dot_v1alpha1_dot_data__pb2
from asgt.jester.v1alpha1 import jester_pb2 as asgt_dot_jester_dot_v1alpha1_dot_jester__pb2
from asgt.type import prediction_pb2 as asgt_dot_type_dot_prediction__pb2
from gen_bq_schema import bq_field_pb2 as gen__bq__schema_dot_bq__field__pb2
from gen_bq_schema import bq_table_pb2 as gen__bq__schema_dot_bq__table__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='asgt/dataservice/v1alpha1/bank.proto',
  package='asgt.dataservice.v1alpha1',
  syntax='proto3',
  serialized_options=_b('Z\013dataservice'),
  serialized_pb=_b('\n$asgt/dataservice/v1alpha1/bank.proto\x12\x19\x61sgt.dataservice.v1alpha1\x1a$asgt/dataservice/v1alpha1/data.proto\x1a!asgt/jester/v1alpha1/jester.proto\x1a\x1a\x61sgt/type/prediction.proto\x1a\x1cgen_bq_schema/bq_field.proto\x1a\x1cgen_bq_schema/bq_table.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x1bgoogle/protobuf/empty.proto\"\xba\x03\n\tBankEntry\x12>\n\x02id\x18\x01 \x01(\tB2\xea?/\"-ID, matches Envoy request id if feedback data\x12\x17\n\x08\x63onsumer\x18\x02 \x01(\tB\x05\xea?\x02\x08\x01\x12\x16\n\x07\x64\x61taset\x18\x03 \x01(\tB\x05\xea?\x02\x08\x01\x12T\n\x04tags\x18\x04 \x03(\tBF\xea?C\"ATags defined by consumer, enriched by service if valetkey is used\x12\x35\n\x05input\x18\x05 \x01(\x0b\x32&.asgt.jester.v1alpha1.BankRequest.Data\x12\x39\n\x0btrue_values\x18\x06 \x03(\x0b\x32$.asgt.dataservice.v1alpha1.DataTuple\x12>\n\x0bpred_values\x18\x07 \x03(\x0b\x32).asgt.dataservice.v1alpha1.PredictedTuple\x12$\n\ntime_added\x18\x08 \x01(\x04\x42\x10\xea?\r\x08\x01\x12\tTIMESTAMP:\x0e\xea?\x0b\n\tbank_data\"\xf1\x01\n\x12PrepareBankRequest\x12\x0f\n\x07\x64\x61taset\x18\x01 \x01(\t\x12\x0c\n\x04tags\x18\x02 \x03(\t\x12\x44\n\x07\x65ntries\x18\x03 \x03(\x0b\x32\x33.asgt.dataservice.v1alpha1.PrepareBankRequest.Entry\x1av\n\x05\x45ntry\x12\n\n\x02id\x18\x01 \x01(\t\x12\x35\n\x05input\x18\x02 \x01(\x0b\x32&.asgt.jester.v1alpha1.BankRequest.Data\x12*\n\x0bpredictions\x18\x03 \x03(\x0b\x32\x15.asgt.type.Prediction\"\xba\x02\n\x12\x41\x64\x64\x42\x61nkDataRequest\x12\x0f\n\x07\x64\x61taset\x18\x01 \x01(\t\x12\x0c\n\x04tags\x18\x02 \x03(\t\x12\x44\n\x07\x65ntries\x18\x03 \x03(\x0b\x32\x33.asgt.dataservice.v1alpha1.AddBankDataRequest.Entry\x12\x44\n\x10retention_policy\x18\x04 \x01(\x0b\x32*.asgt.dataservice.v1alpha1.RetentionPolicy\x1ay\n\x05\x45ntry\x12\x35\n\x05input\x18\x01 \x01(\x0b\x32&.asgt.jester.v1alpha1.BankRequest.Data\x12\x39\n\x0btrue_values\x18\x02 \x03(\x0b\x32$.asgt.dataservice.v1alpha1.DataTuple2\xd3\x03\n\x0f\x42\x61nkDataservice\x12\\\n\x13PrepareBankFeedback\x12-.asgt.dataservice.v1alpha1.PrepareBankRequest\x1a\x16.google.protobuf.Empty\x12v\n\x0c\x42\x61nkFeedback\x12*.asgt.dataservice.v1alpha1.FeedbackRequest\x1a\x16.google.protobuf.Empty\"\"\x82\xd3\xe4\x93\x02\x1c\"\x17/v1alpha1/bank:feedback:\x01*\x12t\n\x0b\x41\x64\x64\x42\x61nkData\x12-.asgt.dataservice.v1alpha1.AddBankDataRequest\x1a\x16.google.protobuf.Empty\"\x1e\x82\xd3\xe4\x93\x02\x18\"\x13/v1alpha1/bank:data:\x01*\x12t\n\x0e\x44\x65leteBankData\x12(.asgt.dataservice.v1alpha1.DeleteRequest\x1a\x16.google.protobuf.Empty\" \x82\xd3\xe4\x93\x02\x1a\"\x15/v1alpha1/bank:delete:\x01*B\rZ\x0b\x64\x61taserviceb\x06proto3')
  ,
  dependencies=[asgt_dot_dataservice_dot_v1alpha1_dot_data__pb2.DESCRIPTOR,asgt_dot_jester_dot_v1alpha1_dot_jester__pb2.DESCRIPTOR,asgt_dot_type_dot_prediction__pb2.DESCRIPTOR,gen__bq__schema_dot_bq__field__pb2.DESCRIPTOR,gen__bq__schema_dot_bq__table__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_protobuf_dot_empty__pb2.DESCRIPTOR,])




_BANKENTRY = _descriptor.Descriptor(
  name='BankEntry',
  full_name='asgt.dataservice.v1alpha1.BankEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='asgt.dataservice.v1alpha1.BankEntry.id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=_b('\352?/\"-ID, matches Envoy request id if feedback data'), file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='consumer', full_name='asgt.dataservice.v1alpha1.BankEntry.consumer', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=_b('\352?\002\010\001'), file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='dataset', full_name='asgt.dataservice.v1alpha1.BankEntry.dataset', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=_b('\352?\002\010\001'), file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='tags', full_name='asgt.dataservice.v1alpha1.BankEntry.tags', index=3,
      number=4, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=_b('\352?C\"ATags defined by consumer, enriched by service if valetkey is used'), file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='input', full_name='asgt.dataservice.v1alpha1.BankEntry.input', index=4,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='true_values', full_name='asgt.dataservice.v1alpha1.BankEntry.true_values', index=5,
      number=6, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='pred_values', full_name='asgt.dataservice.v1alpha1.BankEntry.pred_values', index=6,
      number=7, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='time_added', full_name='asgt.dataservice.v1alpha1.BankEntry.time_added', index=7,
      number=8, type=4, cpp_type=4, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=_b('\352?\r\010\001\022\tTIMESTAMP'), file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=_b('\352?\013\n\tbank_data'),
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=288,
  serialized_end=730,
)


_PREPAREBANKREQUEST_ENTRY = _descriptor.Descriptor(
  name='Entry',
  full_name='asgt.dataservice.v1alpha1.PrepareBankRequest.Entry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='asgt.dataservice.v1alpha1.PrepareBankRequest.Entry.id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='input', full_name='asgt.dataservice.v1alpha1.PrepareBankRequest.Entry.input', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='predictions', full_name='asgt.dataservice.v1alpha1.PrepareBankRequest.Entry.predictions', index=2,
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
  serialized_start=856,
  serialized_end=974,
)

_PREPAREBANKREQUEST = _descriptor.Descriptor(
  name='PrepareBankRequest',
  full_name='asgt.dataservice.v1alpha1.PrepareBankRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='dataset', full_name='asgt.dataservice.v1alpha1.PrepareBankRequest.dataset', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='tags', full_name='asgt.dataservice.v1alpha1.PrepareBankRequest.tags', index=1,
      number=2, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='entries', full_name='asgt.dataservice.v1alpha1.PrepareBankRequest.entries', index=2,
      number=3, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[_PREPAREBANKREQUEST_ENTRY, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=733,
  serialized_end=974,
)


_ADDBANKDATAREQUEST_ENTRY = _descriptor.Descriptor(
  name='Entry',
  full_name='asgt.dataservice.v1alpha1.AddBankDataRequest.Entry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='input', full_name='asgt.dataservice.v1alpha1.AddBankDataRequest.Entry.input', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='true_values', full_name='asgt.dataservice.v1alpha1.AddBankDataRequest.Entry.true_values', index=1,
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
  serialized_start=1170,
  serialized_end=1291,
)

_ADDBANKDATAREQUEST = _descriptor.Descriptor(
  name='AddBankDataRequest',
  full_name='asgt.dataservice.v1alpha1.AddBankDataRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='dataset', full_name='asgt.dataservice.v1alpha1.AddBankDataRequest.dataset', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='tags', full_name='asgt.dataservice.v1alpha1.AddBankDataRequest.tags', index=1,
      number=2, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='entries', full_name='asgt.dataservice.v1alpha1.AddBankDataRequest.entries', index=2,
      number=3, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='retention_policy', full_name='asgt.dataservice.v1alpha1.AddBankDataRequest.retention_policy', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[_ADDBANKDATAREQUEST_ENTRY, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=977,
  serialized_end=1291,
)

_BANKENTRY.fields_by_name['input'].message_type = asgt_dot_jester_dot_v1alpha1_dot_jester__pb2._BANKREQUEST_DATA
_BANKENTRY.fields_by_name['true_values'].message_type = asgt_dot_dataservice_dot_v1alpha1_dot_data__pb2._DATATUPLE
_BANKENTRY.fields_by_name['pred_values'].message_type = asgt_dot_dataservice_dot_v1alpha1_dot_data__pb2._PREDICTEDTUPLE
_PREPAREBANKREQUEST_ENTRY.fields_by_name['input'].message_type = asgt_dot_jester_dot_v1alpha1_dot_jester__pb2._BANKREQUEST_DATA
_PREPAREBANKREQUEST_ENTRY.fields_by_name['predictions'].message_type = asgt_dot_type_dot_prediction__pb2._PREDICTION
_PREPAREBANKREQUEST_ENTRY.containing_type = _PREPAREBANKREQUEST
_PREPAREBANKREQUEST.fields_by_name['entries'].message_type = _PREPAREBANKREQUEST_ENTRY
_ADDBANKDATAREQUEST_ENTRY.fields_by_name['input'].message_type = asgt_dot_jester_dot_v1alpha1_dot_jester__pb2._BANKREQUEST_DATA
_ADDBANKDATAREQUEST_ENTRY.fields_by_name['true_values'].message_type = asgt_dot_dataservice_dot_v1alpha1_dot_data__pb2._DATATUPLE
_ADDBANKDATAREQUEST_ENTRY.containing_type = _ADDBANKDATAREQUEST
_ADDBANKDATAREQUEST.fields_by_name['entries'].message_type = _ADDBANKDATAREQUEST_ENTRY
_ADDBANKDATAREQUEST.fields_by_name['retention_policy'].message_type = asgt_dot_dataservice_dot_v1alpha1_dot_data__pb2._RETENTIONPOLICY
DESCRIPTOR.message_types_by_name['BankEntry'] = _BANKENTRY
DESCRIPTOR.message_types_by_name['PrepareBankRequest'] = _PREPAREBANKREQUEST
DESCRIPTOR.message_types_by_name['AddBankDataRequest'] = _ADDBANKDATAREQUEST
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

BankEntry = _reflection.GeneratedProtocolMessageType('BankEntry', (_message.Message,), dict(
  DESCRIPTOR = _BANKENTRY,
  __module__ = 'asgt.dataservice.v1alpha1.bank_pb2'
  # @@protoc_insertion_point(class_scope:asgt.dataservice.v1alpha1.BankEntry)
  ))
_sym_db.RegisterMessage(BankEntry)

PrepareBankRequest = _reflection.GeneratedProtocolMessageType('PrepareBankRequest', (_message.Message,), dict(

  Entry = _reflection.GeneratedProtocolMessageType('Entry', (_message.Message,), dict(
    DESCRIPTOR = _PREPAREBANKREQUEST_ENTRY,
    __module__ = 'asgt.dataservice.v1alpha1.bank_pb2'
    # @@protoc_insertion_point(class_scope:asgt.dataservice.v1alpha1.PrepareBankRequest.Entry)
    ))
  ,
  DESCRIPTOR = _PREPAREBANKREQUEST,
  __module__ = 'asgt.dataservice.v1alpha1.bank_pb2'
  # @@protoc_insertion_point(class_scope:asgt.dataservice.v1alpha1.PrepareBankRequest)
  ))
_sym_db.RegisterMessage(PrepareBankRequest)
_sym_db.RegisterMessage(PrepareBankRequest.Entry)

AddBankDataRequest = _reflection.GeneratedProtocolMessageType('AddBankDataRequest', (_message.Message,), dict(

  Entry = _reflection.GeneratedProtocolMessageType('Entry', (_message.Message,), dict(
    DESCRIPTOR = _ADDBANKDATAREQUEST_ENTRY,
    __module__ = 'asgt.dataservice.v1alpha1.bank_pb2'
    # @@protoc_insertion_point(class_scope:asgt.dataservice.v1alpha1.AddBankDataRequest.Entry)
    ))
  ,
  DESCRIPTOR = _ADDBANKDATAREQUEST,
  __module__ = 'asgt.dataservice.v1alpha1.bank_pb2'
  # @@protoc_insertion_point(class_scope:asgt.dataservice.v1alpha1.AddBankDataRequest)
  ))
_sym_db.RegisterMessage(AddBankDataRequest)
_sym_db.RegisterMessage(AddBankDataRequest.Entry)


DESCRIPTOR._options = None
_BANKENTRY.fields_by_name['id']._options = None
_BANKENTRY.fields_by_name['consumer']._options = None
_BANKENTRY.fields_by_name['dataset']._options = None
_BANKENTRY.fields_by_name['tags']._options = None
_BANKENTRY.fields_by_name['time_added']._options = None
_BANKENTRY._options = None

_BANKDATASERVICE = _descriptor.ServiceDescriptor(
  name='BankDataservice',
  full_name='asgt.dataservice.v1alpha1.BankDataservice',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  serialized_start=1294,
  serialized_end=1761,
  methods=[
  _descriptor.MethodDescriptor(
    name='PrepareBankFeedback',
    full_name='asgt.dataservice.v1alpha1.BankDataservice.PrepareBankFeedback',
    index=0,
    containing_service=None,
    input_type=_PREPAREBANKREQUEST,
    output_type=google_dot_protobuf_dot_empty__pb2._EMPTY,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='BankFeedback',
    full_name='asgt.dataservice.v1alpha1.BankDataservice.BankFeedback',
    index=1,
    containing_service=None,
    input_type=asgt_dot_dataservice_dot_v1alpha1_dot_data__pb2._FEEDBACKREQUEST,
    output_type=google_dot_protobuf_dot_empty__pb2._EMPTY,
    serialized_options=_b('\202\323\344\223\002\034\"\027/v1alpha1/bank:feedback:\001*'),
  ),
  _descriptor.MethodDescriptor(
    name='AddBankData',
    full_name='asgt.dataservice.v1alpha1.BankDataservice.AddBankData',
    index=2,
    containing_service=None,
    input_type=_ADDBANKDATAREQUEST,
    output_type=google_dot_protobuf_dot_empty__pb2._EMPTY,
    serialized_options=_b('\202\323\344\223\002\030\"\023/v1alpha1/bank:data:\001*'),
  ),
  _descriptor.MethodDescriptor(
    name='DeleteBankData',
    full_name='asgt.dataservice.v1alpha1.BankDataservice.DeleteBankData',
    index=3,
    containing_service=None,
    input_type=asgt_dot_dataservice_dot_v1alpha1_dot_data__pb2._DELETEREQUEST,
    output_type=google_dot_protobuf_dot_empty__pb2._EMPTY,
    serialized_options=_b('\202\323\344\223\002\032\"\025/v1alpha1/bank:delete:\001*'),
  ),
])
_sym_db.RegisterServiceDescriptor(_BANKDATASERVICE)

DESCRIPTOR.services_by_name['BankDataservice'] = _BANKDATASERVICE

# @@protoc_insertion_point(module_scope)
