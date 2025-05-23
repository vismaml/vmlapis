package ai.visma.ssn.annotator.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
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

  private static volatile io.grpc.MethodDescriptor<ai.visma.ssn.annotator.v1.GenerateStructuredAnswerRequest,
      ai.visma.ssn.annotator.v1.GenerateStructuredAnswerResponse> getGenerateStructuredAnswerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateStructuredAnswer",
      requestType = ai.visma.ssn.annotator.v1.GenerateStructuredAnswerRequest.class,
      responseType = ai.visma.ssn.annotator.v1.GenerateStructuredAnswerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ai.visma.ssn.annotator.v1.GenerateStructuredAnswerRequest,
      ai.visma.ssn.annotator.v1.GenerateStructuredAnswerResponse> getGenerateStructuredAnswerMethod() {
    io.grpc.MethodDescriptor<ai.visma.ssn.annotator.v1.GenerateStructuredAnswerRequest, ai.visma.ssn.annotator.v1.GenerateStructuredAnswerResponse> getGenerateStructuredAnswerMethod;
    if ((getGenerateStructuredAnswerMethod = DocumentAnnotatorGrpc.getGenerateStructuredAnswerMethod) == null) {
      synchronized (DocumentAnnotatorGrpc.class) {
        if ((getGenerateStructuredAnswerMethod = DocumentAnnotatorGrpc.getGenerateStructuredAnswerMethod) == null) {
          DocumentAnnotatorGrpc.getGenerateStructuredAnswerMethod = getGenerateStructuredAnswerMethod =
              io.grpc.MethodDescriptor.<ai.visma.ssn.annotator.v1.GenerateStructuredAnswerRequest, ai.visma.ssn.annotator.v1.GenerateStructuredAnswerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateStructuredAnswer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.annotator.v1.GenerateStructuredAnswerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.annotator.v1.GenerateStructuredAnswerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DocumentAnnotatorMethodDescriptorSupplier("GenerateStructuredAnswer"))
              .build();
        }
      }
    }
    return getGenerateStructuredAnswerMethod;
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
   */
  public interface AsyncService {

    /**
     */
    default void annotateDocument(ai.visma.ssn.annotator.v1.DocumentAnnotatorRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.annotator.v1.DocumentAnnotatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAnnotateDocumentMethod(), responseObserver);
    }

    /**
     */
    default void answerDocumentQuestion(ai.visma.ssn.annotator.v1.DocumentQuestionRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.annotator.v1.DocumentQuestionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAnswerDocumentQuestionMethod(), responseObserver);
    }

    /**
     */
    default void generateStructuredAnswer(ai.visma.ssn.annotator.v1.GenerateStructuredAnswerRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.annotator.v1.GenerateStructuredAnswerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateStructuredAnswerMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DocumentAnnotator.
   */
  public static abstract class DocumentAnnotatorImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DocumentAnnotatorGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DocumentAnnotator.
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
     */
    public void annotateDocument(ai.visma.ssn.annotator.v1.DocumentAnnotatorRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.annotator.v1.DocumentAnnotatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAnnotateDocumentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void answerDocumentQuestion(ai.visma.ssn.annotator.v1.DocumentQuestionRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.annotator.v1.DocumentQuestionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAnswerDocumentQuestionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void generateStructuredAnswer(ai.visma.ssn.annotator.v1.GenerateStructuredAnswerRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.annotator.v1.GenerateStructuredAnswerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGenerateStructuredAnswerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DocumentAnnotator.
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
     */
    public ai.visma.ssn.annotator.v1.DocumentAnnotatorResponse annotateDocument(ai.visma.ssn.annotator.v1.DocumentAnnotatorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAnnotateDocumentMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.visma.ssn.annotator.v1.DocumentQuestionResponse answerDocumentQuestion(ai.visma.ssn.annotator.v1.DocumentQuestionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAnswerDocumentQuestionMethod(), getCallOptions(), request);
    }

    /**
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<?, ai.visma.ssn.annotator.v1.GenerateStructuredAnswerResponse>
        generateStructuredAnswer(ai.visma.ssn.annotator.v1.GenerateStructuredAnswerRequest request) {
      return io.grpc.stub.ClientCalls.blockingV2ServerStreamingCall(
          getChannel(), getGenerateStructuredAnswerMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service DocumentAnnotator.
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
     */
    public ai.visma.ssn.annotator.v1.DocumentAnnotatorResponse annotateDocument(ai.visma.ssn.annotator.v1.DocumentAnnotatorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAnnotateDocumentMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.visma.ssn.annotator.v1.DocumentQuestionResponse answerDocumentQuestion(ai.visma.ssn.annotator.v1.DocumentQuestionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAnswerDocumentQuestionMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<ai.visma.ssn.annotator.v1.GenerateStructuredAnswerResponse> generateStructuredAnswer(
        ai.visma.ssn.annotator.v1.GenerateStructuredAnswerRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGenerateStructuredAnswerMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DocumentAnnotator.
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
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.ssn.annotator.v1.DocumentAnnotatorResponse> annotateDocument(
        ai.visma.ssn.annotator.v1.DocumentAnnotatorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAnnotateDocumentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.ssn.annotator.v1.DocumentQuestionResponse> answerDocumentQuestion(
        ai.visma.ssn.annotator.v1.DocumentQuestionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAnswerDocumentQuestionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ANNOTATE_DOCUMENT = 0;
  private static final int METHODID_ANSWER_DOCUMENT_QUESTION = 1;
  private static final int METHODID_GENERATE_STRUCTURED_ANSWER = 2;

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
        case METHODID_GENERATE_STRUCTURED_ANSWER:
          serviceImpl.generateStructuredAnswer((ai.visma.ssn.annotator.v1.GenerateStructuredAnswerRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.ssn.annotator.v1.GenerateStructuredAnswerResponse>) responseObserver);
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
        .addMethod(
          getGenerateStructuredAnswerMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              ai.visma.ssn.annotator.v1.GenerateStructuredAnswerRequest,
              ai.visma.ssn.annotator.v1.GenerateStructuredAnswerResponse>(
                service, METHODID_GENERATE_STRUCTURED_ANSWER)))
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
              .addMethod(getGenerateStructuredAnswerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
