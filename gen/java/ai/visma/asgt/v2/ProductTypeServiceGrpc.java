package ai.visma.asgt.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.70.0)",
    comments = "Source: asgt/v2/product_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProductTypeServiceGrpc {

  private ProductTypeServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "asgt.v2.ProductTypeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.visma.asgt.v2.ProductTypeBatchSuggestRequest,
      ai.visma.asgt.v2.ProductTypeBatchSuggestResponse> getBatchSuggestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchSuggest",
      requestType = ai.visma.asgt.v2.ProductTypeBatchSuggestRequest.class,
      responseType = ai.visma.asgt.v2.ProductTypeBatchSuggestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.asgt.v2.ProductTypeBatchSuggestRequest,
      ai.visma.asgt.v2.ProductTypeBatchSuggestResponse> getBatchSuggestMethod() {
    io.grpc.MethodDescriptor<ai.visma.asgt.v2.ProductTypeBatchSuggestRequest, ai.visma.asgt.v2.ProductTypeBatchSuggestResponse> getBatchSuggestMethod;
    if ((getBatchSuggestMethod = ProductTypeServiceGrpc.getBatchSuggestMethod) == null) {
      synchronized (ProductTypeServiceGrpc.class) {
        if ((getBatchSuggestMethod = ProductTypeServiceGrpc.getBatchSuggestMethod) == null) {
          ProductTypeServiceGrpc.getBatchSuggestMethod = getBatchSuggestMethod =
              io.grpc.MethodDescriptor.<ai.visma.asgt.v2.ProductTypeBatchSuggestRequest, ai.visma.asgt.v2.ProductTypeBatchSuggestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchSuggest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.v2.ProductTypeBatchSuggestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.v2.ProductTypeBatchSuggestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductTypeServiceMethodDescriptorSupplier("BatchSuggest"))
              .build();
        }
      }
    }
    return getBatchSuggestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.asgt.v2.ProductTypeBatchSuggestRequest,
      ai.visma.asgt.v2.ProductTypeBatchSuggestResponse> getInternalBatchSuggestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InternalBatchSuggest",
      requestType = ai.visma.asgt.v2.ProductTypeBatchSuggestRequest.class,
      responseType = ai.visma.asgt.v2.ProductTypeBatchSuggestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.asgt.v2.ProductTypeBatchSuggestRequest,
      ai.visma.asgt.v2.ProductTypeBatchSuggestResponse> getInternalBatchSuggestMethod() {
    io.grpc.MethodDescriptor<ai.visma.asgt.v2.ProductTypeBatchSuggestRequest, ai.visma.asgt.v2.ProductTypeBatchSuggestResponse> getInternalBatchSuggestMethod;
    if ((getInternalBatchSuggestMethod = ProductTypeServiceGrpc.getInternalBatchSuggestMethod) == null) {
      synchronized (ProductTypeServiceGrpc.class) {
        if ((getInternalBatchSuggestMethod = ProductTypeServiceGrpc.getInternalBatchSuggestMethod) == null) {
          ProductTypeServiceGrpc.getInternalBatchSuggestMethod = getInternalBatchSuggestMethod =
              io.grpc.MethodDescriptor.<ai.visma.asgt.v2.ProductTypeBatchSuggestRequest, ai.visma.asgt.v2.ProductTypeBatchSuggestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InternalBatchSuggest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.v2.ProductTypeBatchSuggestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.v2.ProductTypeBatchSuggestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductTypeServiceMethodDescriptorSupplier("InternalBatchSuggest"))
              .build();
        }
      }
    }
    return getInternalBatchSuggestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.asgt.v2.ProductTypeFeedbackRequest,
      com.google.protobuf.Empty> getFeedbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Feedback",
      requestType = ai.visma.asgt.v2.ProductTypeFeedbackRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.asgt.v2.ProductTypeFeedbackRequest,
      com.google.protobuf.Empty> getFeedbackMethod() {
    io.grpc.MethodDescriptor<ai.visma.asgt.v2.ProductTypeFeedbackRequest, com.google.protobuf.Empty> getFeedbackMethod;
    if ((getFeedbackMethod = ProductTypeServiceGrpc.getFeedbackMethod) == null) {
      synchronized (ProductTypeServiceGrpc.class) {
        if ((getFeedbackMethod = ProductTypeServiceGrpc.getFeedbackMethod) == null) {
          ProductTypeServiceGrpc.getFeedbackMethod = getFeedbackMethod =
              io.grpc.MethodDescriptor.<ai.visma.asgt.v2.ProductTypeFeedbackRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Feedback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.v2.ProductTypeFeedbackRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ProductTypeServiceMethodDescriptorSupplier("Feedback"))
              .build();
        }
      }
    }
    return getFeedbackMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductTypeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductTypeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductTypeServiceStub>() {
        @java.lang.Override
        public ProductTypeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductTypeServiceStub(channel, callOptions);
        }
      };
    return ProductTypeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static ProductTypeServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductTypeServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductTypeServiceBlockingV2Stub>() {
        @java.lang.Override
        public ProductTypeServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductTypeServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return ProductTypeServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductTypeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductTypeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductTypeServiceBlockingStub>() {
        @java.lang.Override
        public ProductTypeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductTypeServiceBlockingStub(channel, callOptions);
        }
      };
    return ProductTypeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductTypeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductTypeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductTypeServiceFutureStub>() {
        @java.lang.Override
        public ProductTypeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductTypeServiceFutureStub(channel, callOptions);
        }
      };
    return ProductTypeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Suggest product types for a batch of text inputs.
     * </pre>
     */
    default void batchSuggest(ai.visma.asgt.v2.ProductTypeBatchSuggestRequest request,
        io.grpc.stub.StreamObserver<ai.visma.asgt.v2.ProductTypeBatchSuggestResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchSuggestMethod(), responseObserver);
    }

    /**
     * <pre>
     * Internal cluster-only batch suggest for product types.
     * </pre>
     */
    default void internalBatchSuggest(ai.visma.asgt.v2.ProductTypeBatchSuggestRequest request,
        io.grpc.stub.StreamObserver<ai.visma.asgt.v2.ProductTypeBatchSuggestResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInternalBatchSuggestMethod(), responseObserver);
    }

    /**
     * <pre>
     * Submit feedback for product type predictions.
     * </pre>
     */
    default void feedback(ai.visma.asgt.v2.ProductTypeFeedbackRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFeedbackMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ProductTypeService.
   */
  public static abstract class ProductTypeServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ProductTypeServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ProductTypeService.
   */
  public static final class ProductTypeServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ProductTypeServiceStub> {
    private ProductTypeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductTypeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductTypeServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Suggest product types for a batch of text inputs.
     * </pre>
     */
    public void batchSuggest(ai.visma.asgt.v2.ProductTypeBatchSuggestRequest request,
        io.grpc.stub.StreamObserver<ai.visma.asgt.v2.ProductTypeBatchSuggestResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchSuggestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Internal cluster-only batch suggest for product types.
     * </pre>
     */
    public void internalBatchSuggest(ai.visma.asgt.v2.ProductTypeBatchSuggestRequest request,
        io.grpc.stub.StreamObserver<ai.visma.asgt.v2.ProductTypeBatchSuggestResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInternalBatchSuggestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Submit feedback for product type predictions.
     * </pre>
     */
    public void feedback(ai.visma.asgt.v2.ProductTypeFeedbackRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFeedbackMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ProductTypeService.
   */
  public static final class ProductTypeServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ProductTypeServiceBlockingV2Stub> {
    private ProductTypeServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductTypeServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductTypeServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Suggest product types for a batch of text inputs.
     * </pre>
     */
    public ai.visma.asgt.v2.ProductTypeBatchSuggestResponse batchSuggest(ai.visma.asgt.v2.ProductTypeBatchSuggestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchSuggestMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Internal cluster-only batch suggest for product types.
     * </pre>
     */
    public ai.visma.asgt.v2.ProductTypeBatchSuggestResponse internalBatchSuggest(ai.visma.asgt.v2.ProductTypeBatchSuggestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInternalBatchSuggestMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Submit feedback for product type predictions.
     * </pre>
     */
    public com.google.protobuf.Empty feedback(ai.visma.asgt.v2.ProductTypeFeedbackRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFeedbackMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service ProductTypeService.
   */
  public static final class ProductTypeServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ProductTypeServiceBlockingStub> {
    private ProductTypeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductTypeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductTypeServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Suggest product types for a batch of text inputs.
     * </pre>
     */
    public ai.visma.asgt.v2.ProductTypeBatchSuggestResponse batchSuggest(ai.visma.asgt.v2.ProductTypeBatchSuggestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchSuggestMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Internal cluster-only batch suggest for product types.
     * </pre>
     */
    public ai.visma.asgt.v2.ProductTypeBatchSuggestResponse internalBatchSuggest(ai.visma.asgt.v2.ProductTypeBatchSuggestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInternalBatchSuggestMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Submit feedback for product type predictions.
     * </pre>
     */
    public com.google.protobuf.Empty feedback(ai.visma.asgt.v2.ProductTypeFeedbackRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFeedbackMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ProductTypeService.
   */
  public static final class ProductTypeServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ProductTypeServiceFutureStub> {
    private ProductTypeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductTypeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductTypeServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Suggest product types for a batch of text inputs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.asgt.v2.ProductTypeBatchSuggestResponse> batchSuggest(
        ai.visma.asgt.v2.ProductTypeBatchSuggestRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchSuggestMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Internal cluster-only batch suggest for product types.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.asgt.v2.ProductTypeBatchSuggestResponse> internalBatchSuggest(
        ai.visma.asgt.v2.ProductTypeBatchSuggestRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInternalBatchSuggestMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Submit feedback for product type predictions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> feedback(
        ai.visma.asgt.v2.ProductTypeFeedbackRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFeedbackMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BATCH_SUGGEST = 0;
  private static final int METHODID_INTERNAL_BATCH_SUGGEST = 1;
  private static final int METHODID_FEEDBACK = 2;

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
        case METHODID_BATCH_SUGGEST:
          serviceImpl.batchSuggest((ai.visma.asgt.v2.ProductTypeBatchSuggestRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.asgt.v2.ProductTypeBatchSuggestResponse>) responseObserver);
          break;
        case METHODID_INTERNAL_BATCH_SUGGEST:
          serviceImpl.internalBatchSuggest((ai.visma.asgt.v2.ProductTypeBatchSuggestRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.asgt.v2.ProductTypeBatchSuggestResponse>) responseObserver);
          break;
        case METHODID_FEEDBACK:
          serviceImpl.feedback((ai.visma.asgt.v2.ProductTypeFeedbackRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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
          getBatchSuggestMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.asgt.v2.ProductTypeBatchSuggestRequest,
              ai.visma.asgt.v2.ProductTypeBatchSuggestResponse>(
                service, METHODID_BATCH_SUGGEST)))
        .addMethod(
          getInternalBatchSuggestMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.asgt.v2.ProductTypeBatchSuggestRequest,
              ai.visma.asgt.v2.ProductTypeBatchSuggestResponse>(
                service, METHODID_INTERNAL_BATCH_SUGGEST)))
        .addMethod(
          getFeedbackMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.asgt.v2.ProductTypeFeedbackRequest,
              com.google.protobuf.Empty>(
                service, METHODID_FEEDBACK)))
        .build();
  }

  private static abstract class ProductTypeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductTypeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.visma.asgt.v2.ProductServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProductTypeService");
    }
  }

  private static final class ProductTypeServiceFileDescriptorSupplier
      extends ProductTypeServiceBaseDescriptorSupplier {
    ProductTypeServiceFileDescriptorSupplier() {}
  }

  private static final class ProductTypeServiceMethodDescriptorSupplier
      extends ProductTypeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ProductTypeServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ProductTypeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductTypeServiceFileDescriptorSupplier())
              .addMethod(getBatchSuggestMethod())
              .addMethod(getInternalBatchSuggestMethod())
              .addMethod(getFeedbackMethod())
              .build();
        }
      }
    }
    return result;
  }
}
