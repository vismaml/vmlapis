# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: ssn/mlservice/v2/mlservice.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.type import date_pb2 as google_dot_type_dot_date__pb2
from vml_proto.ssn.type import candidate_pb2 as ssn_dot_type_dot_candidate__pb2
from vml_proto.ssn.type import text_annotation_pb2 as ssn_dot_type_dot_text__annotation__pb2
from tensorflow.core.example import example_pb2 as tensorflow_dot_core_dot_example_dot_example__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='ssn/mlservice/v2/mlservice.proto',
  package='ssn.mlservice.v2',
  syntax='proto3',
  serialized_options=b'B\017MlServiceProtosZ>github.com/e-conomic/vmlapis/gen/go/ssn/mlservice/v2;mlservice',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n ssn/mlservice/v2/mlservice.proto\x12\x10ssn.mlservice.v2\x1a\x16google/type/date.proto\x1a\x18ssn/type/candidate.proto\x1a\x1essn/type/text_annotation.proto\x1a%tensorflow/core/example/example.proto\"\xb0\x06\n\x11\x46\x65\x61tureGenRequest\x12\x45\n\x0ctruth_labels\x18\x01 \x01(\x0b\x32/.ssn.mlservice.v2.FeatureGenRequest.TruthLabels\x12\x31\n\x0ftext_annotation\x18\x02 \x01(\x0b\x32\x18.ssn.type.TextAnnotation\x12\n\n\x02id\x18\x03 \x01(\t\x1a\x94\x05\n\x0bTruthLabels\x12\x16\n\x0etotal_incl_vat\x18\x01 \x01(\x01\x12\x11\n\ttotal_vat\x18\x02 \x01(\x01\x12\x16\n\x0etotal_excl_vat\x18\x03 \x01(\x01\x12%\n\norder_date\x18\x04 \x01(\x0b\x32\x11.google.type.Date\x12+\n\x10payment_due_date\x18\x05 \x01(\x0b\x32\x11.google.type.Date\x12\x15\n\rdocument_type\x18\x06 \x01(\t\x12\x10\n\x08\x63urrency\x18\x07 \x01(\t\x12\x1a\n\x12\x63redit_card_number\x18\x08 \x01(\t\x12\x16\n\x0epayment_method\x18\t \x01(\t\x12\x18\n\x10ocr_line_dk_type\x18\n \x01(\t\x12\x1e\n\x16ocr_line_dk_payment_id\x18\x0b \x01(\t\x12\x1f\n\x17ocr_line_dk_creditor_id\x18\x0c \x01(\t\x12\x1e\n\x16ocr_line_se_payment_id\x18\r \x01(\t\x12(\n ocr_line_se_bankgiro_creditor_id\x18\x0e \x01(\t\x12(\n ocr_line_se_plusgiro_creditor_id\x18\x0f \x01(\t\x12\x1e\n\x16ocr_line_no_payment_id\x18\x10 \x01(\t\x12\x1e\n\x16ocr_line_fi_payment_id\x18\x11 \x01(\t\x12\x1e\n\x16ocr_line_nl_payment_id\x18\x12 \x01(\t\x12\x1d\n\x15supplier_corporate_id\x18\x13 \x01(\t\x12\x1d\n\x15supplier_country_code\x18\x14 \x01(\t\x12\x16\n\x0einvoice_number\x18\x15 \x01(\t\x12\x0c\n\x04iban\x18\x16 \x01(\t\":\n\x12\x46\x65\x61tureGenResponse\x12$\n\x07\x65xample\x18\x01 \x01(\x0b\x32\x13.tensorflow.Example\"T\n\x0ePredictRequest\x12$\n\x07\x65xample\x18\x01 \x01(\x0b\x32\x13.tensorflow.Example\x12\x1c\n\x14top_n_most_confident\x18\x02 \x01(\r\"\xe8\x08\n\x0fPredictResponse\x12\'\n\norder_date\x18\x01 \x03(\x0b\x32\x13.ssn.type.Candidate\x12-\n\x10payment_due_date\x18\x02 \x03(\x0b\x32\x13.ssn.type.Candidate\x12%\n\x08\x63urrency\x18\x03 \x03(\x0b\x32\x13.ssn.type.Candidate\x12&\n\ttotal_vat\x18\x04 \x03(\x0b\x32\x13.ssn.type.Candidate\x12+\n\x0etotal_incl_vat\x18\x05 \x03(\x0b\x32\x13.ssn.type.Candidate\x12+\n\x0etotal_excl_vat\x18\x06 \x03(\x0b\x32\x13.ssn.type.Candidate\x12\x32\n\x15supplier_corporate_id\x18\x07 \x03(\x0b\x32\x13.ssn.type.Candidate\x12\x32\n\x15supplier_country_code\x18\x08 \x03(\x0b\x32\x13.ssn.type.Candidate\x12*\n\rdocument_type\x18\t \x03(\x0b\x32\x13.ssn.type.Candidate\x12+\n\x0epayment_method\x18\n \x03(\x0b\x32\x13.ssn.type.Candidate\x12/\n\x12\x63redit_card_number\x18\x0b \x03(\x0b\x32\x13.ssn.type.Candidate\x12+\n\x0einvoice_number\x18\x0c \x03(\x0b\x32\x13.ssn.type.Candidate\x12-\n\x10ocr_line_dk_type\x18\r \x03(\x0b\x32\x13.ssn.type.Candidate\x12\x33\n\x16ocr_line_dk_payment_id\x18\x0e \x03(\x0b\x32\x13.ssn.type.Candidate\x12\x34\n\x17ocr_line_dk_creditor_id\x18\x0f \x03(\x0b\x32\x13.ssn.type.Candidate\x12\x33\n\x16ocr_line_se_payment_id\x18\x10 \x03(\x0b\x32\x13.ssn.type.Candidate\x12=\n ocr_line_se_bankgiro_creditor_id\x18\x11 \x03(\x0b\x32\x13.ssn.type.Candidate\x12=\n ocr_line_se_plusgiro_creditor_id\x18\x12 \x03(\x0b\x32\x13.ssn.type.Candidate\x12\x33\n\x16ocr_line_no_payment_id\x18\x13 \x03(\x0b\x32\x13.ssn.type.Candidate\x12\x33\n\x16ocr_line_fi_payment_id\x18\x14 \x03(\x0b\x32\x13.ssn.type.Candidate\x12\x33\n\x16ocr_line_nl_payment_id\x18\x15 \x03(\x0b\x32\x13.ssn.type.Candidate\x12!\n\x04iban\x18\x16 \x03(\x0b\x32\x13.ssn.type.Candidate\x12&\n\x05lines\x18\x17 \x03(\x0b\x32\x17.ssn.type.LineCandidate\"\x97\x01\n\x18\x46\x65\x61tureGenPredictRequest\x12@\n\x13\x66\x65\x61ture_gen_request\x18\x01 \x01(\x0b\x32#.ssn.mlservice.v2.FeatureGenRequest\x12\x39\n\x0fpredict_request\x18\x02 \x01(\x0b\x32 .ssn.mlservice.v2.PredictRequest2\x98\x02\n\tMlService\x12W\n\nFeatureGen\x12#.ssn.mlservice.v2.FeatureGenRequest\x1a$.ssn.mlservice.v2.FeatureGenResponse\x12N\n\x07Predict\x12 .ssn.mlservice.v2.PredictRequest\x1a!.ssn.mlservice.v2.PredictResponse\x12\x62\n\x11\x46\x65\x61tureGenPredict\x12*.ssn.mlservice.v2.FeatureGenPredictRequest\x1a!.ssn.mlservice.v2.PredictResponseBQB\x0fMlServiceProtosZ>github.com/e-conomic/vmlapis/gen/go/ssn/mlservice/v2;mlserviceb\x06proto3'
  ,
  dependencies=[google_dot_type_dot_date__pb2.DESCRIPTOR,ssn_dot_type_dot_candidate__pb2.DESCRIPTOR,ssn_dot_type_dot_text__annotation__pb2.DESCRIPTOR,tensorflow_dot_core_dot_example_dot_example__pb2.DESCRIPTOR,])




