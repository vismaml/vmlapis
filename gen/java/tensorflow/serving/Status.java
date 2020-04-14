// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow_serving/util/status.proto

package tensorflow.serving;

public final class Status {
  private Status() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface StatusProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:tensorflow.serving.StatusProto)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Error code.
     * </pre>
     *
     * <code>.tensorflow.error.Code error_code = 1[json_name = "error_code"];</code>
     */
    int getErrorCodeValue();
    /**
     * <pre>
     * Error code.
     * </pre>
     *
     * <code>.tensorflow.error.Code error_code = 1[json_name = "error_code"];</code>
     */
    org.tensorflow.framework.Code getErrorCode();

    /**
     * <pre>
     * Error message. Will only be set if an core was encountered.
     * </pre>
     *
     * <code>string error_message = 2[json_name = "error_message"];</code>
     */
    java.lang.String getErrorMessage();
    /**
     * <pre>
     * Error message. Will only be set if an core was encountered.
     * </pre>
     *
     * <code>string error_message = 2[json_name = "error_message"];</code>
     */
    com.google.protobuf.ByteString
        getErrorMessageBytes();
  }
  /**
   * <pre>
   * Status that corresponds to Status in
   * third_party/tensorflow/core/lib/core/status.h.
   * </pre>
   *
   * Protobuf type {@code tensorflow.serving.StatusProto}
   */
  public  static final class StatusProto extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:tensorflow.serving.StatusProto)
      StatusProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use StatusProto.newBuilder() to construct.
    private StatusProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private StatusProto() {
      errorCode_ = 0;
      errorMessage_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private StatusProto(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 8: {
              int rawValue = input.readEnum();

              errorCode_ = rawValue;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              errorMessage_ = s;
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
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
      return tensorflow.serving.Status.internal_static_tensorflow_serving_StatusProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tensorflow.serving.Status.internal_static_tensorflow_serving_StatusProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tensorflow.serving.Status.StatusProto.class, tensorflow.serving.Status.StatusProto.Builder.class);
    }

    public static final int ERROR_CODE_FIELD_NUMBER = 1;
    private int errorCode_;
    /**
     * <pre>
     * Error code.
     * </pre>
     *
     * <code>.tensorflow.error.Code error_code = 1[json_name = "error_code"];</code>
     */
    public int getErrorCodeValue() {
      return errorCode_;
    }
    /**
     * <pre>
     * Error code.
     * </pre>
     *
     * <code>.tensorflow.error.Code error_code = 1[json_name = "error_code"];</code>
     */
    public org.tensorflow.framework.Code getErrorCode() {
      @SuppressWarnings("deprecation")
      org.tensorflow.framework.Code result = org.tensorflow.framework.Code.valueOf(errorCode_);
      return result == null ? org.tensorflow.framework.Code.UNRECOGNIZED : result;
    }

    public static final int ERROR_MESSAGE_FIELD_NUMBER = 2;
    private volatile java.lang.Object errorMessage_;
    /**
     * <pre>
     * Error message. Will only be set if an core was encountered.
     * </pre>
     *
     * <code>string error_message = 2[json_name = "error_message"];</code>
     */
    public java.lang.String getErrorMessage() {
      java.lang.Object ref = errorMessage_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        errorMessage_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Error message. Will only be set if an core was encountered.
     * </pre>
     *
     * <code>string error_message = 2[json_name = "error_message"];</code>
     */
    public com.google.protobuf.ByteString
        getErrorMessageBytes() {
      java.lang.Object ref = errorMessage_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        errorMessage_ = b;
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
      if (errorCode_ != org.tensorflow.framework.Code.OK.getNumber()) {
        output.writeEnum(1, errorCode_);
      }
      if (!getErrorMessageBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, errorMessage_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (errorCode_ != org.tensorflow.framework.Code.OK.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, errorCode_);
      }
      if (!getErrorMessageBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, errorMessage_);
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
      if (!(obj instanceof tensorflow.serving.Status.StatusProto)) {
        return super.equals(obj);
      }
      tensorflow.serving.Status.StatusProto other = (tensorflow.serving.Status.StatusProto) obj;

      boolean result = true;
      result = result && errorCode_ == other.errorCode_;
      result = result && getErrorMessage()
          .equals(other.getErrorMessage());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ERROR_CODE_FIELD_NUMBER;
      hash = (53 * hash) + errorCode_;
      hash = (37 * hash) + ERROR_MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getErrorMessage().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static tensorflow.serving.Status.StatusProto parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tensorflow.serving.Status.StatusProto parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tensorflow.serving.Status.StatusProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tensorflow.serving.Status.StatusProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tensorflow.serving.Status.StatusProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tensorflow.serving.Status.StatusProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tensorflow.serving.Status.StatusProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static tensorflow.serving.Status.StatusProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static tensorflow.serving.Status.StatusProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static tensorflow.serving.Status.StatusProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static tensorflow.serving.Status.StatusProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static tensorflow.serving.Status.StatusProto parseFrom(
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
    public static Builder newBuilder(tensorflow.serving.Status.StatusProto prototype) {
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
     * <pre>
     * Status that corresponds to Status in
     * third_party/tensorflow/core/lib/core/status.h.
     * </pre>
     *
     * Protobuf type {@code tensorflow.serving.StatusProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:tensorflow.serving.StatusProto)
        tensorflow.serving.Status.StatusProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return tensorflow.serving.Status.internal_static_tensorflow_serving_StatusProto_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return tensorflow.serving.Status.internal_static_tensorflow_serving_StatusProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                tensorflow.serving.Status.StatusProto.class, tensorflow.serving.Status.StatusProto.Builder.class);
      }

      // Construct using tensorflow.serving.Status.StatusProto.newBuilder()
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
        errorCode_ = 0;

        errorMessage_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return tensorflow.serving.Status.internal_static_tensorflow_serving_StatusProto_descriptor;
      }

      @java.lang.Override
      public tensorflow.serving.Status.StatusProto getDefaultInstanceForType() {
        return tensorflow.serving.Status.StatusProto.getDefaultInstance();
      }

      @java.lang.Override
      public tensorflow.serving.Status.StatusProto build() {
        tensorflow.serving.Status.StatusProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public tensorflow.serving.Status.StatusProto buildPartial() {
        tensorflow.serving.Status.StatusProto result = new tensorflow.serving.Status.StatusProto(this);
        result.errorCode_ = errorCode_;
        result.errorMessage_ = errorMessage_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof tensorflow.serving.Status.StatusProto) {
          return mergeFrom((tensorflow.serving.Status.StatusProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(tensorflow.serving.Status.StatusProto other) {
        if (other == tensorflow.serving.Status.StatusProto.getDefaultInstance()) return this;
        if (other.errorCode_ != 0) {
          setErrorCodeValue(other.getErrorCodeValue());
        }
        if (!other.getErrorMessage().isEmpty()) {
          errorMessage_ = other.errorMessage_;
          onChanged();
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
        tensorflow.serving.Status.StatusProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (tensorflow.serving.Status.StatusProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int errorCode_ = 0;
      /**
       * <pre>
       * Error code.
       * </pre>
       *
       * <code>.tensorflow.error.Code error_code = 1[json_name = "error_code"];</code>
       */
      public int getErrorCodeValue() {
        return errorCode_;
      }
      /**
       * <pre>
       * Error code.
       * </pre>
       *
       * <code>.tensorflow.error.Code error_code = 1[json_name = "error_code"];</code>
       */
      public Builder setErrorCodeValue(int value) {
        errorCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Error code.
       * </pre>
       *
       * <code>.tensorflow.error.Code error_code = 1[json_name = "error_code"];</code>
       */
      public org.tensorflow.framework.Code getErrorCode() {
        @SuppressWarnings("deprecation")
        org.tensorflow.framework.Code result = org.tensorflow.framework.Code.valueOf(errorCode_);
        return result == null ? org.tensorflow.framework.Code.UNRECOGNIZED : result;
      }
      /**
       * <pre>
       * Error code.
       * </pre>
       *
       * <code>.tensorflow.error.Code error_code = 1[json_name = "error_code"];</code>
       */
      public Builder setErrorCode(org.tensorflow.framework.Code value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        errorCode_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Error code.
       * </pre>
       *
       * <code>.tensorflow.error.Code error_code = 1[json_name = "error_code"];</code>
       */
      public Builder clearErrorCode() {
        
        errorCode_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object errorMessage_ = "";
      /**
       * <pre>
       * Error message. Will only be set if an core was encountered.
       * </pre>
       *
       * <code>string error_message = 2[json_name = "error_message"];</code>
       */
      public java.lang.String getErrorMessage() {
        java.lang.Object ref = errorMessage_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          errorMessage_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Error message. Will only be set if an core was encountered.
       * </pre>
       *
       * <code>string error_message = 2[json_name = "error_message"];</code>
       */
      public com.google.protobuf.ByteString
          getErrorMessageBytes() {
        java.lang.Object ref = errorMessage_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          errorMessage_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Error message. Will only be set if an core was encountered.
       * </pre>
       *
       * <code>string error_message = 2[json_name = "error_message"];</code>
       */
      public Builder setErrorMessage(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        errorMessage_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Error message. Will only be set if an core was encountered.
       * </pre>
       *
       * <code>string error_message = 2[json_name = "error_message"];</code>
       */
      public Builder clearErrorMessage() {
        
        errorMessage_ = getDefaultInstance().getErrorMessage();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Error message. Will only be set if an core was encountered.
       * </pre>
       *
       * <code>string error_message = 2[json_name = "error_message"];</code>
       */
      public Builder setErrorMessageBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        errorMessage_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:tensorflow.serving.StatusProto)
    }

    // @@protoc_insertion_point(class_scope:tensorflow.serving.StatusProto)
    private static final tensorflow.serving.Status.StatusProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new tensorflow.serving.Status.StatusProto();
    }

    public static tensorflow.serving.Status.StatusProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<StatusProto>
        PARSER = new com.google.protobuf.AbstractParser<StatusProto>() {
      @java.lang.Override
      public StatusProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new StatusProto(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<StatusProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<StatusProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public tensorflow.serving.Status.StatusProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_serving_StatusProto_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_serving_StatusProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$tensorflow_serving/util/status.proto\022\022" +
      "tensorflow.serving\032*tensorflow/core/prot" +
      "obuf/error_codes.proto\"k\n\013StatusProto\0226\n" +
      "\nerror_code\030\001 \001(\0162\026.tensorflow.error.Cod" +
      "eR\nerror_code\022$\n\rerror_message\030\002 \001(\tR\rer" +
      "ror_messageB\003\370\001\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.tensorflow.framework.ErrorCodesProtos.getDescriptor(),
        }, assigner);
    internal_static_tensorflow_serving_StatusProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_serving_StatusProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_serving_StatusProto_descriptor,
        new java.lang.String[] { "ErrorCode", "ErrorMessage", });
    org.tensorflow.framework.ErrorCodesProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
