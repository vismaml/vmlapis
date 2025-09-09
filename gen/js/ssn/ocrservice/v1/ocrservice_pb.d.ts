import * as jspb from 'google-protobuf'

import * as google_protobuf_wrappers_pb from 'google-protobuf/google/protobuf/wrappers_pb'; // proto import: "google/protobuf/wrappers.proto"
import * as ssn_annotator_v1_annotator_pb from '../../../ssn/annotator/v1/annotator_pb'; // proto import: "ssn/annotator/v1/annotator.proto"
import * as ssn_type_swiss_qr_bill_pb from '../../../ssn/type/swiss_qr_bill_pb'; // proto import: "ssn/type/swiss_qr_bill.proto"
import * as ssn_type_text_annotation_pb from '../../../ssn/type/text_annotation_pb'; // proto import: "ssn/type/text_annotation.proto"


export class GetTextAnnotationRequest extends jspb.Message {
  getDocument(): ssn_annotator_v1_annotator_pb.Document | undefined;
  setDocument(value?: ssn_annotator_v1_annotator_pb.Document): GetTextAnnotationRequest;
  hasDocument(): boolean;
  clearDocument(): GetTextAnnotationRequest;

  getPreview(): boolean;
  setPreview(value: boolean): GetTextAnnotationRequest;

  getPreviewLast(): boolean;
  setPreviewLast(value: boolean): GetTextAnnotationRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetTextAnnotationRequest.AsObject;
  static toObject(includeInstance: boolean, msg: GetTextAnnotationRequest): GetTextAnnotationRequest.AsObject;
  static serializeBinaryToWriter(message: GetTextAnnotationRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetTextAnnotationRequest;
  static deserializeBinaryFromReader(message: GetTextAnnotationRequest, reader: jspb.BinaryReader): GetTextAnnotationRequest;
}

export namespace GetTextAnnotationRequest {
  export type AsObject = {
    document?: ssn_annotator_v1_annotator_pb.Document.AsObject,
    preview: boolean,
    previewLast: boolean,
  }
}

export class GetTextAnnotationResponse extends jspb.Message {
  getTextAnnotation(): ssn_type_text_annotation_pb.TextAnnotation | undefined;
  setTextAnnotation(value?: ssn_type_text_annotation_pb.TextAnnotation): GetTextAnnotationResponse;
  hasTextAnnotation(): boolean;
  clearTextAnnotation(): GetTextAnnotationResponse;

  getImage(): google_protobuf_wrappers_pb.BytesValue | undefined;
  setImage(value?: google_protobuf_wrappers_pb.BytesValue): GetTextAnnotationResponse;
  hasImage(): boolean;
  clearImage(): GetTextAnnotationResponse;

  getLastImage(): google_protobuf_wrappers_pb.BytesValue | undefined;
  setLastImage(value?: google_protobuf_wrappers_pb.BytesValue): GetTextAnnotationResponse;
  hasLastImage(): boolean;
  clearLastImage(): GetTextAnnotationResponse;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetTextAnnotationResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GetTextAnnotationResponse): GetTextAnnotationResponse.AsObject;
  static serializeBinaryToWriter(message: GetTextAnnotationResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetTextAnnotationResponse;
  static deserializeBinaryFromReader(message: GetTextAnnotationResponse, reader: jspb.BinaryReader): GetTextAnnotationResponse;
}

export namespace GetTextAnnotationResponse {
  export type AsObject = {
    textAnnotation?: ssn_type_text_annotation_pb.TextAnnotation.AsObject,
    image?: google_protobuf_wrappers_pb.BytesValue.AsObject,
    lastImage?: google_protobuf_wrappers_pb.BytesValue.AsObject,
  }
}

export class AsyncCreateOperationRequest extends jspb.Message {
  getInputPathsList(): Array<string>;
  setInputPathsList(value: Array<string>): AsyncCreateOperationRequest;
  clearInputPathsList(): AsyncCreateOperationRequest;
  addInputPaths(value: string, index?: number): AsyncCreateOperationRequest;

  getOutputPath(): string;
  setOutputPath(value: string): AsyncCreateOperationRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): AsyncCreateOperationRequest.AsObject;
  static toObject(includeInstance: boolean, msg: AsyncCreateOperationRequest): AsyncCreateOperationRequest.AsObject;
  static serializeBinaryToWriter(message: AsyncCreateOperationRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): AsyncCreateOperationRequest;
  static deserializeBinaryFromReader(message: AsyncCreateOperationRequest, reader: jspb.BinaryReader): AsyncCreateOperationRequest;
}

export namespace AsyncCreateOperationRequest {
  export type AsObject = {
    inputPathsList: Array<string>,
    outputPath: string,
  }
}

export class AsyncCreateOperationResponse extends jspb.Message {
  getOperationName(): string;
  setOperationName(value: string): AsyncCreateOperationResponse;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): AsyncCreateOperationResponse.AsObject;
  static toObject(includeInstance: boolean, msg: AsyncCreateOperationResponse): AsyncCreateOperationResponse.AsObject;
  static serializeBinaryToWriter(message: AsyncCreateOperationResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): AsyncCreateOperationResponse;
  static deserializeBinaryFromReader(message: AsyncCreateOperationResponse, reader: jspb.BinaryReader): AsyncCreateOperationResponse;
}

export namespace AsyncCreateOperationResponse {
  export type AsObject = {
    operationName: string,
  }
}

export class AsyncGetOperationStatusRequest extends jspb.Message {
  getOperationName(): string;
  setOperationName(value: string): AsyncGetOperationStatusRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): AsyncGetOperationStatusRequest.AsObject;
  static toObject(includeInstance: boolean, msg: AsyncGetOperationStatusRequest): AsyncGetOperationStatusRequest.AsObject;
  static serializeBinaryToWriter(message: AsyncGetOperationStatusRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): AsyncGetOperationStatusRequest;
  static deserializeBinaryFromReader(message: AsyncGetOperationStatusRequest, reader: jspb.BinaryReader): AsyncGetOperationStatusRequest;
}

