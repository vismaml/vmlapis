// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: asgt/modelregistry/v1/model_registry.proto
// Protobuf Java Version: 4.29.3

package ai.visma.asgt.modelregistry.v1;

public interface GetCurrentModelRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:asgt.modelregistry.v1.GetCurrentModelRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.asgt.type.Dataset dataset = 1 [json_name = "dataset"];</code>
   * @return Whether the dataset field is set.
   */
  boolean hasDataset();
  /**
   * <code>.asgt.type.Dataset dataset = 1 [json_name = "dataset"];</code>
   * @return The dataset.
   */
  ai.visma.asgt.type.Dataset getDataset();
  /**
   * <code>.asgt.type.Dataset dataset = 1 [json_name = "dataset"];</code>
   */
  ai.visma.asgt.type.DatasetOrBuilder getDatasetOrBuilder();

  /**
   * <code>.asgt.type.ModelType model_type = 2 [json_name = "modelType"];</code>
   * @return The enum numeric value on the wire for modelType.
   */
  int getModelTypeValue();
  /**
   * <code>.asgt.type.ModelType model_type = 2 [json_name = "modelType"];</code>
   * @return The modelType.
   */
  ai.visma.asgt.type.ModelType getModelType();
}
