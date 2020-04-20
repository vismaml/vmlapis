// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: asgt/modeltrainer/v1alpha1/training_service.proto
// </auto-generated>
#pragma warning disable 1591, 0612, 3021
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
namespace Asgt.Modeltrainer.V1Alpha1 {

  /// <summary>Holder for reflection information generated from asgt/modeltrainer/v1alpha1/training_service.proto</summary>
  public static partial class TrainingServiceReflection {

    #region Descriptor
    /// <summary>File descriptor for asgt/modeltrainer/v1alpha1/training_service.proto</summary>
    public static pbr::FileDescriptor Descriptor {
      get { return descriptor; }
    }
    private static pbr::FileDescriptor descriptor;

    static TrainingServiceReflection() {
      byte[] descriptorData = global::System.Convert.FromBase64String(
          string.Concat(
            "CjFhc2d0L21vZGVsdHJhaW5lci92MWFscGhhMS90cmFpbmluZ19zZXJ2aWNl",
            "LnByb3RvEhphc2d0Lm1vZGVsdHJhaW5lci52MWFscGhhMRobZ29vZ2xlL3By",
            "b3RvYnVmL2VtcHR5LnByb3RvIk8KEVRyYWluTW9kZWxSZXF1ZXN0EhAKCGNv",
            "bnN1bWVyGAEgASgJEhIKCm1vZGVsX3R5cGUYAiABKAkSFAoMZGF0YXNldF9u",
            "YW1lGAMgASgJIhUKE1J1blNjaGVkdWxlclJlcXVlc3QyvwEKD1RyYWluaW5n",
            "U2VydmljZRJTCgpUcmFpbk1vZGVsEi0uYXNndC5tb2RlbHRyYWluZXIudjFh",
            "bHBoYTEuVHJhaW5Nb2RlbFJlcXVlc3QaFi5nb29nbGUucHJvdG9idWYuRW1w",
            "dHkSVwoMUnVuU2NoZWR1bGVyEi8uYXNndC5tb2RlbHRyYWluZXIudjFhbHBo",
            "YTEuUnVuU2NoZWR1bGVyUmVxdWVzdBoWLmdvb2dsZS5wcm90b2J1Zi5FbXB0",
            "eUIOWgxtb2RlbHRyYWluZXJiBnByb3RvMw=="));
      descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
          new pbr::FileDescriptor[] { global::Google.Protobuf.WellKnownTypes.EmptyReflection.Descriptor, },
          new pbr::GeneratedClrTypeInfo(null, new pbr::GeneratedClrTypeInfo[] {
            new pbr::GeneratedClrTypeInfo(typeof(global::Asgt.Modeltrainer.V1Alpha1.TrainModelRequest), global::Asgt.Modeltrainer.V1Alpha1.TrainModelRequest.Parser, new[]{ "Consumer", "ModelType", "DatasetName" }, null, null, null),
            new pbr::GeneratedClrTypeInfo(typeof(global::Asgt.Modeltrainer.V1Alpha1.RunSchedulerRequest), global::Asgt.Modeltrainer.V1Alpha1.RunSchedulerRequest.Parser, null, null, null, null)
          }));
    }
    #endregion

  }
  #region Messages
  public sealed partial class TrainModelRequest : pb::IMessage<TrainModelRequest> {
    private static readonly pb::MessageParser<TrainModelRequest> _parser = new pb::MessageParser<TrainModelRequest>(() => new TrainModelRequest());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<TrainModelRequest> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::Asgt.Modeltrainer.V1Alpha1.TrainingServiceReflection.Descriptor.MessageTypes[0]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public TrainModelRequest() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public TrainModelRequest(TrainModelRequest other) : this() {
      consumer_ = other.consumer_;
      modelType_ = other.modelType_;
      datasetName_ = other.datasetName_;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public TrainModelRequest Clone() {
      return new TrainModelRequest(this);
    }

    /// <summary>Field number for the "consumer" field.</summary>
    public const int ConsumerFieldNumber = 1;
    private string consumer_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string Consumer {
      get { return consumer_; }
      set {
        consumer_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "model_type" field.</summary>
    public const int ModelTypeFieldNumber = 2;
    private string modelType_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string ModelType {
      get { return modelType_; }
      set {
        modelType_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "dataset_name" field.</summary>
    public const int DatasetNameFieldNumber = 3;
    private string datasetName_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string DatasetName {
      get { return datasetName_; }
      set {
        datasetName_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as TrainModelRequest);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(TrainModelRequest other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (Consumer != other.Consumer) return false;
      if (ModelType != other.ModelType) return false;
      if (DatasetName != other.DatasetName) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (Consumer.Length != 0) hash ^= Consumer.GetHashCode();
      if (ModelType.Length != 0) hash ^= ModelType.GetHashCode();
      if (DatasetName.Length != 0) hash ^= DatasetName.GetHashCode();
      if (_unknownFields != null) {
        hash ^= _unknownFields.GetHashCode();
      }
      return hash;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override string ToString() {
      return pb::JsonFormatter.ToDiagnosticString(this);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void WriteTo(pb::CodedOutputStream output) {
      if (Consumer.Length != 0) {
        output.WriteRawTag(10);
        output.WriteString(Consumer);
      }
      if (ModelType.Length != 0) {
        output.WriteRawTag(18);
        output.WriteString(ModelType);
      }
      if (DatasetName.Length != 0) {
        output.WriteRawTag(26);
        output.WriteString(DatasetName);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (Consumer.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Consumer);
      }
      if (ModelType.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(ModelType);
      }
      if (DatasetName.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(DatasetName);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(TrainModelRequest other) {
      if (other == null) {
        return;
      }
      if (other.Consumer.Length != 0) {
        Consumer = other.Consumer;
      }
      if (other.ModelType.Length != 0) {
        ModelType = other.ModelType;
      }
      if (other.DatasetName.Length != 0) {
        DatasetName = other.DatasetName;
      }
      _unknownFields = pb::UnknownFieldSet.MergeFrom(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(pb::CodedInputStream input) {
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, input);
            break;
          case 10: {
            Consumer = input.ReadString();
            break;
          }
          case 18: {
            ModelType = input.ReadString();
            break;
          }
          case 26: {
            DatasetName = input.ReadString();
            break;
          }
        }
      }
    }

  }

  public sealed partial class RunSchedulerRequest : pb::IMessage<RunSchedulerRequest> {
    private static readonly pb::MessageParser<RunSchedulerRequest> _parser = new pb::MessageParser<RunSchedulerRequest>(() => new RunSchedulerRequest());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<RunSchedulerRequest> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::Asgt.Modeltrainer.V1Alpha1.TrainingServiceReflection.Descriptor.MessageTypes[1]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public RunSchedulerRequest() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public RunSchedulerRequest(RunSchedulerRequest other) : this() {
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public RunSchedulerRequest Clone() {
      return new RunSchedulerRequest(this);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as RunSchedulerRequest);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(RunSchedulerRequest other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (_unknownFields != null) {
        hash ^= _unknownFields.GetHashCode();
      }
      return hash;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override string ToString() {
      return pb::JsonFormatter.ToDiagnosticString(this);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void WriteTo(pb::CodedOutputStream output) {
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(RunSchedulerRequest other) {
      if (other == null) {
        return;
      }
      _unknownFields = pb::UnknownFieldSet.MergeFrom(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(pb::CodedInputStream input) {
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, input);
            break;
        }
      }
    }

  }

  #endregion

}

#endregion Designer generated code
