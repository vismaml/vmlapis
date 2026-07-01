package ai.visma.ssn.companylookup.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * CompanyLookupService is an internal service called during invoice
 * post-processing. It records observations, verifies bank accounts against
 * accumulated history, and returns already-known company enrichment. It never
 * calls external registries — enrichment is fetched out of band by a job.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.70.0)",
    comments = "Source: ssn/companylookup/v1/companylookup.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CompanyLookupServiceGrpc {

  private CompanyLookupServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ssn.companylookup.v1.CompanyLookupService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.visma.ssn.companylookup.v1.ProcessInvoiceCompanyDataRequest,
      ai.visma.ssn.companylookup.v1.ProcessInvoiceCompanyDataResponse> getProcessInvoiceCompanyDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProcessInvoiceCompanyData",
      requestType = ai.visma.ssn.companylookup.v1.ProcessInvoiceCompanyDataRequest.class,
      responseType = ai.visma.ssn.companylookup.v1.ProcessInvoiceCompanyDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.visma.ssn.companylookup.v1.ProcessInvoiceCompanyDataRequest,
      ai.visma.ssn.companylookup.v1.ProcessInvoiceCompanyDataResponse> getProcessInvoiceCompanyDataMethod() {
    io.grpc.MethodDescriptor<ai.visma.ssn.companylookup.v1.ProcessInvoiceCompanyDataRequest, ai.visma.ssn.companylookup.v1.ProcessInvoiceCompanyDataResponse> getProcessInvoiceCompanyDataMethod;
    if ((getProcessInvoiceCompanyDataMethod = CompanyLookupServiceGrpc.getProcessInvoiceCompanyDataMethod) == null) {
      synchronized (CompanyLookupServiceGrpc.class) {
        if ((getProcessInvoiceCompanyDataMethod = CompanyLookupServiceGrpc.getProcessInvoiceCompanyDataMethod) == null) {
          CompanyLookupServiceGrpc.getProcessInvoiceCompanyDataMethod = getProcessInvoiceCompanyDataMethod =
              io.grpc.MethodDescriptor.<ai.visma.ssn.companylookup.v1.ProcessInvoiceCompanyDataRequest, ai.visma.ssn.companylookup.v1.ProcessInvoiceCompanyDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProcessInvoiceCompanyData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.companylookup.v1.ProcessInvoiceCompanyDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.visma.ssn.companylookup.v1.ProcessInvoiceCompanyDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CompanyLookupServiceMethodDescriptorSupplier("ProcessInvoiceCompanyData"))
              .build();
        }
      }
    }
    return getProcessInvoiceCompanyDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CompanyLookupServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CompanyLookupServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CompanyLookupServiceStub>() {
        @java.lang.Override
        public CompanyLookupServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CompanyLookupServiceStub(channel, callOptions);
        }
      };
    return CompanyLookupServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static CompanyLookupServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CompanyLookupServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CompanyLookupServiceBlockingV2Stub>() {
        @java.lang.Override
        public CompanyLookupServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CompanyLookupServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return CompanyLookupServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CompanyLookupServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CompanyLookupServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CompanyLookupServiceBlockingStub>() {
        @java.lang.Override
        public CompanyLookupServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CompanyLookupServiceBlockingStub(channel, callOptions);
        }
      };
    return CompanyLookupServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CompanyLookupServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CompanyLookupServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CompanyLookupServiceFutureStub>() {
        @java.lang.Override
        public CompanyLookupServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CompanyLookupServiceFutureStub(channel, callOptions);
        }
      };
    return CompanyLookupServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * CompanyLookupService is an internal service called during invoice
   * post-processing. It records observations, verifies bank accounts against
   * accumulated history, and returns already-known company enrichment. It never
   * calls external registries — enrichment is fetched out of band by a job.
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void processInvoiceCompanyData(ai.visma.ssn.companylookup.v1.ProcessInvoiceCompanyDataRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.companylookup.v1.ProcessInvoiceCompanyDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProcessInvoiceCompanyDataMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CompanyLookupService.
   * <pre>
   * CompanyLookupService is an internal service called during invoice
   * post-processing. It records observations, verifies bank accounts against
   * accumulated history, and returns already-known company enrichment. It never
   * calls external registries — enrichment is fetched out of band by a job.
   * </pre>
   */
  public static abstract class CompanyLookupServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CompanyLookupServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CompanyLookupService.
   * <pre>
   * CompanyLookupService is an internal service called during invoice
   * post-processing. It records observations, verifies bank accounts against
   * accumulated history, and returns already-known company enrichment. It never
   * calls external registries — enrichment is fetched out of band by a job.
   * </pre>
   */
  public static final class CompanyLookupServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CompanyLookupServiceStub> {
    private CompanyLookupServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompanyLookupServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CompanyLookupServiceStub(channel, callOptions);
    }

    /**
     */
    public void processInvoiceCompanyData(ai.visma.ssn.companylookup.v1.ProcessInvoiceCompanyDataRequest request,
        io.grpc.stub.StreamObserver<ai.visma.ssn.companylookup.v1.ProcessInvoiceCompanyDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProcessInvoiceCompanyDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CompanyLookupService.
   * <pre>
   * CompanyLookupService is an internal service called during invoice
   * post-processing. It records observations, verifies bank accounts against
   * accumulated history, and returns already-known company enrichment. It never
   * calls external registries — enrichment is fetched out of band by a job.
   * </pre>
   */
  public static final class CompanyLookupServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<CompanyLookupServiceBlockingV2Stub> {
    private CompanyLookupServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompanyLookupServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CompanyLookupServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public ai.visma.ssn.companylookup.v1.ProcessInvoiceCompanyDataResponse processInvoiceCompanyData(ai.visma.ssn.companylookup.v1.ProcessInvoiceCompanyDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProcessInvoiceCompanyDataMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service CompanyLookupService.
   * <pre>
   * CompanyLookupService is an internal service called during invoice
   * post-processing. It records observations, verifies bank accounts against
   * accumulated history, and returns already-known company enrichment. It never
   * calls external registries — enrichment is fetched out of band by a job.
   * </pre>
   */
  public static final class CompanyLookupServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CompanyLookupServiceBlockingStub> {
    private CompanyLookupServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompanyLookupServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CompanyLookupServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ai.visma.ssn.companylookup.v1.ProcessInvoiceCompanyDataResponse processInvoiceCompanyData(ai.visma.ssn.companylookup.v1.ProcessInvoiceCompanyDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProcessInvoiceCompanyDataMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CompanyLookupService.
   * <pre>
   * CompanyLookupService is an internal service called during invoice
   * post-processing. It records observations, verifies bank accounts against
   * accumulated history, and returns already-known company enrichment. It never
   * calls external registries — enrichment is fetched out of band by a job.
   * </pre>
   */
  public static final class CompanyLookupServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CompanyLookupServiceFutureStub> {
    private CompanyLookupServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompanyLookupServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CompanyLookupServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.visma.ssn.companylookup.v1.ProcessInvoiceCompanyDataResponse> processInvoiceCompanyData(
        ai.visma.ssn.companylookup.v1.ProcessInvoiceCompanyDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProcessInvoiceCompanyDataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PROCESS_INVOICE_COMPANY_DATA = 0;

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
        case METHODID_PROCESS_INVOICE_COMPANY_DATA:
          serviceImpl.processInvoiceCompanyData((ai.visma.ssn.companylookup.v1.ProcessInvoiceCompanyDataRequest) request,
              (io.grpc.stub.StreamObserver<ai.visma.ssn.companylookup.v1.ProcessInvoiceCompanyDataResponse>) responseObserver);
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
          getProcessInvoiceCompanyDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.visma.ssn.companylookup.v1.ProcessInvoiceCompanyDataRequest,
              ai.visma.ssn.companylookup.v1.ProcessInvoiceCompanyDataResponse>(
                service, METHODID_PROCESS_INVOICE_COMPANY_DATA)))
        .build();
  }

  private static abstract class CompanyLookupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CompanyLookupServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.visma.ssn.companylookup.v1.CompanylookupProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CompanyLookupService");
    }
  }

  private static final class CompanyLookupServiceFileDescriptorSupplier
      extends CompanyLookupServiceBaseDescriptorSupplier {
    CompanyLookupServiceFileDescriptorSupplier() {}
  }

  private static final class CompanyLookupServiceMethodDescriptorSupplier
      extends CompanyLookupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CompanyLookupServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CompanyLookupServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CompanyLookupServiceFileDescriptorSupplier())
              .addMethod(getProcessInvoiceCompanyDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
