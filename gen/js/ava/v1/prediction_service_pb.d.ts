import * as jspb from 'google-protobuf'

import * as google_api_annotations_pb from '../../google/api/annotations_pb'; // proto import: "google/api/annotations.proto"
import * as google_protobuf_timestamp_pb from 'google-protobuf/google/protobuf/timestamp_pb'; // proto import: "google/protobuf/timestamp.proto"
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

  getDecisionRef(): string;
  setDecisionRef(value: string): DecideResponse;

  getEscalation(): Escalation | undefined;
  setEscalation(value?: Escalation): DecideResponse;
  hasEscalation(): boolean;
  clearEscalation(): DecideResponse;

  getDecidedAt(): google_protobuf_timestamp_pb.Timestamp | undefined;
  setDecidedAt(value?: google_protobuf_timestamp_pb.Timestamp): DecideResponse;
  hasDecidedAt(): boolean;
  clearDecidedAt(): DecideResponse;

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
    decisionRef: string,
    escalation?: Escalation.AsObject,
    decidedAt?: google_protobuf_timestamp_pb.Timestamp.AsObject,
  }
}

export class WalkedStep extends jspb.Message {
  getAnswer(): string;
  setAnswer(value: string): WalkedStep;

  getConfidence(): Confidence | undefined;
  setConfidence(value?: Confidence): WalkedStep;
  hasConfidence(): boolean;
  clearConfidence(): WalkedStep;

  getStepId(): string;
  setStepId(value: string): WalkedStep;

  getFactsList(): Array<string>;
  setFactsList(value: Array<string>): WalkedStep;
  clearFactsList(): WalkedStep;
  addFacts(value: string, index?: number): WalkedStep;

  getBranch(): TakenBranch | undefined;
  setBranch(value?: TakenBranch): WalkedStep;
  hasBranch(): boolean;
  clearBranch(): WalkedStep;

  getPredicate(): string;
  setPredicate(value: string): WalkedStep;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): WalkedStep.AsObject;
  static toObject(includeInstance: boolean, msg: WalkedStep): WalkedStep.AsObject;
  static serializeBinaryToWriter(message: WalkedStep, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): WalkedStep;
  static deserializeBinaryFromReader(message: WalkedStep, reader: jspb.BinaryReader): WalkedStep;
}

export namespace WalkedStep {
  export type AsObject = {
    answer: string,
    confidence?: Confidence.AsObject,
    stepId: string,
    factsList: Array<string>,
    branch?: TakenBranch.AsObject,
    predicate: string,
  }
}

export class TakenBranch extends jspb.Message {
  getBranchId(): string;
  setBranchId(value: string): TakenBranch;

  getLabel(): string;
  setLabel(value: string): TakenBranch;

  getNextStepId(): string;
  setNextStepId(value: string): TakenBranch;

  getOutputValue(): string;
  setOutputValue(value: string): TakenBranch;

  getEscalates(): boolean;
  setEscalates(value: boolean): TakenBranch;

  getOutcomeCase(): TakenBranch.OutcomeCase;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): TakenBranch.AsObject;
  static toObject(includeInstance: boolean, msg: TakenBranch): TakenBranch.AsObject;
  static serializeBinaryToWriter(message: TakenBranch, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): TakenBranch;
  static deserializeBinaryFromReader(message: TakenBranch, reader: jspb.BinaryReader): TakenBranch;
}

export namespace TakenBranch {
  export type AsObject = {
    branchId: string,
    label: string,
    nextStepId: string,
    outputValue: string,
    escalates: boolean,
  }

  export enum OutcomeCase { 
    OUTCOME_NOT_SET = 0,
    NEXT_STEP_ID = 3,
    OUTPUT_VALUE = 4,
    ESCALATES = 5,
  }
}

export class Escalation extends jspb.Message {
  getKind(): Escalation.Kind;
  setKind(value: Escalation.Kind): Escalation;

  getStepId(): string;
  setStepId(value: string): Escalation;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Escalation.AsObject;
  static toObject(includeInstance: boolean, msg: Escalation): Escalation.AsObject;
  static serializeBinaryToWriter(message: Escalation, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Escalation;
  static deserializeBinaryFromReader(message: Escalation, reader: jspb.BinaryReader): Escalation;
}

export namespace Escalation {
  export type AsObject = {
    kind: Escalation.Kind,
    stepId: string,
  }

  export enum Kind { 
    KIND_UNSPECIFIED = 0,
    MISSING_INFORMATION = 1,
    NO_MATCHING_BRANCH = 2,
    PROCEDURE_ESCALATION = 3,
    EVALUATION_ERROR = 4,
  }
}

export class GetDecisionRequest extends jspb.Message {
  getDatasetName(): string;
  setDatasetName(value: string): GetDecisionRequest;

  getDecisionRef(): string;
  setDecisionRef(value: string): GetDecisionRequest;

  getOutputName(): string;
  setOutputName(value: string): GetDecisionRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetDecisionRequest.AsObject;
  static toObject(includeInstance: boolean, msg: GetDecisionRequest): GetDecisionRequest.AsObject;
  static serializeBinaryToWriter(message: GetDecisionRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetDecisionRequest;
  static deserializeBinaryFromReader(message: GetDecisionRequest, reader: jspb.BinaryReader): GetDecisionRequest;
}

export namespace GetDecisionRequest {
  export type AsObject = {
    datasetName: string,
    decisionRef: string,
    outputName: string,
  }
}

export class GetProcedureRequest extends jspb.Message {
  getDatasetName(): string;
  setDatasetName(value: string): GetProcedureRequest;