_FEATUREGENREQUEST_TRUTHLABELS = _descriptor.Descriptor(
  name='TruthLabels',
  full_name='ssn.mlservice.v2.FeatureGenRequest.TruthLabels',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='total_incl_vat', full_name='ssn.mlservice.v2.FeatureGenRequest.TruthLabels.total_incl_vat', index=0,
      number=1, type=1, cpp_type=5, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='total_vat', full_name='ssn.mlservice.v2.FeatureGenRequest.TruthLabels.total_vat', index=1,
      number=2, type=1, cpp_type=5, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='total_excl_vat', full_name='ssn.mlservice.v2.FeatureGenRequest.TruthLabels.total_excl_vat', index=2,
      number=3, type=1, cpp_type=5, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='order_date', full_name='ssn.mlservice.v2.FeatureGenRequest.TruthLabels.order_date', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='payment_due_date', full_name='ssn.mlservice.v2.FeatureGenRequest.TruthLabels.payment_due_date', index=4,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='document_type', full_name='ssn.mlservice.v2.FeatureGenRequest.TruthLabels.document_type', index=5,
      number=6, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='currency', full_name='ssn.mlservice.v2.FeatureGenRequest.TruthLabels.currency', index=6,
      number=7, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='credit_card_number', full_name='ssn.mlservice.v2.FeatureGenRequest.TruthLabels.credit_card_number', index=7,
      number=8, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='payment_method', full_name='ssn.mlservice.v2.FeatureGenRequest.TruthLabels.payment_method', index=8,
      number=9, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='ocr_line_dk_type', full_name='ssn.mlservice.v2.FeatureGenRequest.TruthLabels.ocr_line_dk_type', index=9,
      number=10, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='ocr_line_dk_payment_id', full_name='ssn.mlservice.v2.FeatureGenRequest.TruthLabels.ocr_line_dk_payment_id', index=10,
      number=11, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='ocr_line_dk_creditor_id', full_name='ssn.mlservice.v2.FeatureGenRequest.TruthLabels.ocr_line_dk_creditor_id', index=11,
      number=12, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='ocr_line_se_payment_id', full_name='ssn.mlservice.v2.FeatureGenRequest.TruthLabels.ocr_line_se_payment_id', index=12,
      number=13, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='ocr_line_se_bankgiro_creditor_id', full_name='ssn.mlservice.v2.FeatureGenRequest.TruthLabels.ocr_line_se_bankgiro_creditor_id', index=13,
      number=14, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='ocr_line_se_plusgiro_creditor_id', full_name='ssn.mlservice.v2.FeatureGenRequest.TruthLabels.ocr_line_se_plusgiro_creditor_id', index=14,
      number=15, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='ocr_line_no_payment_id', full_name='ssn.mlservice.v2.FeatureGenRequest.TruthLabels.ocr_line_no_payment_id', index=15,
      number=16, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='ocr_line_fi_payment_id', full_name='ssn.mlservice.v2.FeatureGenRequest.TruthLabels.ocr_line_fi_payment_id', index=16,
      number=17, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='ocr_line_nl_payment_id', full_name='ssn.mlservice.v2.FeatureGenRequest.TruthLabels.ocr_line_nl_payment_id', index=17,
      number=18, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='supplier_corporate_id', full_name='ssn.mlservice.v2.FeatureGenRequest.TruthLabels.supplier_corporate_id', index=18,
      number=19, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='supplier_country_code', full_name='ssn.mlservice.v2.FeatureGenRequest.TruthLabels.supplier_country_code', index=19,
      number=20, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='invoice_number', full_name='ssn.mlservice.v2.FeatureGenRequest.TruthLabels.invoice_number', index=20,
      number=21, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='iban', full_name='ssn.mlservice.v2.FeatureGenRequest.TruthLabels.iban', index=21,
      number=22, type=9, cpp_type=9, label=1,
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
  serialized_start=332,
  serialized_end=992,
)

