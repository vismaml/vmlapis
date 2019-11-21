/**
 * @fileoverview gRPC-Web generated client stub for ssn.dataservice.v1alpha1
 * @enhanceable
 * @public
 */

// GENERATED CODE -- DO NOT EDIT!



const grpc = {};
grpc.web = require('grpc-web');


var gen_bq_schema_bq_field_pb = require('../../../gen_bq_schema/bq_field_pb.js')

var gen_bq_schema_bq_table_pb = require('../../../gen_bq_schema/bq_table_pb.js')

var google_api_annotations_pb = require('../../../google/api/annotations_pb.js')

var google_protobuf_empty_pb = require('google-protobuf/google/protobuf/empty_pb.js')

var google_protobuf_wrappers_pb = require('google-protobuf/google/protobuf/wrappers_pb.js')

var google_type_date_pb = require('../../../google/type/date_pb.js')

var ssn_type_text_annotation_pb = require('../../../ssn/type/text_annotation_pb.js')
const proto = {};
proto.ssn = {};
proto.ssn.dataservice = {};
proto.ssn.dataservice.v1alpha1 = require('./dataservice_pb.js');

/**
 * @param {string} hostname
 * @param {?Object} credentials
 * @param {?Object} options
 * @constructor
 * @struct
 * @final
 */
proto.ssn.dataservice.v1alpha1.DataServiceClient =
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
proto.ssn.dataservice.v1alpha1.DataServicePromiseClient =
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
 *   !proto.ssn.dataservice.v1alpha1.CreateDocumentRequest,
 *   !proto.ssn.dataservice.v1alpha1.CreateDocumentResponse>}
 */
const methodDescriptor_DataService_CreateDocument = new grpc.web.MethodDescriptor(
  '/ssn.dataservice.v1alpha1.DataService/CreateDocument',
  grpc.web.MethodType.UNARY,
  proto.ssn.dataservice.v1alpha1.CreateDocumentRequest,
  proto.ssn.dataservice.v1alpha1.CreateDocumentResponse,
  /**
   * @param {!proto.ssn.dataservice.v1alpha1.CreateDocumentRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.ssn.dataservice.v1alpha1.CreateDocumentResponse.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.ssn.dataservice.v1alpha1.CreateDocumentRequest,
 *   !proto.ssn.dataservice.v1alpha1.CreateDocumentResponse>}
 */
const methodInfo_DataService_CreateDocument = new grpc.web.AbstractClientBase.MethodInfo(
  proto.ssn.dataservice.v1alpha1.CreateDocumentResponse,
  /**
   * @param {!proto.ssn.dataservice.v1alpha1.CreateDocumentRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.ssn.dataservice.v1alpha1.CreateDocumentResponse.deserializeBinary
);


/**
 * @param {!proto.ssn.dataservice.v1alpha1.CreateDocumentRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.ssn.dataservice.v1alpha1.CreateDocumentResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.ssn.dataservice.v1alpha1.CreateDocumentResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.ssn.dataservice.v1alpha1.DataServiceClient.prototype.createDocument =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/ssn.dataservice.v1alpha1.DataService/CreateDocument',
      request,
      metadata || {},
      methodDescriptor_DataService_CreateDocument,
      callback);
};


/**
 * @param {!proto.ssn.dataservice.v1alpha1.CreateDocumentRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.ssn.dataservice.v1alpha1.CreateDocumentResponse>}
 *     A native promise that resolves to the response
 */
proto.ssn.dataservice.v1alpha1.DataServicePromiseClient.prototype.createDocument =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/ssn.dataservice.v1alpha1.DataService/CreateDocument',
      request,
      metadata || {},
      methodDescriptor_DataService_CreateDocument);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.ssn.dataservice.v1alpha1.ReadDocumentRequest,
 *   !proto.ssn.dataservice.v1alpha1.ReadDocumentResponse>}
 */