  getOutputName(): string;
  setOutputName(value: string): GetProcedureRequest;

  getVersion(): number;
  setVersion(value: number): GetProcedureRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetProcedureRequest.AsObject;
  static toObject(includeInstance: boolean, msg: GetProcedureRequest): GetProcedureRequest.AsObject;
  static serializeBinaryToWriter(message: GetProcedureRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetProcedureRequest;
  static deserializeBinaryFromReader(message: GetProcedureRequest, reader: jspb.BinaryReader): GetProcedureRequest;
}

export namespace GetProcedureRequest {
  export type AsObject = {
    datasetName: string,
    outputName: string,
    version: number,
  }
}

export class GetProcedureResponse extends jspb.Message {
  getProcedureVersion(): number;
  setProcedureVersion(value: number): GetProcedureResponse;

  getTree(): ProcedureNode | undefined;
  setTree(value?: ProcedureNode): GetProcedureResponse;
  hasTree(): boolean;
  clearTree(): GetProcedureResponse;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetProcedureResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GetProcedureResponse): GetProcedureResponse.AsObject;
  static serializeBinaryToWriter(message: GetProcedureResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetProcedureResponse;
  static deserializeBinaryFromReader(message: GetProcedureResponse, reader: jspb.BinaryReader): GetProcedureResponse;
}

export namespace GetProcedureResponse {
  export type AsObject = {
    procedureVersion: number,
    tree?: ProcedureNode.AsObject,
  }
}

export class ProcedureNode extends jspb.Message {
  getPredicate(): string;
  setPredicate(value: string): ProcedureNode;

  getAnswersMap(): jspb.Map<string, ProcedureNode>;
  clearAnswersMap(): ProcedureNode;

  getTargetName(): string;
  setTargetName(value: string): ProcedureNode;

  getTargetValue(): string;
  setTargetValue(value: string): ProcedureNode;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ProcedureNode.AsObject;
  static toObject(includeInstance: boolean, msg: ProcedureNode): ProcedureNode.AsObject;
  static serializeBinaryToWriter(message: ProcedureNode, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ProcedureNode;
  static deserializeBinaryFromReader(message: ProcedureNode, reader: jspb.BinaryReader): ProcedureNode;
}

export namespace ProcedureNode {
  export type AsObject = {
    predicate: string,
    answersMap: Array<[string, ProcedureNode.AsObject]>,
    targetName: string,
    targetValue: string,
  }
}

export class GetDecisionPathResponse extends jspb.Message {
  getProcedureVersion(): number;
  setProcedureVersion(value: number): GetDecisionPathResponse;

  getDecisionRef(): string;
  setDecisionRef(value: string): GetDecisionPathResponse;

  getDecidedAt(): google_protobuf_timestamp_pb.Timestamp | undefined;
  setDecidedAt(value?: google_protobuf_timestamp_pb.Timestamp): GetDecisionPathResponse;
  hasDecidedAt(): boolean;
  clearDecidedAt(): GetDecisionPathResponse;

  getPath(): DecisionNode | undefined;
  setPath(value?: DecisionNode): GetDecisionPathResponse;
  hasPath(): boolean;
  clearPath(): GetDecisionPathResponse;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetDecisionPathResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GetDecisionPathResponse): GetDecisionPathResponse.AsObject;
  static serializeBinaryToWriter(message: GetDecisionPathResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetDecisionPathResponse;
  static deserializeBinaryFromReader(message: GetDecisionPathResponse, reader: jspb.BinaryReader): GetDecisionPathResponse;
}

export namespace GetDecisionPathResponse {
  export type AsObject = {
    procedureVersion: number,
    decisionRef: string,
    decidedAt?: google_protobuf_timestamp_pb.Timestamp.AsObject,
    path?: DecisionNode.AsObject,
  }
}

export class DecisionNode extends jspb.Message {
  getPredicate(): string;
  setPredicate(value: string): DecisionNode;

  getAnswer(): string;
  setAnswer(value: string): DecisionNode;

  getConfidence(): Confidence | undefined;
  setConfidence(value?: Confidence): DecisionNode;
  hasConfidence(): boolean;
  clearConfidence(): DecisionNode;

  getAnswersMap(): jspb.Map<string, DecisionNode>;
  clearAnswersMap(): DecisionNode;

  getTargetName(): string;
  setTargetName(value: string): DecisionNode;

  getTargetValue(): string;
  setTargetValue(value: string): DecisionNode;

  getEscalation(): Escalation | undefined;
  setEscalation(value?: Escalation): DecisionNode;
  hasEscalation(): boolean;
  clearEscalation(): DecisionNode;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DecisionNode.AsObject;
  static toObject(includeInstance: boolean, msg: DecisionNode): DecisionNode.AsObject;
  static serializeBinaryToWriter(message: DecisionNode, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DecisionNode;
  static deserializeBinaryFromReader(message: DecisionNode, reader: jspb.BinaryReader): DecisionNode;
}

export namespace DecisionNode {
  export type AsObject = {
    predicate: string,
    answer: string,
    confidence?: Confidence.AsObject,
    answersMap: Array<[string, DecisionNode.AsObject]>,
    targetName: string,
    targetValue: string,
    escalation?: Escalation.AsObject,
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
