import * as jspb from 'google-protobuf'

import * as google_protobuf_timestamp_pb from 'google-protobuf/google/protobuf/timestamp_pb'; // proto import: "google/protobuf/timestamp.proto"
import * as validate_validate_pb from '../../../validate/validate_pb'; // proto import: "validate/validate.proto"


export class Invoice extends jspb.Message {
  getText(): string;
  setText(value: string): Invoice;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Invoice.AsObject;
  static toObject(includeInstance: boolean, msg: Invoice): Invoice.AsObject;
  static serializeBinaryToWriter(message: Invoice, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Invoice;
  static deserializeBinaryFromReader(message: Invoice, reader: jspb.BinaryReader): Invoice;
}

export namespace Invoice {
  export type AsObject = {
    text: string,
  }
}

export class Transaction extends jspb.Message {
  getText(): string;
  setText(value: string): Transaction;

  getAmount(): number;
  setAmount(value: number): Transaction;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Transaction.AsObject;
  static toObject(includeInstance: boolean, msg: Transaction): Transaction.AsObject;
  static serializeBinaryToWriter(message: Transaction, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Transaction;
  static deserializeBinaryFromReader(message: Transaction, reader: jspb.BinaryReader): Transaction;
}

export namespace Transaction {
  export type AsObject = {
    text: string,
    amount: number,
  }
}

export class InvoiceLine extends jspb.Message {
  getItemId(): string;
  setItemId(value: string): InvoiceLine;

  getText(): string;
  setText(value: string): InvoiceLine;

  getIssueDate(): google_protobuf_timestamp_pb.Timestamp | undefined;
  setIssueDate(value?: google_protobuf_timestamp_pb.Timestamp): InvoiceLine;
  hasIssueDate(): boolean;
  clearIssueDate(): InvoiceLine;

  getSupplier(): Supplier | undefined;
  setSupplier(value?: Supplier): InvoiceLine;
  hasSupplier(): boolean;
  clearSupplier(): InvoiceLine;

  getCustomerRef(): string;
  setCustomerRef(value: string): InvoiceLine;

  getCurrency(): string;
  setCurrency(value: string): InvoiceLine;

  getAmount(): number;
  setAmount(value: number): InvoiceLine;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): InvoiceLine.AsObject;
  static toObject(includeInstance: boolean, msg: InvoiceLine): InvoiceLine.AsObject;
  static serializeBinaryToWriter(message: InvoiceLine, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): InvoiceLine;
  static deserializeBinaryFromReader(message: InvoiceLine, reader: jspb.BinaryReader): InvoiceLine;
}

export namespace InvoiceLine {
  export type AsObject = {
    itemId: string,
    text: string,
    issueDate?: google_protobuf_timestamp_pb.Timestamp.AsObject,
    supplier?: Supplier.AsObject,
    customerRef: string,
    currency: string,
    amount: number,
  }
}

export class Supplier extends jspb.Message {
  getId(): string;
  setId(value: string): Supplier;

  getName(): string;
  setName(value: string): Supplier;

  getGlobalId(): string;
  setGlobalId(value: string): Supplier;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Supplier.AsObject;
  static toObject(includeInstance: boolean, msg: Supplier): Supplier.AsObject;
  static serializeBinaryToWriter(message: Supplier, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Supplier;
  static deserializeBinaryFromReader(message: Supplier, reader: jspb.BinaryReader): Supplier;
}

export namespace Supplier {
  export type AsObject = {
    id: string,
    name: string,
    globalId: string,
  }
}

export class Data extends jspb.Message {
  getTransaction(): Transaction | undefined;
  setTransaction(value?: Transaction): Data;
  hasTransaction(): boolean;
  clearTransaction(): Data;

  getInvoice(): Invoice | undefined;
  setInvoice(value?: Invoice): Data;
  hasInvoice(): boolean;
  clearInvoice(): Data;

  getInvoiceLine(): InvoiceLine | undefined;
  setInvoiceLine(value?: InvoiceLine): Data;
  hasInvoiceLine(): boolean;
  clearInvoiceLine(): Data;

  getDataStructureCase(): Data.DataStructureCase;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Data.AsObject;
  static toObject(includeInstance: boolean, msg: Data): Data.AsObject;
  static serializeBinaryToWriter(message: Data, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Data;
  static deserializeBinaryFromReader(message: Data, reader: jspb.BinaryReader): Data;
}

export namespace Data {
  export type AsObject = {
    transaction?: Transaction.AsObject,
    invoice?: Invoice.AsObject,
    invoiceLine?: InvoiceLine.AsObject,
  }

  export enum DataStructureCase { 
    DATA_STRUCTURE_NOT_SET = 0,
    TRANSACTION = 1,
    INVOICE = 2,
    INVOICE_LINE = 3,
  }
}

