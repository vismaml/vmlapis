# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: asgt/data/v1/data_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
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


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1f\x61sgt/data/v1/data_service.proto\x12\x13\x61sgt.dataservice.v1\x1a\x17\x61sgt/type/dataset.proto\x1a\x15\x61sgt/type/model.proto\x1a asgt/type/retention_policy.proto\x1a\x16\x61sgt/type/sample.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x1egoogle/protobuf/wrappers.proto\x1a$ssn/dataservice/v1/dataservice.proto\"\x9f\x01\n\x17\x43\x61lculateMetricsRequest\x12\x39\n\nstart_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.TimestampR\tstartTime\x12\x35\n\x08\x65nd_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampR\x07\x65ndTime\x12\x12\n\x04tags\x18\x03 \x03(\tR\x04tags\"\x88\x02\n\x18\x43\x61lculateMetricsResponse\x12Q\n\x07metrics\x18\x01 \x03(\x0b\x32\x37.asgt.dataservice.v1.CalculateMetricsResponse.MetricRowR\x07metrics\x1a\x98\x01\n\tMetricRow\x12\x16\n\x06target\x18\x01 \x01(\tR\x06target\x12;\n\nconfidence\x18\x02 \x01(\x0b\x32\x1b.google.protobuf.FloatValueR\nconfidence\x12\x18\n\x07\x63orrect\x18\x03 \x01(\x05R\x07\x63orrect\x12\x1c\n\tincorrect\x18\x04 \x01(\x05R\tincorrect\"\xd9\x01\n\rCreateRequest\x12\x12\n\x04name\x18\x01 \x01(\tR\x04name\x12\x12\n\x04type\x18\x02 \x01(\tR\x04type\x12\x12\n\x04tags\x18\x03 \x03(\tR\x04tags\x12\x18\n\x07targets\x18\x06 \x03(\tR\x07targets\x12+\n\x07samples\x18\x04 \x03(\x0b\x32\x11.asgt.type.SampleR\x07samples\x12\x45\n\x10retention_policy\x18\x05 \x01(\x0b\x32\x1a.asgt.type.RetentionPolicyR\x0fretentionPolicy\"h\n\x11\x41ppendDataRequest\x12\x12\n\x04name\x18\x01 \x01(\tR\x04name\x12\x12\n\x04type\x18\x02 \x01(\tR\x04type\x12+\n\x07samples\x18\x03 \x03(\x0b\x32\x11.asgt.type.SampleR\x07samples\"V\n\rDeleteRequest\x12\x12\n\x04type\x18\x01 \x01(\tR\x04type\x12\x14\n\x04name\x18\x02 \x01(\tH\x00R\x04name\x12\x12\n\x03tag\x18\x03 \x01(\tH\x00R\x03tagB\x07\n\x05match\"8\n\x0eGetInfoRequest\x12\x12\n\x04name\x18\x01 \x01(\tR\x04name\x12\x12\n\x04type\x18\x02 \x01(\tR\x04type\"\x85\x01\n\x14UpdateDatasetRequest\x12\x12\n\x04name\x18\x01 \x01(\tR\x04name\x12\x12\n\x04type\x18\x02 \x01(\tR\x04type\x12\x45\n\x10retention_policy\x18\x03 \x01(\x0b\x32\x1a.asgt.type.RetentionPolicyR\x0fretentionPolicy\"g\n\x0fGetInfoResponse\x12,\n\x07\x64\x61taset\x18\x01 \x01(\x0b\x32\x12.asgt.type.DatasetR\x07\x64\x61taset\x12&\n\x05model\x18\x02 \x01(\x0b\x32\x10.asgt.type.ModelR\x05model\"\x87\x01\n\x19RegisterQueryStatsRequest\x12\x18\n\x07\x64\x61taset\x18\x01 \x01(\tR\x07\x64\x61taset\x12\x1d\n\nmodel_type\x18\x02 \x01(\tR\tmodelType\x12\x1d\n\nbatch_size\x18\x03 \x01(\x05R\tbatchSize\x12\x12\n\x04tags\x18\x04 \x03(\tR\x04tags2\xeb\x06\n\x0b\x44\x61taService\x12i\n\rCreateDataset\x12\".asgt.dataservice.v1.CreateRequest\x1a\x16.google.protobuf.Empty\"\x1c\x82\xd3\xe4\x93\x02\x16:\x01*\"\x11/v1/{type}:create\x12q\n\nAppendData\x12&.asgt.dataservice.v1.AppendDataRequest\x1a\x16.google.protobuf.Empty\"#\x82\xd3\xe4\x93\x02\x1d:\x01*\"\x18/v1/{type}/{name}:append\x12\x66\n\nDeleteData\x12\".asgt.dataservice.v1.DeleteRequest\x1a\x16.google.protobuf.Empty\"\x1c\x82\xd3\xe4\x93\x02\x16:\x01*\"\x11/v1/{type}:delete\x12t\n\x07GetInfo\x12#.asgt.dataservice.v1.GetInfoRequest\x1a$.asgt.dataservice.v1.GetInfoResponse\"\x1e\x82\xd3\xe4\x93\x02\x18\x12\x16/v1/{type}/{name}:info\x12w\n\rUpdateDataset\x12).asgt.dataservice.v1.UpdateDatasetRequest\x1a\x16.google.protobuf.Empty\"#\x82\xd3\xe4\x93\x02\x1d:\x01*\x1a\x18/v1/{type}/{name}:update\x12\\\n\x12RegisterQueryStats\x12..asgt.dataservice.v1.RegisterQueryStatsRequest\x1a\x16.google.protobuf.Empty\x12X\n\x13\x43\x61llsPerMonthMetric\x12\x16.google.protobuf.Empty\x1a).ssn.dataservice.v1.CallsPerMonthResponse\x12o\n\x10\x43\x61lculateMetrics\x12,.asgt.dataservice.v1.CalculateMetricsRequest\x1a-.asgt.dataservice.v1.CalculateMetricsResponseBJB\x11\x44\x61taServiceProtosZ5github.com/e-conomic/vmlapis/gen/go/asgt/data/v1;datab\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'asgt.data.v1.data_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'B\021DataServiceProtosZ5github.com/e-conomic/vmlapis/gen/go/asgt/data/v1;data'
  _DATASERVICE.methods_by_name['CreateDataset']._options = None
  _DATASERVICE.methods_by_name['CreateDataset']._serialized_options = b'\202\323\344\223\002\026:\001*\"\021/v1/{type}:create'
  _DATASERVICE.methods_by_name['AppendData']._options = None
  _DATASERVICE.methods_by_name['AppendData']._serialized_options = b'\202\323\344\223\002\035:\001*\"\030/v1/{type}/{name}:append'
  _DATASERVICE.methods_by_name['DeleteData']._options = None
  _DATASERVICE.methods_by_name['DeleteData']._serialized_options = b'\202\323\344\223\002\026:\001*\"\021/v1/{type}:delete'
  _DATASERVICE.methods_by_name['GetInfo']._options = None
  _DATASERVICE.methods_by_name['GetInfo']._serialized_options = b'\202\323\344\223\002\030\022\026/v1/{type}/{name}:info'
  _DATASERVICE.methods_by_name['UpdateDataset']._options = None
  _DATASERVICE.methods_by_name['UpdateDataset']._serialized_options = b'\202\323\344\223\002\035:\001*\032\030/v1/{type}/{name}:update'
  _CALCULATEMETRICSREQUEST._serialized_start=325
  _CALCULATEMETRICSREQUEST._serialized_end=484
  _CALCULATEMETRICSRESPONSE._serialized_start=487
  _CALCULATEMETRICSRESPONSE._serialized_end=751
  _CALCULATEMETRICSRESPONSE_METRICROW._serialized_start=599
  _CALCULATEMETRICSRESPONSE_METRICROW._serialized_end=751
  _CREATEREQUEST._serialized_start=754
  _CREATEREQUEST._serialized_end=971
  _APPENDDATAREQUEST._serialized_start=973
  _APPENDDATAREQUEST._serialized_end=1077
  _DELETEREQUEST._serialized_start=1079
  _DELETEREQUEST._serialized_end=1165
  _GETINFOREQUEST._serialized_start=1167
  _GETINFOREQUEST._serialized_end=1223
  _UPDATEDATASETREQUEST._serialized_start=1226
  _UPDATEDATASETREQUEST._serialized_end=1359
  _GETINFORESPONSE._serialized_start=1361
  _GETINFORESPONSE._serialized_end=1464
  _REGISTERQUERYSTATSREQUEST._serialized_start=1467
  _REGISTERQUERYSTATSREQUEST._serialized_end=1602
  _DATASERVICE._serialized_start=1605
  _DATASERVICE._serialized_end=2480
# @@protoc_insertion_point(module_scope)
