/**
 * @fileoverview gRPC-Web generated client stub for asgt.dataservice.v1
 * @enhanceable
 * @public
 */

// GENERATED CODE -- DO NOT EDIT!



const grpc = {};
grpc.web = require('grpc-web');


var asgt_type_dataset_pb = require('../../../asgt/type/dataset_pb.js')

var asgt_type_model_pb = require('../../../asgt/type/model_pb.js')

var asgt_type_retention_policy_pb = require('../../../asgt/type/retention_policy_pb.js')

var asgt_type_sample_pb = require('../../../asgt/type/sample_pb.js')

var google_api_annotations_pb = require('../../../google/api/annotations_pb.js')

var google_protobuf_empty_pb = require('google-protobuf/google/protobuf/empty_pb.js')

var google_protobuf_wrappers_pb = require('google-protobuf/google/protobuf/wrappers_pb.js')

var ssn_dataservice_v1_dataservice_pb = require('../../../ssn/dataservice/v1/dataservice_pb.js')
const proto = {};
proto.asgt = {};
proto.asgt.dataservice = {};
proto.asgt.dataservice.v1 = require('./data_service_pb.js');

/**
 * @param {string} hostname
 * @param {?Object} credentials
 * @param {?Object} options
 * @constructor
 * @struct
 * @final
 */
proto.asgt.dataservice.v1.DataServiceClient =
    function(hostname, credentials, options) {
  if (!options) options = {};
  options['format'] = 'text';

  /**
   * @private @const {!grpc.web.GrpcWebClientBase} The client
   */
  this.client_ = new grpc.web.GrpcWebClientBase(options);

  /**
   * @private @const {string} The hostname
   */
  this.hostname_ = hostname;

};


/**
 * @param {string} hostname
 * @param {?Object} credentials
 * @param {?Object} options
 * @constructor
 * @struct
 * @final
 */
proto.asgt.dataservice.v1.DataServicePromiseClient =
    function(hostname, credentials, options) {
  if (!options) options = {};
  options['format'] = 'text';

  /**
   * @private @const {!grpc.web.GrpcWebClientBase} The client
   */
  this.client_ = new grpc.web.GrpcWebClientBase(options);

  /**
   * @private @const {string} The hostname
   */
  this.hostname_ = hostname;

};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.asgt.dataservice.v1.CreateRequest,
 *   !proto.google.protobuf.Empty>}
 */
const methodDescriptor_DataService_CreateDataset = new grpc.web.MethodDescriptor(
  '/asgt.dataservice.v1.DataService/CreateDataset',
  grpc.web.MethodType.UNARY,
  proto.asgt.dataservice.v1.CreateRequest,
  google_protobuf_empty_pb.Empty,
  /**
   * @param {!proto.asgt.dataservice.v1.CreateRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  google_protobuf_empty_pb.Empty.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.asgt.dataservice.v1.CreateRequest,
 *   !proto.google.protobuf.Empty>}
 */
const methodInfo_DataService_CreateDataset = new grpc.web.AbstractClientBase.MethodInfo(
  google_protobuf_empty_pb.Empty,
  /**
   * @param {!proto.asgt.dataservice.v1.CreateRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  google_protobuf_empty_pb.Empty.deserializeBinary
);


/**
 * @param {!proto.asgt.dataservice.v1.CreateRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.google.protobuf.Empty)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.google.protobuf.Empty>|undefined}
 *     The XHR Node Readable Stream
 */
proto.asgt.dataservice.v1.DataServiceClient.prototype.createDataset =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/asgt.dataservice.v1.DataService/CreateDataset',
      request,
      metadata || {},
      methodDescriptor_DataService_CreateDataset,
      callback);
};


/**
 * @param {!proto.asgt.dataservice.v1.CreateRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.google.protobuf.Empty>}
 *     A native promise that resolves to the response
 */
proto.asgt.dataservice.v1.DataServicePromiseClient.prototype.createDataset =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/asgt.dataservice.v1.DataService/CreateDataset',
      request,
      metadata || {},
      methodDescriptor_DataService_CreateDataset);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.asgt.dataservice.v1.AppendDataRequest,
 *   !proto.google.protobuf.Empty>}
 */
