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

goog.exportSymbol('proto.asgt.type.TrainStatistics', null, global);
goog.exportSymbol('proto.asgt.type.TrainStatistics.InformationGain', null, global);

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
  jspb.Message.initialize(this, opt_data, 0, -1, proto.asgt.type.TrainStatistics.repeatedFields_, null);
};
goog.inherits(proto.asgt.type.TrainStatistics, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  proto.asgt.type.TrainStatistics.displayName = 'proto.asgt.type.TrainStatistics';
}
/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.asgt.type.TrainStatistics.repeatedFields_ = [2,3];



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
proto.asgt.type.TrainStatistics.prototype.toObject = function(opt_includeInstance) {
  return proto.asgt.type.TrainStatistics.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.asgt.type.TrainStatistics} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.type.TrainStatistics.toObject = function(includeInstance, msg) {
  var f, obj = {
    featureCount: +jspb.Message.getFieldWithDefault(msg, 1, 0.0),
    featureNamesList: jspb.Message.getRepeatedField(msg, 2),
    targetNamesList: jspb.Message.getRepeatedField(msg, 3),
    targetCountMap: (f = msg.getTargetCountMap()) ? f.toObject(includeInstance, undefined) : [],
    informationGainsMap: (f = msg.getInformationGainsMap()) ? f.toObject(includeInstance, proto.asgt.type.TrainStatistics.InformationGain.toObject) : [],
    similarityIndex: +jspb.Message.getFieldWithDefault(msg, 6, 0.0)
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
      var value = /** @type {number} */ (reader.readFloat());
      msg.setFeatureCount(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.addFeatureNames(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.addTargetNames(value);
      break;
    case 4:
      var value = msg.getTargetCountMap();
      reader.readMessage(value, function(message, reader) {
        jspb.Map.deserializeBinary(message, reader, jspb.BinaryReader.prototype.readString, jspb.BinaryReader.prototype.readFloat, null, "");
         });
      break;
    case 5:
      var value = msg.getInformationGainsMap();
      reader.readMessage(value, function(message, reader) {
        jspb.Map.deserializeBinary(message, reader, jspb.BinaryReader.prototype.readString, jspb.BinaryReader.prototype.readMessage, proto.asgt.type.TrainStatistics.InformationGain.deserializeBinaryFromReader, "");
         });
      break;
    case 6:
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
  f = message.getFeatureCount();
  if (f !== 0.0) {
    writer.writeFloat(
      1,
      f
    );
  }
  f = message.getFeatureNamesList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      2,
      f
    );
  }
  f = message.getTargetNamesList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      3,
      f
    );
  }
  f = message.getTargetCountMap(true);
  if (f && f.getLength() > 0) {
    f.serializeBinary(4, writer, jspb.BinaryWriter.prototype.writeString, jspb.BinaryWriter.prototype.writeFloat);
  }
  f = message.getInformationGainsMap(true);
  if (f && f.getLength() > 0) {
    f.serializeBinary(5, writer, jspb.BinaryWriter.prototype.writeString, jspb.BinaryWriter.prototype.writeMessage, proto.asgt.type.TrainStatistics.InformationGain.serializeBinaryToWriter);
  }
  f = message.getSimilarityIndex();
  if (f !== 0.0) {
    writer.writeFloat(
      6,
      f
    );
  }
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
proto.asgt.type.TrainStatistics.InformationGain = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.asgt.type.TrainStatistics.InformationGain, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  proto.asgt.type.TrainStatistics.InformationGain.displayName = 'proto.asgt.type.TrainStatistics.InformationGain';
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
proto.asgt.type.TrainStatistics.InformationGain.prototype.toObject = function(opt_includeInstance) {
  return proto.asgt.type.TrainStatistics.InformationGain.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.asgt.type.TrainStatistics.InformationGain} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.type.TrainStatistics.InformationGain.toObject = function(includeInstance, msg) {
  var f, obj = {
    featureGainsMap: (f = msg.getFeatureGainsMap()) ? f.toObject(includeInstance, undefined) : []
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
 * @return {!proto.asgt.type.TrainStatistics.InformationGain}
 */
proto.asgt.type.TrainStatistics.InformationGain.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.asgt.type.TrainStatistics.InformationGain;
  return proto.asgt.type.TrainStatistics.InformationGain.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.asgt.type.TrainStatistics.InformationGain} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.asgt.type.TrainStatistics.InformationGain}
 */
proto.asgt.type.TrainStatistics.InformationGain.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = msg.getFeatureGainsMap();
      reader.readMessage(value, function(message, reader) {
        jspb.Map.deserializeBinary(message, reader, jspb.BinaryReader.prototype.readString, jspb.BinaryReader.prototype.readFloat, null, "");
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
proto.asgt.type.TrainStatistics.InformationGain.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.asgt.type.TrainStatistics.InformationGain.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.asgt.type.TrainStatistics.InformationGain} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.type.TrainStatistics.InformationGain.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getFeatureGainsMap(true);
  if (f && f.getLength() > 0) {
    f.serializeBinary(1, writer, jspb.BinaryWriter.prototype.writeString, jspb.BinaryWriter.prototype.writeFloat);
  }
};


