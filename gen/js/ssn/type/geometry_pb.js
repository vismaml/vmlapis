// source: ssn/type/geometry.proto
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
var global =
    (typeof globalThis !== 'undefined' && globalThis) ||
    (typeof window !== 'undefined' && window) ||
    (typeof global !== 'undefined' && global) ||
    (typeof self !== 'undefined' && self) ||
    (function () { return this; }).call(null) ||
    Function('return this')();

goog.exportSymbol('proto.ssn.type.BoundingPoly', null, global);
goog.exportSymbol('proto.ssn.type.NormalizedVertex', null, global);
goog.exportSymbol('proto.ssn.type.Vertex', null, global);
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
proto.ssn.type.Vertex = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.ssn.type.Vertex, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ssn.type.Vertex.displayName = 'proto.ssn.type.Vertex';
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
proto.ssn.type.NormalizedVertex = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.ssn.type.NormalizedVertex, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ssn.type.NormalizedVertex.displayName = 'proto.ssn.type.NormalizedVertex';
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
proto.ssn.type.BoundingPoly = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.ssn.type.BoundingPoly.repeatedFields_, null);
};
goog.inherits(proto.ssn.type.BoundingPoly, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ssn.type.BoundingPoly.displayName = 'proto.ssn.type.BoundingPoly';
}



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
proto.ssn.type.Vertex.prototype.toObject = function(opt_includeInstance) {
  return proto.ssn.type.Vertex.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ssn.type.Vertex} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ssn.type.Vertex.toObject = function(includeInstance, msg) {
  var f, obj = {
    x: jspb.Message.getFieldWithDefault(msg, 1, 0),
    y: jspb.Message.getFieldWithDefault(msg, 2, 0)
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
 * @return {!proto.ssn.type.Vertex}
 */
proto.ssn.type.Vertex.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ssn.type.Vertex;
  return proto.ssn.type.Vertex.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ssn.type.Vertex} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ssn.type.Vertex}
 */
proto.ssn.type.Vertex.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readInt32());
      msg.setX(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readInt32());
      msg.setY(value);
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
proto.ssn.type.Vertex.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ssn.type.Vertex.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ssn.type.Vertex} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ssn.type.Vertex.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getX();
  if (f !== 0) {
    writer.writeInt32(
      1,
      f
    );
  }
  f = message.getY();
  if (f !== 0) {
    writer.writeInt32(
      2,
      f
    );
  }
};


/**
 * optional int32 x = 1;
 * @return {number}
 */
proto.ssn.type.Vertex.prototype.getX = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.ssn.type.Vertex} returns this
 */
proto.ssn.type.Vertex.prototype.setX = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional int32 y = 2;
 * @return {number}
 */
proto.ssn.type.Vertex.prototype.getY = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.ssn.type.Vertex} returns this
 */
proto.ssn.type.Vertex.prototype.setY = function(value) {
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
proto.ssn.type.NormalizedVertex.prototype.toObject = function(opt_includeInstance) {
  return proto.ssn.type.NormalizedVertex.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ssn.type.NormalizedVertex} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ssn.type.NormalizedVertex.toObject = function(includeInstance, msg) {
  var f, obj = {
    x: jspb.Message.getFloatingPointFieldWithDefault(msg, 1, 0.0),
    y: jspb.Message.getFloatingPointFieldWithDefault(msg, 2, 0.0)
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
 * @return {!proto.ssn.type.NormalizedVertex}
 */
proto.ssn.type.NormalizedVertex.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ssn.type.NormalizedVertex;
  return proto.ssn.type.NormalizedVertex.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ssn.type.NormalizedVertex} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ssn.type.NormalizedVertex}
 */
proto.ssn.type.NormalizedVertex.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readFloat());
      msg.setX(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readFloat());
      msg.setY(value);
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
proto.ssn.type.NormalizedVertex.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ssn.type.NormalizedVertex.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ssn.type.NormalizedVertex} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ssn.type.NormalizedVertex.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getX();
  if (f !== 0.0) {
    writer.writeFloat(
      1,
      f
    );
  }
  f = message.getY();
  if (f !== 0.0) {
    writer.writeFloat(
      2,
      f
    );
  }
};


/**
 * optional float x = 1;
 * @return {number}
 */
proto.ssn.type.NormalizedVertex.prototype.getX = function() {
  return /** @type {number} */ (jspb.Message.getFloatingPointFieldWithDefault(this, 1, 0.0));
};


/**
 * @param {number} value
 * @return {!proto.ssn.type.NormalizedVertex} returns this
 */