const methodDescriptor_DataService_AppendData = new grpc.web.MethodDescriptor(
  '/asgt.dataservice.v1.DataService/AppendData',
  grpc.web.MethodType.UNARY,
  proto.asgt.dataservice.v1.AppendDataRequest,
  google_protobuf_empty_pb.Empty,
  /**
   * @param {!proto.asgt.dataservice.v1.AppendDataRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  google_protobuf_empty_pb.Empty.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.asgt.dataservice.v1.AppendDataRequest,
 *   !proto.google.protobuf.Empty>}
 */
const methodInfo_DataService_AppendData = new grpc.web.AbstractClientBase.MethodInfo(
  google_protobuf_empty_pb.Empty,
  /**
   * @param {!proto.asgt.dataservice.v1.AppendDataRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  google_protobuf_empty_pb.Empty.deserializeBinary
);


/**
 * @param {!proto.asgt.dataservice.v1.AppendDataRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.google.protobuf.Empty)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.google.protobuf.Empty>|undefined}
 *     The XHR Node Readable Stream
 */
proto.asgt.dataservice.v1.DataServiceClient.prototype.appendData =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/asgt.dataservice.v1.DataService/AppendData',
      request,
      metadata || {},
      methodDescriptor_DataService_AppendData,
      callback);
};


/**
 * @param {!proto.asgt.dataservice.v1.AppendDataRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.google.protobuf.Empty>}
 *     A native promise that resolves to the response
 */
proto.asgt.dataservice.v1.DataServicePromiseClient.prototype.appendData =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/asgt.dataservice.v1.DataService/AppendData',
      request,
      metadata || {},
      methodDescriptor_DataService_AppendData);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.asgt.dataservice.v1.DeleteRequest,
 *   !proto.google.protobuf.Empty>}
 */
const methodDescriptor_DataService_DeleteData = new grpc.web.MethodDescriptor(
  '/asgt.dataservice.v1.DataService/DeleteData',
  grpc.web.MethodType.UNARY,
  proto.asgt.dataservice.v1.DeleteRequest,
  google_protobuf_empty_pb.Empty,
  /**
   * @param {!proto.asgt.dataservice.v1.DeleteRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  google_protobuf_empty_pb.Empty.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.asgt.dataservice.v1.DeleteRequest,
 *   !proto.google.protobuf.Empty>}
 */
const methodInfo_DataService_DeleteData = new grpc.web.AbstractClientBase.MethodInfo(
  google_protobuf_empty_pb.Empty,
  /**
   * @param {!proto.asgt.dataservice.v1.DeleteRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  google_protobuf_empty_pb.Empty.deserializeBinary
);


/**
 * @param {!proto.asgt.dataservice.v1.DeleteRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.google.protobuf.Empty)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.google.protobuf.Empty>|undefined}
 *     The XHR Node Readable Stream
 */
proto.asgt.dataservice.v1.DataServiceClient.prototype.deleteData =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/asgt.dataservice.v1.DataService/DeleteData',
      request,
      metadata || {},
      methodDescriptor_DataService_DeleteData,
      callback);
};


/**
 * @param {!proto.asgt.dataservice.v1.DeleteRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.google.protobuf.Empty>}
 *     A native promise that resolves to the response
 */
proto.asgt.dataservice.v1.DataServicePromiseClient.prototype.deleteData =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/asgt.dataservice.v1.DataService/DeleteData',
      request,
      metadata || {},
      methodDescriptor_DataService_DeleteData);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.asgt.dataservice.v1.GetInfoRequest,
 *   !proto.asgt.dataservice.v1.GetInfoResponse>}
 */
const methodDescriptor_DataService_GetInfo = new grpc.web.MethodDescriptor(
  '/asgt.dataservice.v1.DataService/GetInfo',
  grpc.web.MethodType.UNARY,
  proto.asgt.dataservice.v1.GetInfoRequest,
  proto.asgt.dataservice.v1.GetInfoResponse,
  /**
   * @param {!proto.asgt.dataservice.v1.GetInfoRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.asgt.dataservice.v1.GetInfoResponse.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.asgt.dataservice.v1.GetInfoRequest,
 *   !proto.asgt.dataservice.v1.GetInfoResponse>}
 */
const methodInfo_DataService_GetInfo = new grpc.web.AbstractClientBase.MethodInfo(
  proto.asgt.dataservice.v1.GetInfoResponse,
  /**
   * @param {!proto.asgt.dataservice.v1.GetInfoRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.asgt.dataservice.v1.GetInfoResponse.deserializeBinary
);


/**
 * @param {!proto.asgt.dataservice.v1.GetInfoRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.asgt.dataservice.v1.GetInfoResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.asgt.dataservice.v1.GetInfoResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.asgt.dataservice.v1.DataServiceClient.prototype.getInfo =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/asgt.dataservice.v1.DataService/GetInfo',
      request,
      metadata || {},
      methodDescriptor_DataService_GetInfo,
      callback);
};


/**
 * @param {!proto.asgt.dataservice.v1.GetInfoRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.asgt.dataservice.v1.GetInfoResponse>}
 *     A native promise that resolves to the response
 */
proto.asgt.dataservice.v1.DataServicePromiseClient.prototype.getInfo =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/asgt.dataservice.v1.DataService/GetInfo',
      request,
      metadata || {},
      methodDescriptor_DataService_GetInfo);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.asgt.dataservice.v1.UpdateDatasetRequest,
 *   !proto.google.protobuf.Empty>}
 */
