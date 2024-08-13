// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ssn/async/v1/async.proto

package ai.visma.ssn.async.v1;

public interface GetTransactionResultsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ssn.async.v1.GetTransactionResultsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string custom_id = 2 [json_name = "customId"];</code>
   * @return The customId.
   */
  java.lang.String getCustomId();
  /**
   * <code>string custom_id = 2 [json_name = "customId"];</code>
   * @return The bytes for customId.
   */
  com.google.protobuf.ByteString
      getCustomIdBytes();

  /**
   * <pre>
   * GetTransactionResultsRequest message can potentially have a list of features to filter the response
   * e.g. repeated string features like in CreateTransactionRequest
   * </pre>
   *
   * <code>.ssn.type.Confidence.Level min_confidence = 3 [json_name = "minConfidence"];</code>
   * @return The enum numeric value on the wire for minConfidence.
   */
  int getMinConfidenceValue();
  /**
   * <pre>
   * GetTransactionResultsRequest message can potentially have a list of features to filter the response
   * e.g. repeated string features like in CreateTransactionRequest
   * </pre>
   *
   * <code>.ssn.type.Confidence.Level min_confidence = 3 [json_name = "minConfidence"];</code>
   * @return The minConfidence.
   */
  ai.visma.ssn.type.Confidence.Level getMinConfidence();

  /**
   * <code>int32 max_results = 4 [json_name = "maxResults"];</code>
   * @return The maxResults.
   */
  int getMaxResults();
}
