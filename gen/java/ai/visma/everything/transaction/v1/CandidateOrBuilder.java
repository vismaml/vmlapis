// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: everything/transaction/v1/transaction.proto

package ai.visma.everything.transaction.v1;

public interface CandidateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:everything.transaction.v1.Candidate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .ssn.type.Candidate candidate = 1 [json_name = "candidate"];</code>
   */
  java.util.List<ai.visma.ssn.type.Candidate> 
      getCandidateList();
  /**
   * <code>repeated .ssn.type.Candidate candidate = 1 [json_name = "candidate"];</code>
   */
  ai.visma.ssn.type.Candidate getCandidate(int index);
  /**
   * <code>repeated .ssn.type.Candidate candidate = 1 [json_name = "candidate"];</code>
   */
  int getCandidateCount();
  /**
   * <code>repeated .ssn.type.Candidate candidate = 1 [json_name = "candidate"];</code>
   */
  java.util.List<? extends ai.visma.ssn.type.CandidateOrBuilder> 
      getCandidateOrBuilderList();
  /**
   * <code>repeated .ssn.type.Candidate candidate = 1 [json_name = "candidate"];</code>
   */
  ai.visma.ssn.type.CandidateOrBuilder getCandidateOrBuilder(
      int index);
}
