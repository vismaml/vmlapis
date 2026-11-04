package ai.visma.ssn.hubixservice.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * HubixService is an internal service that gets a document verified by Hubix
 * reviewers. It knows nothing about its callers' entities: a caller names the
 * subject and polls for the result. The caller is the ctxvml username on the
 * call; every verification is scoped by it, and a caller sees only its own.
 * Errors carry a google.rpc.ErrorInfo with domain "hubix-service" and a
 * reason such as "declined:format:too-large" or "not-found".
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.70.0)",
    comments = "Source: ssn/hubixservice/v1/hubixservice.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HubixServiceGrpc {

  private HubixServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ssn.hubixservice.v1.HubixService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.visma.ssn.hubixservice.v1.StartVerificationRequest,
      ai.visma.ssn.hubixservice.v1.Verification> getStartVerificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartVerification",
      requestType = ai.visma.ssn.hubixservice.v1.StartVerificationRequest.class,
      responseType = ai.visma.ssn.hubixservice.v1.Verification.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.ssn.hubixservice.v1.StartVerificationRequest,
      ai.visma.ssn.hubixservice.v1.Verification> getStartVerificationMethod() {
    io.grpc.MethodDescriptor<ai.visma.ssn.hubixservice.v1.StartVerificationRequest, ai.visma.ssn.hubixservice.v1.Verification> getStartVerificationMethod;
    if ((getStartVerificationMethod = HubixServiceGrpc.getStartVerificationMethod) == null) {
      synchronized (HubixServiceGrpc.class) {
        if ((getStartVerificationMethod = HubixServiceGrpc.getStartVerificationMethod) == null) {
          HubixServiceGrpc.getStartVerificationMethod = getStartVerificationMethod =
              io.grpc.MethodDescriptor.<ai.visma.ssn.hubixservice.v1.StartVerificationRequest, ai.visma.ssn.hubixservice.v1.Verification>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartVerification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.hubixservice.v1.StartVerificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.hubixservice.v1.Verification.getDefaultInstance()))
              .setSchemaDescriptor(new HubixServiceMethodDescriptorSupplier("StartVerification"))
              .build();
        }
      }
    }
    return getStartVerificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.ssn.hubixservice.v1.GetVerificationRequest,
      ai.visma.ssn.hubixservice.v1.Verification> getGetVerificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVerification",
      requestType = ai.visma.ssn.hubixservice.v1.GetVerificationRequest.class,
      responseType = ai.visma.ssn.hubixservice.v1.Verification.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.ssn.hubixservice.v1.GetVerificationRequest,
      ai.visma.ssn.hubixservice.v1.Verification> getGetVerificationMethod() {
    io.grpc.MethodDescriptor<ai.visma.ssn.hubixservice.v1.GetVerificationRequest, ai.visma.ssn.hubixservice.v1.Verification> getGetVerificationMethod;
    if ((getGetVerificationMethod = HubixServiceGrpc.getGetVerificationMethod) == null) {
      synchronized (HubixServiceGrpc.class) {
        if ((getGetVerificationMethod = HubixServiceGrpc.getGetVerificationMethod) == null) {
          HubixServiceGrpc.getGetVerificationMethod = getGetVerificationMethod =
              io.grpc.MethodDescriptor.<ai.visma.ssn.hubixservice.v1.GetVerificationRequest, ai.visma.ssn.hubixservice.v1.Verification>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetVerification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.hubixservice.v1.GetVerificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.hubixservice.v1.Verification.getDefaultInstance()))
              .setSchemaDescriptor(new HubixServiceMethodDescriptorSupplier("GetVerification"))
              .build();
        }
      }
    }
    return getGetVerificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.ssn.hubixservice.v1.DeleteVerificationsRequest,
      com.google.protobuf.Empty> getDeleteVerificationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteVerifications",
      requestType = ai.visma.ssn.hubixservice.v1.DeleteVerificationsRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.ssn.hubixservice.v1.DeleteVerificationsRequest,
      com.google.protobuf.Empty> getDeleteVerificationsMethod() {
    io.grpc.MethodDescriptor<ai.visma.ssn.hubixservice.v1.DeleteVerificationsRequest, com.google.protobuf.Empty> getDeleteVerificationsMethod;
    if ((getDeleteVerificationsMethod = HubixServiceGrpc.getDeleteVerificationsMethod) == null) {
      synchronized (HubixServiceGrpc.class) {
        if ((getDeleteVerificationsMethod = HubixServiceGrpc.getDeleteVerificationsMethod) == null) {
          HubixServiceGrpc.getDeleteVerificationsMethod = getDeleteVerificationsMethod =
              io.grpc.MethodDescriptor.<ai.visma.ssn.hubixservice.v1.DeleteVerificationsRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteVerifications"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.hubixservice.v1.DeleteVerificationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new HubixServiceMethodDescriptorSupplier("DeleteVerifications"))
              .build();
        }
      }
    }
    return getDeleteVerificationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HubixServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HubixServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HubixServiceStub>() {
        @java.lang.Override
        public HubixServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HubixServiceStub(channel, callOptions);
        }
      };
    return HubixServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static HubixServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HubixServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HubixServiceBlockingV2Stub>() {
        @java.lang.Override
        public HubixServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HubixServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return HubixServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HubixServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HubixServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HubixServiceBlockingStub>() {
        @java.lang.Override
        public HubixServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HubixServiceBlockingStub(channel, callOptions);
        }
      };
    return HubixServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HubixServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HubixServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HubixServiceFutureStub>() {
        @java.lang.Override
        public HubixServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HubixServiceFutureStub(channel, callOptions);
        }
      };
    return HubixServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * HubixService is an internal service that gets a document verified by Hubix
   * reviewers. It knows nothing about its callers' entities: a caller names the
   * subject and polls for the result. The caller is the ctxvml username on the
   * call; every verification is scoped by it, and a caller sees only its own.
   * Errors carry a google.rpc.ErrorInfo with domain "hubix-service" and a
   * reason such as "declined:format:too-large" or "not-found".
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Idempotent per (caller, subject, idempotency_key): a repeat returns the
     * existing verification and ignores the new document.
     * </pre>
     */
    default void startVerification(ai.visma.ssn.hubixservice.v1.StartVerificationRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.hubixservice.v1.Verification> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartVerificationMethod(), responseObserver);
    }

    /**
     */
    default void getVerification(ai.visma.ssn.hubixservice.v1.GetVerificationRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.hubixservice.v1.Verification> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetVerificationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes every verification of the subject: rows, stored documents, raw
     * results. Idempotent.
     * </pre>
     */
    default void deleteVerifications(ai.visma.ssn.hubixservice.v1.DeleteVerificationsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteVerificationsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service HubixService.
   * <pre>
   * HubixService is an internal service that gets a document verified by Hubix
   * reviewers. It knows nothing about its callers' entities: a caller names the
   * subject and polls for the result. The caller is the ctxvml username on the
   * call; every verification is scoped by it, and a caller sees only its own.
   * Errors carry a google.rpc.ErrorInfo with domain "hubix-service" and a
   * reason such as "declined:format:too-large" or "not-found".
   * </pre>
   */
  public static abstract class HubixServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return HubixServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service HubixService.
   * <pre>
   * HubixService is an internal service that gets a document verified by Hubix
   * reviewers. It knows nothing about its callers' entities: a caller names the
   * subject and polls for the result. The caller is the ctxvml username on the
   * call; every verification is scoped by it, and a caller sees only its own.
   * Errors carry a google.rpc.ErrorInfo with domain "hubix-service" and a
   * reason such as "declined:format:too-large" or "not-found".
   * </pre>
   */
  public static final class HubixServiceStub
      extends io.grpc.stub.AbstractAsyncStub<HubixServiceStub> {
    private HubixServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HubixServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HubixServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Idempotent per (caller, subject, idempotency_key): a repeat returns the
     * existing verification and ignores the new document.
     * </pre>
     */
    public void startVerification(ai.visma.ssn.hubixservice.v1.StartVerificationRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.hubixservice.v1.Verification> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartVerificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getVerification(ai.visma.ssn.hubixservice.v1.GetVerificationRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.hubixservice.v1.Verification> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetVerificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes every verification of the subject: rows, stored documents, raw
     * results. Idempotent.
     * </pre>
     */
    public void deleteVerifications(ai.visma.ssn.hubixservice.v1.DeleteVerificationsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteVerificationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service HubixService.
   * <pre>
   * HubixService is an internal service that gets a document verified by Hubix
   * reviewers. It knows nothing about its callers' entities: a caller names the
   * subject and polls for the result. The caller is the ctxvml username on the
   * call; every verification is scoped by it, and a caller sees only its own.
   * Errors carry a google.rpc.ErrorInfo with domain "hubix-service" and a
   * reason such as "declined:format:too-large" or "not-found".
   * </pre>
   */
  public static final class HubixServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<HubixServiceBlockingV2Stub> {
    private HubixServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HubixServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HubixServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Idempotent per (caller, subject, idempotency_key): a repeat returns the
     * existing verification and ignores the new document.
     * </pre>
     */
    public ai.visma.ssn.hubixservice.v1.Verification startVerification(ai.visma.ssn.hubixservice.v1.StartVerificationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartVerificationMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.visma.ssn.hubixservice.v1.Verification getVerification(ai.visma.ssn.hubixservice.v1.GetVerificationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVerificationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes every verification of the subject: rows, stored documents, raw
     * results. Idempotent.
     * </pre>
     */
    public com.google.protobuf.Empty deleteVerifications(ai.visma.ssn.hubixservice.v1.DeleteVerificationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteVerificationsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service HubixService.
   * <pre>
   * HubixService is an internal service that gets a document verified by Hubix
   * reviewers. It knows nothing about its callers' entities: a caller names the
   * subject and polls for the result. The caller is the ctxvml username on the
   * call; every verification is scoped by it, and a caller sees only its own.
   * Errors carry a google.rpc.ErrorInfo with domain "hubix-service" and a
   * reason such as "declined:format:too-large" or "not-found".
   * </pre>
   */
  public static final class HubixServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<HubixServiceBlockingStub> {
    private HubixServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HubixServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HubixServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Idempotent per (caller, subject, idempotency_key): a repeat returns the
     * existing verification and ignores the new document.
     * </pre>
     */
    public ai.visma.ssn.hubixservice.v1.Verification startVerification(ai.visma.ssn.hubixservice.v1.StartVerificationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartVerificationMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.visma.ssn.hubixservice.v1.Verification getVerification(ai.visma.ssn.hubixservice.v1.GetVerificationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVerificationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes every verification of the subject: rows, stored documents, raw
     * results. Idempotent.
     * </pre>
     */
    public com.google.protobuf.Empty deleteVerifications(ai.visma.ssn.hubixservice.v1.DeleteVerificationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteVerificationsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service HubixService.
   * <pre>
   * HubixService is an internal service that gets a document verified by Hubix
   * reviewers. It knows nothing about its callers' entities: a caller names the
   * subject and polls for the result. The caller is the ctxvml username on the
   * call; every verification is scoped by it, and a caller sees only its own.
   * Errors carry a google.rpc.ErrorInfo with domain "hubix-service" and a
   * reason such as "declined:format:too-large" or "not-found".
   * </pre>
   */
  public static final class HubixServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<HubixServiceFutureStub> {
    private HubixServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HubixServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HubixServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Idempotent per (caller, subject, idempotency_key): a repeat returns the
     * existing verification and ignores the new document.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.ssn.hubixservice.v1.Verification> startVerification(
        ai.visma.ssn.hubixservice.v1.StartVerificationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartVerificationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.ssn.hubixservice.v1.Verification> getVerification(
        ai.visma.ssn.hubixservice.v1.GetVerificationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetVerificationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes every verification of the subject: rows, stored documents, raw
     * results. Idempotent.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteVerifications(
        ai.visma.ssn.hubixservice.v1.DeleteVerificationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteVerificationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_START_VERIFICATION = 0;
  private static final int METHODID_GET_VERIFICATION = 1;
  private static final int METHODID_DELETE_VERIFICATIONS = 2;

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
        case METHODID_START_VERIFICATION:
          serviceImpl.startVerification((ai.visma.ssn.hubixservice.v1.StartVerificationRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.ssn.hubixservice.v1.Verification>) responseObserver);
          break;
        case METHODID_GET_VERIFICATION:
          serviceImpl.getVerification((ai.visma.ssn.hubixservice.v1.GetVerificationRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.ssn.hubixservice.v1.Verification>) responseObserver);
          break;
        case METHODID_DELETE_VERIFICATIONS:
          serviceImpl.deleteVerifications((ai.visma.ssn.hubixservice.v1.DeleteVerificationsRequest) request,
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
          getStartVerificationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.ssn.hubixservice.v1.StartVerificationRequest,
              ai.visma.ssn.hubixservice.v1.Verification>(
                service, METHODID_START_VERIFICATION)))
        .addMethod(
          getGetVerificationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.ssn.hubixservice.v1.GetVerificationRequest,
              ai.visma.ssn.hubixservice.v1.Verification>(
                service, METHODID_GET_VERIFICATION)))
        .addMethod(
          getDeleteVerificationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.ssn.hubixservice.v1.DeleteVerificationsRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_VERIFICATIONS)))
        .build();
  }

  private static abstract class HubixServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HubixServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.visma.ssn.hubixservice.v1.HubixserviceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HubixService");
    }
  }

  private static final class HubixServiceFileDescriptorSupplier
      extends HubixServiceBaseDescriptorSupplier {
    HubixServiceFileDescriptorSupplier() {}
  }

  private static final class HubixServiceMethodDescriptorSupplier
      extends HubixServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    HubixServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (HubixServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HubixServiceFileDescriptorSupplier())
              .addMethod(getStartVerificationMethod())
              .addMethod(getGetVerificationMethod())
              .addMethod(getDeleteVerificationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
