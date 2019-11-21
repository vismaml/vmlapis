/**
 * @fileoverview
 * @enhanceable
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!

goog.provide('proto.ssn.dataservice.v1alpha1.PrepareFeedbackRequest');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.ssn.dataservice.v1alpha1.PredictionValues');
goog.require('proto.ssn.type.TextAnnotation');


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
proto.ssn.dataservice.v1alpha1.PrepareFeedbackRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.ssn.dataservice.v1alpha1.PrepareFeedbackRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  proto.ssn.dataservice.v1alpha1.PrepareFeedbackRequest.displayName = 'proto.ssn.dataservice.v1alpha1.PrepareFeedbackRequest';
}


if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto suitable for use in Soy templates.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     com.google.apps.jspb.JsClassTemplate.JS_RESERVED_WORDS.
 * @param {boolean=} opt_includeInstance Whether to include the JSPB instance
 *     for transitional soy proto support: http://goto/soy-param-migration
 * @return {!Object}
 */
proto.ssn.dataservice.v1alpha1.PrepareFeedbackRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.ssn.dataservice.v1alpha1.PrepareFeedbackRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ssn.dataservice.v1alpha1.PrepareFeedbackRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ssn.dataservice.v1alpha1.PrepareFeedbackRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    id: jspb.Message.getFieldWithDefault(msg, 1, ""),
    ta: (f = msg.getTa()) && proto.ssn.type.TextAnnotation.toObject(includeInstance, f),
    documentBytes: msg.getDocumentBytes_asB64(),
    predictions: (f = msg.getPredictions()) && proto.ssn.dataservice.v1alpha1.PredictionValues.toObject(includeInstance, f)
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
 * @return {!proto.ssn.dataservice.v1alpha1.PrepareFeedbackRequest}
 */
proto.ssn.dataservice.v1alpha1.PrepareFeedbackRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ssn.dataservice.v1alpha1.PrepareFeedbackRequest;
  return proto.ssn.dataservice.v1alpha1.PrepareFeedbackRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ssn.dataservice.v1alpha1.PrepareFeedbackRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ssn.dataservice.v1alpha1.PrepareFeedbackRequest}
 */
proto.ssn.dataservice.v1alpha1.PrepareFeedbackRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setId(value);
      break;
    case 2:
      var value = new proto.ssn.type.TextAnnotation;
      reader.readMessage(value,proto.ssn.type.TextAnnotation.deserializeBinaryFromReader);
      msg.setTa(value);
      break;
    case 3:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setDocumentBytes(value);
      break;
    case 4:
      var value = new proto.ssn.dataservice.v1alpha1.PredictionValues;
      reader.readMessage(value,proto.ssn.dataservice.v1alpha1.PredictionValues.deserializeBinaryFromReader);
      msg.setPredictions(value);
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
proto.ssn.dataservice.v1alpha1.PrepareFeedbackRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ssn.dataservice.v1alpha1.PrepareFeedbackRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ssn.dataservice.v1alpha1.PrepareFeedbackRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ssn.dataservice.v1alpha1.PrepareFeedbackRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getTa();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.ssn.type.TextAnnotation.serializeBinaryToWriter
    );
  }
  f = message.getDocumentBytes_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      3,
      f
    );
  }
  f = message.getPredictions();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.ssn.dataservice.v1alpha1.PredictionValues.serializeBinaryToWriter
    );
  }
};


/**
 * optional string id = 1;
 * @return {string}
 */
proto.ssn.dataservice.v1alpha1.PrepareFeedbackRequest.prototype.getId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/** @param {string} value */
proto.ssn.dataservice.v1alpha1.PrepareFeedbackRequest.prototype.setId = function(value) {
  jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional ssn.type.TextAnnotation ta = 2;
 * @return {?proto.ssn.type.TextAnnotation}
 */
proto.ssn.dataservice.v1alpha1.PrepareFeedbackRequest.prototype.getTa = function() {
  return /** @type{?proto.ssn.type.TextAnnotation} */ (
    jspb.Message.getWrapperField(this, proto.ssn.type.TextAnnotation, 2));
};


/** @param {?proto.ssn.type.TextAnnotation|undefined} value */
proto.ssn.dataservice.v1alpha1.PrepareFeedbackRequest.prototype.setTa = function(value) {
  jspb.Message.setWrapperField(this, 2, value);
};


proto.ssn.dataservice.v1alpha1.PrepareFeedbackRequest.prototype.clearTa = function() {
  this.setTa(undefined);
};


/**
 * Returns whether this field is set.
 * @return {!boolean}
 */
proto.ssn.dataservice.v1alpha1.PrepareFeedbackRequest.prototype.hasTa = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional bytes document_bytes = 3;
 * @return {string}
 */
proto.ssn.dataservice.v1alpha1.PrepareFeedbackRequest.prototype.getDocumentBytes = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * optional bytes document_bytes = 3;
 * This is a type-conversion wrapper around `getDocumentBytes()`
 * @return {string}
 */
proto.ssn.dataservice.v1alpha1.PrepareFeedbackRequest.prototype.getDocumentBytes_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getDocumentBytes()));
};


/**
 * optional bytes document_bytes = 3;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getDocumentBytes()`
 * @return {!Uint8Array}
 */
proto.ssn.dataservice.v1alpha1.PrepareFeedbackRequest.prototype.getDocumentBytes_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getDocumentBytes()));
};


/** @param {!(string|Uint8Array)} value */
proto.ssn.dataservice.v1alpha1.PrepareFeedbackRequest.prototype.setDocumentBytes = function(value) {
  jspb.Message.setProto3BytesField(this, 3, value);
};


/**
 * optional PredictionValues predictions = 4;
 * @return {?proto.ssn.dataservice.v1alpha1.PredictionValues}
 */
proto.ssn.dataservice.v1alpha1.PrepareFeedbackRequest.prototype.getPredictions = function() {
  return /** @type{?proto.ssn.dataservice.v1alpha1.PredictionValues} */ (
    jspb.Message.getWrapperField(this, proto.ssn.dataservice.v1alpha1.PredictionValues, 4));
};


/** @param {?proto.ssn.dataservice.v1alpha1.PredictionValues|undefined} value */
proto.ssn.dataservice.v1alpha1.PrepareFeedbackRequest.prototype.setPredictions = function(value) {
  jspb.Message.setWrapperField(this, 4, value);
};


proto.ssn.dataservice.v1alpha1.PrepareFeedbackRequest.prototype.clearPredictions = function() {
  this.setPredictions(undefined);
};


/**
 * Returns whether this field is set.
 * @return {!boolean}
 */
proto.ssn.dataservice.v1alpha1.PrepareFeedbackRequest.prototype.hasPredictions = function() {
  return jspb.Message.getField(this, 4) != null;
};


