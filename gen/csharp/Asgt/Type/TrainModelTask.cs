// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: asgt/type/train_model_task.proto
// </auto-generated>
#pragma warning disable 1591, 0612, 3021, 8981
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
namespace Asgt.Type {

  /// <summary>Holder for reflection information generated from asgt/type/train_model_task.proto</summary>
  public static partial class TrainModelTaskReflection {

    #region Descriptor
    /// <summary>File descriptor for asgt/type/train_model_task.proto</summary>
    public static pbr::FileDescriptor Descriptor {
      get { return descriptor; }
    }
    private static pbr::FileDescriptor descriptor;

    static TrainModelTaskReflection() {
      byte[] descriptorData = global::System.Convert.FromBase64String(
          string.Concat(
            "CiBhc2d0L3R5cGUvdHJhaW5fbW9kZWxfdGFzay5wcm90bxIJYXNndC50eXBl",
            "Ghdhc2d0L3R5cGUvZGF0YXNldC5wcm90bxoYYXNndC90eXBlL3JldmlzaW9u",
            "LnByb3RvIpQBCg5UcmFpbk1vZGVsVGFzaxIsCgdkYXRhc2V0GAEgASgLMhIu",
            "YXNndC50eXBlLkRhdGFzZXRSB2RhdGFzZXQSLwoIcmV2aXNpb24YAiABKAsy",
            "Ey5hc2d0LnR5cGUuUmV2aXNpb25SCHJldmlzaW9uEiMKDW1vZGVsX3ZlcnNp",
            "b24YBCABKANSDG1vZGVsVmVyc2lvbkKmAQoSYWkudmlzbWEuYXNndC50eXBl",
            "QhNUcmFpbk1vZGVsVGFza1Byb3RvUAFaNmdpdGh1Yi5jb20vZS1jb25vbWlj",
            "L3ZtbGFwaXMvZ2VuL2dvL2FzZ3QvdHlwZTthc2d0dHlwZaICA0FUWKoCCUFz",
            "Z3QuVHlwZcoCCUFzZ3RcVHlwZeICFUFzZ3RcVHlwZVxHUEJNZXRhZGF0YeoC",
            "CkFzZ3Q6OlR5cGViBnByb3RvMw=="));
      descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
          new pbr::FileDescriptor[] { global::Asgt.Type.DatasetReflection.Descriptor, global::Asgt.Type.RevisionReflection.Descriptor, },
          new pbr::GeneratedClrTypeInfo(null, null, new pbr::GeneratedClrTypeInfo[] {
            new pbr::GeneratedClrTypeInfo(typeof(global::Asgt.Type.TrainModelTask), global::Asgt.Type.TrainModelTask.Parser, new[]{ "Dataset", "Revision", "ModelVersion" }, null, null, null, null)
          }));
    }
    #endregion

  }
  #region Messages
  [global::System.Diagnostics.DebuggerDisplayAttribute("{ToString(),nq}")]
  public sealed partial class TrainModelTask : pb::IMessage<TrainModelTask>
  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      , pb::IBufferMessage
  #endif
  {
    private static readonly pb::MessageParser<TrainModelTask> _parser = new pb::MessageParser<TrainModelTask>(() => new TrainModelTask());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static pb::MessageParser<TrainModelTask> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::Asgt.Type.TrainModelTaskReflection.Descriptor.MessageTypes[0]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public TrainModelTask() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public TrainModelTask(TrainModelTask other) : this() {
      dataset_ = other.dataset_ != null ? other.dataset_.Clone() : null;
      revision_ = other.revision_ != null ? other.revision_.Clone() : null;
      modelVersion_ = other.modelVersion_;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public TrainModelTask Clone() {
      return new TrainModelTask(this);
    }

    /// <summary>Field number for the "dataset" field.</summary>
    public const int DatasetFieldNumber = 1;
    private global::Asgt.Type.Dataset dataset_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public global::Asgt.Type.Dataset Dataset {
      get { return dataset_; }
      set {
        dataset_ = value;
      }
    }

    /// <summary>Field number for the "revision" field.</summary>
    public const int RevisionFieldNumber = 2;
    private global::Asgt.Type.Revision revision_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public global::Asgt.Type.Revision Revision {
      get { return revision_; }
      set {
        revision_ = value;
      }
    }

    /// <summary>Field number for the "model_version" field.</summary>
    public const int ModelVersionFieldNumber = 4;
    private long modelVersion_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public long ModelVersion {
      get { return modelVersion_; }
      set {
        modelVersion_ = value;
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override bool Equals(object other) {
      return Equals(other as TrainModelTask);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public bool Equals(TrainModelTask other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (!object.Equals(Dataset, other.Dataset)) return false;
      if (!object.Equals(Revision, other.Revision)) return false;
      if (ModelVersion != other.ModelVersion) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override int GetHashCode() {
      int hash = 1;
      if (dataset_ != null) hash ^= Dataset.GetHashCode();
      if (revision_ != null) hash ^= Revision.GetHashCode();
      if (ModelVersion != 0L) hash ^= ModelVersion.GetHashCode();
      if (_unknownFields != null) {
        hash ^= _unknownFields.GetHashCode();
      }
      return hash;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override string ToString() {
      return pb::JsonFormatter.ToDiagnosticString(this);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public void WriteTo(pb::CodedOutputStream output) {
    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      output.WriteRawMessage(this);
    #else
      if (dataset_ != null) {
        output.WriteRawTag(10);
        output.WriteMessage(Dataset);
      }
      if (revision_ != null) {
        output.WriteRawTag(18);
        output.WriteMessage(Revision);
      }
      if (ModelVersion != 0L) {
        output.WriteRawTag(32);
        output.WriteInt64(ModelVersion);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    #endif
    }

    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    void pb::IBufferMessage.InternalWriteTo(ref pb::WriteContext output) {
      if (dataset_ != null) {
        output.WriteRawTag(10);
        output.WriteMessage(Dataset);
      }
      if (revision_ != null) {
        output.WriteRawTag(18);
        output.WriteMessage(Revision);
      }
      if (ModelVersion != 0L) {
        output.WriteRawTag(32);
        output.WriteInt64(ModelVersion);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(ref output);
      }
    }
    #endif

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public int CalculateSize() {
      int size = 0;
      if (dataset_ != null) {
        size += 1 + pb::CodedOutputStream.ComputeMessageSize(Dataset);
      }
      if (revision_ != null) {
        size += 1 + pb::CodedOutputStream.ComputeMessageSize(Revision);
      }
      if (ModelVersion != 0L) {
        size += 1 + pb::CodedOutputStream.ComputeInt64Size(ModelVersion);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public void MergeFrom(TrainModelTask other) {
      if (other == null) {
        return;
      }
      if (other.dataset_ != null) {
        if (dataset_ == null) {
          Dataset = new global::Asgt.Type.Dataset();
        }
        Dataset.MergeFrom(other.Dataset);
      }
      if (other.revision_ != null) {
        if (revision_ == null) {
          Revision = new global::Asgt.Type.Revision();
        }
        Revision.MergeFrom(other.Revision);
      }
      if (other.ModelVersion != 0L) {
        ModelVersion = other.ModelVersion;
      }
      _unknownFields = pb::UnknownFieldSet.MergeFrom(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public void MergeFrom(pb::CodedInputStream input) {
    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      input.ReadRawMessage(this);
    #else
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
      if ((tag & 7) == 4) {
        // Abort on any end group tag.
        return;
      }
      switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, input);
            break;
          case 10: {
            if (dataset_ == null) {
              Dataset = new global::Asgt.Type.Dataset();
            }
            input.ReadMessage(Dataset);
            break;
          }
          case 18: {
            if (revision_ == null) {
              Revision = new global::Asgt.Type.Revision();
            }
            input.ReadMessage(Revision);
            break;
          }
          case 32: {
            ModelVersion = input.ReadInt64();
            break;
          }
        }
      }
    #endif
    }

    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    void pb::IBufferMessage.InternalMergeFrom(ref pb::ParseContext input) {
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
      if ((tag & 7) == 4) {
        // Abort on any end group tag.
        return;
      }
      switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, ref input);
            break;
          case 10: {
            if (dataset_ == null) {
              Dataset = new global::Asgt.Type.Dataset();
            }
            input.ReadMessage(Dataset);
            break;
          }
          case 18: {
            if (revision_ == null) {
              Revision = new global::Asgt.Type.Revision();
            }
            input.ReadMessage(Revision);
            break;
          }
          case 32: {
            ModelVersion = input.ReadInt64();
            break;
          }
        }
      }
    }
    #endif

  }

  #endregion

}

#endregion Designer generated code
