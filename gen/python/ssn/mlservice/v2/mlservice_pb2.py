# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: ssn/mlservice/v2/mlservice.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from vml_proto.google.type import date_pb2 as google_dot_type_dot_date__pb2
from vml_proto.ssn.type import candidate_pb2 as ssn_dot_type_dot_candidate__pb2
from vml_proto.ssn.type import text_annotation_pb2 as ssn_dot_type_dot_text__annotation__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n ssn/mlservice/v2/mlservice.proto\x12\x10ssn.mlservice.v2\x1a\x16google/type/date.proto\x1a\x18ssn/type/candidate.proto\x1a\x1essn/type/text_annotation.proto\"\x86\x10\n\x11\x46\x65\x61tureGenRequest\x12R\n\x0ctruth_labels\x18\x01 \x01(\x0b\x32/.ssn.mlservice.v2.FeatureGenRequest.TruthLabelsR\x0btruthLabels\x12\x41\n\x0ftext_annotation\x18\x02 \x01(\x0b\x32\x18.ssn.type.TextAnnotationR\x0etextAnnotation\x12\x0e\n\x02id\x18\x03 \x01(\tR\x02id\x1a\xc9\x0e\n\x0bTruthLabels\x12$\n\x0etotal_incl_vat\x18\x01 \x01(\x01R\x0ctotalInclVat\x12\x1b\n\ttotal_vat\x18\x02 \x01(\x01R\x08totalVat\x12$\n\x0etotal_excl_vat\x18\x03 \x01(\x01R\x0ctotalExclVat\x12\x30\n\norder_date\x18\x04 \x01(\x0b\x32\x11.google.type.DateR\torderDate\x12;\n\x10payment_due_date\x18\x05 \x01(\x0b\x32\x11.google.type.DateR\x0epaymentDueDate\x12#\n\rdocument_type\x18\x06 \x01(\tR\x0c\x64ocumentType\x12\x1a\n\x08\x63urrency\x18\x07 \x01(\tR\x08\x63urrency\x12,\n\x12\x63redit_card_number\x18\x08 \x01(\tR\x10\x63reditCardNumber\x12%\n\x0epayment_method\x18\t \x01(\tR\rpaymentMethod\x12\'\n\x10ocr_line_dk_type\x18\n \x01(\tR\rocrLineDkType\x12\x32\n\x16ocr_line_dk_payment_id\x18\x0b \x01(\tR\x12ocrLineDkPaymentId\x12\x34\n\x17ocr_line_dk_creditor_id\x18\x0c \x01(\tR\x13ocrLineDkCreditorId\x12\x32\n\x16ocr_line_se_payment_id\x18\r \x01(\tR\x12ocrLineSePaymentId\x12\x45\n ocr_line_se_bankgiro_creditor_id\x18\x0e \x01(\tR\x1bocrLineSeBankgiroCreditorId\x12\x45\n ocr_line_se_plusgiro_creditor_id\x18\x0f \x01(\tR\x1bocrLineSePlusgiroCreditorId\x12\x32\n\x16ocr_line_no_payment_id\x18\x10 \x01(\tR\x12ocrLineNoPaymentId\x12\x32\n\x16ocr_line_fi_payment_id\x18\x11 \x01(\tR\x12ocrLineFiPaymentId\x12\x32\n\x16ocr_line_nl_payment_id\x18\x12 \x01(\tR\x12ocrLineNlPaymentId\x12\x32\n\x15supplier_corporate_id\x18\x13 \x01(\tR\x13supplierCorporateId\x12\x32\n\x15supplier_country_code\x18\x14 \x01(\tR\x13supplierCountryCode\x12%\n\x0einvoice_number\x18\x15 \x01(\tR\rinvoiceNumber\x12\x12\n\x04iban\x18\x16 \x01(\tR\x04iban\x12.\n\x13\x62\x61nk_account_number\x18\x17 \x01(\tR\x11\x62\x61nkAccountNumber\x12\x38\n\x18\x62\x61nk_registration_number\x18\x18 \x01(\tR\x16\x62\x61nkRegistrationNumber\x12#\n\rsupplier_name\x18\x19 \x01(\tR\x0csupplierName\x12\x10\n\x03\x62ic\x18\x1a \x01(\tR\x03\x62ic\x12\'\n\x0f\x64ocument_number\x18\x1b \x01(\tR\x0e\x64ocumentNumber\x12\x36\n\rdocument_date\x18\x1c \x01(\x0b\x32\x11.google.type.DateR\x0c\x64ocumentDate\x12!\n\x0corder_number\x18\x1d \x01(\tR\x0borderNumber\x12.\n\x13supplier_vat_number\x18\x1e \x01(\tR\x11supplierVatNumber\x12@\n\x1csupplier_organisation_number\x18\x1f \x01(\tR\x1asupplierOrganisationNumber\x12)\n\x10supplier_address\x18  \x01(\tR\x0fsupplierAddress\x12\x31\n\x15\x63redit_card_last_four\x18! \x01(\tR\x12\x63reditCardLastFour\x12\'\n\x0f\x63ustomer_number\x18\" \x01(\tR\x0e\x63ustomerNumber\x12\x32\n\x15receiver_order_number\x18# \x01(\tR\x13receiverOrderNumber\x12\x32\n\x16ocr_line_be_payment_id\x18$ \x01(\tR\x12ocrLineBePaymentId\x12)\n\x10receiver_address\x18% \x01(\tR\x0freceiverAddress\x12\x32\n\x15receiver_country_code\x18& \x01(\tR\x13receiverCountryCode\x12#\n\rreceiver_name\x18\' \x01(\tR\x0creceiverName\x12.\n\x13receiver_vat_number\x18( \x01(\tR\x11receiverVatNumber\"\x1a\n\x12\x46\x65\x61tureGenResponseJ\x04\x08\x01\x10\x02\"G\n\x0ePredictRequest\x12/\n\x14top_n_most_confident\x18\x02 \x01(\rR\x11topNMostConfidentJ\x04\x08\x01\x10\x02\"\x8b\x15\n\x0fPredictResponse\x12\x32\n\norder_date\x18\x01 \x03(\x0b\x32\x13.ssn.type.CandidateR\torderDate\x12=\n\x10payment_due_date\x18\x02 \x03(\x0b\x32\x13.ssn.type.CandidateR\x0epaymentDueDate\x12/\n\x08\x63urrency\x18\x03 \x03(\x0b\x32\x13.ssn.type.CandidateR\x08\x63urrency\x12\x30\n\ttotal_vat\x18\x04 \x03(\x0b\x32\x13.ssn.type.CandidateR\x08totalVat\x12\x39\n\x0etotal_incl_vat\x18\x05 \x03(\x0b\x32\x13.ssn.type.CandidateR\x0ctotalInclVat\x12\x39\n\x0etotal_excl_vat\x18\x06 \x03(\x0b\x32\x13.ssn.type.CandidateR\x0ctotalExclVat\x12G\n\x15supplier_corporate_id\x18\x07 \x03(\x0b\x32\x13.ssn.type.CandidateR\x13supplierCorporateId\x12G\n\x15supplier_country_code\x18\x08 \x03(\x0b\x32\x13.ssn.type.CandidateR\x13supplierCountryCode\x12\x38\n\rdocument_type\x18\t \x03(\x0b\x32\x13.ssn.type.CandidateR\x0c\x64ocumentType\x12:\n\x0epayment_method\x18\n \x03(\x0b\x32\x13.ssn.type.CandidateR\rpaymentMethod\x12\x41\n\x12\x63redit_card_number\x18\x0b \x03(\x0b\x32\x13.ssn.type.CandidateR\x10\x63reditCardNumber\x12:\n\x0einvoice_number\x18\x0c \x03(\x0b\x32\x13.ssn.type.CandidateR\rinvoiceNumber\x12<\n\x10ocr_line_dk_type\x18\r \x03(\x0b\x32\x13.ssn.type.CandidateR\rocrLineDkType\x12G\n\x16ocr_line_dk_payment_id\x18\x0e \x03(\x0b\x32\x13.ssn.type.CandidateR\x12ocrLineDkPaymentId\x12I\n\x17ocr_line_dk_creditor_id\x18\x0f \x03(\x0b\x32\x13.ssn.type.CandidateR\x13ocrLineDkCreditorId\x12G\n\x16ocr_line_se_payment_id\x18\x10 \x03(\x0b\x32\x13.ssn.type.CandidateR\x12ocrLineSePaymentId\x12Z\n ocr_line_se_bankgiro_creditor_id\x18\x11 \x03(\x0b\x32\x13.ssn.type.CandidateR\x1bocrLineSeBankgiroCreditorId\x12Z\n ocr_line_se_plusgiro_creditor_id\x18\x12 \x03(\x0b\x32\x13.ssn.type.CandidateR\x1bocrLineSePlusgiroCreditorId\x12G\n\x16ocr_line_no_payment_id\x18\x13 \x03(\x0b\x32\x13.ssn.type.CandidateR\x12ocrLineNoPaymentId\x12G\n\x16ocr_line_fi_payment_id\x18\x14 \x03(\x0b\x32\x13.ssn.type.CandidateR\x12ocrLineFiPaymentId\x12G\n\x16ocr_line_nl_payment_id\x18\x15 \x03(\x0b\x32\x13.ssn.type.CandidateR\x12ocrLineNlPaymentId\x12\'\n\x04iban\x18\x16 \x03(\x0b\x32\x13.ssn.type.CandidateR\x04iban\x12-\n\x05lines\x18\x17 \x03(\x0b\x32\x17.ssn.type.LineCandidateR\x05lines\x12\x43\n\x13\x62\x61nk_account_number\x18\x18 \x03(\x0b\x32\x13.ssn.type.CandidateR\x11\x62\x61nkAccountNumber\x12M\n\x18\x62\x61nk_registration_number\x18\x19 \x03(\x0b\x32\x13.ssn.type.CandidateR\x16\x62\x61nkRegistrationNumber\x12%\n\x03\x62ic\x18\x1a \x03(\x0b\x32\x13.ssn.type.CandidateR\x03\x62ic\x12<\n\x0f\x64ocument_number\x18\x1b \x03(\x0b\x32\x13.ssn.type.CandidateR\x0e\x64ocumentNumber\x12\x38\n\rdocument_date\x18\x1c \x03(\x0b\x32\x13.ssn.type.CandidateR\x0c\x64ocumentDate\x12\x36\n\x0corder_number\x18\x1d \x03(\x0b\x32\x13.ssn.type.CandidateR\x0borderNumber\x12\x38\n\rsupplier_name\x18\x1e \x03(\x0b\x32\x13.ssn.type.CandidateR\x0csupplierName\x12\x43\n\x13supplier_vat_number\x18\x1f \x03(\x0b\x32\x13.ssn.type.CandidateR\x11supplierVatNumber\x12U\n\x1csupplier_organisation_number\x18  \x03(\x0b\x32\x13.ssn.type.CandidateR\x1asupplierOrganisationNumber\x12>\n\x10supplier_address\x18! \x03(\x0b\x32\x13.ssn.type.CandidateR\x0fsupplierAddress\x12\x46\n\x15\x63redit_card_last_four\x18\" \x03(\x0b\x32\x13.ssn.type.CandidateR\x12\x63reditCardLastFour\x12<\n\x0f\x63ustomer_number\x18# \x03(\x0b\x32\x13.ssn.type.CandidateR\x0e\x63ustomerNumber\x12G\n\x15receiver_order_number\x18$ \x03(\x0b\x32\x13.ssn.type.CandidateR\x13receiverOrderNumber\x12G\n\x16ocr_line_be_payment_id\x18% \x03(\x0b\x32\x13.ssn.type.CandidateR\x12ocrLineBePaymentId\x12>\n\x10receiver_address\x18& \x03(\x0b\x32\x13.ssn.type.CandidateR\x0freceiverAddress\x12G\n\x15receiver_country_code\x18\' \x03(\x0b\x32\x13.ssn.type.CandidateR\x13receiverCountryCode\x12\x38\n\rreceiver_name\x18( \x03(\x0b\x32\x13.ssn.type.CandidateR\x0creceiverName\x12\x43\n\x13receiver_vat_number\x18) \x03(\x0b\x32\x13.ssn.type.CandidateR\x11receiverVatNumber\"\xba\x01\n\x18\x46\x65\x61tureGenPredictRequest\x12S\n\x13\x66\x65\x61ture_gen_request\x18\x01 \x01(\x0b\x32#.ssn.mlservice.v2.FeatureGenRequestR\x11\x66\x65\x61tureGenRequest\x12I\n\x0fpredict_request\x18\x02 \x01(\x0b\x32 .ssn.mlservice.v2.PredictRequestR\x0epredictRequest2\x98\x02\n\tMlService\x12W\n\nFeatureGen\x12#.ssn.mlservice.v2.FeatureGenRequest\x1a$.ssn.mlservice.v2.FeatureGenResponse\x12N\n\x07Predict\x12 .ssn.mlservice.v2.PredictRequest\x1a!.ssn.mlservice.v2.PredictResponse\x12\x62\n\x11\x46\x65\x61tureGenPredict\x12*.ssn.mlservice.v2.FeatureGenPredictRequest\x1a!.ssn.mlservice.v2.PredictResponseBQB\x0fMlServiceProtosZ>github.com/e-conomic/vmlapis/gen/go/ssn/mlservice/v2;mlserviceb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'ssn.mlservice.v2.mlservice_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'B\017MlServiceProtosZ>github.com/e-conomic/vmlapis/gen/go/ssn/mlservice/v2;mlservice'
  _globals['_FEATUREGENREQUEST']._serialized_start=137
  _globals['_FEATUREGENREQUEST']._serialized_end=2191
  _globals['_FEATUREGENREQUEST_TRUTHLABELS']._serialized_start=326
  _globals['_FEATUREGENREQUEST_TRUTHLABELS']._serialized_end=2191
  _globals['_FEATUREGENRESPONSE']._serialized_start=2193
  _globals['_FEATUREGENRESPONSE']._serialized_end=2219
  _globals['_PREDICTREQUEST']._serialized_start=2221
  _globals['_PREDICTREQUEST']._serialized_end=2292
  _globals['_PREDICTRESPONSE']._serialized_start=2295
  _globals['_PREDICTRESPONSE']._serialized_end=4994
  _globals['_FEATUREGENPREDICTREQUEST']._serialized_start=4997
  _globals['_FEATUREGENPREDICTREQUEST']._serialized_end=5183
  _globals['_MLSERVICE']._serialized_start=5186
  _globals['_MLSERVICE']._serialized_end=5466
# @@protoc_insertion_point(module_scope)
