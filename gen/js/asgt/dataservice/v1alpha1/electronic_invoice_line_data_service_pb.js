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

var asgt_dataservice_v1alpha1_delete_pb = require('../../../asgt/dataservice/v1alpha1/delete_pb.js');
var asgt_type_invoice_line_pb = require('../../../asgt/type/invoice_line_pb.js');
var asgt_type_retention_policy_pb = require('../../../asgt/type/retention_policy_pb.js');
var asgt_type_target_value_pb = require('../../../asgt/type/target_value_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var google_protobuf_empty_pb = require('google-protobuf/google/protobuf/empty_pb.js');
goog.exportSymbol('proto.asgt.dataservice.v1alpha1.AppendElectronicInvoiceLineDataRequest', null, global);
goog.exportSymbol('proto.asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest', null, global);
goog.exportSymbol('proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput', null, global);

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
proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput.repeatedFields_, null);
};
goog.inherits(proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput.displayName = 'proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput';
}
/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput.repeatedFields_ = [2];



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
proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput.prototype.toObject = function(opt_includeInstance) {
  return proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput.toObject = function(includeInstance, msg) {
  var f, obj = {
    data: (f = msg.getData()) && asgt_type_invoice_line_pb.InvoiceLine.toObject(includeInstance, f),
    targetValuesList: jspb.Message.toObjectList(msg.getTargetValuesList(),
    asgt_type_target_value_pb.TargetValue.toObject, includeInstance)
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
 * @return {!proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput}
 */
proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput;
  return proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput}
 */
proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new asgt_type_invoice_line_pb.InvoiceLine;
      reader.readMessage(value,asgt_type_invoice_line_pb.InvoiceLine.deserializeBinaryFromReader);
      msg.setData(value);
      break;
    case 2:
      var value = new asgt_type_target_value_pb.TargetValue;
      reader.readMessage(value,asgt_type_target_value_pb.TargetValue.deserializeBinaryFromReader);
      msg.addTargetValues(value);
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
proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getData();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      asgt_type_invoice_line_pb.InvoiceLine.serializeBinaryToWriter
    );
  }
  f = message.getTargetValuesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      asgt_type_target_value_pb.TargetValue.serializeBinaryToWriter
    );
  }
};


/**
 * optional asgt.type.InvoiceLine data = 1;
 * @return {?proto.asgt.type.InvoiceLine}
 */
proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput.prototype.getData = function() {
  return /** @type{?proto.asgt.type.InvoiceLine} */ (
    jspb.Message.getWrapperField(this, asgt_type_invoice_line_pb.InvoiceLine, 1));
};


/** @param {?proto.asgt.type.InvoiceLine|undefined} value */
proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput.prototype.setData = function(value) {
  jspb.Message.setWrapperField(this, 1, value);
};


proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput.prototype.clearData = function() {
  this.setData(undefined);
};


/**
 * Returns whether this field is set.
 * @return {!boolean}
 */
proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput.prototype.hasData = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * repeated asgt.type.TargetValue target_values = 2;
 * @return {!Array<!proto.asgt.type.TargetValue>}
 */
proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput.prototype.getTargetValuesList = function() {
  return /** @type{!Array<!proto.asgt.type.TargetValue>} */ (
    jspb.Message.getRepeatedWrapperField(this, asgt_type_target_value_pb.TargetValue, 2));
};


/** @param {!Array<!proto.asgt.type.TargetValue>} value */
proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput.prototype.setTargetValuesList = function(value) {
  jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.asgt.type.TargetValue=} opt_value
 * @param {number=} opt_index
 * @return {!proto.asgt.type.TargetValue}
 */
proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput.prototype.addTargetValues = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.asgt.type.TargetValue, opt_index);
};


proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput.prototype.clearTargetValuesList = function() {
  this.setTargetValuesList([]);
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
proto.asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest.repeatedFields_, null);
};
goog.inherits(proto.asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  proto.asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest.displayName = 'proto.asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest';
}
/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest.repeatedFields_ = [2,5,3];



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
proto.asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    datasetName: jspb.Message.getFieldWithDefault(msg, 1, ""),
    tagsList: jspb.Message.getRepeatedField(msg, 2),
    targetsList: jspb.Message.getRepeatedField(msg, 5),
    entriesList: jspb.Message.toObjectList(msg.getEntriesList(),
    proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput.toObject, includeInstance),
    retentionPolicy: (f = msg.getRetentionPolicy()) && asgt_type_retention_policy_pb.RetentionPolicy.toObject(includeInstance, f)
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
 * @return {!proto.asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest}
 */
proto.asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest;
  return proto.asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest}
 */
proto.asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest.deserializeBinaryFromReader = function(msg, reader) {
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
      msg.addTags(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.addTargets(value);
      break;
    case 3:
      var value = new proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput;
      reader.readMessage(value,proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput.deserializeBinaryFromReader);
      msg.addEntries(value);
      break;
    case 4:
      var value = new asgt_type_retention_policy_pb.RetentionPolicy;
      reader.readMessage(value,asgt_type_retention_policy_pb.RetentionPolicy.deserializeBinaryFromReader);
      msg.setRetentionPolicy(value);
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
proto.asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDatasetName();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getTagsList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      2,
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
  f = message.getEntriesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput.serializeBinaryToWriter
    );
  }
  f = message.getRetentionPolicy();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      asgt_type_retention_policy_pb.RetentionPolicy.serializeBinaryToWriter
    );
  }
};


/**
 * optional string dataset_name = 1;
 * @return {string}
 */
proto.asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest.prototype.getDatasetName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/** @param {string} value */
proto.asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest.prototype.setDatasetName = function(value) {
  jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * repeated string tags = 2;
 * @return {!Array<string>}
 */
proto.asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest.prototype.getTagsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 2));
};


/** @param {!Array<string>} value */
proto.asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest.prototype.setTagsList = function(value) {
  jspb.Message.setField(this, 2, value || []);
};


/**
 * @param {!string} value
 * @param {number=} opt_index
 */
proto.asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest.prototype.addTags = function(value, opt_index) {
  jspb.Message.addToRepeatedField(this, 2, value, opt_index);
};


proto.asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest.prototype.clearTagsList = function() {
  this.setTagsList([]);
};


/**
 * repeated string targets = 5;
 * @return {!Array<string>}
 */
proto.asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest.prototype.getTargetsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 5));
};


/** @param {!Array<string>} value */
proto.asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest.prototype.setTargetsList = function(value) {
  jspb.Message.setField(this, 5, value || []);
};


/**
 * @param {!string} value
 * @param {number=} opt_index
 */
proto.asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest.prototype.addTargets = function(value, opt_index) {
  jspb.Message.addToRepeatedField(this, 5, value, opt_index);
};


proto.asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest.prototype.clearTargetsList = function() {
  this.setTargetsList([]);
};


/**
 * repeated ElectronicInvoiceLineEntryInput entries = 3;
 * @return {!Array<!proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput>}
 */
proto.asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest.prototype.getEntriesList = function() {
  return /** @type{!Array<!proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput, 3));
};


/** @param {!Array<!proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput>} value */
proto.asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest.prototype.setEntriesList = function(value) {
  jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput=} opt_value
 * @param {number=} opt_index
 * @return {!proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput}
 */
proto.asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest.prototype.addEntries = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput, opt_index);
};


proto.asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest.prototype.clearEntriesList = function() {
  this.setEntriesList([]);
};


/**
 * optional asgt.type.RetentionPolicy retention_policy = 4;
 * @return {?proto.asgt.type.RetentionPolicy}
 */
proto.asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest.prototype.getRetentionPolicy = function() {
  return /** @type{?proto.asgt.type.RetentionPolicy} */ (
    jspb.Message.getWrapperField(this, asgt_type_retention_policy_pb.RetentionPolicy, 4));
};


/** @param {?proto.asgt.type.RetentionPolicy|undefined} value */
proto.asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest.prototype.setRetentionPolicy = function(value) {
  jspb.Message.setWrapperField(this, 4, value);
};


proto.asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest.prototype.clearRetentionPolicy = function() {
  this.setRetentionPolicy(undefined);
};


