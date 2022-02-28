# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: asgt/data/v1/data_service.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from vml_proto.asgt.type import dataset_pb2 as asgt_dot_type_dot_dataset__pb2
from vml_proto.asgt.type import model_pb2 as asgt_dot_type_dot_model__pb2
from vml_proto.asgt.type import retention_policy_pb2 as asgt_dot_type_dot_retention__policy__pb2
from vml_proto.asgt.type import sample_pb2 as asgt_dot_type_dot_sample__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2
from ssn.dataservice.v1 import dataservice_pb2 as ssn_dot_dataservice_dot_v1_dot_dataservice__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='asgt/data/v1/data_service.proto',
  package='asgt.dataservice.v1',
  syntax='proto3',
  serialized_options=b'B\021DataServiceProtosZ5github.com/e-conomic/vmlapis/gen/go/asgt/data/v1;data',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\x1f\x61sgt/data/v1/data_service.proto\x12\x13\x61sgt.dataservice.v1\x1a\x17\x61sgt/type/dataset.proto\x1a\x15\x61sgt/type/model.proto\x1a asgt/type/retention_policy.proto\x1a\x16\x61sgt/type/sample.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x1egoogle/protobuf/wrappers.proto\x1a$ssn/dataservice/v1/dataservice.proto\"\x85\x01\n\x17\x43\x61lculateMetricsRequest\x12.\n\nstart_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12,\n\x08\x65nd_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x0c\n\x04tags\x18\x03 \x03(\t\"\xd6\x01\n\x18\x43\x61lculateMetricsResponse\x12H\n\x07metrics\x18\x01 \x03(\x0b\x32\x37.asgt.dataservice.v1.CalculateMetricsResponse.MetricRow\x1ap\n\tMetricRow\x12\x0e\n\x06target\x18\x01 \x01(\t\x12/\n\nconfidence\x18\x02 \x01(\x0b\x32\x1b.google.protobuf.FloatValue\x12\x0f\n\x07\x63orrect\x18\x03 \x01(\x05\x12\x11\n\tincorrect\x18\x04 \x01(\x05\"\xa4\x01\n\rCreateRequest\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x0c\n\x04type\x18\x02 \x01(\t\x12\x0c\n\x04tags\x18\x03 \x03(\t\x12\x0f\n\x07targets\x18\x06 \x03(\t\x12\"\n\x07samples\x18\x04 \x03(\x0b\x32\x11.asgt.type.Sample\x12\x34\n\x10retention_policy\x18\x05 \x01(\x0b\x32\x1a.asgt.type.RetentionPolicy\"S\n\x11\x41ppendDataRequest\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x0c\n\x04type\x18\x02 \x01(\t\x12\"\n\x07samples\x18\x03 \x03(\x0b\x32\x11.asgt.type.Sample\"E\n\rDeleteRequest\x12\x0c\n\x04type\x18\x01 \x01(\t\x12\x0e\n\x04name\x18\x02 \x01(\tH\x00\x12\r\n\x03tag\x18\x03 \x01(\tH\x00\x42\x07\n\x05match\",\n\x0eGetInfoRequest\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x0c\n\x04type\x18\x02 \x01(\t\"h\n\x14UpdateDatasetRequest\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x0c\n\x04type\x18\x02 \x01(\t\x12\x34\n\x10retention_policy\x18\x03 \x01(\x0b\x32\x1a.asgt.type.RetentionPolicy\"W\n\x0fGetInfoResponse\x12#\n\x07\x64\x61taset\x18\x01 \x01(\x0b\x32\x12.asgt.type.Dataset\x12\x1f\n\x05model\x18\x02 \x01(\x0b\x32\x10.asgt.type.Model\"b\n\x19RegisterQueryStatsRequest\x12\x0f\n\x07\x64\x61taset\x18\x01 \x01(\t\x12\x12\n\nmodel_type\x18\x02 \x01(\t\x12\x12\n\nbatch_size\x18\x03 \x01(\x05\x12\x0c\n\x04tags\x18\x04 \x03(\t2\xeb\x06\n\x0b\x44\x61taService\x12i\n\rCreateDataset\x12\".asgt.dataservice.v1.CreateRequest\x1a\x16.google.protobuf.Empty\"\x1c\x82\xd3\xe4\x93\x02\x16\"\x11/v1/{type}:create:\x01*\x12q\n\nAppendData\x12&.asgt.dataservice.v1.AppendDataRequest\x1a\x16.google.protobuf.Empty\"#\x82\xd3\xe4\x93\x02\x1d\"\x18/v1/{type}/{name}:append:\x01*\x12\x66\n\nDeleteData\x12\".asgt.dataservice.v1.DeleteRequest\x1a\x16.google.protobuf.Empty\"\x1c\x82\xd3\xe4\x93\x02\x16\"\x11/v1/{type}:delete:\x01*\x12t\n\x07GetInfo\x12#.asgt.dataservice.v1.GetInfoRequest\x1a$.asgt.dataservice.v1.GetInfoResponse\"\x1e\x82\xd3\xe4\x93\x02\x18\x12\x16/v1/{type}/{name}:info\x12w\n\rUpdateDataset\x12).asgt.dataservice.v1.UpdateDatasetRequest\x1a\x16.google.protobuf.Empty\"#\x82\xd3\xe4\x93\x02\x1d\x1a\x18/v1/{type}/{name}:update:\x01*\x12\\\n\x12RegisterQueryStats\x12..asgt.dataservice.v1.RegisterQueryStatsRequest\x1a\x16.google.protobuf.Empty\x12X\n\x13\x43\x61llsPerMonthMetric\x12\x16.google.protobuf.Empty\x1a).ssn.dataservice.v1.CallsPerMonthResponse\x12o\n\x10\x43\x61lculateMetrics\x12,.asgt.dataservice.v1.CalculateMetricsRequest\x1a-.asgt.dataservice.v1.CalculateMetricsResponseBJB\x11\x44\x61taServiceProtosZ5github.com/e-conomic/vmlapis/gen/go/asgt/data/v1;datab\x06proto3'
  ,
  dependencies=[asgt_dot_type_dot_dataset__pb2.DESCRIPTOR,asgt_dot_type_dot_model__pb2.DESCRIPTOR,asgt_dot_type_dot_retention__policy__pb2.DESCRIPTOR,asgt_dot_type_dot_sample__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_protobuf_dot_empty__pb2.DESCRIPTOR,google_dot_protobuf_dot_timestamp__pb2.DESCRIPTOR,google_dot_protobuf_dot_wrappers__pb2.DESCRIPTOR,ssn_dot_dataservice_dot_v1_dot_dataservice__pb2.DESCRIPTOR,])




