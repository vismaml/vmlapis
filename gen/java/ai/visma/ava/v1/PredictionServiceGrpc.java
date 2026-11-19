package ai.visma.ava.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.70.0)",
    comments = "Source: ava/v1/prediction_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PredictionServiceGrpc {

  private PredictionServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ava.v1.PredictionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.visma.ava.v1.DecideRequest,
      ai.visma.ava.v1.DecideResponse> getDecideMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Decide",
      requestType = ai.visma.ava.v1.DecideRequest.class,
      responseType = ai.visma.ava.v1.DecideResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.ava.v1.DecideRequest,
      ai.visma.ava.v1.DecideResponse> getDecideMethod() {
    io.grpc.MethodDescriptor<ai.visma.ava.v1.DecideRequest, ai.visma.ava.v1.DecideResponse> getDecideMethod;
    if ((getDecideMethod = PredictionServiceGrpc.getDecideMethod) == null) {
      synchronized (PredictionServiceGrpc.class) {
        if ((getDecideMethod = PredictionServiceGrpc.getDecideMethod) == null) {
          PredictionServiceGrpc.getDecideMethod = getDecideMethod =
              io.grpc.MethodDescriptor.<ai.visma.ava.v1.DecideRequest, ai.visma.ava.v1.DecideResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Decide"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ava.v1.DecideRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ava.v1.DecideResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PredictionServiceMethodDescriptorSupplier("Decide"))
              .build();
        }
      }
    }
    return getDecideMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.ava.v1.GetDecisionRequest,
      ai.visma.ava.v1.DecideResponse> getGetDecisionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDecision",
      requestType = ai.visma.ava.v1.GetDecisionRequest.class,
      responseType = ai.visma.ava.v1.DecideResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.ava.v1.GetDecisionRequest,
      ai.visma.ava.v1.DecideResponse> getGetDecisionMethod() {
    io.grpc.MethodDescriptor<ai.visma.ava.v1.GetDecisionRequest, ai.visma.ava.v1.DecideResponse> getGetDecisionMethod;
    if ((getGetDecisionMethod = PredictionServiceGrpc.getGetDecisionMethod) == null) {
      synchronized (PredictionServiceGrpc.class) {
        if ((getGetDecisionMethod = PredictionServiceGrpc.getGetDecisionMethod) == null) {
          PredictionServiceGrpc.getGetDecisionMethod = getGetDecisionMethod =
              io.grpc.MethodDescriptor.<ai.visma.ava.v1.GetDecisionRequest, ai.visma.ava.v1.DecideResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDecision"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ava.v1.GetDecisionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ava.v1.DecideResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PredictionServiceMethodDescriptorSupplier("GetDecision"))
              .build();
        }
      }
    }
    return getGetDecisionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.ava.v1.GetProcedureRequest,
      ai.visma.ava.v1.GetProcedureResponse> getGetProcedureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProcedure",
      requestType = ai.visma.ava.v1.GetProcedureRequest.class,
      responseType = ai.visma.ava.v1.GetProcedureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.ava.v1.GetProcedureRequest,
      ai.visma.ava.v1.GetProcedureResponse> getGetProcedureMethod() {
    io.grpc.MethodDescriptor<ai.visma.ava.v1.GetProcedureRequest, ai.visma.ava.v1.GetProcedureResponse> getGetProcedureMethod;
    if ((getGetProcedureMethod = PredictionServiceGrpc.getGetProcedureMethod) == null) {
      synchronized (PredictionServiceGrpc.class) {
        if ((getGetProcedureMethod = PredictionServiceGrpc.getGetProcedureMethod) == null) {
          PredictionServiceGrpc.getGetProcedureMethod = getGetProcedureMethod =
              io.grpc.MethodDescriptor.<ai.visma.ava.v1.GetProcedureRequest, ai.visma.ava.v1.GetProcedureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProcedure"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ava.v1.GetProcedureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ava.v1.GetProcedureResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PredictionServiceMethodDescriptorSupplier("GetProcedure"))
              .build();
        }
      }
    }
    return getGetProcedureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.ava.v1.GetDecisionRequest,
      ai.visma.ava.v1.GetDecisionPathResponse> getGetDecisionPathMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDecisionPath",
      requestType = ai.visma.ava.v1.GetDecisionRequest.class,
      responseType = ai.visma.ava.v1.GetDecisionPathResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.ava.v1.GetDecisionRequest,
      ai.visma.ava.v1.GetDecisionPathResponse> getGetDecisionPathMethod() {
    io.grpc.MethodDescriptor<ai.visma.ava.v1.GetDecisionRequest, ai.visma.ava.v1.GetDecisionPathResponse> getGetDecisionPathMethod;
    if ((getGetDecisionPathMethod = PredictionServiceGrpc.getGetDecisionPathMethod) == null) {
      synchronized (PredictionServiceGrpc.class) {
        if ((getGetDecisionPathMethod = PredictionServiceGrpc.getGetDecisionPathMethod) == null) {
          PredictionServiceGrpc.getGetDecisionPathMethod = getGetDecisionPathMethod =
              io.grpc.MethodDescriptor.<ai.visma.ava.v1.GetDecisionRequest, ai.visma.ava.v1.GetDecisionPathResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDecisionPath"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ava.v1.GetDecisionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ava.v1.GetDecisionPathResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PredictionServiceMethodDescriptorSupplier("GetDecisionPath"))
              .build();
        }
      }
    }
    return getGetDecisionPathMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PredictionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PredictionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PredictionServiceStub>() {
        @java.lang.Override
        public PredictionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PredictionServiceStub(channel, callOptions);
        }
      };
    return PredictionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static PredictionServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PredictionServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PredictionServiceBlockingV2Stub>() {
        @java.lang.Override
        public PredictionServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PredictionServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return PredictionServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PredictionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PredictionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PredictionServiceBlockingStub>() {
        @java.lang.Override
        public PredictionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PredictionServiceBlockingStub(channel, callOptions);
        }
      };
    return PredictionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PredictionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PredictionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PredictionServiceFutureStub>() {
        @java.lang.Override
        public PredictionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PredictionServiceFutureStub(channel, callOptions);
        }
      };
    return PredictionServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Decide one output for one document with the dataset's promoted procedure.
     * </pre>
     */
    default void decide(ai.visma.ava.v1.DecideRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ava.v1.DecideResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDecideMethod(), responseObserver);
    }

    /**
     * <pre>
     * Return a stored decision by the reference Decide returned.
     * </pre>
     */
    default void getDecision(ai.visma.ava.v1.GetDecisionRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ava.v1.DecideResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDecisionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Return the procedure a dataset decides an output with, as a tree.
     * </pre>
     */
    default void getProcedure(ai.visma.ava.v1.GetProcedureRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ava.v1.GetProcedureResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProcedureMethod(), responseObserver);
    }

    /**
     * <pre>
     * Return a stored decision as the path it walked through the procedure tree.
     * </pre>
     */
    default void getDecisionPath(ai.visma.ava.v1.GetDecisionRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ava.v1.GetDecisionPathResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDecisionPathMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PredictionService.
   */
  public static abstract class PredictionServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PredictionServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PredictionService.
   */
  public static final class PredictionServiceStub
      extends io.grpc.stub.AbstractAsyncStub<PredictionServiceStub> {
    private PredictionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PredictionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PredictionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Decide one output for one document with the dataset's promoted procedure.
     * </pre>
     */
    public void decide(ai.visma.ava.v1.DecideRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ava.v1.DecideResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDecideMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Return a stored decision by the reference Decide returned.
     * </pre>
     */
    public void getDecision(ai.visma.ava.v1.GetDecisionRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ava.v1.DecideResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDecisionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Return the procedure a dataset decides an output with, as a tree.
     * </pre>
     */
    public void getProcedure(ai.visma.ava.v1.GetProcedureRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ava.v1.GetProcedureResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProcedureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Return a stored decision as the path it walked through the procedure tree.
     * </pre>
     */
    public void getDecisionPath(ai.visma.ava.v1.GetDecisionRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ava.v1.GetDecisionPathResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDecisionPathMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PredictionService.
   */
  public static final class PredictionServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<PredictionServiceBlockingV2Stub> {
    private PredictionServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PredictionServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PredictionServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Decide one output for one document with the dataset's promoted procedure.
     * </pre>
     */
    public ai.visma.ava.v1.DecideResponse decide(ai.visma.ava.v1.DecideRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDecideMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Return a stored decision by the reference Decide returned.
     * </pre>
     */
    public ai.visma.ava.v1.DecideResponse getDecision(ai.visma.ava.v1.GetDecisionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDecisionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Return the procedure a dataset decides an output with, as a tree.
     * </pre>
     */
    public ai.visma.ava.v1.GetProcedureResponse getProcedure(ai.visma.ava.v1.GetProcedureRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProcedureMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Return a stored decision as the path it walked through the procedure tree.
     * </pre>
     */
    public ai.visma.ava.v1.GetDecisionPathResponse getDecisionPath(ai.visma.ava.v1.GetDecisionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDecisionPathMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service PredictionService.
   */
  public static final class PredictionServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PredictionServiceBlockingStub> {
    private PredictionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PredictionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PredictionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Decide one output for one document with the dataset's promoted procedure.
     * </pre>
     */
    public ai.visma.ava.v1.DecideResponse decide(ai.visma.ava.v1.DecideRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDecideMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Return a stored decision by the reference Decide returned.
     * </pre>
     */
    public ai.visma.ava.v1.DecideResponse getDecision(ai.visma.ava.v1.GetDecisionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDecisionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Return the procedure a dataset decides an output with, as a tree.
     * </pre>
     */
    public ai.visma.ava.v1.GetProcedureResponse getProcedure(ai.visma.ava.v1.GetProcedureRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProcedureMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Return a stored decision as the path it walked through the procedure tree.
     * </pre>
     */
    public ai.visma.ava.v1.GetDecisionPathResponse getDecisionPath(ai.visma.ava.v1.GetDecisionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDecisionPathMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PredictionService.
   */
  public static final class PredictionServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<PredictionServiceFutureStub> {
    private PredictionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PredictionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PredictionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Decide one output for one document with the dataset's promoted procedure.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.ava.v1.DecideResponse> decide(
        ai.visma.ava.v1.DecideRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDecideMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Return a stored decision by the reference Decide returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.ava.v1.DecideResponse> getDecision(
        ai.visma.ava.v1.GetDecisionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDecisionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Return the procedure a dataset decides an output with, as a tree.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.ava.v1.GetProcedureResponse> getProcedure(
        ai.visma.ava.v1.GetProcedureRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProcedureMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Return a stored decision as the path it walked through the procedure tree.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.ava.v1.GetDecisionPathResponse> getDecisionPath(
        ai.visma.ava.v1.GetDecisionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDecisionPathMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DECIDE = 0;
  private static final int METHODID_GET_DECISION = 1;
  private static final int METHODID_GET_PROCEDURE = 2;
  private static final int METHODID_GET_DECISION_PATH = 3;

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
        case METHODID_DECIDE:
          serviceImpl.decide((ai.visma.ava.v1.DecideRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.ava.v1.DecideResponse>) responseObserver);
          break;
        case METHODID_GET_DECISION:
          serviceImpl.getDecision((ai.visma.ava.v1.GetDecisionRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.ava.v1.DecideResponse>) responseObserver);
          break;
        case METHODID_GET_PROCEDURE:
          serviceImpl.getProcedure((ai.visma.ava.v1.GetProcedureRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.ava.v1.GetProcedureResponse>) responseObserver);
          break;
        case METHODID_GET_DECISION_PATH:
          serviceImpl.getDecisionPath((ai.visma.ava.v1.GetDecisionRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.ava.v1.GetDecisionPathResponse>) responseObserver);
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
          getDecideMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.ava.v1.DecideRequest,
              ai.visma.ava.v1.DecideResponse>(
                service, METHODID_DECIDE)))
        .addMethod(
          getGetDecisionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.ava.v1.GetDecisionRequest,
              ai.visma.ava.v1.DecideResponse>(
                service, METHODID_GET_DECISION)))
        .addMethod(
          getGetProcedureMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.ava.v1.GetProcedureRequest,
              ai.visma.ava.v1.GetProcedureResponse>(
                service, METHODID_GET_PROCEDURE)))
        .addMethod(
          getGetDecisionPathMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.ava.v1.GetDecisionRequest,
              ai.visma.ava.v1.GetDecisionPathResponse>(
                service, METHODID_GET_DECISION_PATH)))
        .build();
  }

  private static abstract class PredictionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PredictionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.visma.ava.v1.PredictionServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PredictionService");
    }
  }

  private static final class PredictionServiceFileDescriptorSupplier
      extends PredictionServiceBaseDescriptorSupplier {
    PredictionServiceFileDescriptorSupplier() {}
  }

  private static final class PredictionServiceMethodDescriptorSupplier
      extends PredictionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PredictionServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (PredictionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PredictionServiceFileDescriptorSupplier())
              .addMethod(getDecideMethod())
              .addMethod(getGetDecisionMethod())
              .addMethod(getGetProcedureMethod())
              .addMethod(getGetDecisionPathMethod())
              .build();
        }
      }
    }
    return result;
  }
}
