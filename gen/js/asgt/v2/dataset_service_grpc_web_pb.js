/**
 * @fileoverview gRPC-Web generated client stub for asgt.v2
 * @enhanceable
 * @public
 */

// Code generated by protoc-gen-grpc-web. DO NOT EDIT.
// versions:
// 	protoc-gen-grpc-web v1.4.2
// 	protoc              v0.0.0
// source: asgt/v2/dataset_service.proto


/* eslint-disable */
// @ts-nocheck



const grpc = {};
grpc.web = require('grpc-web');


var asgt_type_dataset_pb = require('../../asgt/type/dataset_pb.js')

var asgt_v2_type_example_pb = require('../../asgt/v2/type/example_pb.js')

var asgt_v2_type_training_pb = require('../../asgt/v2/type/training_pb.js')

var google_api_annotations_pb = require('../../google/api/annotations_pb.js')

var google_protobuf_empty_pb = require('google-protobuf/google/protobuf/empty_pb.js')

var protoc$gen$openapiv2_options_annotations_pb = require('../../protoc-gen-openapiv2/options/annotations_pb.js')

var validate_validate_pb = require('../../validate/validate_pb.js')
const proto = {};
proto.asgt = {};
proto.asgt.v2 = require('./dataset_service_pb.js');

/**
 * @param {string} hostname
 * @param {?Object} credentials
 * @param {?grpc.web.ClientOptions} options
 * @constructor
 * @struct
 * @final
 */
proto.asgt.v2.DatasetServiceClient =
    function(hostname, credentials, options) {
  if (!options) options = {};
  options.format = 'text';

  /**
   * @private @const {!grpc.web.GrpcWebClientBase} The client
   */
  this.client_ = new grpc.web.GrpcWebClientBase(options);

  /**
   * @private @const {string} The hostname
   */
  this.hostname_ = hostname.replace(/\/+$/, '');

};


/**
 * @param {string} hostname
 * @param {?Object} credentials
 * @param {?grpc.web.ClientOptions} options
 * @constructor
 * @struct
 * @final
 */
proto.asgt.v2.DatasetServicePromiseClient =
    function(hostname, credentials, options) {
  if (!options) options = {};
  options.format = 'text';

  /**
   * @private @const {!grpc.web.GrpcWebClientBase} The client
   */
  this.client_ = new grpc.web.GrpcWebClientBase(options);

  /**
   * @private @const {string} The hostname
   */
  this.hostname_ = hostname.replace(/\/+$/, '');

};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.asgt.v2.GetDatasetRequest,
 *   !proto.asgt.type.Dataset>}
 */
const methodDescriptor_DatasetService_GetDataset = new grpc.web.MethodDescriptor(
  '/asgt.v2.DatasetService/GetDataset',
  grpc.web.MethodType.UNARY,
  proto.asgt.v2.GetDatasetRequest,
  asgt_type_dataset_pb.Dataset,
  /**
   * @param {!proto.asgt.v2.GetDatasetRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  asgt_type_dataset_pb.Dataset.deserializeBinary
);


/**
 * @param {!proto.asgt.v2.GetDatasetRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.RpcError, ?proto.asgt.type.Dataset)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.asgt.type.Dataset>|undefined}
 *     The XHR Node Readable Stream
 */
proto.asgt.v2.DatasetServiceClient.prototype.getDataset =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/asgt.v2.DatasetService/GetDataset',
      request,
      metadata || {},
      methodDescriptor_DatasetService_GetDataset,
      callback);
};


/**
 * @param {!proto.asgt.v2.GetDatasetRequest} request The
 *     request proto
 * @param {?Object<string, string>=} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.asgt.type.Dataset>}
 *     Promise that resolves to the response
 */
proto.asgt.v2.DatasetServicePromiseClient.prototype.getDataset =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/asgt.v2.DatasetService/GetDataset',
      request,
      metadata || {},
      methodDescriptor_DatasetService_GetDataset);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.asgt.v2.CreateDatasetRequest,
 *   !proto.google.protobuf.Empty>}
 */