_CALCULATEMETRICSREQUEST = _descriptor.Descriptor(
  name='CalculateMetricsRequest',
  full_name='asgt.dataservice.v1.CalculateMetricsRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='start_time', full_name='asgt.dataservice.v1.CalculateMetricsRequest.start_time', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='end_time', full_name='asgt.dataservice.v1.CalculateMetricsRequest.end_time', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='tags', full_name='asgt.dataservice.v1.CalculateMetricsRequest.tags', index=2,
      number=3, type=9, cpp_type=9, label=3,
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
  serialized_start=325,
  serialized_end=458,
)


_CALCULATEMETRICSRESPONSE_METRICROW = _descriptor.Descriptor(
  name='MetricRow',
  full_name='asgt.dataservice.v1.CalculateMetricsResponse.MetricRow',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='target', full_name='asgt.dataservice.v1.CalculateMetricsResponse.MetricRow.target', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='confidence', full_name='asgt.dataservice.v1.CalculateMetricsResponse.MetricRow.confidence', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='correct', full_name='asgt.dataservice.v1.CalculateMetricsResponse.MetricRow.correct', index=2,
      number=3, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='incorrect', full_name='asgt.dataservice.v1.CalculateMetricsResponse.MetricRow.incorrect', index=3,
      number=4, type=5, cpp_type=1, label=1,
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
  serialized_start=563,
  serialized_end=675,
)

_CALCULATEMETRICSRESPONSE = _descriptor.Descriptor(
  name='CalculateMetricsResponse',
  full_name='asgt.dataservice.v1.CalculateMetricsResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='metrics', full_name='asgt.dataservice.v1.CalculateMetricsResponse.metrics', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_CALCULATEMETRICSRESPONSE_METRICROW, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=461,
  serialized_end=675,
)


