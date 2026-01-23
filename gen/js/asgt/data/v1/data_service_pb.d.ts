import * as jspb from 'google-protobuf'

import * as asgt_type_dataset_pb from '../../../asgt/type/dataset_pb'; // proto import: "asgt/type/dataset.proto"
import * as asgt_type_model_pb from '../../../asgt/type/model_pb'; // proto import: "asgt/type/model.proto"
import * as asgt_type_prediction_pb from '../../../asgt/type/prediction_pb'; // proto import: "asgt/type/prediction.proto"
import * as asgt_type_retention_policy_pb from '../../../asgt/type/retention_policy_pb'; // proto import: "asgt/type/retention_policy.proto"
import * as asgt_type_sample_pb from '../../../asgt/type/sample_pb'; // proto import: "asgt/type/sample.proto"
import * as google_api_annotations_pb from '../../../google/api/annotations_pb'; // proto import: "google/api/annotations.proto"
import * as google_protobuf_empty_pb from 'google-protobuf/google/protobuf/empty_pb'; // proto import: "google/protobuf/empty.proto"
import * as google_protobuf_timestamp_pb from 'google-protobuf/google/protobuf/timestamp_pb'; // proto import: "google/protobuf/timestamp.proto"
import * as google_protobuf_wrappers_pb from 'google-protobuf/google/protobuf/wrappers_pb'; // proto import: "google/protobuf/wrappers.proto"
import * as ssn_dataservice_v1_dataservice_pb from '../../../ssn/dataservice/v1/dataservice_pb'; // proto import: "ssn/dataservice/v1/dataservice.proto"


export class CalculateMetricsRequest extends jspb.Message {
  getStartTime(): google_protobuf_timestamp_pb.Timestamp | undefined;
  setStartTime(value?: google_protobuf_timestamp_pb.Timestamp): CalculateMetricsRequest;
  hasStartTime(): boolean;
  clearStartTime(): CalculateMetricsRequest;

  getEndTime(): google_protobuf_timestamp_pb.Timestamp | undefined;
  setEndTime(value?: google_protobuf_timestamp_pb.Timestamp): CalculateMetricsRequest;
  hasEndTime(): boolean;
  clearEndTime(): CalculateMetricsRequest;

  getTagsList(): Array<string>;
  setTagsList(value: Array<string>): CalculateMetricsRequest;
  clearTagsList(): CalculateMetricsRequest;
  addTags(value: string, index?: number): CalculateMetricsRequest;

  getLegacy(): boolean;
  setLegacy(value: boolean): CalculateMetricsRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): CalculateMetricsRequest.AsObject;
  static toObject(includeInstance: boolean, msg: CalculateMetricsRequest): CalculateMetricsRequest.AsObject;
  static serializeBinaryToWriter(message: CalculateMetricsRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): CalculateMetricsRequest;
  static deserializeBinaryFromReader(message: CalculateMetricsRequest, reader: jspb.BinaryReader): CalculateMetricsRequest;
}

export namespace CalculateMetricsRequest {
  export type AsObject = {
    startTime?: google_protobuf_timestamp_pb.Timestamp.AsObject,
    endTime?: google_protobuf_timestamp_pb.Timestamp.AsObject,
    tagsList: Array<string>,
    legacy: boolean,
  }
}

export class CalculateMetricsResponse extends jspb.Message {
  getMetricsList(): Array<CalculateMetricsResponse.MetricRow>;
  setMetricsList(value: Array<CalculateMetricsResponse.MetricRow>): CalculateMetricsResponse;
  clearMetricsList(): CalculateMetricsResponse;
  addMetrics(value?: CalculateMetricsResponse.MetricRow, index?: number): CalculateMetricsResponse.MetricRow;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): CalculateMetricsResponse.AsObject;
  static toObject(includeInstance: boolean, msg: CalculateMetricsResponse): CalculateMetricsResponse.AsObject;
  static serializeBinaryToWriter(message: CalculateMetricsResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): CalculateMetricsResponse;
  static deserializeBinaryFromReader(message: CalculateMetricsResponse, reader: jspb.BinaryReader): CalculateMetricsResponse;
}

export namespace CalculateMetricsResponse {
  export type AsObject = {
    metricsList: Array<CalculateMetricsResponse.MetricRow.AsObject>,
  }

  export class MetricRow extends jspb.Message {
    getTarget(): string;
    setTarget(value: string): MetricRow;

    getConfidence(): google_protobuf_wrappers_pb.FloatValue | undefined;
    setConfidence(value?: google_protobuf_wrappers_pb.FloatValue): MetricRow;
    hasConfidence(): boolean;
    clearConfidence(): MetricRow;

    getCorrect(): number;
    setCorrect(value: number): MetricRow;

    getIncorrect(): number;
    setIncorrect(value: number): MetricRow;

