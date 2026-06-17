import * as jspb from 'google-protobuf'



export class InferParameter extends jspb.Message {
  getBoolParam(): boolean;
  setBoolParam(value: boolean): InferParameter;

  getInt64Param(): number;
  setInt64Param(value: number): InferParameter;

  getStringParam(): string;
  setStringParam(value: string): InferParameter;

  getDoubleParam(): number;
  setDoubleParam(value: number): InferParameter;

  getUint64Param(): number;
  setUint64Param(value: number): InferParameter;

  getParameterChoiceCase(): InferParameter.ParameterChoiceCase;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): InferParameter.AsObject;
  static toObject(includeInstance: boolean, msg: InferParameter): InferParameter.AsObject;
  static serializeBinaryToWriter(message: InferParameter, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): InferParameter;
  static deserializeBinaryFromReader(message: InferParameter, reader: jspb.BinaryReader): InferParameter;
}

export namespace InferParameter {
  export type AsObject = {
    boolParam: boolean,
    int64Param: number,
    stringParam: string,
    doubleParam: number,
    uint64Param: number,
  }

  export enum ParameterChoiceCase { 
    PARAMETER_CHOICE_NOT_SET = 0,
    BOOL_PARAM = 1,
    INT64_PARAM = 2,
    STRING_PARAM = 3,
    DOUBLE_PARAM = 4,
    UINT64_PARAM = 5,
  }
}

export class InferTensorContents extends jspb.Message {
  getBoolContentsList(): Array<boolean>;
  setBoolContentsList(value: Array<boolean>): InferTensorContents;
  clearBoolContentsList(): InferTensorContents;
  addBoolContents(value: boolean, index?: number): InferTensorContents;

  getIntContentsList(): Array<number>;
  setIntContentsList(value: Array<number>): InferTensorContents;
  clearIntContentsList(): InferTensorContents;
  addIntContents(value: number, index?: number): InferTensorContents;

  getInt64ContentsList(): Array<number>;
  setInt64ContentsList(value: Array<number>): InferTensorContents;
  clearInt64ContentsList(): InferTensorContents;
  addInt64Contents(value: number, index?: number): InferTensorContents;

  getUintContentsList(): Array<number>;
  setUintContentsList(value: Array<number>): InferTensorContents;
  clearUintContentsList(): InferTensorContents;
  addUintContents(value: number, index?: number): InferTensorContents;

  getUint64ContentsList(): Array<number>;
  setUint64ContentsList(value: Array<number>): InferTensorContents;
  clearUint64ContentsList(): InferTensorContents;
  addUint64Contents(value: number, index?: number): InferTensorContents;

  getFp32ContentsList(): Array<number>;
  setFp32ContentsList(value: Array<number>): InferTensorContents;
  clearFp32ContentsList(): InferTensorContents;
  addFp32Contents(value: number, index?: number): InferTensorContents;

  getFp64ContentsList(): Array<number>;
  setFp64ContentsList(value: Array<number>): InferTensorContents;
  clearFp64ContentsList(): InferTensorContents;
  addFp64Contents(value: number, index?: number): InferTensorContents;

  getBytesContentsList(): Array<Uint8Array | string>;
  setBytesContentsList(value: Array<Uint8Array | string>): InferTensorContents;
  clearBytesContentsList(): InferTensorContents;
  addBytesContents(value: Uint8Array | string, index?: number): InferTensorContents;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): InferTensorContents.AsObject;
  static toObject(includeInstance: boolean, msg: InferTensorContents): InferTensorContents.AsObject;
  static serializeBinaryToWriter(message: InferTensorContents, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): InferTensorContents;
  static deserializeBinaryFromReader(message: InferTensorContents, reader: jspb.BinaryReader): InferTensorContents;
}

