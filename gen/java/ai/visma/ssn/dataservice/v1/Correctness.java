// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: ssn/dataservice/v1/dataservice.proto
// Protobuf Java Version: 4.29.3

package ai.visma.ssn.dataservice.v1;

/**
 * Protobuf type {@code ssn.dataservice.v1.Correctness}
 */
public final class Correctness extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:ssn.dataservice.v1.Correctness)
    CorrectnessOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      Correctness.class.getName());
  }
  // Use Correctness.newBuilder() to construct.
  private Correctness(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Correctness() {
    field_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.visma.ssn.dataservice.v1.DataserviceProto.internal_static_ssn_dataservice_v1_Correctness_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.visma.ssn.dataservice.v1.DataserviceProto.internal_static_ssn_dataservice_v1_Correctness_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.visma.ssn.dataservice.v1.Correctness.class, ai.visma.ssn.dataservice.v1.Correctness.Builder.class);
  }

  public static final int FIELD_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object field_ = "";
  /**
   * <code>string field = 1 [json_name = "field"];</code>
   * @return The field.
   */
  @java.lang.Override
  public java.lang.String getField() {
    java.lang.Object ref = field_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      field_ = s;
      return s;
    }
  }
  /**
   * <code>string field = 1 [json_name = "field"];</code>
   * @return The bytes for field.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFieldBytes() {
    java.lang.Object ref = field_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      field_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CORRECT_PERCENTAGE_FIELD_NUMBER = 2;
  private float correctPercentage_ = 0F;
  /**
   * <code>float correct_percentage = 2 [json_name = "correctPercentage"];</code>
   * @return The correctPercentage.
   */
  @java.lang.Override
  public float getCorrectPercentage() {
    return correctPercentage_;
  }

  public static final int INCOMPLETE_PERCENTAGE_FIELD_NUMBER = 3;
  private float incompletePercentage_ = 0F;
  /**
   * <code>float incomplete_percentage = 3 [json_name = "incompletePercentage"];</code>
   * @return The incompletePercentage.
   */
  @java.lang.Override
  public float getIncompletePercentage() {
    return incompletePercentage_;
  }

  public static final int ERROR_PERCENTAGE_FIELD_NUMBER = 4;
  private float errorPercentage_ = 0F;
  /**
   * <code>float error_percentage = 4 [json_name = "errorPercentage"];</code>
   * @return The errorPercentage.
   */
  @java.lang.Override
  public float getErrorPercentage() {
    return errorPercentage_;
  }

  public static final int SUPPORT_FIELD_NUMBER = 5;
  private int support_ = 0;
  /**
   * <code>int32 support = 5 [json_name = "support"];</code>
   * @return The support.
   */
  @java.lang.Override
  public int getSupport() {
    return support_;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(field_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, field_);
    }
    if (java.lang.Float.floatToRawIntBits(correctPercentage_) != 0) {
      output.writeFloat(2, correctPercentage_);
    }
    if (java.lang.Float.floatToRawIntBits(incompletePercentage_) != 0) {
      output.writeFloat(3, incompletePercentage_);
    }
    if (java.lang.Float.floatToRawIntBits(errorPercentage_) != 0) {
      output.writeFloat(4, errorPercentage_);
    }
    if (support_ != 0) {
      output.writeInt32(5, support_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(field_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, field_);
    }
    if (java.lang.Float.floatToRawIntBits(correctPercentage_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, correctPercentage_);
    }
    if (java.lang.Float.floatToRawIntBits(incompletePercentage_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, incompletePercentage_);
    }
    if (java.lang.Float.floatToRawIntBits(errorPercentage_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, errorPercentage_);
    }
    if (support_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, support_);
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
    if (!(obj instanceof ai.visma.ssn.dataservice.v1.Correctness)) {
      return super.equals(obj);
    }
    ai.visma.ssn.dataservice.v1.Correctness other = (ai.visma.ssn.dataservice.v1.Correctness) obj;

    if (!getField()
        .equals(other.getField())) return false;
    if (java.lang.Float.floatToIntBits(getCorrectPercentage())
        != java.lang.Float.floatToIntBits(
            other.getCorrectPercentage())) return false;
    if (java.lang.Float.floatToIntBits(getIncompletePercentage())
        != java.lang.Float.floatToIntBits(
            other.getIncompletePercentage())) return false;
    if (java.lang.Float.floatToIntBits(getErrorPercentage())
        != java.lang.Float.floatToIntBits(
            other.getErrorPercentage())) return false;
    if (getSupport()
        != other.getSupport()) return false;
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
    hash = (37 * hash) + FIELD_FIELD_NUMBER;
    hash = (53 * hash) + getField().hashCode();
    hash = (37 * hash) + CORRECT_PERCENTAGE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getCorrectPercentage());
    hash = (37 * hash) + INCOMPLETE_PERCENTAGE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getIncompletePercentage());
    hash = (37 * hash) + ERROR_PERCENTAGE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getErrorPercentage());
    hash = (37 * hash) + SUPPORT_FIELD_NUMBER;
    hash = (53 * hash) + getSupport();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.visma.ssn.dataservice.v1.Correctness parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.ssn.dataservice.v1.Correctness parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.ssn.dataservice.v1.Correctness parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.ssn.dataservice.v1.Correctness parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.ssn.dataservice.v1.Correctness parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.visma.ssn.dataservice.v1.Correctness parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.visma.ssn.dataservice.v1.Correctness parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.visma.ssn.dataservice.v1.Correctness parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ai.visma.ssn.dataservice.v1.Correctness parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ai.visma.ssn.dataservice.v1.Correctness parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.visma.ssn.dataservice.v1.Correctness parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ai.visma.ssn.dataservice.v1.Correctness parseFrom(
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
  public static Builder newBuilder(ai.visma.ssn.dataservice.v1.Correctness prototype) {
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
   * Protobuf type {@code ssn.dataservice.v1.Correctness}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ssn.dataservice.v1.Correctness)
      ai.visma.ssn.dataservice.v1.CorrectnessOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.visma.ssn.dataservice.v1.DataserviceProto.internal_static_ssn_dataservice_v1_Correctness_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.visma.ssn.dataservice.v1.DataserviceProto.internal_static_ssn_dataservice_v1_Correctness_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.visma.ssn.dataservice.v1.Correctness.class, ai.visma.ssn.dataservice.v1.Correctness.Builder.class);
    }

    // Construct using ai.visma.ssn.dataservice.v1.Correctness.newBuilder()
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
      field_ = "";
      correctPercentage_ = 0F;
      incompletePercentage_ = 0F;
      errorPercentage_ = 0F;
      support_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.visma.ssn.dataservice.v1.DataserviceProto.internal_static_ssn_dataservice_v1_Correctness_descriptor;
    }

    @java.lang.Override
    public ai.visma.ssn.dataservice.v1.Correctness getDefaultInstanceForType() {
      return ai.visma.ssn.dataservice.v1.Correctness.getDefaultInstance();
    }

    @java.lang.Override
    public ai.visma.ssn.dataservice.v1.Correctness build() {
      ai.visma.ssn.dataservice.v1.Correctness result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.visma.ssn.dataservice.v1.Correctness buildPartial() {
      ai.visma.ssn.dataservice.v1.Correctness result = new ai.visma.ssn.dataservice.v1.Correctness(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ai.visma.ssn.dataservice.v1.Correctness result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.field_ = field_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.correctPercentage_ = correctPercentage_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.incompletePercentage_ = incompletePercentage_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.errorPercentage_ = errorPercentage_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.support_ = support_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ai.visma.ssn.dataservice.v1.Correctness) {
        return mergeFrom((ai.visma.ssn.dataservice.v1.Correctness)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.visma.ssn.dataservice.v1.Correctness other) {
      if (other == ai.visma.ssn.dataservice.v1.Correctness.getDefaultInstance()) return this;
      if (!other.getField().isEmpty()) {
        field_ = other.field_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getCorrectPercentage() != 0F) {
        setCorrectPercentage(other.getCorrectPercentage());
      }
      if (other.getIncompletePercentage() != 0F) {
        setIncompletePercentage(other.getIncompletePercentage());
      }
      if (other.getErrorPercentage() != 0F) {
        setErrorPercentage(other.getErrorPercentage());
      }
      if (other.getSupport() != 0) {
        setSupport(other.getSupport());
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
              field_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 21: {
              correctPercentage_ = input.readFloat();
              bitField0_ |= 0x00000002;
              break;
            } // case 21
            case 29: {
              incompletePercentage_ = input.readFloat();
              bitField0_ |= 0x00000004;
              break;
            } // case 29
            case 37: {
              errorPercentage_ = input.readFloat();
              bitField0_ |= 0x00000008;
              break;
            } // case 37
            case 40: {
              support_ = input.readInt32();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
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

    private java.lang.Object field_ = "";
    /**
     * <code>string field = 1 [json_name = "field"];</code>
     * @return The field.
     */
    public java.lang.String getField() {
      java.lang.Object ref = field_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        field_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string field = 1 [json_name = "field"];</code>
     * @return The bytes for field.
     */
    public com.google.protobuf.ByteString
        getFieldBytes() {
      java.lang.Object ref = field_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        field_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string field = 1 [json_name = "field"];</code>
     * @param value The field to set.
     * @return This builder for chaining.
     */
    public Builder setField(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      field_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string field = 1 [json_name = "field"];</code>
     * @return This builder for chaining.
     */
    public Builder clearField() {
      field_ = getDefaultInstance().getField();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string field = 1 [json_name = "field"];</code>
     * @param value The bytes for field to set.
     * @return This builder for chaining.
     */
    public Builder setFieldBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      field_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private float correctPercentage_ ;
    /**
     * <code>float correct_percentage = 2 [json_name = "correctPercentage"];</code>
     * @return The correctPercentage.
     */
    @java.lang.Override
    public float getCorrectPercentage() {
      return correctPercentage_;
    }
    /**
     * <code>float correct_percentage = 2 [json_name = "correctPercentage"];</code>
     * @param value The correctPercentage to set.
     * @return This builder for chaining.
     */
    public Builder setCorrectPercentage(float value) {

      correctPercentage_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>float correct_percentage = 2 [json_name = "correctPercentage"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCorrectPercentage() {
      bitField0_ = (bitField0_ & ~0x00000002);
      correctPercentage_ = 0F;
      onChanged();
      return this;
    }

    private float incompletePercentage_ ;
    /**
     * <code>float incomplete_percentage = 3 [json_name = "incompletePercentage"];</code>
     * @return The incompletePercentage.
     */
    @java.lang.Override
    public float getIncompletePercentage() {
      return incompletePercentage_;
    }
    /**
     * <code>float incomplete_percentage = 3 [json_name = "incompletePercentage"];</code>
     * @param value The incompletePercentage to set.
     * @return This builder for chaining.
     */
    public Builder setIncompletePercentage(float value) {

      incompletePercentage_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>float incomplete_percentage = 3 [json_name = "incompletePercentage"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIncompletePercentage() {
      bitField0_ = (bitField0_ & ~0x00000004);
      incompletePercentage_ = 0F;
      onChanged();
      return this;
    }

    private float errorPercentage_ ;
    /**
     * <code>float error_percentage = 4 [json_name = "errorPercentage"];</code>
     * @return The errorPercentage.
     */
    @java.lang.Override
    public float getErrorPercentage() {
      return errorPercentage_;
    }
    /**
     * <code>float error_percentage = 4 [json_name = "errorPercentage"];</code>
     * @param value The errorPercentage to set.
     * @return This builder for chaining.
     */
    public Builder setErrorPercentage(float value) {

      errorPercentage_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>float error_percentage = 4 [json_name = "errorPercentage"];</code>
     * @return This builder for chaining.
     */
    public Builder clearErrorPercentage() {
      bitField0_ = (bitField0_ & ~0x00000008);
      errorPercentage_ = 0F;
      onChanged();
      return this;
    }

    private int support_ ;
    /**
     * <code>int32 support = 5 [json_name = "support"];</code>
     * @return The support.
     */
    @java.lang.Override
    public int getSupport() {
      return support_;
    }
    /**
     * <code>int32 support = 5 [json_name = "support"];</code>
     * @param value The support to set.
     * @return This builder for chaining.
     */
    public Builder setSupport(int value) {

      support_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>int32 support = 5 [json_name = "support"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSupport() {
      bitField0_ = (bitField0_ & ~0x00000010);
      support_ = 0;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:ssn.dataservice.v1.Correctness)
  }

  // @@protoc_insertion_point(class_scope:ssn.dataservice.v1.Correctness)
  private static final ai.visma.ssn.dataservice.v1.Correctness DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.visma.ssn.dataservice.v1.Correctness();
  }

  public static ai.visma.ssn.dataservice.v1.Correctness getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Correctness>
      PARSER = new com.google.protobuf.AbstractParser<Correctness>() {
    @java.lang.Override
    public Correctness parsePartialFrom(
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

  public static com.google.protobuf.Parser<Correctness> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Correctness> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.visma.ssn.dataservice.v1.Correctness getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

