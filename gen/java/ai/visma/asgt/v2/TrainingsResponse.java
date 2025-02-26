// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: asgt/v2/dataset_service.proto
// Protobuf Java Version: 4.29.3

package ai.visma.asgt.v2;

/**
 * Protobuf type {@code asgt.v2.TrainingsResponse}
 */
public final class TrainingsResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:asgt.v2.TrainingsResponse)
    TrainingsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      TrainingsResponse.class.getName());
  }
  // Use TrainingsResponse.newBuilder() to construct.
  private TrainingsResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private TrainingsResponse() {
    trainings_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.visma.asgt.v2.DatasetServiceProto.internal_static_asgt_v2_TrainingsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.visma.asgt.v2.DatasetServiceProto.internal_static_asgt_v2_TrainingsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.visma.asgt.v2.TrainingsResponse.class, ai.visma.asgt.v2.TrainingsResponse.Builder.class);
  }

  public static final int TRAININGS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<ai.visma.asgt.v2.type.Training> trainings_;
  /**
   * <code>repeated .asgt.v2.type.Training trainings = 1 [json_name = "trainings"];</code>
   */
  @java.lang.Override
  public java.util.List<ai.visma.asgt.v2.type.Training> getTrainingsList() {
    return trainings_;
  }
  /**
   * <code>repeated .asgt.v2.type.Training trainings = 1 [json_name = "trainings"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends ai.visma.asgt.v2.type.TrainingOrBuilder> 
      getTrainingsOrBuilderList() {
    return trainings_;
  }
  /**
   * <code>repeated .asgt.v2.type.Training trainings = 1 [json_name = "trainings"];</code>
   */
  @java.lang.Override
  public int getTrainingsCount() {
    return trainings_.size();
  }
  /**
   * <code>repeated .asgt.v2.type.Training trainings = 1 [json_name = "trainings"];</code>
   */
  @java.lang.Override
  public ai.visma.asgt.v2.type.Training getTrainings(int index) {
    return trainings_.get(index);
  }
  /**
   * <code>repeated .asgt.v2.type.Training trainings = 1 [json_name = "trainings"];</code>
   */
  @java.lang.Override
  public ai.visma.asgt.v2.type.TrainingOrBuilder getTrainingsOrBuilder(
      int index) {
    return trainings_.get(index);
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
    for (int i = 0; i < trainings_.size(); i++) {
      output.writeMessage(1, trainings_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < trainings_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, trainings_.get(i));
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
    if (!(obj instanceof ai.visma.asgt.v2.TrainingsResponse)) {
      return super.equals(obj);
    }
    ai.visma.asgt.v2.TrainingsResponse other = (ai.visma.asgt.v2.TrainingsResponse) obj;

    if (!getTrainingsList()
        .equals(other.getTrainingsList())) return false;
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
    if (getTrainingsCount() > 0) {
      hash = (37 * hash) + TRAININGS_FIELD_NUMBER;
      hash = (53 * hash) + getTrainingsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.visma.asgt.v2.TrainingsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.asgt.v2.TrainingsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.asgt.v2.TrainingsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.asgt.v2.TrainingsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.asgt.v2.TrainingsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.asgt.v2.TrainingsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.asgt.v2.TrainingsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.visma.asgt.v2.TrainingsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.visma.asgt.v2.TrainingsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.visma.asgt.v2.TrainingsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.visma.asgt.v2.TrainingsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.visma.asgt.v2.TrainingsResponse parseFrom(
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
  public static Builder newBuilder(ai.visma.asgt.v2.TrainingsResponse prototype) {
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
   * Protobuf type {@code asgt.v2.TrainingsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:asgt.v2.TrainingsResponse)
      ai.visma.asgt.v2.TrainingsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.visma.asgt.v2.DatasetServiceProto.internal_static_asgt_v2_TrainingsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.visma.asgt.v2.DatasetServiceProto.internal_static_asgt_v2_TrainingsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.visma.asgt.v2.TrainingsResponse.class, ai.visma.asgt.v2.TrainingsResponse.Builder.class);
    }

    // Construct using ai.visma.asgt.v2.TrainingsResponse.newBuilder()
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
      if (trainingsBuilder_ == null) {
        trainings_ = java.util.Collections.emptyList();
      } else {
        trainings_ = null;
        trainingsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.visma.asgt.v2.DatasetServiceProto.internal_static_asgt_v2_TrainingsResponse_descriptor;
    }

    @java.lang.Override
    public ai.visma.asgt.v2.TrainingsResponse getDefaultInstanceForType() {
      return ai.visma.asgt.v2.TrainingsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ai.visma.asgt.v2.TrainingsResponse build() {
      ai.visma.asgt.v2.TrainingsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.visma.asgt.v2.TrainingsResponse buildPartial() {
      ai.visma.asgt.v2.TrainingsResponse result = new ai.visma.asgt.v2.TrainingsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(ai.visma.asgt.v2.TrainingsResponse result) {
      if (trainingsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          trainings_ = java.util.Collections.unmodifiableList(trainings_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.trainings_ = trainings_;
      } else {
        result.trainings_ = trainingsBuilder_.build();
      }
    }

    private void buildPartial0(ai.visma.asgt.v2.TrainingsResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ai.visma.asgt.v2.TrainingsResponse) {
        return mergeFrom((ai.visma.asgt.v2.TrainingsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.visma.asgt.v2.TrainingsResponse other) {
      if (other == ai.visma.asgt.v2.TrainingsResponse.getDefaultInstance()) return this;
      if (trainingsBuilder_ == null) {
        if (!other.trainings_.isEmpty()) {
          if (trainings_.isEmpty()) {
            trainings_ = other.trainings_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTrainingsIsMutable();
            trainings_.addAll(other.trainings_);
          }
          onChanged();
        }
      } else {
        if (!other.trainings_.isEmpty()) {
          if (trainingsBuilder_.isEmpty()) {
            trainingsBuilder_.dispose();
            trainingsBuilder_ = null;
            trainings_ = other.trainings_;
            bitField0_ = (bitField0_ & ~0x00000001);
            trainingsBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getTrainingsFieldBuilder() : null;
          } else {
            trainingsBuilder_.addAllMessages(other.trainings_);
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
              ai.visma.asgt.v2.type.Training m =
                  input.readMessage(
                      ai.visma.asgt.v2.type.Training.parser(),
                      extensionRegistry);
              if (trainingsBuilder_ == null) {
                ensureTrainingsIsMutable();
                trainings_.add(m);
              } else {
                trainingsBuilder_.addMessage(m);
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

    private java.util.List<ai.visma.asgt.v2.type.Training> trainings_ =
      java.util.Collections.emptyList();
    private void ensureTrainingsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        trainings_ = new java.util.ArrayList<ai.visma.asgt.v2.type.Training>(trainings_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        ai.visma.asgt.v2.type.Training, ai.visma.asgt.v2.type.Training.Builder, ai.visma.asgt.v2.type.TrainingOrBuilder> trainingsBuilder_;

    /**
     * <code>repeated .asgt.v2.type.Training trainings = 1 [json_name = "trainings"];</code>
     */
    public java.util.List<ai.visma.asgt.v2.type.Training> getTrainingsList() {
      if (trainingsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(trainings_);
      } else {
        return trainingsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .asgt.v2.type.Training trainings = 1 [json_name = "trainings"];</code>
     */
    public int getTrainingsCount() {
      if (trainingsBuilder_ == null) {
        return trainings_.size();
      } else {
        return trainingsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .asgt.v2.type.Training trainings = 1 [json_name = "trainings"];</code>
     */
    public ai.visma.asgt.v2.type.Training getTrainings(int index) {
      if (trainingsBuilder_ == null) {
        return trainings_.get(index);
      } else {
        return trainingsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .asgt.v2.type.Training trainings = 1 [json_name = "trainings"];</code>
     */
    public Builder setTrainings(
        int index, ai.visma.asgt.v2.type.Training value) {
      if (trainingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTrainingsIsMutable();
        trainings_.set(index, value);
        onChanged();
      } else {
        trainingsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .asgt.v2.type.Training trainings = 1 [json_name = "trainings"];</code>
     */
    public Builder setTrainings(
        int index, ai.visma.asgt.v2.type.Training.Builder builderForValue) {
      if (trainingsBuilder_ == null) {
        ensureTrainingsIsMutable();
        trainings_.set(index, builderForValue.build());
        onChanged();
      } else {
        trainingsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .asgt.v2.type.Training trainings = 1 [json_name = "trainings"];</code>
     */
    public Builder addTrainings(ai.visma.asgt.v2.type.Training value) {
      if (trainingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTrainingsIsMutable();
        trainings_.add(value);
        onChanged();
      } else {
        trainingsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .asgt.v2.type.Training trainings = 1 [json_name = "trainings"];</code>
     */
    public Builder addTrainings(
        int index, ai.visma.asgt.v2.type.Training value) {
      if (trainingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTrainingsIsMutable();
        trainings_.add(index, value);
        onChanged();
      } else {
        trainingsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .asgt.v2.type.Training trainings = 1 [json_name = "trainings"];</code>
     */
    public Builder addTrainings(
        ai.visma.asgt.v2.type.Training.Builder builderForValue) {
      if (trainingsBuilder_ == null) {
        ensureTrainingsIsMutable();
        trainings_.add(builderForValue.build());
        onChanged();
      } else {
        trainingsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .asgt.v2.type.Training trainings = 1 [json_name = "trainings"];</code>
     */
    public Builder addTrainings(
        int index, ai.visma.asgt.v2.type.Training.Builder builderForValue) {
      if (trainingsBuilder_ == null) {
        ensureTrainingsIsMutable();
        trainings_.add(index, builderForValue.build());
        onChanged();
      } else {
        trainingsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .asgt.v2.type.Training trainings = 1 [json_name = "trainings"];</code>
     */
    public Builder addAllTrainings(
        java.lang.Iterable<? extends ai.visma.asgt.v2.type.Training> values) {
      if (trainingsBuilder_ == null) {
        ensureTrainingsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, trainings_);
        onChanged();
      } else {
        trainingsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .asgt.v2.type.Training trainings = 1 [json_name = "trainings"];</code>
     */
    public Builder clearTrainings() {
      if (trainingsBuilder_ == null) {
        trainings_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        trainingsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .asgt.v2.type.Training trainings = 1 [json_name = "trainings"];</code>
     */
    public Builder removeTrainings(int index) {
      if (trainingsBuilder_ == null) {
        ensureTrainingsIsMutable();
        trainings_.remove(index);
        onChanged();
      } else {
        trainingsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .asgt.v2.type.Training trainings = 1 [json_name = "trainings"];</code>
     */
    public ai.visma.asgt.v2.type.Training.Builder getTrainingsBuilder(
        int index) {
      return getTrainingsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .asgt.v2.type.Training trainings = 1 [json_name = "trainings"];</code>
     */
    public ai.visma.asgt.v2.type.TrainingOrBuilder getTrainingsOrBuilder(
        int index) {
      if (trainingsBuilder_ == null) {
        return trainings_.get(index);  } else {
        return trainingsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .asgt.v2.type.Training trainings = 1 [json_name = "trainings"];</code>
     */
    public java.util.List<? extends ai.visma.asgt.v2.type.TrainingOrBuilder> 
         getTrainingsOrBuilderList() {
      if (trainingsBuilder_ != null) {
        return trainingsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(trainings_);
      }
    }
    /**
     * <code>repeated .asgt.v2.type.Training trainings = 1 [json_name = "trainings"];</code>
     */
    public ai.visma.asgt.v2.type.Training.Builder addTrainingsBuilder() {
      return getTrainingsFieldBuilder().addBuilder(
          ai.visma.asgt.v2.type.Training.getDefaultInstance());
    }
    /**
     * <code>repeated .asgt.v2.type.Training trainings = 1 [json_name = "trainings"];</code>
     */
    public ai.visma.asgt.v2.type.Training.Builder addTrainingsBuilder(
        int index) {
      return getTrainingsFieldBuilder().addBuilder(
          index, ai.visma.asgt.v2.type.Training.getDefaultInstance());
    }
    /**
     * <code>repeated .asgt.v2.type.Training trainings = 1 [json_name = "trainings"];</code>
     */
    public java.util.List<ai.visma.asgt.v2.type.Training.Builder> 
         getTrainingsBuilderList() {
      return getTrainingsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        ai.visma.asgt.v2.type.Training, ai.visma.asgt.v2.type.Training.Builder, ai.visma.asgt.v2.type.TrainingOrBuilder> 
        getTrainingsFieldBuilder() {
      if (trainingsBuilder_ == null) {
        trainingsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            ai.visma.asgt.v2.type.Training, ai.visma.asgt.v2.type.Training.Builder, ai.visma.asgt.v2.type.TrainingOrBuilder>(
                trainings_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        trainings_ = null;
      }
      return trainingsBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:asgt.v2.TrainingsResponse)
  }

  // @@protoc_insertion_point(class_scope:asgt.v2.TrainingsResponse)
  private static final ai.visma.asgt.v2.TrainingsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.visma.asgt.v2.TrainingsResponse();
  }

  public static ai.visma.asgt.v2.TrainingsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TrainingsResponse>
      PARSER = new com.google.protobuf.AbstractParser<TrainingsResponse>() {
    @java.lang.Override
    public TrainingsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<TrainingsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TrainingsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.visma.asgt.v2.TrainingsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

