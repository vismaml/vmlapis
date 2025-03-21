// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: asgt/modelregistry/v1/model_registry.proto
// Protobuf Java Version: 4.29.3

package ai.visma.asgt.modelregistry.v1;

/**
 * Protobuf type {@code asgt.modelregistry.v1.GetCurrentModelResponse}
 */
public final class GetCurrentModelResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:asgt.modelregistry.v1.GetCurrentModelResponse)
    GetCurrentModelResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      GetCurrentModelResponse.class.getName());
  }
  // Use GetCurrentModelResponse.newBuilder() to construct.
  private GetCurrentModelResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GetCurrentModelResponse() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.visma.asgt.modelregistry.v1.ModelRegistryProto.internal_static_asgt_modelregistry_v1_GetCurrentModelResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.visma.asgt.modelregistry.v1.ModelRegistryProto.internal_static_asgt_modelregistry_v1_GetCurrentModelResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.visma.asgt.modelregistry.v1.GetCurrentModelResponse.class, ai.visma.asgt.modelregistry.v1.GetCurrentModelResponse.Builder.class);
  }

  private int bitField0_;
  public static final int MODEL_FIELD_NUMBER = 1;
  private ai.visma.asgt.type.Model model_;
  /**
   * <code>.asgt.type.Model model = 1 [json_name = "model"];</code>
   * @return Whether the model field is set.
   */
  @java.lang.Override
  public boolean hasModel() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.asgt.type.Model model = 1 [json_name = "model"];</code>
   * @return The model.
   */
  @java.lang.Override
  public ai.visma.asgt.type.Model getModel() {
    return model_ == null ? ai.visma.asgt.type.Model.getDefaultInstance() : model_;
  }
  /**
   * <code>.asgt.type.Model model = 1 [json_name = "model"];</code>
   */
  @java.lang.Override
  public ai.visma.asgt.type.ModelOrBuilder getModelOrBuilder() {
    return model_ == null ? ai.visma.asgt.type.Model.getDefaultInstance() : model_;
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
      output.writeMessage(1, getModel());
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
        .computeMessageSize(1, getModel());
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
    if (!(obj instanceof ai.visma.asgt.modelregistry.v1.GetCurrentModelResponse)) {
      return super.equals(obj);
    }
    ai.visma.asgt.modelregistry.v1.GetCurrentModelResponse other = (ai.visma.asgt.modelregistry.v1.GetCurrentModelResponse) obj;

    if (hasModel() != other.hasModel()) return false;
    if (hasModel()) {
      if (!getModel()
          .equals(other.getModel())) return false;
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
    if (hasModel()) {
      hash = (37 * hash) + MODEL_FIELD_NUMBER;
      hash = (53 * hash) + getModel().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.visma.asgt.modelregistry.v1.GetCurrentModelResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.asgt.modelregistry.v1.GetCurrentModelResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.asgt.modelregistry.v1.GetCurrentModelResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.asgt.modelregistry.v1.GetCurrentModelResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.asgt.modelregistry.v1.GetCurrentModelResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.asgt.modelregistry.v1.GetCurrentModelResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.asgt.modelregistry.v1.GetCurrentModelResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.visma.asgt.modelregistry.v1.GetCurrentModelResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.visma.asgt.modelregistry.v1.GetCurrentModelResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.visma.asgt.modelregistry.v1.GetCurrentModelResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.visma.asgt.modelregistry.v1.GetCurrentModelResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.visma.asgt.modelregistry.v1.GetCurrentModelResponse parseFrom(
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
  public static Builder newBuilder(ai.visma.asgt.modelregistry.v1.GetCurrentModelResponse prototype) {
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
   * Protobuf type {@code asgt.modelregistry.v1.GetCurrentModelResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:asgt.modelregistry.v1.GetCurrentModelResponse)
      ai.visma.asgt.modelregistry.v1.GetCurrentModelResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.visma.asgt.modelregistry.v1.ModelRegistryProto.internal_static_asgt_modelregistry_v1_GetCurrentModelResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.visma.asgt.modelregistry.v1.ModelRegistryProto.internal_static_asgt_modelregistry_v1_GetCurrentModelResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.visma.asgt.modelregistry.v1.GetCurrentModelResponse.class, ai.visma.asgt.modelregistry.v1.GetCurrentModelResponse.Builder.class);
    }

    // Construct using ai.visma.asgt.modelregistry.v1.GetCurrentModelResponse.newBuilder()
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
        getModelFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      model_ = null;
      if (modelBuilder_ != null) {
        modelBuilder_.dispose();
        modelBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.visma.asgt.modelregistry.v1.ModelRegistryProto.internal_static_asgt_modelregistry_v1_GetCurrentModelResponse_descriptor;
    }

    @java.lang.Override
    public ai.visma.asgt.modelregistry.v1.GetCurrentModelResponse getDefaultInstanceForType() {
      return ai.visma.asgt.modelregistry.v1.GetCurrentModelResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ai.visma.asgt.modelregistry.v1.GetCurrentModelResponse build() {
      ai.visma.asgt.modelregistry.v1.GetCurrentModelResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.visma.asgt.modelregistry.v1.GetCurrentModelResponse buildPartial() {
      ai.visma.asgt.modelregistry.v1.GetCurrentModelResponse result = new ai.visma.asgt.modelregistry.v1.GetCurrentModelResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.visma.asgt.modelregistry.v1.GetCurrentModelResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.model_ = modelBuilder_ == null
            ? model_
            : modelBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ai.visma.asgt.modelregistry.v1.GetCurrentModelResponse) {
        return mergeFrom((ai.visma.asgt.modelregistry.v1.GetCurrentModelResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.visma.asgt.modelregistry.v1.GetCurrentModelResponse other) {
      if (other == ai.visma.asgt.modelregistry.v1.GetCurrentModelResponse.getDefaultInstance()) return this;
      if (other.hasModel()) {
        mergeModel(other.getModel());
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
                  getModelFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private ai.visma.asgt.type.Model model_;
    private com.google.protobuf.SingleFieldBuilder<
        ai.visma.asgt.type.Model, ai.visma.asgt.type.Model.Builder, ai.visma.asgt.type.ModelOrBuilder> modelBuilder_;
    /**
     * <code>.asgt.type.Model model = 1 [json_name = "model"];</code>
     * @return Whether the model field is set.
     */
    public boolean hasModel() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.asgt.type.Model model = 1 [json_name = "model"];</code>
     * @return The model.
     */
    public ai.visma.asgt.type.Model getModel() {
      if (modelBuilder_ == null) {
        return model_ == null ? ai.visma.asgt.type.Model.getDefaultInstance() : model_;
      } else {
        return modelBuilder_.getMessage();
      }
    }
    /**
     * <code>.asgt.type.Model model = 1 [json_name = "model"];</code>
     */
    public Builder setModel(ai.visma.asgt.type.Model value) {
      if (modelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        model_ = value;
      } else {
        modelBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.asgt.type.Model model = 1 [json_name = "model"];</code>
     */
    public Builder setModel(
        ai.visma.asgt.type.Model.Builder builderForValue) {
      if (modelBuilder_ == null) {
        model_ = builderForValue.build();
      } else {
        modelBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.asgt.type.Model model = 1 [json_name = "model"];</code>
     */
    public Builder mergeModel(ai.visma.asgt.type.Model value) {
      if (modelBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          model_ != null &&
          model_ != ai.visma.asgt.type.Model.getDefaultInstance()) {
          getModelBuilder().mergeFrom(value);
        } else {
          model_ = value;
        }
      } else {
        modelBuilder_.mergeFrom(value);
      }
      if (model_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.asgt.type.Model model = 1 [json_name = "model"];</code>
     */
    public Builder clearModel() {
      bitField0_ = (bitField0_ & ~0x00000001);
      model_ = null;
      if (modelBuilder_ != null) {
        modelBuilder_.dispose();
        modelBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.asgt.type.Model model = 1 [json_name = "model"];</code>
     */
    public ai.visma.asgt.type.Model.Builder getModelBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getModelFieldBuilder().getBuilder();
    }
    /**
     * <code>.asgt.type.Model model = 1 [json_name = "model"];</code>
     */
    public ai.visma.asgt.type.ModelOrBuilder getModelOrBuilder() {
      if (modelBuilder_ != null) {
        return modelBuilder_.getMessageOrBuilder();
      } else {
        return model_ == null ?
            ai.visma.asgt.type.Model.getDefaultInstance() : model_;
      }
    }
    /**
     * <code>.asgt.type.Model model = 1 [json_name = "model"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        ai.visma.asgt.type.Model, ai.visma.asgt.type.Model.Builder, ai.visma.asgt.type.ModelOrBuilder> 
        getModelFieldBuilder() {
      if (modelBuilder_ == null) {
        modelBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            ai.visma.asgt.type.Model, ai.visma.asgt.type.Model.Builder, ai.visma.asgt.type.ModelOrBuilder>(
                getModel(),
                getParentForChildren(),
                isClean());
        model_ = null;
      }
      return modelBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:asgt.modelregistry.v1.GetCurrentModelResponse)
  }

  // @@protoc_insertion_point(class_scope:asgt.modelregistry.v1.GetCurrentModelResponse)
  private static final ai.visma.asgt.modelregistry.v1.GetCurrentModelResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.visma.asgt.modelregistry.v1.GetCurrentModelResponse();
  }

  public static ai.visma.asgt.modelregistry.v1.GetCurrentModelResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetCurrentModelResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetCurrentModelResponse>() {
    @java.lang.Override
    public GetCurrentModelResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetCurrentModelResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetCurrentModelResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.visma.asgt.modelregistry.v1.GetCurrentModelResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

