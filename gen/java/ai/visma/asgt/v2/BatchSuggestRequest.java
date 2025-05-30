// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: asgt/v2/suggester_service.proto
// Protobuf Java Version: 4.29.3

package ai.visma.asgt.v2;

/**
 * Protobuf type {@code asgt.v2.BatchSuggestRequest}
 */
public final class BatchSuggestRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:asgt.v2.BatchSuggestRequest)
    BatchSuggestRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      BatchSuggestRequest.class.getName());
  }
  // Use BatchSuggestRequest.newBuilder() to construct.
  private BatchSuggestRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private BatchSuggestRequest() {
    datasetName_ = "";
    inputs_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.visma.asgt.v2.SuggesterServiceProto.internal_static_asgt_v2_BatchSuggestRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.visma.asgt.v2.SuggesterServiceProto.internal_static_asgt_v2_BatchSuggestRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.visma.asgt.v2.BatchSuggestRequest.class, ai.visma.asgt.v2.BatchSuggestRequest.Builder.class);
  }

  private int bitField0_;
  public static final int DATASET_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object datasetName_ = "";
  /**
   * <pre>
   * Name of the dataset to make prediction against
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
   * Name of the dataset to make prediction against
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

  public static final int INPUTS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<ai.visma.asgt.v2.type.Data> inputs_;
  /**
   * <pre>
   * Input data to use for prediction
   * </pre>
   *
   * <code>repeated .asgt.v2.type.Data inputs = 2 [json_name = "inputs"];</code>
   */
  @java.lang.Override
  public java.util.List<ai.visma.asgt.v2.type.Data> getInputsList() {
    return inputs_;
  }
  /**
   * <pre>
   * Input data to use for prediction
   * </pre>
   *
   * <code>repeated .asgt.v2.type.Data inputs = 2 [json_name = "inputs"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends ai.visma.asgt.v2.type.DataOrBuilder> 
      getInputsOrBuilderList() {
    return inputs_;
  }
  /**
   * <pre>
   * Input data to use for prediction
   * </pre>
   *
   * <code>repeated .asgt.v2.type.Data inputs = 2 [json_name = "inputs"];</code>
   */
  @java.lang.Override
  public int getInputsCount() {
    return inputs_.size();
  }
  /**
   * <pre>
   * Input data to use for prediction
   * </pre>
   *
   * <code>repeated .asgt.v2.type.Data inputs = 2 [json_name = "inputs"];</code>
   */
  @java.lang.Override
  public ai.visma.asgt.v2.type.Data getInputs(int index) {
    return inputs_.get(index);
  }
  /**
   * <pre>
   * Input data to use for prediction
   * </pre>
   *
   * <code>repeated .asgt.v2.type.Data inputs = 2 [json_name = "inputs"];</code>
   */
  @java.lang.Override
  public ai.visma.asgt.v2.type.DataOrBuilder getInputsOrBuilder(
      int index) {
    return inputs_.get(index);
  }

  public static final int OPTIONS_FIELD_NUMBER = 3;
  private ai.visma.asgt.v2.SuggestOptions options_;
  /**
   * <code>.asgt.v2.SuggestOptions options = 3 [json_name = "options"];</code>
   * @return Whether the options field is set.
   */
  @java.lang.Override
  public boolean hasOptions() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.asgt.v2.SuggestOptions options = 3 [json_name = "options"];</code>
   * @return The options.
   */
  @java.lang.Override
  public ai.visma.asgt.v2.SuggestOptions getOptions() {
    return options_ == null ? ai.visma.asgt.v2.SuggestOptions.getDefaultInstance() : options_;
  }
  /**
   * <code>.asgt.v2.SuggestOptions options = 3 [json_name = "options"];</code>
   */
  @java.lang.Override
  public ai.visma.asgt.v2.SuggestOptionsOrBuilder getOptionsOrBuilder() {
    return options_ == null ? ai.visma.asgt.v2.SuggestOptions.getDefaultInstance() : options_;
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
    for (int i = 0; i < inputs_.size(); i++) {
      output.writeMessage(2, inputs_.get(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getOptions());
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
    for (int i = 0; i < inputs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, inputs_.get(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getOptions());
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
    if (!(obj instanceof ai.visma.asgt.v2.BatchSuggestRequest)) {
      return super.equals(obj);
    }
    ai.visma.asgt.v2.BatchSuggestRequest other = (ai.visma.asgt.v2.BatchSuggestRequest) obj;

    if (!getDatasetName()
        .equals(other.getDatasetName())) return false;
    if (!getInputsList()
        .equals(other.getInputsList())) return false;
    if (hasOptions() != other.hasOptions()) return false;
    if (hasOptions()) {
      if (!getOptions()
          .equals(other.getOptions())) return false;
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
    if (getInputsCount() > 0) {
      hash = (37 * hash) + INPUTS_FIELD_NUMBER;
      hash = (53 * hash) + getInputsList().hashCode();
    }
    if (hasOptions()) {
      hash = (37 * hash) + OPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getOptions().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.visma.asgt.v2.BatchSuggestRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.asgt.v2.BatchSuggestRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.asgt.v2.BatchSuggestRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.asgt.v2.BatchSuggestRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.asgt.v2.BatchSuggestRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.asgt.v2.BatchSuggestRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.asgt.v2.BatchSuggestRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.visma.asgt.v2.BatchSuggestRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.visma.asgt.v2.BatchSuggestRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.visma.asgt.v2.BatchSuggestRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.visma.asgt.v2.BatchSuggestRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.visma.asgt.v2.BatchSuggestRequest parseFrom(
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
  public static Builder newBuilder(ai.visma.asgt.v2.BatchSuggestRequest prototype) {
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
   * Protobuf type {@code asgt.v2.BatchSuggestRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:asgt.v2.BatchSuggestRequest)
      ai.visma.asgt.v2.BatchSuggestRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.visma.asgt.v2.SuggesterServiceProto.internal_static_asgt_v2_BatchSuggestRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.visma.asgt.v2.SuggesterServiceProto.internal_static_asgt_v2_BatchSuggestRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.visma.asgt.v2.BatchSuggestRequest.class, ai.visma.asgt.v2.BatchSuggestRequest.Builder.class);
    }

    // Construct using ai.visma.asgt.v2.BatchSuggestRequest.newBuilder()
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
        getInputsFieldBuilder();
        getOptionsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      datasetName_ = "";
      if (inputsBuilder_ == null) {
        inputs_ = java.util.Collections.emptyList();
      } else {
        inputs_ = null;
        inputsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      options_ = null;
      if (optionsBuilder_ != null) {
        optionsBuilder_.dispose();
        optionsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.visma.asgt.v2.SuggesterServiceProto.internal_static_asgt_v2_BatchSuggestRequest_descriptor;
    }

    @java.lang.Override
    public ai.visma.asgt.v2.BatchSuggestRequest getDefaultInstanceForType() {
      return ai.visma.asgt.v2.BatchSuggestRequest.getDefaultInstance();
    }

    @java.lang.Override
    public ai.visma.asgt.v2.BatchSuggestRequest build() {
      ai.visma.asgt.v2.BatchSuggestRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.visma.asgt.v2.BatchSuggestRequest buildPartial() {
      ai.visma.asgt.v2.BatchSuggestRequest result = new ai.visma.asgt.v2.BatchSuggestRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(ai.visma.asgt.v2.BatchSuggestRequest result) {
      if (inputsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          inputs_ = java.util.Collections.unmodifiableList(inputs_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.inputs_ = inputs_;
      } else {
        result.inputs_ = inputsBuilder_.build();
      }
    }

    private void buildPartial0(ai.visma.asgt.v2.BatchSuggestRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.datasetName_ = datasetName_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.options_ = optionsBuilder_ == null
            ? options_
            : optionsBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ai.visma.asgt.v2.BatchSuggestRequest) {
        return mergeFrom((ai.visma.asgt.v2.BatchSuggestRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.visma.asgt.v2.BatchSuggestRequest other) {
      if (other == ai.visma.asgt.v2.BatchSuggestRequest.getDefaultInstance()) return this;
      if (!other.getDatasetName().isEmpty()) {
        datasetName_ = other.datasetName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (inputsBuilder_ == null) {
        if (!other.inputs_.isEmpty()) {
          if (inputs_.isEmpty()) {
            inputs_ = other.inputs_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureInputsIsMutable();
            inputs_.addAll(other.inputs_);
          }
          onChanged();
        }
      } else {
        if (!other.inputs_.isEmpty()) {
          if (inputsBuilder_.isEmpty()) {
            inputsBuilder_.dispose();
            inputsBuilder_ = null;
            inputs_ = other.inputs_;
            bitField0_ = (bitField0_ & ~0x00000002);
            inputsBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getInputsFieldBuilder() : null;
          } else {
            inputsBuilder_.addAllMessages(other.inputs_);
          }
        }
      }
      if (other.hasOptions()) {
        mergeOptions(other.getOptions());
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
              ai.visma.asgt.v2.type.Data m =
                  input.readMessage(
                      ai.visma.asgt.v2.type.Data.parser(),
                      extensionRegistry);
              if (inputsBuilder_ == null) {
                ensureInputsIsMutable();
                inputs_.add(m);
              } else {
                inputsBuilder_.addMessage(m);
              }
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getOptionsFieldBuilder().getBuilder(),
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
     * Name of the dataset to make prediction against
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
     * Name of the dataset to make prediction against
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
     * Name of the dataset to make prediction against
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
     * Name of the dataset to make prediction against
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
     * Name of the dataset to make prediction against
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

    private java.util.List<ai.visma.asgt.v2.type.Data> inputs_ =
      java.util.Collections.emptyList();
    private void ensureInputsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        inputs_ = new java.util.ArrayList<ai.visma.asgt.v2.type.Data>(inputs_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        ai.visma.asgt.v2.type.Data, ai.visma.asgt.v2.type.Data.Builder, ai.visma.asgt.v2.type.DataOrBuilder> inputsBuilder_;

    /**
     * <pre>
     * Input data to use for prediction
     * </pre>
     *
     * <code>repeated .asgt.v2.type.Data inputs = 2 [json_name = "inputs"];</code>
     */
    public java.util.List<ai.visma.asgt.v2.type.Data> getInputsList() {
      if (inputsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(inputs_);
      } else {
        return inputsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Input data to use for prediction
     * </pre>
     *
     * <code>repeated .asgt.v2.type.Data inputs = 2 [json_name = "inputs"];</code>
     */
    public int getInputsCount() {
      if (inputsBuilder_ == null) {
        return inputs_.size();
      } else {
        return inputsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Input data to use for prediction
     * </pre>
     *
     * <code>repeated .asgt.v2.type.Data inputs = 2 [json_name = "inputs"];</code>
     */
    public ai.visma.asgt.v2.type.Data getInputs(int index) {
      if (inputsBuilder_ == null) {
        return inputs_.get(index);
      } else {
        return inputsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Input data to use for prediction
     * </pre>
     *
     * <code>repeated .asgt.v2.type.Data inputs = 2 [json_name = "inputs"];</code>
     */
    public Builder setInputs(
        int index, ai.visma.asgt.v2.type.Data value) {
      if (inputsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInputsIsMutable();
        inputs_.set(index, value);
        onChanged();
      } else {
        inputsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Input data to use for prediction
     * </pre>
     *
     * <code>repeated .asgt.v2.type.Data inputs = 2 [json_name = "inputs"];</code>
     */
    public Builder setInputs(
        int index, ai.visma.asgt.v2.type.Data.Builder builderForValue) {
      if (inputsBuilder_ == null) {
        ensureInputsIsMutable();
        inputs_.set(index, builderForValue.build());
        onChanged();
      } else {
        inputsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Input data to use for prediction
     * </pre>
     *
     * <code>repeated .asgt.v2.type.Data inputs = 2 [json_name = "inputs"];</code>
     */
    public Builder addInputs(ai.visma.asgt.v2.type.Data value) {
      if (inputsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInputsIsMutable();
        inputs_.add(value);
        onChanged();
      } else {
        inputsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Input data to use for prediction
     * </pre>
     *
     * <code>repeated .asgt.v2.type.Data inputs = 2 [json_name = "inputs"];</code>
     */
    public Builder addInputs(
        int index, ai.visma.asgt.v2.type.Data value) {
      if (inputsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInputsIsMutable();
        inputs_.add(index, value);
        onChanged();
      } else {
        inputsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Input data to use for prediction
     * </pre>
     *
     * <code>repeated .asgt.v2.type.Data inputs = 2 [json_name = "inputs"];</code>
     */
    public Builder addInputs(
        ai.visma.asgt.v2.type.Data.Builder builderForValue) {
      if (inputsBuilder_ == null) {
        ensureInputsIsMutable();
        inputs_.add(builderForValue.build());
        onChanged();
      } else {
        inputsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Input data to use for prediction
     * </pre>
     *
     * <code>repeated .asgt.v2.type.Data inputs = 2 [json_name = "inputs"];</code>
     */
    public Builder addInputs(
        int index, ai.visma.asgt.v2.type.Data.Builder builderForValue) {
      if (inputsBuilder_ == null) {
        ensureInputsIsMutable();
        inputs_.add(index, builderForValue.build());
        onChanged();
      } else {
        inputsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Input data to use for prediction
     * </pre>
     *
     * <code>repeated .asgt.v2.type.Data inputs = 2 [json_name = "inputs"];</code>
     */
    public Builder addAllInputs(
        java.lang.Iterable<? extends ai.visma.asgt.v2.type.Data> values) {
      if (inputsBuilder_ == null) {
        ensureInputsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, inputs_);
        onChanged();
      } else {
        inputsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Input data to use for prediction
     * </pre>
     *
     * <code>repeated .asgt.v2.type.Data inputs = 2 [json_name = "inputs"];</code>
     */
    public Builder clearInputs() {
      if (inputsBuilder_ == null) {
        inputs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        inputsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Input data to use for prediction
     * </pre>
     *
     * <code>repeated .asgt.v2.type.Data inputs = 2 [json_name = "inputs"];</code>
     */
    public Builder removeInputs(int index) {
      if (inputsBuilder_ == null) {
        ensureInputsIsMutable();
        inputs_.remove(index);
        onChanged();
      } else {
        inputsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Input data to use for prediction
     * </pre>
     *
     * <code>repeated .asgt.v2.type.Data inputs = 2 [json_name = "inputs"];</code>
     */
    public ai.visma.asgt.v2.type.Data.Builder getInputsBuilder(
        int index) {
      return getInputsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Input data to use for prediction
     * </pre>
     *
     * <code>repeated .asgt.v2.type.Data inputs = 2 [json_name = "inputs"];</code>
     */
    public ai.visma.asgt.v2.type.DataOrBuilder getInputsOrBuilder(
        int index) {
      if (inputsBuilder_ == null) {
        return inputs_.get(index);  } else {
        return inputsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Input data to use for prediction
     * </pre>
     *
     * <code>repeated .asgt.v2.type.Data inputs = 2 [json_name = "inputs"];</code>
     */
    public java.util.List<? extends ai.visma.asgt.v2.type.DataOrBuilder> 
         getInputsOrBuilderList() {
      if (inputsBuilder_ != null) {
        return inputsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(inputs_);
      }
    }
    /**
     * <pre>
     * Input data to use for prediction
     * </pre>
     *
     * <code>repeated .asgt.v2.type.Data inputs = 2 [json_name = "inputs"];</code>
     */
    public ai.visma.asgt.v2.type.Data.Builder addInputsBuilder() {
      return getInputsFieldBuilder().addBuilder(
          ai.visma.asgt.v2.type.Data.getDefaultInstance());
    }
    /**
     * <pre>
     * Input data to use for prediction
     * </pre>
     *
     * <code>repeated .asgt.v2.type.Data inputs = 2 [json_name = "inputs"];</code>
     */
    public ai.visma.asgt.v2.type.Data.Builder addInputsBuilder(
        int index) {
      return getInputsFieldBuilder().addBuilder(
          index, ai.visma.asgt.v2.type.Data.getDefaultInstance());
    }
    /**
     * <pre>
     * Input data to use for prediction
     * </pre>
     *
     * <code>repeated .asgt.v2.type.Data inputs = 2 [json_name = "inputs"];</code>
     */
    public java.util.List<ai.visma.asgt.v2.type.Data.Builder> 
         getInputsBuilderList() {
      return getInputsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        ai.visma.asgt.v2.type.Data, ai.visma.asgt.v2.type.Data.Builder, ai.visma.asgt.v2.type.DataOrBuilder> 
        getInputsFieldBuilder() {
      if (inputsBuilder_ == null) {
        inputsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            ai.visma.asgt.v2.type.Data, ai.visma.asgt.v2.type.Data.Builder, ai.visma.asgt.v2.type.DataOrBuilder>(
                inputs_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        inputs_ = null;
      }
      return inputsBuilder_;
    }

    private ai.visma.asgt.v2.SuggestOptions options_;
    private com.google.protobuf.SingleFieldBuilder<
        ai.visma.asgt.v2.SuggestOptions, ai.visma.asgt.v2.SuggestOptions.Builder, ai.visma.asgt.v2.SuggestOptionsOrBuilder> optionsBuilder_;
    /**
     * <code>.asgt.v2.SuggestOptions options = 3 [json_name = "options"];</code>
     * @return Whether the options field is set.
     */
    public boolean hasOptions() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.asgt.v2.SuggestOptions options = 3 [json_name = "options"];</code>
     * @return The options.
     */
    public ai.visma.asgt.v2.SuggestOptions getOptions() {
      if (optionsBuilder_ == null) {
        return options_ == null ? ai.visma.asgt.v2.SuggestOptions.getDefaultInstance() : options_;
      } else {
        return optionsBuilder_.getMessage();
      }
    }
    /**
     * <code>.asgt.v2.SuggestOptions options = 3 [json_name = "options"];</code>
     */
    public Builder setOptions(ai.visma.asgt.v2.SuggestOptions value) {
      if (optionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        options_ = value;
      } else {
        optionsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.asgt.v2.SuggestOptions options = 3 [json_name = "options"];</code>
     */
    public Builder setOptions(
        ai.visma.asgt.v2.SuggestOptions.Builder builderForValue) {
      if (optionsBuilder_ == null) {
        options_ = builderForValue.build();
      } else {
        optionsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.asgt.v2.SuggestOptions options = 3 [json_name = "options"];</code>
     */
    public Builder mergeOptions(ai.visma.asgt.v2.SuggestOptions value) {
      if (optionsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          options_ != null &&
          options_ != ai.visma.asgt.v2.SuggestOptions.getDefaultInstance()) {
          getOptionsBuilder().mergeFrom(value);
        } else {
          options_ = value;
        }
      } else {
        optionsBuilder_.mergeFrom(value);
      }
      if (options_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.asgt.v2.SuggestOptions options = 3 [json_name = "options"];</code>
     */
    public Builder clearOptions() {
      bitField0_ = (bitField0_ & ~0x00000004);
      options_ = null;
      if (optionsBuilder_ != null) {
        optionsBuilder_.dispose();
        optionsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.asgt.v2.SuggestOptions options = 3 [json_name = "options"];</code>
     */
    public ai.visma.asgt.v2.SuggestOptions.Builder getOptionsBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getOptionsFieldBuilder().getBuilder();
    }
    /**
     * <code>.asgt.v2.SuggestOptions options = 3 [json_name = "options"];</code>
     */
    public ai.visma.asgt.v2.SuggestOptionsOrBuilder getOptionsOrBuilder() {
      if (optionsBuilder_ != null) {
        return optionsBuilder_.getMessageOrBuilder();
      } else {
        return options_ == null ?
            ai.visma.asgt.v2.SuggestOptions.getDefaultInstance() : options_;
      }
    }
    /**
     * <code>.asgt.v2.SuggestOptions options = 3 [json_name = "options"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        ai.visma.asgt.v2.SuggestOptions, ai.visma.asgt.v2.SuggestOptions.Builder, ai.visma.asgt.v2.SuggestOptionsOrBuilder> 
        getOptionsFieldBuilder() {
      if (optionsBuilder_ == null) {
        optionsBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            ai.visma.asgt.v2.SuggestOptions, ai.visma.asgt.v2.SuggestOptions.Builder, ai.visma.asgt.v2.SuggestOptionsOrBuilder>(
                getOptions(),
                getParentForChildren(),
                isClean());
        options_ = null;
      }
      return optionsBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:asgt.v2.BatchSuggestRequest)
  }

  // @@protoc_insertion_point(class_scope:asgt.v2.BatchSuggestRequest)
  private static final ai.visma.asgt.v2.BatchSuggestRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.visma.asgt.v2.BatchSuggestRequest();
  }

  public static ai.visma.asgt.v2.BatchSuggestRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchSuggestRequest>
      PARSER = new com.google.protobuf.AbstractParser<BatchSuggestRequest>() {
    @java.lang.Override
    public BatchSuggestRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<BatchSuggestRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchSuggestRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.visma.asgt.v2.BatchSuggestRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

