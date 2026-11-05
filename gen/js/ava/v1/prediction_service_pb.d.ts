import * as jspb from 'google-protobuf'

import * as google_api_annotations_pb from '../../google/api/annotations_pb'; // proto import: "google/api/annotations.proto"
import * as google_protobuf_wrappers_pb from 'google-protobuf/google/protobuf/wrappers_pb'; // proto import: "google/protobuf/wrappers.proto"
import * as protoc$gen$openapiv2_options_annotations_pb from '../../protoc-gen-openapiv2/options/annotations_pb'; // proto import: "protoc-gen-openapiv2/options/annotations.proto"
import * as validate_validate_pb from '../../validate/validate_pb'; // proto import: "validate/validate.proto"


export class DecideRequest extends jspb.Message {
  getDatasetName(): string;
  setDatasetName(value: string): DecideRequest;

  getOutputName(): string;
  setOutputName(value: string): DecideRequest;

  getFieldsMap(): jspb.Map<string, string>;
  clearFieldsMap(): DecideRequest;

  getModel(): Model;
  setModel(value: Model): DecideRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DecideRequest.AsObject;
  static toObject(includeInstance: boolean, msg: DecideRequest): DecideRequest.AsObject;
  static serializeBinaryToWriter(message: DecideRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DecideRequest;
  static deserializeBinaryFromReader(message: DecideRequest, reader: jspb.BinaryReader): DecideRequest;
}

export namespace DecideRequest {
  export type AsObject = {
    datasetName: string,
    outputName: string,
    fieldsMap: Array<[string, string]>,
    model: Model,
  }
}

export class DecideResponse extends jspb.Message {
  getValue(): string;
  setValue(value: string): DecideResponse;

  getEscalated(): boolean;
  setEscalated(value: boolean): DecideResponse;

  getStepsList(): Array<WalkedStep>;
  setStepsList(value: Array<WalkedStep>): DecideResponse;
  clearStepsList(): DecideResponse;
  addSteps(value?: WalkedStep, index?: number): WalkedStep;

  getProcedureVersion(): number;
  setProcedureVersion(value: number): DecideResponse;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DecideResponse.AsObject;
  static toObject(includeInstance: boolean, msg: DecideResponse): DecideResponse.AsObject;
  static serializeBinaryToWriter(message: DecideResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DecideResponse;
  static deserializeBinaryFromReader(message: DecideResponse, reader: jspb.BinaryReader): DecideResponse;
}

export namespace DecideResponse {
  export type AsObject = {
    value: string,
    escalated: boolean,
    stepsList: Array<WalkedStep.AsObject>,
    procedureVersion: number,
  }
}

export class WalkedStep extends jspb.Message {
  getQuestion(): string;
  setQuestion(value: string): WalkedStep;

  getAnswer(): string;
  setAnswer(value: string): WalkedStep;

  getConfidence(): Confidence | undefined;
  setConfidence(value?: Confidence): WalkedStep;
  hasConfidence(): boolean;
  clearConfidence(): WalkedStep;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): WalkedStep.AsObject;
  static toObject(includeInstance: boolean, msg: WalkedStep): WalkedStep.AsObject;
  static serializeBinaryToWriter(message: WalkedStep, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): WalkedStep;
  static deserializeBinaryFromReader(message: WalkedStep, reader: jspb.BinaryReader): WalkedStep;
}

export namespace WalkedStep {
  export type AsObject = {
    question: string,
    answer: string,
    confidence?: Confidence.AsObject,
  }
}

export class Confidence extends jspb.Message {
  getLevel(): Confidence.Level;
  setLevel(value: Confidence.Level): Confidence;

  getValue(): google_protobuf_wrappers_pb.FloatValue | undefined;
  setValue(value?: google_protobuf_wrappers_pb.FloatValue): Confidence;
  hasValue(): boolean;
  clearValue(): Confidence;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Confidence.AsObject;
  static toObject(includeInstance: boolean, msg: Confidence): Confidence.AsObject;
  static serializeBinaryToWriter(message: Confidence, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Confidence;
  static deserializeBinaryFromReader(message: Confidence, reader: jspb.BinaryReader): Confidence;
}

export namespace Confidence {
  export type AsObject = {
    level: Confidence.Level,
    value?: google_protobuf_wrappers_pb.FloatValue.AsObject,
  }

  export enum Level { 
    UNKNOWN = 0,
    VERY_LOW = 1,
    LOW = 2,
    MID = 3,
    HIGH = 4,
    VERY_HIGH = 5,
  }
}

export enum Model { 
  QWEN = 0,
  CLEF = 1,
  BERT = 2,
  RERANKER = 3,
}
