// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: ssn/dataservice/v1/dataservice.proto
// Protobuf Java Version: 4.29.3

package ai.visma.ssn.dataservice.v1;

/**
 * Protobuf type {@code ssn.dataservice.v1.FeedbackMetrics}
 */
public final class FeedbackMetrics extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:ssn.dataservice.v1.FeedbackMetrics)
    FeedbackMetricsOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      FeedbackMetrics.class.getName());
  }
  // Use FeedbackMetrics.newBuilder() to construct.
  private FeedbackMetrics(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private FeedbackMetrics() {
    fieldCorrectness_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.visma.ssn.dataservice.v1.DataserviceProto.internal_static_ssn_dataservice_v1_FeedbackMetrics_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.visma.ssn.dataservice.v1.DataserviceProto.internal_static_ssn_dataservice_v1_FeedbackMetrics_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.visma.ssn.dataservice.v1.FeedbackMetrics.class, ai.visma.ssn.dataservice.v1.FeedbackMetrics.Builder.class);
  }

  private int bitField0_;
  public static final int DOCUMENT_COUNT_FIELD_NUMBER = 1;
  private int documentCount_ = 0;
  /**
   * <code>int32 document_count = 1 [json_name = "documentCount"];</code>
   * @return The documentCount.
   */
  @java.lang.Override
  public int getDocumentCount() {
    return documentCount_;
  }

  public static final int FEEDBACK_COUNT_FIELD_NUMBER = 2;
  private int feedbackCount_ = 0;
  /**
   * <code>int32 feedback_count = 2 [json_name = "feedbackCount"];</code>
   * @return The feedbackCount.
   */
  @java.lang.Override
  public int getFeedbackCount() {
    return feedbackCount_;
  }

  public static final int OVERALL_CORRECTNESS_FIELD_NUMBER = 3;
  private ai.visma.ssn.dataservice.v1.Correctness overallCorrectness_;
  /**
   * <code>.ssn.dataservice.v1.Correctness overall_correctness = 3 [json_name = "overallCorrectness"];</code>
   * @return Whether the overallCorrectness field is set.
   */
  @java.lang.Override
  public boolean hasOverallCorrectness() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.ssn.dataservice.v1.Correctness overall_correctness = 3 [json_name = "overallCorrectness"];</code>
   * @return The overallCorrectness.
   */
  @java.lang.Override
  public ai.visma.ssn.dataservice.v1.Correctness getOverallCorrectness() {
    return overallCorrectness_ == null ? ai.visma.ssn.dataservice.v1.Correctness.getDefaultInstance() : overallCorrectness_;
  }
  /**
   * <code>.ssn.dataservice.v1.Correctness overall_correctness = 3 [json_name = "overallCorrectness"];</code>
   */
  @java.lang.Override
  public ai.visma.ssn.dataservice.v1.CorrectnessOrBuilder getOverallCorrectnessOrBuilder() {
    return overallCorrectness_ == null ? ai.visma.ssn.dataservice.v1.Correctness.getDefaultInstance() : overallCorrectness_;
  }

  public static final int FIELD_CORRECTNESS_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private java.util.List<ai.visma.ssn.dataservice.v1.Correctness> fieldCorrectness_;
  /**
   * <code>repeated .ssn.dataservice.v1.Correctness field_correctness = 4 [json_name = "fieldCorrectness"];</code>
   */
  @java.lang.Override
  public java.util.List<ai.visma.ssn.dataservice.v1.Correctness> getFieldCorrectnessList() {
    return fieldCorrectness_;
  }
  /**
   * <code>repeated .ssn.dataservice.v1.Correctness field_correctness = 4 [json_name = "fieldCorrectness"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends ai.visma.ssn.dataservice.v1.CorrectnessOrBuilder> 
      getFieldCorrectnessOrBuilderList() {
    return fieldCorrectness_;
  }
  /**
   * <code>repeated .ssn.dataservice.v1.Correctness field_correctness = 4 [json_name = "fieldCorrectness"];</code>
   */
  @java.lang.Override
  public int getFieldCorrectnessCount() {
    return fieldCorrectness_.size();
  }
  /**
   * <code>repeated .ssn.dataservice.v1.Correctness field_correctness = 4 [json_name = "fieldCorrectness"];</code>
   */
  @java.lang.Override
  public ai.visma.ssn.dataservice.v1.Correctness getFieldCorrectness(int index) {
    return fieldCorrectness_.get(index);
  }
  /**
   * <code>repeated .ssn.dataservice.v1.Correctness field_correctness = 4 [json_name = "fieldCorrectness"];</code>
   */
  @java.lang.Override
  public ai.visma.ssn.dataservice.v1.CorrectnessOrBuilder getFieldCorrectnessOrBuilder(
      int index) {
    return fieldCorrectness_.get(index);
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
    if (documentCount_ != 0) {
      output.writeInt32(1, documentCount_);
    }
    if (feedbackCount_ != 0) {
      output.writeInt32(2, feedbackCount_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getOverallCorrectness());
    }
    for (int i = 0; i < fieldCorrectness_.size(); i++) {
      output.writeMessage(4, fieldCorrectness_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (documentCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, documentCount_);
    }
    if (feedbackCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, feedbackCount_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getOverallCorrectness());
    }
    for (int i = 0; i < fieldCorrectness_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, fieldCorrectness_.get(i));
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
    if (!(obj instanceof ai.visma.ssn.dataservice.v1.FeedbackMetrics)) {
      return super.equals(obj);
    }
    ai.visma.ssn.dataservice.v1.FeedbackMetrics other = (ai.visma.ssn.dataservice.v1.FeedbackMetrics) obj;

    if (getDocumentCount()
        != other.getDocumentCount()) return false;
    if (getFeedbackCount()
        != other.getFeedbackCount()) return false;
    if (hasOverallCorrectness() != other.hasOverallCorrectness()) return false;
    if (hasOverallCorrectness()) {
      if (!getOverallCorrectness()
          .equals(other.getOverallCorrectness())) return false;
    }
    if (!getFieldCorrectnessList()
        .equals(other.getFieldCorrectnessList())) return false;
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
    hash = (37 * hash) + DOCUMENT_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getDocumentCount();
    hash = (37 * hash) + FEEDBACK_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getFeedbackCount();
    if (hasOverallCorrectness()) {
      hash = (37 * hash) + OVERALL_CORRECTNESS_FIELD_NUMBER;
      hash = (53 * hash) + getOverallCorrectness().hashCode();
    }
    if (getFieldCorrectnessCount() > 0) {
      hash = (37 * hash) + FIELD_CORRECTNESS_FIELD_NUMBER;
      hash = (53 * hash) + getFieldCorrectnessList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.visma.ssn.dataservice.v1.FeedbackMetrics parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.ssn.dataservice.v1.FeedbackMetrics parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.ssn.dataservice.v1.FeedbackMetrics parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.ssn.dataservice.v1.FeedbackMetrics parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.ssn.dataservice.v1.FeedbackMetrics parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.ssn.dataservice.v1.FeedbackMetrics parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.ssn.dataservice.v1.FeedbackMetrics parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.visma.ssn.dataservice.v1.FeedbackMetrics parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.visma.ssn.dataservice.v1.FeedbackMetrics parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.visma.ssn.dataservice.v1.FeedbackMetrics parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.visma.ssn.dataservice.v1.FeedbackMetrics parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.visma.ssn.dataservice.v1.FeedbackMetrics parseFrom(
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
  public static Builder newBuilder(ai.visma.ssn.dataservice.v1.FeedbackMetrics prototype) {
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
   * Protobuf type {@code ssn.dataservice.v1.FeedbackMetrics}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ssn.dataservice.v1.FeedbackMetrics)
      ai.visma.ssn.dataservice.v1.FeedbackMetricsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.visma.ssn.dataservice.v1.DataserviceProto.internal_static_ssn_dataservice_v1_FeedbackMetrics_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.visma.ssn.dataservice.v1.DataserviceProto.internal_static_ssn_dataservice_v1_FeedbackMetrics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.visma.ssn.dataservice.v1.FeedbackMetrics.class, ai.visma.ssn.dataservice.v1.FeedbackMetrics.Builder.class);
    }

    // Construct using ai.visma.ssn.dataservice.v1.FeedbackMetrics.newBuilder()
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
        getOverallCorrectnessFieldBuilder();
        getFieldCorrectnessFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      documentCount_ = 0;
      feedbackCount_ = 0;
      overallCorrectness_ = null;
      if (overallCorrectnessBuilder_ != null) {
        overallCorrectnessBuilder_.dispose();
        overallCorrectnessBuilder_ = null;
      }
      if (fieldCorrectnessBuilder_ == null) {
        fieldCorrectness_ = java.util.Collections.emptyList();
      } else {
        fieldCorrectness_ = null;
        fieldCorrectnessBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.visma.ssn.dataservice.v1.DataserviceProto.internal_static_ssn_dataservice_v1_FeedbackMetrics_descriptor;
    }

    @java.lang.Override
    public ai.visma.ssn.dataservice.v1.FeedbackMetrics getDefaultInstanceForType() {
      return ai.visma.ssn.dataservice.v1.FeedbackMetrics.getDefaultInstance();
    }

    @java.lang.Override
    public ai.visma.ssn.dataservice.v1.FeedbackMetrics build() {
      ai.visma.ssn.dataservice.v1.FeedbackMetrics result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.visma.ssn.dataservice.v1.FeedbackMetrics buildPartial() {
      ai.visma.ssn.dataservice.v1.FeedbackMetrics result = new ai.visma.ssn.dataservice.v1.FeedbackMetrics(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(ai.visma.ssn.dataservice.v1.FeedbackMetrics result) {
      if (fieldCorrectnessBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0)) {
          fieldCorrectness_ = java.util.Collections.unmodifiableList(fieldCorrectness_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.fieldCorrectness_ = fieldCorrectness_;
      } else {
        result.fieldCorrectness_ = fieldCorrectnessBuilder_.build();
      }
    }

    private void buildPartial0(ai.visma.ssn.dataservice.v1.FeedbackMetrics result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.documentCount_ = documentCount_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.feedbackCount_ = feedbackCount_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.overallCorrectness_ = overallCorrectnessBuilder_ == null
            ? overallCorrectness_
            : overallCorrectnessBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ai.visma.ssn.dataservice.v1.FeedbackMetrics) {
        return mergeFrom((ai.visma.ssn.dataservice.v1.FeedbackMetrics)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.visma.ssn.dataservice.v1.FeedbackMetrics other) {
      if (other == ai.visma.ssn.dataservice.v1.FeedbackMetrics.getDefaultInstance()) return this;
      if (other.getDocumentCount() != 0) {
        setDocumentCount(other.getDocumentCount());
      }
      if (other.getFeedbackCount() != 0) {
        setFeedbackCount(other.getFeedbackCount());
      }
      if (other.hasOverallCorrectness()) {
        mergeOverallCorrectness(other.getOverallCorrectness());
      }
      if (fieldCorrectnessBuilder_ == null) {
        if (!other.fieldCorrectness_.isEmpty()) {
          if (fieldCorrectness_.isEmpty()) {
            fieldCorrectness_ = other.fieldCorrectness_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureFieldCorrectnessIsMutable();
            fieldCorrectness_.addAll(other.fieldCorrectness_);
          }
          onChanged();
        }
      } else {
        if (!other.fieldCorrectness_.isEmpty()) {
          if (fieldCorrectnessBuilder_.isEmpty()) {
            fieldCorrectnessBuilder_.dispose();
            fieldCorrectnessBuilder_ = null;
            fieldCorrectness_ = other.fieldCorrectness_;
            bitField0_ = (bitField0_ & ~0x00000008);
            fieldCorrectnessBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getFieldCorrectnessFieldBuilder() : null;
          } else {
            fieldCorrectnessBuilder_.addAllMessages(other.fieldCorrectness_);
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
            case 8: {
              documentCount_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              feedbackCount_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getOverallCorrectnessFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              ai.visma.ssn.dataservice.v1.Correctness m =
                  input.readMessage(
                      ai.visma.ssn.dataservice.v1.Correctness.parser(),
                      extensionRegistry);
              if (fieldCorrectnessBuilder_ == null) {
                ensureFieldCorrectnessIsMutable();
                fieldCorrectness_.add(m);
              } else {
                fieldCorrectnessBuilder_.addMessage(m);
              }
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

    private int documentCount_ ;
    /**
     * <code>int32 document_count = 1 [json_name = "documentCount"];</code>
     * @return The documentCount.
     */
    @java.lang.Override
    public int getDocumentCount() {
      return documentCount_;
    }
    /**
     * <code>int32 document_count = 1 [json_name = "documentCount"];</code>
     * @param value The documentCount to set.
     * @return This builder for chaining.
     */
    public Builder setDocumentCount(int value) {

      documentCount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int32 document_count = 1 [json_name = "documentCount"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDocumentCount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      documentCount_ = 0;
      onChanged();
      return this;
    }

    private int feedbackCount_ ;
    /**
     * <code>int32 feedback_count = 2 [json_name = "feedbackCount"];</code>
     * @return The feedbackCount.
     */
    @java.lang.Override
    public int getFeedbackCount() {
      return feedbackCount_;
    }
    /**
     * <code>int32 feedback_count = 2 [json_name = "feedbackCount"];</code>
     * @param value The feedbackCount to set.
     * @return This builder for chaining.
     */
    public Builder setFeedbackCount(int value) {

      feedbackCount_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int32 feedback_count = 2 [json_name = "feedbackCount"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFeedbackCount() {
      bitField0_ = (bitField0_ & ~0x00000002);
      feedbackCount_ = 0;
      onChanged();
      return this;
    }

    private ai.visma.ssn.dataservice.v1.Correctness overallCorrectness_;
    private com.google.protobuf.SingleFieldBuilder<
        ai.visma.ssn.dataservice.v1.Correctness, ai.visma.ssn.dataservice.v1.Correctness.Builder, ai.visma.ssn.dataservice.v1.CorrectnessOrBuilder> overallCorrectnessBuilder_;
    /**
     * <code>.ssn.dataservice.v1.Correctness overall_correctness = 3 [json_name = "overallCorrectness"];</code>
     * @return Whether the overallCorrectness field is set.
     */
    public boolean hasOverallCorrectness() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.ssn.dataservice.v1.Correctness overall_correctness = 3 [json_name = "overallCorrectness"];</code>
     * @return The overallCorrectness.
     */
    public ai.visma.ssn.dataservice.v1.Correctness getOverallCorrectness() {
      if (overallCorrectnessBuilder_ == null) {
        return overallCorrectness_ == null ? ai.visma.ssn.dataservice.v1.Correctness.getDefaultInstance() : overallCorrectness_;
      } else {
        return overallCorrectnessBuilder_.getMessage();
      }
    }
    /**
     * <code>.ssn.dataservice.v1.Correctness overall_correctness = 3 [json_name = "overallCorrectness"];</code>
     */
    public Builder setOverallCorrectness(ai.visma.ssn.dataservice.v1.Correctness value) {
      if (overallCorrectnessBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        overallCorrectness_ = value;
      } else {
        overallCorrectnessBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.ssn.dataservice.v1.Correctness overall_correctness = 3 [json_name = "overallCorrectness"];</code>
     */
    public Builder setOverallCorrectness(
        ai.visma.ssn.dataservice.v1.Correctness.Builder builderForValue) {
      if (overallCorrectnessBuilder_ == null) {
        overallCorrectness_ = builderForValue.build();
      } else {
        overallCorrectnessBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.ssn.dataservice.v1.Correctness overall_correctness = 3 [json_name = "overallCorrectness"];</code>
     */
    public Builder mergeOverallCorrectness(ai.visma.ssn.dataservice.v1.Correctness value) {
      if (overallCorrectnessBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          overallCorrectness_ != null &&
          overallCorrectness_ != ai.visma.ssn.dataservice.v1.Correctness.getDefaultInstance()) {
          getOverallCorrectnessBuilder().mergeFrom(value);
        } else {
          overallCorrectness_ = value;
        }
      } else {
        overallCorrectnessBuilder_.mergeFrom(value);
      }
      if (overallCorrectness_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.ssn.dataservice.v1.Correctness overall_correctness = 3 [json_name = "overallCorrectness"];</code>
     */
    public Builder clearOverallCorrectness() {
      bitField0_ = (bitField0_ & ~0x00000004);
      overallCorrectness_ = null;
      if (overallCorrectnessBuilder_ != null) {
        overallCorrectnessBuilder_.dispose();
        overallCorrectnessBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.ssn.dataservice.v1.Correctness overall_correctness = 3 [json_name = "overallCorrectness"];</code>
     */
    public ai.visma.ssn.dataservice.v1.Correctness.Builder getOverallCorrectnessBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getOverallCorrectnessFieldBuilder().getBuilder();
    }
    /**
     * <code>.ssn.dataservice.v1.Correctness overall_correctness = 3 [json_name = "overallCorrectness"];</code>
     */
    public ai.visma.ssn.dataservice.v1.CorrectnessOrBuilder getOverallCorrectnessOrBuilder() {
      if (overallCorrectnessBuilder_ != null) {
        return overallCorrectnessBuilder_.getMessageOrBuilder();
      } else {
        return overallCorrectness_ == null ?
            ai.visma.ssn.dataservice.v1.Correctness.getDefaultInstance() : overallCorrectness_;
      }
    }
    /**
     * <code>.ssn.dataservice.v1.Correctness overall_correctness = 3 [json_name = "overallCorrectness"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        ai.visma.ssn.dataservice.v1.Correctness, ai.visma.ssn.dataservice.v1.Correctness.Builder, ai.visma.ssn.dataservice.v1.CorrectnessOrBuilder> 
        getOverallCorrectnessFieldBuilder() {
      if (overallCorrectnessBuilder_ == null) {
        overallCorrectnessBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            ai.visma.ssn.dataservice.v1.Correctness, ai.visma.ssn.dataservice.v1.Correctness.Builder, ai.visma.ssn.dataservice.v1.CorrectnessOrBuilder>(
                getOverallCorrectness(),
                getParentForChildren(),
                isClean());
        overallCorrectness_ = null;
      }
      return overallCorrectnessBuilder_;
    }

    private java.util.List<ai.visma.ssn.dataservice.v1.Correctness> fieldCorrectness_ =
      java.util.Collections.emptyList();
    private void ensureFieldCorrectnessIsMutable() {
      if (!((bitField0_ & 0x00000008) != 0)) {
        fieldCorrectness_ = new java.util.ArrayList<ai.visma.ssn.dataservice.v1.Correctness>(fieldCorrectness_);
        bitField0_ |= 0x00000008;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        ai.visma.ssn.dataservice.v1.Correctness, ai.visma.ssn.dataservice.v1.Correctness.Builder, ai.visma.ssn.dataservice.v1.CorrectnessOrBuilder> fieldCorrectnessBuilder_;

    /**
     * <code>repeated .ssn.dataservice.v1.Correctness field_correctness = 4 [json_name = "fieldCorrectness"];</code>
     */
    public java.util.List<ai.visma.ssn.dataservice.v1.Correctness> getFieldCorrectnessList() {
      if (fieldCorrectnessBuilder_ == null) {
        return java.util.Collections.unmodifiableList(fieldCorrectness_);
      } else {
        return fieldCorrectnessBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .ssn.dataservice.v1.Correctness field_correctness = 4 [json_name = "fieldCorrectness"];</code>
     */
    public int getFieldCorrectnessCount() {
      if (fieldCorrectnessBuilder_ == null) {
        return fieldCorrectness_.size();
      } else {
        return fieldCorrectnessBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .ssn.dataservice.v1.Correctness field_correctness = 4 [json_name = "fieldCorrectness"];</code>
     */
    public ai.visma.ssn.dataservice.v1.Correctness getFieldCorrectness(int index) {
      if (fieldCorrectnessBuilder_ == null) {
        return fieldCorrectness_.get(index);
      } else {
        return fieldCorrectnessBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .ssn.dataservice.v1.Correctness field_correctness = 4 [json_name = "fieldCorrectness"];</code>
     */
    public Builder setFieldCorrectness(
        int index, ai.visma.ssn.dataservice.v1.Correctness value) {
      if (fieldCorrectnessBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFieldCorrectnessIsMutable();
        fieldCorrectness_.set(index, value);
        onChanged();
      } else {
        fieldCorrectnessBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ssn.dataservice.v1.Correctness field_correctness = 4 [json_name = "fieldCorrectness"];</code>
     */
    public Builder setFieldCorrectness(
        int index, ai.visma.ssn.dataservice.v1.Correctness.Builder builderForValue) {
      if (fieldCorrectnessBuilder_ == null) {
        ensureFieldCorrectnessIsMutable();
        fieldCorrectness_.set(index, builderForValue.build());
        onChanged();
      } else {
        fieldCorrectnessBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ssn.dataservice.v1.Correctness field_correctness = 4 [json_name = "fieldCorrectness"];</code>
     */
    public Builder addFieldCorrectness(ai.visma.ssn.dataservice.v1.Correctness value) {
      if (fieldCorrectnessBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFieldCorrectnessIsMutable();
        fieldCorrectness_.add(value);
        onChanged();
      } else {
        fieldCorrectnessBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .ssn.dataservice.v1.Correctness field_correctness = 4 [json_name = "fieldCorrectness"];</code>
     */
    public Builder addFieldCorrectness(
        int index, ai.visma.ssn.dataservice.v1.Correctness value) {
      if (fieldCorrectnessBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFieldCorrectnessIsMutable();
        fieldCorrectness_.add(index, value);
        onChanged();
      } else {
        fieldCorrectnessBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ssn.dataservice.v1.Correctness field_correctness = 4 [json_name = "fieldCorrectness"];</code>
     */
    public Builder addFieldCorrectness(
        ai.visma.ssn.dataservice.v1.Correctness.Builder builderForValue) {
      if (fieldCorrectnessBuilder_ == null) {
        ensureFieldCorrectnessIsMutable();
        fieldCorrectness_.add(builderForValue.build());
        onChanged();
      } else {
        fieldCorrectnessBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ssn.dataservice.v1.Correctness field_correctness = 4 [json_name = "fieldCorrectness"];</code>
     */
    public Builder addFieldCorrectness(
        int index, ai.visma.ssn.dataservice.v1.Correctness.Builder builderForValue) {
      if (fieldCorrectnessBuilder_ == null) {
        ensureFieldCorrectnessIsMutable();
        fieldCorrectness_.add(index, builderForValue.build());
        onChanged();
      } else {
        fieldCorrectnessBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ssn.dataservice.v1.Correctness field_correctness = 4 [json_name = "fieldCorrectness"];</code>
     */
    public Builder addAllFieldCorrectness(
        java.lang.Iterable<? extends ai.visma.ssn.dataservice.v1.Correctness> values) {
      if (fieldCorrectnessBuilder_ == null) {
        ensureFieldCorrectnessIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, fieldCorrectness_);
        onChanged();
      } else {
        fieldCorrectnessBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .ssn.dataservice.v1.Correctness field_correctness = 4 [json_name = "fieldCorrectness"];</code>
     */
    public Builder clearFieldCorrectness() {
      if (fieldCorrectnessBuilder_ == null) {
        fieldCorrectness_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
      } else {
        fieldCorrectnessBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .ssn.dataservice.v1.Correctness field_correctness = 4 [json_name = "fieldCorrectness"];</code>
     */
    public Builder removeFieldCorrectness(int index) {
      if (fieldCorrectnessBuilder_ == null) {
        ensureFieldCorrectnessIsMutable();
        fieldCorrectness_.remove(index);
        onChanged();
      } else {
        fieldCorrectnessBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .ssn.dataservice.v1.Correctness field_correctness = 4 [json_name = "fieldCorrectness"];</code>
     */
    public ai.visma.ssn.dataservice.v1.Correctness.Builder getFieldCorrectnessBuilder(
        int index) {
      return getFieldCorrectnessFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .ssn.dataservice.v1.Correctness field_correctness = 4 [json_name = "fieldCorrectness"];</code>
     */
    public ai.visma.ssn.dataservice.v1.CorrectnessOrBuilder getFieldCorrectnessOrBuilder(
        int index) {
      if (fieldCorrectnessBuilder_ == null) {
        return fieldCorrectness_.get(index);  } else {
        return fieldCorrectnessBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .ssn.dataservice.v1.Correctness field_correctness = 4 [json_name = "fieldCorrectness"];</code>
     */
    public java.util.List<? extends ai.visma.ssn.dataservice.v1.CorrectnessOrBuilder> 
         getFieldCorrectnessOrBuilderList() {
      if (fieldCorrectnessBuilder_ != null) {
        return fieldCorrectnessBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(fieldCorrectness_);
      }
    }
    /**
     * <code>repeated .ssn.dataservice.v1.Correctness field_correctness = 4 [json_name = "fieldCorrectness"];</code>
     */
    public ai.visma.ssn.dataservice.v1.Correctness.Builder addFieldCorrectnessBuilder() {
      return getFieldCorrectnessFieldBuilder().addBuilder(
          ai.visma.ssn.dataservice.v1.Correctness.getDefaultInstance());
    }
    /**
     * <code>repeated .ssn.dataservice.v1.Correctness field_correctness = 4 [json_name = "fieldCorrectness"];</code>
     */
    public ai.visma.ssn.dataservice.v1.Correctness.Builder addFieldCorrectnessBuilder(
        int index) {
      return getFieldCorrectnessFieldBuilder().addBuilder(
          index, ai.visma.ssn.dataservice.v1.Correctness.getDefaultInstance());
    }
    /**
     * <code>repeated .ssn.dataservice.v1.Correctness field_correctness = 4 [json_name = "fieldCorrectness"];</code>
     */
    public java.util.List<ai.visma.ssn.dataservice.v1.Correctness.Builder> 
         getFieldCorrectnessBuilderList() {
      return getFieldCorrectnessFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        ai.visma.ssn.dataservice.v1.Correctness, ai.visma.ssn.dataservice.v1.Correctness.Builder, ai.visma.ssn.dataservice.v1.CorrectnessOrBuilder> 
        getFieldCorrectnessFieldBuilder() {
      if (fieldCorrectnessBuilder_ == null) {
        fieldCorrectnessBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            ai.visma.ssn.dataservice.v1.Correctness, ai.visma.ssn.dataservice.v1.Correctness.Builder, ai.visma.ssn.dataservice.v1.CorrectnessOrBuilder>(
                fieldCorrectness_,
                ((bitField0_ & 0x00000008) != 0),
                getParentForChildren(),
                isClean());
        fieldCorrectness_ = null;
      }
      return fieldCorrectnessBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:ssn.dataservice.v1.FeedbackMetrics)
  }

  // @@protoc_insertion_point(class_scope:ssn.dataservice.v1.FeedbackMetrics)
  private static final ai.visma.ssn.dataservice.v1.FeedbackMetrics DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.visma.ssn.dataservice.v1.FeedbackMetrics();
  }

  public static ai.visma.ssn.dataservice.v1.FeedbackMetrics getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FeedbackMetrics>
      PARSER = new com.google.protobuf.AbstractParser<FeedbackMetrics>() {
    @java.lang.Override
    public FeedbackMetrics parsePartialFrom(
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

  public static com.google.protobuf.Parser<FeedbackMetrics> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FeedbackMetrics> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.visma.ssn.dataservice.v1.FeedbackMetrics getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

