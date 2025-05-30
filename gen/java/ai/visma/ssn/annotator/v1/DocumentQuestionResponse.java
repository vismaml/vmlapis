// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: ssn/annotator/v1/annotator.proto
// Protobuf Java Version: 4.29.3

package ai.visma.ssn.annotator.v1;

/**
 * Protobuf type {@code ssn.annotator.v1.DocumentQuestionResponse}
 */
public final class DocumentQuestionResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:ssn.annotator.v1.DocumentQuestionResponse)
    DocumentQuestionResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      DocumentQuestionResponse.class.getName());
  }
  // Use DocumentQuestionResponse.newBuilder() to construct.
  private DocumentQuestionResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private DocumentQuestionResponse() {
    answers_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.visma.ssn.annotator.v1.AnnotatorProto.internal_static_ssn_annotator_v1_DocumentQuestionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.visma.ssn.annotator.v1.AnnotatorProto.internal_static_ssn_annotator_v1_DocumentQuestionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.visma.ssn.annotator.v1.DocumentQuestionResponse.class, ai.visma.ssn.annotator.v1.DocumentQuestionResponse.Builder.class);
  }

  public static final int ANSWERS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<ai.visma.ssn.type.AnswerCandidate> answers_;
  /**
   * <code>repeated .ssn.type.AnswerCandidate answers = 2 [json_name = "answers"];</code>
   */
  @java.lang.Override
  public java.util.List<ai.visma.ssn.type.AnswerCandidate> getAnswersList() {
    return answers_;
  }
  /**
   * <code>repeated .ssn.type.AnswerCandidate answers = 2 [json_name = "answers"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends ai.visma.ssn.type.AnswerCandidateOrBuilder> 
      getAnswersOrBuilderList() {
    return answers_;
  }
  /**
   * <code>repeated .ssn.type.AnswerCandidate answers = 2 [json_name = "answers"];</code>
   */
  @java.lang.Override
  public int getAnswersCount() {
    return answers_.size();
  }
  /**
   * <code>repeated .ssn.type.AnswerCandidate answers = 2 [json_name = "answers"];</code>
   */
  @java.lang.Override
  public ai.visma.ssn.type.AnswerCandidate getAnswers(int index) {
    return answers_.get(index);
  }
  /**
   * <code>repeated .ssn.type.AnswerCandidate answers = 2 [json_name = "answers"];</code>
   */
  @java.lang.Override
  public ai.visma.ssn.type.AnswerCandidateOrBuilder getAnswersOrBuilder(
      int index) {
    return answers_.get(index);
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
    for (int i = 0; i < answers_.size(); i++) {
      output.writeMessage(2, answers_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < answers_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, answers_.get(i));
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
    if (!(obj instanceof ai.visma.ssn.annotator.v1.DocumentQuestionResponse)) {
      return super.equals(obj);
    }
    ai.visma.ssn.annotator.v1.DocumentQuestionResponse other = (ai.visma.ssn.annotator.v1.DocumentQuestionResponse) obj;

    if (!getAnswersList()
        .equals(other.getAnswersList())) return false;
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
    if (getAnswersCount() > 0) {
      hash = (37 * hash) + ANSWERS_FIELD_NUMBER;
      hash = (53 * hash) + getAnswersList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.visma.ssn.annotator.v1.DocumentQuestionResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.ssn.annotator.v1.DocumentQuestionResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.ssn.annotator.v1.DocumentQuestionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.ssn.annotator.v1.DocumentQuestionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.ssn.annotator.v1.DocumentQuestionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.ssn.annotator.v1.DocumentQuestionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.ssn.annotator.v1.DocumentQuestionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.visma.ssn.annotator.v1.DocumentQuestionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.visma.ssn.annotator.v1.DocumentQuestionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.visma.ssn.annotator.v1.DocumentQuestionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.visma.ssn.annotator.v1.DocumentQuestionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.visma.ssn.annotator.v1.DocumentQuestionResponse parseFrom(
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
  public static Builder newBuilder(ai.visma.ssn.annotator.v1.DocumentQuestionResponse prototype) {
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
   * Protobuf type {@code ssn.annotator.v1.DocumentQuestionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ssn.annotator.v1.DocumentQuestionResponse)
      ai.visma.ssn.annotator.v1.DocumentQuestionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.visma.ssn.annotator.v1.AnnotatorProto.internal_static_ssn_annotator_v1_DocumentQuestionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.visma.ssn.annotator.v1.AnnotatorProto.internal_static_ssn_annotator_v1_DocumentQuestionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.visma.ssn.annotator.v1.DocumentQuestionResponse.class, ai.visma.ssn.annotator.v1.DocumentQuestionResponse.Builder.class);
    }

    // Construct using ai.visma.ssn.annotator.v1.DocumentQuestionResponse.newBuilder()
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
      if (answersBuilder_ == null) {
        answers_ = java.util.Collections.emptyList();
      } else {
        answers_ = null;
        answersBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.visma.ssn.annotator.v1.AnnotatorProto.internal_static_ssn_annotator_v1_DocumentQuestionResponse_descriptor;
    }

    @java.lang.Override
    public ai.visma.ssn.annotator.v1.DocumentQuestionResponse getDefaultInstanceForType() {
      return ai.visma.ssn.annotator.v1.DocumentQuestionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ai.visma.ssn.annotator.v1.DocumentQuestionResponse build() {
      ai.visma.ssn.annotator.v1.DocumentQuestionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.visma.ssn.annotator.v1.DocumentQuestionResponse buildPartial() {
      ai.visma.ssn.annotator.v1.DocumentQuestionResponse result = new ai.visma.ssn.annotator.v1.DocumentQuestionResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(ai.visma.ssn.annotator.v1.DocumentQuestionResponse result) {
      if (answersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          answers_ = java.util.Collections.unmodifiableList(answers_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.answers_ = answers_;
      } else {
        result.answers_ = answersBuilder_.build();
      }
    }

    private void buildPartial0(ai.visma.ssn.annotator.v1.DocumentQuestionResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ai.visma.ssn.annotator.v1.DocumentQuestionResponse) {
        return mergeFrom((ai.visma.ssn.annotator.v1.DocumentQuestionResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.visma.ssn.annotator.v1.DocumentQuestionResponse other) {
      if (other == ai.visma.ssn.annotator.v1.DocumentQuestionResponse.getDefaultInstance()) return this;
      if (answersBuilder_ == null) {
        if (!other.answers_.isEmpty()) {
          if (answers_.isEmpty()) {
            answers_ = other.answers_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAnswersIsMutable();
            answers_.addAll(other.answers_);
          }
          onChanged();
        }
      } else {
        if (!other.answers_.isEmpty()) {
          if (answersBuilder_.isEmpty()) {
            answersBuilder_.dispose();
            answersBuilder_ = null;
            answers_ = other.answers_;
            bitField0_ = (bitField0_ & ~0x00000001);
            answersBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getAnswersFieldBuilder() : null;
          } else {
            answersBuilder_.addAllMessages(other.answers_);
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
            case 18: {
              ai.visma.ssn.type.AnswerCandidate m =
                  input.readMessage(
                      ai.visma.ssn.type.AnswerCandidate.parser(),
                      extensionRegistry);
              if (answersBuilder_ == null) {
                ensureAnswersIsMutable();
                answers_.add(m);
              } else {
                answersBuilder_.addMessage(m);
              }
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

    private java.util.List<ai.visma.ssn.type.AnswerCandidate> answers_ =
      java.util.Collections.emptyList();
    private void ensureAnswersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        answers_ = new java.util.ArrayList<ai.visma.ssn.type.AnswerCandidate>(answers_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        ai.visma.ssn.type.AnswerCandidate, ai.visma.ssn.type.AnswerCandidate.Builder, ai.visma.ssn.type.AnswerCandidateOrBuilder> answersBuilder_;

    /**
     * <code>repeated .ssn.type.AnswerCandidate answers = 2 [json_name = "answers"];</code>
     */
    public java.util.List<ai.visma.ssn.type.AnswerCandidate> getAnswersList() {
      if (answersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(answers_);
      } else {
        return answersBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .ssn.type.AnswerCandidate answers = 2 [json_name = "answers"];</code>
     */
    public int getAnswersCount() {
      if (answersBuilder_ == null) {
        return answers_.size();
      } else {
        return answersBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .ssn.type.AnswerCandidate answers = 2 [json_name = "answers"];</code>
     */
    public ai.visma.ssn.type.AnswerCandidate getAnswers(int index) {
      if (answersBuilder_ == null) {
        return answers_.get(index);
      } else {
        return answersBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .ssn.type.AnswerCandidate answers = 2 [json_name = "answers"];</code>
     */
    public Builder setAnswers(
        int index, ai.visma.ssn.type.AnswerCandidate value) {
      if (answersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnswersIsMutable();
        answers_.set(index, value);
        onChanged();
      } else {
        answersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ssn.type.AnswerCandidate answers = 2 [json_name = "answers"];</code>
     */
    public Builder setAnswers(
        int index, ai.visma.ssn.type.AnswerCandidate.Builder builderForValue) {
      if (answersBuilder_ == null) {
        ensureAnswersIsMutable();
        answers_.set(index, builderForValue.build());
        onChanged();
      } else {
        answersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ssn.type.AnswerCandidate answers = 2 [json_name = "answers"];</code>
     */
    public Builder addAnswers(ai.visma.ssn.type.AnswerCandidate value) {
      if (answersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnswersIsMutable();
        answers_.add(value);
        onChanged();
      } else {
        answersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .ssn.type.AnswerCandidate answers = 2 [json_name = "answers"];</code>
     */
    public Builder addAnswers(
        int index, ai.visma.ssn.type.AnswerCandidate value) {
      if (answersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnswersIsMutable();
        answers_.add(index, value);
        onChanged();
      } else {
        answersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ssn.type.AnswerCandidate answers = 2 [json_name = "answers"];</code>
     */
    public Builder addAnswers(
        ai.visma.ssn.type.AnswerCandidate.Builder builderForValue) {
      if (answersBuilder_ == null) {
        ensureAnswersIsMutable();
        answers_.add(builderForValue.build());
        onChanged();
      } else {
        answersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ssn.type.AnswerCandidate answers = 2 [json_name = "answers"];</code>
     */
    public Builder addAnswers(
        int index, ai.visma.ssn.type.AnswerCandidate.Builder builderForValue) {
      if (answersBuilder_ == null) {
        ensureAnswersIsMutable();
        answers_.add(index, builderForValue.build());
        onChanged();
      } else {
        answersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ssn.type.AnswerCandidate answers = 2 [json_name = "answers"];</code>
     */
    public Builder addAllAnswers(
        java.lang.Iterable<? extends ai.visma.ssn.type.AnswerCandidate> values) {
      if (answersBuilder_ == null) {
        ensureAnswersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, answers_);
        onChanged();
      } else {
        answersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .ssn.type.AnswerCandidate answers = 2 [json_name = "answers"];</code>
     */
    public Builder clearAnswers() {
      if (answersBuilder_ == null) {
        answers_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        answersBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .ssn.type.AnswerCandidate answers = 2 [json_name = "answers"];</code>
     */
    public Builder removeAnswers(int index) {
      if (answersBuilder_ == null) {
        ensureAnswersIsMutable();
        answers_.remove(index);
        onChanged();
      } else {
        answersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .ssn.type.AnswerCandidate answers = 2 [json_name = "answers"];</code>
     */
    public ai.visma.ssn.type.AnswerCandidate.Builder getAnswersBuilder(
        int index) {
      return getAnswersFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .ssn.type.AnswerCandidate answers = 2 [json_name = "answers"];</code>
     */
    public ai.visma.ssn.type.AnswerCandidateOrBuilder getAnswersOrBuilder(
        int index) {
      if (answersBuilder_ == null) {
        return answers_.get(index);  } else {
        return answersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .ssn.type.AnswerCandidate answers = 2 [json_name = "answers"];</code>
     */
    public java.util.List<? extends ai.visma.ssn.type.AnswerCandidateOrBuilder> 
         getAnswersOrBuilderList() {
      if (answersBuilder_ != null) {
        return answersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(answers_);
      }
    }
    /**
     * <code>repeated .ssn.type.AnswerCandidate answers = 2 [json_name = "answers"];</code>
     */
    public ai.visma.ssn.type.AnswerCandidate.Builder addAnswersBuilder() {
      return getAnswersFieldBuilder().addBuilder(
          ai.visma.ssn.type.AnswerCandidate.getDefaultInstance());
    }
    /**
     * <code>repeated .ssn.type.AnswerCandidate answers = 2 [json_name = "answers"];</code>
     */
    public ai.visma.ssn.type.AnswerCandidate.Builder addAnswersBuilder(
        int index) {
      return getAnswersFieldBuilder().addBuilder(
          index, ai.visma.ssn.type.AnswerCandidate.getDefaultInstance());
    }
    /**
     * <code>repeated .ssn.type.AnswerCandidate answers = 2 [json_name = "answers"];</code>
     */
    public java.util.List<ai.visma.ssn.type.AnswerCandidate.Builder> 
         getAnswersBuilderList() {
      return getAnswersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        ai.visma.ssn.type.AnswerCandidate, ai.visma.ssn.type.AnswerCandidate.Builder, ai.visma.ssn.type.AnswerCandidateOrBuilder> 
        getAnswersFieldBuilder() {
      if (answersBuilder_ == null) {
        answersBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            ai.visma.ssn.type.AnswerCandidate, ai.visma.ssn.type.AnswerCandidate.Builder, ai.visma.ssn.type.AnswerCandidateOrBuilder>(
                answers_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        answers_ = null;
      }
      return answersBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:ssn.annotator.v1.DocumentQuestionResponse)
  }

  // @@protoc_insertion_point(class_scope:ssn.annotator.v1.DocumentQuestionResponse)
  private static final ai.visma.ssn.annotator.v1.DocumentQuestionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.visma.ssn.annotator.v1.DocumentQuestionResponse();
  }

  public static ai.visma.ssn.annotator.v1.DocumentQuestionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DocumentQuestionResponse>
      PARSER = new com.google.protobuf.AbstractParser<DocumentQuestionResponse>() {
    @java.lang.Override
    public DocumentQuestionResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<DocumentQuestionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DocumentQuestionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.visma.ssn.annotator.v1.DocumentQuestionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

