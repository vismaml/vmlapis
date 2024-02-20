// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: ssn/ocrservice/v1/ocrservice.proto
// </auto-generated>
#pragma warning disable 0414, 1591, 8981, 0612
#region Designer generated code

using grpc = global::Grpc.Core;

namespace Ssn.Ocrservice.V1 {
  /// <summary>
  /// Interface exported by the server.
  /// </summary>
  public static partial class OcrService
  {
    static readonly string __ServiceName = "ssn.ocrservice.v1.OcrService";

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static void __Helper_SerializeMessage(global::Google.Protobuf.IMessage message, grpc::SerializationContext context)
    {
      #if !GRPC_DISABLE_PROTOBUF_BUFFER_SERIALIZATION
      if (message is global::Google.Protobuf.IBufferMessage)
      {
        context.SetPayloadLength(message.CalculateSize());
        global::Google.Protobuf.MessageExtensions.WriteTo(message, context.GetBufferWriter());
        context.Complete();
        return;
      }
      #endif
      context.Complete(global::Google.Protobuf.MessageExtensions.ToByteArray(message));
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static class __Helper_MessageCache<T>
    {
      public static readonly bool IsBufferMessage = global::System.Reflection.IntrospectionExtensions.GetTypeInfo(typeof(global::Google.Protobuf.IBufferMessage)).IsAssignableFrom(typeof(T));
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static T __Helper_DeserializeMessage<T>(grpc::DeserializationContext context, global::Google.Protobuf.MessageParser<T> parser) where T : global::Google.Protobuf.IMessage<T>
    {
      #if !GRPC_DISABLE_PROTOBUF_BUFFER_SERIALIZATION
      if (__Helper_MessageCache<T>.IsBufferMessage)
      {
        return parser.ParseFrom(context.PayloadAsReadOnlySequence());
      }
      #endif
      return parser.ParseFrom(context.PayloadAsNewBuffer());
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::Ssn.Ocrservice.V1.OcrScanImageRequest> __Marshaller_ssn_ocrservice_v1_OcrScanImageRequest = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::Ssn.Ocrservice.V1.OcrScanImageRequest.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::Ssn.Ocrservice.V1.OcrScanImageResponse> __Marshaller_ssn_ocrservice_v1_OcrScanImageResponse = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::Ssn.Ocrservice.V1.OcrScanImageResponse.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::Ssn.Ocrservice.V1.GetTextAnnotationRequest> __Marshaller_ssn_ocrservice_v1_GetTextAnnotationRequest = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::Ssn.Ocrservice.V1.GetTextAnnotationRequest.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::Ssn.Ocrservice.V1.GetTextAnnotationResponse> __Marshaller_ssn_ocrservice_v1_GetTextAnnotationResponse = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::Ssn.Ocrservice.V1.GetTextAnnotationResponse.Parser));

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::Ssn.Ocrservice.V1.OcrScanImageRequest, global::Ssn.Ocrservice.V1.OcrScanImageResponse> __Method_OcrScanImage = new grpc::Method<global::Ssn.Ocrservice.V1.OcrScanImageRequest, global::Ssn.Ocrservice.V1.OcrScanImageResponse>(
        grpc::MethodType.Unary,
        __ServiceName,
        "OcrScanImage",
        __Marshaller_ssn_ocrservice_v1_OcrScanImageRequest,
        __Marshaller_ssn_ocrservice_v1_OcrScanImageResponse);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::Ssn.Ocrservice.V1.GetTextAnnotationRequest, global::Ssn.Ocrservice.V1.GetTextAnnotationResponse> __Method_GetTextAnnotation = new grpc::Method<global::Ssn.Ocrservice.V1.GetTextAnnotationRequest, global::Ssn.Ocrservice.V1.GetTextAnnotationResponse>(
        grpc::MethodType.Unary,
        __ServiceName,
        "GetTextAnnotation",
        __Marshaller_ssn_ocrservice_v1_GetTextAnnotationRequest,
        __Marshaller_ssn_ocrservice_v1_GetTextAnnotationResponse);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::Ssn.Ocrservice.V1.GetTextAnnotationRequest, global::Ssn.Ocrservice.V1.GetTextAnnotationResponse> __Method_GetTextAnnotations = new grpc::Method<global::Ssn.Ocrservice.V1.GetTextAnnotationRequest, global::Ssn.Ocrservice.V1.GetTextAnnotationResponse>(
        grpc::MethodType.ServerStreaming,
        __ServiceName,
        "GetTextAnnotations",
        __Marshaller_ssn_ocrservice_v1_GetTextAnnotationRequest,
        __Marshaller_ssn_ocrservice_v1_GetTextAnnotationResponse);

    /// <summary>Service descriptor</summary>
    public static global::Google.Protobuf.Reflection.ServiceDescriptor Descriptor
    {
      get { return global::Ssn.Ocrservice.V1.OcrserviceReflection.Descriptor.Services[0]; }
    }

    /// <summary>Base class for server-side implementations of OcrService</summary>
    [grpc::BindServiceMethod(typeof(OcrService), "BindService")]
    public abstract partial class OcrServiceBase
    {
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::System.Threading.Tasks.Task<global::Ssn.Ocrservice.V1.OcrScanImageResponse> OcrScanImage(global::Ssn.Ocrservice.V1.OcrScanImageRequest request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::System.Threading.Tasks.Task<global::Ssn.Ocrservice.V1.GetTextAnnotationResponse> GetTextAnnotation(global::Ssn.Ocrservice.V1.GetTextAnnotationRequest request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::System.Threading.Tasks.Task GetTextAnnotations(global::Ssn.Ocrservice.V1.GetTextAnnotationRequest request, grpc::IServerStreamWriter<global::Ssn.Ocrservice.V1.GetTextAnnotationResponse> responseStream, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

    }

    /// <summary>Client for OcrService</summary>
    public partial class OcrServiceClient : grpc::ClientBase<OcrServiceClient>
    {
      /// <summary>Creates a new client for OcrService</summary>
      /// <param name="channel">The channel to use to make remote calls.</param>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public OcrServiceClient(grpc::ChannelBase channel) : base(channel)
      {
      }
      /// <summary>Creates a new client for OcrService that uses a custom <c>CallInvoker</c>.</summary>
      /// <param name="callInvoker">The callInvoker to use to make remote calls.</param>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public OcrServiceClient(grpc::CallInvoker callInvoker) : base(callInvoker)
      {
      }
      /// <summary>Protected parameterless constructor to allow creation of test doubles.</summary>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      protected OcrServiceClient() : base()
      {
      }
      /// <summary>Protected constructor to allow creation of configured clients.</summary>
      /// <param name="configuration">The client configuration.</param>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      protected OcrServiceClient(ClientBaseConfiguration configuration) : base(configuration)
      {
      }

      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Ssn.Ocrservice.V1.OcrScanImageResponse OcrScanImage(global::Ssn.Ocrservice.V1.OcrScanImageRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return OcrScanImage(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Ssn.Ocrservice.V1.OcrScanImageResponse OcrScanImage(global::Ssn.Ocrservice.V1.OcrScanImageRequest request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_OcrScanImage, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Ssn.Ocrservice.V1.OcrScanImageResponse> OcrScanImageAsync(global::Ssn.Ocrservice.V1.OcrScanImageRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return OcrScanImageAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Ssn.Ocrservice.V1.OcrScanImageResponse> OcrScanImageAsync(global::Ssn.Ocrservice.V1.OcrScanImageRequest request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_OcrScanImage, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Ssn.Ocrservice.V1.GetTextAnnotationResponse GetTextAnnotation(global::Ssn.Ocrservice.V1.GetTextAnnotationRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return GetTextAnnotation(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Ssn.Ocrservice.V1.GetTextAnnotationResponse GetTextAnnotation(global::Ssn.Ocrservice.V1.GetTextAnnotationRequest request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_GetTextAnnotation, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Ssn.Ocrservice.V1.GetTextAnnotationResponse> GetTextAnnotationAsync(global::Ssn.Ocrservice.V1.GetTextAnnotationRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return GetTextAnnotationAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Ssn.Ocrservice.V1.GetTextAnnotationResponse> GetTextAnnotationAsync(global::Ssn.Ocrservice.V1.GetTextAnnotationRequest request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_GetTextAnnotation, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncServerStreamingCall<global::Ssn.Ocrservice.V1.GetTextAnnotationResponse> GetTextAnnotations(global::Ssn.Ocrservice.V1.GetTextAnnotationRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return GetTextAnnotations(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncServerStreamingCall<global::Ssn.Ocrservice.V1.GetTextAnnotationResponse> GetTextAnnotations(global::Ssn.Ocrservice.V1.GetTextAnnotationRequest request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncServerStreamingCall(__Method_GetTextAnnotations, null, options, request);
      }
      /// <summary>Creates a new instance of client from given <c>ClientBaseConfiguration</c>.</summary>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      protected override OcrServiceClient NewInstance(ClientBaseConfiguration configuration)
      {
        return new OcrServiceClient(configuration);
      }
    }

    /// <summary>Creates service definition that can be registered with a server</summary>
    /// <param name="serviceImpl">An object implementing the server-side handling logic.</param>
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public static grpc::ServerServiceDefinition BindService(OcrServiceBase serviceImpl)
    {
      return grpc::ServerServiceDefinition.CreateBuilder()
          .AddMethod(__Method_OcrScanImage, serviceImpl.OcrScanImage)
          .AddMethod(__Method_GetTextAnnotation, serviceImpl.GetTextAnnotation)
          .AddMethod(__Method_GetTextAnnotations, serviceImpl.GetTextAnnotations).Build();
    }

    /// <summary>Register service method with a service binder with or without implementation. Useful when customizing the service binding logic.
    /// Note: this method is part of an experimental API that can change or be removed without any prior notice.</summary>
    /// <param name="serviceBinder">Service methods will be bound by calling <c>AddMethod</c> on this object.</param>
    /// <param name="serviceImpl">An object implementing the server-side handling logic.</param>
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public static void BindService(grpc::ServiceBinderBase serviceBinder, OcrServiceBase serviceImpl)
    {
      serviceBinder.AddMethod(__Method_OcrScanImage, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::Ssn.Ocrservice.V1.OcrScanImageRequest, global::Ssn.Ocrservice.V1.OcrScanImageResponse>(serviceImpl.OcrScanImage));
      serviceBinder.AddMethod(__Method_GetTextAnnotation, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::Ssn.Ocrservice.V1.GetTextAnnotationRequest, global::Ssn.Ocrservice.V1.GetTextAnnotationResponse>(serviceImpl.GetTextAnnotation));
      serviceBinder.AddMethod(__Method_GetTextAnnotations, serviceImpl == null ? null : new grpc::ServerStreamingServerMethod<global::Ssn.Ocrservice.V1.GetTextAnnotationRequest, global::Ssn.Ocrservice.V1.GetTextAnnotationResponse>(serviceImpl.GetTextAnnotations));
    }

  }
}
#endregion
