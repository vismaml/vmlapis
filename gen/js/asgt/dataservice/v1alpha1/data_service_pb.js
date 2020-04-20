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

var asgt_type_retention_policy_pb = require('../../../asgt/type/retention_policy_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');
goog.exportSymbol('proto.asgt.dataservice.v1alpha1.DatasetInfo', null, global);
goog.exportSymbol('proto.asgt.dataservice.v1alpha1.GetDatasetRequest', null, global);
goog.exportSymbol('proto.asgt.dataservice.v1alpha1.GetDatasetResponse', null, global);

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
proto.asgt.dataservice.v1alpha1.GetDatasetRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.asgt.dataservice.v1alpha1.GetDatasetRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  proto.asgt.dataservice.v1alpha1.GetDatasetRequest.displayName = 'proto.asgt.dataservice.v1alpha1.GetDatasetRequest';
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
proto.asgt.dataservice.v1alpha1.GetDatasetRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.asgt.dataservice.v1alpha1.GetDatasetRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.asgt.dataservice.v1alpha1.GetDatasetRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.dataservice.v1alpha1.GetDatasetRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    consumer: jspb.Message.getFieldWithDefault(msg, 1, ""),
    datasetName: jspb.Message.getFieldWithDefault(msg, 2, ""),
    datasetType: jspb.Message.getFieldWithDefault(msg, 3, "")
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
 * @return {!proto.asgt.dataservice.v1alpha1.GetDatasetRequest}
 */
proto.asgt.dataservice.v1alpha1.GetDatasetRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.asgt.dataservice.v1alpha1.GetDatasetRequest;
  return proto.asgt.dataservice.v1alpha1.GetDatasetRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.asgt.dataservice.v1alpha1.GetDatasetRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.asgt.dataservice.v1alpha1.GetDatasetRequest}
 */
proto.asgt.dataservice.v1alpha1.GetDatasetRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setConsumer(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setDatasetName(value);
      break;
    case 3:
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
proto.asgt.dataservice.v1alpha1.GetDatasetRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.asgt.dataservice.v1alpha1.GetDatasetRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.asgt.dataservice.v1alpha1.GetDatasetRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.dataservice.v1alpha1.GetDatasetRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getConsumer();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getDatasetName();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getDatasetType();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
};


/**
 * optional string consumer = 1;
 * @return {string}
 */
proto.asgt.dataservice.v1alpha1.GetDatasetRequest.prototype.getConsumer = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/** @param {string} value */
proto.asgt.dataservice.v1alpha1.GetDatasetRequest.prototype.setConsumer = function(value) {
  jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string dataset_name = 2;
 * @return {string}
 */
proto.asgt.dataservice.v1alpha1.GetDatasetRequest.prototype.getDatasetName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/** @param {string} value */
proto.asgt.dataservice.v1alpha1.GetDatasetRequest.prototype.setDatasetName = function(value) {
  jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string dataset_type = 3;
 * @return {string}
 */
proto.asgt.dataservice.v1alpha1.GetDatasetRequest.prototype.getDatasetType = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/** @param {string} value */
proto.asgt.dataservice.v1alpha1.GetDatasetRequest.prototype.setDatasetType = function(value) {
  jspb.Message.setProto3StringField(this, 3, value);
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
proto.asgt.dataservice.v1alpha1.DatasetInfo = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.asgt.dataservice.v1alpha1.DatasetInfo.repeatedFields_, null);
};
goog.inherits(proto.asgt.dataservice.v1alpha1.DatasetInfo, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  proto.asgt.dataservice.v1alpha1.DatasetInfo.displayName = 'proto.asgt.dataservice.v1alpha1.DatasetInfo';
}
/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.asgt.dataservice.v1alpha1.DatasetInfo.repeatedFields_ = [4,5];



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
proto.asgt.dataservice.v1alpha1.DatasetInfo.prototype.toObject = function(opt_includeInstance) {
  return proto.asgt.dataservice.v1alpha1.DatasetInfo.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.asgt.dataservice.v1alpha1.DatasetInfo} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.dataservice.v1alpha1.DatasetInfo.toObject = function(includeInstance, msg) {
  var f, obj = {
    consumer: jspb.Message.getFieldWithDefault(msg, 1, ""),
    name: jspb.Message.getFieldWithDefault(msg, 2, ""),
    type: jspb.Message.getFieldWithDefault(msg, 3, ""),
    tagsList: jspb.Message.getRepeatedField(msg, 4),
    targetsList: jspb.Message.getRepeatedField(msg, 5),
    retentionPolicy: (f = msg.getRetentionPolicy()) && asgt_type_retention_policy_pb.RetentionPolicy.toObject(includeInstance, f),
    trainingGracePeriodEnd: (f = msg.getTrainingGracePeriodEnd()) && google_protobuf_timestamp_pb.Timestamp.toObject(includeInstance, f)
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
 * @return {!proto.asgt.dataservice.v1alpha1.DatasetInfo}
 */
proto.asgt.dataservice.v1alpha1.DatasetInfo.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.asgt.dataservice.v1alpha1.DatasetInfo;
  return proto.asgt.dataservice.v1alpha1.DatasetInfo.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.asgt.dataservice.v1alpha1.DatasetInfo} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.asgt.dataservice.v1alpha1.DatasetInfo}
 */
proto.asgt.dataservice.v1alpha1.DatasetInfo.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setConsumer(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setName(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setType(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.addTags(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.addTargets(value);
      break;
    case 9:
      var value = new asgt_type_retention_policy_pb.RetentionPolicy;
      reader.readMessage(value,asgt_type_retention_policy_pb.RetentionPolicy.deserializeBinaryFromReader);
      msg.setRetentionPolicy(value);
      break;
    case 10:
      var value = new google_protobuf_timestamp_pb.Timestamp;
      reader.readMessage(value,google_protobuf_timestamp_pb.Timestamp.deserializeBinaryFromReader);
      msg.setTrainingGracePeriodEnd(value);
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
proto.asgt.dataservice.v1alpha1.DatasetInfo.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.asgt.dataservice.v1alpha1.DatasetInfo.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.asgt.dataservice.v1alpha1.DatasetInfo} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.dataservice.v1alpha1.DatasetInfo.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getConsumer();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getName();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getType();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getTagsList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      4,
      f
    );
  }
  f = message.getTargetsList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      5,
      f
    );
  }
  f = message.getRetentionPolicy();
  if (f != null) {
    writer.writeMessage(
      9,
      f,
      asgt_type_retention_policy_pb.RetentionPolicy.serializeBinaryToWriter
    );
  }
  f = message.getTrainingGracePeriodEnd();
  if (f != null) {
    writer.writeMessage(
      10,
      f,
      google_protobuf_timestamp_pb.Timestamp.serializeBinaryToWriter
    );
  }
};