const methodDescriptor_DataService_ReadDocument = new grpc.web.MethodDescriptor(
  '/ssn.dataservice.v1alpha1.DataService/ReadDocument',
  grpc.web.MethodType.UNARY,
  proto.ssn.dataservice.v1alpha1.ReadDocumentRequest,
  proto.ssn.dataservice.v1alpha1.ReadDocumentResponse,
  /**
   * @param {!proto.ssn.dataservice.v1alpha1.ReadDocumentRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.ssn.dataservice.v1alpha1.ReadDocumentResponse.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.ssn.dataservice.v1alpha1.ReadDocumentRequest,
 *   !proto.ssn.dataservice.v1alpha1.ReadDocumentResponse>}
 */
const methodInfo_DataService_ReadDocument = new grpc.web.AbstractClientBase.MethodInfo(
  proto.ssn.dataservice.v1alpha1.ReadDocumentResponse,
  /**
   * @param {!proto.ssn.dataservice.v1alpha1.ReadDocumentRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.ssn.dataservice.v1alpha1.ReadDocumentResponse.deserializeBinary
);


/**
 * @param {!proto.ssn.dataservice.v1alpha1.ReadDocumentRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.ssn.dataservice.v1alpha1.ReadDocumentResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.ssn.dataservice.v1alpha1.ReadDocumentResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.ssn.dataservice.v1alpha1.DataServiceClient.prototype.readDocument =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/ssn.dataservice.v1alpha1.DataService/ReadDocument',
      request,
      metadata || {},
      methodDescriptor_DataService_ReadDocument,
      callback);
};


/**
 * @param {!proto.ssn.dataservice.v1alpha1.ReadDocumentRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.ssn.dataservice.v1alpha1.ReadDocumentResponse>}
 *     A native promise that resolves to the response
 */
proto.ssn.dataservice.v1alpha1.DataServicePromiseClient.prototype.readDocument =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/ssn.dataservice.v1alpha1.DataService/ReadDocument',
      request,
      metadata || {},
      methodDescriptor_DataService_ReadDocument);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.ssn.dataservice.v1alpha1.PrepareFeedbackRequest,
 *   !proto.google.protobuf.Empty>}
 */
const methodDescriptor_DataService_PrepareFeedback = new grpc.web.MethodDescriptor(
  '/ssn.dataservice.v1alpha1.DataService/PrepareFeedback',
  grpc.web.MethodType.UNARY,
  proto.ssn.dataservice.v1alpha1.PrepareFeedbackRequest,
  google_protobuf_empty_pb.Empty,
  /**
   * @param {!proto.ssn.dataservice.v1alpha1.PrepareFeedbackRequest} request
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
 *   !proto.ssn.dataservice.v1alpha1.PrepareFeedbackRequest,
 *   !proto.google.protobuf.Empty>}
 */
const methodInfo_DataService_PrepareFeedback = new grpc.web.AbstractClientBase.MethodInfo(
  google_protobuf_empty_pb.Empty,
  /**
   * @param {!proto.ssn.dataservice.v1alpha1.PrepareFeedbackRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  google_protobuf_empty_pb.Empty.deserializeBinary
);


/**
 * @param {!proto.ssn.dataservice.v1alpha1.PrepareFeedbackRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.google.protobuf.Empty)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.google.protobuf.Empty>|undefined}
 *     The XHR Node Readable Stream
 */
proto.ssn.dataservice.v1alpha1.DataServiceClient.prototype.prepareFeedback =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/ssn.dataservice.v1alpha1.DataService/PrepareFeedback',
      request,
      metadata || {},
      methodDescriptor_DataService_PrepareFeedback,
      callback);
};


/**
 * @param {!proto.ssn.dataservice.v1alpha1.PrepareFeedbackRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.google.protobuf.Empty>}
 *     A native promise that resolves to the response
 */
proto.ssn.dataservice.v1alpha1.DataServicePromiseClient.prototype.prepareFeedback =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/ssn.dataservice.v1alpha1.DataService/PrepareFeedback',
      request,
      metadata || {},
      methodDescriptor_DataService_PrepareFeedback);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.ssn.dataservice.v1alpha1.FeedbackRequest,
 *   !proto.google.protobuf.Empty>}
 */
const methodDescriptor_DataService_Feedback = new grpc.web.MethodDescriptor(
  '/ssn.dataservice.v1alpha1.DataService/Feedback',
  grpc.web.MethodType.UNARY,
  proto.ssn.dataservice.v1alpha1.FeedbackRequest,
  google_protobuf_empty_pb.Empty,
  /**
   * @param {!proto.ssn.dataservice.v1alpha1.FeedbackRequest} request
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
 *   !proto.ssn.dataservice.v1alpha1.FeedbackRequest,
 *   !proto.google.protobuf.Empty>}
 */
const methodInfo_DataService_Feedback = new grpc.web.AbstractClientBase.MethodInfo(
  google_protobuf_empty_pb.Empty,
  /**
   * @param {!proto.ssn.dataservice.v1alpha1.FeedbackRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  google_protobuf_empty_pb.Empty.deserializeBinary
);


/**
 * @param {!proto.ssn.dataservice.v1alpha1.FeedbackRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.google.protobuf.Empty)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.google.protobuf.Empty>|undefined}
 *     The XHR Node Readable Stream
 */
proto.ssn.dataservice.v1alpha1.DataServiceClient.prototype.feedback =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/ssn.dataservice.v1alpha1.DataService/Feedback',
      request,
      metadata || {},
      methodDescriptor_DataService_Feedback,
      callback);
};