_FEATUREGENREQUEST = _descriptor.Descriptor(
  name='FeatureGenRequest',
  full_name='ssn.mlservice.v2.FeatureGenRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='truth_labels', full_name='ssn.mlservice.v2.FeatureGenRequest.truth_labels', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='text_annotation', full_name='ssn.mlservice.v2.FeatureGenRequest.text_annotation', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='id', full_name='ssn.mlservice.v2.FeatureGenRequest.id', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_FEATUREGENREQUEST_TRUTHLABELS, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=176,
  serialized_end=992,
)


_FEATUREGENRESPONSE = _descriptor.Descriptor(
  name='FeatureGenResponse',
  full_name='ssn.mlservice.v2.FeatureGenResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='example', full_name='ssn.mlservice.v2.FeatureGenResponse.example', index=0,
      number=1, type=11, cpp_type=10, label=1,
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
  serialized_start=994,
  serialized_end=1052,
)


_PREDICTREQUEST = _descriptor.Descriptor(
  name='PredictRequest',
  full_name='ssn.mlservice.v2.PredictRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='example', full_name='ssn.mlservice.v2.PredictRequest.example', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='top_n_most_confident', full_name='ssn.mlservice.v2.PredictRequest.top_n_most_confident', index=1,
      number=2, type=13, cpp_type=3, label=1,
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
  serialized_start=1054,
  serialized_end=1138,
)


