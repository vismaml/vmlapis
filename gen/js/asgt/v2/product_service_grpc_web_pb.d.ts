import * as grpcWeb from 'grpc-web';

import * as asgt_v2_product_service_pb from '../../asgt/v2/product_service_pb'; // proto import: "asgt/v2/product_service.proto"
import * as google_protobuf_empty_pb from 'google-protobuf/google/protobuf/empty_pb'; // proto import: "google/protobuf/empty.proto"


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

  internalBatchSuggest(
    request: asgt_v2_product_service_pb.ProductTypeBatchSuggestRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.RpcError,
               response: asgt_v2_product_service_pb.ProductTypeBatchSuggestResponse) => void
  ): grpcWeb.ClientReadableStream<asgt_v2_product_service_pb.ProductTypeBatchSuggestResponse>;

  feedback(
    request: asgt_v2_product_service_pb.ProductTypeFeedbackRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.RpcError,
               response: google_protobuf_empty_pb.Empty) => void
  ): grpcWeb.ClientReadableStream<google_protobuf_empty_pb.Empty>;

}

export class ProductTypeServicePromiseClient {
  constructor (hostname: string,
               credentials?: null | { [index: string]: string; },
               options?: null | { [index: string]: any; });

  batchSuggest(
    request: asgt_v2_product_service_pb.ProductTypeBatchSuggestRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<asgt_v2_product_service_pb.ProductTypeBatchSuggestResponse>;

  internalBatchSuggest(
    request: asgt_v2_product_service_pb.ProductTypeBatchSuggestRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<asgt_v2_product_service_pb.ProductTypeBatchSuggestResponse>;

  feedback(
    request: asgt_v2_product_service_pb.ProductTypeFeedbackRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<google_protobuf_empty_pb.Empty>;

}

