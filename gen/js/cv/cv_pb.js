// source: cv/cv.proto
/**
 * @fileoverview
 * @enhanceable
 * @suppress {missingRequire} reports error on implicit type usages.
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!
/* eslint-disable */
// @ts-nocheck

var jspb = require('google-protobuf');
var goog = jspb;
var global = Function('return this')();

var google_api_annotations_pb = require('../google/api/annotations_pb.js');
goog.object.extend(proto, google_api_annotations_pb);
var google_api_http_pb = require('../google/api/http_pb.js');
goog.object.extend(proto, google_api_http_pb);
var ssn_type_candidate_pb = require('../ssn/type/candidate_pb.js');
goog.object.extend(proto, ssn_type_candidate_pb);
goog.exportSymbol('proto.cv.scanner.v1.Document', null, global);
goog.exportSymbol('proto.cv.scanner.v1.DocumentSource', null, global);
goog.exportSymbol('proto.cv.scanner.v1.Feature', null, global);
goog.exportSymbol('proto.cv.scanner.v1.Feature.Type', null, global);
goog.exportSymbol('proto.cv.scanner.v1.ScanDocumentRequest', null, global);
goog.exportSymbol('proto.cv.scanner.v1.ScanDocumentResponse', null, global);
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.cv.scanner.v1.ScanDocumentRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.cv.scanner.v1.ScanDocumentRequest.repeatedFields_, null);
};
goog.inherits(proto.cv.scanner.v1.ScanDocumentRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cv.scanner.v1.ScanDocumentRequest.displayName = 'proto.cv.scanner.v1.ScanDocumentRequest';
}
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.cv.scanner.v1.ScanDocumentResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.cv.scanner.v1.ScanDocumentResponse.repeatedFields_, null);
};
goog.inherits(proto.cv.scanner.v1.ScanDocumentResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cv.scanner.v1.ScanDocumentResponse.displayName = 'proto.cv.scanner.v1.ScanDocumentResponse';
}
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.cv.scanner.v1.Feature = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.cv.scanner.v1.Feature, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cv.scanner.v1.Feature.displayName = 'proto.cv.scanner.v1.Feature';
}
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.cv.scanner.v1.Document = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.cv.scanner.v1.Document, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cv.scanner.v1.Document.displayName = 'proto.cv.scanner.v1.Document';
}
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.cv.scanner.v1.DocumentSource = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.cv.scanner.v1.DocumentSource, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cv.scanner.v1.DocumentSource.displayName = 'proto.cv.scanner.v1.DocumentSource';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.cv.scanner.v1.ScanDocumentRequest.repeatedFields_ = [2,3];



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.cv.scanner.v1.ScanDocumentRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.cv.scanner.v1.ScanDocumentRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cv.scanner.v1.ScanDocumentRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cv.scanner.v1.ScanDocumentRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    document: (f = msg.getDocument()) && proto.cv.scanner.v1.Document.toObject(includeInstance, f),
    featuresList: jspb.Message.toObjectList(msg.getFeaturesList(),
    proto.cv.scanner.v1.Feature.toObject, includeInstance),
    tagsList: (f = jspb.Message.getRepeatedField(msg, 3)) == null ? undefined : f
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.cv.scanner.v1.ScanDocumentRequest}
 */
proto.cv.scanner.v1.ScanDocumentRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cv.scanner.v1.ScanDocumentRequest;
  return proto.cv.scanner.v1.ScanDocumentRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cv.scanner.v1.ScanDocumentRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cv.scanner.v1.ScanDocumentRequest}
 */
proto.cv.scanner.v1.ScanDocumentRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cv.scanner.v1.Document;
      reader.readMessage(value,proto.cv.scanner.v1.Document.deserializeBinaryFromReader);
      msg.setDocument(value);
      break;
    case 2:
      var value = new proto.cv.scanner.v1.Feature;
      reader.readMessage(value,proto.cv.scanner.v1.Feature.deserializeBinaryFromReader);
      msg.addFeatures(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.addTags(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.cv.scanner.v1.ScanDocumentRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cv.scanner.v1.ScanDocumentRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cv.scanner.v1.ScanDocumentRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cv.scanner.v1.ScanDocumentRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDocument();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.cv.scanner.v1.Document.serializeBinaryToWriter
    );
  }
  f = message.getFeaturesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.cv.scanner.v1.Feature.serializeBinaryToWriter
    );
  }
  f = message.getTagsList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      3,
      f
    );
  }
};


