// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: ssn/pdfservice/v1/pdfservice.proto
// Protobuf Java Version: 4.29.3

package ai.visma.ssn.pdfservice.v1;

public interface RasterizePdfResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ssn.pdfservice.v1.RasterizePdfResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 index = 1 [json_name = "index"];</code>
   * @return The index.
   */
  int getIndex();

  /**
   * <code>bytes data = 2 [json_name = "data"];</code>
   * @return The data.
   */
  com.google.protobuf.ByteString getData();

  /**
   * <code>uint32 width = 3 [json_name = "width"];</code>
   * @return The width.
   */
  int getWidth();

  /**
   * <code>uint32 height = 4 [json_name = "height"];</code>
   * @return The height.
   */
  int getHeight();

  /**
   * <pre>
   * Compared to a 72 dpi page
   * </pre>
   *
   * <code>double scale = 5 [json_name = "scale"];</code>
   * @return The scale.
   */
  double getScale();
}
