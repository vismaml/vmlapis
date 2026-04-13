package ai.visma.ssn.documentdataservice.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.70.0)",
    comments = "Source: ssn/documentdataservice/v1/documentdataservice.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DocumentDataServiceGrpc {

  private DocumentDataServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ssn.documentdataservice.v1.DocumentDataService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.visma.ssn.documentdataservice.v1.GetDocumentDataRequest,
      ai.visma.ssn.documentdataservice.v1.GetDocumentDataResponse> getGetDocumentDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDocumentData",
      requestType = ai.visma.ssn.documentdataservice.v1.GetDocumentDataRequest.class,
      responseType = ai.visma.ssn.documentdataservice.v1.GetDocumentDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.ssn.documentdataservice.v1.GetDocumentDataRequest,
      ai.visma.ssn.documentdataservice.v1.GetDocumentDataResponse> getGetDocumentDataMethod() {
    io.grpc.MethodDescriptor<ai.visma.ssn.documentdataservice.v1.GetDocumentDataRequest, ai.visma.ssn.documentdataservice.v1.GetDocumentDataResponse> getGetDocumentDataMethod;
    if ((getGetDocumentDataMethod = DocumentDataServiceGrpc.getGetDocumentDataMethod) == null) {
      synchronized (DocumentDataServiceGrpc.class) {
        if ((getGetDocumentDataMethod = DocumentDataServiceGrpc.getGetDocumentDataMethod) == null) {
          DocumentDataServiceGrpc.getGetDocumentDataMethod = getGetDocumentDataMethod =
              io.grpc.MethodDescriptor.<ai.visma.ssn.documentdataservice.v1.GetDocumentDataRequest, ai.visma.ssn.documentdataservice.v1.GetDocumentDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDocumentData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.documentdataservice.v1.GetDocumentDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.documentdataservice.v1.GetDocumentDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DocumentDataServiceMethodDescriptorSupplier("GetDocumentData"))
              .build();
        }
      }
    }
    return getGetDocumentDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DocumentDataServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DocumentDataServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DocumentDataServiceStub>() {
        @java.lang.Override
        public DocumentDataServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DocumentDataServiceStub(channel, callOptions);
        }
      };
    return DocumentDataServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static DocumentDataServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DocumentDataServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DocumentDataServiceBlockingV2Stub>() {
        @java.lang.Override
        public DocumentDataServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DocumentDataServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return DocumentDataServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DocumentDataServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DocumentDataServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DocumentDataServiceBlockingStub>() {
        @java.lang.Override
        public DocumentDataServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DocumentDataServiceBlockingStub(channel, callOptions);
        }
      };
    return DocumentDataServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DocumentDataServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DocumentDataServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DocumentDataServiceFutureStub>() {
        @java.lang.Override
        public DocumentDataServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DocumentDataServiceFutureStub(channel, callOptions);
        }
      };
    return DocumentDataServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getDocumentData(ai.visma.ssn.documentdataservice.v1.GetDocumentDataRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.documentdataservice.v1.GetDocumentDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDocumentDataMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DocumentDataService.
   */
  public static abstract class DocumentDataServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DocumentDataServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DocumentDataService.
   */
  public static final class DocumentDataServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DocumentDataServiceStub> {
    private DocumentDataServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DocumentDataServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DocumentDataServiceStub(channel, callOptions);
    }

    /**
     */
    public void getDocumentData(ai.visma.ssn.documentdataservice.v1.GetDocumentDataRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.documentdataservice.v1.GetDocumentDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDocumentDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DocumentDataService.
   */
  public static final class DocumentDataServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<DocumentDataServiceBlockingV2Stub> {
    private DocumentDataServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DocumentDataServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DocumentDataServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public ai.visma.ssn.documentdataservice.v1.GetDocumentDataResponse getDocumentData(ai.visma.ssn.documentdataservice.v1.GetDocumentDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDocumentDataMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service DocumentDataService.
   */
  public static final class DocumentDataServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DocumentDataServiceBlockingStub> {
    private DocumentDataServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DocumentDataServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DocumentDataServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ai.visma.ssn.documentdataservice.v1.GetDocumentDataResponse getDocumentData(ai.visma.ssn.documentdataservice.v1.GetDocumentDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDocumentDataMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DocumentDataService.
   */
  public static final class DocumentDataServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DocumentDataServiceFutureStub> {
    private DocumentDataServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DocumentDataServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DocumentDataServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.ssn.documentdataservice.v1.GetDocumentDataResponse> getDocumentData(
        ai.visma.ssn.documentdataservice.v1.GetDocumentDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDocumentDataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DOCUMENT_DATA = 0;

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
        case METHODID_GET_DOCUMENT_DATA:
          serviceImpl.getDocumentData((ai.visma.ssn.documentdataservice.v1.GetDocumentDataRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.ssn.documentdataservice.v1.GetDocumentDataResponse>) responseObserver);
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
          getGetDocumentDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.ssn.documentdataservice.v1.GetDocumentDataRequest,
              ai.visma.ssn.documentdataservice.v1.GetDocumentDataResponse>(
                service, METHODID_GET_DOCUMENT_DATA)))
        .build();
  }

  private static abstract class DocumentDataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DocumentDataServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.visma.ssn.documentdataservice.v1.DocumentdataserviceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DocumentDataService");
    }
  }

  private static final class DocumentDataServiceFileDescriptorSupplier
      extends DocumentDataServiceBaseDescriptorSupplier {
    DocumentDataServiceFileDescriptorSupplier() {}
  }

  private static final class DocumentDataServiceMethodDescriptorSupplier
      extends DocumentDataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DocumentDataServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (DocumentDataServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DocumentDataServiceFileDescriptorSupplier())
              .addMethod(getGetDocumentDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
