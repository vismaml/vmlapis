import * as jspb from 'google-protobuf'

import * as gen_bq_schema_bq_field_pb from '../../../gen_bq_schema/bq_field_pb'; // proto import: "gen_bq_schema/bq_field.proto"
import * as gen_bq_schema_bq_table_pb from '../../../gen_bq_schema/bq_table_pb'; // proto import: "gen_bq_schema/bq_table.proto"
import * as google_api_annotations_pb from '../../../google/api/annotations_pb'; // proto import: "google/api/annotations.proto"
import * as google_protobuf_empty_pb from 'google-protobuf/google/protobuf/empty_pb'; // proto import: "google/protobuf/empty.proto"
import * as google_protobuf_wrappers_pb from 'google-protobuf/google/protobuf/wrappers_pb'; // proto import: "google/protobuf/wrappers.proto"
import * as google_type_date_pb from '../../../google/type/date_pb'; // proto import: "google/type/date.proto"
import * as ssn_type_candidate_pb from '../../../ssn/type/candidate_pb'; // proto import: "ssn/type/candidate.proto"
import * as ssn_type_text_annotation_pb from '../../../ssn/type/text_annotation_pb'; // proto import: "ssn/type/text_annotation.proto"
import * as ssn_type_tier_pb from '../../../ssn/type/tier_pb'; // proto import: "ssn/type/tier.proto"


export class Document extends jspb.Message {
  getTa(): ssn_type_text_annotation_pb.TextAnnotation | undefined;
  setTa(value?: ssn_type_text_annotation_pb.TextAnnotation): Document;
  hasTa(): boolean;
  clearTa(): Document;

  getBytes(): Uint8Array | string;
  getBytes_asU8(): Uint8Array;
  getBytes_asB64(): string;
  setBytes(value: Uint8Array | string): Document;

  getId(): string;
  setId(value: string): Document;

  getConsumer(): string;
  setConsumer(value: string): Document;

  getTagsList(): Array<string>;
  setTagsList(value: Array<string>): Document;
  clearTagsList(): Document;
  addTags(value: string, index?: number): Document;

  getTrueValues(): TrueValues | undefined;
  setTrueValues(value?: TrueValues): Document;
  hasTrueValues(): boolean;
  clearTrueValues(): Document;

  getPredictionValues(): PredictionValues | undefined;
  setPredictionValues(value?: PredictionValues): Document;
  hasPredictionValues(): boolean;
  clearPredictionValues(): Document;

  getFeedbackTime(): number;
  setFeedbackTime(value: number): Document;

  getPredictionConfidences(): PredictionConfidences | undefined;
  setPredictionConfidences(value?: PredictionConfidences): Document;
  hasPredictionConfidences(): boolean;
  clearPredictionConfidences(): Document;

  getPredictionMetadata(): PredictionMetadata | undefined;
  setPredictionMetadata(value?: PredictionMetadata): Document;
  hasPredictionMetadata(): boolean;
  clearPredictionMetadata(): Document;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Document.AsObject;
  static toObject(includeInstance: boolean, msg: Document): Document.AsObject;
  static serializeBinaryToWriter(message: Document, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Document;
  static deserializeBinaryFromReader(message: Document, reader: jspb.BinaryReader): Document;
}

export namespace Document {
  export type AsObject = {
    ta?: ssn_type_text_annotation_pb.TextAnnotation.AsObject,
    bytes: Uint8Array | string,
    id: string,
    consumer: string,
    tagsList: Array<string>,
    trueValues?: TrueValues.AsObject,
    predictionValues?: PredictionValues.AsObject,
    feedbackTime: number,
    predictionConfidences?: PredictionConfidences.AsObject,
    predictionMetadata?: PredictionMetadata.AsObject,
  }
}

export class TrueValues extends jspb.Message {
  getTotalInclVat(): google_protobuf_wrappers_pb.DoubleValue | undefined;
  setTotalInclVat(value?: google_protobuf_wrappers_pb.DoubleValue): TrueValues;
  hasTotalInclVat(): boolean;
  clearTotalInclVat(): TrueValues;

  getTotalVat(): google_protobuf_wrappers_pb.DoubleValue | undefined;
  setTotalVat(value?: google_protobuf_wrappers_pb.DoubleValue): TrueValues;
  hasTotalVat(): boolean;
  clearTotalVat(): TrueValues;

  getTotalExclVat(): google_protobuf_wrappers_pb.DoubleValue | undefined;
  setTotalExclVat(value?: google_protobuf_wrappers_pb.DoubleValue): TrueValues;
  hasTotalExclVat(): boolean;
  clearTotalExclVat(): TrueValues;

  getOrderDate(): google_type_date_pb.Date | undefined;
  setOrderDate(value?: google_type_date_pb.Date): TrueValues;
  hasOrderDate(): boolean;
  clearOrderDate(): TrueValues;

  getPaymentDueDate(): google_type_date_pb.Date | undefined;
  setPaymentDueDate(value?: google_type_date_pb.Date): TrueValues;
  hasPaymentDueDate(): boolean;
  clearPaymentDueDate(): TrueValues;

  getDocumentType(): google_protobuf_wrappers_pb.StringValue | undefined;
  setDocumentType(value?: google_protobuf_wrappers_pb.StringValue): TrueValues;
  hasDocumentType(): boolean;
  clearDocumentType(): TrueValues;

  getCurrency(): google_protobuf_wrappers_pb.StringValue | undefined;
  setCurrency(value?: google_protobuf_wrappers_pb.StringValue): TrueValues;
  hasCurrency(): boolean;
  clearCurrency(): TrueValues;

  getCreditCardLastFour(): google_protobuf_wrappers_pb.StringValue | undefined;
  setCreditCardLastFour(value?: google_protobuf_wrappers_pb.StringValue): TrueValues;
  hasCreditCardLastFour(): boolean;
  clearCreditCardLastFour(): TrueValues;

  getPaymentMethod(): google_protobuf_wrappers_pb.StringValue | undefined;
  setPaymentMethod(value?: google_protobuf_wrappers_pb.StringValue): TrueValues;
  hasPaymentMethod(): boolean;
  clearPaymentMethod(): TrueValues;

  getOcrLineDkType(): google_protobuf_wrappers_pb.StringValue | undefined;
  setOcrLineDkType(value?: google_protobuf_wrappers_pb.StringValue): TrueValues;
  hasOcrLineDkType(): boolean;
  clearOcrLineDkType(): TrueValues;

  getOcrLineDkPaymentId(): google_protobuf_wrappers_pb.StringValue | undefined;
  setOcrLineDkPaymentId(value?: google_protobuf_wrappers_pb.StringValue): TrueValues;
  hasOcrLineDkPaymentId(): boolean;
  clearOcrLineDkPaymentId(): TrueValues;

  getOcrLineDkCreditorId(): google_protobuf_wrappers_pb.StringValue | undefined;
  setOcrLineDkCreditorId(value?: google_protobuf_wrappers_pb.StringValue): TrueValues;
  hasOcrLineDkCreditorId(): boolean;
  clearOcrLineDkCreditorId(): TrueValues;

  getOcrLineSePaymentId(): google_protobuf_wrappers_pb.StringValue | undefined;
  setOcrLineSePaymentId(value?: google_protobuf_wrappers_pb.StringValue): TrueValues;
  hasOcrLineSePaymentId(): boolean;
  clearOcrLineSePaymentId(): TrueValues;

  getOcrLineSeBankgiroCreditorId(): google_protobuf_wrappers_pb.StringValue | undefined;
  setOcrLineSeBankgiroCreditorId(value?: google_protobuf_wrappers_pb.StringValue): TrueValues;
  hasOcrLineSeBankgiroCreditorId(): boolean;
  clearOcrLineSeBankgiroCreditorId(): TrueValues;

  getOcrLineSePlusgiroCreditorId(): google_protobuf_wrappers_pb.StringValue | undefined;
  setOcrLineSePlusgiroCreditorId(value?: google_protobuf_wrappers_pb.StringValue): TrueValues;
  hasOcrLineSePlusgiroCreditorId(): boolean;
  clearOcrLineSePlusgiroCreditorId(): TrueValues;

  getOcrLineNoPaymentId(): google_protobuf_wrappers_pb.StringValue | undefined;
  setOcrLineNoPaymentId(value?: google_protobuf_wrappers_pb.StringValue): TrueValues;
  hasOcrLineNoPaymentId(): boolean;
  clearOcrLineNoPaymentId(): TrueValues;

  getOcrLineFiPaymentId(): google_protobuf_wrappers_pb.StringValue | undefined;
  setOcrLineFiPaymentId(value?: google_protobuf_wrappers_pb.StringValue): TrueValues;
  hasOcrLineFiPaymentId(): boolean;
  clearOcrLineFiPaymentId(): TrueValues;

  getOcrLineNlPaymentId(): google_protobuf_wrappers_pb.StringValue | undefined;
  setOcrLineNlPaymentId(value?: google_protobuf_wrappers_pb.StringValue): TrueValues;
  hasOcrLineNlPaymentId(): boolean;
  clearOcrLineNlPaymentId(): TrueValues;

  getSupplierCorporateId(): google_protobuf_wrappers_pb.StringValue | undefined;
  setSupplierCorporateId(value?: google_protobuf_wrappers_pb.StringValue): TrueValues;
  hasSupplierCorporateId(): boolean;
  clearSupplierCorporateId(): TrueValues;

  getSupplierCountryCode(): google_protobuf_wrappers_pb.StringValue | undefined;
  setSupplierCountryCode(value?: google_protobuf_wrappers_pb.StringValue): TrueValues;
  hasSupplierCountryCode(): boolean;
  clearSupplierCountryCode(): TrueValues;

  getInvoiceNumber(): google_protobuf_wrappers_pb.StringValue | undefined;
  setInvoiceNumber(value?: google_protobuf_wrappers_pb.StringValue): TrueValues;
  hasInvoiceNumber(): boolean;
  clearInvoiceNumber(): TrueValues;

  getIban(): google_protobuf_wrappers_pb.StringValue | undefined;
  setIban(value?: google_protobuf_wrappers_pb.StringValue): TrueValues;
  hasIban(): boolean;
  clearIban(): TrueValues;

  getOrderReference(): google_protobuf_wrappers_pb.StringValue | undefined;
  setOrderReference(value?: google_protobuf_wrappers_pb.StringValue): TrueValues;
  hasOrderReference(): boolean;
  clearOrderReference(): TrueValues;

  getBankAccountNumber(): google_protobuf_wrappers_pb.StringValue | undefined;
  setBankAccountNumber(value?: google_protobuf_wrappers_pb.StringValue): TrueValues;
  hasBankAccountNumber(): boolean;
  clearBankAccountNumber(): TrueValues;

  getBankRegistrationNumber(): google_protobuf_wrappers_pb.StringValue | undefined;
  setBankRegistrationNumber(value?: google_protobuf_wrappers_pb.StringValue): TrueValues;
  hasBankRegistrationNumber(): boolean;
  clearBankRegistrationNumber(): TrueValues;

  getSupplierName(): google_protobuf_wrappers_pb.StringValue | undefined;
  setSupplierName(value?: google_protobuf_wrappers_pb.StringValue): TrueValues;
  hasSupplierName(): boolean;
  clearSupplierName(): TrueValues;

  getBic(): google_protobuf_wrappers_pb.StringValue | undefined;
  setBic(value?: google_protobuf_wrappers_pb.StringValue): TrueValues;
  hasBic(): boolean;
  clearBic(): TrueValues;

  getDocumentNumber(): google_protobuf_wrappers_pb.StringValue | undefined;
  setDocumentNumber(value?: google_protobuf_wrappers_pb.StringValue): TrueValues;
  hasDocumentNumber(): boolean;
  clearDocumentNumber(): TrueValues;

  getDocumentDate(): google_type_date_pb.Date | undefined;
  setDocumentDate(value?: google_type_date_pb.Date): TrueValues;
  hasDocumentDate(): boolean;
  clearDocumentDate(): TrueValues;

  getOrderNumber(): google_protobuf_wrappers_pb.StringValue | undefined;
  setOrderNumber(value?: google_protobuf_wrappers_pb.StringValue): TrueValues;
  hasOrderNumber(): boolean;
  clearOrderNumber(): TrueValues;

  getSupplierVatNumber(): google_protobuf_wrappers_pb.StringValue | undefined;
  setSupplierVatNumber(value?: google_protobuf_wrappers_pb.StringValue): TrueValues;
  hasSupplierVatNumber(): boolean;
  clearSupplierVatNumber(): TrueValues;

  getSupplierOrganisationNumber(): google_protobuf_wrappers_pb.StringValue | undefined;
  setSupplierOrganisationNumber(value?: google_protobuf_wrappers_pb.StringValue): TrueValues;
  hasSupplierOrganisationNumber(): boolean;
  clearSupplierOrganisationNumber(): TrueValues;

  getSupplierAddress(): google_protobuf_wrappers_pb.StringValue | undefined;
  setSupplierAddress(value?: google_protobuf_wrappers_pb.StringValue): TrueValues;
  hasSupplierAddress(): boolean;
  clearSupplierAddress(): TrueValues;

