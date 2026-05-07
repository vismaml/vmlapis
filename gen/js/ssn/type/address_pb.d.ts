import * as jspb from 'google-protobuf'



export class StructuredAddress extends jspb.Message {
  getStreet(): string;
  setStreet(value: string): StructuredAddress;

  getPostalCode(): string;
  setPostalCode(value: string): StructuredAddress;

  getCity(): string;
  setCity(value: string): StructuredAddress;

  getCountry(): string;
  setCountry(value: string): StructuredAddress;

  getCountryCode(): string;
  setCountryCode(value: string): StructuredAddress;

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
    postalCode: string,
    city: string,
    country: string,
    countryCode: string,
  }
}