/**
 * Returns whether this field is set.
 * @return {!boolean}
 */
proto.asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest.prototype.hasRetentionPolicy = function() {
  return jspb.Message.getField(this, 4) != null;
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
proto.asgt.dataservice.v1alpha1.AppendElectronicInvoiceLineDataRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.asgt.dataservice.v1alpha1.AppendElectronicInvoiceLineDataRequest.repeatedFields_, null);
};
goog.inherits(proto.asgt.dataservice.v1alpha1.AppendElectronicInvoiceLineDataRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  proto.asgt.dataservice.v1alpha1.AppendElectronicInvoiceLineDataRequest.displayName = 'proto.asgt.dataservice.v1alpha1.AppendElectronicInvoiceLineDataRequest';
}
/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.asgt.dataservice.v1alpha1.AppendElectronicInvoiceLineDataRequest.repeatedFields_ = [3];



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
proto.asgt.dataservice.v1alpha1.AppendElectronicInvoiceLineDataRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.asgt.dataservice.v1alpha1.AppendElectronicInvoiceLineDataRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.asgt.dataservice.v1alpha1.AppendElectronicInvoiceLineDataRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.dataservice.v1alpha1.AppendElectronicInvoiceLineDataRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    datasetName: jspb.Message.getFieldWithDefault(msg, 1, ""),
    entriesList: jspb.Message.toObjectList(msg.getEntriesList(),
    proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput.toObject, includeInstance)
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
 * @return {!proto.asgt.dataservice.v1alpha1.AppendElectronicInvoiceLineDataRequest}
 */
proto.asgt.dataservice.v1alpha1.AppendElectronicInvoiceLineDataRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.asgt.dataservice.v1alpha1.AppendElectronicInvoiceLineDataRequest;
  return proto.asgt.dataservice.v1alpha1.AppendElectronicInvoiceLineDataRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.asgt.dataservice.v1alpha1.AppendElectronicInvoiceLineDataRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.asgt.dataservice.v1alpha1.AppendElectronicInvoiceLineDataRequest}
 */
proto.asgt.dataservice.v1alpha1.AppendElectronicInvoiceLineDataRequest.deserializeBinaryFromReader = function(msg, reader) {
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
    case 3:
      var value = new proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput;
      reader.readMessage(value,proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput.deserializeBinaryFromReader);
      msg.addEntries(value);
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
proto.asgt.dataservice.v1alpha1.AppendElectronicInvoiceLineDataRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.asgt.dataservice.v1alpha1.AppendElectronicInvoiceLineDataRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.asgt.dataservice.v1alpha1.AppendElectronicInvoiceLineDataRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.dataservice.v1alpha1.AppendElectronicInvoiceLineDataRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDatasetName();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getEntriesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput.serializeBinaryToWriter
    );
  }
};


/**
 * optional string dataset_name = 1;
 * @return {string}
 */
proto.asgt.dataservice.v1alpha1.AppendElectronicInvoiceLineDataRequest.prototype.getDatasetName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/** @param {string} value */
proto.asgt.dataservice.v1alpha1.AppendElectronicInvoiceLineDataRequest.prototype.setDatasetName = function(value) {
  jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * repeated ElectronicInvoiceLineEntryInput entries = 3;
 * @return {!Array<!proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput>}
 */
proto.asgt.dataservice.v1alpha1.AppendElectronicInvoiceLineDataRequest.prototype.getEntriesList = function() {
  return /** @type{!Array<!proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput, 3));
};


/** @param {!Array<!proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput>} value */
proto.asgt.dataservice.v1alpha1.AppendElectronicInvoiceLineDataRequest.prototype.setEntriesList = function(value) {
  jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput=} opt_value
 * @param {number=} opt_index
 * @return {!proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput}
 */
proto.asgt.dataservice.v1alpha1.AppendElectronicInvoiceLineDataRequest.prototype.addEntries = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput, opt_index);
};


proto.asgt.dataservice.v1alpha1.AppendElectronicInvoiceLineDataRequest.prototype.clearEntriesList = function() {
  this.setEntriesList([]);
};


goog.object.extend(exports, proto.asgt.dataservice.v1alpha1);
