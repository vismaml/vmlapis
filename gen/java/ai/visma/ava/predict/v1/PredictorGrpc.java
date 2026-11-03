package ai.visma.ava.predict.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Predictor runs an AVA procedure on ad-hoc input and returns the decision synchronously.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.70.0)",
    comments = "Source: ava/predict/v1/predict.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PredictorGrpc {

  private PredictorGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ava.predict.v1.Predictor";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.visma.ava.predict.v1.PredictRequest,
      ai.visma.ava.predict.v1.PredictResponse> getPredictMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Predict",
      requestType = ai.visma.ava.predict.v1.PredictRequest.class,
      responseType = ai.visma.ava.predict.v1.PredictResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.ava.predict.v1.PredictRequest,
      ai.visma.ava.predict.v1.PredictResponse> getPredictMethod() {
    io.grpc.MethodDescriptor<ai.visma.ava.predict.v1.PredictRequest, ai.visma.ava.predict.v1.PredictResponse> getPredictMethod;
    if ((getPredictMethod = PredictorGrpc.getPredictMethod) == null) {
      synchronized (PredictorGrpc.class) {
        if ((getPredictMethod = PredictorGrpc.getPredictMethod) == null) {
          PredictorGrpc.getPredictMethod = getPredictMethod =
              io.grpc.MethodDescriptor.<ai.visma.ava.predict.v1.PredictRequest, ai.visma.ava.predict.v1.PredictResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Predict"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ava.predict.v1.PredictRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ava.predict.v1.PredictResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PredictorMethodDescriptorSupplier("Predict"))
              .build();
        }
      }
    }
    return getPredictMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PredictorStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PredictorStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PredictorStub>() {
        @java.lang.Override
        public PredictorStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PredictorStub(channel, callOptions);
        }
      };
    return PredictorStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static PredictorBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PredictorBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PredictorBlockingV2Stub>() {
        @java.lang.Override
        public PredictorBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PredictorBlockingV2Stub(channel, callOptions);
        }
      };
    return PredictorBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PredictorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PredictorBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PredictorBlockingStub>() {
        @java.lang.Override
        public PredictorBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PredictorBlockingStub(channel, callOptions);
        }
      };
    return PredictorBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PredictorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PredictorFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PredictorFutureStub>() {
        @java.lang.Override
        public PredictorFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PredictorFutureStub(channel, callOptions);
        }
      };
    return PredictorFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Predictor runs an AVA procedure on ad-hoc input and returns the decision synchronously.
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void predict(ai.visma.ava.predict.v1.PredictRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ava.predict.v1.PredictResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPredictMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Predictor.
   * <pre>
   * Predictor runs an AVA procedure on ad-hoc input and returns the decision synchronously.
   * </pre>
   */
  public static abstract class PredictorImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PredictorGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Predictor.
   * <pre>
   * Predictor runs an AVA procedure on ad-hoc input and returns the decision synchronously.
   * </pre>
   */
  public static final class PredictorStub
      extends io.grpc.stub.AbstractAsyncStub<PredictorStub> {
    private PredictorStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PredictorStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PredictorStub(channel, callOptions);
    }

    /**
     */
    public void predict(ai.visma.ava.predict.v1.PredictRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ava.predict.v1.PredictResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPredictMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Predictor.
   * <pre>
   * Predictor runs an AVA procedure on ad-hoc input and returns the decision synchronously.
   * </pre>
   */
  public static final class PredictorBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<PredictorBlockingV2Stub> {
    private PredictorBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PredictorBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PredictorBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public ai.visma.ava.predict.v1.PredictResponse predict(ai.visma.ava.predict.v1.PredictRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPredictMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Predictor.
   * <pre>
   * Predictor runs an AVA procedure on ad-hoc input and returns the decision synchronously.
   * </pre>
   */
  public static final class PredictorBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PredictorBlockingStub> {
    private PredictorBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PredictorBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PredictorBlockingStub(channel, callOptions);
    }

    /**
     */
    public ai.visma.ava.predict.v1.PredictResponse predict(ai.visma.ava.predict.v1.PredictRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPredictMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Predictor.
   * <pre>
   * Predictor runs an AVA procedure on ad-hoc input and returns the decision synchronously.
   * </pre>
   */
  public static final class PredictorFutureStub
      extends io.grpc.stub.AbstractFutureStub<PredictorFutureStub> {
    private PredictorFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PredictorFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PredictorFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.ava.predict.v1.PredictResponse> predict(
        ai.visma.ava.predict.v1.PredictRequest request) {
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
          serviceImpl.predict((ai.visma.ava.predict.v1.PredictRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.ava.predict.v1.PredictResponse>) responseObserver);
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
              ai.visma.ava.predict.v1.PredictRequest,
              ai.visma.ava.predict.v1.PredictResponse>(
                service, METHODID_PREDICT)))
        .build();
  }

  private static abstract class PredictorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PredictorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.visma.ava.predict.v1.PredictProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Predictor");
    }
  }

  private static final class PredictorFileDescriptorSupplier
      extends PredictorBaseDescriptorSupplier {
    PredictorFileDescriptorSupplier() {}
  }

  private static final class PredictorMethodDescriptorSupplier
      extends PredictorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PredictorMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (PredictorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PredictorFileDescriptorSupplier())
              .addMethod(getPredictMethod())
              .build();
        }
      }
    }
    return result;
  }
}
