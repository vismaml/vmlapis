// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: asgt/type/dataset_statistics.proto
// </auto-generated>
#pragma warning disable 1591, 0612, 3021, 8981
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
namespace Asgt.Type {

  /// <summary>Holder for reflection information generated from asgt/type/dataset_statistics.proto</summary>
  public static partial class DatasetStatisticsReflection {

    #region Descriptor
    /// <summary>File descriptor for asgt/type/dataset_statistics.proto</summary>
    public static pbr::FileDescriptor Descriptor {
      get { return descriptor; }
    }
    private static pbr::FileDescriptor descriptor;

    static DatasetStatisticsReflection() {
      byte[] descriptorData = global::System.Convert.FromBase64String(
          string.Concat(
            "CiJhc2d0L3R5cGUvZGF0YXNldF9zdGF0aXN0aWNzLnByb3RvEglhc2d0LnR5",
            "cGUixgQKEURhdGFzZXRTdGF0aXN0aWNzEkYKIGxleGljYWxfZGl2ZXJzaXR5",
            "X3NwbGl0X29uX3NwYWNlGAEgASgCUhxsZXhpY2FsRGl2ZXJzaXR5U3BsaXRP",
            "blNwYWNlEkoKImxleGljYWxfZGl2ZXJzaXR5X3NwbGl0X29uX3NwZWNpYWwY",
            "AiABKAJSHmxleGljYWxEaXZlcnNpdHlTcGxpdE9uU3BlY2lhbBIyChVwZXJj",
            "ZW50X2VtcHR5X3N0cmluZ3MYAyABKAJSE3BlcmNlbnRFbXB0eVN0cmluZ3MS",
            "SgoicGVyY2VudF9wdXJlX251bWJlcnNfcmVtb3ZlX3NwYWNlcxgEIAEoAlIe",
            "cGVyY2VudFB1cmVOdW1iZXJzUmVtb3ZlU3BhY2VzEkwKI3BlcmNlbnRfcHVy",
            "ZV9udW1iZXJzX3JlbW92ZV9zcGVjaWFsGAUgASgCUh9wZXJjZW50UHVyZU51",
            "bWJlcnNSZW1vdmVTcGVjaWFsEjwKGnBlcmNlbnRfc3BlY2lhbF9jaGFyYWN0",
            "ZXJzGAYgASgCUhhwZXJjZW50U3BlY2lhbENoYXJhY3RlcnMSJQoOcGVyY2Vu",
            "dF9kaWdpdHMYByABKAJSDXBlcmNlbnREaWdpdHMSJwoPcGVyY2VudF9sZXR0",
            "ZXJzGAggASgCUg5wZXJjZW50TGV0dGVycxJBCh1wZXJjZW50X2R1cGxpY2F0",
            "ZXNfaW5fZGF0YXNldBgJIAEoAlIacGVyY2VudER1cGxpY2F0ZXNJbkRhdGFz",
            "ZXRCOFo2Z2l0aHViLmNvbS9lLWNvbm9taWMvdm1sYXBpcy9nZW4vZ28vYXNn",
            "dC90eXBlO2FzZ3R0eXBlYgZwcm90bzM="));
      descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
          new pbr::FileDescriptor[] { },
          new pbr::GeneratedClrTypeInfo(null, null, new pbr::GeneratedClrTypeInfo[] {
            new pbr::GeneratedClrTypeInfo(typeof(global::Asgt.Type.DatasetStatistics), global::Asgt.Type.DatasetStatistics.Parser, new[]{ "LexicalDiversitySplitOnSpace", "LexicalDiversitySplitOnSpecial", "PercentEmptyStrings", "PercentPureNumbersRemoveSpaces", "PercentPureNumbersRemoveSpecial", "PercentSpecialCharacters", "PercentDigits", "PercentLetters", "PercentDuplicatesInDataset" }, null, null, null, null)
          }));
    }
    #endregion

  }
  #region Messages
  public sealed partial class DatasetStatistics : pb::IMessage<DatasetStatistics>
  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      , pb::IBufferMessage
  #endif
  {
    private static readonly pb::MessageParser<DatasetStatistics> _parser = new pb::MessageParser<DatasetStatistics>(() => new DatasetStatistics());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static pb::MessageParser<DatasetStatistics> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::Asgt.Type.DatasetStatisticsReflection.Descriptor.MessageTypes[0]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public DatasetStatistics() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public DatasetStatistics(DatasetStatistics other) : this() {
      lexicalDiversitySplitOnSpace_ = other.lexicalDiversitySplitOnSpace_;
      lexicalDiversitySplitOnSpecial_ = other.lexicalDiversitySplitOnSpecial_;
      percentEmptyStrings_ = other.percentEmptyStrings_;
      percentPureNumbersRemoveSpaces_ = other.percentPureNumbersRemoveSpaces_;
      percentPureNumbersRemoveSpecial_ = other.percentPureNumbersRemoveSpecial_;
      percentSpecialCharacters_ = other.percentSpecialCharacters_;
      percentDigits_ = other.percentDigits_;
      percentLetters_ = other.percentLetters_;
      percentDuplicatesInDataset_ = other.percentDuplicatesInDataset_;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public DatasetStatistics Clone() {
      return new DatasetStatistics(this);
    }

    /// <summary>Field number for the "lexical_diversity_split_on_space" field.</summary>
    public const int LexicalDiversitySplitOnSpaceFieldNumber = 1;
    private float lexicalDiversitySplitOnSpace_;
    /// <summary>
    /// lexical diversity of the dataset split on space
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public float LexicalDiversitySplitOnSpace {
      get { return lexicalDiversitySplitOnSpace_; }
      set {
        lexicalDiversitySplitOnSpace_ = value;
      }
    }

    /// <summary>Field number for the "lexical_diversity_split_on_special" field.</summary>
    public const int LexicalDiversitySplitOnSpecialFieldNumber = 2;
    private float lexicalDiversitySplitOnSpecial_;
    /// <summary>
    /// lexical diversity of the dataset split on special characters
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public float LexicalDiversitySplitOnSpecial {
      get { return lexicalDiversitySplitOnSpecial_; }
      set {
        lexicalDiversitySplitOnSpecial_ = value;
      }
    }

    /// <summary>Field number for the "percent_empty_strings" field.</summary>
    public const int PercentEmptyStringsFieldNumber = 3;
    private float percentEmptyStrings_;
    /// <summary>
    /// percentage of empty strings in the dataset
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public float PercentEmptyStrings {
      get { return percentEmptyStrings_; }
      set {
        percentEmptyStrings_ = value;
      }
    }

    /// <summary>Field number for the "percent_pure_numbers_remove_spaces" field.</summary>
    public const int PercentPureNumbersRemoveSpacesFieldNumber = 4;
    private float percentPureNumbersRemoveSpaces_;
    /// <summary>
    /// percentage of pure numbers in the dataset after removing spaces
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public float PercentPureNumbersRemoveSpaces {
      get { return percentPureNumbersRemoveSpaces_; }
      set {
        percentPureNumbersRemoveSpaces_ = value;
      }
    }

    /// <summary>Field number for the "percent_pure_numbers_remove_special" field.</summary>
    public const int PercentPureNumbersRemoveSpecialFieldNumber = 5;
    private float percentPureNumbersRemoveSpecial_;
    /// <summary>
    /// percentage of pure numbers in the dataset after removing spaces and special characters
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public float PercentPureNumbersRemoveSpecial {
      get { return percentPureNumbersRemoveSpecial_; }
      set {
        percentPureNumbersRemoveSpecial_ = value;
      }
    }

    /// <summary>Field number for the "percent_special_characters" field.</summary>
    public const int PercentSpecialCharactersFieldNumber = 6;
    private float percentSpecialCharacters_;
    /// <summary>
    /// percentage of special characters in the dataset
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public float PercentSpecialCharacters {
      get { return percentSpecialCharacters_; }
      set {
        percentSpecialCharacters_ = value;
      }
    }

    /// <summary>Field number for the "percent_digits" field.</summary>
    public const int PercentDigitsFieldNumber = 7;
    private float percentDigits_;
    /// <summary>
    /// percentage of digits in the dataset
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public float PercentDigits {
      get { return percentDigits_; }
      set {
        percentDigits_ = value;
      }
    }

    /// <summary>Field number for the "percent_letters" field.</summary>
    public const int PercentLettersFieldNumber = 8;
    private float percentLetters_;
    /// <summary>
    /// percentage of letters in the dataset
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public float PercentLetters {
      get { return percentLetters_; }
      set {
        percentLetters_ = value;
      }
    }

    /// <summary>Field number for the "percent_duplicates_in_dataset" field.</summary>
    public const int PercentDuplicatesInDatasetFieldNumber = 9;
    private float percentDuplicatesInDataset_;
    /// <summary>
    /// percentage of duplicates in the dataset
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public float PercentDuplicatesInDataset {
      get { return percentDuplicatesInDataset_; }
      set {
        percentDuplicatesInDataset_ = value;
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override bool Equals(object other) {
      return Equals(other as DatasetStatistics);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public bool Equals(DatasetStatistics other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (!pbc::ProtobufEqualityComparers.BitwiseSingleEqualityComparer.Equals(LexicalDiversitySplitOnSpace, other.LexicalDiversitySplitOnSpace)) return false;
      if (!pbc::ProtobufEqualityComparers.BitwiseSingleEqualityComparer.Equals(LexicalDiversitySplitOnSpecial, other.LexicalDiversitySplitOnSpecial)) return false;
      if (!pbc::ProtobufEqualityComparers.BitwiseSingleEqualityComparer.Equals(PercentEmptyStrings, other.PercentEmptyStrings)) return false;
      if (!pbc::ProtobufEqualityComparers.BitwiseSingleEqualityComparer.Equals(PercentPureNumbersRemoveSpaces, other.PercentPureNumbersRemoveSpaces)) return false;
      if (!pbc::ProtobufEqualityComparers.BitwiseSingleEqualityComparer.Equals(PercentPureNumbersRemoveSpecial, other.PercentPureNumbersRemoveSpecial)) return false;
      if (!pbc::ProtobufEqualityComparers.BitwiseSingleEqualityComparer.Equals(PercentSpecialCharacters, other.PercentSpecialCharacters)) return false;
      if (!pbc::ProtobufEqualityComparers.BitwiseSingleEqualityComparer.Equals(PercentDigits, other.PercentDigits)) return false;
      if (!pbc::ProtobufEqualityComparers.BitwiseSingleEqualityComparer.Equals(PercentLetters, other.PercentLetters)) return false;
      if (!pbc::ProtobufEqualityComparers.BitwiseSingleEqualityComparer.Equals(PercentDuplicatesInDataset, other.PercentDuplicatesInDataset)) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public override int GetHashCode() {
      int hash = 1;
      if (LexicalDiversitySplitOnSpace != 0F) hash ^= pbc::ProtobufEqualityComparers.BitwiseSingleEqualityComparer.GetHashCode(LexicalDiversitySplitOnSpace);
      if (LexicalDiversitySplitOnSpecial != 0F) hash ^= pbc::ProtobufEqualityComparers.BitwiseSingleEqualityComparer.GetHashCode(LexicalDiversitySplitOnSpecial);
      if (PercentEmptyStrings != 0F) hash ^= pbc::ProtobufEqualityComparers.BitwiseSingleEqualityComparer.GetHashCode(PercentEmptyStrings);
      if (PercentPureNumbersRemoveSpaces != 0F) hash ^= pbc::ProtobufEqualityComparers.BitwiseSingleEqualityComparer.GetHashCode(PercentPureNumbersRemoveSpaces);
      if (PercentPureNumbersRemoveSpecial != 0F) hash ^= pbc::ProtobufEqualityComparers.BitwiseSingleEqualityComparer.GetHashCode(PercentPureNumbersRemoveSpecial);
      if (PercentSpecialCharacters != 0F) hash ^= pbc::ProtobufEqualityComparers.BitwiseSingleEqualityComparer.GetHashCode(PercentSpecialCharacters);
      if (PercentDigits != 0F) hash ^= pbc::ProtobufEqualityComparers.BitwiseSingleEqualityComparer.GetHashCode(PercentDigits);
      if (PercentLetters != 0F) hash ^= pbc::ProtobufEqualityComparers.BitwiseSingleEqualityComparer.GetHashCode(PercentLetters);
      if (PercentDuplicatesInDataset != 0F) hash ^= pbc::ProtobufEqualityComparers.BitwiseSingleEqualityComparer.GetHashCode(PercentDuplicatesInDataset);
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
      if (LexicalDiversitySplitOnSpace != 0F) {
        output.WriteRawTag(13);
        output.WriteFloat(LexicalDiversitySplitOnSpace);
      }
      if (LexicalDiversitySplitOnSpecial != 0F) {
        output.WriteRawTag(21);
        output.WriteFloat(LexicalDiversitySplitOnSpecial);
      }
      if (PercentEmptyStrings != 0F) {
        output.WriteRawTag(29);
        output.WriteFloat(PercentEmptyStrings);
      }
      if (PercentPureNumbersRemoveSpaces != 0F) {
        output.WriteRawTag(37);
        output.WriteFloat(PercentPureNumbersRemoveSpaces);
      }
      if (PercentPureNumbersRemoveSpecial != 0F) {
        output.WriteRawTag(45);
        output.WriteFloat(PercentPureNumbersRemoveSpecial);
      }
      if (PercentSpecialCharacters != 0F) {
        output.WriteRawTag(53);
        output.WriteFloat(PercentSpecialCharacters);
      }
      if (PercentDigits != 0F) {
        output.WriteRawTag(61);
        output.WriteFloat(PercentDigits);
      }
      if (PercentLetters != 0F) {
        output.WriteRawTag(69);
        output.WriteFloat(PercentLetters);
      }
      if (PercentDuplicatesInDataset != 0F) {
        output.WriteRawTag(77);
        output.WriteFloat(PercentDuplicatesInDataset);
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
      if (LexicalDiversitySplitOnSpace != 0F) {
        output.WriteRawTag(13);
        output.WriteFloat(LexicalDiversitySplitOnSpace);
      }
      if (LexicalDiversitySplitOnSpecial != 0F) {
        output.WriteRawTag(21);
        output.WriteFloat(LexicalDiversitySplitOnSpecial);
      }
      if (PercentEmptyStrings != 0F) {
        output.WriteRawTag(29);
        output.WriteFloat(PercentEmptyStrings);
      }
      if (PercentPureNumbersRemoveSpaces != 0F) {
        output.WriteRawTag(37);
        output.WriteFloat(PercentPureNumbersRemoveSpaces);
      }
      if (PercentPureNumbersRemoveSpecial != 0F) {
        output.WriteRawTag(45);
        output.WriteFloat(PercentPureNumbersRemoveSpecial);
      }
      if (PercentSpecialCharacters != 0F) {
        output.WriteRawTag(53);
        output.WriteFloat(PercentSpecialCharacters);
      }
      if (PercentDigits != 0F) {
        output.WriteRawTag(61);
        output.WriteFloat(PercentDigits);
      }
      if (PercentLetters != 0F) {
        output.WriteRawTag(69);
        output.WriteFloat(PercentLetters);
      }
      if (PercentDuplicatesInDataset != 0F) {
        output.WriteRawTag(77);
        output.WriteFloat(PercentDuplicatesInDataset);
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
      if (LexicalDiversitySplitOnSpace != 0F) {
        size += 1 + 4;
      }
      if (LexicalDiversitySplitOnSpecial != 0F) {
        size += 1 + 4;
      }
      if (PercentEmptyStrings != 0F) {
        size += 1 + 4;
      }
      if (PercentPureNumbersRemoveSpaces != 0F) {
        size += 1 + 4;
      }
      if (PercentPureNumbersRemoveSpecial != 0F) {
        size += 1 + 4;
      }
      if (PercentSpecialCharacters != 0F) {
        size += 1 + 4;
      }
      if (PercentDigits != 0F) {
        size += 1 + 4;
      }
      if (PercentLetters != 0F) {
        size += 1 + 4;
      }
      if (PercentDuplicatesInDataset != 0F) {
        size += 1 + 4;
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    [global::System.CodeDom.Compiler.GeneratedCode("protoc", null)]
    public void MergeFrom(DatasetStatistics other) {
      if (other == null) {
        return;
      }
      if (other.LexicalDiversitySplitOnSpace != 0F) {
        LexicalDiversitySplitOnSpace = other.LexicalDiversitySplitOnSpace;
      }
      if (other.LexicalDiversitySplitOnSpecial != 0F) {
        LexicalDiversitySplitOnSpecial = other.LexicalDiversitySplitOnSpecial;
      }
      if (other.PercentEmptyStrings != 0F) {
        PercentEmptyStrings = other.PercentEmptyStrings;
      }
      if (other.PercentPureNumbersRemoveSpaces != 0F) {
        PercentPureNumbersRemoveSpaces = other.PercentPureNumbersRemoveSpaces;
      }
      if (other.PercentPureNumbersRemoveSpecial != 0F) {
        PercentPureNumbersRemoveSpecial = other.PercentPureNumbersRemoveSpecial;
      }
      if (other.PercentSpecialCharacters != 0F) {
        PercentSpecialCharacters = other.PercentSpecialCharacters;
      }
      if (other.PercentDigits != 0F) {
        PercentDigits = other.PercentDigits;
      }
      if (other.PercentLetters != 0F) {
        PercentLetters = other.PercentLetters;
      }
      if (other.PercentDuplicatesInDataset != 0F) {
        PercentDuplicatesInDataset = other.PercentDuplicatesInDataset;
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
          case 13: {
            LexicalDiversitySplitOnSpace = input.ReadFloat();
            break;
          }
          case 21: {
            LexicalDiversitySplitOnSpecial = input.ReadFloat();
            break;
          }
          case 29: {
            PercentEmptyStrings = input.ReadFloat();
            break;
          }
          case 37: {
            PercentPureNumbersRemoveSpaces = input.ReadFloat();
            break;
          }
          case 45: {
            PercentPureNumbersRemoveSpecial = input.ReadFloat();
            break;
          }
          case 53: {
            PercentSpecialCharacters = input.ReadFloat();
            break;
          }
          case 61: {
            PercentDigits = input.ReadFloat();
            break;
          }
          case 69: {
            PercentLetters = input.ReadFloat();
            break;
          }
          case 77: {
            PercentDuplicatesInDataset = input.ReadFloat();
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
            LexicalDiversitySplitOnSpace = input.ReadFloat();
            break;
          }
          case 21: {
            LexicalDiversitySplitOnSpecial = input.ReadFloat();
            break;
          }
          case 29: {
            PercentEmptyStrings = input.ReadFloat();
            break;
          }
          case 37: {
            PercentPureNumbersRemoveSpaces = input.ReadFloat();
            break;
          }
          case 45: {
            PercentPureNumbersRemoveSpecial = input.ReadFloat();
            break;
          }
          case 53: {
            PercentSpecialCharacters = input.ReadFloat();
            break;
          }
          case 61: {
            PercentDigits = input.ReadFloat();
            break;
          }
          case 69: {
            PercentLetters = input.ReadFloat();
            break;
          }
          case 77: {
            PercentDuplicatesInDataset = input.ReadFloat();
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
