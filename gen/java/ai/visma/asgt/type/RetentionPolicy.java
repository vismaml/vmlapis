// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: asgt/type/retention_policy.proto
// Protobuf Java Version: 4.29.3

package ai.visma.asgt.type;

/**
 * Protobuf type {@code asgt.type.RetentionPolicy}
 */
public final class RetentionPolicy extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:asgt.type.RetentionPolicy)
    RetentionPolicyOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      RetentionPolicy.class.getName());
  }
  // Use RetentionPolicy.newBuilder() to construct.
  private RetentionPolicy(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private RetentionPolicy() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.visma.asgt.type.RetentionPolicyProto.internal_static_asgt_type_RetentionPolicy_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.visma.asgt.type.RetentionPolicyProto.internal_static_asgt_type_RetentionPolicy_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.visma.asgt.type.RetentionPolicy.class, ai.visma.asgt.type.RetentionPolicy.Builder.class);
  }

  public static final int MAX_DAYS_FIELD_NUMBER = 1;
  private long maxDays_ = 0L;
  /**
   * <code>int64 max_days = 1 [json_name = "maxDays"];</code>
   * @return The maxDays.
   */
  @java.lang.Override
  public long getMaxDays() {
    return maxDays_;
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
    if (maxDays_ != 0L) {
      output.writeInt64(1, maxDays_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (maxDays_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, maxDays_);
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
    if (!(obj instanceof ai.visma.asgt.type.RetentionPolicy)) {
      return super.equals(obj);
    }
    ai.visma.asgt.type.RetentionPolicy other = (ai.visma.asgt.type.RetentionPolicy) obj;

    if (getMaxDays()
        != other.getMaxDays()) return false;
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
    hash = (37 * hash) + MAX_DAYS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMaxDays());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.visma.asgt.type.RetentionPolicy parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.asgt.type.RetentionPolicy parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.asgt.type.RetentionPolicy parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.asgt.type.RetentionPolicy parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.asgt.type.RetentionPolicy parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.asgt.type.RetentionPolicy parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.asgt.type.RetentionPolicy parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.visma.asgt.type.RetentionPolicy parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.visma.asgt.type.RetentionPolicy parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.visma.asgt.type.RetentionPolicy parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.visma.asgt.type.RetentionPolicy parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.visma.asgt.type.RetentionPolicy parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ai.visma.asgt.type.RetentionPolicy prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code asgt.type.RetentionPolicy}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:asgt.type.RetentionPolicy)
      ai.visma.asgt.type.RetentionPolicyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.visma.asgt.type.RetentionPolicyProto.internal_static_asgt_type_RetentionPolicy_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.visma.asgt.type.RetentionPolicyProto.internal_static_asgt_type_RetentionPolicy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.visma.asgt.type.RetentionPolicy.class, ai.visma.asgt.type.RetentionPolicy.Builder.class);
    }

    // Construct using ai.visma.asgt.type.RetentionPolicy.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      maxDays_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.visma.asgt.type.RetentionPolicyProto.internal_static_asgt_type_RetentionPolicy_descriptor;
    }

    @java.lang.Override
    public ai.visma.asgt.type.RetentionPolicy getDefaultInstanceForType() {
      return ai.visma.asgt.type.RetentionPolicy.getDefaultInstance();
    }

    @java.lang.Override
    public ai.visma.asgt.type.RetentionPolicy build() {
      ai.visma.asgt.type.RetentionPolicy result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.visma.asgt.type.RetentionPolicy buildPartial() {
      ai.visma.asgt.type.RetentionPolicy result = new ai.visma.asgt.type.RetentionPolicy(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.visma.asgt.type.RetentionPolicy result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.maxDays_ = maxDays_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ai.visma.asgt.type.RetentionPolicy) {
        return mergeFrom((ai.visma.asgt.type.RetentionPolicy)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.visma.asgt.type.RetentionPolicy other) {
      if (other == ai.visma.asgt.type.RetentionPolicy.getDefaultInstance()) return this;
      if (other.getMaxDays() != 0L) {
        setMaxDays(other.getMaxDays());
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
              maxDays_ = input.readInt64();
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

    private long maxDays_ ;
    /**
     * <code>int64 max_days = 1 [json_name = "maxDays"];</code>
     * @return The maxDays.
     */
    @java.lang.Override
    public long getMaxDays() {
      return maxDays_;
    }
    /**
     * <code>int64 max_days = 1 [json_name = "maxDays"];</code>
     * @param value The maxDays to set.
     * @return This builder for chaining.
     */
    public Builder setMaxDays(long value) {

      maxDays_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int64 max_days = 1 [json_name = "maxDays"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxDays() {
      bitField0_ = (bitField0_ & ~0x00000001);
      maxDays_ = 0L;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:asgt.type.RetentionPolicy)
  }

  // @@protoc_insertion_point(class_scope:asgt.type.RetentionPolicy)
  private static final ai.visma.asgt.type.RetentionPolicy DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.visma.asgt.type.RetentionPolicy();
  }

  public static ai.visma.asgt.type.RetentionPolicy getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RetentionPolicy>
      PARSER = new com.google.protobuf.AbstractParser<RetentionPolicy>() {
    @java.lang.Override
    public RetentionPolicy parsePartialFrom(
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

  public static com.google.protobuf.Parser<RetentionPolicy> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RetentionPolicy> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.visma.asgt.type.RetentionPolicy getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