proto.ssn.type.NormalizedVertex.prototype.setX = function(value) {
  return jspb.Message.setProto3FloatField(this, 1, value);
};


/**
 * optional float y = 2;
 * @return {number}
 */
proto.ssn.type.NormalizedVertex.prototype.getY = function() {
  return /** @type {number} */ (jspb.Message.getFloatingPointFieldWithDefault(this, 2, 0.0));
};


/**
 * @param {number} value
 * @return {!proto.ssn.type.NormalizedVertex} returns this
 */
proto.ssn.type.NormalizedVertex.prototype.setY = function(value) {
  return jspb.Message.setProto3FloatField(this, 2, value);
};



/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.ssn.type.BoundingPoly.repeatedFields_ = [1,2];



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
proto.ssn.type.BoundingPoly.prototype.toObject = function(opt_includeInstance) {
  return proto.ssn.type.BoundingPoly.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ssn.type.BoundingPoly} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ssn.type.BoundingPoly.toObject = function(includeInstance, msg) {
  var f, obj = {
    verticesList: jspb.Message.toObjectList(msg.getVerticesList(),
    proto.ssn.type.Vertex.toObject, includeInstance),
    normalizedVerticesList: jspb.Message.toObjectList(msg.getNormalizedVerticesList(),
    proto.ssn.type.NormalizedVertex.toObject, includeInstance)
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
 * @return {!proto.ssn.type.BoundingPoly}
 */
proto.ssn.type.BoundingPoly.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ssn.type.BoundingPoly;
  return proto.ssn.type.BoundingPoly.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ssn.type.BoundingPoly} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ssn.type.BoundingPoly}
 */
proto.ssn.type.BoundingPoly.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.ssn.type.Vertex;
      reader.readMessage(value,proto.ssn.type.Vertex.deserializeBinaryFromReader);
      msg.addVertices(value);
      break;
    case 2:
      var value = new proto.ssn.type.NormalizedVertex;
      reader.readMessage(value,proto.ssn.type.NormalizedVertex.deserializeBinaryFromReader);
      msg.addNormalizedVertices(value);
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
proto.ssn.type.BoundingPoly.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ssn.type.BoundingPoly.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ssn.type.BoundingPoly} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ssn.type.BoundingPoly.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getVerticesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.ssn.type.Vertex.serializeBinaryToWriter
    );
  }
  f = message.getNormalizedVerticesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.ssn.type.NormalizedVertex.serializeBinaryToWriter
    );
  }
};


/**
 * repeated Vertex vertices = 1;
 * @return {!Array<!proto.ssn.type.Vertex>}
 */
proto.ssn.type.BoundingPoly.prototype.getVerticesList = function() {
  return /** @type{!Array<!proto.ssn.type.Vertex>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.ssn.type.Vertex, 1));
};


/**
 * @param {!Array<!proto.ssn.type.Vertex>} value
 * @return {!proto.ssn.type.BoundingPoly} returns this
*/
proto.ssn.type.BoundingPoly.prototype.setVerticesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.ssn.type.Vertex=} opt_value
 * @param {number=} opt_index
 * @return {!proto.ssn.type.Vertex}
 */
proto.ssn.type.BoundingPoly.prototype.addVertices = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.ssn.type.Vertex, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.ssn.type.BoundingPoly} returns this
 */
proto.ssn.type.BoundingPoly.prototype.clearVerticesList = function() {
  return this.setVerticesList([]);
};


/**
 * repeated NormalizedVertex normalized_vertices = 2;
 * @return {!Array<!proto.ssn.type.NormalizedVertex>}
 */
proto.ssn.type.BoundingPoly.prototype.getNormalizedVerticesList = function() {
  return /** @type{!Array<!proto.ssn.type.NormalizedVertex>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.ssn.type.NormalizedVertex, 2));
};


/**
 * @param {!Array<!proto.ssn.type.NormalizedVertex>} value
 * @return {!proto.ssn.type.BoundingPoly} returns this
*/
proto.ssn.type.BoundingPoly.prototype.setNormalizedVerticesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.ssn.type.NormalizedVertex=} opt_value
 * @param {number=} opt_index
 * @return {!proto.ssn.type.NormalizedVertex}
 */
proto.ssn.type.BoundingPoly.prototype.addNormalizedVertices = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.ssn.type.NormalizedVertex, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.ssn.type.BoundingPoly} returns this
 */
proto.ssn.type.BoundingPoly.prototype.clearNormalizedVerticesList = function() {
  return this.setNormalizedVerticesList([]);
};


goog.object.extend(exports, proto.ssn.type);
