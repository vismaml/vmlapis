// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: asgt/data/v1/data_service.proto
// Protobuf Java Version: 4.29.3

package ai.visma.asgt.dataservice.v1;

/**
 * Protobuf type {@code asgt.dataservice.v1.RegisterQueryStatsRequest}
 */
public final class RegisterQueryStatsRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:asgt.dataservice.v1.RegisterQueryStatsRequest)
    RegisterQueryStatsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      RegisterQueryStatsRequest.class.getName());
  }
  // Use RegisterQueryStatsRequest.newBuilder() to construct.
  private RegisterQueryStatsRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private RegisterQueryStatsRequest() {
    dataset_ = "";
    modelType_ = "";
    tags_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.visma.asgt.dataservice.v1.DataServiceProto.internal_static_asgt_dataservice_v1_RegisterQueryStatsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.visma.asgt.dataservice.v1.DataServiceProto.internal_static_asgt_dataservice_v1_RegisterQueryStatsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest.class, ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest.Builder.class);
  }

  public static final int DATASET_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object dataset_ = "";
  /**
   * <code>string dataset = 1 [json_name = "dataset"];</code>
   * @return The dataset.
   */
  @java.lang.Override
  public java.lang.String getDataset() {
    java.lang.Object ref = dataset_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dataset_ = s;
      return s;
    }
  }
  /**
   * <code>string dataset = 1 [json_name = "dataset"];</code>
   * @return The bytes for dataset.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDatasetBytes() {
    java.lang.Object ref = dataset_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dataset_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MODEL_TYPE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object modelType_ = "";
  /**
   * <code>string model_type = 2 [json_name = "modelType"];</code>
   * @return The modelType.
   */
  @java.lang.Override
  public java.lang.String getModelType() {
    java.lang.Object ref = modelType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      modelType_ = s;
      return s;
    }
  }
  /**
   * <code>string model_type = 2 [json_name = "modelType"];</code>
   * @return The bytes for modelType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getModelTypeBytes() {
    java.lang.Object ref = modelType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      modelType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BATCH_SIZE_FIELD_NUMBER = 3;
  private int batchSize_ = 0;
  /**
   * <code>int32 batch_size = 3 [json_name = "batchSize"];</code>
   * @return The batchSize.
   */
  @java.lang.Override
  public int getBatchSize() {
    return batchSize_;
  }

  public static final int TAGS_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList tags_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string tags = 4 [json_name = "tags"];</code>
   * @return A list containing the tags.
   */
  public com.google.protobuf.ProtocolStringList
      getTagsList() {
    return tags_;
  }
  /**
   * <code>repeated string tags = 4 [json_name = "tags"];</code>
   * @return The count of tags.
   */
  public int getTagsCount() {
    return tags_.size();
  }
  /**
   * <code>repeated string tags = 4 [json_name = "tags"];</code>
   * @param index The index of the element to return.
   * @return The tags at the given index.
   */
  public java.lang.String getTags(int index) {
    return tags_.get(index);
  }
  /**
   * <code>repeated string tags = 4 [json_name = "tags"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the tags at the given index.
   */
  public com.google.protobuf.ByteString
      getTagsBytes(int index) {
    return tags_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(dataset_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, dataset_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(modelType_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, modelType_);
    }
    if (batchSize_ != 0) {
      output.writeInt32(3, batchSize_);
    }
    for (int i = 0; i < tags_.size(); i++) {
      com.google.protobuf.GeneratedMessage.writeString(output, 4, tags_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(dataset_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, dataset_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(modelType_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, modelType_);
    }
    if (batchSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, batchSize_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < tags_.size(); i++) {
        dataSize += computeStringSizeNoTag(tags_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getTagsList().size();
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
    if (!(obj instanceof ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest)) {
      return super.equals(obj);
    }
    ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest other = (ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest) obj;

    if (!getDataset()
        .equals(other.getDataset())) return false;
    if (!getModelType()
        .equals(other.getModelType())) return false;
    if (getBatchSize()
        != other.getBatchSize()) return false;
    if (!getTagsList()
        .equals(other.getTagsList())) return false;
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
    hash = (37 * hash) + DATASET_FIELD_NUMBER;
    hash = (53 * hash) + getDataset().hashCode();
    hash = (37 * hash) + MODEL_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getModelType().hashCode();
    hash = (37 * hash) + BATCH_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getBatchSize();
    if (getTagsCount() > 0) {
      hash = (37 * hash) + TAGS_FIELD_NUMBER;
      hash = (53 * hash) + getTagsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest parseFrom(
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
  public static Builder newBuilder(ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest prototype) {
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
   * Protobuf type {@code asgt.dataservice.v1.RegisterQueryStatsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:asgt.dataservice.v1.RegisterQueryStatsRequest)
      ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.visma.asgt.dataservice.v1.DataServiceProto.internal_static_asgt_dataservice_v1_RegisterQueryStatsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.visma.asgt.dataservice.v1.DataServiceProto.internal_static_asgt_dataservice_v1_RegisterQueryStatsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest.class, ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest.Builder.class);
    }

    // Construct using ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest.newBuilder()
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
      dataset_ = "";
      modelType_ = "";
      batchSize_ = 0;
      tags_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.visma.asgt.dataservice.v1.DataServiceProto.internal_static_asgt_dataservice_v1_RegisterQueryStatsRequest_descriptor;
    }

    @java.lang.Override
    public ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest getDefaultInstanceForType() {
      return ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest build() {
      ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest buildPartial() {
      ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest result = new ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.dataset_ = dataset_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.modelType_ = modelType_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.batchSize_ = batchSize_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        tags_.makeImmutable();
        result.tags_ = tags_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest) {
        return mergeFrom((ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest other) {
      if (other == ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest.getDefaultInstance()) return this;
      if (!other.getDataset().isEmpty()) {
        dataset_ = other.dataset_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getModelType().isEmpty()) {
        modelType_ = other.modelType_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getBatchSize() != 0) {
        setBatchSize(other.getBatchSize());
      }
      if (!other.tags_.isEmpty()) {
        if (tags_.isEmpty()) {
          tags_ = other.tags_;
          bitField0_ |= 0x00000008;
        } else {
          ensureTagsIsMutable();
          tags_.addAll(other.tags_);
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
            case 10: {
              dataset_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              modelType_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              batchSize_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureTagsIsMutable();
              tags_.add(s);
              break;
            } // case 34
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

    private java.lang.Object dataset_ = "";
    /**
     * <code>string dataset = 1 [json_name = "dataset"];</code>
     * @return The dataset.
     */
    public java.lang.String getDataset() {
      java.lang.Object ref = dataset_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dataset_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dataset = 1 [json_name = "dataset"];</code>
     * @return The bytes for dataset.
     */
    public com.google.protobuf.ByteString
        getDatasetBytes() {
      java.lang.Object ref = dataset_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dataset_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dataset = 1 [json_name = "dataset"];</code>
     * @param value The dataset to set.
     * @return This builder for chaining.
     */
    public Builder setDataset(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      dataset_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string dataset = 1 [json_name = "dataset"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDataset() {
      dataset_ = getDefaultInstance().getDataset();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string dataset = 1 [json_name = "dataset"];</code>
     * @param value The bytes for dataset to set.
     * @return This builder for chaining.
     */
    public Builder setDatasetBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      dataset_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object modelType_ = "";
    /**
     * <code>string model_type = 2 [json_name = "modelType"];</code>
     * @return The modelType.
     */
    public java.lang.String getModelType() {
      java.lang.Object ref = modelType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        modelType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string model_type = 2 [json_name = "modelType"];</code>
     * @return The bytes for modelType.
     */
    public com.google.protobuf.ByteString
        getModelTypeBytes() {
      java.lang.Object ref = modelType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        modelType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string model_type = 2 [json_name = "modelType"];</code>
     * @param value The modelType to set.
     * @return This builder for chaining.
     */
    public Builder setModelType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      modelType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string model_type = 2 [json_name = "modelType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearModelType() {
      modelType_ = getDefaultInstance().getModelType();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string model_type = 2 [json_name = "modelType"];</code>
     * @param value The bytes for modelType to set.
     * @return This builder for chaining.
     */
    public Builder setModelTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      modelType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int batchSize_ ;
    /**
     * <code>int32 batch_size = 3 [json_name = "batchSize"];</code>
     * @return The batchSize.
     */
    @java.lang.Override
    public int getBatchSize() {
      return batchSize_;
    }
    /**
     * <code>int32 batch_size = 3 [json_name = "batchSize"];</code>
     * @param value The batchSize to set.
     * @return This builder for chaining.
     */
    public Builder setBatchSize(int value) {

      batchSize_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>int32 batch_size = 3 [json_name = "batchSize"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBatchSize() {
      bitField0_ = (bitField0_ & ~0x00000004);
      batchSize_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList tags_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureTagsIsMutable() {
      if (!tags_.isModifiable()) {
        tags_ = new com.google.protobuf.LazyStringArrayList(tags_);
      }
      bitField0_ |= 0x00000008;
    }
    /**
     * <code>repeated string tags = 4 [json_name = "tags"];</code>
     * @return A list containing the tags.
     */
    public com.google.protobuf.ProtocolStringList
        getTagsList() {
      tags_.makeImmutable();
      return tags_;
    }
    /**
     * <code>repeated string tags = 4 [json_name = "tags"];</code>
     * @return The count of tags.
     */
    public int getTagsCount() {
      return tags_.size();
    }
    /**
     * <code>repeated string tags = 4 [json_name = "tags"];</code>
     * @param index The index of the element to return.
     * @return The tags at the given index.
     */
    public java.lang.String getTags(int index) {
      return tags_.get(index);
    }
    /**
     * <code>repeated string tags = 4 [json_name = "tags"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the tags at the given index.
     */
    public com.google.protobuf.ByteString
        getTagsBytes(int index) {
      return tags_.getByteString(index);
    }
    /**
     * <code>repeated string tags = 4 [json_name = "tags"];</code>
     * @param index The index to set the value at.
     * @param value The tags to set.
     * @return This builder for chaining.
     */
    public Builder setTags(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureTagsIsMutable();
      tags_.set(index, value);
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string tags = 4 [json_name = "tags"];</code>
     * @param value The tags to add.
     * @return This builder for chaining.
     */
    public Builder addTags(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureTagsIsMutable();
      tags_.add(value);
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string tags = 4 [json_name = "tags"];</code>
     * @param values The tags to add.
     * @return This builder for chaining.
     */
    public Builder addAllTags(
        java.lang.Iterable<java.lang.String> values) {
      ensureTagsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, tags_);
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string tags = 4 [json_name = "tags"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTags() {
      tags_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000008);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string tags = 4 [json_name = "tags"];</code>
     * @param value The bytes of the tags to add.
     * @return This builder for chaining.
     */
    public Builder addTagsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureTagsIsMutable();
      tags_.add(value);
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:asgt.dataservice.v1.RegisterQueryStatsRequest)
  }

  // @@protoc_insertion_point(class_scope:asgt.dataservice.v1.RegisterQueryStatsRequest)
  private static final ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest();
  }

  public static ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RegisterQueryStatsRequest>
      PARSER = new com.google.protobuf.AbstractParser<RegisterQueryStatsRequest>() {
    @java.lang.Override
    public RegisterQueryStatsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<RegisterQueryStatsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RegisterQueryStatsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.visma.asgt.dataservice.v1.RegisterQueryStatsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

