import * as grpcWeb from 'grpc-web';

import * as ssn_geo_v1_geo_service_pb from '../../../ssn/geo/v1/geo_service_pb'; // proto import: "ssn/geo/v1/geo_service.proto"


export class GeoServiceClient {
  constructor (hostname: string,
               credentials?: null | { [index: string]: string; },
               options?: null | { [index: string]: any; });

  validateAddresses(
    request: ssn_geo_v1_geo_service_pb.ValidateAddressesRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.RpcError,
               response: ssn_geo_v1_geo_service_pb.ValidateAddressesResponse) => void
  ): grpcWeb.ClientReadableStream<ssn_geo_v1_geo_service_pb.ValidateAddressesResponse>;

}

export class GeoServicePromiseClient {
  constructor (hostname: string,
               credentials?: null | { [index: string]: string; },
               options?: null | { [index: string]: any; });

  validateAddresses(
    request: ssn_geo_v1_geo_service_pb.ValidateAddressesRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<ssn_geo_v1_geo_service_pb.ValidateAddressesResponse>;

}

