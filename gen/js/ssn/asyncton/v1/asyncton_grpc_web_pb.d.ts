import * as grpcWeb from 'grpc-web';

import * as google_protobuf_empty_pb from 'google-protobuf/google/protobuf/empty_pb'; // proto import: "google/protobuf/empty.proto"
import * as ssn_asyncton_v1_asyncton_pb from '../../../ssn/asyncton/v1/asyncton_pb'; // proto import: "ssn/asyncton/v1/asyncton.proto"


export class TransactionServiceClient {
  constructor (hostname: string,
               credentials?: null | { [index: string]: string; },
               options?: null | { [index: string]: any; });

  createTransaction(
    request: ssn_asyncton_v1_asyncton_pb.CreateTransactionRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.RpcError,
               response: ssn_asyncton_v1_asyncton_pb.CreateTransactionResponse) => void
  ): grpcWeb.ClientReadableStream<ssn_asyncton_v1_asyncton_pb.CreateTransactionResponse>;

  getTransactionResults(
    request: ssn_asyncton_v1_asyncton_pb.GetTransactionResultsRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.RpcError,
               response: ssn_asyncton_v1_asyncton_pb.GetTransactionResultsResponse) => void
  ): grpcWeb.ClientReadableStream<ssn_asyncton_v1_asyncton_pb.GetTransactionResultsResponse>;

  getTransactionStatus(
    request: ssn_asyncton_v1_asyncton_pb.GetTransactionStatusRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.RpcError,
               response: ssn_asyncton_v1_asyncton_pb.GetTransactionStatusResponse) => void
  ): grpcWeb.ClientReadableStream<ssn_asyncton_v1_asyncton_pb.GetTransactionStatusResponse>;

  deleteTransaction(
    request: ssn_asyncton_v1_asyncton_pb.DeleteTransactionRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.RpcError,
               response: google_protobuf_empty_pb.Empty) => void
  ): grpcWeb.ClientReadableStream<google_protobuf_empty_pb.Empty>;

  deleteTag(
    request: ssn_asyncton_v1_asyncton_pb.DeleteTagRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.RpcError,
               response: google_protobuf_empty_pb.Empty) => void
  ): grpcWeb.ClientReadableStream<google_protobuf_empty_pb.Empty>;

  updateTransactionResults(
    request: ssn_asyncton_v1_asyncton_pb.UpdateTransactionResultsRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.RpcError,
               response: ssn_asyncton_v1_asyncton_pb.UpdateTransactionResultsResponse) => void
  ): grpcWeb.ClientReadableStream<ssn_asyncton_v1_asyncton_pb.UpdateTransactionResultsResponse>;

}

export class TransactionServicePromiseClient {
  constructor (hostname: string,
               credentials?: null | { [index: string]: string; },
               options?: null | { [index: string]: any; });

  createTransaction(
    request: ssn_asyncton_v1_asyncton_pb.CreateTransactionRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<ssn_asyncton_v1_asyncton_pb.CreateTransactionResponse>;

  getTransactionResults(
    request: ssn_asyncton_v1_asyncton_pb.GetTransactionResultsRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<ssn_asyncton_v1_asyncton_pb.GetTransactionResultsResponse>;

  getTransactionStatus(
    request: ssn_asyncton_v1_asyncton_pb.GetTransactionStatusRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<ssn_asyncton_v1_asyncton_pb.GetTransactionStatusResponse>;

  deleteTransaction(
    request: ssn_asyncton_v1_asyncton_pb.DeleteTransactionRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<google_protobuf_empty_pb.Empty>;

  deleteTag(
    request: ssn_asyncton_v1_asyncton_pb.DeleteTagRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<google_protobuf_empty_pb.Empty>;

  updateTransactionResults(
    request: ssn_asyncton_v1_asyncton_pb.UpdateTransactionResultsRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<ssn_asyncton_v1_asyncton_pb.UpdateTransactionResultsResponse>;

}