const methodDescriptor_DataService_UpdateDataset = new grpc.web.MethodDescriptor(
  '/asgt.dataservice.v1.DataService/UpdateDataset',
  grpc.web.MethodType.UNARY,
  proto.asgt.dataservice.v1.UpdateDatasetRequest,
  google_protobuf_empty_pb.Empty,
  /**
   * @param {!proto.asgt.dataservice.v1.UpdateDatasetRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  google_protobuf_empty_pb.Empty.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.asgt.dataservice.v1.UpdateDatasetRequest,
 *   !proto.google.protobuf.Empty>}
 */
const methodInfo_DataService_UpdateDataset = new grpc.web.AbstractClientBase.MethodInfo(
  google_protobuf_empty_pb.Empty,
  /**
   * @param {!proto.asgt.dataservice.v1.UpdateDatasetRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  google_protobuf_empty_pb.Empty.deserializeBinary
);


/**
 * @param {!proto.asgt.dataservice.v1.UpdateDatasetRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.google.protobuf.Empty)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.google.protobuf.Empty>|undefined}
 *     The XHR Node Readable Stream
 */
proto.asgt.dataservice.v1.DataServiceClient.prototype.updateDataset =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/asgt.dataservice.v1.DataService/UpdateDataset',
      request,
      metadata || {},
      methodDescriptor_DataService_UpdateDataset,
      callback);
};


/**
 * @param {!proto.asgt.dataservice.v1.UpdateDatasetRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.google.protobuf.Empty>}
 *     A native promise that resolves to the response
 */
proto.asgt.dataservice.v1.DataServicePromiseClient.prototype.updateDataset =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/asgt.dataservice.v1.DataService/UpdateDataset',
      request,
      metadata || {},
      methodDescriptor_DataService_UpdateDataset);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.asgt.dataservice.v1.RegisterQueryStatsRequest,
 *   !proto.google.protobuf.Empty>}
 */
const methodDescriptor_DataService_RegisterQueryStats = new grpc.web.MethodDescriptor(
  '/asgt.dataservice.v1.DataService/RegisterQueryStats',
  grpc.web.MethodType.UNARY,
  proto.asgt.dataservice.v1.RegisterQueryStatsRequest,
  google_protobuf_empty_pb.Empty,
  /**
   * @param {!proto.asgt.dataservice.v1.RegisterQueryStatsRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  google_protobuf_empty_pb.Empty.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.asgt.dataservice.v1.RegisterQueryStatsRequest,
 *   !proto.google.protobuf.Empty>}
 */
const methodInfo_DataService_RegisterQueryStats = new grpc.web.AbstractClientBase.MethodInfo(
  google_protobuf_empty_pb.Empty,
  /**
   * @param {!proto.asgt.dataservice.v1.RegisterQueryStatsRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  google_protobuf_empty_pb.Empty.deserializeBinary
);


/**
 * @param {!proto.asgt.dataservice.v1.RegisterQueryStatsRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.google.protobuf.Empty)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.google.protobuf.Empty>|undefined}
 *     The XHR Node Readable Stream
 */
proto.asgt.dataservice.v1.DataServiceClient.prototype.registerQueryStats =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/asgt.dataservice.v1.DataService/RegisterQueryStats',
      request,
      metadata || {},
      methodDescriptor_DataService_RegisterQueryStats,
      callback);
};


/**
 * @param {!proto.asgt.dataservice.v1.RegisterQueryStatsRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.google.protobuf.Empty>}
 *     A native promise that resolves to the response
 */
