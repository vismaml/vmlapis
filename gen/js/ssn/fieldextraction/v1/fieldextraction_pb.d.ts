import * as jspb from 'google-protobuf'



export class ExtractRequest extends jspb.Message {
  getBqId(): string;
  setBqId(value: string): ExtractRequest;

  getConsumerName(): string;
  setConsumerName(value: string): ExtractRequest;

  getSourcesList(): Array<string>;
  setSourcesList(value: Array<string>): ExtractRequest;
  clearSourcesList(): ExtractRequest;
  addSources(value: string, index?: number): ExtractRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ExtractRequest.AsObject;
  static toObject(includeInstance: boolean, msg: ExtractRequest): ExtractRequest.AsObject;
  static serializeBinaryToWriter(message: ExtractRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ExtractRequest;
  static deserializeBinaryFromReader(message: ExtractRequest, reader: jspb.BinaryReader): ExtractRequest;
}

export namespace ExtractRequest {
  export type AsObject = {
    bqId: string,
    consumerName: string,
    sourcesList: Array<string>,
  }
}

export class ExtractResponse extends jspb.Message {
  getWorkflowIdsList(): Array<string>;
  setWorkflowIdsList(value: Array<string>): ExtractResponse;
  clearWorkflowIdsList(): ExtractResponse;
  addWorkflowIds(value: string, index?: number): ExtractResponse;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ExtractResponse.AsObject;
  static toObject(includeInstance: boolean, msg: ExtractResponse): ExtractResponse.AsObject;
  static serializeBinaryToWriter(message: ExtractResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ExtractResponse;
  static deserializeBinaryFromReader(message: ExtractResponse, reader: jspb.BinaryReader): ExtractResponse;
}

export namespace ExtractResponse {
  export type AsObject = {
    workflowIdsList: Array<string>,
  }
}

