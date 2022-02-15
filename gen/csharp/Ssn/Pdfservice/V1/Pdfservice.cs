// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: ssn/pdfservice/v1/pdfservice.proto
// </auto-generated>
#pragma warning disable 1591, 0612, 3021
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
namespace Ssn.Pdfservice.V1 {

  /// <summary>Holder for reflection information generated from ssn/pdfservice/v1/pdfservice.proto</summary>
  public static partial class PdfserviceReflection {

    #region Descriptor
    /// <summary>File descriptor for ssn/pdfservice/v1/pdfservice.proto</summary>
    public static pbr::FileDescriptor Descriptor {
      get { return descriptor; }
    }
    private static pbr::FileDescriptor descriptor;

    static PdfserviceReflection() {
      byte[] descriptorData = global::System.Convert.FromBase64String(
          string.Concat(
            "CiJzc24vcGRmc2VydmljZS92MS9wZGZzZXJ2aWNlLnByb3RvEhFzc24ucGRm",
            "c2VydmljZS52MSL5AgoTUmFzdGVyaXplUGRmUmVxdWVzdBIMCgRkYXRhGAEg",
            "ASgMEgsKA2RwaRgCIAEoDRI9CgZmb3JtYXQYAyABKA4yLS5zc24ucGRmc2Vy",
            "dmljZS52MS5SYXN0ZXJpemVQZGZSZXF1ZXN0LkZvcm1hdBJACgVjb2xvchgE",
            "IAEoDjIxLnNzbi5wZGZzZXJ2aWNlLnYxLlJhc3Rlcml6ZVBkZlJlcXVlc3Qu",
            "Q29sb3JTcGFjZRJACgVwYWdlcxgFIAEoDjIxLnNzbi5wZGZzZXJ2aWNlLnYx",
            "LlJhc3Rlcml6ZVBkZlJlcXVlc3QuUGFnZU9wdGlvbiIlCgZGb3JtYXQSBwoD",
            "UE5HEAASCAoESlBFRxABEggKBFdFQlAQAiIhCgpDb2xvclNwYWNlEggKBEdS",
            "QVkQABIJCgVDT0xPUhABIjoKClBhZ2VPcHRpb24SDgoKRklSU1RfTEFTVBAA",
            "EgkKBUZJUlNUEAESCAoETEFTVBACEgcKA0FMTBADImEKFFJhc3Rlcml6ZVBk",
            "ZlJlc3BvbnNlEg0KBWluZGV4GAEgASgNEgwKBGRhdGEYAiABKAwSDQoFd2lk",
            "dGgYAyABKA0SDgoGaGVpZ2h0GAQgASgNEg0KBXNjYWxlGAUgASgBMm8KClBk",
            "ZlNlcnZpY2USYQoMUmFzdGVyaXplUGRmEiYuc3NuLnBkZnNlcnZpY2UudjEu",
            "UmFzdGVyaXplUGRmUmVxdWVzdBonLnNzbi5wZGZzZXJ2aWNlLnYxLlJhc3Rl",
            "cml6ZVBkZlJlc3BvbnNlMAFCU0IPUGRmU2VydmljZVByb3RvWkBnaXRodWIu",
            "Y29tL2UtY29ub21pYy92bWxhcGlzL2dlbi9nby9zc24vcGRmc2VydmljZS92",
            "MTtwZGZzZXJ2aWNlYgZwcm90bzM="));
      descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
          new pbr::FileDescriptor[] { },
          new pbr::GeneratedClrTypeInfo(null, null, new pbr::GeneratedClrTypeInfo[] {
            new pbr::GeneratedClrTypeInfo(typeof(global::Ssn.Pdfservice.V1.RasterizePdfRequest), global::Ssn.Pdfservice.V1.RasterizePdfRequest.Parser, new[]{ "Data", "Dpi", "Format", "Color", "Pages" }, null, new[]{ typeof(global::Ssn.Pdfservice.V1.RasterizePdfRequest.Types.Format), typeof(global::Ssn.Pdfservice.V1.RasterizePdfRequest.Types.ColorSpace), typeof(global::Ssn.Pdfservice.V1.RasterizePdfRequest.Types.PageOption) }, null, null),
            new pbr::GeneratedClrTypeInfo(typeof(global::Ssn.Pdfservice.V1.RasterizePdfResponse), global::Ssn.Pdfservice.V1.RasterizePdfResponse.Parser, new[]{ "Index", "Data", "Width", "Height", "Scale" }, null, null, null, null)
          }));
    }
    #endregion

  }
  #region Messages
  public sealed partial class RasterizePdfRequest : pb::IMessage<RasterizePdfRequest>
  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      , pb::IBufferMessage
  #endif
  {
    private static readonly pb::MessageParser<RasterizePdfRequest> _parser = new pb::MessageParser<RasterizePdfRequest>(() => new RasterizePdfRequest());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<RasterizePdfRequest> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::Ssn.Pdfservice.V1.PdfserviceReflection.Descriptor.MessageTypes[0]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public RasterizePdfRequest() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public RasterizePdfRequest(RasterizePdfRequest other) : this() {
      data_ = other.data_;
      dpi_ = other.dpi_;
      format_ = other.format_;
      color_ = other.color_;
      pages_ = other.pages_;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public RasterizePdfRequest Clone() {
      return new RasterizePdfRequest(this);
    }

    /// <summary>Field number for the "data" field.</summary>
    public const int DataFieldNumber = 1;
    private pb::ByteString data_ = pb::ByteString.Empty;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public pb::ByteString Data {
      get { return data_; }
      set {
        data_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "dpi" field.</summary>
    public const int DpiFieldNumber = 2;
    private uint dpi_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public uint Dpi {
      get { return dpi_; }
      set {
        dpi_ = value;
      }
    }

    /// <summary>Field number for the "format" field.</summary>
    public const int FormatFieldNumber = 3;
    private global::Ssn.Pdfservice.V1.RasterizePdfRequest.Types.Format format_ = global::Ssn.Pdfservice.V1.RasterizePdfRequest.Types.Format.Png;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public global::Ssn.Pdfservice.V1.RasterizePdfRequest.Types.Format Format {
      get { return format_; }
      set {
        format_ = value;
      }
    }

    /// <summary>Field number for the "color" field.</summary>
    public const int ColorFieldNumber = 4;
    private global::Ssn.Pdfservice.V1.RasterizePdfRequest.Types.ColorSpace color_ = global::Ssn.Pdfservice.V1.RasterizePdfRequest.Types.ColorSpace.Gray;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public global::Ssn.Pdfservice.V1.RasterizePdfRequest.Types.ColorSpace Color {
      get { return color_; }
      set {
        color_ = value;
      }
    }

    /// <summary>Field number for the "pages" field.</summary>
    public const int PagesFieldNumber = 5;
    private global::Ssn.Pdfservice.V1.RasterizePdfRequest.Types.PageOption pages_ = global::Ssn.Pdfservice.V1.RasterizePdfRequest.Types.PageOption.FirstLast;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public global::Ssn.Pdfservice.V1.RasterizePdfRequest.Types.PageOption Pages {
      get { return pages_; }
      set {
        pages_ = value;
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as RasterizePdfRequest);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(RasterizePdfRequest other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (Data != other.Data) return false;
      if (Dpi != other.Dpi) return false;
      if (Format != other.Format) return false;
      if (Color != other.Color) return false;
      if (Pages != other.Pages) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (Data.Length != 0) hash ^= Data.GetHashCode();
      if (Dpi != 0) hash ^= Dpi.GetHashCode();
      if (Format != global::Ssn.Pdfservice.V1.RasterizePdfRequest.Types.Format.Png) hash ^= Format.GetHashCode();
      if (Color != global::Ssn.Pdfservice.V1.RasterizePdfRequest.Types.ColorSpace.Gray) hash ^= Color.GetHashCode();
      if (Pages != global::Ssn.Pdfservice.V1.RasterizePdfRequest.Types.PageOption.FirstLast) hash ^= Pages.GetHashCode();
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
      if (Data.Length != 0) {
        output.WriteRawTag(10);
        output.WriteBytes(Data);
      }
      if (Dpi != 0) {
        output.WriteRawTag(16);
        output.WriteUInt32(Dpi);
      }
      if (Format != global::Ssn.Pdfservice.V1.RasterizePdfRequest.Types.Format.Png) {
        output.WriteRawTag(24);
        output.WriteEnum((int) Format);
      }
      if (Color != global::Ssn.Pdfservice.V1.RasterizePdfRequest.Types.ColorSpace.Gray) {
        output.WriteRawTag(32);
        output.WriteEnum((int) Color);
      }
      if (Pages != global::Ssn.Pdfservice.V1.RasterizePdfRequest.Types.PageOption.FirstLast) {
        output.WriteRawTag(40);
        output.WriteEnum((int) Pages);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (Data.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeBytesSize(Data);
      }
      if (Dpi != 0) {
        size += 1 + pb::CodedOutputStream.ComputeUInt32Size(Dpi);
      }
      if (Format != global::Ssn.Pdfservice.V1.RasterizePdfRequest.Types.Format.Png) {
        size += 1 + pb::CodedOutputStream.ComputeEnumSize((int) Format);
      }
      if (Color != global::Ssn.Pdfservice.V1.RasterizePdfRequest.Types.ColorSpace.Gray) {
        size += 1 + pb::CodedOutputStream.ComputeEnumSize((int) Color);
      }
      if (Pages != global::Ssn.Pdfservice.V1.RasterizePdfRequest.Types.PageOption.FirstLast) {
        size += 1 + pb::CodedOutputStream.ComputeEnumSize((int) Pages);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(RasterizePdfRequest other) {
      if (other == null) {
        return;
      }
      if (other.Data.Length != 0) {
        Data = other.Data;
      }
      if (other.Dpi != 0) {
        Dpi = other.Dpi;
      }
      if (other.Format != global::Ssn.Pdfservice.V1.RasterizePdfRequest.Types.Format.Png) {
        Format = other.Format;
      }
      if (other.Color != global::Ssn.Pdfservice.V1.RasterizePdfRequest.Types.ColorSpace.Gray) {
        Color = other.Color;
      }
      if (other.Pages != global::Ssn.Pdfservice.V1.RasterizePdfRequest.Types.PageOption.FirstLast) {
        Pages = other.Pages;
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
            Data = input.ReadBytes();
            break;
          }
          case 16: {
            Dpi = input.ReadUInt32();
            break;
          }
          case 24: {
            Format = (global::Ssn.Pdfservice.V1.RasterizePdfRequest.Types.Format) input.ReadEnum();
            break;
          }
          case 32: {
            Color = (global::Ssn.Pdfservice.V1.RasterizePdfRequest.Types.ColorSpace) input.ReadEnum();
            break;
          }
          case 40: {
            Pages = (global::Ssn.Pdfservice.V1.RasterizePdfRequest.Types.PageOption) input.ReadEnum();
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
            Data = input.ReadBytes();
            break;
          }
          case 16: {
            Dpi = input.ReadUInt32();
            break;
          }
          case 24: {
            Format = (global::Ssn.Pdfservice.V1.RasterizePdfRequest.Types.Format) input.ReadEnum();
            break;
          }
          case 32: {
            Color = (global::Ssn.Pdfservice.V1.RasterizePdfRequest.Types.ColorSpace) input.ReadEnum();
            break;
          }
          case 40: {
            Pages = (global::Ssn.Pdfservice.V1.RasterizePdfRequest.Types.PageOption) input.ReadEnum();
            break;
          }
        }
      }
    }
    #endif

    #region Nested types
    /// <summary>Container for nested types declared in the RasterizePdfRequest message type.</summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static partial class Types {
      public enum Format {
        [pbr::OriginalName("PNG")] Png = 0,
        [pbr::OriginalName("JPEG")] Jpeg = 1,
        [pbr::OriginalName("WEBP")] Webp = 2,
      }

      public enum ColorSpace {
        [pbr::OriginalName("GRAY")] Gray = 0,
        [pbr::OriginalName("COLOR")] Color = 1,
      }

      public enum PageOption {
        [pbr::OriginalName("FIRST_LAST")] FirstLast = 0,
        [pbr::OriginalName("FIRST")] First = 1,
        [pbr::OriginalName("LAST")] Last = 2,
        [pbr::OriginalName("ALL")] All = 3,
      }

    }
    #endregion

  }

  public sealed partial class RasterizePdfResponse : pb::IMessage<RasterizePdfResponse>
  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      , pb::IBufferMessage
  #endif
  {
    private static readonly pb::MessageParser<RasterizePdfResponse> _parser = new pb::MessageParser<RasterizePdfResponse>(() => new RasterizePdfResponse());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<RasterizePdfResponse> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::Ssn.Pdfservice.V1.PdfserviceReflection.Descriptor.MessageTypes[1]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public RasterizePdfResponse() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public RasterizePdfResponse(RasterizePdfResponse other) : this() {
      index_ = other.index_;
      data_ = other.data_;
      width_ = other.width_;
      height_ = other.height_;
      scale_ = other.scale_;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public RasterizePdfResponse Clone() {
      return new RasterizePdfResponse(this);
    }

    /// <summary>Field number for the "index" field.</summary>
    public const int IndexFieldNumber = 1;
    private uint index_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public uint Index {
      get { return index_; }
      set {
        index_ = value;
      }
    }

    /// <summary>Field number for the "data" field.</summary>
    public const int DataFieldNumber = 2;
    private pb::ByteString data_ = pb::ByteString.Empty;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public pb::ByteString Data {
      get { return data_; }
      set {
        data_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "width" field.</summary>
    public const int WidthFieldNumber = 3;
    private uint width_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public uint Width {
      get { return width_; }
      set {
        width_ = value;
      }
    }

    /// <summary>Field number for the "height" field.</summary>
    public const int HeightFieldNumber = 4;
    private uint height_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public uint Height {
      get { return height_; }
      set {
        height_ = value;
      }
    }

    /// <summary>Field number for the "scale" field.</summary>
    public const int ScaleFieldNumber = 5;
    private double scale_;
    /// <summary>
    /// Compared to a 72 dpi page
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public double Scale {
      get { return scale_; }
      set {
        scale_ = value;
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as RasterizePdfResponse);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(RasterizePdfResponse other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (Index != other.Index) return false;
      if (Data != other.Data) return false;
      if (Width != other.Width) return false;
      if (Height != other.Height) return false;
      if (!pbc::ProtobufEqualityComparers.BitwiseDoubleEqualityComparer.Equals(Scale, other.Scale)) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (Index != 0) hash ^= Index.GetHashCode();
      if (Data.Length != 0) hash ^= Data.GetHashCode();
      if (Width != 0) hash ^= Width.GetHashCode();
      if (Height != 0) hash ^= Height.GetHashCode();
      if (Scale != 0D) hash ^= pbc::ProtobufEqualityComparers.BitwiseDoubleEqualityComparer.GetHashCode(Scale);
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
      if (Index != 0) {
        output.WriteRawTag(8);
        output.WriteUInt32(Index);
      }
      if (Data.Length != 0) {
        output.WriteRawTag(18);
        output.WriteBytes(Data);
      }
      if (Width != 0) {
        output.WriteRawTag(24);
        output.WriteUInt32(Width);
      }
      if (Height != 0) {
        output.WriteRawTag(32);
        output.WriteUInt32(Height);
      }
      if (Scale != 0D) {
        output.WriteRawTag(41);
        output.WriteDouble(Scale);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (Index != 0) {
        size += 1 + pb::CodedOutputStream.ComputeUInt32Size(Index);
      }
      if (Data.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeBytesSize(Data);
      }
      if (Width != 0) {
        size += 1 + pb::CodedOutputStream.ComputeUInt32Size(Width);
      }
      if (Height != 0) {
        size += 1 + pb::CodedOutputStream.ComputeUInt32Size(Height);
      }
      if (Scale != 0D) {
        size += 1 + 8;
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(RasterizePdfResponse other) {
      if (other == null) {
        return;
      }
      if (other.Index != 0) {
        Index = other.Index;
      }
      if (other.Data.Length != 0) {
        Data = other.Data;
      }
      if (other.Width != 0) {
        Width = other.Width;
      }
      if (other.Height != 0) {
        Height = other.Height;
      }
      if (other.Scale != 0D) {
        Scale = other.Scale;
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
            Index = input.ReadUInt32();
            break;
          }
          case 18: {
            Data = input.ReadBytes();
            break;
          }
          case 24: {
            Width = input.ReadUInt32();
            break;
          }
          case 32: {
            Height = input.ReadUInt32();
            break;
          }
          case 41: {
            Scale = input.ReadDouble();
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
            Index = input.ReadUInt32();
            break;
          }
          case 18: {
            Data = input.ReadBytes();
            break;
          }
          case 24: {
            Width = input.ReadUInt32();
            break;
          }
          case 32: {
            Height = input.ReadUInt32();
            break;
          }
          case 41: {
            Scale = input.ReadDouble();
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
