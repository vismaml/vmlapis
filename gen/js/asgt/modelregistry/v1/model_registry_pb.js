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
var asgt_type_revision_pb = require('../../../asgt/type/revision_pb.js');
var asgt_type_target_metrics_pb = require('../../../asgt/type/target_metrics_pb.js');
var google_protobuf_empty_pb = require('google-protobuf/google/protobuf/empty_pb.js');
goog.exportSymbol('proto.asgt.modelregistry.v1.GetCurrentModelRequest', null, global);
goog.exportSymbol('proto.asgt.modelregistry.v1.GetCurrentModelResponse', null, global);
goog.exportSymbol('proto.asgt.modelregistry.v1.RegisterModelRequest', null, global);
goog.exportSymbol('proto.asgt.modelregistry.v1.RegisterQueryStatsRequest', null, global);

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
proto.asgt.modelregistry.v1.RegisterModelRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.asgt.modelregistry.v1.RegisterModelRequest.repeatedFields_, null);
};
goog.inherits(proto.asgt.modelregistry.v1.RegisterModelRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  proto.asgt.modelregistry.v1.RegisterModelRequest.displayName = 'proto.asgt.modelregistry.v1.RegisterModelRequest';
}
/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.asgt.modelregistry.v1.RegisterModelRequest.repeatedFields_ = [5];



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
proto.asgt.modelregistry.v1.RegisterModelRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.asgt.modelregistry.v1.RegisterModelRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.asgt.modelregistry.v1.RegisterModelRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.modelregistry.v1.RegisterModelRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    dataset: (f = msg.getDataset()) && asgt_type_dataset_pb.Dataset.toObject(includeInstance, f),
    revision: (f = msg.getRevision()) && asgt_type_revision_pb.Revision.toObject(includeInstance, f),
    modelVersion: jspb.Message.getFieldWithDefault(msg, 3, 0),
    metricsMap: (f = msg.getMetricsMap()) ? f.toObject(includeInstance, undefined) : [],
    targetMetricsList: jspb.Message.toObjectList(msg.getTargetMetricsList(),
    asgt_type_target_metrics_pb.TargetMetrics.toObject, includeInstance)
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
 * @return {!proto.asgt.modelregistry.v1.RegisterModelRequest}
 */
proto.asgt.modelregistry.v1.RegisterModelRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.asgt.modelregistry.v1.RegisterModelRequest;
  return proto.asgt.modelregistry.v1.RegisterModelRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.asgt.modelregistry.v1.RegisterModelRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.asgt.modelregistry.v1.RegisterModelRequest}
 */
proto.asgt.modelregistry.v1.RegisterModelRequest.deserializeBinaryFromReader = function(msg, reader) {
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
      var value = new asgt_type_revision_pb.Revision;
      reader.readMessage(value,asgt_type_revision_pb.Revision.deserializeBinaryFromReader);
      msg.setRevision(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setModelVersion(value);
      break;
    case 4:
      var value = msg.getMetricsMap();
      reader.readMessage(value, function(message, reader) {
        jspb.Map.deserializeBinary(message, reader, jspb.BinaryReader.prototype.readString, jspb.BinaryReader.prototype.readInt32, null, "");
         });
      break;
    case 5:
      var value = new asgt_type_target_metrics_pb.TargetMetrics;
      reader.readMessage(value,asgt_type_target_metrics_pb.TargetMetrics.deserializeBinaryFromReader);
      msg.addTargetMetrics(value);
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
proto.asgt.modelregistry.v1.RegisterModelRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.asgt.modelregistry.v1.RegisterModelRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.asgt.modelregistry.v1.RegisterModelRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.modelregistry.v1.RegisterModelRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDataset();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      asgt_type_dataset_pb.Dataset.serializeBinaryToWriter
    );
  }
  f = message.getRevision();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      asgt_type_revision_pb.Revision.serializeBinaryToWriter
    );
  }
  f = message.getModelVersion();
  if (f !== 0) {
    writer.writeInt64(
      3,
      f
    );
  }
  f = message.getMetricsMap(true);
  if (f && f.getLength() > 0) {
    f.serializeBinary(4, writer, jspb.BinaryWriter.prototype.writeString, jspb.BinaryWriter.prototype.writeInt32);
  }
  f = message.getTargetMetricsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      5,
      f,
      asgt_type_target_metrics_pb.TargetMetrics.serializeBinaryToWriter
    );
  }
};


/**
 * optional asgt.type.Dataset dataset = 1;
 * @return {?proto.asgt.type.Dataset}
 */
