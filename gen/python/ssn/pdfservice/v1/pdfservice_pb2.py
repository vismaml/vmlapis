# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# NO CHECKED-IN PROTOBUF GENCODE
# source: ssn/pdfservice/v1/pdfservice.proto
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
    'ssn/pdfservice/v1/pdfservice.proto'
)
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\"ssn/pdfservice/v1/pdfservice.proto\x12\x11ssn.pdfservice.v1\"\xaa\x03\n\x13RasterizePdfRequest\x12\x12\n\x04\x64\x61ta\x18\x01 \x01(\x0cR\x04\x64\x61ta\x12\x10\n\x03\x64pi\x18\x02 \x01(\rR\x03\x64pi\x12\x45\n\x06\x66ormat\x18\x03 \x01(\x0e\x32-.ssn.pdfservice.v1.RasterizePdfRequest.FormatR\x06\x66ormat\x12G\n\x05\x63olor\x18\x04 \x01(\x0e\x32\x31.ssn.pdfservice.v1.RasterizePdfRequest.ColorSpaceR\x05\x63olor\x12G\n\x05pages\x18\x05 \x01(\x0e\x32\x31.ssn.pdfservice.v1.RasterizePdfRequest.PageOptionR\x05pages\"%\n\x06\x46ormat\x12\x07\n\x03PNG\x10\x00\x12\x08\n\x04JPEG\x10\x01\x12\x08\n\x04WEBP\x10\x02\"!\n\nColorSpace\x12\x08\n\x04GRAY\x10\x00\x12\t\n\x05\x43OLOR\x10\x01\"J\n\nPageOption\x12\x0e\n\nFIRST_LAST\x10\x00\x12\t\n\x05\x46IRST\x10\x01\x12\x08\n\x04LAST\x10\x02\x12\x07\n\x03\x41LL\x10\x03\x12\x0e\n\nFIRST_FIVE\x10\x04\"\x84\x01\n\x14RasterizePdfResponse\x12\x14\n\x05index\x18\x01 \x01(\rR\x05index\x12\x12\n\x04\x64\x61ta\x18\x02 \x01(\x0cR\x04\x64\x61ta\x12\x14\n\x05width\x18\x03 \x01(\rR\x05width\x12\x16\n\x06height\x18\x04 \x01(\rR\x06height\x12\x14\n\x05scale\x18\x05 \x01(\x01R\x05scale2\xda\x01\n\nPdfService\x12i\n\x14InternalRasterizePdf\x12&.ssn.pdfservice.v1.RasterizePdfRequest\x1a\'.ssn.pdfservice.v1.RasterizePdfResponse0\x01\x12\x61\n\x0cRasterizePdf\x12&.ssn.pdfservice.v1.RasterizePdfRequest\x1a\'.ssn.pdfservice.v1.RasterizePdfResponse0\x01\x42SB\x0fPdfServiceProtoZ@github.com/e-conomic/vmlapis/gen/go/ssn/pdfservice/v1;pdfserviceb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'ssn.pdfservice.v1.pdfservice_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'B\017PdfServiceProtoZ@github.com/e-conomic/vmlapis/gen/go/ssn/pdfservice/v1;pdfservice'
  _globals['_RASTERIZEPDFREQUEST']._serialized_start=58
  _globals['_RASTERIZEPDFREQUEST']._serialized_end=484
  _globals['_RASTERIZEPDFREQUEST_FORMAT']._serialized_start=336
  _globals['_RASTERIZEPDFREQUEST_FORMAT']._serialized_end=373
  _globals['_RASTERIZEPDFREQUEST_COLORSPACE']._serialized_start=375
  _globals['_RASTERIZEPDFREQUEST_COLORSPACE']._serialized_end=408
  _globals['_RASTERIZEPDFREQUEST_PAGEOPTION']._serialized_start=410
  _globals['_RASTERIZEPDFREQUEST_PAGEOPTION']._serialized_end=484
  _globals['_RASTERIZEPDFRESPONSE']._serialized_start=487
  _globals['_RASTERIZEPDFRESPONSE']._serialized_end=619
  _globals['_PDFSERVICE']._serialized_start=622
  _globals['_PDFSERVICE']._serialized_end=840
# @@protoc_insertion_point(module_scope)
