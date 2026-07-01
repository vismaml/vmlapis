import * as jspb from 'google-protobuf'

import * as google_protobuf_timestamp_pb from 'google-protobuf/google/protobuf/timestamp_pb'; // proto import: "google/protobuf/timestamp.proto"
import * as ssn_type_candidate_pb from '../../../ssn/type/candidate_pb'; // proto import: "ssn/type/candidate.proto"


export class Company extends jspb.Message {
  getVatNumber(): string;
  setVatNumber(value: string): Company;

  getOrganisationNumber(): string;
  setOrganisationNumber(value: string): Company;

  getCountryCode(): string;
  setCountryCode(value: string): Company;

  getName(): string;
  setName(value: string): Company;

  getRawAddress(): string;
  setRawAddress(value: string): Company;

  getConfidence(): ssn_type_candidate_pb.Confidence | undefined;
  setConfidence(value?: ssn_type_candidate_pb.Confidence): Company;
  hasConfidence(): boolean;
  clearConfidence(): Company;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Company.AsObject;
  static toObject(includeInstance: boolean, msg: Company): Company.AsObject;
  static serializeBinaryToWriter(message: Company, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Company;
  static deserializeBinaryFromReader(message: Company, reader: jspb.BinaryReader): Company;
}

export namespace Company {
  export type AsObject = {
    vatNumber: string,
    organisationNumber: string,
    countryCode: string,
    name: string,
    rawAddress: string,
    confidence?: ssn_type_candidate_pb.Confidence.AsObject,
  }
}

export class BankAccount extends jspb.Message {
  getIban(): string;
  setIban(value: string): BankAccount;

  getBic(): string;
  setBic(value: string): BankAccount;

  getBankAccountNumber(): string;
  setBankAccountNumber(value: string): BankAccount;

  getBankRegistrationNumber(): string;
  setBankRegistrationNumber(value: string): BankAccount;

  getConfidence(): ssn_type_candidate_pb.Confidence | undefined;
  setConfidence(value?: ssn_type_candidate_pb.Confidence): BankAccount;
  hasConfidence(): boolean;
  clearConfidence(): BankAccount;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): BankAccount.AsObject;
  static toObject(includeInstance: boolean, msg: BankAccount): BankAccount.AsObject;
  static serializeBinaryToWriter(message: BankAccount, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): BankAccount;
  static deserializeBinaryFromReader(message: BankAccount, reader: jspb.BinaryReader): BankAccount;
}

export namespace BankAccount {
  export type AsObject = {
    iban: string,
    bic: string,
    bankAccountNumber: string,
    bankRegistrationNumber: string,
    confidence?: ssn_type_candidate_pb.Confidence.AsObject,
  }
}

export class ProcessInvoiceCompanyDataRequest extends jspb.Message {
  getProjectName(): string;
  setProjectName(value: string): ProcessInvoiceCompanyDataRequest;

  getTransactionId(): string;
  setTransactionId(value: string): ProcessInvoiceCompanyDataRequest;

  getSupplier(): Company | undefined;
  setSupplier(value?: Company): ProcessInvoiceCompanyDataRequest;
  hasSupplier(): boolean;
  clearSupplier(): ProcessInvoiceCompanyDataRequest;

  getReceiver(): Company | undefined;
  setReceiver(value?: Company): ProcessInvoiceCompanyDataRequest;
  hasReceiver(): boolean;
  clearReceiver(): ProcessInvoiceCompanyDataRequest;

  getBankAccountsList(): Array<BankAccount>;
  setBankAccountsList(value: Array<BankAccount>): ProcessInvoiceCompanyDataRequest;
  clearBankAccountsList(): ProcessInvoiceCompanyDataRequest;
  addBankAccounts(value?: BankAccount, index?: number): BankAccount;

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
    supplier?: Company.AsObject,
    receiver?: Company.AsObject,
    bankAccountsList: Array<BankAccount.AsObject>,
    productTypesList: Array<string>,
  }
}

export class BankAccountVerdict extends jspb.Message {
  getAccountKey(): string;
  setAccountKey(value: string): BankAccountVerdict;

  getVerdict(): TrustVerdict;
  setVerdict(value: TrustVerdict): BankAccountVerdict;

  getObservedCountTenant(): number;
  setObservedCountTenant(value: number): BankAccountVerdict;

  getObservedCountGlobal(): number;
  setObservedCountGlobal(value: number): BankAccountVerdict;

