// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: asgt/v2/dataset_service.proto
// Protobuf Java Version: 4.29.3

package ai.visma.asgt.v2;

/**
 * Protobuf type {@code asgt.v2.CreateDatasetRequest}
 */
public final class CreateDatasetRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:asgt.v2.CreateDatasetRequest)
    CreateDatasetRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      CreateDatasetRequest.class.getName());
  }
  // Use CreateDatasetRequest.newBuilder() to construct.
  private CreateDatasetRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private CreateDatasetRequest() {
    datasetName_ = "";
    tags_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.visma.asgt.v2.DatasetServiceProto.internal_static_asgt_v2_CreateDatasetRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.visma.asgt.v2.DatasetServiceProto.internal_static_asgt_v2_CreateDatasetRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.visma.asgt.v2.CreateDatasetRequest.class, ai.visma.asgt.v2.CreateDatasetRequest.Builder.class);
  }

  private int bitField0_;
  public static final int DATASET_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object datasetName_ = "";
  /**
   * <pre>
   * text-no-spaces
   * </pre>
   *
   * <code>string dataset_name = 1 [json_name = "datasetName", (.validate.rules) = { ... }</code>
   * @return The datasetName.
   */
  @java.lang.Override
  public java.lang.String getDatasetName() {
    java.lang.Object ref = datasetName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      datasetName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * text-no-spaces
   * </pre>
   *
   * <code>string dataset_name = 1 [json_name = "datasetName", (.validate.rules) = { ... }</code>
   * @return The bytes for datasetName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDatasetNameBytes() {
    java.lang.Object ref = datasetName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      datasetName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TAGS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList tags_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * text-no-spaces
   * </pre>
   *
   * <code>repeated string tags = 2 [json_name = "tags", (.validate.rules) = { ... }</code>
   * @return A list containing the tags.
   */
  public com.google.protobuf.ProtocolStringList
      getTagsList() {
    return tags_;
  }
  /**
   * <pre>
   * text-no-spaces
   * </pre>
   *
   * <code>repeated string tags = 2 [json_name = "tags", (.validate.rules) = { ... }</code>
   * @return The count of tags.
   */
  public int getTagsCount() {
    return tags_.size();
  }
  /**
   * <pre>
   * text-no-spaces
   * </pre>
   *
   * <code>repeated string tags = 2 [json_name = "tags", (.validate.rules) = { ... }</code>
   * @param index The index of the element to return.
   * @return The tags at the given index.
   */
  public java.lang.String getTags(int index) {
    return tags_.get(index);
  }
  /**
   * <pre>
   * text-no-spaces
   * </pre>
   *
   * <code>repeated string tags = 2 [json_name = "tags", (.validate.rules) = { ... }</code>
   * @param index The index of the value to return.
   * @return The bytes of the tags at the given index.
   */
  public com.google.protobuf.ByteString
      getTagsBytes(int index) {
    return tags_.getByteString(index);
  }

  public static final int RETENTION_POLICY_FIELD_NUMBER = 3;
  private ai.visma.asgt.type.RetentionPolicy retentionPolicy_;
  /**
   * <code>.asgt.type.RetentionPolicy retention_policy = 3 [json_name = "retentionPolicy"];</code>
   * @return Whether the retentionPolicy field is set.
   */
  @java.lang.Override
  public boolean hasRetentionPolicy() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.asgt.type.RetentionPolicy retention_policy = 3 [json_name = "retentionPolicy"];</code>
   * @return The retentionPolicy.
   */
  @java.lang.Override
  public ai.visma.asgt.type.RetentionPolicy getRetentionPolicy() {
    return retentionPolicy_ == null ? ai.visma.asgt.type.RetentionPolicy.getDefaultInstance() : retentionPolicy_;
  }
  /**
   * <code>.asgt.type.RetentionPolicy retention_policy = 3 [json_name = "retentionPolicy"];</code>
   */
  @java.lang.Override
  public ai.visma.asgt.type.RetentionPolicyOrBuilder getRetentionPolicyOrBuilder() {
    return retentionPolicy_ == null ? ai.visma.asgt.type.RetentionPolicy.getDefaultInstance() : retentionPolicy_;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(datasetName_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, datasetName_);
    }
    for (int i = 0; i < tags_.size(); i++) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, tags_.getRaw(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getRetentionPolicy());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(datasetName_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, datasetName_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < tags_.size(); i++) {
        dataSize += computeStringSizeNoTag(tags_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getTagsList().size();
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getRetentionPolicy());
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
    if (!(obj instanceof ai.visma.asgt.v2.CreateDatasetRequest)) {
      return super.equals(obj);
    }
    ai.visma.asgt.v2.CreateDatasetRequest other = (ai.visma.asgt.v2.CreateDatasetRequest) obj;

    if (!getDatasetName()
        .equals(other.getDatasetName())) return false;
    if (!getTagsList()
        .equals(other.getTagsList())) return false;
    if (hasRetentionPolicy() != other.hasRetentionPolicy()) return false;
    if (hasRetentionPolicy()) {
      if (!getRetentionPolicy()
          .equals(other.getRetentionPolicy())) return false;
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
    hash = (37 * hash) + DATASET_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getDatasetName().hashCode();
    if (getTagsCount() > 0) {
      hash = (37 * hash) + TAGS_FIELD_NUMBER;
      hash = (53 * hash) + getTagsList().hashCode();
    }
    if (hasRetentionPolicy()) {
      hash = (37 * hash) + RETENTION_POLICY_FIELD_NUMBER;
      hash = (53 * hash) + getRetentionPolicy().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.visma.asgt.v2.CreateDatasetRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.asgt.v2.CreateDatasetRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.asgt.v2.CreateDatasetRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.asgt.v2.CreateDatasetRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.asgt.v2.CreateDatasetRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.asgt.v2.CreateDatasetRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.asgt.v2.CreateDatasetRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.visma.asgt.v2.CreateDatasetRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.visma.asgt.v2.CreateDatasetRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.visma.asgt.v2.CreateDatasetRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.visma.asgt.v2.CreateDatasetRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.visma.asgt.v2.CreateDatasetRequest parseFrom(
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
  public static Builder newBuilder(ai.visma.asgt.v2.CreateDatasetRequest prototype) {
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
   * Protobuf type {@code asgt.v2.CreateDatasetRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:asgt.v2.CreateDatasetRequest)
      ai.visma.asgt.v2.CreateDatasetRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.visma.asgt.v2.DatasetServiceProto.internal_static_asgt_v2_CreateDatasetRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.visma.asgt.v2.DatasetServiceProto.internal_static_asgt_v2_CreateDatasetRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.visma.asgt.v2.CreateDatasetRequest.class, ai.visma.asgt.v2.CreateDatasetRequest.Builder.class);
    }

    // Construct using ai.visma.asgt.v2.CreateDatasetRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
              .alwaysUseFieldBuilders) {
        getRetentionPolicyFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      datasetName_ = "";
      tags_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      retentionPolicy_ = null;
      if (retentionPolicyBuilder_ != null) {
        retentionPolicyBuilder_.dispose();
        retentionPolicyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.visma.asgt.v2.DatasetServiceProto.internal_static_asgt_v2_CreateDatasetRequest_descriptor;
    }

    @java.lang.Override
    public ai.visma.asgt.v2.CreateDatasetRequest getDefaultInstanceForType() {
      return ai.visma.asgt.v2.CreateDatasetRequest.getDefaultInstance();
    }

    @java.lang.Override
    public ai.visma.asgt.v2.CreateDatasetRequest build() {
      ai.visma.asgt.v2.CreateDatasetRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.visma.asgt.v2.CreateDatasetRequest buildPartial() {
      ai.visma.asgt.v2.CreateDatasetRequest result = new ai.visma.asgt.v2.CreateDatasetRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.visma.asgt.v2.CreateDatasetRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.datasetName_ = datasetName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        tags_.makeImmutable();
        result.tags_ = tags_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.retentionPolicy_ = retentionPolicyBuilder_ == null
            ? retentionPolicy_
            : retentionPolicyBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ai.visma.asgt.v2.CreateDatasetRequest) {
        return mergeFrom((ai.visma.asgt.v2.CreateDatasetRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.visma.asgt.v2.CreateDatasetRequest other) {
      if (other == ai.visma.asgt.v2.CreateDatasetRequest.getDefaultInstance()) return this;
      if (!other.getDatasetName().isEmpty()) {
        datasetName_ = other.datasetName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.tags_.isEmpty()) {
        if (tags_.isEmpty()) {
          tags_ = other.tags_;
          bitField0_ |= 0x00000002;
        } else {
          ensureTagsIsMutable();
          tags_.addAll(other.tags_);
        }
        onChanged();
      }
      if (other.hasRetentionPolicy()) {
        mergeRetentionPolicy(other.getRetentionPolicy());
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
              datasetName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureTagsIsMutable();
              tags_.add(s);
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getRetentionPolicyFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private java.lang.Object datasetName_ = "";
    /**
     * <pre>
     * text-no-spaces
     * </pre>
     *
     * <code>string dataset_name = 1 [json_name = "datasetName", (.validate.rules) = { ... }</code>
     * @return The datasetName.
     */
    public java.lang.String getDatasetName() {
      java.lang.Object ref = datasetName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        datasetName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * text-no-spaces
     * </pre>
     *
     * <code>string dataset_name = 1 [json_name = "datasetName", (.validate.rules) = { ... }</code>
     * @return The bytes for datasetName.
     */
    public com.google.protobuf.ByteString
        getDatasetNameBytes() {
      java.lang.Object ref = datasetName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        datasetName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * text-no-spaces
     * </pre>
     *
     * <code>string dataset_name = 1 [json_name = "datasetName", (.validate.rules) = { ... }</code>
     * @param value The datasetName to set.
     * @return This builder for chaining.
     */
    public Builder setDatasetName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      datasetName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * text-no-spaces
     * </pre>
     *
     * <code>string dataset_name = 1 [json_name = "datasetName", (.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearDatasetName() {
      datasetName_ = getDefaultInstance().getDatasetName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * text-no-spaces
     * </pre>
     *
     * <code>string dataset_name = 1 [json_name = "datasetName", (.validate.rules) = { ... }</code>
     * @param value The bytes for datasetName to set.
     * @return This builder for chaining.
     */
    public Builder setDatasetNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      datasetName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList tags_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureTagsIsMutable() {
      if (!tags_.isModifiable()) {
        tags_ = new com.google.protobuf.LazyStringArrayList(tags_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <pre>
     * text-no-spaces
     * </pre>
     *
     * <code>repeated string tags = 2 [json_name = "tags", (.validate.rules) = { ... }</code>
     * @return A list containing the tags.
     */
    public com.google.protobuf.ProtocolStringList
        getTagsList() {
      tags_.makeImmutable();
      return tags_;
    }
    /**
     * <pre>
     * text-no-spaces
     * </pre>
     *
     * <code>repeated string tags = 2 [json_name = "tags", (.validate.rules) = { ... }</code>
     * @return The count of tags.
     */
    public int getTagsCount() {
      return tags_.size();
    }
    /**
     * <pre>
     * text-no-spaces
     * </pre>
     *
     * <code>repeated string tags = 2 [json_name = "tags", (.validate.rules) = { ... }</code>
     * @param index The index of the element to return.
     * @return The tags at the given index.
     */
    public java.lang.String getTags(int index) {
      return tags_.get(index);
    }
    /**
     * <pre>
     * text-no-spaces
     * </pre>
     *
     * <code>repeated string tags = 2 [json_name = "tags", (.validate.rules) = { ... }</code>
     * @param index The index of the value to return.
     * @return The bytes of the tags at the given index.
     */
    public com.google.protobuf.ByteString
        getTagsBytes(int index) {
      return tags_.getByteString(index);
    }
    /**
     * <pre>
     * text-no-spaces
     * </pre>
     *
     * <code>repeated string tags = 2 [json_name = "tags", (.validate.rules) = { ... }</code>
     * @param index The index to set the value at.
     * @param value The tags to set.
     * @return This builder for chaining.
     */
    public Builder setTags(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureTagsIsMutable();
      tags_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * text-no-spaces
     * </pre>
     *
     * <code>repeated string tags = 2 [json_name = "tags", (.validate.rules) = { ... }</code>
     * @param value The tags to add.
     * @return This builder for chaining.
     */
    public Builder addTags(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureTagsIsMutable();
      tags_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * text-no-spaces
     * </pre>
     *
     * <code>repeated string tags = 2 [json_name = "tags", (.validate.rules) = { ... }</code>
     * @param values The tags to add.
     * @return This builder for chaining.
     */
    public Builder addAllTags(
        java.lang.Iterable<java.lang.String> values) {
      ensureTagsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, tags_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * text-no-spaces
     * </pre>
     *
     * <code>repeated string tags = 2 [json_name = "tags", (.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearTags() {
      tags_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * text-no-spaces
     * </pre>
     *
     * <code>repeated string tags = 2 [json_name = "tags", (.validate.rules) = { ... }</code>
     * @param value The bytes of the tags to add.
     * @return This builder for chaining.
     */
    public Builder addTagsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureTagsIsMutable();
      tags_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private ai.visma.asgt.type.RetentionPolicy retentionPolicy_;
    private com.google.protobuf.SingleFieldBuilder<
        ai.visma.asgt.type.RetentionPolicy, ai.visma.asgt.type.RetentionPolicy.Builder, ai.visma.asgt.type.RetentionPolicyOrBuilder> retentionPolicyBuilder_;
    /**
     * <code>.asgt.type.RetentionPolicy retention_policy = 3 [json_name = "retentionPolicy"];</code>
     * @return Whether the retentionPolicy field is set.
     */
    public boolean hasRetentionPolicy() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.asgt.type.RetentionPolicy retention_policy = 3 [json_name = "retentionPolicy"];</code>
     * @return The retentionPolicy.
     */
    public ai.visma.asgt.type.RetentionPolicy getRetentionPolicy() {
      if (retentionPolicyBuilder_ == null) {
        return retentionPolicy_ == null ? ai.visma.asgt.type.RetentionPolicy.getDefaultInstance() : retentionPolicy_;
      } else {
        return retentionPolicyBuilder_.getMessage();
      }
    }
    /**
     * <code>.asgt.type.RetentionPolicy retention_policy = 3 [json_name = "retentionPolicy"];</code>
     */
    public Builder setRetentionPolicy(ai.visma.asgt.type.RetentionPolicy value) {
      if (retentionPolicyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        retentionPolicy_ = value;
      } else {
        retentionPolicyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.asgt.type.RetentionPolicy retention_policy = 3 [json_name = "retentionPolicy"];</code>
     */
    public Builder setRetentionPolicy(
        ai.visma.asgt.type.RetentionPolicy.Builder builderForValue) {
      if (retentionPolicyBuilder_ == null) {
        retentionPolicy_ = builderForValue.build();
      } else {
        retentionPolicyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.asgt.type.RetentionPolicy retention_policy = 3 [json_name = "retentionPolicy"];</code>
     */
    public Builder mergeRetentionPolicy(ai.visma.asgt.type.RetentionPolicy value) {
      if (retentionPolicyBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          retentionPolicy_ != null &&
          retentionPolicy_ != ai.visma.asgt.type.RetentionPolicy.getDefaultInstance()) {
          getRetentionPolicyBuilder().mergeFrom(value);
        } else {
          retentionPolicy_ = value;
        }
      } else {
        retentionPolicyBuilder_.mergeFrom(value);
      }
      if (retentionPolicy_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.asgt.type.RetentionPolicy retention_policy = 3 [json_name = "retentionPolicy"];</code>
     */
    public Builder clearRetentionPolicy() {
      bitField0_ = (bitField0_ & ~0x00000004);
      retentionPolicy_ = null;
      if (retentionPolicyBuilder_ != null) {
        retentionPolicyBuilder_.dispose();
        retentionPolicyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.asgt.type.RetentionPolicy retention_policy = 3 [json_name = "retentionPolicy"];</code>
     */
    public ai.visma.asgt.type.RetentionPolicy.Builder getRetentionPolicyBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getRetentionPolicyFieldBuilder().getBuilder();
    }
    /**
     * <code>.asgt.type.RetentionPolicy retention_policy = 3 [json_name = "retentionPolicy"];</code>
     */
    public ai.visma.asgt.type.RetentionPolicyOrBuilder getRetentionPolicyOrBuilder() {
      if (retentionPolicyBuilder_ != null) {
        return retentionPolicyBuilder_.getMessageOrBuilder();
      } else {
        return retentionPolicy_ == null ?
            ai.visma.asgt.type.RetentionPolicy.getDefaultInstance() : retentionPolicy_;
      }
    }
    /**
     * <code>.asgt.type.RetentionPolicy retention_policy = 3 [json_name = "retentionPolicy"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        ai.visma.asgt.type.RetentionPolicy, ai.visma.asgt.type.RetentionPolicy.Builder, ai.visma.asgt.type.RetentionPolicyOrBuilder> 
        getRetentionPolicyFieldBuilder() {
      if (retentionPolicyBuilder_ == null) {
        retentionPolicyBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            ai.visma.asgt.type.RetentionPolicy, ai.visma.asgt.type.RetentionPolicy.Builder, ai.visma.asgt.type.RetentionPolicyOrBuilder>(
                getRetentionPolicy(),
                getParentForChildren(),
                isClean());
        retentionPolicy_ = null;
      }
      return retentionPolicyBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:asgt.v2.CreateDatasetRequest)
  }

  // @@protoc_insertion_point(class_scope:asgt.v2.CreateDatasetRequest)
  private static final ai.visma.asgt.v2.CreateDatasetRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.visma.asgt.v2.CreateDatasetRequest();
  }

  public static ai.visma.asgt.v2.CreateDatasetRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateDatasetRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateDatasetRequest>() {
    @java.lang.Override
    public CreateDatasetRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateDatasetRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateDatasetRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.visma.asgt.v2.CreateDatasetRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

