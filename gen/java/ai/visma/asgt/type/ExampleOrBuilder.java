// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: asgt/type/example.proto
// Protobuf Java Version: 4.29.3

package ai.visma.asgt.type;

public interface ExampleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:asgt.type.Example)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.asgt.type.Data data = 1 [json_name = "data"];</code>
   * @return Whether the data field is set.
   */
  boolean hasData();
  /**
   * <code>.asgt.type.Data data = 1 [json_name = "data"];</code>
   * @return The data.
   */
  ai.visma.asgt.type.Data getData();
  /**
   * <code>.asgt.type.Data data = 1 [json_name = "data"];</code>
   */
  ai.visma.asgt.type.DataOrBuilder getDataOrBuilder();

  /**
   * <code>repeated .asgt.type.TargetValue target_values = 2 [json_name = "targetValues"];</code>
   */
  java.util.List<ai.visma.asgt.type.TargetValue> 
      getTargetValuesList();
  /**
   * <code>repeated .asgt.type.TargetValue target_values = 2 [json_name = "targetValues"];</code>
   */
  ai.visma.asgt.type.TargetValue getTargetValues(int index);
  /**
   * <code>repeated .asgt.type.TargetValue target_values = 2 [json_name = "targetValues"];</code>
   */
  int getTargetValuesCount();
  /**
   * <code>repeated .asgt.type.TargetValue target_values = 2 [json_name = "targetValues"];</code>
   */
  java.util.List<? extends ai.visma.asgt.type.TargetValueOrBuilder> 
      getTargetValuesOrBuilderList();
  /**
   * <code>repeated .asgt.type.TargetValue target_values = 2 [json_name = "targetValues"];</code>
   */
  ai.visma.asgt.type.TargetValueOrBuilder getTargetValuesOrBuilder(
      int index);

  /**
   * <pre>
   * An optional id to provide individual corrections to examples, for example when a user updates their initial
   * feedback. The id should be a string in UUID format.
   * </pre>
   *
   * <code>string id = 3 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * An optional id to provide individual corrections to examples, for example when a user updates their initial
   * feedback. The id should be a string in UUID format.
   * </pre>
   *
   * <code>string id = 3 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();
}
