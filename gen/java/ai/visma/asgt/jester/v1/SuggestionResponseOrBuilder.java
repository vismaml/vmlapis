// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: asgt/jester/v1/jester.proto
// Protobuf Java Version: 4.29.3

package ai.visma.asgt.jester.v1;

public interface SuggestionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:asgt.jester.v1.SuggestionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .asgt.type.Prediction predictions = 1 [json_name = "predictions"];</code>
   */
  java.util.List<ai.visma.asgt.type.Prediction> 
      getPredictionsList();
  /**
   * <code>repeated .asgt.type.Prediction predictions = 1 [json_name = "predictions"];</code>
   */
  ai.visma.asgt.type.Prediction getPredictions(int index);
  /**
   * <code>repeated .asgt.type.Prediction predictions = 1 [json_name = "predictions"];</code>
   */
  int getPredictionsCount();
  /**
   * <code>repeated .asgt.type.Prediction predictions = 1 [json_name = "predictions"];</code>
   */
  java.util.List<? extends ai.visma.asgt.type.PredictionOrBuilder> 
      getPredictionsOrBuilderList();
  /**
   * <code>repeated .asgt.type.Prediction predictions = 1 [json_name = "predictions"];</code>
   */
  ai.visma.asgt.type.PredictionOrBuilder getPredictionsOrBuilder(
      int index);

  /**
   * <code>.asgt.type.Model model = 2 [json_name = "model"];</code>
   * @return Whether the model field is set.
   */
  boolean hasModel();
  /**
   * <code>.asgt.type.Model model = 2 [json_name = "model"];</code>
   * @return The model.
   */
  ai.visma.asgt.type.Model getModel();
  /**
   * <code>.asgt.type.Model model = 2 [json_name = "model"];</code>
   */
  ai.visma.asgt.type.ModelOrBuilder getModelOrBuilder();
}
