// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: asgt/jester/v1/jester.proto
// Protobuf Java Version: 4.29.3

package ai.visma.asgt.jester.v1;

public interface SuggestionOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:asgt.jester.v1.SuggestionOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 suggestion_limit = 1 [json_name = "suggestionLimit"];</code>
   * @return The suggestionLimit.
   */
  int getSuggestionLimit();

  /**
   * <code>.asgt.type.Confidence.Level min_confidence = 2 [json_name = "minConfidence"];</code>
   * @return The enum numeric value on the wire for minConfidence.
   */
  int getMinConfidenceValue();
  /**
   * <code>.asgt.type.Confidence.Level min_confidence = 2 [json_name = "minConfidence"];</code>
   * @return The minConfidence.
   */
  ai.visma.asgt.type.Confidence.Level getMinConfidence();

  /**
   * <code>.asgt.type.ModelType model_type = 3 [json_name = "modelType"];</code>
   * @return The enum numeric value on the wire for modelType.
   */
  int getModelTypeValue();
  /**
   * <code>.asgt.type.ModelType model_type = 3 [json_name = "modelType"];</code>
   * @return The modelType.
   */
  ai.visma.asgt.type.ModelType getModelType();
}
