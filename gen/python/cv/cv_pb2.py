# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: cv/cv.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import http_pb2 as google_dot_api_dot_http__pb2
from ssn.type import candidate_pb2 as ssn_dot_type_dot_candidate__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x0b\x63v/cv.proto\x12\rcv.scanner.v1\x1a\x1cgoogle/api/annotations.proto\x1a\x15google/api/http.proto\x1a\x18ssn/type/candidate.proto\"\x92\x01\n\x13ScanDocumentRequest\x12\x33\n\x08\x64ocument\x18\x01 \x01(\x0b\x32\x17.cv.scanner.v1.DocumentR\x08\x64ocument\x12\x32\n\x08\x66\x65\x61tures\x18\x02 \x03(\x0b\x32\x16.cv.scanner.v1.FeatureR\x08\x66\x65\x61tures\x12\x12\n\x04tags\x18\x03 \x03(\tR\x04tags\"J\n\x14ScanDocumentResponse\x12\x32\n\norder_date\x18\x01 \x03(\x0b\x32\x13.ssn.type.CandidateR\torderDate\"\xbb\x03\n\x07\x46\x65\x61ture\x12/\n\x04type\x18\x01 \x01(\x0e\x32\x1b.cv.scanner.v1.Feature.TypeR\x04type\x12\x1f\n\x0bmax_results\x18\x02 \x01(\x05R\nmaxResults\"\xdd\x02\n\x04Type\x12\x0e\n\nFIRST_NAME\x10\x00\x12\r\n\tLAST_NAME\x10\x01\x12\x11\n\rDATE_OF_BIRTH\x10\x02\x12\t\n\x05PHONE\x10\x03\x12\t\n\x05\x45MAIL\x10\x04\x12\x0b\n\x07\x43OUNTRY\x10\x05\x12\x0f\n\x0bNATIONALITY\x10\x06\x12\x0f\n\x0bPOSTAL_CODE\x10\x07\x12\x0f\n\x0bPOSTAL_AREA\x10\x08\x12\x10\n\x0cMUNICIPALITY\x10\t\x12\n\n\x06\x43OUNTY\x10\n\x12\x0b\n\x07\x41\x44\x44RESS\x10\x0b\x12\x11\n\rEMPLOYER_NAME\x10\x0c\x12\x12\n\x0ePOSITION_TITLE\x10\r\x12\x08\n\x04\x44\x41TE\x10\x0e\x12\x12\n\x0eINSTITUTE_NAME\x10\x0f\x12\x12\n\x0eINSTITUTE_TYPE\x10\x10\x12\x15\n\x11\x41REA_OF_EDUCATION\x10\x11\x12\n\n\x06\x44\x45GREE\x10\x12\x12\x11\n\rAVERAGE_GRADE\x10\x13\x12\x08\n\x04NAME\x10\x14\x12\t\n\x05LEVEL\x10\x15\"[\n\x08\x44ocument\x12\x18\n\x07\x63ontent\x18\x01 \x01(\x0cR\x07\x63ontent\x12\x35\n\x06source\x18\x02 \x01(\x0b\x32\x1d.cv.scanner.v1.DocumentSourceR\x06source\"+\n\x0e\x44ocumentSource\x12\x19\n\x08http_uri\x18\x01 \x01(\tR\x07httpUri2\x82\x01\n\tCvScanner\x12u\n\x0cScanDocument\x12\".cv.scanner.v1.ScanDocumentRequest\x1a#.cv.scanner.v1.ScanDocumentResponse\"\x1c\x82\xd3\xe4\x93\x02\x16:\x01*\"\x11/v1/document:scanB1Z/github.com/e-conomic/vmlapis/gen/go/cv/cv/v1;cvb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'cv.cv_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'Z/github.com/e-conomic/vmlapis/gen/go/cv/cv/v1;cv'
  _CVSCANNER.methods_by_name['ScanDocument']._options = None
  _CVSCANNER.methods_by_name['ScanDocument']._serialized_options = b'\202\323\344\223\002\026:\001*\"\021/v1/document:scan'
  _SCANDOCUMENTREQUEST._serialized_start=110
  _SCANDOCUMENTREQUEST._serialized_end=256
  _SCANDOCUMENTRESPONSE._serialized_start=258
  _SCANDOCUMENTRESPONSE._serialized_end=332
  _FEATURE._serialized_start=335
  _FEATURE._serialized_end=778
  _FEATURE_TYPE._serialized_start=429
  _FEATURE_TYPE._serialized_end=778
  _DOCUMENT._serialized_start=780
  _DOCUMENT._serialized_end=871
  _DOCUMENTSOURCE._serialized_start=873
  _DOCUMENTSOURCE._serialized_end=916
  _CVSCANNER._serialized_start=919
  _CVSCANNER._serialized_end=1049
# @@protoc_insertion_point(module_scope)
