package ai.visma.asgt.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.70.0)",
    comments = "Source: asgt/v2/dataset_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DatasetServiceGrpc {

  private DatasetServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "asgt.v2.DatasetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.visma.asgt.v2.GetDatasetRequest,
      ai.visma.asgt.type.Dataset> getGetDatasetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDataset",
      requestType = ai.visma.asgt.v2.GetDatasetRequest.class,
      responseType = ai.visma.asgt.type.Dataset.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.asgt.v2.GetDatasetRequest,
      ai.visma.asgt.type.Dataset> getGetDatasetMethod() {
    io.grpc.MethodDescriptor<ai.visma.asgt.v2.GetDatasetRequest, ai.visma.asgt.type.Dataset> getGetDatasetMethod;
    if ((getGetDatasetMethod = DatasetServiceGrpc.getGetDatasetMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getGetDatasetMethod = DatasetServiceGrpc.getGetDatasetMethod) == null) {
          DatasetServiceGrpc.getGetDatasetMethod = getGetDatasetMethod =
              io.grpc.MethodDescriptor.<ai.visma.asgt.v2.GetDatasetRequest, ai.visma.asgt.type.Dataset>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDataset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.v2.GetDatasetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.type.Dataset.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("GetDataset"))
              .build();
        }
      }
    }
    return getGetDatasetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.asgt.v2.CreateDatasetRequest,
      com.google.protobuf.Empty> getCreateDatasetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDataset",
      requestType = ai.visma.asgt.v2.CreateDatasetRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.asgt.v2.CreateDatasetRequest,
      com.google.protobuf.Empty> getCreateDatasetMethod() {
    io.grpc.MethodDescriptor<ai.visma.asgt.v2.CreateDatasetRequest, com.google.protobuf.Empty> getCreateDatasetMethod;
    if ((getCreateDatasetMethod = DatasetServiceGrpc.getCreateDatasetMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getCreateDatasetMethod = DatasetServiceGrpc.getCreateDatasetMethod) == null) {
          DatasetServiceGrpc.getCreateDatasetMethod = getCreateDatasetMethod =
              io.grpc.MethodDescriptor.<ai.visma.asgt.v2.CreateDatasetRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDataset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.v2.CreateDatasetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("CreateDataset"))
              .build();
        }
      }
    }
    return getCreateDatasetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.asgt.v2.CreateOrUpdateDatasetRequest,
      com.google.protobuf.Empty> getCreateOrUpdateDatasetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateOrUpdateDataset",
      requestType = ai.visma.asgt.v2.CreateOrUpdateDatasetRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.asgt.v2.CreateOrUpdateDatasetRequest,
      com.google.protobuf.Empty> getCreateOrUpdateDatasetMethod() {
    io.grpc.MethodDescriptor<ai.visma.asgt.v2.CreateOrUpdateDatasetRequest, com.google.protobuf.Empty> getCreateOrUpdateDatasetMethod;
    if ((getCreateOrUpdateDatasetMethod = DatasetServiceGrpc.getCreateOrUpdateDatasetMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getCreateOrUpdateDatasetMethod = DatasetServiceGrpc.getCreateOrUpdateDatasetMethod) == null) {
          DatasetServiceGrpc.getCreateOrUpdateDatasetMethod = getCreateOrUpdateDatasetMethod =
              io.grpc.MethodDescriptor.<ai.visma.asgt.v2.CreateOrUpdateDatasetRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateOrUpdateDataset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.v2.CreateOrUpdateDatasetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("CreateOrUpdateDataset"))
              .build();
        }
      }
    }
    return getCreateOrUpdateDatasetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.asgt.v2.DeleteDatasetRequest,
      ai.visma.asgt.type.Dataset> getDeleteDatasetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDataset",
      requestType = ai.visma.asgt.v2.DeleteDatasetRequest.class,
      responseType = ai.visma.asgt.type.Dataset.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.asgt.v2.DeleteDatasetRequest,
      ai.visma.asgt.type.Dataset> getDeleteDatasetMethod() {
    io.grpc.MethodDescriptor<ai.visma.asgt.v2.DeleteDatasetRequest, ai.visma.asgt.type.Dataset> getDeleteDatasetMethod;
    if ((getDeleteDatasetMethod = DatasetServiceGrpc.getDeleteDatasetMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getDeleteDatasetMethod = DatasetServiceGrpc.getDeleteDatasetMethod) == null) {
          DatasetServiceGrpc.getDeleteDatasetMethod = getDeleteDatasetMethod =
              io.grpc.MethodDescriptor.<ai.visma.asgt.v2.DeleteDatasetRequest, ai.visma.asgt.type.Dataset>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDataset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.v2.DeleteDatasetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.type.Dataset.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("DeleteDataset"))
              .build();
        }
      }
    }
    return getDeleteDatasetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.asgt.v2.DeleteTagRequest,
      com.google.protobuf.Empty> getDeleteTagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteTag",
      requestType = ai.visma.asgt.v2.DeleteTagRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.asgt.v2.DeleteTagRequest,
      com.google.protobuf.Empty> getDeleteTagMethod() {
    io.grpc.MethodDescriptor<ai.visma.asgt.v2.DeleteTagRequest, com.google.protobuf.Empty> getDeleteTagMethod;
    if ((getDeleteTagMethod = DatasetServiceGrpc.getDeleteTagMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getDeleteTagMethod = DatasetServiceGrpc.getDeleteTagMethod) == null) {
          DatasetServiceGrpc.getDeleteTagMethod = getDeleteTagMethod =
              io.grpc.MethodDescriptor.<ai.visma.asgt.v2.DeleteTagRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteTag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.v2.DeleteTagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("DeleteTag"))
              .build();
        }
      }
    }
    return getDeleteTagMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.asgt.v2.CreateExampleRequest,
      com.google.protobuf.Empty> getCreateExampleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateExample",
      requestType = ai.visma.asgt.v2.CreateExampleRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.asgt.v2.CreateExampleRequest,
      com.google.protobuf.Empty> getCreateExampleMethod() {
    io.grpc.MethodDescriptor<ai.visma.asgt.v2.CreateExampleRequest, com.google.protobuf.Empty> getCreateExampleMethod;
    if ((getCreateExampleMethod = DatasetServiceGrpc.getCreateExampleMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getCreateExampleMethod = DatasetServiceGrpc.getCreateExampleMethod) == null) {
          DatasetServiceGrpc.getCreateExampleMethod = getCreateExampleMethod =
              io.grpc.MethodDescriptor.<ai.visma.asgt.v2.CreateExampleRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateExample"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.v2.CreateExampleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("CreateExample"))
              .build();
        }
      }
    }
    return getCreateExampleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.asgt.v2.CreateOrUpdateExampleRequest,
      com.google.protobuf.Empty> getCreateOrUpdateExampleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateOrUpdateExample",
      requestType = ai.visma.asgt.v2.CreateOrUpdateExampleRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.asgt.v2.CreateOrUpdateExampleRequest,
      com.google.protobuf.Empty> getCreateOrUpdateExampleMethod() {
    io.grpc.MethodDescriptor<ai.visma.asgt.v2.CreateOrUpdateExampleRequest, com.google.protobuf.Empty> getCreateOrUpdateExampleMethod;
    if ((getCreateOrUpdateExampleMethod = DatasetServiceGrpc.getCreateOrUpdateExampleMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getCreateOrUpdateExampleMethod = DatasetServiceGrpc.getCreateOrUpdateExampleMethod) == null) {
          DatasetServiceGrpc.getCreateOrUpdateExampleMethod = getCreateOrUpdateExampleMethod =
              io.grpc.MethodDescriptor.<ai.visma.asgt.v2.CreateOrUpdateExampleRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateOrUpdateExample"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.v2.CreateOrUpdateExampleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("CreateOrUpdateExample"))
              .build();
        }
      }
    }
    return getCreateOrUpdateExampleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.asgt.v2.BatchCreateExampleRequest,
      com.google.protobuf.Empty> getBatchCreateExampleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchCreateExample",
      requestType = ai.visma.asgt.v2.BatchCreateExampleRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.asgt.v2.BatchCreateExampleRequest,
      com.google.protobuf.Empty> getBatchCreateExampleMethod() {
    io.grpc.MethodDescriptor<ai.visma.asgt.v2.BatchCreateExampleRequest, com.google.protobuf.Empty> getBatchCreateExampleMethod;
    if ((getBatchCreateExampleMethod = DatasetServiceGrpc.getBatchCreateExampleMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getBatchCreateExampleMethod = DatasetServiceGrpc.getBatchCreateExampleMethod) == null) {
          DatasetServiceGrpc.getBatchCreateExampleMethod = getBatchCreateExampleMethod =
              io.grpc.MethodDescriptor.<ai.visma.asgt.v2.BatchCreateExampleRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchCreateExample"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.v2.BatchCreateExampleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("BatchCreateExample"))
              .build();
        }
      }
    }
    return getBatchCreateExampleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.asgt.v2.TruncateDatasetRequest,
      com.google.protobuf.Empty> getTruncateDatasetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TruncateDataset",
      requestType = ai.visma.asgt.v2.TruncateDatasetRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.asgt.v2.TruncateDatasetRequest,
      com.google.protobuf.Empty> getTruncateDatasetMethod() {
    io.grpc.MethodDescriptor<ai.visma.asgt.v2.TruncateDatasetRequest, com.google.protobuf.Empty> getTruncateDatasetMethod;
    if ((getTruncateDatasetMethod = DatasetServiceGrpc.getTruncateDatasetMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getTruncateDatasetMethod = DatasetServiceGrpc.getTruncateDatasetMethod) == null) {
          DatasetServiceGrpc.getTruncateDatasetMethod = getTruncateDatasetMethod =
              io.grpc.MethodDescriptor.<ai.visma.asgt.v2.TruncateDatasetRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TruncateDataset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.v2.TruncateDatasetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("TruncateDataset"))
              .build();
        }
      }
    }
    return getTruncateDatasetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.asgt.v2.GetDatasetTrainingsRequest,
      ai.visma.asgt.v2.TrainingsResponse> getGetDatasetTrainingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDatasetTrainings",
      requestType = ai.visma.asgt.v2.GetDatasetTrainingsRequest.class,
      responseType = ai.visma.asgt.v2.TrainingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.asgt.v2.GetDatasetTrainingsRequest,
      ai.visma.asgt.v2.TrainingsResponse> getGetDatasetTrainingsMethod() {
    io.grpc.MethodDescriptor<ai.visma.asgt.v2.GetDatasetTrainingsRequest, ai.visma.asgt.v2.TrainingsResponse> getGetDatasetTrainingsMethod;
    if ((getGetDatasetTrainingsMethod = DatasetServiceGrpc.getGetDatasetTrainingsMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getGetDatasetTrainingsMethod = DatasetServiceGrpc.getGetDatasetTrainingsMethod) == null) {
          DatasetServiceGrpc.getGetDatasetTrainingsMethod = getGetDatasetTrainingsMethod =
              io.grpc.MethodDescriptor.<ai.visma.asgt.v2.GetDatasetTrainingsRequest, ai.visma.asgt.v2.TrainingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDatasetTrainings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.v2.GetDatasetTrainingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.v2.TrainingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("GetDatasetTrainings"))
              .build();
        }
      }
    }
    return getGetDatasetTrainingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.asgt.v2.GetDatasetModelsRequest,
      ai.visma.asgt.v2.ModelsResponse> getGetDatasetModelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDatasetModels",
      requestType = ai.visma.asgt.v2.GetDatasetModelsRequest.class,
      responseType = ai.visma.asgt.v2.ModelsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.asgt.v2.GetDatasetModelsRequest,
      ai.visma.asgt.v2.ModelsResponse> getGetDatasetModelsMethod() {
    io.grpc.MethodDescriptor<ai.visma.asgt.v2.GetDatasetModelsRequest, ai.visma.asgt.v2.ModelsResponse> getGetDatasetModelsMethod;
    if ((getGetDatasetModelsMethod = DatasetServiceGrpc.getGetDatasetModelsMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getGetDatasetModelsMethod = DatasetServiceGrpc.getGetDatasetModelsMethod) == null) {
          DatasetServiceGrpc.getGetDatasetModelsMethod = getGetDatasetModelsMethod =
              io.grpc.MethodDescriptor.<ai.visma.asgt.v2.GetDatasetModelsRequest, ai.visma.asgt.v2.ModelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDatasetModels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.v2.GetDatasetModelsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.v2.ModelsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("GetDatasetModels"))
              .build();
        }
      }
    }
    return getGetDatasetModelsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.asgt.v2.GetDatasetInfoRequest,
      ai.visma.asgt.v2.GetDatasetInfoResponse> getGetDatasetInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDatasetInfo",
      requestType = ai.visma.asgt.v2.GetDatasetInfoRequest.class,
      responseType = ai.visma.asgt.v2.GetDatasetInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.asgt.v2.GetDatasetInfoRequest,
      ai.visma.asgt.v2.GetDatasetInfoResponse> getGetDatasetInfoMethod() {
    io.grpc.MethodDescriptor<ai.visma.asgt.v2.GetDatasetInfoRequest, ai.visma.asgt.v2.GetDatasetInfoResponse> getGetDatasetInfoMethod;
    if ((getGetDatasetInfoMethod = DatasetServiceGrpc.getGetDatasetInfoMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getGetDatasetInfoMethod = DatasetServiceGrpc.getGetDatasetInfoMethod) == null) {
          DatasetServiceGrpc.getGetDatasetInfoMethod = getGetDatasetInfoMethod =
              io.grpc.MethodDescriptor.<ai.visma.asgt.v2.GetDatasetInfoRequest, ai.visma.asgt.v2.GetDatasetInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDatasetInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.v2.GetDatasetInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.v2.GetDatasetInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("GetDatasetInfo"))
              .build();
        }
      }
    }
    return getGetDatasetInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.asgt.v2.GetTrainingsRequest,
      ai.visma.asgt.v2.TrainingsResponse> getGetTrainingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTrainings",
      requestType = ai.visma.asgt.v2.GetTrainingsRequest.class,
      responseType = ai.visma.asgt.v2.TrainingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.asgt.v2.GetTrainingsRequest,
      ai.visma.asgt.v2.TrainingsResponse> getGetTrainingsMethod() {
    io.grpc.MethodDescriptor<ai.visma.asgt.v2.GetTrainingsRequest, ai.visma.asgt.v2.TrainingsResponse> getGetTrainingsMethod;
    if ((getGetTrainingsMethod = DatasetServiceGrpc.getGetTrainingsMethod) == null) {
      synchronized (DatasetServiceGrpc.class) {
        if ((getGetTrainingsMethod = DatasetServiceGrpc.getGetTrainingsMethod) == null) {
          DatasetServiceGrpc.getGetTrainingsMethod = getGetTrainingsMethod =
              io.grpc.MethodDescriptor.<ai.visma.asgt.v2.GetTrainingsRequest, ai.visma.asgt.v2.TrainingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTrainings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.v2.GetTrainingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.asgt.v2.TrainingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatasetServiceMethodDescriptorSupplier("GetTrainings"))
              .build();
        }
      }
    }
    return getGetTrainingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DatasetServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DatasetServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DatasetServiceStub>() {
        @java.lang.Override
        public DatasetServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DatasetServiceStub(channel, callOptions);
        }
      };
    return DatasetServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static DatasetServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DatasetServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DatasetServiceBlockingV2Stub>() {
        @java.lang.Override
        public DatasetServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DatasetServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return DatasetServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DatasetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DatasetServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DatasetServiceBlockingStub>() {
        @java.lang.Override
        public DatasetServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DatasetServiceBlockingStub(channel, callOptions);
        }
      };
    return DatasetServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DatasetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DatasetServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DatasetServiceFutureStub>() {
        @java.lang.Override
        public DatasetServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DatasetServiceFutureStub(channel, callOptions);
        }
      };
    return DatasetServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Get the basic information about a dataset.
     * </pre>
     */
    default void getDataset(ai.visma.asgt.v2.GetDatasetRequest request,
        io.grpc.stub.StreamObserver<ai.visma.asgt.type.Dataset> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDatasetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a new dataset. Since no examples are provided in this operation, the training won't be scheduled
     * until CreateExample or BatchCreateExample is called after the creation of the dataset.
     * </pre>
     */
    default void createDataset(ai.visma.asgt.v2.CreateDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDatasetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Not implemented yet.
     *Creates a new dataset. If a dataset with such name already exsits, it will be updated with the
     * provided data.
     * </pre>
     */
    default void createOrUpdateDataset(ai.visma.asgt.v2.CreateOrUpdateDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateOrUpdateDatasetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a dataset with the specified name.
     * </pre>
     */
    default void deleteDataset(ai.visma.asgt.v2.DeleteDatasetRequest request,
        io.grpc.stub.StreamObserver<ai.visma.asgt.type.Dataset> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDatasetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete all datasets (and their examples) containing the specified tag.
     * The datasets' names are not considered in this request - only the tag names is.
     * </pre>
     */
    default void deleteTag(ai.visma.asgt.v2.DeleteTagRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteTagMethod(), responseObserver);
    }

    /**
     * <pre>
     * Uploads a new single example.
     * </pre>
     */
    default void createExample(ai.visma.asgt.v2.CreateExampleRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateExampleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Not implemented yet.
     * Uploads or updates a new single example.
     * If the specified example already exists, the example
     * is updated with the provided values according to provided ID.
     * </pre>
     */
    default void createOrUpdateExample(ai.visma.asgt.v2.CreateOrUpdateExampleRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateOrUpdateExampleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Upload multiple examples at once. This matches the behavior of the v1 API's append operation.
     * </pre>
     */
    default void batchCreateExample(ai.visma.asgt.v2.BatchCreateExampleRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchCreateExampleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Truncate a dataset. Use this operation to remove examples in a dataset used for future training without
     * removing existing models.
     * </pre>
     */
    default void truncateDataset(ai.visma.asgt.v2.TruncateDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTruncateDatasetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the specified number of the most recent dataset's trainings.
     * Number of requested trainings has to be larger than 0 but no larger than 100.
     * </pre>
     */
    default void getDatasetTrainings(ai.visma.asgt.v2.GetDatasetTrainingsRequest request,
        io.grpc.stub.StreamObserver<ai.visma.asgt.v2.TrainingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDatasetTrainingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the specified number of the most recent dataset's trained models.
     * Number of requested models has to be larger than 0 but no larger than 100.
     * </pre>
     */
    default void getDatasetModels(ai.visma.asgt.v2.GetDatasetModelsRequest request,
        io.grpc.stub.StreamObserver<ai.visma.asgt.v2.ModelsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDatasetModelsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a summary of a dataset: its settings, latest training and the model currently used for suggestions.
     * </pre>
     */
    default void getDatasetInfo(ai.visma.asgt.v2.GetDatasetInfoRequest request,
        io.grpc.stub.StreamObserver<ai.visma.asgt.v2.GetDatasetInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDatasetInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the specified number of the most recent trainings accross all consumer's datasets.
     * Number of requested trainings has to be larger than 0 but no larger than 100.
     * </pre>
     */
    default void getTrainings(ai.visma.asgt.v2.GetTrainingsRequest request,
        io.grpc.stub.StreamObserver<ai.visma.asgt.v2.TrainingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTrainingsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DatasetService.
   */
  public static abstract class DatasetServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DatasetServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DatasetService.
   */
  public static final class DatasetServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DatasetServiceStub> {
    private DatasetServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatasetServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DatasetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the basic information about a dataset.
     * </pre>
     */
    public void getDataset(ai.visma.asgt.v2.GetDatasetRequest request,
        io.grpc.stub.StreamObserver<ai.visma.asgt.type.Dataset> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDatasetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a new dataset. Since no examples are provided in this operation, the training won't be scheduled
     * until CreateExample or BatchCreateExample is called after the creation of the dataset.
     * </pre>
     */
    public void createDataset(ai.visma.asgt.v2.CreateDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDatasetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Not implemented yet.
     *Creates a new dataset. If a dataset with such name already exsits, it will be updated with the
     * provided data.
     * </pre>
     */
    public void createOrUpdateDataset(ai.visma.asgt.v2.CreateOrUpdateDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateOrUpdateDatasetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a dataset with the specified name.
     * </pre>
     */
    public void deleteDataset(ai.visma.asgt.v2.DeleteDatasetRequest request,
        io.grpc.stub.StreamObserver<ai.visma.asgt.type.Dataset> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDatasetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete all datasets (and their examples) containing the specified tag.
     * The datasets' names are not considered in this request - only the tag names is.
     * </pre>
     */
    public void deleteTag(ai.visma.asgt.v2.DeleteTagRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteTagMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Uploads a new single example.
     * </pre>
     */
    public void createExample(ai.visma.asgt.v2.CreateExampleRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateExampleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Not implemented yet.
     * Uploads or updates a new single example.
     * If the specified example already exists, the example
     * is updated with the provided values according to provided ID.
     * </pre>
     */
    public void createOrUpdateExample(ai.visma.asgt.v2.CreateOrUpdateExampleRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateOrUpdateExampleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Upload multiple examples at once. This matches the behavior of the v1 API's append operation.
     * </pre>
     */
    public void batchCreateExample(ai.visma.asgt.v2.BatchCreateExampleRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchCreateExampleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Truncate a dataset. Use this operation to remove examples in a dataset used for future training without
     * removing existing models.
     * </pre>
     */
    public void truncateDataset(ai.visma.asgt.v2.TruncateDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTruncateDatasetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the specified number of the most recent dataset's trainings.
     * Number of requested trainings has to be larger than 0 but no larger than 100.
     * </pre>
     */
    public void getDatasetTrainings(ai.visma.asgt.v2.GetDatasetTrainingsRequest request,
        io.grpc.stub.StreamObserver<ai.visma.asgt.v2.TrainingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDatasetTrainingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the specified number of the most recent dataset's trained models.
     * Number of requested models has to be larger than 0 but no larger than 100.
     * </pre>
     */
    public void getDatasetModels(ai.visma.asgt.v2.GetDatasetModelsRequest request,
        io.grpc.stub.StreamObserver<ai.visma.asgt.v2.ModelsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDatasetModelsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a summary of a dataset: its settings, latest training and the model currently used for suggestions.
     * </pre>
     */
    public void getDatasetInfo(ai.visma.asgt.v2.GetDatasetInfoRequest request,
        io.grpc.stub.StreamObserver<ai.visma.asgt.v2.GetDatasetInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDatasetInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the specified number of the most recent trainings accross all consumer's datasets.
     * Number of requested trainings has to be larger than 0 but no larger than 100.
     * </pre>
     */
    public void getTrainings(ai.visma.asgt.v2.GetTrainingsRequest request,
        io.grpc.stub.StreamObserver<ai.visma.asgt.v2.TrainingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTrainingsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DatasetService.
   */
  public static final class DatasetServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<DatasetServiceBlockingV2Stub> {
    private DatasetServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatasetServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DatasetServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the basic information about a dataset.
     * </pre>
     */
    public ai.visma.asgt.type.Dataset getDataset(ai.visma.asgt.v2.GetDatasetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDatasetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a new dataset. Since no examples are provided in this operation, the training won't be scheduled
     * until CreateExample or BatchCreateExample is called after the creation of the dataset.
     * </pre>
     */
    public com.google.protobuf.Empty createDataset(ai.visma.asgt.v2.CreateDatasetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDatasetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Not implemented yet.
     *Creates a new dataset. If a dataset with such name already exsits, it will be updated with the
     * provided data.
     * </pre>
     */
    public com.google.protobuf.Empty createOrUpdateDataset(ai.visma.asgt.v2.CreateOrUpdateDatasetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateOrUpdateDatasetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a dataset with the specified name.
     * </pre>
     */
    public ai.visma.asgt.type.Dataset deleteDataset(ai.visma.asgt.v2.DeleteDatasetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDatasetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete all datasets (and their examples) containing the specified tag.
     * The datasets' names are not considered in this request - only the tag names is.
     * </pre>
     */
    public com.google.protobuf.Empty deleteTag(ai.visma.asgt.v2.DeleteTagRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTagMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Uploads a new single example.
     * </pre>
     */
    public com.google.protobuf.Empty createExample(ai.visma.asgt.v2.CreateExampleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateExampleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Not implemented yet.
     * Uploads or updates a new single example.
     * If the specified example already exists, the example
     * is updated with the provided values according to provided ID.
     * </pre>
     */
    public com.google.protobuf.Empty createOrUpdateExample(ai.visma.asgt.v2.CreateOrUpdateExampleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateOrUpdateExampleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Upload multiple examples at once. This matches the behavior of the v1 API's append operation.
     * </pre>
     */
    public com.google.protobuf.Empty batchCreateExample(ai.visma.asgt.v2.BatchCreateExampleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchCreateExampleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Truncate a dataset. Use this operation to remove examples in a dataset used for future training without
     * removing existing models.
     * </pre>
     */
    public com.google.protobuf.Empty truncateDataset(ai.visma.asgt.v2.TruncateDatasetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTruncateDatasetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the specified number of the most recent dataset's trainings.
     * Number of requested trainings has to be larger than 0 but no larger than 100.
     * </pre>
     */
    public ai.visma.asgt.v2.TrainingsResponse getDatasetTrainings(ai.visma.asgt.v2.GetDatasetTrainingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDatasetTrainingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the specified number of the most recent dataset's trained models.
     * Number of requested models has to be larger than 0 but no larger than 100.
     * </pre>
     */
    public ai.visma.asgt.v2.ModelsResponse getDatasetModels(ai.visma.asgt.v2.GetDatasetModelsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDatasetModelsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a summary of a dataset: its settings, latest training and the model currently used for suggestions.
     * </pre>
     */
    public ai.visma.asgt.v2.GetDatasetInfoResponse getDatasetInfo(ai.visma.asgt.v2.GetDatasetInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDatasetInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the specified number of the most recent trainings accross all consumer's datasets.
     * Number of requested trainings has to be larger than 0 but no larger than 100.
     * </pre>
     */
    public ai.visma.asgt.v2.TrainingsResponse getTrainings(ai.visma.asgt.v2.GetTrainingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTrainingsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service DatasetService.
   */
  public static final class DatasetServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DatasetServiceBlockingStub> {
    private DatasetServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatasetServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DatasetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the basic information about a dataset.
     * </pre>
     */
    public ai.visma.asgt.type.Dataset getDataset(ai.visma.asgt.v2.GetDatasetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDatasetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a new dataset. Since no examples are provided in this operation, the training won't be scheduled
     * until CreateExample or BatchCreateExample is called after the creation of the dataset.
     * </pre>
     */
    public com.google.protobuf.Empty createDataset(ai.visma.asgt.v2.CreateDatasetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDatasetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Not implemented yet.
     *Creates a new dataset. If a dataset with such name already exsits, it will be updated with the
     * provided data.
     * </pre>
     */
    public com.google.protobuf.Empty createOrUpdateDataset(ai.visma.asgt.v2.CreateOrUpdateDatasetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateOrUpdateDatasetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a dataset with the specified name.
     * </pre>
     */
    public ai.visma.asgt.type.Dataset deleteDataset(ai.visma.asgt.v2.DeleteDatasetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDatasetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete all datasets (and their examples) containing the specified tag.
     * The datasets' names are not considered in this request - only the tag names is.
     * </pre>
     */
    public com.google.protobuf.Empty deleteTag(ai.visma.asgt.v2.DeleteTagRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTagMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Uploads a new single example.
     * </pre>
     */
    public com.google.protobuf.Empty createExample(ai.visma.asgt.v2.CreateExampleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateExampleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Not implemented yet.
     * Uploads or updates a new single example.
     * If the specified example already exists, the example
     * is updated with the provided values according to provided ID.
     * </pre>
     */
    public com.google.protobuf.Empty createOrUpdateExample(ai.visma.asgt.v2.CreateOrUpdateExampleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateOrUpdateExampleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Upload multiple examples at once. This matches the behavior of the v1 API's append operation.
     * </pre>
     */
    public com.google.protobuf.Empty batchCreateExample(ai.visma.asgt.v2.BatchCreateExampleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchCreateExampleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Truncate a dataset. Use this operation to remove examples in a dataset used for future training without
     * removing existing models.
     * </pre>
     */
    public com.google.protobuf.Empty truncateDataset(ai.visma.asgt.v2.TruncateDatasetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTruncateDatasetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the specified number of the most recent dataset's trainings.
     * Number of requested trainings has to be larger than 0 but no larger than 100.
     * </pre>
     */
    public ai.visma.asgt.v2.TrainingsResponse getDatasetTrainings(ai.visma.asgt.v2.GetDatasetTrainingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDatasetTrainingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the specified number of the most recent dataset's trained models.
     * Number of requested models has to be larger than 0 but no larger than 100.
     * </pre>
     */
    public ai.visma.asgt.v2.ModelsResponse getDatasetModels(ai.visma.asgt.v2.GetDatasetModelsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDatasetModelsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a summary of a dataset: its settings, latest training and the model currently used for suggestions.
     * </pre>
     */
    public ai.visma.asgt.v2.GetDatasetInfoResponse getDatasetInfo(ai.visma.asgt.v2.GetDatasetInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDatasetInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the specified number of the most recent trainings accross all consumer's datasets.
     * Number of requested trainings has to be larger than 0 but no larger than 100.
     * </pre>
     */
    public ai.visma.asgt.v2.TrainingsResponse getTrainings(ai.visma.asgt.v2.GetTrainingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTrainingsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DatasetService.
   */
  public static final class DatasetServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DatasetServiceFutureStub> {
    private DatasetServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatasetServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DatasetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the basic information about a dataset.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.asgt.type.Dataset> getDataset(
        ai.visma.asgt.v2.GetDatasetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDatasetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a new dataset. Since no examples are provided in this operation, the training won't be scheduled
     * until CreateExample or BatchCreateExample is called after the creation of the dataset.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> createDataset(
        ai.visma.asgt.v2.CreateDatasetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDatasetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Not implemented yet.
     *Creates a new dataset. If a dataset with such name already exsits, it will be updated with the
     * provided data.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> createOrUpdateDataset(
        ai.visma.asgt.v2.CreateOrUpdateDatasetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateOrUpdateDatasetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a dataset with the specified name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.asgt.type.Dataset> deleteDataset(
        ai.visma.asgt.v2.DeleteDatasetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDatasetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete all datasets (and their examples) containing the specified tag.
     * The datasets' names are not considered in this request - only the tag names is.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteTag(
        ai.visma.asgt.v2.DeleteTagRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteTagMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Uploads a new single example.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> createExample(
        ai.visma.asgt.v2.CreateExampleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateExampleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Not implemented yet.
     * Uploads or updates a new single example.
     * If the specified example already exists, the example
     * is updated with the provided values according to provided ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> createOrUpdateExample(
        ai.visma.asgt.v2.CreateOrUpdateExampleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateOrUpdateExampleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Upload multiple examples at once. This matches the behavior of the v1 API's append operation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> batchCreateExample(
        ai.visma.asgt.v2.BatchCreateExampleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchCreateExampleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Truncate a dataset. Use this operation to remove examples in a dataset used for future training without
     * removing existing models.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> truncateDataset(
        ai.visma.asgt.v2.TruncateDatasetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTruncateDatasetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the specified number of the most recent dataset's trainings.
     * Number of requested trainings has to be larger than 0 but no larger than 100.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.asgt.v2.TrainingsResponse> getDatasetTrainings(
        ai.visma.asgt.v2.GetDatasetTrainingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDatasetTrainingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the specified number of the most recent dataset's trained models.
     * Number of requested models has to be larger than 0 but no larger than 100.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.asgt.v2.ModelsResponse> getDatasetModels(
        ai.visma.asgt.v2.GetDatasetModelsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDatasetModelsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a summary of a dataset: its settings, latest training and the model currently used for suggestions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.asgt.v2.GetDatasetInfoResponse> getDatasetInfo(
        ai.visma.asgt.v2.GetDatasetInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDatasetInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the specified number of the most recent trainings accross all consumer's datasets.
     * Number of requested trainings has to be larger than 0 but no larger than 100.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.asgt.v2.TrainingsResponse> getTrainings(
        ai.visma.asgt.v2.GetTrainingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTrainingsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DATASET = 0;
  private static final int METHODID_CREATE_DATASET = 1;
  private static final int METHODID_CREATE_OR_UPDATE_DATASET = 2;
  private static final int METHODID_DELETE_DATASET = 3;
  private static final int METHODID_DELETE_TAG = 4;
  private static final int METHODID_CREATE_EXAMPLE = 5;
  private static final int METHODID_CREATE_OR_UPDATE_EXAMPLE = 6;
  private static final int METHODID_BATCH_CREATE_EXAMPLE = 7;
  private static final int METHODID_TRUNCATE_DATASET = 8;
  private static final int METHODID_GET_DATASET_TRAININGS = 9;
  private static final int METHODID_GET_DATASET_MODELS = 10;
  private static final int METHODID_GET_DATASET_INFO = 11;
  private static final int METHODID_GET_TRAININGS = 12;

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
        case METHODID_GET_DATASET:
          serviceImpl.getDataset((ai.visma.asgt.v2.GetDatasetRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.asgt.type.Dataset>) responseObserver);
          break;
        case METHODID_CREATE_DATASET:
          serviceImpl.createDataset((ai.visma.asgt.v2.CreateDatasetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CREATE_OR_UPDATE_DATASET:
          serviceImpl.createOrUpdateDataset((ai.visma.asgt.v2.CreateOrUpdateDatasetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_DATASET:
          serviceImpl.deleteDataset((ai.visma.asgt.v2.DeleteDatasetRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.asgt.type.Dataset>) responseObserver);
          break;
        case METHODID_DELETE_TAG:
          serviceImpl.deleteTag((ai.visma.asgt.v2.DeleteTagRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CREATE_EXAMPLE:
          serviceImpl.createExample((ai.visma.asgt.v2.CreateExampleRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CREATE_OR_UPDATE_EXAMPLE:
          serviceImpl.createOrUpdateExample((ai.visma.asgt.v2.CreateOrUpdateExampleRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_BATCH_CREATE_EXAMPLE:
          serviceImpl.batchCreateExample((ai.visma.asgt.v2.BatchCreateExampleRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_TRUNCATE_DATASET:
          serviceImpl.truncateDataset((ai.visma.asgt.v2.TruncateDatasetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_DATASET_TRAININGS:
          serviceImpl.getDatasetTrainings((ai.visma.asgt.v2.GetDatasetTrainingsRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.asgt.v2.TrainingsResponse>) responseObserver);
          break;
        case METHODID_GET_DATASET_MODELS:
          serviceImpl.getDatasetModels((ai.visma.asgt.v2.GetDatasetModelsRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.asgt.v2.ModelsResponse>) responseObserver);
          break;
        case METHODID_GET_DATASET_INFO:
          serviceImpl.getDatasetInfo((ai.visma.asgt.v2.GetDatasetInfoRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.asgt.v2.GetDatasetInfoResponse>) responseObserver);
          break;
        case METHODID_GET_TRAININGS:
          serviceImpl.getTrainings((ai.visma.asgt.v2.GetTrainingsRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.asgt.v2.TrainingsResponse>) responseObserver);
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
          getGetDatasetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.asgt.v2.GetDatasetRequest,
              ai.visma.asgt.type.Dataset>(
                service, METHODID_GET_DATASET)))
        .addMethod(
          getCreateDatasetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.asgt.v2.CreateDatasetRequest,
              com.google.protobuf.Empty>(
                service, METHODID_CREATE_DATASET)))
        .addMethod(
          getCreateOrUpdateDatasetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.asgt.v2.CreateOrUpdateDatasetRequest,
              com.google.protobuf.Empty>(
                service, METHODID_CREATE_OR_UPDATE_DATASET)))
        .addMethod(
          getDeleteDatasetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.asgt.v2.DeleteDatasetRequest,
              ai.visma.asgt.type.Dataset>(
                service, METHODID_DELETE_DATASET)))
        .addMethod(
          getDeleteTagMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.asgt.v2.DeleteTagRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_TAG)))
        .addMethod(
          getCreateExampleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.asgt.v2.CreateExampleRequest,
              com.google.protobuf.Empty>(
                service, METHODID_CREATE_EXAMPLE)))
        .addMethod(
          getCreateOrUpdateExampleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.asgt.v2.CreateOrUpdateExampleRequest,
              com.google.protobuf.Empty>(
                service, METHODID_CREATE_OR_UPDATE_EXAMPLE)))
        .addMethod(
          getBatchCreateExampleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.asgt.v2.BatchCreateExampleRequest,
              com.google.protobuf.Empty>(
                service, METHODID_BATCH_CREATE_EXAMPLE)))
        .addMethod(
          getTruncateDatasetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.asgt.v2.TruncateDatasetRequest,
              com.google.protobuf.Empty>(
                service, METHODID_TRUNCATE_DATASET)))
        .addMethod(
          getGetDatasetTrainingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.asgt.v2.GetDatasetTrainingsRequest,
              ai.visma.asgt.v2.TrainingsResponse>(
                service, METHODID_GET_DATASET_TRAININGS)))
        .addMethod(
          getGetDatasetModelsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.asgt.v2.GetDatasetModelsRequest,
              ai.visma.asgt.v2.ModelsResponse>(
                service, METHODID_GET_DATASET_MODELS)))
        .addMethod(
          getGetDatasetInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.asgt.v2.GetDatasetInfoRequest,
              ai.visma.asgt.v2.GetDatasetInfoResponse>(
                service, METHODID_GET_DATASET_INFO)))
        .addMethod(
          getGetTrainingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.asgt.v2.GetTrainingsRequest,
              ai.visma.asgt.v2.TrainingsResponse>(
                service, METHODID_GET_TRAININGS)))
        .build();
  }

  private static abstract class DatasetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DatasetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.visma.asgt.v2.DatasetServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DatasetService");
    }
  }

  private static final class DatasetServiceFileDescriptorSupplier
      extends DatasetServiceBaseDescriptorSupplier {
    DatasetServiceFileDescriptorSupplier() {}
  }

  private static final class DatasetServiceMethodDescriptorSupplier
      extends DatasetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DatasetServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (DatasetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DatasetServiceFileDescriptorSupplier())
              .addMethod(getGetDatasetMethod())
              .addMethod(getCreateDatasetMethod())
              .addMethod(getCreateOrUpdateDatasetMethod())
              .addMethod(getDeleteDatasetMethod())
              .addMethod(getDeleteTagMethod())
              .addMethod(getCreateExampleMethod())
              .addMethod(getCreateOrUpdateExampleMethod())
              .addMethod(getBatchCreateExampleMethod())
              .addMethod(getTruncateDatasetMethod())
              .addMethod(getGetDatasetTrainingsMethod())
              .addMethod(getGetDatasetModelsMethod())
              .addMethod(getGetDatasetInfoMethod())
              .addMethod(getGetTrainingsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
