package ai.visma.ssn.predictservice.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.70.0)",
    comments = "Source: ssn/predictservice/v1/predictservice.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PredictServiceGrpc {

  private PredictServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ssn.predictservice.v1.PredictService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.visma.ssn.predictservice.v1.ModelInferRequest,
      ai.visma.ssn.predictservice.v1.ModelInferResponse> getPredictMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Predict",
      requestType = ai.visma.ssn.predictservice.v1.ModelInferRequest.class,
      responseType = ai.visma.ssn.predictservice.v1.ModelInferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.ssn.predictservice.v1.ModelInferRequest,
      ai.visma.ssn.predictservice.v1.ModelInferResponse> getPredictMethod() {
    io.grpc.MethodDescriptor<ai.visma.ssn.predictservice.v1.ModelInferRequest, ai.visma.ssn.predictservice.v1.ModelInferResponse> getPredictMethod;
    if ((getPredictMethod = PredictServiceGrpc.getPredictMethod) == null) {
      synchronized (PredictServiceGrpc.class) {
        if ((getPredictMethod = PredictServiceGrpc.getPredictMethod) == null) {
          PredictServiceGrpc.getPredictMethod = getPredictMethod =
              io.grpc.MethodDescriptor.<ai.visma.ssn.predictservice.v1.ModelInferRequest, ai.visma.ssn.predictservice.v1.ModelInferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Predict"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.predictservice.v1.ModelInferRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.predictservice.v1.ModelInferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PredictServiceMethodDescriptorSupplier("Predict"))
              .build();
        }
      }
    }
    return getPredictMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PredictServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PredictServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PredictServiceStub>() {
        @java.lang.Override
        public PredictServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PredictServiceStub(channel, callOptions);
        }
      };
    return PredictServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static PredictServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PredictServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PredictServiceBlockingV2Stub>() {
        @java.lang.Override
        public PredictServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PredictServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return PredictServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PredictServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PredictServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PredictServiceBlockingStub>() {
        @java.lang.Override
        public PredictServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PredictServiceBlockingStub(channel, callOptions);
        }
      };
    return PredictServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PredictServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PredictServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PredictServiceFutureStub>() {
        @java.lang.Override
        public PredictServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PredictServiceFutureStub(channel, callOptions);
        }
      };
    return PredictServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void predict(ai.visma.ssn.predictservice.v1.ModelInferRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.predictservice.v1.ModelInferResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPredictMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PredictService.
   */
  public static abstract class PredictServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PredictServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PredictService.
   */
  public static final class PredictServiceStub
      extends io.grpc.stub.AbstractAsyncStub<PredictServiceStub> {
    private PredictServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PredictServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PredictServiceStub(channel, callOptions);
    }

    /**
     */
    public void predict(ai.visma.ssn.predictservice.v1.ModelInferRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.predictservice.v1.ModelInferResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPredictMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PredictService.
   */
  public static final class PredictServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<PredictServiceBlockingV2Stub> {
    private PredictServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PredictServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PredictServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public ai.visma.ssn.predictservice.v1.ModelInferResponse predict(ai.visma.ssn.predictservice.v1.ModelInferRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPredictMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service PredictService.
   */
  public static final class PredictServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PredictServiceBlockingStub> {
    private PredictServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PredictServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PredictServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ai.visma.ssn.predictservice.v1.ModelInferResponse predict(ai.visma.ssn.predictservice.v1.ModelInferRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPredictMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PredictService.
   */
  public static final class PredictServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<PredictServiceFutureStub> {
    private PredictServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PredictServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PredictServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.ssn.predictservice.v1.ModelInferResponse> predict(
        ai.visma.ssn.predictservice.v1.ModelInferRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPredictMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PREDICT = 0;

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
        case METHODID_PREDICT:
          serviceImpl.predict((ai.visma.ssn.predictservice.v1.ModelInferRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.ssn.predictservice.v1.ModelInferResponse>) responseObserver);
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
          getPredictMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.ssn.predictservice.v1.ModelInferRequest,
              ai.visma.ssn.predictservice.v1.ModelInferResponse>(
                service, METHODID_PREDICT)))
        .build();
  }

  private static abstract class PredictServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PredictServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.visma.ssn.predictservice.v1.PredictserviceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PredictService");
    }
  }

  private static final class PredictServiceFileDescriptorSupplier
      extends PredictServiceBaseDescriptorSupplier {
    PredictServiceFileDescriptorSupplier() {}
  }

  private static final class PredictServiceMethodDescriptorSupplier
      extends PredictServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PredictServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (PredictServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PredictServiceFileDescriptorSupplier())
              .addMethod(getPredictMethod())
              .build();
        }
      }
    }
    return result;
  }
}
