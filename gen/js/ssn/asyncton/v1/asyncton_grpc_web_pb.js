/**
 * @fileoverview gRPC-Web generated client stub for ssn.asyncton.v1
 * @enhanceable
 * @public
 */

// Code generated by protoc-gen-grpc-web. DO NOT EDIT.
// versions:
// 	protoc-gen-grpc-web v1.5.0
// 	protoc              v0.0.0
// source: ssn/asyncton/v1/asyncton.proto


/* eslint-disable */
// @ts-nocheck



const grpc = {};
grpc.web = require('grpc-web');


var google_api_annotations_pb = require('../../../google/api/annotations_pb.js')

var google_protobuf_empty_pb = require('google-protobuf/google/protobuf/empty_pb.js')

var protoc$gen$openapiv2_options_annotations_pb = require('../../../protoc-gen-openapiv2/options/annotations_pb.js')

var ssn_annotator_v1_annotator_pb = require('../../../ssn/annotator/v1/annotator_pb.js')

var ssn_type_candidate_pb = require('../../../ssn/type/candidate_pb.js')

var ssn_type_text_annotation_pb = require('../../../ssn/type/text_annotation_pb.js')

var validate_validate_pb = require('../../../validate/validate_pb.js')
const proto = {};
proto.ssn = {};
proto.ssn.asyncton = {};
proto.ssn.asyncton.v1 = require('./asyncton_pb.js');

/**
 * @param {string} hostname
 * @param {?Object} credentials
 * @param {?grpc.web.ClientOptions} options
 * @constructor
 * @struct
 * @final
 */
proto.ssn.asyncton.v1.TransactionServiceClient =
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
proto.ssn.asyncton.v1.TransactionServicePromiseClient =
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
 *   !proto.ssn.asyncton.v1.CreateTransactionRequest,
 *   !proto.ssn.asyncton.v1.CreateTransactionResponse>}
 */
const methodDescriptor_TransactionService_CreateTransaction = new grpc.web.MethodDescriptor(
  '/ssn.asyncton.v1.TransactionService/CreateTransaction',
  grpc.web.MethodType.UNARY,
  proto.ssn.asyncton.v1.CreateTransactionRequest,
  proto.ssn.asyncton.v1.CreateTransactionResponse,
  /**
   * @param {!proto.ssn.asyncton.v1.CreateTransactionRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.ssn.asyncton.v1.CreateTransactionResponse.deserializeBinary
);


/**
 * @param {!proto.ssn.asyncton.v1.CreateTransactionRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.RpcError, ?proto.ssn.asyncton.v1.CreateTransactionResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.ssn.asyncton.v1.CreateTransactionResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.ssn.asyncton.v1.TransactionServiceClient.prototype.createTransaction =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/ssn.asyncton.v1.TransactionService/CreateTransaction',
      request,
      metadata || {},
      methodDescriptor_TransactionService_CreateTransaction,
      callback);
};


/**
 * @param {!proto.ssn.asyncton.v1.CreateTransactionRequest} request The
 *     request proto
 * @param {?Object<string, string>=} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.ssn.asyncton.v1.CreateTransactionResponse>}
 *     Promise that resolves to the response
 */
proto.ssn.asyncton.v1.TransactionServicePromiseClient.prototype.createTransaction =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/ssn.asyncton.v1.TransactionService/CreateTransaction',
      request,
      metadata || {},
      methodDescriptor_TransactionService_CreateTransaction);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.ssn.asyncton.v1.GetTransactionResultsRequest,
 *   !proto.ssn.asyncton.v1.GetTransactionResultsResponse>}
 */
const methodDescriptor_TransactionService_GetTransactionResults = new grpc.web.MethodDescriptor(
  '/ssn.asyncton.v1.TransactionService/GetTransactionResults',
  grpc.web.MethodType.UNARY,
  proto.ssn.asyncton.v1.GetTransactionResultsRequest,
  proto.ssn.asyncton.v1.GetTransactionResultsResponse,
  /**
   * @param {!proto.ssn.asyncton.v1.GetTransactionResultsRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.ssn.asyncton.v1.GetTransactionResultsResponse.deserializeBinary
);


/**
 * @param {!proto.ssn.asyncton.v1.GetTransactionResultsRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.RpcError, ?proto.ssn.asyncton.v1.GetTransactionResultsResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.ssn.asyncton.v1.GetTransactionResultsResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.ssn.asyncton.v1.TransactionServiceClient.prototype.getTransactionResults =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/ssn.asyncton.v1.TransactionService/GetTransactionResults',
      request,
      metadata || {},
      methodDescriptor_TransactionService_GetTransactionResults,
      callback);
};


/**
 * @param {!proto.ssn.asyncton.v1.GetTransactionResultsRequest} request The
 *     request proto
 * @param {?Object<string, string>=} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.ssn.asyncton.v1.GetTransactionResultsResponse>}
 *     Promise that resolves to the response
 */
proto.ssn.asyncton.v1.TransactionServicePromiseClient.prototype.getTransactionResults =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/ssn.asyncton.v1.TransactionService/GetTransactionResults',
      request,
      metadata || {},
      methodDescriptor_TransactionService_GetTransactionResults);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.ssn.asyncton.v1.GetTransactionStatusRequest,
 *   !proto.ssn.asyncton.v1.GetTransactionStatusResponse>}
 */
