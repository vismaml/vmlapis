// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ssn/imageservice/v1/imageservice.proto

package ai.visma.ssn.imageservice.v1;

public interface CreateImageRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ssn.imageservice.v1.CreateImageRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string input_paths = 1 [json_name = "inputPaths"];</code>
   * @return A list containing the inputPaths.
   */
  java.util.List<java.lang.String>
      getInputPathsList();
  /**
   * <code>repeated string input_paths = 1 [json_name = "inputPaths"];</code>
   * @return The count of inputPaths.
   */
  int getInputPathsCount();
  /**
   * <code>repeated string input_paths = 1 [json_name = "inputPaths"];</code>
   * @param index The index of the element to return.
   * @return The inputPaths at the given index.
   */
  java.lang.String getInputPaths(int index);
  /**
   * <code>repeated string input_paths = 1 [json_name = "inputPaths"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the inputPaths at the given index.
   */
  com.google.protobuf.ByteString
      getInputPathsBytes(int index);

  /**
   * <code>string output_path = 2 [json_name = "outputPath"];</code>
   * @return The outputPath.
   */
  java.lang.String getOutputPath();
  /**
   * <code>string output_path = 2 [json_name = "outputPath"];</code>
   * @return The bytes for outputPath.
   */
  com.google.protobuf.ByteString
      getOutputPathBytes();
}
