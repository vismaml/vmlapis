import * as grpcWeb from 'grpc-web';

import * as ssn_documentdataservice_v1_documentdataservice_pb from '../../../ssn/documentdataservice/v1/documentdataservice_pb'; // proto import: "ssn/documentdataservice/v1/documentdataservice.proto"


export class DocumentDataServiceClient {
  constructor (hostname: string,
               credentials?: null | { [index: string]: string; },
               options?: null | { [index: string]: any; });

  getDocumentData(
    request: ssn_documentdataservice_v1_documentdataservice_pb.GetDocumentDataRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.RpcError,
               response: ssn_documentdataservice_v1_documentdataservice_pb.GetDocumentDataResponse) => void
  ): grpcWeb.ClientReadableStream<ssn_documentdataservice_v1_documentdataservice_pb.GetDocumentDataResponse>;

  setDocumentBlobs(
    request: ssn_documentdataservice_v1_documentdataservice_pb.SetDocumentBlobsRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.RpcError,
               response: ssn_documentdataservice_v1_documentdataservice_pb.SetDocumentBlobsResponse) => void
  ): grpcWeb.ClientReadableStream<ssn_documentdataservice_v1_documentdataservice_pb.SetDocumentBlobsResponse>;

  addAnnotations(
    request: ssn_documentdataservice_v1_documentdataservice_pb.AddAnnotationsRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.RpcError,
               response: ssn_documentdataservice_v1_documentdataservice_pb.AddAnnotationsResponse) => void
  ): grpcWeb.ClientReadableStream<ssn_documentdataservice_v1_documentdataservice_pb.AddAnnotationsResponse>;

}

export class DocumentDataServicePromiseClient {
  constructor (hostname: string,
               credentials?: null | { [index: string]: string; },
               options?: null | { [index: string]: any; });

  getDocumentData(
    request: ssn_documentdataservice_v1_documentdataservice_pb.GetDocumentDataRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<ssn_documentdataservice_v1_documentdataservice_pb.GetDocumentDataResponse>;

  setDocumentBlobs(
    request: ssn_documentdataservice_v1_documentdataservice_pb.SetDocumentBlobsRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<ssn_documentdataservice_v1_documentdataservice_pb.SetDocumentBlobsResponse>;

  addAnnotations(
    request: ssn_documentdataservice_v1_documentdataservice_pb.AddAnnotationsRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<ssn_documentdataservice_v1_documentdataservice_pb.AddAnnotationsResponse>;

}