  getCustomerNumber(): google_protobuf_wrappers_pb.StringValue | undefined;
  setCustomerNumber(value?: google_protobuf_wrappers_pb.StringValue): TrueValues;
  hasCustomerNumber(): boolean;
  clearCustomerNumber(): TrueValues;

  getReceiverOrderNumber(): google_protobuf_wrappers_pb.StringValue | undefined;
  setReceiverOrderNumber(value?: google_protobuf_wrappers_pb.StringValue): TrueValues;
  hasReceiverOrderNumber(): boolean;
  clearReceiverOrderNumber(): TrueValues;

  getOcrLineBePaymentId(): google_protobuf_wrappers_pb.StringValue | undefined;
  setOcrLineBePaymentId(value?: google_protobuf_wrappers_pb.StringValue): TrueValues;
  hasOcrLineBePaymentId(): boolean;
  clearOcrLineBePaymentId(): TrueValues;

  getReceiverAddress(): google_protobuf_wrappers_pb.StringValue | undefined;
  setReceiverAddress(value?: google_protobuf_wrappers_pb.StringValue): TrueValues;
  hasReceiverAddress(): boolean;
  clearReceiverAddress(): TrueValues;

  getReceiverCountryCode(): google_protobuf_wrappers_pb.StringValue | undefined;
  setReceiverCountryCode(value?: google_protobuf_wrappers_pb.StringValue): TrueValues;
  hasReceiverCountryCode(): boolean;
  clearReceiverCountryCode(): TrueValues;

  getReceiverName(): google_protobuf_wrappers_pb.StringValue | undefined;
  setReceiverName(value?: google_protobuf_wrappers_pb.StringValue): TrueValues;
  hasReceiverName(): boolean;
  clearReceiverName(): TrueValues;

  getReceiverVatNumber(): google_protobuf_wrappers_pb.StringValue | undefined;
  setReceiverVatNumber(value?: google_protobuf_wrappers_pb.StringValue): TrueValues;
  hasReceiverVatNumber(): boolean;
  clearReceiverVatNumber(): TrueValues;

  getPurchaseLinesList(): Array<ssn_type_candidate_pb.PurchaseLineCandidate>;
  setPurchaseLinesList(value: Array<ssn_type_candidate_pb.PurchaseLineCandidate>): TrueValues;
  clearPurchaseLinesList(): TrueValues;
  addPurchaseLines(value?: ssn_type_candidate_pb.PurchaseLineCandidate, index?: number): ssn_type_candidate_pb.PurchaseLineCandidate;

  getAnswersList(): Array<ssn_type_candidate_pb.AnswerCandidate>;
  setAnswersList(value: Array<ssn_type_candidate_pb.AnswerCandidate>): TrueValues;
  clearAnswersList(): TrueValues;
  addAnswers(value?: ssn_type_candidate_pb.AnswerCandidate, index?: number): ssn_type_candidate_pb.AnswerCandidate;

  getVatDistributionList(): Array<ssn_type_candidate_pb.VatDistributionCandidate>;
  setVatDistributionList(value: Array<ssn_type_candidate_pb.VatDistributionCandidate>): TrueValues;
  clearVatDistributionList(): TrueValues;
  addVatDistribution(value?: ssn_type_candidate_pb.VatDistributionCandidate, index?: number): ssn_type_candidate_pb.VatDistributionCandidate;

  getCheckInDate(): google_type_date_pb.Date | undefined;
  setCheckInDate(value?: google_type_date_pb.Date): TrueValues;
  hasCheckInDate(): boolean;
  clearCheckInDate(): TrueValues;

  getCheckOutDate(): google_type_date_pb.Date | undefined;
  setCheckOutDate(value?: google_type_date_pb.Date): TrueValues;
  hasCheckOutDate(): boolean;
  clearCheckOutDate(): TrueValues;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): TrueValues.AsObject;
  static toObject(includeInstance: boolean, msg: TrueValues): TrueValues.AsObject;
  static serializeBinaryToWriter(message: TrueValues, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): TrueValues;
  static deserializeBinaryFromReader(message: TrueValues, reader: jspb.BinaryReader): TrueValues;
}

export namespace TrueValues {
  export type AsObject = {
    totalInclVat?: google_protobuf_wrappers_pb.DoubleValue.AsObject,
    totalVat?: google_protobuf_wrappers_pb.DoubleValue.AsObject,
    totalExclVat?: google_protobuf_wrappers_pb.DoubleValue.AsObject,
    orderDate?: google_type_date_pb.Date.AsObject,
    paymentDueDate?: google_type_date_pb.Date.AsObject,
    documentType?: google_protobuf_wrappers_pb.StringValue.AsObject,
    currency?: google_protobuf_wrappers_pb.StringValue.AsObject,
    creditCardLastFour?: google_protobuf_wrappers_pb.StringValue.AsObject,
    paymentMethod?: google_protobuf_wrappers_pb.StringValue.AsObject,
    ocrLineDkType?: google_protobuf_wrappers_pb.StringValue.AsObject,
    ocrLineDkPaymentId?: google_protobuf_wrappers_pb.StringValue.AsObject,
    ocrLineDkCreditorId?: google_protobuf_wrappers_pb.StringValue.AsObject,
    ocrLineSePaymentId?: google_protobuf_wrappers_pb.StringValue.AsObject,
    ocrLineSeBankgiroCreditorId?: google_protobuf_wrappers_pb.StringValue.AsObject,
    ocrLineSePlusgiroCreditorId?: google_protobuf_wrappers_pb.StringValue.AsObject,
    ocrLineNoPaymentId?: google_protobuf_wrappers_pb.StringValue.AsObject,
    ocrLineFiPaymentId?: google_protobuf_wrappers_pb.StringValue.AsObject,
    ocrLineNlPaymentId?: google_protobuf_wrappers_pb.StringValue.AsObject,
    supplierCorporateId?: google_protobuf_wrappers_pb.StringValue.AsObject,
    supplierCountryCode?: google_protobuf_wrappers_pb.StringValue.AsObject,
    invoiceNumber?: google_protobuf_wrappers_pb.StringValue.AsObject,
    iban?: google_protobuf_wrappers_pb.StringValue.AsObject,
    orderReference?: google_protobuf_wrappers_pb.StringValue.AsObject,
    bankAccountNumber?: google_protobuf_wrappers_pb.StringValue.AsObject,
    bankRegistrationNumber?: google_protobuf_wrappers_pb.StringValue.AsObject,
    supplierName?: google_protobuf_wrappers_pb.StringValue.AsObject,
    bic?: google_protobuf_wrappers_pb.StringValue.AsObject,
    documentNumber?: google_protobuf_wrappers_pb.StringValue.AsObject,
    documentDate?: google_type_date_pb.Date.AsObject,
    orderNumber?: google_protobuf_wrappers_pb.StringValue.AsObject,
    supplierVatNumber?: google_protobuf_wrappers_pb.StringValue.AsObject,
    supplierOrganisationNumber?: google_protobuf_wrappers_pb.StringValue.AsObject,
    supplierAddress?: google_protobuf_wrappers_pb.StringValue.AsObject,
    customerNumber?: google_protobuf_wrappers_pb.StringValue.AsObject,
    receiverOrderNumber?: google_protobuf_wrappers_pb.StringValue.AsObject,
    ocrLineBePaymentId?: google_protobuf_wrappers_pb.StringValue.AsObject,
    receiverAddress?: google_protobuf_wrappers_pb.StringValue.AsObject,
    receiverCountryCode?: google_protobuf_wrappers_pb.StringValue.AsObject,
    receiverName?: google_protobuf_wrappers_pb.StringValue.AsObject,
    receiverVatNumber?: google_protobuf_wrappers_pb.StringValue.AsObject,
    purchaseLinesList: Array<ssn_type_candidate_pb.PurchaseLineCandidate.AsObject>,
    answersList: Array<ssn_type_candidate_pb.AnswerCandidate.AsObject>,
    vatDistributionList: Array<ssn_type_candidate_pb.VatDistributionCandidate.AsObject>,
    checkInDate?: google_type_date_pb.Date.AsObject,
    checkOutDate?: google_type_date_pb.Date.AsObject,
  }
}

export class PredictionValues extends jspb.Message {
  getTotalInclVatList(): Array<google_protobuf_wrappers_pb.DoubleValue>;
  setTotalInclVatList(value: Array<google_protobuf_wrappers_pb.DoubleValue>): PredictionValues;
  clearTotalInclVatList(): PredictionValues;
  addTotalInclVat(value?: google_protobuf_wrappers_pb.DoubleValue, index?: number): google_protobuf_wrappers_pb.DoubleValue;

  getTotalVatList(): Array<google_protobuf_wrappers_pb.DoubleValue>;
  setTotalVatList(value: Array<google_protobuf_wrappers_pb.DoubleValue>): PredictionValues;
  clearTotalVatList(): PredictionValues;
  addTotalVat(value?: google_protobuf_wrappers_pb.DoubleValue, index?: number): google_protobuf_wrappers_pb.DoubleValue;

  getTotalExclVatList(): Array<google_protobuf_wrappers_pb.DoubleValue>;
  setTotalExclVatList(value: Array<google_protobuf_wrappers_pb.DoubleValue>): PredictionValues;
  clearTotalExclVatList(): PredictionValues;
  addTotalExclVat(value?: google_protobuf_wrappers_pb.DoubleValue, index?: number): google_protobuf_wrappers_pb.DoubleValue;

  getOrderDateList(): Array<google_type_date_pb.Date>;
  setOrderDateList(value: Array<google_type_date_pb.Date>): PredictionValues;
  clearOrderDateList(): PredictionValues;
  addOrderDate(value?: google_type_date_pb.Date, index?: number): google_type_date_pb.Date;

  getPaymentDueDateList(): Array<google_type_date_pb.Date>;
  setPaymentDueDateList(value: Array<google_type_date_pb.Date>): PredictionValues;
  clearPaymentDueDateList(): PredictionValues;
  addPaymentDueDate(value?: google_type_date_pb.Date, index?: number): google_type_date_pb.Date;

  getDocumentTypeList(): Array<google_protobuf_wrappers_pb.StringValue>;
  setDocumentTypeList(value: Array<google_protobuf_wrappers_pb.StringValue>): PredictionValues;
  clearDocumentTypeList(): PredictionValues;
  addDocumentType(value?: google_protobuf_wrappers_pb.StringValue, index?: number): google_protobuf_wrappers_pb.StringValue;

  getCurrencyList(): Array<google_protobuf_wrappers_pb.StringValue>;
  setCurrencyList(value: Array<google_protobuf_wrappers_pb.StringValue>): PredictionValues;
  clearCurrencyList(): PredictionValues;
  addCurrency(value?: google_protobuf_wrappers_pb.StringValue, index?: number): google_protobuf_wrappers_pb.StringValue;

  getCreditCardLastFourList(): Array<google_protobuf_wrappers_pb.StringValue>;
  setCreditCardLastFourList(value: Array<google_protobuf_wrappers_pb.StringValue>): PredictionValues;
  clearCreditCardLastFourList(): PredictionValues;
  addCreditCardLastFour(value?: google_protobuf_wrappers_pb.StringValue, index?: number): google_protobuf_wrappers_pb.StringValue;

  getPaymentMethodList(): Array<google_protobuf_wrappers_pb.StringValue>;
  setPaymentMethodList(value: Array<google_protobuf_wrappers_pb.StringValue>): PredictionValues;
  clearPaymentMethodList(): PredictionValues;
  addPaymentMethod(value?: google_protobuf_wrappers_pb.StringValue, index?: number): google_protobuf_wrappers_pb.StringValue;

  getOcrLineDkTypeList(): Array<google_protobuf_wrappers_pb.StringValue>;
  setOcrLineDkTypeList(value: Array<google_protobuf_wrappers_pb.StringValue>): PredictionValues;
  clearOcrLineDkTypeList(): PredictionValues;
  addOcrLineDkType(value?: google_protobuf_wrappers_pb.StringValue, index?: number): google_protobuf_wrappers_pb.StringValue;

  getOcrLineDkPaymentIdList(): Array<google_protobuf_wrappers_pb.StringValue>;
  setOcrLineDkPaymentIdList(value: Array<google_protobuf_wrappers_pb.StringValue>): PredictionValues;
  clearOcrLineDkPaymentIdList(): PredictionValues;
  addOcrLineDkPaymentId(value?: google_protobuf_wrappers_pb.StringValue, index?: number): google_protobuf_wrappers_pb.StringValue;

  getOcrLineDkCreditorIdList(): Array<google_protobuf_wrappers_pb.StringValue>;
  setOcrLineDkCreditorIdList(value: Array<google_protobuf_wrappers_pb.StringValue>): PredictionValues;
  clearOcrLineDkCreditorIdList(): PredictionValues;
  addOcrLineDkCreditorId(value?: google_protobuf_wrappers_pb.StringValue, index?: number): google_protobuf_wrappers_pb.StringValue;

  getOcrLineSePaymentIdList(): Array<google_protobuf_wrappers_pb.StringValue>;
  setOcrLineSePaymentIdList(value: Array<google_protobuf_wrappers_pb.StringValue>): PredictionValues;
  clearOcrLineSePaymentIdList(): PredictionValues;
  addOcrLineSePaymentId(value?: google_protobuf_wrappers_pb.StringValue, index?: number): google_protobuf_wrappers_pb.StringValue;

