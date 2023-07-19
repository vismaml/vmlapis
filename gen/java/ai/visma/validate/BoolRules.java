// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: validate/validate.proto

package ai.visma.validate;

/**
 * <pre>
 * BoolRules describes the constraints applied to `bool` values
 * </pre>
 *
 * Protobuf type {@code validate.BoolRules}
 */
public final class BoolRules extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:validate.BoolRules)
    BoolRulesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BoolRules.newBuilder() to construct.
  private BoolRules(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BoolRules() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BoolRules();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.visma.validate.ValidateProto.internal_static_validate_BoolRules_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.visma.validate.ValidateProto.internal_static_validate_BoolRules_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.visma.validate.BoolRules.class, ai.visma.validate.BoolRules.Builder.class);
  }

  private int bitField0_;
  public static final int CONST_FIELD_NUMBER = 1;
  private boolean const_ = false;
  /**
   * <pre>
   * Const specifies that this field must be exactly the specified value
   * </pre>
   *
   * <code>optional bool const = 1 [json_name = "const"];</code>
   * @return Whether the const field is set.
   */
  @java.lang.Override
  public boolean hasConst() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Const specifies that this field must be exactly the specified value
   * </pre>
   *
   * <code>optional bool const = 1 [json_name = "const"];</code>
   * @return The const.
   */
  @java.lang.Override
  public boolean getConst() {
    return const_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeBool(1, const_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, const_);
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
    if (!(obj instanceof ai.visma.validate.BoolRules)) {
      return super.equals(obj);
    }
    ai.visma.validate.BoolRules other = (ai.visma.validate.BoolRules) obj;

    if (hasConst() != other.hasConst()) return false;
    if (hasConst()) {
      if (getConst()
          != other.getConst()) return false;
    }
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
    if (hasConst()) {
      hash = (37 * hash) + CONST_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getConst());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.visma.validate.BoolRules parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.validate.BoolRules parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.validate.BoolRules parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.validate.BoolRules parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.validate.BoolRules parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.validate.BoolRules parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.validate.BoolRules parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.visma.validate.BoolRules parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.visma.validate.BoolRules parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.visma.validate.BoolRules parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.visma.validate.BoolRules parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.visma.validate.BoolRules parseFrom(
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
  public static Builder newBuilder(ai.visma.validate.BoolRules prototype) {
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
   * BoolRules describes the constraints applied to `bool` values
   * </pre>
   *
   * Protobuf type {@code validate.BoolRules}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:validate.BoolRules)
      ai.visma.validate.BoolRulesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.visma.validate.ValidateProto.internal_static_validate_BoolRules_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.visma.validate.ValidateProto.internal_static_validate_BoolRules_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.visma.validate.BoolRules.class, ai.visma.validate.BoolRules.Builder.class);
    }

    // Construct using ai.visma.validate.BoolRules.newBuilder()
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
      const_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.visma.validate.ValidateProto.internal_static_validate_BoolRules_descriptor;
    }

    @java.lang.Override
    public ai.visma.validate.BoolRules getDefaultInstanceForType() {
      return ai.visma.validate.BoolRules.getDefaultInstance();
    }

    @java.lang.Override
    public ai.visma.validate.BoolRules build() {
      ai.visma.validate.BoolRules result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.visma.validate.BoolRules buildPartial() {
      ai.visma.validate.BoolRules result = new ai.visma.validate.BoolRules(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.visma.validate.BoolRules result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.const_ = const_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof ai.visma.validate.BoolRules) {
        return mergeFrom((ai.visma.validate.BoolRules)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.visma.validate.BoolRules other) {
      if (other == ai.visma.validate.BoolRules.getDefaultInstance()) return this;
      if (other.hasConst()) {
        setConst(other.getConst());
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
            case 8: {
              const_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
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

    private boolean const_ ;
    /**
     * <pre>
     * Const specifies that this field must be exactly the specified value
     * </pre>
     *
     * <code>optional bool const = 1 [json_name = "const"];</code>
     * @return Whether the const field is set.
     */
    @java.lang.Override
    public boolean hasConst() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Const specifies that this field must be exactly the specified value
     * </pre>
     *
     * <code>optional bool const = 1 [json_name = "const"];</code>
     * @return The const.
     */
    @java.lang.Override
    public boolean getConst() {
      return const_;
    }
    /**
     * <pre>
     * Const specifies that this field must be exactly the specified value
     * </pre>
     *
     * <code>optional bool const = 1 [json_name = "const"];</code>
     * @param value The const to set.
     * @return This builder for chaining.
     */
    public Builder setConst(boolean value) {

      const_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Const specifies that this field must be exactly the specified value
     * </pre>
     *
     * <code>optional bool const = 1 [json_name = "const"];</code>
     * @return This builder for chaining.
     */
    public Builder clearConst() {
      bitField0_ = (bitField0_ & ~0x00000001);
      const_ = false;
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


    // @@protoc_insertion_point(builder_scope:validate.BoolRules)
  }

  // @@protoc_insertion_point(class_scope:validate.BoolRules)
  private static final ai.visma.validate.BoolRules DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.visma.validate.BoolRules();
  }

  public static ai.visma.validate.BoolRules getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<BoolRules>
      PARSER = new com.google.protobuf.AbstractParser<BoolRules>() {
    @java.lang.Override
    public BoolRules parsePartialFrom(
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

  public static com.google.protobuf.Parser<BoolRules> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BoolRules> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.visma.validate.BoolRules getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