_PREDICTRESPONSE = _descriptor.Descriptor(
  name='PredictResponse',
  full_name='ssn.mlservice.v2.PredictResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='order_date', full_name='ssn.mlservice.v2.PredictResponse.order_date', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='payment_due_date', full_name='ssn.mlservice.v2.PredictResponse.payment_due_date', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='currency', full_name='ssn.mlservice.v2.PredictResponse.currency', index=2,
      number=3, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='total_vat', full_name='ssn.mlservice.v2.PredictResponse.total_vat', index=3,
      number=4, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='total_incl_vat', full_name='ssn.mlservice.v2.PredictResponse.total_incl_vat', index=4,
      number=5, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='total_excl_vat', full_name='ssn.mlservice.v2.PredictResponse.total_excl_vat', index=5,
      number=6, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='supplier_corporate_id', full_name='ssn.mlservice.v2.PredictResponse.supplier_corporate_id', index=6,
      number=7, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='supplier_country_code', full_name='ssn.mlservice.v2.PredictResponse.supplier_country_code', index=7,
      number=8, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='document_type', full_name='ssn.mlservice.v2.PredictResponse.document_type', index=8,
      number=9, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='payment_method', full_name='ssn.mlservice.v2.PredictResponse.payment_method', index=9,
      number=10, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='credit_card_number', full_name='ssn.mlservice.v2.PredictResponse.credit_card_number', index=10,
      number=11, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='invoice_number', full_name='ssn.mlservice.v2.PredictResponse.invoice_number', index=11,
      number=12, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='ocr_line_dk_type', full_name='ssn.mlservice.v2.PredictResponse.ocr_line_dk_type', index=12,
      number=13, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='ocr_line_dk_payment_id', full_name='ssn.mlservice.v2.PredictResponse.ocr_line_dk_payment_id', index=13,
      number=14, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='ocr_line_dk_creditor_id', full_name='ssn.mlservice.v2.PredictResponse.ocr_line_dk_creditor_id', index=14,
      number=15, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='ocr_line_se_payment_id', full_name='ssn.mlservice.v2.PredictResponse.ocr_line_se_payment_id', index=15,
      number=16, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='ocr_line_se_bankgiro_creditor_id', full_name='ssn.mlservice.v2.PredictResponse.ocr_line_se_bankgiro_creditor_id', index=16,
      number=17, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='ocr_line_se_plusgiro_creditor_id', full_name='ssn.mlservice.v2.PredictResponse.ocr_line_se_plusgiro_creditor_id', index=17,
      number=18, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='ocr_line_no_payment_id', full_name='ssn.mlservice.v2.PredictResponse.ocr_line_no_payment_id', index=18,
      number=19, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='ocr_line_fi_payment_id', full_name='ssn.mlservice.v2.PredictResponse.ocr_line_fi_payment_id', index=19,
      number=20, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='ocr_line_nl_payment_id', full_name='ssn.mlservice.v2.PredictResponse.ocr_line_nl_payment_id', index=20,
      number=21, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='iban', full_name='ssn.mlservice.v2.PredictResponse.iban', index=21,
      number=22, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='lines', full_name='ssn.mlservice.v2.PredictResponse.lines', index=22,
      number=23, type=11, cpp_type=10, label=3,
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
  serialized_start=1141,
  serialized_end=2269,
)


_FEATUREGENPREDICTREQUEST = _descriptor.Descriptor(
  name='FeatureGenPredictRequest',
  full_name='ssn.mlservice.v2.FeatureGenPredictRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='feature_gen_request', full_name='ssn.mlservice.v2.FeatureGenPredictRequest.feature_gen_request', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='predict_request', full_name='ssn.mlservice.v2.FeatureGenPredictRequest.predict_request', index=1,
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
  serialized_start=2272,
  serialized_end=2423,
)

