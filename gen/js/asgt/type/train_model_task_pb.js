// source: asgt/type/train_model_task.proto
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

var asgt_type_dataset_pb = require('../../asgt/type/dataset_pb.js');
goog.object.extend(proto, asgt_type_dataset_pb);
var asgt_type_revision_pb = require('../../asgt/type/revision_pb.js');
goog.object.extend(proto, asgt_type_revision_pb);
goog.exportSymbol('proto.asgt.type.TrainModelTask', null, global);
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
proto.asgt.type.TrainModelTask = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.asgt.type.TrainModelTask, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.asgt.type.TrainModelTask.displayName = 'proto.asgt.type.TrainModelTask';
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
proto.asgt.type.TrainModelTask.prototype.toObject = function(opt_includeInstance) {
  return proto.asgt.type.TrainModelTask.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.asgt.type.TrainModelTask} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.type.TrainModelTask.toObject = function(includeInstance, msg) {
  var f, obj = {
    dataset: (f = msg.getDataset()) && asgt_type_dataset_pb.Dataset.toObject(includeInstance, f),
    revision: (f = msg.getRevision()) && asgt_type_revision_pb.Revision.toObject(includeInstance, f),
    modelVersion: jspb.Message.getFieldWithDefault(msg, 4, 0)
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
 * @return {!proto.asgt.type.TrainModelTask}
 */
proto.asgt.type.TrainModelTask.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.asgt.type.TrainModelTask;
  return proto.asgt.type.TrainModelTask.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.asgt.type.TrainModelTask} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.asgt.type.TrainModelTask}
 */
proto.asgt.type.TrainModelTask.deserializeBinaryFromReader = function(msg, reader) {
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
    case 4:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setModelVersion(value);
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
proto.asgt.type.TrainModelTask.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.asgt.type.TrainModelTask.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.asgt.type.TrainModelTask} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.asgt.type.TrainModelTask.serializeBinaryToWriter = function(message, writer) {
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
      4,
      f
    );
  }
};


/**
 * optional Dataset dataset = 1;
 * @return {?proto.asgt.type.Dataset}
 */
proto.asgt.type.TrainModelTask.prototype.getDataset = function() {
  return /** @type{?proto.asgt.type.Dataset} */ (
    jspb.Message.getWrapperField(this, asgt_type_dataset_pb.Dataset, 1));
};


/**
 * @param {?proto.asgt.type.Dataset|undefined} value
 * @return {!proto.asgt.type.TrainModelTask} returns this
*/
proto.asgt.type.TrainModelTask.prototype.setDataset = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.asgt.type.TrainModelTask} returns this
 */
proto.asgt.type.TrainModelTask.prototype.clearDataset = function() {
  return this.setDataset(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.asgt.type.TrainModelTask.prototype.hasDataset = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional Revision revision = 2;
 * @return {?proto.asgt.type.Revision}
 */
proto.asgt.type.TrainModelTask.prototype.getRevision = function() {
  return /** @type{?proto.asgt.type.Revision} */ (
    jspb.Message.getWrapperField(this, asgt_type_revision_pb.Revision, 2));
};


/**
 * @param {?proto.asgt.type.Revision|undefined} value
 * @return {!proto.asgt.type.TrainModelTask} returns this
*/
proto.asgt.type.TrainModelTask.prototype.setRevision = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.asgt.type.TrainModelTask} returns this
 */
proto.asgt.type.TrainModelTask.prototype.clearRevision = function() {
  return this.setRevision(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.asgt.type.TrainModelTask.prototype.hasRevision = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional int64 model_version = 4;
 * @return {number}
 */
proto.asgt.type.TrainModelTask.prototype.getModelVersion = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.asgt.type.TrainModelTask} returns this
 */
proto.asgt.type.TrainModelTask.prototype.setModelVersion = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


goog.object.extend(exports, proto.asgt.type);
