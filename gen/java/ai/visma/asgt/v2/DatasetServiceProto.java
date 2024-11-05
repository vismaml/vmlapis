// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: asgt/v2/dataset_service.proto

package ai.visma.asgt.v2;

public final class DatasetServiceProto {
  private DatasetServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_asgt_v2_GetDatasetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_asgt_v2_GetDatasetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_asgt_v2_CreateDatasetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_asgt_v2_CreateDatasetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_asgt_v2_CreateOrUpdateDatasetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_asgt_v2_CreateOrUpdateDatasetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_asgt_v2_DeleteDatasetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_asgt_v2_DeleteDatasetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_asgt_v2_DeleteTagRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_asgt_v2_DeleteTagRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_asgt_v2_CreateExampleRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_asgt_v2_CreateExampleRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_asgt_v2_CreateOrUpdateExampleRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_asgt_v2_CreateOrUpdateExampleRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_asgt_v2_BatchCreateExampleRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_asgt_v2_BatchCreateExampleRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_asgt_v2_TruncateDatasetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_asgt_v2_TruncateDatasetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_asgt_v2_TrainingRequestOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_asgt_v2_TrainingRequestOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_asgt_v2_ModelRequestOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_asgt_v2_ModelRequestOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_asgt_v2_GetDatasetTrainingsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_asgt_v2_GetDatasetTrainingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_asgt_v2_GetDatasetModelsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_asgt_v2_GetDatasetModelsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_asgt_v2_GetTrainingsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_asgt_v2_GetTrainingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_asgt_v2_TrainingsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_asgt_v2_TrainingsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_asgt_v2_ModelsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_asgt_v2_ModelsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035asgt/v2/dataset_service.proto\022\007asgt.v2" +
      "\032\027asgt/type/dataset.proto\032\032asgt/v2/type/" +
      "example.proto\032\030asgt/v2/type/model.proto\032" +
      "\033asgt/v2/type/training.proto\032\034google/api" +
      "/annotations.proto\032\033google/protobuf/empt" +
      "y.proto\032.protoc-gen-openapiv2/options/an" +
      "notations.proto\032\027validate/validate.proto" +
      "\"`\n\021GetDatasetRequest\022K\n\014dataset_name\030\001 " +
      "\001(\tB(\372B%r#(\200\0022\036^[A-Za-z0-9.][A-Za-z0-9_." +
      ">-]*$R\013datasetName\"\235\001\n\024CreateDatasetRequ" +
      "est\022K\n\014dataset_name\030\001 \001(\tB(\372B%r#(\200\0022\036^[A" +
      "-Za-z0-9.][A-Za-z0-9_.>-]*$R\013datasetName" +
      "\0228\n\004tags\030\002 \003(\tB$\372B!\222\001\036\030\001\"\032r\030(@2\024^[A-Za-z" +
      "0-9\\s_.>-]*$R\004tags\"k\n\034CreateOrUpdateData" +
      "setRequest\022K\n\014dataset_name\030\001 \001(\tB(\372B%r#(" +
      "\200\0022\036^[A-Za-z0-9.][A-Za-z0-9_.>-]*$R\013data" +
      "setName\"c\n\024DeleteDatasetRequest\022K\n\014datas" +
      "et_name\030\001 \001(\tB(\372B%r#(\200\0022\036^[A-Za-z0-9.][A" +
      "-Za-z0-9_.>-]*$R\013datasetName\"W\n\020DeleteTa" +
      "gRequest\022C\n\010tag_name\030\001 \001(\tB(\372B%r#(\200\0022\036^[" +
      "A-Za-z0-9.][A-Za-z0-9_.>-]*$R\007tagName\"\224\001" +
      "\n\024CreateExampleRequest\022K\n\014dataset_name\030\001" +
      " \001(\tB(\372B%r#(\200\0022\036^[A-Za-z0-9.][A-Za-z0-9_" +
      ".>-]*$R\013datasetName\022/\n\007example\030\002 \001(\0132\025.a" +
      "sgt.v2.type.ExampleR\007example\"\234\001\n\034CreateO" +
      "rUpdateExampleRequest\022K\n\014dataset_name\030\001 " +
      "\001(\tB(\372B%r#(\200\0022\036^[A-Za-z0-9.][A-Za-z0-9_." +
      ">-]*$R\013datasetName\022/\n\007example\030\002 \001(\0132\025.as" +
      "gt.v2.type.ExampleR\007example\"\233\001\n\031BatchCre" +
      "ateExampleRequest\022K\n\014dataset_name\030\001 \001(\tB" +
      "(\372B%r#(\200\0022\036^[A-Za-z0-9.][A-Za-z0-9_.>-]*" +
      "$R\013datasetName\0221\n\010examples\030\002 \003(\0132\025.asgt." +
      "v2.type.ExampleR\010examples\"e\n\026TruncateDat" +
      "asetRequest\022K\n\014dataset_name\030\001 \001(\tB(\372B%r#" +
      "(\200\0022\036^[A-Za-z0-9.][A-Za-z0-9_.>-]*$R\013dat" +
      "asetName\"9\n\026TrainingRequestOptions\022\037\n\005li" +
      "mit\030\001 \001(\003B\t\372B\006\"\004\030d \000R\005limit\"6\n\023ModelRequ" +
      "estOptions\022\037\n\005limit\030\001 \001(\003B\t\372B\006\"\004\030d \000R\005li" +
      "mit\"\244\001\n\032GetDatasetTrainingsRequest\022K\n\014da" +
      "taset_name\030\001 \001(\tB(\372B%r#(\200\0022\036^[A-Za-z0-9." +
      "][A-Za-z0-9_.>-]*$R\013datasetName\0229\n\007optio" +
      "ns\030\002 \001(\0132\037.asgt.v2.TrainingRequestOption" +
      "sR\007options\"\236\001\n\027GetDatasetModelsRequest\022K" +
      "\n\014dataset_name\030\001 \001(\tB(\372B%r#(\200\0022\036^[A-Za-z" +
      "0-9.][A-Za-z0-9_.>-]*$R\013datasetName\0226\n\007o" +
      "ptions\030\002 \001(\0132\034.asgt.v2.ModelRequestOptio" +
      "nsR\007options\"P\n\023GetTrainingsRequest\0229\n\007op" +
      "tions\030\001 \001(\0132\037.asgt.v2.TrainingRequestOpt" +
      "ionsR\007options\"I\n\021TrainingsResponse\0224\n\ttr" +
      "ainings\030\001 \003(\0132\026.asgt.v2.type.TrainingR\tt" +
      "rainings\"=\n\016ModelsResponse\022+\n\006models\030\001 \003" +
      "(\0132\023.asgt.v2.type.ModelR\006models2\336\013\n\016Data" +
      "setService\022a\n\nGetDataset\022\032.asgt.v2.GetDa" +
      "tasetRequest\032\022.asgt.type.Dataset\"#\202\323\344\223\002\035" +
      "\022\033/v2/datasets/{dataset_name}\022_\n\rCreateD" +
      "ataset\022\035.asgt.v2.CreateDatasetRequest\032\026." +
      "google.protobuf.Empty\"\027\202\323\344\223\002\021\"\014/v2/datas" +
      "ets:\001*\022{\n\025CreateOrUpdateDataset\022%.asgt.v" +
      "2.CreateOrUpdateDatasetRequest\032\026.google." +
      "protobuf.Empty\"#\202\323\344\223\002\035\032\033/v2/datasets/{da" +
      "taset_name}\022g\n\rDeleteDataset\022\035.asgt.v2.D" +
      "eleteDatasetRequest\032\022.asgt.type.Dataset\"" +
      "#\202\323\344\223\002\035*\033/v2/datasets/{dataset_name}\022[\n\t" +
      "DeleteTag\022\031.asgt.v2.DeleteTagRequest\032\026.g" +
      "oogle.protobuf.Empty\"\033\202\323\344\223\002\025*\023/v2/tags/{" +
      "tag_name}\022w\n\rCreateExample\022\035.asgt.v2.Cre" +
      "ateExampleRequest\032\026.google.protobuf.Empt" +
      "y\"/\202\323\344\223\002)\"$/v2/datasets/{dataset_name}/e" +
      "xamples:\001*\022\224\001\n\025CreateOrUpdateExample\022%.a" +
      "sgt.v2.CreateOrUpdateExampleRequest\032\026.go" +
      "ogle.protobuf.Empty\"<\202\323\344\223\0026\0321/v2/dataset" +
      "s/{dataset_name}/examples/{example.id}:\001" +
      "*\022\215\001\n\022BatchCreateExample\022\".asgt.v2.Batch" +
      "CreateExampleRequest\032\026.google.protobuf.E" +
      "mpty\";\202\323\344\223\0025\"0/v2/datasets/{dataset_name" +
      "}/examples:batchCreate:\001*\022x\n\017TruncateDat" +
      "aset\022\037.asgt.v2.TruncateDatasetRequest\032\026." +
      "google.protobuf.Empty\",\202\323\344\223\002&*$/v2/datas" +
      "ets/{dataset_name}/examples\022\205\001\n\023GetDatas" +
      "etTrainings\022#.asgt.v2.GetDatasetTraining" +
      "sRequest\032\032.asgt.v2.TrainingsResponse\"-\202\323" +
      "\344\223\002\'\022%/v2/datasets/{dataset_name}/traini" +
      "ngs\022y\n\020GetDatasetModels\022 .asgt.v2.GetDat" +
      "asetModelsRequest\032\027.asgt.v2.ModelsRespon" +
      "se\"*\202\323\344\223\002$\022\"/v2/datasets/{dataset_name}/" +
      "models\022_\n\014GetTrainings\022\034.asgt.v2.GetTrai" +
      "ningsRequest\032\032.asgt.v2.TrainingsResponse" +
      "\"\025\202\323\344\223\002\017\022\r/v2/trainings\032G\222AD\022BManage dat" +
      "asets and examples used for training Aut" +
      "oSuggest models.B\221\001\n\020ai.visma.asgt.v2B\023D" +
      "atasetServiceProtoP\001Z+github.com/e-conom" +
      "ic/vmlapis/gen/go/asgt/v2\242\002\003AXX\252\002\007Asgt.V" +
      "2\312\002\007Asgt\\V2\342\002\023Asgt\\V2\\GPBMetadata\352\002\010Asgt" +
      "::V2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          ai.visma.asgt.type.DatasetProto.getDescriptor(),
          ai.visma.asgt.v2.type.ExampleProto.getDescriptor(),
          ai.visma.asgt.v2.type.ModelProto.getDescriptor(),
          ai.visma.asgt.v2.type.TrainingProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          ai.visma.grpc.gateway.protoc_gen_openapiv2.options.AnnotationsProto.getDescriptor(),
          ai.visma.validate.ValidateProto.getDescriptor(),
        });
    internal_static_asgt_v2_GetDatasetRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_asgt_v2_GetDatasetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_asgt_v2_GetDatasetRequest_descriptor,
        new java.lang.String[] { "DatasetName", });
    internal_static_asgt_v2_CreateDatasetRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_asgt_v2_CreateDatasetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_asgt_v2_CreateDatasetRequest_descriptor,
        new java.lang.String[] { "DatasetName", "Tags", });
    internal_static_asgt_v2_CreateOrUpdateDatasetRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_asgt_v2_CreateOrUpdateDatasetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_asgt_v2_CreateOrUpdateDatasetRequest_descriptor,
        new java.lang.String[] { "DatasetName", });
    internal_static_asgt_v2_DeleteDatasetRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_asgt_v2_DeleteDatasetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_asgt_v2_DeleteDatasetRequest_descriptor,
        new java.lang.String[] { "DatasetName", });
    internal_static_asgt_v2_DeleteTagRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_asgt_v2_DeleteTagRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_asgt_v2_DeleteTagRequest_descriptor,
        new java.lang.String[] { "TagName", });
    internal_static_asgt_v2_CreateExampleRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_asgt_v2_CreateExampleRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_asgt_v2_CreateExampleRequest_descriptor,
        new java.lang.String[] { "DatasetName", "Example", });
    internal_static_asgt_v2_CreateOrUpdateExampleRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_asgt_v2_CreateOrUpdateExampleRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_asgt_v2_CreateOrUpdateExampleRequest_descriptor,
        new java.lang.String[] { "DatasetName", "Example", });
    internal_static_asgt_v2_BatchCreateExampleRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_asgt_v2_BatchCreateExampleRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_asgt_v2_BatchCreateExampleRequest_descriptor,
        new java.lang.String[] { "DatasetName", "Examples", });
    internal_static_asgt_v2_TruncateDatasetRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_asgt_v2_TruncateDatasetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_asgt_v2_TruncateDatasetRequest_descriptor,
        new java.lang.String[] { "DatasetName", });
    internal_static_asgt_v2_TrainingRequestOptions_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_asgt_v2_TrainingRequestOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_asgt_v2_TrainingRequestOptions_descriptor,
        new java.lang.String[] { "Limit", });
    internal_static_asgt_v2_ModelRequestOptions_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_asgt_v2_ModelRequestOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_asgt_v2_ModelRequestOptions_descriptor,
        new java.lang.String[] { "Limit", });
    internal_static_asgt_v2_GetDatasetTrainingsRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_asgt_v2_GetDatasetTrainingsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_asgt_v2_GetDatasetTrainingsRequest_descriptor,
        new java.lang.String[] { "DatasetName", "Options", });
    internal_static_asgt_v2_GetDatasetModelsRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_asgt_v2_GetDatasetModelsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_asgt_v2_GetDatasetModelsRequest_descriptor,
        new java.lang.String[] { "DatasetName", "Options", });
    internal_static_asgt_v2_GetTrainingsRequest_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_asgt_v2_GetTrainingsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_asgt_v2_GetTrainingsRequest_descriptor,
        new java.lang.String[] { "Options", });
    internal_static_asgt_v2_TrainingsResponse_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_asgt_v2_TrainingsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_asgt_v2_TrainingsResponse_descriptor,
        new java.lang.String[] { "Trainings", });
    internal_static_asgt_v2_ModelsResponse_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_asgt_v2_ModelsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_asgt_v2_ModelsResponse_descriptor,
        new java.lang.String[] { "Models", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(ai.visma.grpc.gateway.protoc_gen_openapiv2.options.AnnotationsProto.openapiv2Tag);
    registry.add(ai.visma.validate.ValidateProto.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    ai.visma.asgt.type.DatasetProto.getDescriptor();
    ai.visma.asgt.v2.type.ExampleProto.getDescriptor();
    ai.visma.asgt.v2.type.ModelProto.getDescriptor();
    ai.visma.asgt.v2.type.TrainingProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    ai.visma.grpc.gateway.protoc_gen_openapiv2.options.AnnotationsProto.getDescriptor();
    ai.visma.validate.ValidateProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
