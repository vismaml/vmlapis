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

var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');
var google_protobuf_wrappers_pb = require('google-protobuf/google/protobuf/wrappers_pb.js');
goog.exportSymbol('proto.asgt.type.Data', null, global);
goog.exportSymbol('proto.asgt.type.Invoice', null, global);
goog.exportSymbol('proto.asgt.type.InvoiceLine', null, global);
goog.exportSymbol('proto.asgt.type.Supplier', null, global);
goog.exportSymbol('proto.asgt.type.Transaction', null, global);

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
proto.asgt.type.Invoice = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.asgt.type.Invoice, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  proto.asgt.type.Invoice.displayName = 'proto.asgt.type.Invoice';
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
proto.asgt.type.Invoice.prototype.toObject = function(opt_includeInstance) {
  return proto.asgt.type.Invoice.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.asgt.type.Invoice} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.type.Invoice.toObject = function(includeInstance, msg) {
  var f, obj = {
    issueDate: (f = msg.getIssueDate()) && google_protobuf_timestamp_pb.Timestamp.toObject(includeInstance, f),
    supplier: (f = msg.getSupplier()) && proto.asgt.type.Supplier.toObject(includeInstance, f),
    customerRef: (f = msg.getCustomerRef()) && google_protobuf_wrappers_pb.StringValue.toObject(includeInstance, f),
    text: jspb.Message.getFieldWithDefault(msg, 4, ""),
    total: (f = msg.getTotal()) && google_protobuf_wrappers_pb.FloatValue.toObject(includeInstance, f)
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
 * @return {!proto.asgt.type.Invoice}
 */
proto.asgt.type.Invoice.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.asgt.type.Invoice;
  return proto.asgt.type.Invoice.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.asgt.type.Invoice} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.asgt.type.Invoice}
 */
proto.asgt.type.Invoice.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new google_protobuf_timestamp_pb.Timestamp;
      reader.readMessage(value,google_protobuf_timestamp_pb.Timestamp.deserializeBinaryFromReader);
      msg.setIssueDate(value);
      break;
    case 2:
      var value = new proto.asgt.type.Supplier;
      reader.readMessage(value,proto.asgt.type.Supplier.deserializeBinaryFromReader);
      msg.setSupplier(value);
      break;
    case 3:
      var value = new google_protobuf_wrappers_pb.StringValue;
      reader.readMessage(value,google_protobuf_wrappers_pb.StringValue.deserializeBinaryFromReader);
      msg.setCustomerRef(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setText(value);
      break;
    case 7:
      var value = new google_protobuf_wrappers_pb.FloatValue;
      reader.readMessage(value,google_protobuf_wrappers_pb.FloatValue.deserializeBinaryFromReader);
      msg.setTotal(value);
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
proto.asgt.type.Invoice.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.asgt.type.Invoice.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.asgt.type.Invoice} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.type.Invoice.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getIssueDate();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      google_protobuf_timestamp_pb.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getSupplier();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.asgt.type.Supplier.serializeBinaryToWriter
    );
  }
  f = message.getCustomerRef();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      google_protobuf_wrappers_pb.StringValue.serializeBinaryToWriter
    );
  }
  f = message.getText();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getTotal();
  if (f != null) {
    writer.writeMessage(
      7,
      f,
      google_protobuf_wrappers_pb.FloatValue.serializeBinaryToWriter
    );
  }
};


/**
 * optional google.protobuf.Timestamp issue_date = 1;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.asgt.type.Invoice.prototype.getIssueDate = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, google_protobuf_timestamp_pb.Timestamp, 1));
};


/** @param {?proto.google.protobuf.Timestamp|undefined} value */
proto.asgt.type.Invoice.prototype.setIssueDate = function(value) {
  jspb.Message.setWrapperField(this, 1, value);
};


proto.asgt.type.Invoice.prototype.clearIssueDate = function() {
  this.setIssueDate(undefined);
};


