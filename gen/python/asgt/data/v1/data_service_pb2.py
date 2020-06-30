# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: asgt/data/v1/data_service.proto

import sys
_b=sys.version_info[0]<3 and (lambda x:x) or (lambda x:x.encode('latin1'))
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from vml_proto.asgt.type import dataset_pb2 as asgt_dot_type_dot_dataset__pb2
from vml_proto.asgt.type import model_pb2 as asgt_dot_type_dot_model__pb2
from vml_proto.asgt.type import retention_policy_pb2 as asgt_dot_type_dot_retention__policy__pb2
from vml_proto.asgt.type import revision_pb2 as asgt_dot_type_dot_revision__pb2
from vml_proto.asgt.type import sample_pb2 as asgt_dot_type_dot_sample__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='asgt/data/v1/data_service.proto',
  package='asgt.dataservice.v1',
  syntax='proto3',
  serialized_options=_b('Z\004data'),
  serialized_pb=_b('\n\x1f\x61sgt/data/v1/data_service.proto\x12\x13\x61sgt.dataservice.v1\x1a\x17\x61sgt/type/dataset.proto\x1a\x15\x61sgt/type/model.proto\x1a asgt/type/retention_policy.proto\x1a\x18\x61sgt/type/revision.proto\x1a\x16\x61sgt/type/sample.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x1bgoogle/protobuf/empty.proto\"\xa4\x01\n\rCreateRequest\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x0c\n\x04type\x18\x02 \x01(\t\x12\x0c\n\x04tags\x18\x03 \x03(\t\x12\x0f\n\x07targets\x18\x06 \x03(\t\x12\"\n\x07samples\x18\x04 \x03(\x0b\x32\x11.asgt.type.Sample\x12\x34\n\x10retention_policy\x18\x05 \x01(\x0b\x32\x1a.asgt.type.RetentionPolicy\"S\n\x11\x41ppendDataRequest\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x0c\n\x04type\x18\x02 \x01(\t\x12\"\n\x07samples\x18\x03 \x03(\x0b\x32\x11.asgt.type.Sample\"E\n\rDeleteRequest\x12\x0c\n\x04type\x18\x01 \x01(\t\x12\x0e\n\x04name\x18\x02 \x01(\tH\x00\x12\r\n\x03tag\x18\x03 \x01(\tH\x00\x42\x07\n\x05match\",\n\x0eGetInfoRequest\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x0c\n\x04type\x18\x02 \x01(\t\"h\n\x14UpdateDatasetRequest\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x0c\n\x04type\x18\x02 \x01(\t\x12\x34\n\x10retention_policy\x18\x03 \x01(\x0b\x32\x1a.asgt.type.RetentionPolicy\"~\n\x0fGetInfoResponse\x12#\n\x07\x64\x61taset\x18\x01 \x01(\x0b\x32\x12.asgt.type.Dataset\x12\x1f\n\x05model\x18\x02 \x01(\x0b\x32\x10.asgt.type.Model\x12%\n\x08revision\x18\x03 \x01(\x0b\x32\x13.asgt.type.Revision2\xc2\x04\n\x0b\x44\x61taService\x12i\n\rCreateDataset\x12\".asgt.dataservice.v1.CreateRequest\x1a\x16.google.protobuf.Empty\"\x1c\x82\xd3\xe4\x93\x02\x16\"\x11/v1/{type}:create:\x01*\x12q\n\nAppendData\x12&.asgt.dataservice.v1.AppendDataRequest\x1a\x16.google.protobuf.Empty\"#\x82\xd3\xe4\x93\x02\x1d\"\x18/v1/{type}/{name}:append:\x01*\x12\x66\n\nDeleteData\x12\".asgt.dataservice.v1.DeleteRequest\x1a\x16.google.protobuf.Empty\"\x1c\x82\xd3\xe4\x93\x02\x16\"\x11/v1/{type}:delete:\x01*\x12t\n\x07GetInfo\x12#.asgt.dataservice.v1.GetInfoRequest\x1a$.asgt.dataservice.v1.GetInfoResponse\"\x1e\x82\xd3\xe4\x93\x02\x18\x12\x16/v1/{type}/{name}:info\x12w\n\rUpdateDataset\x12).asgt.dataservice.v1.UpdateDatasetRequest\x1a\x16.google.protobuf.Empty\"#\x82\xd3\xe4\x93\x02\x1d\x1a\x18/v1/{type}/{name}:update:\x01*B\x06Z\x04\x64\x61tab\x06proto3')
  ,
  dependencies=[asgt_dot_type_dot_dataset__pb2.DESCRIPTOR,asgt_dot_type_dot_model__pb2.DESCRIPTOR,asgt_dot_type_dot_retention__policy__pb2.DESCRIPTOR,asgt_dot_type_dot_revision__pb2.DESCRIPTOR,asgt_dot_type_dot_sample__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_protobuf_dot_empty__pb2.DESCRIPTOR,])




