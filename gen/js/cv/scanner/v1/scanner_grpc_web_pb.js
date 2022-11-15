/**
 * @fileoverview gRPC-Web generated client stub for cv.scanner.v1
 * @enhanceable
 * @public
 */

// Code generated by protoc-gen-grpc-web. DO NOT EDIT.
// versions:
// 	protoc-gen-grpc-web v1.4.2
// 	protoc              v0.0.0
// source: cv/scanner/v1/scanner.proto


/* eslint-disable */
// @ts-nocheck



const grpc = {};
grpc.web = require('grpc-web');


var google_api_annotations_pb = require('../../../google/api/annotations_pb.js')

var google_api_http_pb = require('../../../google/api/http_pb.js')

var ssn_type_candidate_pb = require('../../../ssn/type/candidate_pb.js')
const proto = {};
proto.cv = {};
proto.cv.scanner = {};
proto.cv.scanner.v1 = require('./scanner_pb.js');

/**
 * @param {string} hostname
 * @param {?Object} credentials
 * @param {?grpc.web.ClientOptions} options
 * @constructor
 * @struct
 * @final
 */
proto.cv.scanner.v1.CvScannerClient =
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
proto.cv.scanner.v1.CvScannerPromiseClient =
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
 *   !proto.cv.scanner.v1.ScanCVRequest,
 *   !proto.cv.scanner.v1.ScanCVResponse>}
 */
const methodDescriptor_CvScanner_ScanCV = new grpc.web.MethodDescriptor(
  '/cv.scanner.v1.CvScanner/ScanCV',
  grpc.web.MethodType.UNARY,
  proto.cv.scanner.v1.ScanCVRequest,
  proto.cv.scanner.v1.ScanCVResponse,
  /**
   * @param {!proto.cv.scanner.v1.ScanCVRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.cv.scanner.v1.ScanCVResponse.deserializeBinary
);


/**
 * @param {!proto.cv.scanner.v1.ScanCVRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.RpcError, ?proto.cv.scanner.v1.ScanCVResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.cv.scanner.v1.ScanCVResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.cv.scanner.v1.CvScannerClient.prototype.scanCV =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/cv.scanner.v1.CvScanner/ScanCV',
      request,
      metadata || {},
      methodDescriptor_CvScanner_ScanCV,
      callback);
};


/**
 * @param {!proto.cv.scanner.v1.ScanCVRequest} request The
 *     request proto
 * @param {?Object<string, string>=} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.cv.scanner.v1.ScanCVResponse>}
 *     Promise that resolves to the response
 */
proto.cv.scanner.v1.CvScannerPromiseClient.prototype.scanCV =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/cv.scanner.v1.CvScanner/ScanCV',
      request,
      metadata || {},
      methodDescriptor_CvScanner_ScanCV);
};


module.exports = proto.cv.scanner.v1;