export namespace InferTensorContents {
  export type AsObject = {
    boolContentsList: Array<boolean>,
    intContentsList: Array<number>,
    int64ContentsList: Array<number>,
    uintContentsList: Array<number>,
    uint64ContentsList: Array<number>,
    fp32ContentsList: Array<number>,
    fp64ContentsList: Array<number>,
    bytesContentsList: Array<Uint8Array | string>,
  }
}

export class ModelInferRequest extends jspb.Message {
  getModelName(): string;
  setModelName(value: string): ModelInferRequest;

  getModelVersion(): string;
  setModelVersion(value: string): ModelInferRequest;

  getId(): string;
  setId(value: string): ModelInferRequest;

  getParametersMap(): jspb.Map<string, InferParameter>;
  clearParametersMap(): ModelInferRequest;

  getInputsList(): Array<ModelInferRequest.InferInputTensor>;
  setInputsList(value: Array<ModelInferRequest.InferInputTensor>): ModelInferRequest;
  clearInputsList(): ModelInferRequest;
  addInputs(value?: ModelInferRequest.InferInputTensor, index?: number): ModelInferRequest.InferInputTensor;

  getOutputsList(): Array<ModelInferRequest.InferRequestedOutputTensor>;
  setOutputsList(value: Array<ModelInferRequest.InferRequestedOutputTensor>): ModelInferRequest;
  clearOutputsList(): ModelInferRequest;
  addOutputs(value?: ModelInferRequest.InferRequestedOutputTensor, index?: number): ModelInferRequest.InferRequestedOutputTensor;

  getRawInputContentsList(): Array<Uint8Array | string>;
  setRawInputContentsList(value: Array<Uint8Array | string>): ModelInferRequest;
  clearRawInputContentsList(): ModelInferRequest;
  addRawInputContents(value: Uint8Array | string, index?: number): ModelInferRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ModelInferRequest.AsObject;
  static toObject(includeInstance: boolean, msg: ModelInferRequest): ModelInferRequest.AsObject;
  static serializeBinaryToWriter(message: ModelInferRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ModelInferRequest;
  static deserializeBinaryFromReader(message: ModelInferRequest, reader: jspb.BinaryReader): ModelInferRequest;
}

export namespace ModelInferRequest {
  export type AsObject = {
    modelName: string,
    modelVersion: string,
    id: string,
    parametersMap: Array<[string, InferParameter.AsObject]>,
    inputsList: Array<ModelInferRequest.InferInputTensor.AsObject>,
    outputsList: Array<ModelInferRequest.InferRequestedOutputTensor.AsObject>,
    rawInputContentsList: Array<Uint8Array | string>,
  }

  export class InferInputTensor extends jspb.Message {
    getName(): string;
    setName(value: string): InferInputTensor;

    getDatatype(): string;
    setDatatype(value: string): InferInputTensor;

    getShapeList(): Array<number>;
    setShapeList(value: Array<number>): InferInputTensor;
    clearShapeList(): InferInputTensor;
    addShape(value: number, index?: number): InferInputTensor;

    getParametersMap(): jspb.Map<string, InferParameter>;
    clearParametersMap(): InferInputTensor;

    getContents(): InferTensorContents | undefined;
    setContents(value?: InferTensorContents): InferInputTensor;
    hasContents(): boolean;
    clearContents(): InferInputTensor;

    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): InferInputTensor.AsObject;
    static toObject(includeInstance: boolean, msg: InferInputTensor): InferInputTensor.AsObject;
    static serializeBinaryToWriter(message: InferInputTensor, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): InferInputTensor;
    static deserializeBinaryFromReader(message: InferInputTensor, reader: jspb.BinaryReader): InferInputTensor;
  }

  export namespace InferInputTensor {
    export type AsObject = {
      name: string,
      datatype: string,
      shapeList: Array<number>,
      parametersMap: Array<[string, InferParameter.AsObject]>,
      contents?: InferTensorContents.AsObject,
    }
  }


  export class InferRequestedOutputTensor extends jspb.Message {
    getName(): string;
    setName(value: string): InferRequestedOutputTensor;

