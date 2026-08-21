package ai.visma.asgt.tabicl.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * TabiclService performs in-context tabular classification over a dataset's
 * labeled examples.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.70.0)",
    comments = "Source: asgt/tabicl/v1/tabicl_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TabiclServiceGrpc {

  private TabiclServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "asgt.tabicl.v1.TabiclService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.visma.asgt.tabicl.v1.BatchSuggestRequest,
      ai.visma.asgt.tabicl.v1.BatchSuggestResponse> getBatchSuggestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchSuggest",
      requestType = ai.visma.asgt.tabicl.v1.BatchSuggestRequest.class,
      responseType = ai.visma.asgt.tabicl.v1.BatchSuggestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.asgt.tabicl.v1.BatchSuggestRequest,
      ai.visma.asgt.tabicl.v1.BatchSuggestResponse> getBatchSuggestMethod() {
    io.grpc.MethodDescriptor<ai.visma.asgt.tabicl.v1.BatchSuggestRequest, ai.visma.asgt.tabicl.v1.BatchSuggestResponse> getBatchSuggestMethod;
    if ((getBatchSuggestMethod = TabiclServiceGrpc.getBatchSuggestMethod) == null) {
      synchronized (TabiclServiceGrpc.class) {
        if ((getBatchSuggestMethod = TabiclServiceGrpc.getBatchSuggestMethod) == null) {
          TabiclServiceGrpc.getBatchSuggestMethod = getBatchSuggestMethod =
              io.grpc.MethodDescriptor.<ai.visma.asgt.tabicl.v1.BatchSuggestRequest, ai.visma.asgt.tabicl.v1.BatchSuggestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchSuggest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.tabicl.v1.BatchSuggestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.tabicl.v1.BatchSuggestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TabiclServiceMethodDescriptorSupplier("BatchSuggest"))
              .build();
        }
      }
    }
    return getBatchSuggestMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TabiclServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TabiclServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TabiclServiceStub>() {
        @java.lang.Override
        public TabiclServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TabiclServiceStub(channel, callOptions);
        }
      };
    return TabiclServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static TabiclServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TabiclServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TabiclServiceBlockingV2Stub>() {
        @java.lang.Override
        public TabiclServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TabiclServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return TabiclServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TabiclServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TabiclServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TabiclServiceBlockingStub>() {
        @java.lang.Override
        public TabiclServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TabiclServiceBlockingStub(channel, callOptions);
        }
      };
    return TabiclServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TabiclServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TabiclServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TabiclServiceFutureStub>() {
        @java.lang.Override
        public TabiclServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TabiclServiceFutureStub(channel, callOptions);
        }
      };
    return TabiclServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * TabiclService performs in-context tabular classification over a dataset's
   * labeled examples.
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void batchSuggest(ai.visma.asgt.tabicl.v1.BatchSuggestRequest request,
        io.grpc.stub.StreamObserver<ai.visma.asgt.tabicl.v1.BatchSuggestResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchSuggestMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TabiclService.
   * <pre>
   * TabiclService performs in-context tabular classification over a dataset's
   * labeled examples.
   * </pre>
   */
  public static abstract class TabiclServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TabiclServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TabiclService.
   * <pre>
   * TabiclService performs in-context tabular classification over a dataset's
   * labeled examples.
   * </pre>
   */
  public static final class TabiclServiceStub
      extends io.grpc.stub.AbstractAsyncStub<TabiclServiceStub> {
    private TabiclServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TabiclServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TabiclServiceStub(channel, callOptions);
    }

    /**
     */
    public void batchSuggest(ai.visma.asgt.tabicl.v1.BatchSuggestRequest request,
        io.grpc.stub.StreamObserver<ai.visma.asgt.tabicl.v1.BatchSuggestResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchSuggestMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TabiclService.
   * <pre>
   * TabiclService performs in-context tabular classification over a dataset's
   * labeled examples.
   * </pre>
   */
  public static final class TabiclServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<TabiclServiceBlockingV2Stub> {
    private TabiclServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TabiclServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TabiclServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public ai.visma.asgt.tabicl.v1.BatchSuggestResponse batchSuggest(ai.visma.asgt.tabicl.v1.BatchSuggestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchSuggestMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service TabiclService.
   * <pre>
   * TabiclService performs in-context tabular classification over a dataset's
   * labeled examples.
   * </pre>
   */
  public static final class TabiclServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TabiclServiceBlockingStub> {
    private TabiclServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TabiclServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TabiclServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ai.visma.asgt.tabicl.v1.BatchSuggestResponse batchSuggest(ai.visma.asgt.tabicl.v1.BatchSuggestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchSuggestMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TabiclService.
   * <pre>
   * TabiclService performs in-context tabular classification over a dataset's
   * labeled examples.
   * </pre>
   */
  public static final class TabiclServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<TabiclServiceFutureStub> {
    private TabiclServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TabiclServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TabiclServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.asgt.tabicl.v1.BatchSuggestResponse> batchSuggest(
        ai.visma.asgt.tabicl.v1.BatchSuggestRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchSuggestMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BATCH_SUGGEST = 0;

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
          serviceImpl.batchSuggest((ai.visma.asgt.tabicl.v1.BatchSuggestRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.asgt.tabicl.v1.BatchSuggestResponse>) responseObserver);
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
              ai.visma.asgt.tabicl.v1.BatchSuggestRequest,
              ai.visma.asgt.tabicl.v1.BatchSuggestResponse>(
                service, METHODID_BATCH_SUGGEST)))
        .build();
  }

  private static abstract class TabiclServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TabiclServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.visma.asgt.tabicl.v1.TabiclServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TabiclService");
    }
  }

  private static final class TabiclServiceFileDescriptorSupplier
      extends TabiclServiceBaseDescriptorSupplier {
    TabiclServiceFileDescriptorSupplier() {}
  }

  private static final class TabiclServiceMethodDescriptorSupplier
      extends TabiclServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TabiclServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TabiclServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TabiclServiceFileDescriptorSupplier())
              .addMethod(getBatchSuggestMethod())
              .build();
        }
      }
    }
    return result;
  }
}