_CREATEREQUEST = _descriptor.Descriptor(
  name='CreateRequest',
  full_name='asgt.dataservice.v1.CreateRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='asgt.dataservice.v1.CreateRequest.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='type', full_name='asgt.dataservice.v1.CreateRequest.type', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='tags', full_name='asgt.dataservice.v1.CreateRequest.tags', index=2,
      number=3, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='targets', full_name='asgt.dataservice.v1.CreateRequest.targets', index=3,
      number=6, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='samples', full_name='asgt.dataservice.v1.CreateRequest.samples', index=4,
      number=4, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='retention_policy', full_name='asgt.dataservice.v1.CreateRequest.retention_policy', index=5,
      number=5, type=11, cpp_type=10, label=1,
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
  serialized_start=678,
  serialized_end=842,
)


_APPENDDATAREQUEST = _descriptor.Descriptor(
  name='AppendDataRequest',
  full_name='asgt.dataservice.v1.AppendDataRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='asgt.dataservice.v1.AppendDataRequest.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='type', full_name='asgt.dataservice.v1.AppendDataRequest.type', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='samples', full_name='asgt.dataservice.v1.AppendDataRequest.samples', index=2,
      number=3, type=11, cpp_type=10, label=3,
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
  serialized_start=844,
  serialized_end=927,
)


