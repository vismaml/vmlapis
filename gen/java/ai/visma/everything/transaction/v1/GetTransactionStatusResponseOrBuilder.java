// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: everything/transaction/v1/transaction.proto

package ai.visma.everything.transaction.v1;

public interface GetTransactionStatusResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:everything.transaction.v1.GetTransactionStatusResponse)
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
   * e.g. "RUNNING", "SUCCESSFUL", "PARTIAL", "FAILED"
   * "PARTIAL" is when some features failed - e.g. SSN succeeded but purchase lines failed
   * </pre>
   *
   * <code>string status = 2 [json_name = "status"];</code>
   * @return The status.
   */
  java.lang.String getStatus();
  /**
   * <pre>
   * e.g. "RUNNING", "SUCCESSFUL", "PARTIAL", "FAILED"
   * "PARTIAL" is when some features failed - e.g. SSN succeeded but purchase lines failed
   * </pre>
   *
   * <code>string status = 2 [json_name = "status"];</code>
   * @return The bytes for status.
   */
  com.google.protobuf.ByteString
      getStatusBytes();

  /**
   * <pre>
   * Only populated when status == "FAILED" or status == "PARTIAL"
   * </pre>
   *
   * <code>string error_message = 3 [json_name = "errorMessage"];</code>
   * @return The errorMessage.
   */
  java.lang.String getErrorMessage();
  /**
   * <pre>
   * Only populated when status == "FAILED" or status == "PARTIAL"
   * </pre>
   *
   * <code>string error_message = 3 [json_name = "errorMessage"];</code>
   * @return The bytes for errorMessage.
   */
  com.google.protobuf.ByteString
      getErrorMessageBytes();
}
