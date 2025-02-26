// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: ssn/type/candidate.proto
// Protobuf Java Version: 4.29.3

package ai.visma.ssn.type;

/**
 * Protobuf type {@code ssn.type.PageText}
 */
public final class PageText extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:ssn.type.PageText)
    PageTextOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      PageText.class.getName());
  }
  // Use PageText.newBuilder() to construct.
  private PageText(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private PageText() {
    text_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.visma.ssn.type.CandidateProto.internal_static_ssn_type_PageText_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.visma.ssn.type.CandidateProto.internal_static_ssn_type_PageText_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.visma.ssn.type.PageText.class, ai.visma.ssn.type.PageText.Builder.class);
  }

  public static final int PAGE_REF_FIELD_NUMBER = 1;
  private int pageRef_ = 0;
  /**
   * <pre>
   * A reference to the page where the text was found.
   * </pre>
   *
   * <code>uint32 page_ref = 1 [json_name = "pageRef"];</code>
   * @return The pageRef.
   */
  @java.lang.Override
  public int getPageRef() {
    return pageRef_;
  }

  public static final int TEXT_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object text_ = "";
  /**
   * <pre>
   * The text content of the page
   * </pre>
   *
   * <code>string text = 2 [json_name = "text"];</code>
   * @return The text.
   */
  @java.lang.Override
  public java.lang.String getText() {
    java.lang.Object ref = text_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      text_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The text content of the page
   * </pre>
   *
   * <code>string text = 2 [json_name = "text"];</code>
   * @return The bytes for text.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTextBytes() {
    java.lang.Object ref = text_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      text_ = b;
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
    if (pageRef_ != 0) {
      output.writeUInt32(1, pageRef_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(text_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, text_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pageRef_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, pageRef_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(text_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, text_);
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
    if (!(obj instanceof ai.visma.ssn.type.PageText)) {
      return super.equals(obj);
    }
    ai.visma.ssn.type.PageText other = (ai.visma.ssn.type.PageText) obj;

    if (getPageRef()
        != other.getPageRef()) return false;
    if (!getText()
        .equals(other.getText())) return false;
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
    hash = (37 * hash) + PAGE_REF_FIELD_NUMBER;
    hash = (53 * hash) + getPageRef();
    hash = (37 * hash) + TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getText().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.visma.ssn.type.PageText parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.ssn.type.PageText parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.ssn.type.PageText parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.ssn.type.PageText parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.ssn.type.PageText parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.ssn.type.PageText parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.ssn.type.PageText parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.visma.ssn.type.PageText parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.visma.ssn.type.PageText parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.visma.ssn.type.PageText parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.visma.ssn.type.PageText parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.visma.ssn.type.PageText parseFrom(
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
  public static Builder newBuilder(ai.visma.ssn.type.PageText prototype) {
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
   * Protobuf type {@code ssn.type.PageText}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ssn.type.PageText)
      ai.visma.ssn.type.PageTextOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.visma.ssn.type.CandidateProto.internal_static_ssn_type_PageText_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.visma.ssn.type.CandidateProto.internal_static_ssn_type_PageText_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.visma.ssn.type.PageText.class, ai.visma.ssn.type.PageText.Builder.class);
    }

    // Construct using ai.visma.ssn.type.PageText.newBuilder()
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
      pageRef_ = 0;
      text_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.visma.ssn.type.CandidateProto.internal_static_ssn_type_PageText_descriptor;
    }

    @java.lang.Override
    public ai.visma.ssn.type.PageText getDefaultInstanceForType() {
      return ai.visma.ssn.type.PageText.getDefaultInstance();
    }

    @java.lang.Override
    public ai.visma.ssn.type.PageText build() {
      ai.visma.ssn.type.PageText result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.visma.ssn.type.PageText buildPartial() {
      ai.visma.ssn.type.PageText result = new ai.visma.ssn.type.PageText(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.visma.ssn.type.PageText result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.pageRef_ = pageRef_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.text_ = text_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ai.visma.ssn.type.PageText) {
        return mergeFrom((ai.visma.ssn.type.PageText)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.visma.ssn.type.PageText other) {
      if (other == ai.visma.ssn.type.PageText.getDefaultInstance()) return this;
      if (other.getPageRef() != 0) {
        setPageRef(other.getPageRef());
      }
      if (!other.getText().isEmpty()) {
        text_ = other.text_;
        bitField0_ |= 0x00000002;
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
            case 8: {
              pageRef_ = input.readUInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              text_ = input.readStringRequireUtf8();
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

    private int pageRef_ ;
    /**
     * <pre>
     * A reference to the page where the text was found.
     * </pre>
     *
     * <code>uint32 page_ref = 1 [json_name = "pageRef"];</code>
     * @return The pageRef.
     */
    @java.lang.Override
    public int getPageRef() {
      return pageRef_;
    }
    /**
     * <pre>
     * A reference to the page where the text was found.
     * </pre>
     *
     * <code>uint32 page_ref = 1 [json_name = "pageRef"];</code>
     * @param value The pageRef to set.
     * @return This builder for chaining.
     */
    public Builder setPageRef(int value) {

      pageRef_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A reference to the page where the text was found.
     * </pre>
     *
     * <code>uint32 page_ref = 1 [json_name = "pageRef"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPageRef() {
      bitField0_ = (bitField0_ & ~0x00000001);
      pageRef_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object text_ = "";
    /**
     * <pre>
     * The text content of the page
     * </pre>
     *
     * <code>string text = 2 [json_name = "text"];</code>
     * @return The text.
     */
    public java.lang.String getText() {
      java.lang.Object ref = text_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        text_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The text content of the page
     * </pre>
     *
     * <code>string text = 2 [json_name = "text"];</code>
     * @return The bytes for text.
     */
    public com.google.protobuf.ByteString
        getTextBytes() {
      java.lang.Object ref = text_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        text_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The text content of the page
     * </pre>
     *
     * <code>string text = 2 [json_name = "text"];</code>
     * @param value The text to set.
     * @return This builder for chaining.
     */
    public Builder setText(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      text_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The text content of the page
     * </pre>
     *
     * <code>string text = 2 [json_name = "text"];</code>
     * @return This builder for chaining.
     */
    public Builder clearText() {
      text_ = getDefaultInstance().getText();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The text content of the page
     * </pre>
     *
     * <code>string text = 2 [json_name = "text"];</code>
     * @param value The bytes for text to set.
     * @return This builder for chaining.
     */
    public Builder setTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      text_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:ssn.type.PageText)
  }

  // @@protoc_insertion_point(class_scope:ssn.type.PageText)
  private static final ai.visma.ssn.type.PageText DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.visma.ssn.type.PageText();
  }

  public static ai.visma.ssn.type.PageText getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PageText>
      PARSER = new com.google.protobuf.AbstractParser<PageText>() {
    @java.lang.Override
    public PageText parsePartialFrom(
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

  public static com.google.protobuf.Parser<PageText> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PageText> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.visma.ssn.type.PageText getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