const methodDescriptor_DatasetService_CreateDataset = new grpc.web.MethodDescriptor(
  '/asgt.v2.DatasetService/CreateDataset',
  grpc.web.MethodType.UNARY,
  proto.asgt.v2.CreateDatasetRequest,
  google_protobuf_empty_pb.Empty,
  /**
   * @param {!proto.asgt.v2.CreateDatasetRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  google_protobuf_empty_pb.Empty.deserializeBinary
);


/**
 * @param {!proto.asgt.v2.CreateDatasetRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.RpcError, ?proto.google.protobuf.Empty)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.google.protobuf.Empty>|undefined}
 *     The XHR Node Readable Stream
 */
proto.asgt.v2.DatasetServiceClient.prototype.createDataset =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/asgt.v2.DatasetService/CreateDataset',
      request,
      metadata || {},
      methodDescriptor_DatasetService_CreateDataset,
      callback);
};


/**
 * @param {!proto.asgt.v2.CreateDatasetRequest} request The
 *     request proto
 * @param {?Object<string, string>=} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.google.protobuf.Empty>}
 *     Promise that resolves to the response
 */
proto.asgt.v2.DatasetServicePromiseClient.prototype.createDataset =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/asgt.v2.DatasetService/CreateDataset',
      request,
      metadata || {},
      methodDescriptor_DatasetService_CreateDataset);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.asgt.v2.CreateOrUpdateDatasetRequest,
 *   !proto.google.protobuf.Empty>}
 */
const methodDescriptor_DatasetService_CreateOrUpdateDataset = new grpc.web.MethodDescriptor(
  '/asgt.v2.DatasetService/CreateOrUpdateDataset',
  grpc.web.MethodType.UNARY,
  proto.asgt.v2.CreateOrUpdateDatasetRequest,
  google_protobuf_empty_pb.Empty,
  /**
   * @param {!proto.asgt.v2.CreateOrUpdateDatasetRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  google_protobuf_empty_pb.Empty.deserializeBinary
);


/**
 * @param {!proto.asgt.v2.CreateOrUpdateDatasetRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.RpcError, ?proto.google.protobuf.Empty)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.google.protobuf.Empty>|undefined}
 *     The XHR Node Readable Stream
 */
proto.asgt.v2.DatasetServiceClient.prototype.createOrUpdateDataset =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/asgt.v2.DatasetService/CreateOrUpdateDataset',
      request,
      metadata || {},
      methodDescriptor_DatasetService_CreateOrUpdateDataset,
      callback);
};


/**
 * @param {!proto.asgt.v2.CreateOrUpdateDatasetRequest} request The
 *     request proto
 * @param {?Object<string, string>=} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.google.protobuf.Empty>}
 *     Promise that resolves to the response
 */
proto.asgt.v2.DatasetServicePromiseClient.prototype.createOrUpdateDataset =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/asgt.v2.DatasetService/CreateOrUpdateDataset',
      request,
      metadata || {},
      methodDescriptor_DatasetService_CreateOrUpdateDataset);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.asgt.v2.DeleteDatasetRequest,
 *   !proto.asgt.type.Dataset>}
 */
const methodDescriptor_DatasetService_DeleteDataset = new grpc.web.MethodDescriptor(
  '/asgt.v2.DatasetService/DeleteDataset',
  grpc.web.MethodType.UNARY,
  proto.asgt.v2.DeleteDatasetRequest,
  asgt_type_dataset_pb.Dataset,
  /**
   * @param {!proto.asgt.v2.DeleteDatasetRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  asgt_type_dataset_pb.Dataset.deserializeBinary
);


/**
 * @param {!proto.asgt.v2.DeleteDatasetRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.RpcError, ?proto.asgt.type.Dataset)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.asgt.type.Dataset>|undefined}
 *     The XHR Node Readable Stream
 */
proto.asgt.v2.DatasetServiceClient.prototype.deleteDataset =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/asgt.v2.DatasetService/DeleteDataset',
      request,
      metadata || {},
      methodDescriptor_DatasetService_DeleteDataset,
      callback);
};


/**
 * @param {!proto.asgt.v2.DeleteDatasetRequest} request The
 *     request proto
 * @param {?Object<string, string>=} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.asgt.type.Dataset>}
 *     Promise that resolves to the response
 */
