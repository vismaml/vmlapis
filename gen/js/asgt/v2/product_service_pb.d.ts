import * as jspb from 'google-protobuf'

import * as google_api_annotations_pb from '../../google/api/annotations_pb'; // proto import: "google/api/annotations.proto"
import * as protoc$gen$openapiv2_options_annotations_pb from '../../protoc-gen-openapiv2/options/annotations_pb'; // proto import: "protoc-gen-openapiv2/options/annotations.proto"
import * as validate_validate_pb from '../../validate/validate_pb'; // proto import: "validate/validate.proto"


export class ProductTypeSuggestOptions extends jspb.Message {
  getMinConfidence(): ConfidenceLevel;
  setMinConfidence(value: ConfidenceLevel): ProductTypeSuggestOptions;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ProductTypeSuggestOptions.AsObject;
  static toObject(includeInstance: boolean, msg: ProductTypeSuggestOptions): ProductTypeSuggestOptions.AsObject;
  static serializeBinaryToWriter(message: ProductTypeSuggestOptions, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ProductTypeSuggestOptions;
  static deserializeBinaryFromReader(message: ProductTypeSuggestOptions, reader: jspb.BinaryReader): ProductTypeSuggestOptions;
}

export namespace ProductTypeSuggestOptions {
  export type AsObject = {
    minConfidence: ConfidenceLevel,
  }
}

export class ProductTypeBatchSuggestRequest extends jspb.Message {
  getTextsList(): Array<string>;
  setTextsList(value: Array<string>): ProductTypeBatchSuggestRequest;
  clearTextsList(): ProductTypeBatchSuggestRequest;
  addTexts(value: string, index?: number): ProductTypeBatchSuggestRequest;

  getOptions(): ProductTypeSuggestOptions | undefined;
  setOptions(value?: ProductTypeSuggestOptions): ProductTypeBatchSuggestRequest;
  hasOptions(): boolean;
  clearOptions(): ProductTypeBatchSuggestRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ProductTypeBatchSuggestRequest.AsObject;
  static toObject(includeInstance: boolean, msg: ProductTypeBatchSuggestRequest): ProductTypeBatchSuggestRequest.AsObject;
  static serializeBinaryToWriter(message: ProductTypeBatchSuggestRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ProductTypeBatchSuggestRequest;
  static deserializeBinaryFromReader(message: ProductTypeBatchSuggestRequest, reader: jspb.BinaryReader): ProductTypeBatchSuggestRequest;
}

export namespace ProductTypeBatchSuggestRequest {
  export type AsObject = {
    textsList: Array<string>,
    options?: ProductTypeSuggestOptions.AsObject,
  }
}

export class ProductTypeBatchSuggestResponse extends jspb.Message {
  getSuggestionsList(): Array<ProductTypeSuggestion>;
  setSuggestionsList(value: Array<ProductTypeSuggestion>): ProductTypeBatchSuggestResponse;
  clearSuggestionsList(): ProductTypeBatchSuggestResponse;
  addSuggestions(value?: ProductTypeSuggestion, index?: number): ProductTypeSuggestion;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ProductTypeBatchSuggestResponse.AsObject;
  static toObject(includeInstance: boolean, msg: ProductTypeBatchSuggestResponse): ProductTypeBatchSuggestResponse.AsObject;
  static serializeBinaryToWriter(message: ProductTypeBatchSuggestResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ProductTypeBatchSuggestResponse;
  static deserializeBinaryFromReader(message: ProductTypeBatchSuggestResponse, reader: jspb.BinaryReader): ProductTypeBatchSuggestResponse;
}

export namespace ProductTypeBatchSuggestResponse {
  export type AsObject = {
    suggestionsList: Array<ProductTypeSuggestion.AsObject>,
  }
}

export class ProductTypeSuggestion extends jspb.Message {
  getCandidatesList(): Array<ProductTypeCandidate>;
  setCandidatesList(value: Array<ProductTypeCandidate>): ProductTypeSuggestion;
  clearCandidatesList(): ProductTypeSuggestion;
  addCandidates(value?: ProductTypeCandidate, index?: number): ProductTypeCandidate;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ProductTypeSuggestion.AsObject;
  static toObject(includeInstance: boolean, msg: ProductTypeSuggestion): ProductTypeSuggestion.AsObject;
  static serializeBinaryToWriter(message: ProductTypeSuggestion, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ProductTypeSuggestion;
  static deserializeBinaryFromReader(message: ProductTypeSuggestion, reader: jspb.BinaryReader): ProductTypeSuggestion;
}

export namespace ProductTypeSuggestion {
  export type AsObject = {
    candidatesList: Array<ProductTypeCandidate.AsObject>,
  }
}

export class ProductTypeCandidate extends jspb.Message {
  getLabel(): string;
  setLabel(value: string): ProductTypeCandidate;

  getConfidence(): number;
  setConfidence(value: number): ProductTypeCandidate;

  getConfidenceLevel(): ConfidenceLevel;
  setConfidenceLevel(value: ConfidenceLevel): ProductTypeCandidate;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ProductTypeCandidate.AsObject;
  static toObject(includeInstance: boolean, msg: ProductTypeCandidate): ProductTypeCandidate.AsObject;
  static serializeBinaryToWriter(message: ProductTypeCandidate, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ProductTypeCandidate;
  static deserializeBinaryFromReader(message: ProductTypeCandidate, reader: jspb.BinaryReader): ProductTypeCandidate;
}

export namespace ProductTypeCandidate {
  export type AsObject = {
    label: string,
    confidence: number,
    confidenceLevel: ConfidenceLevel,
  }
}

export enum ConfidenceLevel { 
  UNKNOWN = 0,
  VERY_LOW = 1,
  LOW = 2,
  MID = 3,
  HIGH = 4,
  VERY_HIGH = 5,
}
