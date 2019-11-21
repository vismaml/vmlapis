/**
 * @fileoverview gRPC-Web generated client stub for ssn.annotator.v1
 * @enhanceable
 * @public
 */

// GENERATED CODE -- DO NOT EDIT!


goog.provide('proto.ssn.annotator.v1.DocumentAnnotatorClient');
goog.provide('proto.ssn.annotator.v1.DocumentAnnotatorPromiseClient');

goog.require('grpc.web.GrpcWebClientBase');
goog.require('grpc.web.AbstractClientBase');
goog.require('grpc.web.ClientReadableStream');
goog.require('grpc.web.Error');
goog.require('grpc.web.MethodDescriptor');
goog.require('grpc.web.MethodType');
goog.require('proto.ssn.annotator.v1.DocumentAnnotatorRequest');
goog.require('proto.ssn.annotator.v1.DocumentAnnotatorResponse');



goog.scope(function() {

/**
 * @param {string} hostname
 * @param {?Object} credentials
 * @param {?Object} options
 * @constructor
 * @struct
 * @final
 */
proto.ssn.annotator.v1.DocumentAnnotatorClient =
    function(hostname, credentials, options) {
  if (!options) options = {};
  options['format'] = 'binary';

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
proto.ssn.annotator.v1.DocumentAnnotatorPromiseClient =
    function(hostname, credentials, options) {
  if (!options) options = {};
  options['format'] = 'binary';

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
 *   !proto.ssn.annotator.v1.DocumentAnnotatorRequest,
 *   !proto.ssn.annotator.v1.DocumentAnnotatorResponse>}
 */
const methodDescriptor_DocumentAnnotator_AnnotateDocument = new grpc.web.MethodDescriptor(
  '/ssn.annotator.v1.DocumentAnnotator/AnnotateDocument',
  grpc.web.MethodType.UNARY,
  proto.ssn.annotator.v1.DocumentAnnotatorRequest,
  proto.ssn.annotator.v1.DocumentAnnotatorResponse,
  /**
   * @param {!proto.ssn.annotator.v1.DocumentAnnotatorRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.ssn.annotator.v1.DocumentAnnotatorResponse.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.ssn.annotator.v1.DocumentAnnotatorRequest,
 *   !proto.ssn.annotator.v1.DocumentAnnotatorResponse>}
 */
const methodInfo_DocumentAnnotator_AnnotateDocument = new grpc.web.AbstractClientBase.MethodInfo(
  proto.ssn.annotator.v1.DocumentAnnotatorResponse,
  /**
   * @param {!proto.ssn.annotator.v1.DocumentAnnotatorRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.ssn.annotator.v1.DocumentAnnotatorResponse.deserializeBinary
);


/**
 * @param {!proto.ssn.annotator.v1.DocumentAnnotatorRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.ssn.annotator.v1.DocumentAnnotatorResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.ssn.annotator.v1.DocumentAnnotatorResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.ssn.annotator.v1.DocumentAnnotatorClient.prototype.annotateDocument =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/ssn.annotator.v1.DocumentAnnotator/AnnotateDocument',
      request,
      metadata || {},
      methodDescriptor_DocumentAnnotator_AnnotateDocument,
      callback);
};


/**
 * @param {!proto.ssn.annotator.v1.DocumentAnnotatorRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.ssn.annotator.v1.DocumentAnnotatorResponse>}
 *     A native promise that resolves to the response
 */
proto.ssn.annotator.v1.DocumentAnnotatorPromiseClient.prototype.annotateDocument =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/ssn.annotator.v1.DocumentAnnotator/AnnotateDocument',
      request,
      metadata || {},
      methodDescriptor_DocumentAnnotator_AnnotateDocument);
};


}); // goog.scope

