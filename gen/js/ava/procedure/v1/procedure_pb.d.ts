import * as jspb from 'google-protobuf'



export class Procedure extends jspb.Message {
  getInputs(): InputContract | undefined;
  setInputs(value?: InputContract): Procedure;
  hasInputs(): boolean;
  clearInputs(): Procedure;

  getOutputs(): OutputContract | undefined;
  setOutputs(value?: OutputContract): Procedure;
  hasOutputs(): boolean;
  clearOutputs(): Procedure;

  getSelector(): Selector | undefined;
  setSelector(value?: Selector): Procedure;
  hasSelector(): boolean;
  clearSelector(): Procedure;

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
    inputs?: InputContract.AsObject,
    outputs?: OutputContract.AsObject,
    selector?: Selector.AsObject,
    rootStepId: string,
    stepsList: Array<Step.AsObject>,
  }
}

export class InputContract extends jspb.Message {
  getFactsList(): Array<FactBinding>;
  setFactsList(value: Array<FactBinding>): InputContract;
  clearFactsList(): InputContract;
  addFacts(value?: FactBinding, index?: number): FactBinding;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): InputContract.AsObject;
  static toObject(includeInstance: boolean, msg: InputContract): InputContract.AsObject;
  static serializeBinaryToWriter(message: InputContract, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): InputContract;
  static deserializeBinaryFromReader(message: InputContract, reader: jspb.BinaryReader): InputContract;
}

export namespace InputContract {
  export type AsObject = {
    factsList: Array<FactBinding.AsObject>,
  }
}

export class FactBinding extends jspb.Message {
  getFactName(): string;
  setFactName(value: string): FactBinding;

  getType(): FactType;
  setType(value: FactType): FactBinding;

  getSourcesList(): Array<FactSource>;
  setSourcesList(value: Array<FactSource>): FactBinding;
  clearSourcesList(): FactBinding;
  addSources(value?: FactSource, index?: number): FactSource;

  getOnDisagreement(): Disagreement;
  setOnDisagreement(value: Disagreement): FactBinding;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): FactBinding.AsObject;
  static toObject(includeInstance: boolean, msg: FactBinding): FactBinding.AsObject;
  static serializeBinaryToWriter(message: FactBinding, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): FactBinding;
  static deserializeBinaryFromReader(message: FactBinding, reader: jspb.BinaryReader): FactBinding;
}

export namespace FactBinding {
  export type AsObject = {
    factName: string,
    type: FactType,
    sourcesList: Array<FactSource.AsObject>,
    onDisagreement: Disagreement,
  }
}

export class FactSource extends jspb.Message {
  getFrom(): string;
  setFrom(value: string): FactSource;

  getField(): string;
  setField(value: string): FactSource;

  getArgsList(): Array<string>;
  setArgsList(value: Array<string>): FactSource;
  clearArgsList(): FactSource;
  addArgs(value: string, index?: number): FactSource;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): FactSource.AsObject;
  static toObject(includeInstance: boolean, msg: FactSource): FactSource.AsObject;
  static serializeBinaryToWriter(message: FactSource, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): FactSource;
  static deserializeBinaryFromReader(message: FactSource, reader: jspb.BinaryReader): FactSource;
}

export namespace FactSource {
  export type AsObject = {
    from: string,
    field: string,
    argsList: Array<string>,
  }
}

export class OutputContract extends jspb.Message {
  getProducesList(): Array<string>;
  setProducesList(value: Array<string>): OutputContract;
  clearProducesList(): OutputContract;
  addProduces(value: string, index?: number): OutputContract;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): OutputContract.AsObject;
  static toObject(includeInstance: boolean, msg: OutputContract): OutputContract.AsObject;
  static serializeBinaryToWriter(message: OutputContract, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): OutputContract;
  static deserializeBinaryFromReader(message: OutputContract, reader: jspb.BinaryReader): OutputContract;
}

export namespace OutputContract {
  export type AsObject = {
    producesList: Array<string>,
  }
}

export class Selector extends jspb.Message {
  getCel(): string;
  setCel(value: string): Selector;

  getPriority(): number;
  setPriority(value: number): Selector;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Selector.AsObject;
  static toObject(includeInstance: boolean, msg: Selector): Selector.AsObject;
  static serializeBinaryToWriter(message: Selector, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Selector;
  static deserializeBinaryFromReader(message: Selector, reader: jspb.BinaryReader): Selector;
}

export namespace Selector {
  export type AsObject = {
    cel: string,
    priority: number,
  }
}

export class Step extends jspb.Message {
  getStepId(): string;
  setStepId(value: string): Step;

  getKind(): StepKind;
  setKind(value: StepKind): Step;

  getQuestion(): string;
  setQuestion(value: string): Step;

  getGuidance(): string;
  setGuidance(value: string): Step;

  getJudgment(): Judgment | undefined;
  setJudgment(value?: Judgment): Step;
  hasJudgment(): boolean;
  clearJudgment(): Step;

  getBranchesList(): Array<Branch>;
  setBranchesList(value: Array<Branch>): Step;
  clearBranchesList(): Step;
  addBranches(value?: Branch, index?: number): Branch;

  getOrigin(): Origin;
  setOrigin(value: Origin): Step;

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
    kind: StepKind,
    question: string,
    guidance: string,
    judgment?: Judgment.AsObject,
    branchesList: Array<Branch.AsObject>,
    origin: Origin,
  }
}

export class Judgment extends jspb.Message {
  getPromptRef(): string;
  setPromptRef(value: string): Judgment;

  getRequiresSpan(): boolean;
  setRequiresSpan(value: boolean): Judgment;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Judgment.AsObject;
  static toObject(includeInstance: boolean, msg: Judgment): Judgment.AsObject;
  static serializeBinaryToWriter(message: Judgment, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Judgment;
  static deserializeBinaryFromReader(message: Judgment, reader: jspb.BinaryReader): Judgment;
}

export namespace Judgment {
  export type AsObject = {
    promptRef: string,
    requiresSpan: boolean,
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

  getSetsMap(): jspb.Map<string, string>;
  clearSetsMap(): Branch;

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
    setsMap: Array<[string, string]>,
    nextStepId: string,
    isEscalation: boolean,
    rationale: string,
  }
}

export enum Disagreement { 
  DISAGREEMENT_UNSPECIFIED = 0,
  DISAGREEMENT_UNKNOWN = 1,
  DISAGREEMENT_FIRST_WINS = 2,
}
export enum FactType { 
  FACT_TYPE_UNSPECIFIED = 0,
  FACT_TYPE_STRING = 1,
  FACT_TYPE_MONEY = 2,
  FACT_TYPE_DATE = 3,
  FACT_TYPE_BOOL = 4,
  FACT_TYPE_INT = 5,
}
export enum StepKind { 
  STEP_KIND_UNSPECIFIED = 0,
  STEP_KIND_TEST = 1,
  STEP_KIND_JUDGMENT = 2,
}
export enum Origin { 
  ORIGIN_UNSPECIFIED = 0,
  ORIGIN_MINED = 1,
  ORIGIN_HUMAN = 2,
}
