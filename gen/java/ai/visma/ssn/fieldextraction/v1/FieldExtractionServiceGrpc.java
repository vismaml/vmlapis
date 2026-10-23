package ai.visma.ssn.fieldextraction.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * FieldExtractionService runs inference sources over DDS documents and stores
 * the extracted Smartscan fields in DDS as predictions.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.70.0)",
    comments = "Source: ssn/fieldextraction/v1/fieldextraction.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FieldExtractionServiceGrpc {

  private FieldExtractionServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ssn.fieldextraction.v1.FieldExtractionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.visma.ssn.fieldextraction.v1.ExtractRequest,
      ai.visma.ssn.fieldextraction.v1.ExtractResponse> getExtractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Extract",
      requestType = ai.visma.ssn.fieldextraction.v1.ExtractRequest.class,
      responseType = ai.visma.ssn.fieldextraction.v1.ExtractResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.ssn.fieldextraction.v1.ExtractRequest,
      ai.visma.ssn.fieldextraction.v1.ExtractResponse> getExtractMethod() {
    io.grpc.MethodDescriptor<ai.visma.ssn.fieldextraction.v1.ExtractRequest, ai.visma.ssn.fieldextraction.v1.ExtractResponse> getExtractMethod;
    if ((getExtractMethod = FieldExtractionServiceGrpc.getExtractMethod) == null) {
      synchronized (FieldExtractionServiceGrpc.class) {
        if ((getExtractMethod = FieldExtractionServiceGrpc.getExtractMethod) == null) {
          FieldExtractionServiceGrpc.getExtractMethod = getExtractMethod =
              io.grpc.MethodDescriptor.<ai.visma.ssn.fieldextraction.v1.ExtractRequest, ai.visma.ssn.fieldextraction.v1.ExtractResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Extract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.fieldextraction.v1.ExtractRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.fieldextraction.v1.ExtractResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FieldExtractionServiceMethodDescriptorSupplier("Extract"))
              .build();
        }
      }
    }
    return getExtractMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FieldExtractionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FieldExtractionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FieldExtractionServiceStub>() {
        @java.lang.Override
        public FieldExtractionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FieldExtractionServiceStub(channel, callOptions);
        }
      };
    return FieldExtractionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static FieldExtractionServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FieldExtractionServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FieldExtractionServiceBlockingV2Stub>() {
        @java.lang.Override
        public FieldExtractionServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FieldExtractionServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return FieldExtractionServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FieldExtractionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FieldExtractionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FieldExtractionServiceBlockingStub>() {
        @java.lang.Override
        public FieldExtractionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FieldExtractionServiceBlockingStub(channel, callOptions);
        }
      };
    return FieldExtractionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FieldExtractionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FieldExtractionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FieldExtractionServiceFutureStub>() {
        @java.lang.Override
        public FieldExtractionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FieldExtractionServiceFutureStub(channel, callOptions);
        }
      };
    return FieldExtractionServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * FieldExtractionService runs inference sources over DDS documents and stores
   * the extracted Smartscan fields in DDS as predictions.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Extract starts one extraction workflow per source and returns immediately.
     * Results are read from DDS (source_id = the source's versioned ID).
     * </pre>
     */
    default void extract(ai.visma.ssn.fieldextraction.v1.ExtractRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.fieldextraction.v1.ExtractResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExtractMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service FieldExtractionService.
   * <pre>
   * FieldExtractionService runs inference sources over DDS documents and stores
   * the extracted Smartscan fields in DDS as predictions.
   * </pre>
   */
  public static abstract class FieldExtractionServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return FieldExtractionServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service FieldExtractionService.
   * <pre>
   * FieldExtractionService runs inference sources over DDS documents and stores
   * the extracted Smartscan fields in DDS as predictions.
   * </pre>
   */
  public static final class FieldExtractionServiceStub
      extends io.grpc.stub.AbstractAsyncStub<FieldExtractionServiceStub> {
    private FieldExtractionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FieldExtractionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FieldExtractionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Extract starts one extraction workflow per source and returns immediately.
     * Results are read from DDS (source_id = the source's versioned ID).
     * </pre>
     */
    public void extract(ai.visma.ssn.fieldextraction.v1.ExtractRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.fieldextraction.v1.ExtractResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExtractMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service FieldExtractionService.
   * <pre>
   * FieldExtractionService runs inference sources over DDS documents and stores
   * the extracted Smartscan fields in DDS as predictions.
   * </pre>
   */
  public static final class FieldExtractionServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<FieldExtractionServiceBlockingV2Stub> {
    private FieldExtractionServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FieldExtractionServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FieldExtractionServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Extract starts one extraction workflow per source and returns immediately.
     * Results are read from DDS (source_id = the source's versioned ID).
     * </pre>
     */
    public ai.visma.ssn.fieldextraction.v1.ExtractResponse extract(ai.visma.ssn.fieldextraction.v1.ExtractRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExtractMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service FieldExtractionService.
   * <pre>
   * FieldExtractionService runs inference sources over DDS documents and stores
   * the extracted Smartscan fields in DDS as predictions.
   * </pre>
   */
  public static final class FieldExtractionServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<FieldExtractionServiceBlockingStub> {
    private FieldExtractionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FieldExtractionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FieldExtractionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Extract starts one extraction workflow per source and returns immediately.
     * Results are read from DDS (source_id = the source's versioned ID).
     * </pre>
     */
    public ai.visma.ssn.fieldextraction.v1.ExtractResponse extract(ai.visma.ssn.fieldextraction.v1.ExtractRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExtractMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service FieldExtractionService.
   * <pre>
   * FieldExtractionService runs inference sources over DDS documents and stores
   * the extracted Smartscan fields in DDS as predictions.
   * </pre>
   */
  public static final class FieldExtractionServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<FieldExtractionServiceFutureStub> {
    private FieldExtractionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FieldExtractionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FieldExtractionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Extract starts one extraction workflow per source and returns immediately.
     * Results are read from DDS (source_id = the source's versioned ID).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.ssn.fieldextraction.v1.ExtractResponse> extract(
        ai.visma.ssn.fieldextraction.v1.ExtractRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExtractMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EXTRACT = 0;

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
        case METHODID_EXTRACT:
          serviceImpl.extract((ai.visma.ssn.fieldextraction.v1.ExtractRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.ssn.fieldextraction.v1.ExtractResponse>) responseObserver);
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
          getExtractMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.ssn.fieldextraction.v1.ExtractRequest,
              ai.visma.ssn.fieldextraction.v1.ExtractResponse>(
                service, METHODID_EXTRACT)))
        .build();
  }

  private static abstract class FieldExtractionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FieldExtractionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.visma.ssn.fieldextraction.v1.FieldextractionProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FieldExtractionService");
    }
  }

  private static final class FieldExtractionServiceFileDescriptorSupplier
      extends FieldExtractionServiceBaseDescriptorSupplier {
    FieldExtractionServiceFileDescriptorSupplier() {}
  }

  private static final class FieldExtractionServiceMethodDescriptorSupplier
      extends FieldExtractionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    FieldExtractionServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (FieldExtractionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FieldExtractionServiceFileDescriptorSupplier())
              .addMethod(getExtractMethod())
              .build();
        }
      }
    }
    return result;
  }
}
