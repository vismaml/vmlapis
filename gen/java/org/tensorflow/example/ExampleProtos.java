// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ssn/type/tensorflow/example.proto

package org.tensorflow.example;

public final class ExampleProtos {
  private ExampleProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_Example_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_Example_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_SequenceExample_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_SequenceExample_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!ssn/type/tensorflow/example.proto\022\nten" +
      "sorflow\032!ssn/type/tensorflow/feature.pro" +
      "to\";\n\007Example\0220\n\010features\030\001 \001(\0132\024.tensor" +
      "flow.FeaturesR\010features\"\200\001\n\017SequenceExam" +
      "ple\022.\n\007context\030\001 \001(\0132\024.tensorflow.Featur" +
      "esR\007context\022=\n\rfeature_lists\030\002 \001(\0132\030.ten" +
      "sorflow.FeatureListsR\014featureListsBh\n\026or" +
      "g.tensorflow.exampleB\rExampleProtosP\001Z:g" +
      "ithub.com/e-conomic/tensorflow/tensorflo" +
      "w/go/core/example\370\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.tensorflow.example.FeatureProtos.getDescriptor(),
        });
    internal_static_tensorflow_Example_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_Example_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_Example_descriptor,
        new java.lang.String[] { "Features", });
    internal_static_tensorflow_SequenceExample_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tensorflow_SequenceExample_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_SequenceExample_descriptor,
        new java.lang.String[] { "Context", "FeatureLists", });
    org.tensorflow.example.FeatureProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