    getConfidenceLevel(): asgt_type_prediction_pb.Confidence | undefined;
    setConfidenceLevel(value?: asgt_type_prediction_pb.Confidence): MetricRow;
    hasConfidenceLevel(): boolean;
    clearConfidenceLevel(): MetricRow;

    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): MetricRow.AsObject;
    static toObject(includeInstance: boolean, msg: MetricRow): MetricRow.AsObject;
    static serializeBinaryToWriter(message: MetricRow, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): MetricRow;
    static deserializeBinaryFromReader(message: MetricRow, reader: jspb.BinaryReader): MetricRow;
  }

  export namespace MetricRow {
    export type AsObject = {
      target: string,
      confidence?: google_protobuf_wrappers_pb.FloatValue.AsObject,
      correct: number,
      incorrect: number,
      confidenceLevel?: asgt_type_prediction_pb.Confidence.AsObject,
    }
  }

}

export class CreateRequest extends jspb.Message {
  getName(): string;
  setName(value: string): CreateRequest;

  getType(): string;
  setType(value: string): CreateRequest;

  getTagsList(): Array<string>;
  setTagsList(value: Array<string>): CreateRequest;
  clearTagsList(): CreateRequest;
  addTags(value: string, index?: number): CreateRequest;

  getTargetsList(): Array<string>;
  setTargetsList(value: Array<string>): CreateRequest;
  clearTargetsList(): CreateRequest;
  addTargets(value: string, index?: number): CreateRequest;

  getSamplesList(): Array<asgt_type_sample_pb.Sample>;
  setSamplesList(value: Array<asgt_type_sample_pb.Sample>): CreateRequest;
  clearSamplesList(): CreateRequest;
  addSamples(value?: asgt_type_sample_pb.Sample, index?: number): asgt_type_sample_pb.Sample;

  getRetentionPolicy(): asgt_type_retention_policy_pb.RetentionPolicy | undefined;
  setRetentionPolicy(value?: asgt_type_retention_policy_pb.RetentionPolicy): CreateRequest;
  hasRetentionPolicy(): boolean;
  clearRetentionPolicy(): CreateRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): CreateRequest.AsObject;
  static toObject(includeInstance: boolean, msg: CreateRequest): CreateRequest.AsObject;
  static serializeBinaryToWriter(message: CreateRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): CreateRequest;
  static deserializeBinaryFromReader(message: CreateRequest, reader: jspb.BinaryReader): CreateRequest;
}

export namespace CreateRequest {
  export type AsObject = {
    name: string,
    type: string,
    tagsList: Array<string>,
    targetsList: Array<string>,
    samplesList: Array<asgt_type_sample_pb.Sample.AsObject>,
    retentionPolicy?: asgt_type_retention_policy_pb.RetentionPolicy.AsObject,
  }
}

export class AppendDataRequest extends jspb.Message {
  getName(): string;
  setName(value: string): AppendDataRequest;

  getType(): string;
  setType(value: string): AppendDataRequest;

  getSamplesList(): Array<asgt_type_sample_pb.Sample>;
  setSamplesList(value: Array<asgt_type_sample_pb.Sample>): AppendDataRequest;
  clearSamplesList(): AppendDataRequest;
  addSamples(value?: asgt_type_sample_pb.Sample, index?: number): asgt_type_sample_pb.Sample;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): AppendDataRequest.AsObject;
  static toObject(includeInstance: boolean, msg: AppendDataRequest): AppendDataRequest.AsObject;
  static serializeBinaryToWriter(message: AppendDataRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): AppendDataRequest;
  static deserializeBinaryFromReader(message: AppendDataRequest, reader: jspb.BinaryReader): AppendDataRequest;
}

export namespace AppendDataRequest {
  export type AsObject = {
    name: string,
    type: string,
    samplesList: Array<asgt_type_sample_pb.Sample.AsObject>,
  }
}

export class DeleteRequest extends jspb.Message {
  getType(): string;
  setType(value: string): DeleteRequest;

  getName(): string;
  setName(value: string): DeleteRequest;

  getTag(): string;
  setTag(value: string): DeleteRequest;

  getMatchCase(): DeleteRequest.MatchCase;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DeleteRequest.AsObject;
  static toObject(includeInstance: boolean, msg: DeleteRequest): DeleteRequest.AsObject;
  static serializeBinaryToWriter(message: DeleteRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DeleteRequest;
  static deserializeBinaryFromReader(message: DeleteRequest, reader: jspb.BinaryReader): DeleteRequest;
}

export namespace DeleteRequest {
  export type AsObject = {
    type: string,
    name: string,
    tag: string,
  }

  export enum MatchCase { 
    MATCH_NOT_SET = 0,
    NAME = 2,
    TAG = 3,
  }
}

export class GetInfoRequest extends jspb.Message {
  getName(): string;
  setName(value: string): GetInfoRequest;

