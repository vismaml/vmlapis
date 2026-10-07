import * as jspb from 'google-protobuf'

import * as asgt_type_data_pb from '../../../asgt/type/data_pb'; // proto import: "asgt/type/data.proto"
import * as asgt_type_prediction_pb from '../../../asgt/type/prediction_pb'; // proto import: "asgt/type/prediction.proto"
import * as validate_validate_pb from '../../../validate/validate_pb'; // proto import: "validate/validate.proto"


export class BatchSuggestRequest extends jspb.Message {
  getDatasetName(): string;
  setDatasetName(value: string): BatchSuggestRequest;

  getConsumerName(): string;
  setConsumerName(value: string): BatchSuggestRequest;

  getInputsList(): Array<asgt_type_data_pb.Data>;
  setInputsList(value: Array<asgt_type_data_pb.Data>): BatchSuggestRequest;
  clearInputsList(): BatchSuggestRequest;
  addInputs(value?: asgt_type_data_pb.Data, index?: number): asgt_type_data_pb.Data;

  getSuggestLimit(): number;
  setSuggestLimit(value: number): BatchSuggestRequest;

  getTargetClassCountsMap(): jspb.Map<string, number>;
  clearTargetClassCountsMap(): BatchSuggestRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): BatchSuggestRequest.AsObject;
  static toObject(includeInstance: boolean, msg: BatchSuggestRequest): BatchSuggestRequest.AsObject;
  static serializeBinaryToWriter(message: BatchSuggestRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): BatchSuggestRequest;
  static deserializeBinaryFromReader(message: BatchSuggestRequest, reader: jspb.BinaryReader): BatchSuggestRequest;
}

export namespace BatchSuggestRequest {
  export type AsObject = {
    datasetName: string,
    consumerName: string,
    inputsList: Array<asgt_type_data_pb.Data.AsObject>,
    suggestLimit: number,
    targetClassCountsMap: Array<[string, number]>,
  }
}

export class BatchSuggestResponse extends jspb.Message {
  getPredictionsList(): Array<asgt_type_prediction_pb.Prediction>;
  setPredictionsList(value: Array<asgt_type_prediction_pb.Prediction>): BatchSuggestResponse;
  clearPredictionsList(): BatchSuggestResponse;
  addPredictions(value?: asgt_type_prediction_pb.Prediction, index?: number): asgt_type_prediction_pb.Prediction;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): BatchSuggestResponse.AsObject;
  static toObject(includeInstance: boolean, msg: BatchSuggestResponse): BatchSuggestResponse.AsObject;
  static serializeBinaryToWriter(message: BatchSuggestResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): BatchSuggestResponse;
  static deserializeBinaryFromReader(message: BatchSuggestResponse, reader: jspb.BinaryReader): BatchSuggestResponse;
}

export namespace BatchSuggestResponse {
  export type AsObject = {
    predictionsList: Array<asgt_type_prediction_pb.Prediction.AsObject>,
  }
}

export class ExampleLogits extends jspb.Message {
  getExampleId(): string;
  setExampleId(value: string): ExampleLogits;

  getLogitsList(): Array<number>;
  setLogitsList(value: Array<number>): ExampleLogits;
  clearLogitsList(): ExampleLogits;
  addLogits(value: number, index?: number): ExampleLogits;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ExampleLogits.AsObject;
  static toObject(includeInstance: boolean, msg: ExampleLogits): ExampleLogits.AsObject;
  static serializeBinaryToWriter(message: ExampleLogits, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ExampleLogits;
  static deserializeBinaryFromReader(message: ExampleLogits, reader: jspb.BinaryReader): ExampleLogits;
}

export namespace ExampleLogits {
  export type AsObject = {
    exampleId: string,
    logitsList: Array<number>,
  }
}

export class BatchSuggestWithLogitsRequest extends jspb.Message {
  getExamplesList(): Array<ExampleLogits>;
  setExamplesList(value: Array<ExampleLogits>): BatchSuggestWithLogitsRequest;
  clearExamplesList(): BatchSuggestWithLogitsRequest;
  addExamples(value?: ExampleLogits, index?: number): ExampleLogits;

  getSuggestLimit(): number;
  setSuggestLimit(value: number): BatchSuggestWithLogitsRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): BatchSuggestWithLogitsRequest.AsObject;
  static toObject(includeInstance: boolean, msg: BatchSuggestWithLogitsRequest): BatchSuggestWithLogitsRequest.AsObject;
  static serializeBinaryToWriter(message: BatchSuggestWithLogitsRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): BatchSuggestWithLogitsRequest;
  static deserializeBinaryFromReader(message: BatchSuggestWithLogitsRequest, reader: jspb.BinaryReader): BatchSuggestWithLogitsRequest;
}

export namespace BatchSuggestWithLogitsRequest {
  export type AsObject = {
    examplesList: Array<ExampleLogits.AsObject>,
    suggestLimit: number,
  }
}