/**
 * Returns whether this field is set.
 * @return {!boolean}
 */
proto.asgt.type.Invoice.prototype.hasIssueDate = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional Supplier supplier = 2;
 * @return {?proto.asgt.type.Supplier}
 */
proto.asgt.type.Invoice.prototype.getSupplier = function() {
  return /** @type{?proto.asgt.type.Supplier} */ (
    jspb.Message.getWrapperField(this, proto.asgt.type.Supplier, 2));
};


/** @param {?proto.asgt.type.Supplier|undefined} value */
proto.asgt.type.Invoice.prototype.setSupplier = function(value) {
  jspb.Message.setWrapperField(this, 2, value);
};


proto.asgt.type.Invoice.prototype.clearSupplier = function() {
  this.setSupplier(undefined);
};


/**
 * Returns whether this field is set.
 * @return {!boolean}
 */
proto.asgt.type.Invoice.prototype.hasSupplier = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional google.protobuf.StringValue customer_ref = 3;
 * @return {?proto.google.protobuf.StringValue}
 */
proto.asgt.type.Invoice.prototype.getCustomerRef = function() {
  return /** @type{?proto.google.protobuf.StringValue} */ (
    jspb.Message.getWrapperField(this, google_protobuf_wrappers_pb.StringValue, 3));
};


/** @param {?proto.google.protobuf.StringValue|undefined} value */
proto.asgt.type.Invoice.prototype.setCustomerRef = function(value) {
  jspb.Message.setWrapperField(this, 3, value);
};


proto.asgt.type.Invoice.prototype.clearCustomerRef = function() {
  this.setCustomerRef(undefined);
};


/**
 * Returns whether this field is set.
 * @return {!boolean}
 */
proto.asgt.type.Invoice.prototype.hasCustomerRef = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional string text = 4;
 * @return {string}
 */
proto.asgt.type.Invoice.prototype.getText = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/** @param {string} value */
proto.asgt.type.Invoice.prototype.setText = function(value) {
  jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional google.protobuf.FloatValue total = 7;
 * @return {?proto.google.protobuf.FloatValue}
 */
proto.asgt.type.Invoice.prototype.getTotal = function() {
  return /** @type{?proto.google.protobuf.FloatValue} */ (
    jspb.Message.getWrapperField(this, google_protobuf_wrappers_pb.FloatValue, 7));
};


/** @param {?proto.google.protobuf.FloatValue|undefined} value */
proto.asgt.type.Invoice.prototype.setTotal = function(value) {
  jspb.Message.setWrapperField(this, 7, value);
};


proto.asgt.type.Invoice.prototype.clearTotal = function() {
  this.setTotal(undefined);
};


/**
 * Returns whether this field is set.
 * @return {!boolean}
 */
proto.asgt.type.Invoice.prototype.hasTotal = function() {
  return jspb.Message.getField(this, 7) != null;
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
proto.asgt.type.InvoiceLine = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.asgt.type.InvoiceLine, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  proto.asgt.type.InvoiceLine.displayName = 'proto.asgt.type.InvoiceLine';
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
proto.asgt.type.InvoiceLine.prototype.toObject = function(opt_includeInstance) {
  return proto.asgt.type.InvoiceLine.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.asgt.type.InvoiceLine} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.type.InvoiceLine.toObject = function(includeInstance, msg) {
  var f, obj = {
    currency: (f = msg.getCurrency()) && google_protobuf_wrappers_pb.StringValue.toObject(includeInstance, f),
    amount: (f = msg.getAmount()) && google_protobuf_wrappers_pb.FloatValue.toObject(includeInstance, f),
    text: (f = msg.getText()) && google_protobuf_wrappers_pb.StringValue.toObject(includeInstance, f),
    itemId: (f = msg.getItemId()) && google_protobuf_wrappers_pb.StringValue.toObject(includeInstance, f)
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
 * @return {!proto.asgt.type.InvoiceLine}
 */
proto.asgt.type.InvoiceLine.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.asgt.type.InvoiceLine;
  return proto.asgt.type.InvoiceLine.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.asgt.type.InvoiceLine} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.asgt.type.InvoiceLine}
 */
proto.asgt.type.InvoiceLine.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 4:
      var value = new google_protobuf_wrappers_pb.StringValue;
      reader.readMessage(value,google_protobuf_wrappers_pb.StringValue.deserializeBinaryFromReader);
      msg.setCurrency(value);
      break;
    case 3:
      var value = new google_protobuf_wrappers_pb.FloatValue;
      reader.readMessage(value,google_protobuf_wrappers_pb.FloatValue.deserializeBinaryFromReader);
      msg.setAmount(value);
      break;
    case 8:
      var value = new google_protobuf_wrappers_pb.StringValue;
      reader.readMessage(value,google_protobuf_wrappers_pb.StringValue.deserializeBinaryFromReader);
      msg.setText(value);
      break;
    case 9:
      var value = new google_protobuf_wrappers_pb.StringValue;
      reader.readMessage(value,google_protobuf_wrappers_pb.StringValue.deserializeBinaryFromReader);
      msg.setItemId(value);
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
proto.asgt.type.InvoiceLine.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.asgt.type.InvoiceLine.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.asgt.type.InvoiceLine} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.type.InvoiceLine.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getCurrency();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      google_protobuf_wrappers_pb.StringValue.serializeBinaryToWriter
    );
  }
  f = message.getAmount();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      google_protobuf_wrappers_pb.FloatValue.serializeBinaryToWriter
    );
  }
  f = message.getText();
  if (f != null) {
    writer.writeMessage(
      8,
      f,
      google_protobuf_wrappers_pb.StringValue.serializeBinaryToWriter
    );
  }
  f = message.getItemId();
  if (f != null) {
    writer.writeMessage(
      9,
      f,
      google_protobuf_wrappers_pb.StringValue.serializeBinaryToWriter
    );
  }
};


