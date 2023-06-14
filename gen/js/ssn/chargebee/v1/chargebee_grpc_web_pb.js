/**
 * @fileoverview gRPC-Web generated client stub for ssn.chargebee.v1
 * @enhanceable
 * @public
 */

// Code generated by protoc-gen-grpc-web. DO NOT EDIT.
// versions:
// 	protoc-gen-grpc-web v1.4.2
// 	protoc              v0.0.0
// source: ssn/chargebee/v1/chargebee.proto


/* eslint-disable */
// @ts-nocheck



const grpc = {};
grpc.web = require('grpc-web');


var google_api_annotations_pb = require('../../../google/api/annotations_pb.js')

var protoc$gen$openapiv2_options_annotations_pb = require('../../../protoc-gen-openapiv2/options/annotations_pb.js')
const proto = {};
proto.ssn = {};
proto.ssn.chargebee = {};
proto.ssn.chargebee.v1 = require('./chargebee_pb.js');

/**
 * @param {string} hostname
 * @param {?Object} credentials
 * @param {?grpc.web.ClientOptions} options
 * @constructor
 * @struct
 * @final
 */
proto.ssn.chargebee.v1.ChargeBeenatorClient =
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
proto.ssn.chargebee.v1.ChargeBeenatorPromiseClient =
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
 *   !proto.ssn.chargebee.v1.ChargebeeConnectionRequest,
 *   !proto.ssn.chargebee.v1.ChargebeeConnectionResponse>}
 */
const methodDescriptor_ChargeBeenator_Connect = new grpc.web.MethodDescriptor(
  '/ssn.chargebee.v1.ChargeBeenator/Connect',
  grpc.web.MethodType.UNARY,
  proto.ssn.chargebee.v1.ChargebeeConnectionRequest,
  proto.ssn.chargebee.v1.ChargebeeConnectionResponse,
  /**
   * @param {!proto.ssn.chargebee.v1.ChargebeeConnectionRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.ssn.chargebee.v1.ChargebeeConnectionResponse.deserializeBinary
);


/**
 * @param {!proto.ssn.chargebee.v1.ChargebeeConnectionRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.RpcError, ?proto.ssn.chargebee.v1.ChargebeeConnectionResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.ssn.chargebee.v1.ChargebeeConnectionResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.ssn.chargebee.v1.ChargeBeenatorClient.prototype.connect =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/ssn.chargebee.v1.ChargeBeenator/Connect',
      request,
      metadata || {},
      methodDescriptor_ChargeBeenator_Connect,
      callback);
};


/**
 * @param {!proto.ssn.chargebee.v1.ChargebeeConnectionRequest} request The
 *     request proto
 * @param {?Object<string, string>=} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.ssn.chargebee.v1.ChargebeeConnectionResponse>}
 *     Promise that resolves to the response
 */
proto.ssn.chargebee.v1.ChargeBeenatorPromiseClient.prototype.connect =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/ssn.chargebee.v1.ChargeBeenator/Connect',
      request,
      metadata || {},
      methodDescriptor_ChargeBeenator_Connect);
};


module.exports = proto.ssn.chargebee.v1;

