// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: ssn/mlservice/v2/mlservice.proto
// Protobuf Java Version: 4.29.3

package ai.visma.ssn.mlservice.v2;

/**
 * Protobuf type {@code ssn.mlservice.v2.VatDistributionResponse}
 */
public final class VatDistributionResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:ssn.mlservice.v2.VatDistributionResponse)
    VatDistributionResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      VatDistributionResponse.class.getName());
  }
  // Use VatDistributionResponse.newBuilder() to construct.
  private VatDistributionResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private VatDistributionResponse() {
    vatDistributionCandidates_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.visma.ssn.mlservice.v2.MlserviceProto.internal_static_ssn_mlservice_v2_VatDistributionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.visma.ssn.mlservice.v2.MlserviceProto.internal_static_ssn_mlservice_v2_VatDistributionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.visma.ssn.mlservice.v2.VatDistributionResponse.class, ai.visma.ssn.mlservice.v2.VatDistributionResponse.Builder.class);
  }

  public static final int VAT_DISTRIBUTION_CANDIDATES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<ai.visma.ssn.type.VatDistributionCandidate> vatDistributionCandidates_;
  /**
   * <code>repeated .ssn.type.VatDistributionCandidate vat_distribution_candidates = 1 [json_name = "vatDistributionCandidates"];</code>
   */
  @java.lang.Override
  public java.util.List<ai.visma.ssn.type.VatDistributionCandidate> getVatDistributionCandidatesList() {
    return vatDistributionCandidates_;
  }
  /**
   * <code>repeated .ssn.type.VatDistributionCandidate vat_distribution_candidates = 1 [json_name = "vatDistributionCandidates"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends ai.visma.ssn.type.VatDistributionCandidateOrBuilder> 
      getVatDistributionCandidatesOrBuilderList() {
    return vatDistributionCandidates_;
  }
  /**
   * <code>repeated .ssn.type.VatDistributionCandidate vat_distribution_candidates = 1 [json_name = "vatDistributionCandidates"];</code>
   */
  @java.lang.Override
  public int getVatDistributionCandidatesCount() {
    return vatDistributionCandidates_.size();
  }
  /**
   * <code>repeated .ssn.type.VatDistributionCandidate vat_distribution_candidates = 1 [json_name = "vatDistributionCandidates"];</code>
   */
  @java.lang.Override
  public ai.visma.ssn.type.VatDistributionCandidate getVatDistributionCandidates(int index) {
    return vatDistributionCandidates_.get(index);
  }
  /**
   * <code>repeated .ssn.type.VatDistributionCandidate vat_distribution_candidates = 1 [json_name = "vatDistributionCandidates"];</code>
   */
  @java.lang.Override
  public ai.visma.ssn.type.VatDistributionCandidateOrBuilder getVatDistributionCandidatesOrBuilder(
      int index) {
    return vatDistributionCandidates_.get(index);
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
    for (int i = 0; i < vatDistributionCandidates_.size(); i++) {
      output.writeMessage(1, vatDistributionCandidates_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < vatDistributionCandidates_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, vatDistributionCandidates_.get(i));
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
    if (!(obj instanceof ai.visma.ssn.mlservice.v2.VatDistributionResponse)) {
      return super.equals(obj);
    }
    ai.visma.ssn.mlservice.v2.VatDistributionResponse other = (ai.visma.ssn.mlservice.v2.VatDistributionResponse) obj;

    if (!getVatDistributionCandidatesList()
        .equals(other.getVatDistributionCandidatesList())) return false;
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
    if (getVatDistributionCandidatesCount() > 0) {
      hash = (37 * hash) + VAT_DISTRIBUTION_CANDIDATES_FIELD_NUMBER;
      hash = (53 * hash) + getVatDistributionCandidatesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.visma.ssn.mlservice.v2.VatDistributionResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.ssn.mlservice.v2.VatDistributionResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.ssn.mlservice.v2.VatDistributionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.ssn.mlservice.v2.VatDistributionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.ssn.mlservice.v2.VatDistributionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.ssn.mlservice.v2.VatDistributionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.ssn.mlservice.v2.VatDistributionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.visma.ssn.mlservice.v2.VatDistributionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.visma.ssn.mlservice.v2.VatDistributionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.visma.ssn.mlservice.v2.VatDistributionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.visma.ssn.mlservice.v2.VatDistributionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.visma.ssn.mlservice.v2.VatDistributionResponse parseFrom(
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
  public static Builder newBuilder(ai.visma.ssn.mlservice.v2.VatDistributionResponse prototype) {
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
   * Protobuf type {@code ssn.mlservice.v2.VatDistributionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ssn.mlservice.v2.VatDistributionResponse)
      ai.visma.ssn.mlservice.v2.VatDistributionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.visma.ssn.mlservice.v2.MlserviceProto.internal_static_ssn_mlservice_v2_VatDistributionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.visma.ssn.mlservice.v2.MlserviceProto.internal_static_ssn_mlservice_v2_VatDistributionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.visma.ssn.mlservice.v2.VatDistributionResponse.class, ai.visma.ssn.mlservice.v2.VatDistributionResponse.Builder.class);
    }

    // Construct using ai.visma.ssn.mlservice.v2.VatDistributionResponse.newBuilder()
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
      if (vatDistributionCandidatesBuilder_ == null) {
        vatDistributionCandidates_ = java.util.Collections.emptyList();
      } else {
        vatDistributionCandidates_ = null;
        vatDistributionCandidatesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.visma.ssn.mlservice.v2.MlserviceProto.internal_static_ssn_mlservice_v2_VatDistributionResponse_descriptor;
    }

    @java.lang.Override
    public ai.visma.ssn.mlservice.v2.VatDistributionResponse getDefaultInstanceForType() {
      return ai.visma.ssn.mlservice.v2.VatDistributionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ai.visma.ssn.mlservice.v2.VatDistributionResponse build() {
      ai.visma.ssn.mlservice.v2.VatDistributionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.visma.ssn.mlservice.v2.VatDistributionResponse buildPartial() {
      ai.visma.ssn.mlservice.v2.VatDistributionResponse result = new ai.visma.ssn.mlservice.v2.VatDistributionResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(ai.visma.ssn.mlservice.v2.VatDistributionResponse result) {
      if (vatDistributionCandidatesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          vatDistributionCandidates_ = java.util.Collections.unmodifiableList(vatDistributionCandidates_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.vatDistributionCandidates_ = vatDistributionCandidates_;
      } else {
        result.vatDistributionCandidates_ = vatDistributionCandidatesBuilder_.build();
      }
    }

    private void buildPartial0(ai.visma.ssn.mlservice.v2.VatDistributionResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ai.visma.ssn.mlservice.v2.VatDistributionResponse) {
        return mergeFrom((ai.visma.ssn.mlservice.v2.VatDistributionResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.visma.ssn.mlservice.v2.VatDistributionResponse other) {
      if (other == ai.visma.ssn.mlservice.v2.VatDistributionResponse.getDefaultInstance()) return this;
      if (vatDistributionCandidatesBuilder_ == null) {
        if (!other.vatDistributionCandidates_.isEmpty()) {
          if (vatDistributionCandidates_.isEmpty()) {
            vatDistributionCandidates_ = other.vatDistributionCandidates_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureVatDistributionCandidatesIsMutable();
            vatDistributionCandidates_.addAll(other.vatDistributionCandidates_);
          }
          onChanged();
        }
      } else {
        if (!other.vatDistributionCandidates_.isEmpty()) {
          if (vatDistributionCandidatesBuilder_.isEmpty()) {
            vatDistributionCandidatesBuilder_.dispose();
            vatDistributionCandidatesBuilder_ = null;
            vatDistributionCandidates_ = other.vatDistributionCandidates_;
            bitField0_ = (bitField0_ & ~0x00000001);
            vatDistributionCandidatesBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getVatDistributionCandidatesFieldBuilder() : null;
          } else {
            vatDistributionCandidatesBuilder_.addAllMessages(other.vatDistributionCandidates_);
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
              ai.visma.ssn.type.VatDistributionCandidate m =
                  input.readMessage(
                      ai.visma.ssn.type.VatDistributionCandidate.parser(),
                      extensionRegistry);
              if (vatDistributionCandidatesBuilder_ == null) {
                ensureVatDistributionCandidatesIsMutable();
                vatDistributionCandidates_.add(m);
              } else {
                vatDistributionCandidatesBuilder_.addMessage(m);
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

    private java.util.List<ai.visma.ssn.type.VatDistributionCandidate> vatDistributionCandidates_ =
      java.util.Collections.emptyList();
    private void ensureVatDistributionCandidatesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        vatDistributionCandidates_ = new java.util.ArrayList<ai.visma.ssn.type.VatDistributionCandidate>(vatDistributionCandidates_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        ai.visma.ssn.type.VatDistributionCandidate, ai.visma.ssn.type.VatDistributionCandidate.Builder, ai.visma.ssn.type.VatDistributionCandidateOrBuilder> vatDistributionCandidatesBuilder_;

    /**
     * <code>repeated .ssn.type.VatDistributionCandidate vat_distribution_candidates = 1 [json_name = "vatDistributionCandidates"];</code>
     */
    public java.util.List<ai.visma.ssn.type.VatDistributionCandidate> getVatDistributionCandidatesList() {
      if (vatDistributionCandidatesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(vatDistributionCandidates_);
      } else {
        return vatDistributionCandidatesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .ssn.type.VatDistributionCandidate vat_distribution_candidates = 1 [json_name = "vatDistributionCandidates"];</code>
     */
    public int getVatDistributionCandidatesCount() {
      if (vatDistributionCandidatesBuilder_ == null) {
        return vatDistributionCandidates_.size();
      } else {
        return vatDistributionCandidatesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .ssn.type.VatDistributionCandidate vat_distribution_candidates = 1 [json_name = "vatDistributionCandidates"];</code>
     */
    public ai.visma.ssn.type.VatDistributionCandidate getVatDistributionCandidates(int index) {
      if (vatDistributionCandidatesBuilder_ == null) {
        return vatDistributionCandidates_.get(index);
      } else {
        return vatDistributionCandidatesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .ssn.type.VatDistributionCandidate vat_distribution_candidates = 1 [json_name = "vatDistributionCandidates"];</code>
     */
    public Builder setVatDistributionCandidates(
        int index, ai.visma.ssn.type.VatDistributionCandidate value) {
      if (vatDistributionCandidatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVatDistributionCandidatesIsMutable();
        vatDistributionCandidates_.set(index, value);
        onChanged();
      } else {
        vatDistributionCandidatesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ssn.type.VatDistributionCandidate vat_distribution_candidates = 1 [json_name = "vatDistributionCandidates"];</code>
     */
    public Builder setVatDistributionCandidates(
        int index, ai.visma.ssn.type.VatDistributionCandidate.Builder builderForValue) {
      if (vatDistributionCandidatesBuilder_ == null) {
        ensureVatDistributionCandidatesIsMutable();
        vatDistributionCandidates_.set(index, builderForValue.build());
        onChanged();
      } else {
        vatDistributionCandidatesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ssn.type.VatDistributionCandidate vat_distribution_candidates = 1 [json_name = "vatDistributionCandidates"];</code>
     */
    public Builder addVatDistributionCandidates(ai.visma.ssn.type.VatDistributionCandidate value) {
      if (vatDistributionCandidatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVatDistributionCandidatesIsMutable();
        vatDistributionCandidates_.add(value);
        onChanged();
      } else {
        vatDistributionCandidatesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .ssn.type.VatDistributionCandidate vat_distribution_candidates = 1 [json_name = "vatDistributionCandidates"];</code>
     */
    public Builder addVatDistributionCandidates(
        int index, ai.visma.ssn.type.VatDistributionCandidate value) {
      if (vatDistributionCandidatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVatDistributionCandidatesIsMutable();
        vatDistributionCandidates_.add(index, value);
        onChanged();
      } else {
        vatDistributionCandidatesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ssn.type.VatDistributionCandidate vat_distribution_candidates = 1 [json_name = "vatDistributionCandidates"];</code>
     */
    public Builder addVatDistributionCandidates(
        ai.visma.ssn.type.VatDistributionCandidate.Builder builderForValue) {
      if (vatDistributionCandidatesBuilder_ == null) {
        ensureVatDistributionCandidatesIsMutable();
        vatDistributionCandidates_.add(builderForValue.build());
        onChanged();
      } else {
        vatDistributionCandidatesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ssn.type.VatDistributionCandidate vat_distribution_candidates = 1 [json_name = "vatDistributionCandidates"];</code>
     */
    public Builder addVatDistributionCandidates(
        int index, ai.visma.ssn.type.VatDistributionCandidate.Builder builderForValue) {
      if (vatDistributionCandidatesBuilder_ == null) {
        ensureVatDistributionCandidatesIsMutable();
        vatDistributionCandidates_.add(index, builderForValue.build());
        onChanged();
      } else {
        vatDistributionCandidatesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ssn.type.VatDistributionCandidate vat_distribution_candidates = 1 [json_name = "vatDistributionCandidates"];</code>
     */
    public Builder addAllVatDistributionCandidates(
        java.lang.Iterable<? extends ai.visma.ssn.type.VatDistributionCandidate> values) {
      if (vatDistributionCandidatesBuilder_ == null) {
        ensureVatDistributionCandidatesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, vatDistributionCandidates_);
        onChanged();
      } else {
        vatDistributionCandidatesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .ssn.type.VatDistributionCandidate vat_distribution_candidates = 1 [json_name = "vatDistributionCandidates"];</code>
     */
    public Builder clearVatDistributionCandidates() {
      if (vatDistributionCandidatesBuilder_ == null) {
        vatDistributionCandidates_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        vatDistributionCandidatesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .ssn.type.VatDistributionCandidate vat_distribution_candidates = 1 [json_name = "vatDistributionCandidates"];</code>
     */
    public Builder removeVatDistributionCandidates(int index) {
      if (vatDistributionCandidatesBuilder_ == null) {
        ensureVatDistributionCandidatesIsMutable();
        vatDistributionCandidates_.remove(index);
        onChanged();
      } else {
        vatDistributionCandidatesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .ssn.type.VatDistributionCandidate vat_distribution_candidates = 1 [json_name = "vatDistributionCandidates"];</code>
     */
    public ai.visma.ssn.type.VatDistributionCandidate.Builder getVatDistributionCandidatesBuilder(
        int index) {
      return getVatDistributionCandidatesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .ssn.type.VatDistributionCandidate vat_distribution_candidates = 1 [json_name = "vatDistributionCandidates"];</code>
     */
    public ai.visma.ssn.type.VatDistributionCandidateOrBuilder getVatDistributionCandidatesOrBuilder(
        int index) {
      if (vatDistributionCandidatesBuilder_ == null) {
        return vatDistributionCandidates_.get(index);  } else {
        return vatDistributionCandidatesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .ssn.type.VatDistributionCandidate vat_distribution_candidates = 1 [json_name = "vatDistributionCandidates"];</code>
     */
    public java.util.List<? extends ai.visma.ssn.type.VatDistributionCandidateOrBuilder> 
         getVatDistributionCandidatesOrBuilderList() {
      if (vatDistributionCandidatesBuilder_ != null) {
        return vatDistributionCandidatesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(vatDistributionCandidates_);
      }
    }
    /**
     * <code>repeated .ssn.type.VatDistributionCandidate vat_distribution_candidates = 1 [json_name = "vatDistributionCandidates"];</code>
     */
    public ai.visma.ssn.type.VatDistributionCandidate.Builder addVatDistributionCandidatesBuilder() {
      return getVatDistributionCandidatesFieldBuilder().addBuilder(
          ai.visma.ssn.type.VatDistributionCandidate.getDefaultInstance());
    }
    /**
     * <code>repeated .ssn.type.VatDistributionCandidate vat_distribution_candidates = 1 [json_name = "vatDistributionCandidates"];</code>
     */
    public ai.visma.ssn.type.VatDistributionCandidate.Builder addVatDistributionCandidatesBuilder(
        int index) {
      return getVatDistributionCandidatesFieldBuilder().addBuilder(
          index, ai.visma.ssn.type.VatDistributionCandidate.getDefaultInstance());
    }
    /**
     * <code>repeated .ssn.type.VatDistributionCandidate vat_distribution_candidates = 1 [json_name = "vatDistributionCandidates"];</code>
     */
    public java.util.List<ai.visma.ssn.type.VatDistributionCandidate.Builder> 
         getVatDistributionCandidatesBuilderList() {
      return getVatDistributionCandidatesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        ai.visma.ssn.type.VatDistributionCandidate, ai.visma.ssn.type.VatDistributionCandidate.Builder, ai.visma.ssn.type.VatDistributionCandidateOrBuilder> 
        getVatDistributionCandidatesFieldBuilder() {
      if (vatDistributionCandidatesBuilder_ == null) {
        vatDistributionCandidatesBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            ai.visma.ssn.type.VatDistributionCandidate, ai.visma.ssn.type.VatDistributionCandidate.Builder, ai.visma.ssn.type.VatDistributionCandidateOrBuilder>(
                vatDistributionCandidates_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        vatDistributionCandidates_ = null;
      }
      return vatDistributionCandidatesBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:ssn.mlservice.v2.VatDistributionResponse)
  }

  // @@protoc_insertion_point(class_scope:ssn.mlservice.v2.VatDistributionResponse)
  private static final ai.visma.ssn.mlservice.v2.VatDistributionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.visma.ssn.mlservice.v2.VatDistributionResponse();
  }

  public static ai.visma.ssn.mlservice.v2.VatDistributionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VatDistributionResponse>
      PARSER = new com.google.protobuf.AbstractParser<VatDistributionResponse>() {
    @java.lang.Override
    public VatDistributionResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<VatDistributionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VatDistributionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.visma.ssn.mlservice.v2.VatDistributionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

