// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: asgt/v2/dataset_service.proto

package ai.visma.asgt.v2;

/**
 * Protobuf type {@code asgt.v2.CreateOrUpdateDatasetRequest}
 */
public final class CreateOrUpdateDatasetRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:asgt.v2.CreateOrUpdateDatasetRequest)
    CreateOrUpdateDatasetRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateOrUpdateDatasetRequest.newBuilder() to construct.
  private CreateOrUpdateDatasetRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateOrUpdateDatasetRequest() {
    datasetName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateOrUpdateDatasetRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.visma.asgt.v2.DatasetServiceProto.internal_static_asgt_v2_CreateOrUpdateDatasetRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.visma.asgt.v2.DatasetServiceProto.internal_static_asgt_v2_CreateOrUpdateDatasetRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.visma.asgt.v2.CreateOrUpdateDatasetRequest.class, ai.visma.asgt.v2.CreateOrUpdateDatasetRequest.Builder.class);
  }

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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(datasetName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, datasetName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(datasetName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, datasetName_);
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
    if (!(obj instanceof ai.visma.asgt.v2.CreateOrUpdateDatasetRequest)) {
      return super.equals(obj);
    }
    ai.visma.asgt.v2.CreateOrUpdateDatasetRequest other = (ai.visma.asgt.v2.CreateOrUpdateDatasetRequest) obj;

    if (!getDatasetName()
        .equals(other.getDatasetName())) return false;
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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.visma.asgt.v2.CreateOrUpdateDatasetRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.asgt.v2.CreateOrUpdateDatasetRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.asgt.v2.CreateOrUpdateDatasetRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.asgt.v2.CreateOrUpdateDatasetRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.asgt.v2.CreateOrUpdateDatasetRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.asgt.v2.CreateOrUpdateDatasetRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.asgt.v2.CreateOrUpdateDatasetRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.visma.asgt.v2.CreateOrUpdateDatasetRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.visma.asgt.v2.CreateOrUpdateDatasetRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.visma.asgt.v2.CreateOrUpdateDatasetRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.visma.asgt.v2.CreateOrUpdateDatasetRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.visma.asgt.v2.CreateOrUpdateDatasetRequest parseFrom(
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
  public static Builder newBuilder(ai.visma.asgt.v2.CreateOrUpdateDatasetRequest prototype) {
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
   * Protobuf type {@code asgt.v2.CreateOrUpdateDatasetRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:asgt.v2.CreateOrUpdateDatasetRequest)
      ai.visma.asgt.v2.CreateOrUpdateDatasetRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.visma.asgt.v2.DatasetServiceProto.internal_static_asgt_v2_CreateOrUpdateDatasetRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.visma.asgt.v2.DatasetServiceProto.internal_static_asgt_v2_CreateOrUpdateDatasetRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.visma.asgt.v2.CreateOrUpdateDatasetRequest.class, ai.visma.asgt.v2.CreateOrUpdateDatasetRequest.Builder.class);
    }

    // Construct using ai.visma.asgt.v2.CreateOrUpdateDatasetRequest.newBuilder()
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
      datasetName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.visma.asgt.v2.DatasetServiceProto.internal_static_asgt_v2_CreateOrUpdateDatasetRequest_descriptor;
    }

    @java.lang.Override
    public ai.visma.asgt.v2.CreateOrUpdateDatasetRequest getDefaultInstanceForType() {
      return ai.visma.asgt.v2.CreateOrUpdateDatasetRequest.getDefaultInstance();
    }

    @java.lang.Override
    public ai.visma.asgt.v2.CreateOrUpdateDatasetRequest build() {
      ai.visma.asgt.v2.CreateOrUpdateDatasetRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.visma.asgt.v2.CreateOrUpdateDatasetRequest buildPartial() {
      ai.visma.asgt.v2.CreateOrUpdateDatasetRequest result = new ai.visma.asgt.v2.CreateOrUpdateDatasetRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.visma.asgt.v2.CreateOrUpdateDatasetRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.datasetName_ = datasetName_;
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
      if (other instanceof ai.visma.asgt.v2.CreateOrUpdateDatasetRequest) {
        return mergeFrom((ai.visma.asgt.v2.CreateOrUpdateDatasetRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.visma.asgt.v2.CreateOrUpdateDatasetRequest other) {
      if (other == ai.visma.asgt.v2.CreateOrUpdateDatasetRequest.getDefaultInstance()) return this;
      if (!other.getDatasetName().isEmpty()) {
        datasetName_ = other.datasetName_;
        bitField0_ |= 0x00000001;
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
              datasetName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:asgt.v2.CreateOrUpdateDatasetRequest)
  }

  // @@protoc_insertion_point(class_scope:asgt.v2.CreateOrUpdateDatasetRequest)
  private static final ai.visma.asgt.v2.CreateOrUpdateDatasetRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.visma.asgt.v2.CreateOrUpdateDatasetRequest();
  }

  public static ai.visma.asgt.v2.CreateOrUpdateDatasetRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateOrUpdateDatasetRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateOrUpdateDatasetRequest>() {
    @java.lang.Override
    public CreateOrUpdateDatasetRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateOrUpdateDatasetRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateOrUpdateDatasetRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.visma.asgt.v2.CreateOrUpdateDatasetRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