_FEATUREGENREQUEST_TRUTHLABELS.fields_by_name['order_date'].message_type = google_dot_type_dot_date__pb2._DATE
_FEATUREGENREQUEST_TRUTHLABELS.fields_by_name['payment_due_date'].message_type = google_dot_type_dot_date__pb2._DATE
_FEATUREGENREQUEST_TRUTHLABELS.containing_type = _FEATUREGENREQUEST
_FEATUREGENREQUEST.fields_by_name['truth_labels'].message_type = _FEATUREGENREQUEST_TRUTHLABELS
_FEATUREGENREQUEST.fields_by_name['text_annotation'].message_type = ssn_dot_type_dot_text__annotation__pb2._TEXTANNOTATION
_FEATUREGENRESPONSE.fields_by_name['example'].message_type = tensorflow_dot_core_dot_example_dot_example__pb2._EXAMPLE
_PREDICTREQUEST.fields_by_name['example'].message_type = tensorflow_dot_core_dot_example_dot_example__pb2._EXAMPLE
_PREDICTRESPONSE.fields_by_name['order_date'].message_type = ssn_dot_type_dot_candidate__pb2._CANDIDATE
_PREDICTRESPONSE.fields_by_name['payment_due_date'].message_type = ssn_dot_type_dot_candidate__pb2._CANDIDATE
_PREDICTRESPONSE.fields_by_name['currency'].message_type = ssn_dot_type_dot_candidate__pb2._CANDIDATE
_PREDICTRESPONSE.fields_by_name['total_vat'].message_type = ssn_dot_type_dot_candidate__pb2._CANDIDATE
_PREDICTRESPONSE.fields_by_name['total_incl_vat'].message_type = ssn_dot_type_dot_candidate__pb2._CANDIDATE
_PREDICTRESPONSE.fields_by_name['total_excl_vat'].message_type = ssn_dot_type_dot_candidate__pb2._CANDIDATE
_PREDICTRESPONSE.fields_by_name['supplier_corporate_id'].message_type = ssn_dot_type_dot_candidate__pb2._CANDIDATE
_PREDICTRESPONSE.fields_by_name['supplier_country_code'].message_type = ssn_dot_type_dot_candidate__pb2._CANDIDATE
_PREDICTRESPONSE.fields_by_name['document_type'].message_type = ssn_dot_type_dot_candidate__pb2._CANDIDATE
_PREDICTRESPONSE.fields_by_name['payment_method'].message_type = ssn_dot_type_dot_candidate__pb2._CANDIDATE
_PREDICTRESPONSE.fields_by_name['credit_card_number'].message_type = ssn_dot_type_dot_candidate__pb2._CANDIDATE
_PREDICTRESPONSE.fields_by_name['invoice_number'].message_type = ssn_dot_type_dot_candidate__pb2._CANDIDATE
_PREDICTRESPONSE.fields_by_name['ocr_line_dk_type'].message_type = ssn_dot_type_dot_candidate__pb2._CANDIDATE
_PREDICTRESPONSE.fields_by_name['ocr_line_dk_payment_id'].message_type = ssn_dot_type_dot_candidate__pb2._CANDIDATE
_PREDICTRESPONSE.fields_by_name['ocr_line_dk_creditor_id'].message_type = ssn_dot_type_dot_candidate__pb2._CANDIDATE
_PREDICTRESPONSE.fields_by_name['ocr_line_se_payment_id'].message_type = ssn_dot_type_dot_candidate__pb2._CANDIDATE
_PREDICTRESPONSE.fields_by_name['ocr_line_se_bankgiro_creditor_id'].message_type = ssn_dot_type_dot_candidate__pb2._CANDIDATE
_PREDICTRESPONSE.fields_by_name['ocr_line_se_plusgiro_creditor_id'].message_type = ssn_dot_type_dot_candidate__pb2._CANDIDATE
_PREDICTRESPONSE.fields_by_name['ocr_line_no_payment_id'].message_type = ssn_dot_type_dot_candidate__pb2._CANDIDATE
_PREDICTRESPONSE.fields_by_name['ocr_line_fi_payment_id'].message_type = ssn_dot_type_dot_candidate__pb2._CANDIDATE
_PREDICTRESPONSE.fields_by_name['ocr_line_nl_payment_id'].message_type = ssn_dot_type_dot_candidate__pb2._CANDIDATE
_PREDICTRESPONSE.fields_by_name['iban'].message_type = ssn_dot_type_dot_candidate__pb2._CANDIDATE
_PREDICTRESPONSE.fields_by_name['lines'].message_type = ssn_dot_type_dot_candidate__pb2._LINECANDIDATE
_FEATUREGENPREDICTREQUEST.fields_by_name['feature_gen_request'].message_type = _FEATUREGENREQUEST
_FEATUREGENPREDICTREQUEST.fields_by_name['predict_request'].message_type = _PREDICTREQUEST
DESCRIPTOR.message_types_by_name['FeatureGenRequest'] = _FEATUREGENREQUEST
DESCRIPTOR.message_types_by_name['FeatureGenResponse'] = _FEATUREGENRESPONSE
DESCRIPTOR.message_types_by_name['PredictRequest'] = _PREDICTREQUEST
DESCRIPTOR.message_types_by_name['PredictResponse'] = _PREDICTRESPONSE
DESCRIPTOR.message_types_by_name['FeatureGenPredictRequest'] = _FEATUREGENPREDICTREQUEST
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

