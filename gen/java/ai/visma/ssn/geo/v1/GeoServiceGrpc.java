package ai.visma.ssn.geo.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.70.0)",
    comments = "Source: ssn/geo/v1/geo_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GeoServiceGrpc {

  private GeoServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ssn.geo.v1.GeoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.visma.ssn.geo.v1.ValidateAddressesRequest,
      ai.visma.ssn.geo.v1.ValidateAddressesResponse> getValidateAddressesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateAddresses",
      requestType = ai.visma.ssn.geo.v1.ValidateAddressesRequest.class,
      responseType = ai.visma.ssn.geo.v1.ValidateAddressesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.ssn.geo.v1.ValidateAddressesRequest,
      ai.visma.ssn.geo.v1.ValidateAddressesResponse> getValidateAddressesMethod() {
    io.grpc.MethodDescriptor<ai.visma.ssn.geo.v1.ValidateAddressesRequest, ai.visma.ssn.geo.v1.ValidateAddressesResponse> getValidateAddressesMethod;
    if ((getValidateAddressesMethod = GeoServiceGrpc.getValidateAddressesMethod) == null) {
      synchronized (GeoServiceGrpc.class) {
        if ((getValidateAddressesMethod = GeoServiceGrpc.getValidateAddressesMethod) == null) {
          GeoServiceGrpc.getValidateAddressesMethod = getValidateAddressesMethod =
              io.grpc.MethodDescriptor.<ai.visma.ssn.geo.v1.ValidateAddressesRequest, ai.visma.ssn.geo.v1.ValidateAddressesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidateAddresses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.geo.v1.ValidateAddressesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.geo.v1.ValidateAddressesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GeoServiceMethodDescriptorSupplier("ValidateAddresses"))
              .build();
        }
      }
    }
    return getValidateAddressesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GeoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GeoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GeoServiceStub>() {
        @java.lang.Override
        public GeoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GeoServiceStub(channel, callOptions);
        }
      };
    return GeoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static GeoServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GeoServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GeoServiceBlockingV2Stub>() {
        @java.lang.Override
        public GeoServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GeoServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return GeoServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GeoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GeoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GeoServiceBlockingStub>() {
        @java.lang.Override
        public GeoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GeoServiceBlockingStub(channel, callOptions);
        }
      };
    return GeoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GeoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GeoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GeoServiceFutureStub>() {
        @java.lang.Override
        public GeoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GeoServiceFutureStub(channel, callOptions);
        }
      };
    return GeoServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void validateAddresses(ai.visma.ssn.geo.v1.ValidateAddressesRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.geo.v1.ValidateAddressesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateAddressesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service GeoService.
   */
  public static abstract class GeoServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return GeoServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service GeoService.
   */
  public static final class GeoServiceStub
      extends io.grpc.stub.AbstractAsyncStub<GeoServiceStub> {
    private GeoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GeoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GeoServiceStub(channel, callOptions);
    }

    /**
     */
    public void validateAddresses(ai.visma.ssn.geo.v1.ValidateAddressesRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.geo.v1.ValidateAddressesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateAddressesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service GeoService.
   */
  public static final class GeoServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<GeoServiceBlockingV2Stub> {
    private GeoServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GeoServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GeoServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public ai.visma.ssn.geo.v1.ValidateAddressesResponse validateAddresses(ai.visma.ssn.geo.v1.ValidateAddressesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateAddressesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service GeoService.
   */
  public static final class GeoServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<GeoServiceBlockingStub> {
    private GeoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GeoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GeoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ai.visma.ssn.geo.v1.ValidateAddressesResponse validateAddresses(ai.visma.ssn.geo.v1.ValidateAddressesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateAddressesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service GeoService.
   */
  public static final class GeoServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<GeoServiceFutureStub> {
    private GeoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GeoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GeoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.ssn.geo.v1.ValidateAddressesResponse> validateAddresses(
        ai.visma.ssn.geo.v1.ValidateAddressesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateAddressesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_VALIDATE_ADDRESSES = 0;

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
        case METHODID_VALIDATE_ADDRESSES:
          serviceImpl.validateAddresses((ai.visma.ssn.geo.v1.ValidateAddressesRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.ssn.geo.v1.ValidateAddressesResponse>) responseObserver);
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
          getValidateAddressesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.ssn.geo.v1.ValidateAddressesRequest,
              ai.visma.ssn.geo.v1.ValidateAddressesResponse>(
                service, METHODID_VALIDATE_ADDRESSES)))
        .build();
  }

  private static abstract class GeoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GeoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.visma.ssn.geo.v1.GeoServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GeoService");
    }
  }

  private static final class GeoServiceFileDescriptorSupplier
      extends GeoServiceBaseDescriptorSupplier {
    GeoServiceFileDescriptorSupplier() {}
  }

  private static final class GeoServiceMethodDescriptorSupplier
      extends GeoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    GeoServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (GeoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GeoServiceFileDescriptorSupplier())
              .addMethod(getValidateAddressesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
