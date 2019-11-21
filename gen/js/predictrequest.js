/**
 * @fileoverview
 * @enhanceable
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!

goog.provide('proto.ssn.mlservice.v2.PredictRequest');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.tensorflow.Example');


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
proto.ssn.mlservice.v2.PredictRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.ssn.mlservice.v2.PredictRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  proto.ssn.mlservice.v2.PredictRequest.displayName = 'proto.ssn.mlservice.v2.PredictRequest';
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
proto.ssn.mlservice.v2.PredictRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.ssn.mlservice.v2.PredictRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ssn.mlservice.v2.PredictRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ssn.mlservice.v2.PredictRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    example: (f = msg.getExample()) && proto.tensorflow.Example.toObject(includeInstance, f),
    topNMostConfident: jspb.Message.getFieldWithDefault(msg, 2, 0)
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
 * @return {!proto.ssn.mlservice.v2.PredictRequest}
 */
proto.ssn.mlservice.v2.PredictRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ssn.mlservice.v2.PredictRequest;
  return proto.ssn.mlservice.v2.PredictRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ssn.mlservice.v2.PredictRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ssn.mlservice.v2.PredictRequest}
 */
proto.ssn.mlservice.v2.PredictRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.tensorflow.Example;
      reader.readMessage(value,proto.tensorflow.Example.deserializeBinaryFromReader);
      msg.setExample(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setTopNMostConfident(value);
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
proto.ssn.mlservice.v2.PredictRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ssn.mlservice.v2.PredictRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ssn.mlservice.v2.PredictRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ssn.mlservice.v2.PredictRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getExample();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.tensorflow.Example.serializeBinaryToWriter
    );
  }
  f = message.getTopNMostConfident();
  if (f !== 0) {
    writer.writeUint32(
      2,
      f
    );
  }
};


/**
 * optional tensorflow.Example example = 1;
 * @return {?proto.tensorflow.Example}
 */
proto.ssn.mlservice.v2.PredictRequest.prototype.getExample = function() {
  return /** @type{?proto.tensorflow.Example} */ (
    jspb.Message.getWrapperField(this, proto.tensorflow.Example, 1));
};


/** @param {?proto.tensorflow.Example|undefined} value */
proto.ssn.mlservice.v2.PredictRequest.prototype.setExample = function(value) {
  jspb.Message.setWrapperField(this, 1, value);
};


proto.ssn.mlservice.v2.PredictRequest.prototype.clearExample = function() {
  this.setExample(undefined);
};


/**
 * Returns whether this field is set.
 * @return {!boolean}
 */
proto.ssn.mlservice.v2.PredictRequest.prototype.hasExample = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional uint32 top_n_most_confident = 2;
 * @return {number}
 */
proto.ssn.mlservice.v2.PredictRequest.prototype.getTopNMostConfident = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/** @param {number} value */
proto.ssn.mlservice.v2.PredictRequest.prototype.setTopNMostConfident = function(value) {
  jspb.Message.setProto3IntField(this, 2, value);
};