/**
 * optional google.protobuf.StringValue currency = 4;
 * @return {?proto.google.protobuf.StringValue}
 */
proto.asgt.type.InvoiceLine.prototype.getCurrency = function() {
  return /** @type{?proto.google.protobuf.StringValue} */ (
    jspb.Message.getWrapperField(this, google_protobuf_wrappers_pb.StringValue, 4));
};


/** @param {?proto.google.protobuf.StringValue|undefined} value */
proto.asgt.type.InvoiceLine.prototype.setCurrency = function(value) {
  jspb.Message.setWrapperField(this, 4, value);
};


proto.asgt.type.InvoiceLine.prototype.clearCurrency = function() {
  this.setCurrency(undefined);
};


/**
 * Returns whether this field is set.
 * @return {!boolean}
 */
proto.asgt.type.InvoiceLine.prototype.hasCurrency = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional google.protobuf.FloatValue amount = 3;
 * @return {?proto.google.protobuf.FloatValue}
 */
proto.asgt.type.InvoiceLine.prototype.getAmount = function() {
  return /** @type{?proto.google.protobuf.FloatValue} */ (
    jspb.Message.getWrapperField(this, google_protobuf_wrappers_pb.FloatValue, 3));
};


/** @param {?proto.google.protobuf.FloatValue|undefined} value */
proto.asgt.type.InvoiceLine.prototype.setAmount = function(value) {
  jspb.Message.setWrapperField(this, 3, value);
};


proto.asgt.type.InvoiceLine.prototype.clearAmount = function() {
  this.setAmount(undefined);
};


/**
 * Returns whether this field is set.
 * @return {!boolean}
 */
proto.asgt.type.InvoiceLine.prototype.hasAmount = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional google.protobuf.StringValue text = 8;
 * @return {?proto.google.protobuf.StringValue}
 */
