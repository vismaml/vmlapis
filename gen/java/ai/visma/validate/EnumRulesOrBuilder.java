// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: validate/validate.proto
// Protobuf Java Version: 4.29.3

package ai.visma.validate;

public interface EnumRulesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:validate.EnumRules)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Const specifies that this field must be exactly the specified value
   * </pre>
   *
   * <code>optional int32 const = 1 [json_name = "const"];</code>
   * @return Whether the const field is set.
   */
  boolean hasConst();
  /**
   * <pre>
   * Const specifies that this field must be exactly the specified value
   * </pre>
   *
   * <code>optional int32 const = 1 [json_name = "const"];</code>
   * @return The const.
   */
  int getConst();

  /**
   * <pre>
   * DefinedOnly specifies that this field must be only one of the defined
   * values for this enum, failing on any undefined value.
   * </pre>
   *
   * <code>optional bool defined_only = 2 [json_name = "definedOnly"];</code>
   * @return Whether the definedOnly field is set.
   */
  boolean hasDefinedOnly();
  /**
   * <pre>
   * DefinedOnly specifies that this field must be only one of the defined
   * values for this enum, failing on any undefined value.
   * </pre>
   *
   * <code>optional bool defined_only = 2 [json_name = "definedOnly"];</code>
   * @return The definedOnly.
   */
  boolean getDefinedOnly();

  /**
   * <pre>
   * In specifies that this field must be equal to one of the specified
   * values
   * </pre>
   *
   * <code>repeated int32 in = 3 [json_name = "in"];</code>
   * @return A list containing the in.
   */
  java.util.List<java.lang.Integer> getInList();
  /**
   * <pre>
   * In specifies that this field must be equal to one of the specified
   * values
   * </pre>
   *
   * <code>repeated int32 in = 3 [json_name = "in"];</code>
   * @return The count of in.
   */
  int getInCount();
  /**
   * <pre>
   * In specifies that this field must be equal to one of the specified
   * values
   * </pre>
   *
   * <code>repeated int32 in = 3 [json_name = "in"];</code>
   * @param index The index of the element to return.
   * @return The in at the given index.
   */
  int getIn(int index);

  /**
   * <pre>
   * NotIn specifies that this field cannot be equal to one of the specified
   * values
   * </pre>
   *
   * <code>repeated int32 not_in = 4 [json_name = "notIn"];</code>
   * @return A list containing the notIn.
   */
  java.util.List<java.lang.Integer> getNotInList();
  /**
   * <pre>
   * NotIn specifies that this field cannot be equal to one of the specified
   * values
   * </pre>
   *
   * <code>repeated int32 not_in = 4 [json_name = "notIn"];</code>
   * @return The count of notIn.
   */
  int getNotInCount();
  /**
   * <pre>
   * NotIn specifies that this field cannot be equal to one of the specified
   * values
   * </pre>
   *
   * <code>repeated int32 not_in = 4 [json_name = "notIn"];</code>
   * @param index The index of the element to return.
   * @return The notIn at the given index.
   */
  int getNotIn(int index);
}
