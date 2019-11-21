/**
 * @fileoverview
 * @enhanceable
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!

goog.provide('proto.ssn.access.v1.ValetKeyRequest');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');


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
proto.ssn.access.v1.ValetKeyRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.ssn.access.v1.ValetKeyRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  proto.ssn.access.v1.ValetKeyRequest.displayName = 'proto.ssn.access.v1.ValetKeyRequest';
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
proto.ssn.access.v1.ValetKeyRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.ssn.access.v1.ValetKeyRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ssn.access.v1.ValetKeyRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ssn.access.v1.ValetKeyRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    sub: jspb.Message.getFieldWithDefault(msg, 1, ""),
    exp: jspb.Message.getFieldWithDefault(msg, 2, 0)
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
 * @return {!proto.ssn.access.v1.ValetKeyRequest}
 */
proto.ssn.access.v1.ValetKeyRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ssn.access.v1.ValetKeyRequest;
  return proto.ssn.access.v1.ValetKeyRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ssn.access.v1.ValetKeyRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ssn.access.v1.ValetKeyRequest}
 */
proto.ssn.access.v1.ValetKeyRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setSub(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setExp(value);
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
proto.ssn.access.v1.ValetKeyRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ssn.access.v1.ValetKeyRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ssn.access.v1.ValetKeyRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ssn.access.v1.ValetKeyRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSub();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getExp();
  if (f !== 0) {
    writer.writeInt64(
      2,
      f
    );
  }
};


/**
 * optional string sub = 1;
 * @return {string}
 */
proto.ssn.access.v1.ValetKeyRequest.prototype.getSub = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/** @param {string} value */
proto.ssn.access.v1.ValetKeyRequest.prototype.setSub = function(value) {
  jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional int64 exp = 2;
 * @return {number}
 */
proto.ssn.access.v1.ValetKeyRequest.prototype.getExp = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/** @param {number} value */
proto.ssn.access.v1.ValetKeyRequest.prototype.setExp = function(value) {
  jspb.Message.setProto3IntField(this, 2, value);
};