proto.asgt.v2.DatasetServicePromiseClient.prototype.deleteDataset =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/asgt.v2.DatasetService/DeleteDataset',
      request,
      metadata || {},
      methodDescriptor_DatasetService_DeleteDataset);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.asgt.v2.DeleteTagRequest,
 *   !proto.google.protobuf.Empty>}
 */
const methodDescriptor_DatasetService_DeleteTag = new grpc.web.MethodDescriptor(
  '/asgt.v2.DatasetService/DeleteTag',
  grpc.web.MethodType.UNARY,
  proto.asgt.v2.DeleteTagRequest,
  google_protobuf_empty_pb.Empty,
  /**
   * @param {!proto.asgt.v2.DeleteTagRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  google_protobuf_empty_pb.Empty.deserializeBinary
);


/**
 * @param {!proto.asgt.v2.DeleteTagRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.RpcError, ?proto.google.protobuf.Empty)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.google.protobuf.Empty>|undefined}
 *     The XHR Node Readable Stream
 */
proto.asgt.v2.DatasetServiceClient.prototype.deleteTag =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/asgt.v2.DatasetService/DeleteTag',
      request,
      metadata || {},
      methodDescriptor_DatasetService_DeleteTag,
      callback);
};


/**
 * @param {!proto.asgt.v2.DeleteTagRequest} request The
 *     request proto
 * @param {?Object<string, string>=} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.google.protobuf.Empty>}
 *     Promise that resolves to the response
 */
proto.asgt.v2.DatasetServicePromiseClient.prototype.deleteTag =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/asgt.v2.DatasetService/DeleteTag',
      request,
      metadata || {},
      methodDescriptor_DatasetService_DeleteTag);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.asgt.v2.CreateExampleRequest,
 *   !proto.google.protobuf.Empty>}
 */
const methodDescriptor_DatasetService_CreateExample = new grpc.web.MethodDescriptor(
  '/asgt.v2.DatasetService/CreateExample',
  grpc.web.MethodType.UNARY,
  proto.asgt.v2.CreateExampleRequest,
  google_protobuf_empty_pb.Empty,
  /**
   * @param {!proto.asgt.v2.CreateExampleRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  google_protobuf_empty_pb.Empty.deserializeBinary
);


/**
 * @param {!proto.asgt.v2.CreateExampleRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.RpcError, ?proto.google.protobuf.Empty)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.google.protobuf.Empty>|undefined}
 *     The XHR Node Readable Stream
 */
proto.asgt.v2.DatasetServiceClient.prototype.createExample =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/asgt.v2.DatasetService/CreateExample',
      request,
      metadata || {},
      methodDescriptor_DatasetService_CreateExample,
      callback);
};


/**
 * @param {!proto.asgt.v2.CreateExampleRequest} request The
 *     request proto
 * @param {?Object<string, string>=} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.google.protobuf.Empty>}
 *     Promise that resolves to the response
 */
proto.asgt.v2.DatasetServicePromiseClient.prototype.createExample =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/asgt.v2.DatasetService/CreateExample',
      request,
      metadata || {},
      methodDescriptor_DatasetService_CreateExample);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.asgt.v2.CreateOrUpdateExampleRequest,
 *   !proto.google.protobuf.Empty>}
 */
const methodDescriptor_DatasetService_CreateOrUpdateExample = new grpc.web.MethodDescriptor(
  '/asgt.v2.DatasetService/CreateOrUpdateExample',
  grpc.web.MethodType.UNARY,
  proto.asgt.v2.CreateOrUpdateExampleRequest,
  google_protobuf_empty_pb.Empty,
  /**
   * @param {!proto.asgt.v2.CreateOrUpdateExampleRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  google_protobuf_empty_pb.Empty.deserializeBinary
);


/**
 * @param {!proto.asgt.v2.CreateOrUpdateExampleRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.RpcError, ?proto.google.protobuf.Empty)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.google.protobuf.Empty>|undefined}
 *     The XHR Node Readable Stream
 */
proto.asgt.v2.DatasetServiceClient.prototype.createOrUpdateExample =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/asgt.v2.DatasetService/CreateOrUpdateExample',
      request,
      metadata || {},
      methodDescriptor_DatasetService_CreateOrUpdateExample,
      callback);
};


