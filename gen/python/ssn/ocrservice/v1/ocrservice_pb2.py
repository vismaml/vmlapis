# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: ssn/ocrservice/v1/ocrservice.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2
from vml_proto.ssn.annotator.v1 import annotator_pb2 as ssn_dot_annotator_dot_v1_dot_annotator__pb2
from vml_proto.ssn.type import text_annotation_pb2 as ssn_dot_type_dot_text__annotation__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\"ssn/ocrservice/v1/ocrservice.proto\x12\x11ssn.ocrservice.v1\x1a\x1egoogle/protobuf/wrappers.proto\x1a ssn/annotator/v1/annotator.proto\x1a\x1essn/type/text_annotation.proto\"l\n\x18GetTextAnnotationRequest\x12\x36\n\x08\x64ocument\x18\x02 \x01(\x0b\x32\x1a.ssn.annotator.v1.DocumentR\x08\x64ocument\x12\x18\n\x07preview\x18\x03 \x01(\x08R\x07preview\"\x91\x01\n\x19GetTextAnnotationResponse\x12\x41\n\x0ftext_annotation\x18\x02 \x01(\x0b\x32\x18.ssn.type.TextAnnotationR\x0etextAnnotation\x12\x31\n\x05image\x18\x03 \x01(\x0b\x32\x1b.google.protobuf.BytesValueR\x05image\")\n\x13OcrScanImageRequest\x12\x12\n\x04\x64\x61ta\x18\x01 \x01(\x0cR\x04\x64\x61ta\"3\n\x14OcrScanImageResponse\x12\x1b\n\ttess_hocr\x18\x01 \x01(\tR\x08tessHocr2\xdd\x01\n\nOcrService\x12_\n\x0cOcrScanImage\x12&.ssn.ocrservice.v1.OcrScanImageRequest\x1a\'.ssn.ocrservice.v1.OcrScanImageResponse\x12n\n\x11GetTextAnnotation\x12+.ssn.ocrservice.v1.GetTextAnnotationRequest\x1a,.ssn.ocrservice.v1.GetTextAnnotationResponseBSB\x0fOcrServiceProtoZ@github.com/e-conomic/vmlapis/gen/go/ssn/ocrservice/v1;ocrserviceb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'ssn.ocrservice.v1.ocrservice_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'B\017OcrServiceProtoZ@github.com/e-conomic/vmlapis/gen/go/ssn/ocrservice/v1;ocrservice'
  _globals['_GETTEXTANNOTATIONREQUEST']._serialized_start=155
  _globals['_GETTEXTANNOTATIONREQUEST']._serialized_end=263
  _globals['_GETTEXTANNOTATIONRESPONSE']._serialized_start=266
  _globals['_GETTEXTANNOTATIONRESPONSE']._serialized_end=411
  _globals['_OCRSCANIMAGEREQUEST']._serialized_start=413
  _globals['_OCRSCANIMAGEREQUEST']._serialized_end=454
  _globals['_OCRSCANIMAGERESPONSE']._serialized_start=456
  _globals['_OCRSCANIMAGERESPONSE']._serialized_end=507
  _globals['_OCRSERVICE']._serialized_start=510
  _globals['_OCRSERVICE']._serialized_end=731
# @@protoc_insertion_point(module_scope)
