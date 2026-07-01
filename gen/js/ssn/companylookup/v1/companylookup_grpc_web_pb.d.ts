import * as grpcWeb from 'grpc-web';

import * as ssn_companylookup_v1_companylookup_pb from '../../../ssn/companylookup/v1/companylookup_pb'; // proto import: "ssn/companylookup/v1/companylookup.proto"


export class CompanyLookupServiceClient {
  constructor (hostname: string,
               credentials?: null | { [index: string]: string; },
               options?: null | { [index: string]: any; });

  processInvoiceCompanyData(
    request: ssn_companylookup_v1_companylookup_pb.ProcessInvoiceCompanyDataRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.RpcError,
               response: ssn_companylookup_v1_companylookup_pb.ProcessInvoiceCompanyDataResponse) => void
  ): grpcWeb.ClientReadableStream<ssn_companylookup_v1_companylookup_pb.ProcessInvoiceCompanyDataResponse>;

}

export class CompanyLookupServicePromiseClient {
  constructor (hostname: string,
               credentials?: null | { [index: string]: string; },
               options?: null | { [index: string]: any; });

  processInvoiceCompanyData(
    request: ssn_companylookup_v1_companylookup_pb.ProcessInvoiceCompanyDataRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<ssn_companylookup_v1_companylookup_pb.ProcessInvoiceCompanyDataResponse>;

}

