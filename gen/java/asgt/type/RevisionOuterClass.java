// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: asgt/type/revision.proto

package asgt.type;

public final class RevisionOuterClass {
  private RevisionOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RevisionOrBuilder extends
      // @@protoc_insertion_point(interface_extends:asgt.type.Revision)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 number = 1 [json_name = "number"];</code>
     * @return The number.
     */
    long getNumber();

    /**
     * <code>.google.protobuf.Timestamp created_at = 2 [json_name = "createdAt"];</code>
     * @return Whether the createdAt field is set.
     */
    boolean hasCreatedAt();
    /**
     * <code>.google.protobuf.Timestamp created_at = 2 [json_name = "createdAt"];</code>
     * @return The createdAt.
     */
    com.google.protobuf.Timestamp getCreatedAt();
    /**
     * <code>.google.protobuf.Timestamp created_at = 2 [json_name = "createdAt"];</code>
     */
    com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

    /**
     * <pre>
     * Number of samples added to the dataset in this revision
     * </pre>
     *
     * <code>int64 size = 3 [json_name = "size"];</code>
     * @return The size.
     */
    long getSize();
  }
  /**
   * Protobuf type {@code asgt.type.Revision}
   */
  public static final class Revision extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:asgt.type.Revision)
      RevisionOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Revision.newBuilder() to construct.
    private Revision(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Revision() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Revision();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return asgt.type.RevisionOuterClass.internal_static_asgt_type_Revision_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return asgt.type.RevisionOuterClass.internal_static_asgt_type_Revision_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              asgt.type.RevisionOuterClass.Revision.class, asgt.type.RevisionOuterClass.Revision.Builder.class);
    }

    public static final int NUMBER_FIELD_NUMBER = 1;
    private long number_;
    /**
     * <code>int64 number = 1 [json_name = "number"];</code>
     * @return The number.
     */
    @java.lang.Override
    public long getNumber() {
      return number_;
    }

    public static final int CREATED_AT_FIELD_NUMBER = 2;
    private com.google.protobuf.Timestamp createdAt_;
    /**
     * <code>.google.protobuf.Timestamp created_at = 2 [json_name = "createdAt"];</code>
     * @return Whether the createdAt field is set.
     */
    @java.lang.Override
    public boolean hasCreatedAt() {
      return createdAt_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp created_at = 2 [json_name = "createdAt"];</code>
     * @return The createdAt.
     */
    @java.lang.Override
    public com.google.protobuf.Timestamp getCreatedAt() {
      return createdAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createdAt_;
    }
    /**
     * <code>.google.protobuf.Timestamp created_at = 2 [json_name = "createdAt"];</code>
     */
    @java.lang.Override
    public com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder() {
      return getCreatedAt();
    }

    public static final int SIZE_FIELD_NUMBER = 3;
    private long size_;
    /**
     * <pre>
     * Number of samples added to the dataset in this revision
     * </pre>
     *
     * <code>int64 size = 3 [json_name = "size"];</code>
     * @return The size.
     */
    @java.lang.Override
    public long getSize() {
      return size_;
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
      if (number_ != 0L) {
        output.writeInt64(1, number_);
      }
      if (createdAt_ != null) {
        output.writeMessage(2, getCreatedAt());
      }
      if (size_ != 0L) {
        output.writeInt64(3, size_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (number_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, number_);
      }
      if (createdAt_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getCreatedAt());
      }
      if (size_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, size_);
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
      if (!(obj instanceof asgt.type.RevisionOuterClass.Revision)) {
        return super.equals(obj);
      }
      asgt.type.RevisionOuterClass.Revision other = (asgt.type.RevisionOuterClass.Revision) obj;

      if (getNumber()
          != other.getNumber()) return false;
      if (hasCreatedAt() != other.hasCreatedAt()) return false;
      if (hasCreatedAt()) {
        if (!getCreatedAt()
            .equals(other.getCreatedAt())) return false;
      }
      if (getSize()
          != other.getSize()) return false;
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
      hash = (37 * hash) + NUMBER_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getNumber());
      if (hasCreatedAt()) {
        hash = (37 * hash) + CREATED_AT_FIELD_NUMBER;
        hash = (53 * hash) + getCreatedAt().hashCode();
      }
      hash = (37 * hash) + SIZE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getSize());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static asgt.type.RevisionOuterClass.Revision parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static asgt.type.RevisionOuterClass.Revision parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static asgt.type.RevisionOuterClass.Revision parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static asgt.type.RevisionOuterClass.Revision parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static asgt.type.RevisionOuterClass.Revision parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static asgt.type.RevisionOuterClass.Revision parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static asgt.type.RevisionOuterClass.Revision parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static asgt.type.RevisionOuterClass.Revision parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static asgt.type.RevisionOuterClass.Revision parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static asgt.type.RevisionOuterClass.Revision parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static asgt.type.RevisionOuterClass.Revision parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static asgt.type.RevisionOuterClass.Revision parseFrom(
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
    public static Builder newBuilder(asgt.type.RevisionOuterClass.Revision prototype) {
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
     * Protobuf type {@code asgt.type.Revision}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:asgt.type.Revision)
        asgt.type.RevisionOuterClass.RevisionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return asgt.type.RevisionOuterClass.internal_static_asgt_type_Revision_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return asgt.type.RevisionOuterClass.internal_static_asgt_type_Revision_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                asgt.type.RevisionOuterClass.Revision.class, asgt.type.RevisionOuterClass.Revision.Builder.class);
      }

      // Construct using asgt.type.RevisionOuterClass.Revision.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        number_ = 0L;

        if (createdAtBuilder_ == null) {
          createdAt_ = null;
        } else {
          createdAt_ = null;
          createdAtBuilder_ = null;
        }
        size_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return asgt.type.RevisionOuterClass.internal_static_asgt_type_Revision_descriptor;
      }

      @java.lang.Override
      public asgt.type.RevisionOuterClass.Revision getDefaultInstanceForType() {
        return asgt.type.RevisionOuterClass.Revision.getDefaultInstance();
      }

      @java.lang.Override
      public asgt.type.RevisionOuterClass.Revision build() {
        asgt.type.RevisionOuterClass.Revision result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public asgt.type.RevisionOuterClass.Revision buildPartial() {
        asgt.type.RevisionOuterClass.Revision result = new asgt.type.RevisionOuterClass.Revision(this);
        result.number_ = number_;
        if (createdAtBuilder_ == null) {
          result.createdAt_ = createdAt_;
        } else {
          result.createdAt_ = createdAtBuilder_.build();
        }
        result.size_ = size_;
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
        if (other instanceof asgt.type.RevisionOuterClass.Revision) {
          return mergeFrom((asgt.type.RevisionOuterClass.Revision)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(asgt.type.RevisionOuterClass.Revision other) {
        if (other == asgt.type.RevisionOuterClass.Revision.getDefaultInstance()) return this;
        if (other.getNumber() != 0L) {
          setNumber(other.getNumber());
        }
        if (other.hasCreatedAt()) {
          mergeCreatedAt(other.getCreatedAt());
        }
        if (other.getSize() != 0L) {
          setSize(other.getSize());
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
                number_ = input.readInt64();

                break;
              } // case 8
              case 18: {
                input.readMessage(
                    getCreatedAtFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 18
              case 24: {
                size_ = input.readInt64();

                break;
              } // case 24
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

      private long number_ ;
      /**
       * <code>int64 number = 1 [json_name = "number"];</code>
       * @return The number.
       */
      @java.lang.Override
      public long getNumber() {
        return number_;
      }
      /**
       * <code>int64 number = 1 [json_name = "number"];</code>
       * @param value The number to set.
       * @return This builder for chaining.
       */
      public Builder setNumber(long value) {
        
        number_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 number = 1 [json_name = "number"];</code>
       * @return This builder for chaining.
       */
      public Builder clearNumber() {
        
        number_ = 0L;
        onChanged();
        return this;
      }

      private com.google.protobuf.Timestamp createdAt_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> createdAtBuilder_;
      /**
       * <code>.google.protobuf.Timestamp created_at = 2 [json_name = "createdAt"];</code>
       * @return Whether the createdAt field is set.
       */
      public boolean hasCreatedAt() {
        return createdAtBuilder_ != null || createdAt_ != null;
      }
      /**
       * <code>.google.protobuf.Timestamp created_at = 2 [json_name = "createdAt"];</code>
       * @return The createdAt.
       */
      public com.google.protobuf.Timestamp getCreatedAt() {
        if (createdAtBuilder_ == null) {
          return createdAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createdAt_;
        } else {
          return createdAtBuilder_.getMessage();
        }
      }
      /**
       * <code>.google.protobuf.Timestamp created_at = 2 [json_name = "createdAt"];</code>
       */
      public Builder setCreatedAt(com.google.protobuf.Timestamp value) {
        if (createdAtBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          createdAt_ = value;
          onChanged();
        } else {
          createdAtBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp created_at = 2 [json_name = "createdAt"];</code>
       */
      public Builder setCreatedAt(
          com.google.protobuf.Timestamp.Builder builderForValue) {
        if (createdAtBuilder_ == null) {
          createdAt_ = builderForValue.build();
          onChanged();
        } else {
          createdAtBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp created_at = 2 [json_name = "createdAt"];</code>
       */
      public Builder mergeCreatedAt(com.google.protobuf.Timestamp value) {
        if (createdAtBuilder_ == null) {
          if (createdAt_ != null) {
            createdAt_ =
              com.google.protobuf.Timestamp.newBuilder(createdAt_).mergeFrom(value).buildPartial();
          } else {
            createdAt_ = value;
          }
          onChanged();
        } else {
          createdAtBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp created_at = 2 [json_name = "createdAt"];</code>
       */
      public Builder clearCreatedAt() {
        if (createdAtBuilder_ == null) {
          createdAt_ = null;
          onChanged();
        } else {
          createdAt_ = null;
          createdAtBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp created_at = 2 [json_name = "createdAt"];</code>
       */
      public com.google.protobuf.Timestamp.Builder getCreatedAtBuilder() {
        
        onChanged();
        return getCreatedAtFieldBuilder().getBuilder();
      }
      /**
       * <code>.google.protobuf.Timestamp created_at = 2 [json_name = "createdAt"];</code>
       */
      public com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder() {
        if (createdAtBuilder_ != null) {
          return createdAtBuilder_.getMessageOrBuilder();
        } else {
          return createdAt_ == null ?
              com.google.protobuf.Timestamp.getDefaultInstance() : createdAt_;
        }
      }
      /**
       * <code>.google.protobuf.Timestamp created_at = 2 [json_name = "createdAt"];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
          getCreatedAtFieldBuilder() {
        if (createdAtBuilder_ == null) {
          createdAtBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                  getCreatedAt(),
                  getParentForChildren(),
                  isClean());
          createdAt_ = null;
        }
        return createdAtBuilder_;
      }

      private long size_ ;
      /**
       * <pre>
       * Number of samples added to the dataset in this revision
       * </pre>
       *
       * <code>int64 size = 3 [json_name = "size"];</code>
       * @return The size.
       */
      @java.lang.Override
      public long getSize() {
        return size_;
      }
      /**
       * <pre>
       * Number of samples added to the dataset in this revision
       * </pre>
       *
       * <code>int64 size = 3 [json_name = "size"];</code>
       * @param value The size to set.
       * @return This builder for chaining.
       */
      public Builder setSize(long value) {
        
        size_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Number of samples added to the dataset in this revision
       * </pre>
       *
       * <code>int64 size = 3 [json_name = "size"];</code>
       * @return This builder for chaining.
       */
      public Builder clearSize() {
        
        size_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:asgt.type.Revision)
    }

    // @@protoc_insertion_point(class_scope:asgt.type.Revision)
    private static final asgt.type.RevisionOuterClass.Revision DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new asgt.type.RevisionOuterClass.Revision();
    }

    public static asgt.type.RevisionOuterClass.Revision getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Revision>
        PARSER = new com.google.protobuf.AbstractParser<Revision>() {
      @java.lang.Override
      public Revision parsePartialFrom(
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

    public static com.google.protobuf.Parser<Revision> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Revision> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public asgt.type.RevisionOuterClass.Revision getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_asgt_type_Revision_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_asgt_type_Revision_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030asgt/type/revision.proto\022\tasgt.type\032\037g" +
      "oogle/protobuf/timestamp.proto\"q\n\010Revisi" +
      "on\022\026\n\006number\030\001 \001(\003R\006number\0229\n\ncreated_at" +
      "\030\002 \001(\0132\032.google.protobuf.TimestampR\tcrea" +
      "tedAt\022\022\n\004size\030\003 \001(\003R\004sizeB8Z6github.com/" +
      "e-conomic/vmlapis/gen/go/asgt/type;asgtt" +
      "ypeb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_asgt_type_Revision_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_asgt_type_Revision_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_asgt_type_Revision_descriptor,
        new java.lang.String[] { "Number", "CreatedAt", "Size", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
