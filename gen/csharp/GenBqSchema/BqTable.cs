// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: gen_bq_schema/bq_table.proto
// </auto-generated>
#pragma warning disable 1591, 0612, 3021
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
namespace GenBqSchema {

  /// <summary>Holder for reflection information generated from gen_bq_schema/bq_table.proto</summary>
  public static partial class BqTableReflection {

    #region Descriptor
    /// <summary>File descriptor for gen_bq_schema/bq_table.proto</summary>
    public static pbr::FileDescriptor Descriptor {
      get { return descriptor; }
    }
    private static pbr::FileDescriptor descriptor;

    static BqTableReflection() {
      byte[] descriptorData = global::System.Convert.FromBase64String(
          string.Concat(
            "ChxnZW5fYnFfc2NoZW1hL2JxX3RhYmxlLnByb3RvEg1nZW5fYnFfc2NoZW1h",
            "GiBnb29nbGUvcHJvdG9idWYvZGVzY3JpcHRvci5wcm90byJEChZCaWdRdWVy",
            "eU1lc3NhZ2VPcHRpb25zEhIKCnRhYmxlX25hbWUYASABKAkSFgoOdXNlX2pz",
            "b25fbmFtZXMYAiABKAg6XgoNYmlncXVlcnlfb3B0cxIfLmdvb2dsZS5wcm90",
            "b2J1Zi5NZXNzYWdlT3B0aW9ucxj9ByABKAsyJS5nZW5fYnFfc2NoZW1hLkJp",
            "Z1F1ZXJ5TWVzc2FnZU9wdGlvbnNCQVo/Z2l0aHViLmNvbS9lLWNvbm9taWMv",
            "dm1sYXBpcy9nZW4vZ28vZ2V0X2JxX3NjaGVtYTtnZW5fYnFfc2NoZW1hYgZw",
            "cm90bzM="));
      descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
          new pbr::FileDescriptor[] { pbr::FileDescriptor.DescriptorProtoFileDescriptor, },
          new pbr::GeneratedClrTypeInfo(null, new pbr::GeneratedClrTypeInfo[] {
            new pbr::GeneratedClrTypeInfo(typeof(global::GenBqSchema.BigQueryMessageOptions), global::GenBqSchema.BigQueryMessageOptions.Parser, new[]{ "TableName", "UseJsonNames" }, null, null, null)
          }));
    }
    #endregion

  }
  #region Messages
  public sealed partial class BigQueryMessageOptions : pb::IMessage<BigQueryMessageOptions> {
    private static readonly pb::MessageParser<BigQueryMessageOptions> _parser = new pb::MessageParser<BigQueryMessageOptions>(() => new BigQueryMessageOptions());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<BigQueryMessageOptions> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::GenBqSchema.BqTableReflection.Descriptor.MessageTypes[0]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public BigQueryMessageOptions() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public BigQueryMessageOptions(BigQueryMessageOptions other) : this() {
      tableName_ = other.tableName_;
      useJsonNames_ = other.useJsonNames_;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public BigQueryMessageOptions Clone() {
      return new BigQueryMessageOptions(this);
    }

    /// <summary>Field number for the "table_name" field.</summary>
    public const int TableNameFieldNumber = 1;
    private string tableName_ = "";
    /// <summary>
    /// Specifies a name of table in BigQuery for the message.
    ///
    /// If not blank, indicates the message is a type of record to be stored into BigQuery.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string TableName {
      get { return tableName_; }
      set {
        tableName_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "use_json_names" field.</summary>
    public const int UseJsonNamesFieldNumber = 2;
    private bool useJsonNames_;
    /// <summary>
    /// If true, BigQuery field names will default to a field's JSON name,
    /// not its original/proto field name.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool UseJsonNames {
      get { return useJsonNames_; }
      set {
        useJsonNames_ = value;
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as BigQueryMessageOptions);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(BigQueryMessageOptions other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (TableName != other.TableName) return false;
      if (UseJsonNames != other.UseJsonNames) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (TableName.Length != 0) hash ^= TableName.GetHashCode();
      if (UseJsonNames != false) hash ^= UseJsonNames.GetHashCode();
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
      if (TableName.Length != 0) {
        output.WriteRawTag(10);
        output.WriteString(TableName);
      }
      if (UseJsonNames != false) {
        output.WriteRawTag(16);
        output.WriteBool(UseJsonNames);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (TableName.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(TableName);
      }
      if (UseJsonNames != false) {
        size += 1 + 1;
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(BigQueryMessageOptions other) {
      if (other == null) {
        return;
      }
      if (other.TableName.Length != 0) {
        TableName = other.TableName;
      }
      if (other.UseJsonNames != false) {
        UseJsonNames = other.UseJsonNames;
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
            TableName = input.ReadString();
            break;
          }
          case 16: {
            UseJsonNames = input.ReadBool();
            break;
          }
        }
      }
    }

  }

  #endregion

}

#endregion Designer generated code
