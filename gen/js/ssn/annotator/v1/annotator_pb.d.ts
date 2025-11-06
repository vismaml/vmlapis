import * as jspb from 'google-protobuf'

import * as google_api_annotations_pb from '../../../google/api/annotations_pb'; // proto import: "google/api/annotations.proto"
import * as protoc$gen$openapiv2_options_annotations_pb from '../../../protoc-gen-openapiv2/options/annotations_pb'; // proto import: "protoc-gen-openapiv2/options/annotations.proto"
import * as ssn_type_candidate_pb from '../../../ssn/type/candidate_pb'; // proto import: "ssn/type/candidate.proto"
import * as ssn_type_hotel_dates_pb from '../../../ssn/type/hotel_dates_pb'; // proto import: "ssn/type/hotel_dates.proto"
import * as ssn_type_qr_pb from '../../../ssn/type/qr_pb'; // proto import: "ssn/type/qr.proto"
import * as ssn_type_text_annotation_pb from '../../../ssn/type/text_annotation_pb'; // proto import: "ssn/type/text_annotation.proto"
import * as ssn_type_tier_pb from '../../../ssn/type/tier_pb'; // proto import: "ssn/type/tier.proto"


export class Feature extends jspb.Message {
  getType(): Feature.Type;
  setType(value: Feature.Type): Feature;

  getMaxResults(): number;
  setMaxResults(value: number): Feature;

  getMinConfidence(): ssn_type_candidate_pb.Confidence.Level;
  setMinConfidence(value: ssn_type_candidate_pb.Confidence.Level): Feature;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Feature.AsObject;
  static toObject(includeInstance: boolean, msg: Feature): Feature.AsObject;
  static serializeBinaryToWriter(message: Feature, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Feature;
  static deserializeBinaryFromReader(message: Feature, reader: jspb.BinaryReader): Feature;
}

export namespace Feature {
  export type AsObject = {
    type: Feature.Type,
    maxResults: number,
    minConfidence: ssn_type_candidate_pb.Confidence.Level,
  }

  export enum Type { 
    DEFAULT = 0,
    TEXT_ANNOTATION = 1,
    ORDER_DATE = 2,
    PAYMENT_DUE_DATE = 3,
    CURRENCY = 4,
    TOTAL_VAT = 5,
    TOTAL_INCL_VAT = 6,
    TOTAL_EXCL_VAT = 7,
    SUPPLIER_CORPORATE_ID = 8,
    SUPPLIER_COUNTRY_CODE = 9,
    DOCUMENT_TYPE = 10,
    PAYMENT_METHOD = 11,
    CREDIT_CARD_LAST_FOUR = 12,
    INVOICE_NUMBER = 13,
    OCR_LINE_DK_TYPE = 14,
    OCR_LINE_DK_PAYMENT_ID = 15,
    OCR_LINE_DK_CREDITOR_ID = 16,
    OCR_LINE_SE_PAYMENT_ID = 17,
    OCR_LINE_SE_BANKGIRO_CREDITOR_ID = 18,
    OCR_LINE_SE_PLUSGIRO_CREDITOR_ID = 19,
    OCR_LINE_NO_PAYMENT_ID = 20,
    OCR_LINE_FI_PAYMENT_ID = 21,
    OCR_LINE_NL_PAYMENT_ID = 22,
    OCR_LINE_BE_PAYMENT_ID = 39,
    TEXT = 23,
    IBAN = 24,
    LINES = 25,
    PREVIEW = 26,
    BANK_ACCOUNT_NUMBER = 27,
    BANK_REGISTRATION_NUMBER = 28,
    BIC = 29,
    DOCUMENT_NUMBER = 30,
    DOCUMENT_DATE = 31,
    ORDER_NUMBER = 32,
    SUPPLIER_NAME = 33,
    SUPPLIER_VAT_NUMBER = 34,
    SUPPLIER_ORGANISATION_NUMBER = 35,
    SUPPLIER_ADDRESS = 36,
    CUSTOMER_NUMBER = 37,
    RECEIVER_ORDER_NUMBER = 38,
    RECEIVER_ADDRESS = 40,
    RECEIVER_COUNTRY_CODE = 41,
    RECEIVER_NAME = 42,
    RECEIVER_VAT_NUMBER = 43,
    PURCHASE_LINES = 44,
    PAGE_TEXTS = 45,
    VAT_DISTRIBUTION = 46,
    LANGUAGE_CODE = 47,
    QR_CODES = 48,
    SWISS_QR_BILLS = 49,
    VERIFIED = 50,
    HOTEL_DATES = 51,
  }
}

export class DocumentAnnotatorRequest extends jspb.Message {
  getDocument(): Document | undefined;
  setDocument(value?: Document): DocumentAnnotatorRequest;
  hasDocument(): boolean;
  clearDocument(): DocumentAnnotatorRequest;