  getOcrLineSeBankgiroCreditorIdList(): Array<google_protobuf_wrappers_pb.StringValue>;
  setOcrLineSeBankgiroCreditorIdList(value: Array<google_protobuf_wrappers_pb.StringValue>): PredictionValues;
  clearOcrLineSeBankgiroCreditorIdList(): PredictionValues;
  addOcrLineSeBankgiroCreditorId(value?: google_protobuf_wrappers_pb.StringValue, index?: number): google_protobuf_wrappers_pb.StringValue;

  getOcrLineSePlusgiroCreditorIdList(): Array<google_protobuf_wrappers_pb.StringValue>;
  setOcrLineSePlusgiroCreditorIdList(value: Array<google_protobuf_wrappers_pb.StringValue>): PredictionValues;
  clearOcrLineSePlusgiroCreditorIdList(): PredictionValues;
  addOcrLineSePlusgiroCreditorId(value?: google_protobuf_wrappers_pb.StringValue, index?: number): google_protobuf_wrappers_pb.StringValue;

  getOcrLineNoPaymentIdList(): Array<google_protobuf_wrappers_pb.StringValue>;
  setOcrLineNoPaymentIdList(value: Array<google_protobuf_wrappers_pb.StringValue>): PredictionValues;
  clearOcrLineNoPaymentIdList(): PredictionValues;
  addOcrLineNoPaymentId(value?: google_protobuf_wrappers_pb.StringValue, index?: number): google_protobuf_wrappers_pb.StringValue;

  getOcrLineFiPaymentIdList(): Array<google_protobuf_wrappers_pb.StringValue>;
  setOcrLineFiPaymentIdList(value: Array<google_protobuf_wrappers_pb.StringValue>): PredictionValues;
  clearOcrLineFiPaymentIdList(): PredictionValues;
  addOcrLineFiPaymentId(value?: google_protobuf_wrappers_pb.StringValue, index?: number): google_protobuf_wrappers_pb.StringValue;

  getOcrLineNlPaymentIdList(): Array<google_protobuf_wrappers_pb.StringValue>;
  setOcrLineNlPaymentIdList(value: Array<google_protobuf_wrappers_pb.StringValue>): PredictionValues;
  clearOcrLineNlPaymentIdList(): PredictionValues;
  addOcrLineNlPaymentId(value?: google_protobuf_wrappers_pb.StringValue, index?: number): google_protobuf_wrappers_pb.StringValue;

  getSupplierCorporateIdList(): Array<google_protobuf_wrappers_pb.StringValue>;
  setSupplierCorporateIdList(value: Array<google_protobuf_wrappers_pb.StringValue>): PredictionValues;
  clearSupplierCorporateIdList(): PredictionValues;
  addSupplierCorporateId(value?: google_protobuf_wrappers_pb.StringValue, index?: number): google_protobuf_wrappers_pb.StringValue;

  getSupplierCountryCodeList(): Array<google_protobuf_wrappers_pb.StringValue>;
  setSupplierCountryCodeList(value: Array<google_protobuf_wrappers_pb.StringValue>): PredictionValues;
  clearSupplierCountryCodeList(): PredictionValues;
  addSupplierCountryCode(value?: google_protobuf_wrappers_pb.StringValue, index?: number): google_protobuf_wrappers_pb.StringValue;

  getInvoiceNumberList(): Array<google_protobuf_wrappers_pb.StringValue>;
  setInvoiceNumberList(value: Array<google_protobuf_wrappers_pb.StringValue>): PredictionValues;
  clearInvoiceNumberList(): PredictionValues;
  addInvoiceNumber(value?: google_protobuf_wrappers_pb.StringValue, index?: number): google_protobuf_wrappers_pb.StringValue;

  getIbanList(): Array<google_protobuf_wrappers_pb.StringValue>;
  setIbanList(value: Array<google_protobuf_wrappers_pb.StringValue>): PredictionValues;
  clearIbanList(): PredictionValues;
  addIban(value?: google_protobuf_wrappers_pb.StringValue, index?: number): google_protobuf_wrappers_pb.StringValue;

  getOrderReferenceList(): Array<google_protobuf_wrappers_pb.StringValue>;
  setOrderReferenceList(value: Array<google_protobuf_wrappers_pb.StringValue>): PredictionValues;
  clearOrderReferenceList(): PredictionValues;
  addOrderReference(value?: google_protobuf_wrappers_pb.StringValue, index?: number): google_protobuf_wrappers_pb.StringValue;

  getBankAccountNumberList(): Array<google_protobuf_wrappers_pb.StringValue>;
  setBankAccountNumberList(value: Array<google_protobuf_wrappers_pb.StringValue>): PredictionValues;
  clearBankAccountNumberList(): PredictionValues;
  addBankAccountNumber(value?: google_protobuf_wrappers_pb.StringValue, index?: number): google_protobuf_wrappers_pb.StringValue;

  getBankRegistrationNumberList(): Array<google_protobuf_wrappers_pb.StringValue>;
  setBankRegistrationNumberList(value: Array<google_protobuf_wrappers_pb.StringValue>): PredictionValues;
  clearBankRegistrationNumberList(): PredictionValues;
  addBankRegistrationNumber(value?: google_protobuf_wrappers_pb.StringValue, index?: number): google_protobuf_wrappers_pb.StringValue;

  getSupplierNameList(): Array<google_protobuf_wrappers_pb.StringValue>;
  setSupplierNameList(value: Array<google_protobuf_wrappers_pb.StringValue>): PredictionValues;
  clearSupplierNameList(): PredictionValues;
  addSupplierName(value?: google_protobuf_wrappers_pb.StringValue, index?: number): google_protobuf_wrappers_pb.StringValue;

  getBicList(): Array<google_protobuf_wrappers_pb.StringValue>;
  setBicList(value: Array<google_protobuf_wrappers_pb.StringValue>): PredictionValues;
  clearBicList(): PredictionValues;
  addBic(value?: google_protobuf_wrappers_pb.StringValue, index?: number): google_protobuf_wrappers_pb.StringValue;

  getDocumentNumberList(): Array<google_protobuf_wrappers_pb.StringValue>;
  setDocumentNumberList(value: Array<google_protobuf_wrappers_pb.StringValue>): PredictionValues;
  clearDocumentNumberList(): PredictionValues;
  addDocumentNumber(value?: google_protobuf_wrappers_pb.StringValue, index?: number): google_protobuf_wrappers_pb.StringValue;

  getDocumentDateList(): Array<google_type_date_pb.Date>;
  setDocumentDateList(value: Array<google_type_date_pb.Date>): PredictionValues;
  clearDocumentDateList(): PredictionValues;
  addDocumentDate(value?: google_type_date_pb.Date, index?: number): google_type_date_pb.Date;

  getOrderNumberList(): Array<google_protobuf_wrappers_pb.StringValue>;
  setOrderNumberList(value: Array<google_protobuf_wrappers_pb.StringValue>): PredictionValues;
  clearOrderNumberList(): PredictionValues;
  addOrderNumber(value?: google_protobuf_wrappers_pb.StringValue, index?: number): google_protobuf_wrappers_pb.StringValue;

  getSupplierVatNumberList(): Array<google_protobuf_wrappers_pb.StringValue>;
  setSupplierVatNumberList(value: Array<google_protobuf_wrappers_pb.StringValue>): PredictionValues;
  clearSupplierVatNumberList(): PredictionValues;
  addSupplierVatNumber(value?: google_protobuf_wrappers_pb.StringValue, index?: number): google_protobuf_wrappers_pb.StringValue;

  getSupplierOrganisationNumberList(): Array<google_protobuf_wrappers_pb.StringValue>;
  setSupplierOrganisationNumberList(value: Array<google_protobuf_wrappers_pb.StringValue>): PredictionValues;
  clearSupplierOrganisationNumberList(): PredictionValues;
  addSupplierOrganisationNumber(value?: google_protobuf_wrappers_pb.StringValue, index?: number): google_protobuf_wrappers_pb.StringValue;

  getSupplierAddressList(): Array<google_protobuf_wrappers_pb.StringValue>;
  setSupplierAddressList(value: Array<google_protobuf_wrappers_pb.StringValue>): PredictionValues;
  clearSupplierAddressList(): PredictionValues;
  addSupplierAddress(value?: google_protobuf_wrappers_pb.StringValue, index?: number): google_protobuf_wrappers_pb.StringValue;

  getCustomerNumberList(): Array<google_protobuf_wrappers_pb.StringValue>;
  setCustomerNumberList(value: Array<google_protobuf_wrappers_pb.StringValue>): PredictionValues;
  clearCustomerNumberList(): PredictionValues;
  addCustomerNumber(value?: google_protobuf_wrappers_pb.StringValue, index?: number): google_protobuf_wrappers_pb.StringValue;

  getReceiverOrderNumberList(): Array<google_protobuf_wrappers_pb.StringValue>;
  setReceiverOrderNumberList(value: Array<google_protobuf_wrappers_pb.StringValue>): PredictionValues;
  clearReceiverOrderNumberList(): PredictionValues;
  addReceiverOrderNumber(value?: google_protobuf_wrappers_pb.StringValue, index?: number): google_protobuf_wrappers_pb.StringValue;

  getOcrLineBePaymentIdList(): Array<google_protobuf_wrappers_pb.StringValue>;
  setOcrLineBePaymentIdList(value: Array<google_protobuf_wrappers_pb.StringValue>): PredictionValues;
  clearOcrLineBePaymentIdList(): PredictionValues;
  addOcrLineBePaymentId(value?: google_protobuf_wrappers_pb.StringValue, index?: number): google_protobuf_wrappers_pb.StringValue;

  getReceiverAddressList(): Array<google_protobuf_wrappers_pb.StringValue>;
  setReceiverAddressList(value: Array<google_protobuf_wrappers_pb.StringValue>): PredictionValues;
  clearReceiverAddressList(): PredictionValues;
  addReceiverAddress(value?: google_protobuf_wrappers_pb.StringValue, index?: number): google_protobuf_wrappers_pb.StringValue;

  getReceiverCountryCodeList(): Array<google_protobuf_wrappers_pb.StringValue>;
  setReceiverCountryCodeList(value: Array<google_protobuf_wrappers_pb.StringValue>): PredictionValues;
  clearReceiverCountryCodeList(): PredictionValues;
  addReceiverCountryCode(value?: google_protobuf_wrappers_pb.StringValue, index?: number): google_protobuf_wrappers_pb.StringValue;

  getReceiverNameList(): Array<google_protobuf_wrappers_pb.StringValue>;
  setReceiverNameList(value: Array<google_protobuf_wrappers_pb.StringValue>): PredictionValues;
  clearReceiverNameList(): PredictionValues;
  addReceiverName(value?: google_protobuf_wrappers_pb.StringValue, index?: number): google_protobuf_wrappers_pb.StringValue;

  getReceiverVatNumberList(): Array<google_protobuf_wrappers_pb.StringValue>;
  setReceiverVatNumberList(value: Array<google_protobuf_wrappers_pb.StringValue>): PredictionValues;
  clearReceiverVatNumberList(): PredictionValues;
  addReceiverVatNumber(value?: google_protobuf_wrappers_pb.StringValue, index?: number): google_protobuf_wrappers_pb.StringValue;

  getPurchaseLinesList(): Array<ssn_type_candidate_pb.PurchaseLineCandidate>;
  setPurchaseLinesList(value: Array<ssn_type_candidate_pb.PurchaseLineCandidate>): PredictionValues;
  clearPurchaseLinesList(): PredictionValues;
  addPurchaseLines(value?: ssn_type_candidate_pb.PurchaseLineCandidate, index?: number): ssn_type_candidate_pb.PurchaseLineCandidate;

  getAnswersList(): Array<ssn_type_candidate_pb.AnswerCandidate>;
  setAnswersList(value: Array<ssn_type_candidate_pb.AnswerCandidate>): PredictionValues;
  clearAnswersList(): PredictionValues;
  addAnswers(value?: ssn_type_candidate_pb.AnswerCandidate, index?: number): ssn_type_candidate_pb.AnswerCandidate;

  getVatDistributionList(): Array<ssn_type_candidate_pb.VatDistributionCandidate>;
  setVatDistributionList(value: Array<ssn_type_candidate_pb.VatDistributionCandidate>): PredictionValues;
  clearVatDistributionList(): PredictionValues;
  addVatDistribution(value?: ssn_type_candidate_pb.VatDistributionCandidate, index?: number): ssn_type_candidate_pb.VatDistributionCandidate;

  getCheckInDateList(): Array<google_type_date_pb.Date>;
  setCheckInDateList(value: Array<google_type_date_pb.Date>): PredictionValues;
  clearCheckInDateList(): PredictionValues;
  addCheckInDate(value?: google_type_date_pb.Date, index?: number): google_type_date_pb.Date;

  getCheckOutDateList(): Array<google_type_date_pb.Date>;
  setCheckOutDateList(value: Array<google_type_date_pb.Date>): PredictionValues;
  clearCheckOutDateList(): PredictionValues;
  addCheckOutDate(value?: google_type_date_pb.Date, index?: number): google_type_date_pb.Date;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): PredictionValues.AsObject;
  static toObject(includeInstance: boolean, msg: PredictionValues): PredictionValues.AsObject;
  static serializeBinaryToWriter(message: PredictionValues, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): PredictionValues;
  static deserializeBinaryFromReader(message: PredictionValues, reader: jspb.BinaryReader): PredictionValues;
}

