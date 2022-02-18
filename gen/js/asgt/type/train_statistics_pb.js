// source: asgt/type/train_statistics.proto
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

goog.exportSymbol('proto.asgt.type.FeatureStat', null, global);
goog.exportSymbol('proto.asgt.type.FeatureStat.Type', null, global);
goog.exportSymbol('proto.asgt.type.FeatureStats', null, global);
goog.exportSymbol('proto.asgt.type.TargetStat', null, global);
goog.exportSymbol('proto.asgt.type.TargetStats', null, global);
goog.exportSymbol('proto.asgt.type.TrainStatistics', null, global);
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
proto.asgt.type.TargetStat = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.asgt.type.TargetStat, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.asgt.type.TargetStat.displayName = 'proto.asgt.type.TargetStat';
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
proto.asgt.type.TargetStats = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.asgt.type.TargetStats, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.asgt.type.TargetStats.displayName = 'proto.asgt.type.TargetStats';
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
proto.asgt.type.FeatureStat = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.asgt.type.FeatureStat, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.asgt.type.FeatureStat.displayName = 'proto.asgt.type.FeatureStat';
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
proto.asgt.type.FeatureStats = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.asgt.type.FeatureStats, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.asgt.type.FeatureStats.displayName = 'proto.asgt.type.FeatureStats';
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
proto.asgt.type.TrainStatistics = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.asgt.type.TrainStatistics, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.asgt.type.TrainStatistics.displayName = 'proto.asgt.type.TrainStatistics';
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
proto.asgt.type.TargetStat.prototype.toObject = function(opt_includeInstance) {
  return proto.asgt.type.TargetStat.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.asgt.type.TargetStat} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.type.TargetStat.toObject = function(includeInstance, msg) {
  var f, obj = {
    relativeDatasetProportion: jspb.Message.getFloatingPointFieldWithDefault(msg, 1, 0.0),
    absoluteDatasetProportion: jspb.Message.getFieldWithDefault(msg, 2, 0)
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
 * @return {!proto.asgt.type.TargetStat}
 */
proto.asgt.type.TargetStat.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.asgt.type.TargetStat;
  return proto.asgt.type.TargetStat.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.asgt.type.TargetStat} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.asgt.type.TargetStat}
 */
proto.asgt.type.TargetStat.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readFloat());
      msg.setRelativeDatasetProportion(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readInt32());
      msg.setAbsoluteDatasetProportion(value);
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
proto.asgt.type.TargetStat.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.asgt.type.TargetStat.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.asgt.type.TargetStat} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.type.TargetStat.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getRelativeDatasetProportion();
  if (f !== 0.0) {
    writer.writeFloat(
      1,
      f
    );
  }
  f = message.getAbsoluteDatasetProportion();
  if (f !== 0) {
    writer.writeInt32(
      2,
      f
    );
  }
};


/**
 * optional float relative_dataset_proportion = 1;
 * @return {number}
 */
proto.asgt.type.TargetStat.prototype.getRelativeDatasetProportion = function() {
  return /** @type {number} */ (jspb.Message.getFloatingPointFieldWithDefault(this, 1, 0.0));
};


/**
 * @param {number} value
 * @return {!proto.asgt.type.TargetStat} returns this
 */
proto.asgt.type.TargetStat.prototype.setRelativeDatasetProportion = function(value) {
  return jspb.Message.setProto3FloatField(this, 1, value);
};


/**
 * optional int32 absolute_dataset_proportion = 2;
 * @return {number}
 */
proto.asgt.type.TargetStat.prototype.getAbsoluteDatasetProportion = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.asgt.type.TargetStat} returns this
 */
