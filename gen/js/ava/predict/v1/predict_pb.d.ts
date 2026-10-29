import * as jspb from 'google-protobuf'

import * as ava_procedure_v1_procedure_pb from '../../../ava/procedure/v1/procedure_pb'; // proto import: "ava/procedure/v1/procedure.proto"
import * as google_api_annotations_pb from '../../../google/api/annotations_pb'; // proto import: "google/api/annotations.proto"


export class PredictRequest extends jspb.Message {
  getDatasetName(): string;
  setDatasetName(value: string): PredictRequest;

  getOutputName(): string;
  setOutputName(value: string): PredictRequest;

  getText(): string;
  setText(value: string): PredictRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): PredictRequest.AsObject;
  static toObject(includeInstance: boolean, msg: PredictRequest): PredictRequest.AsObject;
  static serializeBinaryToWriter(message: PredictRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): PredictRequest;
  static deserializeBinaryFromReader(message: PredictRequest, reader: jspb.BinaryReader): PredictRequest;
}

export namespace PredictRequest {
  export type AsObject = {
    datasetName: string,
    outputName: string,
    text: string,
  }
}

export class PredictResponse extends jspb.Message {
  getWorkflowId(): string;
  setWorkflowId(value: string): PredictResponse;

  getOutputValue(): string;
  setOutputValue(value: string): PredictResponse;

  getEscalationReason(): string;
  setEscalationReason(value: string): PredictResponse;

  getReasoning(): string;
  setReasoning(value: string): PredictResponse;

  getProcedureDataset(): string;
  setProcedureDataset(value: string): PredictResponse;

  getVersion(): number;
  setVersion(value: number): PredictResponse;

  getFactsList(): Array<Fact>;
  setFactsList(value: Array<Fact>): PredictResponse;
  clearFactsList(): PredictResponse;
  addFacts(value?: Fact, index?: number): Fact;

  getTrace(): Trace | undefined;
  setTrace(value?: Trace): PredictResponse;
  hasTrace(): boolean;
  clearTrace(): PredictResponse;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): PredictResponse.AsObject;
  static toObject(includeInstance: boolean, msg: PredictResponse): PredictResponse.AsObject;
  static serializeBinaryToWriter(message: PredictResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): PredictResponse;
  static deserializeBinaryFromReader(message: PredictResponse, reader: jspb.BinaryReader): PredictResponse;
}

export namespace PredictResponse {
  export type AsObject = {
    workflowId: string,
    outputValue: string,
    escalationReason: string,
    reasoning: string,
    procedureDataset: string,
    version: number,
    factsList: Array<Fact.AsObject>,
    trace?: Trace.AsObject,
  }
}

export class Fact extends jspb.Message {
  getName(): string;
  setName(value: string): Fact;

  getType(): ava_procedure_v1_procedure_pb.FactType;
  setType(value: ava_procedure_v1_procedure_pb.FactType): Fact;

  getPermittedList(): Array<string>;
  setPermittedList(value: Array<string>): Fact;
  clearPermittedList(): Fact;
  addPermitted(value: string, index?: number): Fact;

  getSourcesList(): Array<FactSource>;
  setSourcesList(value: Array<FactSource>): Fact;
  clearSourcesList(): Fact;
  addSources(value?: FactSource, index?: number): FactSource;

  getValue(): string;
  setValue(value: string): Fact;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Fact.AsObject;
  static toObject(includeInstance: boolean, msg: Fact): Fact.AsObject;
  static serializeBinaryToWriter(message: Fact, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Fact;
  static deserializeBinaryFromReader(message: Fact, reader: jspb.BinaryReader): Fact;
}

export namespace Fact {
  export type AsObject = {
    name: string,
    type: ava_procedure_v1_procedure_pb.FactType,
    permittedList: Array<string>,
    sourcesList: Array<FactSource.AsObject>,
    value: string,
  }
}

export class FactSource extends jspb.Message {
  getKind(): ava_procedure_v1_procedure_pb.SourceKind;
  setKind(value: ava_procedure_v1_procedure_pb.SourceKind): FactSource;

  getName(): string;
  setName(value: string): FactSource;

  getField(): string;
  setField(value: string): FactSource;

  getArgsList(): Array<string>;
  setArgsList(value: Array<string>): FactSource;
  clearArgsList(): FactSource;
  addArgs(value: string, index?: number): FactSource;