  getType(): string;
  setType(value: string): GetInfoRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetInfoRequest.AsObject;
  static toObject(includeInstance: boolean, msg: GetInfoRequest): GetInfoRequest.AsObject;
  static serializeBinaryToWriter(message: GetInfoRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetInfoRequest;
  static deserializeBinaryFromReader(message: GetInfoRequest, reader: jspb.BinaryReader): GetInfoRequest;
}

export namespace GetInfoRequest {
  export type AsObject = {
    name: string,
    type: string,
  }
}

export class UpdateDatasetRequest extends jspb.Message {
  getName(): string;
  setName(value: string): UpdateDatasetRequest;

  getType(): string;
  setType(value: string): UpdateDatasetRequest;

  getRetentionPolicy(): asgt_type_retention_policy_pb.RetentionPolicy | undefined;
  setRetentionPolicy(value?: asgt_type_retention_policy_pb.RetentionPolicy): UpdateDatasetRequest;
  hasRetentionPolicy(): boolean;
  clearRetentionPolicy(): UpdateDatasetRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): UpdateDatasetRequest.AsObject;
  static toObject(includeInstance: boolean, msg: UpdateDatasetRequest): UpdateDatasetRequest.AsObject;
  static serializeBinaryToWriter(message: UpdateDatasetRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): UpdateDatasetRequest;
  static deserializeBinaryFromReader(message: UpdateDatasetRequest, reader: jspb.BinaryReader): UpdateDatasetRequest;
}

export namespace UpdateDatasetRequest {
  export type AsObject = {
    name: string,
    type: string,
    retentionPolicy?: asgt_type_retention_policy_pb.RetentionPolicy.AsObject,
  }
}

export class GetInfoResponse extends jspb.Message {
  getDataset(): asgt_type_dataset_pb.Dataset | undefined;
  setDataset(value?: asgt_type_dataset_pb.Dataset): GetInfoResponse;
  hasDataset(): boolean;
  clearDataset(): GetInfoResponse;

  getModel(): asgt_type_model_pb.Model | undefined;
  setModel(value?: asgt_type_model_pb.Model): GetInfoResponse;
  hasModel(): boolean;
  clearModel(): GetInfoResponse;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetInfoResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GetInfoResponse): GetInfoResponse.AsObject;
  static serializeBinaryToWriter(message: GetInfoResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetInfoResponse;
  static deserializeBinaryFromReader(message: GetInfoResponse, reader: jspb.BinaryReader): GetInfoResponse;
}

export namespace GetInfoResponse {
  export type AsObject = {
    dataset?: asgt_type_dataset_pb.Dataset.AsObject,
    model?: asgt_type_model_pb.Model.AsObject,
  }
}

export class RegisterQueryStatsRequest extends jspb.Message {
  getDataset(): string;
  setDataset(value: string): RegisterQueryStatsRequest;

  getModelType(): string;
  setModelType(value: string): RegisterQueryStatsRequest;

  getBatchSize(): number;
  setBatchSize(value: number): RegisterQueryStatsRequest;

  getTagsList(): Array<string>;
  setTagsList(value: Array<string>): RegisterQueryStatsRequest;
  clearTagsList(): RegisterQueryStatsRequest;
  addTags(value: string, index?: number): RegisterQueryStatsRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): RegisterQueryStatsRequest.AsObject;
  static toObject(includeInstance: boolean, msg: RegisterQueryStatsRequest): RegisterQueryStatsRequest.AsObject;
  static serializeBinaryToWriter(message: RegisterQueryStatsRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): RegisterQueryStatsRequest;
  static deserializeBinaryFromReader(message: RegisterQueryStatsRequest, reader: jspb.BinaryReader): RegisterQueryStatsRequest;
}

export namespace RegisterQueryStatsRequest {
  export type AsObject = {
    dataset: string,
    modelType: string,
    batchSize: number,
    tagsList: Array<string>,
  }
}

export class CallsPerMonthFilteredMetricRequest extends jspb.Message {
  getMonth(): number;
  setMonth(value: number): CallsPerMonthFilteredMetricRequest;

  getYear(): number;
  setYear(value: number): CallsPerMonthFilteredMetricRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): CallsPerMonthFilteredMetricRequest.AsObject;
  static toObject(includeInstance: boolean, msg: CallsPerMonthFilteredMetricRequest): CallsPerMonthFilteredMetricRequest.AsObject;
  static serializeBinaryToWriter(message: CallsPerMonthFilteredMetricRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): CallsPerMonthFilteredMetricRequest;
  static deserializeBinaryFromReader(message: CallsPerMonthFilteredMetricRequest, reader: jspb.BinaryReader): CallsPerMonthFilteredMetricRequest;
}

export namespace CallsPerMonthFilteredMetricRequest {
  export type AsObject = {
    month: number,
    year: number,
  }
}

