// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: asgt/v2/dataset_service.proto

package ai.visma.asgt.v2;

public interface TrainingRequestOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:asgt.v2.TrainingRequestOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The number of trainings to return. Ranges from 1 to 100.
   * </pre>
   *
   * <code>int64 limit = 1 [json_name = "limit", (.validate.rules) = { ... }</code>
   * @return The limit.
   */
  long getLimit();
}
