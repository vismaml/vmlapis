import * as grpcWeb from 'grpc-web';

import * as ssn_ocrservice_v1_ocrservice_pb from '../../../ssn/ocrservice/v1/ocrservice_pb'; // proto import: "ssn/ocrservice/v1/ocrservice.proto"


export class OcrServiceClient {
  constructor (hostname: string,
               credentials?: null | { [index: string]: string; },
               options?: null | { [index: string]: any; });

  ocrScanImage(
    request: ssn_ocrservice_v1_ocrservice_pb.OcrScanImageRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.RpcError,
               response: ssn_ocrservice_v1_ocrservice_pb.OcrScanImageResponse) => void
  ): grpcWeb.ClientReadableStream<ssn_ocrservice_v1_ocrservice_pb.OcrScanImageResponse>;

  getTextAnnotation(
    request: ssn_ocrservice_v1_ocrservice_pb.GetTextAnnotationRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.RpcError,
               response: ssn_ocrservice_v1_ocrservice_pb.GetTextAnnotationResponse) => void
  ): grpcWeb.ClientReadableStream<ssn_ocrservice_v1_ocrservice_pb.GetTextAnnotationResponse>;

  getTextAnnotations(
    request: ssn_ocrservice_v1_ocrservice_pb.GetTextAnnotationRequest,
    metadata?: grpcWeb.Metadata
  ): grpcWeb.ClientReadableStream<ssn_ocrservice_v1_ocrservice_pb.GetTextAnnotationResponse>;

  processImage(
    request: ssn_ocrservice_v1_ocrservice_pb.ProcessImageRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.RpcError,
               response: ssn_ocrservice_v1_ocrservice_pb.ProcessImageResponse) => void
  ): grpcWeb.ClientReadableStream<ssn_ocrservice_v1_ocrservice_pb.ProcessImageResponse>;

  asyncCreateOperation(
    request: ssn_ocrservice_v1_ocrservice_pb.AsyncCreateOperationRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.RpcError,
               response: ssn_ocrservice_v1_ocrservice_pb.AsyncCreateOperationResponse) => void
  ): grpcWeb.ClientReadableStream<ssn_ocrservice_v1_ocrservice_pb.AsyncCreateOperationResponse>;

  asyncGetOperationStatus(
    request: ssn_ocrservice_v1_ocrservice_pb.AsyncGetOperationStatusRequest,
    metadata?: grpcWeb.Metadata
  ): grpcWeb.ClientReadableStream<ssn_ocrservice_v1_ocrservice_pb.AsyncGetOperationStatusResponse>;

}

export class OcrServicePromiseClient {
  constructor (hostname: string,
               credentials?: null | { [index: string]: string; },
               options?: null | { [index: string]: any; });

  ocrScanImage(
    request: ssn_ocrservice_v1_ocrservice_pb.OcrScanImageRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<ssn_ocrservice_v1_ocrservice_pb.OcrScanImageResponse>;

  getTextAnnotation(
    request: ssn_ocrservice_v1_ocrservice_pb.GetTextAnnotationRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<ssn_ocrservice_v1_ocrservice_pb.GetTextAnnotationResponse>;

  getTextAnnotations(
    request: ssn_ocrservice_v1_ocrservice_pb.GetTextAnnotationRequest,
    metadata?: grpcWeb.Metadata
  ): grpcWeb.ClientReadableStream<ssn_ocrservice_v1_ocrservice_pb.GetTextAnnotationResponse>;

  processImage(
    request: ssn_ocrservice_v1_ocrservice_pb.ProcessImageRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<ssn_ocrservice_v1_ocrservice_pb.ProcessImageResponse>;

  asyncCreateOperation(
    request: ssn_ocrservice_v1_ocrservice_pb.AsyncCreateOperationRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<ssn_ocrservice_v1_ocrservice_pb.AsyncCreateOperationResponse>;

  asyncGetOperationStatus(
    request: ssn_ocrservice_v1_ocrservice_pb.AsyncGetOperationStatusRequest,
    metadata?: grpcWeb.Metadata
  ): grpcWeb.ClientReadableStream<ssn_ocrservice_v1_ocrservice_pb.AsyncGetOperationStatusResponse>;

}