proto.asgt.type.InvoiceLine.prototype.getText = function() {
  return /** @type{?proto.google.protobuf.StringValue} */ (
    jspb.Message.getWrapperField(this, google_protobuf_wrappers_pb.StringValue, 8));
};


/** @param {?proto.google.protobuf.StringValue|undefined} value */
proto.asgt.type.InvoiceLine.prototype.setText = function(value) {
  jspb.Message.setWrapperField(this, 8, value);
};


proto.asgt.type.InvoiceLine.prototype.clearText = function() {
  this.setText(undefined);
};


/**
 * Returns whether this field is set.
 * @return {!boolean}
 */
proto.asgt.type.InvoiceLine.prototype.hasText = function() {
  return jspb.Message.getField(this, 8) != null;
};


/**
 * optional google.protobuf.StringValue item_id = 9;
 * @return {?proto.google.protobuf.StringValue}
 */
proto.asgt.type.InvoiceLine.prototype.getItemId = function() {
  return /** @type{?proto.google.protobuf.StringValue} */ (
    jspb.Message.getWrapperField(this, google_protobuf_wrappers_pb.StringValue, 9));
};


/** @param {?proto.google.protobuf.StringValue|undefined} value */
proto.asgt.type.InvoiceLine.prototype.setItemId = function(value) {
  jspb.Message.setWrapperField(this, 9, value);
};


proto.asgt.type.InvoiceLine.prototype.clearItemId = function() {
  this.setItemId(undefined);
};


/**
 * Returns whether this field is set.
 * @return {!boolean}
 */
proto.asgt.type.InvoiceLine.prototype.hasItemId = function() {
  return jspb.Message.getField(this, 9) != null;
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
proto.asgt.type.Supplier = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.asgt.type.Supplier, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  proto.asgt.type.Supplier.displayName = 'proto.asgt.type.Supplier';
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
proto.asgt.type.Supplier.prototype.toObject = function(opt_includeInstance) {
  return proto.asgt.type.Supplier.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.asgt.type.Supplier} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.type.Supplier.toObject = function(includeInstance, msg) {
  var f, obj = {
    id: jspb.Message.getFieldWithDefault(msg, 1, ""),
    name: (f = msg.getName()) && google_protobuf_wrappers_pb.StringValue.toObject(includeInstance, f),
    globalId: (f = msg.getGlobalId()) && google_protobuf_wrappers_pb.StringValue.toObject(includeInstance, f)
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
 * @return {!proto.asgt.type.Supplier}
 */
proto.asgt.type.Supplier.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.asgt.type.Supplier;
  return proto.asgt.type.Supplier.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.asgt.type.Supplier} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.asgt.type.Supplier}
 */
proto.asgt.type.Supplier.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setId(value);
      break;
    case 4:
      var value = new google_protobuf_wrappers_pb.StringValue;
      reader.readMessage(value,google_protobuf_wrappers_pb.StringValue.deserializeBinaryFromReader);
      msg.setName(value);
      break;
    case 5:
      var value = new google_protobuf_wrappers_pb.StringValue;
      reader.readMessage(value,google_protobuf_wrappers_pb.StringValue.deserializeBinaryFromReader);
      msg.setGlobalId(value);
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
proto.asgt.type.Supplier.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.asgt.type.Supplier.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.asgt.type.Supplier} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.type.Supplier.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getName();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      google_protobuf_wrappers_pb.StringValue.serializeBinaryToWriter
    );
  }
  f = message.getGlobalId();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      google_protobuf_wrappers_pb.StringValue.serializeBinaryToWriter
    );
  }
};


/**
 * optional string id = 1;
 * @return {string}
 */
