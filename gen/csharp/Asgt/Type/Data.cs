// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: asgt/type/data.proto
// </auto-generated>
#pragma warning disable 1591, 0612, 3021
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
namespace Asgt.Type {

  /// <summary>Holder for reflection information generated from asgt/type/data.proto</summary>
  public static partial class DataReflection {

    #region Descriptor
    /// <summary>File descriptor for asgt/type/data.proto</summary>
    public static pbr::FileDescriptor Descriptor {
      get { return descriptor; }
    }
    private static pbr::FileDescriptor descriptor;

    static DataReflection() {
      byte[] descriptorData = global::System.Convert.FromBase64String(
          string.Concat(
            "ChRhc2d0L3R5cGUvZGF0YS5wcm90bxIJYXNndC50eXBlGh9nb29nbGUvcHJv",
            "dG9idWYvdGltZXN0YW1wLnByb3RvGh5nb29nbGUvcHJvdG9idWYvd3JhcHBl",
            "cnMucHJvdG8izgEKB0ludm9pY2USLgoKaXNzdWVfZGF0ZRgBIAEoCzIaLmdv",
            "b2dsZS5wcm90b2J1Zi5UaW1lc3RhbXASJQoIc3VwcGxpZXIYAiABKAsyEy5h",
            "c2d0LnR5cGUuU3VwcGxpZXISMgoMY3VzdG9tZXJfcmVmGAMgASgLMhwuZ29v",
            "Z2xlLnByb3RvYnVmLlN0cmluZ1ZhbHVlEgwKBHRleHQYBCABKAkSKgoFdG90",
            "YWwYByABKAsyGy5nb29nbGUucHJvdG9idWYuRmxvYXRWYWx1ZSLFAQoLSW52",
            "b2ljZUxpbmUSLgoIY3VycmVuY3kYBCABKAsyHC5nb29nbGUucHJvdG9idWYu",
            "U3RyaW5nVmFsdWUSKwoGYW1vdW50GAMgASgLMhsuZ29vZ2xlLnByb3RvYnVm",
            "LkZsb2F0VmFsdWUSKgoEdGV4dBgIIAEoCzIcLmdvb2dsZS5wcm90b2J1Zi5T",
            "dHJpbmdWYWx1ZRItCgdpdGVtX2lkGAkgASgLMhwuZ29vZ2xlLnByb3RvYnVm",
            "LlN0cmluZ1ZhbHVlInMKCFN1cHBsaWVyEgoKAmlkGAEgASgJEioKBG5hbWUY",
            "BCABKAsyHC5nb29nbGUucHJvdG9idWYuU3RyaW5nVmFsdWUSLwoJZ2xvYmFs",
            "X2lkGAUgASgLMhwuZ29vZ2xlLnByb3RvYnVmLlN0cmluZ1ZhbHVlIisKC1Ry",
            "YW5zYWN0aW9uEgwKBHRleHQYASABKAkSDgoGYW1vdW50GAIgASgCIoYBCgRE",
            "YXRhEisKC3RyYW5zYWN0aW9uGAEgASgLMhYuYXNndC50eXBlLlRyYW5zYWN0",
            "aW9uEiMKB2ludm9pY2UYAiABKAsyEi5hc2d0LnR5cGUuSW52b2ljZRIsCgxp",
            "bnZvaWNlX2xpbmUYAyABKAsyFi5hc2d0LnR5cGUuSW52b2ljZUxpbmVCBloE",
            "dHlwZWIGcHJvdG8z"));
      descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
          new pbr::FileDescriptor[] { global::Google.Protobuf.WellKnownTypes.TimestampReflection.Descriptor, global::Google.Protobuf.WellKnownTypes.WrappersReflection.Descriptor, },
          new pbr::GeneratedClrTypeInfo(null, new pbr::GeneratedClrTypeInfo[] {
            new pbr::GeneratedClrTypeInfo(typeof(global::Asgt.Type.Invoice), global::Asgt.Type.Invoice.Parser, new[]{ "IssueDate", "Supplier", "CustomerRef", "Text", "Total" }, null, null, null),
            new pbr::GeneratedClrTypeInfo(typeof(global::Asgt.Type.InvoiceLine), global::Asgt.Type.InvoiceLine.Parser, new[]{ "Currency", "Amount", "Text", "ItemId" }, null, null, null),
            new pbr::GeneratedClrTypeInfo(typeof(global::Asgt.Type.Supplier), global::Asgt.Type.Supplier.Parser, new[]{ "Id", "Name", "GlobalId" }, null, null, null),
            new pbr::GeneratedClrTypeInfo(typeof(global::Asgt.Type.Transaction), global::Asgt.Type.Transaction.Parser, new[]{ "Text", "Amount" }, null, null, null),
            new pbr::GeneratedClrTypeInfo(typeof(global::Asgt.Type.Data), global::Asgt.Type.Data.Parser, new[]{ "Transaction", "Invoice", "InvoiceLine" }, null, null, null)
          }));
    }
    #endregion

  }
  #region Messages
  public sealed partial class Invoice : pb::IMessage<Invoice> {
    private static readonly pb::MessageParser<Invoice> _parser = new pb::MessageParser<Invoice>(() => new Invoice());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<Invoice> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::Asgt.Type.DataReflection.Descriptor.MessageTypes[0]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public Invoice() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public Invoice(Invoice other) : this() {
      issueDate_ = other.issueDate_ != null ? other.issueDate_.Clone() : null;
      supplier_ = other.supplier_ != null ? other.supplier_.Clone() : null;
      CustomerRef = other.CustomerRef;
      text_ = other.text_;
      Total = other.Total;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public Invoice Clone() {
      return new Invoice(this);
    }

    /// <summary>Field number for the "issue_date" field.</summary>
    public const int IssueDateFieldNumber = 1;
    private global::Google.Protobuf.WellKnownTypes.Timestamp issueDate_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public global::Google.Protobuf.WellKnownTypes.Timestamp IssueDate {
      get { return issueDate_; }
      set {
        issueDate_ = value;
      }
    }

    /// <summary>Field number for the "supplier" field.</summary>
    public const int SupplierFieldNumber = 2;
    private global::Asgt.Type.Supplier supplier_;
    /// <summary>
    /// supplier of the invoice
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public global::Asgt.Type.Supplier Supplier {
      get { return supplier_; }
      set {
        supplier_ = value;
      }
    }

    /// <summary>Field number for the "customer_ref" field.</summary>
    public const int CustomerRefFieldNumber = 3;
    private static readonly pb::FieldCodec<string> _single_customerRef_codec = pb::FieldCodec.ForClassWrapper<string>(26);
    private string customerRef_;
    /// <summary>
    /// reference to the customer
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string CustomerRef {
      get { return customerRef_; }
      set {
        customerRef_ = value;
      }
    }

    /// <summary>Field number for the "text" field.</summary>
    public const int TextFieldNumber = 4;
    private string text_ = "";
    /// <summary>
    /// invoice text from the SmartScan product
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string Text {
      get { return text_; }
      set {
        text_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "total" field.</summary>
    public const int TotalFieldNumber = 7;
    private static readonly pb::FieldCodec<float?> _single_total_codec = pb::FieldCodec.ForStructWrapper<float>(58);
    private float? total_;
    /// <summary>
    /// total of the invoice
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public float? Total {
      get { return total_; }
      set {
        total_ = value;
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as Invoice);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(Invoice other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (!object.Equals(IssueDate, other.IssueDate)) return false;
      if (!object.Equals(Supplier, other.Supplier)) return false;
      if (CustomerRef != other.CustomerRef) return false;
      if (Text != other.Text) return false;
      if (!pbc::ProtobufEqualityComparers.BitwiseNullableSingleEqualityComparer.Equals(Total, other.Total)) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (issueDate_ != null) hash ^= IssueDate.GetHashCode();
      if (supplier_ != null) hash ^= Supplier.GetHashCode();
      if (customerRef_ != null) hash ^= CustomerRef.GetHashCode();
      if (Text.Length != 0) hash ^= Text.GetHashCode();
      if (total_ != null) hash ^= pbc::ProtobufEqualityComparers.BitwiseNullableSingleEqualityComparer.GetHashCode(Total);
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
      if (issueDate_ != null) {
        output.WriteRawTag(10);
        output.WriteMessage(IssueDate);
      }
      if (supplier_ != null) {
        output.WriteRawTag(18);
        output.WriteMessage(Supplier);
      }
      if (customerRef_ != null) {
        _single_customerRef_codec.WriteTagAndValue(output, CustomerRef);
      }
      if (Text.Length != 0) {
        output.WriteRawTag(34);
        output.WriteString(Text);
      }
      if (total_ != null) {
        _single_total_codec.WriteTagAndValue(output, Total);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (issueDate_ != null) {
        size += 1 + pb::CodedOutputStream.ComputeMessageSize(IssueDate);
      }
      if (supplier_ != null) {
        size += 1 + pb::CodedOutputStream.ComputeMessageSize(Supplier);
      }
      if (customerRef_ != null) {
        size += _single_customerRef_codec.CalculateSizeWithTag(CustomerRef);
      }
      if (Text.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Text);
      }
      if (total_ != null) {
        size += _single_total_codec.CalculateSizeWithTag(Total);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(Invoice other) {
      if (other == null) {
        return;
      }
      if (other.issueDate_ != null) {
        if (issueDate_ == null) {
          issueDate_ = new global::Google.Protobuf.WellKnownTypes.Timestamp();
        }
        IssueDate.MergeFrom(other.IssueDate);
      }
      if (other.supplier_ != null) {
        if (supplier_ == null) {
          supplier_ = new global::Asgt.Type.Supplier();
        }
        Supplier.MergeFrom(other.Supplier);
      }
      if (other.customerRef_ != null) {
        if (customerRef_ == null || other.CustomerRef != "") {
          CustomerRef = other.CustomerRef;
        }
      }
      if (other.Text.Length != 0) {
        Text = other.Text;
      }
      if (other.total_ != null) {
        if (total_ == null || other.Total != 0F) {
          Total = other.Total;
        }
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
            if (issueDate_ == null) {
              issueDate_ = new global::Google.Protobuf.WellKnownTypes.Timestamp();
            }
            input.ReadMessage(issueDate_);
            break;
          }
          case 18: {
            if (supplier_ == null) {
              supplier_ = new global::Asgt.Type.Supplier();
            }
            input.ReadMessage(supplier_);
            break;
          }
          case 26: {
            string value = _single_customerRef_codec.Read(input);
            if (customerRef_ == null || value != "") {
              CustomerRef = value;
            }
            break;
          }
          case 34: {
            Text = input.ReadString();
            break;
          }
          case 58: {
            float? value = _single_total_codec.Read(input);
            if (total_ == null || value != 0F) {
              Total = value;
            }
            break;
          }
        }
      }
    }

  }

  public sealed partial class InvoiceLine : pb::IMessage<InvoiceLine> {
    private static readonly pb::MessageParser<InvoiceLine> _parser = new pb::MessageParser<InvoiceLine>(() => new InvoiceLine());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<InvoiceLine> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::Asgt.Type.DataReflection.Descriptor.MessageTypes[1]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public InvoiceLine() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public InvoiceLine(InvoiceLine other) : this() {
      Currency = other.Currency;
      Amount = other.Amount;
      Text = other.Text;
      ItemId = other.ItemId;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public InvoiceLine Clone() {
      return new InvoiceLine(this);
    }

    /// <summary>Field number for the "currency" field.</summary>
    public const int CurrencyFieldNumber = 4;
    private static readonly pb::FieldCodec<string> _single_currency_codec = pb::FieldCodec.ForClassWrapper<string>(34);
    private string currency_;
    /// <summary>
    /// name of the currency as a string
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string Currency {
      get { return currency_; }
      set {
        currency_ = value;
      }
    }

    /// <summary>Field number for the "amount" field.</summary>
    public const int AmountFieldNumber = 3;
    private static readonly pb::FieldCodec<float?> _single_amount_codec = pb::FieldCodec.ForStructWrapper<float>(26);
    private float? amount_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public float? Amount {
      get { return amount_; }
      set {
        amount_ = value;
      }
    }

    /// <summary>Field number for the "text" field.</summary>
    public const int TextFieldNumber = 8;
    private static readonly pb::FieldCodec<string> _single_text_codec = pb::FieldCodec.ForClassWrapper<string>(66);
    private string text_;
    /// <summary>
    /// text of the invoice line
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string Text {
      get { return text_; }
      set {
        text_ = value;
      }
    }

    /// <summary>Field number for the "item_id" field.</summary>
    public const int ItemIdFieldNumber = 9;
    private static readonly pb::FieldCodec<string> _single_itemId_codec = pb::FieldCodec.ForClassWrapper<string>(74);
    private string itemId_;
    /// <summary>
    /// id of the product (item)
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string ItemId {
      get { return itemId_; }
      set {
        itemId_ = value;
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as InvoiceLine);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(InvoiceLine other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (Currency != other.Currency) return false;
      if (!pbc::ProtobufEqualityComparers.BitwiseNullableSingleEqualityComparer.Equals(Amount, other.Amount)) return false;
      if (Text != other.Text) return false;
      if (ItemId != other.ItemId) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (currency_ != null) hash ^= Currency.GetHashCode();
      if (amount_ != null) hash ^= pbc::ProtobufEqualityComparers.BitwiseNullableSingleEqualityComparer.GetHashCode(Amount);
      if (text_ != null) hash ^= Text.GetHashCode();
      if (itemId_ != null) hash ^= ItemId.GetHashCode();
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
      if (amount_ != null) {
        _single_amount_codec.WriteTagAndValue(output, Amount);
      }
      if (currency_ != null) {
        _single_currency_codec.WriteTagAndValue(output, Currency);
      }
      if (text_ != null) {
        _single_text_codec.WriteTagAndValue(output, Text);
      }
      if (itemId_ != null) {
        _single_itemId_codec.WriteTagAndValue(output, ItemId);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (currency_ != null) {
        size += _single_currency_codec.CalculateSizeWithTag(Currency);
      }
      if (amount_ != null) {
        size += _single_amount_codec.CalculateSizeWithTag(Amount);
      }
      if (text_ != null) {
        size += _single_text_codec.CalculateSizeWithTag(Text);
      }
      if (itemId_ != null) {
        size += _single_itemId_codec.CalculateSizeWithTag(ItemId);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(InvoiceLine other) {
      if (other == null) {
        return;
      }
      if (other.currency_ != null) {
        if (currency_ == null || other.Currency != "") {
          Currency = other.Currency;
        }
      }
      if (other.amount_ != null) {
        if (amount_ == null || other.Amount != 0F) {
          Amount = other.Amount;
        }
      }
      if (other.text_ != null) {
        if (text_ == null || other.Text != "") {
          Text = other.Text;
        }
      }
      if (other.itemId_ != null) {
        if (itemId_ == null || other.ItemId != "") {
          ItemId = other.ItemId;
        }
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
          case 26: {
            float? value = _single_amount_codec.Read(input);
            if (amount_ == null || value != 0F) {
              Amount = value;
            }
            break;
          }
          case 34: {
            string value = _single_currency_codec.Read(input);
            if (currency_ == null || value != "") {
              Currency = value;
            }
            break;
          }
          case 66: {
            string value = _single_text_codec.Read(input);
            if (text_ == null || value != "") {
              Text = value;
            }
            break;
          }
          case 74: {
            string value = _single_itemId_codec.Read(input);
            if (itemId_ == null || value != "") {
              ItemId = value;
            }
            break;
          }
        }
      }
    }

  }

  public sealed partial class Supplier : pb::IMessage<Supplier> {
    private static readonly pb::MessageParser<Supplier> _parser = new pb::MessageParser<Supplier>(() => new Supplier());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<Supplier> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::Asgt.Type.DataReflection.Descriptor.MessageTypes[2]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public Supplier() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public Supplier(Supplier other) : this() {
      id_ = other.id_;
      Name = other.Name;
      GlobalId = other.GlobalId;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public Supplier Clone() {
      return new Supplier(this);
    }

    /// <summary>Field number for the "id" field.</summary>
    public const int IdFieldNumber = 1;
    private string id_ = "";
    /// <summary>
    ///  id of the supplier; not nullable
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string Id {
      get { return id_; }
      set {
        id_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "name" field.</summary>
    public const int NameFieldNumber = 4;
    private static readonly pb::FieldCodec<string> _single_name_codec = pb::FieldCodec.ForClassWrapper<string>(34);
    private string name_;
    /// <summary>
    /// name of the supplier
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string Name {
      get { return name_; }
      set {
        name_ = value;
      }
    }

    /// <summary>Field number for the "global_id" field.</summary>
    public const int GlobalIdFieldNumber = 5;
    private static readonly pb::FieldCodec<string> _single_globalId_codec = pb::FieldCodec.ForClassWrapper<string>(42);
    private string globalId_;
    /// <summary>
    /// global id of the supplier
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string GlobalId {
      get { return globalId_; }
      set {
        globalId_ = value;
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as Supplier);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(Supplier other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (Id != other.Id) return false;
      if (Name != other.Name) return false;
      if (GlobalId != other.GlobalId) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (Id.Length != 0) hash ^= Id.GetHashCode();
      if (name_ != null) hash ^= Name.GetHashCode();
      if (globalId_ != null) hash ^= GlobalId.GetHashCode();
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
      if (name_ != null) {
        _single_name_codec.WriteTagAndValue(output, Name);
      }
      if (globalId_ != null) {
        _single_globalId_codec.WriteTagAndValue(output, GlobalId);
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
      if (name_ != null) {
        size += _single_name_codec.CalculateSizeWithTag(Name);
      }
      if (globalId_ != null) {
        size += _single_globalId_codec.CalculateSizeWithTag(GlobalId);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(Supplier other) {
      if (other == null) {
        return;
      }
      if (other.Id.Length != 0) {
        Id = other.Id;
      }
      if (other.name_ != null) {
        if (name_ == null || other.Name != "") {
          Name = other.Name;
        }
      }
      if (other.globalId_ != null) {
        if (globalId_ == null || other.GlobalId != "") {
          GlobalId = other.GlobalId;
        }
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
          case 34: {
            string value = _single_name_codec.Read(input);
            if (name_ == null || value != "") {
              Name = value;
            }
            break;
          }
          case 42: {
            string value = _single_globalId_codec.Read(input);
            if (globalId_ == null || value != "") {
              GlobalId = value;
            }
            break;
          }
        }
      }
    }

  }

  public sealed partial class Transaction : pb::IMessage<Transaction> {
    private static readonly pb::MessageParser<Transaction> _parser = new pb::MessageParser<Transaction>(() => new Transaction());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<Transaction> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::Asgt.Type.DataReflection.Descriptor.MessageTypes[3]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public Transaction() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public Transaction(Transaction other) : this() {
      text_ = other.text_;
      amount_ = other.amount_;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public Transaction Clone() {
      return new Transaction(this);
    }

    /// <summary>Field number for the "text" field.</summary>
    public const int TextFieldNumber = 1;
    private string text_ = "";
    /// <summary>
    /// text of the bank transaction
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string Text {
      get { return text_; }
      set {
        text_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "amount" field.</summary>
    public const int AmountFieldNumber = 2;
    private float amount_;
    /// <summary>
    /// amount of the transaction
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public float Amount {
      get { return amount_; }
      set {
        amount_ = value;
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as Transaction);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(Transaction other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (Text != other.Text) return false;
      if (!pbc::ProtobufEqualityComparers.BitwiseSingleEqualityComparer.Equals(Amount, other.Amount)) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (Text.Length != 0) hash ^= Text.GetHashCode();
      if (Amount != 0F) hash ^= pbc::ProtobufEqualityComparers.BitwiseSingleEqualityComparer.GetHashCode(Amount);
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
      if (Text.Length != 0) {
        output.WriteRawTag(10);
        output.WriteString(Text);
      }
      if (Amount != 0F) {
        output.WriteRawTag(21);
        output.WriteFloat(Amount);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (Text.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Text);
      }
      if (Amount != 0F) {
        size += 1 + 4;
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(Transaction other) {
      if (other == null) {
        return;
      }
      if (other.Text.Length != 0) {
        Text = other.Text;
      }
      if (other.Amount != 0F) {
        Amount = other.Amount;
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
            Text = input.ReadString();
            break;
          }
          case 21: {
            Amount = input.ReadFloat();
            break;
          }
        }
      }
    }

  }

  public sealed partial class Data : pb::IMessage<Data> {
    private static readonly pb::MessageParser<Data> _parser = new pb::MessageParser<Data>(() => new Data());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<Data> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::Asgt.Type.DataReflection.Descriptor.MessageTypes[4]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public Data() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public Data(Data other) : this() {
      transaction_ = other.transaction_ != null ? other.transaction_.Clone() : null;
      invoice_ = other.invoice_ != null ? other.invoice_.Clone() : null;
      invoiceLine_ = other.invoiceLine_ != null ? other.invoiceLine_.Clone() : null;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public Data Clone() {
      return new Data(this);
    }

    /// <summary>Field number for the "transaction" field.</summary>
    public const int TransactionFieldNumber = 1;
    private global::Asgt.Type.Transaction transaction_;
    /// <summary>
    /// Transaction-level information; at this time used only with bank transactions
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public global::Asgt.Type.Transaction Transaction {
      get { return transaction_; }
      set {
        transaction_ = value;
      }
    }

    /// <summary>Field number for the "invoice" field.</summary>
    public const int InvoiceFieldNumber = 2;
    private global::Asgt.Type.Invoice invoice_;
    /// <summary>
    /// Invoice-level information for e-invoices and scanned invoices and receipts
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public global::Asgt.Type.Invoice Invoice {
      get { return invoice_; }
      set {
        invoice_ = value;
      }
    }

    /// <summary>Field number for the "invoice_line" field.</summary>
    public const int InvoiceLineFieldNumber = 3;
    private global::Asgt.Type.InvoiceLine invoiceLine_;
    /// <summary>
    /// Line-level information for e-invoices; use one sample per invoice line
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public global::Asgt.Type.InvoiceLine InvoiceLine {
      get { return invoiceLine_; }
      set {
        invoiceLine_ = value;
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as Data);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(Data other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (!object.Equals(Transaction, other.Transaction)) return false;
      if (!object.Equals(Invoice, other.Invoice)) return false;
      if (!object.Equals(InvoiceLine, other.InvoiceLine)) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (transaction_ != null) hash ^= Transaction.GetHashCode();
      if (invoice_ != null) hash ^= Invoice.GetHashCode();
      if (invoiceLine_ != null) hash ^= InvoiceLine.GetHashCode();
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
      if (transaction_ != null) {
        output.WriteRawTag(10);
        output.WriteMessage(Transaction);
      }
      if (invoice_ != null) {
        output.WriteRawTag(18);
        output.WriteMessage(Invoice);
      }
      if (invoiceLine_ != null) {
        output.WriteRawTag(26);
        output.WriteMessage(InvoiceLine);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (transaction_ != null) {
        size += 1 + pb::CodedOutputStream.ComputeMessageSize(Transaction);
      }
      if (invoice_ != null) {
        size += 1 + pb::CodedOutputStream.ComputeMessageSize(Invoice);
      }
      if (invoiceLine_ != null) {
        size += 1 + pb::CodedOutputStream.ComputeMessageSize(InvoiceLine);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(Data other) {
      if (other == null) {
        return;
      }
      if (other.transaction_ != null) {
        if (transaction_ == null) {
          transaction_ = new global::Asgt.Type.Transaction();
        }
        Transaction.MergeFrom(other.Transaction);
      }
      if (other.invoice_ != null) {
        if (invoice_ == null) {
          invoice_ = new global::Asgt.Type.Invoice();
        }
        Invoice.MergeFrom(other.Invoice);
      }
      if (other.invoiceLine_ != null) {
        if (invoiceLine_ == null) {
          invoiceLine_ = new global::Asgt.Type.InvoiceLine();
        }
        InvoiceLine.MergeFrom(other.InvoiceLine);
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
            if (transaction_ == null) {
              transaction_ = new global::Asgt.Type.Transaction();
            }
            input.ReadMessage(transaction_);
            break;
          }
          case 18: {
            if (invoice_ == null) {
              invoice_ = new global::Asgt.Type.Invoice();
            }
            input.ReadMessage(invoice_);
            break;
          }
          case 26: {
            if (invoiceLine_ == null) {
              invoiceLine_ = new global::Asgt.Type.InvoiceLine();
            }
            input.ReadMessage(invoiceLine_);
            break;
          }
        }
      }
    }

  }

  #endregion

}

#endregion Designer generated code
