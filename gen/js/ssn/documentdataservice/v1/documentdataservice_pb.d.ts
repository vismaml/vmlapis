import * as jspb from 'google-protobuf'

import * as google_api_annotations_pb from '../../../google/api/annotations_pb'; // proto import: "google/api/annotations.proto"
import * as google_protobuf_timestamp_pb from 'google-protobuf/google/protobuf/timestamp_pb'; // proto import: "google/protobuf/timestamp.proto"
import * as google_protobuf_wrappers_pb from 'google-protobuf/google/protobuf/wrappers_pb'; // proto import: "google/protobuf/wrappers.proto"
import * as ssn_type_address_pb from '../../../ssn/type/address_pb'; // proto import: "ssn/type/address.proto"
import * as ssn_type_candidate_pb from '../../../ssn/type/candidate_pb'; // proto import: "ssn/type/candidate.proto"
import * as ssn_type_qr_pb from '../../../ssn/type/qr_pb'; // proto import: "ssn/type/qr.proto"


export class InternalEntry extends jspb.Message {
  getSource(): CandidateSource;
  setSource(value: CandidateSource): InternalEntry;

  getSourceId(): string;
  setSourceId(value: string): InternalEntry;

  getCreatedAt(): google_protobuf_timestamp_pb.Timestamp | undefined;
  setCreatedAt(value?: google_protobuf_timestamp_pb.Timestamp): InternalEntry;
  hasCreatedAt(): boolean;
  clearCreatedAt(): InternalEntry;

  getCandidateId(): number;
  setCandidateId(value: number): InternalEntry;

  getCandidate(): ssn_type_candidate_pb.Candidate | undefined;
  setCandidate(value?: ssn_type_candidate_pb.Candidate): InternalEntry;
  hasCandidate(): boolean;
  clearCandidate(): InternalEntry;

  getLine(): ssn_type_candidate_pb.PurchaseLine | undefined;
  setLine(value?: ssn_type_candidate_pb.PurchaseLine): InternalEntry;
  hasLine(): boolean;
  clearLine(): InternalEntry;

  getDistribution(): ssn_type_candidate_pb.VatDistribution | undefined;
  setDistribution(value?: ssn_type_candidate_pb.VatDistribution): InternalEntry;
  hasDistribution(): boolean;
  clearDistribution(): InternalEntry;

  getQrCodeData(): ssn_type_qr_pb.QrCodeData | undefined;
  setQrCodeData(value?: ssn_type_qr_pb.QrCodeData): InternalEntry;
  hasQrCodeData(): boolean;
  clearQrCodeData(): InternalEntry;

  getSwissQrBill(): ssn_type_qr_pb.SwissQrBill | undefined;
  setSwissQrBill(value?: ssn_type_qr_pb.SwissQrBill): InternalEntry;
  hasSwissQrBill(): boolean;
  clearSwissQrBill(): InternalEntry;

  getAnswer(): ssn_type_candidate_pb.AnswerCandidate | undefined;
  setAnswer(value?: ssn_type_candidate_pb.AnswerCandidate): InternalEntry;
  hasAnswer(): boolean;
  clearAnswer(): InternalEntry;

  getAddress(): ssn_type_address_pb.StructuredAddress | undefined;
  setAddress(value?: ssn_type_address_pb.StructuredAddress): InternalEntry;
  hasAddress(): boolean;
  clearAddress(): InternalEntry;

  getPayloadCase(): InternalEntry.PayloadCase;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): InternalEntry.AsObject;
  static toObject(includeInstance: boolean, msg: InternalEntry): InternalEntry.AsObject;
  static serializeBinaryToWriter(message: InternalEntry, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): InternalEntry;
  static deserializeBinaryFromReader(message: InternalEntry, reader: jspb.BinaryReader): InternalEntry;
}

