// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: validate/validate.proto
// Protobuf Java Version: 4.29.3

package ai.visma.validate;

public interface FieldRulesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:validate.FieldRules)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .validate.MessageRules message = 17 [json_name = "message"];</code>
   * @return Whether the message field is set.
   */
  boolean hasMessage();
  /**
   * <code>optional .validate.MessageRules message = 17 [json_name = "message"];</code>
   * @return The message.
   */
  ai.visma.validate.MessageRules getMessage();
  /**
   * <code>optional .validate.MessageRules message = 17 [json_name = "message"];</code>
   */
  ai.visma.validate.MessageRulesOrBuilder getMessageOrBuilder();

  /**
   * <pre>
   * Scalar Field Types
   * </pre>
   *
   * <code>.validate.FloatRules float = 1 [json_name = "float"];</code>
   * @return Whether the float field is set.
   */
  boolean hasFloat();
  /**
   * <pre>
   * Scalar Field Types
   * </pre>
   *
   * <code>.validate.FloatRules float = 1 [json_name = "float"];</code>
   * @return The float.
   */
  ai.visma.validate.FloatRules getFloat();
  /**
   * <pre>
   * Scalar Field Types
   * </pre>
   *
   * <code>.validate.FloatRules float = 1 [json_name = "float"];</code>
   */
  ai.visma.validate.FloatRulesOrBuilder getFloatOrBuilder();

  /**
   * <code>.validate.DoubleRules double = 2 [json_name = "double"];</code>
   * @return Whether the double field is set.
   */
  boolean hasDouble();
  /**
   * <code>.validate.DoubleRules double = 2 [json_name = "double"];</code>
   * @return The double.
   */
  ai.visma.validate.DoubleRules getDouble();
  /**
   * <code>.validate.DoubleRules double = 2 [json_name = "double"];</code>
   */
  ai.visma.validate.DoubleRulesOrBuilder getDoubleOrBuilder();

  /**
   * <code>.validate.Int32Rules int32 = 3 [json_name = "int32"];</code>
   * @return Whether the int32 field is set.
   */
  boolean hasInt32();
  /**
   * <code>.validate.Int32Rules int32 = 3 [json_name = "int32"];</code>
   * @return The int32.
   */
  ai.visma.validate.Int32Rules getInt32();
  /**
   * <code>.validate.Int32Rules int32 = 3 [json_name = "int32"];</code>
   */
  ai.visma.validate.Int32RulesOrBuilder getInt32OrBuilder();

  /**
   * <code>.validate.Int64Rules int64 = 4 [json_name = "int64"];</code>
   * @return Whether the int64 field is set.
   */
  boolean hasInt64();
  /**
   * <code>.validate.Int64Rules int64 = 4 [json_name = "int64"];</code>
   * @return The int64.
   */
  ai.visma.validate.Int64Rules getInt64();
  /**
   * <code>.validate.Int64Rules int64 = 4 [json_name = "int64"];</code>
   */
  ai.visma.validate.Int64RulesOrBuilder getInt64OrBuilder();

  /**
   * <code>.validate.UInt32Rules uint32 = 5 [json_name = "uint32"];</code>
   * @return Whether the uint32 field is set.
   */
  boolean hasUint32();
  /**
   * <code>.validate.UInt32Rules uint32 = 5 [json_name = "uint32"];</code>
   * @return The uint32.
   */
  ai.visma.validate.UInt32Rules getUint32();
  /**
   * <code>.validate.UInt32Rules uint32 = 5 [json_name = "uint32"];</code>
   */
  ai.visma.validate.UInt32RulesOrBuilder getUint32OrBuilder();

  /**
   * <code>.validate.UInt64Rules uint64 = 6 [json_name = "uint64"];</code>
   * @return Whether the uint64 field is set.
   */
  boolean hasUint64();
  /**
   * <code>.validate.UInt64Rules uint64 = 6 [json_name = "uint64"];</code>
   * @return The uint64.
   */
  ai.visma.validate.UInt64Rules getUint64();
  /**
   * <code>.validate.UInt64Rules uint64 = 6 [json_name = "uint64"];</code>
   */
  ai.visma.validate.UInt64RulesOrBuilder getUint64OrBuilder();

  /**
   * <code>.validate.SInt32Rules sint32 = 7 [json_name = "sint32"];</code>
   * @return Whether the sint32 field is set.
   */
  boolean hasSint32();
  /**
   * <code>.validate.SInt32Rules sint32 = 7 [json_name = "sint32"];</code>
   * @return The sint32.
   */
  ai.visma.validate.SInt32Rules getSint32();
  /**
   * <code>.validate.SInt32Rules sint32 = 7 [json_name = "sint32"];</code>
   */
  ai.visma.validate.SInt32RulesOrBuilder getSint32OrBuilder();

  /**
   * <code>.validate.SInt64Rules sint64 = 8 [json_name = "sint64"];</code>
   * @return Whether the sint64 field is set.
   */
  boolean hasSint64();
  /**
   * <code>.validate.SInt64Rules sint64 = 8 [json_name = "sint64"];</code>
   * @return The sint64.
   */
  ai.visma.validate.SInt64Rules getSint64();
  /**
   * <code>.validate.SInt64Rules sint64 = 8 [json_name = "sint64"];</code>
   */
  ai.visma.validate.SInt64RulesOrBuilder getSint64OrBuilder();

  /**
   * <code>.validate.Fixed32Rules fixed32 = 9 [json_name = "fixed32"];</code>
   * @return Whether the fixed32 field is set.
   */
  boolean hasFixed32();
  /**
   * <code>.validate.Fixed32Rules fixed32 = 9 [json_name = "fixed32"];</code>
   * @return The fixed32.
   */
  ai.visma.validate.Fixed32Rules getFixed32();
  /**
   * <code>.validate.Fixed32Rules fixed32 = 9 [json_name = "fixed32"];</code>
   */
  ai.visma.validate.Fixed32RulesOrBuilder getFixed32OrBuilder();

  /**
   * <code>.validate.Fixed64Rules fixed64 = 10 [json_name = "fixed64"];</code>
   * @return Whether the fixed64 field is set.
   */
  boolean hasFixed64();
  /**
   * <code>.validate.Fixed64Rules fixed64 = 10 [json_name = "fixed64"];</code>
   * @return The fixed64.
   */
  ai.visma.validate.Fixed64Rules getFixed64();
  /**
   * <code>.validate.Fixed64Rules fixed64 = 10 [json_name = "fixed64"];</code>
   */
  ai.visma.validate.Fixed64RulesOrBuilder getFixed64OrBuilder();

  /**
   * <code>.validate.SFixed32Rules sfixed32 = 11 [json_name = "sfixed32"];</code>
   * @return Whether the sfixed32 field is set.
   */
  boolean hasSfixed32();
  /**
   * <code>.validate.SFixed32Rules sfixed32 = 11 [json_name = "sfixed32"];</code>
   * @return The sfixed32.
   */
  ai.visma.validate.SFixed32Rules getSfixed32();
  /**
   * <code>.validate.SFixed32Rules sfixed32 = 11 [json_name = "sfixed32"];</code>
   */
  ai.visma.validate.SFixed32RulesOrBuilder getSfixed32OrBuilder();

  /**
   * <code>.validate.SFixed64Rules sfixed64 = 12 [json_name = "sfixed64"];</code>
   * @return Whether the sfixed64 field is set.
   */
  boolean hasSfixed64();
  /**
   * <code>.validate.SFixed64Rules sfixed64 = 12 [json_name = "sfixed64"];</code>
   * @return The sfixed64.
   */
  ai.visma.validate.SFixed64Rules getSfixed64();
  /**
   * <code>.validate.SFixed64Rules sfixed64 = 12 [json_name = "sfixed64"];</code>
   */
  ai.visma.validate.SFixed64RulesOrBuilder getSfixed64OrBuilder();

  /**
   * <code>.validate.BoolRules bool = 13 [json_name = "bool"];</code>
   * @return Whether the bool field is set.
   */
  boolean hasBool();
  /**
   * <code>.validate.BoolRules bool = 13 [json_name = "bool"];</code>
   * @return The bool.
   */
  ai.visma.validate.BoolRules getBool();
  /**
   * <code>.validate.BoolRules bool = 13 [json_name = "bool"];</code>
   */
  ai.visma.validate.BoolRulesOrBuilder getBoolOrBuilder();

  /**
   * <code>.validate.StringRules string = 14 [json_name = "string"];</code>
   * @return Whether the string field is set.
   */
  boolean hasString();
  /**
   * <code>.validate.StringRules string = 14 [json_name = "string"];</code>
   * @return The string.
   */
  ai.visma.validate.StringRules getString();
  /**
   * <code>.validate.StringRules string = 14 [json_name = "string"];</code>
   */
  ai.visma.validate.StringRulesOrBuilder getStringOrBuilder();

  /**
   * <code>.validate.BytesRules bytes = 15 [json_name = "bytes"];</code>
   * @return Whether the bytes field is set.
   */
  boolean hasBytes();
  /**
   * <code>.validate.BytesRules bytes = 15 [json_name = "bytes"];</code>
   * @return The bytes.
   */
  ai.visma.validate.BytesRules getBytes();
  /**
   * <code>.validate.BytesRules bytes = 15 [json_name = "bytes"];</code>
   */
  ai.visma.validate.BytesRulesOrBuilder getBytesOrBuilder();

  /**
   * <pre>
   * Complex Field Types
   * </pre>
   *
   * <code>.validate.EnumRules enum = 16 [json_name = "enum"];</code>
   * @return Whether the enum field is set.
   */
  boolean hasEnum();
  /**
   * <pre>
   * Complex Field Types
   * </pre>
   *
   * <code>.validate.EnumRules enum = 16 [json_name = "enum"];</code>
   * @return The enum.
   */
  ai.visma.validate.EnumRules getEnum();
  /**
   * <pre>
   * Complex Field Types
   * </pre>
   *
   * <code>.validate.EnumRules enum = 16 [json_name = "enum"];</code>
   */
  ai.visma.validate.EnumRulesOrBuilder getEnumOrBuilder();

  /**
   * <code>.validate.RepeatedRules repeated = 18 [json_name = "repeated"];</code>
   * @return Whether the repeated field is set.
   */
  boolean hasRepeated();
  /**
   * <code>.validate.RepeatedRules repeated = 18 [json_name = "repeated"];</code>
   * @return The repeated.
   */
  ai.visma.validate.RepeatedRules getRepeated();
  /**
   * <code>.validate.RepeatedRules repeated = 18 [json_name = "repeated"];</code>
   */
  ai.visma.validate.RepeatedRulesOrBuilder getRepeatedOrBuilder();

  /**
   * <code>.validate.MapRules map = 19 [json_name = "map"];</code>
   * @return Whether the map field is set.
   */
  boolean hasMap();
  /**
   * <code>.validate.MapRules map = 19 [json_name = "map"];</code>
   * @return The map.
   */
  ai.visma.validate.MapRules getMap();
  /**
   * <code>.validate.MapRules map = 19 [json_name = "map"];</code>
   */
  ai.visma.validate.MapRulesOrBuilder getMapOrBuilder();

  /**
   * <pre>
   * Well-Known Field Types
   * </pre>
   *
   * <code>.validate.AnyRules any = 20 [json_name = "any"];</code>
   * @return Whether the any field is set.
   */
  boolean hasAny();
  /**
   * <pre>
   * Well-Known Field Types
   * </pre>
   *
   * <code>.validate.AnyRules any = 20 [json_name = "any"];</code>
   * @return The any.
   */
  ai.visma.validate.AnyRules getAny();
  /**
   * <pre>
   * Well-Known Field Types
   * </pre>
   *
   * <code>.validate.AnyRules any = 20 [json_name = "any"];</code>
   */
  ai.visma.validate.AnyRulesOrBuilder getAnyOrBuilder();

  /**
   * <code>.validate.DurationRules duration = 21 [json_name = "duration"];</code>
   * @return Whether the duration field is set.
   */
  boolean hasDuration();
  /**
   * <code>.validate.DurationRules duration = 21 [json_name = "duration"];</code>
   * @return The duration.
   */
  ai.visma.validate.DurationRules getDuration();
  /**
   * <code>.validate.DurationRules duration = 21 [json_name = "duration"];</code>
   */
  ai.visma.validate.DurationRulesOrBuilder getDurationOrBuilder();

  /**
   * <code>.validate.TimestampRules timestamp = 22 [json_name = "timestamp"];</code>
   * @return Whether the timestamp field is set.
   */
  boolean hasTimestamp();
  /**
   * <code>.validate.TimestampRules timestamp = 22 [json_name = "timestamp"];</code>
   * @return The timestamp.
   */
  ai.visma.validate.TimestampRules getTimestamp();
  /**
   * <code>.validate.TimestampRules timestamp = 22 [json_name = "timestamp"];</code>
   */
  ai.visma.validate.TimestampRulesOrBuilder getTimestampOrBuilder();

  ai.visma.validate.FieldRules.TypeCase getTypeCase();
}
