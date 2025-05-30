// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: asgt/data/v1/data_service.proto
// Protobuf Java Version: 4.29.3

package ai.visma.asgt.dataservice.v1;

public interface RegisterQueryStatsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:asgt.dataservice.v1.RegisterQueryStatsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string dataset = 1 [json_name = "dataset"];</code>
   * @return The dataset.
   */
  java.lang.String getDataset();
  /**
   * <code>string dataset = 1 [json_name = "dataset"];</code>
   * @return The bytes for dataset.
   */
  com.google.protobuf.ByteString
      getDatasetBytes();

  /**
   * <code>string model_type = 2 [json_name = "modelType"];</code>
   * @return The modelType.
   */
  java.lang.String getModelType();
  /**
   * <code>string model_type = 2 [json_name = "modelType"];</code>
   * @return The bytes for modelType.
   */
  com.google.protobuf.ByteString
      getModelTypeBytes();

  /**
   * <code>int32 batch_size = 3 [json_name = "batchSize"];</code>
   * @return The batchSize.
   */
  int getBatchSize();

  /**
   * <code>repeated string tags = 4 [json_name = "tags"];</code>
   * @return A list containing the tags.
   */
  java.util.List<java.lang.String>
      getTagsList();
  /**
   * <code>repeated string tags = 4 [json_name = "tags"];</code>
   * @return The count of tags.
   */
  int getTagsCount();
  /**
   * <code>repeated string tags = 4 [json_name = "tags"];</code>
   * @param index The index of the element to return.
   * @return The tags at the given index.
   */
  java.lang.String getTags(int index);
  /**
   * <code>repeated string tags = 4 [json_name = "tags"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the tags at the given index.
   */
  com.google.protobuf.ByteString
      getTagsBytes(int index);
}