export namespace PredictionValues {
  export type AsObject = {
    totalInclVatList: Array<google_protobuf_wrappers_pb.DoubleValue.AsObject>,
    totalVatList: Array<google_protobuf_wrappers_pb.DoubleValue.AsObject>,
    totalExclVatList: Array<google_protobuf_wrappers_pb.DoubleValue.AsObject>,
    orderDateList: Array<google_type_date_pb.Date.AsObject>,
    paymentDueDateList: Array<google_type_date_pb.Date.AsObject>,
    documentTypeList: Array<google_protobuf_wrappers_pb.StringValue.AsObject>,
    currencyList: Array<google_protobuf_wrappers_pb.StringValue.AsObject>,
    creditCardLastFourList: Array<google_protobuf_wrappers_pb.StringValue.AsObject>,
    paymentMethodList: Array<google_protobuf_wrappers_pb.StringValue.AsObject>,
    ocrLineDkTypeList: Array<google_protobuf_wrappers_pb.StringValue.AsObject>,
    ocrLineDkPaymentIdList: Array<google_protobuf_wrappers_pb.StringValue.AsObject>,
    ocrLineDkCreditorIdList: Array<google_protobuf_wrappers_pb.StringValue.AsObject>,
    ocrLineSePaymentIdList: Array<google_protobuf_wrappers_pb.StringValue.AsObject>,
    ocrLineSeBankgiroCreditorIdList: Array<google_protobuf_wrappers_pb.StringValue.AsObject>,
    ocrLineSePlusgiroCreditorIdList: Array<google_protobuf_wrappers_pb.StringValue.AsObject>,
    ocrLineNoPaymentIdList: Array<google_protobuf_wrappers_pb.StringValue.AsObject>,
    ocrLineFiPaymentIdList: Array<google_protobuf_wrappers_pb.StringValue.AsObject>,
    ocrLineNlPaymentIdList: Array<google_protobuf_wrappers_pb.StringValue.AsObject>,
    supplierCorporateIdList: Array<google_protobuf_wrappers_pb.StringValue.AsObject>,
    supplierCountryCodeList: Array<google_protobuf_wrappers_pb.StringValue.AsObject>,
    invoiceNumberList: Array<google_protobuf_wrappers_pb.StringValue.AsObject>,
    ibanList: Array<google_protobuf_wrappers_pb.StringValue.AsObject>,
    orderReferenceList: Array<google_protobuf_wrappers_pb.StringValue.AsObject>,
    bankAccountNumberList: Array<google_protobuf_wrappers_pb.StringValue.AsObject>,
    bankRegistrationNumberList: Array<google_protobuf_wrappers_pb.StringValue.AsObject>,
    supplierNameList: Array<google_protobuf_wrappers_pb.StringValue.AsObject>,
    bicList: Array<google_protobuf_wrappers_pb.StringValue.AsObject>,
    documentNumberList: Array<google_protobuf_wrappers_pb.StringValue.AsObject>,
    documentDateList: Array<google_type_date_pb.Date.AsObject>,
    orderNumberList: Array<google_protobuf_wrappers_pb.StringValue.AsObject>,
    supplierVatNumberList: Array<google_protobuf_wrappers_pb.StringValue.AsObject>,
    supplierOrganisationNumberList: Array<google_protobuf_wrappers_pb.StringValue.AsObject>,
    supplierAddressList: Array<google_protobuf_wrappers_pb.StringValue.AsObject>,
    customerNumberList: Array<google_protobuf_wrappers_pb.StringValue.AsObject>,
    receiverOrderNumberList: Array<google_protobuf_wrappers_pb.StringValue.AsObject>,
    ocrLineBePaymentIdList: Array<google_protobuf_wrappers_pb.StringValue.AsObject>,
    receiverAddressList: Array<google_protobuf_wrappers_pb.StringValue.AsObject>,
    receiverCountryCodeList: Array<google_protobuf_wrappers_pb.StringValue.AsObject>,
    receiverNameList: Array<google_protobuf_wrappers_pb.StringValue.AsObject>,
    receiverVatNumberList: Array<google_protobuf_wrappers_pb.StringValue.AsObject>,
    purchaseLinesList: Array<ssn_type_candidate_pb.PurchaseLineCandidate.AsObject>,
    answersList: Array<ssn_type_candidate_pb.AnswerCandidate.AsObject>,
    vatDistributionList: Array<ssn_type_candidate_pb.VatDistributionCandidate.AsObject>,
    checkInDateList: Array<google_type_date_pb.Date.AsObject>,
    checkOutDateList: Array<google_type_date_pb.Date.AsObject>,
  }
}

export class PredictionConfidences extends jspb.Message {
  getTotalInclVatList(): Array<google_protobuf_wrappers_pb.FloatValue>;
  setTotalInclVatList(value: Array<google_protobuf_wrappers_pb.FloatValue>): PredictionConfidences;
  clearTotalInclVatList(): PredictionConfidences;
  addTotalInclVat(value?: google_protobuf_wrappers_pb.FloatValue, index?: number): google_protobuf_wrappers_pb.FloatValue;

  getTotalVatList(): Array<google_protobuf_wrappers_pb.FloatValue>;
  setTotalVatList(value: Array<google_protobuf_wrappers_pb.FloatValue>): PredictionConfidences;
  clearTotalVatList(): PredictionConfidences;
  addTotalVat(value?: google_protobuf_wrappers_pb.FloatValue, index?: number): google_protobuf_wrappers_pb.FloatValue;

  getTotalExclVatList(): Array<google_protobuf_wrappers_pb.FloatValue>;
  setTotalExclVatList(value: Array<google_protobuf_wrappers_pb.FloatValue>): PredictionConfidences;
  clearTotalExclVatList(): PredictionConfidences;
  addTotalExclVat(value?: google_protobuf_wrappers_pb.FloatValue, index?: number): google_protobuf_wrappers_pb.FloatValue;

  getOrderDateList(): Array<google_protobuf_wrappers_pb.FloatValue>;
  setOrderDateList(value: Array<google_protobuf_wrappers_pb.FloatValue>): PredictionConfidences;
  clearOrderDateList(): PredictionConfidences;
  addOrderDate(value?: google_protobuf_wrappers_pb.FloatValue, index?: number): google_protobuf_wrappers_pb.FloatValue;

  getPaymentDueDateList(): Array<google_protobuf_wrappers_pb.FloatValue>;
  setPaymentDueDateList(value: Array<google_protobuf_wrappers_pb.FloatValue>): PredictionConfidences;
  clearPaymentDueDateList(): PredictionConfidences;
  addPaymentDueDate(value?: google_protobuf_wrappers_pb.FloatValue, index?: number): google_protobuf_wrappers_pb.FloatValue;

  getDocumentTypeList(): Array<google_protobuf_wrappers_pb.FloatValue>;
  setDocumentTypeList(value: Array<google_protobuf_wrappers_pb.FloatValue>): PredictionConfidences;
  clearDocumentTypeList(): PredictionConfidences;
  addDocumentType(value?: google_protobuf_wrappers_pb.FloatValue, index?: number): google_protobuf_wrappers_pb.FloatValue;

  getCurrencyList(): Array<google_protobuf_wrappers_pb.FloatValue>;
  setCurrencyList(value: Array<google_protobuf_wrappers_pb.FloatValue>): PredictionConfidences;
  clearCurrencyList(): PredictionConfidences;
  addCurrency(value?: google_protobuf_wrappers_pb.FloatValue, index?: number): google_protobuf_wrappers_pb.FloatValue;

  getCreditCardLastFourList(): Array<google_protobuf_wrappers_pb.FloatValue>;
  setCreditCardLastFourList(value: Array<google_protobuf_wrappers_pb.FloatValue>): PredictionConfidences;
  clearCreditCardLastFourList(): PredictionConfidences;
  addCreditCardLastFour(value?: google_protobuf_wrappers_pb.FloatValue, index?: number): google_protobuf_wrappers_pb.FloatValue;

  getPaymentMethodList(): Array<google_protobuf_wrappers_pb.FloatValue>;
  setPaymentMethodList(value: Array<google_protobuf_wrappers_pb.FloatValue>): PredictionConfidences;
  clearPaymentMethodList(): PredictionConfidences;
  addPaymentMethod(value?: google_protobuf_wrappers_pb.FloatValue, index?: number): google_protobuf_wrappers_pb.FloatValue;

  getOcrLineDkTypeList(): Array<google_protobuf_wrappers_pb.FloatValue>;
  setOcrLineDkTypeList(value: Array<google_protobuf_wrappers_pb.FloatValue>): PredictionConfidences;
  clearOcrLineDkTypeList(): PredictionConfidences;
  addOcrLineDkType(value?: google_protobuf_wrappers_pb.FloatValue, index?: number): google_protobuf_wrappers_pb.FloatValue;

  getOcrLineDkPaymentIdList(): Array<google_protobuf_wrappers_pb.FloatValue>;
  setOcrLineDkPaymentIdList(value: Array<google_protobuf_wrappers_pb.FloatValue>): PredictionConfidences;
  clearOcrLineDkPaymentIdList(): PredictionConfidences;
  addOcrLineDkPaymentId(value?: google_protobuf_wrappers_pb.FloatValue, index?: number): google_protobuf_wrappers_pb.FloatValue;

  getOcrLineDkCreditorIdList(): Array<google_protobuf_wrappers_pb.FloatValue>;
  setOcrLineDkCreditorIdList(value: Array<google_protobuf_wrappers_pb.FloatValue>): PredictionConfidences;
  clearOcrLineDkCreditorIdList(): PredictionConfidences;
  addOcrLineDkCreditorId(value?: google_protobuf_wrappers_pb.FloatValue, index?: number): google_protobuf_wrappers_pb.FloatValue;

  getOcrLineSePaymentIdList(): Array<google_protobuf_wrappers_pb.FloatValue>;
  setOcrLineSePaymentIdList(value: Array<google_protobuf_wrappers_pb.FloatValue>): PredictionConfidences;
  clearOcrLineSePaymentIdList(): PredictionConfidences;
  addOcrLineSePaymentId(value?: google_protobuf_wrappers_pb.FloatValue, index?: number): google_protobuf_wrappers_pb.FloatValue;

  getOcrLineSeBankgiroCreditorIdList(): Array<google_protobuf_wrappers_pb.FloatValue>;
  setOcrLineSeBankgiroCreditorIdList(value: Array<google_protobuf_wrappers_pb.FloatValue>): PredictionConfidences;
  clearOcrLineSeBankgiroCreditorIdList(): PredictionConfidences;
  addOcrLineSeBankgiroCreditorId(value?: google_protobuf_wrappers_pb.FloatValue, index?: number): google_protobuf_wrappers_pb.FloatValue;

  getOcrLineSePlusgiroCreditorIdList(): Array<google_protobuf_wrappers_pb.FloatValue>;
  setOcrLineSePlusgiroCreditorIdList(value: Array<google_protobuf_wrappers_pb.FloatValue>): PredictionConfidences;
  clearOcrLineSePlusgiroCreditorIdList(): PredictionConfidences;
  addOcrLineSePlusgiroCreditorId(value?: google_protobuf_wrappers_pb.FloatValue, index?: number): google_protobuf_wrappers_pb.FloatValue;

  getOcrLineNoPaymentIdList(): Array<google_protobuf_wrappers_pb.FloatValue>;
  setOcrLineNoPaymentIdList(value: Array<google_protobuf_wrappers_pb.FloatValue>): PredictionConfidences;
  clearOcrLineNoPaymentIdList(): PredictionConfidences;
  addOcrLineNoPaymentId(value?: google_protobuf_wrappers_pb.FloatValue, index?: number): google_protobuf_wrappers_pb.FloatValue;

  getOcrLineFiPaymentIdList(): Array<google_protobuf_wrappers_pb.FloatValue>;
  setOcrLineFiPaymentIdList(value: Array<google_protobuf_wrappers_pb.FloatValue>): PredictionConfidences;
  clearOcrLineFiPaymentIdList(): PredictionConfidences;
  addOcrLineFiPaymentId(value?: google_protobuf_wrappers_pb.FloatValue, index?: number): google_protobuf_wrappers_pb.FloatValue;

  getOcrLineNlPaymentIdList(): Array<google_protobuf_wrappers_pb.FloatValue>;
  setOcrLineNlPaymentIdList(value: Array<google_protobuf_wrappers_pb.FloatValue>): PredictionConfidences;
  clearOcrLineNlPaymentIdList(): PredictionConfidences;
  addOcrLineNlPaymentId(value?: google_protobuf_wrappers_pb.FloatValue, index?: number): google_protobuf_wrappers_pb.FloatValue;

  getSupplierCorporateIdList(): Array<google_protobuf_wrappers_pb.FloatValue>;
  setSupplierCorporateIdList(value: Array<google_protobuf_wrappers_pb.FloatValue>): PredictionConfidences;
  clearSupplierCorporateIdList(): PredictionConfidences;
  addSupplierCorporateId(value?: google_protobuf_wrappers_pb.FloatValue, index?: number): google_protobuf_wrappers_pb.FloatValue;

