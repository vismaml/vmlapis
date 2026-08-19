import * as jspb from 'google-protobuf'

import * as asgt_type_data_pb from '../../../asgt/type/data_pb'; // proto import: "asgt/type/data.proto"
import * as asgt_type_prediction_pb from '../../../asgt/type/prediction_pb'; // proto import: "asgt/type/prediction.proto"
import * as validate_validate_pb from '../../../validate/validate_pb'; // proto import: "validate/validate.proto"


export class SuggestRequest extends jspb.Message {
  getDatasetName(): string;
  setDatasetName(value: string): SuggestRequest;

  getConsumerName(): string;
  setConsumerName(value: string): SuggestRequest;

  getInputsList(): Array<asgt_type_data_pb.Data>;
  setInputsList(value: Array<asgt_type_data_pb.Data>): SuggestRequest;
  clearInputsList(): SuggestRequest;
  addInputs(value?: asgt_type_data_pb.Data, index?: number): asgt_type_data_pb.Data;

  getSuggestLimit(): number;
  setSuggestLimit(value: number): SuggestRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): SuggestRequest.AsObject;
  static toObject(includeInstance: boolean, msg: SuggestRequest): SuggestRequest.AsObject;
  static serializeBinaryToWriter(message: SuggestRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): SuggestRequest;
  static deserializeBinaryFromReader(message: SuggestRequest, reader: jspb.BinaryReader): SuggestRequest;
}

export namespace SuggestRequest {
  export type AsObject = {
    datasetName: string,
    consumerName: string,
    inputsList: Array<asgt_type_data_pb.Data.AsObject>,
    suggestLimit: number,
  }
}

export class SuggestResponse extends jspb.Message {
  getPredictionsList(): Array<asgt_type_prediction_pb.Prediction>;
  setPredictionsList(value: Array<asgt_type_prediction_pb.Prediction>): SuggestResponse;
  clearPredictionsList(): SuggestResponse;
  addPredictions(value?: asgt_type_prediction_pb.Prediction, index?: number): asgt_type_prediction_pb.Prediction;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): SuggestResponse.AsObject;
  static toObject(includeInstance: boolean, msg: SuggestResponse): SuggestResponse.AsObject;
  static serializeBinaryToWriter(message: SuggestResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): SuggestResponse;
  static deserializeBinaryFromReader(message: SuggestResponse, reader: jspb.BinaryReader): SuggestResponse;
}

export namespace SuggestResponse {
  export type AsObject = {
    predictionsList: Array<asgt_type_prediction_pb.Prediction.AsObject>,
  }
}

