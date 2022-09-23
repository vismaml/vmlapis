// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ssn/mlservice/v2/example.proto

package org.tensorflow.example;

/**
 * Protobuf type {@code tensorflow.SequenceExample}
 */
public final class SequenceExample extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.SequenceExample)
    SequenceExampleOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SequenceExample.newBuilder() to construct.
  private SequenceExample(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SequenceExample() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SequenceExample();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SequenceExample(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            org.tensorflow.example.Features.Builder subBuilder = null;
            if (context_ != null) {
              subBuilder = context_.toBuilder();
            }
            context_ = input.readMessage(org.tensorflow.example.Features.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(context_);
              context_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            org.tensorflow.example.FeatureLists.Builder subBuilder = null;
            if (featureLists_ != null) {
              subBuilder = featureLists_.toBuilder();
            }
            featureLists_ = input.readMessage(org.tensorflow.example.FeatureLists.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(featureLists_);
              featureLists_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.example.ExampleProtos.internal_static_tensorflow_SequenceExample_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.example.ExampleProtos.internal_static_tensorflow_SequenceExample_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.example.SequenceExample.class, org.tensorflow.example.SequenceExample.Builder.class);
  }

  public static final int CONTEXT_FIELD_NUMBER = 1;
  private org.tensorflow.example.Features context_;
  /**
   * <code>.tensorflow.Features context = 1 [json_name = "context"];</code>
   * @return Whether the context field is set.
   */
  @java.lang.Override
  public boolean hasContext() {
    return context_ != null;
  }
  /**
   * <code>.tensorflow.Features context = 1 [json_name = "context"];</code>
   * @return The context.
   */
  @java.lang.Override
  public org.tensorflow.example.Features getContext() {
    return context_ == null ? org.tensorflow.example.Features.getDefaultInstance() : context_;
  }
  /**
   * <code>.tensorflow.Features context = 1 [json_name = "context"];</code>
   */
  @java.lang.Override
  public org.tensorflow.example.FeaturesOrBuilder getContextOrBuilder() {
    return getContext();
  }

  public static final int FEATURE_LISTS_FIELD_NUMBER = 2;
  private org.tensorflow.example.FeatureLists featureLists_;
  /**
   * <code>.tensorflow.FeatureLists feature_lists = 2 [json_name = "featureLists"];</code>
   * @return Whether the featureLists field is set.
   */
  @java.lang.Override
  public boolean hasFeatureLists() {
    return featureLists_ != null;
  }
  /**
   * <code>.tensorflow.FeatureLists feature_lists = 2 [json_name = "featureLists"];</code>
   * @return The featureLists.
   */
  @java.lang.Override
  public org.tensorflow.example.FeatureLists getFeatureLists() {
    return featureLists_ == null ? org.tensorflow.example.FeatureLists.getDefaultInstance() : featureLists_;
  }
  /**
   * <code>.tensorflow.FeatureLists feature_lists = 2 [json_name = "featureLists"];</code>
   */
  @java.lang.Override
  public org.tensorflow.example.FeatureListsOrBuilder getFeatureListsOrBuilder() {
    return getFeatureLists();
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
    if (context_ != null) {
      output.writeMessage(1, getContext());
    }
    if (featureLists_ != null) {
      output.writeMessage(2, getFeatureLists());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (context_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getContext());
    }
    if (featureLists_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getFeatureLists());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.tensorflow.example.SequenceExample)) {
      return super.equals(obj);
    }
    org.tensorflow.example.SequenceExample other = (org.tensorflow.example.SequenceExample) obj;

    if (hasContext() != other.hasContext()) return false;
    if (hasContext()) {
      if (!getContext()
          .equals(other.getContext())) return false;
    }
    if (hasFeatureLists() != other.hasFeatureLists()) return false;
    if (hasFeatureLists()) {
      if (!getFeatureLists()
          .equals(other.getFeatureLists())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasContext()) {
      hash = (37 * hash) + CONTEXT_FIELD_NUMBER;
      hash = (53 * hash) + getContext().hashCode();
    }
    if (hasFeatureLists()) {
      hash = (37 * hash) + FEATURE_LISTS_FIELD_NUMBER;
      hash = (53 * hash) + getFeatureLists().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.example.SequenceExample parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.example.SequenceExample parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.example.SequenceExample parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.example.SequenceExample parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.example.SequenceExample parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.example.SequenceExample parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.example.SequenceExample parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.example.SequenceExample parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.example.SequenceExample parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.example.SequenceExample parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.example.SequenceExample parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.example.SequenceExample parseFrom(
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
  public static Builder newBuilder(org.tensorflow.example.SequenceExample prototype) {
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
   * Protobuf type {@code tensorflow.SequenceExample}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.SequenceExample)
      org.tensorflow.example.SequenceExampleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.example.ExampleProtos.internal_static_tensorflow_SequenceExample_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.example.ExampleProtos.internal_static_tensorflow_SequenceExample_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.example.SequenceExample.class, org.tensorflow.example.SequenceExample.Builder.class);
    }

    // Construct using org.tensorflow.example.SequenceExample.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (contextBuilder_ == null) {
        context_ = null;
      } else {
        context_ = null;
        contextBuilder_ = null;
      }
      if (featureListsBuilder_ == null) {
        featureLists_ = null;
      } else {
        featureLists_ = null;
        featureListsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.example.ExampleProtos.internal_static_tensorflow_SequenceExample_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.example.SequenceExample getDefaultInstanceForType() {
      return org.tensorflow.example.SequenceExample.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.example.SequenceExample build() {
      org.tensorflow.example.SequenceExample result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.example.SequenceExample buildPartial() {
      org.tensorflow.example.SequenceExample result = new org.tensorflow.example.SequenceExample(this);
      if (contextBuilder_ == null) {
        result.context_ = context_;
      } else {
        result.context_ = contextBuilder_.build();
      }
      if (featureListsBuilder_ == null) {
        result.featureLists_ = featureLists_;
      } else {
        result.featureLists_ = featureListsBuilder_.build();
      }
      onBuilt();
      return result;
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
      if (other instanceof org.tensorflow.example.SequenceExample) {
        return mergeFrom((org.tensorflow.example.SequenceExample)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.example.SequenceExample other) {
      if (other == org.tensorflow.example.SequenceExample.getDefaultInstance()) return this;
      if (other.hasContext()) {
        mergeContext(other.getContext());
      }
      if (other.hasFeatureLists()) {
        mergeFeatureLists(other.getFeatureLists());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      org.tensorflow.example.SequenceExample parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.example.SequenceExample) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private org.tensorflow.example.Features context_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.example.Features, org.tensorflow.example.Features.Builder, org.tensorflow.example.FeaturesOrBuilder> contextBuilder_;
    /**
     * <code>.tensorflow.Features context = 1 [json_name = "context"];</code>
     * @return Whether the context field is set.
     */
    public boolean hasContext() {
      return contextBuilder_ != null || context_ != null;
    }
    /**
     * <code>.tensorflow.Features context = 1 [json_name = "context"];</code>
     * @return The context.
     */
    public org.tensorflow.example.Features getContext() {
      if (contextBuilder_ == null) {
        return context_ == null ? org.tensorflow.example.Features.getDefaultInstance() : context_;
      } else {
        return contextBuilder_.getMessage();
      }
    }
    /**
     * <code>.tensorflow.Features context = 1 [json_name = "context"];</code>
     */
    public Builder setContext(org.tensorflow.example.Features value) {
      if (contextBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        context_ = value;
        onChanged();
      } else {
        contextBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.tensorflow.Features context = 1 [json_name = "context"];</code>
     */
    public Builder setContext(
        org.tensorflow.example.Features.Builder builderForValue) {
      if (contextBuilder_ == null) {
        context_ = builderForValue.build();
        onChanged();
      } else {
        contextBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.tensorflow.Features context = 1 [json_name = "context"];</code>
     */
    public Builder mergeContext(org.tensorflow.example.Features value) {
      if (contextBuilder_ == null) {
        if (context_ != null) {
          context_ =
            org.tensorflow.example.Features.newBuilder(context_).mergeFrom(value).buildPartial();
        } else {
          context_ = value;
        }
        onChanged();
      } else {
        contextBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.tensorflow.Features context = 1 [json_name = "context"];</code>
     */
    public Builder clearContext() {
      if (contextBuilder_ == null) {
        context_ = null;
        onChanged();
      } else {
        context_ = null;
        contextBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.tensorflow.Features context = 1 [json_name = "context"];</code>
     */
    public org.tensorflow.example.Features.Builder getContextBuilder() {
      
      onChanged();
      return getContextFieldBuilder().getBuilder();
    }
    /**
     * <code>.tensorflow.Features context = 1 [json_name = "context"];</code>
     */
    public org.tensorflow.example.FeaturesOrBuilder getContextOrBuilder() {
      if (contextBuilder_ != null) {
        return contextBuilder_.getMessageOrBuilder();
      } else {
        return context_ == null ?
            org.tensorflow.example.Features.getDefaultInstance() : context_;
      }
    }
    /**
     * <code>.tensorflow.Features context = 1 [json_name = "context"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.example.Features, org.tensorflow.example.Features.Builder, org.tensorflow.example.FeaturesOrBuilder> 
        getContextFieldBuilder() {
      if (contextBuilder_ == null) {
        contextBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tensorflow.example.Features, org.tensorflow.example.Features.Builder, org.tensorflow.example.FeaturesOrBuilder>(
                getContext(),
                getParentForChildren(),
                isClean());
        context_ = null;
      }
      return contextBuilder_;
    }

    private org.tensorflow.example.FeatureLists featureLists_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.example.FeatureLists, org.tensorflow.example.FeatureLists.Builder, org.tensorflow.example.FeatureListsOrBuilder> featureListsBuilder_;
    /**
     * <code>.tensorflow.FeatureLists feature_lists = 2 [json_name = "featureLists"];</code>
     * @return Whether the featureLists field is set.
     */
    public boolean hasFeatureLists() {
      return featureListsBuilder_ != null || featureLists_ != null;
    }
    /**
     * <code>.tensorflow.FeatureLists feature_lists = 2 [json_name = "featureLists"];</code>
     * @return The featureLists.
     */
    public org.tensorflow.example.FeatureLists getFeatureLists() {
      if (featureListsBuilder_ == null) {
        return featureLists_ == null ? org.tensorflow.example.FeatureLists.getDefaultInstance() : featureLists_;
      } else {
        return featureListsBuilder_.getMessage();
      }
    }
    /**
     * <code>.tensorflow.FeatureLists feature_lists = 2 [json_name = "featureLists"];</code>
     */
    public Builder setFeatureLists(org.tensorflow.example.FeatureLists value) {
      if (featureListsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        featureLists_ = value;
        onChanged();
      } else {
        featureListsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.tensorflow.FeatureLists feature_lists = 2 [json_name = "featureLists"];</code>
     */
    public Builder setFeatureLists(
        org.tensorflow.example.FeatureLists.Builder builderForValue) {
      if (featureListsBuilder_ == null) {
        featureLists_ = builderForValue.build();
        onChanged();
      } else {
        featureListsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.tensorflow.FeatureLists feature_lists = 2 [json_name = "featureLists"];</code>
     */
    public Builder mergeFeatureLists(org.tensorflow.example.FeatureLists value) {
      if (featureListsBuilder_ == null) {
        if (featureLists_ != null) {
          featureLists_ =
            org.tensorflow.example.FeatureLists.newBuilder(featureLists_).mergeFrom(value).buildPartial();
        } else {
          featureLists_ = value;
        }
        onChanged();
      } else {
        featureListsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.tensorflow.FeatureLists feature_lists = 2 [json_name = "featureLists"];</code>
     */
    public Builder clearFeatureLists() {
      if (featureListsBuilder_ == null) {
        featureLists_ = null;
        onChanged();
      } else {
        featureLists_ = null;
        featureListsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.tensorflow.FeatureLists feature_lists = 2 [json_name = "featureLists"];</code>
     */
    public org.tensorflow.example.FeatureLists.Builder getFeatureListsBuilder() {
      
      onChanged();
      return getFeatureListsFieldBuilder().getBuilder();
    }
    /**
     * <code>.tensorflow.FeatureLists feature_lists = 2 [json_name = "featureLists"];</code>
     */
    public org.tensorflow.example.FeatureListsOrBuilder getFeatureListsOrBuilder() {
      if (featureListsBuilder_ != null) {
        return featureListsBuilder_.getMessageOrBuilder();
      } else {
        return featureLists_ == null ?
            org.tensorflow.example.FeatureLists.getDefaultInstance() : featureLists_;
      }
    }
    /**
     * <code>.tensorflow.FeatureLists feature_lists = 2 [json_name = "featureLists"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.example.FeatureLists, org.tensorflow.example.FeatureLists.Builder, org.tensorflow.example.FeatureListsOrBuilder> 
        getFeatureListsFieldBuilder() {
      if (featureListsBuilder_ == null) {
        featureListsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tensorflow.example.FeatureLists, org.tensorflow.example.FeatureLists.Builder, org.tensorflow.example.FeatureListsOrBuilder>(
                getFeatureLists(),
                getParentForChildren(),
                isClean());
        featureLists_ = null;
      }
      return featureListsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.SequenceExample)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.SequenceExample)
  private static final org.tensorflow.example.SequenceExample DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.example.SequenceExample();
  }

  public static org.tensorflow.example.SequenceExample getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SequenceExample>
      PARSER = new com.google.protobuf.AbstractParser<SequenceExample>() {
    @java.lang.Override
    public SequenceExample parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SequenceExample(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SequenceExample> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SequenceExample> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.example.SequenceExample getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

