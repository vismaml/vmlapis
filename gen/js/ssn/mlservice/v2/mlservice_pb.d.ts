import * as jspb from 'google-protobuf'

import * as google_type_date_pb from '../../../google/type/date_pb'; // proto import: "google/type/date.proto"
import * as ssn_type_candidate_pb from '../../../ssn/type/candidate_pb'; // proto import: "ssn/type/candidate.proto"
import * as ssn_type_text_annotation_pb from '../../../ssn/type/text_annotation_pb'; // proto import: "ssn/type/text_annotation.proto"


export class FeatureGenRequest extends jspb.Message {
  getTruthLabels(): FeatureGenRequest.TruthLabels | undefined;
  setTruthLabels(value?: FeatureGenRequest.TruthLabels): FeatureGenRequest;
  hasTruthLabels(): boolean;
  clearTruthLabels(): FeatureGenRequest;

  getTextAnnotation(): ssn_type_text_annotation_pb.TextAnnotation | undefined;
  setTextAnnotation(value?: ssn_type_text_annotation_pb.TextAnnotation): FeatureGenRequest;
  hasTextAnnotation(): boolean;
  clearTextAnnotation(): FeatureGenRequest;

  getId(): string;
  setId(value: string): FeatureGenRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): FeatureGenRequest.AsObject;
  static toObject(includeInstance: boolean, msg: FeatureGenRequest): FeatureGenRequest.AsObject;
  static serializeBinaryToWriter(message: FeatureGenRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): FeatureGenRequest;
  static deserializeBinaryFromReader(message: FeatureGenRequest, reader: jspb.BinaryReader): FeatureGenRequest;
}

export namespace FeatureGenRequest {
  export type AsObject = {
    truthLabels?: FeatureGenRequest.TruthLabels.AsObject,
    textAnnotation?: ssn_type_text_annotation_pb.TextAnnotation.AsObject,
    id: string,
  }

  export class TruthLabels extends jspb.Message {
    getTotalInclVat(): number;
    setTotalInclVat(value: number): TruthLabels;

    getTotalVat(): number;
    setTotalVat(value: number): TruthLabels;

    getTotalExclVat(): number;
    setTotalExclVat(value: number): TruthLabels;

    getOrderDate(): google_type_date_pb.Date | undefined;
    setOrderDate(value?: google_type_date_pb.Date): TruthLabels;
    hasOrderDate(): boolean;
    clearOrderDate(): TruthLabels;

    getPaymentDueDate(): google_type_date_pb.Date | undefined;
    setPaymentDueDate(value?: google_type_date_pb.Date): TruthLabels;
    hasPaymentDueDate(): boolean;
    clearPaymentDueDate(): TruthLabels;

    getDocumentType(): string;
    setDocumentType(value: string): TruthLabels;

    getCurrency(): string;
    setCurrency(value: string): TruthLabels;

    getCreditCardNumber(): string;
    setCreditCardNumber(value: string): TruthLabels;

    getPaymentMethod(): string;
    setPaymentMethod(value: string): TruthLabels;

    getOcrLineDkType(): string;
    setOcrLineDkType(value: string): TruthLabels;

    getOcrLineDkPaymentId(): string;
    setOcrLineDkPaymentId(value: string): TruthLabels;

    getOcrLineDkCreditorId(): string;
    setOcrLineDkCreditorId(value: string): TruthLabels;

    getOcrLineSePaymentId(): string;
    setOcrLineSePaymentId(value: string): TruthLabels;

    getOcrLineSeBankgiroCreditorId(): string;
    setOcrLineSeBankgiroCreditorId(value: string): TruthLabels;

    getOcrLineSePlusgiroCreditorId(): string;
    setOcrLineSePlusgiroCreditorId(value: string): TruthLabels;

    getOcrLineNoPaymentId(): string;
    setOcrLineNoPaymentId(value: string): TruthLabels;

    getOcrLineFiPaymentId(): string;
    setOcrLineFiPaymentId(value: string): TruthLabels;

