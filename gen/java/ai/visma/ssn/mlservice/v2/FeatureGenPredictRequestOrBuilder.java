// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: ssn/mlservice/v2/mlservice.proto
// Protobuf Java Version: 4.29.3

package ai.visma.ssn.mlservice.v2;

public interface FeatureGenPredictRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ssn.mlservice.v2.FeatureGenPredictRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.ssn.mlservice.v2.FeatureGenRequest feature_gen_request = 1 [json_name = "featureGenRequest"];</code>
   * @return Whether the featureGenRequest field is set.
   */
  boolean hasFeatureGenRequest();
  /**
   * <code>.ssn.mlservice.v2.FeatureGenRequest feature_gen_request = 1 [json_name = "featureGenRequest"];</code>
   * @return The featureGenRequest.
   */
  ai.visma.ssn.mlservice.v2.FeatureGenRequest getFeatureGenRequest();
  /**
   * <code>.ssn.mlservice.v2.FeatureGenRequest feature_gen_request = 1 [json_name = "featureGenRequest"];</code>
   */
  ai.visma.ssn.mlservice.v2.FeatureGenRequestOrBuilder getFeatureGenRequestOrBuilder();

  /**
   * <code>.ssn.mlservice.v2.PredictRequest predict_request = 2 [json_name = "predictRequest"];</code>
   * @return Whether the predictRequest field is set.
   */
  boolean hasPredictRequest();
  /**
   * <code>.ssn.mlservice.v2.PredictRequest predict_request = 2 [json_name = "predictRequest"];</code>
   * @return The predictRequest.
   */
  ai.visma.ssn.mlservice.v2.PredictRequest getPredictRequest();
  /**
   * <code>.ssn.mlservice.v2.PredictRequest predict_request = 2 [json_name = "predictRequest"];</code>
   */
  ai.visma.ssn.mlservice.v2.PredictRequestOrBuilder getPredictRequestOrBuilder();
}