export namespace AsyncGetOperationStatusRequest {
  export type AsObject = {
    operationName: string,
  }
}

export class AsyncGetOperationStatusResponse extends jspb.Message {
  getOperationName(): string;
  setOperationName(value: string): AsyncGetOperationStatusResponse;

  getDone(): boolean;
  setDone(value: boolean): AsyncGetOperationStatusResponse;

  getStatusCode(): number;
  setStatusCode(value: number): AsyncGetOperationStatusResponse;

  getErrorMessage(): string;
  setErrorMessage(value: string): AsyncGetOperationStatusResponse;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): AsyncGetOperationStatusResponse.AsObject;
  static toObject(includeInstance: boolean, msg: AsyncGetOperationStatusResponse): AsyncGetOperationStatusResponse.AsObject;
  static serializeBinaryToWriter(message: AsyncGetOperationStatusResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): AsyncGetOperationStatusResponse;
  static deserializeBinaryFromReader(message: AsyncGetOperationStatusResponse, reader: jspb.BinaryReader): AsyncGetOperationStatusResponse;
}

export namespace AsyncGetOperationStatusResponse {
  export type AsObject = {
    operationName: string,
    done: boolean,
    statusCode: number,
    errorMessage: string,
  }
}

export class OcrScanImageRequest extends jspb.Message {
  getData(): Uint8Array | string;
  getData_asU8(): Uint8Array;
  getData_asB64(): string;
  setData(value: Uint8Array | string): OcrScanImageRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): OcrScanImageRequest.AsObject;
  static toObject(includeInstance: boolean, msg: OcrScanImageRequest): OcrScanImageRequest.AsObject;
  static serializeBinaryToWriter(message: OcrScanImageRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): OcrScanImageRequest;
  static deserializeBinaryFromReader(message: OcrScanImageRequest, reader: jspb.BinaryReader): OcrScanImageRequest;
}

export namespace OcrScanImageRequest {
  export type AsObject = {
    data: Uint8Array | string,
  }
}

export class OcrScanImageResponse extends jspb.Message {
  getTessHocr(): string;
  setTessHocr(value: string): OcrScanImageResponse;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): OcrScanImageResponse.AsObject;
  static toObject(includeInstance: boolean, msg: OcrScanImageResponse): OcrScanImageResponse.AsObject;
  static serializeBinaryToWriter(message: OcrScanImageResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): OcrScanImageResponse;
  static deserializeBinaryFromReader(message: OcrScanImageResponse, reader: jspb.BinaryReader): OcrScanImageResponse;
}

export namespace OcrScanImageResponse {
  export type AsObject = {
    tessHocr: string,
  }
}

export class GetQrCodesRequest extends jspb.Message {
  getDocument(): ssn_annotator_v1_annotator_pb.Document | undefined;
  setDocument(value?: ssn_annotator_v1_annotator_pb.Document): GetQrCodesRequest;
  hasDocument(): boolean;
  clearDocument(): GetQrCodesRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetQrCodesRequest.AsObject;
  static toObject(includeInstance: boolean, msg: GetQrCodesRequest): GetQrCodesRequest.AsObject;
  static serializeBinaryToWriter(message: GetQrCodesRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetQrCodesRequest;
  static deserializeBinaryFromReader(message: GetQrCodesRequest, reader: jspb.BinaryReader): GetQrCodesRequest;
}

export namespace GetQrCodesRequest {
  export type AsObject = {
    document?: ssn_annotator_v1_annotator_pb.Document.AsObject,
  }
}

export class GetQrCodesResponse extends jspb.Message {
  getQrCodesList(): Array<QrCodeData>;
  setQrCodesList(value: Array<QrCodeData>): GetQrCodesResponse;
  clearQrCodesList(): GetQrCodesResponse;
  addQrCodes(value?: QrCodeData, index?: number): QrCodeData;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetQrCodesResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GetQrCodesResponse): GetQrCodesResponse.AsObject;
  static serializeBinaryToWriter(message: GetQrCodesResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetQrCodesResponse;
  static deserializeBinaryFromReader(message: GetQrCodesResponse, reader: jspb.BinaryReader): GetQrCodesResponse;
}

export namespace GetQrCodesResponse {
  export type AsObject = {
    qrCodesList: Array<QrCodeData.AsObject>,
  }
}

export class QrCodeData extends jspb.Message {
  getContent(): string;
  setContent(value: string): QrCodeData;

  getPageRef(): number;
  setPageRef(value: number): QrCodeData;

  getType(): string;
  setType(value: string): QrCodeData;

  getSwissQrBill(): ssn_type_swiss_qr_bill_pb.SwissQrBill | undefined;
  setSwissQrBill(value?: ssn_type_swiss_qr_bill_pb.SwissQrBill): QrCodeData;
  hasSwissQrBill(): boolean;
  clearSwissQrBill(): QrCodeData;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): QrCodeData.AsObject;
  static toObject(includeInstance: boolean, msg: QrCodeData): QrCodeData.AsObject;
  static serializeBinaryToWriter(message: QrCodeData, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): QrCodeData;
  static deserializeBinaryFromReader(message: QrCodeData, reader: jspb.BinaryReader): QrCodeData;
}

export namespace QrCodeData {
  export type AsObject = {
    content: string,
    pageRef: number,
    type: string,
    swissQrBill?: ssn_type_swiss_qr_bill_pb.SwissQrBill.AsObject,
  }
}

