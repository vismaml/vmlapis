/**
 * @fileoverview
 * @enhanceable
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!

goog.provide('proto.ssn.ocrservice.v1.GetTextAnnotationRequest');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.ssn.annotator.v1.Document');


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
proto.ssn.ocrservice.v1.GetTextAnnotationRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.ssn.ocrservice.v1.GetTextAnnotationRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  proto.ssn.ocrservice.v1.GetTextAnnotationRequest.displayName = 'proto.ssn.ocrservice.v1.GetTextAnnotationRequest';
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
proto.ssn.ocrservice.v1.GetTextAnnotationRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.ssn.ocrservice.v1.GetTextAnnotationRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ssn.ocrservice.v1.GetTextAnnotationRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ssn.ocrservice.v1.GetTextAnnotationRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    document: (f = msg.getDocument()) && proto.ssn.annotator.v1.Document.toObject(includeInstance, f)
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
 * @return {!proto.ssn.ocrservice.v1.GetTextAnnotationRequest}
 */
proto.ssn.ocrservice.v1.GetTextAnnotationRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ssn.ocrservice.v1.GetTextAnnotationRequest;
  return proto.ssn.ocrservice.v1.GetTextAnnotationRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ssn.ocrservice.v1.GetTextAnnotationRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ssn.ocrservice.v1.GetTextAnnotationRequest}
 */
proto.ssn.ocrservice.v1.GetTextAnnotationRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 2:
      var value = new proto.ssn.annotator.v1.Document;
      reader.readMessage(value,proto.ssn.annotator.v1.Document.deserializeBinaryFromReader);
      msg.setDocument(value);
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
proto.ssn.ocrservice.v1.GetTextAnnotationRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ssn.ocrservice.v1.GetTextAnnotationRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ssn.ocrservice.v1.GetTextAnnotationRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ssn.ocrservice.v1.GetTextAnnotationRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDocument();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.ssn.annotator.v1.Document.serializeBinaryToWriter
    );
  }
};


/**
 * optional ssn.annotator.v1.Document document = 2;
 * @return {?proto.ssn.annotator.v1.Document}
 */
proto.ssn.ocrservice.v1.GetTextAnnotationRequest.prototype.getDocument = function() {
  return /** @type{?proto.ssn.annotator.v1.Document} */ (
    jspb.Message.getWrapperField(this, proto.ssn.annotator.v1.Document, 2));
};


/** @param {?proto.ssn.annotator.v1.Document|undefined} value */
proto.ssn.ocrservice.v1.GetTextAnnotationRequest.prototype.setDocument = function(value) {
  jspb.Message.setWrapperField(this, 2, value);
};


proto.ssn.ocrservice.v1.GetTextAnnotationRequest.prototype.clearDocument = function() {
  this.setDocument(undefined);
};


/**
 * Returns whether this field is set.
 * @return {!boolean}
 */
proto.ssn.ocrservice.v1.GetTextAnnotationRequest.prototype.hasDocument = function() {
  return jspb.Message.getField(this, 2) != null;
};


