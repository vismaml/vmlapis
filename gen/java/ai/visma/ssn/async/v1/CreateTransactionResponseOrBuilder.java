// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ssn/async/v1/async.proto

package ai.visma.ssn.async.v1;

public interface CreateTransactionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ssn.async.v1.CreateTransactionResponse)
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
   * <pre>
   * CreateTransactionResponse message can potentially contain results from synchronous features (e.g. current SSN prediciton)
   * but I think I'm more prone to separate them in /results endpoint
   * </pre>
   *
   * <code>string custom_id = 2 [json_name = "customId"];</code>
   * @return The customId.
   */
  java.lang.String getCustomId();
  /**
   * <pre>
   * CreateTransactionResponse message can potentially contain results from synchronous features (e.g. current SSN prediciton)
   * but I think I'm more prone to separate them in /results endpoint
   * </pre>
   *
   * <code>string custom_id = 2 [json_name = "customId"];</code>
   * @return The bytes for customId.
   */
  com.google.protobuf.ByteString
      getCustomIdBytes();
}
