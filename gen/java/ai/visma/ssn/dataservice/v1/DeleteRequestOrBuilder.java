// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: ssn/dataservice/v1/dataservice.proto
// Protobuf Java Version: 4.29.3

package ai.visma.ssn.dataservice.v1;

public interface DeleteRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ssn.dataservice.v1.DeleteRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string tags = 1 [json_name = "tags"];</code>
   * @return A list containing the tags.
   */
  java.util.List<java.lang.String>
      getTagsList();
  /**
   * <code>repeated string tags = 1 [json_name = "tags"];</code>
   * @return The count of tags.
   */
  int getTagsCount();
  /**
   * <code>repeated string tags = 1 [json_name = "tags"];</code>
   * @param index The index of the element to return.
   * @return The tags at the given index.
   */
  java.lang.String getTags(int index);
  /**
   * <code>repeated string tags = 1 [json_name = "tags"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the tags at the given index.
   */
  com.google.protobuf.ByteString
      getTagsBytes(int index);
}
