// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: ssn/mlservice/v2/mlservice.proto
// Protobuf Java Version: 4.29.3

package ai.visma.ssn.mlservice.v2;

public interface VatDistributionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ssn.mlservice.v2.VatDistributionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .ssn.type.VatDistributionCandidate vat_distribution_candidates = 1 [json_name = "vatDistributionCandidates"];</code>
   */
  java.util.List<ai.visma.ssn.type.VatDistributionCandidate> 
      getVatDistributionCandidatesList();
  /**
   * <code>repeated .ssn.type.VatDistributionCandidate vat_distribution_candidates = 1 [json_name = "vatDistributionCandidates"];</code>
   */
  ai.visma.ssn.type.VatDistributionCandidate getVatDistributionCandidates(int index);
  /**
   * <code>repeated .ssn.type.VatDistributionCandidate vat_distribution_candidates = 1 [json_name = "vatDistributionCandidates"];</code>
   */
  int getVatDistributionCandidatesCount();
  /**
   * <code>repeated .ssn.type.VatDistributionCandidate vat_distribution_candidates = 1 [json_name = "vatDistributionCandidates"];</code>
   */
  java.util.List<? extends ai.visma.ssn.type.VatDistributionCandidateOrBuilder> 
      getVatDistributionCandidatesOrBuilderList();
  /**
   * <code>repeated .ssn.type.VatDistributionCandidate vat_distribution_candidates = 1 [json_name = "vatDistributionCandidates"];</code>
   */
  ai.visma.ssn.type.VatDistributionCandidateOrBuilder getVatDistributionCandidatesOrBuilder(
      int index);
}
