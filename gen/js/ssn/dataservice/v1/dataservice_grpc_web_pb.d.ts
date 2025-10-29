import * as grpcWeb from 'grpc-web';

import * as google_protobuf_empty_pb from 'google-protobuf/google/protobuf/empty_pb'; // proto import: "google/protobuf/empty.proto"
import * as ssn_dataservice_v1_dataservice_pb from '../../../ssn/dataservice/v1/dataservice_pb'; // proto import: "ssn/dataservice/v1/dataservice.proto"


export class DataServiceClient {
  constructor (hostname: string,
               credentials?: null | { [index: string]: string; },
               options?: null | { [index: string]: any; });

  createDocument(
    request: ssn_dataservice_v1_dataservice_pb.CreateDocumentRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.RpcError,
               response: ssn_dataservice_v1_dataservice_pb.CreateDocumentResponse) => void
  ): grpcWeb.ClientReadableStream<ssn_dataservice_v1_dataservice_pb.CreateDocumentResponse>;

  readDocument(
    request: ssn_dataservice_v1_dataservice_pb.ReadDocumentRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.RpcError,
               response: ssn_dataservice_v1_dataservice_pb.ReadDocumentResponse) => void
  ): grpcWeb.ClientReadableStream<ssn_dataservice_v1_dataservice_pb.ReadDocumentResponse>;

  prepareFeedback(
    request: ssn_dataservice_v1_dataservice_pb.PrepareFeedbackRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.RpcError,
               response: google_protobuf_empty_pb.Empty) => void
  ): grpcWeb.ClientReadableStream<google_protobuf_empty_pb.Empty>;

  feedback(
    request: ssn_dataservice_v1_dataservice_pb.FeedbackRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.RpcError,
               response: google_protobuf_empty_pb.Empty) => void
  ): grpcWeb.ClientReadableStream<google_protobuf_empty_pb.Empty>;

  calculateMetrics(
    request: ssn_dataservice_v1_dataservice_pb.MetricsRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.RpcError,
               response: ssn_dataservice_v1_dataservice_pb.FeedbackMetrics) => void
  ): grpcWeb.ClientReadableStream<ssn_dataservice_v1_dataservice_pb.FeedbackMetrics>;

  delete(
    request: ssn_dataservice_v1_dataservice_pb.DeleteRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.RpcError,
               response: google_protobuf_empty_pb.Empty) => void
  ): grpcWeb.ClientReadableStream<google_protobuf_empty_pb.Empty>;

  callsPerMonthMetric(
    request: google_protobuf_empty_pb.Empty,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.RpcError,
               response: ssn_dataservice_v1_dataservice_pb.CallsPerMonthResponse) => void
  ): grpcWeb.ClientReadableStream<ssn_dataservice_v1_dataservice_pb.CallsPerMonthResponse>;

}

export class DataServicePromiseClient {
  constructor (hostname: string,
               credentials?: null | { [index: string]: string; },
               options?: null | { [index: string]: any; });

  createDocument(
    request: ssn_dataservice_v1_dataservice_pb.CreateDocumentRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<ssn_dataservice_v1_dataservice_pb.CreateDocumentResponse>;

  readDocument(
    request: ssn_dataservice_v1_dataservice_pb.ReadDocumentRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<ssn_dataservice_v1_dataservice_pb.ReadDocumentResponse>;

  prepareFeedback(
    request: ssn_dataservice_v1_dataservice_pb.PrepareFeedbackRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<google_protobuf_empty_pb.Empty>;

  feedback(
    request: ssn_dataservice_v1_dataservice_pb.FeedbackRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<google_protobuf_empty_pb.Empty>;

  calculateMetrics(
    request: ssn_dataservice_v1_dataservice_pb.MetricsRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<ssn_dataservice_v1_dataservice_pb.FeedbackMetrics>;

  delete(
    request: ssn_dataservice_v1_dataservice_pb.DeleteRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<google_protobuf_empty_pb.Empty>;

  callsPerMonthMetric(
    request: google_protobuf_empty_pb.Empty,
    metadata?: grpcWeb.Metadata
  ): Promise<ssn_dataservice_v1_dataservice_pb.CallsPerMonthResponse>;

}