proto.asgt.type.Supplier.prototype.getId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/** @param {string} value */
proto.asgt.type.Supplier.prototype.setId = function(value) {
  jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional google.protobuf.StringValue name = 4;
 * @return {?proto.google.protobuf.StringValue}
 */
proto.asgt.type.Supplier.prototype.getName = function() {
  return /** @type{?proto.google.protobuf.StringValue} */ (
    jspb.Message.getWrapperField(this, google_protobuf_wrappers_pb.StringValue, 4));
};


/** @param {?proto.google.protobuf.StringValue|undefined} value */
proto.asgt.type.Supplier.prototype.setName = function(value) {
  jspb.Message.setWrapperField(this, 4, value);
};


proto.asgt.type.Supplier.prototype.clearName = function() {
  this.setName(undefined);
};


/**
 * Returns whether this field is set.
 * @return {!boolean}
 */
proto.asgt.type.Supplier.prototype.hasName = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional google.protobuf.StringValue global_id = 5;
 * @return {?proto.google.protobuf.StringValue}
 */
proto.asgt.type.Supplier.prototype.getGlobalId = function() {
  return /** @type{?proto.google.protobuf.StringValue} */ (
    jspb.Message.getWrapperField(this, google_protobuf_wrappers_pb.StringValue, 5));
};


/** @param {?proto.google.protobuf.StringValue|undefined} value */
proto.asgt.type.Supplier.prototype.setGlobalId = function(value) {
  jspb.Message.setWrapperField(this, 5, value);
};


proto.asgt.type.Supplier.prototype.clearGlobalId = function() {
  this.setGlobalId(undefined);
};


/**
 * Returns whether this field is set.
 * @return {!boolean}
 */
proto.asgt.type.Supplier.prototype.hasGlobalId = function() {
  return jspb.Message.getField(this, 5) != null;
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
proto.asgt.type.Transaction = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.asgt.type.Transaction, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  proto.asgt.type.Transaction.displayName = 'proto.asgt.type.Transaction';
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
proto.asgt.type.Transaction.prototype.toObject = function(opt_includeInstance) {
  return proto.asgt.type.Transaction.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.asgt.type.Transaction} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.type.Transaction.toObject = function(includeInstance, msg) {
  var f, obj = {
    text: jspb.Message.getFieldWithDefault(msg, 1, ""),
    amount: +jspb.Message.getFieldWithDefault(msg, 2, 0.0)
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
 * @return {!proto.asgt.type.Transaction}
 */
proto.asgt.type.Transaction.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.asgt.type.Transaction;
  return proto.asgt.type.Transaction.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.asgt.type.Transaction} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.asgt.type.Transaction}
 */
proto.asgt.type.Transaction.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setText(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readFloat());
      msg.setAmount(value);
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
proto.asgt.type.Transaction.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.asgt.type.Transaction.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.asgt.type.Transaction} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.type.Transaction.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getText();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getAmount();
  if (f !== 0.0) {
    writer.writeFloat(
      2,
      f
    );
  }
};


/**
 * optional string text = 1;
 * @return {string}
 */
