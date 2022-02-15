// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: asgt/jester/v1/jester.proto
// </auto-generated>
#pragma warning disable 1591, 0612, 3021
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
namespace Asgt.Jester.V1 {

  /// <summary>Holder for reflection information generated from asgt/jester/v1/jester.proto</summary>
  public static partial class JesterReflection {

    #region Descriptor
    /// <summary>File descriptor for asgt/jester/v1/jester.proto</summary>
    public static pbr::FileDescriptor Descriptor {
      get { return descriptor; }
    }
    private static pbr::FileDescriptor descriptor;

    static JesterReflection() {
      byte[] descriptorData = global::System.Convert.FromBase64String(
          string.Concat(
            "Chthc2d0L2plc3Rlci92MS9qZXN0ZXIucHJvdG8SDmFzZ3QuamVzdGVyLnYx",
            "GhRhc2d0L3R5cGUvZGF0YS5wcm90bxoVYXNndC90eXBlL21vZGVsLnByb3Rv",
            "Ghphc2d0L3R5cGUvcHJlZGljdGlvbi5wcm90bxocZ29vZ2xlL2FwaS9hbm5v",
            "dGF0aW9ucy5wcm90bxoZb3B0aW9ucy9hbm5vdGF0aW9ucy5wcm90byJhChJT",
            "dWdnZXN0aW9uUmVzcG9uc2USKgoLcHJlZGljdGlvbnMYASADKAsyFS5hc2d0",
            "LnR5cGUuUHJlZGljdGlvbhIfCgVtb2RlbBgCIAEoCzIQLmFzZ3QudHlwZS5N",
            "b2RlbCJiChFTdWdnZXN0aW9uT3B0aW9ucxIYChBzdWdnZXN0aW9uX2xpbWl0",
            "GAEgASgFEjMKDm1pbl9jb25maWRlbmNlGAIgASgOMhsuYXNndC50eXBlLkNv",
            "bmZpZGVuY2UuTGV2ZWwikgEKEVN1Z2dlc3Rpb25SZXF1ZXN0EgwKBG5hbWUY",
            "ASABKAkSDAoEdHlwZRgCIAEoCRIfCgZpbnB1dHMYAyADKAsyDy5hc2d0LnR5",
            "cGUuRGF0YRIyCgdvcHRpb25zGAQgASgLMiEuYXNndC5qZXN0ZXIudjEuU3Vn",
            "Z2VzdGlvbk9wdGlvbnMSDAoEdGFncxgFIAMoCTKAAQoGSmVzdGVyEnYKB1N1",
            "Z2dlc3QSIS5hc2d0Lmplc3Rlci52MS5TdWdnZXN0aW9uUmVxdWVzdBoiLmFz",
            "Z3QuamVzdGVyLnYxLlN1Z2dlc3Rpb25SZXNwb25zZSIkgtPkkwIeIhkvdjEv",
            "e3R5cGV9L3tuYW1lfTpzdWdnZXN0OgEqQnhaOWdpdGh1Yi5jb20vZS1jb25v",
            "bWljL3ZtbGFwaXMvZ2VuL2dvL2FzZ3QvamVzdGVyL3YxO2plc3RlcpJBOhIR",
            "CgtBdXRvU3VnZ2VzdDICdjEqAQIyEGFwcGxpY2F0aW9uL2pzb246EGFwcGxp",
            "Y2F0aW9uL2pzb25iBnByb3RvMw=="));
      descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
          new pbr::FileDescriptor[] { global::Asgt.Type.DataReflection.Descriptor, global::Asgt.Type.ModelReflection.Descriptor, global::Asgt.Type.PredictionReflection.Descriptor, global::Google.Api.AnnotationsReflection.Descriptor, global::Grpc.Gateway.ProtocGenOpenapiv2.Options.AnnotationsReflection.Descriptor, },
          new pbr::GeneratedClrTypeInfo(null, null, new pbr::GeneratedClrTypeInfo[] {
            new pbr::GeneratedClrTypeInfo(typeof(global::Asgt.Jester.V1.SuggestionResponse), global::Asgt.Jester.V1.SuggestionResponse.Parser, new[]{ "Predictions", "Model" }, null, null, null, null),
            new pbr::GeneratedClrTypeInfo(typeof(global::Asgt.Jester.V1.SuggestionOptions), global::Asgt.Jester.V1.SuggestionOptions.Parser, new[]{ "SuggestionLimit", "MinConfidence" }, null, null, null, null),
            new pbr::GeneratedClrTypeInfo(typeof(global::Asgt.Jester.V1.SuggestionRequest), global::Asgt.Jester.V1.SuggestionRequest.Parser, new[]{ "Name", "Type", "Inputs", "Options", "Tags" }, null, null, null, null)
          }));
    }
    #endregion

  }
  #region Messages
  /// <summary>
  /// AutoSuggest
  /// </summary>
  public sealed partial class SuggestionResponse : pb::IMessage<SuggestionResponse>
  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      , pb::IBufferMessage
  #endif
  {
    private static readonly pb::MessageParser<SuggestionResponse> _parser = new pb::MessageParser<SuggestionResponse>(() => new SuggestionResponse());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<SuggestionResponse> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::Asgt.Jester.V1.JesterReflection.Descriptor.MessageTypes[0]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public SuggestionResponse() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public SuggestionResponse(SuggestionResponse other) : this() {
      predictions_ = other.predictions_.Clone();
      model_ = other.model_ != null ? other.model_.Clone() : null;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public SuggestionResponse Clone() {
      return new SuggestionResponse(this);
    }

    /// <summary>Field number for the "predictions" field.</summary>
    public const int PredictionsFieldNumber = 1;
    private static readonly pb::FieldCodec<global::Asgt.Type.Prediction> _repeated_predictions_codec
        = pb::FieldCodec.ForMessage(10, global::Asgt.Type.Prediction.Parser);
    private readonly pbc::RepeatedField<global::Asgt.Type.Prediction> predictions_ = new pbc::RepeatedField<global::Asgt.Type.Prediction>();
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public pbc::RepeatedField<global::Asgt.Type.Prediction> Predictions {
      get { return predictions_; }
    }

    /// <summary>Field number for the "model" field.</summary>
    public const int ModelFieldNumber = 2;
    private global::Asgt.Type.Model model_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public global::Asgt.Type.Model Model {
      get { return model_; }
      set {
        model_ = value;
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as SuggestionResponse);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(SuggestionResponse other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if(!predictions_.Equals(other.predictions_)) return false;
      if (!object.Equals(Model, other.Model)) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      hash ^= predictions_.GetHashCode();
      if (model_ != null) hash ^= Model.GetHashCode();
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
      predictions_.WriteTo(output, _repeated_predictions_codec);
      if (model_ != null) {
        output.WriteRawTag(18);
        output.WriteMessage(Model);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      size += predictions_.CalculateSize(_repeated_predictions_codec);
      if (model_ != null) {
        size += 1 + pb::CodedOutputStream.ComputeMessageSize(Model);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(SuggestionResponse other) {
      if (other == null) {
        return;
      }
      predictions_.Add(other.predictions_);
      if (other.model_ != null) {
        if (model_ == null) {
          Model = new global::Asgt.Type.Model();
        }
        Model.MergeFrom(other.Model);
      }
      _unknownFields = pb::UnknownFieldSet.MergeFrom(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(pb::CodedInputStream input) {
    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      input.ReadRawMessage(this);
    #else
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, input);
            break;
          case 10: {
            predictions_.AddEntriesFrom(input, _repeated_predictions_codec);
            break;
          }
          case 18: {
            if (model_ == null) {
              Model = new global::Asgt.Type.Model();
            }
            input.ReadMessage(Model);
            break;
          }
        }
      }
    #endif
    }

    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    void pb::IBufferMessage.InternalMergeFrom(ref pb::ParseContext input) {
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, ref input);
            break;
          case 10: {
            predictions_.AddEntriesFrom(ref input, _repeated_predictions_codec);
            break;
          }
          case 18: {
            if (model_ == null) {
              Model = new global::Asgt.Type.Model();
            }
            input.ReadMessage(Model);
            break;
          }
        }
      }
    }
    #endif

  }

  public sealed partial class SuggestionOptions : pb::IMessage<SuggestionOptions>
  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      , pb::IBufferMessage
  #endif
  {
    private static readonly pb::MessageParser<SuggestionOptions> _parser = new pb::MessageParser<SuggestionOptions>(() => new SuggestionOptions());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<SuggestionOptions> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::Asgt.Jester.V1.JesterReflection.Descriptor.MessageTypes[1]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public SuggestionOptions() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public SuggestionOptions(SuggestionOptions other) : this() {
      suggestionLimit_ = other.suggestionLimit_;
      minConfidence_ = other.minConfidence_;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public SuggestionOptions Clone() {
      return new SuggestionOptions(this);
    }

    /// <summary>Field number for the "suggestion_limit" field.</summary>
    public const int SuggestionLimitFieldNumber = 1;
    private int suggestionLimit_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int SuggestionLimit {
      get { return suggestionLimit_; }
      set {
        suggestionLimit_ = value;
      }
    }

    /// <summary>Field number for the "min_confidence" field.</summary>
    public const int MinConfidenceFieldNumber = 2;
    private global::Asgt.Type.Confidence.Types.Level minConfidence_ = global::Asgt.Type.Confidence.Types.Level.Unknown;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public global::Asgt.Type.Confidence.Types.Level MinConfidence {
      get { return minConfidence_; }
      set {
        minConfidence_ = value;
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as SuggestionOptions);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(SuggestionOptions other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (SuggestionLimit != other.SuggestionLimit) return false;
      if (MinConfidence != other.MinConfidence) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (SuggestionLimit != 0) hash ^= SuggestionLimit.GetHashCode();
      if (MinConfidence != global::Asgt.Type.Confidence.Types.Level.Unknown) hash ^= MinConfidence.GetHashCode();
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
      if (SuggestionLimit != 0) {
        output.WriteRawTag(8);
        output.WriteInt32(SuggestionLimit);
      }
      if (MinConfidence != global::Asgt.Type.Confidence.Types.Level.Unknown) {
        output.WriteRawTag(16);
        output.WriteEnum((int) MinConfidence);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (SuggestionLimit != 0) {
        size += 1 + pb::CodedOutputStream.ComputeInt32Size(SuggestionLimit);
      }
      if (MinConfidence != global::Asgt.Type.Confidence.Types.Level.Unknown) {
        size += 1 + pb::CodedOutputStream.ComputeEnumSize((int) MinConfidence);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(SuggestionOptions other) {
      if (other == null) {
        return;
      }
      if (other.SuggestionLimit != 0) {
        SuggestionLimit = other.SuggestionLimit;
      }
      if (other.MinConfidence != global::Asgt.Type.Confidence.Types.Level.Unknown) {
        MinConfidence = other.MinConfidence;
      }
      _unknownFields = pb::UnknownFieldSet.MergeFrom(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(pb::CodedInputStream input) {
    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      input.ReadRawMessage(this);
    #else
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, input);
            break;
          case 8: {
            SuggestionLimit = input.ReadInt32();
            break;
          }
          case 16: {
            MinConfidence = (global::Asgt.Type.Confidence.Types.Level) input.ReadEnum();
            break;
          }
        }
      }
    #endif
    }

    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    void pb::IBufferMessage.InternalMergeFrom(ref pb::ParseContext input) {
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, ref input);
            break;
          case 8: {
            SuggestionLimit = input.ReadInt32();
            break;
          }
          case 16: {
            MinConfidence = (global::Asgt.Type.Confidence.Types.Level) input.ReadEnum();
            break;
          }
        }
      }
    }
    #endif

  }

  public sealed partial class SuggestionRequest : pb::IMessage<SuggestionRequest>
  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      , pb::IBufferMessage
  #endif
  {
    private static readonly pb::MessageParser<SuggestionRequest> _parser = new pb::MessageParser<SuggestionRequest>(() => new SuggestionRequest());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<SuggestionRequest> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::Asgt.Jester.V1.JesterReflection.Descriptor.MessageTypes[2]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public SuggestionRequest() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public SuggestionRequest(SuggestionRequest other) : this() {
      name_ = other.name_;
      type_ = other.type_;
      inputs_ = other.inputs_.Clone();
      options_ = other.options_ != null ? other.options_.Clone() : null;
      tags_ = other.tags_.Clone();
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public SuggestionRequest Clone() {
      return new SuggestionRequest(this);
    }

    /// <summary>Field number for the "name" field.</summary>
    public const int NameFieldNumber = 1;
    private string name_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string Name {
      get { return name_; }
      set {
        name_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "type" field.</summary>
    public const int TypeFieldNumber = 2;
    private string type_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string Type {
      get { return type_; }
      set {
        type_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "inputs" field.</summary>
    public const int InputsFieldNumber = 3;
    private static readonly pb::FieldCodec<global::Asgt.Type.Data> _repeated_inputs_codec
        = pb::FieldCodec.ForMessage(26, global::Asgt.Type.Data.Parser);
    private readonly pbc::RepeatedField<global::Asgt.Type.Data> inputs_ = new pbc::RepeatedField<global::Asgt.Type.Data>();
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public pbc::RepeatedField<global::Asgt.Type.Data> Inputs {
      get { return inputs_; }
    }

    /// <summary>Field number for the "options" field.</summary>
    public const int OptionsFieldNumber = 4;
    private global::Asgt.Jester.V1.SuggestionOptions options_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public global::Asgt.Jester.V1.SuggestionOptions Options {
      get { return options_; }
      set {
        options_ = value;
      }
    }

    /// <summary>Field number for the "tags" field.</summary>
    public const int TagsFieldNumber = 5;
    private static readonly pb::FieldCodec<string> _repeated_tags_codec
        = pb::FieldCodec.ForString(42);
    private readonly pbc::RepeatedField<string> tags_ = new pbc::RepeatedField<string>();
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public pbc::RepeatedField<string> Tags {
      get { return tags_; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as SuggestionRequest);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(SuggestionRequest other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (Name != other.Name) return false;
      if (Type != other.Type) return false;
      if(!inputs_.Equals(other.inputs_)) return false;
      if (!object.Equals(Options, other.Options)) return false;
      if(!tags_.Equals(other.tags_)) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (Name.Length != 0) hash ^= Name.GetHashCode();
      if (Type.Length != 0) hash ^= Type.GetHashCode();
      hash ^= inputs_.GetHashCode();
      if (options_ != null) hash ^= Options.GetHashCode();
      hash ^= tags_.GetHashCode();
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
      if (Name.Length != 0) {
        output.WriteRawTag(10);
        output.WriteString(Name);
      }
      if (Type.Length != 0) {
        output.WriteRawTag(18);
        output.WriteString(Type);
      }
      inputs_.WriteTo(output, _repeated_inputs_codec);
      if (options_ != null) {
        output.WriteRawTag(34);
        output.WriteMessage(Options);
      }
      tags_.WriteTo(output, _repeated_tags_codec);
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (Name.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Name);
      }
      if (Type.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Type);
      }
      size += inputs_.CalculateSize(_repeated_inputs_codec);
      if (options_ != null) {
        size += 1 + pb::CodedOutputStream.ComputeMessageSize(Options);
      }
      size += tags_.CalculateSize(_repeated_tags_codec);
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(SuggestionRequest other) {
      if (other == null) {
        return;
      }
      if (other.Name.Length != 0) {
        Name = other.Name;
      }
      if (other.Type.Length != 0) {
        Type = other.Type;
      }
      inputs_.Add(other.inputs_);
      if (other.options_ != null) {
        if (options_ == null) {
          Options = new global::Asgt.Jester.V1.SuggestionOptions();
        }
        Options.MergeFrom(other.Options);
      }
      tags_.Add(other.tags_);
      _unknownFields = pb::UnknownFieldSet.MergeFrom(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(pb::CodedInputStream input) {
    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      input.ReadRawMessage(this);
    #else
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, input);
            break;
          case 10: {
            Name = input.ReadString();
            break;
          }
          case 18: {
            Type = input.ReadString();
            break;
          }
          case 26: {
            inputs_.AddEntriesFrom(input, _repeated_inputs_codec);
            break;
          }
          case 34: {
            if (options_ == null) {
              Options = new global::Asgt.Jester.V1.SuggestionOptions();
            }
            input.ReadMessage(Options);
            break;
          }
          case 42: {
            tags_.AddEntriesFrom(input, _repeated_tags_codec);
            break;
          }
        }
      }
    #endif
    }

    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    void pb::IBufferMessage.InternalMergeFrom(ref pb::ParseContext input) {
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, ref input);
            break;
          case 10: {
            Name = input.ReadString();
            break;
          }
          case 18: {
            Type = input.ReadString();
            break;
          }
          case 26: {
            inputs_.AddEntriesFrom(ref input, _repeated_inputs_codec);
            break;
          }
          case 34: {
            if (options_ == null) {
              Options = new global::Asgt.Jester.V1.SuggestionOptions();
            }
            input.ReadMessage(Options);
            break;
          }
          case 42: {
            tags_.AddEntriesFrom(ref input, _repeated_tags_codec);
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
