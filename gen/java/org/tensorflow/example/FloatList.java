// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ssn/mlservice/v2/feature.proto

package org.tensorflow.example;

/**
 * Protobuf type {@code tensorflow.FloatList}
 */
public final class FloatList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.FloatList)
    FloatListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FloatList.newBuilder() to construct.
  private FloatList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FloatList() {
    value_ = emptyFloatList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FloatList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.example.FeatureProtos.internal_static_tensorflow_FloatList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.example.FeatureProtos.internal_static_tensorflow_FloatList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.example.FloatList.class, org.tensorflow.example.FloatList.Builder.class);
  }

  public static final int VALUE_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.FloatList value_;
  /**
   * <code>repeated float value = 1 [json_name = "value", packed = true];</code>
   * @return A list containing the value.
   */
  @java.lang.Override
  public java.util.List<java.lang.Float>
      getValueList() {
    return value_;
  }
  /**
   * <code>repeated float value = 1 [json_name = "value", packed = true];</code>
   * @return The count of value.
   */
  public int getValueCount() {
    return value_.size();
  }
  /**
   * <code>repeated float value = 1 [json_name = "value", packed = true];</code>
   * @param index The index of the element to return.
   * @return The value at the given index.
   */
  public float getValue(int index) {
    return value_.getFloat(index);
  }
  private int valueMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (getValueList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(valueMemoizedSerializedSize);
    }
    for (int i = 0; i < value_.size(); i++) {
      output.writeFloatNoTag(value_.getFloat(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      dataSize = 4 * getValueList().size();
      size += dataSize;
      if (!getValueList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      valueMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof org.tensorflow.example.FloatList)) {
      return super.equals(obj);
    }
    org.tensorflow.example.FloatList other = (org.tensorflow.example.FloatList) obj;

    if (!getValueList()
        .equals(other.getValueList())) return false;
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
    if (getValueCount() > 0) {
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValueList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.example.FloatList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.example.FloatList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.example.FloatList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.example.FloatList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.example.FloatList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.example.FloatList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.example.FloatList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.example.FloatList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.example.FloatList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.example.FloatList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.example.FloatList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.example.FloatList parseFrom(
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
  public static Builder newBuilder(org.tensorflow.example.FloatList prototype) {
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
   * Protobuf type {@code tensorflow.FloatList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.FloatList)
      org.tensorflow.example.FloatListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.example.FeatureProtos.internal_static_tensorflow_FloatList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.example.FeatureProtos.internal_static_tensorflow_FloatList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.example.FloatList.class, org.tensorflow.example.FloatList.Builder.class);
    }

    // Construct using org.tensorflow.example.FloatList.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      value_ = emptyFloatList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.example.FeatureProtos.internal_static_tensorflow_FloatList_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.example.FloatList getDefaultInstanceForType() {
      return org.tensorflow.example.FloatList.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.example.FloatList build() {
      org.tensorflow.example.FloatList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.example.FloatList buildPartial() {
      org.tensorflow.example.FloatList result = new org.tensorflow.example.FloatList(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        value_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.value_ = value_;
      onBuilt();
      return result;
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
      if (other instanceof org.tensorflow.example.FloatList) {
        return mergeFrom((org.tensorflow.example.FloatList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.example.FloatList other) {
      if (other == org.tensorflow.example.FloatList.getDefaultInstance()) return this;
      if (!other.value_.isEmpty()) {
        if (value_.isEmpty()) {
          value_ = other.value_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureValueIsMutable();
          value_.addAll(other.value_);
        }
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
            case 13: {
              float v = input.readFloat();
              ensureValueIsMutable();
              value_.addFloat(v);
              break;
            } // case 13
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureValueIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                value_.addFloat(input.readFloat());
              }
              input.popLimit(limit);
              break;
            } // case 10
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

    private com.google.protobuf.Internal.FloatList value_ = emptyFloatList();
    private void ensureValueIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        value_ = mutableCopy(value_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated float value = 1 [json_name = "value", packed = true];</code>
     * @return A list containing the value.
     */
    public java.util.List<java.lang.Float>
        getValueList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(value_) : value_;
    }
    /**
     * <code>repeated float value = 1 [json_name = "value", packed = true];</code>
     * @return The count of value.
     */
    public int getValueCount() {
      return value_.size();
    }
    /**
     * <code>repeated float value = 1 [json_name = "value", packed = true];</code>
     * @param index The index of the element to return.
     * @return The value at the given index.
     */
    public float getValue(int index) {
      return value_.getFloat(index);
    }
    /**
     * <code>repeated float value = 1 [json_name = "value", packed = true];</code>
     * @param index The index to set the value at.
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(
        int index, float value) {
      ensureValueIsMutable();
      value_.setFloat(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float value = 1 [json_name = "value", packed = true];</code>
     * @param value The value to add.
     * @return This builder for chaining.
     */
    public Builder addValue(float value) {
      ensureValueIsMutable();
      value_.addFloat(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float value = 1 [json_name = "value", packed = true];</code>
     * @param values The value to add.
     * @return This builder for chaining.
     */
    public Builder addAllValue(
        java.lang.Iterable<? extends java.lang.Float> values) {
      ensureValueIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, value_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float value = 1 [json_name = "value", packed = true];</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      value_ = emptyFloatList();
      bitField0_ = (bitField0_ & ~0x00000001);
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


    // @@protoc_insertion_point(builder_scope:tensorflow.FloatList)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.FloatList)
  private static final org.tensorflow.example.FloatList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.example.FloatList();
  }

  public static org.tensorflow.example.FloatList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FloatList>
      PARSER = new com.google.protobuf.AbstractParser<FloatList>() {
    @java.lang.Override
    public FloatList parsePartialFrom(
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

  public static com.google.protobuf.Parser<FloatList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FloatList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.example.FloatList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