  getFirstSeen(): google_protobuf_timestamp_pb.Timestamp | undefined;
  setFirstSeen(value?: google_protobuf_timestamp_pb.Timestamp): BankAccountVerdict;
  hasFirstSeen(): boolean;
  clearFirstSeen(): BankAccountVerdict;

  getLastSeen(): google_protobuf_timestamp_pb.Timestamp | undefined;
  setLastSeen(value?: google_protobuf_timestamp_pb.Timestamp): BankAccountVerdict;
  hasLastSeen(): boolean;
  clearLastSeen(): BankAccountVerdict;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): BankAccountVerdict.AsObject;
  static toObject(includeInstance: boolean, msg: BankAccountVerdict): BankAccountVerdict.AsObject;
  static serializeBinaryToWriter(message: BankAccountVerdict, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): BankAccountVerdict;
  static deserializeBinaryFromReader(message: BankAccountVerdict, reader: jspb.BinaryReader): BankAccountVerdict;
}

export namespace BankAccountVerdict {
  export type AsObject = {
    accountKey: string,
    verdict: TrustVerdict,
    observedCountTenant: number,
    observedCountGlobal: number,
    firstSeen?: google_protobuf_timestamp_pb.Timestamp.AsObject,
    lastSeen?: google_protobuf_timestamp_pb.Timestamp.AsObject,
  }
}

export class EnrichedCompany extends jspb.Message {
  getCompanyKey(): string;
  setCompanyKey(value: string): EnrichedCompany;

  getRegistryName(): string;
  setRegistryName(value: string): EnrichedCompany;

  getRegistryAddress(): string;
  setRegistryAddress(value: string): EnrichedCompany;

  getVatValid(): boolean;
  setVatValid(value: boolean): EnrichedCompany;

  getIndustry(): string;
  setIndustry(value: string): EnrichedCompany;

  getEnrichmentStatus(): EnrichmentStatus;
  setEnrichmentStatus(value: EnrichmentStatus): EnrichedCompany;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): EnrichedCompany.AsObject;
  static toObject(includeInstance: boolean, msg: EnrichedCompany): EnrichedCompany.AsObject;
  static serializeBinaryToWriter(message: EnrichedCompany, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): EnrichedCompany;
  static deserializeBinaryFromReader(message: EnrichedCompany, reader: jspb.BinaryReader): EnrichedCompany;
}

export namespace EnrichedCompany {
  export type AsObject = {
    companyKey: string,
    registryName: string,
    registryAddress: string,
    vatValid: boolean,
    industry: string,
    enrichmentStatus: EnrichmentStatus,
  }
}

export class ProcessInvoiceCompanyDataResponse extends jspb.Message {
  getSupplier(): EnrichedCompany | undefined;
  setSupplier(value?: EnrichedCompany): ProcessInvoiceCompanyDataResponse;
  hasSupplier(): boolean;
  clearSupplier(): ProcessInvoiceCompanyDataResponse;

  getBankAccountVerdictsList(): Array<BankAccountVerdict>;
  setBankAccountVerdictsList(value: Array<BankAccountVerdict>): ProcessInvoiceCompanyDataResponse;
  clearBankAccountVerdictsList(): ProcessInvoiceCompanyDataResponse;
  addBankAccountVerdicts(value?: BankAccountVerdict, index?: number): BankAccountVerdict;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ProcessInvoiceCompanyDataResponse.AsObject;
  static toObject(includeInstance: boolean, msg: ProcessInvoiceCompanyDataResponse): ProcessInvoiceCompanyDataResponse.AsObject;
  static serializeBinaryToWriter(message: ProcessInvoiceCompanyDataResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ProcessInvoiceCompanyDataResponse;
  static deserializeBinaryFromReader(message: ProcessInvoiceCompanyDataResponse, reader: jspb.BinaryReader): ProcessInvoiceCompanyDataResponse;
}

export namespace ProcessInvoiceCompanyDataResponse {
  export type AsObject = {
    supplier?: EnrichedCompany.AsObject,
    bankAccountVerdictsList: Array<BankAccountVerdict.AsObject>,
  }
}

export enum TrustVerdict { 
  TRUST_VERDICT_UNSPECIFIED = 0,
  NEW = 1,
  KNOWN = 2,
}
export enum EnrichmentStatus { 
  ENRICHMENT_STATUS_UNSPECIFIED = 0,
  PENDING = 1,
  ENRICHED = 2,
  FAILED = 3,
}
