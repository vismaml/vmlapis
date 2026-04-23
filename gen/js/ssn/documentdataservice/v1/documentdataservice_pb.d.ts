import * as jspb from 'google-protobuf'

import * as google_api_annotations_pb from '../../../google/api/annotations_pb'; // proto import: "google/api/annotations.proto"
import * as google_protobuf_timestamp_pb from 'google-protobuf/google/protobuf/timestamp_pb'; // proto import: "google/protobuf/timestamp.proto"
import * as google_protobuf_wrappers_pb from 'google-protobuf/google/protobuf/wrappers_pb'; // proto import: "google/protobuf/wrappers.proto"
import * as ssn_type_candidate_pb from '../../../ssn/type/candidate_pb'; // proto import: "ssn/type/candidate.proto"
import * as ssn_type_qr_pb from '../../../ssn/type/qr_pb'; // proto import: "ssn/type/qr.proto"


export class InternalCandidate extends jspb.Message {
  getCandidate(): ssn_type_candidate_pb.Candidate | undefined;
  setCandidate(value?: ssn_type_candidate_pb.Candidate): InternalCandidate;
  hasCandidate(): boolean;
  clearCandidate(): InternalCandidate;

  getSource(): CandidateSource;
  setSource(value: CandidateSource): InternalCandidate;

  getSourceId(): string;
  setSourceId(value: string): InternalCandidate;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): InternalCandidate.AsObject;
  static toObject(includeInstance: boolean, msg: InternalCandidate): InternalCandidate.AsObject;
  static serializeBinaryToWriter(message: InternalCandidate, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): InternalCandidate;
  static deserializeBinaryFromReader(message: InternalCandidate, reader: jspb.BinaryReader): InternalCandidate;
}

export namespace InternalCandidate {
  export type AsObject = {
    candidate?: ssn_type_candidate_pb.Candidate.AsObject,
    source: CandidateSource,
    sourceId: string,
  }
}

export class FieldData extends jspb.Message {
  getCandidatesList(): Array<InternalCandidate>;
  setCandidatesList(value: Array<InternalCandidate>): FieldData;
  clearCandidatesList(): FieldData;
  addCandidates(value?: InternalCandidate, index?: number): InternalCandidate;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): FieldData.AsObject;
  static toObject(includeInstance: boolean, msg: FieldData): FieldData.AsObject;
  static serializeBinaryToWriter(message: FieldData, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): FieldData;
  static deserializeBinaryFromReader(message: FieldData, reader: jspb.BinaryReader): FieldData;
}

export namespace FieldData {
  export type AsObject = {
    candidatesList: Array<InternalCandidate.AsObject>,
  }
}

export class InternalPurchaseLine extends jspb.Message {
  getLine(): ssn_type_candidate_pb.PurchaseLine | undefined;
  setLine(value?: ssn_type_candidate_pb.PurchaseLine): InternalPurchaseLine;
  hasLine(): boolean;
  clearLine(): InternalPurchaseLine;

  getSource(): CandidateSource;
  setSource(value: CandidateSource): InternalPurchaseLine;

  getSourceId(): string;
  setSourceId(value: string): InternalPurchaseLine;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): InternalPurchaseLine.AsObject;
  static toObject(includeInstance: boolean, msg: InternalPurchaseLine): InternalPurchaseLine.AsObject;
  static serializeBinaryToWriter(message: InternalPurchaseLine, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): InternalPurchaseLine;
  static deserializeBinaryFromReader(message: InternalPurchaseLine, reader: jspb.BinaryReader): InternalPurchaseLine;
}

export namespace InternalPurchaseLine {
  export type AsObject = {
    line?: ssn_type_candidate_pb.PurchaseLine.AsObject,
    source: CandidateSource,
    sourceId: string,
  }
}

export class PurchaseLineData extends jspb.Message {
  getLinesList(): Array<InternalPurchaseLine>;
  setLinesList(value: Array<InternalPurchaseLine>): PurchaseLineData;
  clearLinesList(): PurchaseLineData;
  addLines(value?: InternalPurchaseLine, index?: number): InternalPurchaseLine;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): PurchaseLineData.AsObject;
  static toObject(includeInstance: boolean, msg: PurchaseLineData): PurchaseLineData.AsObject;
  static serializeBinaryToWriter(message: PurchaseLineData, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): PurchaseLineData;
  static deserializeBinaryFromReader(message: PurchaseLineData, reader: jspb.BinaryReader): PurchaseLineData;
}