/**
 * map<string, float> feature_gains = 1;
 * @param {boolean=} opt_noLazyCreate Do not create the map if
 * empty, instead returning `undefined`
 * @return {!jspb.Map<string,number>}
 */
proto.asgt.type.TrainStatistics.InformationGain.prototype.getFeatureGainsMap = function(opt_noLazyCreate) {
  return /** @type {!jspb.Map<string,number>} */ (
      jspb.Message.getMapField(this, 1, opt_noLazyCreate,
      null));
};


proto.asgt.type.TrainStatistics.InformationGain.prototype.clearFeatureGainsMap = function() {
  this.getFeatureGainsMap().clear();
};


/**
 * optional float feature_count = 1;
 * @return {number}
 */
proto.asgt.type.TrainStatistics.prototype.getFeatureCount = function() {
  return /** @type {number} */ (+jspb.Message.getFieldWithDefault(this, 1, 0.0));
};


/** @param {number} value */
proto.asgt.type.TrainStatistics.prototype.setFeatureCount = function(value) {
  jspb.Message.setProto3FloatField(this, 1, value);
};


/**
 * repeated string feature_names = 2;
 * @return {!Array<string>}
 */
proto.asgt.type.TrainStatistics.prototype.getFeatureNamesList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 2));
};


/** @param {!Array<string>} value */
proto.asgt.type.TrainStatistics.prototype.setFeatureNamesList = function(value) {
  jspb.Message.setField(this, 2, value || []);
};


/**
 * @param {!string} value
 * @param {number=} opt_index
 */
proto.asgt.type.TrainStatistics.prototype.addFeatureNames = function(value, opt_index) {
  jspb.Message.addToRepeatedField(this, 2, value, opt_index);
};


proto.asgt.type.TrainStatistics.prototype.clearFeatureNamesList = function() {
  this.setFeatureNamesList([]);
};


/**
 * repeated string target_names = 3;
 * @return {!Array<string>}
 */
proto.asgt.type.TrainStatistics.prototype.getTargetNamesList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 3));
};


/** @param {!Array<string>} value */
proto.asgt.type.TrainStatistics.prototype.setTargetNamesList = function(value) {
  jspb.Message.setField(this, 3, value || []);
};


/**
 * @param {!string} value
 * @param {number=} opt_index
 */
proto.asgt.type.TrainStatistics.prototype.addTargetNames = function(value, opt_index) {
  jspb.Message.addToRepeatedField(this, 3, value, opt_index);
};


proto.asgt.type.TrainStatistics.prototype.clearTargetNamesList = function() {
  this.setTargetNamesList([]);
};


/**
 * map<string, float> target_count = 4;
 * @param {boolean=} opt_noLazyCreate Do not create the map if
 * empty, instead returning `undefined`
 * @return {!jspb.Map<string,number>}
 */
proto.asgt.type.TrainStatistics.prototype.getTargetCountMap = function(opt_noLazyCreate) {
  return /** @type {!jspb.Map<string,number>} */ (
      jspb.Message.getMapField(this, 4, opt_noLazyCreate,
      null));
};


proto.asgt.type.TrainStatistics.prototype.clearTargetCountMap = function() {
  this.getTargetCountMap().clear();
};


/**
 * map<string, InformationGain> information_gains = 5;
 * @param {boolean=} opt_noLazyCreate Do not create the map if
 * empty, instead returning `undefined`
 * @return {!jspb.Map<string,!proto.asgt.type.TrainStatistics.InformationGain>}
 */
proto.asgt.type.TrainStatistics.prototype.getInformationGainsMap = function(opt_noLazyCreate) {
  return /** @type {!jspb.Map<string,!proto.asgt.type.TrainStatistics.InformationGain>} */ (
      jspb.Message.getMapField(this, 5, opt_noLazyCreate,
      proto.asgt.type.TrainStatistics.InformationGain));
};


proto.asgt.type.TrainStatistics.prototype.clearInformationGainsMap = function() {
  this.getInformationGainsMap().clear();
};


/**
 * optional float similarity_index = 6;
 * @return {number}
 */
proto.asgt.type.TrainStatistics.prototype.getSimilarityIndex = function() {
  return /** @type {number} */ (+jspb.Message.getFieldWithDefault(this, 6, 0.0));
};


/** @param {number} value */
proto.asgt.type.TrainStatistics.prototype.setSimilarityIndex = function(value) {
  jspb.Message.setProto3FloatField(this, 6, value);
};


goog.object.extend(exports, proto.asgt.type);
