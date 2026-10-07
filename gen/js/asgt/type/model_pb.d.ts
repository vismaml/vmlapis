import * as jspb from 'google-protobuf'

import * as asgt_type_model_file_pb from '../../asgt/type/model_file_pb'; // proto import: "asgt/type/model_file.proto"
import * as asgt_type_prediction_pb from '../../asgt/type/prediction_pb'; // proto import: "asgt/type/prediction.proto"
import * as asgt_type_target_metrics_pb from '../../asgt/type/target_metrics_pb'; // proto import: "asgt/type/target_metrics.proto"
import * as gen_bq_schema_bq_field_pb from '../../gen_bq_schema/bq_field_pb'; // proto import: "gen_bq_schema/bq_field.proto"
import * as google_protobuf_timestamp_pb from 'google-protobuf/google/protobuf/timestamp_pb'; // proto import: "google/protobuf/timestamp.proto"


export class Model extends jspb.Message {
  getVersion(): number;
  setVersion(value: number): Model;

  getCreatedAt(): google_protobuf_timestamp_pb.Timestamp | undefined;
  setCreatedAt(value?: google_protobuf_timestamp_pb.Timestamp): Model;
  hasCreatedAt(): boolean;
  clearCreatedAt(): Model;

  getDatasetSize(): number;
  setDatasetSize(value: number): Model;

  getTrainingSize(): number;
  setTrainingSize(value: number): Model;

  getConfidenceScoresList(): Array<asgt_type_target_metrics_pb.TargetMetrics>;
  setConfidenceScoresList(value: Array<asgt_type_target_metrics_pb.TargetMetrics>): Model;
  clearConfidenceScoresList(): Model;
  addConfidenceScores(value?: asgt_type_target_metrics_pb.TargetMetrics, index?: number): asgt_type_target_metrics_pb.TargetMetrics;

  getInputType(): Model.InputType;
  setInputType(value: Model.InputType): Model;

  getDatasetType(): string;
  setDatasetType(value: string): Model;

  getModelFilesList(): Array<asgt_type_model_file_pb.ModelFile>;
  setModelFilesList(value: Array<asgt_type_model_file_pb.ModelFile>): Model;
  clearModelFilesList(): Model;
  addModelFiles(value?: asgt_type_model_file_pb.ModelFile, index?: number): asgt_type_model_file_pb.ModelFile;

  getTargetToConfidenceThresholdsMap(): jspb.Map<string, ConfidenceThresholds>;
  clearTargetToConfidenceThresholdsMap(): Model;

  getTargetToClassCountMap(): jspb.Map<string, number>;
  clearTargetToClassCountMap(): Model;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Model.AsObject;
  static toObject(includeInstance: boolean, msg: Model): Model.AsObject;
  static serializeBinaryToWriter(message: Model, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Model;
  static deserializeBinaryFromReader(message: Model, reader: jspb.BinaryReader): Model;
}

export namespace Model {
  export type AsObject = {
    version: number,
    createdAt?: google_protobuf_timestamp_pb.Timestamp.AsObject,
    datasetSize: number,
    trainingSize: number,
    confidenceScoresList: Array<asgt_type_target_metrics_pb.TargetMetrics.AsObject>,
    inputType: Model.InputType,
    datasetType: string,
    modelFilesList: Array<asgt_type_model_file_pb.ModelFile.AsObject>,
    targetToConfidenceThresholdsMap: Array<[string, ConfidenceThresholds.AsObject]>,
    targetToClassCountMap: Array<[string, number]>,
  }

  export enum InputType { 
    FEATURE_TENSORS = 0,
    EXAMPLE_TENSOR = 1,
  }
}

export class ConfidenceThresholds extends jspb.Message {
  getConfidenceThresholdsList(): Array<asgt_type_prediction_pb.Confidence>;
  setConfidenceThresholdsList(value: Array<asgt_type_prediction_pb.Confidence>): ConfidenceThresholds;
  clearConfidenceThresholdsList(): ConfidenceThresholds;
  addConfidenceThresholds(value?: asgt_type_prediction_pb.Confidence, index?: number): asgt_type_prediction_pb.Confidence;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ConfidenceThresholds.AsObject;
  static toObject(includeInstance: boolean, msg: ConfidenceThresholds): ConfidenceThresholds.AsObject;
  static serializeBinaryToWriter(message: ConfidenceThresholds, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ConfidenceThresholds;
  static deserializeBinaryFromReader(message: ConfidenceThresholds, reader: jspb.BinaryReader): ConfidenceThresholds;
}

export namespace ConfidenceThresholds {
  export type AsObject = {
    confidenceThresholdsList: Array<asgt_type_prediction_pb.Confidence.AsObject>,
  }
}

