import * as jspb from 'google-protobuf'

import * as google_api_annotations_pb from '../../../google/api/annotations_pb'; // proto import: "google/api/annotations.proto"
import * as protoc$gen$openapiv2_options_annotations_pb from '../../../protoc-gen-openapiv2/options/annotations_pb'; // proto import: "protoc-gen-openapiv2/options/annotations.proto"


export class ValetKeyRequest extends jspb.Message {
  getSub(): string;
  setSub(value: string): ValetKeyRequest;

  getExp(): number;
  setExp(value: number): ValetKeyRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ValetKeyRequest.AsObject;
  static toObject(includeInstance: boolean, msg: ValetKeyRequest): ValetKeyRequest.AsObject;
  static serializeBinaryToWriter(message: ValetKeyRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ValetKeyRequest;
  static deserializeBinaryFromReader(message: ValetKeyRequest, reader: jspb.BinaryReader): ValetKeyRequest;
}

export namespace ValetKeyRequest {
  export type AsObject = {
    sub: string,
    exp: number,
  }
}

export class ValetKeyResponse extends jspb.Message {
  getId(): string;
  setId(value: string): ValetKeyResponse;

  getToken(): string;
  setToken(value: string): ValetKeyResponse;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ValetKeyResponse.AsObject;
  static toObject(includeInstance: boolean, msg: ValetKeyResponse): ValetKeyResponse.AsObject;
  static serializeBinaryToWriter(message: ValetKeyResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ValetKeyResponse;
  static deserializeBinaryFromReader(message: ValetKeyResponse, reader: jspb.BinaryReader): ValetKeyResponse;
}

export namespace ValetKeyResponse {
  export type AsObject = {
    id: string,
    token: string,
  }
}

