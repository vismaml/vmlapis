package ai.visma.ssn.access.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Issue valet keys: short-lived tokens for web and mobile apps.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.70.0)",
    comments = "Source: ssn/access/v1/access.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AccessGrpc {

  private AccessGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ssn.access.v1.Access";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.visma.ssn.access.v1.ValetKeyRequest,
      ai.visma.ssn.access.v1.ValetKeyResponse> getGenerateValetKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateValetKey",
      requestType = ai.visma.ssn.access.v1.ValetKeyRequest.class,
      responseType = ai.visma.ssn.access.v1.ValetKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.ssn.access.v1.ValetKeyRequest,
      ai.visma.ssn.access.v1.ValetKeyResponse> getGenerateValetKeyMethod() {
    io.grpc.MethodDescriptor<ai.visma.ssn.access.v1.ValetKeyRequest, ai.visma.ssn.access.v1.ValetKeyResponse> getGenerateValetKeyMethod;
    if ((getGenerateValetKeyMethod = AccessGrpc.getGenerateValetKeyMethod) == null) {
      synchronized (AccessGrpc.class) {
        if ((getGenerateValetKeyMethod = AccessGrpc.getGenerateValetKeyMethod) == null) {
          AccessGrpc.getGenerateValetKeyMethod = getGenerateValetKeyMethod =
              io.grpc.MethodDescriptor.<ai.visma.ssn.access.v1.ValetKeyRequest, ai.visma.ssn.access.v1.ValetKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateValetKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.access.v1.ValetKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.access.v1.ValetKeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccessMethodDescriptorSupplier("GenerateValetKey"))
              .build();
        }
      }
    }
    return getGenerateValetKeyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccessStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccessStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccessStub>() {
        @java.lang.Override
        public AccessStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccessStub(channel, callOptions);
        }
      };
    return AccessStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static AccessBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccessBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccessBlockingV2Stub>() {
        @java.lang.Override
        public AccessBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccessBlockingV2Stub(channel, callOptions);
        }
      };
    return AccessBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccessBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccessBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccessBlockingStub>() {
        @java.lang.Override
        public AccessBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccessBlockingStub(channel, callOptions);
        }
      };
    return AccessBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccessFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccessFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccessFutureStub>() {
        @java.lang.Override
        public AccessFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccessFutureStub(channel, callOptions);
        }
      };
    return AccessFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Issue valet keys: short-lived tokens for web and mobile apps.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create a valet key, a short-lived token for a web or mobile app.
     * Call this from your backend with your project token, and give the
     * returned token to the app. The app sends it as
     * `Authorization: Bearer &lt;token&gt;`, so your project token never has to be
     * in an untrusted client. The key expires 8 hours after it's issued,
     * unless you set `exp`.
     * A valet key can call POST /v1/document:annotate and
     * POST /v1/feedback:create, the Smartscan Async endpoints that create a
     * transaction, get its status or results, and update its results, and the
     * three Autosuggest suggest endpoints and GET /v2/trainings. Every other
     * endpoint in the API reference returns 403 for a valet key, and so does
     * any call after the key expires. Keys can't be revoked.
     * Errors: 400 if `exp` is more than 48 hours from now, and 403 if you call
     * this endpoint with a valet key or the demo token.
     * </pre>
     */
    default void generateValetKey(ai.visma.ssn.access.v1.ValetKeyRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.access.v1.ValetKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateValetKeyMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Access.
   * <pre>
   * Issue valet keys: short-lived tokens for web and mobile apps.
   * </pre>
   */
  public static abstract class AccessImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AccessGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Access.
   * <pre>
   * Issue valet keys: short-lived tokens for web and mobile apps.
   * </pre>
   */
  public static final class AccessStub
      extends io.grpc.stub.AbstractAsyncStub<AccessStub> {
    private AccessStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccessStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a valet key, a short-lived token for a web or mobile app.
     * Call this from your backend with your project token, and give the
     * returned token to the app. The app sends it as
     * `Authorization: Bearer &lt;token&gt;`, so your project token never has to be
     * in an untrusted client. The key expires 8 hours after it's issued,
     * unless you set `exp`.
     * A valet key can call POST /v1/document:annotate and
     * POST /v1/feedback:create, the Smartscan Async endpoints that create a
     * transaction, get its status or results, and update its results, and the
     * three Autosuggest suggest endpoints and GET /v2/trainings. Every other
     * endpoint in the API reference returns 403 for a valet key, and so does
     * any call after the key expires. Keys can't be revoked.
     * Errors: 400 if `exp` is more than 48 hours from now, and 403 if you call
     * this endpoint with a valet key or the demo token.
     * </pre>
     */
    public void generateValetKey(ai.visma.ssn.access.v1.ValetKeyRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.access.v1.ValetKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateValetKeyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Access.
   * <pre>
   * Issue valet keys: short-lived tokens for web and mobile apps.
   * </pre>
   */
  public static final class AccessBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<AccessBlockingV2Stub> {
    private AccessBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccessBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a valet key, a short-lived token for a web or mobile app.
     * Call this from your backend with your project token, and give the
     * returned token to the app. The app sends it as
     * `Authorization: Bearer &lt;token&gt;`, so your project token never has to be
     * in an untrusted client. The key expires 8 hours after it's issued,
     * unless you set `exp`.
     * A valet key can call POST /v1/document:annotate and
     * POST /v1/feedback:create, the Smartscan Async endpoints that create a
     * transaction, get its status or results, and update its results, and the
     * three Autosuggest suggest endpoints and GET /v2/trainings. Every other
     * endpoint in the API reference returns 403 for a valet key, and so does
     * any call after the key expires. Keys can't be revoked.
     * Errors: 400 if `exp` is more than 48 hours from now, and 403 if you call
     * this endpoint with a valet key or the demo token.
     * </pre>
     */
    public ai.visma.ssn.access.v1.ValetKeyResponse generateValetKey(ai.visma.ssn.access.v1.ValetKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateValetKeyMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Access.
   * <pre>
   * Issue valet keys: short-lived tokens for web and mobile apps.
   * </pre>
   */
  public static final class AccessBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AccessBlockingStub> {
    private AccessBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccessBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a valet key, a short-lived token for a web or mobile app.
     * Call this from your backend with your project token, and give the
     * returned token to the app. The app sends it as
     * `Authorization: Bearer &lt;token&gt;`, so your project token never has to be
     * in an untrusted client. The key expires 8 hours after it's issued,
     * unless you set `exp`.
     * A valet key can call POST /v1/document:annotate and
     * POST /v1/feedback:create, the Smartscan Async endpoints that create a
     * transaction, get its status or results, and update its results, and the
     * three Autosuggest suggest endpoints and GET /v2/trainings. Every other
     * endpoint in the API reference returns 403 for a valet key, and so does
     * any call after the key expires. Keys can't be revoked.
     * Errors: 400 if `exp` is more than 48 hours from now, and 403 if you call
     * this endpoint with a valet key or the demo token.
     * </pre>
     */
    public ai.visma.ssn.access.v1.ValetKeyResponse generateValetKey(ai.visma.ssn.access.v1.ValetKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateValetKeyMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Access.
   * <pre>
   * Issue valet keys: short-lived tokens for web and mobile apps.
   * </pre>
   */
  public static final class AccessFutureStub
      extends io.grpc.stub.AbstractFutureStub<AccessFutureStub> {
    private AccessFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccessFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a valet key, a short-lived token for a web or mobile app.
     * Call this from your backend with your project token, and give the
     * returned token to the app. The app sends it as
     * `Authorization: Bearer &lt;token&gt;`, so your project token never has to be
     * in an untrusted client. The key expires 8 hours after it's issued,
     * unless you set `exp`.
     * A valet key can call POST /v1/document:annotate and
     * POST /v1/feedback:create, the Smartscan Async endpoints that create a
     * transaction, get its status or results, and update its results, and the
     * three Autosuggest suggest endpoints and GET /v2/trainings. Every other
     * endpoint in the API reference returns 403 for a valet key, and so does
     * any call after the key expires. Keys can't be revoked.
     * Errors: 400 if `exp` is more than 48 hours from now, and 403 if you call
     * this endpoint with a valet key or the demo token.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.ssn.access.v1.ValetKeyResponse> generateValetKey(
        ai.visma.ssn.access.v1.ValetKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateValetKeyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GENERATE_VALET_KEY = 0;

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
        case METHODID_GENERATE_VALET_KEY:
          serviceImpl.generateValetKey((ai.visma.ssn.access.v1.ValetKeyRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.ssn.access.v1.ValetKeyResponse>) responseObserver);
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
          getGenerateValetKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.ssn.access.v1.ValetKeyRequest,
              ai.visma.ssn.access.v1.ValetKeyResponse>(
                service, METHODID_GENERATE_VALET_KEY)))
        .build();
  }

  private static abstract class AccessBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccessBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.visma.ssn.access.v1.AccessProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Access");
    }
  }

  private static final class AccessFileDescriptorSupplier
      extends AccessBaseDescriptorSupplier {
    AccessFileDescriptorSupplier() {}
  }

  private static final class AccessMethodDescriptorSupplier
      extends AccessBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AccessMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AccessGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccessFileDescriptorSupplier())
              .addMethod(getGenerateValetKeyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
