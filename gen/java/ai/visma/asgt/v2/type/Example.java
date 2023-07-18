// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: asgt/v2/type/example.proto

package ai.visma.asgt.v2.type;

/**
 * <pre>
 * A pair of example data and example target values
 * </pre>
 *
 * Protobuf type {@code asgt.v2.type.Example}
 */
public final class Example extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:asgt.v2.type.Example)
    ExampleOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Example.newBuilder() to construct.
  private Example(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Example() {
    targetValues_ = java.util.Collections.emptyList();
    id_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Example();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.visma.asgt.v2.type.ExampleProto.internal_static_asgt_v2_type_Example_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.visma.asgt.v2.type.ExampleProto.internal_static_asgt_v2_type_Example_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.visma.asgt.v2.type.Example.class, ai.visma.asgt.v2.type.Example.Builder.class);
  }

  public static final int DATA_FIELD_NUMBER = 1;
  private ai.visma.asgt.v2.type.Data data_;
  /**
   * <code>.asgt.v2.type.Data data = 1 [json_name = "data"];</code>
   * @return Whether the data field is set.
   */
  @java.lang.Override
  public boolean hasData() {
    return data_ != null;
  }
  /**
   * <code>.asgt.v2.type.Data data = 1 [json_name = "data"];</code>
   * @return The data.
   */
  @java.lang.Override
  public ai.visma.asgt.v2.type.Data getData() {
    return data_ == null ? ai.visma.asgt.v2.type.Data.getDefaultInstance() : data_;
  }
  /**
   * <code>.asgt.v2.type.Data data = 1 [json_name = "data"];</code>
   */
  @java.lang.Override
  public ai.visma.asgt.v2.type.DataOrBuilder getDataOrBuilder() {
    return data_ == null ? ai.visma.asgt.v2.type.Data.getDefaultInstance() : data_;
  }

  public static final int TARGET_VALUES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<ai.visma.asgt.v2.type.TargetValue> targetValues_;
  /**
   * <code>repeated .asgt.v2.type.TargetValue target_values = 2 [json_name = "targetValues", (.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public java.util.List<ai.visma.asgt.v2.type.TargetValue> getTargetValuesList() {
    return targetValues_;
  }
  /**
   * <code>repeated .asgt.v2.type.TargetValue target_values = 2 [json_name = "targetValues", (.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public java.util.List<? extends ai.visma.asgt.v2.type.TargetValueOrBuilder> 
      getTargetValuesOrBuilderList() {
    return targetValues_;
  }
  /**
   * <code>repeated .asgt.v2.type.TargetValue target_values = 2 [json_name = "targetValues", (.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public int getTargetValuesCount() {
    return targetValues_.size();
  }
  /**
   * <code>repeated .asgt.v2.type.TargetValue target_values = 2 [json_name = "targetValues", (.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public ai.visma.asgt.v2.type.TargetValue getTargetValues(int index) {
    return targetValues_.get(index);
  }
  /**
   * <code>repeated .asgt.v2.type.TargetValue target_values = 2 [json_name = "targetValues", (.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public ai.visma.asgt.v2.type.TargetValueOrBuilder getTargetValuesOrBuilder(
      int index) {
    return targetValues_.get(index);
  }

  public static final int ID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object id_ = "";
  /**
   * <pre>
   * Not implemented yet.
   * An optional id to provide individual corrections to examples, for example when a user updates their initial feedback.
   * </pre>
   *
   * <code>string id = 3 [json_name = "id", (.validate.rules) = { ... }</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Not implemented yet.
   * An optional id to provide individual corrections to examples, for example when a user updates their initial feedback.
   * </pre>
   *
   * <code>string id = 3 [json_name = "id", (.validate.rules) = { ... }</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (data_ != null) {
      output.writeMessage(1, getData());
    }
    for (int i = 0; i < targetValues_.size(); i++) {
      output.writeMessage(2, targetValues_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, id_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (data_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getData());
    }
    for (int i = 0; i < targetValues_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, targetValues_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, id_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ai.visma.asgt.v2.type.Example)) {
      return super.equals(obj);
    }
    ai.visma.asgt.v2.type.Example other = (ai.visma.asgt.v2.type.Example) obj;

    if (hasData() != other.hasData()) return false;
    if (hasData()) {
      if (!getData()
          .equals(other.getData())) return false;
    }
    if (!getTargetValuesList()
        .equals(other.getTargetValuesList())) return false;
    if (!getId()
        .equals(other.getId())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasData()) {
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getData().hashCode();
    }
    if (getTargetValuesCount() > 0) {
      hash = (37 * hash) + TARGET_VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getTargetValuesList().hashCode();
    }
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.visma.asgt.v2.type.Example parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.asgt.v2.type.Example parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.asgt.v2.type.Example parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.asgt.v2.type.Example parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.asgt.v2.type.Example parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.asgt.v2.type.Example parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.asgt.v2.type.Example parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.visma.asgt.v2.type.Example parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.visma.asgt.v2.type.Example parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.visma.asgt.v2.type.Example parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.visma.asgt.v2.type.Example parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.visma.asgt.v2.type.Example parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ai.visma.asgt.v2.type.Example prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * A pair of example data and example target values
   * </pre>
   *
   * Protobuf type {@code asgt.v2.type.Example}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:asgt.v2.type.Example)
      ai.visma.asgt.v2.type.ExampleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.visma.asgt.v2.type.ExampleProto.internal_static_asgt_v2_type_Example_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.visma.asgt.v2.type.ExampleProto.internal_static_asgt_v2_type_Example_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.visma.asgt.v2.type.Example.class, ai.visma.asgt.v2.type.Example.Builder.class);
    }

    // Construct using ai.visma.asgt.v2.type.Example.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      data_ = null;
      if (dataBuilder_ != null) {
        dataBuilder_.dispose();
        dataBuilder_ = null;
      }
      if (targetValuesBuilder_ == null) {
        targetValues_ = java.util.Collections.emptyList();
      } else {
        targetValues_ = null;
        targetValuesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      id_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.visma.asgt.v2.type.ExampleProto.internal_static_asgt_v2_type_Example_descriptor;
    }

    @java.lang.Override
    public ai.visma.asgt.v2.type.Example getDefaultInstanceForType() {
      return ai.visma.asgt.v2.type.Example.getDefaultInstance();
    }

    @java.lang.Override
    public ai.visma.asgt.v2.type.Example build() {
      ai.visma.asgt.v2.type.Example result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.visma.asgt.v2.type.Example buildPartial() {
      ai.visma.asgt.v2.type.Example result = new ai.visma.asgt.v2.type.Example(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(ai.visma.asgt.v2.type.Example result) {
      if (targetValuesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          targetValues_ = java.util.Collections.unmodifiableList(targetValues_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.targetValues_ = targetValues_;
      } else {
        result.targetValues_ = targetValuesBuilder_.build();
      }
    }

    private void buildPartial0(ai.visma.asgt.v2.type.Example result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.data_ = dataBuilder_ == null
            ? data_
            : dataBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.id_ = id_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ai.visma.asgt.v2.type.Example) {
        return mergeFrom((ai.visma.asgt.v2.type.Example)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.visma.asgt.v2.type.Example other) {
      if (other == ai.visma.asgt.v2.type.Example.getDefaultInstance()) return this;
      if (other.hasData()) {
        mergeData(other.getData());
      }
      if (targetValuesBuilder_ == null) {
        if (!other.targetValues_.isEmpty()) {
          if (targetValues_.isEmpty()) {
            targetValues_ = other.targetValues_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureTargetValuesIsMutable();
            targetValues_.addAll(other.targetValues_);
          }
          onChanged();
        }
      } else {
        if (!other.targetValues_.isEmpty()) {
          if (targetValuesBuilder_.isEmpty()) {
            targetValuesBuilder_.dispose();
            targetValuesBuilder_ = null;
            targetValues_ = other.targetValues_;
            bitField0_ = (bitField0_ & ~0x00000002);
            targetValuesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTargetValuesFieldBuilder() : null;
          } else {
            targetValuesBuilder_.addAllMessages(other.targetValues_);
          }
        }
      }
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getDataFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              ai.visma.asgt.v2.type.TargetValue m =
                  input.readMessage(
                      ai.visma.asgt.v2.type.TargetValue.parser(),
                      extensionRegistry);
              if (targetValuesBuilder_ == null) {
                ensureTargetValuesIsMutable();
                targetValues_.add(m);
              } else {
                targetValuesBuilder_.addMessage(m);
              }
              break;
            } // case 18
            case 26: {
              id_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private ai.visma.asgt.v2.type.Data data_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.visma.asgt.v2.type.Data, ai.visma.asgt.v2.type.Data.Builder, ai.visma.asgt.v2.type.DataOrBuilder> dataBuilder_;
    /**
     * <code>.asgt.v2.type.Data data = 1 [json_name = "data"];</code>
     * @return Whether the data field is set.
     */
    public boolean hasData() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.asgt.v2.type.Data data = 1 [json_name = "data"];</code>
     * @return The data.
     */
    public ai.visma.asgt.v2.type.Data getData() {
      if (dataBuilder_ == null) {
        return data_ == null ? ai.visma.asgt.v2.type.Data.getDefaultInstance() : data_;
      } else {
        return dataBuilder_.getMessage();
      }
    }
    /**
     * <code>.asgt.v2.type.Data data = 1 [json_name = "data"];</code>
     */
    public Builder setData(ai.visma.asgt.v2.type.Data value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        data_ = value;
      } else {
        dataBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.asgt.v2.type.Data data = 1 [json_name = "data"];</code>
     */
    public Builder setData(
        ai.visma.asgt.v2.type.Data.Builder builderForValue) {
      if (dataBuilder_ == null) {
        data_ = builderForValue.build();
      } else {
        dataBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.asgt.v2.type.Data data = 1 [json_name = "data"];</code>
     */
    public Builder mergeData(ai.visma.asgt.v2.type.Data value) {
      if (dataBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          data_ != null &&
          data_ != ai.visma.asgt.v2.type.Data.getDefaultInstance()) {
          getDataBuilder().mergeFrom(value);
        } else {
          data_ = value;
        }
      } else {
        dataBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.asgt.v2.type.Data data = 1 [json_name = "data"];</code>
     */
    public Builder clearData() {
      bitField0_ = (bitField0_ & ~0x00000001);
      data_ = null;
      if (dataBuilder_ != null) {
        dataBuilder_.dispose();
        dataBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.asgt.v2.type.Data data = 1 [json_name = "data"];</code>
     */
    public ai.visma.asgt.v2.type.Data.Builder getDataBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDataFieldBuilder().getBuilder();
    }
    /**
     * <code>.asgt.v2.type.Data data = 1 [json_name = "data"];</code>
     */
    public ai.visma.asgt.v2.type.DataOrBuilder getDataOrBuilder() {
      if (dataBuilder_ != null) {
        return dataBuilder_.getMessageOrBuilder();
      } else {
        return data_ == null ?
            ai.visma.asgt.v2.type.Data.getDefaultInstance() : data_;
      }
    }
    /**
     * <code>.asgt.v2.type.Data data = 1 [json_name = "data"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.visma.asgt.v2.type.Data, ai.visma.asgt.v2.type.Data.Builder, ai.visma.asgt.v2.type.DataOrBuilder> 
        getDataFieldBuilder() {
      if (dataBuilder_ == null) {
        dataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.visma.asgt.v2.type.Data, ai.visma.asgt.v2.type.Data.Builder, ai.visma.asgt.v2.type.DataOrBuilder>(
                getData(),
                getParentForChildren(),
                isClean());
        data_ = null;
      }
      return dataBuilder_;
    }

    private java.util.List<ai.visma.asgt.v2.type.TargetValue> targetValues_ =
      java.util.Collections.emptyList();
    private void ensureTargetValuesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        targetValues_ = new java.util.ArrayList<ai.visma.asgt.v2.type.TargetValue>(targetValues_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        ai.visma.asgt.v2.type.TargetValue, ai.visma.asgt.v2.type.TargetValue.Builder, ai.visma.asgt.v2.type.TargetValueOrBuilder> targetValuesBuilder_;

    /**
     * <code>repeated .asgt.v2.type.TargetValue target_values = 2 [json_name = "targetValues", (.validate.rules) = { ... }</code>
     */
    public java.util.List<ai.visma.asgt.v2.type.TargetValue> getTargetValuesList() {
      if (targetValuesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(targetValues_);
      } else {
        return targetValuesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .asgt.v2.type.TargetValue target_values = 2 [json_name = "targetValues", (.validate.rules) = { ... }</code>
     */
    public int getTargetValuesCount() {
      if (targetValuesBuilder_ == null) {
        return targetValues_.size();
      } else {
        return targetValuesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .asgt.v2.type.TargetValue target_values = 2 [json_name = "targetValues", (.validate.rules) = { ... }</code>
     */
    public ai.visma.asgt.v2.type.TargetValue getTargetValues(int index) {
      if (targetValuesBuilder_ == null) {
        return targetValues_.get(index);
      } else {
        return targetValuesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .asgt.v2.type.TargetValue target_values = 2 [json_name = "targetValues", (.validate.rules) = { ... }</code>
     */
    public Builder setTargetValues(
        int index, ai.visma.asgt.v2.type.TargetValue value) {
      if (targetValuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTargetValuesIsMutable();
        targetValues_.set(index, value);
        onChanged();
      } else {
        targetValuesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .asgt.v2.type.TargetValue target_values = 2 [json_name = "targetValues", (.validate.rules) = { ... }</code>
     */
    public Builder setTargetValues(
        int index, ai.visma.asgt.v2.type.TargetValue.Builder builderForValue) {
      if (targetValuesBuilder_ == null) {
        ensureTargetValuesIsMutable();
        targetValues_.set(index, builderForValue.build());
        onChanged();
      } else {
        targetValuesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .asgt.v2.type.TargetValue target_values = 2 [json_name = "targetValues", (.validate.rules) = { ... }</code>
     */
    public Builder addTargetValues(ai.visma.asgt.v2.type.TargetValue value) {
      if (targetValuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTargetValuesIsMutable();
        targetValues_.add(value);
        onChanged();
      } else {
        targetValuesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .asgt.v2.type.TargetValue target_values = 2 [json_name = "targetValues", (.validate.rules) = { ... }</code>
     */
    public Builder addTargetValues(
        int index, ai.visma.asgt.v2.type.TargetValue value) {
      if (targetValuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTargetValuesIsMutable();
        targetValues_.add(index, value);
        onChanged();
      } else {
        targetValuesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .asgt.v2.type.TargetValue target_values = 2 [json_name = "targetValues", (.validate.rules) = { ... }</code>
     */
    public Builder addTargetValues(
        ai.visma.asgt.v2.type.TargetValue.Builder builderForValue) {
      if (targetValuesBuilder_ == null) {
        ensureTargetValuesIsMutable();
        targetValues_.add(builderForValue.build());
        onChanged();
      } else {
        targetValuesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .asgt.v2.type.TargetValue target_values = 2 [json_name = "targetValues", (.validate.rules) = { ... }</code>
     */
    public Builder addTargetValues(
        int index, ai.visma.asgt.v2.type.TargetValue.Builder builderForValue) {
      if (targetValuesBuilder_ == null) {
        ensureTargetValuesIsMutable();
        targetValues_.add(index, builderForValue.build());
        onChanged();
      } else {
        targetValuesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .asgt.v2.type.TargetValue target_values = 2 [json_name = "targetValues", (.validate.rules) = { ... }</code>
     */
    public Builder addAllTargetValues(
        java.lang.Iterable<? extends ai.visma.asgt.v2.type.TargetValue> values) {
      if (targetValuesBuilder_ == null) {
        ensureTargetValuesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, targetValues_);
        onChanged();
      } else {
        targetValuesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .asgt.v2.type.TargetValue target_values = 2 [json_name = "targetValues", (.validate.rules) = { ... }</code>
     */
    public Builder clearTargetValues() {
      if (targetValuesBuilder_ == null) {
        targetValues_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        targetValuesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .asgt.v2.type.TargetValue target_values = 2 [json_name = "targetValues", (.validate.rules) = { ... }</code>
     */
    public Builder removeTargetValues(int index) {
      if (targetValuesBuilder_ == null) {
        ensureTargetValuesIsMutable();
        targetValues_.remove(index);
        onChanged();
      } else {
        targetValuesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .asgt.v2.type.TargetValue target_values = 2 [json_name = "targetValues", (.validate.rules) = { ... }</code>
     */
    public ai.visma.asgt.v2.type.TargetValue.Builder getTargetValuesBuilder(
        int index) {
      return getTargetValuesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .asgt.v2.type.TargetValue target_values = 2 [json_name = "targetValues", (.validate.rules) = { ... }</code>
     */
    public ai.visma.asgt.v2.type.TargetValueOrBuilder getTargetValuesOrBuilder(
        int index) {
      if (targetValuesBuilder_ == null) {
        return targetValues_.get(index);  } else {
        return targetValuesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .asgt.v2.type.TargetValue target_values = 2 [json_name = "targetValues", (.validate.rules) = { ... }</code>
     */
    public java.util.List<? extends ai.visma.asgt.v2.type.TargetValueOrBuilder> 
         getTargetValuesOrBuilderList() {
      if (targetValuesBuilder_ != null) {
        return targetValuesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(targetValues_);
      }
    }
    /**
     * <code>repeated .asgt.v2.type.TargetValue target_values = 2 [json_name = "targetValues", (.validate.rules) = { ... }</code>
     */
    public ai.visma.asgt.v2.type.TargetValue.Builder addTargetValuesBuilder() {
      return getTargetValuesFieldBuilder().addBuilder(
          ai.visma.asgt.v2.type.TargetValue.getDefaultInstance());
    }
    /**
     * <code>repeated .asgt.v2.type.TargetValue target_values = 2 [json_name = "targetValues", (.validate.rules) = { ... }</code>
     */
    public ai.visma.asgt.v2.type.TargetValue.Builder addTargetValuesBuilder(
        int index) {
      return getTargetValuesFieldBuilder().addBuilder(
          index, ai.visma.asgt.v2.type.TargetValue.getDefaultInstance());
    }
    /**
     * <code>repeated .asgt.v2.type.TargetValue target_values = 2 [json_name = "targetValues", (.validate.rules) = { ... }</code>
     */
    public java.util.List<ai.visma.asgt.v2.type.TargetValue.Builder> 
         getTargetValuesBuilderList() {
      return getTargetValuesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        ai.visma.asgt.v2.type.TargetValue, ai.visma.asgt.v2.type.TargetValue.Builder, ai.visma.asgt.v2.type.TargetValueOrBuilder> 
        getTargetValuesFieldBuilder() {
      if (targetValuesBuilder_ == null) {
        targetValuesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            ai.visma.asgt.v2.type.TargetValue, ai.visma.asgt.v2.type.TargetValue.Builder, ai.visma.asgt.v2.type.TargetValueOrBuilder>(
                targetValues_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        targetValues_ = null;
      }
      return targetValuesBuilder_;
    }

    private java.lang.Object id_ = "";
    /**
     * <pre>
     * Not implemented yet.
     * An optional id to provide individual corrections to examples, for example when a user updates their initial feedback.
     * </pre>
     *
     * <code>string id = 3 [json_name = "id", (.validate.rules) = { ... }</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Not implemented yet.
     * An optional id to provide individual corrections to examples, for example when a user updates their initial feedback.
     * </pre>
     *
     * <code>string id = 3 [json_name = "id", (.validate.rules) = { ... }</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Not implemented yet.
     * An optional id to provide individual corrections to examples, for example when a user updates their initial feedback.
     * </pre>
     *
     * <code>string id = 3 [json_name = "id", (.validate.rules) = { ... }</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      id_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Not implemented yet.
     * An optional id to provide individual corrections to examples, for example when a user updates their initial feedback.
     * </pre>
     *
     * <code>string id = 3 [json_name = "id", (.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      id_ = getDefaultInstance().getId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Not implemented yet.
     * An optional id to provide individual corrections to examples, for example when a user updates their initial feedback.
     * </pre>
     *
     * <code>string id = 3 [json_name = "id", (.validate.rules) = { ... }</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      id_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:asgt.v2.type.Example)
  }

  // @@protoc_insertion_point(class_scope:asgt.v2.type.Example)
  private static final ai.visma.asgt.v2.type.Example DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.visma.asgt.v2.type.Example();
  }

  public static ai.visma.asgt.v2.type.Example getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Example>
      PARSER = new com.google.protobuf.AbstractParser<Example>() {
    @java.lang.Override
    public Example parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Example> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Example> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.visma.asgt.v2.type.Example getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

