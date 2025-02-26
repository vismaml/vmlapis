// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: asgt/type/model.proto
// Protobuf Java Version: 4.29.3

package ai.visma.asgt.type;

public final class ModelProto {
  private ModelProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      ModelProto.class.getName());
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
    internal_static_asgt_type_Model_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_asgt_type_Model_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_asgt_type_Model_TargetToConfidenceThresholdsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_asgt_type_Model_TargetToConfidenceThresholdsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_asgt_type_ConfidenceThresholds_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_asgt_type_ConfidenceThresholds_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025asgt/type/model.proto\022\tasgt.type\032\032asgt" +
      "/type/model_file.proto\032\032asgt/type/predic" +
      "tion.proto\032\036asgt/type/target_metrics.pro" +
      "to\032\034gen_bq_schema/bq_field.proto\032\037google" +
      "/protobuf/timestamp.proto\"\332\005\n\005Model\022\037\n\007v" +
      "ersion\030\003 \001(\003B\005\352?\002\010\001R\007version\0229\n\ncreated_" +
      "at\030\004 \001(\0132\032.google.protobuf.TimestampR\tcr" +
      "eatedAt\022(\n\014dataset_size\030\005 \001(\005B\005\352?\002\030\001R\013da" +
      "tasetSize\022*\n\rtraining_size\030\006 \001(\005B\005\352?\002\030\001R" +
      "\014trainingSize\022L\n\021confidence_scores\030\007 \003(\013" +
      "2\030.asgt.type.TargetMetricsB\005\352?\002\030\001R\020confi" +
      "denceScores\0229\n\ninput_type\030\010 \001(\0162\032.asgt.t" +
      "ype.Model.InputTypeR\tinputType\022!\n\014datase" +
      "t_type\030\t \001(\tR\013datasetType\022<\n\013model_files" +
      "\030\n \003(\0132\024.asgt.type.ModelFileB\005\352?\002\030\001R\nmod" +
      "elFiles\022\200\001\n\037target_to_confidence_thresho" +
      "lds\030\014 \003(\01322.asgt.type.Model.TargetToConf" +
      "idenceThresholdsEntryB\005\352?\002\030\001R\034targetToCo" +
      "nfidenceThresholds\032p\n!TargetToConfidence" +
      "ThresholdsEntry\022\020\n\003key\030\001 \001(\tR\003key\0225\n\005val" +
      "ue\030\002 \001(\0132\037.asgt.type.ConfidenceThreshold" +
      "sR\005value:\0028\001\"4\n\tInputType\022\023\n\017FEATURE_TEN" +
      "SORS\020\000\022\022\n\016EXAMPLE_TENSOR\020\001J\004\010\001\020\003J\004\010\013\020\014\"b" +
      "\n\024ConfidenceThresholds\022J\n\025confidence_thr" +
      "esholds\030\002 \003(\0132\025.asgt.type.ConfidenceR\024co" +
      "nfidenceThresholdsB\235\001\n\022ai.visma.asgt.typ" +
      "eB\nModelProtoP\001Z6github.com/e-conomic/vm" +
      "lapis/gen/go/asgt/type;asgttype\242\002\003ATX\252\002\t" +
      "Asgt.Type\312\002\tAsgt\\Type\342\002\025Asgt\\Type\\GPBMet" +
      "adata\352\002\nAsgt::Typeb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          ai.visma.asgt.type.ModelFileProto.getDescriptor(),
          ai.visma.asgt.type.PredictionProto.getDescriptor(),
          ai.visma.asgt.type.TargetMetricsProto.getDescriptor(),
          ai.visma.gen_bq_schema.BqFieldProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_asgt_type_Model_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_asgt_type_Model_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_asgt_type_Model_descriptor,
        new java.lang.String[] { "Version", "CreatedAt", "DatasetSize", "TrainingSize", "ConfidenceScores", "InputType", "DatasetType", "ModelFiles", "TargetToConfidenceThresholds", });
    internal_static_asgt_type_Model_TargetToConfidenceThresholdsEntry_descriptor =
      internal_static_asgt_type_Model_descriptor.getNestedTypes().get(0);
    internal_static_asgt_type_Model_TargetToConfidenceThresholdsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_asgt_type_Model_TargetToConfidenceThresholdsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_asgt_type_ConfidenceThresholds_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_asgt_type_ConfidenceThresholds_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_asgt_type_ConfidenceThresholds_descriptor,
        new java.lang.String[] { "ConfidenceThresholds", });
    descriptor.resolveAllFeaturesImmutable();
    ai.visma.asgt.type.ModelFileProto.getDescriptor();
    ai.visma.asgt.type.PredictionProto.getDescriptor();
    ai.visma.asgt.type.TargetMetricsProto.getDescriptor();
    ai.visma.gen_bq_schema.BqFieldProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(ai.visma.gen_bq_schema.BqFieldProto.bigquery);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