export namespace InternalEntry {
  export type AsObject = {
    source: CandidateSource,
    sourceId: string,
    createdAt?: google_protobuf_timestamp_pb.Timestamp.AsObject,
    candidateId: number,
    candidate?: ssn_type_candidate_pb.Candidate.AsObject,
    line?: ssn_type_candidate_pb.PurchaseLine.AsObject,
    distribution?: ssn_type_candidate_pb.VatDistribution.AsObject,
    qrCodeData?: ssn_type_qr_pb.QrCodeData.AsObject,
    swissQrBill?: ssn_type_qr_pb.SwissQrBill.AsObject,
    answer?: ssn_type_candidate_pb.AnswerCandidate.AsObject,
    address?: ssn_type_address_pb.StructuredAddress.AsObject,
  }

  export enum PayloadCase { 
    PAYLOAD_NOT_SET = 0,
    CANDIDATE = 5,
    LINE = 6,
    DISTRIBUTION = 7,
    QR_CODE_DATA = 8,
    SWISS_QR_BILL = 9,
    ANSWER = 10,
    ADDRESS = 11,
  }
}

export class InternalFieldAnnotation extends jspb.Message {
  getFeature(): string;
  setFeature(value: string): InternalFieldAnnotation;

  getEntriesList(): Array<InternalEntry>;
  setEntriesList(value: Array<InternalEntry>): InternalFieldAnnotation;
  clearEntriesList(): InternalFieldAnnotation;
  addEntries(value?: InternalEntry, index?: number): InternalEntry;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): InternalFieldAnnotation.AsObject;
  static toObject(includeInstance: boolean, msg: InternalFieldAnnotation): InternalFieldAnnotation.AsObject;
  static serializeBinaryToWriter(message: InternalFieldAnnotation, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): InternalFieldAnnotation;
  static deserializeBinaryFromReader(message: InternalFieldAnnotation, reader: jspb.BinaryReader): InternalFieldAnnotation;
}

export namespace InternalFieldAnnotation {
  export type AsObject = {
    feature: string,
    entriesList: Array<InternalEntry.AsObject>,
  }
}

export class GetDocumentDataRequest extends jspb.Message {
  getFeedbackId(): string;
  setFeedbackId(value: string): GetDocumentDataRequest;

  getConsumer(): string;
  setConsumer(value: string): GetDocumentDataRequest;

  getIncludePredictions(): boolean;
  setIncludePredictions(value: boolean): GetDocumentDataRequest;

  getIncludeFeedbacks(): boolean;
  setIncludeFeedbacks(value: boolean): GetDocumentDataRequest;

  getIncludeLabels(): boolean;
  setIncludeLabels(value: boolean): GetDocumentDataRequest;

  getEnvironment(): string;
  setEnvironment(value: string): GetDocumentDataRequest;

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
    consumer: string,
    includePredictions: boolean,
    includeFeedbacks: boolean,
    includeLabels: boolean,
    environment: string,
  }
}

export class GetDocumentDataResponse extends jspb.Message {
  getFeedbackId(): string;
  setFeedbackId(value: string): GetDocumentDataResponse;

  getConsumer(): string;
  setConsumer(value: string): GetDocumentDataResponse;

  getFileUrl(): string;
  setFileUrl(value: string): GetDocumentDataResponse;

  getRenderUrlsList(): Array<string>;
  setRenderUrlsList(value: Array<string>): GetDocumentDataResponse;
  clearRenderUrlsList(): GetDocumentDataResponse;
  addRenderUrls(value: string, index?: number): GetDocumentDataResponse;

  getTextAnnotationUrl(): google_protobuf_wrappers_pb.StringValue | undefined;
  setTextAnnotationUrl(value?: google_protobuf_wrappers_pb.StringValue): GetDocumentDataResponse;
  hasTextAnnotationUrl(): boolean;
  clearTextAnnotationUrl(): GetDocumentDataResponse;