export namespace PurchaseLineData {
  export type AsObject = {
    linesList: Array<InternalPurchaseLine.AsObject>,
  }
}

export class InternalVatDistribution extends jspb.Message {
  getDistribution(): ssn_type_candidate_pb.VatDistribution | undefined;
  setDistribution(value?: ssn_type_candidate_pb.VatDistribution): InternalVatDistribution;
  hasDistribution(): boolean;
  clearDistribution(): InternalVatDistribution;

  getSource(): CandidateSource;
  setSource(value: CandidateSource): InternalVatDistribution;

  getSourceId(): string;
  setSourceId(value: string): InternalVatDistribution;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): InternalVatDistribution.AsObject;
  static toObject(includeInstance: boolean, msg: InternalVatDistribution): InternalVatDistribution.AsObject;
  static serializeBinaryToWriter(message: InternalVatDistribution, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): InternalVatDistribution;
  static deserializeBinaryFromReader(message: InternalVatDistribution, reader: jspb.BinaryReader): InternalVatDistribution;
}

export namespace InternalVatDistribution {
  export type AsObject = {
    distribution?: ssn_type_candidate_pb.VatDistribution.AsObject,
    source: CandidateSource,
    sourceId: string,
  }
}

export class VatDistributionData extends jspb.Message {
  getDistributionsList(): Array<InternalVatDistribution>;
  setDistributionsList(value: Array<InternalVatDistribution>): VatDistributionData;
  clearDistributionsList(): VatDistributionData;
  addDistributions(value?: InternalVatDistribution, index?: number): InternalVatDistribution;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): VatDistributionData.AsObject;
  static toObject(includeInstance: boolean, msg: VatDistributionData): VatDistributionData.AsObject;
  static serializeBinaryToWriter(message: VatDistributionData, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): VatDistributionData;
  static deserializeBinaryFromReader(message: VatDistributionData, reader: jspb.BinaryReader): VatDistributionData;
}

export namespace VatDistributionData {
  export type AsObject = {
    distributionsList: Array<InternalVatDistribution.AsObject>,
  }
}

export class InternalQrCode extends jspb.Message {
  getQrCodeData(): ssn_type_qr_pb.QrCodeData | undefined;
  setQrCodeData(value?: ssn_type_qr_pb.QrCodeData): InternalQrCode;
  hasQrCodeData(): boolean;
  clearQrCodeData(): InternalQrCode;

  getSwissQrBill(): ssn_type_qr_pb.SwissQrBill | undefined;
  setSwissQrBill(value?: ssn_type_qr_pb.SwissQrBill): InternalQrCode;
  hasSwissQrBill(): boolean;
  clearSwissQrBill(): InternalQrCode;

  getSource(): CandidateSource;
  setSource(value: CandidateSource): InternalQrCode;

  getSourceId(): string;
  setSourceId(value: string): InternalQrCode;

  getQrTypeCase(): InternalQrCode.QrTypeCase;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): InternalQrCode.AsObject;
  static toObject(includeInstance: boolean, msg: InternalQrCode): InternalQrCode.AsObject;
  static serializeBinaryToWriter(message: InternalQrCode, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): InternalQrCode;
  static deserializeBinaryFromReader(message: InternalQrCode, reader: jspb.BinaryReader): InternalQrCode;
}

export namespace InternalQrCode {
  export type AsObject = {
    qrCodeData?: ssn_type_qr_pb.QrCodeData.AsObject,
    swissQrBill?: ssn_type_qr_pb.SwissQrBill.AsObject,
    source: CandidateSource,
    sourceId: string,
  }

  export enum QrTypeCase { 
    QR_TYPE_NOT_SET = 0,
    QR_CODE_DATA = 1,
    SWISS_QR_BILL = 2,
  }
}

export class QrData extends jspb.Message {
  getQrCodesList(): Array<InternalQrCode>;
  setQrCodesList(value: Array<InternalQrCode>): QrData;
  clearQrCodesList(): QrData;
  addQrCodes(value?: InternalQrCode, index?: number): InternalQrCode;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): QrData.AsObject;
  static toObject(includeInstance: boolean, msg: QrData): QrData.AsObject;
  static serializeBinaryToWriter(message: QrData, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): QrData;
  static deserializeBinaryFromReader(message: QrData, reader: jspb.BinaryReader): QrData;
}