/**
 * @param {!proto.ssn.dataservice.v1alpha1.FeedbackRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.google.protobuf.Empty>}
 *     A native promise that resolves to the response
 */
proto.ssn.dataservice.v1alpha1.DataServicePromiseClient.prototype.feedback =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/ssn.dataservice.v1alpha1.DataService/Feedback',
      request,
      metadata || {},
      methodDescriptor_DataService_Feedback);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.ssn.dataservice.v1alpha1.MetricsRequest,
 *   !proto.ssn.dataservice.v1alpha1.FeedbackMetrics>}
 */
const methodDescriptor_DataService_CalculateMetrics = new grpc.web.MethodDescriptor(
  '/ssn.dataservice.v1alpha1.DataService/CalculateMetrics',
  grpc.web.MethodType.UNARY,
  proto.ssn.dataservice.v1alpha1.MetricsRequest,
  proto.ssn.dataservice.v1alpha1.FeedbackMetrics,
  /**
   * @param {!proto.ssn.dataservice.v1alpha1.MetricsRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.ssn.dataservice.v1alpha1.FeedbackMetrics.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.ssn.dataservice.v1alpha1.MetricsRequest,
 *   !proto.ssn.dataservice.v1alpha1.FeedbackMetrics>}
 */
const methodInfo_DataService_CalculateMetrics = new grpc.web.AbstractClientBase.MethodInfo(
  proto.ssn.dataservice.v1alpha1.FeedbackMetrics,
  /**
   * @param {!proto.ssn.dataservice.v1alpha1.MetricsRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.ssn.dataservice.v1alpha1.FeedbackMetrics.deserializeBinary
);


/**
 * @param {!proto.ssn.dataservice.v1alpha1.MetricsRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.ssn.dataservice.v1alpha1.FeedbackMetrics)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.ssn.dataservice.v1alpha1.FeedbackMetrics>|undefined}
 *     The XHR Node Readable Stream
 */
proto.ssn.dataservice.v1alpha1.DataServiceClient.prototype.calculateMetrics =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/ssn.dataservice.v1alpha1.DataService/CalculateMetrics',
      request,
      metadata || {},
      methodDescriptor_DataService_CalculateMetrics,
      callback);
};


/**
 * @param {!proto.ssn.dataservice.v1alpha1.MetricsRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.ssn.dataservice.v1alpha1.FeedbackMetrics>}
 *     A native promise that resolves to the response
 */
proto.ssn.dataservice.v1alpha1.DataServicePromiseClient.prototype.calculateMetrics =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/ssn.dataservice.v1alpha1.DataService/CalculateMetrics',
      request,
      metadata || {},
      methodDescriptor_DataService_CalculateMetrics);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.ssn.dataservice.v1alpha1.DeleteRequest,
 *   !proto.google.protobuf.Empty>}
 */
const methodDescriptor_DataService_Delete = new grpc.web.MethodDescriptor(
  '/ssn.dataservice.v1alpha1.DataService/Delete',
  grpc.web.MethodType.UNARY,
  proto.ssn.dataservice.v1alpha1.DeleteRequest,
  google_protobuf_empty_pb.Empty,
  /**
   * @param {!proto.ssn.dataservice.v1alpha1.DeleteRequest} request
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
 *   !proto.ssn.dataservice.v1alpha1.DeleteRequest,
 *   !proto.google.protobuf.Empty>}
 */
const methodInfo_DataService_Delete = new grpc.web.AbstractClientBase.MethodInfo(
  google_protobuf_empty_pb.Empty,
  /**
   * @param {!proto.ssn.dataservice.v1alpha1.DeleteRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  google_protobuf_empty_pb.Empty.deserializeBinary
);


/**
 * @param {!proto.ssn.dataservice.v1alpha1.DeleteRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.google.protobuf.Empty)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.google.protobuf.Empty>|undefined}
 *     The XHR Node Readable Stream
 */
proto.ssn.dataservice.v1alpha1.DataServiceClient.prototype.delete =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/ssn.dataservice.v1alpha1.DataService/Delete',
      request,
      metadata || {},
      methodDescriptor_DataService_Delete,
      callback);
};


/**
 * @param {!proto.ssn.dataservice.v1alpha1.DeleteRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.google.protobuf.Empty>}
 *     A native promise that resolves to the response
 */
proto.ssn.dataservice.v1alpha1.DataServicePromiseClient.prototype.delete =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/ssn.dataservice.v1alpha1.DataService/Delete',
      request,
      metadata || {},
      methodDescriptor_DataService_Delete);
};


module.exports = proto.ssn.dataservice.v1alpha1;