  getFeaturesList(): Array<Feature>;
  setFeaturesList(value: Array<Feature>): DocumentAnnotatorRequest;
  clearFeaturesList(): DocumentAnnotatorRequest;
  addFeatures(value?: Feature, index?: number): Feature;

  getTagsList(): Array<string>;
  setTagsList(value: Array<string>): DocumentAnnotatorRequest;
  clearTagsList(): DocumentAnnotatorRequest;
  addTags(value: string, index?: number): DocumentAnnotatorRequest;

  getTier(): ssn_type_tier_pb.Tier;
  setTier(value: ssn_type_tier_pb.Tier): DocumentAnnotatorRequest;

  getSegmentsList(): Array<string>;
  setSegmentsList(value: Array<string>): DocumentAnnotatorRequest;
  clearSegmentsList(): DocumentAnnotatorRequest;
  addSegments(value: string, index?: number): DocumentAnnotatorRequest;

  getQuestionsList(): Array<string>;
  setQuestionsList(value: Array<string>): DocumentAnnotatorRequest;
  clearQuestionsList(): DocumentAnnotatorRequest;
  addQuestions(value: string, index?: number): DocumentAnnotatorRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DocumentAnnotatorRequest.AsObject;
  static toObject(includeInstance: boolean, msg: DocumentAnnotatorRequest): DocumentAnnotatorRequest.AsObject;
  static serializeBinaryToWriter(message: DocumentAnnotatorRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DocumentAnnotatorRequest;
  static deserializeBinaryFromReader(message: DocumentAnnotatorRequest, reader: jspb.BinaryReader): DocumentAnnotatorRequest;
}

export namespace DocumentAnnotatorRequest {
  export type AsObject = {
    document?: Document.AsObject,
    featuresList: Array<Feature.AsObject>,
    tagsList: Array<string>,
    tier: ssn_type_tier_pb.Tier,
    segmentsList: Array<string>,
    questionsList: Array<string>,
  }
}

export class DocumentAnnotatorResponse extends jspb.Message {
  getOrderDateList(): Array<ssn_type_candidate_pb.Candidate>;
  setOrderDateList(value: Array<ssn_type_candidate_pb.Candidate>): DocumentAnnotatorResponse;
  clearOrderDateList(): DocumentAnnotatorResponse;
  addOrderDate(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getPaymentDueDateList(): Array<ssn_type_candidate_pb.Candidate>;
  setPaymentDueDateList(value: Array<ssn_type_candidate_pb.Candidate>): DocumentAnnotatorResponse;
  clearPaymentDueDateList(): DocumentAnnotatorResponse;
  addPaymentDueDate(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getCurrencyList(): Array<ssn_type_candidate_pb.Candidate>;
  setCurrencyList(value: Array<ssn_type_candidate_pb.Candidate>): DocumentAnnotatorResponse;
  clearCurrencyList(): DocumentAnnotatorResponse;
  addCurrency(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getTotalVatList(): Array<ssn_type_candidate_pb.Candidate>;
  setTotalVatList(value: Array<ssn_type_candidate_pb.Candidate>): DocumentAnnotatorResponse;
  clearTotalVatList(): DocumentAnnotatorResponse;
  addTotalVat(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getTotalInclVatList(): Array<ssn_type_candidate_pb.Candidate>;
  setTotalInclVatList(value: Array<ssn_type_candidate_pb.Candidate>): DocumentAnnotatorResponse;
  clearTotalInclVatList(): DocumentAnnotatorResponse;
  addTotalInclVat(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getTotalExclVatList(): Array<ssn_type_candidate_pb.Candidate>;
  setTotalExclVatList(value: Array<ssn_type_candidate_pb.Candidate>): DocumentAnnotatorResponse;
  clearTotalExclVatList(): DocumentAnnotatorResponse;
  addTotalExclVat(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getSupplierCorporateIdList(): Array<ssn_type_candidate_pb.Candidate>;
  setSupplierCorporateIdList(value: Array<ssn_type_candidate_pb.Candidate>): DocumentAnnotatorResponse;
  clearSupplierCorporateIdList(): DocumentAnnotatorResponse;
  addSupplierCorporateId(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getSupplierCountryCodeList(): Array<ssn_type_candidate_pb.Candidate>;
  setSupplierCountryCodeList(value: Array<ssn_type_candidate_pb.Candidate>): DocumentAnnotatorResponse;
  clearSupplierCountryCodeList(): DocumentAnnotatorResponse;
  addSupplierCountryCode(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getDocumentTypeList(): Array<ssn_type_candidate_pb.Candidate>;
  setDocumentTypeList(value: Array<ssn_type_candidate_pb.Candidate>): DocumentAnnotatorResponse;
  clearDocumentTypeList(): DocumentAnnotatorResponse;
  addDocumentType(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getPaymentMethodList(): Array<ssn_type_candidate_pb.Candidate>;
  setPaymentMethodList(value: Array<ssn_type_candidate_pb.Candidate>): DocumentAnnotatorResponse;
  clearPaymentMethodList(): DocumentAnnotatorResponse;
  addPaymentMethod(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getCreditCardLastFourList(): Array<ssn_type_candidate_pb.Candidate>;
  setCreditCardLastFourList(value: Array<ssn_type_candidate_pb.Candidate>): DocumentAnnotatorResponse;
  clearCreditCardLastFourList(): DocumentAnnotatorResponse;
  addCreditCardLastFour(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getInvoiceNumberList(): Array<ssn_type_candidate_pb.Candidate>;
  setInvoiceNumberList(value: Array<ssn_type_candidate_pb.Candidate>): DocumentAnnotatorResponse;
  clearInvoiceNumberList(): DocumentAnnotatorResponse;
  addInvoiceNumber(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getTextAnnotation(): ssn_type_text_annotation_pb.TextAnnotation | undefined;
  setTextAnnotation(value?: ssn_type_text_annotation_pb.TextAnnotation): DocumentAnnotatorResponse;
  hasTextAnnotation(): boolean;
  clearTextAnnotation(): DocumentAnnotatorResponse;

  getOcrLineDkTypeList(): Array<ssn_type_candidate_pb.Candidate>;
  setOcrLineDkTypeList(value: Array<ssn_type_candidate_pb.Candidate>): DocumentAnnotatorResponse;
  clearOcrLineDkTypeList(): DocumentAnnotatorResponse;
  addOcrLineDkType(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getOcrLineDkPaymentIdList(): Array<ssn_type_candidate_pb.Candidate>;
  setOcrLineDkPaymentIdList(value: Array<ssn_type_candidate_pb.Candidate>): DocumentAnnotatorResponse;
  clearOcrLineDkPaymentIdList(): DocumentAnnotatorResponse;
  addOcrLineDkPaymentId(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getOcrLineDkCreditorIdList(): Array<ssn_type_candidate_pb.Candidate>;
  setOcrLineDkCreditorIdList(value: Array<ssn_type_candidate_pb.Candidate>): DocumentAnnotatorResponse;
  clearOcrLineDkCreditorIdList(): DocumentAnnotatorResponse;
  addOcrLineDkCreditorId(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getOcrLineSePaymentIdList(): Array<ssn_type_candidate_pb.Candidate>;
  setOcrLineSePaymentIdList(value: Array<ssn_type_candidate_pb.Candidate>): DocumentAnnotatorResponse;
  clearOcrLineSePaymentIdList(): DocumentAnnotatorResponse;
  addOcrLineSePaymentId(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getOcrLineSeBankgiroCreditorIdList(): Array<ssn_type_candidate_pb.Candidate>;
  setOcrLineSeBankgiroCreditorIdList(value: Array<ssn_type_candidate_pb.Candidate>): DocumentAnnotatorResponse;
  clearOcrLineSeBankgiroCreditorIdList(): DocumentAnnotatorResponse;
  addOcrLineSeBankgiroCreditorId(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getOcrLineSePlusgiroCreditorIdList(): Array<ssn_type_candidate_pb.Candidate>;
  setOcrLineSePlusgiroCreditorIdList(value: Array<ssn_type_candidate_pb.Candidate>): DocumentAnnotatorResponse;
  clearOcrLineSePlusgiroCreditorIdList(): DocumentAnnotatorResponse;
  addOcrLineSePlusgiroCreditorId(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getOcrLineNoPaymentIdList(): Array<ssn_type_candidate_pb.Candidate>;
  setOcrLineNoPaymentIdList(value: Array<ssn_type_candidate_pb.Candidate>): DocumentAnnotatorResponse;
  clearOcrLineNoPaymentIdList(): DocumentAnnotatorResponse;
  addOcrLineNoPaymentId(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getOcrLineFiPaymentIdList(): Array<ssn_type_candidate_pb.Candidate>;
  setOcrLineFiPaymentIdList(value: Array<ssn_type_candidate_pb.Candidate>): DocumentAnnotatorResponse;
  clearOcrLineFiPaymentIdList(): DocumentAnnotatorResponse;
  addOcrLineFiPaymentId(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getOcrLineNlPaymentIdList(): Array<ssn_type_candidate_pb.Candidate>;
  setOcrLineNlPaymentIdList(value: Array<ssn_type_candidate_pb.Candidate>): DocumentAnnotatorResponse;
  clearOcrLineNlPaymentIdList(): DocumentAnnotatorResponse;
  addOcrLineNlPaymentId(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getOcrLineBePaymentIdList(): Array<ssn_type_candidate_pb.Candidate>;
  setOcrLineBePaymentIdList(value: Array<ssn_type_candidate_pb.Candidate>): DocumentAnnotatorResponse;
  clearOcrLineBePaymentIdList(): DocumentAnnotatorResponse;
  addOcrLineBePaymentId(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getText(): string;
  setText(value: string): DocumentAnnotatorResponse;

  getFeedbackId(): string;
  setFeedbackId(value: string): DocumentAnnotatorResponse;

  getIbanList(): Array<ssn_type_candidate_pb.Candidate>;
  setIbanList(value: Array<ssn_type_candidate_pb.Candidate>): DocumentAnnotatorResponse;
  clearIbanList(): DocumentAnnotatorResponse;
  addIban(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getLinesList(): Array<ssn_type_candidate_pb.LineCandidate>;
  setLinesList(value: Array<ssn_type_candidate_pb.LineCandidate>): DocumentAnnotatorResponse;
  clearLinesList(): DocumentAnnotatorResponse;
  addLines(value?: ssn_type_candidate_pb.LineCandidate, index?: number): ssn_type_candidate_pb.LineCandidate;

  getPreview(): string;
  setPreview(value: string): DocumentAnnotatorResponse;

  getBankAccountNumberList(): Array<ssn_type_candidate_pb.Candidate>;
  setBankAccountNumberList(value: Array<ssn_type_candidate_pb.Candidate>): DocumentAnnotatorResponse;
  clearBankAccountNumberList(): DocumentAnnotatorResponse;
  addBankAccountNumber(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getBankRegistrationNumberList(): Array<ssn_type_candidate_pb.Candidate>;
  setBankRegistrationNumberList(value: Array<ssn_type_candidate_pb.Candidate>): DocumentAnnotatorResponse;
  clearBankRegistrationNumberList(): DocumentAnnotatorResponse;
  addBankRegistrationNumber(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getBicList(): Array<ssn_type_candidate_pb.Candidate>;
  setBicList(value: Array<ssn_type_candidate_pb.Candidate>): DocumentAnnotatorResponse;
  clearBicList(): DocumentAnnotatorResponse;
  addBic(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getDocumentNumberList(): Array<ssn_type_candidate_pb.Candidate>;
  setDocumentNumberList(value: Array<ssn_type_candidate_pb.Candidate>): DocumentAnnotatorResponse;
  clearDocumentNumberList(): DocumentAnnotatorResponse;
  addDocumentNumber(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getDocumentDateList(): Array<ssn_type_candidate_pb.Candidate>;
  setDocumentDateList(value: Array<ssn_type_candidate_pb.Candidate>): DocumentAnnotatorResponse;
  clearDocumentDateList(): DocumentAnnotatorResponse;
  addDocumentDate(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getOrderNumberList(): Array<ssn_type_candidate_pb.Candidate>;
  setOrderNumberList(value: Array<ssn_type_candidate_pb.Candidate>): DocumentAnnotatorResponse;
  clearOrderNumberList(): DocumentAnnotatorResponse;
  addOrderNumber(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getSupplierNameList(): Array<ssn_type_candidate_pb.Candidate>;
  setSupplierNameList(value: Array<ssn_type_candidate_pb.Candidate>): DocumentAnnotatorResponse;
  clearSupplierNameList(): DocumentAnnotatorResponse;
  addSupplierName(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getSupplierVatNumberList(): Array<ssn_type_candidate_pb.Candidate>;
  setSupplierVatNumberList(value: Array<ssn_type_candidate_pb.Candidate>): DocumentAnnotatorResponse;
  clearSupplierVatNumberList(): DocumentAnnotatorResponse;
  addSupplierVatNumber(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getSupplierOrganisationNumberList(): Array<ssn_type_candidate_pb.Candidate>;
  setSupplierOrganisationNumberList(value: Array<ssn_type_candidate_pb.Candidate>): DocumentAnnotatorResponse;
  clearSupplierOrganisationNumberList(): DocumentAnnotatorResponse;
  addSupplierOrganisationNumber(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getSupplierAddressList(): Array<ssn_type_candidate_pb.Candidate>;
  setSupplierAddressList(value: Array<ssn_type_candidate_pb.Candidate>): DocumentAnnotatorResponse;
  clearSupplierAddressList(): DocumentAnnotatorResponse;
  addSupplierAddress(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getCustomerNumberList(): Array<ssn_type_candidate_pb.Candidate>;
  setCustomerNumberList(value: Array<ssn_type_candidate_pb.Candidate>): DocumentAnnotatorResponse;
  clearCustomerNumberList(): DocumentAnnotatorResponse;
  addCustomerNumber(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getReceiverOrderNumberList(): Array<ssn_type_candidate_pb.Candidate>;
  setReceiverOrderNumberList(value: Array<ssn_type_candidate_pb.Candidate>): DocumentAnnotatorResponse;
  clearReceiverOrderNumberList(): DocumentAnnotatorResponse;
  addReceiverOrderNumber(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getReceiverAddressList(): Array<ssn_type_candidate_pb.Candidate>;
  setReceiverAddressList(value: Array<ssn_type_candidate_pb.Candidate>): DocumentAnnotatorResponse;
  clearReceiverAddressList(): DocumentAnnotatorResponse;
  addReceiverAddress(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getReceiverCountryCodeList(): Array<ssn_type_candidate_pb.Candidate>;
  setReceiverCountryCodeList(value: Array<ssn_type_candidate_pb.Candidate>): DocumentAnnotatorResponse;
  clearReceiverCountryCodeList(): DocumentAnnotatorResponse;
  addReceiverCountryCode(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getReceiverNameList(): Array<ssn_type_candidate_pb.Candidate>;
  setReceiverNameList(value: Array<ssn_type_candidate_pb.Candidate>): DocumentAnnotatorResponse;
  clearReceiverNameList(): DocumentAnnotatorResponse;
  addReceiverName(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getReceiverVatNumberList(): Array<ssn_type_candidate_pb.Candidate>;
  setReceiverVatNumberList(value: Array<ssn_type_candidate_pb.Candidate>): DocumentAnnotatorResponse;
  clearReceiverVatNumberList(): DocumentAnnotatorResponse;
  addReceiverVatNumber(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getPurchaseLinesList(): Array<ssn_type_candidate_pb.PurchaseLineCandidate>;
  setPurchaseLinesList(value: Array<ssn_type_candidate_pb.PurchaseLineCandidate>): DocumentAnnotatorResponse;
  clearPurchaseLinesList(): DocumentAnnotatorResponse;
  addPurchaseLines(value?: ssn_type_candidate_pb.PurchaseLineCandidate, index?: number): ssn_type_candidate_pb.PurchaseLineCandidate;

  getAnswersList(): Array<ssn_type_candidate_pb.AnswerCandidate>;
  setAnswersList(value: Array<ssn_type_candidate_pb.AnswerCandidate>): DocumentAnnotatorResponse;
  clearAnswersList(): DocumentAnnotatorResponse;
  addAnswers(value?: ssn_type_candidate_pb.AnswerCandidate, index?: number): ssn_type_candidate_pb.AnswerCandidate;

  getPageTextsList(): Array<ssn_type_candidate_pb.PageText>;
  setPageTextsList(value: Array<ssn_type_candidate_pb.PageText>): DocumentAnnotatorResponse;
  clearPageTextsList(): DocumentAnnotatorResponse;
  addPageTexts(value?: ssn_type_candidate_pb.PageText, index?: number): ssn_type_candidate_pb.PageText;

  getVatDistributionList(): Array<ssn_type_candidate_pb.VatDistributionCandidate>;
  setVatDistributionList(value: Array<ssn_type_candidate_pb.VatDistributionCandidate>): DocumentAnnotatorResponse;
  clearVatDistributionList(): DocumentAnnotatorResponse;
  addVatDistribution(value?: ssn_type_candidate_pb.VatDistributionCandidate, index?: number): ssn_type_candidate_pb.VatDistributionCandidate;

  getDocumentMetadata(): ssn_type_candidate_pb.DocumentMetadata | undefined;
  setDocumentMetadata(value?: ssn_type_candidate_pb.DocumentMetadata): DocumentAnnotatorResponse;
  hasDocumentMetadata(): boolean;
  clearDocumentMetadata(): DocumentAnnotatorResponse;

  getLanguageCodeList(): Array<ssn_type_candidate_pb.Candidate>;
  setLanguageCodeList(value: Array<ssn_type_candidate_pb.Candidate>): DocumentAnnotatorResponse;
  clearLanguageCodeList(): DocumentAnnotatorResponse;
  addLanguageCode(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getQrCodesList(): Array<ssn_type_qr_pb.QrCodeData>;
  setQrCodesList(value: Array<ssn_type_qr_pb.QrCodeData>): DocumentAnnotatorResponse;
  clearQrCodesList(): DocumentAnnotatorResponse;
  addQrCodes(value?: ssn_type_qr_pb.QrCodeData, index?: number): ssn_type_qr_pb.QrCodeData;

  getSwissQrBillsList(): Array<ssn_type_qr_pb.SwissQrBill>;
  setSwissQrBillsList(value: Array<ssn_type_qr_pb.SwissQrBill>): DocumentAnnotatorResponse;
  clearSwissQrBillsList(): DocumentAnnotatorResponse;
  addSwissQrBills(value?: ssn_type_qr_pb.SwissQrBill, index?: number): ssn_type_qr_pb.SwissQrBill;

  getHotelDates(): ssn_type_hotel_dates_pb.HotelDates | undefined;
  setHotelDates(value?: ssn_type_hotel_dates_pb.HotelDates): DocumentAnnotatorResponse;
  hasHotelDates(): boolean;
  clearHotelDates(): DocumentAnnotatorResponse;

  getPurchaseLinesCandidatesList(): Array<ssn_type_candidate_pb.PurchaseLine>;
  setPurchaseLinesCandidatesList(value: Array<ssn_type_candidate_pb.PurchaseLine>): DocumentAnnotatorResponse;
  clearPurchaseLinesCandidatesList(): DocumentAnnotatorResponse;
  addPurchaseLinesCandidates(value?: ssn_type_candidate_pb.PurchaseLine, index?: number): ssn_type_candidate_pb.PurchaseLine;

  getVatDistributionCandidatesList(): Array<ssn_type_candidate_pb.VatDistribution>;
  setVatDistributionCandidatesList(value: Array<ssn_type_candidate_pb.VatDistribution>): DocumentAnnotatorResponse;
  clearVatDistributionCandidatesList(): DocumentAnnotatorResponse;
  addVatDistributionCandidates(value?: ssn_type_candidate_pb.VatDistribution, index?: number): ssn_type_candidate_pb.VatDistribution;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DocumentAnnotatorResponse.AsObject;
  static toObject(includeInstance: boolean, msg: DocumentAnnotatorResponse): DocumentAnnotatorResponse.AsObject;
  static serializeBinaryToWriter(message: DocumentAnnotatorResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DocumentAnnotatorResponse;
  static deserializeBinaryFromReader(message: DocumentAnnotatorResponse, reader: jspb.BinaryReader): DocumentAnnotatorResponse;
}

export namespace DocumentAnnotatorResponse {
  export type AsObject = {
    orderDateList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    paymentDueDateList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    currencyList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    totalVatList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    totalInclVatList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    totalExclVatList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    supplierCorporateIdList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    supplierCountryCodeList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    documentTypeList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    paymentMethodList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    creditCardLastFourList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    invoiceNumberList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    textAnnotation?: ssn_type_text_annotation_pb.TextAnnotation.AsObject,
    ocrLineDkTypeList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    ocrLineDkPaymentIdList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    ocrLineDkCreditorIdList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    ocrLineSePaymentIdList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    ocrLineSeBankgiroCreditorIdList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    ocrLineSePlusgiroCreditorIdList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    ocrLineNoPaymentIdList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    ocrLineFiPaymentIdList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    ocrLineNlPaymentIdList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    ocrLineBePaymentIdList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    text: string,
    feedbackId: string,
    ibanList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    linesList: Array<ssn_type_candidate_pb.LineCandidate.AsObject>,
    preview: string,
    bankAccountNumberList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    bankRegistrationNumberList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    bicList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    documentNumberList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    documentDateList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    orderNumberList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    supplierNameList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    supplierVatNumberList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    supplierOrganisationNumberList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    supplierAddressList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    customerNumberList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    receiverOrderNumberList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    receiverAddressList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    receiverCountryCodeList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    receiverNameList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    receiverVatNumberList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    purchaseLinesList: Array<ssn_type_candidate_pb.PurchaseLineCandidate.AsObject>,
    answersList: Array<ssn_type_candidate_pb.AnswerCandidate.AsObject>,
    pageTextsList: Array<ssn_type_candidate_pb.PageText.AsObject>,
    vatDistributionList: Array<ssn_type_candidate_pb.VatDistributionCandidate.AsObject>,
    documentMetadata?: ssn_type_candidate_pb.DocumentMetadata.AsObject,
    languageCodeList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    qrCodesList: Array<ssn_type_qr_pb.QrCodeData.AsObject>,
    swissQrBillsList: Array<ssn_type_qr_pb.SwissQrBill.AsObject>,
    hotelDates?: ssn_type_hotel_dates_pb.HotelDates.AsObject,
    purchaseLinesCandidatesList: Array<ssn_type_candidate_pb.PurchaseLine.AsObject>,
    vatDistributionCandidatesList: Array<ssn_type_candidate_pb.VatDistribution.AsObject>,
  }
}

export class Document extends jspb.Message {
  getContent(): Uint8Array | string;
  getContent_asU8(): Uint8Array;
  getContent_asB64(): string;
  setContent(value: Uint8Array | string): Document;

  getSource(): DocumentSource | undefined;
  setSource(value?: DocumentSource): Document;
  hasSource(): boolean;
  clearSource(): Document;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Document.AsObject;
  static toObject(includeInstance: boolean, msg: Document): Document.AsObject;
  static serializeBinaryToWriter(message: Document, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Document;
  static deserializeBinaryFromReader(message: Document, reader: jspb.BinaryReader): Document;
}

export namespace Document {
  export type AsObject = {
    content: Uint8Array | string,
    source?: DocumentSource.AsObject,
  }
}

export class DocumentSource extends jspb.Message {
  getHttpUri(): string;
  setHttpUri(value: string): DocumentSource;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DocumentSource.AsObject;
  static toObject(includeInstance: boolean, msg: DocumentSource): DocumentSource.AsObject;
  static serializeBinaryToWriter(message: DocumentSource, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DocumentSource;
  static deserializeBinaryFromReader(message: DocumentSource, reader: jspb.BinaryReader): DocumentSource;
}

export namespace DocumentSource {
  export type AsObject = {
    httpUri: string,
  }
}

export class DocumentQuestionRequest extends jspb.Message {
  getDocument(): Document | undefined;
  setDocument(value?: Document): DocumentQuestionRequest;
  hasDocument(): boolean;
  clearDocument(): DocumentQuestionRequest;

  getQuestionsList(): Array<string>;
  setQuestionsList(value: Array<string>): DocumentQuestionRequest;
  clearQuestionsList(): DocumentQuestionRequest;
  addQuestions(value: string, index?: number): DocumentQuestionRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DocumentQuestionRequest.AsObject;
  static toObject(includeInstance: boolean, msg: DocumentQuestionRequest): DocumentQuestionRequest.AsObject;
  static serializeBinaryToWriter(message: DocumentQuestionRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DocumentQuestionRequest;
  static deserializeBinaryFromReader(message: DocumentQuestionRequest, reader: jspb.BinaryReader): DocumentQuestionRequest;
}

export namespace DocumentQuestionRequest {
  export type AsObject = {
    document?: Document.AsObject,
    questionsList: Array<string>,
  }
}

export class DocumentQuestionResponse extends jspb.Message {
  getAnswersList(): Array<ssn_type_candidate_pb.AnswerCandidate>;
  setAnswersList(value: Array<ssn_type_candidate_pb.AnswerCandidate>): DocumentQuestionResponse;
  clearAnswersList(): DocumentQuestionResponse;
  addAnswers(value?: ssn_type_candidate_pb.AnswerCandidate, index?: number): ssn_type_candidate_pb.AnswerCandidate;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DocumentQuestionResponse.AsObject;
  static toObject(includeInstance: boolean, msg: DocumentQuestionResponse): DocumentQuestionResponse.AsObject;
  static serializeBinaryToWriter(message: DocumentQuestionResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DocumentQuestionResponse;
  static deserializeBinaryFromReader(message: DocumentQuestionResponse, reader: jspb.BinaryReader): DocumentQuestionResponse;
}

export namespace DocumentQuestionResponse {
  export type AsObject = {
    answersList: Array<ssn_type_candidate_pb.AnswerCandidate.AsObject>,
  }
}

