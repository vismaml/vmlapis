// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: cv/scanner/v1/scanner.proto
// Protobuf Java Version: 4.29.3

package ai.visma.cv.scanner.v1;

public interface ScanCVRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cv.scanner.v1.ScanCVRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.ssn.annotator.v1.Document document = 1 [json_name = "document"];</code>
   * @return Whether the document field is set.
   */
  boolean hasDocument();
  /**
   * <code>.ssn.annotator.v1.Document document = 1 [json_name = "document"];</code>
   * @return The document.
   */
  ai.visma.ssn.annotator.v1.Document getDocument();
  /**
   * <code>.ssn.annotator.v1.Document document = 1 [json_name = "document"];</code>
   */
  ai.visma.ssn.annotator.v1.DocumentOrBuilder getDocumentOrBuilder();

  /**
   * <code>repeated .cv.scanner.v1.Feature features = 2 [json_name = "features"];</code>
   */
  java.util.List<ai.visma.cv.scanner.v1.Feature> 
      getFeaturesList();
  /**
   * <code>repeated .cv.scanner.v1.Feature features = 2 [json_name = "features"];</code>
   */
  ai.visma.cv.scanner.v1.Feature getFeatures(int index);
  /**
   * <code>repeated .cv.scanner.v1.Feature features = 2 [json_name = "features"];</code>
   */
  int getFeaturesCount();
  /**
   * <code>repeated .cv.scanner.v1.Feature features = 2 [json_name = "features"];</code>
   */
  java.util.List<? extends ai.visma.cv.scanner.v1.FeatureOrBuilder> 
      getFeaturesOrBuilderList();
  /**
   * <code>repeated .cv.scanner.v1.Feature features = 2 [json_name = "features"];</code>
   */
  ai.visma.cv.scanner.v1.FeatureOrBuilder getFeaturesOrBuilder(
      int index);

  /**
   * <code>repeated string tags = 3 [json_name = "tags"];</code>
   * @return A list containing the tags.
   */
  java.util.List<java.lang.String>
      getTagsList();
  /**
   * <code>repeated string tags = 3 [json_name = "tags"];</code>
   * @return The count of tags.
   */
  int getTagsCount();
  /**
   * <code>repeated string tags = 3 [json_name = "tags"];</code>
   * @param index The index of the element to return.
   * @return The tags at the given index.
   */
  java.lang.String getTags(int index);
  /**
   * <code>repeated string tags = 3 [json_name = "tags"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the tags at the given index.
   */
  com.google.protobuf.ByteString
      getTagsBytes(int index);
}
