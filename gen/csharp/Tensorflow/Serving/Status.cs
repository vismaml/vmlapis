// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: tensorflow_serving/util/status.proto
// </auto-generated>
#pragma warning disable 1591, 0612, 3021
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
namespace Tensorflow.Serving {

  /// <summary>Holder for reflection information generated from tensorflow_serving/util/status.proto</summary>
  public static partial class StatusReflection {

    #region Descriptor
    /// <summary>File descriptor for tensorflow_serving/util/status.proto</summary>
    public static pbr::FileDescriptor Descriptor {
      get { return descriptor; }
    }
    private static pbr::FileDescriptor descriptor;

    static StatusReflection() {
      byte[] descriptorData = global::System.Convert.FromBase64String(
          string.Concat(
            "CiR0ZW5zb3JmbG93X3NlcnZpbmcvdXRpbC9zdGF0dXMucHJvdG8SEnRlbnNv",
            "cmZsb3cuc2VydmluZxoqdGVuc29yZmxvdy9jb3JlL3Byb3RvYnVmL2Vycm9y",
            "X2NvZGVzLnByb3RvImsKC1N0YXR1c1Byb3RvEjYKCmVycm9yX2NvZGUYASAB",
            "KA4yFi50ZW5zb3JmbG93LmVycm9yLkNvZGVSCmVycm9yX2NvZGUSJAoNZXJy",
            "b3JfbWVzc2FnZRgCIAEoCVINZXJyb3JfbWVzc2FnZUID+AEBYgZwcm90bzM="));
      descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
          new pbr::FileDescriptor[] { global::Tensorflow.Error.ErrorCodesReflection.Descriptor, },
          new pbr::GeneratedClrTypeInfo(null, new pbr::GeneratedClrTypeInfo[] {
            new pbr::GeneratedClrTypeInfo(typeof(global::Tensorflow.Serving.StatusProto), global::Tensorflow.Serving.StatusProto.Parser, new[]{ "ErrorCode", "ErrorMessage" }, null, null, null)
          }));
    }
    #endregion

  }
  #region Messages
  /// <summary>
  /// Status that corresponds to Status in
  /// third_party/tensorflow/core/lib/core/status.h.
  /// </summary>
  public sealed partial class StatusProto : pb::IMessage<StatusProto> {
    private static readonly pb::MessageParser<StatusProto> _parser = new pb::MessageParser<StatusProto>(() => new StatusProto());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<StatusProto> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::Tensorflow.Serving.StatusReflection.Descriptor.MessageTypes[0]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public StatusProto() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public StatusProto(StatusProto other) : this() {
      errorCode_ = other.errorCode_;
      errorMessage_ = other.errorMessage_;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public StatusProto Clone() {
      return new StatusProto(this);
    }

    /// <summary>Field number for the "error_code" field.</summary>
    public const int ErrorCodeFieldNumber = 1;
    private global::Tensorflow.Error.Code errorCode_ = 0;
    /// <summary>
    /// Error code.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public global::Tensorflow.Error.Code ErrorCode {
      get { return errorCode_; }
      set {
        errorCode_ = value;
      }
    }

    /// <summary>Field number for the "error_message" field.</summary>
    public const int ErrorMessageFieldNumber = 2;
    private string errorMessage_ = "";
    /// <summary>
    /// Error message. Will only be set if an core was encountered.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string ErrorMessage {
      get { return errorMessage_; }
      set {
        errorMessage_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as StatusProto);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(StatusProto other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (ErrorCode != other.ErrorCode) return false;
      if (ErrorMessage != other.ErrorMessage) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (ErrorCode != 0) hash ^= ErrorCode.GetHashCode();
      if (ErrorMessage.Length != 0) hash ^= ErrorMessage.GetHashCode();
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
      if (ErrorCode != 0) {
        output.WriteRawTag(8);
        output.WriteEnum((int) ErrorCode);
      }
      if (ErrorMessage.Length != 0) {
        output.WriteRawTag(18);
        output.WriteString(ErrorMessage);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (ErrorCode != 0) {
        size += 1 + pb::CodedOutputStream.ComputeEnumSize((int) ErrorCode);
      }
      if (ErrorMessage.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(ErrorMessage);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(StatusProto other) {
      if (other == null) {
        return;
      }
      if (other.ErrorCode != 0) {
        ErrorCode = other.ErrorCode;
      }
      if (other.ErrorMessage.Length != 0) {
        ErrorMessage = other.ErrorMessage;
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
            errorCode_ = (global::Tensorflow.Error.Code) input.ReadEnum();
            break;
          }
          case 18: {
            ErrorMessage = input.ReadString();
            break;
          }
        }
      }
    }

  }

  #endregion

}

#endregion Designer generated code
