// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: asgt/type/target_metrics.proto

package ai.visma.asgt.type;

public final class TargetMetricsProto {
  private TargetMetricsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_asgt_type_TargetMetrics_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_asgt_type_TargetMetrics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_asgt_type_TargetMetrics_Metric_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_asgt_type_TargetMetrics_Metric_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036asgt/type/target_metrics.proto\022\tasgt.t" +
      "ype\"\344\002\n\rTargetMetrics\022\026\n\006target\030\001 \001(\tR\006t" +
      "arget\0229\n\007metrics\030\002 \003(\0132\037.asgt.type.Targe" +
      "tMetrics.MetricR\007metrics\032\377\001\n\006Metric\022\034\n\tp" +
      "recision\030\001 \001(\002R\tprecision\022\036\n\nconfidence\030" +
      "\002 \001(\002R\nconfidence\022\037\n\013answer_rate\030\003 \001(\002R\n" +
      "answerRate\022#\n\rtrue_positive\030\004 \001(\005R\014trueP" +
      "ositive\022#\n\rtrue_negative\030\005 \001(\005R\014trueNega" +
      "tive\022%\n\016false_positive\030\006 \001(\005R\rfalsePosit" +
      "ive\022%\n\016false_negative\030\007 \001(\005R\rfalseNegati" +
      "veB\245\001\n\022ai.visma.asgt.typeB\022TargetMetrics" +
      "ProtoP\001Z6github.com/e-conomic/vmlapis/ge" +
      "n/go/asgt/type;asgttype\242\002\003ATX\252\002\tAsgt.Typ" +
      "e\312\002\tAsgt\\Type\342\002\025Asgt\\Type\\GPBMetadata\352\002\n" +
      "Asgt::Typeb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_asgt_type_TargetMetrics_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_asgt_type_TargetMetrics_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_asgt_type_TargetMetrics_descriptor,
        new java.lang.String[] { "Target", "Metrics", });
    internal_static_asgt_type_TargetMetrics_Metric_descriptor =
      internal_static_asgt_type_TargetMetrics_descriptor.getNestedTypes().get(0);
    internal_static_asgt_type_TargetMetrics_Metric_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_asgt_type_TargetMetrics_Metric_descriptor,
        new java.lang.String[] { "Precision", "Confidence", "AnswerRate", "TruePositive", "TrueNegative", "FalsePositive", "FalseNegative", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
