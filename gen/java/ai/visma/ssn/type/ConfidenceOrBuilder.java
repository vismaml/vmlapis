// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: ssn/type/candidate.proto
// Protobuf Java Version: 4.29.3

package ai.visma.ssn.type;

public interface ConfidenceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ssn.type.Confidence)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A bucketized representation of confidence, which is intended to give clients
   * highly stable results across model upgrades.
   * </pre>
   *
   * <code>.ssn.type.Confidence.Level level = 1 [json_name = "level"];</code>
   * @return The enum numeric value on the wire for level.
   */
  int getLevelValue();
  /**
   * <pre>
   * A bucketized representation of confidence, which is intended to give clients
   * highly stable results across model upgrades.
   * </pre>
   *
   * <code>.ssn.type.Confidence.Level level = 1 [json_name = "level"];</code>
   * @return The level.
   */
  ai.visma.ssn.type.Confidence.Level getLevel();

  /**
   * <pre>
   * The confidence value
   * </pre>
   *
   * <code>.google.protobuf.FloatValue value = 2 [json_name = "value"];</code>
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <pre>
   * The confidence value
   * </pre>
   *
   * <code>.google.protobuf.FloatValue value = 2 [json_name = "value"];</code>
   * @return The value.
   */
  com.google.protobuf.FloatValue getValue();
  /**
   * <pre>
   * The confidence value
   * </pre>
   *
   * <code>.google.protobuf.FloatValue value = 2 [json_name = "value"];</code>
   */
  com.google.protobuf.FloatValueOrBuilder getValueOrBuilder();
}
