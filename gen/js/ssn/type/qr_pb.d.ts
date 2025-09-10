import * as jspb from 'google-protobuf'



export class QrCodeData extends jspb.Message {
  getContent(): string;
  setContent(value: string): QrCodeData;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): QrCodeData.AsObject;
  static toObject(includeInstance: boolean, msg: QrCodeData): QrCodeData.AsObject;
  static serializeBinaryToWriter(message: QrCodeData, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): QrCodeData;
  static deserializeBinaryFromReader(message: QrCodeData, reader: jspb.BinaryReader): QrCodeData;
}

export namespace QrCodeData {
  export type AsObject = {
    content: string,
  }
}

export class SwissQrBill extends jspb.Message {
  getQrType(): string;
  setQrType(value: string): SwissQrBill;

  getVersion(): string;
  setVersion(value: string): SwissQrBill;

  getCodingType(): string;
  setCodingType(value: string): SwissQrBill;

  getAccount(): string;
  setAccount(value: string): SwissQrBill;

  getCreditorAddressType(): string;
  setCreditorAddressType(value: string): SwissQrBill;

  getCreditorName(): string;
  setCreditorName(value: string): SwissQrBill;

  getCreditorAddressLine1(): string;
  setCreditorAddressLine1(value: string): SwissQrBill;

  getCreditorAddressLine2(): string;
  setCreditorAddressLine2(value: string): SwissQrBill;

  getCreditorAddressPostalCode(): string;
  setCreditorAddressPostalCode(value: string): SwissQrBill;

  getCreditorAddressCity(): string;
  setCreditorAddressCity(value: string): SwissQrBill;

  getCreditorAddressCountry(): string;
  setCreditorAddressCountry(value: string): SwissQrBill;

  getUltimateCreditorAddressType(): string;
  setUltimateCreditorAddressType(value: string): SwissQrBill;

  getUltimateCreditorName(): string;
  setUltimateCreditorName(value: string): SwissQrBill;

  getUltimateCreditorAddressLine1(): string;
  setUltimateCreditorAddressLine1(value: string): SwissQrBill;

  getUltimateCreditorAddressLine2(): string;
  setUltimateCreditorAddressLine2(value: string): SwissQrBill;

  getUltimateCreditorAddressPostalCode(): string;
  setUltimateCreditorAddressPostalCode(value: string): SwissQrBill;

  getUltimateCreditorAddressCity(): string;
  setUltimateCreditorAddressCity(value: string): SwissQrBill;

  getUltimateCreditorAddressCountry(): string;
  setUltimateCreditorAddressCountry(value: string): SwissQrBill;

  getAmount(): string;
  setAmount(value: string): SwissQrBill;

  getCurrency(): string;
  setCurrency(value: string): SwissQrBill;

  getUltimateDebtorAddressType(): string;
  setUltimateDebtorAddressType(value: string): SwissQrBill;

  getUltimateDebtorName(): string;
  setUltimateDebtorName(value: string): SwissQrBill;

  getUltimateDebtorAddressLine1(): string;
  setUltimateDebtorAddressLine1(value: string): SwissQrBill;

  getUltimateDebtorAddressLine2(): string;
  setUltimateDebtorAddressLine2(value: string): SwissQrBill;

  getUltimateDebtorAddressPostalCode(): string;
  setUltimateDebtorAddressPostalCode(value: string): SwissQrBill;

  getUltimateDebtorAddressCity(): string;
  setUltimateDebtorAddressCity(value: string): SwissQrBill;

  getUltimateDebtorAddressCountry(): string;
  setUltimateDebtorAddressCountry(value: string): SwissQrBill;

  getPaymentReferenceType(): string;
  setPaymentReferenceType(value: string): SwissQrBill;

  getPaymentReference(): string;
  setPaymentReference(value: string): SwissQrBill;

  getUnstructuredMessage(): string;
  setUnstructuredMessage(value: string): SwissQrBill;

  getTrailer(): string;
  setTrailer(value: string): SwissQrBill;

  getBillingInformation(): string;
  setBillingInformation(value: string): SwissQrBill;

  getAv1Parameters(): string;
  setAv1Parameters(value: string): SwissQrBill;

  getAv2Parameters(): string;
  setAv2Parameters(value: string): SwissQrBill;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): SwissQrBill.AsObject;
  static toObject(includeInstance: boolean, msg: SwissQrBill): SwissQrBill.AsObject;
  static serializeBinaryToWriter(message: SwissQrBill, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): SwissQrBill;
  static deserializeBinaryFromReader(message: SwissQrBill, reader: jspb.BinaryReader): SwissQrBill;
}

export namespace SwissQrBill {
  export type AsObject = {
    qrType: string,
    version: string,
    codingType: string,
    account: string,
    creditorAddressType: string,
    creditorName: string,
    creditorAddressLine1: string,
    creditorAddressLine2: string,
    creditorAddressPostalCode: string,
    creditorAddressCity: string,
    creditorAddressCountry: string,
    ultimateCreditorAddressType: string,
    ultimateCreditorName: string,
    ultimateCreditorAddressLine1: string,
    ultimateCreditorAddressLine2: string,
    ultimateCreditorAddressPostalCode: string,
    ultimateCreditorAddressCity: string,
    ultimateCreditorAddressCountry: string,
    amount: string,
    currency: string,
    ultimateDebtorAddressType: string,
    ultimateDebtorName: string,
    ultimateDebtorAddressLine1: string,
    ultimateDebtorAddressLine2: string,
    ultimateDebtorAddressPostalCode: string,
    ultimateDebtorAddressCity: string,
    ultimateDebtorAddressCountry: string,
    paymentReferenceType: string,
    paymentReference: string,
    unstructuredMessage: string,
    trailer: string,
    billingInformation: string,
    av1Parameters: string,
    av2Parameters: string,
  }
}

