import * as grpcWeb from 'grpc-web';

import * as google_protobuf_empty_pb from 'google-protobuf/google/protobuf/empty_pb'; // proto import: "google/protobuf/empty.proto"
import * as ssn_hubixservice_v1_hubixservice_pb from '../../../ssn/hubixservice/v1/hubixservice_pb'; // proto import: "ssn/hubixservice/v1/hubixservice.proto"


export class HubixServiceClient {
  constructor (hostname: string,
               credentials?: null | { [index: string]: string; },
               options?: null | { [index: string]: any; });

  startVerification(
    request: ssn_hubixservice_v1_hubixservice_pb.StartVerificationRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.RpcError,
               response: ssn_hubixservice_v1_hubixservice_pb.Verification) => void
  ): grpcWeb.ClientReadableStream<ssn_hubixservice_v1_hubixservice_pb.Verification>;

  getVerification(
    request: ssn_hubixservice_v1_hubixservice_pb.GetVerificationRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.RpcError,
               response: ssn_hubixservice_v1_hubixservice_pb.Verification) => void
  ): grpcWeb.ClientReadableStream<ssn_hubixservice_v1_hubixservice_pb.Verification>;

  deleteVerifications(
    request: ssn_hubixservice_v1_hubixservice_pb.DeleteVerificationsRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.RpcError,
               response: google_protobuf_empty_pb.Empty) => void
  ): grpcWeb.ClientReadableStream<google_protobuf_empty_pb.Empty>;

}

export class HubixServicePromiseClient {
  constructor (hostname: string,
               credentials?: null | { [index: string]: string; },
               options?: null | { [index: string]: any; });

  startVerification(
    request: ssn_hubixservice_v1_hubixservice_pb.StartVerificationRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<ssn_hubixservice_v1_hubixservice_pb.Verification>;

  getVerification(
    request: ssn_hubixservice_v1_hubixservice_pb.GetVerificationRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<ssn_hubixservice_v1_hubixservice_pb.Verification>;

  deleteVerifications(
    request: ssn_hubixservice_v1_hubixservice_pb.DeleteVerificationsRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<google_protobuf_empty_pb.Empty>;

}

