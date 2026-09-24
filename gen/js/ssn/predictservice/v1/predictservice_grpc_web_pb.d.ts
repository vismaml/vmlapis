import * as grpcWeb from 'grpc-web';

import * as ssn_predictservice_v1_predictservice_pb from '../../../ssn/predictservice/v1/predictservice_pb'; // proto import: "ssn/predictservice/v1/predictservice.proto"


export class PredictServiceClient {
  constructor (hostname: string,
               credentials?: null | { [index: string]: string; },
               options?: null | { [index: string]: any; });

  predict(
    request: ssn_predictservice_v1_predictservice_pb.ModelInferRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.RpcError,
               response: ssn_predictservice_v1_predictservice_pb.ModelInferResponse) => void
  ): grpcWeb.ClientReadableStream<ssn_predictservice_v1_predictservice_pb.ModelInferResponse>;

}

export class PredictServicePromiseClient {
  constructor (hostname: string,
               credentials?: null | { [index: string]: string; },
               options?: null | { [index: string]: any; });

  predict(
    request: ssn_predictservice_v1_predictservice_pb.ModelInferRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<ssn_predictservice_v1_predictservice_pb.ModelInferResponse>;

}