  getFieldsList(): Array<InternalFieldAnnotation>;
  setFieldsList(value: Array<InternalFieldAnnotation>): GetDocumentDataResponse;
  clearFieldsList(): GetDocumentDataResponse;
  addFields(value?: InternalFieldAnnotation, index?: number): InternalFieldAnnotation;

  getExpiresAt(): google_protobuf_timestamp_pb.Timestamp | undefined;
  setExpiresAt(value?: google_protobuf_timestamp_pb.Timestamp): GetDocumentDataResponse;
  hasExpiresAt(): boolean;
  clearExpiresAt(): GetDocumentDataResponse;

  getRequestedFeaturesList(): Array<string>;
  setRequestedFeaturesList(value: Array<string>): GetDocumentDataResponse;
  clearRequestedFeaturesList(): GetDocumentDataResponse;
  addRequestedFeatures(value: string, index?: number): GetDocumentDataResponse;

  getUpdatedAt(): google_protobuf_timestamp_pb.Timestamp | undefined;
  setUpdatedAt(value?: google_protobuf_timestamp_pb.Timestamp): GetDocumentDataResponse;
  hasUpdatedAt(): boolean;
  clearUpdatedAt(): GetDocumentDataResponse;

  getTagsList(): Array<string>;
  setTagsList(value: Array<string>): GetDocumentDataResponse;
  clearTagsList(): GetDocumentDataResponse;
  addTags(value: string, index?: number): GetDocumentDataResponse;

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
    consumer: string,
    fileUrl: string,
    renderUrlsList: Array<string>,
    textAnnotationUrl?: google_protobuf_wrappers_pb.StringValue.AsObject,
    fieldsList: Array<InternalFieldAnnotation.AsObject>,
    expiresAt?: google_protobuf_timestamp_pb.Timestamp.AsObject,
    requestedFeaturesList: Array<string>,
    updatedAt?: google_protobuf_timestamp_pb.Timestamp.AsObject,
    tagsList: Array<string>,
  }
}

export class SetDocumentBlobsRequest extends jspb.Message {
  getFeedbackId(): string;
  setFeedbackId(value: string): SetDocumentBlobsRequest;

  getConsumer(): string;
  setConsumer(value: string): SetDocumentBlobsRequest;

  getFileUri(): google_protobuf_wrappers_pb.StringValue | undefined;
  setFileUri(value?: google_protobuf_wrappers_pb.StringValue): SetDocumentBlobsRequest;
  hasFileUri(): boolean;
  clearFileUri(): SetDocumentBlobsRequest;

  getRenderUrisList(): Array<string>;
  setRenderUrisList(value: Array<string>): SetDocumentBlobsRequest;
  clearRenderUrisList(): SetDocumentBlobsRequest;
  addRenderUris(value: string, index?: number): SetDocumentBlobsRequest;

  getTaUri(): google_protobuf_wrappers_pb.StringValue | undefined;
  setTaUri(value?: google_protobuf_wrappers_pb.StringValue): SetDocumentBlobsRequest;
  hasTaUri(): boolean;
  clearTaUri(): SetDocumentBlobsRequest;

  getExpiresAt(): google_protobuf_timestamp_pb.Timestamp | undefined;
  setExpiresAt(value?: google_protobuf_timestamp_pb.Timestamp): SetDocumentBlobsRequest;
  hasExpiresAt(): boolean;
  clearExpiresAt(): SetDocumentBlobsRequest;

  getEnvironment(): string;
  setEnvironment(value: string): SetDocumentBlobsRequest;

  getRequestedFeaturesList(): Array<string>;
  setRequestedFeaturesList(value: Array<string>): SetDocumentBlobsRequest;
  clearRequestedFeaturesList(): SetDocumentBlobsRequest;
  addRequestedFeatures(value: string, index?: number): SetDocumentBlobsRequest;

