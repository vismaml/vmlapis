// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ssn/mlservice/v2/mlservice.proto

package ai.visma.ssn.mlservice.v2;

public interface PurchaseLinesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ssn.mlservice.v2.PurchaseLinesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.ssn.type.TextAnnotation text_annotation = 1 [json_name = "textAnnotation"];</code>
   * @return Whether the textAnnotation field is set.
   */
  boolean hasTextAnnotation();
  /**
   * <code>.ssn.type.TextAnnotation text_annotation = 1 [json_name = "textAnnotation"];</code>
   * @return The textAnnotation.
   */
  ai.visma.ssn.type.TextAnnotation getTextAnnotation();
  /**
   * <code>.ssn.type.TextAnnotation text_annotation = 1 [json_name = "textAnnotation"];</code>
   */
  ai.visma.ssn.type.TextAnnotationOrBuilder getTextAnnotationOrBuilder();

  /**
   * <code>bytes image = 2 [json_name = "image"];</code>
   * @return The image.
   */
  com.google.protobuf.ByteString getImage();
}
