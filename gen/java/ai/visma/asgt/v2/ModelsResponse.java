// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: asgt/v2/dataset_service.proto

package ai.visma.asgt.v2;

/**
 * Protobuf type {@code asgt.v2.ModelsResponse}
 */
public final class ModelsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:asgt.v2.ModelsResponse)
    ModelsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ModelsResponse.newBuilder() to construct.
  private ModelsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ModelsResponse() {
    models_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ModelsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.visma.asgt.v2.DatasetServiceProto.internal_static_asgt_v2_ModelsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.visma.asgt.v2.DatasetServiceProto.internal_static_asgt_v2_ModelsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.visma.asgt.v2.ModelsResponse.class, ai.visma.asgt.v2.ModelsResponse.Builder.class);
  }

  public static final int MODELS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<ai.visma.asgt.v2.type.Model> models_;
  /**
   * <code>repeated .asgt.v2.type.Model models = 1 [json_name = "models"];</code>
   */
  @java.lang.Override
  public java.util.List<ai.visma.asgt.v2.type.Model> getModelsList() {
    return models_;
  }
  /**
   * <code>repeated .asgt.v2.type.Model models = 1 [json_name = "models"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends ai.visma.asgt.v2.type.ModelOrBuilder> 
      getModelsOrBuilderList() {
    return models_;
  }
  /**
   * <code>repeated .asgt.v2.type.Model models = 1 [json_name = "models"];</code>
   */
  @java.lang.Override
  public int getModelsCount() {
    return models_.size();
  }
  /**
   * <code>repeated .asgt.v2.type.Model models = 1 [json_name = "models"];</code>
   */
  @java.lang.Override
  public ai.visma.asgt.v2.type.Model getModels(int index) {
    return models_.get(index);
  }
  /**
   * <code>repeated .asgt.v2.type.Model models = 1 [json_name = "models"];</code>
   */
  @java.lang.Override
  public ai.visma.asgt.v2.type.ModelOrBuilder getModelsOrBuilder(
      int index) {
    return models_.get(index);
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
    for (int i = 0; i < models_.size(); i++) {
      output.writeMessage(1, models_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < models_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, models_.get(i));
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
    if (!(obj instanceof ai.visma.asgt.v2.ModelsResponse)) {
      return super.equals(obj);
    }
    ai.visma.asgt.v2.ModelsResponse other = (ai.visma.asgt.v2.ModelsResponse) obj;

    if (!getModelsList()
        .equals(other.getModelsList())) return false;
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
    if (getModelsCount() > 0) {
      hash = (37 * hash) + MODELS_FIELD_NUMBER;
      hash = (53 * hash) + getModelsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.visma.asgt.v2.ModelsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.asgt.v2.ModelsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.asgt.v2.ModelsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.asgt.v2.ModelsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.asgt.v2.ModelsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.asgt.v2.ModelsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.asgt.v2.ModelsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.visma.asgt.v2.ModelsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.visma.asgt.v2.ModelsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.visma.asgt.v2.ModelsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.visma.asgt.v2.ModelsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.visma.asgt.v2.ModelsResponse parseFrom(
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
  public static Builder newBuilder(ai.visma.asgt.v2.ModelsResponse prototype) {
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
   * Protobuf type {@code asgt.v2.ModelsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:asgt.v2.ModelsResponse)
      ai.visma.asgt.v2.ModelsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.visma.asgt.v2.DatasetServiceProto.internal_static_asgt_v2_ModelsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.visma.asgt.v2.DatasetServiceProto.internal_static_asgt_v2_ModelsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.visma.asgt.v2.ModelsResponse.class, ai.visma.asgt.v2.ModelsResponse.Builder.class);
    }

    // Construct using ai.visma.asgt.v2.ModelsResponse.newBuilder()
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
      if (modelsBuilder_ == null) {
        models_ = java.util.Collections.emptyList();
      } else {
        models_ = null;
        modelsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.visma.asgt.v2.DatasetServiceProto.internal_static_asgt_v2_ModelsResponse_descriptor;
    }

    @java.lang.Override
    public ai.visma.asgt.v2.ModelsResponse getDefaultInstanceForType() {
      return ai.visma.asgt.v2.ModelsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ai.visma.asgt.v2.ModelsResponse build() {
      ai.visma.asgt.v2.ModelsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.visma.asgt.v2.ModelsResponse buildPartial() {
      ai.visma.asgt.v2.ModelsResponse result = new ai.visma.asgt.v2.ModelsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(ai.visma.asgt.v2.ModelsResponse result) {
      if (modelsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          models_ = java.util.Collections.unmodifiableList(models_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.models_ = models_;
      } else {
        result.models_ = modelsBuilder_.build();
      }
    }

    private void buildPartial0(ai.visma.asgt.v2.ModelsResponse result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof ai.visma.asgt.v2.ModelsResponse) {
        return mergeFrom((ai.visma.asgt.v2.ModelsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.visma.asgt.v2.ModelsResponse other) {
      if (other == ai.visma.asgt.v2.ModelsResponse.getDefaultInstance()) return this;
      if (modelsBuilder_ == null) {
        if (!other.models_.isEmpty()) {
          if (models_.isEmpty()) {
            models_ = other.models_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureModelsIsMutable();
            models_.addAll(other.models_);
          }
          onChanged();
        }
      } else {
        if (!other.models_.isEmpty()) {
          if (modelsBuilder_.isEmpty()) {
            modelsBuilder_.dispose();
            modelsBuilder_ = null;
            models_ = other.models_;
            bitField0_ = (bitField0_ & ~0x00000001);
            modelsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getModelsFieldBuilder() : null;
          } else {
            modelsBuilder_.addAllMessages(other.models_);
          }
        }
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
              ai.visma.asgt.v2.type.Model m =
                  input.readMessage(
                      ai.visma.asgt.v2.type.Model.parser(),
                      extensionRegistry);
              if (modelsBuilder_ == null) {
                ensureModelsIsMutable();
                models_.add(m);
              } else {
                modelsBuilder_.addMessage(m);
              }
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

    private java.util.List<ai.visma.asgt.v2.type.Model> models_ =
      java.util.Collections.emptyList();
    private void ensureModelsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        models_ = new java.util.ArrayList<ai.visma.asgt.v2.type.Model>(models_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        ai.visma.asgt.v2.type.Model, ai.visma.asgt.v2.type.Model.Builder, ai.visma.asgt.v2.type.ModelOrBuilder> modelsBuilder_;

    /**
     * <code>repeated .asgt.v2.type.Model models = 1 [json_name = "models"];</code>
     */
    public java.util.List<ai.visma.asgt.v2.type.Model> getModelsList() {
      if (modelsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(models_);
      } else {
        return modelsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .asgt.v2.type.Model models = 1 [json_name = "models"];</code>
     */
    public int getModelsCount() {
      if (modelsBuilder_ == null) {
        return models_.size();
      } else {
        return modelsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .asgt.v2.type.Model models = 1 [json_name = "models"];</code>
     */
    public ai.visma.asgt.v2.type.Model getModels(int index) {
      if (modelsBuilder_ == null) {
        return models_.get(index);
      } else {
        return modelsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .asgt.v2.type.Model models = 1 [json_name = "models"];</code>
     */
    public Builder setModels(
        int index, ai.visma.asgt.v2.type.Model value) {
      if (modelsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureModelsIsMutable();
        models_.set(index, value);
        onChanged();
      } else {
        modelsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .asgt.v2.type.Model models = 1 [json_name = "models"];</code>
     */
    public Builder setModels(
        int index, ai.visma.asgt.v2.type.Model.Builder builderForValue) {
      if (modelsBuilder_ == null) {
        ensureModelsIsMutable();
        models_.set(index, builderForValue.build());
        onChanged();
      } else {
        modelsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .asgt.v2.type.Model models = 1 [json_name = "models"];</code>
     */
    public Builder addModels(ai.visma.asgt.v2.type.Model value) {
      if (modelsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureModelsIsMutable();
        models_.add(value);
        onChanged();
      } else {
        modelsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .asgt.v2.type.Model models = 1 [json_name = "models"];</code>
     */
    public Builder addModels(
        int index, ai.visma.asgt.v2.type.Model value) {
      if (modelsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureModelsIsMutable();
        models_.add(index, value);
        onChanged();
      } else {
        modelsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .asgt.v2.type.Model models = 1 [json_name = "models"];</code>
     */
    public Builder addModels(
        ai.visma.asgt.v2.type.Model.Builder builderForValue) {
      if (modelsBuilder_ == null) {
        ensureModelsIsMutable();
        models_.add(builderForValue.build());
        onChanged();
      } else {
        modelsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .asgt.v2.type.Model models = 1 [json_name = "models"];</code>
     */
    public Builder addModels(
        int index, ai.visma.asgt.v2.type.Model.Builder builderForValue) {
      if (modelsBuilder_ == null) {
        ensureModelsIsMutable();
        models_.add(index, builderForValue.build());
        onChanged();
      } else {
        modelsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .asgt.v2.type.Model models = 1 [json_name = "models"];</code>
     */
    public Builder addAllModels(
        java.lang.Iterable<? extends ai.visma.asgt.v2.type.Model> values) {
      if (modelsBuilder_ == null) {
        ensureModelsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, models_);
        onChanged();
      } else {
        modelsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .asgt.v2.type.Model models = 1 [json_name = "models"];</code>
     */
    public Builder clearModels() {
      if (modelsBuilder_ == null) {
        models_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        modelsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .asgt.v2.type.Model models = 1 [json_name = "models"];</code>
     */
    public Builder removeModels(int index) {
      if (modelsBuilder_ == null) {
        ensureModelsIsMutable();
        models_.remove(index);
        onChanged();
      } else {
        modelsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .asgt.v2.type.Model models = 1 [json_name = "models"];</code>
     */
    public ai.visma.asgt.v2.type.Model.Builder getModelsBuilder(
        int index) {
      return getModelsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .asgt.v2.type.Model models = 1 [json_name = "models"];</code>
     */
    public ai.visma.asgt.v2.type.ModelOrBuilder getModelsOrBuilder(
        int index) {
      if (modelsBuilder_ == null) {
        return models_.get(index);  } else {
        return modelsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .asgt.v2.type.Model models = 1 [json_name = "models"];</code>
     */
    public java.util.List<? extends ai.visma.asgt.v2.type.ModelOrBuilder> 
         getModelsOrBuilderList() {
      if (modelsBuilder_ != null) {
        return modelsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(models_);
      }
    }
    /**
     * <code>repeated .asgt.v2.type.Model models = 1 [json_name = "models"];</code>
     */
    public ai.visma.asgt.v2.type.Model.Builder addModelsBuilder() {
      return getModelsFieldBuilder().addBuilder(
          ai.visma.asgt.v2.type.Model.getDefaultInstance());
    }
    /**
     * <code>repeated .asgt.v2.type.Model models = 1 [json_name = "models"];</code>
     */
    public ai.visma.asgt.v2.type.Model.Builder addModelsBuilder(
        int index) {
      return getModelsFieldBuilder().addBuilder(
          index, ai.visma.asgt.v2.type.Model.getDefaultInstance());
    }
    /**
     * <code>repeated .asgt.v2.type.Model models = 1 [json_name = "models"];</code>
     */
    public java.util.List<ai.visma.asgt.v2.type.Model.Builder> 
         getModelsBuilderList() {
      return getModelsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        ai.visma.asgt.v2.type.Model, ai.visma.asgt.v2.type.Model.Builder, ai.visma.asgt.v2.type.ModelOrBuilder> 
        getModelsFieldBuilder() {
      if (modelsBuilder_ == null) {
        modelsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            ai.visma.asgt.v2.type.Model, ai.visma.asgt.v2.type.Model.Builder, ai.visma.asgt.v2.type.ModelOrBuilder>(
                models_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        models_ = null;
      }
      return modelsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:asgt.v2.ModelsResponse)
  }

  // @@protoc_insertion_point(class_scope:asgt.v2.ModelsResponse)
  private static final ai.visma.asgt.v2.ModelsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.visma.asgt.v2.ModelsResponse();
  }

  public static ai.visma.asgt.v2.ModelsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ModelsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ModelsResponse>() {
    @java.lang.Override
    public ModelsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ModelsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ModelsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.visma.asgt.v2.ModelsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