proto.asgt.type.TargetStat.prototype.setAbsoluteDatasetProportion = function(value) {
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
proto.asgt.type.TargetStats.prototype.toObject = function(opt_includeInstance) {
  return proto.asgt.type.TargetStats.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.asgt.type.TargetStats} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.type.TargetStats.toObject = function(includeInstance, msg) {
  var f, obj = {
    targetStatByClassMap: (f = msg.getTargetStatByClassMap()) ? f.toObject(includeInstance, proto.asgt.type.TargetStat.toObject) : []
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
 * @return {!proto.asgt.type.TargetStats}
 */
proto.asgt.type.TargetStats.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.asgt.type.TargetStats;
  return proto.asgt.type.TargetStats.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.asgt.type.TargetStats} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.asgt.type.TargetStats}
 */
proto.asgt.type.TargetStats.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = msg.getTargetStatByClassMap();
      reader.readMessage(value, function(message, reader) {
        jspb.Map.deserializeBinary(message, reader, jspb.BinaryReader.prototype.readString, jspb.BinaryReader.prototype.readMessage, proto.asgt.type.TargetStat.deserializeBinaryFromReader, "", new proto.asgt.type.TargetStat());
         });
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
proto.asgt.type.TargetStats.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.asgt.type.TargetStats.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.asgt.type.TargetStats} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.type.TargetStats.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getTargetStatByClassMap(true);
  if (f && f.getLength() > 0) {
    f.serializeBinary(1, writer, jspb.BinaryWriter.prototype.writeString, jspb.BinaryWriter.prototype.writeMessage, proto.asgt.type.TargetStat.serializeBinaryToWriter);
  }
};


/**
 * map<string, TargetStat> target_stat_by_class = 1;
 * @param {boolean=} opt_noLazyCreate Do not create the map if
 * empty, instead returning `undefined`
 * @return {!jspb.Map<string,!proto.asgt.type.TargetStat>}
 */
proto.asgt.type.TargetStats.prototype.getTargetStatByClassMap = function(opt_noLazyCreate) {
  return /** @type {!jspb.Map<string,!proto.asgt.type.TargetStat>} */ (
      jspb.Message.getMapField(this, 1, opt_noLazyCreate,
      proto.asgt.type.TargetStat));
};


/**
 * Clears values from the map. The map will be non-null.
 * @return {!proto.asgt.type.TargetStats} returns this
 */
proto.asgt.type.TargetStats.prototype.clearTargetStatByClassMap = function() {
  this.getTargetStatByClassMap().clear();
  return this;};





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
proto.asgt.type.FeatureStat.prototype.toObject = function(opt_includeInstance) {
  return proto.asgt.type.FeatureStat.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.asgt.type.FeatureStat} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.type.FeatureStat.toObject = function(includeInstance, msg) {
  var f, obj = {
    featureType: jspb.Message.getFieldWithDefault(msg, 1, 0),
    informationGain: jspb.Message.getFloatingPointFieldWithDefault(msg, 2, 0.0)
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
 * @return {!proto.asgt.type.FeatureStat}
 */
proto.asgt.type.FeatureStat.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.asgt.type.FeatureStat;
  return proto.asgt.type.FeatureStat.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.asgt.type.FeatureStat} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.asgt.type.FeatureStat}
 */
proto.asgt.type.FeatureStat.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!proto.asgt.type.FeatureStat.Type} */ (reader.readEnum());
      msg.setFeatureType(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readFloat());
      msg.setInformationGain(value);
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
proto.asgt.type.FeatureStat.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.asgt.type.FeatureStat.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.asgt.type.FeatureStat} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.type.FeatureStat.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getFeatureType();
  if (f !== 0.0) {
    writer.writeEnum(
      1,
      f
    );
  }
  f = message.getInformationGain();
  if (f !== 0.0) {
    writer.writeFloat(
      2,
      f
    );
  }
};


/**
 * @enum {number}
 */
proto.asgt.type.FeatureStat.Type = {
  INT: 0,
  FLOAT: 1,
  STRING: 2,
  BYTES: 3,
  STRUCT: 4
};

/**
 * optional Type feature_type = 1;
 * @return {!proto.asgt.type.FeatureStat.Type}
 */