_DELETEREQUEST = _descriptor.Descriptor(
  name='DeleteRequest',
  full_name='asgt.dataservice.v1.DeleteRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='type', full_name='asgt.dataservice.v1.DeleteRequest.type', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='name', full_name='asgt.dataservice.v1.DeleteRequest.name', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='tag', full_name='asgt.dataservice.v1.DeleteRequest.tag', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
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
    _descriptor.OneofDescriptor(
      name='match', full_name='asgt.dataservice.v1.DeleteRequest.match',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=929,
  serialized_end=998,
)


_GETINFOREQUEST = _descriptor.Descriptor(
  name='GetInfoRequest',
  full_name='asgt.dataservice.v1.GetInfoRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='asgt.dataservice.v1.GetInfoRequest.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='type', full_name='asgt.dataservice.v1.GetInfoRequest.type', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
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
  serialized_start=1000,
  serialized_end=1044,
)


_UPDATEDATASETREQUEST = _descriptor.Descriptor(
  name='UpdateDatasetRequest',
  full_name='asgt.dataservice.v1.UpdateDatasetRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='asgt.dataservice.v1.UpdateDatasetRequest.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='type', full_name='asgt.dataservice.v1.UpdateDatasetRequest.type', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='retention_policy', full_name='asgt.dataservice.v1.UpdateDatasetRequest.retention_policy', index=2,
      number=3, type=11, cpp_type=10, label=1,
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
  serialized_start=1046,
  serialized_end=1150,
)


_GETINFORESPONSE = _descriptor.Descriptor(
  name='GetInfoResponse',
  full_name='asgt.dataservice.v1.GetInfoResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='dataset', full_name='asgt.dataservice.v1.GetInfoResponse.dataset', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='model', full_name='asgt.dataservice.v1.GetInfoResponse.model', index=1,
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
  serialized_start=1152,
  serialized_end=1239,
)


_REGISTERQUERYSTATSREQUEST = _descriptor.Descriptor(
  name='RegisterQueryStatsRequest',
  full_name='asgt.dataservice.v1.RegisterQueryStatsRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='dataset', full_name='asgt.dataservice.v1.RegisterQueryStatsRequest.dataset', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='model_type', full_name='asgt.dataservice.v1.RegisterQueryStatsRequest.model_type', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='batch_size', full_name='asgt.dataservice.v1.RegisterQueryStatsRequest.batch_size', index=2,
      number=3, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='tags', full_name='asgt.dataservice.v1.RegisterQueryStatsRequest.tags', index=3,
      number=4, type=9, cpp_type=9, label=3,
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
  serialized_start=1241,
  serialized_end=1339,
)

_CALCULATEMETRICSREQUEST.fields_by_name['start_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_CALCULATEMETRICSREQUEST.fields_by_name['end_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_CALCULATEMETRICSRESPONSE_METRICROW.fields_by_name['confidence'].message_type = google_dot_protobuf_dot_wrappers__pb2._FLOATVALUE
_CALCULATEMETRICSRESPONSE_METRICROW.containing_type = _CALCULATEMETRICSRESPONSE
_CALCULATEMETRICSRESPONSE.fields_by_name['metrics'].message_type = _CALCULATEMETRICSRESPONSE_METRICROW
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
DESCRIPTOR.message_types_by_name['CalculateMetricsRequest'] = _CALCULATEMETRICSREQUEST
DESCRIPTOR.message_types_by_name['CalculateMetricsResponse'] = _CALCULATEMETRICSRESPONSE
DESCRIPTOR.message_types_by_name['CreateRequest'] = _CREATEREQUEST
DESCRIPTOR.message_types_by_name['AppendDataRequest'] = _APPENDDATAREQUEST
DESCRIPTOR.message_types_by_name['DeleteRequest'] = _DELETEREQUEST
DESCRIPTOR.message_types_by_name['GetInfoRequest'] = _GETINFOREQUEST
DESCRIPTOR.message_types_by_name['UpdateDatasetRequest'] = _UPDATEDATASETREQUEST
DESCRIPTOR.message_types_by_name['GetInfoResponse'] = _GETINFORESPONSE
DESCRIPTOR.message_types_by_name['RegisterQueryStatsRequest'] = _REGISTERQUERYSTATSREQUEST
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

CalculateMetricsRequest = _reflection.GeneratedProtocolMessageType('CalculateMetricsRequest', (_message.Message,), {
  'DESCRIPTOR' : _CALCULATEMETRICSREQUEST,
  '__module__' : 'asgt.data.v1.data_service_pb2'
  # @@protoc_insertion_point(class_scope:asgt.dataservice.v1.CalculateMetricsRequest)
  })
_sym_db.RegisterMessage(CalculateMetricsRequest)

CalculateMetricsResponse = _reflection.GeneratedProtocolMessageType('CalculateMetricsResponse', (_message.Message,), {

  'MetricRow' : _reflection.GeneratedProtocolMessageType('MetricRow', (_message.Message,), {
    'DESCRIPTOR' : _CALCULATEMETRICSRESPONSE_METRICROW,
    '__module__' : 'asgt.data.v1.data_service_pb2'
    # @@protoc_insertion_point(class_scope:asgt.dataservice.v1.CalculateMetricsResponse.MetricRow)
    })
  ,
  'DESCRIPTOR' : _CALCULATEMETRICSRESPONSE,
  '__module__' : 'asgt.data.v1.data_service_pb2'
  # @@protoc_insertion_point(class_scope:asgt.dataservice.v1.CalculateMetricsResponse)
  })
_sym_db.RegisterMessage(CalculateMetricsResponse)
_sym_db.RegisterMessage(CalculateMetricsResponse.MetricRow)

CreateRequest = _reflection.GeneratedProtocolMessageType('CreateRequest', (_message.Message,), {
  'DESCRIPTOR' : _CREATEREQUEST,
  '__module__' : 'asgt.data.v1.data_service_pb2'
  # @@protoc_insertion_point(class_scope:asgt.dataservice.v1.CreateRequest)
  })
_sym_db.RegisterMessage(CreateRequest)

AppendDataRequest = _reflection.GeneratedProtocolMessageType('AppendDataRequest', (_message.Message,), {
  'DESCRIPTOR' : _APPENDDATAREQUEST,
  '__module__' : 'asgt.data.v1.data_service_pb2'
  # @@protoc_insertion_point(class_scope:asgt.dataservice.v1.AppendDataRequest)
  })
_sym_db.RegisterMessage(AppendDataRequest)

DeleteRequest = _reflection.GeneratedProtocolMessageType('DeleteRequest', (_message.Message,), {
  'DESCRIPTOR' : _DELETEREQUEST,
  '__module__' : 'asgt.data.v1.data_service_pb2'
  # @@protoc_insertion_point(class_scope:asgt.dataservice.v1.DeleteRequest)
  })
_sym_db.RegisterMessage(DeleteRequest)

GetInfoRequest = _reflection.GeneratedProtocolMessageType('GetInfoRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETINFOREQUEST,
  '__module__' : 'asgt.data.v1.data_service_pb2'
  # @@protoc_insertion_point(class_scope:asgt.dataservice.v1.GetInfoRequest)
  })
_sym_db.RegisterMessage(GetInfoRequest)

UpdateDatasetRequest = _reflection.GeneratedProtocolMessageType('UpdateDatasetRequest', (_message.Message,), {
  'DESCRIPTOR' : _UPDATEDATASETREQUEST,
  '__module__' : 'asgt.data.v1.data_service_pb2'
  # @@protoc_insertion_point(class_scope:asgt.dataservice.v1.UpdateDatasetRequest)
  })
_sym_db.RegisterMessage(UpdateDatasetRequest)

GetInfoResponse = _reflection.GeneratedProtocolMessageType('GetInfoResponse', (_message.Message,), {
  'DESCRIPTOR' : _GETINFORESPONSE,
  '__module__' : 'asgt.data.v1.data_service_pb2'
  # @@protoc_insertion_point(class_scope:asgt.dataservice.v1.GetInfoResponse)
  })
_sym_db.RegisterMessage(GetInfoResponse)

RegisterQueryStatsRequest = _reflection.GeneratedProtocolMessageType('RegisterQueryStatsRequest', (_message.Message,), {
  'DESCRIPTOR' : _REGISTERQUERYSTATSREQUEST,
  '__module__' : 'asgt.data.v1.data_service_pb2'
  # @@protoc_insertion_point(class_scope:asgt.dataservice.v1.RegisterQueryStatsRequest)
  })
_sym_db.RegisterMessage(RegisterQueryStatsRequest)


DESCRIPTOR._options = None

_DATASERVICE = _descriptor.ServiceDescriptor(
  name='DataService',
  full_name='asgt.dataservice.v1.DataService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  create_key=_descriptor._internal_create_key,
  serialized_start=1342,
  serialized_end=2217,
  methods=[
  _descriptor.MethodDescriptor(
    name='CreateDataset',
    full_name='asgt.dataservice.v1.DataService.CreateDataset',
    index=0,
    containing_service=None,
    input_type=_CREATEREQUEST,
    output_type=google_dot_protobuf_dot_empty__pb2._EMPTY,
    serialized_options=b'\202\323\344\223\002\026\"\021/v1/{type}:create:\001*',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='AppendData',
    full_name='asgt.dataservice.v1.DataService.AppendData',
    index=1,
    containing_service=None,
    input_type=_APPENDDATAREQUEST,
    output_type=google_dot_protobuf_dot_empty__pb2._EMPTY,
    serialized_options=b'\202\323\344\223\002\035\"\030/v1/{type}/{name}:append:\001*',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='DeleteData',
    full_name='asgt.dataservice.v1.DataService.DeleteData',
    index=2,
    containing_service=None,
    input_type=_DELETEREQUEST,
    output_type=google_dot_protobuf_dot_empty__pb2._EMPTY,
    serialized_options=b'\202\323\344\223\002\026\"\021/v1/{type}:delete:\001*',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='GetInfo',
    full_name='asgt.dataservice.v1.DataService.GetInfo',
    index=3,
    containing_service=None,
    input_type=_GETINFOREQUEST,
    output_type=_GETINFORESPONSE,
    serialized_options=b'\202\323\344\223\002\030\022\026/v1/{type}/{name}:info',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='UpdateDataset',
    full_name='asgt.dataservice.v1.DataService.UpdateDataset',
    index=4,
    containing_service=None,
    input_type=_UPDATEDATASETREQUEST,
    output_type=google_dot_protobuf_dot_empty__pb2._EMPTY,
    serialized_options=b'\202\323\344\223\002\035\032\030/v1/{type}/{name}:update:\001*',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='RegisterQueryStats',
    full_name='asgt.dataservice.v1.DataService.RegisterQueryStats',
    index=5,
    containing_service=None,
    input_type=_REGISTERQUERYSTATSREQUEST,
    output_type=google_dot_protobuf_dot_empty__pb2._EMPTY,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='CallsPerMonthMetric',
    full_name='asgt.dataservice.v1.DataService.CallsPerMonthMetric',
    index=6,
    containing_service=None,
    input_type=google_dot_protobuf_dot_empty__pb2._EMPTY,
    output_type=ssn_dot_dataservice_dot_v1_dot_dataservice__pb2._CALLSPERMONTHRESPONSE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='CalculateMetrics',
    full_name='asgt.dataservice.v1.DataService.CalculateMetrics',
    index=7,
    containing_service=None,
    input_type=_CALCULATEMETRICSREQUEST,
    output_type=_CALCULATEMETRICSRESPONSE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_DATASERVICE)

DESCRIPTOR.services_by_name['DataService'] = _DATASERVICE

# @@protoc_insertion_point(module_scope)
