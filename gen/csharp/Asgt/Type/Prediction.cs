// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: asgt/type/prediction.proto
// </auto-generated>
#pragma warning disable 1591, 0612, 3021, 8981
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
namespace Asgt.Type {

  /// <summary>Holder for reflection information generated from asgt/type/prediction.proto</summary>
  public static partial class PredictionReflection {

    #region Descriptor
    /// <summary>File descriptor for asgt/type/prediction.proto</summary>
    public static pbr::FileDescriptor Descriptor {
      get { return descriptor; }
    }
    private static pbr::FileDescriptor descriptor;

    static PredictionReflection() {
      byte[] descriptorData = global::System.Convert.FromBase64String(
          string.Concat(
            "Chphc2d0L3R5cGUvcHJlZGljdGlvbi5wcm90bxIJYXNndC50eXBlGhxnZW5f",
            "YnFfc2NoZW1hL2JxX2ZpZWxkLnByb3RvGh5nb29nbGUvcHJvdG9idWYvd3Jh",
            "cHBlcnMucHJvdG8iwQEKCkNvbmZpZGVuY2USMQoFbGV2ZWwYASABKA4yGy5h",
            "c2d0LnR5cGUuQ29uZmlkZW5jZS5MZXZlbFIFbGV2ZWwSMQoFdmFsdWUYAiAB",
            "KAsyGy5nb29nbGUucHJvdG9idWYuRmxvYXRWYWx1ZVIFdmFsdWUiTQoFTGV2",
            "ZWwSCwoHVU5LTk9XThAAEgwKCFZFUllfTE9XEAESBwoDTE9XEAISBwoDTUlE",
            "EAMSCAoESElHSBAEEg0KCVZFUllfSElHSBAFIowCCgpQcmVkaWN0aW9uEjYK",
            "B3RhcmdldHMYASADKAsyHC5hc2d0LnR5cGUuUHJlZGljdGlvbi5UYXJnZXRS",
            "B3RhcmdldHMaxQEKBlRhcmdldBISCgRuYW1lGAEgASgJUgRuYW1lEkYKCmNh",
            "bmRpZGF0ZXMYAiADKAsyJi5hc2d0LnR5cGUuUHJlZGljdGlvbi5UYXJnZXQu",
            "Q2FuZGlkYXRlUgpjYW5kaWRhdGVzGl8KCUNhbmRpZGF0ZRIbCgV2YWx1ZRgB",
            "IAEoCUIF6j8CCAFSBXZhbHVlEjUKCmNvbmZpZGVuY2UYAiABKAsyFS5hc2d0",
            "LnR5cGUuQ29uZmlkZW5jZVIKY29uZmlkZW5jZUI4WjZnaXRodWIuY29tL2Ut",
            "Y29ub21pYy92bWxhcGlzL2dlbi9nby9hc2d0L3R5cGU7YXNndHR5cGViBnBy",
            "b3RvMw=="));
      descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
          new pbr::FileDescriptor[] { global::GenBqSchema.BqFieldReflection.Descriptor, global::Google.Protobuf.WellKnownTypes.WrappersReflection.Descriptor, },
          new pbr::GeneratedClrTypeInfo(null, null, new pbr::GeneratedClrTypeInfo[] {
            new pbr::GeneratedClrTypeInfo(typeof(global::Asgt.Type.Confidence), global::Asgt.Type.Confidence.Parser, new[]{ "Level", "Value" }, null, new[]{ typeof(global::Asgt.Type.Confidence.Types.Level) }, null, null),
            new pbr::GeneratedClrTypeInfo(typeof(global::Asgt.Type.Prediction), global::Asgt.Type.Prediction.Parser, new[]{ "Targets" }, null, null, null, new pbr::GeneratedClrTypeInfo[] { new pbr::GeneratedClrTypeInfo(typeof(global::Asgt.Type.Prediction.Types.Target), global::Asgt.Type.Prediction.Types.Target.Parser, new[]{ "Name", "Candidates" }, null, null, null, new pbr::GeneratedClrTypeInfo[] { new pbr::GeneratedClrTypeInfo(typeof(global::Asgt.Type.Prediction.Types.Target.Types.Candidate), global::Asgt.Type.Prediction.Types.Target.Types.Candidate.Parser, new[]{ "Value", "Confidence" }, null, null, null, null)})})
          }));
    }
    #endregion

  }
  #region Messages
  /// <summary>
  /// Common types
  /// </summary>
  public sealed partial class Confidence : pb::IMessage<Confidence>
  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      , pb::IBufferMessage
  #endif
  {
    private static readonly pb::MessageParser<Confidence> _parser = new pb::MessageParser<Confidence>(() => new Confidence());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static pb::MessageParser<Confidence> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::Asgt.Type.PredictionReflection.Descriptor.MessageTypes[0]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public Confidence() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public Confidence(Confidence other) : this() {
      level_ = other.level_;
      Value = other.Value;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public Confidence Clone() {
      return new Confidence(this);
    }

    /// <summary>Field number for the "level" field.</summary>
    public const int LevelFieldNumber = 1;
    private global::Asgt.Type.Confidence.Types.Level level_ = global::Asgt.Type.Confidence.Types.Level.Unknown;
    /// <summary>
    /// A bucketized representation of confidence, which is intended to give clients
    /// highly stable results across model upgrades.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public global::Asgt.Type.Confidence.Types.Level Level {
      get { return level_; }
      set {
        level_ = value;
      }
    }

    /// <summary>Field number for the "value" field.</summary>
    public const int ValueFieldNumber = 2;
    private static readonly pb::FieldCodec<float?> _single_value_codec = pb::FieldCodec.ForStructWrapper<float>(18);
    private float? value_;
    /// <summary>
    /// The confidence value
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public float? Value {
      get { return value_; }
      set {
        value_ = value;
      }
    }


    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override bool Equals(object other) {
      return Equals(other as Confidence);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public bool Equals(Confidence other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (Level != other.Level) return false;
      if (!pbc::ProtobufEqualityComparers.BitwiseNullableSingleEqualityComparer.Equals(Value, other.Value)) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override int GetHashCode() {
      int hash = 1;
      if (Level != global::Asgt.Type.Confidence.Types.Level.Unknown) hash ^= Level.GetHashCode();
      if (value_ != null) hash ^= pbc::ProtobufEqualityComparers.BitwiseNullableSingleEqualityComparer.GetHashCode(Value);
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
      if (Level != global::Asgt.Type.Confidence.Types.Level.Unknown) {
        output.WriteRawTag(8);
        output.WriteEnum((int) Level);
      }
      if (value_ != null) {
        _single_value_codec.WriteTagAndValue(output, Value);
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
      if (Level != global::Asgt.Type.Confidence.Types.Level.Unknown) {
        output.WriteRawTag(8);
        output.WriteEnum((int) Level);
      }
      if (value_ != null) {
        _single_value_codec.WriteTagAndValue(ref output, Value);
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
      if (Level != global::Asgt.Type.Confidence.Types.Level.Unknown) {
        size += 1 + pb::CodedOutputStream.ComputeEnumSize((int) Level);
      }
      if (value_ != null) {
        size += _single_value_codec.CalculateSizeWithTag(Value);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public void MergeFrom(Confidence other) {
      if (other == null) {
        return;
      }
      if (other.Level != global::Asgt.Type.Confidence.Types.Level.Unknown) {
        Level = other.Level;
      }
      if (other.value_ != null) {
        if (value_ == null || other.Value != 0F) {
          Value = other.Value;
        }
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
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, input);
            break;
          case 8: {
            Level = (global::Asgt.Type.Confidence.Types.Level) input.ReadEnum();
            break;
          }
          case 18: {
            float? value = _single_value_codec.Read(input);
            if (value_ == null || value != 0F) {
              Value = value;
            }
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
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, ref input);
            break;
          case 8: {
            Level = (global::Asgt.Type.Confidence.Types.Level) input.ReadEnum();
            break;
          }
          case 18: {
            float? value = _single_value_codec.Read(ref input);
            if (value_ == null || value != 0F) {
              Value = value;
            }
            break;
          }
        }
      }
    }
    #endif

    #region Nested types
    /// <summary>Container for nested types declared in the Confidence message type.</summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static partial class Types {
      public enum Level {
        [pbr::OriginalName("UNKNOWN")] Unknown = 0,
        [pbr::OriginalName("VERY_LOW")] VeryLow = 1,
        [pbr::OriginalName("LOW")] Low = 2,
        [pbr::OriginalName("MID")] Mid = 3,
        [pbr::OriginalName("HIGH")] High = 4,
        [pbr::OriginalName("VERY_HIGH")] VeryHigh = 5,
      }

    }
    #endregion

  }

  public sealed partial class Prediction : pb::IMessage<Prediction>
  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      , pb::IBufferMessage
  #endif
  {
    private static readonly pb::MessageParser<Prediction> _parser = new pb::MessageParser<Prediction>(() => new Prediction());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static pb::MessageParser<Prediction> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::Asgt.Type.PredictionReflection.Descriptor.MessageTypes[1]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public Prediction() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public Prediction(Prediction other) : this() {
      targets_ = other.targets_.Clone();
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public Prediction Clone() {
      return new Prediction(this);
    }

    /// <summary>Field number for the "targets" field.</summary>
    public const int TargetsFieldNumber = 1;
    private static readonly pb::FieldCodec<global::Asgt.Type.Prediction.Types.Target> _repeated_targets_codec
        = pb::FieldCodec.ForMessage(10, global::Asgt.Type.Prediction.Types.Target.Parser);
    private readonly pbc::RepeatedField<global::Asgt.Type.Prediction.Types.Target> targets_ = new pbc::RepeatedField<global::Asgt.Type.Prediction.Types.Target>();
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public pbc::RepeatedField<global::Asgt.Type.Prediction.Types.Target> Targets {
      get { return targets_; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override bool Equals(object other) {
      return Equals(other as Prediction);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public bool Equals(Prediction other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if(!targets_.Equals(other.targets_)) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override int GetHashCode() {
      int hash = 1;
      hash ^= targets_.GetHashCode();
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
      targets_.WriteTo(output, _repeated_targets_codec);
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    #endif
    }

    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    void pb::IBufferMessage.InternalWriteTo(ref pb::WriteContext output) {
      targets_.WriteTo(ref output, _repeated_targets_codec);
      if (_unknownFields != null) {
        _unknownFields.WriteTo(ref output);
      }
    }
    #endif

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public int CalculateSize() {
      int size = 0;
      size += targets_.CalculateSize(_repeated_targets_codec);
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public void MergeFrom(Prediction other) {
      if (other == null) {
        return;
      }
      targets_.Add(other.targets_);
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
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, input);
            break;
          case 10: {
            targets_.AddEntriesFrom(input, _repeated_targets_codec);
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
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, ref input);
            break;
          case 10: {
            targets_.AddEntriesFrom(ref input, _repeated_targets_codec);
            break;
          }
        }
      }
    }
    #endif

    #region Nested types
    /// <summary>Container for nested types declared in the Prediction message type.</summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static partial class Types {
      public sealed partial class Target : pb::IMessage<Target>
      #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
          , pb::IBufferMessage
      #endif
      {
        private static readonly pb::MessageParser<Target> _parser = new pb::MessageParser<Target>(() => new Target());
        private pb::UnknownFieldSet _unknownFields;
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public static pb::MessageParser<Target> Parser { get { return _parser; } }

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public static pbr::MessageDescriptor Descriptor {
          get { return global::Asgt.Type.Prediction.Descriptor.NestedTypes[0]; }
        }

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        pbr::MessageDescriptor pb::IMessage.Descriptor {
          get { return Descriptor; }
        }

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public Target() {
          OnConstruction();
        }

        partial void OnConstruction();

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public Target(Target other) : this() {
          name_ = other.name_;
          candidates_ = other.candidates_.Clone();
          _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
        }

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public Target Clone() {
          return new Target(this);
        }

        /// <summary>Field number for the "name" field.</summary>
        public const int NameFieldNumber = 1;
        private string name_ = "";
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public string Name {
          get { return name_; }
          set {
            name_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
          }
        }

        /// <summary>Field number for the "candidates" field.</summary>
        public const int CandidatesFieldNumber = 2;
        private static readonly pb::FieldCodec<global::Asgt.Type.Prediction.Types.Target.Types.Candidate> _repeated_candidates_codec
            = pb::FieldCodec.ForMessage(18, global::Asgt.Type.Prediction.Types.Target.Types.Candidate.Parser);
        private readonly pbc::RepeatedField<global::Asgt.Type.Prediction.Types.Target.Types.Candidate> candidates_ = new pbc::RepeatedField<global::Asgt.Type.Prediction.Types.Target.Types.Candidate>();
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public pbc::RepeatedField<global::Asgt.Type.Prediction.Types.Target.Types.Candidate> Candidates {
          get { return candidates_; }
        }

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public override bool Equals(object other) {
          return Equals(other as Target);
        }

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public bool Equals(Target other) {
          if (ReferenceEquals(other, null)) {
            return false;
          }
          if (ReferenceEquals(other, this)) {
            return true;
          }
          if (Name != other.Name) return false;
          if(!candidates_.Equals(other.candidates_)) return false;
          return Equals(_unknownFields, other._unknownFields);
        }

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public override int GetHashCode() {
          int hash = 1;
          if (Name.Length != 0) hash ^= Name.GetHashCode();
          hash ^= candidates_.GetHashCode();
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
          if (Name.Length != 0) {
            output.WriteRawTag(10);
            output.WriteString(Name);
          }
          candidates_.WriteTo(output, _repeated_candidates_codec);
          if (_unknownFields != null) {
            _unknownFields.WriteTo(output);
          }
        #endif
        }

        #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        void pb::IBufferMessage.InternalWriteTo(ref pb::WriteContext output) {
          if (Name.Length != 0) {
            output.WriteRawTag(10);
            output.WriteString(Name);
          }
          candidates_.WriteTo(ref output, _repeated_candidates_codec);
          if (_unknownFields != null) {
            _unknownFields.WriteTo(ref output);
          }
        }
        #endif

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public int CalculateSize() {
          int size = 0;
          if (Name.Length != 0) {
            size += 1 + pb::CodedOutputStream.ComputeStringSize(Name);
          }
          size += candidates_.CalculateSize(_repeated_candidates_codec);
          if (_unknownFields != null) {
            size += _unknownFields.CalculateSize();
          }
          return size;
        }

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public void MergeFrom(Target other) {
          if (other == null) {
            return;
          }
          if (other.Name.Length != 0) {
            Name = other.Name;
          }
          candidates_.Add(other.candidates_);
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
            switch(tag) {
              default:
                _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, input);
                break;
              case 10: {
                Name = input.ReadString();
                break;
              }
              case 18: {
                candidates_.AddEntriesFrom(input, _repeated_candidates_codec);
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
            switch(tag) {
              default:
                _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, ref input);
                break;
              case 10: {
                Name = input.ReadString();
                break;
              }
              case 18: {
                candidates_.AddEntriesFrom(ref input, _repeated_candidates_codec);
                break;
              }
            }
          }
        }
        #endif

        #region Nested types
        /// <summary>Container for nested types declared in the Target message type.</summary>
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public static partial class Types {
          public sealed partial class Candidate : pb::IMessage<Candidate>
          #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
              , pb::IBufferMessage
          #endif
          {
            private static readonly pb::MessageParser<Candidate> _parser = new pb::MessageParser<Candidate>(() => new Candidate());
            private pb::UnknownFieldSet _unknownFields;
            [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
            [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
            public static pb::MessageParser<Candidate> Parser { get { return _parser; } }

            [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
            [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
            public static pbr::MessageDescriptor Descriptor {
              get { return global::Asgt.Type.Prediction.Types.Target.Descriptor.NestedTypes[0]; }
            }

            [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
            [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
            pbr::MessageDescriptor pb::IMessage.Descriptor {
              get { return Descriptor; }
            }

            [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
            [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
            public Candidate() {
              OnConstruction();
            }

            partial void OnConstruction();

            [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
            [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
            public Candidate(Candidate other) : this() {
              value_ = other.value_;
              confidence_ = other.confidence_ != null ? other.confidence_.Clone() : null;
              _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
            }

            [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
            [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
            public Candidate Clone() {
              return new Candidate(this);
            }

            /// <summary>Field number for the "value" field.</summary>
            public const int ValueFieldNumber = 1;
            private string value_ = "";
            [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
            [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
            public string Value {
              get { return value_; }
              set {
                value_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
              }
            }

            /// <summary>Field number for the "confidence" field.</summary>
            public const int ConfidenceFieldNumber = 2;
            private global::Asgt.Type.Confidence confidence_;
            [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
            [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
            public global::Asgt.Type.Confidence Confidence {
              get { return confidence_; }
              set {
                confidence_ = value;
              }
            }

            [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
            [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
            public override bool Equals(object other) {
              return Equals(other as Candidate);
            }

            [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
            [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
            public bool Equals(Candidate other) {
              if (ReferenceEquals(other, null)) {
                return false;
              }
              if (ReferenceEquals(other, this)) {
                return true;
              }
              if (Value != other.Value) return false;
              if (!object.Equals(Confidence, other.Confidence)) return false;
              return Equals(_unknownFields, other._unknownFields);
            }

            [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
            [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
            public override int GetHashCode() {
              int hash = 1;
              if (Value.Length != 0) hash ^= Value.GetHashCode();
              if (confidence_ != null) hash ^= Confidence.GetHashCode();
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
              if (Value.Length != 0) {
                output.WriteRawTag(10);
                output.WriteString(Value);
              }
              if (confidence_ != null) {
                output.WriteRawTag(18);
                output.WriteMessage(Confidence);
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
              if (Value.Length != 0) {
                output.WriteRawTag(10);
                output.WriteString(Value);
              }
              if (confidence_ != null) {
                output.WriteRawTag(18);
                output.WriteMessage(Confidence);
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
              if (Value.Length != 0) {
                size += 1 + pb::CodedOutputStream.ComputeStringSize(Value);
              }
              if (confidence_ != null) {
                size += 1 + pb::CodedOutputStream.ComputeMessageSize(Confidence);
              }
              if (_unknownFields != null) {
                size += _unknownFields.CalculateSize();
              }
              return size;
            }

            [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
            [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
            public void MergeFrom(Candidate other) {
              if (other == null) {
                return;
              }
              if (other.Value.Length != 0) {
                Value = other.Value;
              }
              if (other.confidence_ != null) {
                if (confidence_ == null) {
                  Confidence = new global::Asgt.Type.Confidence();
                }
                Confidence.MergeFrom(other.Confidence);
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
                switch(tag) {
                  default:
                    _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, input);
                    break;
                  case 10: {
                    Value = input.ReadString();
                    break;
                  }
                  case 18: {
                    if (confidence_ == null) {
                      Confidence = new global::Asgt.Type.Confidence();
                    }
                    input.ReadMessage(Confidence);
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
                switch(tag) {
                  default:
                    _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, ref input);
                    break;
                  case 10: {
                    Value = input.ReadString();
                    break;
                  }
                  case 18: {
                    if (confidence_ == null) {
                      Confidence = new global::Asgt.Type.Confidence();
                    }
                    input.ReadMessage(Confidence);
                    break;
                  }
                }
              }
            }
            #endif

          }

        }
        #endregion

      }

    }
    #endregion

  }

  #endregion

}

#endregion Designer generated code