const methodDescriptor_TransactionService_GetTransactionStatus = new grpc.web.MethodDescriptor(
  '/ssn.asyncton.v1.TransactionService/GetTransactionStatus',
  grpc.web.MethodType.UNARY,
  proto.ssn.asyncton.v1.GetTransactionStatusRequest,
  proto.ssn.asyncton.v1.GetTransactionStatusResponse,
  /**
   * @param {!proto.ssn.asyncton.v1.GetTransactionStatusRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.ssn.asyncton.v1.GetTransactionStatusResponse.deserializeBinary
);


/**
 * @param {!proto.ssn.asyncton.v1.GetTransactionStatusRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.RpcError, ?proto.ssn.asyncton.v1.GetTransactionStatusResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.ssn.asyncton.v1.GetTransactionStatusResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.ssn.asyncton.v1.TransactionServiceClient.prototype.getTransactionStatus =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/ssn.asyncton.v1.TransactionService/GetTransactionStatus',
      request,
      metadata || {},
      methodDescriptor_TransactionService_GetTransactionStatus,
      callback);
};


/**
 * @param {!proto.ssn.asyncton.v1.GetTransactionStatusRequest} request The
 *     request proto
 * @param {?Object<string, string>=} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.ssn.asyncton.v1.GetTransactionStatusResponse>}
 *     Promise that resolves to the response
 */
proto.ssn.asyncton.v1.TransactionServicePromiseClient.prototype.getTransactionStatus =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/ssn.asyncton.v1.TransactionService/GetTransactionStatus',
      request,
      metadata || {},
      methodDescriptor_TransactionService_GetTransactionStatus);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.ssn.asyncton.v1.DeleteTransactionRequest,
 *   !proto.google.protobuf.Empty>}
 */
const methodDescriptor_TransactionService_DeleteTransaction = new grpc.web.MethodDescriptor(
  '/ssn.asyncton.v1.TransactionService/DeleteTransaction',
  grpc.web.MethodType.UNARY,
  proto.ssn.asyncton.v1.DeleteTransactionRequest,
  google_protobuf_empty_pb.Empty,
  /**
   * @param {!proto.ssn.asyncton.v1.DeleteTransactionRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  google_protobuf_empty_pb.Empty.deserializeBinary
);


/**
 * @param {!proto.ssn.asyncton.v1.DeleteTransactionRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.RpcError, ?proto.google.protobuf.Empty)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.google.protobuf.Empty>|undefined}
 *     The XHR Node Readable Stream
 */
proto.ssn.asyncton.v1.TransactionServiceClient.prototype.deleteTransaction =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/ssn.asyncton.v1.TransactionService/DeleteTransaction',
      request,
      metadata || {},
      methodDescriptor_TransactionService_DeleteTransaction,
      callback);
};


/**
 * @param {!proto.ssn.asyncton.v1.DeleteTransactionRequest} request The
 *     request proto
 * @param {?Object<string, string>=} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.google.protobuf.Empty>}
 *     Promise that resolves to the response
 */
proto.ssn.asyncton.v1.TransactionServicePromiseClient.prototype.deleteTransaction =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/ssn.asyncton.v1.TransactionService/DeleteTransaction',
      request,
      metadata || {},
      methodDescriptor_TransactionService_DeleteTransaction);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.ssn.asyncton.v1.DeleteTagRequest,
 *   !proto.google.protobuf.Empty>}
 */
const methodDescriptor_TransactionService_DeleteTag = new grpc.web.MethodDescriptor(
  '/ssn.asyncton.v1.TransactionService/DeleteTag',
  grpc.web.MethodType.UNARY,
  proto.ssn.asyncton.v1.DeleteTagRequest,
  google_protobuf_empty_pb.Empty,
  /**
   * @param {!proto.ssn.asyncton.v1.DeleteTagRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  google_protobuf_empty_pb.Empty.deserializeBinary
);


/**
 * @param {!proto.ssn.asyncton.v1.DeleteTagRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.RpcError, ?proto.google.protobuf.Empty)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.google.protobuf.Empty>|undefined}
 *     The XHR Node Readable Stream
 */
proto.ssn.asyncton.v1.TransactionServiceClient.prototype.deleteTag =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/ssn.asyncton.v1.TransactionService/DeleteTag',
      request,
      metadata || {},
      methodDescriptor_TransactionService_DeleteTag,
      callback);
};


/**
 * @param {!proto.ssn.asyncton.v1.DeleteTagRequest} request The
 *     request proto
 * @param {?Object<string, string>=} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.google.protobuf.Empty>}
 *     Promise that resolves to the response
 */
proto.ssn.asyncton.v1.TransactionServicePromiseClient.prototype.deleteTag =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/ssn.asyncton.v1.TransactionService/DeleteTag',
      request,
      metadata || {},
      methodDescriptor_TransactionService_DeleteTag);
};


module.exports = proto.ssn.asyncton.v1;

