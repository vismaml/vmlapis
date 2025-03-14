import * as jspb from 'google-protobuf'

import * as asgt_type_dataset_pb from '../../../asgt/type/dataset_pb'; // proto import: "asgt/type/dataset.proto"
import * as asgt_type_dataset_statistics_pb from '../../../asgt/type/dataset_statistics_pb'; // proto import: "asgt/type/dataset_statistics.proto"
import * as asgt_type_model_pb from '../../../asgt/type/model_pb'; // proto import: "asgt/type/model.proto"
import * as asgt_type_model_type_pb from '../../../asgt/type/model_type_pb'; // proto import: "asgt/type/model_type.proto"
import * as asgt_type_prediction_pb from '../../../asgt/type/prediction_pb'; // proto import: "asgt/type/prediction.proto"
import * as asgt_type_revision_pb from '../../../asgt/type/revision_pb'; // proto import: "asgt/type/revision.proto"
import * as asgt_type_target_metrics_pb from '../../../asgt/type/target_metrics_pb'; // proto import: "asgt/type/target_metrics.proto"
import * as asgt_type_train_statistics_pb from '../../../asgt/type/train_statistics_pb'; // proto import: "asgt/type/train_statistics.proto"
import * as google_protobuf_empty_pb from 'google-protobuf/google/protobuf/empty_pb'; // proto import: "google/protobuf/empty.proto"


export class RegisterModelRequest extends jspb.Message {
  getDataset(): asgt_type_dataset_pb.Dataset | undefined;
  setDataset(value?: asgt_type_dataset_pb.Dataset): RegisterModelRequest;
  hasDataset(): boolean;
  clearDataset(): RegisterModelRequest;

  getRevision(): asgt_type_revision_pb.Revision | undefined;
  setRevision(value?: asgt_type_revision_pb.Revision): RegisterModelRequest;
  hasRevision(): boolean;
  clearRevision(): RegisterModelRequest;

  getModelVersion(): number;
  setModelVersion(value: number): RegisterModelRequest;

  getMetricsMap(): jspb.Map<string, number>;
  clearMetricsMap(): RegisterModelRequest;

  getTargetMetricsList(): Array<asgt_type_target_metrics_pb.TargetMetrics>;
  setTargetMetricsList(value: Array<asgt_type_target_metrics_pb.TargetMetrics>): RegisterModelRequest;
  clearTargetMetricsList(): RegisterModelRequest;
  addTargetMetrics(value?: asgt_type_target_metrics_pb.TargetMetrics, index?: number): asgt_type_target_metrics_pb.TargetMetrics;

  getInputType(): asgt_type_model_pb.Model.InputType;
  setInputType(value: asgt_type_model_pb.Model.InputType): RegisterModelRequest;

  getTrainStatistics(): asgt_type_train_statistics_pb.TrainStatistics | undefined;
  setTrainStatistics(value?: asgt_type_train_statistics_pb.TrainStatistics): RegisterModelRequest;
  hasTrainStatistics(): boolean;
  clearTrainStatistics(): RegisterModelRequest;

  getDatasetStatistics(): asgt_type_dataset_statistics_pb.DatasetStatistics | undefined;
  setDatasetStatistics(value?: asgt_type_dataset_statistics_pb.DatasetStatistics): RegisterModelRequest;
  hasDatasetStatistics(): boolean;
  clearDatasetStatistics(): RegisterModelRequest;

  getTargetToConfidenceThresholdsMap(): jspb.Map<string, asgt_type_model_pb.ConfidenceThresholds>;
  clearTargetToConfidenceThresholdsMap(): RegisterModelRequest;

  getMetricVersion(): string;
  setMetricVersion(value: string): RegisterModelRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): RegisterModelRequest.AsObject;
  static toObject(includeInstance: boolean, msg: RegisterModelRequest): RegisterModelRequest.AsObject;
  static serializeBinaryToWriter(message: RegisterModelRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): RegisterModelRequest;
  static deserializeBinaryFromReader(message: RegisterModelRequest, reader: jspb.BinaryReader): RegisterModelRequest;
}

export namespace RegisterModelRequest {
  export type AsObject = {
    dataset?: asgt_type_dataset_pb.Dataset.AsObject,
    revision?: asgt_type_revision_pb.Revision.AsObject,
    modelVersion: number,
    metricsMap: Array<[string, number]>,
    targetMetricsList: Array<asgt_type_target_metrics_pb.TargetMetrics.AsObject>,
    inputType: asgt_type_model_pb.Model.InputType,
    trainStatistics?: asgt_type_train_statistics_pb.TrainStatistics.AsObject,
    datasetStatistics?: asgt_type_dataset_statistics_pb.DatasetStatistics.AsObject,
    targetToConfidenceThresholdsMap: Array<[string, asgt_type_model_pb.ConfidenceThresholds.AsObject]>,
    metricVersion: string,
  }
}

export class GetCurrentModelRequest extends jspb.Message {
  getDataset(): asgt_type_dataset_pb.Dataset | undefined;
  setDataset(value?: asgt_type_dataset_pb.Dataset): GetCurrentModelRequest;
  hasDataset(): boolean;
  clearDataset(): GetCurrentModelRequest;

  getModelType(): asgt_type_model_type_pb.ModelType;
  setModelType(value: asgt_type_model_type_pb.ModelType): GetCurrentModelRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetCurrentModelRequest.AsObject;
  static toObject(includeInstance: boolean, msg: GetCurrentModelRequest): GetCurrentModelRequest.AsObject;
  static serializeBinaryToWriter(message: GetCurrentModelRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetCurrentModelRequest;
  static deserializeBinaryFromReader(message: GetCurrentModelRequest, reader: jspb.BinaryReader): GetCurrentModelRequest;
}

export namespace GetCurrentModelRequest {
  export type AsObject = {
    dataset?: asgt_type_dataset_pb.Dataset.AsObject,
    modelType: asgt_type_model_type_pb.ModelType,
  }
}

export class GetCurrentModelResponse extends jspb.Message {
  getModel(): asgt_type_model_pb.Model | undefined;
  setModel(value?: asgt_type_model_pb.Model): GetCurrentModelResponse;
  hasModel(): boolean;
  clearModel(): GetCurrentModelResponse;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetCurrentModelResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GetCurrentModelResponse): GetCurrentModelResponse.AsObject;
  static serializeBinaryToWriter(message: GetCurrentModelResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetCurrentModelResponse;
  static deserializeBinaryFromReader(message: GetCurrentModelResponse, reader: jspb.BinaryReader): GetCurrentModelResponse;
}

export namespace GetCurrentModelResponse {
  export type AsObject = {
    model?: asgt_type_model_pb.Model.AsObject,
  }
}