FeatureGenRequest = _reflection.GeneratedProtocolMessageType('FeatureGenRequest', (_message.Message,), {

  'TruthLabels' : _reflection.GeneratedProtocolMessageType('TruthLabels', (_message.Message,), {
    'DESCRIPTOR' : _FEATUREGENREQUEST_TRUTHLABELS,
    '__module__' : 'ssn.mlservice.v2.mlservice_pb2'
    # @@protoc_insertion_point(class_scope:ssn.mlservice.v2.FeatureGenRequest.TruthLabels)
    })
  ,
  'DESCRIPTOR' : _FEATUREGENREQUEST,
  '__module__' : 'ssn.mlservice.v2.mlservice_pb2'
  # @@protoc_insertion_point(class_scope:ssn.mlservice.v2.FeatureGenRequest)
  })
_sym_db.RegisterMessage(FeatureGenRequest)
_sym_db.RegisterMessage(FeatureGenRequest.TruthLabels)

FeatureGenResponse = _reflection.GeneratedProtocolMessageType('FeatureGenResponse', (_message.Message,), {
  'DESCRIPTOR' : _FEATUREGENRESPONSE,
  '__module__' : 'ssn.mlservice.v2.mlservice_pb2'
  # @@protoc_insertion_point(class_scope:ssn.mlservice.v2.FeatureGenResponse)
  })
_sym_db.RegisterMessage(FeatureGenResponse)

PredictRequest = _reflection.GeneratedProtocolMessageType('PredictRequest', (_message.Message,), {
  'DESCRIPTOR' : _PREDICTREQUEST,
  '__module__' : 'ssn.mlservice.v2.mlservice_pb2'
  # @@protoc_insertion_point(class_scope:ssn.mlservice.v2.PredictRequest)
  })
_sym_db.RegisterMessage(PredictRequest)

PredictResponse = _reflection.GeneratedProtocolMessageType('PredictResponse', (_message.Message,), {
  'DESCRIPTOR' : _PREDICTRESPONSE,
  '__module__' : 'ssn.mlservice.v2.mlservice_pb2'
  # @@protoc_insertion_point(class_scope:ssn.mlservice.v2.PredictResponse)
  })
_sym_db.RegisterMessage(PredictResponse)

FeatureGenPredictRequest = _reflection.GeneratedProtocolMessageType('FeatureGenPredictRequest', (_message.Message,), {
  'DESCRIPTOR' : _FEATUREGENPREDICTREQUEST,
  '__module__' : 'ssn.mlservice.v2.mlservice_pb2'
  # @@protoc_insertion_point(class_scope:ssn.mlservice.v2.FeatureGenPredictRequest)
  })
_sym_db.RegisterMessage(FeatureGenPredictRequest)


DESCRIPTOR._options = None

_MLSERVICE = _descriptor.ServiceDescriptor(
  name='MlService',
  full_name='ssn.mlservice.v2.MlService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  create_key=_descriptor._internal_create_key,
  serialized_start=2426,
  serialized_end=2706,
  methods=[
  _descriptor.MethodDescriptor(
    name='FeatureGen',
    full_name='ssn.mlservice.v2.MlService.FeatureGen',
    index=0,
    containing_service=None,
    input_type=_FEATUREGENREQUEST,
    output_type=_FEATUREGENRESPONSE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='Predict',
    full_name='ssn.mlservice.v2.MlService.Predict',
    index=1,
    containing_service=None,
    input_type=_PREDICTREQUEST,
    output_type=_PREDICTRESPONSE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='FeatureGenPredict',
    full_name='ssn.mlservice.v2.MlService.FeatureGenPredict',
    index=2,
    containing_service=None,
    input_type=_FEATUREGENPREDICTREQUEST,
    output_type=_PREDICTRESPONSE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_MLSERVICE)

DESCRIPTOR.services_by_name['MlService'] = _MLSERVICE

# @@protoc_insertion_point(module_scope)
