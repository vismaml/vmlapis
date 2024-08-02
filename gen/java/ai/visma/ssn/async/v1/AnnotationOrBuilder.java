// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ssn/async/v1/async.proto

package ai.visma.ssn.async.v1;

public interface AnnotationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ssn.async.v1.Annotation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * feature name e.g. "TOTAL_INCL_VAT"
   * </pre>
   *
   * <code>string feature = 1 [json_name = "feature"];</code>
   * @return The feature.
   */
  java.lang.String getFeature();
  /**
   * <pre>
   * feature name e.g. "TOTAL_INCL_VAT"
   * </pre>
   *
   * <code>string feature = 1 [json_name = "feature"];</code>
   * @return The bytes for feature.
   */
  com.google.protobuf.ByteString
      getFeatureBytes();

  /**
   * <pre>
   * candidate contains a page number
   * </pre>
   *
   * <code>.ssn.async.v1.Candidate candidate = 2 [json_name = "candidate"];</code>
   * @return Whether the candidate field is set.
   */
  boolean hasCandidate();
  /**
   * <pre>
   * candidate contains a page number
   * </pre>
   *
   * <code>.ssn.async.v1.Candidate candidate = 2 [json_name = "candidate"];</code>
   * @return The candidate.
   */
  ai.visma.ssn.async.v1.Candidate getCandidate();
  /**
   * <pre>
   * candidate contains a page number
   * </pre>
   *
   * <code>.ssn.async.v1.Candidate candidate = 2 [json_name = "candidate"];</code>
   */
  ai.visma.ssn.async.v1.CandidateOrBuilder getCandidateOrBuilder();

  /**
   * <code>.ssn.async.v1.PurchaseLineCandidate purchase_line_candidate = 3 [json_name = "purchaseLineCandidate"];</code>
   * @return Whether the purchaseLineCandidate field is set.
   */
  boolean hasPurchaseLineCandidate();
  /**
   * <code>.ssn.async.v1.PurchaseLineCandidate purchase_line_candidate = 3 [json_name = "purchaseLineCandidate"];</code>
   * @return The purchaseLineCandidate.
   */
  ai.visma.ssn.async.v1.PurchaseLineCandidate getPurchaseLineCandidate();
  /**
   * <code>.ssn.async.v1.PurchaseLineCandidate purchase_line_candidate = 3 [json_name = "purchaseLineCandidate"];</code>
   */
  ai.visma.ssn.async.v1.PurchaseLineCandidateOrBuilder getPurchaseLineCandidateOrBuilder();

  /**
   * <code>.ssn.async.v1.AnswerCandidate answer_candidates = 4 [json_name = "answerCandidates"];</code>
   * @return Whether the answerCandidates field is set.
   */
  boolean hasAnswerCandidates();
  /**
   * <code>.ssn.async.v1.AnswerCandidate answer_candidates = 4 [json_name = "answerCandidates"];</code>
   * @return The answerCandidates.
   */
  ai.visma.ssn.async.v1.AnswerCandidate getAnswerCandidates();
  /**
   * <code>.ssn.async.v1.AnswerCandidate answer_candidates = 4 [json_name = "answerCandidates"];</code>
   */
  ai.visma.ssn.async.v1.AnswerCandidateOrBuilder getAnswerCandidatesOrBuilder();

  /**
   * <code>.ssn.async.v1.LineCandidate line_candidates = 5 [json_name = "lineCandidates"];</code>
   * @return Whether the lineCandidates field is set.
   */
  boolean hasLineCandidates();
  /**
   * <code>.ssn.async.v1.LineCandidate line_candidates = 5 [json_name = "lineCandidates"];</code>
   * @return The lineCandidates.
   */
  ai.visma.ssn.async.v1.LineCandidate getLineCandidates();
  /**
   * <code>.ssn.async.v1.LineCandidate line_candidates = 5 [json_name = "lineCandidates"];</code>
   */
  ai.visma.ssn.async.v1.LineCandidateOrBuilder getLineCandidatesOrBuilder();

  /**
   * <code>.ssn.async.v1.PageText page_text = 6 [json_name = "pageText"];</code>
   * @return Whether the pageText field is set.
   */
  boolean hasPageText();
  /**
   * <code>.ssn.async.v1.PageText page_text = 6 [json_name = "pageText"];</code>
   * @return The pageText.
   */
  ai.visma.ssn.async.v1.PageText getPageText();
  /**
   * <code>.ssn.async.v1.PageText page_text = 6 [json_name = "pageText"];</code>
   */
  ai.visma.ssn.async.v1.PageTextOrBuilder getPageTextOrBuilder();

  /**
   * <code>string value = 7 [json_name = "value"];</code>
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <code>string value = 7 [json_name = "value"];</code>
   * @return The value.
   */
  java.lang.String getValue();
  /**
   * <code>string value = 7 [json_name = "value"];</code>
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString
      getValueBytes();

  /**
   * <code>.ssn.async.v1.TextAnnotation text_annotation = 8 [json_name = "textAnnotation"];</code>
   * @return Whether the textAnnotation field is set.
   */
  boolean hasTextAnnotation();
  /**
   * <code>.ssn.async.v1.TextAnnotation text_annotation = 8 [json_name = "textAnnotation"];</code>
   * @return The textAnnotation.
   */
  ai.visma.ssn.async.v1.TextAnnotation getTextAnnotation();
  /**
   * <code>.ssn.async.v1.TextAnnotation text_annotation = 8 [json_name = "textAnnotation"];</code>
   */
  ai.visma.ssn.async.v1.TextAnnotationOrBuilder getTextAnnotationOrBuilder();

  ai.visma.ssn.async.v1.Annotation.CandidatesCase getCandidatesCase();
}
