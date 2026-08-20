import * as jspb from 'google-protobuf'

import * as google_protobuf_timestamp_pb from 'google-protobuf/google/protobuf/timestamp_pb'; // proto import: "google/protobuf/timestamp.proto"
import * as ssn_type_candidate_pb from '../../../ssn/type/candidate_pb'; // proto import: "ssn/type/candidate.proto"


export class ProcessInvoiceCompanyDataRequest extends jspb.Message {
  getProjectName(): string;
  setProjectName(value: string): ProcessInvoiceCompanyDataRequest;

  getTransactionId(): string;
  setTransactionId(value: string): ProcessInvoiceCompanyDataRequest;

  getSupplierName(): ssn_type_candidate_pb.Candidate | undefined;
  setSupplierName(value?: ssn_type_candidate_pb.Candidate): ProcessInvoiceCompanyDataRequest;
  hasSupplierName(): boolean;
  clearSupplierName(): ProcessInvoiceCompanyDataRequest;

  getSupplierVatNumber(): ssn_type_candidate_pb.Candidate | undefined;
  setSupplierVatNumber(value?: ssn_type_candidate_pb.Candidate): ProcessInvoiceCompanyDataRequest;
  hasSupplierVatNumber(): boolean;
  clearSupplierVatNumber(): ProcessInvoiceCompanyDataRequest;

  getSupplierOrganisationNumber(): ssn_type_candidate_pb.Candidate | undefined;
  setSupplierOrganisationNumber(value?: ssn_type_candidate_pb.Candidate): ProcessInvoiceCompanyDataRequest;
  hasSupplierOrganisationNumber(): boolean;
  clearSupplierOrganisationNumber(): ProcessInvoiceCompanyDataRequest;

  getSupplierCountryCode(): ssn_type_candidate_pb.Candidate | undefined;
  setSupplierCountryCode(value?: ssn_type_candidate_pb.Candidate): ProcessInvoiceCompanyDataRequest;
  hasSupplierCountryCode(): boolean;
  clearSupplierCountryCode(): ProcessInvoiceCompanyDataRequest;

  getSupplierAddress(): ssn_type_candidate_pb.Candidate | undefined;
  setSupplierAddress(value?: ssn_type_candidate_pb.Candidate): ProcessInvoiceCompanyDataRequest;
  hasSupplierAddress(): boolean;
  clearSupplierAddress(): ProcessInvoiceCompanyDataRequest;

  getReceiverName(): ssn_type_candidate_pb.Candidate | undefined;
  setReceiverName(value?: ssn_type_candidate_pb.Candidate): ProcessInvoiceCompanyDataRequest;
  hasReceiverName(): boolean;
  clearReceiverName(): ProcessInvoiceCompanyDataRequest;

  getReceiverVatNumber(): ssn_type_candidate_pb.Candidate | undefined;
  setReceiverVatNumber(value?: ssn_type_candidate_pb.Candidate): ProcessInvoiceCompanyDataRequest;
  hasReceiverVatNumber(): boolean;
  clearReceiverVatNumber(): ProcessInvoiceCompanyDataRequest;

  getReceiverOrganisationNumber(): ssn_type_candidate_pb.Candidate | undefined;
  setReceiverOrganisationNumber(value?: ssn_type_candidate_pb.Candidate): ProcessInvoiceCompanyDataRequest;
  hasReceiverOrganisationNumber(): boolean;
  clearReceiverOrganisationNumber(): ProcessInvoiceCompanyDataRequest;

  getReceiverCountryCode(): ssn_type_candidate_pb.Candidate | undefined;
  setReceiverCountryCode(value?: ssn_type_candidate_pb.Candidate): ProcessInvoiceCompanyDataRequest;
  hasReceiverCountryCode(): boolean;
  clearReceiverCountryCode(): ProcessInvoiceCompanyDataRequest;

  getReceiverAddress(): ssn_type_candidate_pb.Candidate | undefined;
  setReceiverAddress(value?: ssn_type_candidate_pb.Candidate): ProcessInvoiceCompanyDataRequest;
  hasReceiverAddress(): boolean;
  clearReceiverAddress(): ProcessInvoiceCompanyDataRequest;

  getIban(): ssn_type_candidate_pb.Candidate | undefined;
  setIban(value?: ssn_type_candidate_pb.Candidate): ProcessInvoiceCompanyDataRequest;
  hasIban(): boolean;
  clearIban(): ProcessInvoiceCompanyDataRequest;

