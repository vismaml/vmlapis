// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: asgt/v2/dataset_service.proto
// Protobuf Java Version: 4.29.3

package ai.visma.asgt.v2;

/**
 * Protobuf type {@code asgt.v2.CreateExampleRequest}
 */
public final class CreateExampleRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:asgt.v2.CreateExampleRequest)
    CreateExampleRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      CreateExampleRequest.class.getName());
  }
  // Use CreateExampleRequest.newBuilder() to construct.
  private CreateExampleRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private CreateExampleRequest() {
    datasetName_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.visma.asgt.v2.DatasetServiceProto.internal_static_asgt_v2_CreateExampleRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.visma.asgt.v2.DatasetServiceProto.internal_static_asgt_v2_CreateExampleRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.visma.asgt.v2.CreateExampleRequest.class, ai.visma.asgt.v2.CreateExampleRequest.Builder.class);
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

  public static final int EXAMPLE_FIELD_NUMBER = 2;
  private ai.visma.asgt.v2.type.Example example_;
  /**
   * <code>.asgt.v2.type.Example example = 2 [json_name = "example"];</code>
   * @return Whether the example field is set.
   */
  @java.lang.Override
  public boolean hasExample() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.asgt.v2.type.Example example = 2 [json_name = "example"];</code>
   * @return The example.
   */
  @java.lang.Override
  public ai.visma.asgt.v2.type.Example getExample() {
    return example_ == null ? ai.visma.asgt.v2.type.Example.getDefaultInstance() : example_;
  }
  /**
   * <code>.asgt.v2.type.Example example = 2 [json_name = "example"];</code>
   */
  @java.lang.Override
  public ai.visma.asgt.v2.type.ExampleOrBuilder getExampleOrBuilder() {
    return example_ == null ? ai.visma.asgt.v2.type.Example.getDefaultInstance() : example_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getExample());
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
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getExample());
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
    if (!(obj instanceof ai.visma.asgt.v2.CreateExampleRequest)) {
      return super.equals(obj);
    }
    ai.visma.asgt.v2.CreateExampleRequest other = (ai.visma.asgt.v2.CreateExampleRequest) obj;

    if (!getDatasetName()
        .equals(other.getDatasetName())) return false;
    if (hasExample() != other.hasExample()) return false;
    if (hasExample()) {
      if (!getExample()
          .equals(other.getExample())) return false;
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
    if (hasExample()) {
      hash = (37 * hash) + EXAMPLE_FIELD_NUMBER;
      hash = (53 * hash) + getExample().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.visma.asgt.v2.CreateExampleRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.asgt.v2.CreateExampleRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.asgt.v2.CreateExampleRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.asgt.v2.CreateExampleRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.asgt.v2.CreateExampleRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.asgt.v2.CreateExampleRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.asgt.v2.CreateExampleRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.visma.asgt.v2.CreateExampleRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.visma.asgt.v2.CreateExampleRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.visma.asgt.v2.CreateExampleRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.visma.asgt.v2.CreateExampleRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.visma.asgt.v2.CreateExampleRequest parseFrom(
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
  public static Builder newBuilder(ai.visma.asgt.v2.CreateExampleRequest prototype) {
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
   * Protobuf type {@code asgt.v2.CreateExampleRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:asgt.v2.CreateExampleRequest)
      ai.visma.asgt.v2.CreateExampleRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.visma.asgt.v2.DatasetServiceProto.internal_static_asgt_v2_CreateExampleRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.visma.asgt.v2.DatasetServiceProto.internal_static_asgt_v2_CreateExampleRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.visma.asgt.v2.CreateExampleRequest.class, ai.visma.asgt.v2.CreateExampleRequest.Builder.class);
    }

    // Construct using ai.visma.asgt.v2.CreateExampleRequest.newBuilder()
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
        getExampleFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      datasetName_ = "";
      example_ = null;
      if (exampleBuilder_ != null) {
        exampleBuilder_.dispose();
        exampleBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.visma.asgt.v2.DatasetServiceProto.internal_static_asgt_v2_CreateExampleRequest_descriptor;
    }

    @java.lang.Override
    public ai.visma.asgt.v2.CreateExampleRequest getDefaultInstanceForType() {
      return ai.visma.asgt.v2.CreateExampleRequest.getDefaultInstance();
    }

    @java.lang.Override
    public ai.visma.asgt.v2.CreateExampleRequest build() {
      ai.visma.asgt.v2.CreateExampleRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.visma.asgt.v2.CreateExampleRequest buildPartial() {
      ai.visma.asgt.v2.CreateExampleRequest result = new ai.visma.asgt.v2.CreateExampleRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.visma.asgt.v2.CreateExampleRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.datasetName_ = datasetName_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.example_ = exampleBuilder_ == null
            ? example_
            : exampleBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ai.visma.asgt.v2.CreateExampleRequest) {
        return mergeFrom((ai.visma.asgt.v2.CreateExampleRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.visma.asgt.v2.CreateExampleRequest other) {
      if (other == ai.visma.asgt.v2.CreateExampleRequest.getDefaultInstance()) return this;
      if (!other.getDatasetName().isEmpty()) {
        datasetName_ = other.datasetName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasExample()) {
        mergeExample(other.getExample());
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
              input.readMessage(
                  getExampleFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private ai.visma.asgt.v2.type.Example example_;
    private com.google.protobuf.SingleFieldBuilder<
        ai.visma.asgt.v2.type.Example, ai.visma.asgt.v2.type.Example.Builder, ai.visma.asgt.v2.type.ExampleOrBuilder> exampleBuilder_;
    /**
     * <code>.asgt.v2.type.Example example = 2 [json_name = "example"];</code>
     * @return Whether the example field is set.
     */
    public boolean hasExample() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.asgt.v2.type.Example example = 2 [json_name = "example"];</code>
     * @return The example.
     */
    public ai.visma.asgt.v2.type.Example getExample() {
      if (exampleBuilder_ == null) {
        return example_ == null ? ai.visma.asgt.v2.type.Example.getDefaultInstance() : example_;
      } else {
        return exampleBuilder_.getMessage();
      }
    }
    /**
     * <code>.asgt.v2.type.Example example = 2 [json_name = "example"];</code>
     */
    public Builder setExample(ai.visma.asgt.v2.type.Example value) {
      if (exampleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        example_ = value;
      } else {
        exampleBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.asgt.v2.type.Example example = 2 [json_name = "example"];</code>
     */
    public Builder setExample(
        ai.visma.asgt.v2.type.Example.Builder builderForValue) {
      if (exampleBuilder_ == null) {
        example_ = builderForValue.build();
      } else {
        exampleBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.asgt.v2.type.Example example = 2 [json_name = "example"];</code>
     */
    public Builder mergeExample(ai.visma.asgt.v2.type.Example value) {
      if (exampleBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          example_ != null &&
          example_ != ai.visma.asgt.v2.type.Example.getDefaultInstance()) {
          getExampleBuilder().mergeFrom(value);
        } else {
          example_ = value;
        }
      } else {
        exampleBuilder_.mergeFrom(value);
      }
      if (example_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.asgt.v2.type.Example example = 2 [json_name = "example"];</code>
     */
    public Builder clearExample() {
      bitField0_ = (bitField0_ & ~0x00000002);
      example_ = null;
      if (exampleBuilder_ != null) {
        exampleBuilder_.dispose();
        exampleBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.asgt.v2.type.Example example = 2 [json_name = "example"];</code>
     */
    public ai.visma.asgt.v2.type.Example.Builder getExampleBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getExampleFieldBuilder().getBuilder();
    }
    /**
     * <code>.asgt.v2.type.Example example = 2 [json_name = "example"];</code>
     */
    public ai.visma.asgt.v2.type.ExampleOrBuilder getExampleOrBuilder() {
      if (exampleBuilder_ != null) {
        return exampleBuilder_.getMessageOrBuilder();
      } else {
        return example_ == null ?
            ai.visma.asgt.v2.type.Example.getDefaultInstance() : example_;
      }
    }
    /**
     * <code>.asgt.v2.type.Example example = 2 [json_name = "example"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        ai.visma.asgt.v2.type.Example, ai.visma.asgt.v2.type.Example.Builder, ai.visma.asgt.v2.type.ExampleOrBuilder> 
        getExampleFieldBuilder() {
      if (exampleBuilder_ == null) {
        exampleBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            ai.visma.asgt.v2.type.Example, ai.visma.asgt.v2.type.Example.Builder, ai.visma.asgt.v2.type.ExampleOrBuilder>(
                getExample(),
                getParentForChildren(),
                isClean());
        example_ = null;
      }
      return exampleBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:asgt.v2.CreateExampleRequest)
  }

  // @@protoc_insertion_point(class_scope:asgt.v2.CreateExampleRequest)
  private static final ai.visma.asgt.v2.CreateExampleRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.visma.asgt.v2.CreateExampleRequest();
  }

  public static ai.visma.asgt.v2.CreateExampleRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateExampleRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateExampleRequest>() {
    @java.lang.Override
    public CreateExampleRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateExampleRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateExampleRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.visma.asgt.v2.CreateExampleRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