/**
 * optional Document document = 1;
 * @return {?proto.cv.scanner.v1.Document}
 */
proto.cv.scanner.v1.ScanDocumentRequest.prototype.getDocument = function() {
  return /** @type{?proto.cv.scanner.v1.Document} */ (
    jspb.Message.getWrapperField(this, proto.cv.scanner.v1.Document, 1));
};


/**
 * @param {?proto.cv.scanner.v1.Document|undefined} value
 * @return {!proto.cv.scanner.v1.ScanDocumentRequest} returns this
*/
proto.cv.scanner.v1.ScanDocumentRequest.prototype.setDocument = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cv.scanner.v1.ScanDocumentRequest} returns this
 */
proto.cv.scanner.v1.ScanDocumentRequest.prototype.clearDocument = function() {
  return this.setDocument(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cv.scanner.v1.ScanDocumentRequest.prototype.hasDocument = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * repeated Feature features = 2;
 * @return {!Array<!proto.cv.scanner.v1.Feature>}
 */
proto.cv.scanner.v1.ScanDocumentRequest.prototype.getFeaturesList = function() {
  return /** @type{!Array<!proto.cv.scanner.v1.Feature>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cv.scanner.v1.Feature, 2));
};


/**
 * @param {!Array<!proto.cv.scanner.v1.Feature>} value
 * @return {!proto.cv.scanner.v1.ScanDocumentRequest} returns this
*/
proto.cv.scanner.v1.ScanDocumentRequest.prototype.setFeaturesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.cv.scanner.v1.Feature=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cv.scanner.v1.Feature}
 */
proto.cv.scanner.v1.ScanDocumentRequest.prototype.addFeatures = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.cv.scanner.v1.Feature, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cv.scanner.v1.ScanDocumentRequest} returns this
 */
proto.cv.scanner.v1.ScanDocumentRequest.prototype.clearFeaturesList = function() {
  return this.setFeaturesList([]);
};


/**
 * repeated string tags = 3;
 * @return {!Array<string>}
 */
proto.cv.scanner.v1.ScanDocumentRequest.prototype.getTagsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 3));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.cv.scanner.v1.ScanDocumentRequest} returns this
 */
proto.cv.scanner.v1.ScanDocumentRequest.prototype.setTagsList = function(value) {
  return jspb.Message.setField(this, 3, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.cv.scanner.v1.ScanDocumentRequest} returns this
 */
proto.cv.scanner.v1.ScanDocumentRequest.prototype.addTags = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 3, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cv.scanner.v1.ScanDocumentRequest} returns this
 */
proto.cv.scanner.v1.ScanDocumentRequest.prototype.clearTagsList = function() {
  return this.setTagsList([]);
};



/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.cv.scanner.v1.ScanDocumentResponse.repeatedFields_ = [1];



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.cv.scanner.v1.ScanDocumentResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.cv.scanner.v1.ScanDocumentResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cv.scanner.v1.ScanDocumentResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cv.scanner.v1.ScanDocumentResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    orderDateList: jspb.Message.toObjectList(msg.getOrderDateList(),
    ssn_type_candidate_pb.Candidate.toObject, includeInstance)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.cv.scanner.v1.ScanDocumentResponse}
 */
proto.cv.scanner.v1.ScanDocumentResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cv.scanner.v1.ScanDocumentResponse;
  return proto.cv.scanner.v1.ScanDocumentResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cv.scanner.v1.ScanDocumentResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cv.scanner.v1.ScanDocumentResponse}
 */
proto.cv.scanner.v1.ScanDocumentResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new ssn_type_candidate_pb.Candidate;
      reader.readMessage(value,ssn_type_candidate_pb.Candidate.deserializeBinaryFromReader);
      msg.addOrderDate(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.cv.scanner.v1.ScanDocumentResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cv.scanner.v1.ScanDocumentResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cv.scanner.v1.ScanDocumentResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cv.scanner.v1.ScanDocumentResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getOrderDateList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      ssn_type_candidate_pb.Candidate.serializeBinaryToWriter
    );
  }
};


