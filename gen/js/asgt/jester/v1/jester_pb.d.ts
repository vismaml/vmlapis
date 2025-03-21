import * as jspb from 'google-protobuf'

import * as asgt_type_data_pb from '../../../asgt/type/data_pb'; // proto import: "asgt/type/data.proto"
import * as asgt_type_model_pb from '../../../asgt/type/model_pb'; // proto import: "asgt/type/model.proto"
import * as asgt_type_model_type_pb from '../../../asgt/type/model_type_pb'; // proto import: "asgt/type/model_type.proto"
import * as asgt_type_prediction_pb from '../../../asgt/type/prediction_pb'; // proto import: "asgt/type/prediction.proto"
import * as google_api_annotations_pb from '../../../google/api/annotations_pb'; // proto import: "google/api/annotations.proto"
import * as protoc$gen$openapiv2_options_annotations_pb from '../../../protoc-gen-openapiv2/options/annotations_pb'; // proto import: "protoc-gen-openapiv2/options/annotations.proto"


export class SuggestionResponse extends jspb.Message {
  getPredictionsList(): Array<asgt_type_prediction_pb.Prediction>;
  setPredictionsList(value: Array<asgt_type_prediction_pb.Prediction>): SuggestionResponse;
  clearPredictionsList(): SuggestionResponse;
  addPredictions(value?: asgt_type_prediction_pb.Prediction, index?: number): asgt_type_prediction_pb.Prediction;

  getModel(): asgt_type_model_pb.Model | undefined;
  setModel(value?: asgt_type_model_pb.Model): SuggestionResponse;
  hasModel(): boolean;
  clearModel(): SuggestionResponse;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): SuggestionResponse.AsObject;
  static toObject(includeInstance: boolean, msg: SuggestionResponse): SuggestionResponse.AsObject;
  static serializeBinaryToWriter(message: SuggestionResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): SuggestionResponse;
  static deserializeBinaryFromReader(message: SuggestionResponse, reader: jspb.BinaryReader): SuggestionResponse;
}

export namespace SuggestionResponse {
  export type AsObject = {
    predictionsList: Array<asgt_type_prediction_pb.Prediction.AsObject>,
    model?: asgt_type_model_pb.Model.AsObject,
  }
}

export class SuggestionOptions extends jspb.Message {
  getSuggestionLimit(): number;
  setSuggestionLimit(value: number): SuggestionOptions;

  getMinConfidence(): asgt_type_prediction_pb.Confidence.Level;
  setMinConfidence(value: asgt_type_prediction_pb.Confidence.Level): SuggestionOptions;

  getModelType(): asgt_type_model_type_pb.ModelType;
  setModelType(value: asgt_type_model_type_pb.ModelType): SuggestionOptions;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): SuggestionOptions.AsObject;
  static toObject(includeInstance: boolean, msg: SuggestionOptions): SuggestionOptions.AsObject;
  static serializeBinaryToWriter(message: SuggestionOptions, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): SuggestionOptions;
  static deserializeBinaryFromReader(message: SuggestionOptions, reader: jspb.BinaryReader): SuggestionOptions;
}

export namespace SuggestionOptions {
  export type AsObject = {
    suggestionLimit: number,
    minConfidence: asgt_type_prediction_pb.Confidence.Level,
    modelType: asgt_type_model_type_pb.ModelType,
  }
}

export class SuggestionRequest extends jspb.Message {
  getName(): string;
  setName(value: string): SuggestionRequest;

  getType(): string;
  setType(value: string): SuggestionRequest;

  getInputsList(): Array<asgt_type_data_pb.Data>;
  setInputsList(value: Array<asgt_type_data_pb.Data>): SuggestionRequest;
  clearInputsList(): SuggestionRequest;
  addInputs(value?: asgt_type_data_pb.Data, index?: number): asgt_type_data_pb.Data;

  getOptions(): SuggestionOptions | undefined;
  setOptions(value?: SuggestionOptions): SuggestionRequest;
  hasOptions(): boolean;
  clearOptions(): SuggestionRequest;

  getTagsList(): Array<string>;
  setTagsList(value: Array<string>): SuggestionRequest;
  clearTagsList(): SuggestionRequest;
  addTags(value: string, index?: number): SuggestionRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): SuggestionRequest.AsObject;
  static toObject(includeInstance: boolean, msg: SuggestionRequest): SuggestionRequest.AsObject;
  static serializeBinaryToWriter(message: SuggestionRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): SuggestionRequest;
  static deserializeBinaryFromReader(message: SuggestionRequest, reader: jspb.BinaryReader): SuggestionRequest;
}

export namespace SuggestionRequest {
  export type AsObject = {
    name: string,
    type: string,
    inputsList: Array<asgt_type_data_pb.Data.AsObject>,
    options?: SuggestionOptions.AsObject,
    tagsList: Array<string>,
  }
}