_CREATEREQUEST = _descriptor.Descriptor(
  name='CreateRequest',
  full_name='asgt.dataservice.v1.CreateRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='asgt.dataservice.v1.CreateRequest.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='type', full_name='asgt.dataservice.v1.CreateRequest.type', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='tags', full_name='asgt.dataservice.v1.CreateRequest.tags', index=2,
      number=3, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='targets', full_name='asgt.dataservice.v1.CreateRequest.targets', index=3,
      number=6, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='samples', full_name='asgt.dataservice.v1.CreateRequest.samples', index=4,
      number=4, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='retention_policy', full_name='asgt.dataservice.v1.CreateRequest.retention_policy', index=5,
      number=5, type=11, cpp_type=10, label=1,
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
  serialized_start=248,
  serialized_end=412,
)


_APPENDDATAREQUEST = _descriptor.Descriptor(
  name='AppendDataRequest',
  full_name='asgt.dataservice.v1.AppendDataRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='asgt.dataservice.v1.AppendDataRequest.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='type', full_name='asgt.dataservice.v1.AppendDataRequest.type', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='samples', full_name='asgt.dataservice.v1.AppendDataRequest.samples', index=2,
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
  serialized_start=414,
  serialized_end=497,
)


_DELETEREQUEST = _descriptor.Descriptor(
  name='DeleteRequest',
  full_name='asgt.dataservice.v1.DeleteRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='type', full_name='asgt.dataservice.v1.DeleteRequest.type', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='name', full_name='asgt.dataservice.v1.DeleteRequest.name', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='tag', full_name='asgt.dataservice.v1.DeleteRequest.tag', index=2,
      number=3, type=9, cpp_type=9, label=1,
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
    _descriptor.OneofDescriptor(
      name='match', full_name='asgt.dataservice.v1.DeleteRequest.match',
      index=0, containing_type=None, fields=[]),
  ],
  serialized_start=499,
  serialized_end=568,
)


_GETINFOREQUEST = _descriptor.Descriptor(
  name='GetInfoRequest',
  full_name='asgt.dataservice.v1.GetInfoRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='asgt.dataservice.v1.GetInfoRequest.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='type', full_name='asgt.dataservice.v1.GetInfoRequest.type', index=1,
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
  serialized_start=570,
  serialized_end=614,
)


_UPDATEDATASETREQUEST = _descriptor.Descriptor(
  name='UpdateDatasetRequest',
  full_name='asgt.dataservice.v1.UpdateDatasetRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='asgt.dataservice.v1.UpdateDatasetRequest.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='type', full_name='asgt.dataservice.v1.UpdateDatasetRequest.type', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='retention_policy', full_name='asgt.dataservice.v1.UpdateDatasetRequest.retention_policy', index=2,
      number=3, type=11, cpp_type=10, label=1,
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
  serialized_start=616,
  serialized_end=720,
)