  getSupplierCountryCodeList(): Array<google_protobuf_wrappers_pb.FloatValue>;
  setSupplierCountryCodeList(value: Array<google_protobuf_wrappers_pb.FloatValue>): PredictionConfidences;
  clearSupplierCountryCodeList(): PredictionConfidences;
  addSupplierCountryCode(value?: google_protobuf_wrappers_pb.FloatValue, index?: number): google_protobuf_wrappers_pb.FloatValue;

  getInvoiceNumberList(): Array<google_protobuf_wrappers_pb.FloatValue>;
  setInvoiceNumberList(value: Array<google_protobuf_wrappers_pb.FloatValue>): PredictionConfidences;
  clearInvoiceNumberList(): PredictionConfidences;
  addInvoiceNumber(value?: google_protobuf_wrappers_pb.FloatValue, index?: number): google_protobuf_wrappers_pb.FloatValue;

  getIbanList(): Array<google_protobuf_wrappers_pb.FloatValue>;
  setIbanList(value: Array<google_protobuf_wrappers_pb.FloatValue>): PredictionConfidences;
  clearIbanList(): PredictionConfidences;
  addIban(value?: google_protobuf_wrappers_pb.FloatValue, index?: number): google_protobuf_wrappers_pb.FloatValue;

  getOrderReferenceList(): Array<google_protobuf_wrappers_pb.FloatValue>;
  setOrderReferenceList(value: Array<google_protobuf_wrappers_pb.FloatValue>): PredictionConfidences;
  clearOrderReferenceList(): PredictionConfidences;
  addOrderReference(value?: google_protobuf_wrappers_pb.FloatValue, index?: number): google_protobuf_wrappers_pb.FloatValue;

  getBankAccountNumberList(): Array<google_protobuf_wrappers_pb.FloatValue>;
  setBankAccountNumberList(value: Array<google_protobuf_wrappers_pb.FloatValue>): PredictionConfidences;
  clearBankAccountNumberList(): PredictionConfidences;
  addBankAccountNumber(value?: google_protobuf_wrappers_pb.FloatValue, index?: number): google_protobuf_wrappers_pb.FloatValue;

  getBankRegistrationNumberList(): Array<google_protobuf_wrappers_pb.FloatValue>;
  setBankRegistrationNumberList(value: Array<google_protobuf_wrappers_pb.FloatValue>): PredictionConfidences;
  clearBankRegistrationNumberList(): PredictionConfidences;
  addBankRegistrationNumber(value?: google_protobuf_wrappers_pb.FloatValue, index?: number): google_protobuf_wrappers_pb.FloatValue;

  getSupplierNameList(): Array<google_protobuf_wrappers_pb.FloatValue>;
  setSupplierNameList(value: Array<google_protobuf_wrappers_pb.FloatValue>): PredictionConfidences;
  clearSupplierNameList(): PredictionConfidences;
  addSupplierName(value?: google_protobuf_wrappers_pb.FloatValue, index?: number): google_protobuf_wrappers_pb.FloatValue;

  getBicList(): Array<google_protobuf_wrappers_pb.FloatValue>;
  setBicList(value: Array<google_protobuf_wrappers_pb.FloatValue>): PredictionConfidences;
  clearBicList(): PredictionConfidences;
  addBic(value?: google_protobuf_wrappers_pb.FloatValue, index?: number): google_protobuf_wrappers_pb.FloatValue;

  getDocumentNumberList(): Array<google_protobuf_wrappers_pb.FloatValue>;
  setDocumentNumberList(value: Array<google_protobuf_wrappers_pb.FloatValue>): PredictionConfidences;
  clearDocumentNumberList(): PredictionConfidences;
  addDocumentNumber(value?: google_protobuf_wrappers_pb.FloatValue, index?: number): google_protobuf_wrappers_pb.FloatValue;

  getDocumentDateList(): Array<google_protobuf_wrappers_pb.FloatValue>;
  setDocumentDateList(value: Array<google_protobuf_wrappers_pb.FloatValue>): PredictionConfidences;
  clearDocumentDateList(): PredictionConfidences;
  addDocumentDate(value?: google_protobuf_wrappers_pb.FloatValue, index?: number): google_protobuf_wrappers_pb.FloatValue;

  getOrderNumberList(): Array<google_protobuf_wrappers_pb.FloatValue>;
  setOrderNumberList(value: Array<google_protobuf_wrappers_pb.FloatValue>): PredictionConfidences;
  clearOrderNumberList(): PredictionConfidences;
  addOrderNumber(value?: google_protobuf_wrappers_pb.FloatValue, index?: number): google_protobuf_wrappers_pb.FloatValue;

  getSupplierVatNumberList(): Array<google_protobuf_wrappers_pb.FloatValue>;
  setSupplierVatNumberList(value: Array<google_protobuf_wrappers_pb.FloatValue>): PredictionConfidences;
  clearSupplierVatNumberList(): PredictionConfidences;
  addSupplierVatNumber(value?: google_protobuf_wrappers_pb.FloatValue, index?: number): google_protobuf_wrappers_pb.FloatValue;

  getSupplierOrganisationNumberList(): Array<google_protobuf_wrappers_pb.FloatValue>;
  setSupplierOrganisationNumberList(value: Array<google_protobuf_wrappers_pb.FloatValue>): PredictionConfidences;
  clearSupplierOrganisationNumberList(): PredictionConfidences;
  addSupplierOrganisationNumber(value?: google_protobuf_wrappers_pb.FloatValue, index?: number): google_protobuf_wrappers_pb.FloatValue;

  getSupplierAddressList(): Array<google_protobuf_wrappers_pb.FloatValue>;
  setSupplierAddressList(value: Array<google_protobuf_wrappers_pb.FloatValue>): PredictionConfidences;
  clearSupplierAddressList(): PredictionConfidences;
  addSupplierAddress(value?: google_protobuf_wrappers_pb.FloatValue, index?: number): google_protobuf_wrappers_pb.FloatValue;

  getCustomerNumberList(): Array<google_protobuf_wrappers_pb.FloatValue>;
  setCustomerNumberList(value: Array<google_protobuf_wrappers_pb.FloatValue>): PredictionConfidences;
  clearCustomerNumberList(): PredictionConfidences;
  addCustomerNumber(value?: google_protobuf_wrappers_pb.FloatValue, index?: number): google_protobuf_wrappers_pb.FloatValue;

  getReceiverOrderNumberList(): Array<google_protobuf_wrappers_pb.FloatValue>;
  setReceiverOrderNumberList(value: Array<google_protobuf_wrappers_pb.FloatValue>): PredictionConfidences;
  clearReceiverOrderNumberList(): PredictionConfidences;
  addReceiverOrderNumber(value?: google_protobuf_wrappers_pb.FloatValue, index?: number): google_protobuf_wrappers_pb.FloatValue;

  getOcrLineBePaymentIdList(): Array<google_protobuf_wrappers_pb.FloatValue>;
  setOcrLineBePaymentIdList(value: Array<google_protobuf_wrappers_pb.FloatValue>): PredictionConfidences;
  clearOcrLineBePaymentIdList(): PredictionConfidences;
  addOcrLineBePaymentId(value?: google_protobuf_wrappers_pb.FloatValue, index?: number): google_protobuf_wrappers_pb.FloatValue;

  getReceiverAddressList(): Array<google_protobuf_wrappers_pb.FloatValue>;
  setReceiverAddressList(value: Array<google_protobuf_wrappers_pb.FloatValue>): PredictionConfidences;
  clearReceiverAddressList(): PredictionConfidences;
  addReceiverAddress(value?: google_protobuf_wrappers_pb.FloatValue, index?: number): google_protobuf_wrappers_pb.FloatValue;

  getReceiverCountryCodeList(): Array<google_protobuf_wrappers_pb.FloatValue>;
  setReceiverCountryCodeList(value: Array<google_protobuf_wrappers_pb.FloatValue>): PredictionConfidences;
  clearReceiverCountryCodeList(): PredictionConfidences;
  addReceiverCountryCode(value?: google_protobuf_wrappers_pb.FloatValue, index?: number): google_protobuf_wrappers_pb.FloatValue;

  getReceiverNameList(): Array<google_protobuf_wrappers_pb.FloatValue>;
  setReceiverNameList(value: Array<google_protobuf_wrappers_pb.FloatValue>): PredictionConfidences;
  clearReceiverNameList(): PredictionConfidences;
  addReceiverName(value?: google_protobuf_wrappers_pb.FloatValue, index?: number): google_protobuf_wrappers_pb.FloatValue;

  getReceiverVatNumberList(): Array<google_protobuf_wrappers_pb.FloatValue>;
  setReceiverVatNumberList(value: Array<google_protobuf_wrappers_pb.FloatValue>): PredictionConfidences;
  clearReceiverVatNumberList(): PredictionConfidences;
  addReceiverVatNumber(value?: google_protobuf_wrappers_pb.FloatValue, index?: number): google_protobuf_wrappers_pb.FloatValue;

  getCheckInDateList(): Array<google_protobuf_wrappers_pb.FloatValue>;
  setCheckInDateList(value: Array<google_protobuf_wrappers_pb.FloatValue>): PredictionConfidences;
  clearCheckInDateList(): PredictionConfidences;
  addCheckInDate(value?: google_protobuf_wrappers_pb.FloatValue, index?: number): google_protobuf_wrappers_pb.FloatValue;

  getCheckOutDateList(): Array<google_protobuf_wrappers_pb.FloatValue>;
  setCheckOutDateList(value: Array<google_protobuf_wrappers_pb.FloatValue>): PredictionConfidences;
  clearCheckOutDateList(): PredictionConfidences;
  addCheckOutDate(value?: google_protobuf_wrappers_pb.FloatValue, index?: number): google_protobuf_wrappers_pb.FloatValue;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): PredictionConfidences.AsObject;
  static toObject(includeInstance: boolean, msg: PredictionConfidences): PredictionConfidences.AsObject;
  static serializeBinaryToWriter(message: PredictionConfidences, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): PredictionConfidences;
  static deserializeBinaryFromReader(message: PredictionConfidences, reader: jspb.BinaryReader): PredictionConfidences;
}

export namespace PredictionConfidences {
  export type AsObject = {
    totalInclVatList: Array<google_protobuf_wrappers_pb.FloatValue.AsObject>,
    totalVatList: Array<google_protobuf_wrappers_pb.FloatValue.AsObject>,
    totalExclVatList: Array<google_protobuf_wrappers_pb.FloatValue.AsObject>,
    orderDateList: Array<google_protobuf_wrappers_pb.FloatValue.AsObject>,
    paymentDueDateList: Array<google_protobuf_wrappers_pb.FloatValue.AsObject>,
    documentTypeList: Array<google_protobuf_wrappers_pb.FloatValue.AsObject>,
    currencyList: Array<google_protobuf_wrappers_pb.FloatValue.AsObject>,
    creditCardLastFourList: Array<google_protobuf_wrappers_pb.FloatValue.AsObject>,
    paymentMethodList: Array<google_protobuf_wrappers_pb.FloatValue.AsObject>,
    ocrLineDkTypeList: Array<google_protobuf_wrappers_pb.FloatValue.AsObject>,
    ocrLineDkPaymentIdList: Array<google_protobuf_wrappers_pb.FloatValue.AsObject>,
    ocrLineDkCreditorIdList: Array<google_protobuf_wrappers_pb.FloatValue.AsObject>,
    ocrLineSePaymentIdList: Array<google_protobuf_wrappers_pb.FloatValue.AsObject>,
    ocrLineSeBankgiroCreditorIdList: Array<google_protobuf_wrappers_pb.FloatValue.AsObject>,
    ocrLineSePlusgiroCreditorIdList: Array<google_protobuf_wrappers_pb.FloatValue.AsObject>,
    ocrLineNoPaymentIdList: Array<google_protobuf_wrappers_pb.FloatValue.AsObject>,
    ocrLineFiPaymentIdList: Array<google_protobuf_wrappers_pb.FloatValue.AsObject>,
    ocrLineNlPaymentIdList: Array<google_protobuf_wrappers_pb.FloatValue.AsObject>,
    supplierCorporateIdList: Array<google_protobuf_wrappers_pb.FloatValue.AsObject>,
    supplierCountryCodeList: Array<google_protobuf_wrappers_pb.FloatValue.AsObject>,
    invoiceNumberList: Array<google_protobuf_wrappers_pb.FloatValue.AsObject>,
    ibanList: Array<google_protobuf_wrappers_pb.FloatValue.AsObject>,
    orderReferenceList: Array<google_protobuf_wrappers_pb.FloatValue.AsObject>,
    bankAccountNumberList: Array<google_protobuf_wrappers_pb.FloatValue.AsObject>,
    bankRegistrationNumberList: Array<google_protobuf_wrappers_pb.FloatValue.AsObject>,
    supplierNameList: Array<google_protobuf_wrappers_pb.FloatValue.AsObject>,
    bicList: Array<google_protobuf_wrappers_pb.FloatValue.AsObject>,
    documentNumberList: Array<google_protobuf_wrappers_pb.FloatValue.AsObject>,
    documentDateList: Array<google_protobuf_wrappers_pb.FloatValue.AsObject>,
    orderNumberList: Array<google_protobuf_wrappers_pb.FloatValue.AsObject>,
    supplierVatNumberList: Array<google_protobuf_wrappers_pb.FloatValue.AsObject>,
    supplierOrganisationNumberList: Array<google_protobuf_wrappers_pb.FloatValue.AsObject>,
    supplierAddressList: Array<google_protobuf_wrappers_pb.FloatValue.AsObject>,
    customerNumberList: Array<google_protobuf_wrappers_pb.FloatValue.AsObject>,
    receiverOrderNumberList: Array<google_protobuf_wrappers_pb.FloatValue.AsObject>,
    ocrLineBePaymentIdList: Array<google_protobuf_wrappers_pb.FloatValue.AsObject>,
    receiverAddressList: Array<google_protobuf_wrappers_pb.FloatValue.AsObject>,
    receiverCountryCodeList: Array<google_protobuf_wrappers_pb.FloatValue.AsObject>,
    receiverNameList: Array<google_protobuf_wrappers_pb.FloatValue.AsObject>,
    receiverVatNumberList: Array<google_protobuf_wrappers_pb.FloatValue.AsObject>,
    checkInDateList: Array<google_protobuf_wrappers_pb.FloatValue.AsObject>,
    checkOutDateList: Array<google_protobuf_wrappers_pb.FloatValue.AsObject>,
  }
}

