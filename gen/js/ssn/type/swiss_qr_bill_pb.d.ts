import * as jspb from 'google-protobuf'



export class SwissQrBill extends jspb.Message {
  getPayment(): SwissQrPayment | undefined;
  setPayment(value?: SwissQrPayment): SwissQrBill;
  hasPayment(): boolean;
  clearPayment(): SwissQrBill;

  getIsValid(): boolean;
  setIsValid(value: boolean): SwissQrBill;

  getValidationError(): string;
  setValidationError(value: string): SwissQrBill;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): SwissQrBill.AsObject;
  static toObject(includeInstance: boolean, msg: SwissQrBill): SwissQrBill.AsObject;
  static serializeBinaryToWriter(message: SwissQrBill, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): SwissQrBill;
  static deserializeBinaryFromReader(message: SwissQrBill, reader: jspb.BinaryReader): SwissQrBill;
}

export namespace SwissQrBill {
  export type AsObject = {
    payment?: SwissQrPayment.AsObject,
    isValid: boolean,
    validationError: string,
  }
}

export class SwissQrPayment extends jspb.Message {
  getQrType(): string;
  setQrType(value: string): SwissQrPayment;

  getVersion(): string;
  setVersion(value: string): SwissQrPayment;

  getCodingType(): string;
  setCodingType(value: string): SwissQrPayment;

  getAccount(): string;
  setAccount(value: string): SwissQrPayment;

  getCreditorAddressType(): string;
  setCreditorAddressType(value: string): SwissQrPayment;

  getCreditorName(): string;
  setCreditorName(value: string): SwissQrPayment;

  getCreditorField1(): string;
  setCreditorField1(value: string): SwissQrPayment;

  getCreditorField2(): string;
  setCreditorField2(value: string): SwissQrPayment;

  getCreditorField3(): string;
  setCreditorField3(value: string): SwissQrPayment;

  getCreditorField4(): string;
  setCreditorField4(value: string): SwissQrPayment;

  getCreditorCountry(): string;
  setCreditorCountry(value: string): SwissQrPayment;

  getUltimateCreditorAddressType(): string;
  setUltimateCreditorAddressType(value: string): SwissQrPayment;

  getUltimateCreditorName(): string;
  setUltimateCreditorName(value: string): SwissQrPayment;

  getUltimateCreditorField1(): string;
  setUltimateCreditorField1(value: string): SwissQrPayment;

  getUltimateCreditorField2(): string;
  setUltimateCreditorField2(value: string): SwissQrPayment;

  getUltimateCreditorField3(): string;
  setUltimateCreditorField3(value: string): SwissQrPayment;

  getUltimateCreditorField4(): string;
  setUltimateCreditorField4(value: string): SwissQrPayment;

  getUltimateCreditorCountry(): string;
  setUltimateCreditorCountry(value: string): SwissQrPayment;

  getAmount(): string;
  setAmount(value: string): SwissQrPayment;

  getCurrency(): string;
  setCurrency(value: string): SwissQrPayment;

  getUltimateDebtorAddressType(): string;
  setUltimateDebtorAddressType(value: string): SwissQrPayment;

  getUltimateDebtorName(): string;
  setUltimateDebtorName(value: string): SwissQrPayment;

  getUltimateDebtorField1(): string;
  setUltimateDebtorField1(value: string): SwissQrPayment;

  getUltimateDebtorField2(): string;
  setUltimateDebtorField2(value: string): SwissQrPayment;

  getUltimateDebtorField3(): string;
  setUltimateDebtorField3(value: string): SwissQrPayment;

  getUltimateDebtorField4(): string;
  setUltimateDebtorField4(value: string): SwissQrPayment;

  getUltimateDebtorCountry(): string;
  setUltimateDebtorCountry(value: string): SwissQrPayment;

  getPaymentReferenceType(): string;
  setPaymentReferenceType(value: string): SwissQrPayment;

  getPaymentReference(): string;
  setPaymentReference(value: string): SwissQrPayment;

  getUnstructuredMessage(): string;
  setUnstructuredMessage(value: string): SwissQrPayment;

  getTrailer(): string;
  setTrailer(value: string): SwissQrPayment;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): SwissQrPayment.AsObject;
  static toObject(includeInstance: boolean, msg: SwissQrPayment): SwissQrPayment.AsObject;
  static serializeBinaryToWriter(message: SwissQrPayment, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): SwissQrPayment;
  static deserializeBinaryFromReader(message: SwissQrPayment, reader: jspb.BinaryReader): SwissQrPayment;
}

export namespace SwissQrPayment {
  export type AsObject = {
    qrType: string,
    version: string,
    codingType: string,
    account: string,
    creditorAddressType: string,
    creditorName: string,
    creditorField1: string,
    creditorField2: string,
    creditorField3: string,
    creditorField4: string,
    creditorCountry: string,
    ultimateCreditorAddressType: string,
    ultimateCreditorName: string,
    ultimateCreditorField1: string,
    ultimateCreditorField2: string,
    ultimateCreditorField3: string,
    ultimateCreditorField4: string,
    ultimateCreditorCountry: string,
    amount: string,
    currency: string,
    ultimateDebtorAddressType: string,
    ultimateDebtorName: string,
    ultimateDebtorField1: string,
    ultimateDebtorField2: string,
    ultimateDebtorField3: string,
    ultimateDebtorField4: string,
    ultimateDebtorCountry: string,
    paymentReferenceType: string,
    paymentReference: string,
    unstructuredMessage: string,
    trailer: string,
  }
}