_GETINFORESPONSE = _descriptor.Descriptor(
  name='GetInfoResponse',
  full_name='asgt.dataservice.v1.GetInfoResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='dataset', full_name='asgt.dataservice.v1.GetInfoResponse.dataset', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='model', full_name='asgt.dataservice.v1.GetInfoResponse.model', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='revision', full_name='asgt.dataservice.v1.GetInfoResponse.revision', index=2,
      number=3, type=11, cpp_type=10, label=1,
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
  serialized_start=722,
  serialized_end=848,
)

_CREATEREQUEST.fields_by_name['samples'].message_type = asgt_dot_type_dot_sample__pb2._SAMPLE
_CREATEREQUEST.fields_by_name['retention_policy'].message_type = asgt_dot_type_dot_retention__policy__pb2._RETENTIONPOLICY
_APPENDDATAREQUEST.fields_by_name['samples'].message_type = asgt_dot_type_dot_sample__pb2._SAMPLE
_DELETEREQUEST.oneofs_by_name['match'].fields.append(
  _DELETEREQUEST.fields_by_name['name'])
_DELETEREQUEST.fields_by_name['name'].containing_oneof = _DELETEREQUEST.oneofs_by_name['match']
_DELETEREQUEST.oneofs_by_name['match'].fields.append(
  _DELETEREQUEST.fields_by_name['tag'])
_DELETEREQUEST.fields_by_name['tag'].containing_oneof = _DELETEREQUEST.oneofs_by_name['match']
_UPDATEDATASETREQUEST.fields_by_name['retention_policy'].message_type = asgt_dot_type_dot_retention__policy__pb2._RETENTIONPOLICY
_GETINFORESPONSE.fields_by_name['dataset'].message_type = asgt_dot_type_dot_dataset__pb2._DATASET
_GETINFORESPONSE.fields_by_name['model'].message_type = asgt_dot_type_dot_model__pb2._MODEL
_GETINFORESPONSE.fields_by_name['revision'].message_type = asgt_dot_type_dot_revision__pb2._REVISION
DESCRIPTOR.message_types_by_name['CreateRequest'] = _CREATEREQUEST
DESCRIPTOR.message_types_by_name['AppendDataRequest'] = _APPENDDATAREQUEST
DESCRIPTOR.message_types_by_name['DeleteRequest'] = _DELETEREQUEST
DESCRIPTOR.message_types_by_name['GetInfoRequest'] = _GETINFOREQUEST
DESCRIPTOR.message_types_by_name['UpdateDatasetRequest'] = _UPDATEDATASETREQUEST
DESCRIPTOR.message_types_by_name['GetInfoResponse'] = _GETINFORESPONSE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

CreateRequest = _reflection.GeneratedProtocolMessageType('CreateRequest', (_message.Message,), dict(
  DESCRIPTOR = _CREATEREQUEST,
  __module__ = 'asgt.data.v1.data_service_pb2'
  # @@protoc_insertion_point(class_scope:asgt.dataservice.v1.CreateRequest)
  ))
_sym_db.RegisterMessage(CreateRequest)

AppendDataRequest = _reflection.GeneratedProtocolMessageType('AppendDataRequest', (_message.Message,), dict(
  DESCRIPTOR = _APPENDDATAREQUEST,
  __module__ = 'asgt.data.v1.data_service_pb2'
  # @@protoc_insertion_point(class_scope:asgt.dataservice.v1.AppendDataRequest)
  ))
_sym_db.RegisterMessage(AppendDataRequest)

DeleteRequest = _reflection.GeneratedProtocolMessageType('DeleteRequest', (_message.Message,), dict(
  DESCRIPTOR = _DELETEREQUEST,
  __module__ = 'asgt.data.v1.data_service_pb2'
  # @@protoc_insertion_point(class_scope:asgt.dataservice.v1.DeleteRequest)
  ))
