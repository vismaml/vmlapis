import * as grpcWeb from 'grpc-web';

import * as ssn_documentdataservice_v1_document_data_service_pb from '../../../ssn/documentdataservice/v1/document_data_service_pb'; // proto import: "ssn/documentdataservice/v1/document_data_service.proto"


export class DocumentDataServiceClient {
  constructor (hostname: string,
               credentials?: null | { [index: string]: string; },
               options?: null | { [index: string]: any; });

  getDocumentData(
    request: ssn_documentdataservice_v1_document_data_service_pb.GetDocumentDataRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.RpcError,
               response: ssn_documentdataservice_v1_document_data_service_pb.GetDocumentDataResponse) => void
  ): grpcWeb.ClientReadableStream<ssn_documentdataservice_v1_document_data_service_pb.GetDocumentDataResponse>;

}

export class DocumentDataServicePromiseClient {
  constructor (hostname: string,
               credentials?: null | { [index: string]: string; },
               options?: null | { [index: string]: any; });

  getDocumentData(
    request: ssn_documentdataservice_v1_document_data_service_pb.GetDocumentDataRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<ssn_documentdataservice_v1_document_data_service_pb.GetDocumentDataResponse>;

}