export class PredictionMetadata extends jspb.Message {
  getTotalInclVatList(): Array<ssn_type_candidate_pb.ModelSpec>;
  setTotalInclVatList(value: Array<ssn_type_candidate_pb.ModelSpec>): PredictionMetadata;
  clearTotalInclVatList(): PredictionMetadata;
  addTotalInclVat(value?: ssn_type_candidate_pb.ModelSpec, index?: number): ssn_type_candidate_pb.ModelSpec;

  getTotalVatList(): Array<ssn_type_candidate_pb.ModelSpec>;
  setTotalVatList(value: Array<ssn_type_candidate_pb.ModelSpec>): PredictionMetadata;
  clearTotalVatList(): PredictionMetadata;
  addTotalVat(value?: ssn_type_candidate_pb.ModelSpec, index?: number): ssn_type_candidate_pb.ModelSpec;

  getTotalExclVatList(): Array<ssn_type_candidate_pb.ModelSpec>;
  setTotalExclVatList(value: Array<ssn_type_candidate_pb.ModelSpec>): PredictionMetadata;
  clearTotalExclVatList(): PredictionMetadata;
  addTotalExclVat(value?: ssn_type_candidate_pb.ModelSpec, index?: number): ssn_type_candidate_pb.ModelSpec;

  getOrderDateList(): Array<ssn_type_candidate_pb.ModelSpec>;
  setOrderDateList(value: Array<ssn_type_candidate_pb.ModelSpec>): PredictionMetadata;
  clearOrderDateList(): PredictionMetadata;
  addOrderDate(value?: ssn_type_candidate_pb.ModelSpec, index?: number): ssn_type_candidate_pb.ModelSpec;

  getPaymentDueDateList(): Array<ssn_type_candidate_pb.ModelSpec>;
  setPaymentDueDateList(value: Array<ssn_type_candidate_pb.ModelSpec>): PredictionMetadata;
  clearPaymentDueDateList(): PredictionMetadata;
  addPaymentDueDate(value?: ssn_type_candidate_pb.ModelSpec, index?: number): ssn_type_candidate_pb.ModelSpec;

  getDocumentTypeList(): Array<ssn_type_candidate_pb.ModelSpec>;
  setDocumentTypeList(value: Array<ssn_type_candidate_pb.ModelSpec>): PredictionMetadata;
  clearDocumentTypeList(): PredictionMetadata;
  addDocumentType(value?: ssn_type_candidate_pb.ModelSpec, index?: number): ssn_type_candidate_pb.ModelSpec;

  getCurrencyList(): Array<ssn_type_candidate_pb.ModelSpec>;
  setCurrencyList(value: Array<ssn_type_candidate_pb.ModelSpec>): PredictionMetadata;
  clearCurrencyList(): PredictionMetadata;
  addCurrency(value?: ssn_type_candidate_pb.ModelSpec, index?: number): ssn_type_candidate_pb.ModelSpec;

  getCreditCardLastFourList(): Array<ssn_type_candidate_pb.ModelSpec>;
  setCreditCardLastFourList(value: Array<ssn_type_candidate_pb.ModelSpec>): PredictionMetadata;
  clearCreditCardLastFourList(): PredictionMetadata;
  addCreditCardLastFour(value?: ssn_type_candidate_pb.ModelSpec, index?: number): ssn_type_candidate_pb.ModelSpec;

  getPaymentMethodList(): Array<ssn_type_candidate_pb.ModelSpec>;
  setPaymentMethodList(value: Array<ssn_type_candidate_pb.ModelSpec>): PredictionMetadata;
  clearPaymentMethodList(): PredictionMetadata;
  addPaymentMethod(value?: ssn_type_candidate_pb.ModelSpec, index?: number): ssn_type_candidate_pb.ModelSpec;

  getOcrLineDkTypeList(): Array<ssn_type_candidate_pb.ModelSpec>;
  setOcrLineDkTypeList(value: Array<ssn_type_candidate_pb.ModelSpec>): PredictionMetadata;
  clearOcrLineDkTypeList(): PredictionMetadata;
  addOcrLineDkType(value?: ssn_type_candidate_pb.ModelSpec, index?: number): ssn_type_candidate_pb.ModelSpec;

  getOcrLineDkPaymentIdList(): Array<ssn_type_candidate_pb.ModelSpec>;
  setOcrLineDkPaymentIdList(value: Array<ssn_type_candidate_pb.ModelSpec>): PredictionMetadata;
  clearOcrLineDkPaymentIdList(): PredictionMetadata;
  addOcrLineDkPaymentId(value?: ssn_type_candidate_pb.ModelSpec, index?: number): ssn_type_candidate_pb.ModelSpec;

  getOcrLineDkCreditorIdList(): Array<ssn_type_candidate_pb.ModelSpec>;
  setOcrLineDkCreditorIdList(value: Array<ssn_type_candidate_pb.ModelSpec>): PredictionMetadata;
  clearOcrLineDkCreditorIdList(): PredictionMetadata;
  addOcrLineDkCreditorId(value?: ssn_type_candidate_pb.ModelSpec, index?: number): ssn_type_candidate_pb.ModelSpec;

  getOcrLineSePaymentIdList(): Array<ssn_type_candidate_pb.ModelSpec>;
  setOcrLineSePaymentIdList(value: Array<ssn_type_candidate_pb.ModelSpec>): PredictionMetadata;
  clearOcrLineSePaymentIdList(): PredictionMetadata;
  addOcrLineSePaymentId(value?: ssn_type_candidate_pb.ModelSpec, index?: number): ssn_type_candidate_pb.ModelSpec;

  getOcrLineSeBankgiroCreditorIdList(): Array<ssn_type_candidate_pb.ModelSpec>;
  setOcrLineSeBankgiroCreditorIdList(value: Array<ssn_type_candidate_pb.ModelSpec>): PredictionMetadata;
  clearOcrLineSeBankgiroCreditorIdList(): PredictionMetadata;
  addOcrLineSeBankgiroCreditorId(value?: ssn_type_candidate_pb.ModelSpec, index?: number): ssn_type_candidate_pb.ModelSpec;

  getOcrLineSePlusgiroCreditorIdList(): Array<ssn_type_candidate_pb.ModelSpec>;
  setOcrLineSePlusgiroCreditorIdList(value: Array<ssn_type_candidate_pb.ModelSpec>): PredictionMetadata;
  clearOcrLineSePlusgiroCreditorIdList(): PredictionMetadata;
  addOcrLineSePlusgiroCreditorId(value?: ssn_type_candidate_pb.ModelSpec, index?: number): ssn_type_candidate_pb.ModelSpec;

  getOcrLineNoPaymentIdList(): Array<ssn_type_candidate_pb.ModelSpec>;
  setOcrLineNoPaymentIdList(value: Array<ssn_type_candidate_pb.ModelSpec>): PredictionMetadata;
  clearOcrLineNoPaymentIdList(): PredictionMetadata;
  addOcrLineNoPaymentId(value?: ssn_type_candidate_pb.ModelSpec, index?: number): ssn_type_candidate_pb.ModelSpec;

  getOcrLineFiPaymentIdList(): Array<ssn_type_candidate_pb.ModelSpec>;
  setOcrLineFiPaymentIdList(value: Array<ssn_type_candidate_pb.ModelSpec>): PredictionMetadata;
  clearOcrLineFiPaymentIdList(): PredictionMetadata;
  addOcrLineFiPaymentId(value?: ssn_type_candidate_pb.ModelSpec, index?: number): ssn_type_candidate_pb.ModelSpec;

  getOcrLineNlPaymentIdList(): Array<ssn_type_candidate_pb.ModelSpec>;
  setOcrLineNlPaymentIdList(value: Array<ssn_type_candidate_pb.ModelSpec>): PredictionMetadata;
  clearOcrLineNlPaymentIdList(): PredictionMetadata;
  addOcrLineNlPaymentId(value?: ssn_type_candidate_pb.ModelSpec, index?: number): ssn_type_candidate_pb.ModelSpec;

  getSupplierCorporateIdList(): Array<ssn_type_candidate_pb.ModelSpec>;
  setSupplierCorporateIdList(value: Array<ssn_type_candidate_pb.ModelSpec>): PredictionMetadata;
  clearSupplierCorporateIdList(): PredictionMetadata;
  addSupplierCorporateId(value?: ssn_type_candidate_pb.ModelSpec, index?: number): ssn_type_candidate_pb.ModelSpec;

  getSupplierCountryCodeList(): Array<ssn_type_candidate_pb.ModelSpec>;
  setSupplierCountryCodeList(value: Array<ssn_type_candidate_pb.ModelSpec>): PredictionMetadata;
  clearSupplierCountryCodeList(): PredictionMetadata;
  addSupplierCountryCode(value?: ssn_type_candidate_pb.ModelSpec, index?: number): ssn_type_candidate_pb.ModelSpec;

  getInvoiceNumberList(): Array<ssn_type_candidate_pb.ModelSpec>;
  setInvoiceNumberList(value: Array<ssn_type_candidate_pb.ModelSpec>): PredictionMetadata;
  clearInvoiceNumberList(): PredictionMetadata;
  addInvoiceNumber(value?: ssn_type_candidate_pb.ModelSpec, index?: number): ssn_type_candidate_pb.ModelSpec;

  getIbanList(): Array<ssn_type_candidate_pb.ModelSpec>;
  setIbanList(value: Array<ssn_type_candidate_pb.ModelSpec>): PredictionMetadata;
  clearIbanList(): PredictionMetadata;
  addIban(value?: ssn_type_candidate_pb.ModelSpec, index?: number): ssn_type_candidate_pb.ModelSpec;

  getOrderReferenceList(): Array<ssn_type_candidate_pb.ModelSpec>;
  setOrderReferenceList(value: Array<ssn_type_candidate_pb.ModelSpec>): PredictionMetadata;
  clearOrderReferenceList(): PredictionMetadata;
  addOrderReference(value?: ssn_type_candidate_pb.ModelSpec, index?: number): ssn_type_candidate_pb.ModelSpec;

  getBankAccountNumberList(): Array<ssn_type_candidate_pb.ModelSpec>;
  setBankAccountNumberList(value: Array<ssn_type_candidate_pb.ModelSpec>): PredictionMetadata;
  clearBankAccountNumberList(): PredictionMetadata;
  addBankAccountNumber(value?: ssn_type_candidate_pb.ModelSpec, index?: number): ssn_type_candidate_pb.ModelSpec;

  getBankRegistrationNumberList(): Array<ssn_type_candidate_pb.ModelSpec>;
  setBankRegistrationNumberList(value: Array<ssn_type_candidate_pb.ModelSpec>): PredictionMetadata;
  clearBankRegistrationNumberList(): PredictionMetadata;
  addBankRegistrationNumber(value?: ssn_type_candidate_pb.ModelSpec, index?: number): ssn_type_candidate_pb.ModelSpec;

  getSupplierNameList(): Array<ssn_type_candidate_pb.ModelSpec>;
  setSupplierNameList(value: Array<ssn_type_candidate_pb.ModelSpec>): PredictionMetadata;
  clearSupplierNameList(): PredictionMetadata;
  addSupplierName(value?: ssn_type_candidate_pb.ModelSpec, index?: number): ssn_type_candidate_pb.ModelSpec;

  getBicList(): Array<ssn_type_candidate_pb.ModelSpec>;
  setBicList(value: Array<ssn_type_candidate_pb.ModelSpec>): PredictionMetadata;
  clearBicList(): PredictionMetadata;
  addBic(value?: ssn_type_candidate_pb.ModelSpec, index?: number): ssn_type_candidate_pb.ModelSpec;

  getDocumentNumberList(): Array<ssn_type_candidate_pb.ModelSpec>;
  setDocumentNumberList(value: Array<ssn_type_candidate_pb.ModelSpec>): PredictionMetadata;
  clearDocumentNumberList(): PredictionMetadata;
  addDocumentNumber(value?: ssn_type_candidate_pb.ModelSpec, index?: number): ssn_type_candidate_pb.ModelSpec;