_sym_db.RegisterMessage(DeleteRequest)

GetInfoRequest = _reflection.GeneratedProtocolMessageType('GetInfoRequest', (_message.Message,), dict(
  DESCRIPTOR = _GETINFOREQUEST,
  __module__ = 'asgt.data.v1.data_service_pb2'
  # @@protoc_insertion_point(class_scope:asgt.dataservice.v1.GetInfoRequest)
  ))
_sym_db.RegisterMessage(GetInfoRequest)

UpdateDatasetRequest = _reflection.GeneratedProtocolMessageType('UpdateDatasetRequest', (_message.Message,), dict(
  DESCRIPTOR = _UPDATEDATASETREQUEST,
  __module__ = 'asgt.data.v1.data_service_pb2'
  # @@protoc_insertion_point(class_scope:asgt.dataservice.v1.UpdateDatasetRequest)
  ))
_sym_db.RegisterMessage(UpdateDatasetRequest)

GetInfoResponse = _reflection.GeneratedProtocolMessageType('GetInfoResponse', (_message.Message,), dict(
  DESCRIPTOR = _GETINFORESPONSE,
  __module__ = 'asgt.data.v1.data_service_pb2'
  # @@protoc_insertion_point(class_scope:asgt.dataservice.v1.GetInfoResponse)
  ))
_sym_db.RegisterMessage(GetInfoResponse)


DESCRIPTOR._options = None

_DATASERVICE = _descriptor.ServiceDescriptor(
  name='DataService',
  full_name='asgt.dataservice.v1.DataService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  serialized_start=851,
  serialized_end=1429,
  methods=[
  _descriptor.MethodDescriptor(
    name='CreateDataset',
    full_name='asgt.dataservice.v1.DataService.CreateDataset',
    index=0,
    containing_service=None,
    input_type=_CREATEREQUEST,
    output_type=google_dot_protobuf_dot_empty__pb2._EMPTY,
    serialized_options=_b('\202\323\344\223\002\026\"\021/v1/{type}:create:\001*'),
  ),
  _descriptor.MethodDescriptor(
    name='AppendData',
    full_name='asgt.dataservice.v1.DataService.AppendData',
    index=1,
    containing_service=None,
    input_type=_APPENDDATAREQUEST,
    output_type=google_dot_protobuf_dot_empty__pb2._EMPTY,
    serialized_options=_b('\202\323\344\223\002\035\"\030/v1/{type}/{name}:append:\001*'),
  ),
  _descriptor.MethodDescriptor(
    name='DeleteData',
    full_name='asgt.dataservice.v1.DataService.DeleteData',
    index=2,
    containing_service=None,
    input_type=_DELETEREQUEST,
    output_type=google_dot_protobuf_dot_empty__pb2._EMPTY,
    serialized_options=_b('\202\323\344\223\002\026\"\021/v1/{type}:delete:\001*'),
  ),
  _descriptor.MethodDescriptor(
    name='GetInfo',
    full_name='asgt.dataservice.v1.DataService.GetInfo',
    index=3,
    containing_service=None,
    input_type=_GETINFOREQUEST,
    output_type=_GETINFORESPONSE,
    serialized_options=_b('\202\323\344\223\002\030\022\026/v1/{type}/{name}:info'),
  ),
  _descriptor.MethodDescriptor(
    name='UpdateDataset',
    full_name='asgt.dataservice.v1.DataService.UpdateDataset',
    index=4,
    containing_service=None,
    input_type=_UPDATEDATASETREQUEST,
    output_type=google_dot_protobuf_dot_empty__pb2._EMPTY,
    serialized_options=_b('\202\323\344\223\002\035\032\030/v1/{type}/{name}:update:\001*'),
  ),
])
_sym_db.RegisterServiceDescriptor(_DATASERVICE)

DESCRIPTOR.services_by_name['DataService'] = _DATASERVICE

# @@protoc_insertion_point(module_scope)
