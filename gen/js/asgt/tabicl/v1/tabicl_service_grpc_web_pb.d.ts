import * as grpcWeb from 'grpc-web';

import * as asgt_tabicl_v1_tabicl_service_pb from '../../../asgt/tabicl/v1/tabicl_service_pb'; // proto import: "asgt/tabicl/v1/tabicl_service.proto"


export class TabiclServiceClient {
  constructor (hostname: string,
               credentials?: null | { [index: string]: string; },
               options?: null | { [index: string]: any; });

  batchSuggest(
    request: asgt_tabicl_v1_tabicl_service_pb.BatchSuggestRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.RpcError,
               response: asgt_tabicl_v1_tabicl_service_pb.BatchSuggestResponse) => void
  ): grpcWeb.ClientReadableStream<asgt_tabicl_v1_tabicl_service_pb.BatchSuggestResponse>;

}

export class TabiclServicePromiseClient {
  constructor (hostname: string,
               credentials?: null | { [index: string]: string; },
               options?: null | { [index: string]: any; });

  batchSuggest(
    request: asgt_tabicl_v1_tabicl_service_pb.BatchSuggestRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<asgt_tabicl_v1_tabicl_service_pb.BatchSuggestResponse>;

}