  getTagsList(): Array<string>;
  setTagsList(value: Array<string>): SetDocumentBlobsRequest;
  clearTagsList(): SetDocumentBlobsRequest;
  addTags(value: string, index?: number): SetDocumentBlobsRequest;

  getContent(): Uint8Array | string;
  getContent_asU8(): Uint8Array;
  getContent_asB64(): string;
  setContent(value: Uint8Array | string): SetDocumentBlobsRequest;

  getTaContent(): Uint8Array | string;
  getTaContent_asU8(): Uint8Array;
  getTaContent_asB64(): string;
  setTaContent(value: Uint8Array | string): SetDocumentBlobsRequest;

  getRenderContentsList(): Array<Uint8Array | string>;
  setRenderContentsList(value: Array<Uint8Array | string>): SetDocumentBlobsRequest;
  clearRenderContentsList(): SetDocumentBlobsRequest;
  addRenderContents(value: Uint8Array | string, index?: number): SetDocumentBlobsRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): SetDocumentBlobsRequest.AsObject;
  static toObject(includeInstance: boolean, msg: SetDocumentBlobsRequest): SetDocumentBlobsRequest.AsObject;
  static serializeBinaryToWriter(message: SetDocumentBlobsRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): SetDocumentBlobsRequest;
  static deserializeBinaryFromReader(message: SetDocumentBlobsRequest, reader: jspb.BinaryReader): SetDocumentBlobsRequest;
}

export namespace SetDocumentBlobsRequest {
  export type AsObject = {
    feedbackId: string,
    consumer: string,
    fileUri?: google_protobuf_wrappers_pb.StringValue.AsObject,
    renderUrisList: Array<string>,
    taUri?: google_protobuf_wrappers_pb.StringValue.AsObject,
    expiresAt?: google_protobuf_timestamp_pb.Timestamp.AsObject,
    environment: string,
    requestedFeaturesList: Array<string>,
    tagsList: Array<string>,
    content: Uint8Array | string,
    taContent: Uint8Array | string,
    renderContentsList: Array<Uint8Array | string>,
  }
}

export class SetDocumentBlobsResponse extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): SetDocumentBlobsResponse.AsObject;
  static toObject(includeInstance: boolean, msg: SetDocumentBlobsResponse): SetDocumentBlobsResponse.AsObject;
  static serializeBinaryToWriter(message: SetDocumentBlobsResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): SetDocumentBlobsResponse;
  static deserializeBinaryFromReader(message: SetDocumentBlobsResponse, reader: jspb.BinaryReader): SetDocumentBlobsResponse;
}

export namespace SetDocumentBlobsResponse {
  export type AsObject = {
  }
}

export class AddAnnotationsRequest extends jspb.Message {
  getFeedbackId(): string;
  setFeedbackId(value: string): AddAnnotationsRequest;

  getConsumer(): string;
  setConsumer(value: string): AddAnnotationsRequest;

  getAnnotationsList(): Array<InternalFieldAnnotation>;
  setAnnotationsList(value: Array<InternalFieldAnnotation>): AddAnnotationsRequest;
  clearAnnotationsList(): AddAnnotationsRequest;
  addAnnotations(value?: InternalFieldAnnotation, index?: number): InternalFieldAnnotation;

  getEnvironment(): string;
  setEnvironment(value: string): AddAnnotationsRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): AddAnnotationsRequest.AsObject;
  static toObject(includeInstance: boolean, msg: AddAnnotationsRequest): AddAnnotationsRequest.AsObject;
  static serializeBinaryToWriter(message: AddAnnotationsRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): AddAnnotationsRequest;
  static deserializeBinaryFromReader(message: AddAnnotationsRequest, reader: jspb.BinaryReader): AddAnnotationsRequest;
}

export namespace AddAnnotationsRequest {
  export type AsObject = {
    feedbackId: string,
    consumer: string,
    annotationsList: Array<InternalFieldAnnotation.AsObject>,
    environment: string,
  }
}

