// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: validate/validate.proto
// Protobuf Java Version: 4.29.3

package ai.visma.validate;

public interface DurationRulesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:validate.DurationRules)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required specifies that this field must be set
   * </pre>
   *
   * <code>optional bool required = 1 [json_name = "required"];</code>
   * @return Whether the required field is set.
   */
  boolean hasRequired();
  /**
   * <pre>
   * Required specifies that this field must be set
   * </pre>
   *
   * <code>optional bool required = 1 [json_name = "required"];</code>
   * @return The required.
   */
  boolean getRequired();

  /**
   * <pre>
   * Const specifies that this field must be exactly the specified value
   * </pre>
   *
   * <code>optional .google.protobuf.Duration const = 2 [json_name = "const"];</code>
   * @return Whether the const field is set.
   */
  boolean hasConst();
  /**
   * <pre>
   * Const specifies that this field must be exactly the specified value
   * </pre>
   *
   * <code>optional .google.protobuf.Duration const = 2 [json_name = "const"];</code>
   * @return The const.
   */
  com.google.protobuf.Duration getConst();
  /**
   * <pre>
   * Const specifies that this field must be exactly the specified value
   * </pre>
   *
   * <code>optional .google.protobuf.Duration const = 2 [json_name = "const"];</code>
   */
  com.google.protobuf.DurationOrBuilder getConstOrBuilder();

  /**
   * <pre>
   * Lt specifies that this field must be less than the specified value,
   * exclusive
   * </pre>
   *
   * <code>optional .google.protobuf.Duration lt = 3 [json_name = "lt"];</code>
   * @return Whether the lt field is set.
   */
  boolean hasLt();
  /**
   * <pre>
   * Lt specifies that this field must be less than the specified value,
   * exclusive
   * </pre>
   *
   * <code>optional .google.protobuf.Duration lt = 3 [json_name = "lt"];</code>
   * @return The lt.
   */
  com.google.protobuf.Duration getLt();
  /**
   * <pre>
   * Lt specifies that this field must be less than the specified value,
   * exclusive
   * </pre>
   *
   * <code>optional .google.protobuf.Duration lt = 3 [json_name = "lt"];</code>
   */
  com.google.protobuf.DurationOrBuilder getLtOrBuilder();

  /**
   * <pre>
   * Lt specifies that this field must be less than the specified value,
   * inclusive
   * </pre>
   *
   * <code>optional .google.protobuf.Duration lte = 4 [json_name = "lte"];</code>
   * @return Whether the lte field is set.
   */
  boolean hasLte();
  /**
   * <pre>
   * Lt specifies that this field must be less than the specified value,
   * inclusive
   * </pre>
   *
   * <code>optional .google.protobuf.Duration lte = 4 [json_name = "lte"];</code>
   * @return The lte.
   */
  com.google.protobuf.Duration getLte();
  /**
   * <pre>
   * Lt specifies that this field must be less than the specified value,
   * inclusive
   * </pre>
   *
   * <code>optional .google.protobuf.Duration lte = 4 [json_name = "lte"];</code>
   */
  com.google.protobuf.DurationOrBuilder getLteOrBuilder();

  /**
   * <pre>
   * Gt specifies that this field must be greater than the specified value,
   * exclusive
   * </pre>
   *
   * <code>optional .google.protobuf.Duration gt = 5 [json_name = "gt"];</code>
   * @return Whether the gt field is set.
   */
  boolean hasGt();
  /**
   * <pre>
   * Gt specifies that this field must be greater than the specified value,
   * exclusive
   * </pre>
   *
   * <code>optional .google.protobuf.Duration gt = 5 [json_name = "gt"];</code>
   * @return The gt.
   */
  com.google.protobuf.Duration getGt();
  /**
   * <pre>
   * Gt specifies that this field must be greater than the specified value,
   * exclusive
   * </pre>
   *
   * <code>optional .google.protobuf.Duration gt = 5 [json_name = "gt"];</code>
   */
  com.google.protobuf.DurationOrBuilder getGtOrBuilder();

  /**
   * <pre>
   * Gte specifies that this field must be greater than the specified value,
   * inclusive
   * </pre>
   *
   * <code>optional .google.protobuf.Duration gte = 6 [json_name = "gte"];</code>
   * @return Whether the gte field is set.
   */
  boolean hasGte();
  /**
   * <pre>
   * Gte specifies that this field must be greater than the specified value,
   * inclusive
   * </pre>
   *
   * <code>optional .google.protobuf.Duration gte = 6 [json_name = "gte"];</code>
   * @return The gte.
   */
  com.google.protobuf.Duration getGte();
  /**
   * <pre>
   * Gte specifies that this field must be greater than the specified value,
   * inclusive
   * </pre>
   *
   * <code>optional .google.protobuf.Duration gte = 6 [json_name = "gte"];</code>
   */
  com.google.protobuf.DurationOrBuilder getGteOrBuilder();

  /**
   * <pre>
   * In specifies that this field must be equal to one of the specified
   * values
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration in = 7 [json_name = "in"];</code>
   */
  java.util.List<com.google.protobuf.Duration> 
      getInList();
  /**
   * <pre>
   * In specifies that this field must be equal to one of the specified
   * values
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration in = 7 [json_name = "in"];</code>
   */
  com.google.protobuf.Duration getIn(int index);
  /**
   * <pre>
   * In specifies that this field must be equal to one of the specified
   * values
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration in = 7 [json_name = "in"];</code>
   */
  int getInCount();
  /**
   * <pre>
   * In specifies that this field must be equal to one of the specified
   * values
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration in = 7 [json_name = "in"];</code>
   */
  java.util.List<? extends com.google.protobuf.DurationOrBuilder> 
      getInOrBuilderList();
  /**
   * <pre>
   * In specifies that this field must be equal to one of the specified
   * values
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration in = 7 [json_name = "in"];</code>
   */
  com.google.protobuf.DurationOrBuilder getInOrBuilder(
      int index);

  /**
   * <pre>
   * NotIn specifies that this field cannot be equal to one of the specified
   * values
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration not_in = 8 [json_name = "notIn"];</code>
   */
  java.util.List<com.google.protobuf.Duration> 
      getNotInList();
  /**
   * <pre>
   * NotIn specifies that this field cannot be equal to one of the specified
   * values
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration not_in = 8 [json_name = "notIn"];</code>
   */
  com.google.protobuf.Duration getNotIn(int index);
  /**
   * <pre>
   * NotIn specifies that this field cannot be equal to one of the specified
   * values
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration not_in = 8 [json_name = "notIn"];</code>
   */
  int getNotInCount();
  /**
   * <pre>
   * NotIn specifies that this field cannot be equal to one of the specified
   * values
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration not_in = 8 [json_name = "notIn"];</code>
   */
  java.util.List<? extends com.google.protobuf.DurationOrBuilder> 
      getNotInOrBuilderList();
  /**
   * <pre>
   * NotIn specifies that this field cannot be equal to one of the specified
   * values
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration not_in = 8 [json_name = "notIn"];</code>
   */
  com.google.protobuf.DurationOrBuilder getNotInOrBuilder(
      int index);
}
