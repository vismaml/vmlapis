// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: asgt/jester/v1/jester.proto

package ai.visma.asgt.jester.v1;

public interface SuggestionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:asgt.jester.v1.SuggestionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string type = 2 [json_name = "type"];</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <code>string type = 2 [json_name = "type"];</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <code>repeated .asgt.type.Data inputs = 3 [json_name = "inputs"];</code>
   */
  java.util.List<ai.visma.asgt.type.Data> 
      getInputsList();
  /**
   * <code>repeated .asgt.type.Data inputs = 3 [json_name = "inputs"];</code>
   */
  ai.visma.asgt.type.Data getInputs(int index);
  /**
   * <code>repeated .asgt.type.Data inputs = 3 [json_name = "inputs"];</code>
   */
  int getInputsCount();
  /**
   * <code>repeated .asgt.type.Data inputs = 3 [json_name = "inputs"];</code>
   */
  java.util.List<? extends ai.visma.asgt.type.DataOrBuilder> 
      getInputsOrBuilderList();
  /**
   * <code>repeated .asgt.type.Data inputs = 3 [json_name = "inputs"];</code>
   */
  ai.visma.asgt.type.DataOrBuilder getInputsOrBuilder(
      int index);

  /**
   * <code>.asgt.jester.v1.SuggestionOptions options = 4 [json_name = "options"];</code>
   * @return Whether the options field is set.
   */
  boolean hasOptions();
  /**
   * <code>.asgt.jester.v1.SuggestionOptions options = 4 [json_name = "options"];</code>
   * @return The options.
   */
  ai.visma.asgt.jester.v1.SuggestionOptions getOptions();
  /**
   * <code>.asgt.jester.v1.SuggestionOptions options = 4 [json_name = "options"];</code>
   */
  ai.visma.asgt.jester.v1.SuggestionOptionsOrBuilder getOptionsOrBuilder();

  /**
   * <code>repeated string tags = 5 [json_name = "tags"];</code>
   * @return A list containing the tags.
   */
  java.util.List<java.lang.String>
      getTagsList();
  /**
   * <code>repeated string tags = 5 [json_name = "tags"];</code>
   * @return The count of tags.
   */
  int getTagsCount();
  /**
   * <code>repeated string tags = 5 [json_name = "tags"];</code>
   * @param index The index of the element to return.
   * @return The tags at the given index.
   */
  java.lang.String getTags(int index);
  /**
   * <code>repeated string tags = 5 [json_name = "tags"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the tags at the given index.
   */
  com.google.protobuf.ByteString
      getTagsBytes(int index);

  /**
   * <code>.asgt.type.Model model = 6 [json_name = "model"];</code>
   * @return Whether the model field is set.
   */
  boolean hasModel();
  /**
   * <code>.asgt.type.Model model = 6 [json_name = "model"];</code>
   * @return The model.
   */
  ai.visma.asgt.type.Model getModel();
  /**
   * <code>.asgt.type.Model model = 6 [json_name = "model"];</code>
   */
  ai.visma.asgt.type.ModelOrBuilder getModelOrBuilder();
}
