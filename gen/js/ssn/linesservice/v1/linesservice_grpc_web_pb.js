/**
 * @fileoverview gRPC-Web generated client stub for ssn.linesservice.v1
 * @enhanceable
 * @public
 */

// Code generated by protoc-gen-grpc-web. DO NOT EDIT.
// versions:
// 	protoc-gen-grpc-web v1.5.0
// 	protoc              v0.0.0
// source: ssn/linesservice/v1/linesservice.proto


/* eslint-disable */
// @ts-nocheck



const grpc = {};
grpc.web = require('grpc-web');


var ssn_type_candidate_pb = require('../../../ssn/type/candidate_pb.js')

var ssn_type_text_annotation_pb = require('../../../ssn/type/text_annotation_pb.js')
const proto = {};
proto.ssn = {};
proto.ssn.linesservice = {};
proto.ssn.linesservice.v1 = require('./linesservice_pb.js');

/**
 * @param {string} hostname
 * @param {?Object} credentials
 * @param {?grpc.web.ClientOptions} options
 * @constructor
 * @struct
 * @final
 */
proto.ssn.linesservice.v1.LinesServiceClient =
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
proto.ssn.linesservice.v1.LinesServicePromiseClient =
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
 *   !proto.ssn.linesservice.v1.LinesRequest,
 *   !proto.ssn.linesservice.v1.LinesResponse>}
 */
const methodDescriptor_LinesService_Predict = new grpc.web.MethodDescriptor(
  '/ssn.linesservice.v1.LinesService/Predict',
  grpc.web.MethodType.UNARY,
  proto.ssn.linesservice.v1.LinesRequest,
  proto.ssn.linesservice.v1.LinesResponse,
  /**
   * @param {!proto.ssn.linesservice.v1.LinesRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.ssn.linesservice.v1.LinesResponse.deserializeBinary
);


/**
 * @param {!proto.ssn.linesservice.v1.LinesRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.RpcError, ?proto.ssn.linesservice.v1.LinesResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.ssn.linesservice.v1.LinesResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.ssn.linesservice.v1.LinesServiceClient.prototype.predict =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/ssn.linesservice.v1.LinesService/Predict',
      request,
      metadata || {},
      methodDescriptor_LinesService_Predict,
      callback);
};


/**
 * @param {!proto.ssn.linesservice.v1.LinesRequest} request The
 *     request proto
 * @param {?Object<string, string>=} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.ssn.linesservice.v1.LinesResponse>}
 *     Promise that resolves to the response
 */
proto.ssn.linesservice.v1.LinesServicePromiseClient.prototype.predict =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/ssn.linesservice.v1.LinesService/Predict',
      request,
      metadata || {},
      methodDescriptor_LinesService_Predict);
};


module.exports = proto.ssn.linesservice.v1;