proto.asgt.type.FeatureStat.prototype.getFeatureType = function() {
  return /** @type {!proto.asgt.type.FeatureStat.Type} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {!proto.asgt.type.FeatureStat.Type} value
 * @return {!proto.asgt.type.FeatureStat} returns this
 */
proto.asgt.type.FeatureStat.prototype.setFeatureType = function(value) {
  return jspb.Message.setProto3EnumField(this, 1, value);
};


/**
 * optional float information_gain = 2;
 * @return {number}
 */
proto.asgt.type.FeatureStat.prototype.getInformationGain = function() {
  return /** @type {number} */ (jspb.Message.getFloatingPointFieldWithDefault(this, 2, 0.0));
};


/**
 * @param {number} value
 * @return {!proto.asgt.type.FeatureStat} returns this
 */
proto.asgt.type.FeatureStat.prototype.setInformationGain = function(value) {
  return jspb.Message.setProto3FloatField(this, 2, value);
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
proto.asgt.type.FeatureStats.prototype.toObject = function(opt_includeInstance) {
  return proto.asgt.type.FeatureStats.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.asgt.type.FeatureStats} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.type.FeatureStats.toObject = function(includeInstance, msg) {
  var f, obj = {
    featureStatsByFeatureMap: (f = msg.getFeatureStatsByFeatureMap()) ? f.toObject(includeInstance, proto.asgt.type.FeatureStat.toObject) : []
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
 * @return {!proto.asgt.type.FeatureStats}
 */
proto.asgt.type.FeatureStats.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.asgt.type.FeatureStats;
  return proto.asgt.type.FeatureStats.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.asgt.type.FeatureStats} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.asgt.type.FeatureStats}
 */
proto.asgt.type.FeatureStats.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = msg.getFeatureStatsByFeatureMap();
      reader.readMessage(value, function(message, reader) {
        jspb.Map.deserializeBinary(message, reader, jspb.BinaryReader.prototype.readString, jspb.BinaryReader.prototype.readMessage, proto.asgt.type.FeatureStat.deserializeBinaryFromReader, "", new proto.asgt.type.FeatureStat());
         });
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
proto.asgt.type.FeatureStats.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.asgt.type.FeatureStats.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.asgt.type.FeatureStats} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.type.FeatureStats.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getFeatureStatsByFeatureMap(true);
  if (f && f.getLength() > 0) {
    f.serializeBinary(1, writer, jspb.BinaryWriter.prototype.writeString, jspb.BinaryWriter.prototype.writeMessage, proto.asgt.type.FeatureStat.serializeBinaryToWriter);
  }
};


/**
 * map<string, FeatureStat> feature_stats_by_feature = 1;
 * @param {boolean=} opt_noLazyCreate Do not create the map if
 * empty, instead returning `undefined`
 * @return {!jspb.Map<string,!proto.asgt.type.FeatureStat>}
 */
proto.asgt.type.FeatureStats.prototype.getFeatureStatsByFeatureMap = function(opt_noLazyCreate) {
  return /** @type {!jspb.Map<string,!proto.asgt.type.FeatureStat>} */ (
      jspb.Message.getMapField(this, 1, opt_noLazyCreate,
      proto.asgt.type.FeatureStat));
};


/**
 * Clears values from the map. The map will be non-null.
 * @return {!proto.asgt.type.FeatureStats} returns this
 */
proto.asgt.type.FeatureStats.prototype.clearFeatureStatsByFeatureMap = function() {
  this.getFeatureStatsByFeatureMap().clear();
  return this;};





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
proto.asgt.type.TrainStatistics.prototype.toObject = function(opt_includeInstance) {
  return proto.asgt.type.TrainStatistics.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.asgt.type.TrainStatistics} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.type.TrainStatistics.toObject = function(includeInstance, msg) {
  var f, obj = {
    targetStatsByTargetMap: (f = msg.getTargetStatsByTargetMap()) ? f.toObject(includeInstance, proto.asgt.type.TargetStats.toObject) : [],
    featureStatsByTargetMap: (f = msg.getFeatureStatsByTargetMap()) ? f.toObject(includeInstance, proto.asgt.type.FeatureStats.toObject) : [],
    similarityIndex: jspb.Message.getFloatingPointFieldWithDefault(msg, 3, 0.0)
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
 * @return {!proto.asgt.type.TrainStatistics}
 */
proto.asgt.type.TrainStatistics.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.asgt.type.TrainStatistics;
  return proto.asgt.type.TrainStatistics.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.asgt.type.TrainStatistics} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.asgt.type.TrainStatistics}
 */