/**
 * @param {!proto.asgt.v2.CreateOrUpdateExampleRequest} request The
 *     request proto
 * @param {?Object<string, string>=} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.google.protobuf.Empty>}
 *     Promise that resolves to the response
 */
proto.asgt.v2.DatasetServicePromiseClient.prototype.createOrUpdateExample =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/asgt.v2.DatasetService/CreateOrUpdateExample',
      request,
      metadata || {},
      methodDescriptor_DatasetService_CreateOrUpdateExample);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.asgt.v2.BatchCreateExampleRequest,
 *   !proto.google.protobuf.Empty>}
 */
const methodDescriptor_DatasetService_BatchCreateExample = new grpc.web.MethodDescriptor(
  '/asgt.v2.DatasetService/BatchCreateExample',
  grpc.web.MethodType.UNARY,
  proto.asgt.v2.BatchCreateExampleRequest,
  google_protobuf_empty_pb.Empty,
  /**
   * @param {!proto.asgt.v2.BatchCreateExampleRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  google_protobuf_empty_pb.Empty.deserializeBinary
);


/**
 * @param {!proto.asgt.v2.BatchCreateExampleRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.RpcError, ?proto.google.protobuf.Empty)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.google.protobuf.Empty>|undefined}
 *     The XHR Node Readable Stream
 */
proto.asgt.v2.DatasetServiceClient.prototype.batchCreateExample =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/asgt.v2.DatasetService/BatchCreateExample',
      request,
      metadata || {},
      methodDescriptor_DatasetService_BatchCreateExample,
      callback);
};


/**
 * @param {!proto.asgt.v2.BatchCreateExampleRequest} request The
 *     request proto
 * @param {?Object<string, string>=} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.google.protobuf.Empty>}
 *     Promise that resolves to the response
 */
proto.asgt.v2.DatasetServicePromiseClient.prototype.batchCreateExample =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/asgt.v2.DatasetService/BatchCreateExample',
      request,
      metadata || {},
      methodDescriptor_DatasetService_BatchCreateExample);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.asgt.v2.TruncateDatasetRequest,
 *   !proto.google.protobuf.Empty>}
 */
const methodDescriptor_DatasetService_TruncateDataset = new grpc.web.MethodDescriptor(
  '/asgt.v2.DatasetService/TruncateDataset',
  grpc.web.MethodType.UNARY,
  proto.asgt.v2.TruncateDatasetRequest,
  google_protobuf_empty_pb.Empty,
  /**
   * @param {!proto.asgt.v2.TruncateDatasetRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  google_protobuf_empty_pb.Empty.deserializeBinary
);


/**
 * @param {!proto.asgt.v2.TruncateDatasetRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.RpcError, ?proto.google.protobuf.Empty)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.google.protobuf.Empty>|undefined}
 *     The XHR Node Readable Stream
 */
proto.asgt.v2.DatasetServiceClient.prototype.truncateDataset =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/asgt.v2.DatasetService/TruncateDataset',
      request,
      metadata || {},
      methodDescriptor_DatasetService_TruncateDataset,
      callback);
};


/**
 * @param {!proto.asgt.v2.TruncateDatasetRequest} request The
 *     request proto
 * @param {?Object<string, string>=} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.google.protobuf.Empty>}
 *     Promise that resolves to the response
 */
proto.asgt.v2.DatasetServicePromiseClient.prototype.truncateDataset =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/asgt.v2.DatasetService/TruncateDataset',
      request,
      metadata || {},
      methodDescriptor_DatasetService_TruncateDataset);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.asgt.v2.GetDatasetTrainingsRequest,
 *   !proto.asgt.v2.TrainingsResponse>}
 */
