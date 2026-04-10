import * as jspb from 'google-protobuf'

import * as google_api_annotations_pb from '../../../google/api/annotations_pb'; // proto import: "google/api/annotations.proto"
import * as ssn_asyncton_v1_asyncton_pb from '../../../ssn/asyncton/v1/asyncton_pb'; // proto import: "ssn/asyncton/v1/asyncton.proto"


export class GetDocumentDataRequest extends jspb.Message {
  getFeedbackId(): string;
  setFeedbackId(value: string): GetDocumentDataRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetDocumentDataRequest.AsObject;
  static toObject(includeInstance: boolean, msg: GetDocumentDataRequest): GetDocumentDataRequest.AsObject;
  static serializeBinaryToWriter(message: GetDocumentDataRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetDocumentDataRequest;
  static deserializeBinaryFromReader(message: GetDocumentDataRequest, reader: jspb.BinaryReader): GetDocumentDataRequest;
}

export namespace GetDocumentDataRequest {
  export type AsObject = {
    feedbackId: string,
  }
}

export class GetDocumentDataResponse extends jspb.Message {
  getFeedbackId(): string;
  setFeedbackId(value: string): GetDocumentDataResponse;

  getDocumentBytes(): Uint8Array | string;
  getDocumentBytes_asU8(): Uint8Array;
  getDocumentBytes_asB64(): string;
  setDocumentBytes(value: Uint8Array | string): GetDocumentDataResponse;

  getPredictionsList(): Array<ssn_asyncton_v1_asyncton_pb.Annotation>;
  setPredictionsList(value: Array<ssn_asyncton_v1_asyncton_pb.Annotation>): GetDocumentDataResponse;
  clearPredictionsList(): GetDocumentDataResponse;
  addPredictions(value?: ssn_asyncton_v1_asyncton_pb.Annotation, index?: number): ssn_asyncton_v1_asyncton_pb.Annotation;

  getLabelsList(): Array<ssn_asyncton_v1_asyncton_pb.Annotation>;
  setLabelsList(value: Array<ssn_asyncton_v1_asyncton_pb.Annotation>): GetDocumentDataResponse;
  clearLabelsList(): GetDocumentDataResponse;
  addLabels(value?: ssn_asyncton_v1_asyncton_pb.Annotation, index?: number): ssn_asyncton_v1_asyncton_pb.Annotation;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetDocumentDataResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GetDocumentDataResponse): GetDocumentDataResponse.AsObject;
  static serializeBinaryToWriter(message: GetDocumentDataResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetDocumentDataResponse;
  static deserializeBinaryFromReader(message: GetDocumentDataResponse, reader: jspb.BinaryReader): GetDocumentDataResponse;
}

export namespace GetDocumentDataResponse {
  export type AsObject = {
    feedbackId: string,
    documentBytes: Uint8Array | string,
    predictionsList: Array<ssn_asyncton_v1_asyncton_pb.Annotation.AsObject>,
    labelsList: Array<ssn_asyncton_v1_asyncton_pb.Annotation.AsObject>,
  }
}

