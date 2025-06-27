package ai.visma.ssn.asyncton.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * api.{{env}}.ssn.visma.ai
 * transaction = example (receipt, document, scanned invoice text, etc.)
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.70.0)",
    comments = "Source: ssn/asyncton/v1/asyncton.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TransactionServiceGrpc {

  private TransactionServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ssn.asyncton.v1.TransactionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.visma.ssn.asyncton.v1.CreateTransactionRequest,
      ai.visma.ssn.asyncton.v1.CreateTransactionResponse> getCreateTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTransaction",
      requestType = ai.visma.ssn.asyncton.v1.CreateTransactionRequest.class,
      responseType = ai.visma.ssn.asyncton.v1.CreateTransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.ssn.asyncton.v1.CreateTransactionRequest,
      ai.visma.ssn.asyncton.v1.CreateTransactionResponse> getCreateTransactionMethod() {
    io.grpc.MethodDescriptor<ai.visma.ssn.asyncton.v1.CreateTransactionRequest, ai.visma.ssn.asyncton.v1.CreateTransactionResponse> getCreateTransactionMethod;
    if ((getCreateTransactionMethod = TransactionServiceGrpc.getCreateTransactionMethod) == null) {
      synchronized (TransactionServiceGrpc.class) {
        if ((getCreateTransactionMethod = TransactionServiceGrpc.getCreateTransactionMethod) == null) {
          TransactionServiceGrpc.getCreateTransactionMethod = getCreateTransactionMethod =
              io.grpc.MethodDescriptor.<ai.visma.ssn.asyncton.v1.CreateTransactionRequest, ai.visma.ssn.asyncton.v1.CreateTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.asyncton.v1.CreateTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.asyncton.v1.CreateTransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TransactionServiceMethodDescriptorSupplier("CreateTransaction"))
              .build();
        }
      }
    }
    return getCreateTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.ssn.asyncton.v1.GetTransactionResultsRequest,
      ai.visma.ssn.asyncton.v1.GetTransactionResultsResponse> getGetTransactionResultsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionResults",
      requestType = ai.visma.ssn.asyncton.v1.GetTransactionResultsRequest.class,
      responseType = ai.visma.ssn.asyncton.v1.GetTransactionResultsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.ssn.asyncton.v1.GetTransactionResultsRequest,
      ai.visma.ssn.asyncton.v1.GetTransactionResultsResponse> getGetTransactionResultsMethod() {
    io.grpc.MethodDescriptor<ai.visma.ssn.asyncton.v1.GetTransactionResultsRequest, ai.visma.ssn.asyncton.v1.GetTransactionResultsResponse> getGetTransactionResultsMethod;
    if ((getGetTransactionResultsMethod = TransactionServiceGrpc.getGetTransactionResultsMethod) == null) {
      synchronized (TransactionServiceGrpc.class) {
        if ((getGetTransactionResultsMethod = TransactionServiceGrpc.getGetTransactionResultsMethod) == null) {
          TransactionServiceGrpc.getGetTransactionResultsMethod = getGetTransactionResultsMethod =
              io.grpc.MethodDescriptor.<ai.visma.ssn.asyncton.v1.GetTransactionResultsRequest, ai.visma.ssn.asyncton.v1.GetTransactionResultsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionResults"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.asyncton.v1.GetTransactionResultsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.asyncton.v1.GetTransactionResultsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TransactionServiceMethodDescriptorSupplier("GetTransactionResults"))
              .build();
        }
      }
    }
    return getGetTransactionResultsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.ssn.asyncton.v1.GetTransactionStatusRequest,
      ai.visma.ssn.asyncton.v1.GetTransactionStatusResponse> getGetTransactionStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionStatus",
      requestType = ai.visma.ssn.asyncton.v1.GetTransactionStatusRequest.class,
      responseType = ai.visma.ssn.asyncton.v1.GetTransactionStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.ssn.asyncton.v1.GetTransactionStatusRequest,
      ai.visma.ssn.asyncton.v1.GetTransactionStatusResponse> getGetTransactionStatusMethod() {
    io.grpc.MethodDescriptor<ai.visma.ssn.asyncton.v1.GetTransactionStatusRequest, ai.visma.ssn.asyncton.v1.GetTransactionStatusResponse> getGetTransactionStatusMethod;
    if ((getGetTransactionStatusMethod = TransactionServiceGrpc.getGetTransactionStatusMethod) == null) {
      synchronized (TransactionServiceGrpc.class) {
        if ((getGetTransactionStatusMethod = TransactionServiceGrpc.getGetTransactionStatusMethod) == null) {
          TransactionServiceGrpc.getGetTransactionStatusMethod = getGetTransactionStatusMethod =
              io.grpc.MethodDescriptor.<ai.visma.ssn.asyncton.v1.GetTransactionStatusRequest, ai.visma.ssn.asyncton.v1.GetTransactionStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.asyncton.v1.GetTransactionStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.asyncton.v1.GetTransactionStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TransactionServiceMethodDescriptorSupplier("GetTransactionStatus"))
              .build();
        }
      }
    }
    return getGetTransactionStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.ssn.asyncton.v1.DeleteTransactionRequest,
      com.google.protobuf.Empty> getDeleteTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteTransaction",
      requestType = ai.visma.ssn.asyncton.v1.DeleteTransactionRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.ssn.asyncton.v1.DeleteTransactionRequest,
      com.google.protobuf.Empty> getDeleteTransactionMethod() {
    io.grpc.MethodDescriptor<ai.visma.ssn.asyncton.v1.DeleteTransactionRequest, com.google.protobuf.Empty> getDeleteTransactionMethod;
    if ((getDeleteTransactionMethod = TransactionServiceGrpc.getDeleteTransactionMethod) == null) {
      synchronized (TransactionServiceGrpc.class) {
        if ((getDeleteTransactionMethod = TransactionServiceGrpc.getDeleteTransactionMethod) == null) {
          TransactionServiceGrpc.getDeleteTransactionMethod = getDeleteTransactionMethod =
              io.grpc.MethodDescriptor.<ai.visma.ssn.asyncton.v1.DeleteTransactionRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.asyncton.v1.DeleteTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new TransactionServiceMethodDescriptorSupplier("DeleteTransaction"))
              .build();
        }
      }
    }
    return getDeleteTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.ssn.asyncton.v1.DeleteTagRequest,
      com.google.protobuf.Empty> getDeleteTagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteTag",
      requestType = ai.visma.ssn.asyncton.v1.DeleteTagRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.ssn.asyncton.v1.DeleteTagRequest,
      com.google.protobuf.Empty> getDeleteTagMethod() {
    io.grpc.MethodDescriptor<ai.visma.ssn.asyncton.v1.DeleteTagRequest, com.google.protobuf.Empty> getDeleteTagMethod;
    if ((getDeleteTagMethod = TransactionServiceGrpc.getDeleteTagMethod) == null) {
      synchronized (TransactionServiceGrpc.class) {
        if ((getDeleteTagMethod = TransactionServiceGrpc.getDeleteTagMethod) == null) {
          TransactionServiceGrpc.getDeleteTagMethod = getDeleteTagMethod =
              io.grpc.MethodDescriptor.<ai.visma.ssn.asyncton.v1.DeleteTagRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteTag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.asyncton.v1.DeleteTagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new TransactionServiceMethodDescriptorSupplier("DeleteTag"))
              .build();
        }
      }
    }
    return getDeleteTagMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.ssn.asyncton.v1.UpdateTransactionResultsRequest,
      ai.visma.ssn.asyncton.v1.UpdateTransactionResultsResponse> getUpdateTransactionResultsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTransactionResults",
      requestType = ai.visma.ssn.asyncton.v1.UpdateTransactionResultsRequest.class,
      responseType = ai.visma.ssn.asyncton.v1.UpdateTransactionResultsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.ssn.asyncton.v1.UpdateTransactionResultsRequest,
      ai.visma.ssn.asyncton.v1.UpdateTransactionResultsResponse> getUpdateTransactionResultsMethod() {
    io.grpc.MethodDescriptor<ai.visma.ssn.asyncton.v1.UpdateTransactionResultsRequest, ai.visma.ssn.asyncton.v1.UpdateTransactionResultsResponse> getUpdateTransactionResultsMethod;
    if ((getUpdateTransactionResultsMethod = TransactionServiceGrpc.getUpdateTransactionResultsMethod) == null) {
      synchronized (TransactionServiceGrpc.class) {
        if ((getUpdateTransactionResultsMethod = TransactionServiceGrpc.getUpdateTransactionResultsMethod) == null) {
          TransactionServiceGrpc.getUpdateTransactionResultsMethod = getUpdateTransactionResultsMethod =
              io.grpc.MethodDescriptor.<ai.visma.ssn.asyncton.v1.UpdateTransactionResultsRequest, ai.visma.ssn.asyncton.v1.UpdateTransactionResultsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateTransactionResults"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.asyncton.v1.UpdateTransactionResultsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.asyncton.v1.UpdateTransactionResultsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TransactionServiceMethodDescriptorSupplier("UpdateTransactionResults"))
              .build();
        }
      }
    }
    return getUpdateTransactionResultsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TransactionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TransactionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TransactionServiceStub>() {
        @java.lang.Override
        public TransactionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TransactionServiceStub(channel, callOptions);
        }
      };
    return TransactionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static TransactionServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TransactionServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TransactionServiceBlockingV2Stub>() {
        @java.lang.Override
        public TransactionServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TransactionServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return TransactionServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TransactionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TransactionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TransactionServiceBlockingStub>() {
        @java.lang.Override
        public TransactionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TransactionServiceBlockingStub(channel, callOptions);
        }
      };
    return TransactionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TransactionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TransactionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TransactionServiceFutureStub>() {
        @java.lang.Override
        public TransactionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TransactionServiceFutureStub(channel, callOptions);
        }
      };
    return TransactionServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * api.{{env}}.ssn.visma.ai
   * transaction = example (receipt, document, scanned invoice text, etc.)
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void createTransaction(ai.visma.ssn.asyncton.v1.CreateTransactionRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.asyncton.v1.CreateTransactionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTransactionMethod(), responseObserver);
    }

    /**
     */
    default void getTransactionResults(ai.visma.ssn.asyncton.v1.GetTransactionResultsRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.asyncton.v1.GetTransactionResultsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransactionResultsMethod(), responseObserver);
    }

    /**
     */
    default void getTransactionStatus(ai.visma.ssn.asyncton.v1.GetTransactionStatusRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.asyncton.v1.GetTransactionStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransactionStatusMethod(), responseObserver);
    }

    /**
     */
    default void deleteTransaction(ai.visma.ssn.asyncton.v1.DeleteTransactionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteTransactionMethod(), responseObserver);
    }

    /**
     */
    default void deleteTag(ai.visma.ssn.asyncton.v1.DeleteTagRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteTagMethod(), responseObserver);
    }

    /**
     * <pre>
     * below are more ideas how the API could progress
     * ---------------------
     * e.g. add more features for processing
     * rpc UpdateFeatures(UpdateFeaturesRequest) returns (UpdateFeaturesResponse) {
     *   option (google.api.http) = {put: "/v1/transactions/{id}/features"};
     * }
     * essentially a feedback endpoint
     * </pre>
     */
    default void updateTransactionResults(ai.visma.ssn.asyncton.v1.UpdateTransactionResultsRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.asyncton.v1.UpdateTransactionResultsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateTransactionResultsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TransactionService.
   * <pre>
   * api.{{env}}.ssn.visma.ai
   * transaction = example (receipt, document, scanned invoice text, etc.)
   * </pre>
   */
  public static abstract class TransactionServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TransactionServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TransactionService.
   * <pre>
   * api.{{env}}.ssn.visma.ai
   * transaction = example (receipt, document, scanned invoice text, etc.)
   * </pre>
   */
  public static final class TransactionServiceStub
      extends io.grpc.stub.AbstractAsyncStub<TransactionServiceStub> {
    private TransactionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransactionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TransactionServiceStub(channel, callOptions);
    }

    /**
     */
    public void createTransaction(ai.visma.ssn.asyncton.v1.CreateTransactionRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.asyncton.v1.CreateTransactionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionResults(ai.visma.ssn.asyncton.v1.GetTransactionResultsRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.asyncton.v1.GetTransactionResultsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTransactionResultsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionStatus(ai.visma.ssn.asyncton.v1.GetTransactionStatusRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.asyncton.v1.GetTransactionStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTransactionStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteTransaction(ai.visma.ssn.asyncton.v1.DeleteTransactionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteTag(ai.visma.ssn.asyncton.v1.DeleteTagRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteTagMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * below are more ideas how the API could progress
     * ---------------------
     * e.g. add more features for processing
     * rpc UpdateFeatures(UpdateFeaturesRequest) returns (UpdateFeaturesResponse) {
     *   option (google.api.http) = {put: "/v1/transactions/{id}/features"};
     * }
     * essentially a feedback endpoint
     * </pre>
     */
    public void updateTransactionResults(ai.visma.ssn.asyncton.v1.UpdateTransactionResultsRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.asyncton.v1.UpdateTransactionResultsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateTransactionResultsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TransactionService.
   * <pre>
   * api.{{env}}.ssn.visma.ai
   * transaction = example (receipt, document, scanned invoice text, etc.)
   * </pre>
   */
  public static final class TransactionServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<TransactionServiceBlockingV2Stub> {
    private TransactionServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransactionServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TransactionServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public ai.visma.ssn.asyncton.v1.CreateTransactionResponse createTransaction(ai.visma.ssn.asyncton.v1.CreateTransactionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.visma.ssn.asyncton.v1.GetTransactionResultsResponse getTransactionResults(ai.visma.ssn.asyncton.v1.GetTransactionResultsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransactionResultsMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.visma.ssn.asyncton.v1.GetTransactionStatusResponse getTransactionStatus(ai.visma.ssn.asyncton.v1.GetTransactionStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransactionStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteTransaction(ai.visma.ssn.asyncton.v1.DeleteTransactionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteTag(ai.visma.ssn.asyncton.v1.DeleteTagRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTagMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * below are more ideas how the API could progress
     * ---------------------
     * e.g. add more features for processing
     * rpc UpdateFeatures(UpdateFeaturesRequest) returns (UpdateFeaturesResponse) {
     *   option (google.api.http) = {put: "/v1/transactions/{id}/features"};
     * }
     * essentially a feedback endpoint
     * </pre>
     */
    public ai.visma.ssn.asyncton.v1.UpdateTransactionResultsResponse updateTransactionResults(ai.visma.ssn.asyncton.v1.UpdateTransactionResultsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateTransactionResultsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service TransactionService.
   * <pre>
   * api.{{env}}.ssn.visma.ai
   * transaction = example (receipt, document, scanned invoice text, etc.)
   * </pre>
   */
  public static final class TransactionServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TransactionServiceBlockingStub> {
    private TransactionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransactionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TransactionServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ai.visma.ssn.asyncton.v1.CreateTransactionResponse createTransaction(ai.visma.ssn.asyncton.v1.CreateTransactionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.visma.ssn.asyncton.v1.GetTransactionResultsResponse getTransactionResults(ai.visma.ssn.asyncton.v1.GetTransactionResultsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransactionResultsMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.visma.ssn.asyncton.v1.GetTransactionStatusResponse getTransactionStatus(ai.visma.ssn.asyncton.v1.GetTransactionStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransactionStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteTransaction(ai.visma.ssn.asyncton.v1.DeleteTransactionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteTag(ai.visma.ssn.asyncton.v1.DeleteTagRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTagMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * below are more ideas how the API could progress
     * ---------------------
     * e.g. add more features for processing
     * rpc UpdateFeatures(UpdateFeaturesRequest) returns (UpdateFeaturesResponse) {
     *   option (google.api.http) = {put: "/v1/transactions/{id}/features"};
     * }
     * essentially a feedback endpoint
     * </pre>
     */
    public ai.visma.ssn.asyncton.v1.UpdateTransactionResultsResponse updateTransactionResults(ai.visma.ssn.asyncton.v1.UpdateTransactionResultsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateTransactionResultsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TransactionService.
   * <pre>
   * api.{{env}}.ssn.visma.ai
   * transaction = example (receipt, document, scanned invoice text, etc.)
   * </pre>
   */
  public static final class TransactionServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<TransactionServiceFutureStub> {
    private TransactionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransactionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TransactionServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.ssn.asyncton.v1.CreateTransactionResponse> createTransaction(
        ai.visma.ssn.asyncton.v1.CreateTransactionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.ssn.asyncton.v1.GetTransactionResultsResponse> getTransactionResults(
        ai.visma.ssn.asyncton.v1.GetTransactionResultsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTransactionResultsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.ssn.asyncton.v1.GetTransactionStatusResponse> getTransactionStatus(
        ai.visma.ssn.asyncton.v1.GetTransactionStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTransactionStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteTransaction(
        ai.visma.ssn.asyncton.v1.DeleteTransactionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteTag(
        ai.visma.ssn.asyncton.v1.DeleteTagRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteTagMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * below are more ideas how the API could progress
     * ---------------------
     * e.g. add more features for processing
     * rpc UpdateFeatures(UpdateFeaturesRequest) returns (UpdateFeaturesResponse) {
     *   option (google.api.http) = {put: "/v1/transactions/{id}/features"};
     * }
     * essentially a feedback endpoint
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.ssn.asyncton.v1.UpdateTransactionResultsResponse> updateTransactionResults(
        ai.visma.ssn.asyncton.v1.UpdateTransactionResultsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateTransactionResultsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_TRANSACTION = 0;
  private static final int METHODID_GET_TRANSACTION_RESULTS = 1;
  private static final int METHODID_GET_TRANSACTION_STATUS = 2;
  private static final int METHODID_DELETE_TRANSACTION = 3;
  private static final int METHODID_DELETE_TAG = 4;
  private static final int METHODID_UPDATE_TRANSACTION_RESULTS = 5;

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
        case METHODID_CREATE_TRANSACTION:
          serviceImpl.createTransaction((ai.visma.ssn.asyncton.v1.CreateTransactionRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.ssn.asyncton.v1.CreateTransactionResponse>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_RESULTS:
          serviceImpl.getTransactionResults((ai.visma.ssn.asyncton.v1.GetTransactionResultsRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.ssn.asyncton.v1.GetTransactionResultsResponse>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_STATUS:
          serviceImpl.getTransactionStatus((ai.visma.ssn.asyncton.v1.GetTransactionStatusRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.ssn.asyncton.v1.GetTransactionStatusResponse>) responseObserver);
          break;
        case METHODID_DELETE_TRANSACTION:
          serviceImpl.deleteTransaction((ai.visma.ssn.asyncton.v1.DeleteTransactionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_TAG:
          serviceImpl.deleteTag((ai.visma.ssn.asyncton.v1.DeleteTagRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_TRANSACTION_RESULTS:
          serviceImpl.updateTransactionResults((ai.visma.ssn.asyncton.v1.UpdateTransactionResultsRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.ssn.asyncton.v1.UpdateTransactionResultsResponse>) responseObserver);
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
          getCreateTransactionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.ssn.asyncton.v1.CreateTransactionRequest,
              ai.visma.ssn.asyncton.v1.CreateTransactionResponse>(
                service, METHODID_CREATE_TRANSACTION)))
        .addMethod(
          getGetTransactionResultsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.ssn.asyncton.v1.GetTransactionResultsRequest,
              ai.visma.ssn.asyncton.v1.GetTransactionResultsResponse>(
                service, METHODID_GET_TRANSACTION_RESULTS)))
        .addMethod(
          getGetTransactionStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.ssn.asyncton.v1.GetTransactionStatusRequest,
              ai.visma.ssn.asyncton.v1.GetTransactionStatusResponse>(
                service, METHODID_GET_TRANSACTION_STATUS)))
        .addMethod(
          getDeleteTransactionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.ssn.asyncton.v1.DeleteTransactionRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_TRANSACTION)))
        .addMethod(
          getDeleteTagMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.ssn.asyncton.v1.DeleteTagRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_TAG)))
        .addMethod(
          getUpdateTransactionResultsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.ssn.asyncton.v1.UpdateTransactionResultsRequest,
              ai.visma.ssn.asyncton.v1.UpdateTransactionResultsResponse>(
                service, METHODID_UPDATE_TRANSACTION_RESULTS)))
        .build();
  }

  private static abstract class TransactionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TransactionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.visma.ssn.asyncton.v1.AsynctonProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TransactionService");
    }
  }

  private static final class TransactionServiceFileDescriptorSupplier
      extends TransactionServiceBaseDescriptorSupplier {
    TransactionServiceFileDescriptorSupplier() {}
  }

  private static final class TransactionServiceMethodDescriptorSupplier
      extends TransactionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TransactionServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TransactionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TransactionServiceFileDescriptorSupplier())
              .addMethod(getCreateTransactionMethod())
              .addMethod(getGetTransactionResultsMethod())
              .addMethod(getGetTransactionStatusMethod())
              .addMethod(getDeleteTransactionMethod())
              .addMethod(getDeleteTagMethod())
              .addMethod(getUpdateTransactionResultsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
