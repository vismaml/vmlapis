// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/type/date.proto
// Protobuf Java Version: 4.29.3

package ai.visma.google.type;

public final class DateProto {
  private DateProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      DateProto.class.getName());
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
    internal_static_google_type_Date_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_type_Date_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026google/type/date.proto\022\013google.type\"B\n" +
      "\004Date\022\022\n\004year\030\001 \001(\005R\004year\022\024\n\005month\030\002 \001(\005" +
      "R\005month\022\020\n\003day\030\003 \001(\005R\003dayB\247\001\n\024ai.visma.g" +
      "oogle.typeB\tDateProtoP\001Z4google.golang.o" +
      "rg/genproto/googleapis/type/date;date\370\001\001" +
      "\242\002\003GTX\252\002\013Google.Type\312\002\013Google\\Type\342\002\027Goo" +
      "gle\\Type\\GPBMetadata\352\002\014Google::Typeb\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_type_Date_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_type_Date_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_type_Date_descriptor,
        new java.lang.String[] { "Year", "Month", "Day", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
