import * as grpcWeb from 'grpc-web';

import * as asgt_v2_product_service_pb from '../../asgt/v2/product_service_pb'; // proto import: "asgt/v2/product_service.proto"


export class ProductTypeServiceClient {
  constructor (hostname: string,
               credentials?: null | { [index: string]: string; },
               options?: null | { [index: string]: any; });

  batchSuggest(
    request: asgt_v2_product_service_pb.ProductTypeBatchSuggestRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.RpcError,
               response: asgt_v2_product_service_pb.ProductTypeBatchSuggestResponse) => void
  ): grpcWeb.ClientReadableStream<asgt_v2_product_service_pb.ProductTypeBatchSuggestResponse>;

}

export class ProductTypeServicePromiseClient {
  constructor (hostname: string,
               credentials?: null | { [index: string]: string; },
               options?: null | { [index: string]: any; });

  batchSuggest(
    request: asgt_v2_product_service_pb.ProductTypeBatchSuggestRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<asgt_v2_product_service_pb.ProductTypeBatchSuggestResponse>;

}

