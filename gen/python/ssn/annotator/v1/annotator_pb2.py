# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: ssn/annotator/v1/annotator.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from vml_proto.google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from vml_proto.protoc_gen_openapiv2.options import annotations_pb2 as protoc__gen__openapiv2_dot_options_dot_annotations__pb2
from vml_proto.ssn.type import candidate_pb2 as ssn_dot_type_dot_candidate__pb2
from vml_proto.ssn.type import text_annotation_pb2 as ssn_dot_type_dot_text__annotation__pb2
from vml_proto.ssn.type import tier_pb2 as ssn_dot_type_dot_tier__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n ssn/annotator/v1/annotator.proto\x12\x10ssn.annotator.v1\x1a\x1cgoogle/api/annotations.proto\x1a.protoc-gen-openapiv2/options/annotations.proto\x1a\x18ssn/type/candidate.proto\x1a\x1essn/type/text_annotation.proto\x1a\x13ssn/type/tier.proto\"\xbb\t\n\x07\x46\x65\x61ture\x12\x32\n\x04type\x18\x01 \x01(\x0e\x32\x1e.ssn.annotator.v1.Feature.TypeR\x04type\x12\x1f\n\x0bmax_results\x18\x02 \x01(\x05R\nmaxResults\x12\x41\n\x0emin_confidence\x18\x03 \x01(\x0e\x32\x1a.ssn.type.Confidence.LevelR\rminConfidence\"\x97\x08\n\x04Type\x12\x0b\n\x07\x44\x45\x46\x41ULT\x10\x00\x12\x13\n\x0fTEXT_ANNOTATION\x10\x01\x12\x0e\n\nORDER_DATE\x10\x02\x12\x14\n\x10PAYMENT_DUE_DATE\x10\x03\x12\x0c\n\x08\x43URRENCY\x10\x04\x12\r\n\tTOTAL_VAT\x10\x05\x12\x12\n\x0eTOTAL_INCL_VAT\x10\x06\x12\x12\n\x0eTOTAL_EXCL_VAT\x10\x07\x12\x19\n\x15SUPPLIER_CORPORATE_ID\x10\x08\x12\x19\n\x15SUPPLIER_COUNTRY_CODE\x10\t\x12\x11\n\rDOCUMENT_TYPE\x10\n\x12\x12\n\x0ePAYMENT_METHOD\x10\x0b\x12\x19\n\x15\x43REDIT_CARD_LAST_FOUR\x10\x0c\x12\x12\n\x0eINVOICE_NUMBER\x10\r\x12\x14\n\x10OCR_LINE_DK_TYPE\x10\x0e\x12\x1a\n\x16OCR_LINE_DK_PAYMENT_ID\x10\x0f\x12\x1b\n\x17OCR_LINE_DK_CREDITOR_ID\x10\x10\x12\x1a\n\x16OCR_LINE_SE_PAYMENT_ID\x10\x11\x12$\n OCR_LINE_SE_BANKGIRO_CREDITOR_ID\x10\x12\x12$\n OCR_LINE_SE_PLUSGIRO_CREDITOR_ID\x10\x13\x12\x1a\n\x16OCR_LINE_NO_PAYMENT_ID\x10\x14\x12\x1a\n\x16OCR_LINE_FI_PAYMENT_ID\x10\x15\x12\x1a\n\x16OCR_LINE_NL_PAYMENT_ID\x10\x16\x12\x1a\n\x16OCR_LINE_BE_PAYMENT_ID\x10\'\x12\x08\n\x04TEXT\x10\x17\x12\x08\n\x04IBAN\x10\x18\x12\t\n\x05LINES\x10\x19\x12\x0b\n\x07PREVIEW\x10\x1a\x12\x17\n\x13\x42\x41NK_ACCOUNT_NUMBER\x10\x1b\x12\x1c\n\x18\x42\x41NK_REGISTRATION_NUMBER\x10\x1c\x12\x07\n\x03\x42IC\x10\x1d\x12\x13\n\x0f\x44OCUMENT_NUMBER\x10\x1e\x12\x11\n\rDOCUMENT_DATE\x10\x1f\x12\x10\n\x0cORDER_NUMBER\x10 \x12\x11\n\rSUPPLIER_NAME\x10!\x12\x17\n\x13SUPPLIER_VAT_NUMBER\x10\"\x12 \n\x1cSUPPLIER_ORGANISATION_NUMBER\x10#\x12\x14\n\x10SUPPLIER_ADDRESS\x10$\x12\x13\n\x0f\x43USTOMER_NUMBER\x10%\x12\x19\n\x15RECEIVER_ORDER_NUMBER\x10&\x12\x14\n\x10RECEIVER_ADDRESS\x10(\x12\x19\n\x15RECEIVER_COUNTRY_CODE\x10)\x12\x11\n\rRECEIVER_NAME\x10*\x12\x17\n\x13RECEIVER_VAT_NUMBER\x10+\x12\x12\n\x0ePURCHASE_LINES\x10,\x12\x0e\n\nPAGE_TEXTS\x10-\x12\x14\n\x10VAT_DISTRIBUTION\x10.\"\xfb\x01\n\x18\x44ocumentAnnotatorRequest\x12\x36\n\x08\x64ocument\x18\x01 \x01(\x0b\x32\x1a.ssn.annotator.v1.DocumentR\x08\x64ocument\x12\x35\n\x08\x66\x65\x61tures\x18\x02 \x03(\x0b\x32\x19.ssn.annotator.v1.FeatureR\x08\x66\x65\x61tures\x12\x12\n\x04tags\x18\x03 \x03(\tR\x04tags\x12\"\n\x04tier\x18\x04 \x01(\x0e\x32\x0e.ssn.type.TierR\x04tier\x12\x1a\n\x08segments\x18\x05 \x03(\tR\x08segments\x12\x1c\n\tquestions\x18\x06 \x03(\tR\tquestions\"\xd1\x18\n\x19\x44ocumentAnnotatorResponse\x12\x32\n\norder_date\x18\x01 \x03(\x0b\x32\x13.ssn.type.CandidateR\torderDate\x12=\n\x10payment_due_date\x18\x02 \x03(\x0b\x32\x13.ssn.type.CandidateR\x0epaymentDueDate\x12/\n\x08\x63urrency\x18\x03 \x03(\x0b\x32\x13.ssn.type.CandidateR\x08\x63urrency\x12\x30\n\ttotal_vat\x18\x04 \x03(\x0b\x32\x13.ssn.type.CandidateR\x08totalVat\x12\x39\n\x0etotal_incl_vat\x18\x05 \x03(\x0b\x32\x13.ssn.type.CandidateR\x0ctotalInclVat\x12\x39\n\x0etotal_excl_vat\x18\x06 \x03(\x0b\x32\x13.ssn.type.CandidateR\x0ctotalExclVat\x12G\n\x15supplier_corporate_id\x18\x07 \x03(\x0b\x32\x13.ssn.type.CandidateR\x13supplierCorporateId\x12G\n\x15supplier_country_code\x18\x08 \x03(\x0b\x32\x13.ssn.type.CandidateR\x13supplierCountryCode\x12\x38\n\rdocument_type\x18\t \x03(\x0b\x32\x13.ssn.type.CandidateR\x0c\x64ocumentType\x12:\n\x0epayment_method\x18\n \x03(\x0b\x32\x13.ssn.type.CandidateR\rpaymentMethod\x12\x46\n\x15\x63redit_card_last_four\x18\x0b \x03(\x0b\x32\x13.ssn.type.CandidateR\x12\x63reditCardLastFour\x12:\n\x0einvoice_number\x18\x0c \x03(\x0b\x32\x13.ssn.type.CandidateR\rinvoiceNumber\x12\x41\n\x0ftext_annotation\x18\r \x01(\x0b\x32\x18.ssn.type.TextAnnotationR\x0etextAnnotation\x12<\n\x10ocr_line_dk_type\x18\x0e \x03(\x0b\x32\x13.ssn.type.CandidateR\rocrLineDkType\x12G\n\x16ocr_line_dk_payment_id\x18\x0f \x03(\x0b\x32\x13.ssn.type.CandidateR\x12ocrLineDkPaymentId\x12I\n\x17ocr_line_dk_creditor_id\x18\x10 \x03(\x0b\x32\x13.ssn.type.CandidateR\x13ocrLineDkCreditorId\x12G\n\x16ocr_line_se_payment_id\x18\x11 \x03(\x0b\x32\x13.ssn.type.CandidateR\x12ocrLineSePaymentId\x12Z\n ocr_line_se_bankgiro_creditor_id\x18\x12 \x03(\x0b\x32\x13.ssn.type.CandidateR\x1bocrLineSeBankgiroCreditorId\x12Z\n ocr_line_se_plusgiro_creditor_id\x18\x13 \x03(\x0b\x32\x13.ssn.type.CandidateR\x1bocrLineSePlusgiroCreditorId\x12G\n\x16ocr_line_no_payment_id\x18\x14 \x03(\x0b\x32\x13.ssn.type.CandidateR\x12ocrLineNoPaymentId\x12G\n\x16ocr_line_fi_payment_id\x18\x15 \x03(\x0b\x32\x13.ssn.type.CandidateR\x12ocrLineFiPaymentId\x12G\n\x16ocr_line_nl_payment_id\x18\x16 \x03(\x0b\x32\x13.ssn.type.CandidateR\x12ocrLineNlPaymentId\x12G\n\x16ocr_line_be_payment_id\x18( \x03(\x0b\x32\x13.ssn.type.CandidateR\x12ocrLineBePaymentId\x12\x12\n\x04text\x18\x17 \x01(\tR\x04text\x12\x1f\n\x0b\x66\x65\x65\x64\x62\x61\x63k_id\x18\x18 \x01(\tR\nfeedbackId\x12\'\n\x04iban\x18\x19 \x03(\x0b\x32\x13.ssn.type.CandidateR\x04iban\x12-\n\x05lines\x18\x1a \x03(\x0b\x32\x17.ssn.type.LineCandidateR\x05lines\x12\x18\n\x07preview\x18\x1b \x01(\tR\x07preview\x12\x43\n\x13\x62\x61nk_account_number\x18\x1c \x03(\x0b\x32\x13.ssn.type.CandidateR\x11\x62\x61nkAccountNumber\x12M\n\x18\x62\x61nk_registration_number\x18\x1d \x03(\x0b\x32\x13.ssn.type.CandidateR\x16\x62\x61nkRegistrationNumber\x12%\n\x03\x62ic\x18\x1e \x03(\x0b\x32\x13.ssn.type.CandidateR\x03\x62ic\x12<\n\x0f\x64ocument_number\x18\x1f \x03(\x0b\x32\x13.ssn.type.CandidateR\x0e\x64ocumentNumber\x12\x38\n\rdocument_date\x18  \x03(\x0b\x32\x13.ssn.type.CandidateR\x0c\x64ocumentDate\x12\x36\n\x0corder_number\x18! \x03(\x0b\x32\x13.ssn.type.CandidateR\x0borderNumber\x12\x38\n\rsupplier_name\x18\" \x03(\x0b\x32\x13.ssn.type.CandidateR\x0csupplierName\x12\x43\n\x13supplier_vat_number\x18# \x03(\x0b\x32\x13.ssn.type.CandidateR\x11supplierVatNumber\x12U\n\x1csupplier_organisation_number\x18$ \x03(\x0b\x32\x13.ssn.type.CandidateR\x1asupplierOrganisationNumber\x12>\n\x10supplier_address\x18% \x03(\x0b\x32\x13.ssn.type.CandidateR\x0fsupplierAddress\x12<\n\x0f\x63ustomer_number\x18& \x03(\x0b\x32\x13.ssn.type.CandidateR\x0e\x63ustomerNumber\x12G\n\x15receiver_order_number\x18\' \x03(\x0b\x32\x13.ssn.type.CandidateR\x13receiverOrderNumber\x12>\n\x10receiver_address\x18) \x03(\x0b\x32\x13.ssn.type.CandidateR\x0freceiverAddress\x12G\n\x15receiver_country_code\x18* \x03(\x0b\x32\x13.ssn.type.CandidateR\x13receiverCountryCode\x12\x38\n\rreceiver_name\x18+ \x03(\x0b\x32\x13.ssn.type.CandidateR\x0creceiverName\x12\x43\n\x13receiver_vat_number\x18, \x03(\x0b\x32\x13.ssn.type.CandidateR\x11receiverVatNumber\x12\x46\n\x0epurchase_lines\x18- \x03(\x0b\x32\x1f.ssn.type.PurchaseLineCandidateR\rpurchaseLines\x12\x33\n\x07\x61nswers\x18. \x03(\x0b\x32\x19.ssn.type.AnswerCandidateR\x07\x61nswers\x12\x31\n\npage_texts\x18/ \x03(\x0b\x32\x12.ssn.type.PageTextR\tpageTexts\x12M\n\x10vat_distribution\x18\x30 \x03(\x0b\x32\".ssn.type.VatDistributionCandidateR\x0fvatDistribution\x12G\n\x11\x64ocument_metadata\x18\x31 \x01(\x0b\x32\x1a.ssn.type.DocumentMetadataR\x10\x64ocumentMetadata\x12#\n\rtext_language\x18\x32 \x01(\tR\x0ctextLanguage\"^\n\x08\x44ocument\x12\x18\n\x07\x63ontent\x18\x01 \x01(\x0cR\x07\x63ontent\x12\x38\n\x06source\x18\x02 \x01(\x0b\x32 .ssn.annotator.v1.DocumentSourceR\x06source\"+\n\x0e\x44ocumentSource\x12\x19\n\x08http_uri\x18\x01 \x01(\tR\x07httpUri\"o\n\x17\x44ocumentQuestionRequest\x12\x36\n\x08\x64ocument\x18\x01 \x01(\x0b\x32\x1a.ssn.annotator.v1.DocumentR\x08\x64ocument\x12\x1c\n\tquestions\x18\x02 \x03(\tR\tquestions\"U\n\x18\x44ocumentQuestionResponse\x12\x33\n\x07\x61nswers\x18\x02 \x03(\x0b\x32\x19.ssn.type.AnswerCandidateR\x07\x61nswersJ\x04\x08\x01\x10\x02\x32\xbd\x02\n\x11\x44ocumentAnnotator\x12\x8d\x01\n\x10\x41nnotateDocument\x12*.ssn.annotator.v1.DocumentAnnotatorRequest\x1a+.ssn.annotator.v1.DocumentAnnotatorResponse\" \x82\xd3\xe4\x93\x02\x1a\"\x15/v1/document:annotate:\x01*\x12\x97\x01\n\x16\x41nswerDocumentQuestion\x12).ssn.annotator.v1.DocumentQuestionRequest\x1a*.ssn.annotator.v1.DocumentQuestionResponse\"&\x82\xd3\xe4\x93\x02 \"\x1b/v1/document:answerquestion:\x01*B{Z>github.com/e-conomic/vmlapis/gen/go/ssn/annotator/v1;annotator\x92\x41\x38\x12\x0f\n\tSmartScan2\x02v1*\x01\x02\x32\x10\x61pplication/json:\x10\x61pplication/jsonb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'ssn.annotator.v1.annotator_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'Z>github.com/e-conomic/vmlapis/gen/go/ssn/annotator/v1;annotator\222A8\022\017\n\tSmartScan2\002v1*\001\0022\020application/json:\020application/json'
  _DOCUMENTANNOTATOR.methods_by_name['AnnotateDocument']._options = None
  _DOCUMENTANNOTATOR.methods_by_name['AnnotateDocument']._serialized_options = b'\202\323\344\223\002\032\"\025/v1/document:annotate:\001*'
  _DOCUMENTANNOTATOR.methods_by_name['AnswerDocumentQuestion']._options = None
  _DOCUMENTANNOTATOR.methods_by_name['AnswerDocumentQuestion']._serialized_options = b'\202\323\344\223\002 \"\033/v1/document:answerquestion:\001*'
  _globals['_FEATURE']._serialized_start=212
  _globals['_FEATURE']._serialized_end=1423
  _globals['_FEATURE_TYPE']._serialized_start=376
  _globals['_FEATURE_TYPE']._serialized_end=1423
  _globals['_DOCUMENTANNOTATORREQUEST']._serialized_start=1426
  _globals['_DOCUMENTANNOTATORREQUEST']._serialized_end=1677
  _globals['_DOCUMENTANNOTATORRESPONSE']._serialized_start=1680
  _globals['_DOCUMENTANNOTATORRESPONSE']._serialized_end=4833
  _globals['_DOCUMENT']._serialized_start=4835
  _globals['_DOCUMENT']._serialized_end=4929
  _globals['_DOCUMENTSOURCE']._serialized_start=4931
  _globals['_DOCUMENTSOURCE']._serialized_end=4974
  _globals['_DOCUMENTQUESTIONREQUEST']._serialized_start=4976
  _globals['_DOCUMENTQUESTIONREQUEST']._serialized_end=5087
  _globals['_DOCUMENTQUESTIONRESPONSE']._serialized_start=5089
  _globals['_DOCUMENTQUESTIONRESPONSE']._serialized_end=5174
  _globals['_DOCUMENTANNOTATOR']._serialized_start=5177
  _globals['_DOCUMENTANNOTATOR']._serialized_end=5494
# @@protoc_insertion_point(module_scope)