export class AddAnnotationsResponse extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): AddAnnotationsResponse.AsObject;
  static toObject(includeInstance: boolean, msg: AddAnnotationsResponse): AddAnnotationsResponse.AsObject;
  static serializeBinaryToWriter(message: AddAnnotationsResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): AddAnnotationsResponse;
  static deserializeBinaryFromReader(message: AddAnnotationsResponse, reader: jspb.BinaryReader): AddAnnotationsResponse;
}

export namespace AddAnnotationsResponse {
  export type AsObject = {
  }
}

export class DeleteDocumentRequest extends jspb.Message {
  getFeedbackId(): string;
  setFeedbackId(value: string): DeleteDocumentRequest;

  getConsumer(): string;
  setConsumer(value: string): DeleteDocumentRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DeleteDocumentRequest.AsObject;
  static toObject(includeInstance: boolean, msg: DeleteDocumentRequest): DeleteDocumentRequest.AsObject;
  static serializeBinaryToWriter(message: DeleteDocumentRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DeleteDocumentRequest;
  static deserializeBinaryFromReader(message: DeleteDocumentRequest, reader: jspb.BinaryReader): DeleteDocumentRequest;
}

export namespace DeleteDocumentRequest {
  export type AsObject = {
    feedbackId: string,
    consumer: string,
  }
}

export class DeleteDocumentResponse extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DeleteDocumentResponse.AsObject;
  static toObject(includeInstance: boolean, msg: DeleteDocumentResponse): DeleteDocumentResponse.AsObject;
  static serializeBinaryToWriter(message: DeleteDocumentResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DeleteDocumentResponse;
  static deserializeBinaryFromReader(message: DeleteDocumentResponse, reader: jspb.BinaryReader): DeleteDocumentResponse;
}

export namespace DeleteDocumentResponse {
  export type AsObject = {
  }
}

export class DeleteAnnotationsRequest extends jspb.Message {
  getFeedbackId(): string;
  setFeedbackId(value: string): DeleteAnnotationsRequest;

  getConsumer(): string;
  setConsumer(value: string): DeleteAnnotationsRequest;

  getFeature(): string;
  setFeature(value: string): DeleteAnnotationsRequest;

  getSource(): string;
  setSource(value: string): DeleteAnnotationsRequest;

  getSourceId(): string;
  setSourceId(value: string): DeleteAnnotationsRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DeleteAnnotationsRequest.AsObject;
  static toObject(includeInstance: boolean, msg: DeleteAnnotationsRequest): DeleteAnnotationsRequest.AsObject;
  static serializeBinaryToWriter(message: DeleteAnnotationsRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DeleteAnnotationsRequest;
  static deserializeBinaryFromReader(message: DeleteAnnotationsRequest, reader: jspb.BinaryReader): DeleteAnnotationsRequest;
}

export namespace DeleteAnnotationsRequest {
  export type AsObject = {
    feedbackId: string,
    consumer: string,
    feature: string,
    source: string,
    sourceId: string,
  }
}

export class DeleteAnnotationsResponse extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DeleteAnnotationsResponse.AsObject;
  static toObject(includeInstance: boolean, msg: DeleteAnnotationsResponse): DeleteAnnotationsResponse.AsObject;
  static serializeBinaryToWriter(message: DeleteAnnotationsResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DeleteAnnotationsResponse;
  static deserializeBinaryFromReader(message: DeleteAnnotationsResponse, reader: jspb.BinaryReader): DeleteAnnotationsResponse;
}

export namespace DeleteAnnotationsResponse {
  export type AsObject = {
  }
}

export enum CandidateSource { 
  CANDIDATE_SOURCE_UNSPECIFIED = 0,
  CANDIDATE_SOURCE_PREDICTION = 1,
  CANDIDATE_SOURCE_FEEDBACK = 2,
  CANDIDATE_SOURCE_LABEL = 3,
}
