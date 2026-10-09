package ai.visma.ssn.annotator.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Extract data from documents and get the results in the same call.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.70.0)",
    comments = "Source: ssn/annotator/v1/annotator.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DocumentAnnotatorGrpc {

  private DocumentAnnotatorGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ssn.annotator.v1.DocumentAnnotator";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.visma.ssn.annotator.v1.DocumentAnnotatorRequest,
      ai.visma.ssn.annotator.v1.DocumentAnnotatorResponse> getAnnotateDocumentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AnnotateDocument",
      requestType = ai.visma.ssn.annotator.v1.DocumentAnnotatorRequest.class,
      responseType = ai.visma.ssn.annotator.v1.DocumentAnnotatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.ssn.annotator.v1.DocumentAnnotatorRequest,
      ai.visma.ssn.annotator.v1.DocumentAnnotatorResponse> getAnnotateDocumentMethod() {
    io.grpc.MethodDescriptor<ai.visma.ssn.annotator.v1.DocumentAnnotatorRequest, ai.visma.ssn.annotator.v1.DocumentAnnotatorResponse> getAnnotateDocumentMethod;
    if ((getAnnotateDocumentMethod = DocumentAnnotatorGrpc.getAnnotateDocumentMethod) == null) {
      synchronized (DocumentAnnotatorGrpc.class) {
        if ((getAnnotateDocumentMethod = DocumentAnnotatorGrpc.getAnnotateDocumentMethod) == null) {
          DocumentAnnotatorGrpc.getAnnotateDocumentMethod = getAnnotateDocumentMethod =
              io.grpc.MethodDescriptor.<ai.visma.ssn.annotator.v1.DocumentAnnotatorRequest, ai.visma.ssn.annotator.v1.DocumentAnnotatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AnnotateDocument"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.annotator.v1.DocumentAnnotatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.annotator.v1.DocumentAnnotatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DocumentAnnotatorMethodDescriptorSupplier("AnnotateDocument"))
              .build();
        }
      }
    }
    return getAnnotateDocumentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.ssn.annotator.v1.DocumentQuestionRequest,
      ai.visma.ssn.annotator.v1.DocumentQuestionResponse> getAnswerDocumentQuestionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AnswerDocumentQuestion",
      requestType = ai.visma.ssn.annotator.v1.DocumentQuestionRequest.class,
      responseType = ai.visma.ssn.annotator.v1.DocumentQuestionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.ssn.annotator.v1.DocumentQuestionRequest,
      ai.visma.ssn.annotator.v1.DocumentQuestionResponse> getAnswerDocumentQuestionMethod() {
    io.grpc.MethodDescriptor<ai.visma.ssn.annotator.v1.DocumentQuestionRequest, ai.visma.ssn.annotator.v1.DocumentQuestionResponse> getAnswerDocumentQuestionMethod;
    if ((getAnswerDocumentQuestionMethod = DocumentAnnotatorGrpc.getAnswerDocumentQuestionMethod) == null) {
      synchronized (DocumentAnnotatorGrpc.class) {
        if ((getAnswerDocumentQuestionMethod = DocumentAnnotatorGrpc.getAnswerDocumentQuestionMethod) == null) {
          DocumentAnnotatorGrpc.getAnswerDocumentQuestionMethod = getAnswerDocumentQuestionMethod =
              io.grpc.MethodDescriptor.<ai.visma.ssn.annotator.v1.DocumentQuestionRequest, ai.visma.ssn.annotator.v1.DocumentQuestionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AnswerDocumentQuestion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.annotator.v1.DocumentQuestionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.annotator.v1.DocumentQuestionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DocumentAnnotatorMethodDescriptorSupplier("AnswerDocumentQuestion"))
              .build();
        }
      }
    }
    return getAnswerDocumentQuestionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DocumentAnnotatorStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DocumentAnnotatorStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DocumentAnnotatorStub>() {
        @java.lang.Override
        public DocumentAnnotatorStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DocumentAnnotatorStub(channel, callOptions);
        }
      };
    return DocumentAnnotatorStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static DocumentAnnotatorBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DocumentAnnotatorBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DocumentAnnotatorBlockingV2Stub>() {
        @java.lang.Override
        public DocumentAnnotatorBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DocumentAnnotatorBlockingV2Stub(channel, callOptions);
        }
      };
    return DocumentAnnotatorBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DocumentAnnotatorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DocumentAnnotatorBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DocumentAnnotatorBlockingStub>() {
        @java.lang.Override
        public DocumentAnnotatorBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DocumentAnnotatorBlockingStub(channel, callOptions);
        }
      };
    return DocumentAnnotatorBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DocumentAnnotatorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DocumentAnnotatorFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DocumentAnnotatorFutureStub>() {
        @java.lang.Override
        public DocumentAnnotatorFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DocumentAnnotatorFutureStub(channel, callOptions);
        }
      };
    return DocumentAnnotatorFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Extract data from documents and get the results in the same call.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Extract data from a document.
     * Send the document, as base64 `content` or as a `source.httpUri` to download it
     * from, and the `features` to extract. `DEFAULT` extracts a set of frequently used
     * fields. The results come back in the same call. For large documents, and for the
     * ULTRA tier, use Smartscan Async.
     * By default, most features return at most one candidate, and only with the
     * confidence level HIGH or higher. Set `maxResults` and `minConfidence` on the feature
     * to change this. Without a `tier`, the request is processed as PREMIUM. A document
     * without readable text returns an empty response.
     * To correct the results, send the `feedbackId` from the response to
     * POST /v1/feedback:create.
     * Errors: 400 when the document can't be downloaded from `source.httpUri` or can't be
     * read. Requests larger than 10 MiB are rejected.
     * </pre>
     */
    default void annotateDocument(ai.visma.ssn.annotator.v1.DocumentAnnotatorRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.annotator.v1.DocumentAnnotatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAnnotateDocumentMethod(), responseObserver);
    }

    /**
     * <pre>
     * [NOT IMPLEMENTED] Answer questions about a document.
     * REST calls return 404 and gRPC calls return UNIMPLEMENTED. Send your questions in
     * the `questions` field of POST /v1/document:annotate, or of an async transaction,
     * instead.
     * </pre>
     */
    default void answerDocumentQuestion(ai.visma.ssn.annotator.v1.DocumentQuestionRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.annotator.v1.DocumentQuestionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAnswerDocumentQuestionMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DocumentAnnotator.
   * <pre>
   * Extract data from documents and get the results in the same call.
   * </pre>
   */
  public static abstract class DocumentAnnotatorImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DocumentAnnotatorGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DocumentAnnotator.
   * <pre>
   * Extract data from documents and get the results in the same call.
   * </pre>
   */
  public static final class DocumentAnnotatorStub
      extends io.grpc.stub.AbstractAsyncStub<DocumentAnnotatorStub> {
    private DocumentAnnotatorStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DocumentAnnotatorStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DocumentAnnotatorStub(channel, callOptions);
    }

    /**
     * <pre>
     * Extract data from a document.
     * Send the document, as base64 `content` or as a `source.httpUri` to download it
     * from, and the `features` to extract. `DEFAULT` extracts a set of frequently used
     * fields. The results come back in the same call. For large documents, and for the
     * ULTRA tier, use Smartscan Async.
     * By default, most features return at most one candidate, and only with the
     * confidence level HIGH or higher. Set `maxResults` and `minConfidence` on the feature
     * to change this. Without a `tier`, the request is processed as PREMIUM. A document
     * without readable text returns an empty response.
     * To correct the results, send the `feedbackId` from the response to
     * POST /v1/feedback:create.
     * Errors: 400 when the document can't be downloaded from `source.httpUri` or can't be
     * read. Requests larger than 10 MiB are rejected.
     * </pre>
     */
    public void annotateDocument(ai.visma.ssn.annotator.v1.DocumentAnnotatorRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.annotator.v1.DocumentAnnotatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAnnotateDocumentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * [NOT IMPLEMENTED] Answer questions about a document.
     * REST calls return 404 and gRPC calls return UNIMPLEMENTED. Send your questions in
     * the `questions` field of POST /v1/document:annotate, or of an async transaction,
     * instead.
     * </pre>
     */
    public void answerDocumentQuestion(ai.visma.ssn.annotator.v1.DocumentQuestionRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.annotator.v1.DocumentQuestionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAnswerDocumentQuestionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DocumentAnnotator.
   * <pre>
   * Extract data from documents and get the results in the same call.
   * </pre>
   */
  public static final class DocumentAnnotatorBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<DocumentAnnotatorBlockingV2Stub> {
    private DocumentAnnotatorBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DocumentAnnotatorBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DocumentAnnotatorBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Extract data from a document.
     * Send the document, as base64 `content` or as a `source.httpUri` to download it
     * from, and the `features` to extract. `DEFAULT` extracts a set of frequently used
     * fields. The results come back in the same call. For large documents, and for the
     * ULTRA tier, use Smartscan Async.
     * By default, most features return at most one candidate, and only with the
     * confidence level HIGH or higher. Set `maxResults` and `minConfidence` on the feature
     * to change this. Without a `tier`, the request is processed as PREMIUM. A document
     * without readable text returns an empty response.
     * To correct the results, send the `feedbackId` from the response to
     * POST /v1/feedback:create.
     * Errors: 400 when the document can't be downloaded from `source.httpUri` or can't be
     * read. Requests larger than 10 MiB are rejected.
     * </pre>
     */
    public ai.visma.ssn.annotator.v1.DocumentAnnotatorResponse annotateDocument(ai.visma.ssn.annotator.v1.DocumentAnnotatorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAnnotateDocumentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * [NOT IMPLEMENTED] Answer questions about a document.
     * REST calls return 404 and gRPC calls return UNIMPLEMENTED. Send your questions in
     * the `questions` field of POST /v1/document:annotate, or of an async transaction,
     * instead.
     * </pre>
     */
    public ai.visma.ssn.annotator.v1.DocumentQuestionResponse answerDocumentQuestion(ai.visma.ssn.annotator.v1.DocumentQuestionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAnswerDocumentQuestionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service DocumentAnnotator.
   * <pre>
   * Extract data from documents and get the results in the same call.
   * </pre>
   */
  public static final class DocumentAnnotatorBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DocumentAnnotatorBlockingStub> {
    private DocumentAnnotatorBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DocumentAnnotatorBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DocumentAnnotatorBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Extract data from a document.
     * Send the document, as base64 `content` or as a `source.httpUri` to download it
     * from, and the `features` to extract. `DEFAULT` extracts a set of frequently used
     * fields. The results come back in the same call. For large documents, and for the
     * ULTRA tier, use Smartscan Async.
     * By default, most features return at most one candidate, and only with the
     * confidence level HIGH or higher. Set `maxResults` and `minConfidence` on the feature
     * to change this. Without a `tier`, the request is processed as PREMIUM. A document
     * without readable text returns an empty response.
     * To correct the results, send the `feedbackId` from the response to
     * POST /v1/feedback:create.
     * Errors: 400 when the document can't be downloaded from `source.httpUri` or can't be
     * read. Requests larger than 10 MiB are rejected.
     * </pre>
     */
    public ai.visma.ssn.annotator.v1.DocumentAnnotatorResponse annotateDocument(ai.visma.ssn.annotator.v1.DocumentAnnotatorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAnnotateDocumentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * [NOT IMPLEMENTED] Answer questions about a document.
     * REST calls return 404 and gRPC calls return UNIMPLEMENTED. Send your questions in
     * the `questions` field of POST /v1/document:annotate, or of an async transaction,
     * instead.
     * </pre>
     */
    public ai.visma.ssn.annotator.v1.DocumentQuestionResponse answerDocumentQuestion(ai.visma.ssn.annotator.v1.DocumentQuestionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAnswerDocumentQuestionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DocumentAnnotator.
   * <pre>
   * Extract data from documents and get the results in the same call.
   * </pre>
   */
  public static final class DocumentAnnotatorFutureStub
      extends io.grpc.stub.AbstractFutureStub<DocumentAnnotatorFutureStub> {
    private DocumentAnnotatorFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DocumentAnnotatorFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DocumentAnnotatorFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Extract data from a document.
     * Send the document, as base64 `content` or as a `source.httpUri` to download it
     * from, and the `features` to extract. `DEFAULT` extracts a set of frequently used
     * fields. The results come back in the same call. For large documents, and for the
     * ULTRA tier, use Smartscan Async.
     * By default, most features return at most one candidate, and only with the
     * confidence level HIGH or higher. Set `maxResults` and `minConfidence` on the feature
     * to change this. Without a `tier`, the request is processed as PREMIUM. A document
     * without readable text returns an empty response.
     * To correct the results, send the `feedbackId` from the response to
     * POST /v1/feedback:create.
     * Errors: 400 when the document can't be downloaded from `source.httpUri` or can't be
     * read. Requests larger than 10 MiB are rejected.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.ssn.annotator.v1.DocumentAnnotatorResponse> annotateDocument(
        ai.visma.ssn.annotator.v1.DocumentAnnotatorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAnnotateDocumentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * [NOT IMPLEMENTED] Answer questions about a document.
     * REST calls return 404 and gRPC calls return UNIMPLEMENTED. Send your questions in
     * the `questions` field of POST /v1/document:annotate, or of an async transaction,
     * instead.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.ssn.annotator.v1.DocumentQuestionResponse> answerDocumentQuestion(
        ai.visma.ssn.annotator.v1.DocumentQuestionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAnswerDocumentQuestionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ANNOTATE_DOCUMENT = 0;
  private static final int METHODID_ANSWER_DOCUMENT_QUESTION = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ANNOTATE_DOCUMENT:
          serviceImpl.annotateDocument((ai.visma.ssn.annotator.v1.DocumentAnnotatorRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.ssn.annotator.v1.DocumentAnnotatorResponse>) responseObserver);
          break;
        case METHODID_ANSWER_DOCUMENT_QUESTION:
          serviceImpl.answerDocumentQuestion((ai.visma.ssn.annotator.v1.DocumentQuestionRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.ssn.annotator.v1.DocumentQuestionResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getAnnotateDocumentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.ssn.annotator.v1.DocumentAnnotatorRequest,
              ai.visma.ssn.annotator.v1.DocumentAnnotatorResponse>(
                service, METHODID_ANNOTATE_DOCUMENT)))
        .addMethod(
          getAnswerDocumentQuestionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.ssn.annotator.v1.DocumentQuestionRequest,
              ai.visma.ssn.annotator.v1.DocumentQuestionResponse>(
                service, METHODID_ANSWER_DOCUMENT_QUESTION)))
        .build();
  }

  private static abstract class DocumentAnnotatorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DocumentAnnotatorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.visma.ssn.annotator.v1.AnnotatorProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DocumentAnnotator");
    }
  }

  private static final class DocumentAnnotatorFileDescriptorSupplier
      extends DocumentAnnotatorBaseDescriptorSupplier {
    DocumentAnnotatorFileDescriptorSupplier() {}
  }

  private static final class DocumentAnnotatorMethodDescriptorSupplier
      extends DocumentAnnotatorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DocumentAnnotatorMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DocumentAnnotatorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DocumentAnnotatorFileDescriptorSupplier())
              .addMethod(getAnnotateDocumentMethod())
              .addMethod(getAnswerDocumentQuestionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