  getBic(): ssn_type_candidate_pb.Candidate | undefined;
  setBic(value?: ssn_type_candidate_pb.Candidate): ProcessInvoiceCompanyDataRequest;
  hasBic(): boolean;
  clearBic(): ProcessInvoiceCompanyDataRequest;

  getBankAccountNumber(): ssn_type_candidate_pb.Candidate | undefined;
  setBankAccountNumber(value?: ssn_type_candidate_pb.Candidate): ProcessInvoiceCompanyDataRequest;
  hasBankAccountNumber(): boolean;
  clearBankAccountNumber(): ProcessInvoiceCompanyDataRequest;

  getBankRegistrationNumber(): ssn_type_candidate_pb.Candidate | undefined;
  setBankRegistrationNumber(value?: ssn_type_candidate_pb.Candidate): ProcessInvoiceCompanyDataRequest;
  hasBankRegistrationNumber(): boolean;
  clearBankRegistrationNumber(): ProcessInvoiceCompanyDataRequest;

  getProductTypesList(): Array<string>;
  setProductTypesList(value: Array<string>): ProcessInvoiceCompanyDataRequest;
  clearProductTypesList(): ProcessInvoiceCompanyDataRequest;
  addProductTypes(value: string, index?: number): ProcessInvoiceCompanyDataRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ProcessInvoiceCompanyDataRequest.AsObject;
  static toObject(includeInstance: boolean, msg: ProcessInvoiceCompanyDataRequest): ProcessInvoiceCompanyDataRequest.AsObject;
  static serializeBinaryToWriter(message: ProcessInvoiceCompanyDataRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ProcessInvoiceCompanyDataRequest;
  static deserializeBinaryFromReader(message: ProcessInvoiceCompanyDataRequest, reader: jspb.BinaryReader): ProcessInvoiceCompanyDataRequest;
}

export namespace ProcessInvoiceCompanyDataRequest {
  export type AsObject = {
    projectName: string,
    transactionId: string,
    supplierName?: ssn_type_candidate_pb.Candidate.AsObject,
    supplierVatNumber?: ssn_type_candidate_pb.Candidate.AsObject,
    supplierOrganisationNumber?: ssn_type_candidate_pb.Candidate.AsObject,
    supplierCountryCode?: ssn_type_candidate_pb.Candidate.AsObject,
    supplierAddress?: ssn_type_candidate_pb.Candidate.AsObject,
    receiverName?: ssn_type_candidate_pb.Candidate.AsObject,
    receiverVatNumber?: ssn_type_candidate_pb.Candidate.AsObject,
    receiverOrganisationNumber?: ssn_type_candidate_pb.Candidate.AsObject,
    receiverCountryCode?: ssn_type_candidate_pb.Candidate.AsObject,
    receiverAddress?: ssn_type_candidate_pb.Candidate.AsObject,
    iban?: ssn_type_candidate_pb.Candidate.AsObject,
    bic?: ssn_type_candidate_pb.Candidate.AsObject,
    bankAccountNumber?: ssn_type_candidate_pb.Candidate.AsObject,
    bankRegistrationNumber?: ssn_type_candidate_pb.Candidate.AsObject,
    productTypesList: Array<string>,
  }
}

export class ProcessInvoiceCompanyDataResponse extends jspb.Message {
  getSupplierVatValid(): boolean;
  setSupplierVatValid(value: boolean): ProcessInvoiceCompanyDataResponse;

  getBankAccountVerdict(): BankAccountVerdict;
  setBankAccountVerdict(value: BankAccountVerdict): ProcessInvoiceCompanyDataResponse;

  getObservedCountTenant(): number;
  setObservedCountTenant(value: number): ProcessInvoiceCompanyDataResponse;

  getObservedCountGlobal(): number;
  setObservedCountGlobal(value: number): ProcessInvoiceCompanyDataResponse;

  getFirstSeen(): google_protobuf_timestamp_pb.Timestamp | undefined;
  setFirstSeen(value?: google_protobuf_timestamp_pb.Timestamp): ProcessInvoiceCompanyDataResponse;
  hasFirstSeen(): boolean;
  clearFirstSeen(): ProcessInvoiceCompanyDataResponse;

