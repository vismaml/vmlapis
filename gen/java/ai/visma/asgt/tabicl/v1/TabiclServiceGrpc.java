package ai.visma.asgt.tabicl.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * TabiclService performs in-context tabular classification over a dataset's
 * labeled examples. Cluster-internal only; not exposed on the public HTTP
 * surface.
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
  private static volatile io.grpc.MethodDescriptor<ai.visma.asgt.tabicl.v1.SuggestRequest,
      ai.visma.asgt.tabicl.v1.SuggestResponse> getSuggestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Suggest",
      requestType = ai.visma.asgt.tabicl.v1.SuggestRequest.class,
      responseType = ai.visma.asgt.tabicl.v1.SuggestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.asgt.tabicl.v1.SuggestRequest,
      ai.visma.asgt.tabicl.v1.SuggestResponse> getSuggestMethod() {
    io.grpc.MethodDescriptor<ai.visma.asgt.tabicl.v1.SuggestRequest, ai.visma.asgt.tabicl.v1.SuggestResponse> getSuggestMethod;
    if ((getSuggestMethod = TabiclServiceGrpc.getSuggestMethod) == null) {
      synchronized (TabiclServiceGrpc.class) {
        if ((getSuggestMethod = TabiclServiceGrpc.getSuggestMethod) == null) {
          TabiclServiceGrpc.getSuggestMethod = getSuggestMethod =
              io.grpc.MethodDescriptor.<ai.visma.asgt.tabicl.v1.SuggestRequest, ai.visma.asgt.tabicl.v1.SuggestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Suggest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.tabicl.v1.SuggestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.tabicl.v1.SuggestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TabiclServiceMethodDescriptorSupplier("Suggest"))
              .build();
        }
      }
    }
    return getSuggestMethod;
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
   * labeled examples. Cluster-internal only; not exposed on the public HTTP
   * surface.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Suggest predicts every target found in the dataset's labeled examples
     * for each input.
     * </pre>
     */
    default void suggest(ai.visma.asgt.tabicl.v1.SuggestRequest request,
        io.grpc.stub.StreamObserver<ai.visma.asgt.tabicl.v1.SuggestResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSuggestMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TabiclService.
   * <pre>
   * TabiclService performs in-context tabular classification over a dataset's
   * labeled examples. Cluster-internal only; not exposed on the public HTTP
   * surface.
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
   * labeled examples. Cluster-internal only; not exposed on the public HTTP
   * surface.
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
     * <pre>
     * Suggest predicts every target found in the dataset's labeled examples
     * for each input.
     * </pre>
     */
    public void suggest(ai.visma.asgt.tabicl.v1.SuggestRequest request,
        io.grpc.stub.StreamObserver<ai.visma.asgt.tabicl.v1.SuggestResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSuggestMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TabiclService.
   * <pre>
   * TabiclService performs in-context tabular classification over a dataset's
   * labeled examples. Cluster-internal only; not exposed on the public HTTP
   * surface.
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
     * <pre>
     * Suggest predicts every target found in the dataset's labeled examples
     * for each input.
     * </pre>
     */
    public ai.visma.asgt.tabicl.v1.SuggestResponse suggest(ai.visma.asgt.tabicl.v1.SuggestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSuggestMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service TabiclService.
   * <pre>
   * TabiclService performs in-context tabular classification over a dataset's
   * labeled examples. Cluster-internal only; not exposed on the public HTTP
   * surface.
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
     * <pre>
     * Suggest predicts every target found in the dataset's labeled examples
     * for each input.
     * </pre>
     */
    public ai.visma.asgt.tabicl.v1.SuggestResponse suggest(ai.visma.asgt.tabicl.v1.SuggestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSuggestMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TabiclService.
   * <pre>
   * TabiclService performs in-context tabular classification over a dataset's
   * labeled examples. Cluster-internal only; not exposed on the public HTTP
   * surface.
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
     * <pre>
     * Suggest predicts every target found in the dataset's labeled examples
     * for each input.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.asgt.tabicl.v1.SuggestResponse> suggest(
        ai.visma.asgt.tabicl.v1.SuggestRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSuggestMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUGGEST = 0;

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
          serviceImpl.suggest((ai.visma.asgt.tabicl.v1.SuggestRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.asgt.tabicl.v1.SuggestResponse>) responseObserver);
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
              ai.visma.asgt.tabicl.v1.SuggestRequest,
              ai.visma.asgt.tabicl.v1.SuggestResponse>(
                service, METHODID_SUGGEST)))
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
              .addMethod(getSuggestMethod())
              .build();
        }
      }
    }
    return result;
  }
}
