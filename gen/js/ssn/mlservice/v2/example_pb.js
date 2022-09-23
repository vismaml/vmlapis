// source: ssn/mlservice/v2/example.proto
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

var ssn_mlservice_v2_feature_pb = require('../../../ssn/mlservice/v2/feature_pb.js');
goog.object.extend(proto, ssn_mlservice_v2_feature_pb);
goog.exportSymbol('proto.tensorflow.Example', null, global);
goog.exportSymbol('proto.tensorflow.SequenceExample', null, global);
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
proto.tensorflow.Example = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.tensorflow.Example, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.tensorflow.Example.displayName = 'proto.tensorflow.Example';
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
proto.tensorflow.SequenceExample = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.tensorflow.SequenceExample, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.tensorflow.SequenceExample.displayName = 'proto.tensorflow.SequenceExample';
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
proto.tensorflow.Example.prototype.toObject = function(opt_includeInstance) {
  return proto.tensorflow.Example.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.tensorflow.Example} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.tensorflow.Example.toObject = function(includeInstance, msg) {
  var f, obj = {
    features: (f = msg.getFeatures()) && ssn_mlservice_v2_feature_pb.Features.toObject(includeInstance, f)
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
 * @return {!proto.tensorflow.Example}
 */
proto.tensorflow.Example.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.tensorflow.Example;
  return proto.tensorflow.Example.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.tensorflow.Example} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.tensorflow.Example}
 */
proto.tensorflow.Example.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new ssn_mlservice_v2_feature_pb.Features;
      reader.readMessage(value,ssn_mlservice_v2_feature_pb.Features.deserializeBinaryFromReader);
      msg.setFeatures(value);
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
proto.tensorflow.Example.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.tensorflow.Example.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.tensorflow.Example} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.tensorflow.Example.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getFeatures();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      ssn_mlservice_v2_feature_pb.Features.serializeBinaryToWriter
    );
  }
};


/**
 * optional Features features = 1;
 * @return {?proto.tensorflow.Features}
 */
proto.tensorflow.Example.prototype.getFeatures = function() {
  return /** @type{?proto.tensorflow.Features} */ (
    jspb.Message.getWrapperField(this, ssn_mlservice_v2_feature_pb.Features, 1));
};


/**
 * @param {?proto.tensorflow.Features|undefined} value
 * @return {!proto.tensorflow.Example} returns this
*/
proto.tensorflow.Example.prototype.setFeatures = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.tensorflow.Example} returns this
 */
proto.tensorflow.Example.prototype.clearFeatures = function() {
  return this.setFeatures(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.tensorflow.Example.prototype.hasFeatures = function() {
  return jspb.Message.getField(this, 1) != null;
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
proto.tensorflow.SequenceExample.prototype.toObject = function(opt_includeInstance) {
  return proto.tensorflow.SequenceExample.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.tensorflow.SequenceExample} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.tensorflow.SequenceExample.toObject = function(includeInstance, msg) {
  var f, obj = {
    context: (f = msg.getContext()) && ssn_mlservice_v2_feature_pb.Features.toObject(includeInstance, f),
    featureLists: (f = msg.getFeatureLists()) && ssn_mlservice_v2_feature_pb.FeatureLists.toObject(includeInstance, f)
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
 * @return {!proto.tensorflow.SequenceExample}
 */
proto.tensorflow.SequenceExample.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.tensorflow.SequenceExample;
  return proto.tensorflow.SequenceExample.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.tensorflow.SequenceExample} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.tensorflow.SequenceExample}
 */
proto.tensorflow.SequenceExample.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new ssn_mlservice_v2_feature_pb.Features;
      reader.readMessage(value,ssn_mlservice_v2_feature_pb.Features.deserializeBinaryFromReader);
      msg.setContext(value);
      break;
    case 2:
      var value = new ssn_mlservice_v2_feature_pb.FeatureLists;
      reader.readMessage(value,ssn_mlservice_v2_feature_pb.FeatureLists.deserializeBinaryFromReader);
      msg.setFeatureLists(value);
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
proto.tensorflow.SequenceExample.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.tensorflow.SequenceExample.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.tensorflow.SequenceExample} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.tensorflow.SequenceExample.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getContext();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      ssn_mlservice_v2_feature_pb.Features.serializeBinaryToWriter
    );
  }
  f = message.getFeatureLists();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      ssn_mlservice_v2_feature_pb.FeatureLists.serializeBinaryToWriter
    );
  }
};


/**
 * optional Features context = 1;
 * @return {?proto.tensorflow.Features}
 */
proto.tensorflow.SequenceExample.prototype.getContext = function() {
  return /** @type{?proto.tensorflow.Features} */ (
    jspb.Message.getWrapperField(this, ssn_mlservice_v2_feature_pb.Features, 1));
};


/**
 * @param {?proto.tensorflow.Features|undefined} value
 * @return {!proto.tensorflow.SequenceExample} returns this
*/
proto.tensorflow.SequenceExample.prototype.setContext = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.tensorflow.SequenceExample} returns this
 */
proto.tensorflow.SequenceExample.prototype.clearContext = function() {
  return this.setContext(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.tensorflow.SequenceExample.prototype.hasContext = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional FeatureLists feature_lists = 2;
 * @return {?proto.tensorflow.FeatureLists}
 */
proto.tensorflow.SequenceExample.prototype.getFeatureLists = function() {
  return /** @type{?proto.tensorflow.FeatureLists} */ (
    jspb.Message.getWrapperField(this, ssn_mlservice_v2_feature_pb.FeatureLists, 2));
};


/**
 * @param {?proto.tensorflow.FeatureLists|undefined} value
 * @return {!proto.tensorflow.SequenceExample} returns this
*/
proto.tensorflow.SequenceExample.prototype.setFeatureLists = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.tensorflow.SequenceExample} returns this
 */
proto.tensorflow.SequenceExample.prototype.clearFeatureLists = function() {
  return this.setFeatureLists(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.tensorflow.SequenceExample.prototype.hasFeatureLists = function() {
  return jspb.Message.getField(this, 2) != null;
};


goog.object.extend(exports, proto.tensorflow);
