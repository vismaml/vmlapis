package ai.visma.asgt.dataservice.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.70.0)",
    comments = "Source: asgt/data/v1/data_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DataServiceGrpc {

  private DataServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "asgt.dataservice.v1.DataService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.visma.asgt.dataservice.v1.CreateRequest,
      com.google.protobuf.Empty> getCreateDatasetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDataset",
      requestType = ai.visma.asgt.dataservice.v1.CreateRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.asgt.dataservice.v1.CreateRequest,
      com.google.protobuf.Empty> getCreateDatasetMethod() {
    io.grpc.MethodDescriptor<ai.visma.asgt.dataservice.v1.CreateRequest, com.google.protobuf.Empty> getCreateDatasetMethod;
    if ((getCreateDatasetMethod = DataServiceGrpc.getCreateDatasetMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getCreateDatasetMethod = DataServiceGrpc.getCreateDatasetMethod) == null) {
          DataServiceGrpc.getCreateDatasetMethod = getCreateDatasetMethod =
              io.grpc.MethodDescriptor.<ai.visma.asgt.dataservice.v1.CreateRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDataset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.dataservice.v1.CreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("CreateDataset"))
              .build();
        }
      }
    }
    return getCreateDatasetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.asgt.dataservice.v1.AppendDataRequest,
      com.google.protobuf.Empty> getAppendDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AppendData",
      requestType = ai.visma.asgt.dataservice.v1.AppendDataRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.asgt.dataservice.v1.AppendDataRequest,
      com.google.protobuf.Empty> getAppendDataMethod() {
    io.grpc.MethodDescriptor<ai.visma.asgt.dataservice.v1.AppendDataRequest, com.google.protobuf.Empty> getAppendDataMethod;
    if ((getAppendDataMethod = DataServiceGrpc.getAppendDataMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getAppendDataMethod = DataServiceGrpc.getAppendDataMethod) == null) {
          DataServiceGrpc.getAppendDataMethod = getAppendDataMethod =
              io.grpc.MethodDescriptor.<ai.visma.asgt.dataservice.v1.AppendDataRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AppendData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.dataservice.v1.AppendDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("AppendData"))
              .build();
        }
      }
    }
    return getAppendDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.asgt.dataservice.v1.DeleteRequest,
      com.google.protobuf.Empty> getDeleteDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteData",
      requestType = ai.visma.asgt.dataservice.v1.DeleteRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.asgt.dataservice.v1.DeleteRequest,
      com.google.protobuf.Empty> getDeleteDataMethod() {
    io.grpc.MethodDescriptor<ai.visma.asgt.dataservice.v1.DeleteRequest, com.google.protobuf.Empty> getDeleteDataMethod;
    if ((getDeleteDataMethod = DataServiceGrpc.getDeleteDataMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getDeleteDataMethod = DataServiceGrpc.getDeleteDataMethod) == null) {
          DataServiceGrpc.getDeleteDataMethod = getDeleteDataMethod =
              io.grpc.MethodDescriptor.<ai.visma.asgt.dataservice.v1.DeleteRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.dataservice.v1.DeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("DeleteData"))
              .build();
        }
      }
    }
    return getDeleteDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.asgt.dataservice.v1.GetInfoRequest,
      ai.visma.asgt.dataservice.v1.GetInfoResponse> getGetInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetInfo",
      requestType = ai.visma.asgt.dataservice.v1.GetInfoRequest.class,
      responseType = ai.visma.asgt.dataservice.v1.GetInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.asgt.dataservice.v1.GetInfoRequest,
      ai.visma.asgt.dataservice.v1.GetInfoResponse> getGetInfoMethod() {
    io.grpc.MethodDescriptor<ai.visma.asgt.dataservice.v1.GetInfoRequest, ai.visma.asgt.dataservice.v1.GetInfoResponse> getGetInfoMethod;
    if ((getGetInfoMethod = DataServiceGrpc.getGetInfoMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getGetInfoMethod = DataServiceGrpc.getGetInfoMethod) == null) {
          DataServiceGrpc.getGetInfoMethod = getGetInfoMethod =
              io.grpc.MethodDescriptor.<ai.visma.asgt.dataservice.v1.GetInfoRequest, ai.visma.asgt.dataservice.v1.GetInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.dataservice.v1.GetInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.dataservice.v1.GetInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("GetInfo"))
              .build();
        }
      }
    }
    return getGetInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.asgt.dataservice.v1.UpdateDatasetRequest,
      com.google.protobuf.Empty> getUpdateDatasetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDataset",
      requestType = ai.visma.asgt.dataservice.v1.UpdateDatasetRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.asgt.dataservice.v1.UpdateDatasetRequest,
      com.google.protobuf.Empty> getUpdateDatasetMethod() {
    io.grpc.MethodDescriptor<ai.visma.asgt.dataservice.v1.UpdateDatasetRequest, com.google.protobuf.Empty> getUpdateDatasetMethod;
    if ((getUpdateDatasetMethod = DataServiceGrpc.getUpdateDatasetMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getUpdateDatasetMethod = DataServiceGrpc.getUpdateDatasetMethod) == null) {
          DataServiceGrpc.getUpdateDatasetMethod = getUpdateDatasetMethod =
              io.grpc.MethodDescriptor.<ai.visma.asgt.dataservice.v1.UpdateDatasetRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDataset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.dataservice.v1.UpdateDatasetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("UpdateDataset"))
              .build();
        }
      }
    }
    return getUpdateDatasetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest,
      com.google.protobuf.Empty> getRegisterQueryStatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterQueryStats",
      requestType = ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest,
      com.google.protobuf.Empty> getRegisterQueryStatsMethod() {
    io.grpc.MethodDescriptor<ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest, com.google.protobuf.Empty> getRegisterQueryStatsMethod;
    if ((getRegisterQueryStatsMethod = DataServiceGrpc.getRegisterQueryStatsMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getRegisterQueryStatsMethod = DataServiceGrpc.getRegisterQueryStatsMethod) == null) {
          DataServiceGrpc.getRegisterQueryStatsMethod = getRegisterQueryStatsMethod =
              io.grpc.MethodDescriptor.<ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterQueryStats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("RegisterQueryStats"))
              .build();
        }
      }
    }
    return getRegisterQueryStatsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      ai.visma.ssn.dataservice.v1.CallsPerMonthResponse> getCallsPerMonthMetricMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CallsPerMonthMetric",
      requestType = com.google.protobuf.Empty.class,
      responseType = ai.visma.ssn.dataservice.v1.CallsPerMonthResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      ai.visma.ssn.dataservice.v1.CallsPerMonthResponse> getCallsPerMonthMetricMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, ai.visma.ssn.dataservice.v1.CallsPerMonthResponse> getCallsPerMonthMetricMethod;
    if ((getCallsPerMonthMetricMethod = DataServiceGrpc.getCallsPerMonthMetricMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getCallsPerMonthMetricMethod = DataServiceGrpc.getCallsPerMonthMetricMethod) == null) {
          DataServiceGrpc.getCallsPerMonthMetricMethod = getCallsPerMonthMetricMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, ai.visma.ssn.dataservice.v1.CallsPerMonthResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CallsPerMonthMetric"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.dataservice.v1.CallsPerMonthResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("CallsPerMonthMetric"))
              .build();
        }
      }
    }
    return getCallsPerMonthMetricMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.asgt.dataservice.v1.CallsPerMonthFilteredMetricRequest,
      ai.visma.ssn.dataservice.v1.CallsPerMonthResponse> getCallsPerMonthFilteredMetricMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CallsPerMonthFilteredMetric",
      requestType = ai.visma.asgt.dataservice.v1.CallsPerMonthFilteredMetricRequest.class,
      responseType = ai.visma.ssn.dataservice.v1.CallsPerMonthResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.asgt.dataservice.v1.CallsPerMonthFilteredMetricRequest,
      ai.visma.ssn.dataservice.v1.CallsPerMonthResponse> getCallsPerMonthFilteredMetricMethod() {
    io.grpc.MethodDescriptor<ai.visma.asgt.dataservice.v1.CallsPerMonthFilteredMetricRequest, ai.visma.ssn.dataservice.v1.CallsPerMonthResponse> getCallsPerMonthFilteredMetricMethod;
    if ((getCallsPerMonthFilteredMetricMethod = DataServiceGrpc.getCallsPerMonthFilteredMetricMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getCallsPerMonthFilteredMetricMethod = DataServiceGrpc.getCallsPerMonthFilteredMetricMethod) == null) {
          DataServiceGrpc.getCallsPerMonthFilteredMetricMethod = getCallsPerMonthFilteredMetricMethod =
              io.grpc.MethodDescriptor.<ai.visma.asgt.dataservice.v1.CallsPerMonthFilteredMetricRequest, ai.visma.ssn.dataservice.v1.CallsPerMonthResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CallsPerMonthFilteredMetric"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.dataservice.v1.CallsPerMonthFilteredMetricRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.dataservice.v1.CallsPerMonthResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("CallsPerMonthFilteredMetric"))
              .build();
        }
      }
    }
    return getCallsPerMonthFilteredMetricMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.asgt.dataservice.v1.CalculateMetricsRequest,
      ai.visma.asgt.dataservice.v1.CalculateMetricsResponse> getCalculateMetricsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CalculateMetrics",
      requestType = ai.visma.asgt.dataservice.v1.CalculateMetricsRequest.class,
      responseType = ai.visma.asgt.dataservice.v1.CalculateMetricsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.asgt.dataservice.v1.CalculateMetricsRequest,
      ai.visma.asgt.dataservice.v1.CalculateMetricsResponse> getCalculateMetricsMethod() {
    io.grpc.MethodDescriptor<ai.visma.asgt.dataservice.v1.CalculateMetricsRequest, ai.visma.asgt.dataservice.v1.CalculateMetricsResponse> getCalculateMetricsMethod;
    if ((getCalculateMetricsMethod = DataServiceGrpc.getCalculateMetricsMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getCalculateMetricsMethod = DataServiceGrpc.getCalculateMetricsMethod) == null) {
          DataServiceGrpc.getCalculateMetricsMethod = getCalculateMetricsMethod =
              io.grpc.MethodDescriptor.<ai.visma.asgt.dataservice.v1.CalculateMetricsRequest, ai.visma.asgt.dataservice.v1.CalculateMetricsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CalculateMetrics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.dataservice.v1.CalculateMetricsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.dataservice.v1.CalculateMetricsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("CalculateMetrics"))
              .build();
        }
      }
    }
    return getCalculateMetricsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DataServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataServiceStub>() {
        @java.lang.Override
        public DataServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataServiceStub(channel, callOptions);
        }
      };
    return DataServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static DataServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataServiceBlockingV2Stub>() {
        @java.lang.Override
        public DataServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return DataServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DataServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataServiceBlockingStub>() {
        @java.lang.Override
        public DataServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataServiceBlockingStub(channel, callOptions);
        }
      };
    return DataServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DataServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataServiceFutureStub>() {
        @java.lang.Override
        public DataServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataServiceFutureStub(channel, callOptions);
        }
      };
    return DataServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createDataset(ai.visma.asgt.dataservice.v1.CreateRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDatasetMethod(), responseObserver);
    }

    /**
     */
    default void appendData(ai.visma.asgt.dataservice.v1.AppendDataRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAppendDataMethod(), responseObserver);
    }

    /**
     */
    default void deleteData(ai.visma.asgt.dataservice.v1.DeleteRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDataMethod(), responseObserver);
    }

    /**
     */
    default void getInfo(ai.visma.asgt.dataservice.v1.GetInfoRequest request,
        io.grpc.stub.StreamObserver<ai.visma.asgt.dataservice.v1.GetInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetInfoMethod(), responseObserver);
    }

    /**
     */
    default void updateDataset(ai.visma.asgt.dataservice.v1.UpdateDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDatasetMethod(), responseObserver);
    }

    /**
     */
    default void registerQueryStats(ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterQueryStatsMethod(), responseObserver);
    }

    /**
     */
    default void callsPerMonthMetric(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.dataservice.v1.CallsPerMonthResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCallsPerMonthMetricMethod(), responseObserver);
    }

    /**
     */
    default void callsPerMonthFilteredMetric(ai.visma.asgt.dataservice.v1.CallsPerMonthFilteredMetricRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.dataservice.v1.CallsPerMonthResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCallsPerMonthFilteredMetricMethod(), responseObserver);
    }

    /**
     */
    default void calculateMetrics(ai.visma.asgt.dataservice.v1.CalculateMetricsRequest request,
        io.grpc.stub.StreamObserver<ai.visma.asgt.dataservice.v1.CalculateMetricsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCalculateMetricsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DataService.
   */
  public static abstract class DataServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DataServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DataService.
   */
  public static final class DataServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DataServiceStub> {
    private DataServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataServiceStub(channel, callOptions);
    }

    /**
     */
    public void createDataset(ai.visma.asgt.dataservice.v1.CreateRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDatasetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void appendData(ai.visma.asgt.dataservice.v1.AppendDataRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAppendDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteData(ai.visma.asgt.dataservice.v1.DeleteRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getInfo(ai.visma.asgt.dataservice.v1.GetInfoRequest request,
        io.grpc.stub.StreamObserver<ai.visma.asgt.dataservice.v1.GetInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateDataset(ai.visma.asgt.dataservice.v1.UpdateDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDatasetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registerQueryStats(ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterQueryStatsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void callsPerMonthMetric(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.dataservice.v1.CallsPerMonthResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCallsPerMonthMetricMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void callsPerMonthFilteredMetric(ai.visma.asgt.dataservice.v1.CallsPerMonthFilteredMetricRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.dataservice.v1.CallsPerMonthResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCallsPerMonthFilteredMetricMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void calculateMetrics(ai.visma.asgt.dataservice.v1.CalculateMetricsRequest request,
        io.grpc.stub.StreamObserver<ai.visma.asgt.dataservice.v1.CalculateMetricsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCalculateMetricsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DataService.
   */
  public static final class DataServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<DataServiceBlockingV2Stub> {
    private DataServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty createDataset(ai.visma.asgt.dataservice.v1.CreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDatasetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty appendData(ai.visma.asgt.dataservice.v1.AppendDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAppendDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteData(ai.visma.asgt.dataservice.v1.DeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.visma.asgt.dataservice.v1.GetInfoResponse getInfo(ai.visma.asgt.dataservice.v1.GetInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty updateDataset(ai.visma.asgt.dataservice.v1.UpdateDatasetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDatasetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty registerQueryStats(ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterQueryStatsMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.visma.ssn.dataservice.v1.CallsPerMonthResponse callsPerMonthMetric(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCallsPerMonthMetricMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.visma.ssn.dataservice.v1.CallsPerMonthResponse callsPerMonthFilteredMetric(ai.visma.asgt.dataservice.v1.CallsPerMonthFilteredMetricRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCallsPerMonthFilteredMetricMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.visma.asgt.dataservice.v1.CalculateMetricsResponse calculateMetrics(ai.visma.asgt.dataservice.v1.CalculateMetricsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCalculateMetricsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service DataService.
   */
  public static final class DataServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DataServiceBlockingStub> {
    private DataServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty createDataset(ai.visma.asgt.dataservice.v1.CreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDatasetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty appendData(ai.visma.asgt.dataservice.v1.AppendDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAppendDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteData(ai.visma.asgt.dataservice.v1.DeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.visma.asgt.dataservice.v1.GetInfoResponse getInfo(ai.visma.asgt.dataservice.v1.GetInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty updateDataset(ai.visma.asgt.dataservice.v1.UpdateDatasetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDatasetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty registerQueryStats(ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterQueryStatsMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.visma.ssn.dataservice.v1.CallsPerMonthResponse callsPerMonthMetric(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCallsPerMonthMetricMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.visma.ssn.dataservice.v1.CallsPerMonthResponse callsPerMonthFilteredMetric(ai.visma.asgt.dataservice.v1.CallsPerMonthFilteredMetricRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCallsPerMonthFilteredMetricMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.visma.asgt.dataservice.v1.CalculateMetricsResponse calculateMetrics(ai.visma.asgt.dataservice.v1.CalculateMetricsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCalculateMetricsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DataService.
   */
  public static final class DataServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DataServiceFutureStub> {
    private DataServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> createDataset(
        ai.visma.asgt.dataservice.v1.CreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDatasetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> appendData(
        ai.visma.asgt.dataservice.v1.AppendDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAppendDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteData(
        ai.visma.asgt.dataservice.v1.DeleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.asgt.dataservice.v1.GetInfoResponse> getInfo(
        ai.visma.asgt.dataservice.v1.GetInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateDataset(
        ai.visma.asgt.dataservice.v1.UpdateDatasetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDatasetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> registerQueryStats(
        ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterQueryStatsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.ssn.dataservice.v1.CallsPerMonthResponse> callsPerMonthMetric(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCallsPerMonthMetricMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.ssn.dataservice.v1.CallsPerMonthResponse> callsPerMonthFilteredMetric(
        ai.visma.asgt.dataservice.v1.CallsPerMonthFilteredMetricRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCallsPerMonthFilteredMetricMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.asgt.dataservice.v1.CalculateMetricsResponse> calculateMetrics(
        ai.visma.asgt.dataservice.v1.CalculateMetricsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCalculateMetricsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_DATASET = 0;
  private static final int METHODID_APPEND_DATA = 1;
  private static final int METHODID_DELETE_DATA = 2;
  private static final int METHODID_GET_INFO = 3;
  private static final int METHODID_UPDATE_DATASET = 4;
  private static final int METHODID_REGISTER_QUERY_STATS = 5;
  private static final int METHODID_CALLS_PER_MONTH_METRIC = 6;
  private static final int METHODID_CALLS_PER_MONTH_FILTERED_METRIC = 7;
  private static final int METHODID_CALCULATE_METRICS = 8;

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
        case METHODID_CREATE_DATASET:
          serviceImpl.createDataset((ai.visma.asgt.dataservice.v1.CreateRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_APPEND_DATA:
          serviceImpl.appendData((ai.visma.asgt.dataservice.v1.AppendDataRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_DATA:
          serviceImpl.deleteData((ai.visma.asgt.dataservice.v1.DeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_INFO:
          serviceImpl.getInfo((ai.visma.asgt.dataservice.v1.GetInfoRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.asgt.dataservice.v1.GetInfoResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DATASET:
          serviceImpl.updateDataset((ai.visma.asgt.dataservice.v1.UpdateDatasetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_REGISTER_QUERY_STATS:
          serviceImpl.registerQueryStats((ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CALLS_PER_MONTH_METRIC:
          serviceImpl.callsPerMonthMetric((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<ai.visma.ssn.dataservice.v1.CallsPerMonthResponse>) responseObserver);
          break;
        case METHODID_CALLS_PER_MONTH_FILTERED_METRIC:
          serviceImpl.callsPerMonthFilteredMetric((ai.visma.asgt.dataservice.v1.CallsPerMonthFilteredMetricRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.ssn.dataservice.v1.CallsPerMonthResponse>) responseObserver);
          break;
        case METHODID_CALCULATE_METRICS:
          serviceImpl.calculateMetrics((ai.visma.asgt.dataservice.v1.CalculateMetricsRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.asgt.dataservice.v1.CalculateMetricsResponse>) responseObserver);
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
          getCreateDatasetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.asgt.dataservice.v1.CreateRequest,
              com.google.protobuf.Empty>(
                service, METHODID_CREATE_DATASET)))
        .addMethod(
          getAppendDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.asgt.dataservice.v1.AppendDataRequest,
              com.google.protobuf.Empty>(
                service, METHODID_APPEND_DATA)))
        .addMethod(
          getDeleteDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.asgt.dataservice.v1.DeleteRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_DATA)))
        .addMethod(
          getGetInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.asgt.dataservice.v1.GetInfoRequest,
              ai.visma.asgt.dataservice.v1.GetInfoResponse>(
                service, METHODID_GET_INFO)))
        .addMethod(
          getUpdateDatasetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.asgt.dataservice.v1.UpdateDatasetRequest,
              com.google.protobuf.Empty>(
                service, METHODID_UPDATE_DATASET)))
        .addMethod(
          getRegisterQueryStatsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest,
              com.google.protobuf.Empty>(
                service, METHODID_REGISTER_QUERY_STATS)))
        .addMethod(
          getCallsPerMonthMetricMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              ai.visma.ssn.dataservice.v1.CallsPerMonthResponse>(
                service, METHODID_CALLS_PER_MONTH_METRIC)))
        .addMethod(
          getCallsPerMonthFilteredMetricMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.asgt.dataservice.v1.CallsPerMonthFilteredMetricRequest,
              ai.visma.ssn.dataservice.v1.CallsPerMonthResponse>(
                service, METHODID_CALLS_PER_MONTH_FILTERED_METRIC)))
        .addMethod(
          getCalculateMetricsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.asgt.dataservice.v1.CalculateMetricsRequest,
              ai.visma.asgt.dataservice.v1.CalculateMetricsResponse>(
                service, METHODID_CALCULATE_METRICS)))
        .build();
  }

  private static abstract class DataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DataServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.visma.asgt.dataservice.v1.DataServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DataService");
    }
  }

  private static final class DataServiceFileDescriptorSupplier
      extends DataServiceBaseDescriptorSupplier {
    DataServiceFileDescriptorSupplier() {}
  }

  private static final class DataServiceMethodDescriptorSupplier
      extends DataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DataServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (DataServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DataServiceFileDescriptorSupplier())
              .addMethod(getCreateDatasetMethod())
              .addMethod(getAppendDataMethod())
              .addMethod(getDeleteDataMethod())
              .addMethod(getGetInfoMethod())
              .addMethod(getUpdateDatasetMethod())
              .addMethod(getRegisterQueryStatsMethod())
              .addMethod(getCallsPerMonthMetricMethod())
              .addMethod(getCallsPerMonthFilteredMetricMethod())
              .addMethod(getCalculateMetricsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
