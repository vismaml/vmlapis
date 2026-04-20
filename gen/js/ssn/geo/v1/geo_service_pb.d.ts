import * as jspb from 'google-protobuf'

import * as ssn_type_candidate_pb from '../../../ssn/type/candidate_pb'; // proto import: "ssn/type/candidate.proto"


export class StructuredAddress extends jspb.Message {
  getStreet(): string;
  setStreet(value: string): StructuredAddress;

  getHouseNumber(): string;
  setHouseNumber(value: string): StructuredAddress;

  getPostalCode(): string;
  setPostalCode(value: string): StructuredAddress;

  getCity(): string;
  setCity(value: string): StructuredAddress;

  getState(): string;
  setState(value: string): StructuredAddress;

  getCountry(): string;
  setCountry(value: string): StructuredAddress;

  getCountryCode(): string;
  setCountryCode(value: string): StructuredAddress;

  getLatitude(): number;
  setLatitude(value: number): StructuredAddress;

  getLongitude(): number;
  setLongitude(value: number): StructuredAddress;

  getFormattedAddress(): string;
  setFormattedAddress(value: string): StructuredAddress;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): StructuredAddress.AsObject;
  static toObject(includeInstance: boolean, msg: StructuredAddress): StructuredAddress.AsObject;
  static serializeBinaryToWriter(message: StructuredAddress, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): StructuredAddress;
  static deserializeBinaryFromReader(message: StructuredAddress, reader: jspb.BinaryReader): StructuredAddress;
}

export namespace StructuredAddress {
  export type AsObject = {
    street: string,
    houseNumber: string,
    postalCode: string,
    city: string,
    state: string,
    country: string,
    countryCode: string,
    latitude: number,
    longitude: number,
    formattedAddress: string,
  }
}

export class ValidateAddressRequest extends jspb.Message {
  getRawAddress(): string;
  setRawAddress(value: string): ValidateAddressRequest;

  getFeature(): AddressFeature;
  setFeature(value: AddressFeature): ValidateAddressRequest;

  getDocumentId(): string;
  setDocumentId(value: string): ValidateAddressRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ValidateAddressRequest.AsObject;
  static toObject(includeInstance: boolean, msg: ValidateAddressRequest): ValidateAddressRequest.AsObject;
  static serializeBinaryToWriter(message: ValidateAddressRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ValidateAddressRequest;
  static deserializeBinaryFromReader(message: ValidateAddressRequest, reader: jspb.BinaryReader): ValidateAddressRequest;
}

export namespace ValidateAddressRequest {
  export type AsObject = {
    rawAddress: string,
    feature: AddressFeature,
    documentId: string,
  }
}

export class ValidateAddressResponse extends jspb.Message {
  getValid(): boolean;
  setValid(value: boolean): ValidateAddressResponse;

  getConfidence(): ssn_type_candidate_pb.Confidence | undefined;
  setConfidence(value?: ssn_type_candidate_pb.Confidence): ValidateAddressResponse;
  hasConfidence(): boolean;
  clearConfidence(): ValidateAddressResponse;

  getAddress(): StructuredAddress | undefined;
  setAddress(value?: StructuredAddress): ValidateAddressResponse;
  hasAddress(): boolean;
  clearAddress(): ValidateAddressResponse;

  getFeature(): AddressFeature;
  setFeature(value: AddressFeature): ValidateAddressResponse;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ValidateAddressResponse.AsObject;
  static toObject(includeInstance: boolean, msg: ValidateAddressResponse): ValidateAddressResponse.AsObject;
  static serializeBinaryToWriter(message: ValidateAddressResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ValidateAddressResponse;
  static deserializeBinaryFromReader(message: ValidateAddressResponse, reader: jspb.BinaryReader): ValidateAddressResponse;
}

export namespace ValidateAddressResponse {
  export type AsObject = {
    valid: boolean,
    confidence?: ssn_type_candidate_pb.Confidence.AsObject,
    address?: StructuredAddress.AsObject,
    feature: AddressFeature,
  }
}

export class ValidateAddressesRequest extends jspb.Message {
  getAddressesList(): Array<ValidateAddressRequest>;
  setAddressesList(value: Array<ValidateAddressRequest>): ValidateAddressesRequest;
  clearAddressesList(): ValidateAddressesRequest;
  addAddresses(value?: ValidateAddressRequest, index?: number): ValidateAddressRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ValidateAddressesRequest.AsObject;
  static toObject(includeInstance: boolean, msg: ValidateAddressesRequest): ValidateAddressesRequest.AsObject;
  static serializeBinaryToWriter(message: ValidateAddressesRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ValidateAddressesRequest;
  static deserializeBinaryFromReader(message: ValidateAddressesRequest, reader: jspb.BinaryReader): ValidateAddressesRequest;
}

export namespace ValidateAddressesRequest {
  export type AsObject = {
    addressesList: Array<ValidateAddressRequest.AsObject>,
  }
}

export class ValidateAddressesResponse extends jspb.Message {
  getResultsList(): Array<ValidateAddressResponse>;
  setResultsList(value: Array<ValidateAddressResponse>): ValidateAddressesResponse;
  clearResultsList(): ValidateAddressesResponse;
  addResults(value?: ValidateAddressResponse, index?: number): ValidateAddressResponse;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ValidateAddressesResponse.AsObject;
  static toObject(includeInstance: boolean, msg: ValidateAddressesResponse): ValidateAddressesResponse.AsObject;
  static serializeBinaryToWriter(message: ValidateAddressesResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ValidateAddressesResponse;
  static deserializeBinaryFromReader(message: ValidateAddressesResponse, reader: jspb.BinaryReader): ValidateAddressesResponse;
}

export namespace ValidateAddressesResponse {
  export type AsObject = {
    resultsList: Array<ValidateAddressResponse.AsObject>,
  }
}

export enum AddressFeature { 
  ADDRESS_FEATURE_UNSPECIFIED = 0,
  SUPPLIER_ADDRESS = 1,
  RECEIVER_ADDRESS = 2,
}
