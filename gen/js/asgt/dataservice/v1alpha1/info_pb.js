/**
 * @fileoverview
 * @enhanceable
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!

var jspb = require('google-protobuf');
var goog = jspb;
var global = Function('return this')();

var asgt_type_dataset_pb = require('../../../asgt/type/dataset_pb.js');
var asgt_type_model_pb = require('../../../asgt/type/model_pb.js');
var asgt_type_retention_policy_pb = require('../../../asgt/type/retention_policy_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');
goog.exportSymbol('proto.asgt.dataservice.v1alpha1.GetInfoRequest', null, global);
goog.exportSymbol('proto.asgt.dataservice.v1alpha1.GetInfoResponse', null, global);

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
proto.asgt.dataservice.v1alpha1.GetInfoRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.asgt.dataservice.v1alpha1.GetInfoRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  proto.asgt.dataservice.v1alpha1.GetInfoRequest.displayName = 'proto.asgt.dataservice.v1alpha1.GetInfoRequest';
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
proto.asgt.dataservice.v1alpha1.GetInfoRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.asgt.dataservice.v1alpha1.GetInfoRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.asgt.dataservice.v1alpha1.GetInfoRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.dataservice.v1alpha1.GetInfoRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    datasetName: jspb.Message.getFieldWithDefault(msg, 1, ""),
    datasetType: jspb.Message.getFieldWithDefault(msg, 2, "")
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
 * @return {!proto.asgt.dataservice.v1alpha1.GetInfoRequest}
 */
proto.asgt.dataservice.v1alpha1.GetInfoRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.asgt.dataservice.v1alpha1.GetInfoRequest;
  return proto.asgt.dataservice.v1alpha1.GetInfoRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.asgt.dataservice.v1alpha1.GetInfoRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.asgt.dataservice.v1alpha1.GetInfoRequest}
 */
proto.asgt.dataservice.v1alpha1.GetInfoRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setDatasetName(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setDatasetType(value);
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
proto.asgt.dataservice.v1alpha1.GetInfoRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.asgt.dataservice.v1alpha1.GetInfoRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.asgt.dataservice.v1alpha1.GetInfoRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.dataservice.v1alpha1.GetInfoRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDatasetName();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getDatasetType();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
};


/**
 * optional string dataset_name = 1;
 * @return {string}
 */
proto.asgt.dataservice.v1alpha1.GetInfoRequest.prototype.getDatasetName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/** @param {string} value */
proto.asgt.dataservice.v1alpha1.GetInfoRequest.prototype.setDatasetName = function(value) {
  jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string dataset_type = 2;
 * @return {string}
 */
proto.asgt.dataservice.v1alpha1.GetInfoRequest.prototype.getDatasetType = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/** @param {string} value */
proto.asgt.dataservice.v1alpha1.GetInfoRequest.prototype.setDatasetType = function(value) {
  jspb.Message.setProto3StringField(this, 2, value);
};



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
proto.asgt.dataservice.v1alpha1.GetInfoResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.asgt.dataservice.v1alpha1.GetInfoResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  proto.asgt.dataservice.v1alpha1.GetInfoResponse.displayName = 'proto.asgt.dataservice.v1alpha1.GetInfoResponse';
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
proto.asgt.dataservice.v1alpha1.GetInfoResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.asgt.dataservice.v1alpha1.GetInfoResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.asgt.dataservice.v1alpha1.GetInfoResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.dataservice.v1alpha1.GetInfoResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    dataset: (f = msg.getDataset()) && asgt_type_dataset_pb.Dataset.toObject(includeInstance, f),
    model: (f = msg.getModel()) && asgt_type_model_pb.Model.toObject(includeInstance, f)
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
 * @return {!proto.asgt.dataservice.v1alpha1.GetInfoResponse}
 */
proto.asgt.dataservice.v1alpha1.GetInfoResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.asgt.dataservice.v1alpha1.GetInfoResponse;
  return proto.asgt.dataservice.v1alpha1.GetInfoResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.asgt.dataservice.v1alpha1.GetInfoResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.asgt.dataservice.v1alpha1.GetInfoResponse}
 */
proto.asgt.dataservice.v1alpha1.GetInfoResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new asgt_type_dataset_pb.Dataset;
      reader.readMessage(value,asgt_type_dataset_pb.Dataset.deserializeBinaryFromReader);
      msg.setDataset(value);
      break;
    case 2:
      var value = new asgt_type_model_pb.Model;
      reader.readMessage(value,asgt_type_model_pb.Model.deserializeBinaryFromReader);
      msg.setModel(value);
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
proto.asgt.dataservice.v1alpha1.GetInfoResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.asgt.dataservice.v1alpha1.GetInfoResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.asgt.dataservice.v1alpha1.GetInfoResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.dataservice.v1alpha1.GetInfoResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDataset();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      asgt_type_dataset_pb.Dataset.serializeBinaryToWriter
    );
  }
  f = message.getModel();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      asgt_type_model_pb.Model.serializeBinaryToWriter
    );
  }
};


/**
 * optional asgt.type.Dataset dataset = 1;
 * @return {?proto.asgt.type.Dataset}
 */
proto.asgt.dataservice.v1alpha1.GetInfoResponse.prototype.getDataset = function() {
  return /** @type{?proto.asgt.type.Dataset} */ (
    jspb.Message.getWrapperField(this, asgt_type_dataset_pb.Dataset, 1));
};


/** @param {?proto.asgt.type.Dataset|undefined} value */
proto.asgt.dataservice.v1alpha1.GetInfoResponse.prototype.setDataset = function(value) {
  jspb.Message.setWrapperField(this, 1, value);
};


proto.asgt.dataservice.v1alpha1.GetInfoResponse.prototype.clearDataset = function() {
  this.setDataset(undefined);
};


/**
 * Returns whether this field is set.
 * @return {!boolean}
 */
proto.asgt.dataservice.v1alpha1.GetInfoResponse.prototype.hasDataset = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional asgt.type.Model model = 2;
 * @return {?proto.asgt.type.Model}
 */
proto.asgt.dataservice.v1alpha1.GetInfoResponse.prototype.getModel = function() {
  return /** @type{?proto.asgt.type.Model} */ (
    jspb.Message.getWrapperField(this, asgt_type_model_pb.Model, 2));
};


/** @param {?proto.asgt.type.Model|undefined} value */
proto.asgt.dataservice.v1alpha1.GetInfoResponse.prototype.setModel = function(value) {
  jspb.Message.setWrapperField(this, 2, value);
};


proto.asgt.dataservice.v1alpha1.GetInfoResponse.prototype.clearModel = function() {
  this.setModel(undefined);
};


/**
 * Returns whether this field is set.
 * @return {!boolean}
 */
proto.asgt.dataservice.v1alpha1.GetInfoResponse.prototype.hasModel = function() {
  return jspb.Message.getField(this, 2) != null;
};


goog.object.extend(exports, proto.asgt.dataservice.v1alpha1);
