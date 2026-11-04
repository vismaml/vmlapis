import * as jspb from 'google-protobuf'

import * as asgt_type_dataset_pb from '../../../asgt/type/dataset_pb'; // proto import: "asgt/type/dataset.proto"
import * as google_protobuf_timestamp_pb from 'google-protobuf/google/protobuf/timestamp_pb'; // proto import: "google/protobuf/timestamp.proto"


export class Model extends jspb.Message {
  getCreatedAt(): google_protobuf_timestamp_pb.Timestamp | undefined;
  setCreatedAt(value?: google_protobuf_timestamp_pb.Timestamp): Model;
  hasCreatedAt(): boolean;
  clearCreatedAt(): Model;

  getDataset(): asgt_type_dataset_pb.Dataset | undefined;
  setDataset(value?: asgt_type_dataset_pb.Dataset): Model;
  hasDataset(): boolean;
  clearDataset(): Model;

  getTargetsList(): Array<string>;
  setTargetsList(value: Array<string>): Model;
  clearTargetsList(): Model;
  addTargets(value: string, index?: number): Model;

  getVersion(): number;
  setVersion(value: number): Model;

  getDatasetSize(): number;
  setDatasetSize(value: number): Model;

  getTrainingSize(): number;
  setTrainingSize(value: number): Model;

  getValidationSize(): number;
  setValidationSize(value: number): Model;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Model.AsObject;
  static toObject(includeInstance: boolean, msg: Model): Model.AsObject;
  static serializeBinaryToWriter(message: Model, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Model;
  static deserializeBinaryFromReader(message: Model, reader: jspb.BinaryReader): Model;
}

export namespace Model {
  export type AsObject = {
    createdAt?: google_protobuf_timestamp_pb.Timestamp.AsObject,
    dataset?: asgt_type_dataset_pb.Dataset.AsObject,
    targetsList: Array<string>,
    version: number,
    datasetSize: number,
    trainingSize: number,
    validationSize: number,
  }
}