proto.asgt.type.Transaction.prototype.getText = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/** @param {string} value */
proto.asgt.type.Transaction.prototype.setText = function(value) {
  jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional float amount = 2;
 * @return {number}
 */
proto.asgt.type.Transaction.prototype.getAmount = function() {
  return /** @type {number} */ (+jspb.Message.getFieldWithDefault(this, 2, 0.0));
};


/** @param {number} value */
proto.asgt.type.Transaction.prototype.setAmount = function(value) {
  jspb.Message.setProto3FloatField(this, 2, value);
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
proto.asgt.type.Data = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.asgt.type.Data, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  proto.asgt.type.Data.displayName = 'proto.asgt.type.Data';
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
proto.asgt.type.Data.prototype.toObject = function(opt_includeInstance) {
  return proto.asgt.type.Data.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.asgt.type.Data} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.type.Data.toObject = function(includeInstance, msg) {
  var f, obj = {
    transaction: (f = msg.getTransaction()) && proto.asgt.type.Transaction.toObject(includeInstance, f),
    invoice: (f = msg.getInvoice()) && proto.asgt.type.Invoice.toObject(includeInstance, f),
    invoiceLine: (f = msg.getInvoiceLine()) && proto.asgt.type.InvoiceLine.toObject(includeInstance, f)
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
 * @return {!proto.asgt.type.Data}
 */
proto.asgt.type.Data.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.asgt.type.Data;
  return proto.asgt.type.Data.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.asgt.type.Data} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.asgt.type.Data}
 */
proto.asgt.type.Data.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.asgt.type.Transaction;
      reader.readMessage(value,proto.asgt.type.Transaction.deserializeBinaryFromReader);
      msg.setTransaction(value);
      break;
    case 2:
      var value = new proto.asgt.type.Invoice;
      reader.readMessage(value,proto.asgt.type.Invoice.deserializeBinaryFromReader);
      msg.setInvoice(value);
      break;
    case 3:
      var value = new proto.asgt.type.InvoiceLine;
      reader.readMessage(value,proto.asgt.type.InvoiceLine.deserializeBinaryFromReader);
      msg.setInvoiceLine(value);
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
proto.asgt.type.Data.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.asgt.type.Data.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.asgt.type.Data} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.type.Data.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getTransaction();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.asgt.type.Transaction.serializeBinaryToWriter
    );
  }
  f = message.getInvoice();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.asgt.type.Invoice.serializeBinaryToWriter
    );
  }
  f = message.getInvoiceLine();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.asgt.type.InvoiceLine.serializeBinaryToWriter
    );
  }
};


/**
 * optional Transaction transaction = 1;
 * @return {?proto.asgt.type.Transaction}
 */
proto.asgt.type.Data.prototype.getTransaction = function() {
  return /** @type{?proto.asgt.type.Transaction} */ (
    jspb.Message.getWrapperField(this, proto.asgt.type.Transaction, 1));
};


/** @param {?proto.asgt.type.Transaction|undefined} value */
proto.asgt.type.Data.prototype.setTransaction = function(value) {
  jspb.Message.setWrapperField(this, 1, value);
};


proto.asgt.type.Data.prototype.clearTransaction = function() {
  this.setTransaction(undefined);
};


/**
 * Returns whether this field is set.
 * @return {!boolean}
 */
proto.asgt.type.Data.prototype.hasTransaction = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional Invoice invoice = 2;
 * @return {?proto.asgt.type.Invoice}
 */
proto.asgt.type.Data.prototype.getInvoice = function() {
  return /** @type{?proto.asgt.type.Invoice} */ (
    jspb.Message.getWrapperField(this, proto.asgt.type.Invoice, 2));
};


/** @param {?proto.asgt.type.Invoice|undefined} value */
proto.asgt.type.Data.prototype.setInvoice = function(value) {
  jspb.Message.setWrapperField(this, 2, value);
};


proto.asgt.type.Data.prototype.clearInvoice = function() {
  this.setInvoice(undefined);
};


/**
 * Returns whether this field is set.
 * @return {!boolean}
 */
proto.asgt.type.Data.prototype.hasInvoice = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional InvoiceLine invoice_line = 3;
 * @return {?proto.asgt.type.InvoiceLine}
 */
proto.asgt.type.Data.prototype.getInvoiceLine = function() {
  return /** @type{?proto.asgt.type.InvoiceLine} */ (
    jspb.Message.getWrapperField(this, proto.asgt.type.InvoiceLine, 3));
};


/** @param {?proto.asgt.type.InvoiceLine|undefined} value */
proto.asgt.type.Data.prototype.setInvoiceLine = function(value) {
  jspb.Message.setWrapperField(this, 3, value);
};


proto.asgt.type.Data.prototype.clearInvoiceLine = function() {
  this.setInvoiceLine(undefined);
};


/**
 * Returns whether this field is set.
 * @return {!boolean}
 */
proto.asgt.type.Data.prototype.hasInvoiceLine = function() {
  return jspb.Message.getField(this, 3) != null;
};


goog.object.extend(exports, proto.asgt.type);