proto.asgt.modelregistry.v1.RegisterModelRequest.prototype.getDataset = function() {
  return /** @type{?proto.asgt.type.Dataset} */ (
    jspb.Message.getWrapperField(this, asgt_type_dataset_pb.Dataset, 1));
};


/** @param {?proto.asgt.type.Dataset|undefined} value */
proto.asgt.modelregistry.v1.RegisterModelRequest.prototype.setDataset = function(value) {
  jspb.Message.setWrapperField(this, 1, value);
};


proto.asgt.modelregistry.v1.RegisterModelRequest.prototype.clearDataset = function() {
  this.setDataset(undefined);
};


/**
 * Returns whether this field is set.
 * @return {!boolean}
 */
proto.asgt.modelregistry.v1.RegisterModelRequest.prototype.hasDataset = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional asgt.type.Revision revision = 2;
 * @return {?proto.asgt.type.Revision}
 */
proto.asgt.modelregistry.v1.RegisterModelRequest.prototype.getRevision = function() {
  return /** @type{?proto.asgt.type.Revision} */ (
    jspb.Message.getWrapperField(this, asgt_type_revision_pb.Revision, 2));
};


/** @param {?proto.asgt.type.Revision|undefined} value */
proto.asgt.modelregistry.v1.RegisterModelRequest.prototype.setRevision = function(value) {
  jspb.Message.setWrapperField(this, 2, value);
};


proto.asgt.modelregistry.v1.RegisterModelRequest.prototype.clearRevision = function() {
  this.setRevision(undefined);
};


/**
 * Returns whether this field is set.
 * @return {!boolean}
 */
proto.asgt.modelregistry.v1.RegisterModelRequest.prototype.hasRevision = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional int64 model_version = 3;
 * @return {number}
 */
proto.asgt.modelregistry.v1.RegisterModelRequest.prototype.getModelVersion = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/** @param {number} value */
proto.asgt.modelregistry.v1.RegisterModelRequest.prototype.setModelVersion = function(value) {
  jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * map<string, int32> metrics = 4;
 * @param {boolean=} opt_noLazyCreate Do not create the map if
 * empty, instead returning `undefined`
 * @return {!jspb.Map<string,number>}
 */
proto.asgt.modelregistry.v1.RegisterModelRequest.prototype.getMetricsMap = function(opt_noLazyCreate) {
  return /** @type {!jspb.Map<string,number>} */ (
      jspb.Message.getMapField(this, 4, opt_noLazyCreate,
      null));
};


proto.asgt.modelregistry.v1.RegisterModelRequest.prototype.clearMetricsMap = function() {
  this.getMetricsMap().clear();
};


/**
 * repeated asgt.type.TargetMetrics target_metrics = 5;
 * @return {!Array<!proto.asgt.type.TargetMetrics>}
 */
proto.asgt.modelregistry.v1.RegisterModelRequest.prototype.getTargetMetricsList = function() {
  return /** @type{!Array<!proto.asgt.type.TargetMetrics>} */ (
    jspb.Message.getRepeatedWrapperField(this, asgt_type_target_metrics_pb.TargetMetrics, 5));
};


/** @param {!Array<!proto.asgt.type.TargetMetrics>} value */
proto.asgt.modelregistry.v1.RegisterModelRequest.prototype.setTargetMetricsList = function(value) {
  jspb.Message.setRepeatedWrapperField(this, 5, value);
};


/**
 * @param {!proto.asgt.type.TargetMetrics=} opt_value
 * @param {number=} opt_index
 * @return {!proto.asgt.type.TargetMetrics}
 */
proto.asgt.modelregistry.v1.RegisterModelRequest.prototype.addTargetMetrics = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 5, opt_value, proto.asgt.type.TargetMetrics, opt_index);
};


proto.asgt.modelregistry.v1.RegisterModelRequest.prototype.clearTargetMetricsList = function() {
  this.setTargetMetricsList([]);
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
proto.asgt.modelregistry.v1.GetCurrentModelRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.asgt.modelregistry.v1.GetCurrentModelRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  proto.asgt.modelregistry.v1.GetCurrentModelRequest.displayName = 'proto.asgt.modelregistry.v1.GetCurrentModelRequest';
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
proto.asgt.modelregistry.v1.GetCurrentModelRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.asgt.modelregistry.v1.GetCurrentModelRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.asgt.modelregistry.v1.GetCurrentModelRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.modelregistry.v1.GetCurrentModelRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    dataset: (f = msg.getDataset()) && asgt_type_dataset_pb.Dataset.toObject(includeInstance, f)
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
 * @return {!proto.asgt.modelregistry.v1.GetCurrentModelRequest}
 */
proto.asgt.modelregistry.v1.GetCurrentModelRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.asgt.modelregistry.v1.GetCurrentModelRequest;
  return proto.asgt.modelregistry.v1.GetCurrentModelRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.asgt.modelregistry.v1.GetCurrentModelRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.asgt.modelregistry.v1.GetCurrentModelRequest}
 */
