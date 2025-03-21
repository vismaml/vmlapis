# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# NO CHECKED-IN PROTOBUF GENCODE
# source: asgt/v2/dataset_service.proto
# Protobuf Python Version: 5.29.3
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import runtime_version as _runtime_version
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
_runtime_version.ValidateProtobufRuntimeVersion(
    _runtime_version.Domain.PUBLIC,
    5,
    29,
    3,
    '',
    'asgt/v2/dataset_service.proto'
)
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from vml_proto.asgt.type import dataset_pb2 as asgt_dot_type_dot_dataset__pb2
from vml_proto.asgt.type import retention_policy_pb2 as asgt_dot_type_dot_retention__policy__pb2
from vml_proto.asgt.v2.type import example_pb2 as asgt_dot_v2_dot_type_dot_example__pb2
from vml_proto.asgt.v2.type import model_pb2 as asgt_dot_v2_dot_type_dot_model__pb2
from vml_proto.asgt.v2.type import training_pb2 as asgt_dot_v2_dot_type_dot_training__pb2
from vml_proto.google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from vml_proto.protoc_gen_openapiv2.options import annotations_pb2 as protoc__gen__openapiv2_dot_options_dot_annotations__pb2
from vml_proto.validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1d\x61sgt/v2/dataset_service.proto\x12\x07\x61sgt.v2\x1a\x17\x61sgt/type/dataset.proto\x1a asgt/type/retention_policy.proto\x1a\x1a\x61sgt/v2/type/example.proto\x1a\x18\x61sgt/v2/type/model.proto\x1a\x1b\x61sgt/v2/type/training.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a.protoc-gen-openapiv2/options/annotations.proto\x1a\x17validate/validate.proto\"`\n\x11GetDatasetRequest\x12K\n\x0c\x64\x61taset_name\x18\x01 \x01(\tB(\xfa\x42%r#(\x80\x02\x32\x1e^[A-Za-z0-9.][A-Za-z0-9_.>-]*$R\x0b\x64\x61tasetName\"\xe4\x01\n\x14\x43reateDatasetRequest\x12K\n\x0c\x64\x61taset_name\x18\x01 \x01(\tB(\xfa\x42%r#(\x80\x02\x32\x1e^[A-Za-z0-9.][A-Za-z0-9_.>-]*$R\x0b\x64\x61tasetName\x12\x38\n\x04tags\x18\x02 \x03(\tB$\xfa\x42!\x92\x01\x1e\x18\x01\"\x1ar\x18(@2\x14^[A-Za-z0-9\\s_.>-]*$R\x04tags\x12\x45\n\x10retention_policy\x18\x03 \x01(\x0b\x32\x1a.asgt.type.RetentionPolicyR\x0fretentionPolicy\"k\n\x1c\x43reateOrUpdateDatasetRequest\x12K\n\x0c\x64\x61taset_name\x18\x01 \x01(\tB(\xfa\x42%r#(\x80\x02\x32\x1e^[A-Za-z0-9.][A-Za-z0-9_.>-]*$R\x0b\x64\x61tasetName\"c\n\x14\x44\x65leteDatasetRequest\x12K\n\x0c\x64\x61taset_name\x18\x01 \x01(\tB(\xfa\x42%r#(\x80\x02\x32\x1e^[A-Za-z0-9.][A-Za-z0-9_.>-]*$R\x0b\x64\x61tasetName\"W\n\x10\x44\x65leteTagRequest\x12\x43\n\x08tag_name\x18\x01 \x01(\tB(\xfa\x42%r#(\x80\x02\x32\x1e^[A-Za-z0-9.][A-Za-z0-9_.>-]*$R\x07tagName\"\x94\x01\n\x14\x43reateExampleRequest\x12K\n\x0c\x64\x61taset_name\x18\x01 \x01(\tB(\xfa\x42%r#(\x80\x02\x32\x1e^[A-Za-z0-9.][A-Za-z0-9_.>-]*$R\x0b\x64\x61tasetName\x12/\n\x07\x65xample\x18\x02 \x01(\x0b\x32\x15.asgt.v2.type.ExampleR\x07\x65xample\"\x9c\x01\n\x1c\x43reateOrUpdateExampleRequest\x12K\n\x0c\x64\x61taset_name\x18\x01 \x01(\tB(\xfa\x42%r#(\x80\x02\x32\x1e^[A-Za-z0-9.][A-Za-z0-9_.>-]*$R\x0b\x64\x61tasetName\x12/\n\x07\x65xample\x18\x02 \x01(\x0b\x32\x15.asgt.v2.type.ExampleR\x07\x65xample\"\x9b\x01\n\x19\x42\x61tchCreateExampleRequest\x12K\n\x0c\x64\x61taset_name\x18\x01 \x01(\tB(\xfa\x42%r#(\x80\x02\x32\x1e^[A-Za-z0-9.][A-Za-z0-9_.>-]*$R\x0b\x64\x61tasetName\x12\x31\n\x08\x65xamples\x18\x02 \x03(\x0b\x32\x15.asgt.v2.type.ExampleR\x08\x65xamples\"e\n\x16TruncateDatasetRequest\x12K\n\x0c\x64\x61taset_name\x18\x01 \x01(\tB(\xfa\x42%r#(\x80\x02\x32\x1e^[A-Za-z0-9.][A-Za-z0-9_.>-]*$R\x0b\x64\x61tasetName\"9\n\x16TrainingRequestOptions\x12\x1f\n\x05limit\x18\x01 \x01(\x03\x42\t\xfa\x42\x06\"\x04\x18\x64 \x00R\x05limit\"6\n\x13ModelRequestOptions\x12\x1f\n\x05limit\x18\x01 \x01(\x03\x42\t\xfa\x42\x06\"\x04\x18\x64 \x00R\x05limit\"\xa4\x01\n\x1aGetDatasetTrainingsRequest\x12K\n\x0c\x64\x61taset_name\x18\x01 \x01(\tB(\xfa\x42%r#(\x80\x02\x32\x1e^[A-Za-z0-9.][A-Za-z0-9_.>-]*$R\x0b\x64\x61tasetName\x12\x39\n\x07options\x18\x02 \x01(\x0b\x32\x1f.asgt.v2.TrainingRequestOptionsR\x07options\"\x9e\x01\n\x17GetDatasetModelsRequest\x12K\n\x0c\x64\x61taset_name\x18\x01 \x01(\tB(\xfa\x42%r#(\x80\x02\x32\x1e^[A-Za-z0-9.][A-Za-z0-9_.>-]*$R\x0b\x64\x61tasetName\x12\x36\n\x07options\x18\x02 \x01(\x0b\x32\x1c.asgt.v2.ModelRequestOptionsR\x07options\"P\n\x13GetTrainingsRequest\x12\x39\n\x07options\x18\x01 \x01(\x0b\x32\x1f.asgt.v2.TrainingRequestOptionsR\x07options\"I\n\x11TrainingsResponse\x12\x34\n\ttrainings\x18\x01 \x03(\x0b\x32\x16.asgt.v2.type.TrainingR\ttrainings\"=\n\x0eModelsResponse\x12+\n\x06models\x18\x01 \x03(\x0b\x32\x13.asgt.v2.type.ModelR\x06models2\xde\x0b\n\x0e\x44\x61tasetService\x12\x61\n\nGetDataset\x12\x1a.asgt.v2.GetDatasetRequest\x1a\x12.asgt.type.Dataset\"#\x82\xd3\xe4\x93\x02\x1d\x12\x1b/v2/datasets/{dataset_name}\x12_\n\rCreateDataset\x12\x1d.asgt.v2.CreateDatasetRequest\x1a\x16.google.protobuf.Empty\"\x17\x82\xd3\xe4\x93\x02\x11\"\x0c/v2/datasets:\x01*\x12{\n\x15\x43reateOrUpdateDataset\x12%.asgt.v2.CreateOrUpdateDatasetRequest\x1a\x16.google.protobuf.Empty\"#\x82\xd3\xe4\x93\x02\x1d\x1a\x1b/v2/datasets/{dataset_name}\x12g\n\rDeleteDataset\x12\x1d.asgt.v2.DeleteDatasetRequest\x1a\x12.asgt.type.Dataset\"#\x82\xd3\xe4\x93\x02\x1d*\x1b/v2/datasets/{dataset_name}\x12[\n\tDeleteTag\x12\x19.asgt.v2.DeleteTagRequest\x1a\x16.google.protobuf.Empty\"\x1b\x82\xd3\xe4\x93\x02\x15*\x13/v2/tags/{tag_name}\x12w\n\rCreateExample\x12\x1d.asgt.v2.CreateExampleRequest\x1a\x16.google.protobuf.Empty\"/\x82\xd3\xe4\x93\x02)\"$/v2/datasets/{dataset_name}/examples:\x01*\x12\x94\x01\n\x15\x43reateOrUpdateExample\x12%.asgt.v2.CreateOrUpdateExampleRequest\x1a\x16.google.protobuf.Empty\"<\x82\xd3\xe4\x93\x02\x36\x1a\x31/v2/datasets/{dataset_name}/examples/{example.id}:\x01*\x12\x8d\x01\n\x12\x42\x61tchCreateExample\x12\".asgt.v2.BatchCreateExampleRequest\x1a\x16.google.protobuf.Empty\";\x82\xd3\xe4\x93\x02\x35\"0/v2/datasets/{dataset_name}/examples:batchCreate:\x01*\x12x\n\x0fTruncateDataset\x12\x1f.asgt.v2.TruncateDatasetRequest\x1a\x16.google.protobuf.Empty\",\x82\xd3\xe4\x93\x02&*$/v2/datasets/{dataset_name}/examples\x12\x85\x01\n\x13GetDatasetTrainings\x12#.asgt.v2.GetDatasetTrainingsRequest\x1a\x1a.asgt.v2.TrainingsResponse\"-\x82\xd3\xe4\x93\x02\'\x12%/v2/datasets/{dataset_name}/trainings\x12y\n\x10GetDatasetModels\x12 .asgt.v2.GetDatasetModelsRequest\x1a\x17.asgt.v2.ModelsResponse\"*\x82\xd3\xe4\x93\x02$\x12\"/v2/datasets/{dataset_name}/models\x12_\n\x0cGetTrainings\x12\x1c.asgt.v2.GetTrainingsRequest\x1a\x1a.asgt.v2.TrainingsResponse\"\x15\x82\xd3\xe4\x93\x02\x0f\x12\r/v2/trainings\x1aG\x92\x41\x44\x12\x42Manage datasets and examples used for training AutoSuggest models.B-Z+github.com/e-conomic/vmlapis/gen/go/asgt/v2b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'asgt.v2.dataset_service_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'Z+github.com/e-conomic/vmlapis/gen/go/asgt/v2'
  _globals['_GETDATASETREQUEST'].fields_by_name['dataset_name']._loaded_options = None
  _globals['_GETDATASETREQUEST'].fields_by_name['dataset_name']._serialized_options = b'\372B%r#(\200\0022\036^[A-Za-z0-9.][A-Za-z0-9_.>-]*$'
  _globals['_CREATEDATASETREQUEST'].fields_by_name['dataset_name']._loaded_options = None
  _globals['_CREATEDATASETREQUEST'].fields_by_name['dataset_name']._serialized_options = b'\372B%r#(\200\0022\036^[A-Za-z0-9.][A-Za-z0-9_.>-]*$'
  _globals['_CREATEDATASETREQUEST'].fields_by_name['tags']._loaded_options = None
  _globals['_CREATEDATASETREQUEST'].fields_by_name['tags']._serialized_options = b'\372B!\222\001\036\030\001\"\032r\030(@2\024^[A-Za-z0-9\\s_.>-]*$'
  _globals['_CREATEORUPDATEDATASETREQUEST'].fields_by_name['dataset_name']._loaded_options = None
  _globals['_CREATEORUPDATEDATASETREQUEST'].fields_by_name['dataset_name']._serialized_options = b'\372B%r#(\200\0022\036^[A-Za-z0-9.][A-Za-z0-9_.>-]*$'
  _globals['_DELETEDATASETREQUEST'].fields_by_name['dataset_name']._loaded_options = None
  _globals['_DELETEDATASETREQUEST'].fields_by_name['dataset_name']._serialized_options = b'\372B%r#(\200\0022\036^[A-Za-z0-9.][A-Za-z0-9_.>-]*$'
  _globals['_DELETETAGREQUEST'].fields_by_name['tag_name']._loaded_options = None
  _globals['_DELETETAGREQUEST'].fields_by_name['tag_name']._serialized_options = b'\372B%r#(\200\0022\036^[A-Za-z0-9.][A-Za-z0-9_.>-]*$'
  _globals['_CREATEEXAMPLEREQUEST'].fields_by_name['dataset_name']._loaded_options = None
  _globals['_CREATEEXAMPLEREQUEST'].fields_by_name['dataset_name']._serialized_options = b'\372B%r#(\200\0022\036^[A-Za-z0-9.][A-Za-z0-9_.>-]*$'
  _globals['_CREATEORUPDATEEXAMPLEREQUEST'].fields_by_name['dataset_name']._loaded_options = None
  _globals['_CREATEORUPDATEEXAMPLEREQUEST'].fields_by_name['dataset_name']._serialized_options = b'\372B%r#(\200\0022\036^[A-Za-z0-9.][A-Za-z0-9_.>-]*$'
  _globals['_BATCHCREATEEXAMPLEREQUEST'].fields_by_name['dataset_name']._loaded_options = None
  _globals['_BATCHCREATEEXAMPLEREQUEST'].fields_by_name['dataset_name']._serialized_options = b'\372B%r#(\200\0022\036^[A-Za-z0-9.][A-Za-z0-9_.>-]*$'
  _globals['_TRUNCATEDATASETREQUEST'].fields_by_name['dataset_name']._loaded_options = None
  _globals['_TRUNCATEDATASETREQUEST'].fields_by_name['dataset_name']._serialized_options = b'\372B%r#(\200\0022\036^[A-Za-z0-9.][A-Za-z0-9_.>-]*$'
  _globals['_TRAININGREQUESTOPTIONS'].fields_by_name['limit']._loaded_options = None
  _globals['_TRAININGREQUESTOPTIONS'].fields_by_name['limit']._serialized_options = b'\372B\006\"\004\030d \000'
  _globals['_MODELREQUESTOPTIONS'].fields_by_name['limit']._loaded_options = None
  _globals['_MODELREQUESTOPTIONS'].fields_by_name['limit']._serialized_options = b'\372B\006\"\004\030d \000'
  _globals['_GETDATASETTRAININGSREQUEST'].fields_by_name['dataset_name']._loaded_options = None
  _globals['_GETDATASETTRAININGSREQUEST'].fields_by_name['dataset_name']._serialized_options = b'\372B%r#(\200\0022\036^[A-Za-z0-9.][A-Za-z0-9_.>-]*$'
  _globals['_GETDATASETMODELSREQUEST'].fields_by_name['dataset_name']._loaded_options = None
  _globals['_GETDATASETMODELSREQUEST'].fields_by_name['dataset_name']._serialized_options = b'\372B%r#(\200\0022\036^[A-Za-z0-9.][A-Za-z0-9_.>-]*$'
  _globals['_DATASETSERVICE']._loaded_options = None
  _globals['_DATASETSERVICE']._serialized_options = b'\222AD\022BManage datasets and examples used for training AutoSuggest models.'
  _globals['_DATASETSERVICE'].methods_by_name['GetDataset']._loaded_options = None
  _globals['_DATASETSERVICE'].methods_by_name['GetDataset']._serialized_options = b'\202\323\344\223\002\035\022\033/v2/datasets/{dataset_name}'
  _globals['_DATASETSERVICE'].methods_by_name['CreateDataset']._loaded_options = None
  _globals['_DATASETSERVICE'].methods_by_name['CreateDataset']._serialized_options = b'\202\323\344\223\002\021\"\014/v2/datasets:\001*'
  _globals['_DATASETSERVICE'].methods_by_name['CreateOrUpdateDataset']._loaded_options = None
  _globals['_DATASETSERVICE'].methods_by_name['CreateOrUpdateDataset']._serialized_options = b'\202\323\344\223\002\035\032\033/v2/datasets/{dataset_name}'
  _globals['_DATASETSERVICE'].methods_by_name['DeleteDataset']._loaded_options = None
  _globals['_DATASETSERVICE'].methods_by_name['DeleteDataset']._serialized_options = b'\202\323\344\223\002\035*\033/v2/datasets/{dataset_name}'
  _globals['_DATASETSERVICE'].methods_by_name['DeleteTag']._loaded_options = None
  _globals['_DATASETSERVICE'].methods_by_name['DeleteTag']._serialized_options = b'\202\323\344\223\002\025*\023/v2/tags/{tag_name}'
  _globals['_DATASETSERVICE'].methods_by_name['CreateExample']._loaded_options = None
  _globals['_DATASETSERVICE'].methods_by_name['CreateExample']._serialized_options = b'\202\323\344\223\002)\"$/v2/datasets/{dataset_name}/examples:\001*'
  _globals['_DATASETSERVICE'].methods_by_name['CreateOrUpdateExample']._loaded_options = None
  _globals['_DATASETSERVICE'].methods_by_name['CreateOrUpdateExample']._serialized_options = b'\202\323\344\223\0026\0321/v2/datasets/{dataset_name}/examples/{example.id}:\001*'
  _globals['_DATASETSERVICE'].methods_by_name['BatchCreateExample']._loaded_options = None
  _globals['_DATASETSERVICE'].methods_by_name['BatchCreateExample']._serialized_options = b'\202\323\344\223\0025\"0/v2/datasets/{dataset_name}/examples:batchCreate:\001*'
  _globals['_DATASETSERVICE'].methods_by_name['TruncateDataset']._loaded_options = None
  _globals['_DATASETSERVICE'].methods_by_name['TruncateDataset']._serialized_options = b'\202\323\344\223\002&*$/v2/datasets/{dataset_name}/examples'
  _globals['_DATASETSERVICE'].methods_by_name['GetDatasetTrainings']._loaded_options = None
  _globals['_DATASETSERVICE'].methods_by_name['GetDatasetTrainings']._serialized_options = b'\202\323\344\223\002\'\022%/v2/datasets/{dataset_name}/trainings'
  _globals['_DATASETSERVICE'].methods_by_name['GetDatasetModels']._loaded_options = None
  _globals['_DATASETSERVICE'].methods_by_name['GetDatasetModels']._serialized_options = b'\202\323\344\223\002$\022\"/v2/datasets/{dataset_name}/models'
  _globals['_DATASETSERVICE'].methods_by_name['GetTrainings']._loaded_options = None
  _globals['_DATASETSERVICE'].methods_by_name['GetTrainings']._serialized_options = b'\202\323\344\223\002\017\022\r/v2/trainings'
  _globals['_GETDATASETREQUEST']._serialized_start=316
  _globals['_GETDATASETREQUEST']._serialized_end=412
  _globals['_CREATEDATASETREQUEST']._serialized_start=415
  _globals['_CREATEDATASETREQUEST']._serialized_end=643
  _globals['_CREATEORUPDATEDATASETREQUEST']._serialized_start=645
  _globals['_CREATEORUPDATEDATASETREQUEST']._serialized_end=752
  _globals['_DELETEDATASETREQUEST']._serialized_start=754
  _globals['_DELETEDATASETREQUEST']._serialized_end=853
  _globals['_DELETETAGREQUEST']._serialized_start=855
  _globals['_DELETETAGREQUEST']._serialized_end=942
  _globals['_CREATEEXAMPLEREQUEST']._serialized_start=945
  _globals['_CREATEEXAMPLEREQUEST']._serialized_end=1093
  _globals['_CREATEORUPDATEEXAMPLEREQUEST']._serialized_start=1096
  _globals['_CREATEORUPDATEEXAMPLEREQUEST']._serialized_end=1252
  _globals['_BATCHCREATEEXAMPLEREQUEST']._serialized_start=1255
  _globals['_BATCHCREATEEXAMPLEREQUEST']._serialized_end=1410
  _globals['_TRUNCATEDATASETREQUEST']._serialized_start=1412
  _globals['_TRUNCATEDATASETREQUEST']._serialized_end=1513
  _globals['_TRAININGREQUESTOPTIONS']._serialized_start=1515
  _globals['_TRAININGREQUESTOPTIONS']._serialized_end=1572
  _globals['_MODELREQUESTOPTIONS']._serialized_start=1574
  _globals['_MODELREQUESTOPTIONS']._serialized_end=1628
  _globals['_GETDATASETTRAININGSREQUEST']._serialized_start=1631
  _globals['_GETDATASETTRAININGSREQUEST']._serialized_end=1795
  _globals['_GETDATASETMODELSREQUEST']._serialized_start=1798
  _globals['_GETDATASETMODELSREQUEST']._serialized_end=1956
  _globals['_GETTRAININGSREQUEST']._serialized_start=1958
  _globals['_GETTRAININGSREQUEST']._serialized_end=2038
  _globals['_TRAININGSRESPONSE']._serialized_start=2040
  _globals['_TRAININGSRESPONSE']._serialized_end=2113
  _globals['_MODELSRESPONSE']._serialized_start=2115
  _globals['_MODELSRESPONSE']._serialized_end=2176
  _globals['_DATASETSERVICE']._serialized_start=2179
  _globals['_DATASETSERVICE']._serialized_end=3681
# @@protoc_insertion_point(module_scope)