    getOcrLineNlPaymentId(): string;
    setOcrLineNlPaymentId(value: string): TruthLabels;

    getSupplierCorporateId(): string;
    setSupplierCorporateId(value: string): TruthLabels;

    getSupplierCountryCode(): string;
    setSupplierCountryCode(value: string): TruthLabels;

    getInvoiceNumber(): string;
    setInvoiceNumber(value: string): TruthLabels;

    getIban(): string;
    setIban(value: string): TruthLabels;

    getBankAccountNumber(): string;
    setBankAccountNumber(value: string): TruthLabels;

    getBankRegistrationNumber(): string;
    setBankRegistrationNumber(value: string): TruthLabels;

    getSupplierName(): string;
    setSupplierName(value: string): TruthLabels;

    getBic(): string;
    setBic(value: string): TruthLabels;

    getDocumentNumber(): string;
    setDocumentNumber(value: string): TruthLabels;

    getDocumentDate(): google_type_date_pb.Date | undefined;
    setDocumentDate(value?: google_type_date_pb.Date): TruthLabels;
    hasDocumentDate(): boolean;
    clearDocumentDate(): TruthLabels;

    getOrderNumber(): string;
    setOrderNumber(value: string): TruthLabels;

    getSupplierVatNumber(): string;
    setSupplierVatNumber(value: string): TruthLabels;

    getSupplierOrganisationNumber(): string;
    setSupplierOrganisationNumber(value: string): TruthLabels;

    getSupplierAddress(): string;
    setSupplierAddress(value: string): TruthLabels;

    getCreditCardLastFour(): string;
    setCreditCardLastFour(value: string): TruthLabels;

    getCustomerNumber(): string;
    setCustomerNumber(value: string): TruthLabels;

    getReceiverOrderNumber(): string;
    setReceiverOrderNumber(value: string): TruthLabels;

    getOcrLineBePaymentId(): string;
    setOcrLineBePaymentId(value: string): TruthLabels;

    getReceiverAddress(): string;
    setReceiverAddress(value: string): TruthLabels;

    getReceiverCountryCode(): string;
    setReceiverCountryCode(value: string): TruthLabels;

    getReceiverName(): string;
    setReceiverName(value: string): TruthLabels;

    getReceiverVatNumber(): string;
    setReceiverVatNumber(value: string): TruthLabels;

    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): TruthLabels.AsObject;
    static toObject(includeInstance: boolean, msg: TruthLabels): TruthLabels.AsObject;
    static serializeBinaryToWriter(message: TruthLabels, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): TruthLabels;
    static deserializeBinaryFromReader(message: TruthLabels, reader: jspb.BinaryReader): TruthLabels;
  }

  export namespace TruthLabels {
    export type AsObject = {
      totalInclVat: number,
      totalVat: number,
      totalExclVat: number,
      orderDate?: google_type_date_pb.Date.AsObject,
      paymentDueDate?: google_type_date_pb.Date.AsObject,
      documentType: string,
      currency: string,
      creditCardNumber: string,
      paymentMethod: string,
      ocrLineDkType: string,
      ocrLineDkPaymentId: string,
      ocrLineDkCreditorId: string,
      ocrLineSePaymentId: string,
      ocrLineSeBankgiroCreditorId: string,
      ocrLineSePlusgiroCreditorId: string,
      ocrLineNoPaymentId: string,
      ocrLineFiPaymentId: string,
      ocrLineNlPaymentId: string,
      supplierCorporateId: string,
      supplierCountryCode: string,
      invoiceNumber: string,
      iban: string,
      bankAccountNumber: string,
      bankRegistrationNumber: string,
      supplierName: string,
      bic: string,
      documentNumber: string,
      documentDate?: google_type_date_pb.Date.AsObject,
      orderNumber: string,
      supplierVatNumber: string,
      supplierOrganisationNumber: string,
      supplierAddress: string,
      creditCardLastFour: string,
      customerNumber: string,
      receiverOrderNumber: string,
      ocrLineBePaymentId: string,
      receiverAddress: string,
      receiverCountryCode: string,
      receiverName: string,
      receiverVatNumber: string,
    }
  }

}

