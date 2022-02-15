// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: asgt/type/train_model_task.proto

package asgt.type;

public final class TrainModelTaskOuterClass {
  private TrainModelTaskOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TrainModelTaskOrBuilder extends
      // @@protoc_insertion_point(interface_extends:asgt.type.TrainModelTask)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.asgt.type.Dataset dataset = 1;</code>
     * @return Whether the dataset field is set.
     */
    boolean hasDataset();
    /**
     * <code>.asgt.type.Dataset dataset = 1;</code>
     * @return The dataset.
     */
    asgt.type.DatasetOuterClass.Dataset getDataset();
    /**
     * <code>.asgt.type.Dataset dataset = 1;</code>
     */
    asgt.type.DatasetOuterClass.DatasetOrBuilder getDatasetOrBuilder();

    /**
     * <code>.asgt.type.Revision revision = 2;</code>
     * @return Whether the revision field is set.
     */
    boolean hasRevision();
    /**
     * <code>.asgt.type.Revision revision = 2;</code>
     * @return The revision.
     */
    asgt.type.RevisionOuterClass.Revision getRevision();
    /**
     * <code>.asgt.type.Revision revision = 2;</code>
     */
    asgt.type.RevisionOuterClass.RevisionOrBuilder getRevisionOrBuilder();

