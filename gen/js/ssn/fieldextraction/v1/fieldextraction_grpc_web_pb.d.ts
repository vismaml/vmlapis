import * as grpcWeb from 'grpc-web';

import * as ssn_fieldextraction_v1_fieldextraction_pb from '../../../ssn/fieldextraction/v1/fieldextraction_pb'; // proto import: "ssn/fieldextraction/v1/fieldextraction.proto"


export class FieldExtractionServiceClient {
  constructor (hostname: string,
               credentials?: null | { [index: string]: string; },
               options?: null | { [index: string]: any; });

  extract(
    request: ssn_fieldextraction_v1_fieldextraction_pb.ExtractRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.RpcError,
               response: ssn_fieldextraction_v1_fieldextraction_pb.ExtractResponse) => void
  ): grpcWeb.ClientReadableStream<ssn_fieldextraction_v1_fieldextraction_pb.ExtractResponse>;

}

export class FieldExtractionServicePromiseClient {
  constructor (hostname: string,
               credentials?: null | { [index: string]: string; },
               options?: null | { [index: string]: any; });

  extract(
    request: ssn_fieldextraction_v1_fieldextraction_pb.ExtractRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<ssn_fieldextraction_v1_fieldextraction_pb.ExtractResponse>;

}