    getParametersMap(): jspb.Map<string, InferParameter>;
    clearParametersMap(): InferRequestedOutputTensor;

    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): InferRequestedOutputTensor.AsObject;
    static toObject(includeInstance: boolean, msg: InferRequestedOutputTensor): InferRequestedOutputTensor.AsObject;
    static serializeBinaryToWriter(message: InferRequestedOutputTensor, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): InferRequestedOutputTensor;
    static deserializeBinaryFromReader(message: InferRequestedOutputTensor, reader: jspb.BinaryReader): InferRequestedOutputTensor;
  }

  export namespace InferRequestedOutputTensor {
    export type AsObject = {
      name: string,
      parametersMap: Array<[string, InferParameter.AsObject]>,
    }
  }

}

export class ModelInferResponse extends jspb.Message {
  getModelName(): string;
  setModelName(value: string): ModelInferResponse;

  getModelVersion(): string;
  setModelVersion(value: string): ModelInferResponse;

  getId(): string;
  setId(value: string): ModelInferResponse;

  getParametersMap(): jspb.Map<string, InferParameter>;
  clearParametersMap(): ModelInferResponse;

  getOutputsList(): Array<ModelInferResponse.InferOutputTensor>;
  setOutputsList(value: Array<ModelInferResponse.InferOutputTensor>): ModelInferResponse;
  clearOutputsList(): ModelInferResponse;
  addOutputs(value?: ModelInferResponse.InferOutputTensor, index?: number): ModelInferResponse.InferOutputTensor;

  getRawOutputContentsList(): Array<Uint8Array | string>;
  setRawOutputContentsList(value: Array<Uint8Array | string>): ModelInferResponse;
  clearRawOutputContentsList(): ModelInferResponse;
  addRawOutputContents(value: Uint8Array | string, index?: number): ModelInferResponse;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ModelInferResponse.AsObject;
  static toObject(includeInstance: boolean, msg: ModelInferResponse): ModelInferResponse.AsObject;
  static serializeBinaryToWriter(message: ModelInferResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ModelInferResponse;
  static deserializeBinaryFromReader(message: ModelInferResponse, reader: jspb.BinaryReader): ModelInferResponse;
}

export namespace ModelInferResponse {
  export type AsObject = {
    modelName: string,
    modelVersion: string,
    id: string,
    parametersMap: Array<[string, InferParameter.AsObject]>,
    outputsList: Array<ModelInferResponse.InferOutputTensor.AsObject>,
    rawOutputContentsList: Array<Uint8Array | string>,
  }

  export class InferOutputTensor extends jspb.Message {
    getName(): string;
    setName(value: string): InferOutputTensor;

    getDatatype(): string;
    setDatatype(value: string): InferOutputTensor;

    getShapeList(): Array<number>;
    setShapeList(value: Array<number>): InferOutputTensor;
    clearShapeList(): InferOutputTensor;
    addShape(value: number, index?: number): InferOutputTensor;

    getParametersMap(): jspb.Map<string, InferParameter>;
    clearParametersMap(): InferOutputTensor;

    getContents(): InferTensorContents | undefined;
    setContents(value?: InferTensorContents): InferOutputTensor;
    hasContents(): boolean;
    clearContents(): InferOutputTensor;

    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): InferOutputTensor.AsObject;
    static toObject(includeInstance: boolean, msg: InferOutputTensor): InferOutputTensor.AsObject;
    static serializeBinaryToWriter(message: InferOutputTensor, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): InferOutputTensor;
    static deserializeBinaryFromReader(message: InferOutputTensor, reader: jspb.BinaryReader): InferOutputTensor;
  }

  export namespace InferOutputTensor {
    export type AsObject = {
      name: string,
      datatype: string,
      shapeList: Array<number>,
      parametersMap: Array<[string, InferParameter.AsObject]>,
      contents?: InferTensorContents.AsObject,
    }
  }

}

