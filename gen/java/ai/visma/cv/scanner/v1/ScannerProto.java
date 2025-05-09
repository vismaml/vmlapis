// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: cv/scanner/v1/scanner.proto
// Protobuf Java Version: 4.29.3

package ai.visma.cv.scanner.v1;

public final class ScannerProto {
  private ScannerProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      ScannerProto.class.getName());
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
    internal_static_cv_scanner_v1_ScanCVRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_cv_scanner_v1_ScanCVRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cv_scanner_v1_ScanCVResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_cv_scanner_v1_ScanCVResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cv_scanner_v1_Feature_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_cv_scanner_v1_Feature_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033cv/scanner/v1/scanner.proto\022\rcv.scanne" +
      "r.v1\032\034google/api/annotations.proto\032\025goog" +
      "le/api/http.proto\032 ssn/annotator/v1/anno" +
      "tator.proto\032\030ssn/type/candidate.proto\"\217\001" +
      "\n\rScanCVRequest\0226\n\010document\030\001 \001(\0132\032.ssn." +
      "annotator.v1.DocumentR\010document\0222\n\010featu" +
      "res\030\002 \003(\0132\026.cv.scanner.v1.FeatureR\010featu" +
      "res\022\022\n\004tags\030\003 \003(\tR\004tags\"\207\t\n\016ScanCVRespon" +
      "se\0222\n\nfirst_name\030\001 \003(\0132\023.ssn.type.Candid" +
      "ateR\tfirstName\0220\n\tlast_name\030\002 \003(\0132\023.ssn." +
      "type.CandidateR\010lastName\0227\n\rdate_of_birt" +
      "h\030\003 \003(\0132\023.ssn.type.CandidateR\013dateOfBirt" +
      "h\022)\n\005phone\030\004 \003(\0132\023.ssn.type.CandidateR\005p" +
      "hone\022)\n\005email\030\005 \003(\0132\023.ssn.type.Candidate" +
      "R\005email\022-\n\007country\030\006 \003(\0132\023.ssn.type.Cand" +
      "idateR\007country\0225\n\013nationality\030\007 \003(\0132\023.ss" +
      "n.type.CandidateR\013nationality\0224\n\013postal_" +
      "code\030\010 \003(\0132\023.ssn.type.CandidateR\npostalC" +
      "ode\0224\n\013postal_area\030\t \003(\0132\023.ssn.type.Cand" +
      "idateR\npostalArea\0227\n\014municipality\030\n \003(\0132" +
      "\023.ssn.type.CandidateR\014municipality\022+\n\006co" +
      "unty\030\013 \003(\0132\023.ssn.type.CandidateR\006county\022" +
      "-\n\007address\030\014 \003(\0132\023.ssn.type.CandidateR\007a" +
      "ddress\0228\n\remployer_name\030\r \003(\0132\023.ssn.type" +
      ".CandidateR\014employerName\022:\n\016position_tit" +
      "le\030\016 \003(\0132\023.ssn.type.CandidateR\rpositionT" +
      "itle\022\'\n\004date\030\017 \003(\0132\023.ssn.type.CandidateR" +
      "\004date\022>\n\020institution_name\030\020 \003(\0132\023.ssn.ty" +
      "pe.CandidateR\017institutionName\022>\n\020institu" +
      "tion_type\030\021 \003(\0132\023.ssn.type.CandidateR\017in" +
      "stitutionType\022?\n\021area_of_education\030\022 \003(\013" +
      "2\023.ssn.type.CandidateR\017areaOfEducation\022+" +
      "\n\006degree\030\023 \003(\0132\023.ssn.type.CandidateR\006deg" +
      "ree\0228\n\raverage_grade\030\024 \003(\0132\023.ssn.type.Ca" +
      "ndidateR\014averageGrade\022\'\n\004name\030\025 \003(\0132\023.ss" +
      "n.type.CandidateR\004name\022)\n\005level\030\026 \003(\0132\023." +
      "ssn.type.CandidateR\005level\"\273\003\n\007Feature\022/\n" +
      "\004type\030\001 \001(\0162\033.cv.scanner.v1.Feature.Type" +
      "R\004type\022\037\n\013max_results\030\002 \001(\005R\nmaxResults\"" +
      "\335\002\n\004Type\022\016\n\nFIRST_NAME\020\000\022\r\n\tLAST_NAME\020\001\022" +
      "\021\n\rDATE_OF_BIRTH\020\002\022\t\n\005PHONE\020\003\022\t\n\005EMAIL\020\004" +
      "\022\013\n\007COUNTRY\020\005\022\017\n\013NATIONALITY\020\006\022\017\n\013POSTAL" +
      "_CODE\020\007\022\017\n\013POSTAL_AREA\020\010\022\020\n\014MUNICIPALITY" +
      "\020\t\022\n\n\006COUNTY\020\n\022\013\n\007ADDRESS\020\013\022\021\n\rEMPLOYER_" +
      "NAME\020\014\022\022\n\016POSITION_TITLE\020\r\022\010\n\004DATE\020\016\022\022\n\016" +
      "INSTITUTE_NAME\020\017\022\022\n\016INSTITUTE_TYPE\020\020\022\025\n\021" +
      "AREA_OF_EDUCATION\020\021\022\n\n\006DEGREE\020\022\022\021\n\rAVERA" +
      "GE_GRADE\020\023\022\010\n\004NAME\020\024\022\t\n\005LEVEL\020\0252o\n\007Scann" +
      "er\022d\n\006ScanCV\022\034.cv.scanner.v1.ScanCVReque" +
      "st\032\035.cv.scanner.v1.ScanCVResponse\"\035\202\323\344\223\002" +
      "\027\"\022/v1/scanner:scancv:\001*B\262\001\n\026ai.visma.cv" +
      ".scanner.v1B\014ScannerProtoP\001Z4github.com/" +
      "e-conomic/vmlapis/gen/go/cv/scanner/v1;c" +
      "v\242\002\003CSX\252\002\rCv.Scanner.V1\312\002\rCv\\Scanner\\V1\342" +
      "\002\031Cv\\Scanner\\V1\\GPBMetadata\352\002\017Cv::Scanne" +
      "r::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.HttpProto.getDescriptor(),
          ai.visma.ssn.annotator.v1.AnnotatorProto.getDescriptor(),
          ai.visma.ssn.type.CandidateProto.getDescriptor(),
        });
    internal_static_cv_scanner_v1_ScanCVRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cv_scanner_v1_ScanCVRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_cv_scanner_v1_ScanCVRequest_descriptor,
        new java.lang.String[] { "Document", "Features", "Tags", });
    internal_static_cv_scanner_v1_ScanCVResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cv_scanner_v1_ScanCVResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_cv_scanner_v1_ScanCVResponse_descriptor,
        new java.lang.String[] { "FirstName", "LastName", "DateOfBirth", "Phone", "Email", "Country", "Nationality", "PostalCode", "PostalArea", "Municipality", "County", "Address", "EmployerName", "PositionTitle", "Date", "InstitutionName", "InstitutionType", "AreaOfEducation", "Degree", "AverageGrade", "Name", "Level", });
    internal_static_cv_scanner_v1_Feature_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_cv_scanner_v1_Feature_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_cv_scanner_v1_Feature_descriptor,
        new java.lang.String[] { "Type", "MaxResults", });
    descriptor.resolveAllFeaturesImmutable();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.HttpProto.getDescriptor();
    ai.visma.ssn.annotator.v1.AnnotatorProto.getDescriptor();
    ai.visma.ssn.type.CandidateProto.getDescriptor();
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