  getLastSeen(): google_protobuf_timestamp_pb.Timestamp | undefined;
  setLastSeen(value?: google_protobuf_timestamp_pb.Timestamp): ProcessInvoiceCompanyDataResponse;
  hasLastSeen(): boolean;
  clearLastSeen(): ProcessInvoiceCompanyDataResponse;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ProcessInvoiceCompanyDataResponse.AsObject;
  static toObject(includeInstance: boolean, msg: ProcessInvoiceCompanyDataResponse): ProcessInvoiceCompanyDataResponse.AsObject;
  static serializeBinaryToWriter(message: ProcessInvoiceCompanyDataResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ProcessInvoiceCompanyDataResponse;
  static deserializeBinaryFromReader(message: ProcessInvoiceCompanyDataResponse, reader: jspb.BinaryReader): ProcessInvoiceCompanyDataResponse;
}

export namespace ProcessInvoiceCompanyDataResponse {
  export type AsObject = {
    supplierVatValid: boolean,
    bankAccountVerdict: BankAccountVerdict,
    observedCountTenant: number,
    observedCountGlobal: number,
    firstSeen?: google_protobuf_timestamp_pb.Timestamp.AsObject,
    lastSeen?: google_protobuf_timestamp_pb.Timestamp.AsObject,
  }
}

export class VerifySupplierRequest extends jspb.Message {
  getCountryCode(): string;
  setCountryCode(value: string): VerifySupplierRequest;

  getVatNumber(): string;
  setVatNumber(value: string): VerifySupplierRequest;

  getOrganisationNumber(): string;
  setOrganisationNumber(value: string): VerifySupplierRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): VerifySupplierRequest.AsObject;
  static toObject(includeInstance: boolean, msg: VerifySupplierRequest): VerifySupplierRequest.AsObject;
  static serializeBinaryToWriter(message: VerifySupplierRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): VerifySupplierRequest;
  static deserializeBinaryFromReader(message: VerifySupplierRequest, reader: jspb.BinaryReader): VerifySupplierRequest;
}

export namespace VerifySupplierRequest {
  export type AsObject = {
    countryCode: string,
    vatNumber: string,
    organisationNumber: string,
  }
}

export class VerifySupplierResponse extends jspb.Message {
  getVerified(): boolean;
  setVerified(value: boolean): VerifySupplierResponse;

  getReason(): SupplierVerdictReason;
  setReason(value: SupplierVerdictReason): VerifySupplierResponse;

  getIdentifier(): VerifiedIdentifier;
  setIdentifier(value: VerifiedIdentifier): VerifySupplierResponse;

  getRegistrySource(): string;
  setRegistrySource(value: string): VerifySupplierResponse;

  getRegistryFetchedAt(): google_protobuf_timestamp_pb.Timestamp | undefined;
  setRegistryFetchedAt(value?: google_protobuf_timestamp_pb.Timestamp): VerifySupplierResponse;
  hasRegistryFetchedAt(): boolean;
  clearRegistryFetchedAt(): VerifySupplierResponse;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): VerifySupplierResponse.AsObject;
  static toObject(includeInstance: boolean, msg: VerifySupplierResponse): VerifySupplierResponse.AsObject;
  static serializeBinaryToWriter(message: VerifySupplierResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): VerifySupplierResponse;
  static deserializeBinaryFromReader(message: VerifySupplierResponse, reader: jspb.BinaryReader): VerifySupplierResponse;
}

export namespace VerifySupplierResponse {
  export type AsObject = {
    verified: boolean,
    reason: SupplierVerdictReason,
    identifier: VerifiedIdentifier,
    registrySource: string,
    registryFetchedAt?: google_protobuf_timestamp_pb.Timestamp.AsObject,
  }
}

export enum SupplierVerdictReason { 
  SUPPLIER_VERDICT_REASON_UNSPECIFIED = 0,
  VERIFIED_BY_REGISTRY = 1,
  REFUTED_BY_REGISTRY = 2,
  NOT_ATTEMPTED = 3,
  ATTEMPT_FAILED = 4,
  NO_REGISTRY_FOR_COUNTRY = 5,
  NO_IDENTIFIER = 6,
  STALE = 7,
}
export enum VerifiedIdentifier { 
  VERIFIED_IDENTIFIER_UNSPECIFIED = 0,
  VAT_NUMBER = 1,
  ORGANISATION_NUMBER = 2,
}
export enum BankAccountVerdict { 
  BANK_ACCOUNT_VERDICT_UNSPECIFIED = 0,
  BANK_ACCOUNT_KNOWN = 1,
  BANK_ACCOUNT_NEW = 2,
  BANK_ACCOUNT_UNKNOWN = 3,
}