  getDocumentDateList(): Array<ssn_type_candidate_pb.ModelSpec>;
  setDocumentDateList(value: Array<ssn_type_candidate_pb.ModelSpec>): PredictionMetadata;
  clearDocumentDateList(): PredictionMetadata;
  addDocumentDate(value?: ssn_type_candidate_pb.ModelSpec, index?: number): ssn_type_candidate_pb.ModelSpec;

  getOrderNumberList(): Array<ssn_type_candidate_pb.ModelSpec>;
  setOrderNumberList(value: Array<ssn_type_candidate_pb.ModelSpec>): PredictionMetadata;
  clearOrderNumberList(): PredictionMetadata;
  addOrderNumber(value?: ssn_type_candidate_pb.ModelSpec, index?: number): ssn_type_candidate_pb.ModelSpec;

  getSupplierVatNumberList(): Array<ssn_type_candidate_pb.ModelSpec>;
  setSupplierVatNumberList(value: Array<ssn_type_candidate_pb.ModelSpec>): PredictionMetadata;
  clearSupplierVatNumberList(): PredictionMetadata;
  addSupplierVatNumber(value?: ssn_type_candidate_pb.ModelSpec, index?: number): ssn_type_candidate_pb.ModelSpec;

  getSupplierOrganisationNumberList(): Array<ssn_type_candidate_pb.ModelSpec>;
  setSupplierOrganisationNumberList(value: Array<ssn_type_candidate_pb.ModelSpec>): PredictionMetadata;
  clearSupplierOrganisationNumberList(): PredictionMetadata;
  addSupplierOrganisationNumber(value?: ssn_type_candidate_pb.ModelSpec, index?: number): ssn_type_candidate_pb.ModelSpec;

  getSupplierAddressList(): Array<ssn_type_candidate_pb.ModelSpec>;
  setSupplierAddressList(value: Array<ssn_type_candidate_pb.ModelSpec>): PredictionMetadata;
  clearSupplierAddressList(): PredictionMetadata;
  addSupplierAddress(value?: ssn_type_candidate_pb.ModelSpec, index?: number): ssn_type_candidate_pb.ModelSpec;

  getCustomerNumberList(): Array<ssn_type_candidate_pb.ModelSpec>;
  setCustomerNumberList(value: Array<ssn_type_candidate_pb.ModelSpec>): PredictionMetadata;
  clearCustomerNumberList(): PredictionMetadata;
  addCustomerNumber(value?: ssn_type_candidate_pb.ModelSpec, index?: number): ssn_type_candidate_pb.ModelSpec;

  getReceiverOrderNumberList(): Array<ssn_type_candidate_pb.ModelSpec>;
  setReceiverOrderNumberList(value: Array<ssn_type_candidate_pb.ModelSpec>): PredictionMetadata;
  clearReceiverOrderNumberList(): PredictionMetadata;
  addReceiverOrderNumber(value?: ssn_type_candidate_pb.ModelSpec, index?: number): ssn_type_candidate_pb.ModelSpec;

  getOcrLineBePaymentIdList(): Array<ssn_type_candidate_pb.ModelSpec>;
  setOcrLineBePaymentIdList(value: Array<ssn_type_candidate_pb.ModelSpec>): PredictionMetadata;
  clearOcrLineBePaymentIdList(): PredictionMetadata;
  addOcrLineBePaymentId(value?: ssn_type_candidate_pb.ModelSpec, index?: number): ssn_type_candidate_pb.ModelSpec;

  getReceiverAddressList(): Array<ssn_type_candidate_pb.ModelSpec>;
  setReceiverAddressList(value: Array<ssn_type_candidate_pb.ModelSpec>): PredictionMetadata;
  clearReceiverAddressList(): PredictionMetadata;
  addReceiverAddress(value?: ssn_type_candidate_pb.ModelSpec, index?: number): ssn_type_candidate_pb.ModelSpec;

  getReceiverCountryCodeList(): Array<ssn_type_candidate_pb.ModelSpec>;
  setReceiverCountryCodeList(value: Array<ssn_type_candidate_pb.ModelSpec>): PredictionMetadata;
  clearReceiverCountryCodeList(): PredictionMetadata;
  addReceiverCountryCode(value?: ssn_type_candidate_pb.ModelSpec, index?: number): ssn_type_candidate_pb.ModelSpec;

  getReceiverNameList(): Array<ssn_type_candidate_pb.ModelSpec>;
  setReceiverNameList(value: Array<ssn_type_candidate_pb.ModelSpec>): PredictionMetadata;
  clearReceiverNameList(): PredictionMetadata;
  addReceiverName(value?: ssn_type_candidate_pb.ModelSpec, index?: number): ssn_type_candidate_pb.ModelSpec;

  getReceiverVatNumberList(): Array<ssn_type_candidate_pb.ModelSpec>;
  setReceiverVatNumberList(value: Array<ssn_type_candidate_pb.ModelSpec>): PredictionMetadata;
  clearReceiverVatNumberList(): PredictionMetadata;
  addReceiverVatNumber(value?: ssn_type_candidate_pb.ModelSpec, index?: number): ssn_type_candidate_pb.ModelSpec;

  getCheckInDateList(): Array<ssn_type_candidate_pb.ModelSpec>;
  setCheckInDateList(value: Array<ssn_type_candidate_pb.ModelSpec>): PredictionMetadata;
  clearCheckInDateList(): PredictionMetadata;
  addCheckInDate(value?: ssn_type_candidate_pb.ModelSpec, index?: number): ssn_type_candidate_pb.ModelSpec;

  getCheckOutDateList(): Array<ssn_type_candidate_pb.ModelSpec>;
  setCheckOutDateList(value: Array<ssn_type_candidate_pb.ModelSpec>): PredictionMetadata;
  clearCheckOutDateList(): PredictionMetadata;
  addCheckOutDate(value?: ssn_type_candidate_pb.ModelSpec, index?: number): ssn_type_candidate_pb.ModelSpec;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): PredictionMetadata.AsObject;
  static toObject(includeInstance: boolean, msg: PredictionMetadata): PredictionMetadata.AsObject;
  static serializeBinaryToWriter(message: PredictionMetadata, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): PredictionMetadata;
  static deserializeBinaryFromReader(message: PredictionMetadata, reader: jspb.BinaryReader): PredictionMetadata;
}

export namespace PredictionMetadata {
  export type AsObject = {
    totalInclVatList: Array<ssn_type_candidate_pb.ModelSpec.AsObject>,
    totalVatList: Array<ssn_type_candidate_pb.ModelSpec.AsObject>,
    totalExclVatList: Array<ssn_type_candidate_pb.ModelSpec.AsObject>,
    orderDateList: Array<ssn_type_candidate_pb.ModelSpec.AsObject>,
    paymentDueDateList: Array<ssn_type_candidate_pb.ModelSpec.AsObject>,
    documentTypeList: Array<ssn_type_candidate_pb.ModelSpec.AsObject>,
    currencyList: Array<ssn_type_candidate_pb.ModelSpec.AsObject>,
    creditCardLastFourList: Array<ssn_type_candidate_pb.ModelSpec.AsObject>,
    paymentMethodList: Array<ssn_type_candidate_pb.ModelSpec.AsObject>,
    ocrLineDkTypeList: Array<ssn_type_candidate_pb.ModelSpec.AsObject>,
    ocrLineDkPaymentIdList: Array<ssn_type_candidate_pb.ModelSpec.AsObject>,
    ocrLineDkCreditorIdList: Array<ssn_type_candidate_pb.ModelSpec.AsObject>,
    ocrLineSePaymentIdList: Array<ssn_type_candidate_pb.ModelSpec.AsObject>,
    ocrLineSeBankgiroCreditorIdList: Array<ssn_type_candidate_pb.ModelSpec.AsObject>,
    ocrLineSePlusgiroCreditorIdList: Array<ssn_type_candidate_pb.ModelSpec.AsObject>,
    ocrLineNoPaymentIdList: Array<ssn_type_candidate_pb.ModelSpec.AsObject>,
    ocrLineFiPaymentIdList: Array<ssn_type_candidate_pb.ModelSpec.AsObject>,
    ocrLineNlPaymentIdList: Array<ssn_type_candidate_pb.ModelSpec.AsObject>,
    supplierCorporateIdList: Array<ssn_type_candidate_pb.ModelSpec.AsObject>,
    supplierCountryCodeList: Array<ssn_type_candidate_pb.ModelSpec.AsObject>,
    invoiceNumberList: Array<ssn_type_candidate_pb.ModelSpec.AsObject>,
    ibanList: Array<ssn_type_candidate_pb.ModelSpec.AsObject>,
    orderReferenceList: Array<ssn_type_candidate_pb.ModelSpec.AsObject>,
    bankAccountNumberList: Array<ssn_type_candidate_pb.ModelSpec.AsObject>,
    bankRegistrationNumberList: Array<ssn_type_candidate_pb.ModelSpec.AsObject>,
    supplierNameList: Array<ssn_type_candidate_pb.ModelSpec.AsObject>,
    bicList: Array<ssn_type_candidate_pb.ModelSpec.AsObject>,
    documentNumberList: Array<ssn_type_candidate_pb.ModelSpec.AsObject>,
    documentDateList: Array<ssn_type_candidate_pb.ModelSpec.AsObject>,
    orderNumberList: Array<ssn_type_candidate_pb.ModelSpec.AsObject>,
    supplierVatNumberList: Array<ssn_type_candidate_pb.ModelSpec.AsObject>,
    supplierOrganisationNumberList: Array<ssn_type_candidate_pb.ModelSpec.AsObject>,
    supplierAddressList: Array<ssn_type_candidate_pb.ModelSpec.AsObject>,
    customerNumberList: Array<ssn_type_candidate_pb.ModelSpec.AsObject>,
    receiverOrderNumberList: Array<ssn_type_candidate_pb.ModelSpec.AsObject>,
    ocrLineBePaymentIdList: Array<ssn_type_candidate_pb.ModelSpec.AsObject>,
    receiverAddressList: Array<ssn_type_candidate_pb.ModelSpec.AsObject>,
    receiverCountryCodeList: Array<ssn_type_candidate_pb.ModelSpec.AsObject>,
    receiverNameList: Array<ssn_type_candidate_pb.ModelSpec.AsObject>,
    receiverVatNumberList: Array<ssn_type_candidate_pb.ModelSpec.AsObject>,
    checkInDateList: Array<ssn_type_candidate_pb.ModelSpec.AsObject>,
    checkOutDateList: Array<ssn_type_candidate_pb.ModelSpec.AsObject>,
  }
}

export class CreateDocumentRequest extends jspb.Message {
  getDocument(): Document | undefined;
  setDocument(value?: Document): CreateDocumentRequest;
  hasDocument(): boolean;
  clearDocument(): CreateDocumentRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): CreateDocumentRequest.AsObject;
  static toObject(includeInstance: boolean, msg: CreateDocumentRequest): CreateDocumentRequest.AsObject;
  static serializeBinaryToWriter(message: CreateDocumentRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): CreateDocumentRequest;
  static deserializeBinaryFromReader(message: CreateDocumentRequest, reader: jspb.BinaryReader): CreateDocumentRequest;
}

export namespace CreateDocumentRequest {
  export type AsObject = {
    document?: Document.AsObject,
  }
}

export class CreateDocumentResponse extends jspb.Message {
  getId(): string;
  setId(value: string): CreateDocumentResponse;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): CreateDocumentResponse.AsObject;
  static toObject(includeInstance: boolean, msg: CreateDocumentResponse): CreateDocumentResponse.AsObject;
  static serializeBinaryToWriter(message: CreateDocumentResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): CreateDocumentResponse;
  static deserializeBinaryFromReader(message: CreateDocumentResponse, reader: jspb.BinaryReader): CreateDocumentResponse;
}

export namespace CreateDocumentResponse {
  export type AsObject = {
    id: string,
  }
}

export class ReadDocumentRequest extends jspb.Message {
  getId(): string;
  setId(value: string): ReadDocumentRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ReadDocumentRequest.AsObject;
  static toObject(includeInstance: boolean, msg: ReadDocumentRequest): ReadDocumentRequest.AsObject;
  static serializeBinaryToWriter(message: ReadDocumentRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ReadDocumentRequest;
  static deserializeBinaryFromReader(message: ReadDocumentRequest, reader: jspb.BinaryReader): ReadDocumentRequest;
}

export namespace ReadDocumentRequest {
  export type AsObject = {
    id: string,
  }
}

export class ReadDocumentResponse extends jspb.Message {
  getDocument(): Document | undefined;
  setDocument(value?: Document): ReadDocumentResponse;
  hasDocument(): boolean;
  clearDocument(): ReadDocumentResponse;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ReadDocumentResponse.AsObject;
  static toObject(includeInstance: boolean, msg: ReadDocumentResponse): ReadDocumentResponse.AsObject;
  static serializeBinaryToWriter(message: ReadDocumentResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ReadDocumentResponse;
  static deserializeBinaryFromReader(message: ReadDocumentResponse, reader: jspb.BinaryReader): ReadDocumentResponse;
}

export namespace ReadDocumentResponse {
  export type AsObject = {
    document?: Document.AsObject,
  }
}

export class PrepareFeedbackRequest extends jspb.Message {
  getId(): string;
  setId(value: string): PrepareFeedbackRequest;

