/**
 * @fileoverview gRPC-Web generated client stub for asgt.modelregistry.v1
 * @enhanceable
 * @public
 */

// Code generated by protoc-gen-grpc-web. DO NOT EDIT.
// versions:
// 	protoc-gen-grpc-web v1.5.0
// 	protoc              v0.0.0
// source: asgt/modelregistry/v1/model_registry.proto


/* eslint-disable */
// @ts-nocheck



const grpc = {};
grpc.web = require('grpc-web');


var asgt_type_dataset_pb = require('../../../asgt/type/dataset_pb.js')

var asgt_type_dataset_statistics_pb = require('../../../asgt/type/dataset_statistics_pb.js')

var asgt_type_model_pb = require('../../../asgt/type/model_pb.js')

var asgt_type_model_type_pb = require('../../../asgt/type/model_type_pb.js')

var asgt_type_prediction_pb = require('../../../asgt/type/prediction_pb.js')

var asgt_type_revision_pb = require('../../../asgt/type/revision_pb.js')

var asgt_type_target_metrics_pb = require('../../../asgt/type/target_metrics_pb.js')

var asgt_type_train_statistics_pb = require('../../../asgt/type/train_statistics_pb.js')

var google_protobuf_empty_pb = require('google-protobuf/google/protobuf/empty_pb.js')
const proto = {};
proto.asgt = {};
proto.asgt.modelregistry = {};
proto.asgt.modelregistry.v1 = require('./model_registry_pb.js');

/**
 * @param {string} hostname
 * @param {?Object} credentials
 * @param {?grpc.web.ClientOptions} options
 * @constructor
 * @struct
 * @final
 */
proto.asgt.modelregistry.v1.ModelRegistryClient =
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
proto.asgt.modelregistry.v1.ModelRegistryPromiseClient =
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
 *   !proto.asgt.modelregistry.v1.RegisterModelRequest,
 *   !proto.google.protobuf.Empty>}
 */
const methodDescriptor_ModelRegistry_RegisterModel = new grpc.web.MethodDescriptor(
  '/asgt.modelregistry.v1.ModelRegistry/RegisterModel',
  grpc.web.MethodType.UNARY,
  proto.asgt.modelregistry.v1.RegisterModelRequest,
  google_protobuf_empty_pb.Empty,
  /**
   * @param {!proto.asgt.modelregistry.v1.RegisterModelRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  google_protobuf_empty_pb.Empty.deserializeBinary
);


/**
 * @param {!proto.asgt.modelregistry.v1.RegisterModelRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.RpcError, ?proto.google.protobuf.Empty)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.google.protobuf.Empty>|undefined}
 *     The XHR Node Readable Stream
 */
proto.asgt.modelregistry.v1.ModelRegistryClient.prototype.registerModel =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/asgt.modelregistry.v1.ModelRegistry/RegisterModel',
      request,
      metadata || {},
      methodDescriptor_ModelRegistry_RegisterModel,
      callback);
};


/**
 * @param {!proto.asgt.modelregistry.v1.RegisterModelRequest} request The
 *     request proto
 * @param {?Object<string, string>=} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.google.protobuf.Empty>}
 *     Promise that resolves to the response
 */
proto.asgt.modelregistry.v1.ModelRegistryPromiseClient.prototype.registerModel =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/asgt.modelregistry.v1.ModelRegistry/RegisterModel',
      request,
      metadata || {},
      methodDescriptor_ModelRegistry_RegisterModel);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.asgt.modelregistry.v1.GetCurrentModelRequest,
 *   !proto.asgt.modelregistry.v1.GetCurrentModelResponse>}
 */
const methodDescriptor_ModelRegistry_GetCurrentModel = new grpc.web.MethodDescriptor(
  '/asgt.modelregistry.v1.ModelRegistry/GetCurrentModel',
  grpc.web.MethodType.UNARY,
  proto.asgt.modelregistry.v1.GetCurrentModelRequest,
  proto.asgt.modelregistry.v1.GetCurrentModelResponse,
  /**
   * @param {!proto.asgt.modelregistry.v1.GetCurrentModelRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.asgt.modelregistry.v1.GetCurrentModelResponse.deserializeBinary
);


/**
 * @param {!proto.asgt.modelregistry.v1.GetCurrentModelRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.RpcError, ?proto.asgt.modelregistry.v1.GetCurrentModelResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.asgt.modelregistry.v1.GetCurrentModelResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.asgt.modelregistry.v1.ModelRegistryClient.prototype.getCurrentModel =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/asgt.modelregistry.v1.ModelRegistry/GetCurrentModel',
      request,
      metadata || {},
      methodDescriptor_ModelRegistry_GetCurrentModel,
      callback);
};


/**
 * @param {!proto.asgt.modelregistry.v1.GetCurrentModelRequest} request The
 *     request proto
 * @param {?Object<string, string>=} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.asgt.modelregistry.v1.GetCurrentModelResponse>}
 *     Promise that resolves to the response
 */
proto.asgt.modelregistry.v1.ModelRegistryPromiseClient.prototype.getCurrentModel =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/asgt.modelregistry.v1.ModelRegistry/GetCurrentModel',
      request,
      metadata || {},
      methodDescriptor_ModelRegistry_GetCurrentModel);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.asgt.modelregistry.v1.GetCurrentModelRequest,
 *   !proto.asgt.modelregistry.v1.GetCurrentModelResponse>}
 */
const methodDescriptor_ModelRegistry_GetCurrentFullModel = new grpc.web.MethodDescriptor(
  '/asgt.modelregistry.v1.ModelRegistry/GetCurrentFullModel',
  grpc.web.MethodType.UNARY,
  proto.asgt.modelregistry.v1.GetCurrentModelRequest,
  proto.asgt.modelregistry.v1.GetCurrentModelResponse,
  /**
   * @param {!proto.asgt.modelregistry.v1.GetCurrentModelRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.asgt.modelregistry.v1.GetCurrentModelResponse.deserializeBinary
);


/**
 * @param {!proto.asgt.modelregistry.v1.GetCurrentModelRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.RpcError, ?proto.asgt.modelregistry.v1.GetCurrentModelResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.asgt.modelregistry.v1.GetCurrentModelResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.asgt.modelregistry.v1.ModelRegistryClient.prototype.getCurrentFullModel =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/asgt.modelregistry.v1.ModelRegistry/GetCurrentFullModel',
      request,
      metadata || {},
      methodDescriptor_ModelRegistry_GetCurrentFullModel,
      callback);
};


/**
 * @param {!proto.asgt.modelregistry.v1.GetCurrentModelRequest} request The
 *     request proto
 * @param {?Object<string, string>=} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.asgt.modelregistry.v1.GetCurrentModelResponse>}
 *     Promise that resolves to the response
 */
proto.asgt.modelregistry.v1.ModelRegistryPromiseClient.prototype.getCurrentFullModel =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/asgt.modelregistry.v1.ModelRegistry/GetCurrentFullModel',
      request,
      metadata || {},
      methodDescriptor_ModelRegistry_GetCurrentFullModel);
};


module.exports = proto.asgt.modelregistry.v1;

