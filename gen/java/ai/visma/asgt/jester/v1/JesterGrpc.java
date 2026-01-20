package ai.visma.asgt.jester.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.70.0)",
    comments = "Source: asgt/jester/v1/jester.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class JesterGrpc {

  private JesterGrpc() {}

  public static final java.lang.String SERVICE_NAME = "asgt.jester.v1.Jester";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.visma.asgt.jester.v1.SuggestionRequest,
      ai.visma.asgt.jester.v1.SuggestionResponse> getSuggestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Suggest",
      requestType = ai.visma.asgt.jester.v1.SuggestionRequest.class,
      responseType = ai.visma.asgt.jester.v1.SuggestionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.asgt.jester.v1.SuggestionRequest,
      ai.visma.asgt.jester.v1.SuggestionResponse> getSuggestMethod() {
    io.grpc.MethodDescriptor<ai.visma.asgt.jester.v1.SuggestionRequest, ai.visma.asgt.jester.v1.SuggestionResponse> getSuggestMethod;
    if ((getSuggestMethod = JesterGrpc.getSuggestMethod) == null) {
      synchronized (JesterGrpc.class) {
        if ((getSuggestMethod = JesterGrpc.getSuggestMethod) == null) {
          JesterGrpc.getSuggestMethod = getSuggestMethod =
              io.grpc.MethodDescriptor.<ai.visma.asgt.jester.v1.SuggestionRequest, ai.visma.asgt.jester.v1.SuggestionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Suggest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.jester.v1.SuggestionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.jester.v1.SuggestionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JesterMethodDescriptorSupplier("Suggest"))
              .build();
        }
      }
    }
    return getSuggestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.asgt.jester.v1.SuggestionRequest,
      ai.visma.asgt.jester.v1.SuggestionResponse> getInternalSuggestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InternalSuggest",
      requestType = ai.visma.asgt.jester.v1.SuggestionRequest.class,
      responseType = ai.visma.asgt.jester.v1.SuggestionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.asgt.jester.v1.SuggestionRequest,
      ai.visma.asgt.jester.v1.SuggestionResponse> getInternalSuggestMethod() {
    io.grpc.MethodDescriptor<ai.visma.asgt.jester.v1.SuggestionRequest, ai.visma.asgt.jester.v1.SuggestionResponse> getInternalSuggestMethod;
    if ((getInternalSuggestMethod = JesterGrpc.getInternalSuggestMethod) == null) {
      synchronized (JesterGrpc.class) {
        if ((getInternalSuggestMethod = JesterGrpc.getInternalSuggestMethod) == null) {
          JesterGrpc.getInternalSuggestMethod = getInternalSuggestMethod =
              io.grpc.MethodDescriptor.<ai.visma.asgt.jester.v1.SuggestionRequest, ai.visma.asgt.jester.v1.SuggestionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InternalSuggest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.jester.v1.SuggestionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.jester.v1.SuggestionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JesterMethodDescriptorSupplier("InternalSuggest"))
              .build();
        }
      }
    }
    return getInternalSuggestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.asgt.jester.v1.InternalSuggestSamplesRequest,
      ai.visma.asgt.jester.v1.InternalSuggestSamplesResponse> getInternalSuggestSamplesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InternalSuggestSamples",
      requestType = ai.visma.asgt.jester.v1.InternalSuggestSamplesRequest.class,
      responseType = ai.visma.asgt.jester.v1.InternalSuggestSamplesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.asgt.jester.v1.InternalSuggestSamplesRequest,
      ai.visma.asgt.jester.v1.InternalSuggestSamplesResponse> getInternalSuggestSamplesMethod() {
    io.grpc.MethodDescriptor<ai.visma.asgt.jester.v1.InternalSuggestSamplesRequest, ai.visma.asgt.jester.v1.InternalSuggestSamplesResponse> getInternalSuggestSamplesMethod;
    if ((getInternalSuggestSamplesMethod = JesterGrpc.getInternalSuggestSamplesMethod) == null) {
      synchronized (JesterGrpc.class) {
        if ((getInternalSuggestSamplesMethod = JesterGrpc.getInternalSuggestSamplesMethod) == null) {
          JesterGrpc.getInternalSuggestSamplesMethod = getInternalSuggestSamplesMethod =
              io.grpc.MethodDescriptor.<ai.visma.asgt.jester.v1.InternalSuggestSamplesRequest, ai.visma.asgt.jester.v1.InternalSuggestSamplesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InternalSuggestSamples"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.jester.v1.InternalSuggestSamplesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.jester.v1.InternalSuggestSamplesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JesterMethodDescriptorSupplier("InternalSuggestSamples"))
              .build();
        }
      }
    }
    return getInternalSuggestSamplesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static JesterStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JesterStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JesterStub>() {
        @java.lang.Override
        public JesterStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JesterStub(channel, callOptions);
        }
      };
    return JesterStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static JesterBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JesterBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JesterBlockingV2Stub>() {
        @java.lang.Override
        public JesterBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JesterBlockingV2Stub(channel, callOptions);
        }
      };
    return JesterBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static JesterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JesterBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JesterBlockingStub>() {
        @java.lang.Override
        public JesterBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JesterBlockingStub(channel, callOptions);
        }
      };
    return JesterBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static JesterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JesterFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JesterFutureStub>() {
        @java.lang.Override
        public JesterFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JesterFutureStub(channel, callOptions);
        }
      };
    return JesterFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void suggest(ai.visma.asgt.jester.v1.SuggestionRequest request,
        io.grpc.stub.StreamObserver<ai.visma.asgt.jester.v1.SuggestionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSuggestMethod(), responseObserver);
    }

    /**
     */
    @java.lang.Deprecated
    default void internalSuggest(ai.visma.asgt.jester.v1.SuggestionRequest request,
        io.grpc.stub.StreamObserver<ai.visma.asgt.jester.v1.SuggestionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInternalSuggestMethod(), responseObserver);
    }

    /**
     */
    default void internalSuggestSamples(ai.visma.asgt.jester.v1.InternalSuggestSamplesRequest request,
        io.grpc.stub.StreamObserver<ai.visma.asgt.jester.v1.InternalSuggestSamplesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInternalSuggestSamplesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Jester.
   */
  public static abstract class JesterImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return JesterGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Jester.
   */
  public static final class JesterStub
      extends io.grpc.stub.AbstractAsyncStub<JesterStub> {
    private JesterStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JesterStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JesterStub(channel, callOptions);
    }

    /**
     */
    public void suggest(ai.visma.asgt.jester.v1.SuggestionRequest request,
        io.grpc.stub.StreamObserver<ai.visma.asgt.jester.v1.SuggestionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSuggestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    @java.lang.Deprecated
    public void internalSuggest(ai.visma.asgt.jester.v1.SuggestionRequest request,
        io.grpc.stub.StreamObserver<ai.visma.asgt.jester.v1.SuggestionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInternalSuggestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void internalSuggestSamples(ai.visma.asgt.jester.v1.InternalSuggestSamplesRequest request,
        io.grpc.stub.StreamObserver<ai.visma.asgt.jester.v1.InternalSuggestSamplesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInternalSuggestSamplesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Jester.
   */
  public static final class JesterBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<JesterBlockingV2Stub> {
    private JesterBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JesterBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JesterBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public ai.visma.asgt.jester.v1.SuggestionResponse suggest(ai.visma.asgt.jester.v1.SuggestionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSuggestMethod(), getCallOptions(), request);
    }

    /**
     */
    @java.lang.Deprecated
    public ai.visma.asgt.jester.v1.SuggestionResponse internalSuggest(ai.visma.asgt.jester.v1.SuggestionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInternalSuggestMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.visma.asgt.jester.v1.InternalSuggestSamplesResponse internalSuggestSamples(ai.visma.asgt.jester.v1.InternalSuggestSamplesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInternalSuggestSamplesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Jester.
   */
  public static final class JesterBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<JesterBlockingStub> {
    private JesterBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JesterBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JesterBlockingStub(channel, callOptions);
    }

    /**
     */
    public ai.visma.asgt.jester.v1.SuggestionResponse suggest(ai.visma.asgt.jester.v1.SuggestionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSuggestMethod(), getCallOptions(), request);
    }

    /**
     */
    @java.lang.Deprecated
    public ai.visma.asgt.jester.v1.SuggestionResponse internalSuggest(ai.visma.asgt.jester.v1.SuggestionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInternalSuggestMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.visma.asgt.jester.v1.InternalSuggestSamplesResponse internalSuggestSamples(ai.visma.asgt.jester.v1.InternalSuggestSamplesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInternalSuggestSamplesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Jester.
   */
  public static final class JesterFutureStub
      extends io.grpc.stub.AbstractFutureStub<JesterFutureStub> {
    private JesterFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JesterFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JesterFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.asgt.jester.v1.SuggestionResponse> suggest(
        ai.visma.asgt.jester.v1.SuggestionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSuggestMethod(), getCallOptions()), request);
    }

    /**
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.asgt.jester.v1.SuggestionResponse> internalSuggest(
        ai.visma.asgt.jester.v1.SuggestionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInternalSuggestMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.asgt.jester.v1.InternalSuggestSamplesResponse> internalSuggestSamples(
        ai.visma.asgt.jester.v1.InternalSuggestSamplesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInternalSuggestSamplesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUGGEST = 0;
  private static final int METHODID_INTERNAL_SUGGEST = 1;
  private static final int METHODID_INTERNAL_SUGGEST_SAMPLES = 2;

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
          serviceImpl.suggest((ai.visma.asgt.jester.v1.SuggestionRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.asgt.jester.v1.SuggestionResponse>) responseObserver);
          break;
        case METHODID_INTERNAL_SUGGEST:
          serviceImpl.internalSuggest((ai.visma.asgt.jester.v1.SuggestionRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.asgt.jester.v1.SuggestionResponse>) responseObserver);
          break;
        case METHODID_INTERNAL_SUGGEST_SAMPLES:
          serviceImpl.internalSuggestSamples((ai.visma.asgt.jester.v1.InternalSuggestSamplesRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.asgt.jester.v1.InternalSuggestSamplesResponse>) responseObserver);
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
              ai.visma.asgt.jester.v1.SuggestionRequest,
              ai.visma.asgt.jester.v1.SuggestionResponse>(
                service, METHODID_SUGGEST)))
        .addMethod(
          getInternalSuggestMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.asgt.jester.v1.SuggestionRequest,
              ai.visma.asgt.jester.v1.SuggestionResponse>(
                service, METHODID_INTERNAL_SUGGEST)))
        .addMethod(
          getInternalSuggestSamplesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.asgt.jester.v1.InternalSuggestSamplesRequest,
              ai.visma.asgt.jester.v1.InternalSuggestSamplesResponse>(
                service, METHODID_INTERNAL_SUGGEST_SAMPLES)))
        .build();
  }

  private static abstract class JesterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    JesterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.visma.asgt.jester.v1.JesterProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Jester");
    }
  }

  private static final class JesterFileDescriptorSupplier
      extends JesterBaseDescriptorSupplier {
    JesterFileDescriptorSupplier() {}
  }

  private static final class JesterMethodDescriptorSupplier
      extends JesterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    JesterMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (JesterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new JesterFileDescriptorSupplier())
              .addMethod(getSuggestMethod())
              .addMethod(getInternalSuggestMethod())
              .addMethod(getInternalSuggestSamplesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