/**
 * optional string consumer = 1;
 * @return {string}
 */
proto.asgt.dataservice.v1alpha1.DatasetInfo.prototype.getConsumer = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/** @param {string} value */
proto.asgt.dataservice.v1alpha1.DatasetInfo.prototype.setConsumer = function(value) {
  jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string name = 2;
 * @return {string}
 */
proto.asgt.dataservice.v1alpha1.DatasetInfo.prototype.getName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/** @param {string} value */
proto.asgt.dataservice.v1alpha1.DatasetInfo.prototype.setName = function(value) {
  jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string type = 3;
 * @return {string}
 */
proto.asgt.dataservice.v1alpha1.DatasetInfo.prototype.getType = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/** @param {string} value */
proto.asgt.dataservice.v1alpha1.DatasetInfo.prototype.setType = function(value) {
  jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * repeated string tags = 4;
 * @return {!Array<string>}
 */
proto.asgt.dataservice.v1alpha1.DatasetInfo.prototype.getTagsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 4));
};


/** @param {!Array<string>} value */
proto.asgt.dataservice.v1alpha1.DatasetInfo.prototype.setTagsList = function(value) {
  jspb.Message.setField(this, 4, value || []);
};


/**
 * @param {!string} value
 * @param {number=} opt_index
 */
proto.asgt.dataservice.v1alpha1.DatasetInfo.prototype.addTags = function(value, opt_index) {
  jspb.Message.addToRepeatedField(this, 4, value, opt_index);
};


proto.asgt.dataservice.v1alpha1.DatasetInfo.prototype.clearTagsList = function() {
  this.setTagsList([]);
};


/**
 * repeated string targets = 5;
 * @return {!Array<string>}
 */
proto.asgt.dataservice.v1alpha1.DatasetInfo.prototype.getTargetsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 5));
};


/** @param {!Array<string>} value */
proto.asgt.dataservice.v1alpha1.DatasetInfo.prototype.setTargetsList = function(value) {
  jspb.Message.setField(this, 5, value || []);
};


/**
 * @param {!string} value
 * @param {number=} opt_index
 */
proto.asgt.dataservice.v1alpha1.DatasetInfo.prototype.addTargets = function(value, opt_index) {
  jspb.Message.addToRepeatedField(this, 5, value, opt_index);
};


proto.asgt.dataservice.v1alpha1.DatasetInfo.prototype.clearTargetsList = function() {
  this.setTargetsList([]);
};


/**
 * optional asgt.type.RetentionPolicy retention_policy = 9;
 * @return {?proto.asgt.type.RetentionPolicy}
 */
proto.asgt.dataservice.v1alpha1.DatasetInfo.prototype.getRetentionPolicy = function() {
  return /** @type{?proto.asgt.type.RetentionPolicy} */ (
    jspb.Message.getWrapperField(this, asgt_type_retention_policy_pb.RetentionPolicy, 9));
};


