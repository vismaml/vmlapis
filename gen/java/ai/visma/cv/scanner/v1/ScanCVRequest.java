// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: cv/scanner/v1/scanner.proto
// Protobuf Java Version: 4.29.3

package ai.visma.cv.scanner.v1;

/**
 * Protobuf type {@code cv.scanner.v1.ScanCVRequest}
 */
public final class ScanCVRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:cv.scanner.v1.ScanCVRequest)
    ScanCVRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      ScanCVRequest.class.getName());
  }
  // Use ScanCVRequest.newBuilder() to construct.
  private ScanCVRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ScanCVRequest() {
    features_ = java.util.Collections.emptyList();
    tags_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.visma.cv.scanner.v1.ScannerProto.internal_static_cv_scanner_v1_ScanCVRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.visma.cv.scanner.v1.ScannerProto.internal_static_cv_scanner_v1_ScanCVRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.visma.cv.scanner.v1.ScanCVRequest.class, ai.visma.cv.scanner.v1.ScanCVRequest.Builder.class);
  }

  private int bitField0_;
  public static final int DOCUMENT_FIELD_NUMBER = 1;
  private ai.visma.ssn.annotator.v1.Document document_;
  /**
   * <code>.ssn.annotator.v1.Document document = 1 [json_name = "document"];</code>
   * @return Whether the document field is set.
   */
  @java.lang.Override
  public boolean hasDocument() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.ssn.annotator.v1.Document document = 1 [json_name = "document"];</code>
   * @return The document.
   */
  @java.lang.Override
  public ai.visma.ssn.annotator.v1.Document getDocument() {
    return document_ == null ? ai.visma.ssn.annotator.v1.Document.getDefaultInstance() : document_;
  }
  /**
   * <code>.ssn.annotator.v1.Document document = 1 [json_name = "document"];</code>
   */
  @java.lang.Override
  public ai.visma.ssn.annotator.v1.DocumentOrBuilder getDocumentOrBuilder() {
    return document_ == null ? ai.visma.ssn.annotator.v1.Document.getDefaultInstance() : document_;
  }

  public static final int FEATURES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<ai.visma.cv.scanner.v1.Feature> features_;
  /**
   * <code>repeated .cv.scanner.v1.Feature features = 2 [json_name = "features"];</code>
   */
  @java.lang.Override
  public java.util.List<ai.visma.cv.scanner.v1.Feature> getFeaturesList() {
    return features_;
  }
  /**
   * <code>repeated .cv.scanner.v1.Feature features = 2 [json_name = "features"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends ai.visma.cv.scanner.v1.FeatureOrBuilder> 
      getFeaturesOrBuilderList() {
    return features_;
  }
  /**
   * <code>repeated .cv.scanner.v1.Feature features = 2 [json_name = "features"];</code>
   */
  @java.lang.Override
  public int getFeaturesCount() {
    return features_.size();
  }
  /**
   * <code>repeated .cv.scanner.v1.Feature features = 2 [json_name = "features"];</code>
   */
  @java.lang.Override
  public ai.visma.cv.scanner.v1.Feature getFeatures(int index) {
    return features_.get(index);
  }
  /**
   * <code>repeated .cv.scanner.v1.Feature features = 2 [json_name = "features"];</code>
   */
  @java.lang.Override
  public ai.visma.cv.scanner.v1.FeatureOrBuilder getFeaturesOrBuilder(
      int index) {
    return features_.get(index);
  }

  public static final int TAGS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList tags_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string tags = 3 [json_name = "tags"];</code>
   * @return A list containing the tags.
   */
  public com.google.protobuf.ProtocolStringList
      getTagsList() {
    return tags_;
  }
  /**
   * <code>repeated string tags = 3 [json_name = "tags"];</code>
   * @return The count of tags.
   */
  public int getTagsCount() {
    return tags_.size();
  }
  /**
   * <code>repeated string tags = 3 [json_name = "tags"];</code>
   * @param index The index of the element to return.
   * @return The tags at the given index.
   */
  public java.lang.String getTags(int index) {
    return tags_.get(index);
  }
  /**
   * <code>repeated string tags = 3 [json_name = "tags"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the tags at the given index.
   */
  public com.google.protobuf.ByteString
      getTagsBytes(int index) {
    return tags_.getByteString(index);
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
    for (int i = 0; i < features_.size(); i++) {
      output.writeMessage(2, features_.get(i));
    }
    for (int i = 0; i < tags_.size(); i++) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, tags_.getRaw(i));
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
    for (int i = 0; i < features_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, features_.get(i));
    }
    {
      int dataSize = 0;
      for (int i = 0; i < tags_.size(); i++) {
        dataSize += computeStringSizeNoTag(tags_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getTagsList().size();
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
    if (!(obj instanceof ai.visma.cv.scanner.v1.ScanCVRequest)) {
      return super.equals(obj);
    }
    ai.visma.cv.scanner.v1.ScanCVRequest other = (ai.visma.cv.scanner.v1.ScanCVRequest) obj;

    if (hasDocument() != other.hasDocument()) return false;
    if (hasDocument()) {
      if (!getDocument()
          .equals(other.getDocument())) return false;
    }
    if (!getFeaturesList()
        .equals(other.getFeaturesList())) return false;
    if (!getTagsList()
        .equals(other.getTagsList())) return false;
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
    if (getFeaturesCount() > 0) {
      hash = (37 * hash) + FEATURES_FIELD_NUMBER;
      hash = (53 * hash) + getFeaturesList().hashCode();
    }
    if (getTagsCount() > 0) {
      hash = (37 * hash) + TAGS_FIELD_NUMBER;
      hash = (53 * hash) + getTagsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.visma.cv.scanner.v1.ScanCVRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.cv.scanner.v1.ScanCVRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.cv.scanner.v1.ScanCVRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.cv.scanner.v1.ScanCVRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.cv.scanner.v1.ScanCVRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.cv.scanner.v1.ScanCVRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.cv.scanner.v1.ScanCVRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.visma.cv.scanner.v1.ScanCVRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.visma.cv.scanner.v1.ScanCVRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.visma.cv.scanner.v1.ScanCVRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.visma.cv.scanner.v1.ScanCVRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.visma.cv.scanner.v1.ScanCVRequest parseFrom(
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
  public static Builder newBuilder(ai.visma.cv.scanner.v1.ScanCVRequest prototype) {
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
   * Protobuf type {@code cv.scanner.v1.ScanCVRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cv.scanner.v1.ScanCVRequest)
      ai.visma.cv.scanner.v1.ScanCVRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.visma.cv.scanner.v1.ScannerProto.internal_static_cv_scanner_v1_ScanCVRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.visma.cv.scanner.v1.ScannerProto.internal_static_cv_scanner_v1_ScanCVRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.visma.cv.scanner.v1.ScanCVRequest.class, ai.visma.cv.scanner.v1.ScanCVRequest.Builder.class);
    }

    // Construct using ai.visma.cv.scanner.v1.ScanCVRequest.newBuilder()
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
        getFeaturesFieldBuilder();
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
      if (featuresBuilder_ == null) {
        features_ = java.util.Collections.emptyList();
      } else {
        features_ = null;
        featuresBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      tags_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.visma.cv.scanner.v1.ScannerProto.internal_static_cv_scanner_v1_ScanCVRequest_descriptor;
    }

    @java.lang.Override
    public ai.visma.cv.scanner.v1.ScanCVRequest getDefaultInstanceForType() {
      return ai.visma.cv.scanner.v1.ScanCVRequest.getDefaultInstance();
    }

    @java.lang.Override
    public ai.visma.cv.scanner.v1.ScanCVRequest build() {
      ai.visma.cv.scanner.v1.ScanCVRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.visma.cv.scanner.v1.ScanCVRequest buildPartial() {
      ai.visma.cv.scanner.v1.ScanCVRequest result = new ai.visma.cv.scanner.v1.ScanCVRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(ai.visma.cv.scanner.v1.ScanCVRequest result) {
      if (featuresBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          features_ = java.util.Collections.unmodifiableList(features_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.features_ = features_;
      } else {
        result.features_ = featuresBuilder_.build();
      }
    }

    private void buildPartial0(ai.visma.cv.scanner.v1.ScanCVRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.document_ = documentBuilder_ == null
            ? document_
            : documentBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        tags_.makeImmutable();
        result.tags_ = tags_;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ai.visma.cv.scanner.v1.ScanCVRequest) {
        return mergeFrom((ai.visma.cv.scanner.v1.ScanCVRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.visma.cv.scanner.v1.ScanCVRequest other) {
      if (other == ai.visma.cv.scanner.v1.ScanCVRequest.getDefaultInstance()) return this;
      if (other.hasDocument()) {
        mergeDocument(other.getDocument());
      }
      if (featuresBuilder_ == null) {
        if (!other.features_.isEmpty()) {
          if (features_.isEmpty()) {
            features_ = other.features_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureFeaturesIsMutable();
            features_.addAll(other.features_);
          }
          onChanged();
        }
      } else {
        if (!other.features_.isEmpty()) {
          if (featuresBuilder_.isEmpty()) {
            featuresBuilder_.dispose();
            featuresBuilder_ = null;
            features_ = other.features_;
            bitField0_ = (bitField0_ & ~0x00000002);
            featuresBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getFeaturesFieldBuilder() : null;
          } else {
            featuresBuilder_.addAllMessages(other.features_);
          }
        }
      }
      if (!other.tags_.isEmpty()) {
        if (tags_.isEmpty()) {
          tags_ = other.tags_;
          bitField0_ |= 0x00000004;
        } else {
          ensureTagsIsMutable();
          tags_.addAll(other.tags_);
        }
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
                  getDocumentFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              ai.visma.cv.scanner.v1.Feature m =
                  input.readMessage(
                      ai.visma.cv.scanner.v1.Feature.parser(),
                      extensionRegistry);
              if (featuresBuilder_ == null) {
                ensureFeaturesIsMutable();
                features_.add(m);
              } else {
                featuresBuilder_.addMessage(m);
              }
              break;
            } // case 18
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureTagsIsMutable();
              tags_.add(s);
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

    private ai.visma.ssn.annotator.v1.Document document_;
    private com.google.protobuf.SingleFieldBuilder<
        ai.visma.ssn.annotator.v1.Document, ai.visma.ssn.annotator.v1.Document.Builder, ai.visma.ssn.annotator.v1.DocumentOrBuilder> documentBuilder_;
    /**
     * <code>.ssn.annotator.v1.Document document = 1 [json_name = "document"];</code>
     * @return Whether the document field is set.
     */
    public boolean hasDocument() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.ssn.annotator.v1.Document document = 1 [json_name = "document"];</code>
     * @return The document.
     */
    public ai.visma.ssn.annotator.v1.Document getDocument() {
      if (documentBuilder_ == null) {
        return document_ == null ? ai.visma.ssn.annotator.v1.Document.getDefaultInstance() : document_;
      } else {
        return documentBuilder_.getMessage();
      }
    }
    /**
     * <code>.ssn.annotator.v1.Document document = 1 [json_name = "document"];</code>
     */
    public Builder setDocument(ai.visma.ssn.annotator.v1.Document value) {
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
     * <code>.ssn.annotator.v1.Document document = 1 [json_name = "document"];</code>
     */
    public Builder setDocument(
        ai.visma.ssn.annotator.v1.Document.Builder builderForValue) {
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
     * <code>.ssn.annotator.v1.Document document = 1 [json_name = "document"];</code>
     */
    public Builder mergeDocument(ai.visma.ssn.annotator.v1.Document value) {
      if (documentBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          document_ != null &&
          document_ != ai.visma.ssn.annotator.v1.Document.getDefaultInstance()) {
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
     * <code>.ssn.annotator.v1.Document document = 1 [json_name = "document"];</code>
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
     * <code>.ssn.annotator.v1.Document document = 1 [json_name = "document"];</code>
     */
    public ai.visma.ssn.annotator.v1.Document.Builder getDocumentBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDocumentFieldBuilder().getBuilder();
    }
    /**
     * <code>.ssn.annotator.v1.Document document = 1 [json_name = "document"];</code>
     */
    public ai.visma.ssn.annotator.v1.DocumentOrBuilder getDocumentOrBuilder() {
      if (documentBuilder_ != null) {
        return documentBuilder_.getMessageOrBuilder();
      } else {
        return document_ == null ?
            ai.visma.ssn.annotator.v1.Document.getDefaultInstance() : document_;
      }
    }
    /**
     * <code>.ssn.annotator.v1.Document document = 1 [json_name = "document"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        ai.visma.ssn.annotator.v1.Document, ai.visma.ssn.annotator.v1.Document.Builder, ai.visma.ssn.annotator.v1.DocumentOrBuilder> 
        getDocumentFieldBuilder() {
      if (documentBuilder_ == null) {
        documentBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            ai.visma.ssn.annotator.v1.Document, ai.visma.ssn.annotator.v1.Document.Builder, ai.visma.ssn.annotator.v1.DocumentOrBuilder>(
                getDocument(),
                getParentForChildren(),
                isClean());
        document_ = null;
      }
      return documentBuilder_;
    }

    private java.util.List<ai.visma.cv.scanner.v1.Feature> features_ =
      java.util.Collections.emptyList();
    private void ensureFeaturesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        features_ = new java.util.ArrayList<ai.visma.cv.scanner.v1.Feature>(features_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        ai.visma.cv.scanner.v1.Feature, ai.visma.cv.scanner.v1.Feature.Builder, ai.visma.cv.scanner.v1.FeatureOrBuilder> featuresBuilder_;

    /**
     * <code>repeated .cv.scanner.v1.Feature features = 2 [json_name = "features"];</code>
     */
    public java.util.List<ai.visma.cv.scanner.v1.Feature> getFeaturesList() {
      if (featuresBuilder_ == null) {
        return java.util.Collections.unmodifiableList(features_);
      } else {
        return featuresBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .cv.scanner.v1.Feature features = 2 [json_name = "features"];</code>
     */
    public int getFeaturesCount() {
      if (featuresBuilder_ == null) {
        return features_.size();
      } else {
        return featuresBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .cv.scanner.v1.Feature features = 2 [json_name = "features"];</code>
     */
    public ai.visma.cv.scanner.v1.Feature getFeatures(int index) {
      if (featuresBuilder_ == null) {
        return features_.get(index);
      } else {
        return featuresBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .cv.scanner.v1.Feature features = 2 [json_name = "features"];</code>
     */
    public Builder setFeatures(
        int index, ai.visma.cv.scanner.v1.Feature value) {
      if (featuresBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFeaturesIsMutable();
        features_.set(index, value);
        onChanged();
      } else {
        featuresBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cv.scanner.v1.Feature features = 2 [json_name = "features"];</code>
     */
    public Builder setFeatures(
        int index, ai.visma.cv.scanner.v1.Feature.Builder builderForValue) {
      if (featuresBuilder_ == null) {
        ensureFeaturesIsMutable();
        features_.set(index, builderForValue.build());
        onChanged();
      } else {
        featuresBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cv.scanner.v1.Feature features = 2 [json_name = "features"];</code>
     */
    public Builder addFeatures(ai.visma.cv.scanner.v1.Feature value) {
      if (featuresBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFeaturesIsMutable();
        features_.add(value);
        onChanged();
      } else {
        featuresBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .cv.scanner.v1.Feature features = 2 [json_name = "features"];</code>
     */
    public Builder addFeatures(
        int index, ai.visma.cv.scanner.v1.Feature value) {
      if (featuresBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFeaturesIsMutable();
        features_.add(index, value);
        onChanged();
      } else {
        featuresBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cv.scanner.v1.Feature features = 2 [json_name = "features"];</code>
     */
    public Builder addFeatures(
        ai.visma.cv.scanner.v1.Feature.Builder builderForValue) {
      if (featuresBuilder_ == null) {
        ensureFeaturesIsMutable();
        features_.add(builderForValue.build());
        onChanged();
      } else {
        featuresBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cv.scanner.v1.Feature features = 2 [json_name = "features"];</code>
     */
    public Builder addFeatures(
        int index, ai.visma.cv.scanner.v1.Feature.Builder builderForValue) {
      if (featuresBuilder_ == null) {
        ensureFeaturesIsMutable();
        features_.add(index, builderForValue.build());
        onChanged();
      } else {
        featuresBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cv.scanner.v1.Feature features = 2 [json_name = "features"];</code>
     */
    public Builder addAllFeatures(
        java.lang.Iterable<? extends ai.visma.cv.scanner.v1.Feature> values) {
      if (featuresBuilder_ == null) {
        ensureFeaturesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, features_);
        onChanged();
      } else {
        featuresBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .cv.scanner.v1.Feature features = 2 [json_name = "features"];</code>
     */
    public Builder clearFeatures() {
      if (featuresBuilder_ == null) {
        features_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        featuresBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .cv.scanner.v1.Feature features = 2 [json_name = "features"];</code>
     */
    public Builder removeFeatures(int index) {
      if (featuresBuilder_ == null) {
        ensureFeaturesIsMutable();
        features_.remove(index);
        onChanged();
      } else {
        featuresBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .cv.scanner.v1.Feature features = 2 [json_name = "features"];</code>
     */
    public ai.visma.cv.scanner.v1.Feature.Builder getFeaturesBuilder(
        int index) {
      return getFeaturesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .cv.scanner.v1.Feature features = 2 [json_name = "features"];</code>
     */
    public ai.visma.cv.scanner.v1.FeatureOrBuilder getFeaturesOrBuilder(
        int index) {
      if (featuresBuilder_ == null) {
        return features_.get(index);  } else {
        return featuresBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .cv.scanner.v1.Feature features = 2 [json_name = "features"];</code>
     */
    public java.util.List<? extends ai.visma.cv.scanner.v1.FeatureOrBuilder> 
         getFeaturesOrBuilderList() {
      if (featuresBuilder_ != null) {
        return featuresBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(features_);
      }
    }
    /**
     * <code>repeated .cv.scanner.v1.Feature features = 2 [json_name = "features"];</code>
     */
    public ai.visma.cv.scanner.v1.Feature.Builder addFeaturesBuilder() {
      return getFeaturesFieldBuilder().addBuilder(
          ai.visma.cv.scanner.v1.Feature.getDefaultInstance());
    }
    /**
     * <code>repeated .cv.scanner.v1.Feature features = 2 [json_name = "features"];</code>
     */
    public ai.visma.cv.scanner.v1.Feature.Builder addFeaturesBuilder(
        int index) {
      return getFeaturesFieldBuilder().addBuilder(
          index, ai.visma.cv.scanner.v1.Feature.getDefaultInstance());
    }
    /**
     * <code>repeated .cv.scanner.v1.Feature features = 2 [json_name = "features"];</code>
     */
    public java.util.List<ai.visma.cv.scanner.v1.Feature.Builder> 
         getFeaturesBuilderList() {
      return getFeaturesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        ai.visma.cv.scanner.v1.Feature, ai.visma.cv.scanner.v1.Feature.Builder, ai.visma.cv.scanner.v1.FeatureOrBuilder> 
        getFeaturesFieldBuilder() {
      if (featuresBuilder_ == null) {
        featuresBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            ai.visma.cv.scanner.v1.Feature, ai.visma.cv.scanner.v1.Feature.Builder, ai.visma.cv.scanner.v1.FeatureOrBuilder>(
                features_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        features_ = null;
      }
      return featuresBuilder_;
    }

    private com.google.protobuf.LazyStringArrayList tags_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureTagsIsMutable() {
      if (!tags_.isModifiable()) {
        tags_ = new com.google.protobuf.LazyStringArrayList(tags_);
      }
      bitField0_ |= 0x00000004;
    }
    /**
     * <code>repeated string tags = 3 [json_name = "tags"];</code>
     * @return A list containing the tags.
     */
    public com.google.protobuf.ProtocolStringList
        getTagsList() {
      tags_.makeImmutable();
      return tags_;
    }
    /**
     * <code>repeated string tags = 3 [json_name = "tags"];</code>
     * @return The count of tags.
     */
    public int getTagsCount() {
      return tags_.size();
    }
    /**
     * <code>repeated string tags = 3 [json_name = "tags"];</code>
     * @param index The index of the element to return.
     * @return The tags at the given index.
     */
    public java.lang.String getTags(int index) {
      return tags_.get(index);
    }
    /**
     * <code>repeated string tags = 3 [json_name = "tags"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the tags at the given index.
     */
    public com.google.protobuf.ByteString
        getTagsBytes(int index) {
      return tags_.getByteString(index);
    }
    /**
     * <code>repeated string tags = 3 [json_name = "tags"];</code>
     * @param index The index to set the value at.
     * @param value The tags to set.
     * @return This builder for chaining.
     */
    public Builder setTags(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureTagsIsMutable();
      tags_.set(index, value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string tags = 3 [json_name = "tags"];</code>
     * @param value The tags to add.
     * @return This builder for chaining.
     */
    public Builder addTags(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureTagsIsMutable();
      tags_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string tags = 3 [json_name = "tags"];</code>
     * @param values The tags to add.
     * @return This builder for chaining.
     */
    public Builder addAllTags(
        java.lang.Iterable<java.lang.String> values) {
      ensureTagsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, tags_);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string tags = 3 [json_name = "tags"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTags() {
      tags_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string tags = 3 [json_name = "tags"];</code>
     * @param value The bytes of the tags to add.
     * @return This builder for chaining.
     */
    public Builder addTagsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureTagsIsMutable();
      tags_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:cv.scanner.v1.ScanCVRequest)
  }

  // @@protoc_insertion_point(class_scope:cv.scanner.v1.ScanCVRequest)
  private static final ai.visma.cv.scanner.v1.ScanCVRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.visma.cv.scanner.v1.ScanCVRequest();
  }

  public static ai.visma.cv.scanner.v1.ScanCVRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ScanCVRequest>
      PARSER = new com.google.protobuf.AbstractParser<ScanCVRequest>() {
    @java.lang.Override
    public ScanCVRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ScanCVRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ScanCVRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.visma.cv.scanner.v1.ScanCVRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

