import * as jspb from 'google-protobuf'



export class Procedure extends jspb.Message {
  getFactsList(): Array<Fact>;
  setFactsList(value: Array<Fact>): Procedure;
  clearFactsList(): Procedure;
  addFacts(value?: Fact, index?: number): Fact;

  getProduces(): string;
  setProduces(value: string): Procedure;

  getRootStepId(): string;
  setRootStepId(value: string): Procedure;

  getStepsList(): Array<Step>;
  setStepsList(value: Array<Step>): Procedure;
  clearStepsList(): Procedure;
  addSteps(value?: Step, index?: number): Step;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Procedure.AsObject;
  static toObject(includeInstance: boolean, msg: Procedure): Procedure.AsObject;
  static serializeBinaryToWriter(message: Procedure, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Procedure;
  static deserializeBinaryFromReader(message: Procedure, reader: jspb.BinaryReader): Procedure;
}

export namespace Procedure {
  export type AsObject = {
    factsList: Array<Fact.AsObject>,
    produces: string,
    rootStepId: string,
    stepsList: Array<Step.AsObject>,
  }
}

export class Fact extends jspb.Message {
  getName(): string;
  setName(value: string): Fact;

  getType(): FactType;
  setType(value: FactType): Fact;

  getPermittedList(): Array<string>;
  setPermittedList(value: Array<string>): Fact;
  clearPermittedList(): Fact;
  addPermitted(value: string, index?: number): Fact;

  getSourcesList(): Array<FactSource>;
  setSourcesList(value: Array<FactSource>): Fact;
  clearSourcesList(): Fact;
  addSources(value?: FactSource, index?: number): FactSource;

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
    type: FactType,
    permittedList: Array<string>,
    sourcesList: Array<FactSource.AsObject>,
  }
}

export class FactSource extends jspb.Message {
  getKind(): SourceKind;
  setKind(value: SourceKind): FactSource;

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

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): FactSource.AsObject;
  static toObject(includeInstance: boolean, msg: FactSource): FactSource.AsObject;
  static serializeBinaryToWriter(message: FactSource, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): FactSource;
  static deserializeBinaryFromReader(message: FactSource, reader: jspb.BinaryReader): FactSource;
}

export namespace FactSource {
  export type AsObject = {
    kind: SourceKind,
    name: string,
    field: string,
    argsList: Array<string>,
    question: string,
    guidance: string,
  }
}

export class Step extends jspb.Message {
  getStepId(): string;
  setStepId(value: string): Step;

  getQuestion(): string;
  setQuestion(value: string): Step;

  getGuidance(): string;
  setGuidance(value: string): Step;

  getBranchesList(): Array<Branch>;
  setBranchesList(value: Array<Branch>): Step;
  clearBranchesList(): Step;
  addBranches(value?: Branch, index?: number): Branch;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Step.AsObject;
  static toObject(includeInstance: boolean, msg: Step): Step.AsObject;
  static serializeBinaryToWriter(message: Step, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Step;
  static deserializeBinaryFromReader(message: Step, reader: jspb.BinaryReader): Step;
}

export namespace Step {
  export type AsObject = {
    stepId: string,
    question: string,
    guidance: string,
    branchesList: Array<Branch.AsObject>,
  }
}

export class Branch extends jspb.Message {
  getBranchId(): string;
  setBranchId(value: string): Branch;

  getLabel(): string;
  setLabel(value: string): Branch;

  getCriterion(): string;
  setCriterion(value: string): Branch;

  getWhen(): string;
  setWhen(value: string): Branch;

  getOutputValue(): string;
  setOutputValue(value: string): Branch;

  getNextStepId(): string;
  setNextStepId(value: string): Branch;

  getIsEscalation(): boolean;
  setIsEscalation(value: boolean): Branch;

  getRationale(): string;
  setRationale(value: string): Branch;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Branch.AsObject;
  static toObject(includeInstance: boolean, msg: Branch): Branch.AsObject;
  static serializeBinaryToWriter(message: Branch, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Branch;
  static deserializeBinaryFromReader(message: Branch, reader: jspb.BinaryReader): Branch;
}

export namespace Branch {
  export type AsObject = {
    branchId: string,
    label: string,
    criterion: string,
    when: string,
    outputValue: string,
    nextStepId: string,
    isEscalation: boolean,
    rationale: string,
  }
}

export enum SourceKind { 
  SOURCE_KIND_UNSPECIFIED = 0,
  SOURCE_KIND_CASE = 1,
  SOURCE_KIND_DERIVED = 2,
  SOURCE_KIND_INFERRED = 3,
}
export enum FactType { 
  FACT_TYPE_UNSPECIFIED = 0,
  FACT_TYPE_STRING = 1,
  FACT_TYPE_FLOAT = 2,
  FACT_TYPE_DATE = 3,
  FACT_TYPE_BOOL = 4,
  FACT_TYPE_INT = 5,
  FACT_TYPE_ENUM = 6,
}
