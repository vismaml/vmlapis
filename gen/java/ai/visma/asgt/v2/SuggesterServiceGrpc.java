package ai.visma.asgt.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.70.0)",
    comments = "Source: asgt/v2/suggester_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SuggesterServiceGrpc {

  private SuggesterServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "asgt.v2.SuggesterService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.visma.asgt.v2.SuggestRequest,
      ai.visma.asgt.v2.SuggestResponse> getSuggestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Suggest",
      requestType = ai.visma.asgt.v2.SuggestRequest.class,
      responseType = ai.visma.asgt.v2.SuggestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.asgt.v2.SuggestRequest,
      ai.visma.asgt.v2.SuggestResponse> getSuggestMethod() {
    io.grpc.MethodDescriptor<ai.visma.asgt.v2.SuggestRequest, ai.visma.asgt.v2.SuggestResponse> getSuggestMethod;
    if ((getSuggestMethod = SuggesterServiceGrpc.getSuggestMethod) == null) {
      synchronized (SuggesterServiceGrpc.class) {
        if ((getSuggestMethod = SuggesterServiceGrpc.getSuggestMethod) == null) {
          SuggesterServiceGrpc.getSuggestMethod = getSuggestMethod =
              io.grpc.MethodDescriptor.<ai.visma.asgt.v2.SuggestRequest, ai.visma.asgt.v2.SuggestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Suggest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.v2.SuggestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.v2.SuggestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SuggesterServiceMethodDescriptorSupplier("Suggest"))
              .build();
        }
      }
    }
    return getSuggestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.asgt.v2.BatchSuggestRequest,
      ai.visma.asgt.v2.BatchSuggestResponse> getBatchSuggestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchSuggest",
      requestType = ai.visma.asgt.v2.BatchSuggestRequest.class,
      responseType = ai.visma.asgt.v2.BatchSuggestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.asgt.v2.BatchSuggestRequest,
      ai.visma.asgt.v2.BatchSuggestResponse> getBatchSuggestMethod() {
    io.grpc.MethodDescriptor<ai.visma.asgt.v2.BatchSuggestRequest, ai.visma.asgt.v2.BatchSuggestResponse> getBatchSuggestMethod;
    if ((getBatchSuggestMethod = SuggesterServiceGrpc.getBatchSuggestMethod) == null) {
      synchronized (SuggesterServiceGrpc.class) {
        if ((getBatchSuggestMethod = SuggesterServiceGrpc.getBatchSuggestMethod) == null) {
          SuggesterServiceGrpc.getBatchSuggestMethod = getBatchSuggestMethod =
              io.grpc.MethodDescriptor.<ai.visma.asgt.v2.BatchSuggestRequest, ai.visma.asgt.v2.BatchSuggestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchSuggest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.v2.BatchSuggestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.v2.BatchSuggestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SuggesterServiceMethodDescriptorSupplier("BatchSuggest"))
              .build();
        }
      }
    }
    return getBatchSuggestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.asgt.v2.BatchSuggestRequest,
      ai.visma.asgt.v2.BatchSuggestResponse> getModelBatchSuggestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModelBatchSuggest",
      requestType = ai.visma.asgt.v2.BatchSuggestRequest.class,
      responseType = ai.visma.asgt.v2.BatchSuggestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.asgt.v2.BatchSuggestRequest,
      ai.visma.asgt.v2.BatchSuggestResponse> getModelBatchSuggestMethod() {
    io.grpc.MethodDescriptor<ai.visma.asgt.v2.BatchSuggestRequest, ai.visma.asgt.v2.BatchSuggestResponse> getModelBatchSuggestMethod;
    if ((getModelBatchSuggestMethod = SuggesterServiceGrpc.getModelBatchSuggestMethod) == null) {
      synchronized (SuggesterServiceGrpc.class) {
        if ((getModelBatchSuggestMethod = SuggesterServiceGrpc.getModelBatchSuggestMethod) == null) {
          SuggesterServiceGrpc.getModelBatchSuggestMethod = getModelBatchSuggestMethod =
              io.grpc.MethodDescriptor.<ai.visma.asgt.v2.BatchSuggestRequest, ai.visma.asgt.v2.BatchSuggestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModelBatchSuggest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.v2.BatchSuggestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.v2.BatchSuggestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SuggesterServiceMethodDescriptorSupplier("ModelBatchSuggest"))
              .build();
        }
      }
    }
    return getModelBatchSuggestMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SuggesterServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SuggesterServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SuggesterServiceStub>() {
        @java.lang.Override
        public SuggesterServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SuggesterServiceStub(channel, callOptions);
        }
      };
    return SuggesterServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static SuggesterServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SuggesterServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SuggesterServiceBlockingV2Stub>() {
        @java.lang.Override
        public SuggesterServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SuggesterServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return SuggesterServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SuggesterServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SuggesterServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SuggesterServiceBlockingStub>() {
        @java.lang.Override
        public SuggesterServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SuggesterServiceBlockingStub(channel, callOptions);
        }
      };
    return SuggesterServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SuggesterServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SuggesterServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SuggesterServiceFutureStub>() {
        @java.lang.Override
        public SuggesterServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SuggesterServiceFutureStub(channel, callOptions);
        }
      };
    return SuggesterServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Suggest target values for one input.
     * Uses the dataset's current model. Each target returns up to suggestLimit candidates,
     * highest confidence first, each with its confidence level.
     * Returns 404 if the dataset has no trained model yet or doesn't exist, and 400 if the input
     * sets no data structure or an option has an invalid value.
     * </pre>
     */
    default void suggest(ai.visma.asgt.v2.SuggestRequest request,
        io.grpc.stub.StreamObserver<ai.visma.asgt.v2.SuggestResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSuggestMethod(), responseObserver);
    }

    /**
     * <pre>
     * Suggest target values for several inputs.
     * Works like POST /v2/datasets/{datasetName}:suggest, with one prediction per input, in the
     * same order. If the dataset has no trained model yet or doesn't exist, it returns 200 with no
     * predictions instead of 404. To get a 404 in that case, use
     * POST /v2/datasets/{datasetName}/model:batchSuggest.
     * </pre>
     */
    default void batchSuggest(ai.visma.asgt.v2.BatchSuggestRequest request,
        io.grpc.stub.StreamObserver<ai.visma.asgt.v2.BatchSuggestResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchSuggestMethod(), responseObserver);
    }

    /**
     * <pre>
     * Suggest target values for several inputs, or 404 without a model.
     * Works like POST /v2/datasets/{datasetName}:batchSuggest, but returns 404 if the dataset has
     * no trained model yet or doesn't exist.
     * </pre>
     */
    default void modelBatchSuggest(ai.visma.asgt.v2.BatchSuggestRequest request,
        io.grpc.stub.StreamObserver<ai.visma.asgt.v2.BatchSuggestResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModelBatchSuggestMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SuggesterService.
   */
  public static abstract class SuggesterServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SuggesterServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SuggesterService.
   */
  public static final class SuggesterServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SuggesterServiceStub> {
    private SuggesterServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SuggesterServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SuggesterServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Suggest target values for one input.
     * Uses the dataset's current model. Each target returns up to suggestLimit candidates,
     * highest confidence first, each with its confidence level.
     * Returns 404 if the dataset has no trained model yet or doesn't exist, and 400 if the input
     * sets no data structure or an option has an invalid value.
     * </pre>
     */
    public void suggest(ai.visma.asgt.v2.SuggestRequest request,
        io.grpc.stub.StreamObserver<ai.visma.asgt.v2.SuggestResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSuggestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Suggest target values for several inputs.
     * Works like POST /v2/datasets/{datasetName}:suggest, with one prediction per input, in the
     * same order. If the dataset has no trained model yet or doesn't exist, it returns 200 with no
     * predictions instead of 404. To get a 404 in that case, use
     * POST /v2/datasets/{datasetName}/model:batchSuggest.
     * </pre>
     */
    public void batchSuggest(ai.visma.asgt.v2.BatchSuggestRequest request,
        io.grpc.stub.StreamObserver<ai.visma.asgt.v2.BatchSuggestResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchSuggestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Suggest target values for several inputs, or 404 without a model.
     * Works like POST /v2/datasets/{datasetName}:batchSuggest, but returns 404 if the dataset has
     * no trained model yet or doesn't exist.
     * </pre>
     */
    public void modelBatchSuggest(ai.visma.asgt.v2.BatchSuggestRequest request,
        io.grpc.stub.StreamObserver<ai.visma.asgt.v2.BatchSuggestResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModelBatchSuggestMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SuggesterService.
   */
  public static final class SuggesterServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<SuggesterServiceBlockingV2Stub> {
    private SuggesterServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SuggesterServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SuggesterServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Suggest target values for one input.
     * Uses the dataset's current model. Each target returns up to suggestLimit candidates,
     * highest confidence first, each with its confidence level.
     * Returns 404 if the dataset has no trained model yet or doesn't exist, and 400 if the input
     * sets no data structure or an option has an invalid value.
     * </pre>
     */
    public ai.visma.asgt.v2.SuggestResponse suggest(ai.visma.asgt.v2.SuggestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSuggestMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Suggest target values for several inputs.
     * Works like POST /v2/datasets/{datasetName}:suggest, with one prediction per input, in the
     * same order. If the dataset has no trained model yet or doesn't exist, it returns 200 with no
     * predictions instead of 404. To get a 404 in that case, use
     * POST /v2/datasets/{datasetName}/model:batchSuggest.
     * </pre>
     */
    public ai.visma.asgt.v2.BatchSuggestResponse batchSuggest(ai.visma.asgt.v2.BatchSuggestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchSuggestMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Suggest target values for several inputs, or 404 without a model.
     * Works like POST /v2/datasets/{datasetName}:batchSuggest, but returns 404 if the dataset has
     * no trained model yet or doesn't exist.
     * </pre>
     */
    public ai.visma.asgt.v2.BatchSuggestResponse modelBatchSuggest(ai.visma.asgt.v2.BatchSuggestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModelBatchSuggestMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service SuggesterService.
   */
  public static final class SuggesterServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SuggesterServiceBlockingStub> {
    private SuggesterServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SuggesterServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SuggesterServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Suggest target values for one input.
     * Uses the dataset's current model. Each target returns up to suggestLimit candidates,
     * highest confidence first, each with its confidence level.
     * Returns 404 if the dataset has no trained model yet or doesn't exist, and 400 if the input
     * sets no data structure or an option has an invalid value.
     * </pre>
     */
    public ai.visma.asgt.v2.SuggestResponse suggest(ai.visma.asgt.v2.SuggestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSuggestMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Suggest target values for several inputs.
     * Works like POST /v2/datasets/{datasetName}:suggest, with one prediction per input, in the
     * same order. If the dataset has no trained model yet or doesn't exist, it returns 200 with no
     * predictions instead of 404. To get a 404 in that case, use
     * POST /v2/datasets/{datasetName}/model:batchSuggest.
     * </pre>
     */
    public ai.visma.asgt.v2.BatchSuggestResponse batchSuggest(ai.visma.asgt.v2.BatchSuggestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchSuggestMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Suggest target values for several inputs, or 404 without a model.
     * Works like POST /v2/datasets/{datasetName}:batchSuggest, but returns 404 if the dataset has
     * no trained model yet or doesn't exist.
     * </pre>
     */
    public ai.visma.asgt.v2.BatchSuggestResponse modelBatchSuggest(ai.visma.asgt.v2.BatchSuggestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModelBatchSuggestMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SuggesterService.
   */
  public static final class SuggesterServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SuggesterServiceFutureStub> {
    private SuggesterServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SuggesterServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SuggesterServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Suggest target values for one input.
     * Uses the dataset's current model. Each target returns up to suggestLimit candidates,
     * highest confidence first, each with its confidence level.
     * Returns 404 if the dataset has no trained model yet or doesn't exist, and 400 if the input
     * sets no data structure or an option has an invalid value.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.asgt.v2.SuggestResponse> suggest(
        ai.visma.asgt.v2.SuggestRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSuggestMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Suggest target values for several inputs.
     * Works like POST /v2/datasets/{datasetName}:suggest, with one prediction per input, in the
     * same order. If the dataset has no trained model yet or doesn't exist, it returns 200 with no
     * predictions instead of 404. To get a 404 in that case, use
     * POST /v2/datasets/{datasetName}/model:batchSuggest.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.asgt.v2.BatchSuggestResponse> batchSuggest(
        ai.visma.asgt.v2.BatchSuggestRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchSuggestMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Suggest target values for several inputs, or 404 without a model.
     * Works like POST /v2/datasets/{datasetName}:batchSuggest, but returns 404 if the dataset has
     * no trained model yet or doesn't exist.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.asgt.v2.BatchSuggestResponse> modelBatchSuggest(
        ai.visma.asgt.v2.BatchSuggestRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModelBatchSuggestMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUGGEST = 0;
  private static final int METHODID_BATCH_SUGGEST = 1;
  private static final int METHODID_MODEL_BATCH_SUGGEST = 2;

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
        case METHODID_SUGGEST:
          serviceImpl.suggest((ai.visma.asgt.v2.SuggestRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.asgt.v2.SuggestResponse>) responseObserver);
          break;
        case METHODID_BATCH_SUGGEST:
          serviceImpl.batchSuggest((ai.visma.asgt.v2.BatchSuggestRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.asgt.v2.BatchSuggestResponse>) responseObserver);
          break;
        case METHODID_MODEL_BATCH_SUGGEST:
          serviceImpl.modelBatchSuggest((ai.visma.asgt.v2.BatchSuggestRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.asgt.v2.BatchSuggestResponse>) responseObserver);
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
          getSuggestMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.asgt.v2.SuggestRequest,
              ai.visma.asgt.v2.SuggestResponse>(
                service, METHODID_SUGGEST)))
        .addMethod(
          getBatchSuggestMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.asgt.v2.BatchSuggestRequest,
              ai.visma.asgt.v2.BatchSuggestResponse>(
                service, METHODID_BATCH_SUGGEST)))
        .addMethod(
          getModelBatchSuggestMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.asgt.v2.BatchSuggestRequest,
              ai.visma.asgt.v2.BatchSuggestResponse>(
                service, METHODID_MODEL_BATCH_SUGGEST)))
        .build();
  }

  private static abstract class SuggesterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SuggesterServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.visma.asgt.v2.SuggesterServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SuggesterService");
    }
  }

  private static final class SuggesterServiceFileDescriptorSupplier
      extends SuggesterServiceBaseDescriptorSupplier {
    SuggesterServiceFileDescriptorSupplier() {}
  }

  private static final class SuggesterServiceMethodDescriptorSupplier
      extends SuggesterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SuggesterServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SuggesterServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SuggesterServiceFileDescriptorSupplier())
              .addMethod(getSuggestMethod())
              .addMethod(getBatchSuggestMethod())
              .addMethod(getModelBatchSuggestMethod())
              .build();
        }
      }
    }
    return result;
  }
}