/**
 * repeated ssn.type.Candidate order_date = 1;
 * @return {!Array<!proto.ssn.type.Candidate>}
 */
proto.cv.scanner.v1.ScanDocumentResponse.prototype.getOrderDateList = function() {
  return /** @type{!Array<!proto.ssn.type.Candidate>} */ (
    jspb.Message.getRepeatedWrapperField(this, ssn_type_candidate_pb.Candidate, 1));
};


/**
 * @param {!Array<!proto.ssn.type.Candidate>} value
 * @return {!proto.cv.scanner.v1.ScanDocumentResponse} returns this
*/
proto.cv.scanner.v1.ScanDocumentResponse.prototype.setOrderDateList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.ssn.type.Candidate=} opt_value
 * @param {number=} opt_index
 * @return {!proto.ssn.type.Candidate}
 */
proto.cv.scanner.v1.ScanDocumentResponse.prototype.addOrderDate = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.ssn.type.Candidate, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cv.scanner.v1.ScanDocumentResponse} returns this
 */
proto.cv.scanner.v1.ScanDocumentResponse.prototype.clearOrderDateList = function() {
  return this.setOrderDateList([]);
};





if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.cv.scanner.v1.Feature.prototype.toObject = function(opt_includeInstance) {
  return proto.cv.scanner.v1.Feature.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cv.scanner.v1.Feature} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cv.scanner.v1.Feature.toObject = function(includeInstance, msg) {
  var f, obj = {
    type: jspb.Message.getFieldWithDefault(msg, 1, 0),
    maxResults: jspb.Message.getFieldWithDefault(msg, 2, 0)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.cv.scanner.v1.Feature}
 */
proto.cv.scanner.v1.Feature.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cv.scanner.v1.Feature;
  return proto.cv.scanner.v1.Feature.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cv.scanner.v1.Feature} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cv.scanner.v1.Feature}
 */
proto.cv.scanner.v1.Feature.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!proto.cv.scanner.v1.Feature.Type} */ (reader.readEnum());
      msg.setType(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readInt32());
      msg.setMaxResults(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.cv.scanner.v1.Feature.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cv.scanner.v1.Feature.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cv.scanner.v1.Feature} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cv.scanner.v1.Feature.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getType();
  if (f !== 0.0) {
    writer.writeEnum(
      1,
      f
    );
  }
  f = message.getMaxResults();
  if (f !== 0) {
    writer.writeInt32(
      2,
      f
    );
  }
};


/**
 * @enum {number}
 */
proto.cv.scanner.v1.Feature.Type = {
  FIRST_NAME: 0,
  LAST_NAME: 1,
  DATE_OF_BIRTH: 2,
  PHONE: 3,
  EMAIL: 4,
  COUNTRY: 5,
  NATIONALITY: 6,
  POSTAL_CODE: 7,
  POSTAL_AREA: 8,
  MUNICIPALITY: 9,
  COUNTY: 10,
  ADDRESS: 11,
  EMPLOYER_NAME: 12,
  POSITION_TITLE: 13,
  DATE: 14,
  INSTITUTE_NAME: 15,
  INSTITUTE_TYPE: 16,
  AREA_OF_EDUCATION: 17,
  DEGREE: 18,
  AVERAGE_GRADE: 19,
  NAME: 20,
  LEVEL: 21
};

/**
 * optional Type type = 1;
 * @return {!proto.cv.scanner.v1.Feature.Type}
 */
proto.cv.scanner.v1.Feature.prototype.getType = function() {
  return /** @type {!proto.cv.scanner.v1.Feature.Type} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {!proto.cv.scanner.v1.Feature.Type} value
 * @return {!proto.cv.scanner.v1.Feature} returns this
 */
proto.cv.scanner.v1.Feature.prototype.setType = function(value) {
  return jspb.Message.setProto3EnumField(this, 1, value);
};


/**
 * optional int32 max_results = 2;
 * @return {number}
 */
proto.cv.scanner.v1.Feature.prototype.getMaxResults = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.cv.scanner.v1.Feature} returns this
 */
proto.cv.scanner.v1.Feature.prototype.setMaxResults = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};