  getTa(): ssn_type_text_annotation_pb.TextAnnotation | undefined;
  setTa(value?: ssn_type_text_annotation_pb.TextAnnotation): PrepareFeedbackRequest;
  hasTa(): boolean;
  clearTa(): PrepareFeedbackRequest;

  getDocumentBytes(): Uint8Array | string;
  getDocumentBytes_asU8(): Uint8Array;
  getDocumentBytes_asB64(): string;
  setDocumentBytes(value: Uint8Array | string): PrepareFeedbackRequest;

  getPredictions(): PredictionValues | undefined;
  setPredictions(value?: PredictionValues): PrepareFeedbackRequest;
  hasPredictions(): boolean;
  clearPredictions(): PrepareFeedbackRequest;

  getTagsList(): Array<string>;
  setTagsList(value: Array<string>): PrepareFeedbackRequest;
  clearTagsList(): PrepareFeedbackRequest;
  addTags(value: string, index?: number): PrepareFeedbackRequest;

  getConfidences(): PredictionConfidences | undefined;
  setConfidences(value?: PredictionConfidences): PrepareFeedbackRequest;
  hasConfidences(): boolean;
  clearConfidences(): PrepareFeedbackRequest;

  getPredictionMetadata(): PredictionMetadata | undefined;
  setPredictionMetadata(value?: PredictionMetadata): PrepareFeedbackRequest;
  hasPredictionMetadata(): boolean;
  clearPredictionMetadata(): PrepareFeedbackRequest;

  getTier(): ssn_type_tier_pb.Tier;
  setTier(value: ssn_type_tier_pb.Tier): PrepareFeedbackRequest;

  getSegmentsList(): Array<string>;
  setSegmentsList(value: Array<string>): PrepareFeedbackRequest;
  clearSegmentsList(): PrepareFeedbackRequest;
  addSegments(value: string, index?: number): PrepareFeedbackRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): PrepareFeedbackRequest.AsObject;
  static toObject(includeInstance: boolean, msg: PrepareFeedbackRequest): PrepareFeedbackRequest.AsObject;
  static serializeBinaryToWriter(message: PrepareFeedbackRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): PrepareFeedbackRequest;
  static deserializeBinaryFromReader(message: PrepareFeedbackRequest, reader: jspb.BinaryReader): PrepareFeedbackRequest;
}

export namespace PrepareFeedbackRequest {
  export type AsObject = {
    id: string,
    ta?: ssn_type_text_annotation_pb.TextAnnotation.AsObject,
    documentBytes: Uint8Array | string,
    predictions?: PredictionValues.AsObject,
    tagsList: Array<string>,
    confidences?: PredictionConfidences.AsObject,
    predictionMetadata?: PredictionMetadata.AsObject,
    tier: ssn_type_tier_pb.Tier,
    segmentsList: Array<string>,
  }
}

export class FeedbackRequest extends jspb.Message {
  getId(): string;
  setId(value: string): FeedbackRequest;

  getTrueValues(): TrueValues | undefined;
  setTrueValues(value?: TrueValues): FeedbackRequest;
  hasTrueValues(): boolean;
  clearTrueValues(): FeedbackRequest;

  getTagsList(): Array<string>;
  setTagsList(value: Array<string>): FeedbackRequest;
  clearTagsList(): FeedbackRequest;
  addTags(value: string, index?: number): FeedbackRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): FeedbackRequest.AsObject;
  static toObject(includeInstance: boolean, msg: FeedbackRequest): FeedbackRequest.AsObject;
  static serializeBinaryToWriter(message: FeedbackRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): FeedbackRequest;
  static deserializeBinaryFromReader(message: FeedbackRequest, reader: jspb.BinaryReader): FeedbackRequest;
}

export namespace FeedbackRequest {
  export type AsObject = {
    id: string,
    trueValues?: TrueValues.AsObject,
    tagsList: Array<string>,
  }
}

export class MetricsRequest extends jspb.Message {
  getStartTime(): number;
  setStartTime(value: number): MetricsRequest;

  getEndTime(): number;
  setEndTime(value: number): MetricsRequest;

  getFieldsList(): Array<string>;
  setFieldsList(value: Array<string>): MetricsRequest;
  clearFieldsList(): MetricsRequest;
  addFields(value: string, index?: number): MetricsRequest;

  getTagsList(): Array<string>;
  setTagsList(value: Array<string>): MetricsRequest;
  clearTagsList(): MetricsRequest;
  addTags(value: string, index?: number): MetricsRequest;

  getCountryCodesList(): Array<string>;
  setCountryCodesList(value: Array<string>): MetricsRequest;
  clearCountryCodesList(): MetricsRequest;
  addCountryCodes(value: string, index?: number): MetricsRequest;

  getDocumentTypesList(): Array<string>;
  setDocumentTypesList(value: Array<string>): MetricsRequest;
  clearDocumentTypesList(): MetricsRequest;
  addDocumentTypes(value: string, index?: number): MetricsRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): MetricsRequest.AsObject;
  static toObject(includeInstance: boolean, msg: MetricsRequest): MetricsRequest.AsObject;
  static serializeBinaryToWriter(message: MetricsRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): MetricsRequest;
  static deserializeBinaryFromReader(message: MetricsRequest, reader: jspb.BinaryReader): MetricsRequest;
}

export namespace MetricsRequest {
  export type AsObject = {
    startTime: number,
    endTime: number,
    fieldsList: Array<string>,
    tagsList: Array<string>,
    countryCodesList: Array<string>,
    documentTypesList: Array<string>,
  }
}

export class FeedbackMetrics extends jspb.Message {
  getDocumentCount(): number;
  setDocumentCount(value: number): FeedbackMetrics;

  getFeedbackCount(): number;
  setFeedbackCount(value: number): FeedbackMetrics;

  getOverallCorrectness(): Correctness | undefined;
  setOverallCorrectness(value?: Correctness): FeedbackMetrics;
  hasOverallCorrectness(): boolean;
  clearOverallCorrectness(): FeedbackMetrics;

  getFieldCorrectnessList(): Array<Correctness>;
  setFieldCorrectnessList(value: Array<Correctness>): FeedbackMetrics;
  clearFieldCorrectnessList(): FeedbackMetrics;
  addFieldCorrectness(value?: Correctness, index?: number): Correctness;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): FeedbackMetrics.AsObject;
  static toObject(includeInstance: boolean, msg: FeedbackMetrics): FeedbackMetrics.AsObject;
  static serializeBinaryToWriter(message: FeedbackMetrics, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): FeedbackMetrics;
  static deserializeBinaryFromReader(message: FeedbackMetrics, reader: jspb.BinaryReader): FeedbackMetrics;
}

export namespace FeedbackMetrics {
  export type AsObject = {
    documentCount: number,
    feedbackCount: number,
    overallCorrectness?: Correctness.AsObject,
    fieldCorrectnessList: Array<Correctness.AsObject>,
  }
}

export class Correctness extends jspb.Message {
  getField(): string;
  setField(value: string): Correctness;

  getCorrectPercentage(): number;
  setCorrectPercentage(value: number): Correctness;

  getIncompletePercentage(): number;
  setIncompletePercentage(value: number): Correctness;

  getErrorPercentage(): number;
  setErrorPercentage(value: number): Correctness;

  getSupport(): number;
  setSupport(value: number): Correctness;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Correctness.AsObject;
  static toObject(includeInstance: boolean, msg: Correctness): Correctness.AsObject;
  static serializeBinaryToWriter(message: Correctness, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Correctness;
  static deserializeBinaryFromReader(message: Correctness, reader: jspb.BinaryReader): Correctness;
}

export namespace Correctness {
  export type AsObject = {
    field: string,
    correctPercentage: number,
    incompletePercentage: number,
    errorPercentage: number,
    support: number,
  }
}

export class DeleteRequest extends jspb.Message {
  getTagsList(): Array<string>;
  setTagsList(value: Array<string>): DeleteRequest;
  clearTagsList(): DeleteRequest;
  addTags(value: string, index?: number): DeleteRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DeleteRequest.AsObject;
  static toObject(includeInstance: boolean, msg: DeleteRequest): DeleteRequest.AsObject;
  static serializeBinaryToWriter(message: DeleteRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DeleteRequest;
  static deserializeBinaryFromReader(message: DeleteRequest, reader: jspb.BinaryReader): DeleteRequest;
}

export namespace DeleteRequest {
  export type AsObject = {
    tagsList: Array<string>,
  }
}

export class CallsPerMonth extends jspb.Message {
  getCalls(): number;
  setCalls(value: number): CallsPerMonth;

  getMonthName(): string;
  setMonthName(value: string): CallsPerMonth;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): CallsPerMonth.AsObject;
  static toObject(includeInstance: boolean, msg: CallsPerMonth): CallsPerMonth.AsObject;
  static serializeBinaryToWriter(message: CallsPerMonth, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): CallsPerMonth;
  static deserializeBinaryFromReader(message: CallsPerMonth, reader: jspb.BinaryReader): CallsPerMonth;
}

export namespace CallsPerMonth {
  export type AsObject = {
    calls: number,
    monthName: string,
  }
}

export class CallsPerMonthResponse extends jspb.Message {
  getCallsPerMonthList(): Array<CallsPerMonth>;
  setCallsPerMonthList(value: Array<CallsPerMonth>): CallsPerMonthResponse;
  clearCallsPerMonthList(): CallsPerMonthResponse;
  addCallsPerMonth(value?: CallsPerMonth, index?: number): CallsPerMonth;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): CallsPerMonthResponse.AsObject;
  static toObject(includeInstance: boolean, msg: CallsPerMonthResponse): CallsPerMonthResponse.AsObject;
  static serializeBinaryToWriter(message: CallsPerMonthResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): CallsPerMonthResponse;
  static deserializeBinaryFromReader(message: CallsPerMonthResponse, reader: jspb.BinaryReader): CallsPerMonthResponse;
}

export namespace CallsPerMonthResponse {
  export type AsObject = {
    callsPerMonthList: Array<CallsPerMonth.AsObject>,
  }
}

export class AnnotationProcessMetricsRequest extends jspb.Message {
  getFieldsList(): Array<string>;
  setFieldsList(value: Array<string>): AnnotationProcessMetricsRequest;
  clearFieldsList(): AnnotationProcessMetricsRequest;
  addFields(value: string, index?: number): AnnotationProcessMetricsRequest;

  getCountryCodesList(): Array<string>;
  setCountryCodesList(value: Array<string>): AnnotationProcessMetricsRequest;
  clearCountryCodesList(): AnnotationProcessMetricsRequest;
  addCountryCodes(value: string, index?: number): AnnotationProcessMetricsRequest;

  getDocumentTypesList(): Array<string>;
  setDocumentTypesList(value: Array<string>): AnnotationProcessMetricsRequest;
  clearDocumentTypesList(): AnnotationProcessMetricsRequest;
  addDocumentTypes(value: string, index?: number): AnnotationProcessMetricsRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): AnnotationProcessMetricsRequest.AsObject;
  static toObject(includeInstance: boolean, msg: AnnotationProcessMetricsRequest): AnnotationProcessMetricsRequest.AsObject;
  static serializeBinaryToWriter(message: AnnotationProcessMetricsRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): AnnotationProcessMetricsRequest;
  static deserializeBinaryFromReader(message: AnnotationProcessMetricsRequest, reader: jspb.BinaryReader): AnnotationProcessMetricsRequest;
}

export namespace AnnotationProcessMetricsRequest {
  export type AsObject = {
    fieldsList: Array<string>,
    countryCodesList: Array<string>,
    documentTypesList: Array<string>,
  }
}

export class AnnotationProcessMetricsResponse extends jspb.Message {
  getDocumentCount(): number;
  setDocumentCount(value: number): AnnotationProcessMetricsResponse;

  getTrueValueCount(): number;
  setTrueValueCount(value: number): AnnotationProcessMetricsResponse;

  getOverallCorrectnessList(): Array<Correctness>;
  setOverallCorrectnessList(value: Array<Correctness>): AnnotationProcessMetricsResponse;
  clearOverallCorrectnessList(): AnnotationProcessMetricsResponse;
  addOverallCorrectness(value?: Correctness, index?: number): Correctness;

  getFieldCorrectnessList(): Array<Correctness>;
  setFieldCorrectnessList(value: Array<Correctness>): AnnotationProcessMetricsResponse;
  clearFieldCorrectnessList(): AnnotationProcessMetricsResponse;
  addFieldCorrectness(value?: Correctness, index?: number): Correctness;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): AnnotationProcessMetricsResponse.AsObject;
  static toObject(includeInstance: boolean, msg: AnnotationProcessMetricsResponse): AnnotationProcessMetricsResponse.AsObject;
  static serializeBinaryToWriter(message: AnnotationProcessMetricsResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): AnnotationProcessMetricsResponse;
  static deserializeBinaryFromReader(message: AnnotationProcessMetricsResponse, reader: jspb.BinaryReader): AnnotationProcessMetricsResponse;
}

export namespace AnnotationProcessMetricsResponse {
  export type AsObject = {
    documentCount: number,
    trueValueCount: number,
    overallCorrectnessList: Array<Correctness.AsObject>,
    fieldCorrectnessList: Array<Correctness.AsObject>,
  }
}

