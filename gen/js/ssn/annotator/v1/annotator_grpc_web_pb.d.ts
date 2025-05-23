import * as grpcWeb from 'grpc-web';

import * as ssn_annotator_v1_annotator_pb from '../../../ssn/annotator/v1/annotator_pb'; // proto import: "ssn/annotator/v1/annotator.proto"


export class DocumentAnnotatorClient {
  constructor (hostname: string,
               credentials?: null | { [index: string]: string; },
               options?: null | { [index: string]: any; });

  annotateDocument(
    request: ssn_annotator_v1_annotator_pb.DocumentAnnotatorRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.RpcError,
               response: ssn_annotator_v1_annotator_pb.DocumentAnnotatorResponse) => void
  ): grpcWeb.ClientReadableStream<ssn_annotator_v1_annotator_pb.DocumentAnnotatorResponse>;

  answerDocumentQuestion(
    request: ssn_annotator_v1_annotator_pb.DocumentQuestionRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.RpcError,
               response: ssn_annotator_v1_annotator_pb.DocumentQuestionResponse) => void
  ): grpcWeb.ClientReadableStream<ssn_annotator_v1_annotator_pb.DocumentQuestionResponse>;

  generateStructuredAnswer(
    request: ssn_annotator_v1_annotator_pb.GenerateStructuredAnswerRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.RpcError,
               response: ssn_annotator_v1_annotator_pb.GenerateStructuredAnswerResponse) => void
  ): grpcWeb.ClientReadableStream<ssn_annotator_v1_annotator_pb.GenerateStructuredAnswerResponse>;

}

export class DocumentAnnotatorPromiseClient {
  constructor (hostname: string,
               credentials?: null | { [index: string]: string; },
               options?: null | { [index: string]: any; });

  annotateDocument(
    request: ssn_annotator_v1_annotator_pb.DocumentAnnotatorRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<ssn_annotator_v1_annotator_pb.DocumentAnnotatorResponse>;

  answerDocumentQuestion(
    request: ssn_annotator_v1_annotator_pb.DocumentQuestionRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<ssn_annotator_v1_annotator_pb.DocumentQuestionResponse>;

  generateStructuredAnswer(
    request: ssn_annotator_v1_annotator_pb.GenerateStructuredAnswerRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<ssn_annotator_v1_annotator_pb.GenerateStructuredAnswerResponse>;

}

