// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ssn/type/candidate.proto

package ai.visma.ssn.type;

/**
 * Protobuf type {@code ssn.type.VatDistributionCandidate}
 */
public final class VatDistributionCandidate extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ssn.type.VatDistributionCandidate)
    VatDistributionCandidateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VatDistributionCandidate.newBuilder() to construct.
  private VatDistributionCandidate(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VatDistributionCandidate() {
    percentage_ = "";
    amount_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VatDistributionCandidate();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.visma.ssn.type.CandidateProto.internal_static_ssn_type_VatDistributionCandidate_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.visma.ssn.type.CandidateProto.internal_static_ssn_type_VatDistributionCandidate_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.visma.ssn.type.VatDistributionCandidate.class, ai.visma.ssn.type.VatDistributionCandidate.Builder.class);
  }

  public static final int PERCENTAGE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object percentage_ = "";
  /**
   * <pre>
   * The vat distribution candidate percentage
   * </pre>
   *
   * <code>string percentage = 1 [json_name = "percentage"];</code>
   * @return The percentage.
   */
  @java.lang.Override
  public java.lang.String getPercentage() {
    java.lang.Object ref = percentage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      percentage_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The vat distribution candidate percentage
   * </pre>
   *
   * <code>string percentage = 1 [json_name = "percentage"];</code>
   * @return The bytes for percentage.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPercentageBytes() {
    java.lang.Object ref = percentage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      percentage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AMOUNT_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object amount_ = "";
  /**
   * <pre>
   * The vat distribution candidate amount
   * </pre>
   *
   * <code>string amount = 2 [json_name = "amount"];</code>
   * @return The amount.
   */
  @java.lang.Override
  public java.lang.String getAmount() {
    java.lang.Object ref = amount_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      amount_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The vat distribution candidate amount
   * </pre>
   *
   * <code>string amount = 2 [json_name = "amount"];</code>
   * @return The bytes for amount.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAmountBytes() {
    java.lang.Object ref = amount_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      amount_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MODEL_METADATA_FIELD_NUMBER = 3;
  private ai.visma.ssn.type.ModelSpec modelMetadata_;
  /**
   * <pre>
   * Model metadata
   * </pre>
   *
   * <code>.ssn.type.ModelSpec model_metadata = 3 [json_name = "modelMetadata"];</code>
   * @return Whether the modelMetadata field is set.
   */
  @java.lang.Override
  public boolean hasModelMetadata() {
    return modelMetadata_ != null;
  }
  /**
   * <pre>
   * Model metadata
   * </pre>
   *
   * <code>.ssn.type.ModelSpec model_metadata = 3 [json_name = "modelMetadata"];</code>
   * @return The modelMetadata.
   */
  @java.lang.Override
  public ai.visma.ssn.type.ModelSpec getModelMetadata() {
    return modelMetadata_ == null ? ai.visma.ssn.type.ModelSpec.getDefaultInstance() : modelMetadata_;
  }
  /**
   * <pre>
   * Model metadata
   * </pre>
   *
   * <code>.ssn.type.ModelSpec model_metadata = 3 [json_name = "modelMetadata"];</code>
   */
  @java.lang.Override
  public ai.visma.ssn.type.ModelSpecOrBuilder getModelMetadataOrBuilder() {
    return modelMetadata_ == null ? ai.visma.ssn.type.ModelSpec.getDefaultInstance() : modelMetadata_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(percentage_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, percentage_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(amount_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, amount_);
    }
    if (modelMetadata_ != null) {
      output.writeMessage(3, getModelMetadata());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(percentage_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, percentage_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(amount_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, amount_);
    }
    if (modelMetadata_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getModelMetadata());
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
    if (!(obj instanceof ai.visma.ssn.type.VatDistributionCandidate)) {
      return super.equals(obj);
    }
    ai.visma.ssn.type.VatDistributionCandidate other = (ai.visma.ssn.type.VatDistributionCandidate) obj;

    if (!getPercentage()
        .equals(other.getPercentage())) return false;
    if (!getAmount()
        .equals(other.getAmount())) return false;
    if (hasModelMetadata() != other.hasModelMetadata()) return false;
    if (hasModelMetadata()) {
      if (!getModelMetadata()
          .equals(other.getModelMetadata())) return false;
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
    hash = (37 * hash) + PERCENTAGE_FIELD_NUMBER;
    hash = (53 * hash) + getPercentage().hashCode();
    hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getAmount().hashCode();
    if (hasModelMetadata()) {
      hash = (37 * hash) + MODEL_METADATA_FIELD_NUMBER;
      hash = (53 * hash) + getModelMetadata().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.visma.ssn.type.VatDistributionCandidate parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.ssn.type.VatDistributionCandidate parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.ssn.type.VatDistributionCandidate parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.ssn.type.VatDistributionCandidate parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.ssn.type.VatDistributionCandidate parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.ssn.type.VatDistributionCandidate parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.ssn.type.VatDistributionCandidate parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.visma.ssn.type.VatDistributionCandidate parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.visma.ssn.type.VatDistributionCandidate parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.visma.ssn.type.VatDistributionCandidate parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.visma.ssn.type.VatDistributionCandidate parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.visma.ssn.type.VatDistributionCandidate parseFrom(
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
  public static Builder newBuilder(ai.visma.ssn.type.VatDistributionCandidate prototype) {
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
   * Protobuf type {@code ssn.type.VatDistributionCandidate}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ssn.type.VatDistributionCandidate)
      ai.visma.ssn.type.VatDistributionCandidateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.visma.ssn.type.CandidateProto.internal_static_ssn_type_VatDistributionCandidate_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.visma.ssn.type.CandidateProto.internal_static_ssn_type_VatDistributionCandidate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.visma.ssn.type.VatDistributionCandidate.class, ai.visma.ssn.type.VatDistributionCandidate.Builder.class);
    }

    // Construct using ai.visma.ssn.type.VatDistributionCandidate.newBuilder()
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
      percentage_ = "";
      amount_ = "";
      modelMetadata_ = null;
      if (modelMetadataBuilder_ != null) {
        modelMetadataBuilder_.dispose();
        modelMetadataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.visma.ssn.type.CandidateProto.internal_static_ssn_type_VatDistributionCandidate_descriptor;
    }

    @java.lang.Override
    public ai.visma.ssn.type.VatDistributionCandidate getDefaultInstanceForType() {
      return ai.visma.ssn.type.VatDistributionCandidate.getDefaultInstance();
    }

    @java.lang.Override
    public ai.visma.ssn.type.VatDistributionCandidate build() {
      ai.visma.ssn.type.VatDistributionCandidate result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.visma.ssn.type.VatDistributionCandidate buildPartial() {
      ai.visma.ssn.type.VatDistributionCandidate result = new ai.visma.ssn.type.VatDistributionCandidate(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.visma.ssn.type.VatDistributionCandidate result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.percentage_ = percentage_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.amount_ = amount_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.modelMetadata_ = modelMetadataBuilder_ == null
            ? modelMetadata_
            : modelMetadataBuilder_.build();
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
      if (other instanceof ai.visma.ssn.type.VatDistributionCandidate) {
        return mergeFrom((ai.visma.ssn.type.VatDistributionCandidate)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.visma.ssn.type.VatDistributionCandidate other) {
      if (other == ai.visma.ssn.type.VatDistributionCandidate.getDefaultInstance()) return this;
      if (!other.getPercentage().isEmpty()) {
        percentage_ = other.percentage_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getAmount().isEmpty()) {
        amount_ = other.amount_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasModelMetadata()) {
        mergeModelMetadata(other.getModelMetadata());
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
              percentage_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              amount_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getModelMetadataFieldBuilder().getBuilder(),
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

    private java.lang.Object percentage_ = "";
    /**
     * <pre>
     * The vat distribution candidate percentage
     * </pre>
     *
     * <code>string percentage = 1 [json_name = "percentage"];</code>
     * @return The percentage.
     */
    public java.lang.String getPercentage() {
      java.lang.Object ref = percentage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        percentage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The vat distribution candidate percentage
     * </pre>
     *
     * <code>string percentage = 1 [json_name = "percentage"];</code>
     * @return The bytes for percentage.
     */
    public com.google.protobuf.ByteString
        getPercentageBytes() {
      java.lang.Object ref = percentage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        percentage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The vat distribution candidate percentage
     * </pre>
     *
     * <code>string percentage = 1 [json_name = "percentage"];</code>
     * @param value The percentage to set.
     * @return This builder for chaining.
     */
    public Builder setPercentage(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      percentage_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The vat distribution candidate percentage
     * </pre>
     *
     * <code>string percentage = 1 [json_name = "percentage"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPercentage() {
      percentage_ = getDefaultInstance().getPercentage();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The vat distribution candidate percentage
     * </pre>
     *
     * <code>string percentage = 1 [json_name = "percentage"];</code>
     * @param value The bytes for percentage to set.
     * @return This builder for chaining.
     */
    public Builder setPercentageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      percentage_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object amount_ = "";
    /**
     * <pre>
     * The vat distribution candidate amount
     * </pre>
     *
     * <code>string amount = 2 [json_name = "amount"];</code>
     * @return The amount.
     */
    public java.lang.String getAmount() {
      java.lang.Object ref = amount_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        amount_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The vat distribution candidate amount
     * </pre>
     *
     * <code>string amount = 2 [json_name = "amount"];</code>
     * @return The bytes for amount.
     */
    public com.google.protobuf.ByteString
        getAmountBytes() {
      java.lang.Object ref = amount_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        amount_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The vat distribution candidate amount
     * </pre>
     *
     * <code>string amount = 2 [json_name = "amount"];</code>
     * @param value The amount to set.
     * @return This builder for chaining.
     */
    public Builder setAmount(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      amount_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The vat distribution candidate amount
     * </pre>
     *
     * <code>string amount = 2 [json_name = "amount"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAmount() {
      amount_ = getDefaultInstance().getAmount();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The vat distribution candidate amount
     * </pre>
     *
     * <code>string amount = 2 [json_name = "amount"];</code>
     * @param value The bytes for amount to set.
     * @return This builder for chaining.
     */
    public Builder setAmountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      amount_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private ai.visma.ssn.type.ModelSpec modelMetadata_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.visma.ssn.type.ModelSpec, ai.visma.ssn.type.ModelSpec.Builder, ai.visma.ssn.type.ModelSpecOrBuilder> modelMetadataBuilder_;
    /**
     * <pre>
     * Model metadata
     * </pre>
     *
     * <code>.ssn.type.ModelSpec model_metadata = 3 [json_name = "modelMetadata"];</code>
     * @return Whether the modelMetadata field is set.
     */
    public boolean hasModelMetadata() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Model metadata
     * </pre>
     *
     * <code>.ssn.type.ModelSpec model_metadata = 3 [json_name = "modelMetadata"];</code>
     * @return The modelMetadata.
     */
    public ai.visma.ssn.type.ModelSpec getModelMetadata() {
      if (modelMetadataBuilder_ == null) {
        return modelMetadata_ == null ? ai.visma.ssn.type.ModelSpec.getDefaultInstance() : modelMetadata_;
      } else {
        return modelMetadataBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Model metadata
     * </pre>
     *
     * <code>.ssn.type.ModelSpec model_metadata = 3 [json_name = "modelMetadata"];</code>
     */
    public Builder setModelMetadata(ai.visma.ssn.type.ModelSpec value) {
      if (modelMetadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        modelMetadata_ = value;
      } else {
        modelMetadataBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Model metadata
     * </pre>
     *
     * <code>.ssn.type.ModelSpec model_metadata = 3 [json_name = "modelMetadata"];</code>
     */
    public Builder setModelMetadata(
        ai.visma.ssn.type.ModelSpec.Builder builderForValue) {
      if (modelMetadataBuilder_ == null) {
        modelMetadata_ = builderForValue.build();
      } else {
        modelMetadataBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Model metadata
     * </pre>
     *
     * <code>.ssn.type.ModelSpec model_metadata = 3 [json_name = "modelMetadata"];</code>
     */
    public Builder mergeModelMetadata(ai.visma.ssn.type.ModelSpec value) {
      if (modelMetadataBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          modelMetadata_ != null &&
          modelMetadata_ != ai.visma.ssn.type.ModelSpec.getDefaultInstance()) {
          getModelMetadataBuilder().mergeFrom(value);
        } else {
          modelMetadata_ = value;
        }
      } else {
        modelMetadataBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Model metadata
     * </pre>
     *
     * <code>.ssn.type.ModelSpec model_metadata = 3 [json_name = "modelMetadata"];</code>
     */
    public Builder clearModelMetadata() {
      bitField0_ = (bitField0_ & ~0x00000004);
      modelMetadata_ = null;
      if (modelMetadataBuilder_ != null) {
        modelMetadataBuilder_.dispose();
        modelMetadataBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Model metadata
     * </pre>
     *
     * <code>.ssn.type.ModelSpec model_metadata = 3 [json_name = "modelMetadata"];</code>
     */
    public ai.visma.ssn.type.ModelSpec.Builder getModelMetadataBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getModelMetadataFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Model metadata
     * </pre>
     *
     * <code>.ssn.type.ModelSpec model_metadata = 3 [json_name = "modelMetadata"];</code>
     */
    public ai.visma.ssn.type.ModelSpecOrBuilder getModelMetadataOrBuilder() {
      if (modelMetadataBuilder_ != null) {
        return modelMetadataBuilder_.getMessageOrBuilder();
      } else {
        return modelMetadata_ == null ?
            ai.visma.ssn.type.ModelSpec.getDefaultInstance() : modelMetadata_;
      }
    }
    /**
     * <pre>
     * Model metadata
     * </pre>
     *
     * <code>.ssn.type.ModelSpec model_metadata = 3 [json_name = "modelMetadata"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.visma.ssn.type.ModelSpec, ai.visma.ssn.type.ModelSpec.Builder, ai.visma.ssn.type.ModelSpecOrBuilder> 
        getModelMetadataFieldBuilder() {
      if (modelMetadataBuilder_ == null) {
        modelMetadataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.visma.ssn.type.ModelSpec, ai.visma.ssn.type.ModelSpec.Builder, ai.visma.ssn.type.ModelSpecOrBuilder>(
                getModelMetadata(),
                getParentForChildren(),
                isClean());
        modelMetadata_ = null;
      }
      return modelMetadataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ssn.type.VatDistributionCandidate)
  }

  // @@protoc_insertion_point(class_scope:ssn.type.VatDistributionCandidate)
  private static final ai.visma.ssn.type.VatDistributionCandidate DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.visma.ssn.type.VatDistributionCandidate();
  }

  public static ai.visma.ssn.type.VatDistributionCandidate getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VatDistributionCandidate>
      PARSER = new com.google.protobuf.AbstractParser<VatDistributionCandidate>() {
    @java.lang.Override
    public VatDistributionCandidate parsePartialFrom(
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

  public static com.google.protobuf.Parser<VatDistributionCandidate> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VatDistributionCandidate> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.visma.ssn.type.VatDistributionCandidate getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

