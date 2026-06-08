package ai.visma.ssn.documentdataservice.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.70.0)",
    comments = "Source: ssn/documentdataservice/v1/documentdataservice.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DocumentDataServiceGrpc {

  private DocumentDataServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ssn.documentdataservice.v1.DocumentDataService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.visma.ssn.documentdataservice.v1.GetDocumentDataRequest,
      ai.visma.ssn.documentdataservice.v1.GetDocumentDataResponse> getGetDocumentDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDocumentData",
      requestType = ai.visma.ssn.documentdataservice.v1.GetDocumentDataRequest.class,
      responseType = ai.visma.ssn.documentdataservice.v1.GetDocumentDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.ssn.documentdataservice.v1.GetDocumentDataRequest,
      ai.visma.ssn.documentdataservice.v1.GetDocumentDataResponse> getGetDocumentDataMethod() {
    io.grpc.MethodDescriptor<ai.visma.ssn.documentdataservice.v1.GetDocumentDataRequest, ai.visma.ssn.documentdataservice.v1.GetDocumentDataResponse> getGetDocumentDataMethod;
    if ((getGetDocumentDataMethod = DocumentDataServiceGrpc.getGetDocumentDataMethod) == null) {
      synchronized (DocumentDataServiceGrpc.class) {
        if ((getGetDocumentDataMethod = DocumentDataServiceGrpc.getGetDocumentDataMethod) == null) {
          DocumentDataServiceGrpc.getGetDocumentDataMethod = getGetDocumentDataMethod =
              io.grpc.MethodDescriptor.<ai.visma.ssn.documentdataservice.v1.GetDocumentDataRequest, ai.visma.ssn.documentdataservice.v1.GetDocumentDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDocumentData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.documentdataservice.v1.GetDocumentDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.documentdataservice.v1.GetDocumentDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DocumentDataServiceMethodDescriptorSupplier("GetDocumentData"))
              .build();
        }
      }
    }
    return getGetDocumentDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.ssn.documentdataservice.v1.SetDocumentBlobsRequest,
      ai.visma.ssn.documentdataservice.v1.SetDocumentBlobsResponse> getSetDocumentBlobsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetDocumentBlobs",
      requestType = ai.visma.ssn.documentdataservice.v1.SetDocumentBlobsRequest.class,
      responseType = ai.visma.ssn.documentdataservice.v1.SetDocumentBlobsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.ssn.documentdataservice.v1.SetDocumentBlobsRequest,
      ai.visma.ssn.documentdataservice.v1.SetDocumentBlobsResponse> getSetDocumentBlobsMethod() {
    io.grpc.MethodDescriptor<ai.visma.ssn.documentdataservice.v1.SetDocumentBlobsRequest, ai.visma.ssn.documentdataservice.v1.SetDocumentBlobsResponse> getSetDocumentBlobsMethod;
    if ((getSetDocumentBlobsMethod = DocumentDataServiceGrpc.getSetDocumentBlobsMethod) == null) {
      synchronized (DocumentDataServiceGrpc.class) {
        if ((getSetDocumentBlobsMethod = DocumentDataServiceGrpc.getSetDocumentBlobsMethod) == null) {
          DocumentDataServiceGrpc.getSetDocumentBlobsMethod = getSetDocumentBlobsMethod =
              io.grpc.MethodDescriptor.<ai.visma.ssn.documentdataservice.v1.SetDocumentBlobsRequest, ai.visma.ssn.documentdataservice.v1.SetDocumentBlobsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetDocumentBlobs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.documentdataservice.v1.SetDocumentBlobsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.documentdataservice.v1.SetDocumentBlobsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DocumentDataServiceMethodDescriptorSupplier("SetDocumentBlobs"))
              .build();
        }
      }
    }
    return getSetDocumentBlobsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.ssn.documentdataservice.v1.AddAnnotationsRequest,
      ai.visma.ssn.documentdataservice.v1.AddAnnotationsResponse> getAddAnnotationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddAnnotations",
      requestType = ai.visma.ssn.documentdataservice.v1.AddAnnotationsRequest.class,
      responseType = ai.visma.ssn.documentdataservice.v1.AddAnnotationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.ssn.documentdataservice.v1.AddAnnotationsRequest,
      ai.visma.ssn.documentdataservice.v1.AddAnnotationsResponse> getAddAnnotationsMethod() {
    io.grpc.MethodDescriptor<ai.visma.ssn.documentdataservice.v1.AddAnnotationsRequest, ai.visma.ssn.documentdataservice.v1.AddAnnotationsResponse> getAddAnnotationsMethod;
    if ((getAddAnnotationsMethod = DocumentDataServiceGrpc.getAddAnnotationsMethod) == null) {
      synchronized (DocumentDataServiceGrpc.class) {
        if ((getAddAnnotationsMethod = DocumentDataServiceGrpc.getAddAnnotationsMethod) == null) {
          DocumentDataServiceGrpc.getAddAnnotationsMethod = getAddAnnotationsMethod =
              io.grpc.MethodDescriptor.<ai.visma.ssn.documentdataservice.v1.AddAnnotationsRequest, ai.visma.ssn.documentdataservice.v1.AddAnnotationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddAnnotations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.documentdataservice.v1.AddAnnotationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.documentdataservice.v1.AddAnnotationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DocumentDataServiceMethodDescriptorSupplier("AddAnnotations"))
              .build();
        }
      }
    }
    return getAddAnnotationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.ssn.documentdataservice.v1.DeleteDocumentRequest,
      ai.visma.ssn.documentdataservice.v1.DeleteDocumentResponse> getDeleteDocumentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDocument",
      requestType = ai.visma.ssn.documentdataservice.v1.DeleteDocumentRequest.class,
      responseType = ai.visma.ssn.documentdataservice.v1.DeleteDocumentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.ssn.documentdataservice.v1.DeleteDocumentRequest,
      ai.visma.ssn.documentdataservice.v1.DeleteDocumentResponse> getDeleteDocumentMethod() {
    io.grpc.MethodDescriptor<ai.visma.ssn.documentdataservice.v1.DeleteDocumentRequest, ai.visma.ssn.documentdataservice.v1.DeleteDocumentResponse> getDeleteDocumentMethod;
    if ((getDeleteDocumentMethod = DocumentDataServiceGrpc.getDeleteDocumentMethod) == null) {
      synchronized (DocumentDataServiceGrpc.class) {
        if ((getDeleteDocumentMethod = DocumentDataServiceGrpc.getDeleteDocumentMethod) == null) {
          DocumentDataServiceGrpc.getDeleteDocumentMethod = getDeleteDocumentMethod =
              io.grpc.MethodDescriptor.<ai.visma.ssn.documentdataservice.v1.DeleteDocumentRequest, ai.visma.ssn.documentdataservice.v1.DeleteDocumentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDocument"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.documentdataservice.v1.DeleteDocumentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.documentdataservice.v1.DeleteDocumentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DocumentDataServiceMethodDescriptorSupplier("DeleteDocument"))
              .build();
        }
      }
    }
    return getDeleteDocumentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.visma.ssn.documentdataservice.v1.DeleteAnnotationsRequest,
      ai.visma.ssn.documentdataservice.v1.DeleteAnnotationsResponse> getDeleteAnnotationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAnnotations",
      requestType = ai.visma.ssn.documentdataservice.v1.DeleteAnnotationsRequest.class,
      responseType = ai.visma.ssn.documentdataservice.v1.DeleteAnnotationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.ssn.documentdataservice.v1.DeleteAnnotationsRequest,
      ai.visma.ssn.documentdataservice.v1.DeleteAnnotationsResponse> getDeleteAnnotationsMethod() {
    io.grpc.MethodDescriptor<ai.visma.ssn.documentdataservice.v1.DeleteAnnotationsRequest, ai.visma.ssn.documentdataservice.v1.DeleteAnnotationsResponse> getDeleteAnnotationsMethod;
    if ((getDeleteAnnotationsMethod = DocumentDataServiceGrpc.getDeleteAnnotationsMethod) == null) {
      synchronized (DocumentDataServiceGrpc.class) {
        if ((getDeleteAnnotationsMethod = DocumentDataServiceGrpc.getDeleteAnnotationsMethod) == null) {
          DocumentDataServiceGrpc.getDeleteAnnotationsMethod = getDeleteAnnotationsMethod =
              io.grpc.MethodDescriptor.<ai.visma.ssn.documentdataservice.v1.DeleteAnnotationsRequest, ai.visma.ssn.documentdataservice.v1.DeleteAnnotationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAnnotations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.documentdataservice.v1.DeleteAnnotationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.documentdataservice.v1.DeleteAnnotationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DocumentDataServiceMethodDescriptorSupplier("DeleteAnnotations"))
              .build();
        }
      }
    }
    return getDeleteAnnotationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DocumentDataServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DocumentDataServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DocumentDataServiceStub>() {
        @java.lang.Override
        public DocumentDataServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DocumentDataServiceStub(channel, callOptions);
        }
      };
    return DocumentDataServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static DocumentDataServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DocumentDataServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DocumentDataServiceBlockingV2Stub>() {
        @java.lang.Override
        public DocumentDataServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DocumentDataServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return DocumentDataServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DocumentDataServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DocumentDataServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DocumentDataServiceBlockingStub>() {
        @java.lang.Override
        public DocumentDataServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DocumentDataServiceBlockingStub(channel, callOptions);
        }
      };
    return DocumentDataServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DocumentDataServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DocumentDataServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DocumentDataServiceFutureStub>() {
        @java.lang.Override
        public DocumentDataServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DocumentDataServiceFutureStub(channel, callOptions);
        }
      };
    return DocumentDataServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * GetDocumentData returns document blobs (as signed GCS URLs) and field
     * annotations for a given document. Large blobs (file, renders, TextAnnotation)
     * are returned as signed GCS URLs — never inline bytes.
     * </pre>
     */
    default void getDocumentData(ai.visma.ssn.documentdataservice.v1.GetDocumentDataRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.documentdataservice.v1.GetDocumentDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDocumentDataMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetDocumentBlobs upserts GCS URIs for the document's blobs.
     * Presence-based: only fields present in the request are written.
     * Absent optional fields leave existing values untouched.
     * </pre>
     */
    default void setDocumentBlobs(ai.visma.ssn.documentdataservice.v1.SetDocumentBlobsRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.documentdataservice.v1.SetDocumentBlobsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetDocumentBlobsMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddAnnotations upserts field annotations by (feature, source, source_id).
     * Latest-wins: a second call with the same key replaces the previous entry.
     * To preserve history, use a distinct source_id (e.g. append a version suffix).
     * </pre>
     */
    default void addAnnotations(ai.visma.ssn.documentdataservice.v1.AddAnnotationsRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.documentdataservice.v1.AddAnnotationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddAnnotationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteDocument schedules asynchronous deletion of a document and all its
     * blobs and annotations. Deletion is durable (Pub/Sub) and retried on failure.
     * </pre>
     */
    default void deleteDocument(ai.visma.ssn.documentdataservice.v1.DeleteDocumentRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.documentdataservice.v1.DeleteDocumentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDocumentMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteAnnotations removes annotations for a specific feature, optionally
     * narrowed by source and source_id. Cleans up the field_annotation marker
     * if no annotations remain for the feature.
     * </pre>
     */
    default void deleteAnnotations(ai.visma.ssn.documentdataservice.v1.DeleteAnnotationsRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.documentdataservice.v1.DeleteAnnotationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAnnotationsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DocumentDataService.
   */
  public static abstract class DocumentDataServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DocumentDataServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DocumentDataService.
   */
  public static final class DocumentDataServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DocumentDataServiceStub> {
    private DocumentDataServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DocumentDataServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DocumentDataServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetDocumentData returns document blobs (as signed GCS URLs) and field
     * annotations for a given document. Large blobs (file, renders, TextAnnotation)
     * are returned as signed GCS URLs — never inline bytes.
     * </pre>
     */
    public void getDocumentData(ai.visma.ssn.documentdataservice.v1.GetDocumentDataRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.documentdataservice.v1.GetDocumentDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDocumentDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetDocumentBlobs upserts GCS URIs for the document's blobs.
     * Presence-based: only fields present in the request are written.
     * Absent optional fields leave existing values untouched.
     * </pre>
     */
    public void setDocumentBlobs(ai.visma.ssn.documentdataservice.v1.SetDocumentBlobsRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.documentdataservice.v1.SetDocumentBlobsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetDocumentBlobsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddAnnotations upserts field annotations by (feature, source, source_id).
     * Latest-wins: a second call with the same key replaces the previous entry.
     * To preserve history, use a distinct source_id (e.g. append a version suffix).
     * </pre>
     */
    public void addAnnotations(ai.visma.ssn.documentdataservice.v1.AddAnnotationsRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.documentdataservice.v1.AddAnnotationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddAnnotationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteDocument schedules asynchronous deletion of a document and all its
     * blobs and annotations. Deletion is durable (Pub/Sub) and retried on failure.
     * </pre>
     */
    public void deleteDocument(ai.visma.ssn.documentdataservice.v1.DeleteDocumentRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.documentdataservice.v1.DeleteDocumentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDocumentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteAnnotations removes annotations for a specific feature, optionally
     * narrowed by source and source_id. Cleans up the field_annotation marker
     * if no annotations remain for the feature.
     * </pre>
     */
    public void deleteAnnotations(ai.visma.ssn.documentdataservice.v1.DeleteAnnotationsRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.documentdataservice.v1.DeleteAnnotationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAnnotationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DocumentDataService.
   */
  public static final class DocumentDataServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<DocumentDataServiceBlockingV2Stub> {
    private DocumentDataServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DocumentDataServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DocumentDataServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * GetDocumentData returns document blobs (as signed GCS URLs) and field
     * annotations for a given document. Large blobs (file, renders, TextAnnotation)
     * are returned as signed GCS URLs — never inline bytes.
     * </pre>
     */
    public ai.visma.ssn.documentdataservice.v1.GetDocumentDataResponse getDocumentData(ai.visma.ssn.documentdataservice.v1.GetDocumentDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDocumentDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetDocumentBlobs upserts GCS URIs for the document's blobs.
     * Presence-based: only fields present in the request are written.
     * Absent optional fields leave existing values untouched.
     * </pre>
     */
    public ai.visma.ssn.documentdataservice.v1.SetDocumentBlobsResponse setDocumentBlobs(ai.visma.ssn.documentdataservice.v1.SetDocumentBlobsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetDocumentBlobsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddAnnotations upserts field annotations by (feature, source, source_id).
     * Latest-wins: a second call with the same key replaces the previous entry.
     * To preserve history, use a distinct source_id (e.g. append a version suffix).
     * </pre>
     */
    public ai.visma.ssn.documentdataservice.v1.AddAnnotationsResponse addAnnotations(ai.visma.ssn.documentdataservice.v1.AddAnnotationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddAnnotationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteDocument schedules asynchronous deletion of a document and all its
     * blobs and annotations. Deletion is durable (Pub/Sub) and retried on failure.
     * </pre>
     */
    public ai.visma.ssn.documentdataservice.v1.DeleteDocumentResponse deleteDocument(ai.visma.ssn.documentdataservice.v1.DeleteDocumentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDocumentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteAnnotations removes annotations for a specific feature, optionally
     * narrowed by source and source_id. Cleans up the field_annotation marker
     * if no annotations remain for the feature.
     * </pre>
     */
    public ai.visma.ssn.documentdataservice.v1.DeleteAnnotationsResponse deleteAnnotations(ai.visma.ssn.documentdataservice.v1.DeleteAnnotationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAnnotationsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service DocumentDataService.
   */
  public static final class DocumentDataServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DocumentDataServiceBlockingStub> {
    private DocumentDataServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DocumentDataServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DocumentDataServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetDocumentData returns document blobs (as signed GCS URLs) and field
     * annotations for a given document. Large blobs (file, renders, TextAnnotation)
     * are returned as signed GCS URLs — never inline bytes.
     * </pre>
     */
    public ai.visma.ssn.documentdataservice.v1.GetDocumentDataResponse getDocumentData(ai.visma.ssn.documentdataservice.v1.GetDocumentDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDocumentDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetDocumentBlobs upserts GCS URIs for the document's blobs.
     * Presence-based: only fields present in the request are written.
     * Absent optional fields leave existing values untouched.
     * </pre>
     */
    public ai.visma.ssn.documentdataservice.v1.SetDocumentBlobsResponse setDocumentBlobs(ai.visma.ssn.documentdataservice.v1.SetDocumentBlobsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetDocumentBlobsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddAnnotations upserts field annotations by (feature, source, source_id).
     * Latest-wins: a second call with the same key replaces the previous entry.
     * To preserve history, use a distinct source_id (e.g. append a version suffix).
     * </pre>
     */
    public ai.visma.ssn.documentdataservice.v1.AddAnnotationsResponse addAnnotations(ai.visma.ssn.documentdataservice.v1.AddAnnotationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddAnnotationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteDocument schedules asynchronous deletion of a document and all its
     * blobs and annotations. Deletion is durable (Pub/Sub) and retried on failure.
     * </pre>
     */
    public ai.visma.ssn.documentdataservice.v1.DeleteDocumentResponse deleteDocument(ai.visma.ssn.documentdataservice.v1.DeleteDocumentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDocumentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteAnnotations removes annotations for a specific feature, optionally
     * narrowed by source and source_id. Cleans up the field_annotation marker
     * if no annotations remain for the feature.
     * </pre>
     */
    public ai.visma.ssn.documentdataservice.v1.DeleteAnnotationsResponse deleteAnnotations(ai.visma.ssn.documentdataservice.v1.DeleteAnnotationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAnnotationsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DocumentDataService.
   */
  public static final class DocumentDataServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DocumentDataServiceFutureStub> {
    private DocumentDataServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DocumentDataServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DocumentDataServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetDocumentData returns document blobs (as signed GCS URLs) and field
     * annotations for a given document. Large blobs (file, renders, TextAnnotation)
     * are returned as signed GCS URLs — never inline bytes.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.ssn.documentdataservice.v1.GetDocumentDataResponse> getDocumentData(
        ai.visma.ssn.documentdataservice.v1.GetDocumentDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDocumentDataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetDocumentBlobs upserts GCS URIs for the document's blobs.
     * Presence-based: only fields present in the request are written.
     * Absent optional fields leave existing values untouched.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.ssn.documentdataservice.v1.SetDocumentBlobsResponse> setDocumentBlobs(
        ai.visma.ssn.documentdataservice.v1.SetDocumentBlobsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetDocumentBlobsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddAnnotations upserts field annotations by (feature, source, source_id).
     * Latest-wins: a second call with the same key replaces the previous entry.
     * To preserve history, use a distinct source_id (e.g. append a version suffix).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.ssn.documentdataservice.v1.AddAnnotationsResponse> addAnnotations(
        ai.visma.ssn.documentdataservice.v1.AddAnnotationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddAnnotationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteDocument schedules asynchronous deletion of a document and all its
     * blobs and annotations. Deletion is durable (Pub/Sub) and retried on failure.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.ssn.documentdataservice.v1.DeleteDocumentResponse> deleteDocument(
        ai.visma.ssn.documentdataservice.v1.DeleteDocumentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDocumentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteAnnotations removes annotations for a specific feature, optionally
     * narrowed by source and source_id. Cleans up the field_annotation marker
     * if no annotations remain for the feature.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.ssn.documentdataservice.v1.DeleteAnnotationsResponse> deleteAnnotations(
        ai.visma.ssn.documentdataservice.v1.DeleteAnnotationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAnnotationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DOCUMENT_DATA = 0;
  private static final int METHODID_SET_DOCUMENT_BLOBS = 1;
  private static final int METHODID_ADD_ANNOTATIONS = 2;
  private static final int METHODID_DELETE_DOCUMENT = 3;
  private static final int METHODID_DELETE_ANNOTATIONS = 4;

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
        case METHODID_GET_DOCUMENT_DATA:
          serviceImpl.getDocumentData((ai.visma.ssn.documentdataservice.v1.GetDocumentDataRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.ssn.documentdataservice.v1.GetDocumentDataResponse>) responseObserver);
          break;
        case METHODID_SET_DOCUMENT_BLOBS:
          serviceImpl.setDocumentBlobs((ai.visma.ssn.documentdataservice.v1.SetDocumentBlobsRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.ssn.documentdataservice.v1.SetDocumentBlobsResponse>) responseObserver);
          break;
        case METHODID_ADD_ANNOTATIONS:
          serviceImpl.addAnnotations((ai.visma.ssn.documentdataservice.v1.AddAnnotationsRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.ssn.documentdataservice.v1.AddAnnotationsResponse>) responseObserver);
          break;
        case METHODID_DELETE_DOCUMENT:
          serviceImpl.deleteDocument((ai.visma.ssn.documentdataservice.v1.DeleteDocumentRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.ssn.documentdataservice.v1.DeleteDocumentResponse>) responseObserver);
          break;
        case METHODID_DELETE_ANNOTATIONS:
          serviceImpl.deleteAnnotations((ai.visma.ssn.documentdataservice.v1.DeleteAnnotationsRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.ssn.documentdataservice.v1.DeleteAnnotationsResponse>) responseObserver);
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
          getGetDocumentDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.ssn.documentdataservice.v1.GetDocumentDataRequest,
              ai.visma.ssn.documentdataservice.v1.GetDocumentDataResponse>(
                service, METHODID_GET_DOCUMENT_DATA)))
        .addMethod(
          getSetDocumentBlobsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.ssn.documentdataservice.v1.SetDocumentBlobsRequest,
              ai.visma.ssn.documentdataservice.v1.SetDocumentBlobsResponse>(
                service, METHODID_SET_DOCUMENT_BLOBS)))
        .addMethod(
          getAddAnnotationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.ssn.documentdataservice.v1.AddAnnotationsRequest,
              ai.visma.ssn.documentdataservice.v1.AddAnnotationsResponse>(
                service, METHODID_ADD_ANNOTATIONS)))
        .addMethod(
          getDeleteDocumentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.ssn.documentdataservice.v1.DeleteDocumentRequest,
              ai.visma.ssn.documentdataservice.v1.DeleteDocumentResponse>(
                service, METHODID_DELETE_DOCUMENT)))
        .addMethod(
          getDeleteAnnotationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.ssn.documentdataservice.v1.DeleteAnnotationsRequest,
              ai.visma.ssn.documentdataservice.v1.DeleteAnnotationsResponse>(
                service, METHODID_DELETE_ANNOTATIONS)))
        .build();
  }

  private static abstract class DocumentDataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DocumentDataServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.visma.ssn.documentdataservice.v1.DocumentdataserviceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DocumentDataService");
    }
  }

  private static final class DocumentDataServiceFileDescriptorSupplier
      extends DocumentDataServiceBaseDescriptorSupplier {
    DocumentDataServiceFileDescriptorSupplier() {}
  }

  private static final class DocumentDataServiceMethodDescriptorSupplier
      extends DocumentDataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DocumentDataServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (DocumentDataServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DocumentDataServiceFileDescriptorSupplier())
              .addMethod(getGetDocumentDataMethod())
              .addMethod(getSetDocumentBlobsMethod())
              .addMethod(getAddAnnotationsMethod())
              .addMethod(getDeleteDocumentMethod())
              .addMethod(getDeleteAnnotationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