if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.cv.scanner.v1.Document.prototype.toObject = function(opt_includeInstance) {
  return proto.cv.scanner.v1.Document.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cv.scanner.v1.Document} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cv.scanner.v1.Document.toObject = function(includeInstance, msg) {
  var f, obj = {
    content: msg.getContent_asB64(),
    source: (f = msg.getSource()) && proto.cv.scanner.v1.DocumentSource.toObject(includeInstance, f)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.cv.scanner.v1.Document}
 */
proto.cv.scanner.v1.Document.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cv.scanner.v1.Document;
  return proto.cv.scanner.v1.Document.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cv.scanner.v1.Document} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cv.scanner.v1.Document}
 */
proto.cv.scanner.v1.Document.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setContent(value);
      break;
    case 2:
      var value = new proto.cv.scanner.v1.DocumentSource;
      reader.readMessage(value,proto.cv.scanner.v1.DocumentSource.deserializeBinaryFromReader);
      msg.setSource(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.cv.scanner.v1.Document.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cv.scanner.v1.Document.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cv.scanner.v1.Document} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cv.scanner.v1.Document.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getContent_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      1,
      f
    );
  }
  f = message.getSource();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.cv.scanner.v1.DocumentSource.serializeBinaryToWriter
    );
  }
};


/**
 * optional bytes content = 1;
 * @return {!(string|Uint8Array)}
 */
proto.cv.scanner.v1.Document.prototype.getContent = function() {
  return /** @type {!(string|Uint8Array)} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * optional bytes content = 1;
 * This is a type-conversion wrapper around `getContent()`
 * @return {string}
 */
proto.cv.scanner.v1.Document.prototype.getContent_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getContent()));
};


/**
 * optional bytes content = 1;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getContent()`
 * @return {!Uint8Array}
 */
proto.cv.scanner.v1.Document.prototype.getContent_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getContent()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.cv.scanner.v1.Document} returns this
 */
proto.cv.scanner.v1.Document.prototype.setContent = function(value) {
  return jspb.Message.setProto3BytesField(this, 1, value);
};


/**
 * optional DocumentSource source = 2;
 * @return {?proto.cv.scanner.v1.DocumentSource}
 */
proto.cv.scanner.v1.Document.prototype.getSource = function() {
  return /** @type{?proto.cv.scanner.v1.DocumentSource} */ (
    jspb.Message.getWrapperField(this, proto.cv.scanner.v1.DocumentSource, 2));
};


/**
 * @param {?proto.cv.scanner.v1.DocumentSource|undefined} value
 * @return {!proto.cv.scanner.v1.Document} returns this
*/
proto.cv.scanner.v1.Document.prototype.setSource = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cv.scanner.v1.Document} returns this
 */
proto.cv.scanner.v1.Document.prototype.clearSource = function() {
  return this.setSource(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cv.scanner.v1.Document.prototype.hasSource = function() {
  return jspb.Message.getField(this, 2) != null;
};





if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.cv.scanner.v1.DocumentSource.prototype.toObject = function(opt_includeInstance) {
  return proto.cv.scanner.v1.DocumentSource.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cv.scanner.v1.DocumentSource} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cv.scanner.v1.DocumentSource.toObject = function(includeInstance, msg) {
  var f, obj = {
    httpUri: jspb.Message.getFieldWithDefault(msg, 1, "")
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.cv.scanner.v1.DocumentSource}
 */
proto.cv.scanner.v1.DocumentSource.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cv.scanner.v1.DocumentSource;
  return proto.cv.scanner.v1.DocumentSource.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cv.scanner.v1.DocumentSource} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cv.scanner.v1.DocumentSource}
 */
proto.cv.scanner.v1.DocumentSource.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setHttpUri(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.cv.scanner.v1.DocumentSource.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cv.scanner.v1.DocumentSource.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cv.scanner.v1.DocumentSource} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cv.scanner.v1.DocumentSource.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getHttpUri();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
};


/**
 * optional string http_uri = 1;
 * @return {string}
 */
proto.cv.scanner.v1.DocumentSource.prototype.getHttpUri = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.cv.scanner.v1.DocumentSource} returns this
 */
proto.cv.scanner.v1.DocumentSource.prototype.setHttpUri = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


goog.object.extend(exports, proto.cv.scanner.v1);