proto.asgt.dataservice.v1.DataServicePromiseClient.prototype.registerQueryStats =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/asgt.dataservice.v1.DataService/RegisterQueryStats',
      request,
      metadata || {},
      methodDescriptor_DataService_RegisterQueryStats);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.google.protobuf.Empty,
 *   !proto.ssn.dataservice.v1.CallsPerMonthResponse>}
 */
const methodDescriptor_DataService_CallsPerMonthMetric = new grpc.web.MethodDescriptor(
  '/asgt.dataservice.v1.DataService/CallsPerMonthMetric',
  grpc.web.MethodType.UNARY,
  google_protobuf_empty_pb.Empty,
  ssn_dataservice_v1_dataservice_pb.CallsPerMonthResponse,
  /**
   * @param {!proto.google.protobuf.Empty} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  ssn_dataservice_v1_dataservice_pb.CallsPerMonthResponse.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.google.protobuf.Empty,
 *   !proto.ssn.dataservice.v1.CallsPerMonthResponse>}
 */
const methodInfo_DataService_CallsPerMonthMetric = new grpc.web.AbstractClientBase.MethodInfo(
  ssn_dataservice_v1_dataservice_pb.CallsPerMonthResponse,
  /**
   * @param {!proto.google.protobuf.Empty} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  ssn_dataservice_v1_dataservice_pb.CallsPerMonthResponse.deserializeBinary
);


/**
 * @param {!proto.google.protobuf.Empty} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.ssn.dataservice.v1.CallsPerMonthResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.ssn.dataservice.v1.CallsPerMonthResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.asgt.dataservice.v1.DataServiceClient.prototype.callsPerMonthMetric =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/asgt.dataservice.v1.DataService/CallsPerMonthMetric',
      request,
      metadata || {},
      methodDescriptor_DataService_CallsPerMonthMetric,
      callback);
};


/**
 * @param {!proto.google.protobuf.Empty} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.ssn.dataservice.v1.CallsPerMonthResponse>}
 *     A native promise that resolves to the response
 */
proto.asgt.dataservice.v1.DataServicePromiseClient.prototype.callsPerMonthMetric =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/asgt.dataservice.v1.DataService/CallsPerMonthMetric',
      request,
      metadata || {},
      methodDescriptor_DataService_CallsPerMonthMetric);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.asgt.dataservice.v1.CalculateMetricsRequest,
 *   !proto.asgt.dataservice.v1.CalculateMetricsResponse>}
 */
const methodDescriptor_DataService_CalculateMetrics = new grpc.web.MethodDescriptor(
  '/asgt.dataservice.v1.DataService/CalculateMetrics',
  grpc.web.MethodType.UNARY,
  proto.asgt.dataservice.v1.CalculateMetricsRequest,
  proto.asgt.dataservice.v1.CalculateMetricsResponse,
  /**
   * @param {!proto.asgt.dataservice.v1.CalculateMetricsRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.asgt.dataservice.v1.CalculateMetricsResponse.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.asgt.dataservice.v1.CalculateMetricsRequest,
 *   !proto.asgt.dataservice.v1.CalculateMetricsResponse>}
 */
const methodInfo_DataService_CalculateMetrics = new grpc.web.AbstractClientBase.MethodInfo(
  proto.asgt.dataservice.v1.CalculateMetricsResponse,
  /**
   * @param {!proto.asgt.dataservice.v1.CalculateMetricsRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.asgt.dataservice.v1.CalculateMetricsResponse.deserializeBinary
);


/**
 * @param {!proto.asgt.dataservice.v1.CalculateMetricsRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.asgt.dataservice.v1.CalculateMetricsResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.asgt.dataservice.v1.CalculateMetricsResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.asgt.dataservice.v1.DataServiceClient.prototype.calculateMetrics =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/asgt.dataservice.v1.DataService/CalculateMetrics',
      request,
      metadata || {},
      methodDescriptor_DataService_CalculateMetrics,
      callback);
};


/**
 * @param {!proto.asgt.dataservice.v1.CalculateMetricsRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.asgt.dataservice.v1.CalculateMetricsResponse>}
 *     A native promise that resolves to the response
 */
proto.asgt.dataservice.v1.DataServicePromiseClient.prototype.calculateMetrics =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/asgt.dataservice.v1.DataService/CalculateMetrics',
      request,
      metadata || {},
      methodDescriptor_DataService_CalculateMetrics);
};


module.exports = proto.asgt.dataservice.v1;