proto.asgt.modelregistry.v1.GetCurrentModelRequest.deserializeBinaryFromReader = function(msg, reader) {
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
proto.asgt.modelregistry.v1.GetCurrentModelRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.asgt.modelregistry.v1.GetCurrentModelRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.asgt.modelregistry.v1.GetCurrentModelRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.modelregistry.v1.GetCurrentModelRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDataset();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      asgt_type_dataset_pb.Dataset.serializeBinaryToWriter
    );
  }
};


/**
 * optional asgt.type.Dataset dataset = 1;
 * @return {?proto.asgt.type.Dataset}
 */
proto.asgt.modelregistry.v1.GetCurrentModelRequest.prototype.getDataset = function() {
  return /** @type{?proto.asgt.type.Dataset} */ (
    jspb.Message.getWrapperField(this, asgt_type_dataset_pb.Dataset, 1));
};


/** @param {?proto.asgt.type.Dataset|undefined} value */
proto.asgt.modelregistry.v1.GetCurrentModelRequest.prototype.setDataset = function(value) {
  jspb.Message.setWrapperField(this, 1, value);
};


proto.asgt.modelregistry.v1.GetCurrentModelRequest.prototype.clearDataset = function() {
  this.setDataset(undefined);
};


/**
 * Returns whether this field is set.
 * @return {!boolean}
 */
proto.asgt.modelregistry.v1.GetCurrentModelRequest.prototype.hasDataset = function() {
  return jspb.Message.getField(this, 1) != null;
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
proto.asgt.modelregistry.v1.GetCurrentModelResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.asgt.modelregistry.v1.GetCurrentModelResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  proto.asgt.modelregistry.v1.GetCurrentModelResponse.displayName = 'proto.asgt.modelregistry.v1.GetCurrentModelResponse';
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
proto.asgt.modelregistry.v1.GetCurrentModelResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.asgt.modelregistry.v1.GetCurrentModelResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.asgt.modelregistry.v1.GetCurrentModelResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.modelregistry.v1.GetCurrentModelResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
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
 * @return {!proto.asgt.modelregistry.v1.GetCurrentModelResponse}
 */
proto.asgt.modelregistry.v1.GetCurrentModelResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.asgt.modelregistry.v1.GetCurrentModelResponse;
  return proto.asgt.modelregistry.v1.GetCurrentModelResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.asgt.modelregistry.v1.GetCurrentModelResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.asgt.modelregistry.v1.GetCurrentModelResponse}
 */
proto.asgt.modelregistry.v1.GetCurrentModelResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
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
proto.asgt.modelregistry.v1.GetCurrentModelResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.asgt.modelregistry.v1.GetCurrentModelResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.asgt.modelregistry.v1.GetCurrentModelResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.modelregistry.v1.GetCurrentModelResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getModel();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      asgt_type_model_pb.Model.serializeBinaryToWriter
    );
  }
};


/**
 * optional asgt.type.Model model = 1;
 * @return {?proto.asgt.type.Model}
 */
proto.asgt.modelregistry.v1.GetCurrentModelResponse.prototype.getModel = function() {
  return /** @type{?proto.asgt.type.Model} */ (
    jspb.Message.getWrapperField(this, asgt_type_model_pb.Model, 1));
};


/** @param {?proto.asgt.type.Model|undefined} value */
proto.asgt.modelregistry.v1.GetCurrentModelResponse.prototype.setModel = function(value) {
  jspb.Message.setWrapperField(this, 1, value);
};


proto.asgt.modelregistry.v1.GetCurrentModelResponse.prototype.clearModel = function() {
  this.setModel(undefined);
};


/**
 * Returns whether this field is set.
 * @return {!boolean}
 */