proto.asgt.type.TrainStatistics.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = msg.getTargetStatsByTargetMap();
      reader.readMessage(value, function(message, reader) {
        jspb.Map.deserializeBinary(message, reader, jspb.BinaryReader.prototype.readString, jspb.BinaryReader.prototype.readMessage, proto.asgt.type.TargetStats.deserializeBinaryFromReader, "", new proto.asgt.type.TargetStats());
         });
      break;
    case 2:
      var value = msg.getFeatureStatsByTargetMap();
      reader.readMessage(value, function(message, reader) {
        jspb.Map.deserializeBinary(message, reader, jspb.BinaryReader.prototype.readString, jspb.BinaryReader.prototype.readMessage, proto.asgt.type.FeatureStats.deserializeBinaryFromReader, "", new proto.asgt.type.FeatureStats());
         });
      break;
    case 3:
      var value = /** @type {number} */ (reader.readFloat());
      msg.setSimilarityIndex(value);
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
proto.asgt.type.TrainStatistics.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.asgt.type.TrainStatistics.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.asgt.type.TrainStatistics} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.type.TrainStatistics.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getTargetStatsByTargetMap(true);
  if (f && f.getLength() > 0) {
    f.serializeBinary(1, writer, jspb.BinaryWriter.prototype.writeString, jspb.BinaryWriter.prototype.writeMessage, proto.asgt.type.TargetStats.serializeBinaryToWriter);
  }
  f = message.getFeatureStatsByTargetMap(true);
  if (f && f.getLength() > 0) {
    f.serializeBinary(2, writer, jspb.BinaryWriter.prototype.writeString, jspb.BinaryWriter.prototype.writeMessage, proto.asgt.type.FeatureStats.serializeBinaryToWriter);
  }
  f = message.getSimilarityIndex();
  if (f !== 0.0) {
    writer.writeFloat(
      3,
      f
    );
  }
};


/**
 * map<string, TargetStats> target_stats_by_target = 1;
 * @param {boolean=} opt_noLazyCreate Do not create the map if
 * empty, instead returning `undefined`
 * @return {!jspb.Map<string,!proto.asgt.type.TargetStats>}
 */
proto.asgt.type.TrainStatistics.prototype.getTargetStatsByTargetMap = function(opt_noLazyCreate) {
  return /** @type {!jspb.Map<string,!proto.asgt.type.TargetStats>} */ (
      jspb.Message.getMapField(this, 1, opt_noLazyCreate,
      proto.asgt.type.TargetStats));
};


/**
 * Clears values from the map. The map will be non-null.
 * @return {!proto.asgt.type.TrainStatistics} returns this
 */
proto.asgt.type.TrainStatistics.prototype.clearTargetStatsByTargetMap = function() {
  this.getTargetStatsByTargetMap().clear();
  return this;};


/**
 * map<string, FeatureStats> feature_stats_by_target = 2;
 * @param {boolean=} opt_noLazyCreate Do not create the map if
 * empty, instead returning `undefined`
 * @return {!jspb.Map<string,!proto.asgt.type.FeatureStats>}
 */
proto.asgt.type.TrainStatistics.prototype.getFeatureStatsByTargetMap = function(opt_noLazyCreate) {
  return /** @type {!jspb.Map<string,!proto.asgt.type.FeatureStats>} */ (
      jspb.Message.getMapField(this, 2, opt_noLazyCreate,
      proto.asgt.type.FeatureStats));
};


/**
 * Clears values from the map. The map will be non-null.
 * @return {!proto.asgt.type.TrainStatistics} returns this
 */
proto.asgt.type.TrainStatistics.prototype.clearFeatureStatsByTargetMap = function() {
  this.getFeatureStatsByTargetMap().clear();
  return this;};


/**
 * optional float similarity_index = 3;
 * @return {number}
 */
proto.asgt.type.TrainStatistics.prototype.getSimilarityIndex = function() {
  return /** @type {number} */ (jspb.Message.getFloatingPointFieldWithDefault(this, 3, 0.0));
};


/**
 * @param {number} value
 * @return {!proto.asgt.type.TrainStatistics} returns this
 */
proto.asgt.type.TrainStatistics.prototype.setSimilarityIndex = function(value) {
  return jspb.Message.setProto3FloatField(this, 3, value);
};


goog.object.extend(exports, proto.asgt.type);