export class FeatureGenResponse extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): FeatureGenResponse.AsObject;
  static toObject(includeInstance: boolean, msg: FeatureGenResponse): FeatureGenResponse.AsObject;
  static serializeBinaryToWriter(message: FeatureGenResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): FeatureGenResponse;
  static deserializeBinaryFromReader(message: FeatureGenResponse, reader: jspb.BinaryReader): FeatureGenResponse;
}

export namespace FeatureGenResponse {
  export type AsObject = {
  }
}

export class PredictRequest extends jspb.Message {
  getTopNMostConfident(): number;
  setTopNMostConfident(value: number): PredictRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): PredictRequest.AsObject;
  static toObject(includeInstance: boolean, msg: PredictRequest): PredictRequest.AsObject;
  static serializeBinaryToWriter(message: PredictRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): PredictRequest;
  static deserializeBinaryFromReader(message: PredictRequest, reader: jspb.BinaryReader): PredictRequest;
}

export namespace PredictRequest {
  export type AsObject = {
    topNMostConfident: number,
  }
}

export class PredictResponse extends jspb.Message {
  getOrderDateList(): Array<ssn_type_candidate_pb.Candidate>;
  setOrderDateList(value: Array<ssn_type_candidate_pb.Candidate>): PredictResponse;
  clearOrderDateList(): PredictResponse;
  addOrderDate(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getPaymentDueDateList(): Array<ssn_type_candidate_pb.Candidate>;
  setPaymentDueDateList(value: Array<ssn_type_candidate_pb.Candidate>): PredictResponse;
  clearPaymentDueDateList(): PredictResponse;
  addPaymentDueDate(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getCurrencyList(): Array<ssn_type_candidate_pb.Candidate>;
  setCurrencyList(value: Array<ssn_type_candidate_pb.Candidate>): PredictResponse;
  clearCurrencyList(): PredictResponse;
  addCurrency(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getTotalVatList(): Array<ssn_type_candidate_pb.Candidate>;
  setTotalVatList(value: Array<ssn_type_candidate_pb.Candidate>): PredictResponse;
  clearTotalVatList(): PredictResponse;
  addTotalVat(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getTotalInclVatList(): Array<ssn_type_candidate_pb.Candidate>;
  setTotalInclVatList(value: Array<ssn_type_candidate_pb.Candidate>): PredictResponse;
  clearTotalInclVatList(): PredictResponse;
  addTotalInclVat(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getTotalExclVatList(): Array<ssn_type_candidate_pb.Candidate>;
  setTotalExclVatList(value: Array<ssn_type_candidate_pb.Candidate>): PredictResponse;
  clearTotalExclVatList(): PredictResponse;
  addTotalExclVat(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getSupplierCorporateIdList(): Array<ssn_type_candidate_pb.Candidate>;
  setSupplierCorporateIdList(value: Array<ssn_type_candidate_pb.Candidate>): PredictResponse;
  clearSupplierCorporateIdList(): PredictResponse;
  addSupplierCorporateId(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getSupplierCountryCodeList(): Array<ssn_type_candidate_pb.Candidate>;
  setSupplierCountryCodeList(value: Array<ssn_type_candidate_pb.Candidate>): PredictResponse;
  clearSupplierCountryCodeList(): PredictResponse;
  addSupplierCountryCode(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getDocumentTypeList(): Array<ssn_type_candidate_pb.Candidate>;
  setDocumentTypeList(value: Array<ssn_type_candidate_pb.Candidate>): PredictResponse;
  clearDocumentTypeList(): PredictResponse;
  addDocumentType(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getPaymentMethodList(): Array<ssn_type_candidate_pb.Candidate>;
  setPaymentMethodList(value: Array<ssn_type_candidate_pb.Candidate>): PredictResponse;
  clearPaymentMethodList(): PredictResponse;
  addPaymentMethod(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getCreditCardNumberList(): Array<ssn_type_candidate_pb.Candidate>;
  setCreditCardNumberList(value: Array<ssn_type_candidate_pb.Candidate>): PredictResponse;
  clearCreditCardNumberList(): PredictResponse;
  addCreditCardNumber(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getInvoiceNumberList(): Array<ssn_type_candidate_pb.Candidate>;
  setInvoiceNumberList(value: Array<ssn_type_candidate_pb.Candidate>): PredictResponse;
  clearInvoiceNumberList(): PredictResponse;
  addInvoiceNumber(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getOcrLineDkTypeList(): Array<ssn_type_candidate_pb.Candidate>;
  setOcrLineDkTypeList(value: Array<ssn_type_candidate_pb.Candidate>): PredictResponse;
  clearOcrLineDkTypeList(): PredictResponse;
  addOcrLineDkType(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getOcrLineDkPaymentIdList(): Array<ssn_type_candidate_pb.Candidate>;
  setOcrLineDkPaymentIdList(value: Array<ssn_type_candidate_pb.Candidate>): PredictResponse;
  clearOcrLineDkPaymentIdList(): PredictResponse;
  addOcrLineDkPaymentId(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getOcrLineDkCreditorIdList(): Array<ssn_type_candidate_pb.Candidate>;
  setOcrLineDkCreditorIdList(value: Array<ssn_type_candidate_pb.Candidate>): PredictResponse;
  clearOcrLineDkCreditorIdList(): PredictResponse;
  addOcrLineDkCreditorId(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getOcrLineSePaymentIdList(): Array<ssn_type_candidate_pb.Candidate>;
  setOcrLineSePaymentIdList(value: Array<ssn_type_candidate_pb.Candidate>): PredictResponse;
  clearOcrLineSePaymentIdList(): PredictResponse;
  addOcrLineSePaymentId(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getOcrLineSeBankgiroCreditorIdList(): Array<ssn_type_candidate_pb.Candidate>;
  setOcrLineSeBankgiroCreditorIdList(value: Array<ssn_type_candidate_pb.Candidate>): PredictResponse;
  clearOcrLineSeBankgiroCreditorIdList(): PredictResponse;
  addOcrLineSeBankgiroCreditorId(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getOcrLineSePlusgiroCreditorIdList(): Array<ssn_type_candidate_pb.Candidate>;
  setOcrLineSePlusgiroCreditorIdList(value: Array<ssn_type_candidate_pb.Candidate>): PredictResponse;
  clearOcrLineSePlusgiroCreditorIdList(): PredictResponse;
  addOcrLineSePlusgiroCreditorId(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getOcrLineNoPaymentIdList(): Array<ssn_type_candidate_pb.Candidate>;
  setOcrLineNoPaymentIdList(value: Array<ssn_type_candidate_pb.Candidate>): PredictResponse;
  clearOcrLineNoPaymentIdList(): PredictResponse;
  addOcrLineNoPaymentId(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getOcrLineFiPaymentIdList(): Array<ssn_type_candidate_pb.Candidate>;
  setOcrLineFiPaymentIdList(value: Array<ssn_type_candidate_pb.Candidate>): PredictResponse;
  clearOcrLineFiPaymentIdList(): PredictResponse;
  addOcrLineFiPaymentId(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getOcrLineNlPaymentIdList(): Array<ssn_type_candidate_pb.Candidate>;
  setOcrLineNlPaymentIdList(value: Array<ssn_type_candidate_pb.Candidate>): PredictResponse;
  clearOcrLineNlPaymentIdList(): PredictResponse;
  addOcrLineNlPaymentId(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getIbanList(): Array<ssn_type_candidate_pb.Candidate>;
  setIbanList(value: Array<ssn_type_candidate_pb.Candidate>): PredictResponse;
  clearIbanList(): PredictResponse;
  addIban(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getLinesList(): Array<ssn_type_candidate_pb.LineCandidate>;
  setLinesList(value: Array<ssn_type_candidate_pb.LineCandidate>): PredictResponse;
  clearLinesList(): PredictResponse;
  addLines(value?: ssn_type_candidate_pb.LineCandidate, index?: number): ssn_type_candidate_pb.LineCandidate;

  getBankAccountNumberList(): Array<ssn_type_candidate_pb.Candidate>;
  setBankAccountNumberList(value: Array<ssn_type_candidate_pb.Candidate>): PredictResponse;
  clearBankAccountNumberList(): PredictResponse;
  addBankAccountNumber(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getBankRegistrationNumberList(): Array<ssn_type_candidate_pb.Candidate>;
  setBankRegistrationNumberList(value: Array<ssn_type_candidate_pb.Candidate>): PredictResponse;
  clearBankRegistrationNumberList(): PredictResponse;
  addBankRegistrationNumber(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getBicList(): Array<ssn_type_candidate_pb.Candidate>;
  setBicList(value: Array<ssn_type_candidate_pb.Candidate>): PredictResponse;
  clearBicList(): PredictResponse;
  addBic(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getDocumentNumberList(): Array<ssn_type_candidate_pb.Candidate>;
  setDocumentNumberList(value: Array<ssn_type_candidate_pb.Candidate>): PredictResponse;
  clearDocumentNumberList(): PredictResponse;
  addDocumentNumber(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getDocumentDateList(): Array<ssn_type_candidate_pb.Candidate>;
  setDocumentDateList(value: Array<ssn_type_candidate_pb.Candidate>): PredictResponse;
  clearDocumentDateList(): PredictResponse;
  addDocumentDate(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getOrderNumberList(): Array<ssn_type_candidate_pb.Candidate>;
  setOrderNumberList(value: Array<ssn_type_candidate_pb.Candidate>): PredictResponse;
  clearOrderNumberList(): PredictResponse;
  addOrderNumber(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getSupplierNameList(): Array<ssn_type_candidate_pb.Candidate>;
  setSupplierNameList(value: Array<ssn_type_candidate_pb.Candidate>): PredictResponse;
  clearSupplierNameList(): PredictResponse;
  addSupplierName(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getSupplierVatNumberList(): Array<ssn_type_candidate_pb.Candidate>;
  setSupplierVatNumberList(value: Array<ssn_type_candidate_pb.Candidate>): PredictResponse;
  clearSupplierVatNumberList(): PredictResponse;
  addSupplierVatNumber(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getSupplierOrganisationNumberList(): Array<ssn_type_candidate_pb.Candidate>;
  setSupplierOrganisationNumberList(value: Array<ssn_type_candidate_pb.Candidate>): PredictResponse;
  clearSupplierOrganisationNumberList(): PredictResponse;
  addSupplierOrganisationNumber(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getSupplierAddressList(): Array<ssn_type_candidate_pb.Candidate>;
  setSupplierAddressList(value: Array<ssn_type_candidate_pb.Candidate>): PredictResponse;
  clearSupplierAddressList(): PredictResponse;
  addSupplierAddress(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getCreditCardLastFourList(): Array<ssn_type_candidate_pb.Candidate>;
  setCreditCardLastFourList(value: Array<ssn_type_candidate_pb.Candidate>): PredictResponse;
  clearCreditCardLastFourList(): PredictResponse;
  addCreditCardLastFour(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getCustomerNumberList(): Array<ssn_type_candidate_pb.Candidate>;
  setCustomerNumberList(value: Array<ssn_type_candidate_pb.Candidate>): PredictResponse;
  clearCustomerNumberList(): PredictResponse;
  addCustomerNumber(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getReceiverOrderNumberList(): Array<ssn_type_candidate_pb.Candidate>;
  setReceiverOrderNumberList(value: Array<ssn_type_candidate_pb.Candidate>): PredictResponse;
  clearReceiverOrderNumberList(): PredictResponse;
  addReceiverOrderNumber(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getOcrLineBePaymentIdList(): Array<ssn_type_candidate_pb.Candidate>;
  setOcrLineBePaymentIdList(value: Array<ssn_type_candidate_pb.Candidate>): PredictResponse;
  clearOcrLineBePaymentIdList(): PredictResponse;
  addOcrLineBePaymentId(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getReceiverAddressList(): Array<ssn_type_candidate_pb.Candidate>;
  setReceiverAddressList(value: Array<ssn_type_candidate_pb.Candidate>): PredictResponse;
  clearReceiverAddressList(): PredictResponse;
  addReceiverAddress(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getReceiverCountryCodeList(): Array<ssn_type_candidate_pb.Candidate>;
  setReceiverCountryCodeList(value: Array<ssn_type_candidate_pb.Candidate>): PredictResponse;
  clearReceiverCountryCodeList(): PredictResponse;
  addReceiverCountryCode(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getReceiverNameList(): Array<ssn_type_candidate_pb.Candidate>;
  setReceiverNameList(value: Array<ssn_type_candidate_pb.Candidate>): PredictResponse;
  clearReceiverNameList(): PredictResponse;
  addReceiverName(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getReceiverVatNumberList(): Array<ssn_type_candidate_pb.Candidate>;
  setReceiverVatNumberList(value: Array<ssn_type_candidate_pb.Candidate>): PredictResponse;
  clearReceiverVatNumberList(): PredictResponse;
  addReceiverVatNumber(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): PredictResponse.AsObject;
  static toObject(includeInstance: boolean, msg: PredictResponse): PredictResponse.AsObject;
  static serializeBinaryToWriter(message: PredictResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): PredictResponse;
  static deserializeBinaryFromReader(message: PredictResponse, reader: jspb.BinaryReader): PredictResponse;
}

export namespace PredictResponse {
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
    creditCardNumberList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    invoiceNumberList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    ocrLineDkTypeList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    ocrLineDkPaymentIdList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    ocrLineDkCreditorIdList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    ocrLineSePaymentIdList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    ocrLineSeBankgiroCreditorIdList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    ocrLineSePlusgiroCreditorIdList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    ocrLineNoPaymentIdList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    ocrLineFiPaymentIdList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    ocrLineNlPaymentIdList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    ibanList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    linesList: Array<ssn_type_candidate_pb.LineCandidate.AsObject>,
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
    creditCardLastFourList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    customerNumberList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    receiverOrderNumberList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    ocrLineBePaymentIdList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    receiverAddressList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    receiverCountryCodeList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    receiverNameList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    receiverVatNumberList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
  }
}

export class FeatureGenPredictRequest extends jspb.Message {
  getFeatureGenRequest(): FeatureGenRequest | undefined;
  setFeatureGenRequest(value?: FeatureGenRequest): FeatureGenPredictRequest;
  hasFeatureGenRequest(): boolean;
  clearFeatureGenRequest(): FeatureGenPredictRequest;

  getPredictRequest(): PredictRequest | undefined;
  setPredictRequest(value?: PredictRequest): FeatureGenPredictRequest;
  hasPredictRequest(): boolean;
  clearPredictRequest(): FeatureGenPredictRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): FeatureGenPredictRequest.AsObject;
  static toObject(includeInstance: boolean, msg: FeatureGenPredictRequest): FeatureGenPredictRequest.AsObject;
  static serializeBinaryToWriter(message: FeatureGenPredictRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): FeatureGenPredictRequest;
  static deserializeBinaryFromReader(message: FeatureGenPredictRequest, reader: jspb.BinaryReader): FeatureGenPredictRequest;
}

export namespace FeatureGenPredictRequest {
  export type AsObject = {
    featureGenRequest?: FeatureGenRequest.AsObject,
    predictRequest?: PredictRequest.AsObject,
  }
}

export class PurchaseLinesRequest extends jspb.Message {
  getTextAnnotation(): ssn_type_text_annotation_pb.TextAnnotation | undefined;
  setTextAnnotation(value?: ssn_type_text_annotation_pb.TextAnnotation): PurchaseLinesRequest;
  hasTextAnnotation(): boolean;
  clearTextAnnotation(): PurchaseLinesRequest;

  getImage(): Uint8Array | string;
  getImage_asU8(): Uint8Array;
  getImage_asB64(): string;
  setImage(value: Uint8Array | string): PurchaseLinesRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): PurchaseLinesRequest.AsObject;
  static toObject(includeInstance: boolean, msg: PurchaseLinesRequest): PurchaseLinesRequest.AsObject;
  static serializeBinaryToWriter(message: PurchaseLinesRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): PurchaseLinesRequest;
  static deserializeBinaryFromReader(message: PurchaseLinesRequest, reader: jspb.BinaryReader): PurchaseLinesRequest;
}

export namespace PurchaseLinesRequest {
  export type AsObject = {
    textAnnotation?: ssn_type_text_annotation_pb.TextAnnotation.AsObject,
    image: Uint8Array | string,
  }
}

export class PurchaseLinesResponse extends jspb.Message {
  getPurchaseLinesList(): Array<ssn_type_candidate_pb.PurchaseLineCandidate>;
  setPurchaseLinesList(value: Array<ssn_type_candidate_pb.PurchaseLineCandidate>): PurchaseLinesResponse;
  clearPurchaseLinesList(): PurchaseLinesResponse;
  addPurchaseLines(value?: ssn_type_candidate_pb.PurchaseLineCandidate, index?: number): ssn_type_candidate_pb.PurchaseLineCandidate;

  getPurchaseLinesItemsList(): Array<ssn_type_candidate_pb.PurchaseLine>;
  setPurchaseLinesItemsList(value: Array<ssn_type_candidate_pb.PurchaseLine>): PurchaseLinesResponse;
  clearPurchaseLinesItemsList(): PurchaseLinesResponse;
  addPurchaseLinesItems(value?: ssn_type_candidate_pb.PurchaseLine, index?: number): ssn_type_candidate_pb.PurchaseLine;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): PurchaseLinesResponse.AsObject;
  static toObject(includeInstance: boolean, msg: PurchaseLinesResponse): PurchaseLinesResponse.AsObject;
  static serializeBinaryToWriter(message: PurchaseLinesResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): PurchaseLinesResponse;
  static deserializeBinaryFromReader(message: PurchaseLinesResponse, reader: jspb.BinaryReader): PurchaseLinesResponse;
}

export namespace PurchaseLinesResponse {
  export type AsObject = {
    purchaseLinesList: Array<ssn_type_candidate_pb.PurchaseLineCandidate.AsObject>,
    purchaseLinesItemsList: Array<ssn_type_candidate_pb.PurchaseLine.AsObject>,
  }
}

export class DocQARequest extends jspb.Message {
  getTextAnnotation(): ssn_type_text_annotation_pb.TextAnnotation | undefined;
  setTextAnnotation(value?: ssn_type_text_annotation_pb.TextAnnotation): DocQARequest;
  hasTextAnnotation(): boolean;
  clearTextAnnotation(): DocQARequest;

  getImage(): Uint8Array | string;
  getImage_asU8(): Uint8Array;
  getImage_asB64(): string;
  setImage(value: Uint8Array | string): DocQARequest;

  getQuestionsList(): Array<string>;
  setQuestionsList(value: Array<string>): DocQARequest;
  clearQuestionsList(): DocQARequest;
  addQuestions(value: string, index?: number): DocQARequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DocQARequest.AsObject;
  static toObject(includeInstance: boolean, msg: DocQARequest): DocQARequest.AsObject;
  static serializeBinaryToWriter(message: DocQARequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DocQARequest;
  static deserializeBinaryFromReader(message: DocQARequest, reader: jspb.BinaryReader): DocQARequest;
}

export namespace DocQARequest {
  export type AsObject = {
    textAnnotation?: ssn_type_text_annotation_pb.TextAnnotation.AsObject,
    image: Uint8Array | string,
    questionsList: Array<string>,
  }
}

export class DocQAResponse extends jspb.Message {
  getAnswersList(): Array<ssn_type_candidate_pb.AnswerCandidate>;
  setAnswersList(value: Array<ssn_type_candidate_pb.AnswerCandidate>): DocQAResponse;
  clearAnswersList(): DocQAResponse;
  addAnswers(value?: ssn_type_candidate_pb.AnswerCandidate, index?: number): ssn_type_candidate_pb.AnswerCandidate;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DocQAResponse.AsObject;
  static toObject(includeInstance: boolean, msg: DocQAResponse): DocQAResponse.AsObject;
  static serializeBinaryToWriter(message: DocQAResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DocQAResponse;
  static deserializeBinaryFromReader(message: DocQAResponse, reader: jspb.BinaryReader): DocQAResponse;
}

export namespace DocQAResponse {
  export type AsObject = {
    answersList: Array<ssn_type_candidate_pb.AnswerCandidate.AsObject>,
  }
}

export class VatDistributionRequest extends jspb.Message {
  getTextAnnotation(): ssn_type_text_annotation_pb.TextAnnotation | undefined;
  setTextAnnotation(value?: ssn_type_text_annotation_pb.TextAnnotation): VatDistributionRequest;
  hasTextAnnotation(): boolean;
  clearTextAnnotation(): VatDistributionRequest;

  getCountryCode(): string;
  setCountryCode(value: string): VatDistributionRequest;

  getImagesList(): Array<Uint8Array | string>;
  setImagesList(value: Array<Uint8Array | string>): VatDistributionRequest;
  clearImagesList(): VatDistributionRequest;
  addImages(value: Uint8Array | string, index?: number): VatDistributionRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): VatDistributionRequest.AsObject;
  static toObject(includeInstance: boolean, msg: VatDistributionRequest): VatDistributionRequest.AsObject;
  static serializeBinaryToWriter(message: VatDistributionRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): VatDistributionRequest;
  static deserializeBinaryFromReader(message: VatDistributionRequest, reader: jspb.BinaryReader): VatDistributionRequest;
}

export namespace VatDistributionRequest {
  export type AsObject = {
    textAnnotation?: ssn_type_text_annotation_pb.TextAnnotation.AsObject,
    countryCode: string,
    imagesList: Array<Uint8Array | string>,
  }
}

export class VatDistributionResponse extends jspb.Message {
  getVatDistributionCandidatesList(): Array<ssn_type_candidate_pb.VatDistributionCandidate>;
  setVatDistributionCandidatesList(value: Array<ssn_type_candidate_pb.VatDistributionCandidate>): VatDistributionResponse;
  clearVatDistributionCandidatesList(): VatDistributionResponse;
  addVatDistributionCandidates(value?: ssn_type_candidate_pb.VatDistributionCandidate, index?: number): ssn_type_candidate_pb.VatDistributionCandidate;

  getVatDistributionItemsList(): Array<ssn_type_candidate_pb.VatDistribution>;
  setVatDistributionItemsList(value: Array<ssn_type_candidate_pb.VatDistribution>): VatDistributionResponse;
  clearVatDistributionItemsList(): VatDistributionResponse;
  addVatDistributionItems(value?: ssn_type_candidate_pb.VatDistribution, index?: number): ssn_type_candidate_pb.VatDistribution;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): VatDistributionResponse.AsObject;
  static toObject(includeInstance: boolean, msg: VatDistributionResponse): VatDistributionResponse.AsObject;
  static serializeBinaryToWriter(message: VatDistributionResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): VatDistributionResponse;
  static deserializeBinaryFromReader(message: VatDistributionResponse, reader: jspb.BinaryReader): VatDistributionResponse;
}

export namespace VatDistributionResponse {
  export type AsObject = {
    vatDistributionCandidatesList: Array<ssn_type_candidate_pb.VatDistributionCandidate.AsObject>,
    vatDistributionItemsList: Array<ssn_type_candidate_pb.VatDistribution.AsObject>,
  }
}