const methodDescriptor_DatasetService_GetDatasetTrainings = new grpc.web.MethodDescriptor(
  '/asgt.v2.DatasetService/GetDatasetTrainings',
  grpc.web.MethodType.UNARY,
  proto.asgt.v2.GetDatasetTrainingsRequest,
  proto.asgt.v2.TrainingsResponse,
  /**
   * @param {!proto.asgt.v2.GetDatasetTrainingsRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.asgt.v2.TrainingsResponse.deserializeBinary
);


/**
 * @param {!proto.asgt.v2.GetDatasetTrainingsRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.RpcError, ?proto.asgt.v2.TrainingsResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.asgt.v2.TrainingsResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.asgt.v2.DatasetServiceClient.prototype.getDatasetTrainings =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/asgt.v2.DatasetService/GetDatasetTrainings',
      request,
      metadata || {},
      methodDescriptor_DatasetService_GetDatasetTrainings,
      callback);
};


/**
 * @param {!proto.asgt.v2.GetDatasetTrainingsRequest} request The
 *     request proto
 * @param {?Object<string, string>=} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.asgt.v2.TrainingsResponse>}
 *     Promise that resolves to the response
 */
proto.asgt.v2.DatasetServicePromiseClient.prototype.getDatasetTrainings =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/asgt.v2.DatasetService/GetDatasetTrainings',
      request,
      metadata || {},
      methodDescriptor_DatasetService_GetDatasetTrainings);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.asgt.v2.GetTrainingsRequest,
 *   !proto.asgt.v2.TrainingsResponse>}
 */
const methodDescriptor_DatasetService_GetTrainings = new grpc.web.MethodDescriptor(
  '/asgt.v2.DatasetService/GetTrainings',
  grpc.web.MethodType.UNARY,
  proto.asgt.v2.GetTrainingsRequest,
  proto.asgt.v2.TrainingsResponse,
  /**
   * @param {!proto.asgt.v2.GetTrainingsRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.asgt.v2.TrainingsResponse.deserializeBinary
);


/**
 * @param {!proto.asgt.v2.GetTrainingsRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.RpcError, ?proto.asgt.v2.TrainingsResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.asgt.v2.TrainingsResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.asgt.v2.DatasetServiceClient.prototype.getTrainings =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/asgt.v2.DatasetService/GetTrainings',
      request,
      metadata || {},
      methodDescriptor_DatasetService_GetTrainings,
      callback);
};


/**
 * @param {!proto.asgt.v2.GetTrainingsRequest} request The
 *     request proto
 * @param {?Object<string, string>=} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.asgt.v2.TrainingsResponse>}
 *     Promise that resolves to the response
 */
proto.asgt.v2.DatasetServicePromiseClient.prototype.getTrainings =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/asgt.v2.DatasetService/GetTrainings',
      request,
      metadata || {},
      methodDescriptor_DatasetService_GetTrainings);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.asgt.v2.TrainDatasetRequest,
 *   !proto.google.protobuf.Empty>}
 */
const methodDescriptor_DatasetService_TrainDataset = new grpc.web.MethodDescriptor(
  '/asgt.v2.DatasetService/TrainDataset',
  grpc.web.MethodType.UNARY,
  proto.asgt.v2.TrainDatasetRequest,
  google_protobuf_empty_pb.Empty,
  /**
   * @param {!proto.asgt.v2.TrainDatasetRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  google_protobuf_empty_pb.Empty.deserializeBinary
);


/**
 * @param {!proto.asgt.v2.TrainDatasetRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.RpcError, ?proto.google.protobuf.Empty)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.google.protobuf.Empty>|undefined}
 *     The XHR Node Readable Stream
 */
proto.asgt.v2.DatasetServiceClient.prototype.trainDataset =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/asgt.v2.DatasetService/TrainDataset',
      request,
      metadata || {},
      methodDescriptor_DatasetService_TrainDataset,
      callback);
};


/**
 * @param {!proto.asgt.v2.TrainDatasetRequest} request The
 *     request proto
 * @param {?Object<string, string>=} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.google.protobuf.Empty>}
 *     Promise that resolves to the response
 */
proto.asgt.v2.DatasetServicePromiseClient.prototype.trainDataset =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/asgt.v2.DatasetService/TrainDataset',
      request,
      metadata || {},
      methodDescriptor_DatasetService_TrainDataset);
};


module.exports = proto.asgt.v2;

