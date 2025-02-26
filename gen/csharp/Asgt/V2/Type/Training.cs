// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: asgt/v2/type/training.proto
// </auto-generated>
#pragma warning disable 1591, 0612, 3021, 8981
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
namespace Asgt.V2.Type {

  /// <summary>Holder for reflection information generated from asgt/v2/type/training.proto</summary>
  public static partial class TrainingReflection {

    #region Descriptor
    /// <summary>File descriptor for asgt/v2/type/training.proto</summary>
    public static pbr::FileDescriptor Descriptor {
      get { return descriptor; }
    }
    private static pbr::FileDescriptor descriptor;

    static TrainingReflection() {
      byte[] descriptorData = global::System.Convert.FromBase64String(
          string.Concat(
            "Chthc2d0L3YyL3R5cGUvdHJhaW5pbmcucHJvdG8SDGFzZ3QudjIudHlwZRoX",
            "YXNndC90eXBlL2RhdGFzZXQucHJvdG8aH2dvb2dsZS9wcm90b2J1Zi90aW1l",
            "c3RhbXAucHJvdG8i6gIKCFRyYWluaW5nEjkKCmNyZWF0ZWRfYXQYASABKAsy",
            "Gi5nb29nbGUucHJvdG9idWYuVGltZXN0YW1wUgljcmVhdGVkQXQSFgoGc3Rh",
            "dHVzGAIgASgJUgZzdGF0dXMSJwoPdHJhaW5pbmdfc3RhdHVzGAMgASgJUg50",
            "cmFpbmluZ1N0YXR1cxI2Chd0cmFpbmluZ19zdGF0dXNfbWVzc2FnZRgEIAEo",
            "CVIVdHJhaW5pbmdTdGF0dXNNZXNzYWdlEjsKC2ZpbmlzaF90aW1lGAUgASgL",
            "MhouZ29vZ2xlLnByb3RvYnVmLlRpbWVzdGFtcFIKZmluaXNoVGltZRIsCgdk",
            "YXRhc2V0GAYgASgLMhIuYXNndC50eXBlLkRhdGFzZXRSB2RhdGFzZXQSPwoN",
            "c2NoZWR1bGVfdGltZRgHIAEoCzIaLmdvb2dsZS5wcm90b2J1Zi5UaW1lc3Rh",
            "bXBSDHNjaGVkdWxlVGltZUKzAQoVYWkudmlzbWEuYXNndC52Mi50eXBlQg1U",
            "cmFpbmluZ1Byb3RvUAFaOWdpdGh1Yi5jb20vZS1jb25vbWljL3ZtbGFwaXMv",
            "Z2VuL2dvL2FzZ3QvdjIvdHlwZTthc2d0dHlwZaICA0FWVKoCDEFzZ3QuVjIu",
            "VHlwZcoCDEFzZ3RcVjJcVHlwZeICGEFzZ3RcVjJcVHlwZVxHUEJNZXRhZGF0",
            "YeoCDkFzZ3Q6OlYyOjpUeXBlYgZwcm90bzM="));
      descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
          new pbr::FileDescriptor[] { global::Asgt.Type.DatasetReflection.Descriptor, global::Google.Protobuf.WellKnownTypes.TimestampReflection.Descriptor, },
          new pbr::GeneratedClrTypeInfo(null, null, new pbr::GeneratedClrTypeInfo[] {
            new pbr::GeneratedClrTypeInfo(typeof(global::Asgt.V2.Type.Training), global::Asgt.V2.Type.Training.Parser, new[]{ "CreatedAt", "Status", "TrainingStatus", "TrainingStatusMessage", "FinishTime", "Dataset", "ScheduleTime" }, null, null, null, null)
          }));
    }
    #endregion

  }
  #region Messages
  [global::System.Diagnostics.DebuggerDisplayAttribute("{ToString(),nq}")]
  public sealed partial class Training : pb::IMessage<Training>
  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      , pb::IBufferMessage
  #endif
  {
    private static readonly pb::MessageParser<Training> _parser = new pb::MessageParser<Training>(() => new Training());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static pb::MessageParser<Training> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::Asgt.V2.Type.TrainingReflection.Descriptor.MessageTypes[0]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public Training() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public Training(Training other) : this() {
      createdAt_ = other.createdAt_ != null ? other.createdAt_.Clone() : null;
      status_ = other.status_;
      trainingStatus_ = other.trainingStatus_;
      trainingStatusMessage_ = other.trainingStatusMessage_;
      finishTime_ = other.finishTime_ != null ? other.finishTime_.Clone() : null;
      dataset_ = other.dataset_ != null ? other.dataset_.Clone() : null;
      scheduleTime_ = other.scheduleTime_ != null ? other.scheduleTime_.Clone() : null;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public Training Clone() {
      return new Training(this);
    }

    /// <summary>Field number for the "created_at" field.</summary>
    public const int CreatedAtFieldNumber = 1;
    private global::Google.Protobuf.WellKnownTypes.Timestamp createdAt_;
    /// <summary>
    /// Creation time of the training
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public global::Google.Protobuf.WellKnownTypes.Timestamp CreatedAt {
      get { return createdAt_; }
      set {
        createdAt_ = value;
      }
    }

    /// <summary>Field number for the "status" field.</summary>
    public const int StatusFieldNumber = 2;
    private string status_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public string Status {
      get { return status_; }
      set {
        status_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "training_status" field.</summary>
    public const int TrainingStatusFieldNumber = 3;
    private string trainingStatus_ = "";
    /// <summary>
    /// Status of the training.
    /// SCHEDULED - Training is scheduled to be run in a specific time. This
    /// could be in between 1 minute or 24 hours depending on how recently the dataset
    /// was created
    /// PENDING - The training is ready to be picked up by a worker.
    /// RUNNING - The training is currently running.
    /// DONE - The training has completed successfully.
    /// FAILED - The training failed due to an error. See training status for
    /// more information.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public string TrainingStatus {
      get { return trainingStatus_; }
      set {
        trainingStatus_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "training_status_message" field.</summary>
    public const int TrainingStatusMessageFieldNumber = 4;
    private string trainingStatusMessage_ = "";
    /// <summary>
    /// Additional information about the training status.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public string TrainingStatusMessage {
      get { return trainingStatusMessage_; }
      set {
        trainingStatusMessage_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "finish_time" field.</summary>
    public const int FinishTimeFieldNumber = 5;
    private global::Google.Protobuf.WellKnownTypes.Timestamp finishTime_;
    /// <summary>
    /// Specifies when did the training finish.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public global::Google.Protobuf.WellKnownTypes.Timestamp FinishTime {
      get { return finishTime_; }
      set {
        finishTime_ = value;
      }
    }

    /// <summary>Field number for the "dataset" field.</summary>
    public const int DatasetFieldNumber = 6;
    private global::Asgt.Type.Dataset dataset_;
    /// <summary>
    /// Specifies dataset the training ran on.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public global::Asgt.Type.Dataset Dataset {
      get { return dataset_; }
      set {
        dataset_ = value;
      }
    }

    /// <summary>Field number for the "schedule_time" field.</summary>
    public const int ScheduleTimeFieldNumber = 7;
    private global::Google.Protobuf.WellKnownTypes.Timestamp scheduleTime_;
    /// <summary>
    /// Specifies when the training is scheduled.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public global::Google.Protobuf.WellKnownTypes.Timestamp ScheduleTime {
      get { return scheduleTime_; }
      set {
        scheduleTime_ = value;
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override bool Equals(object other) {
      return Equals(other as Training);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public bool Equals(Training other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (!object.Equals(CreatedAt, other.CreatedAt)) return false;
      if (Status != other.Status) return false;
      if (TrainingStatus != other.TrainingStatus) return false;
      if (TrainingStatusMessage != other.TrainingStatusMessage) return false;
      if (!object.Equals(FinishTime, other.FinishTime)) return false;
      if (!object.Equals(Dataset, other.Dataset)) return false;
      if (!object.Equals(ScheduleTime, other.ScheduleTime)) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override int GetHashCode() {
      int hash = 1;
      if (createdAt_ != null) hash ^= CreatedAt.GetHashCode();
      if (Status.Length != 0) hash ^= Status.GetHashCode();
      if (TrainingStatus.Length != 0) hash ^= TrainingStatus.GetHashCode();
      if (TrainingStatusMessage.Length != 0) hash ^= TrainingStatusMessage.GetHashCode();
      if (finishTime_ != null) hash ^= FinishTime.GetHashCode();
      if (dataset_ != null) hash ^= Dataset.GetHashCode();
      if (scheduleTime_ != null) hash ^= ScheduleTime.GetHashCode();
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
      if (createdAt_ != null) {
        output.WriteRawTag(10);
        output.WriteMessage(CreatedAt);
      }
      if (Status.Length != 0) {
        output.WriteRawTag(18);
        output.WriteString(Status);
      }
      if (TrainingStatus.Length != 0) {
        output.WriteRawTag(26);
        output.WriteString(TrainingStatus);
      }
      if (TrainingStatusMessage.Length != 0) {
        output.WriteRawTag(34);
        output.WriteString(TrainingStatusMessage);
      }
      if (finishTime_ != null) {
        output.WriteRawTag(42);
        output.WriteMessage(FinishTime);
      }
      if (dataset_ != null) {
        output.WriteRawTag(50);
        output.WriteMessage(Dataset);
      }
      if (scheduleTime_ != null) {
        output.WriteRawTag(58);
        output.WriteMessage(ScheduleTime);
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
      if (createdAt_ != null) {
        output.WriteRawTag(10);
        output.WriteMessage(CreatedAt);
      }
      if (Status.Length != 0) {
        output.WriteRawTag(18);
        output.WriteString(Status);
      }
      if (TrainingStatus.Length != 0) {
        output.WriteRawTag(26);
        output.WriteString(TrainingStatus);
      }
      if (TrainingStatusMessage.Length != 0) {
        output.WriteRawTag(34);
        output.WriteString(TrainingStatusMessage);
      }
      if (finishTime_ != null) {
        output.WriteRawTag(42);
        output.WriteMessage(FinishTime);
      }
      if (dataset_ != null) {
        output.WriteRawTag(50);
        output.WriteMessage(Dataset);
      }
      if (scheduleTime_ != null) {
        output.WriteRawTag(58);
        output.WriteMessage(ScheduleTime);
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
      if (createdAt_ != null) {
        size += 1 + pb::CodedOutputStream.ComputeMessageSize(CreatedAt);
      }
      if (Status.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Status);
      }
      if (TrainingStatus.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(TrainingStatus);
      }
      if (TrainingStatusMessage.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(TrainingStatusMessage);
      }
      if (finishTime_ != null) {
        size += 1 + pb::CodedOutputStream.ComputeMessageSize(FinishTime);
      }
      if (dataset_ != null) {
        size += 1 + pb::CodedOutputStream.ComputeMessageSize(Dataset);
      }
      if (scheduleTime_ != null) {
        size += 1 + pb::CodedOutputStream.ComputeMessageSize(ScheduleTime);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public void MergeFrom(Training other) {
      if (other == null) {
        return;
      }
      if (other.createdAt_ != null) {
        if (createdAt_ == null) {
          CreatedAt = new global::Google.Protobuf.WellKnownTypes.Timestamp();
        }
        CreatedAt.MergeFrom(other.CreatedAt);
      }
      if (other.Status.Length != 0) {
        Status = other.Status;
      }
      if (other.TrainingStatus.Length != 0) {
        TrainingStatus = other.TrainingStatus;
      }
      if (other.TrainingStatusMessage.Length != 0) {
        TrainingStatusMessage = other.TrainingStatusMessage;
      }
      if (other.finishTime_ != null) {
        if (finishTime_ == null) {
          FinishTime = new global::Google.Protobuf.WellKnownTypes.Timestamp();
        }
        FinishTime.MergeFrom(other.FinishTime);
      }
      if (other.dataset_ != null) {
        if (dataset_ == null) {
          Dataset = new global::Asgt.Type.Dataset();
        }
        Dataset.MergeFrom(other.Dataset);
      }
      if (other.scheduleTime_ != null) {
        if (scheduleTime_ == null) {
          ScheduleTime = new global::Google.Protobuf.WellKnownTypes.Timestamp();
        }
        ScheduleTime.MergeFrom(other.ScheduleTime);
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
            if (createdAt_ == null) {
              CreatedAt = new global::Google.Protobuf.WellKnownTypes.Timestamp();
            }
            input.ReadMessage(CreatedAt);
            break;
          }
          case 18: {
            Status = input.ReadString();
            break;
          }
          case 26: {
            TrainingStatus = input.ReadString();
            break;
          }
          case 34: {
            TrainingStatusMessage = input.ReadString();
            break;
          }
          case 42: {
            if (finishTime_ == null) {
              FinishTime = new global::Google.Protobuf.WellKnownTypes.Timestamp();
            }
            input.ReadMessage(FinishTime);
            break;
          }
          case 50: {
            if (dataset_ == null) {
              Dataset = new global::Asgt.Type.Dataset();
            }
            input.ReadMessage(Dataset);
            break;
          }
          case 58: {
            if (scheduleTime_ == null) {
              ScheduleTime = new global::Google.Protobuf.WellKnownTypes.Timestamp();
            }
            input.ReadMessage(ScheduleTime);
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
            if (createdAt_ == null) {
              CreatedAt = new global::Google.Protobuf.WellKnownTypes.Timestamp();
            }
            input.ReadMessage(CreatedAt);
            break;
          }
          case 18: {
            Status = input.ReadString();
            break;
          }
          case 26: {
            TrainingStatus = input.ReadString();
            break;
          }
          case 34: {
            TrainingStatusMessage = input.ReadString();
            break;
          }
          case 42: {
            if (finishTime_ == null) {
              FinishTime = new global::Google.Protobuf.WellKnownTypes.Timestamp();
            }
            input.ReadMessage(FinishTime);
            break;
          }
          case 50: {
            if (dataset_ == null) {
              Dataset = new global::Asgt.Type.Dataset();
            }
            input.ReadMessage(Dataset);
            break;
          }
          case 58: {
            if (scheduleTime_ == null) {
              ScheduleTime = new global::Google.Protobuf.WellKnownTypes.Timestamp();
            }
            input.ReadMessage(ScheduleTime);
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
