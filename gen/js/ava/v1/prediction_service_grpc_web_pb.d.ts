import * as grpcWeb from 'grpc-web';

import * as ava_v1_prediction_service_pb from '../../ava/v1/prediction_service_pb'; // proto import: "ava/v1/prediction_service.proto"


export class PredictionServiceClient {
  constructor (hostname: string,
               credentials?: null | { [index: string]: string; },
               options?: null | { [index: string]: any; });

  decide(
    request: ava_v1_prediction_service_pb.DecideRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.RpcError,
               response: ava_v1_prediction_service_pb.DecideResponse) => void
  ): grpcWeb.ClientReadableStream<ava_v1_prediction_service_pb.DecideResponse>;

  getDecision(
    request: ava_v1_prediction_service_pb.GetDecisionRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.RpcError,
               response: ava_v1_prediction_service_pb.DecideResponse) => void
  ): grpcWeb.ClientReadableStream<ava_v1_prediction_service_pb.DecideResponse>;

  getProcedure(
    request: ava_v1_prediction_service_pb.GetProcedureRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.RpcError,
               response: ava_v1_prediction_service_pb.GetProcedureResponse) => void
  ): grpcWeb.ClientReadableStream<ava_v1_prediction_service_pb.GetProcedureResponse>;

}

export class PredictionServicePromiseClient {
  constructor (hostname: string,
               credentials?: null | { [index: string]: string; },
               options?: null | { [index: string]: any; });

  decide(
    request: ava_v1_prediction_service_pb.DecideRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<ava_v1_prediction_service_pb.DecideResponse>;

  getDecision(
    request: ava_v1_prediction_service_pb.GetDecisionRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<ava_v1_prediction_service_pb.DecideResponse>;

  getProcedure(
    request: ava_v1_prediction_service_pb.GetProcedureRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<ava_v1_prediction_service_pb.GetProcedureResponse>;

}

