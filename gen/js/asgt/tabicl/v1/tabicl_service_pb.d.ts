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

