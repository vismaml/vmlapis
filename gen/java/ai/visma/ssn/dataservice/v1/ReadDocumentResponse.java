// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: ssn/dataservice/v1/dataservice.proto
// Protobuf Java Version: 4.29.3

package ai.visma.ssn.dataservice.v1;

/**
 * Protobuf type {@code ssn.dataservice.v1.ReadDocumentResponse}
 */
public final class ReadDocumentResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:ssn.dataservice.v1.ReadDocumentResponse)
    ReadDocumentResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      ReadDocumentResponse.class.getName());
  }
  // Use ReadDocumentResponse.newBuilder() to construct.
  private ReadDocumentResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ReadDocumentResponse() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.visma.ssn.dataservice.v1.DataserviceProto.internal_static_ssn_dataservice_v1_ReadDocumentResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.visma.ssn.dataservice.v1.DataserviceProto.internal_static_ssn_dataservice_v1_ReadDocumentResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.visma.ssn.dataservice.v1.ReadDocumentResponse.class, ai.visma.ssn.dataservice.v1.ReadDocumentResponse.Builder.class);
  }

  private int bitField0_;
  public static final int DOCUMENT_FIELD_NUMBER = 1;
  private ai.visma.ssn.dataservice.v1.Document document_;
  /**
   * <code>.ssn.dataservice.v1.Document document = 1 [json_name = "document"];</code>
   * @return Whether the document field is set.
   */
  @java.lang.Override
  public boolean hasDocument() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.ssn.dataservice.v1.Document document = 1 [json_name = "document"];</code>
   * @return The document.
   */
  @java.lang.Override
  public ai.visma.ssn.dataservice.v1.Document getDocument() {
    return document_ == null ? ai.visma.ssn.dataservice.v1.Document.getDefaultInstance() : document_;
  }
  /**
   * <code>.ssn.dataservice.v1.Document document = 1 [json_name = "document"];</code>
   */
  @java.lang.Override
  public ai.visma.ssn.dataservice.v1.DocumentOrBuilder getDocumentOrBuilder() {
    return document_ == null ? ai.visma.ssn.dataservice.v1.Document.getDefaultInstance() : document_;
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
      output.writeMessage(1, getDocument());
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
        .computeMessageSize(1, getDocument());
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
    if (!(obj instanceof ai.visma.ssn.dataservice.v1.ReadDocumentResponse)) {
      return super.equals(obj);
    }
    ai.visma.ssn.dataservice.v1.ReadDocumentResponse other = (ai.visma.ssn.dataservice.v1.ReadDocumentResponse) obj;

    if (hasDocument() != other.hasDocument()) return false;
    if (hasDocument()) {
      if (!getDocument()
          .equals(other.getDocument())) return false;
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
    if (hasDocument()) {
      hash = (37 * hash) + DOCUMENT_FIELD_NUMBER;
      hash = (53 * hash) + getDocument().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.visma.ssn.dataservice.v1.ReadDocumentResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.ssn.dataservice.v1.ReadDocumentResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.ssn.dataservice.v1.ReadDocumentResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.ssn.dataservice.v1.ReadDocumentResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.ssn.dataservice.v1.ReadDocumentResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.ssn.dataservice.v1.ReadDocumentResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.ssn.dataservice.v1.ReadDocumentResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.visma.ssn.dataservice.v1.ReadDocumentResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.visma.ssn.dataservice.v1.ReadDocumentResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.visma.ssn.dataservice.v1.ReadDocumentResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.visma.ssn.dataservice.v1.ReadDocumentResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.visma.ssn.dataservice.v1.ReadDocumentResponse parseFrom(
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
  public static Builder newBuilder(ai.visma.ssn.dataservice.v1.ReadDocumentResponse prototype) {
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
   * Protobuf type {@code ssn.dataservice.v1.ReadDocumentResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ssn.dataservice.v1.ReadDocumentResponse)
      ai.visma.ssn.dataservice.v1.ReadDocumentResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.visma.ssn.dataservice.v1.DataserviceProto.internal_static_ssn_dataservice_v1_ReadDocumentResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.visma.ssn.dataservice.v1.DataserviceProto.internal_static_ssn_dataservice_v1_ReadDocumentResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.visma.ssn.dataservice.v1.ReadDocumentResponse.class, ai.visma.ssn.dataservice.v1.ReadDocumentResponse.Builder.class);
    }

    // Construct using ai.visma.ssn.dataservice.v1.ReadDocumentResponse.newBuilder()
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
        getDocumentFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      document_ = null;
      if (documentBuilder_ != null) {
        documentBuilder_.dispose();
        documentBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.visma.ssn.dataservice.v1.DataserviceProto.internal_static_ssn_dataservice_v1_ReadDocumentResponse_descriptor;
    }

    @java.lang.Override
    public ai.visma.ssn.dataservice.v1.ReadDocumentResponse getDefaultInstanceForType() {
      return ai.visma.ssn.dataservice.v1.ReadDocumentResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ai.visma.ssn.dataservice.v1.ReadDocumentResponse build() {
      ai.visma.ssn.dataservice.v1.ReadDocumentResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.visma.ssn.dataservice.v1.ReadDocumentResponse buildPartial() {
      ai.visma.ssn.dataservice.v1.ReadDocumentResponse result = new ai.visma.ssn.dataservice.v1.ReadDocumentResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.visma.ssn.dataservice.v1.ReadDocumentResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.document_ = documentBuilder_ == null
            ? document_
            : documentBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ai.visma.ssn.dataservice.v1.ReadDocumentResponse) {
        return mergeFrom((ai.visma.ssn.dataservice.v1.ReadDocumentResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.visma.ssn.dataservice.v1.ReadDocumentResponse other) {
      if (other == ai.visma.ssn.dataservice.v1.ReadDocumentResponse.getDefaultInstance()) return this;
      if (other.hasDocument()) {
        mergeDocument(other.getDocument());
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
                  getDocumentFieldBuilder().getBuilder(),
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

    private ai.visma.ssn.dataservice.v1.Document document_;
    private com.google.protobuf.SingleFieldBuilder<
        ai.visma.ssn.dataservice.v1.Document, ai.visma.ssn.dataservice.v1.Document.Builder, ai.visma.ssn.dataservice.v1.DocumentOrBuilder> documentBuilder_;
    /**
     * <code>.ssn.dataservice.v1.Document document = 1 [json_name = "document"];</code>
     * @return Whether the document field is set.
     */
    public boolean hasDocument() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.ssn.dataservice.v1.Document document = 1 [json_name = "document"];</code>
     * @return The document.
     */
    public ai.visma.ssn.dataservice.v1.Document getDocument() {
      if (documentBuilder_ == null) {
        return document_ == null ? ai.visma.ssn.dataservice.v1.Document.getDefaultInstance() : document_;
      } else {
        return documentBuilder_.getMessage();
      }
    }
    /**
     * <code>.ssn.dataservice.v1.Document document = 1 [json_name = "document"];</code>
     */
    public Builder setDocument(ai.visma.ssn.dataservice.v1.Document value) {
      if (documentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        document_ = value;
      } else {
        documentBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.ssn.dataservice.v1.Document document = 1 [json_name = "document"];</code>
     */
    public Builder setDocument(
        ai.visma.ssn.dataservice.v1.Document.Builder builderForValue) {
      if (documentBuilder_ == null) {
        document_ = builderForValue.build();
      } else {
        documentBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.ssn.dataservice.v1.Document document = 1 [json_name = "document"];</code>
     */
    public Builder mergeDocument(ai.visma.ssn.dataservice.v1.Document value) {
      if (documentBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          document_ != null &&
          document_ != ai.visma.ssn.dataservice.v1.Document.getDefaultInstance()) {
          getDocumentBuilder().mergeFrom(value);
        } else {
          document_ = value;
        }
      } else {
        documentBuilder_.mergeFrom(value);
      }
      if (document_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.ssn.dataservice.v1.Document document = 1 [json_name = "document"];</code>
     */
    public Builder clearDocument() {
      bitField0_ = (bitField0_ & ~0x00000001);
      document_ = null;
      if (documentBuilder_ != null) {
        documentBuilder_.dispose();
        documentBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.ssn.dataservice.v1.Document document = 1 [json_name = "document"];</code>
     */
    public ai.visma.ssn.dataservice.v1.Document.Builder getDocumentBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDocumentFieldBuilder().getBuilder();
    }
    /**
     * <code>.ssn.dataservice.v1.Document document = 1 [json_name = "document"];</code>
     */
    public ai.visma.ssn.dataservice.v1.DocumentOrBuilder getDocumentOrBuilder() {
      if (documentBuilder_ != null) {
        return documentBuilder_.getMessageOrBuilder();
      } else {
        return document_ == null ?
            ai.visma.ssn.dataservice.v1.Document.getDefaultInstance() : document_;
      }
    }
    /**
     * <code>.ssn.dataservice.v1.Document document = 1 [json_name = "document"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        ai.visma.ssn.dataservice.v1.Document, ai.visma.ssn.dataservice.v1.Document.Builder, ai.visma.ssn.dataservice.v1.DocumentOrBuilder> 
        getDocumentFieldBuilder() {
      if (documentBuilder_ == null) {
        documentBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            ai.visma.ssn.dataservice.v1.Document, ai.visma.ssn.dataservice.v1.Document.Builder, ai.visma.ssn.dataservice.v1.DocumentOrBuilder>(
                getDocument(),
                getParentForChildren(),
                isClean());
        document_ = null;
      }
      return documentBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:ssn.dataservice.v1.ReadDocumentResponse)
  }

  // @@protoc_insertion_point(class_scope:ssn.dataservice.v1.ReadDocumentResponse)
  private static final ai.visma.ssn.dataservice.v1.ReadDocumentResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.visma.ssn.dataservice.v1.ReadDocumentResponse();
  }

  public static ai.visma.ssn.dataservice.v1.ReadDocumentResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReadDocumentResponse>
      PARSER = new com.google.protobuf.AbstractParser<ReadDocumentResponse>() {
    @java.lang.Override
    public ReadDocumentResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReadDocumentResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReadDocumentResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.visma.ssn.dataservice.v1.ReadDocumentResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