/** @param {?proto.asgt.type.RetentionPolicy|undefined} value */
proto.asgt.dataservice.v1alpha1.DatasetInfo.prototype.setRetentionPolicy = function(value) {
  jspb.Message.setWrapperField(this, 9, value);
};


proto.asgt.dataservice.v1alpha1.DatasetInfo.prototype.clearRetentionPolicy = function() {
  this.setRetentionPolicy(undefined);
};


/**
 * Returns whether this field is set.
 * @return {!boolean}
 */
proto.asgt.dataservice.v1alpha1.DatasetInfo.prototype.hasRetentionPolicy = function() {
  return jspb.Message.getField(this, 9) != null;
};


/**
 * optional google.protobuf.Timestamp training_grace_period_end = 10;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.asgt.dataservice.v1alpha1.DatasetInfo.prototype.getTrainingGracePeriodEnd = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, google_protobuf_timestamp_pb.Timestamp, 10));
};


/** @param {?proto.google.protobuf.Timestamp|undefined} value */
proto.asgt.dataservice.v1alpha1.DatasetInfo.prototype.setTrainingGracePeriodEnd = function(value) {
  jspb.Message.setWrapperField(this, 10, value);
};


proto.asgt.dataservice.v1alpha1.DatasetInfo.prototype.clearTrainingGracePeriodEnd = function() {
  this.setTrainingGracePeriodEnd(undefined);
};


/**
 * Returns whether this field is set.
 * @return {!boolean}
 */
proto.asgt.dataservice.v1alpha1.DatasetInfo.prototype.hasTrainingGracePeriodEnd = function() {
  return jspb.Message.getField(this, 10) != null;
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
proto.asgt.dataservice.v1alpha1.GetDatasetResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.asgt.dataservice.v1alpha1.GetDatasetResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  proto.asgt.dataservice.v1alpha1.GetDatasetResponse.displayName = 'proto.asgt.dataservice.v1alpha1.GetDatasetResponse';
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
proto.asgt.dataservice.v1alpha1.GetDatasetResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.asgt.dataservice.v1alpha1.GetDatasetResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.asgt.dataservice.v1alpha1.GetDatasetResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.dataservice.v1alpha1.GetDatasetResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    info: (f = msg.getInfo()) && proto.asgt.dataservice.v1alpha1.DatasetInfo.toObject(includeInstance, f)
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
 * @return {!proto.asgt.dataservice.v1alpha1.GetDatasetResponse}
 */
proto.asgt.dataservice.v1alpha1.GetDatasetResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.asgt.dataservice.v1alpha1.GetDatasetResponse;
  return proto.asgt.dataservice.v1alpha1.GetDatasetResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.asgt.dataservice.v1alpha1.GetDatasetResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.asgt.dataservice.v1alpha1.GetDatasetResponse}
 */
proto.asgt.dataservice.v1alpha1.GetDatasetResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.asgt.dataservice.v1alpha1.DatasetInfo;
      reader.readMessage(value,proto.asgt.dataservice.v1alpha1.DatasetInfo.deserializeBinaryFromReader);
      msg.setInfo(value);
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
proto.asgt.dataservice.v1alpha1.GetDatasetResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.asgt.dataservice.v1alpha1.GetDatasetResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.asgt.dataservice.v1alpha1.GetDatasetResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.dataservice.v1alpha1.GetDatasetResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getInfo();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.asgt.dataservice.v1alpha1.DatasetInfo.serializeBinaryToWriter
    );
  }
};


/**
 * optional DatasetInfo info = 1;
 * @return {?proto.asgt.dataservice.v1alpha1.DatasetInfo}
 */
proto.asgt.dataservice.v1alpha1.GetDatasetResponse.prototype.getInfo = function() {
  return /** @type{?proto.asgt.dataservice.v1alpha1.DatasetInfo} */ (
    jspb.Message.getWrapperField(this, proto.asgt.dataservice.v1alpha1.DatasetInfo, 1));
};


/** @param {?proto.asgt.dataservice.v1alpha1.DatasetInfo|undefined} value */
proto.asgt.dataservice.v1alpha1.GetDatasetResponse.prototype.setInfo = function(value) {
  jspb.Message.setWrapperField(this, 1, value);
};


proto.asgt.dataservice.v1alpha1.GetDatasetResponse.prototype.clearInfo = function() {
  this.setInfo(undefined);
};


/**
 * Returns whether this field is set.
 * @return {!boolean}
 */
proto.asgt.dataservice.v1alpha1.GetDatasetResponse.prototype.hasInfo = function() {
  return jspb.Message.getField(this, 1) != null;
};


goog.object.extend(exports, proto.asgt.dataservice.v1alpha1);
