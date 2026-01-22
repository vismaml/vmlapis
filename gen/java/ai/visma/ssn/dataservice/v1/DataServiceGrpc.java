package ai.visma.ssn.dataservice.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.70.0)",
    comments = "Source: ssn/dataservice/v1/dataservice.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DataServiceGrpc {

  private DataServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ssn.dataservice.v1.DataService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.visma.ssn.dataservice.v1.CreateDocumentRequest,
      ai.visma.ssn.dataservice.v1.CreateDocumentResponse> getCreateDocumentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDocument",
      requestType = ai.visma.ssn.dataservice.v1.CreateDocumentRequest.class,
      responseType = ai.visma.ssn.dataservice.v1.CreateDocumentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.ssn.dataservice.v1.CreateDocumentRequest,
      ai.visma.ssn.dataservice.v1.CreateDocumentResponse> getCreateDocumentMethod() {
    io.grpc.MethodDescriptor<ai.visma.ssn.dataservice.v1.CreateDocumentRequest, ai.visma.ssn.dataservice.v1.CreateDocumentResponse> getCreateDocumentMethod;
    if ((getCreateDocumentMethod = DataServiceGrpc.getCreateDocumentMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getCreateDocumentMethod = DataServiceGrpc.getCreateDocumentMethod) == null) {
          DataServiceGrpc.getCreateDocumentMethod = getCreateDocumentMethod =
              io.grpc.MethodDescriptor.<ai.visma.ssn.dataservice.v1.CreateDocumentRequest, ai.visma.ssn.dataservice.v1.CreateDocumentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDocument"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.dataservice.v1.CreateDocumentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.dataservice.v1.CreateDocumentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("CreateDocument"))
              .build();
        }
      }
    }
    return getCreateDocumentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.ssn.dataservice.v1.ReadDocumentRequest,
      ai.visma.ssn.dataservice.v1.ReadDocumentResponse> getReadDocumentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadDocument",
      requestType = ai.visma.ssn.dataservice.v1.ReadDocumentRequest.class,
      responseType = ai.visma.ssn.dataservice.v1.ReadDocumentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.ssn.dataservice.v1.ReadDocumentRequest,
      ai.visma.ssn.dataservice.v1.ReadDocumentResponse> getReadDocumentMethod() {
    io.grpc.MethodDescriptor<ai.visma.ssn.dataservice.v1.ReadDocumentRequest, ai.visma.ssn.dataservice.v1.ReadDocumentResponse> getReadDocumentMethod;
    if ((getReadDocumentMethod = DataServiceGrpc.getReadDocumentMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getReadDocumentMethod = DataServiceGrpc.getReadDocumentMethod) == null) {
          DataServiceGrpc.getReadDocumentMethod = getReadDocumentMethod =
              io.grpc.MethodDescriptor.<ai.visma.ssn.dataservice.v1.ReadDocumentRequest, ai.visma.ssn.dataservice.v1.ReadDocumentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadDocument"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.dataservice.v1.ReadDocumentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.dataservice.v1.ReadDocumentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("ReadDocument"))
              .build();
        }
      }
    }
    return getReadDocumentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.ssn.dataservice.v1.PrepareFeedbackRequest,
      com.google.protobuf.Empty> getPrepareFeedbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PrepareFeedback",
      requestType = ai.visma.ssn.dataservice.v1.PrepareFeedbackRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.ssn.dataservice.v1.PrepareFeedbackRequest,
      com.google.protobuf.Empty> getPrepareFeedbackMethod() {
    io.grpc.MethodDescriptor<ai.visma.ssn.dataservice.v1.PrepareFeedbackRequest, com.google.protobuf.Empty> getPrepareFeedbackMethod;
    if ((getPrepareFeedbackMethod = DataServiceGrpc.getPrepareFeedbackMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getPrepareFeedbackMethod = DataServiceGrpc.getPrepareFeedbackMethod) == null) {
          DataServiceGrpc.getPrepareFeedbackMethod = getPrepareFeedbackMethod =
              io.grpc.MethodDescriptor.<ai.visma.ssn.dataservice.v1.PrepareFeedbackRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PrepareFeedback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.dataservice.v1.PrepareFeedbackRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("PrepareFeedback"))
              .build();
        }
      }
    }
    return getPrepareFeedbackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.ssn.dataservice.v1.FeedbackRequest,
      com.google.protobuf.Empty> getFeedbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Feedback",
      requestType = ai.visma.ssn.dataservice.v1.FeedbackRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.ssn.dataservice.v1.FeedbackRequest,
      com.google.protobuf.Empty> getFeedbackMethod() {
    io.grpc.MethodDescriptor<ai.visma.ssn.dataservice.v1.FeedbackRequest, com.google.protobuf.Empty> getFeedbackMethod;
    if ((getFeedbackMethod = DataServiceGrpc.getFeedbackMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getFeedbackMethod = DataServiceGrpc.getFeedbackMethod) == null) {
          DataServiceGrpc.getFeedbackMethod = getFeedbackMethod =
              io.grpc.MethodDescriptor.<ai.visma.ssn.dataservice.v1.FeedbackRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Feedback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.dataservice.v1.FeedbackRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("Feedback"))
              .build();
        }
      }
    }
    return getFeedbackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.ssn.dataservice.v1.MetricsRequest,
      ai.visma.ssn.dataservice.v1.FeedbackMetrics> getCalculateMetricsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CalculateMetrics",
      requestType = ai.visma.ssn.dataservice.v1.MetricsRequest.class,
      responseType = ai.visma.ssn.dataservice.v1.FeedbackMetrics.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.ssn.dataservice.v1.MetricsRequest,
      ai.visma.ssn.dataservice.v1.FeedbackMetrics> getCalculateMetricsMethod() {
    io.grpc.MethodDescriptor<ai.visma.ssn.dataservice.v1.MetricsRequest, ai.visma.ssn.dataservice.v1.FeedbackMetrics> getCalculateMetricsMethod;
    if ((getCalculateMetricsMethod = DataServiceGrpc.getCalculateMetricsMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getCalculateMetricsMethod = DataServiceGrpc.getCalculateMetricsMethod) == null) {
          DataServiceGrpc.getCalculateMetricsMethod = getCalculateMetricsMethod =
              io.grpc.MethodDescriptor.<ai.visma.ssn.dataservice.v1.MetricsRequest, ai.visma.ssn.dataservice.v1.FeedbackMetrics>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CalculateMetrics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.dataservice.v1.MetricsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.dataservice.v1.FeedbackMetrics.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("CalculateMetrics"))
              .build();
        }
      }
    }
    return getCalculateMetricsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.ssn.dataservice.v1.MetricsRequest,
      ai.visma.ssn.dataservice.v1.FeedbackMetricsV2Response> getCalculateMetricsV2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CalculateMetricsV2",
      requestType = ai.visma.ssn.dataservice.v1.MetricsRequest.class,
      responseType = ai.visma.ssn.dataservice.v1.FeedbackMetricsV2Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.ssn.dataservice.v1.MetricsRequest,
      ai.visma.ssn.dataservice.v1.FeedbackMetricsV2Response> getCalculateMetricsV2Method() {
    io.grpc.MethodDescriptor<ai.visma.ssn.dataservice.v1.MetricsRequest, ai.visma.ssn.dataservice.v1.FeedbackMetricsV2Response> getCalculateMetricsV2Method;
    if ((getCalculateMetricsV2Method = DataServiceGrpc.getCalculateMetricsV2Method) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getCalculateMetricsV2Method = DataServiceGrpc.getCalculateMetricsV2Method) == null) {
          DataServiceGrpc.getCalculateMetricsV2Method = getCalculateMetricsV2Method =
              io.grpc.MethodDescriptor.<ai.visma.ssn.dataservice.v1.MetricsRequest, ai.visma.ssn.dataservice.v1.FeedbackMetricsV2Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CalculateMetricsV2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.dataservice.v1.MetricsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.dataservice.v1.FeedbackMetricsV2Response.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("CalculateMetricsV2"))
              .build();
        }
      }
    }
    return getCalculateMetricsV2Method;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.ssn.dataservice.v1.DeleteRequest,
      com.google.protobuf.Empty> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = ai.visma.ssn.dataservice.v1.DeleteRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.ssn.dataservice.v1.DeleteRequest,
      com.google.protobuf.Empty> getDeleteMethod() {
    io.grpc.MethodDescriptor<ai.visma.ssn.dataservice.v1.DeleteRequest, com.google.protobuf.Empty> getDeleteMethod;
    if ((getDeleteMethod = DataServiceGrpc.getDeleteMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getDeleteMethod = DataServiceGrpc.getDeleteMethod) == null) {
          DataServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<ai.visma.ssn.dataservice.v1.DeleteRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.dataservice.v1.DeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      ai.visma.ssn.dataservice.v1.CallsPerMonthResponse> getSuggestionsPerMonthMetricMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SuggestionsPerMonthMetric",
      requestType = com.google.protobuf.Empty.class,
      responseType = ai.visma.ssn.dataservice.v1.CallsPerMonthResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      ai.visma.ssn.dataservice.v1.CallsPerMonthResponse> getSuggestionsPerMonthMetricMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, ai.visma.ssn.dataservice.v1.CallsPerMonthResponse> getSuggestionsPerMonthMetricMethod;
    if ((getSuggestionsPerMonthMetricMethod = DataServiceGrpc.getSuggestionsPerMonthMetricMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getSuggestionsPerMonthMetricMethod = DataServiceGrpc.getSuggestionsPerMonthMetricMethod) == null) {
          DataServiceGrpc.getSuggestionsPerMonthMetricMethod = getSuggestionsPerMonthMetricMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, ai.visma.ssn.dataservice.v1.CallsPerMonthResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SuggestionsPerMonthMetric"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.dataservice.v1.CallsPerMonthResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("SuggestionsPerMonthMetric"))
              .build();
        }
      }
    }
    return getSuggestionsPerMonthMetricMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.ssn.dataservice.v1.CallsPerMonthFilteredMetricRequest,
      ai.visma.ssn.dataservice.v1.CallsPerMonthResponse> getCallsPerMonthFilteredMetricMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CallsPerMonthFilteredMetric",
      requestType = ai.visma.ssn.dataservice.v1.CallsPerMonthFilteredMetricRequest.class,
      responseType = ai.visma.ssn.dataservice.v1.CallsPerMonthResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.ssn.dataservice.v1.CallsPerMonthFilteredMetricRequest,
      ai.visma.ssn.dataservice.v1.CallsPerMonthResponse> getCallsPerMonthFilteredMetricMethod() {
    io.grpc.MethodDescriptor<ai.visma.ssn.dataservice.v1.CallsPerMonthFilteredMetricRequest, ai.visma.ssn.dataservice.v1.CallsPerMonthResponse> getCallsPerMonthFilteredMetricMethod;
    if ((getCallsPerMonthFilteredMetricMethod = DataServiceGrpc.getCallsPerMonthFilteredMetricMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getCallsPerMonthFilteredMetricMethod = DataServiceGrpc.getCallsPerMonthFilteredMetricMethod) == null) {
          DataServiceGrpc.getCallsPerMonthFilteredMetricMethod = getCallsPerMonthFilteredMetricMethod =
              io.grpc.MethodDescriptor.<ai.visma.ssn.dataservice.v1.CallsPerMonthFilteredMetricRequest, ai.visma.ssn.dataservice.v1.CallsPerMonthResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CallsPerMonthFilteredMetric"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.dataservice.v1.CallsPerMonthFilteredMetricRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.dataservice.v1.CallsPerMonthResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("CallsPerMonthFilteredMetric"))
              .build();
        }
      }
    }
    return getCallsPerMonthFilteredMetricMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.ssn.dataservice.v1.CallsPerMonthFilteredMetricRequest,
      ai.visma.ssn.dataservice.v1.CallsPerMonthResponse> getSuggestionsPerMonthFilteredMetricMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SuggestionsPerMonthFilteredMetric",
      requestType = ai.visma.ssn.dataservice.v1.CallsPerMonthFilteredMetricRequest.class,
      responseType = ai.visma.ssn.dataservice.v1.CallsPerMonthResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.ssn.dataservice.v1.CallsPerMonthFilteredMetricRequest,
      ai.visma.ssn.dataservice.v1.CallsPerMonthResponse> getSuggestionsPerMonthFilteredMetricMethod() {
    io.grpc.MethodDescriptor<ai.visma.ssn.dataservice.v1.CallsPerMonthFilteredMetricRequest, ai.visma.ssn.dataservice.v1.CallsPerMonthResponse> getSuggestionsPerMonthFilteredMetricMethod;
    if ((getSuggestionsPerMonthFilteredMetricMethod = DataServiceGrpc.getSuggestionsPerMonthFilteredMetricMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getSuggestionsPerMonthFilteredMetricMethod = DataServiceGrpc.getSuggestionsPerMonthFilteredMetricMethod) == null) {
          DataServiceGrpc.getSuggestionsPerMonthFilteredMetricMethod = getSuggestionsPerMonthFilteredMetricMethod =
              io.grpc.MethodDescriptor.<ai.visma.ssn.dataservice.v1.CallsPerMonthFilteredMetricRequest, ai.visma.ssn.dataservice.v1.CallsPerMonthResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SuggestionsPerMonthFilteredMetric"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.dataservice.v1.CallsPerMonthFilteredMetricRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.dataservice.v1.CallsPerMonthResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("SuggestionsPerMonthFilteredMetric"))
              .build();
        }
      }
    }
    return getSuggestionsPerMonthFilteredMetricMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.ssn.dataservice.v1.AnnotationProcessMetricsRequest,
      ai.visma.ssn.dataservice.v1.AnnotationProcessMetricsResponse> getCalculateAnnotationProcessMetricsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CalculateAnnotationProcessMetrics",
      requestType = ai.visma.ssn.dataservice.v1.AnnotationProcessMetricsRequest.class,
      responseType = ai.visma.ssn.dataservice.v1.AnnotationProcessMetricsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.ssn.dataservice.v1.AnnotationProcessMetricsRequest,
      ai.visma.ssn.dataservice.v1.AnnotationProcessMetricsResponse> getCalculateAnnotationProcessMetricsMethod() {
    io.grpc.MethodDescriptor<ai.visma.ssn.dataservice.v1.AnnotationProcessMetricsRequest, ai.visma.ssn.dataservice.v1.AnnotationProcessMetricsResponse> getCalculateAnnotationProcessMetricsMethod;
    if ((getCalculateAnnotationProcessMetricsMethod = DataServiceGrpc.getCalculateAnnotationProcessMetricsMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getCalculateAnnotationProcessMetricsMethod = DataServiceGrpc.getCalculateAnnotationProcessMetricsMethod) == null) {
          DataServiceGrpc.getCalculateAnnotationProcessMetricsMethod = getCalculateAnnotationProcessMetricsMethod =
              io.grpc.MethodDescriptor.<ai.visma.ssn.dataservice.v1.AnnotationProcessMetricsRequest, ai.visma.ssn.dataservice.v1.AnnotationProcessMetricsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CalculateAnnotationProcessMetrics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.dataservice.v1.AnnotationProcessMetricsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.dataservice.v1.AnnotationProcessMetricsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("CalculateAnnotationProcessMetrics"))
              .build();
        }
      }
    }
    return getCalculateAnnotationProcessMetricsMethod;
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
    default void createDocument(ai.visma.ssn.dataservice.v1.CreateDocumentRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.dataservice.v1.CreateDocumentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDocumentMethod(), responseObserver);
    }

    /**
     */
    default void readDocument(ai.visma.ssn.dataservice.v1.ReadDocumentRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.dataservice.v1.ReadDocumentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadDocumentMethod(), responseObserver);
    }

    /**
     * <pre>
     * For feedback
     * </pre>
     */
    default void prepareFeedback(ai.visma.ssn.dataservice.v1.PrepareFeedbackRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPrepareFeedbackMethod(), responseObserver);
    }

    /**
     */
    default void feedback(ai.visma.ssn.dataservice.v1.FeedbackRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFeedbackMethod(), responseObserver);
    }

    /**
     */
    default void calculateMetrics(ai.visma.ssn.dataservice.v1.MetricsRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.dataservice.v1.FeedbackMetrics> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCalculateMetricsMethod(), responseObserver);
    }

    /**
     */
    default void calculateMetricsV2(ai.visma.ssn.dataservice.v1.MetricsRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.dataservice.v1.FeedbackMetricsV2Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCalculateMetricsV2Method(), responseObserver);
    }

    /**
     */
    default void delete(ai.visma.ssn.dataservice.v1.DeleteRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    default void callsPerMonthMetric(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.dataservice.v1.CallsPerMonthResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCallsPerMonthMetricMethod(), responseObserver);
    }

    /**
     */
    default void suggestionsPerMonthMetric(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.dataservice.v1.CallsPerMonthResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSuggestionsPerMonthMetricMethod(), responseObserver);
    }

    /**
     */
    default void callsPerMonthFilteredMetric(ai.visma.ssn.dataservice.v1.CallsPerMonthFilteredMetricRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.dataservice.v1.CallsPerMonthResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCallsPerMonthFilteredMetricMethod(), responseObserver);
    }

    /**
     */
    default void suggestionsPerMonthFilteredMetric(ai.visma.ssn.dataservice.v1.CallsPerMonthFilteredMetricRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.dataservice.v1.CallsPerMonthResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSuggestionsPerMonthFilteredMetricMethod(), responseObserver);
    }

    /**
     */
    default void calculateAnnotationProcessMetrics(ai.visma.ssn.dataservice.v1.AnnotationProcessMetricsRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.dataservice.v1.AnnotationProcessMetricsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCalculateAnnotationProcessMetricsMethod(), responseObserver);
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
    public void createDocument(ai.visma.ssn.dataservice.v1.CreateDocumentRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.dataservice.v1.CreateDocumentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDocumentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readDocument(ai.visma.ssn.dataservice.v1.ReadDocumentRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.dataservice.v1.ReadDocumentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadDocumentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * For feedback
     * </pre>
     */
    public void prepareFeedback(ai.visma.ssn.dataservice.v1.PrepareFeedbackRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPrepareFeedbackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void feedback(ai.visma.ssn.dataservice.v1.FeedbackRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFeedbackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void calculateMetrics(ai.visma.ssn.dataservice.v1.MetricsRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.dataservice.v1.FeedbackMetrics> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCalculateMetricsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void calculateMetricsV2(ai.visma.ssn.dataservice.v1.MetricsRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.dataservice.v1.FeedbackMetricsV2Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCalculateMetricsV2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(ai.visma.ssn.dataservice.v1.DeleteRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
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
    public void suggestionsPerMonthMetric(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.dataservice.v1.CallsPerMonthResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSuggestionsPerMonthMetricMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void callsPerMonthFilteredMetric(ai.visma.ssn.dataservice.v1.CallsPerMonthFilteredMetricRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.dataservice.v1.CallsPerMonthResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCallsPerMonthFilteredMetricMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void suggestionsPerMonthFilteredMetric(ai.visma.ssn.dataservice.v1.CallsPerMonthFilteredMetricRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.dataservice.v1.CallsPerMonthResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSuggestionsPerMonthFilteredMetricMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void calculateAnnotationProcessMetrics(ai.visma.ssn.dataservice.v1.AnnotationProcessMetricsRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.dataservice.v1.AnnotationProcessMetricsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCalculateAnnotationProcessMetricsMethod(), getCallOptions()), request, responseObserver);
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
    public ai.visma.ssn.dataservice.v1.CreateDocumentResponse createDocument(ai.visma.ssn.dataservice.v1.CreateDocumentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDocumentMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.visma.ssn.dataservice.v1.ReadDocumentResponse readDocument(ai.visma.ssn.dataservice.v1.ReadDocumentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadDocumentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * For feedback
     * </pre>
     */
    public com.google.protobuf.Empty prepareFeedback(ai.visma.ssn.dataservice.v1.PrepareFeedbackRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPrepareFeedbackMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty feedback(ai.visma.ssn.dataservice.v1.FeedbackRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFeedbackMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.visma.ssn.dataservice.v1.FeedbackMetrics calculateMetrics(ai.visma.ssn.dataservice.v1.MetricsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCalculateMetricsMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.visma.ssn.dataservice.v1.FeedbackMetricsV2Response calculateMetricsV2(ai.visma.ssn.dataservice.v1.MetricsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCalculateMetricsV2Method(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty delete(ai.visma.ssn.dataservice.v1.DeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.visma.ssn.dataservice.v1.CallsPerMonthResponse callsPerMonthMetric(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCallsPerMonthMetricMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.visma.ssn.dataservice.v1.CallsPerMonthResponse suggestionsPerMonthMetric(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSuggestionsPerMonthMetricMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.visma.ssn.dataservice.v1.CallsPerMonthResponse callsPerMonthFilteredMetric(ai.visma.ssn.dataservice.v1.CallsPerMonthFilteredMetricRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCallsPerMonthFilteredMetricMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.visma.ssn.dataservice.v1.CallsPerMonthResponse suggestionsPerMonthFilteredMetric(ai.visma.ssn.dataservice.v1.CallsPerMonthFilteredMetricRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSuggestionsPerMonthFilteredMetricMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.visma.ssn.dataservice.v1.AnnotationProcessMetricsResponse calculateAnnotationProcessMetrics(ai.visma.ssn.dataservice.v1.AnnotationProcessMetricsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCalculateAnnotationProcessMetricsMethod(), getCallOptions(), request);
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
    public ai.visma.ssn.dataservice.v1.CreateDocumentResponse createDocument(ai.visma.ssn.dataservice.v1.CreateDocumentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDocumentMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.visma.ssn.dataservice.v1.ReadDocumentResponse readDocument(ai.visma.ssn.dataservice.v1.ReadDocumentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadDocumentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * For feedback
     * </pre>
     */
    public com.google.protobuf.Empty prepareFeedback(ai.visma.ssn.dataservice.v1.PrepareFeedbackRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPrepareFeedbackMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty feedback(ai.visma.ssn.dataservice.v1.FeedbackRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFeedbackMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.visma.ssn.dataservice.v1.FeedbackMetrics calculateMetrics(ai.visma.ssn.dataservice.v1.MetricsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCalculateMetricsMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.visma.ssn.dataservice.v1.FeedbackMetricsV2Response calculateMetricsV2(ai.visma.ssn.dataservice.v1.MetricsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCalculateMetricsV2Method(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty delete(ai.visma.ssn.dataservice.v1.DeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.visma.ssn.dataservice.v1.CallsPerMonthResponse callsPerMonthMetric(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCallsPerMonthMetricMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.visma.ssn.dataservice.v1.CallsPerMonthResponse suggestionsPerMonthMetric(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSuggestionsPerMonthMetricMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.visma.ssn.dataservice.v1.CallsPerMonthResponse callsPerMonthFilteredMetric(ai.visma.ssn.dataservice.v1.CallsPerMonthFilteredMetricRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCallsPerMonthFilteredMetricMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.visma.ssn.dataservice.v1.CallsPerMonthResponse suggestionsPerMonthFilteredMetric(ai.visma.ssn.dataservice.v1.CallsPerMonthFilteredMetricRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSuggestionsPerMonthFilteredMetricMethod(), getCallOptions(), request);
    }

    /**
     */
    public ai.visma.ssn.dataservice.v1.AnnotationProcessMetricsResponse calculateAnnotationProcessMetrics(ai.visma.ssn.dataservice.v1.AnnotationProcessMetricsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCalculateAnnotationProcessMetricsMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.ssn.dataservice.v1.CreateDocumentResponse> createDocument(
        ai.visma.ssn.dataservice.v1.CreateDocumentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDocumentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.ssn.dataservice.v1.ReadDocumentResponse> readDocument(
        ai.visma.ssn.dataservice.v1.ReadDocumentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadDocumentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * For feedback
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> prepareFeedback(
        ai.visma.ssn.dataservice.v1.PrepareFeedbackRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPrepareFeedbackMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> feedback(
        ai.visma.ssn.dataservice.v1.FeedbackRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFeedbackMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.ssn.dataservice.v1.FeedbackMetrics> calculateMetrics(
        ai.visma.ssn.dataservice.v1.MetricsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCalculateMetricsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.ssn.dataservice.v1.FeedbackMetricsV2Response> calculateMetricsV2(
        ai.visma.ssn.dataservice.v1.MetricsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCalculateMetricsV2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> delete(
        ai.visma.ssn.dataservice.v1.DeleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.ssn.dataservice.v1.CallsPerMonthResponse> suggestionsPerMonthMetric(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSuggestionsPerMonthMetricMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.ssn.dataservice.v1.CallsPerMonthResponse> callsPerMonthFilteredMetric(
        ai.visma.ssn.dataservice.v1.CallsPerMonthFilteredMetricRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCallsPerMonthFilteredMetricMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.ssn.dataservice.v1.CallsPerMonthResponse> suggestionsPerMonthFilteredMetric(
        ai.visma.ssn.dataservice.v1.CallsPerMonthFilteredMetricRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSuggestionsPerMonthFilteredMetricMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.ssn.dataservice.v1.AnnotationProcessMetricsResponse> calculateAnnotationProcessMetrics(
        ai.visma.ssn.dataservice.v1.AnnotationProcessMetricsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCalculateAnnotationProcessMetricsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_DOCUMENT = 0;
  private static final int METHODID_READ_DOCUMENT = 1;
  private static final int METHODID_PREPARE_FEEDBACK = 2;
  private static final int METHODID_FEEDBACK = 3;
  private static final int METHODID_CALCULATE_METRICS = 4;
  private static final int METHODID_CALCULATE_METRICS_V2 = 5;
  private static final int METHODID_DELETE = 6;
  private static final int METHODID_CALLS_PER_MONTH_METRIC = 7;
  private static final int METHODID_SUGGESTIONS_PER_MONTH_METRIC = 8;
  private static final int METHODID_CALLS_PER_MONTH_FILTERED_METRIC = 9;
  private static final int METHODID_SUGGESTIONS_PER_MONTH_FILTERED_METRIC = 10;
  private static final int METHODID_CALCULATE_ANNOTATION_PROCESS_METRICS = 11;

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
        case METHODID_CREATE_DOCUMENT:
          serviceImpl.createDocument((ai.visma.ssn.dataservice.v1.CreateDocumentRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.ssn.dataservice.v1.CreateDocumentResponse>) responseObserver);
          break;
        case METHODID_READ_DOCUMENT:
          serviceImpl.readDocument((ai.visma.ssn.dataservice.v1.ReadDocumentRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.ssn.dataservice.v1.ReadDocumentResponse>) responseObserver);
          break;
        case METHODID_PREPARE_FEEDBACK:
          serviceImpl.prepareFeedback((ai.visma.ssn.dataservice.v1.PrepareFeedbackRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_FEEDBACK:
          serviceImpl.feedback((ai.visma.ssn.dataservice.v1.FeedbackRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CALCULATE_METRICS:
          serviceImpl.calculateMetrics((ai.visma.ssn.dataservice.v1.MetricsRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.ssn.dataservice.v1.FeedbackMetrics>) responseObserver);
          break;
        case METHODID_CALCULATE_METRICS_V2:
          serviceImpl.calculateMetricsV2((ai.visma.ssn.dataservice.v1.MetricsRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.ssn.dataservice.v1.FeedbackMetricsV2Response>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((ai.visma.ssn.dataservice.v1.DeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CALLS_PER_MONTH_METRIC:
          serviceImpl.callsPerMonthMetric((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<ai.visma.ssn.dataservice.v1.CallsPerMonthResponse>) responseObserver);
          break;
        case METHODID_SUGGESTIONS_PER_MONTH_METRIC:
          serviceImpl.suggestionsPerMonthMetric((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<ai.visma.ssn.dataservice.v1.CallsPerMonthResponse>) responseObserver);
          break;
        case METHODID_CALLS_PER_MONTH_FILTERED_METRIC:
          serviceImpl.callsPerMonthFilteredMetric((ai.visma.ssn.dataservice.v1.CallsPerMonthFilteredMetricRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.ssn.dataservice.v1.CallsPerMonthResponse>) responseObserver);
          break;
        case METHODID_SUGGESTIONS_PER_MONTH_FILTERED_METRIC:
          serviceImpl.suggestionsPerMonthFilteredMetric((ai.visma.ssn.dataservice.v1.CallsPerMonthFilteredMetricRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.ssn.dataservice.v1.CallsPerMonthResponse>) responseObserver);
          break;
        case METHODID_CALCULATE_ANNOTATION_PROCESS_METRICS:
          serviceImpl.calculateAnnotationProcessMetrics((ai.visma.ssn.dataservice.v1.AnnotationProcessMetricsRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.ssn.dataservice.v1.AnnotationProcessMetricsResponse>) responseObserver);
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
          getCreateDocumentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.ssn.dataservice.v1.CreateDocumentRequest,
              ai.visma.ssn.dataservice.v1.CreateDocumentResponse>(
                service, METHODID_CREATE_DOCUMENT)))
        .addMethod(
          getReadDocumentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.ssn.dataservice.v1.ReadDocumentRequest,
              ai.visma.ssn.dataservice.v1.ReadDocumentResponse>(
                service, METHODID_READ_DOCUMENT)))
        .addMethod(
          getPrepareFeedbackMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.ssn.dataservice.v1.PrepareFeedbackRequest,
              com.google.protobuf.Empty>(
                service, METHODID_PREPARE_FEEDBACK)))
        .addMethod(
          getFeedbackMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.ssn.dataservice.v1.FeedbackRequest,
              com.google.protobuf.Empty>(
                service, METHODID_FEEDBACK)))
        .addMethod(
          getCalculateMetricsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.ssn.dataservice.v1.MetricsRequest,
              ai.visma.ssn.dataservice.v1.FeedbackMetrics>(
                service, METHODID_CALCULATE_METRICS)))
        .addMethod(
          getCalculateMetricsV2Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.ssn.dataservice.v1.MetricsRequest,
              ai.visma.ssn.dataservice.v1.FeedbackMetricsV2Response>(
                service, METHODID_CALCULATE_METRICS_V2)))
        .addMethod(
          getDeleteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.ssn.dataservice.v1.DeleteRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE)))
        .addMethod(
          getCallsPerMonthMetricMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              ai.visma.ssn.dataservice.v1.CallsPerMonthResponse>(
                service, METHODID_CALLS_PER_MONTH_METRIC)))
        .addMethod(
          getSuggestionsPerMonthMetricMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              ai.visma.ssn.dataservice.v1.CallsPerMonthResponse>(
                service, METHODID_SUGGESTIONS_PER_MONTH_METRIC)))
        .addMethod(
          getCallsPerMonthFilteredMetricMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.ssn.dataservice.v1.CallsPerMonthFilteredMetricRequest,
              ai.visma.ssn.dataservice.v1.CallsPerMonthResponse>(
                service, METHODID_CALLS_PER_MONTH_FILTERED_METRIC)))
        .addMethod(
          getSuggestionsPerMonthFilteredMetricMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.ssn.dataservice.v1.CallsPerMonthFilteredMetricRequest,
              ai.visma.ssn.dataservice.v1.CallsPerMonthResponse>(
                service, METHODID_SUGGESTIONS_PER_MONTH_FILTERED_METRIC)))
        .addMethod(
          getCalculateAnnotationProcessMetricsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.ssn.dataservice.v1.AnnotationProcessMetricsRequest,
              ai.visma.ssn.dataservice.v1.AnnotationProcessMetricsResponse>(
                service, METHODID_CALCULATE_ANNOTATION_PROCESS_METRICS)))
        .build();
  }

  private static abstract class DataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DataServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.visma.ssn.dataservice.v1.DataserviceProto.getDescriptor();
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
              .addMethod(getCreateDocumentMethod())
              .addMethod(getReadDocumentMethod())
              .addMethod(getPrepareFeedbackMethod())
              .addMethod(getFeedbackMethod())
              .addMethod(getCalculateMetricsMethod())
              .addMethod(getCalculateMetricsV2Method())
              .addMethod(getDeleteMethod())
              .addMethod(getCallsPerMonthMetricMethod())
              .addMethod(getSuggestionsPerMonthMetricMethod())
              .addMethod(getCallsPerMonthFilteredMetricMethod())
              .addMethod(getSuggestionsPerMonthFilteredMetricMethod())
              .addMethod(getCalculateAnnotationProcessMetricsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
