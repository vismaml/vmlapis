import * as grpcWeb from 'grpc-web';

import * as ava_predict_v1_predict_pb from '../../../ava/predict/v1/predict_pb'; // proto import: "ava/predict/v1/predict.proto"


export class PredictorClient {
  constructor (hostname: string,
               credentials?: null | { [index: string]: string; },
               options?: null | { [index: string]: any; });

  predict(
    request: ava_predict_v1_predict_pb.PredictRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.RpcError,
               response: ava_predict_v1_predict_pb.PredictResponse) => void
  ): grpcWeb.ClientReadableStream<ava_predict_v1_predict_pb.PredictResponse>;

}

export class PredictorPromiseClient {
  constructor (hostname: string,
               credentials?: null | { [index: string]: string; },
               options?: null | { [index: string]: any; });

  predict(
    request: ava_predict_v1_predict_pb.PredictRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<ava_predict_v1_predict_pb.PredictResponse>;

}