  getQuestion(): string;
  setQuestion(value: string): FactSource;

  getGuidance(): string;
  setGuidance(value: string): FactSource;

  getValue(): string;
  setValue(value: string): FactSource;

  getSkipped(): string;
  setSkipped(value: string): FactSource;

  getProbability(): number;
  setProbability(value: number): FactSource;
  hasProbability(): boolean;
  clearProbability(): FactSource;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): FactSource.AsObject;
  static toObject(includeInstance: boolean, msg: FactSource): FactSource.AsObject;
  static serializeBinaryToWriter(message: FactSource, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): FactSource;
  static deserializeBinaryFromReader(message: FactSource, reader: jspb.BinaryReader): FactSource;
}

export namespace FactSource {
  export type AsObject = {
    kind: ava_procedure_v1_procedure_pb.SourceKind,
    name: string,
    field: string,
    argsList: Array<string>,
    question: string,
    guidance: string,
    value: string,
    skipped: string,
    probability?: number,
  }

  export enum ProbabilityCase { 
    _PROBABILITY_NOT_SET = 0,
    PROBABILITY = 9,
  }
}

export class Trace extends jspb.Message {
  getOutputName(): string;
  setOutputName(value: string): Trace;

  getStepsList(): Array<TraceStep>;
  setStepsList(value: Array<TraceStep>): Trace;
  clearStepsList(): Trace;
  addSteps(value?: TraceStep, index?: number): TraceStep;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Trace.AsObject;
  static toObject(includeInstance: boolean, msg: Trace): Trace.AsObject;
  static serializeBinaryToWriter(message: Trace, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Trace;
  static deserializeBinaryFromReader(message: Trace, reader: jspb.BinaryReader): Trace;
}

export namespace Trace {
  export type AsObject = {
    outputName: string,
    stepsList: Array<TraceStep.AsObject>,
  }
}

export class TraceStep extends jspb.Message {
  getStepId(): string;
  setStepId(value: string): TraceStep;

  getBranchId(): string;
  setBranchId(value: string): TraceStep;

  getQuestion(): string;
  setQuestion(value: string): TraceStep;

  getAnswer(): string;
  setAnswer(value: string): TraceStep;

  getEvidence(): Evidence | undefined;
  setEvidence(value?: Evidence): TraceStep;
  hasEvidence(): boolean;
  clearEvidence(): TraceStep;

  getOutputValue(): string;
  setOutputValue(value: string): TraceStep;

  getNextStepId(): string;
  setNextStepId(value: string): TraceStep;

  getReason(): string;
  setReason(value: string): TraceStep;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): TraceStep.AsObject;
  static toObject(includeInstance: boolean, msg: TraceStep): TraceStep.AsObject;
  static serializeBinaryToWriter(message: TraceStep, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): TraceStep;
  static deserializeBinaryFromReader(message: TraceStep, reader: jspb.BinaryReader): TraceStep;
}

export namespace TraceStep {
  export type AsObject = {
    stepId: string,
    branchId: string,
    question: string,
    answer: string,
    evidence?: Evidence.AsObject,
    outputValue: string,
    nextStepId: string,
    reason: string,
  }
}

export class Evidence extends jspb.Message {
  getCel(): string;
  setCel(value: string): Evidence;

  getTestedList(): Array<string>;
  setTestedList(value: Array<string>): Evidence;
  clearTestedList(): Evidence;
  addTested(value: string, index?: number): Evidence;

  getReadMap(): jspb.Map<string, string>;
  clearReadMap(): Evidence;

  getUnknownList(): Array<string>;
  setUnknownList(value: Array<string>): Evidence;
  clearUnknownList(): Evidence;
  addUnknown(value: string, index?: number): Evidence;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Evidence.AsObject;
  static toObject(includeInstance: boolean, msg: Evidence): Evidence.AsObject;
  static serializeBinaryToWriter(message: Evidence, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Evidence;
  static deserializeBinaryFromReader(message: Evidence, reader: jspb.BinaryReader): Evidence;
}

export namespace Evidence {
  export type AsObject = {
    cel: string,
    testedList: Array<string>,
    readMap: Array<[string, string]>,
    unknownList: Array<string>,
  }
}