proto.asgt.modelregistry.v1.GetCurrentModelResponse.prototype.hasModel = function() {
  return jspb.Message.getField(this, 1) != null;
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
proto.asgt.modelregistry.v1.RegisterQueryStatsRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.asgt.modelregistry.v1.RegisterQueryStatsRequest.repeatedFields_, null);
};
goog.inherits(proto.asgt.modelregistry.v1.RegisterQueryStatsRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  proto.asgt.modelregistry.v1.RegisterQueryStatsRequest.displayName = 'proto.asgt.modelregistry.v1.RegisterQueryStatsRequest';
}
/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.asgt.modelregistry.v1.RegisterQueryStatsRequest.repeatedFields_ = [5];



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
proto.asgt.modelregistry.v1.RegisterQueryStatsRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.asgt.modelregistry.v1.RegisterQueryStatsRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.asgt.modelregistry.v1.RegisterQueryStatsRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.modelregistry.v1.RegisterQueryStatsRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    consumer: jspb.Message.getFieldWithDefault(msg, 1, ""),
    dataset: jspb.Message.getFieldWithDefault(msg, 2, ""),
    modelType: jspb.Message.getFieldWithDefault(msg, 3, ""),
    batchSize: jspb.Message.getFieldWithDefault(msg, 4, 0),
    tagsList: jspb.Message.getRepeatedField(msg, 5)
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
 * @return {!proto.asgt.modelregistry.v1.RegisterQueryStatsRequest}
 */
proto.asgt.modelregistry.v1.RegisterQueryStatsRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.asgt.modelregistry.v1.RegisterQueryStatsRequest;
  return proto.asgt.modelregistry.v1.RegisterQueryStatsRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.asgt.modelregistry.v1.RegisterQueryStatsRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.asgt.modelregistry.v1.RegisterQueryStatsRequest}
 */
proto.asgt.modelregistry.v1.RegisterQueryStatsRequest.deserializeBinaryFromReader = function(msg, reader) {
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
      msg.setDataset(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setModelType(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readInt32());
      msg.setBatchSize(value);
      break;
    case 5:
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
proto.asgt.modelregistry.v1.RegisterQueryStatsRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.asgt.modelregistry.v1.RegisterQueryStatsRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.asgt.modelregistry.v1.RegisterQueryStatsRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.modelregistry.v1.RegisterQueryStatsRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getConsumer();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getDataset();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getModelType();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getBatchSize();
  if (f !== 0) {
    writer.writeInt32(
      4,
      f
    );
  }
  f = message.getTagsList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      5,
      f
    );
  }
};


/**
 * optional string consumer = 1;
 * @return {string}
 */
proto.asgt.modelregistry.v1.RegisterQueryStatsRequest.prototype.getConsumer = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/** @param {string} value */
proto.asgt.modelregistry.v1.RegisterQueryStatsRequest.prototype.setConsumer = function(value) {
  jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string dataset = 2;
 * @return {string}
 */
proto.asgt.modelregistry.v1.RegisterQueryStatsRequest.prototype.getDataset = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/** @param {string} value */
proto.asgt.modelregistry.v1.RegisterQueryStatsRequest.prototype.setDataset = function(value) {
  jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string model_type = 3;
 * @return {string}
 */
proto.asgt.modelregistry.v1.RegisterQueryStatsRequest.prototype.getModelType = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/** @param {string} value */
proto.asgt.modelregistry.v1.RegisterQueryStatsRequest.prototype.setModelType = function(value) {
  jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional int32 batch_size = 4;
 * @return {number}
 */
proto.asgt.modelregistry.v1.RegisterQueryStatsRequest.prototype.getBatchSize = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/** @param {number} value */
proto.asgt.modelregistry.v1.RegisterQueryStatsRequest.prototype.setBatchSize = function(value) {
  jspb.Message.setProto3IntField(this, 4, value);
};


/**
 * repeated string tags = 5;
 * @return {!Array<string>}
 */
proto.asgt.modelregistry.v1.RegisterQueryStatsRequest.prototype.getTagsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 5));
};


/** @param {!Array<string>} value */
proto.asgt.modelregistry.v1.RegisterQueryStatsRequest.prototype.setTagsList = function(value) {
  jspb.Message.setField(this, 5, value || []);
};


/**
 * @param {!string} value
 * @param {number=} opt_index
 */
proto.asgt.modelregistry.v1.RegisterQueryStatsRequest.prototype.addTags = function(value, opt_index) {
  jspb.Message.addToRepeatedField(this, 5, value, opt_index);
};


proto.asgt.modelregistry.v1.RegisterQueryStatsRequest.prototype.clearTagsList = function() {
  this.setTagsList([]);
};


goog.object.extend(exports, proto.asgt.modelregistry.v1);
