import * as grpcWeb from 'grpc-web';

import * as ssn_ocrservice_v1_ocrservice_pb from '../../../ssn/ocrservice/v1/ocrservice_pb';


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

}

