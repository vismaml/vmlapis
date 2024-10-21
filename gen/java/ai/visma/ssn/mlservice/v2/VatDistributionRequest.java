// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ssn/mlservice/v2/mlservice.proto

package ai.visma.ssn.mlservice.v2;

/**
 * Protobuf type {@code ssn.mlservice.v2.VatDistributionRequest}
 */
public final class VatDistributionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ssn.mlservice.v2.VatDistributionRequest)
    VatDistributionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VatDistributionRequest.newBuilder() to construct.
  private VatDistributionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VatDistributionRequest() {
    image_ = com.google.protobuf.ByteString.EMPTY;
    countryCode_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VatDistributionRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.visma.ssn.mlservice.v2.MlserviceProto.internal_static_ssn_mlservice_v2_VatDistributionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.visma.ssn.mlservice.v2.MlserviceProto.internal_static_ssn_mlservice_v2_VatDistributionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.visma.ssn.mlservice.v2.VatDistributionRequest.class, ai.visma.ssn.mlservice.v2.VatDistributionRequest.Builder.class);
  }

  public static final int TEXT_ANNOTATION_FIELD_NUMBER = 1;
  private ai.visma.ssn.type.TextAnnotation textAnnotation_;
  /**
   * <code>.ssn.type.TextAnnotation text_annotation = 1 [json_name = "textAnnotation"];</code>
   * @return Whether the textAnnotation field is set.
   */
  @java.lang.Override
  public boolean hasTextAnnotation() {
    return textAnnotation_ != null;
  }
  /**
   * <code>.ssn.type.TextAnnotation text_annotation = 1 [json_name = "textAnnotation"];</code>
   * @return The textAnnotation.
   */
  @java.lang.Override
  public ai.visma.ssn.type.TextAnnotation getTextAnnotation() {
    return textAnnotation_ == null ? ai.visma.ssn.type.TextAnnotation.getDefaultInstance() : textAnnotation_;
  }
  /**
   * <code>.ssn.type.TextAnnotation text_annotation = 1 [json_name = "textAnnotation"];</code>
   */
  @java.lang.Override
  public ai.visma.ssn.type.TextAnnotationOrBuilder getTextAnnotationOrBuilder() {
    return textAnnotation_ == null ? ai.visma.ssn.type.TextAnnotation.getDefaultInstance() : textAnnotation_;
  }

  public static final int IMAGE_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString image_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes image = 2 [json_name = "image"];</code>
   * @return The image.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getImage() {
    return image_;
  }

  public static final int COUNTRY_CODE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object countryCode_ = "";
  /**
   * <code>string country_code = 3 [json_name = "countryCode"];</code>
   * @return The countryCode.
   */
  @java.lang.Override
  public java.lang.String getCountryCode() {
    java.lang.Object ref = countryCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      countryCode_ = s;
      return s;
    }
  }
  /**
   * <code>string country_code = 3 [json_name = "countryCode"];</code>
   * @return The bytes for countryCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCountryCodeBytes() {
    java.lang.Object ref = countryCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      countryCode_ = b;
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
    if (textAnnotation_ != null) {
      output.writeMessage(1, getTextAnnotation());
    }
    if (!image_.isEmpty()) {
      output.writeBytes(2, image_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(countryCode_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, countryCode_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (textAnnotation_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTextAnnotation());
    }
    if (!image_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, image_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(countryCode_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, countryCode_);
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
    if (!(obj instanceof ai.visma.ssn.mlservice.v2.VatDistributionRequest)) {
      return super.equals(obj);
    }
    ai.visma.ssn.mlservice.v2.VatDistributionRequest other = (ai.visma.ssn.mlservice.v2.VatDistributionRequest) obj;

    if (hasTextAnnotation() != other.hasTextAnnotation()) return false;
    if (hasTextAnnotation()) {
      if (!getTextAnnotation()
          .equals(other.getTextAnnotation())) return false;
    }
    if (!getImage()
        .equals(other.getImage())) return false;
    if (!getCountryCode()
        .equals(other.getCountryCode())) return false;
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
    if (hasTextAnnotation()) {
      hash = (37 * hash) + TEXT_ANNOTATION_FIELD_NUMBER;
      hash = (53 * hash) + getTextAnnotation().hashCode();
    }
    hash = (37 * hash) + IMAGE_FIELD_NUMBER;
    hash = (53 * hash) + getImage().hashCode();
    hash = (37 * hash) + COUNTRY_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getCountryCode().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.visma.ssn.mlservice.v2.VatDistributionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.ssn.mlservice.v2.VatDistributionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.ssn.mlservice.v2.VatDistributionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.ssn.mlservice.v2.VatDistributionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.ssn.mlservice.v2.VatDistributionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.ssn.mlservice.v2.VatDistributionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.ssn.mlservice.v2.VatDistributionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.visma.ssn.mlservice.v2.VatDistributionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.visma.ssn.mlservice.v2.VatDistributionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.visma.ssn.mlservice.v2.VatDistributionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.visma.ssn.mlservice.v2.VatDistributionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.visma.ssn.mlservice.v2.VatDistributionRequest parseFrom(
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
  public static Builder newBuilder(ai.visma.ssn.mlservice.v2.VatDistributionRequest prototype) {
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
   * Protobuf type {@code ssn.mlservice.v2.VatDistributionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ssn.mlservice.v2.VatDistributionRequest)
      ai.visma.ssn.mlservice.v2.VatDistributionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.visma.ssn.mlservice.v2.MlserviceProto.internal_static_ssn_mlservice_v2_VatDistributionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.visma.ssn.mlservice.v2.MlserviceProto.internal_static_ssn_mlservice_v2_VatDistributionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.visma.ssn.mlservice.v2.VatDistributionRequest.class, ai.visma.ssn.mlservice.v2.VatDistributionRequest.Builder.class);
    }

    // Construct using ai.visma.ssn.mlservice.v2.VatDistributionRequest.newBuilder()
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
      textAnnotation_ = null;
      if (textAnnotationBuilder_ != null) {
        textAnnotationBuilder_.dispose();
        textAnnotationBuilder_ = null;
      }
      image_ = com.google.protobuf.ByteString.EMPTY;
      countryCode_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.visma.ssn.mlservice.v2.MlserviceProto.internal_static_ssn_mlservice_v2_VatDistributionRequest_descriptor;
    }

    @java.lang.Override
    public ai.visma.ssn.mlservice.v2.VatDistributionRequest getDefaultInstanceForType() {
      return ai.visma.ssn.mlservice.v2.VatDistributionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public ai.visma.ssn.mlservice.v2.VatDistributionRequest build() {
      ai.visma.ssn.mlservice.v2.VatDistributionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.visma.ssn.mlservice.v2.VatDistributionRequest buildPartial() {
      ai.visma.ssn.mlservice.v2.VatDistributionRequest result = new ai.visma.ssn.mlservice.v2.VatDistributionRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.visma.ssn.mlservice.v2.VatDistributionRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.textAnnotation_ = textAnnotationBuilder_ == null
            ? textAnnotation_
            : textAnnotationBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.image_ = image_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.countryCode_ = countryCode_;
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
      if (other instanceof ai.visma.ssn.mlservice.v2.VatDistributionRequest) {
        return mergeFrom((ai.visma.ssn.mlservice.v2.VatDistributionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.visma.ssn.mlservice.v2.VatDistributionRequest other) {
      if (other == ai.visma.ssn.mlservice.v2.VatDistributionRequest.getDefaultInstance()) return this;
      if (other.hasTextAnnotation()) {
        mergeTextAnnotation(other.getTextAnnotation());
      }
      if (other.getImage() != com.google.protobuf.ByteString.EMPTY) {
        setImage(other.getImage());
      }
      if (!other.getCountryCode().isEmpty()) {
        countryCode_ = other.countryCode_;
        bitField0_ |= 0x00000004;
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
              input.readMessage(
                  getTextAnnotationFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              image_ = input.readBytes();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              countryCode_ = input.readStringRequireUtf8();
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

    private ai.visma.ssn.type.TextAnnotation textAnnotation_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.visma.ssn.type.TextAnnotation, ai.visma.ssn.type.TextAnnotation.Builder, ai.visma.ssn.type.TextAnnotationOrBuilder> textAnnotationBuilder_;
    /**
     * <code>.ssn.type.TextAnnotation text_annotation = 1 [json_name = "textAnnotation"];</code>
     * @return Whether the textAnnotation field is set.
     */
    public boolean hasTextAnnotation() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.ssn.type.TextAnnotation text_annotation = 1 [json_name = "textAnnotation"];</code>
     * @return The textAnnotation.
     */
    public ai.visma.ssn.type.TextAnnotation getTextAnnotation() {
      if (textAnnotationBuilder_ == null) {
        return textAnnotation_ == null ? ai.visma.ssn.type.TextAnnotation.getDefaultInstance() : textAnnotation_;
      } else {
        return textAnnotationBuilder_.getMessage();
      }
    }
    /**
     * <code>.ssn.type.TextAnnotation text_annotation = 1 [json_name = "textAnnotation"];</code>
     */
    public Builder setTextAnnotation(ai.visma.ssn.type.TextAnnotation value) {
      if (textAnnotationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        textAnnotation_ = value;
      } else {
        textAnnotationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.ssn.type.TextAnnotation text_annotation = 1 [json_name = "textAnnotation"];</code>
     */
    public Builder setTextAnnotation(
        ai.visma.ssn.type.TextAnnotation.Builder builderForValue) {
      if (textAnnotationBuilder_ == null) {
        textAnnotation_ = builderForValue.build();
      } else {
        textAnnotationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.ssn.type.TextAnnotation text_annotation = 1 [json_name = "textAnnotation"];</code>
     */
    public Builder mergeTextAnnotation(ai.visma.ssn.type.TextAnnotation value) {
      if (textAnnotationBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          textAnnotation_ != null &&
          textAnnotation_ != ai.visma.ssn.type.TextAnnotation.getDefaultInstance()) {
          getTextAnnotationBuilder().mergeFrom(value);
        } else {
          textAnnotation_ = value;
        }
      } else {
        textAnnotationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.ssn.type.TextAnnotation text_annotation = 1 [json_name = "textAnnotation"];</code>
     */
    public Builder clearTextAnnotation() {
      bitField0_ = (bitField0_ & ~0x00000001);
      textAnnotation_ = null;
      if (textAnnotationBuilder_ != null) {
        textAnnotationBuilder_.dispose();
        textAnnotationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.ssn.type.TextAnnotation text_annotation = 1 [json_name = "textAnnotation"];</code>
     */
    public ai.visma.ssn.type.TextAnnotation.Builder getTextAnnotationBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTextAnnotationFieldBuilder().getBuilder();
    }
    /**
     * <code>.ssn.type.TextAnnotation text_annotation = 1 [json_name = "textAnnotation"];</code>
     */
    public ai.visma.ssn.type.TextAnnotationOrBuilder getTextAnnotationOrBuilder() {
      if (textAnnotationBuilder_ != null) {
        return textAnnotationBuilder_.getMessageOrBuilder();
      } else {
        return textAnnotation_ == null ?
            ai.visma.ssn.type.TextAnnotation.getDefaultInstance() : textAnnotation_;
      }
    }
    /**
     * <code>.ssn.type.TextAnnotation text_annotation = 1 [json_name = "textAnnotation"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.visma.ssn.type.TextAnnotation, ai.visma.ssn.type.TextAnnotation.Builder, ai.visma.ssn.type.TextAnnotationOrBuilder> 
        getTextAnnotationFieldBuilder() {
      if (textAnnotationBuilder_ == null) {
        textAnnotationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.visma.ssn.type.TextAnnotation, ai.visma.ssn.type.TextAnnotation.Builder, ai.visma.ssn.type.TextAnnotationOrBuilder>(
                getTextAnnotation(),
                getParentForChildren(),
                isClean());
        textAnnotation_ = null;
      }
      return textAnnotationBuilder_;
    }

    private com.google.protobuf.ByteString image_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes image = 2 [json_name = "image"];</code>
     * @return The image.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getImage() {
      return image_;
    }
    /**
     * <code>bytes image = 2 [json_name = "image"];</code>
     * @param value The image to set.
     * @return This builder for chaining.
     */
    public Builder setImage(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      image_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>bytes image = 2 [json_name = "image"];</code>
     * @return This builder for chaining.
     */
    public Builder clearImage() {
      bitField0_ = (bitField0_ & ~0x00000002);
      image_ = getDefaultInstance().getImage();
      onChanged();
      return this;
    }

    private java.lang.Object countryCode_ = "";
    /**
     * <code>string country_code = 3 [json_name = "countryCode"];</code>
     * @return The countryCode.
     */
    public java.lang.String getCountryCode() {
      java.lang.Object ref = countryCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        countryCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string country_code = 3 [json_name = "countryCode"];</code>
     * @return The bytes for countryCode.
     */
    public com.google.protobuf.ByteString
        getCountryCodeBytes() {
      java.lang.Object ref = countryCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        countryCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string country_code = 3 [json_name = "countryCode"];</code>
     * @param value The countryCode to set.
     * @return This builder for chaining.
     */
    public Builder setCountryCode(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      countryCode_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string country_code = 3 [json_name = "countryCode"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCountryCode() {
      countryCode_ = getDefaultInstance().getCountryCode();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string country_code = 3 [json_name = "countryCode"];</code>
     * @param value The bytes for countryCode to set.
     * @return This builder for chaining.
     */
    public Builder setCountryCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      countryCode_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:ssn.mlservice.v2.VatDistributionRequest)
  }

  // @@protoc_insertion_point(class_scope:ssn.mlservice.v2.VatDistributionRequest)
  private static final ai.visma.ssn.mlservice.v2.VatDistributionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.visma.ssn.mlservice.v2.VatDistributionRequest();
  }

  public static ai.visma.ssn.mlservice.v2.VatDistributionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VatDistributionRequest>
      PARSER = new com.google.protobuf.AbstractParser<VatDistributionRequest>() {
    @java.lang.Override
    public VatDistributionRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<VatDistributionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VatDistributionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.visma.ssn.mlservice.v2.VatDistributionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

