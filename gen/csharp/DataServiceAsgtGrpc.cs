// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: asgt/data/v1/data_service.proto
// </auto-generated>
#pragma warning disable 0414, 1591, 8981, 0612
#region Designer generated code

using grpc = global::Grpc.Core;

namespace Asgt.Dataservice.V1 {
  public static partial class DataService
  {
    static readonly string __ServiceName = "asgt.dataservice.v1.DataService";

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
    static readonly grpc::Marshaller<global::Asgt.Dataservice.V1.CreateRequest> __Marshaller_asgt_dataservice_v1_CreateRequest = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::Asgt.Dataservice.V1.CreateRequest.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::Google.Protobuf.WellKnownTypes.Empty> __Marshaller_google_protobuf_Empty = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::Google.Protobuf.WellKnownTypes.Empty.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::Asgt.Dataservice.V1.AppendDataRequest> __Marshaller_asgt_dataservice_v1_AppendDataRequest = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::Asgt.Dataservice.V1.AppendDataRequest.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::Asgt.Dataservice.V1.DeleteRequest> __Marshaller_asgt_dataservice_v1_DeleteRequest = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::Asgt.Dataservice.V1.DeleteRequest.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::Asgt.Dataservice.V1.GetInfoRequest> __Marshaller_asgt_dataservice_v1_GetInfoRequest = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::Asgt.Dataservice.V1.GetInfoRequest.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::Asgt.Dataservice.V1.GetInfoResponse> __Marshaller_asgt_dataservice_v1_GetInfoResponse = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::Asgt.Dataservice.V1.GetInfoResponse.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::Asgt.Dataservice.V1.UpdateDatasetRequest> __Marshaller_asgt_dataservice_v1_UpdateDatasetRequest = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::Asgt.Dataservice.V1.UpdateDatasetRequest.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::Asgt.Dataservice.V1.RegisterQueryStatsRequest> __Marshaller_asgt_dataservice_v1_RegisterQueryStatsRequest = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::Asgt.Dataservice.V1.RegisterQueryStatsRequest.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::Ssn.Dataservice.V1.CallsPerMonthResponse> __Marshaller_ssn_dataservice_v1_CallsPerMonthResponse = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::Ssn.Dataservice.V1.CallsPerMonthResponse.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::Asgt.Dataservice.V1.CalculateMetricsRequest> __Marshaller_asgt_dataservice_v1_CalculateMetricsRequest = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::Asgt.Dataservice.V1.CalculateMetricsRequest.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::Asgt.Dataservice.V1.CalculateMetricsResponse> __Marshaller_asgt_dataservice_v1_CalculateMetricsResponse = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::Asgt.Dataservice.V1.CalculateMetricsResponse.Parser));

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::Asgt.Dataservice.V1.CreateRequest, global::Google.Protobuf.WellKnownTypes.Empty> __Method_CreateDataset = new grpc::Method<global::Asgt.Dataservice.V1.CreateRequest, global::Google.Protobuf.WellKnownTypes.Empty>(
        grpc::MethodType.Unary,
        __ServiceName,
        "CreateDataset",
        __Marshaller_asgt_dataservice_v1_CreateRequest,
        __Marshaller_google_protobuf_Empty);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::Asgt.Dataservice.V1.AppendDataRequest, global::Google.Protobuf.WellKnownTypes.Empty> __Method_AppendData = new grpc::Method<global::Asgt.Dataservice.V1.AppendDataRequest, global::Google.Protobuf.WellKnownTypes.Empty>(
        grpc::MethodType.Unary,
        __ServiceName,
        "AppendData",
        __Marshaller_asgt_dataservice_v1_AppendDataRequest,
        __Marshaller_google_protobuf_Empty);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::Asgt.Dataservice.V1.DeleteRequest, global::Google.Protobuf.WellKnownTypes.Empty> __Method_DeleteData = new grpc::Method<global::Asgt.Dataservice.V1.DeleteRequest, global::Google.Protobuf.WellKnownTypes.Empty>(
        grpc::MethodType.Unary,
        __ServiceName,
        "DeleteData",
        __Marshaller_asgt_dataservice_v1_DeleteRequest,
        __Marshaller_google_protobuf_Empty);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::Asgt.Dataservice.V1.GetInfoRequest, global::Asgt.Dataservice.V1.GetInfoResponse> __Method_GetInfo = new grpc::Method<global::Asgt.Dataservice.V1.GetInfoRequest, global::Asgt.Dataservice.V1.GetInfoResponse>(
        grpc::MethodType.Unary,
        __ServiceName,
        "GetInfo",
        __Marshaller_asgt_dataservice_v1_GetInfoRequest,
        __Marshaller_asgt_dataservice_v1_GetInfoResponse);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::Asgt.Dataservice.V1.UpdateDatasetRequest, global::Google.Protobuf.WellKnownTypes.Empty> __Method_UpdateDataset = new grpc::Method<global::Asgt.Dataservice.V1.UpdateDatasetRequest, global::Google.Protobuf.WellKnownTypes.Empty>(
        grpc::MethodType.Unary,
        __ServiceName,
        "UpdateDataset",
        __Marshaller_asgt_dataservice_v1_UpdateDatasetRequest,
        __Marshaller_google_protobuf_Empty);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::Asgt.Dataservice.V1.RegisterQueryStatsRequest, global::Google.Protobuf.WellKnownTypes.Empty> __Method_RegisterQueryStats = new grpc::Method<global::Asgt.Dataservice.V1.RegisterQueryStatsRequest, global::Google.Protobuf.WellKnownTypes.Empty>(
        grpc::MethodType.Unary,
        __ServiceName,
        "RegisterQueryStats",
        __Marshaller_asgt_dataservice_v1_RegisterQueryStatsRequest,
        __Marshaller_google_protobuf_Empty);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::Google.Protobuf.WellKnownTypes.Empty, global::Ssn.Dataservice.V1.CallsPerMonthResponse> __Method_CallsPerMonthMetric = new grpc::Method<global::Google.Protobuf.WellKnownTypes.Empty, global::Ssn.Dataservice.V1.CallsPerMonthResponse>(
        grpc::MethodType.Unary,
        __ServiceName,
        "CallsPerMonthMetric",
        __Marshaller_google_protobuf_Empty,
        __Marshaller_ssn_dataservice_v1_CallsPerMonthResponse);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::Asgt.Dataservice.V1.CalculateMetricsRequest, global::Asgt.Dataservice.V1.CalculateMetricsResponse> __Method_CalculateMetrics = new grpc::Method<global::Asgt.Dataservice.V1.CalculateMetricsRequest, global::Asgt.Dataservice.V1.CalculateMetricsResponse>(
        grpc::MethodType.Unary,
        __ServiceName,
        "CalculateMetrics",
        __Marshaller_asgt_dataservice_v1_CalculateMetricsRequest,
        __Marshaller_asgt_dataservice_v1_CalculateMetricsResponse);

    /// <summary>Service descriptor</summary>
    public static global::Google.Protobuf.Reflection.ServiceDescriptor Descriptor
    {
      get { return global::Asgt.Dataservice.V1.DataServiceReflection.Descriptor.Services[0]; }
    }

    /// <summary>Base class for server-side implementations of DataService</summary>
    [grpc::BindServiceMethod(typeof(DataService), "BindService")]
    public abstract partial class DataServiceBase
    {
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::System.Threading.Tasks.Task<global::Google.Protobuf.WellKnownTypes.Empty> CreateDataset(global::Asgt.Dataservice.V1.CreateRequest request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::System.Threading.Tasks.Task<global::Google.Protobuf.WellKnownTypes.Empty> AppendData(global::Asgt.Dataservice.V1.AppendDataRequest request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::System.Threading.Tasks.Task<global::Google.Protobuf.WellKnownTypes.Empty> DeleteData(global::Asgt.Dataservice.V1.DeleteRequest request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::System.Threading.Tasks.Task<global::Asgt.Dataservice.V1.GetInfoResponse> GetInfo(global::Asgt.Dataservice.V1.GetInfoRequest request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::System.Threading.Tasks.Task<global::Google.Protobuf.WellKnownTypes.Empty> UpdateDataset(global::Asgt.Dataservice.V1.UpdateDatasetRequest request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::System.Threading.Tasks.Task<global::Google.Protobuf.WellKnownTypes.Empty> RegisterQueryStats(global::Asgt.Dataservice.V1.RegisterQueryStatsRequest request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::System.Threading.Tasks.Task<global::Ssn.Dataservice.V1.CallsPerMonthResponse> CallsPerMonthMetric(global::Google.Protobuf.WellKnownTypes.Empty request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::System.Threading.Tasks.Task<global::Asgt.Dataservice.V1.CalculateMetricsResponse> CalculateMetrics(global::Asgt.Dataservice.V1.CalculateMetricsRequest request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

    }

    /// <summary>Client for DataService</summary>
    public partial class DataServiceClient : grpc::ClientBase<DataServiceClient>
    {
      /// <summary>Creates a new client for DataService</summary>
      /// <param name="channel">The channel to use to make remote calls.</param>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public DataServiceClient(grpc::ChannelBase channel) : base(channel)
      {
      }
      /// <summary>Creates a new client for DataService that uses a custom <c>CallInvoker</c>.</summary>
      /// <param name="callInvoker">The callInvoker to use to make remote calls.</param>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public DataServiceClient(grpc::CallInvoker callInvoker) : base(callInvoker)
      {
      }
      /// <summary>Protected parameterless constructor to allow creation of test doubles.</summary>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      protected DataServiceClient() : base()
      {
      }
      /// <summary>Protected constructor to allow creation of configured clients.</summary>
      /// <param name="configuration">The client configuration.</param>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      protected DataServiceClient(ClientBaseConfiguration configuration) : base(configuration)
      {
      }

      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Google.Protobuf.WellKnownTypes.Empty CreateDataset(global::Asgt.Dataservice.V1.CreateRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return CreateDataset(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Google.Protobuf.WellKnownTypes.Empty CreateDataset(global::Asgt.Dataservice.V1.CreateRequest request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_CreateDataset, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Google.Protobuf.WellKnownTypes.Empty> CreateDatasetAsync(global::Asgt.Dataservice.V1.CreateRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return CreateDatasetAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Google.Protobuf.WellKnownTypes.Empty> CreateDatasetAsync(global::Asgt.Dataservice.V1.CreateRequest request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_CreateDataset, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Google.Protobuf.WellKnownTypes.Empty AppendData(global::Asgt.Dataservice.V1.AppendDataRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return AppendData(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Google.Protobuf.WellKnownTypes.Empty AppendData(global::Asgt.Dataservice.V1.AppendDataRequest request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_AppendData, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Google.Protobuf.WellKnownTypes.Empty> AppendDataAsync(global::Asgt.Dataservice.V1.AppendDataRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return AppendDataAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Google.Protobuf.WellKnownTypes.Empty> AppendDataAsync(global::Asgt.Dataservice.V1.AppendDataRequest request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_AppendData, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Google.Protobuf.WellKnownTypes.Empty DeleteData(global::Asgt.Dataservice.V1.DeleteRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return DeleteData(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Google.Protobuf.WellKnownTypes.Empty DeleteData(global::Asgt.Dataservice.V1.DeleteRequest request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_DeleteData, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Google.Protobuf.WellKnownTypes.Empty> DeleteDataAsync(global::Asgt.Dataservice.V1.DeleteRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return DeleteDataAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Google.Protobuf.WellKnownTypes.Empty> DeleteDataAsync(global::Asgt.Dataservice.V1.DeleteRequest request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_DeleteData, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Asgt.Dataservice.V1.GetInfoResponse GetInfo(global::Asgt.Dataservice.V1.GetInfoRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return GetInfo(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Asgt.Dataservice.V1.GetInfoResponse GetInfo(global::Asgt.Dataservice.V1.GetInfoRequest request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_GetInfo, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Asgt.Dataservice.V1.GetInfoResponse> GetInfoAsync(global::Asgt.Dataservice.V1.GetInfoRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return GetInfoAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Asgt.Dataservice.V1.GetInfoResponse> GetInfoAsync(global::Asgt.Dataservice.V1.GetInfoRequest request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_GetInfo, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Google.Protobuf.WellKnownTypes.Empty UpdateDataset(global::Asgt.Dataservice.V1.UpdateDatasetRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return UpdateDataset(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Google.Protobuf.WellKnownTypes.Empty UpdateDataset(global::Asgt.Dataservice.V1.UpdateDatasetRequest request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_UpdateDataset, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Google.Protobuf.WellKnownTypes.Empty> UpdateDatasetAsync(global::Asgt.Dataservice.V1.UpdateDatasetRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return UpdateDatasetAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Google.Protobuf.WellKnownTypes.Empty> UpdateDatasetAsync(global::Asgt.Dataservice.V1.UpdateDatasetRequest request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_UpdateDataset, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Google.Protobuf.WellKnownTypes.Empty RegisterQueryStats(global::Asgt.Dataservice.V1.RegisterQueryStatsRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return RegisterQueryStats(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Google.Protobuf.WellKnownTypes.Empty RegisterQueryStats(global::Asgt.Dataservice.V1.RegisterQueryStatsRequest request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_RegisterQueryStats, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Google.Protobuf.WellKnownTypes.Empty> RegisterQueryStatsAsync(global::Asgt.Dataservice.V1.RegisterQueryStatsRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return RegisterQueryStatsAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Google.Protobuf.WellKnownTypes.Empty> RegisterQueryStatsAsync(global::Asgt.Dataservice.V1.RegisterQueryStatsRequest request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_RegisterQueryStats, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Ssn.Dataservice.V1.CallsPerMonthResponse CallsPerMonthMetric(global::Google.Protobuf.WellKnownTypes.Empty request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return CallsPerMonthMetric(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Ssn.Dataservice.V1.CallsPerMonthResponse CallsPerMonthMetric(global::Google.Protobuf.WellKnownTypes.Empty request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_CallsPerMonthMetric, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Ssn.Dataservice.V1.CallsPerMonthResponse> CallsPerMonthMetricAsync(global::Google.Protobuf.WellKnownTypes.Empty request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return CallsPerMonthMetricAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Ssn.Dataservice.V1.CallsPerMonthResponse> CallsPerMonthMetricAsync(global::Google.Protobuf.WellKnownTypes.Empty request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_CallsPerMonthMetric, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Asgt.Dataservice.V1.CalculateMetricsResponse CalculateMetrics(global::Asgt.Dataservice.V1.CalculateMetricsRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return CalculateMetrics(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Asgt.Dataservice.V1.CalculateMetricsResponse CalculateMetrics(global::Asgt.Dataservice.V1.CalculateMetricsRequest request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_CalculateMetrics, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Asgt.Dataservice.V1.CalculateMetricsResponse> CalculateMetricsAsync(global::Asgt.Dataservice.V1.CalculateMetricsRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return CalculateMetricsAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Asgt.Dataservice.V1.CalculateMetricsResponse> CalculateMetricsAsync(global::Asgt.Dataservice.V1.CalculateMetricsRequest request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_CalculateMetrics, null, options, request);
      }
      /// <summary>Creates a new instance of client from given <c>ClientBaseConfiguration</c>.</summary>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      protected override DataServiceClient NewInstance(ClientBaseConfiguration configuration)
      {
        return new DataServiceClient(configuration);
      }
    }

    /// <summary>Creates service definition that can be registered with a server</summary>
    /// <param name="serviceImpl">An object implementing the server-side handling logic.</param>
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public static grpc::ServerServiceDefinition BindService(DataServiceBase serviceImpl)
    {
      return grpc::ServerServiceDefinition.CreateBuilder()
          .AddMethod(__Method_CreateDataset, serviceImpl.CreateDataset)
          .AddMethod(__Method_AppendData, serviceImpl.AppendData)
          .AddMethod(__Method_DeleteData, serviceImpl.DeleteData)
          .AddMethod(__Method_GetInfo, serviceImpl.GetInfo)
          .AddMethod(__Method_UpdateDataset, serviceImpl.UpdateDataset)
          .AddMethod(__Method_RegisterQueryStats, serviceImpl.RegisterQueryStats)
          .AddMethod(__Method_CallsPerMonthMetric, serviceImpl.CallsPerMonthMetric)
          .AddMethod(__Method_CalculateMetrics, serviceImpl.CalculateMetrics).Build();
    }

    /// <summary>Register service method with a service binder with or without implementation. Useful when customizing the service binding logic.
    /// Note: this method is part of an experimental API that can change or be removed without any prior notice.</summary>
    /// <param name="serviceBinder">Service methods will be bound by calling <c>AddMethod</c> on this object.</param>
    /// <param name="serviceImpl">An object implementing the server-side handling logic.</param>
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public static void BindService(grpc::ServiceBinderBase serviceBinder, DataServiceBase serviceImpl)
    {
      serviceBinder.AddMethod(__Method_CreateDataset, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::Asgt.Dataservice.V1.CreateRequest, global::Google.Protobuf.WellKnownTypes.Empty>(serviceImpl.CreateDataset));
      serviceBinder.AddMethod(__Method_AppendData, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::Asgt.Dataservice.V1.AppendDataRequest, global::Google.Protobuf.WellKnownTypes.Empty>(serviceImpl.AppendData));
      serviceBinder.AddMethod(__Method_DeleteData, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::Asgt.Dataservice.V1.DeleteRequest, global::Google.Protobuf.WellKnownTypes.Empty>(serviceImpl.DeleteData));
      serviceBinder.AddMethod(__Method_GetInfo, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::Asgt.Dataservice.V1.GetInfoRequest, global::Asgt.Dataservice.V1.GetInfoResponse>(serviceImpl.GetInfo));
      serviceBinder.AddMethod(__Method_UpdateDataset, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::Asgt.Dataservice.V1.UpdateDatasetRequest, global::Google.Protobuf.WellKnownTypes.Empty>(serviceImpl.UpdateDataset));
      serviceBinder.AddMethod(__Method_RegisterQueryStats, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::Asgt.Dataservice.V1.RegisterQueryStatsRequest, global::Google.Protobuf.WellKnownTypes.Empty>(serviceImpl.RegisterQueryStats));
      serviceBinder.AddMethod(__Method_CallsPerMonthMetric, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::Google.Protobuf.WellKnownTypes.Empty, global::Ssn.Dataservice.V1.CallsPerMonthResponse>(serviceImpl.CallsPerMonthMetric));
      serviceBinder.AddMethod(__Method_CalculateMetrics, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::Asgt.Dataservice.V1.CalculateMetricsRequest, global::Asgt.Dataservice.V1.CalculateMetricsResponse>(serviceImpl.CalculateMetrics));
    }

  }
}
#endregion
