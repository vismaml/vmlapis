// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: asgt/type/target_metrics.proto
// </auto-generated>
#pragma warning disable 1591, 0612, 3021, 8981
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
namespace Asgt.Type {

  /// <summary>Holder for reflection information generated from asgt/type/target_metrics.proto</summary>
  public static partial class TargetMetricsReflection {

    #region Descriptor
    /// <summary>File descriptor for asgt/type/target_metrics.proto</summary>
    public static pbr::FileDescriptor Descriptor {
      get { return descriptor; }
    }
    private static pbr::FileDescriptor descriptor;

    static TargetMetricsReflection() {
      byte[] descriptorData = global::System.Convert.FromBase64String(
          string.Concat(
            "Ch5hc2d0L3R5cGUvdGFyZ2V0X21ldHJpY3MucHJvdG8SCWFzZ3QudHlwZSKU",
            "BAoNVGFyZ2V0TWV0cmljcxIWCgZ0YXJnZXQYASABKAlSBnRhcmdldBI5Cgdt",
            "ZXRyaWNzGAIgAygLMh8uYXNndC50eXBlLlRhcmdldE1ldHJpY3MuTWV0cmlj",
            "UgdtZXRyaWNzEicKD2NsYXNzZXNfb3JkZXJlZBgDIAMoCVIOY2xhc3Nlc09y",
            "ZGVyZWQaLAoSQ29uZnVzaW9uTWV0cmljUm93EhYKBmNvdW50cxgBIAMoBVIG",
            "Y291bnRzGtgCCgZNZXRyaWMSHAoJcHJlY2lzaW9uGAEgASgCUglwcmVjaXNp",
            "b24SHgoKY29uZmlkZW5jZRgCIAEoAlIKY29uZmlkZW5jZRIfCgthbnN3ZXJf",
            "cmF0ZRgDIAEoAlIKYW5zd2VyUmF0ZRIjCg10cnVlX3Bvc2l0aXZlGAQgASgF",
            "Ugx0cnVlUG9zaXRpdmUSIwoNdHJ1ZV9uZWdhdGl2ZRgFIAEoBVIMdHJ1ZU5l",
            "Z2F0aXZlEiUKDmZhbHNlX3Bvc2l0aXZlGAYgASgFUg1mYWxzZVBvc2l0aXZl",
            "EiUKDmZhbHNlX25lZ2F0aXZlGAcgASgFUg1mYWxzZU5lZ2F0aXZlElcKEENv",
            "bmZ1c2lvbk1ldHJpY3MYCCADKAsyKy5hc2d0LnR5cGUuVGFyZ2V0TWV0cmlj",
            "cy5Db25mdXNpb25NZXRyaWNSb3dSEENvbmZ1c2lvbk1ldHJpY3NCpQEKEmFp",
            "LnZpc21hLmFzZ3QudHlwZUISVGFyZ2V0TWV0cmljc1Byb3RvUAFaNmdpdGh1",
            "Yi5jb20vZS1jb25vbWljL3ZtbGFwaXMvZ2VuL2dvL2FzZ3QvdHlwZTthc2d0",
            "dHlwZaICA0FUWKoCCUFzZ3QuVHlwZcoCCUFzZ3RcVHlwZeICFUFzZ3RcVHlw",
            "ZVxHUEJNZXRhZGF0YeoCCkFzZ3Q6OlR5cGViBnByb3RvMw=="));
      descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
          new pbr::FileDescriptor[] { },
          new pbr::GeneratedClrTypeInfo(null, null, new pbr::GeneratedClrTypeInfo[] {
            new pbr::GeneratedClrTypeInfo(typeof(global::Asgt.Type.TargetMetrics), global::Asgt.Type.TargetMetrics.Parser, new[]{ "Target", "Metrics", "ClassesOrdered" }, null, null, null, new pbr::GeneratedClrTypeInfo[] { new pbr::GeneratedClrTypeInfo(typeof(global::Asgt.Type.TargetMetrics.Types.ConfusionMetricRow), global::Asgt.Type.TargetMetrics.Types.ConfusionMetricRow.Parser, new[]{ "Counts" }, null, null, null, null),
            new pbr::GeneratedClrTypeInfo(typeof(global::Asgt.Type.TargetMetrics.Types.Metric), global::Asgt.Type.TargetMetrics.Types.Metric.Parser, new[]{ "Precision", "Confidence", "AnswerRate", "TruePositive", "TrueNegative", "FalsePositive", "FalseNegative", "ConfusionMetrics" }, null, null, null, null)})
          }));
    }
    #endregion

  }
  #region Messages
  public sealed partial class TargetMetrics : pb::IMessage<TargetMetrics>
  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      , pb::IBufferMessage
  #endif
  {
    private static readonly pb::MessageParser<TargetMetrics> _parser = new pb::MessageParser<TargetMetrics>(() => new TargetMetrics());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static pb::MessageParser<TargetMetrics> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::Asgt.Type.TargetMetricsReflection.Descriptor.MessageTypes[0]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public TargetMetrics() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public TargetMetrics(TargetMetrics other) : this() {
      target_ = other.target_;
      metrics_ = other.metrics_.Clone();
      classesOrdered_ = other.classesOrdered_.Clone();
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public TargetMetrics Clone() {
      return new TargetMetrics(this);
    }

    /// <summary>Field number for the "target" field.</summary>
    public const int TargetFieldNumber = 1;
    private string target_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public string Target {
      get { return target_; }
      set {
        target_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "metrics" field.</summary>
    public const int MetricsFieldNumber = 2;
    private static readonly pb::FieldCodec<global::Asgt.Type.TargetMetrics.Types.Metric> _repeated_metrics_codec
        = pb::FieldCodec.ForMessage(18, global::Asgt.Type.TargetMetrics.Types.Metric.Parser);
    private readonly pbc::RepeatedField<global::Asgt.Type.TargetMetrics.Types.Metric> metrics_ = new pbc::RepeatedField<global::Asgt.Type.TargetMetrics.Types.Metric>();
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public pbc::RepeatedField<global::Asgt.Type.TargetMetrics.Types.Metric> Metrics {
      get { return metrics_; }
    }

    /// <summary>Field number for the "classes_ordered" field.</summary>
    public const int ClassesOrderedFieldNumber = 3;
    private static readonly pb::FieldCodec<string> _repeated_classesOrdered_codec
        = pb::FieldCodec.ForString(26);
    private readonly pbc::RepeatedField<string> classesOrdered_ = new pbc::RepeatedField<string>();
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public pbc::RepeatedField<string> ClassesOrdered {
      get { return classesOrdered_; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override bool Equals(object other) {
      return Equals(other as TargetMetrics);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public bool Equals(TargetMetrics other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (Target != other.Target) return false;
      if(!metrics_.Equals(other.metrics_)) return false;
      if(!classesOrdered_.Equals(other.classesOrdered_)) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override int GetHashCode() {
      int hash = 1;
      if (Target.Length != 0) hash ^= Target.GetHashCode();
      hash ^= metrics_.GetHashCode();
      hash ^= classesOrdered_.GetHashCode();
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
      if (Target.Length != 0) {
        output.WriteRawTag(10);
        output.WriteString(Target);
      }
      metrics_.WriteTo(output, _repeated_metrics_codec);
      classesOrdered_.WriteTo(output, _repeated_classesOrdered_codec);
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    #endif
    }

    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    void pb::IBufferMessage.InternalWriteTo(ref pb::WriteContext output) {
      if (Target.Length != 0) {
        output.WriteRawTag(10);
        output.WriteString(Target);
      }
      metrics_.WriteTo(ref output, _repeated_metrics_codec);
      classesOrdered_.WriteTo(ref output, _repeated_classesOrdered_codec);
      if (_unknownFields != null) {
        _unknownFields.WriteTo(ref output);
      }
    }
    #endif

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public int CalculateSize() {
      int size = 0;
      if (Target.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Target);
      }
      size += metrics_.CalculateSize(_repeated_metrics_codec);
      size += classesOrdered_.CalculateSize(_repeated_classesOrdered_codec);
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public void MergeFrom(TargetMetrics other) {
      if (other == null) {
        return;
      }
      if (other.Target.Length != 0) {
        Target = other.Target;
      }
      metrics_.Add(other.metrics_);
      classesOrdered_.Add(other.classesOrdered_);
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
            Target = input.ReadString();
            break;
          }
          case 18: {
            metrics_.AddEntriesFrom(input, _repeated_metrics_codec);
            break;
          }
          case 26: {
            classesOrdered_.AddEntriesFrom(input, _repeated_classesOrdered_codec);
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
            Target = input.ReadString();
            break;
          }
          case 18: {
            metrics_.AddEntriesFrom(ref input, _repeated_metrics_codec);
            break;
          }
          case 26: {
            classesOrdered_.AddEntriesFrom(ref input, _repeated_classesOrdered_codec);
            break;
          }
        }
      }
    }
    #endif

    #region Nested types
    /// <summary>Container for nested types declared in the TargetMetrics message type.</summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static partial class Types {
      public sealed partial class ConfusionMetricRow : pb::IMessage<ConfusionMetricRow>
      #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
          , pb::IBufferMessage
      #endif
      {
        private static readonly pb::MessageParser<ConfusionMetricRow> _parser = new pb::MessageParser<ConfusionMetricRow>(() => new ConfusionMetricRow());
        private pb::UnknownFieldSet _unknownFields;
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public static pb::MessageParser<ConfusionMetricRow> Parser { get { return _parser; } }

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public static pbr::MessageDescriptor Descriptor {
          get { return global::Asgt.Type.TargetMetrics.Descriptor.NestedTypes[0]; }
        }

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        pbr::MessageDescriptor pb::IMessage.Descriptor {
          get { return Descriptor; }
        }

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public ConfusionMetricRow() {
          OnConstruction();
        }

        partial void OnConstruction();

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public ConfusionMetricRow(ConfusionMetricRow other) : this() {
          counts_ = other.counts_.Clone();
          _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
        }

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public ConfusionMetricRow Clone() {
          return new ConfusionMetricRow(this);
        }

        /// <summary>Field number for the "counts" field.</summary>
        public const int CountsFieldNumber = 1;
        private static readonly pb::FieldCodec<int> _repeated_counts_codec
            = pb::FieldCodec.ForInt32(10);
        private readonly pbc::RepeatedField<int> counts_ = new pbc::RepeatedField<int>();
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public pbc::RepeatedField<int> Counts {
          get { return counts_; }
        }

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public override bool Equals(object other) {
          return Equals(other as ConfusionMetricRow);
        }

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public bool Equals(ConfusionMetricRow other) {
          if (ReferenceEquals(other, null)) {
            return false;
          }
          if (ReferenceEquals(other, this)) {
            return true;
          }
          if(!counts_.Equals(other.counts_)) return false;
          return Equals(_unknownFields, other._unknownFields);
        }

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public override int GetHashCode() {
          int hash = 1;
          hash ^= counts_.GetHashCode();
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
          counts_.WriteTo(output, _repeated_counts_codec);
          if (_unknownFields != null) {
            _unknownFields.WriteTo(output);
          }
        #endif
        }

        #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        void pb::IBufferMessage.InternalWriteTo(ref pb::WriteContext output) {
          counts_.WriteTo(ref output, _repeated_counts_codec);
          if (_unknownFields != null) {
            _unknownFields.WriteTo(ref output);
          }
        }
        #endif

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public int CalculateSize() {
          int size = 0;
          size += counts_.CalculateSize(_repeated_counts_codec);
          if (_unknownFields != null) {
            size += _unknownFields.CalculateSize();
          }
          return size;
        }

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public void MergeFrom(ConfusionMetricRow other) {
          if (other == null) {
            return;
          }
          counts_.Add(other.counts_);
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
              case 10:
              case 8: {
                counts_.AddEntriesFrom(input, _repeated_counts_codec);
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
              case 10:
              case 8: {
                counts_.AddEntriesFrom(ref input, _repeated_counts_codec);
                break;
              }
            }
          }
        }
        #endif

      }

      public sealed partial class Metric : pb::IMessage<Metric>
      #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
          , pb::IBufferMessage
      #endif
      {
        private static readonly pb::MessageParser<Metric> _parser = new pb::MessageParser<Metric>(() => new Metric());
        private pb::UnknownFieldSet _unknownFields;
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public static pb::MessageParser<Metric> Parser { get { return _parser; } }

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public static pbr::MessageDescriptor Descriptor {
          get { return global::Asgt.Type.TargetMetrics.Descriptor.NestedTypes[1]; }
        }

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        pbr::MessageDescriptor pb::IMessage.Descriptor {
          get { return Descriptor; }
        }

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public Metric() {
          OnConstruction();
        }

        partial void OnConstruction();

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public Metric(Metric other) : this() {
          precision_ = other.precision_;
          confidence_ = other.confidence_;
          answerRate_ = other.answerRate_;
          truePositive_ = other.truePositive_;
          trueNegative_ = other.trueNegative_;
          falsePositive_ = other.falsePositive_;
          falseNegative_ = other.falseNegative_;
          confusionMetrics_ = other.confusionMetrics_.Clone();
          _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
        }

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public Metric Clone() {
          return new Metric(this);
        }

        /// <summary>Field number for the "precision" field.</summary>
        public const int PrecisionFieldNumber = 1;
        private float precision_;
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public float Precision {
          get { return precision_; }
          set {
            precision_ = value;
          }
        }

        /// <summary>Field number for the "confidence" field.</summary>
        public const int ConfidenceFieldNumber = 2;
        private float confidence_;
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public float Confidence {
          get { return confidence_; }
          set {
            confidence_ = value;
          }
        }

        /// <summary>Field number for the "answer_rate" field.</summary>
        public const int AnswerRateFieldNumber = 3;
        private float answerRate_;
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public float AnswerRate {
          get { return answerRate_; }
          set {
            answerRate_ = value;
          }
        }

        /// <summary>Field number for the "true_positive" field.</summary>
        public const int TruePositiveFieldNumber = 4;
        private int truePositive_;
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public int TruePositive {
          get { return truePositive_; }
          set {
            truePositive_ = value;
          }
        }

        /// <summary>Field number for the "true_negative" field.</summary>
        public const int TrueNegativeFieldNumber = 5;
        private int trueNegative_;
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public int TrueNegative {
          get { return trueNegative_; }
          set {
            trueNegative_ = value;
          }
        }

        /// <summary>Field number for the "false_positive" field.</summary>
        public const int FalsePositiveFieldNumber = 6;
        private int falsePositive_;
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public int FalsePositive {
          get { return falsePositive_; }
          set {
            falsePositive_ = value;
          }
        }

        /// <summary>Field number for the "false_negative" field.</summary>
        public const int FalseNegativeFieldNumber = 7;
        private int falseNegative_;
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public int FalseNegative {
          get { return falseNegative_; }
          set {
            falseNegative_ = value;
          }
        }

        /// <summary>Field number for the "ConfusionMetrics" field.</summary>
        public const int ConfusionMetricsFieldNumber = 8;
        private static readonly pb::FieldCodec<global::Asgt.Type.TargetMetrics.Types.ConfusionMetricRow> _repeated_confusionMetrics_codec
            = pb::FieldCodec.ForMessage(66, global::Asgt.Type.TargetMetrics.Types.ConfusionMetricRow.Parser);
        private readonly pbc::RepeatedField<global::Asgt.Type.TargetMetrics.Types.ConfusionMetricRow> confusionMetrics_ = new pbc::RepeatedField<global::Asgt.Type.TargetMetrics.Types.ConfusionMetricRow>();
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public pbc::RepeatedField<global::Asgt.Type.TargetMetrics.Types.ConfusionMetricRow> ConfusionMetrics {
          get { return confusionMetrics_; }
        }

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public override bool Equals(object other) {
          return Equals(other as Metric);
        }

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public bool Equals(Metric other) {
          if (ReferenceEquals(other, null)) {
            return false;
          }
          if (ReferenceEquals(other, this)) {
            return true;
          }
          if (!pbc::ProtobufEqualityComparers.BitwiseSingleEqualityComparer.Equals(Precision, other.Precision)) return false;
          if (!pbc::ProtobufEqualityComparers.BitwiseSingleEqualityComparer.Equals(Confidence, other.Confidence)) return false;
          if (!pbc::ProtobufEqualityComparers.BitwiseSingleEqualityComparer.Equals(AnswerRate, other.AnswerRate)) return false;
          if (TruePositive != other.TruePositive) return false;
          if (TrueNegative != other.TrueNegative) return false;
          if (FalsePositive != other.FalsePositive) return false;
          if (FalseNegative != other.FalseNegative) return false;
          if(!confusionMetrics_.Equals(other.confusionMetrics_)) return false;
          return Equals(_unknownFields, other._unknownFields);
        }

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public override int GetHashCode() {
          int hash = 1;
          if (Precision != 0F) hash ^= pbc::ProtobufEqualityComparers.BitwiseSingleEqualityComparer.GetHashCode(Precision);
          if (Confidence != 0F) hash ^= pbc::ProtobufEqualityComparers.BitwiseSingleEqualityComparer.GetHashCode(Confidence);
          if (AnswerRate != 0F) hash ^= pbc::ProtobufEqualityComparers.BitwiseSingleEqualityComparer.GetHashCode(AnswerRate);
          if (TruePositive != 0) hash ^= TruePositive.GetHashCode();
          if (TrueNegative != 0) hash ^= TrueNegative.GetHashCode();
          if (FalsePositive != 0) hash ^= FalsePositive.GetHashCode();
          if (FalseNegative != 0) hash ^= FalseNegative.GetHashCode();
          hash ^= confusionMetrics_.GetHashCode();
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
          if (Precision != 0F) {
            output.WriteRawTag(13);
            output.WriteFloat(Precision);
          }
          if (Confidence != 0F) {
            output.WriteRawTag(21);
            output.WriteFloat(Confidence);
          }
          if (AnswerRate != 0F) {
            output.WriteRawTag(29);
            output.WriteFloat(AnswerRate);
          }
          if (TruePositive != 0) {
            output.WriteRawTag(32);
            output.WriteInt32(TruePositive);
          }
          if (TrueNegative != 0) {
            output.WriteRawTag(40);
            output.WriteInt32(TrueNegative);
          }
          if (FalsePositive != 0) {
            output.WriteRawTag(48);
            output.WriteInt32(FalsePositive);
          }
          if (FalseNegative != 0) {
            output.WriteRawTag(56);
            output.WriteInt32(FalseNegative);
          }
          confusionMetrics_.WriteTo(output, _repeated_confusionMetrics_codec);
          if (_unknownFields != null) {
            _unknownFields.WriteTo(output);
          }
        #endif
        }

        #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        void pb::IBufferMessage.InternalWriteTo(ref pb::WriteContext output) {
          if (Precision != 0F) {
            output.WriteRawTag(13);
            output.WriteFloat(Precision);
          }
          if (Confidence != 0F) {
            output.WriteRawTag(21);
            output.WriteFloat(Confidence);
          }
          if (AnswerRate != 0F) {
            output.WriteRawTag(29);
            output.WriteFloat(AnswerRate);
          }
          if (TruePositive != 0) {
            output.WriteRawTag(32);
            output.WriteInt32(TruePositive);
          }
          if (TrueNegative != 0) {
            output.WriteRawTag(40);
            output.WriteInt32(TrueNegative);
          }
          if (FalsePositive != 0) {
            output.WriteRawTag(48);
            output.WriteInt32(FalsePositive);
          }
          if (FalseNegative != 0) {
            output.WriteRawTag(56);
            output.WriteInt32(FalseNegative);
          }
          confusionMetrics_.WriteTo(ref output, _repeated_confusionMetrics_codec);
          if (_unknownFields != null) {
            _unknownFields.WriteTo(ref output);
          }
        }
        #endif

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public int CalculateSize() {
          int size = 0;
          if (Precision != 0F) {
            size += 1 + 4;
          }
          if (Confidence != 0F) {
            size += 1 + 4;
          }
          if (AnswerRate != 0F) {
            size += 1 + 4;
          }
          if (TruePositive != 0) {
            size += 1 + pb::CodedOutputStream.ComputeInt32Size(TruePositive);
          }
          if (TrueNegative != 0) {
            size += 1 + pb::CodedOutputStream.ComputeInt32Size(TrueNegative);
          }
          if (FalsePositive != 0) {
            size += 1 + pb::CodedOutputStream.ComputeInt32Size(FalsePositive);
          }
          if (FalseNegative != 0) {
            size += 1 + pb::CodedOutputStream.ComputeInt32Size(FalseNegative);
          }
          size += confusionMetrics_.CalculateSize(_repeated_confusionMetrics_codec);
          if (_unknownFields != null) {
            size += _unknownFields.CalculateSize();
          }
          return size;
        }

        [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
        [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
        public void MergeFrom(Metric other) {
          if (other == null) {
            return;
          }
          if (other.Precision != 0F) {
            Precision = other.Precision;
          }
          if (other.Confidence != 0F) {
            Confidence = other.Confidence;
          }
          if (other.AnswerRate != 0F) {
            AnswerRate = other.AnswerRate;
          }
          if (other.TruePositive != 0) {
            TruePositive = other.TruePositive;
          }
          if (other.TrueNegative != 0) {
            TrueNegative = other.TrueNegative;
          }
          if (other.FalsePositive != 0) {
            FalsePositive = other.FalsePositive;
          }
          if (other.FalseNegative != 0) {
            FalseNegative = other.FalseNegative;
          }
          confusionMetrics_.Add(other.confusionMetrics_);
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
              case 13: {
                Precision = input.ReadFloat();
                break;
              }
              case 21: {
                Confidence = input.ReadFloat();
                break;
              }
              case 29: {
                AnswerRate = input.ReadFloat();
                break;
              }
              case 32: {
                TruePositive = input.ReadInt32();
                break;
              }
              case 40: {
                TrueNegative = input.ReadInt32();
                break;
              }
              case 48: {
                FalsePositive = input.ReadInt32();
                break;
              }
              case 56: {
                FalseNegative = input.ReadInt32();
                break;
              }
              case 66: {
                confusionMetrics_.AddEntriesFrom(input, _repeated_confusionMetrics_codec);
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
              case 13: {
                Precision = input.ReadFloat();
                break;
              }
              case 21: {
                Confidence = input.ReadFloat();
                break;
              }
              case 29: {
                AnswerRate = input.ReadFloat();
                break;
              }
              case 32: {
                TruePositive = input.ReadInt32();
                break;
              }
              case 40: {
                TrueNegative = input.ReadInt32();
                break;
              }
              case 48: {
                FalsePositive = input.ReadInt32();
                break;
              }
              case 56: {
                FalseNegative = input.ReadInt32();
                break;
              }
              case 66: {
                confusionMetrics_.AddEntriesFrom(ref input, _repeated_confusionMetrics_codec);
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

  #endregion

}

#endregion Designer generated code
