// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: ssn/access/v1/access.proto
// Protobuf Java Version: 4.29.3

package ai.visma.ssn.access.v1;

public final class AccessProto {
  private AccessProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      AccessProto.class.getName());
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
    internal_static_ssn_access_v1_ValetKeyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ssn_access_v1_ValetKeyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ssn_access_v1_ValetKeyResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ssn_access_v1_ValetKeyResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032ssn/access/v1/access.proto\022\rssn.access" +
      ".v1\032\034google/api/annotations.proto\"5\n\017Val" +
      "etKeyRequest\022\020\n\003sub\030\001 \001(\tR\003sub\022\020\n\003exp\030\002 " +
      "\001(\003R\003exp\"8\n\020ValetKeyResponse\022\016\n\002id\030\001 \001(\t" +
      "R\002id\022\024\n\005token\030\002 \001(\tR\005token2}\n\006Access\022s\n\020" +
      "GenerateValetKey\022\036.ssn.access.v1.ValetKe" +
      "yRequest\032\037.ssn.access.v1.ValetKeyRespons" +
      "e\"\036\202\323\344\223\002\030\"\023/v1/access/valetkey:\001*B\265\001\n\026ai" +
      ".visma.ssn.access.v1B\013AccessProtoP\001Z8git" +
      "hub.com/e-conomic/vmlapis/gen/go/ssn/acc" +
      "ess/v1;access\242\002\003SAX\252\002\rSsn.Access.V1\312\002\rSs" +
      "n\\Access\\V1\342\002\031Ssn\\Access\\V1\\GPBMetadata\352" +
      "\002\017Ssn::Access::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_ssn_access_v1_ValetKeyRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ssn_access_v1_ValetKeyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_ssn_access_v1_ValetKeyRequest_descriptor,
        new java.lang.String[] { "Sub", "Exp", });
    internal_static_ssn_access_v1_ValetKeyResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ssn_access_v1_ValetKeyResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_ssn_access_v1_ValetKeyResponse_descriptor,
        new java.lang.String[] { "Id", "Token", });
    descriptor.resolveAllFeaturesImmutable();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
