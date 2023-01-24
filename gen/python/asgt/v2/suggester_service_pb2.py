# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: asgt/v2/suggester_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from vml_proto.asgt.type import model_pb2 as asgt_dot_type_dot_model__pb2
from vml_proto.asgt.type import prediction_pb2 as asgt_dot_type_dot_prediction__pb2
from vml_proto.asgt.v2.type import data_pb2 as asgt_dot_v2_dot_type_dot_data__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from protoc_gen_openapiv2.options import annotations_pb2 as protoc__gen__openapiv2_dot_options_dot_annotations__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1f\x61sgt/v2/suggester_service.proto\x12\x07\x61sgt.v2\x1a\x15\x61sgt/type/model.proto\x1a\x1a\x61sgt/type/prediction.proto\x1a\x17\x61sgt/v2/type/data.proto\x1a\x1cgoogle/api/annotations.proto\x1a.protoc-gen-openapiv2/options/annotations.proto\x1a\x17validate/validate.proto\"\x83\x01\n\x0eSuggestOptions\x12#\n\rsuggest_limit\x18\x01 \x01(\x05R\x0csuggestLimit\x12L\n\x0emin_confidence\x18\x02 \x01(\x0e\x32\x1b.asgt.type.Confidence.LevelB\x08\xfa\x42\x05\x82\x01\x02\x10\x01R\rminConfidence\"\xba\x01\n\x0eSuggestRequest\x12K\n\x0c\x64\x61taset_name\x18\x01 \x01(\tB(\xfa\x42%r#(\x80\x02\x32\x1e^[A-Za-z0-9.][A-Za-z0-9_.>-]*$R\x0b\x64\x61tasetName\x12(\n\x05input\x18\x02 \x01(\x0b\x32\x12.asgt.v2.type.DataR\x05input\x12\x31\n\x07options\x18\x03 \x01(\x0b\x32\x17.asgt.v2.SuggestOptionsR\x07options\"p\n\x0fSuggestResponse\x12\x35\n\nprediction\x18\x01 \x01(\x0b\x32\x15.asgt.type.PredictionR\nprediction\x12&\n\x05model\x18\x02 \x01(\x0b\x32\x10.asgt.type.ModelR\x05model\"\xc1\x01\n\x13\x42\x61tchSuggestRequest\x12K\n\x0c\x64\x61taset_name\x18\x01 \x01(\tB(\xfa\x42%r#(\x80\x02\x32\x1e^[A-Za-z0-9.][A-Za-z0-9_.>-]*$R\x0b\x64\x61tasetName\x12*\n\x06inputs\x18\x02 \x03(\x0b\x32\x12.asgt.v2.type.DataR\x06inputs\x12\x31\n\x07options\x18\x03 \x01(\x0b\x32\x17.asgt.v2.SuggestOptionsR\x07options\"w\n\x14\x42\x61tchSuggestResponse\x12\x37\n\x0bpredictions\x18\x01 \x03(\x0b\x32\x15.asgt.type.PredictionR\x0bpredictions\x12&\n\x05model\x18\x02 \x01(\x0b\x32\x10.asgt.type.ModelR\x05model2\xbb\x03\n\x10SuggesterService\x12l\n\x07Suggest\x12\x17.asgt.v2.SuggestRequest\x1a\x18.asgt.v2.SuggestResponse\".\x82\xd3\xe4\x93\x02(:\x01*\"#/v2/datasets/{dataset_name}:suggest\x12\x80\x01\n\x0c\x42\x61tchSuggest\x12\x1c.asgt.v2.BatchSuggestRequest\x1a\x1d.asgt.v2.BatchSuggestResponse\"3\x82\xd3\xe4\x93\x02-:\x01*\"(/v2/datasets/{dataset_name}:batchSuggest\x12\x8b\x01\n\x11ModelBatchSuggest\x12\x1c.asgt.v2.BatchSuggestRequest\x1a\x1d.asgt.v2.BatchSuggestResponse\"9\x82\xd3\xe4\x93\x02\x33:\x01*\"./v2/datasets/{dataset_name}/model:batchSuggest\x1a(\x92\x41%\x12#Make predictions against a dataset.B\xd0\x01\n\x10\x61i.visma.asgt.v2B\x15SuggesterServiceProtoP\x01Z+github.com/e-conomic/vmlapis/gen/go/asgt/v2\xa2\x02\x03\x41XX\xaa\x02\x07\x41sgt.V2\xca\x02\x07\x41sgt\\V2\xe2\x02\x13\x41sgt\\V2\\GPBMetadata\xea\x02\x08\x41sgt::V2\x92\x41:\x12\x11\n\x0b\x41utoSuggest2\x02v2*\x01\x02\x32\x10\x61pplication/json:\x10\x61pplication/jsonb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'asgt.v2.suggester_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\020ai.visma.asgt.v2B\025SuggesterServiceProtoP\001Z+github.com/e-conomic/vmlapis/gen/go/asgt/v2\242\002\003AXX\252\002\007Asgt.V2\312\002\007Asgt\\V2\342\002\023Asgt\\V2\\GPBMetadata\352\002\010Asgt::V2\222A:\022\021\n\013AutoSuggest2\002v2*\001\0022\020application/json:\020application/json'
  _SUGGESTOPTIONS.fields_by_name['min_confidence']._options = None
  _SUGGESTOPTIONS.fields_by_name['min_confidence']._serialized_options = b'\372B\005\202\001\002\020\001'
  _SUGGESTREQUEST.fields_by_name['dataset_name']._options = None
  _SUGGESTREQUEST.fields_by_name['dataset_name']._serialized_options = b'\372B%r#(\200\0022\036^[A-Za-z0-9.][A-Za-z0-9_.>-]*$'
  _BATCHSUGGESTREQUEST.fields_by_name['dataset_name']._options = None
  _BATCHSUGGESTREQUEST.fields_by_name['dataset_name']._serialized_options = b'\372B%r#(\200\0022\036^[A-Za-z0-9.][A-Za-z0-9_.>-]*$'
  _SUGGESTERSERVICE._options = None
  _SUGGESTERSERVICE._serialized_options = b'\222A%\022#Make predictions against a dataset.'
  _SUGGESTERSERVICE.methods_by_name['Suggest']._options = None
  _SUGGESTERSERVICE.methods_by_name['Suggest']._serialized_options = b'\202\323\344\223\002(:\001*\"#/v2/datasets/{dataset_name}:suggest'
  _SUGGESTERSERVICE.methods_by_name['BatchSuggest']._options = None
  _SUGGESTERSERVICE.methods_by_name['BatchSuggest']._serialized_options = b'\202\323\344\223\002-:\001*\"(/v2/datasets/{dataset_name}:batchSuggest'
  _SUGGESTERSERVICE.methods_by_name['ModelBatchSuggest']._options = None
  _SUGGESTERSERVICE.methods_by_name['ModelBatchSuggest']._serialized_options = b'\202\323\344\223\0023:\001*\"./v2/datasets/{dataset_name}/model:batchSuggest'
  _SUGGESTOPTIONS._serialized_start=224
  _SUGGESTOPTIONS._serialized_end=355
  _SUGGESTREQUEST._serialized_start=358
  _SUGGESTREQUEST._serialized_end=544
  _SUGGESTRESPONSE._serialized_start=546
  _SUGGESTRESPONSE._serialized_end=658
  _BATCHSUGGESTREQUEST._serialized_start=661
  _BATCHSUGGESTREQUEST._serialized_end=854
  _BATCHSUGGESTRESPONSE._serialized_start=856
  _BATCHSUGGESTRESPONSE._serialized_end=975
  _SUGGESTERSERVICE._serialized_start=978
  _SUGGESTERSERVICE._serialized_end=1421
# @@protoc_insertion_point(module_scope)