export namespace QrData {
  export type AsObject = {
    qrCodesList: Array<InternalQrCode.AsObject>,
  }
}

export class InternalAnswerCandidate extends jspb.Message {
  getAnswer(): ssn_type_candidate_pb.AnswerCandidate | undefined;
  setAnswer(value?: ssn_type_candidate_pb.AnswerCandidate): InternalAnswerCandidate;
  hasAnswer(): boolean;
  clearAnswer(): InternalAnswerCandidate;

  getSource(): CandidateSource;
  setSource(value: CandidateSource): InternalAnswerCandidate;

  getSourceId(): string;
  setSourceId(value: string): InternalAnswerCandidate;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): InternalAnswerCandidate.AsObject;
  static toObject(includeInstance: boolean, msg: InternalAnswerCandidate): InternalAnswerCandidate.AsObject;
  static serializeBinaryToWriter(message: InternalAnswerCandidate, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): InternalAnswerCandidate;
  static deserializeBinaryFromReader(message: InternalAnswerCandidate, reader: jspb.BinaryReader): InternalAnswerCandidate;
}

export namespace InternalAnswerCandidate {
  export type AsObject = {
    answer?: ssn_type_candidate_pb.AnswerCandidate.AsObject,
    source: CandidateSource,
    sourceId: string,
  }
}

export class AnswerData extends jspb.Message {
  getAnswersList(): Array<InternalAnswerCandidate>;
  setAnswersList(value: Array<InternalAnswerCandidate>): AnswerData;
  clearAnswersList(): AnswerData;
  addAnswers(value?: InternalAnswerCandidate, index?: number): InternalAnswerCandidate;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): AnswerData.AsObject;
  static toObject(includeInstance: boolean, msg: AnswerData): AnswerData.AsObject;
  static serializeBinaryToWriter(message: AnswerData, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): AnswerData;
  static deserializeBinaryFromReader(message: AnswerData, reader: jspb.BinaryReader): AnswerData;
}

export namespace AnswerData {
  export type AsObject = {
    answersList: Array<InternalAnswerCandidate.AsObject>,
  }
}

export class InternalFieldAnnotation extends jspb.Message {
  getFeature(): string;
  setFeature(value: string): InternalFieldAnnotation;

  getFieldData(): FieldData | undefined;
  setFieldData(value?: FieldData): InternalFieldAnnotation;
  hasFieldData(): boolean;
  clearFieldData(): InternalFieldAnnotation;

  getPurchaseLineData(): PurchaseLineData | undefined;
  setPurchaseLineData(value?: PurchaseLineData): InternalFieldAnnotation;
  hasPurchaseLineData(): boolean;
  clearPurchaseLineData(): InternalFieldAnnotation;

  getVatDistributionData(): VatDistributionData | undefined;
  setVatDistributionData(value?: VatDistributionData): InternalFieldAnnotation;
  hasVatDistributionData(): boolean;
  clearVatDistributionData(): InternalFieldAnnotation;

  getQrData(): QrData | undefined;
  setQrData(value?: QrData): InternalFieldAnnotation;
  hasQrData(): boolean;
  clearQrData(): InternalFieldAnnotation;

  getAnswerData(): AnswerData | undefined;
  setAnswerData(value?: AnswerData): InternalFieldAnnotation;
  hasAnswerData(): boolean;
  clearAnswerData(): InternalFieldAnnotation;

  getDataCase(): InternalFieldAnnotation.DataCase;

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
    fieldData?: FieldData.AsObject,
    purchaseLineData?: PurchaseLineData.AsObject,
    vatDistributionData?: VatDistributionData.AsObject,
    qrData?: QrData.AsObject,
    answerData?: AnswerData.AsObject,
  }

  export enum DataCase { 
    DATA_NOT_SET = 0,
    FIELD_DATA = 2,
    PURCHASE_LINE_DATA = 3,
    VAT_DISTRIBUTION_DATA = 4,
    QR_DATA = 5,
    ANSWER_DATA = 6,
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

export enum CandidateSource { 
  CANDIDATE_SOURCE_UNSPECIFIED = 0,
  CANDIDATE_SOURCE_PREDICTION = 1,
  CANDIDATE_SOURCE_FEEDBACK = 2,
  CANDIDATE_SOURCE_LABEL = 3,
}