    /**
     * <code>int64 model_version = 4;</code>
     * @return The modelVersion.
     */
    long getModelVersion();
  }
  /**
   * Protobuf type {@code asgt.type.TrainModelTask}
   */
  public static final class TrainModelTask extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:asgt.type.TrainModelTask)
      TrainModelTaskOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TrainModelTask.newBuilder() to construct.
    private TrainModelTask(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TrainModelTask() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TrainModelTask();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TrainModelTask(
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
              asgt.type.DatasetOuterClass.Dataset.Builder subBuilder = null;
              if (dataset_ != null) {
                subBuilder = dataset_.toBuilder();
              }
              dataset_ = input.readMessage(asgt.type.DatasetOuterClass.Dataset.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(dataset_);
                dataset_ = subBuilder.buildPartial();
              }

              break;
            }
            case 18: {
              asgt.type.RevisionOuterClass.Revision.Builder subBuilder = null;
              if (revision_ != null) {
                subBuilder = revision_.toBuilder();
              }
              revision_ = input.readMessage(asgt.type.RevisionOuterClass.Revision.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(revision_);
                revision_ = subBuilder.buildPartial();
              }

              break;
            }
            case 32: {

              modelVersion_ = input.readInt64();
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
      return asgt.type.TrainModelTaskOuterClass.internal_static_asgt_type_TrainModelTask_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return asgt.type.TrainModelTaskOuterClass.internal_static_asgt_type_TrainModelTask_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              asgt.type.TrainModelTaskOuterClass.TrainModelTask.class, asgt.type.TrainModelTaskOuterClass.TrainModelTask.Builder.class);
    }

    public static final int DATASET_FIELD_NUMBER = 1;
    private asgt.type.DatasetOuterClass.Dataset dataset_;
    /**
     * <code>.asgt.type.Dataset dataset = 1;</code>
     * @return Whether the dataset field is set.
     */
    @java.lang.Override
    public boolean hasDataset() {
      return dataset_ != null;
    }
    /**
     * <code>.asgt.type.Dataset dataset = 1;</code>
     * @return The dataset.
     */
    @java.lang.Override
    public asgt.type.DatasetOuterClass.Dataset getDataset() {
      return dataset_ == null ? asgt.type.DatasetOuterClass.Dataset.getDefaultInstance() : dataset_;
    }
    /**
     * <code>.asgt.type.Dataset dataset = 1;</code>
     */
    @java.lang.Override
    public asgt.type.DatasetOuterClass.DatasetOrBuilder getDatasetOrBuilder() {
      return getDataset();
    }

    public static final int REVISION_FIELD_NUMBER = 2;
    private asgt.type.RevisionOuterClass.Revision revision_;
    /**
     * <code>.asgt.type.Revision revision = 2;</code>
     * @return Whether the revision field is set.
     */
    @java.lang.Override
    public boolean hasRevision() {
      return revision_ != null;
    }
    /**
     * <code>.asgt.type.Revision revision = 2;</code>
     * @return The revision.
     */
    @java.lang.Override
    public asgt.type.RevisionOuterClass.Revision getRevision() {
      return revision_ == null ? asgt.type.RevisionOuterClass.Revision.getDefaultInstance() : revision_;
    }
    /**
     * <code>.asgt.type.Revision revision = 2;</code>
     */
    @java.lang.Override
    public asgt.type.RevisionOuterClass.RevisionOrBuilder getRevisionOrBuilder() {
      return getRevision();
    }

    public static final int MODEL_VERSION_FIELD_NUMBER = 4;
    private long modelVersion_;
    /**
     * <code>int64 model_version = 4;</code>
     * @return The modelVersion.
     */
    @java.lang.Override
    public long getModelVersion() {
      return modelVersion_;
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
      if (dataset_ != null) {
        output.writeMessage(1, getDataset());
      }
      if (revision_ != null) {
        output.writeMessage(2, getRevision());
      }
      if (modelVersion_ != 0L) {
        output.writeInt64(4, modelVersion_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (dataset_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getDataset());
      }
      if (revision_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getRevision());
      }
      if (modelVersion_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, modelVersion_);
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
      if (!(obj instanceof asgt.type.TrainModelTaskOuterClass.TrainModelTask)) {
        return super.equals(obj);
      }
      asgt.type.TrainModelTaskOuterClass.TrainModelTask other = (asgt.type.TrainModelTaskOuterClass.TrainModelTask) obj;

      if (hasDataset() != other.hasDataset()) return false;
      if (hasDataset()) {
        if (!getDataset()
            .equals(other.getDataset())) return false;
      }
      if (hasRevision() != other.hasRevision()) return false;
      if (hasRevision()) {
        if (!getRevision()
            .equals(other.getRevision())) return false;
      }
      if (getModelVersion()
          != other.getModelVersion()) return false;
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
      if (hasDataset()) {
        hash = (37 * hash) + DATASET_FIELD_NUMBER;
        hash = (53 * hash) + getDataset().hashCode();
      }
      if (hasRevision()) {
        hash = (37 * hash) + REVISION_FIELD_NUMBER;
        hash = (53 * hash) + getRevision().hashCode();
      }
      hash = (37 * hash) + MODEL_VERSION_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getModelVersion());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static asgt.type.TrainModelTaskOuterClass.TrainModelTask parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static asgt.type.TrainModelTaskOuterClass.TrainModelTask parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static asgt.type.TrainModelTaskOuterClass.TrainModelTask parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static asgt.type.TrainModelTaskOuterClass.TrainModelTask parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static asgt.type.TrainModelTaskOuterClass.TrainModelTask parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static asgt.type.TrainModelTaskOuterClass.TrainModelTask parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static asgt.type.TrainModelTaskOuterClass.TrainModelTask parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static asgt.type.TrainModelTaskOuterClass.TrainModelTask parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static asgt.type.TrainModelTaskOuterClass.TrainModelTask parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static asgt.type.TrainModelTaskOuterClass.TrainModelTask parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static asgt.type.TrainModelTaskOuterClass.TrainModelTask parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static asgt.type.TrainModelTaskOuterClass.TrainModelTask parseFrom(
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
    public static Builder newBuilder(asgt.type.TrainModelTaskOuterClass.TrainModelTask prototype) {
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
     * Protobuf type {@code asgt.type.TrainModelTask}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:asgt.type.TrainModelTask)
        asgt.type.TrainModelTaskOuterClass.TrainModelTaskOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return asgt.type.TrainModelTaskOuterClass.internal_static_asgt_type_TrainModelTask_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return asgt.type.TrainModelTaskOuterClass.internal_static_asgt_type_TrainModelTask_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                asgt.type.TrainModelTaskOuterClass.TrainModelTask.class, asgt.type.TrainModelTaskOuterClass.TrainModelTask.Builder.class);
      }

      // Construct using asgt.type.TrainModelTaskOuterClass.TrainModelTask.newBuilder()
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
        if (datasetBuilder_ == null) {
          dataset_ = null;
        } else {
          dataset_ = null;
          datasetBuilder_ = null;
        }
        if (revisionBuilder_ == null) {
          revision_ = null;
        } else {
          revision_ = null;
          revisionBuilder_ = null;
        }
        modelVersion_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return asgt.type.TrainModelTaskOuterClass.internal_static_asgt_type_TrainModelTask_descriptor;
      }

      @java.lang.Override
      public asgt.type.TrainModelTaskOuterClass.TrainModelTask getDefaultInstanceForType() {
        return asgt.type.TrainModelTaskOuterClass.TrainModelTask.getDefaultInstance();
      }

      @java.lang.Override
      public asgt.type.TrainModelTaskOuterClass.TrainModelTask build() {
        asgt.type.TrainModelTaskOuterClass.TrainModelTask result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public asgt.type.TrainModelTaskOuterClass.TrainModelTask buildPartial() {
        asgt.type.TrainModelTaskOuterClass.TrainModelTask result = new asgt.type.TrainModelTaskOuterClass.TrainModelTask(this);
        if (datasetBuilder_ == null) {
          result.dataset_ = dataset_;
        } else {
          result.dataset_ = datasetBuilder_.build();
        }
        if (revisionBuilder_ == null) {
          result.revision_ = revision_;
        } else {
          result.revision_ = revisionBuilder_.build();
        }
        result.modelVersion_ = modelVersion_;
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
        if (other instanceof asgt.type.TrainModelTaskOuterClass.TrainModelTask) {
          return mergeFrom((asgt.type.TrainModelTaskOuterClass.TrainModelTask)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(asgt.type.TrainModelTaskOuterClass.TrainModelTask other) {
        if (other == asgt.type.TrainModelTaskOuterClass.TrainModelTask.getDefaultInstance()) return this;
        if (other.hasDataset()) {
          mergeDataset(other.getDataset());
        }
        if (other.hasRevision()) {
          mergeRevision(other.getRevision());
        }
        if (other.getModelVersion() != 0L) {
          setModelVersion(other.getModelVersion());
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
        asgt.type.TrainModelTaskOuterClass.TrainModelTask parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (asgt.type.TrainModelTaskOuterClass.TrainModelTask) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private asgt.type.DatasetOuterClass.Dataset dataset_;
      private com.google.protobuf.SingleFieldBuilderV3<
          asgt.type.DatasetOuterClass.Dataset, asgt.type.DatasetOuterClass.Dataset.Builder, asgt.type.DatasetOuterClass.DatasetOrBuilder> datasetBuilder_;
      /**
       * <code>.asgt.type.Dataset dataset = 1;</code>
       * @return Whether the dataset field is set.
       */
      public boolean hasDataset() {
        return datasetBuilder_ != null || dataset_ != null;
      }
      /**
       * <code>.asgt.type.Dataset dataset = 1;</code>
       * @return The dataset.
       */
      public asgt.type.DatasetOuterClass.Dataset getDataset() {
        if (datasetBuilder_ == null) {
          return dataset_ == null ? asgt.type.DatasetOuterClass.Dataset.getDefaultInstance() : dataset_;
        } else {
          return datasetBuilder_.getMessage();
        }
      }
      /**
       * <code>.asgt.type.Dataset dataset = 1;</code>
       */
      public Builder setDataset(asgt.type.DatasetOuterClass.Dataset value) {
        if (datasetBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          dataset_ = value;
          onChanged();
        } else {
          datasetBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.asgt.type.Dataset dataset = 1;</code>
       */
      public Builder setDataset(
          asgt.type.DatasetOuterClass.Dataset.Builder builderForValue) {
        if (datasetBuilder_ == null) {
          dataset_ = builderForValue.build();
          onChanged();
        } else {
          datasetBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.asgt.type.Dataset dataset = 1;</code>
       */
      public Builder mergeDataset(asgt.type.DatasetOuterClass.Dataset value) {
        if (datasetBuilder_ == null) {
          if (dataset_ != null) {
            dataset_ =
              asgt.type.DatasetOuterClass.Dataset.newBuilder(dataset_).mergeFrom(value).buildPartial();
          } else {
            dataset_ = value;
          }
          onChanged();
        } else {
          datasetBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.asgt.type.Dataset dataset = 1;</code>
       */
      public Builder clearDataset() {
        if (datasetBuilder_ == null) {
          dataset_ = null;
          onChanged();
        } else {
          dataset_ = null;
          datasetBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.asgt.type.Dataset dataset = 1;</code>
       */
      public asgt.type.DatasetOuterClass.Dataset.Builder getDatasetBuilder() {
        
        onChanged();
        return getDatasetFieldBuilder().getBuilder();
      }
      /**
       * <code>.asgt.type.Dataset dataset = 1;</code>
       */
      public asgt.type.DatasetOuterClass.DatasetOrBuilder getDatasetOrBuilder() {
        if (datasetBuilder_ != null) {
          return datasetBuilder_.getMessageOrBuilder();
        } else {
          return dataset_ == null ?
              asgt.type.DatasetOuterClass.Dataset.getDefaultInstance() : dataset_;
        }
      }
      /**
       * <code>.asgt.type.Dataset dataset = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          asgt.type.DatasetOuterClass.Dataset, asgt.type.DatasetOuterClass.Dataset.Builder, asgt.type.DatasetOuterClass.DatasetOrBuilder> 
          getDatasetFieldBuilder() {
        if (datasetBuilder_ == null) {
          datasetBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              asgt.type.DatasetOuterClass.Dataset, asgt.type.DatasetOuterClass.Dataset.Builder, asgt.type.DatasetOuterClass.DatasetOrBuilder>(
                  getDataset(),
                  getParentForChildren(),
                  isClean());
          dataset_ = null;
        }
        return datasetBuilder_;
      }

      private asgt.type.RevisionOuterClass.Revision revision_;
      private com.google.protobuf.SingleFieldBuilderV3<
          asgt.type.RevisionOuterClass.Revision, asgt.type.RevisionOuterClass.Revision.Builder, asgt.type.RevisionOuterClass.RevisionOrBuilder> revisionBuilder_;
      /**
       * <code>.asgt.type.Revision revision = 2;</code>
       * @return Whether the revision field is set.
       */
      public boolean hasRevision() {
        return revisionBuilder_ != null || revision_ != null;
      }
      /**
       * <code>.asgt.type.Revision revision = 2;</code>
       * @return The revision.
       */
      public asgt.type.RevisionOuterClass.Revision getRevision() {
        if (revisionBuilder_ == null) {
          return revision_ == null ? asgt.type.RevisionOuterClass.Revision.getDefaultInstance() : revision_;
        } else {
          return revisionBuilder_.getMessage();
        }
      }
      /**
       * <code>.asgt.type.Revision revision = 2;</code>
       */
      public Builder setRevision(asgt.type.RevisionOuterClass.Revision value) {
        if (revisionBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          revision_ = value;
          onChanged();
        } else {
          revisionBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.asgt.type.Revision revision = 2;</code>
       */
      public Builder setRevision(
          asgt.type.RevisionOuterClass.Revision.Builder builderForValue) {
        if (revisionBuilder_ == null) {
          revision_ = builderForValue.build();
          onChanged();
        } else {
          revisionBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.asgt.type.Revision revision = 2;</code>
       */
      public Builder mergeRevision(asgt.type.RevisionOuterClass.Revision value) {
        if (revisionBuilder_ == null) {
          if (revision_ != null) {
            revision_ =
              asgt.type.RevisionOuterClass.Revision.newBuilder(revision_).mergeFrom(value).buildPartial();
          } else {
            revision_ = value;
          }
          onChanged();
        } else {
          revisionBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.asgt.type.Revision revision = 2;</code>
       */
      public Builder clearRevision() {
        if (revisionBuilder_ == null) {
          revision_ = null;
          onChanged();
        } else {
          revision_ = null;
          revisionBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.asgt.type.Revision revision = 2;</code>
       */
      public asgt.type.RevisionOuterClass.Revision.Builder getRevisionBuilder() {
        
        onChanged();
        return getRevisionFieldBuilder().getBuilder();
      }
      /**
       * <code>.asgt.type.Revision revision = 2;</code>
       */
      public asgt.type.RevisionOuterClass.RevisionOrBuilder getRevisionOrBuilder() {
        if (revisionBuilder_ != null) {
          return revisionBuilder_.getMessageOrBuilder();
        } else {
          return revision_ == null ?
              asgt.type.RevisionOuterClass.Revision.getDefaultInstance() : revision_;
        }
      }
      /**
       * <code>.asgt.type.Revision revision = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          asgt.type.RevisionOuterClass.Revision, asgt.type.RevisionOuterClass.Revision.Builder, asgt.type.RevisionOuterClass.RevisionOrBuilder> 
          getRevisionFieldBuilder() {
        if (revisionBuilder_ == null) {
          revisionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              asgt.type.RevisionOuterClass.Revision, asgt.type.RevisionOuterClass.Revision.Builder, asgt.type.RevisionOuterClass.RevisionOrBuilder>(
                  getRevision(),
                  getParentForChildren(),
                  isClean());
          revision_ = null;
        }
        return revisionBuilder_;
      }

      private long modelVersion_ ;
      /**
       * <code>int64 model_version = 4;</code>
       * @return The modelVersion.
       */
      @java.lang.Override
      public long getModelVersion() {
        return modelVersion_;
      }
      /**
       * <code>int64 model_version = 4;</code>
       * @param value The modelVersion to set.
       * @return This builder for chaining.
       */
      public Builder setModelVersion(long value) {
        
        modelVersion_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 model_version = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearModelVersion() {
        
        modelVersion_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:asgt.type.TrainModelTask)
    }

    // @@protoc_insertion_point(class_scope:asgt.type.TrainModelTask)
    private static final asgt.type.TrainModelTaskOuterClass.TrainModelTask DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new asgt.type.TrainModelTaskOuterClass.TrainModelTask();
    }

    public static asgt.type.TrainModelTaskOuterClass.TrainModelTask getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TrainModelTask>
        PARSER = new com.google.protobuf.AbstractParser<TrainModelTask>() {
      @java.lang.Override
      public TrainModelTask parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TrainModelTask(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TrainModelTask> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TrainModelTask> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public asgt.type.TrainModelTaskOuterClass.TrainModelTask getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_asgt_type_TrainModelTask_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_asgt_type_TrainModelTask_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n asgt/type/train_model_task.proto\022\tasgt" +
      ".type\032\027asgt/type/dataset.proto\032\030asgt/typ" +
      "e/revision.proto\"s\n\016TrainModelTask\022#\n\007da" +
      "taset\030\001 \001(\0132\022.asgt.type.Dataset\022%\n\010revis" +
      "ion\030\002 \001(\0132\023.asgt.type.Revision\022\025\n\rmodel_" +
      "version\030\004 \001(\003B8Z6github.com/e-conomic/vm" +
      "lapis/gen/go/asgt/type;asgttypeb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          asgt.type.DatasetOuterClass.getDescriptor(),
          asgt.type.RevisionOuterClass.getDescriptor(),
        });
    internal_static_asgt_type_TrainModelTask_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_asgt_type_TrainModelTask_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_asgt_type_TrainModelTask_descriptor,
        new java.lang.String[] { "Dataset", "Revision", "ModelVersion", });
    asgt.type.DatasetOuterClass.getDescriptor();
    asgt.type.RevisionOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
