// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: asgt/dataservice/v1alpha1/bank.proto
// </auto-generated>
#pragma warning disable 1591, 0612, 3021
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
namespace Asgt.Dataservice.V1Alpha1 {

  /// <summary>Holder for reflection information generated from asgt/dataservice/v1alpha1/bank.proto</summary>
  public static partial class BankReflection {

    #region Descriptor
    /// <summary>File descriptor for asgt/dataservice/v1alpha1/bank.proto</summary>
    public static pbr::FileDescriptor Descriptor {
      get { return descriptor; }
    }
    private static pbr::FileDescriptor descriptor;

    static BankReflection() {
      byte[] descriptorData = global::System.Convert.FromBase64String(
          string.Concat(
            "CiRhc2d0L2RhdGFzZXJ2aWNlL3YxYWxwaGExL2JhbmsucHJvdG8SGWFzZ3Qu",
            "ZGF0YXNlcnZpY2UudjFhbHBoYTEaJGFzZ3QvZGF0YXNlcnZpY2UvdjFhbHBo",
            "YTEvZGF0YS5wcm90bxohYXNndC9qZXN0ZXIvdjFhbHBoYTEvamVzdGVyLnBy",
            "b3RvGhxnZW5fYnFfc2NoZW1hL2JxX2ZpZWxkLnByb3RvGhxnZW5fYnFfc2No",
            "ZW1hL2JxX3RhYmxlLnByb3RvGhxnb29nbGUvYXBpL2Fubm90YXRpb25zLnBy",
            "b3RvGhtnb29nbGUvcHJvdG9idWYvZW1wdHkucHJvdG8iugMKCUJhbmtFbnRy",
            "eRI+CgJpZBgBIAEoCUIy6j8vIi1JRCwgbWF0Y2hlcyBFbnZveSByZXF1ZXN0",
            "IGlkIGlmIGZlZWRiYWNrIGRhdGESFwoIY29uc3VtZXIYAiABKAlCBeo/AggB",
            "EhYKB2RhdGFzZXQYAyABKAlCBeo/AggBElQKBHRhZ3MYBCADKAlCRuo/QyJB",
            "VGFncyBkZWZpbmVkIGJ5IGNvbnN1bWVyLCBlbnJpY2hlZCBieSBzZXJ2aWNl",
            "IGlmIHZhbGV0a2V5IGlzIHVzZWQSNQoFaW5wdXQYBSABKAsyJi5hc2d0Lmpl",
            "c3Rlci52MWFscGhhMS5CYW5rUmVxdWVzdC5EYXRhEjkKC3RydWVfdmFsdWVz",
            "GAYgAygLMiQuYXNndC5kYXRhc2VydmljZS52MWFscGhhMS5EYXRhVHVwbGUS",
            "PgoLcHJlZF92YWx1ZXMYByADKAsyKS5hc2d0LmRhdGFzZXJ2aWNlLnYxYWxw",
            "aGExLlByZWRpY3RlZFR1cGxlEiQKCnRpbWVfYWRkZWQYCCABKARCEOo/DQgB",
            "EglUSU1FU1RBTVA6Duo/CwoJYmFua19kYXRhIoIBCg5CYW5rRW50cnlJbnB1",
            "dBI1CgVpbnB1dBgBIAEoCzImLmFzZ3QuamVzdGVyLnYxYWxwaGExLkJhbmtS",
            "ZXF1ZXN0LkRhdGESOQoLdHJ1ZV92YWx1ZXMYAiADKAsyJC5hc2d0LmRhdGFz",
            "ZXJ2aWNlLnYxYWxwaGExLkRhdGFUdXBsZSLAAQoYQ3JlYXRlQmFua0RhdGFz",
            "ZXRSZXF1ZXN0EhQKDGRhdGFzZXRfbmFtZRgBIAEoCRIMCgR0YWdzGAIgAygJ",
            "EjoKB2VudHJpZXMYAyADKAsyKS5hc2d0LmRhdGFzZXJ2aWNlLnYxYWxwaGEx",
            "LkJhbmtFbnRyeUlucHV0EkQKEHJldGVudGlvbl9wb2xpY3kYBCABKAsyKi5h",
            "c2d0LmRhdGFzZXJ2aWNlLnYxYWxwaGExLlJldGVudGlvblBvbGljeSJpChVB",
            "cHBlbmRCYW5rRGF0YVJlcXVlc3QSFAoMZGF0YXNldF9uYW1lGAEgASgJEjoK",
            "B2VudHJpZXMYAyADKAsyKS5hc2d0LmRhdGFzZXJ2aWNlLnYxYWxwaGExLkJh",
            "bmtFbnRyeUlucHV0MooDCg9CYW5rRGF0YXNlcnZpY2USggEKEUNyZWF0ZUJh",
            "bmtEYXRhc2V0EjMuYXNndC5kYXRhc2VydmljZS52MWFscGhhMS5DcmVhdGVC",
            "YW5rRGF0YXNldFJlcXVlc3QaFi5nb29nbGUucHJvdG9idWYuRW1wdHkiIILT",
            "5JMCGiIVL3YxYWxwaGExL2Jhbms6Y3JlYXRlOgEqEnwKDkFwcGVuZEJhbmtE",
            "YXRhEjAuYXNndC5kYXRhc2VydmljZS52MWFscGhhMS5BcHBlbmRCYW5rRGF0",
            "YVJlcXVlc3QaFi5nb29nbGUucHJvdG9idWYuRW1wdHkiIILT5JMCGiIVL3Yx",
            "YWxwaGExL2Jhbms6YXBwZW5kOgEqEnQKDkRlbGV0ZUJhbmtEYXRhEiguYXNn",
            "dC5kYXRhc2VydmljZS52MWFscGhhMS5EZWxldGVSZXF1ZXN0GhYuZ29vZ2xl",
            "LnByb3RvYnVmLkVtcHR5IiCC0+STAhoiFS92MWFscGhhMS9iYW5rOmRlbGV0",
            "ZToBKkINWgtkYXRhc2VydmljZWIGcHJvdG8z"));
      descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
          new pbr::FileDescriptor[] { global::Asgt.Dataservice.V1Alpha1.DataReflection.Descriptor, global::Asgt.Jester.V1Alpha1.JesterReflection.Descriptor, global::GenBqSchema.BqFieldReflection.Descriptor, global::GenBqSchema.BqTableReflection.Descriptor, global::Google.Api.AnnotationsReflection.Descriptor, global::Google.Protobuf.WellKnownTypes.EmptyReflection.Descriptor, },
          new pbr::GeneratedClrTypeInfo(null, new pbr::GeneratedClrTypeInfo[] {
            new pbr::GeneratedClrTypeInfo(typeof(global::Asgt.Dataservice.V1Alpha1.BankEntry), global::Asgt.Dataservice.V1Alpha1.BankEntry.Parser, new[]{ "Id", "Consumer", "Dataset", "Tags", "Input", "TrueValues", "PredValues", "TimeAdded" }, null, null, null),
            new pbr::GeneratedClrTypeInfo(typeof(global::Asgt.Dataservice.V1Alpha1.BankEntryInput), global::Asgt.Dataservice.V1Alpha1.BankEntryInput.Parser, new[]{ "Input", "TrueValues" }, null, null, null),
            new pbr::GeneratedClrTypeInfo(typeof(global::Asgt.Dataservice.V1Alpha1.CreateBankDatasetRequest), global::Asgt.Dataservice.V1Alpha1.CreateBankDatasetRequest.Parser, new[]{ "DatasetName", "Tags", "Entries", "RetentionPolicy" }, null, null, null),
            new pbr::GeneratedClrTypeInfo(typeof(global::Asgt.Dataservice.V1Alpha1.AppendBankDataRequest), global::Asgt.Dataservice.V1Alpha1.AppendBankDataRequest.Parser, new[]{ "DatasetName", "Entries" }, null, null, null)
          }));
    }
    #endregion

  }
  #region Messages
  /// <summary>
  /// Bank BQ schema gen - could be used for adding direct developer data endpoints
  /// </summary>
  public sealed partial class BankEntry : pb::IMessage<BankEntry> {
    private static readonly pb::MessageParser<BankEntry> _parser = new pb::MessageParser<BankEntry>(() => new BankEntry());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<BankEntry> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::Asgt.Dataservice.V1Alpha1.BankReflection.Descriptor.MessageTypes[0]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public BankEntry() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public BankEntry(BankEntry other) : this() {
      id_ = other.id_;
      consumer_ = other.consumer_;
      dataset_ = other.dataset_;
      tags_ = other.tags_.Clone();
      input_ = other.input_ != null ? other.input_.Clone() : null;
      trueValues_ = other.trueValues_.Clone();
      predValues_ = other.predValues_.Clone();
      timeAdded_ = other.timeAdded_;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public BankEntry Clone() {
      return new BankEntry(this);
    }

    /// <summary>Field number for the "id" field.</summary>
    public const int IdFieldNumber = 1;
    private string id_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string Id {
      get { return id_; }
      set {
        id_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "consumer" field.</summary>
    public const int ConsumerFieldNumber = 2;
    private string consumer_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string Consumer {
      get { return consumer_; }
      set {
        consumer_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "dataset" field.</summary>
    public const int DatasetFieldNumber = 3;
    private string dataset_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string Dataset {
      get { return dataset_; }
      set {
        dataset_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "tags" field.</summary>
    public const int TagsFieldNumber = 4;
    private static readonly pb::FieldCodec<string> _repeated_tags_codec
        = pb::FieldCodec.ForString(34);
    private readonly pbc::RepeatedField<string> tags_ = new pbc::RepeatedField<string>();
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public pbc::RepeatedField<string> Tags {
      get { return tags_; }
    }

    /// <summary>Field number for the "input" field.</summary>
    public const int InputFieldNumber = 5;
    private global::Asgt.Jester.V1Alpha1.BankRequest.Types.Data input_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public global::Asgt.Jester.V1Alpha1.BankRequest.Types.Data Input {
      get { return input_; }
      set {
        input_ = value;
      }
    }

    /// <summary>Field number for the "true_values" field.</summary>
    public const int TrueValuesFieldNumber = 6;
    private static readonly pb::FieldCodec<global::Asgt.Dataservice.V1Alpha1.DataTuple> _repeated_trueValues_codec
        = pb::FieldCodec.ForMessage(50, global::Asgt.Dataservice.V1Alpha1.DataTuple.Parser);
    private readonly pbc::RepeatedField<global::Asgt.Dataservice.V1Alpha1.DataTuple> trueValues_ = new pbc::RepeatedField<global::Asgt.Dataservice.V1Alpha1.DataTuple>();
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public pbc::RepeatedField<global::Asgt.Dataservice.V1Alpha1.DataTuple> TrueValues {
      get { return trueValues_; }
    }

    /// <summary>Field number for the "pred_values" field.</summary>
    public const int PredValuesFieldNumber = 7;
    private static readonly pb::FieldCodec<global::Asgt.Dataservice.V1Alpha1.PredictedTuple> _repeated_predValues_codec
        = pb::FieldCodec.ForMessage(58, global::Asgt.Dataservice.V1Alpha1.PredictedTuple.Parser);
    private readonly pbc::RepeatedField<global::Asgt.Dataservice.V1Alpha1.PredictedTuple> predValues_ = new pbc::RepeatedField<global::Asgt.Dataservice.V1Alpha1.PredictedTuple>();
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public pbc::RepeatedField<global::Asgt.Dataservice.V1Alpha1.PredictedTuple> PredValues {
      get { return predValues_; }
    }

    /// <summary>Field number for the "time_added" field.</summary>
    public const int TimeAddedFieldNumber = 8;
    private ulong timeAdded_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public ulong TimeAdded {
      get { return timeAdded_; }
      set {
        timeAdded_ = value;
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as BankEntry);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(BankEntry other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (Id != other.Id) return false;
      if (Consumer != other.Consumer) return false;
      if (Dataset != other.Dataset) return false;
      if(!tags_.Equals(other.tags_)) return false;
      if (!object.Equals(Input, other.Input)) return false;
      if(!trueValues_.Equals(other.trueValues_)) return false;
      if(!predValues_.Equals(other.predValues_)) return false;
      if (TimeAdded != other.TimeAdded) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (Id.Length != 0) hash ^= Id.GetHashCode();
      if (Consumer.Length != 0) hash ^= Consumer.GetHashCode();
      if (Dataset.Length != 0) hash ^= Dataset.GetHashCode();
      hash ^= tags_.GetHashCode();
      if (input_ != null) hash ^= Input.GetHashCode();
      hash ^= trueValues_.GetHashCode();
      hash ^= predValues_.GetHashCode();
      if (TimeAdded != 0UL) hash ^= TimeAdded.GetHashCode();
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
      if (Id.Length != 0) {
        output.WriteRawTag(10);
        output.WriteString(Id);
      }
      if (Consumer.Length != 0) {
        output.WriteRawTag(18);
        output.WriteString(Consumer);
      }
      if (Dataset.Length != 0) {
        output.WriteRawTag(26);
        output.WriteString(Dataset);
      }
      tags_.WriteTo(output, _repeated_tags_codec);
      if (input_ != null) {
        output.WriteRawTag(42);
        output.WriteMessage(Input);
      }
      trueValues_.WriteTo(output, _repeated_trueValues_codec);
      predValues_.WriteTo(output, _repeated_predValues_codec);
      if (TimeAdded != 0UL) {
        output.WriteRawTag(64);
        output.WriteUInt64(TimeAdded);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (Id.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Id);
      }
      if (Consumer.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Consumer);
      }
      if (Dataset.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Dataset);
      }
      size += tags_.CalculateSize(_repeated_tags_codec);
      if (input_ != null) {
        size += 1 + pb::CodedOutputStream.ComputeMessageSize(Input);
      }
      size += trueValues_.CalculateSize(_repeated_trueValues_codec);
      size += predValues_.CalculateSize(_repeated_predValues_codec);
      if (TimeAdded != 0UL) {
        size += 1 + pb::CodedOutputStream.ComputeUInt64Size(TimeAdded);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(BankEntry other) {
      if (other == null) {
        return;
      }
      if (other.Id.Length != 0) {
        Id = other.Id;
      }
      if (other.Consumer.Length != 0) {
        Consumer = other.Consumer;
      }
      if (other.Dataset.Length != 0) {
        Dataset = other.Dataset;
      }
      tags_.Add(other.tags_);
      if (other.input_ != null) {
        if (input_ == null) {
          input_ = new global::Asgt.Jester.V1Alpha1.BankRequest.Types.Data();
        }
        Input.MergeFrom(other.Input);
      }
      trueValues_.Add(other.trueValues_);
      predValues_.Add(other.predValues_);
      if (other.TimeAdded != 0UL) {
        TimeAdded = other.TimeAdded;
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
            Id = input.ReadString();
            break;
          }
          case 18: {
            Consumer = input.ReadString();
            break;
          }
          case 26: {
            Dataset = input.ReadString();
            break;
          }
          case 34: {
            tags_.AddEntriesFrom(input, _repeated_tags_codec);
            break;
          }
          case 42: {
            if (input_ == null) {
              input_ = new global::Asgt.Jester.V1Alpha1.BankRequest.Types.Data();
            }
            input.ReadMessage(input_);
            break;
          }
          case 50: {
            trueValues_.AddEntriesFrom(input, _repeated_trueValues_codec);
            break;
          }
          case 58: {
            predValues_.AddEntriesFrom(input, _repeated_predValues_codec);
            break;
          }
          case 64: {
            TimeAdded = input.ReadUInt64();
            break;
          }
        }
      }
    }

  }

  public sealed partial class BankEntryInput : pb::IMessage<BankEntryInput> {
    private static readonly pb::MessageParser<BankEntryInput> _parser = new pb::MessageParser<BankEntryInput>(() => new BankEntryInput());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<BankEntryInput> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::Asgt.Dataservice.V1Alpha1.BankReflection.Descriptor.MessageTypes[1]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public BankEntryInput() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public BankEntryInput(BankEntryInput other) : this() {
      input_ = other.input_ != null ? other.input_.Clone() : null;
      trueValues_ = other.trueValues_.Clone();
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public BankEntryInput Clone() {
      return new BankEntryInput(this);
    }

    /// <summary>Field number for the "input" field.</summary>
    public const int InputFieldNumber = 1;
    private global::Asgt.Jester.V1Alpha1.BankRequest.Types.Data input_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public global::Asgt.Jester.V1Alpha1.BankRequest.Types.Data Input {
      get { return input_; }
      set {
        input_ = value;
      }
    }

    /// <summary>Field number for the "true_values" field.</summary>
    public const int TrueValuesFieldNumber = 2;
    private static readonly pb::FieldCodec<global::Asgt.Dataservice.V1Alpha1.DataTuple> _repeated_trueValues_codec
        = pb::FieldCodec.ForMessage(18, global::Asgt.Dataservice.V1Alpha1.DataTuple.Parser);
    private readonly pbc::RepeatedField<global::Asgt.Dataservice.V1Alpha1.DataTuple> trueValues_ = new pbc::RepeatedField<global::Asgt.Dataservice.V1Alpha1.DataTuple>();
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public pbc::RepeatedField<global::Asgt.Dataservice.V1Alpha1.DataTuple> TrueValues {
      get { return trueValues_; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as BankEntryInput);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(BankEntryInput other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (!object.Equals(Input, other.Input)) return false;
      if(!trueValues_.Equals(other.trueValues_)) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (input_ != null) hash ^= Input.GetHashCode();
      hash ^= trueValues_.GetHashCode();
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
      if (input_ != null) {
        output.WriteRawTag(10);
        output.WriteMessage(Input);
      }
      trueValues_.WriteTo(output, _repeated_trueValues_codec);
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (input_ != null) {
        size += 1 + pb::CodedOutputStream.ComputeMessageSize(Input);
      }
      size += trueValues_.CalculateSize(_repeated_trueValues_codec);
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(BankEntryInput other) {
      if (other == null) {
        return;
      }
      if (other.input_ != null) {
        if (input_ == null) {
          input_ = new global::Asgt.Jester.V1Alpha1.BankRequest.Types.Data();
        }
        Input.MergeFrom(other.Input);
      }
      trueValues_.Add(other.trueValues_);
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
            if (input_ == null) {
              input_ = new global::Asgt.Jester.V1Alpha1.BankRequest.Types.Data();
            }
            input.ReadMessage(input_);
            break;
          }
          case 18: {
            trueValues_.AddEntriesFrom(input, _repeated_trueValues_codec);
            break;
          }
        }
      }
    }

  }

  public sealed partial class CreateBankDatasetRequest : pb::IMessage<CreateBankDatasetRequest> {
    private static readonly pb::MessageParser<CreateBankDatasetRequest> _parser = new pb::MessageParser<CreateBankDatasetRequest>(() => new CreateBankDatasetRequest());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<CreateBankDatasetRequest> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::Asgt.Dataservice.V1Alpha1.BankReflection.Descriptor.MessageTypes[2]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public CreateBankDatasetRequest() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public CreateBankDatasetRequest(CreateBankDatasetRequest other) : this() {
      datasetName_ = other.datasetName_;
      tags_ = other.tags_.Clone();
      entries_ = other.entries_.Clone();
      retentionPolicy_ = other.retentionPolicy_ != null ? other.retentionPolicy_.Clone() : null;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public CreateBankDatasetRequest Clone() {
      return new CreateBankDatasetRequest(this);
    }

    /// <summary>Field number for the "dataset_name" field.</summary>
    public const int DatasetNameFieldNumber = 1;
    private string datasetName_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string DatasetName {
      get { return datasetName_; }
      set {
        datasetName_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "tags" field.</summary>
    public const int TagsFieldNumber = 2;
    private static readonly pb::FieldCodec<string> _repeated_tags_codec
        = pb::FieldCodec.ForString(18);
    private readonly pbc::RepeatedField<string> tags_ = new pbc::RepeatedField<string>();
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public pbc::RepeatedField<string> Tags {
      get { return tags_; }
    }

    /// <summary>Field number for the "entries" field.</summary>
    public const int EntriesFieldNumber = 3;
    private static readonly pb::FieldCodec<global::Asgt.Dataservice.V1Alpha1.BankEntryInput> _repeated_entries_codec
        = pb::FieldCodec.ForMessage(26, global::Asgt.Dataservice.V1Alpha1.BankEntryInput.Parser);
    private readonly pbc::RepeatedField<global::Asgt.Dataservice.V1Alpha1.BankEntryInput> entries_ = new pbc::RepeatedField<global::Asgt.Dataservice.V1Alpha1.BankEntryInput>();
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public pbc::RepeatedField<global::Asgt.Dataservice.V1Alpha1.BankEntryInput> Entries {
      get { return entries_; }
    }

    /// <summary>Field number for the "retention_policy" field.</summary>
    public const int RetentionPolicyFieldNumber = 4;
    private global::Asgt.Dataservice.V1Alpha1.RetentionPolicy retentionPolicy_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public global::Asgt.Dataservice.V1Alpha1.RetentionPolicy RetentionPolicy {
      get { return retentionPolicy_; }
      set {
        retentionPolicy_ = value;
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as CreateBankDatasetRequest);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(CreateBankDatasetRequest other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (DatasetName != other.DatasetName) return false;
      if(!tags_.Equals(other.tags_)) return false;
      if(!entries_.Equals(other.entries_)) return false;
      if (!object.Equals(RetentionPolicy, other.RetentionPolicy)) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (DatasetName.Length != 0) hash ^= DatasetName.GetHashCode();
      hash ^= tags_.GetHashCode();
      hash ^= entries_.GetHashCode();
      if (retentionPolicy_ != null) hash ^= RetentionPolicy.GetHashCode();
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
      if (DatasetName.Length != 0) {
        output.WriteRawTag(10);
        output.WriteString(DatasetName);
      }
      tags_.WriteTo(output, _repeated_tags_codec);
      entries_.WriteTo(output, _repeated_entries_codec);
      if (retentionPolicy_ != null) {
        output.WriteRawTag(34);
        output.WriteMessage(RetentionPolicy);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (DatasetName.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(DatasetName);
      }
      size += tags_.CalculateSize(_repeated_tags_codec);
      size += entries_.CalculateSize(_repeated_entries_codec);
      if (retentionPolicy_ != null) {
        size += 1 + pb::CodedOutputStream.ComputeMessageSize(RetentionPolicy);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(CreateBankDatasetRequest other) {
      if (other == null) {
        return;
      }
      if (other.DatasetName.Length != 0) {
        DatasetName = other.DatasetName;
      }
      tags_.Add(other.tags_);
      entries_.Add(other.entries_);
      if (other.retentionPolicy_ != null) {
        if (retentionPolicy_ == null) {
          retentionPolicy_ = new global::Asgt.Dataservice.V1Alpha1.RetentionPolicy();
        }
        RetentionPolicy.MergeFrom(other.RetentionPolicy);
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
            DatasetName = input.ReadString();
            break;
          }
          case 18: {
            tags_.AddEntriesFrom(input, _repeated_tags_codec);
            break;
          }
          case 26: {
            entries_.AddEntriesFrom(input, _repeated_entries_codec);
            break;
          }
          case 34: {
            if (retentionPolicy_ == null) {
              retentionPolicy_ = new global::Asgt.Dataservice.V1Alpha1.RetentionPolicy();
            }
            input.ReadMessage(retentionPolicy_);
            break;
          }
        }
      }
    }

  }

  public sealed partial class AppendBankDataRequest : pb::IMessage<AppendBankDataRequest> {
    private static readonly pb::MessageParser<AppendBankDataRequest> _parser = new pb::MessageParser<AppendBankDataRequest>(() => new AppendBankDataRequest());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<AppendBankDataRequest> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::Asgt.Dataservice.V1Alpha1.BankReflection.Descriptor.MessageTypes[3]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public AppendBankDataRequest() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public AppendBankDataRequest(AppendBankDataRequest other) : this() {
      datasetName_ = other.datasetName_;
      entries_ = other.entries_.Clone();
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public AppendBankDataRequest Clone() {
      return new AppendBankDataRequest(this);
    }

    /// <summary>Field number for the "dataset_name" field.</summary>
    public const int DatasetNameFieldNumber = 1;
    private string datasetName_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string DatasetName {
      get { return datasetName_; }
      set {
        datasetName_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "entries" field.</summary>
    public const int EntriesFieldNumber = 3;
    private static readonly pb::FieldCodec<global::Asgt.Dataservice.V1Alpha1.BankEntryInput> _repeated_entries_codec
        = pb::FieldCodec.ForMessage(26, global::Asgt.Dataservice.V1Alpha1.BankEntryInput.Parser);
    private readonly pbc::RepeatedField<global::Asgt.Dataservice.V1Alpha1.BankEntryInput> entries_ = new pbc::RepeatedField<global::Asgt.Dataservice.V1Alpha1.BankEntryInput>();
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public pbc::RepeatedField<global::Asgt.Dataservice.V1Alpha1.BankEntryInput> Entries {
      get { return entries_; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as AppendBankDataRequest);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(AppendBankDataRequest other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (DatasetName != other.DatasetName) return false;
      if(!entries_.Equals(other.entries_)) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (DatasetName.Length != 0) hash ^= DatasetName.GetHashCode();
      hash ^= entries_.GetHashCode();
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
      if (DatasetName.Length != 0) {
        output.WriteRawTag(10);
        output.WriteString(DatasetName);
      }
      entries_.WriteTo(output, _repeated_entries_codec);
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (DatasetName.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(DatasetName);
      }
      size += entries_.CalculateSize(_repeated_entries_codec);
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(AppendBankDataRequest other) {
      if (other == null) {
        return;
      }
      if (other.DatasetName.Length != 0) {
        DatasetName = other.DatasetName;
      }
      entries_.Add(other.entries_);
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
            DatasetName = input.ReadString();
            break;
          }
          case 26: {
            entries_.AddEntriesFrom(input, _repeated_entries_codec);
            break;
          }
        }
      }
    }

  }

  #endregion

}

#endregion Designer generated code
