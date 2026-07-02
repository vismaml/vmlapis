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
