// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: asgt/v2/type/model.proto

package ai.visma.asgt.v2.type;

public interface ModelOrBuilder extends
    // @@protoc_insertion_point(interface_extends:asgt.v2.type.Model)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Creation time of the model
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 1 [json_name = "createdAt"];</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <pre>
   * Creation time of the model
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 1 [json_name = "createdAt"];</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <pre>
   * Creation time of the model
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 1 [json_name = "createdAt"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <pre>
   * Specifies dataset the model belongs to.
   * </pre>
   *
   * <code>.asgt.type.Dataset dataset = 2 [json_name = "dataset"];</code>
   * @return Whether the dataset field is set.
   */
  boolean hasDataset();
  /**
   * <pre>
   * Specifies dataset the model belongs to.
   * </pre>
   *
   * <code>.asgt.type.Dataset dataset = 2 [json_name = "dataset"];</code>
   * @return The dataset.
   */
  ai.visma.asgt.type.Dataset getDataset();
  /**
   * <pre>
   * Specifies dataset the model belongs to.
   * </pre>
   *
   * <code>.asgt.type.Dataset dataset = 2 [json_name = "dataset"];</code>
   */
  ai.visma.asgt.type.DatasetOrBuilder getDatasetOrBuilder();

  /**
   * <pre>
   * Targets the model was trained on
   * </pre>
   *
   * <code>repeated string targets = 3 [json_name = "targets"];</code>
   * @return A list containing the targets.
   */
  java.util.List<java.lang.String>
      getTargetsList();
  /**
   * <pre>
   * Targets the model was trained on
   * </pre>
   *
   * <code>repeated string targets = 3 [json_name = "targets"];</code>
   * @return The count of targets.
   */
  int getTargetsCount();
  /**
   * <pre>
   * Targets the model was trained on
   * </pre>
   *
   * <code>repeated string targets = 3 [json_name = "targets"];</code>
   * @param index The index of the element to return.
   * @return The targets at the given index.
   */
  java.lang.String getTargets(int index);
  /**
   * <pre>
   * Targets the model was trained on
   * </pre>
   *
   * <code>repeated string targets = 3 [json_name = "targets"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the targets at the given index.
   */
  com.google.protobuf.ByteString
      getTargetsBytes(int index);
}
