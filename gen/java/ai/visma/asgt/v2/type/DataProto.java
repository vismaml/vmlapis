// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: asgt/v2/type/data.proto
// Protobuf Java Version: 4.29.3

package ai.visma.asgt.v2.type;

public final class DataProto {
  private DataProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      DataProto.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_asgt_v2_type_Invoice_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_asgt_v2_type_Invoice_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_asgt_v2_type_Transaction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_asgt_v2_type_Transaction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_asgt_v2_type_InvoiceLine_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_asgt_v2_type_InvoiceLine_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_asgt_v2_type_Supplier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_asgt_v2_type_Supplier_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_asgt_v2_type_Data_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_asgt_v2_type_Data_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027asgt/v2/type/data.proto\022\014asgt.v2.type\032" +
      "\037google/protobuf/timestamp.proto\032\027valida" +
      "te/validate.proto\"\035\n\007Invoice\022\022\n\004text\030\001 \001" +
      "(\tR\004text\"9\n\013Transaction\022\022\n\004text\030\001 \001(\tR\004t" +
      "ext\022\026\n\006amount\030\002 \001(\002R\006amount\"\344\001\n\013InvoiceL" +
      "ine\022\027\n\007item_id\030\001 \001(\tR\006itemId\022\022\n\004text\030\002 \001" +
      "(\tR\004text\0229\n\nissue_date\030\003 \001(\0132\032.google.pr" +
      "otobuf.TimestampR\tissueDate\0222\n\010supplier\030" +
      "\004 \001(\0132\026.asgt.v2.type.SupplierR\010supplier\022" +
      "!\n\014customer_ref\030\005 \001(\tR\013customerRef\022\026\n\006am" +
      "ount\030\007 \001(\002R\006amount\"d\n\010Supplier\022\'\n\002id\030\001 \001" +
      "(\tB\027\372B\024r\022(@2\016^[A-Za-z0-9]*$R\002id\022\022\n\004name\030" +
      "\002 \001(\tR\004name\022\033\n\tglobal_id\030\003 \001(\tR\010globalId" +
      "\"\312\001\n\004Data\022=\n\013transaction\030\001 \001(\0132\031.asgt.v2" +
      ".type.TransactionH\000R\013transaction\0221\n\007invo" +
      "ice\030\002 \001(\0132\025.asgt.v2.type.InvoiceH\000R\007invo" +
      "ice\022>\n\014invoice_line\030\003 \001(\0132\031.asgt.v2.type" +
      ".InvoiceLineH\000R\013invoiceLineB\020\n\016data_stru" +
      "ctureB\257\001\n\025ai.visma.asgt.v2.typeB\tDataPro" +
      "toP\001Z9github.com/e-conomic/vmlapis/gen/g" +
      "o/asgt/v2/type;asgttype\242\002\003AVT\252\002\014Asgt.V2." +
      "Type\312\002\014Asgt\\V2\\Type\342\002\030Asgt\\V2\\Type\\GPBMe" +
      "tadata\352\002\016Asgt::V2::Typeb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
          ai.visma.validate.ValidateProto.getDescriptor(),
        });
    internal_static_asgt_v2_type_Invoice_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_asgt_v2_type_Invoice_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_asgt_v2_type_Invoice_descriptor,
        new java.lang.String[] { "Text", });
    internal_static_asgt_v2_type_Transaction_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_asgt_v2_type_Transaction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_asgt_v2_type_Transaction_descriptor,
        new java.lang.String[] { "Text", "Amount", });
    internal_static_asgt_v2_type_InvoiceLine_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_asgt_v2_type_InvoiceLine_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_asgt_v2_type_InvoiceLine_descriptor,
        new java.lang.String[] { "ItemId", "Text", "IssueDate", "Supplier", "CustomerRef", "Amount", });
    internal_static_asgt_v2_type_Supplier_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_asgt_v2_type_Supplier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_asgt_v2_type_Supplier_descriptor,
        new java.lang.String[] { "Id", "Name", "GlobalId", });
    internal_static_asgt_v2_type_Data_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_asgt_v2_type_Data_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_asgt_v2_type_Data_descriptor,
        new java.lang.String[] { "Transaction", "Invoice", "InvoiceLine", "DataStructure", });
    descriptor.resolveAllFeaturesImmutable();
    com.google.protobuf.TimestampProto.getDescriptor();
    ai.visma.validate.ValidateProto.getDescriptor();
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(ai.visma.validate.ValidateProto.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
