// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: asgt/type/retention_policy.proto
// </auto-generated>
#pragma warning disable 1591, 0612, 3021
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
namespace Asgt.Type {

  /// <summary>Holder for reflection information generated from asgt/type/retention_policy.proto</summary>
  public static partial class RetentionPolicyReflection {

    #region Descriptor
    /// <summary>File descriptor for asgt/type/retention_policy.proto</summary>
    public static pbr::FileDescriptor Descriptor {
      get { return descriptor; }
    }
    private static pbr::FileDescriptor descriptor;

    static RetentionPolicyReflection() {
      byte[] descriptorData = global::System.Convert.FromBase64String(
          string.Concat(
            "CiBhc2d0L3R5cGUvcmV0ZW50aW9uX3BvbGljeS5wcm90bxIJYXNndC50eXBl",
            "IiMKD1JldGVudGlvblBvbGljeRIQCghtYXhfZGF5cxgBIAEoA0I4WjZnaXRo",
            "dWIuY29tL2UtY29ub21pYy92bWxhcGlzL2dlbi9nby9hc2d0L3R5cGU7YXNn",
            "dHR5cGViBnByb3RvMw=="));
      descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
          new pbr::FileDescriptor[] { },
          new pbr::GeneratedClrTypeInfo(null, new pbr::GeneratedClrTypeInfo[] {
            new pbr::GeneratedClrTypeInfo(typeof(global::Asgt.Type.RetentionPolicy), global::Asgt.Type.RetentionPolicy.Parser, new[]{ "MaxDays" }, null, null, null)
          }));
    }
    #endregion

  }
  #region Messages
  public sealed partial class RetentionPolicy : pb::IMessage<RetentionPolicy> {
    private static readonly pb::MessageParser<RetentionPolicy> _parser = new pb::MessageParser<RetentionPolicy>(() => new RetentionPolicy());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<RetentionPolicy> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::Asgt.Type.RetentionPolicyReflection.Descriptor.MessageTypes[0]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public RetentionPolicy() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public RetentionPolicy(RetentionPolicy other) : this() {
      maxDays_ = other.maxDays_;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public RetentionPolicy Clone() {
      return new RetentionPolicy(this);
    }

    /// <summary>Field number for the "max_days" field.</summary>
    public const int MaxDaysFieldNumber = 1;
    private long maxDays_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public long MaxDays {
      get { return maxDays_; }
      set {
        maxDays_ = value;
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as RetentionPolicy);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(RetentionPolicy other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (MaxDays != other.MaxDays) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (MaxDays != 0L) hash ^= MaxDays.GetHashCode();
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
      if (MaxDays != 0L) {
        output.WriteRawTag(8);
        output.WriteInt64(MaxDays);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (MaxDays != 0L) {
        size += 1 + pb::CodedOutputStream.ComputeInt64Size(MaxDays);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(RetentionPolicy other) {
      if (other == null) {
        return;
      }
      if (other.MaxDays != 0L) {
        MaxDays = other.MaxDays;
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
          case 8: {
            MaxDays = input.ReadInt64();
            break;
          }
        }
      }
    }

  }

  #endregion

}

#endregion Designer generated code
