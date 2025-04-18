// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.33.0
// 	protoc        (unknown)
// source: asgt/type/model_type.proto

package asgttype

import (
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

type ModelType int32

const (
	ModelType_DEFAULT    ModelType = 0
	ModelType_TENSORFLOW ModelType = 1
	ModelType_ONNX       ModelType = 2
)

// Enum value maps for ModelType.
var (
	ModelType_name = map[int32]string{
		0: "DEFAULT",
		1: "TENSORFLOW",
		2: "ONNX",
	}
	ModelType_value = map[string]int32{
		"DEFAULT":    0,
		"TENSORFLOW": 1,
		"ONNX":       2,
	}
)

func (x ModelType) Enum() *ModelType {
	p := new(ModelType)
	*p = x
	return p
}

func (x ModelType) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (ModelType) Descriptor() protoreflect.EnumDescriptor {
	return file_asgt_type_model_type_proto_enumTypes[0].Descriptor()
}

func (ModelType) Type() protoreflect.EnumType {
	return &file_asgt_type_model_type_proto_enumTypes[0]
}

func (x ModelType) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use ModelType.Descriptor instead.
func (ModelType) EnumDescriptor() ([]byte, []int) {
	return file_asgt_type_model_type_proto_rawDescGZIP(), []int{0}
}

var File_asgt_type_model_type_proto protoreflect.FileDescriptor

var file_asgt_type_model_type_proto_rawDesc = []byte{
	0x0a, 0x1a, 0x61, 0x73, 0x67, 0x74, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x2f, 0x6d, 0x6f, 0x64, 0x65,
	0x6c, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x09, 0x61, 0x73,
	0x67, 0x74, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x2a, 0x32, 0x0a, 0x09, 0x4d, 0x6f, 0x64, 0x65, 0x6c,
	0x54, 0x79, 0x70, 0x65, 0x12, 0x0b, 0x0a, 0x07, 0x44, 0x45, 0x46, 0x41, 0x55, 0x4c, 0x54, 0x10,
	0x00, 0x12, 0x0e, 0x0a, 0x0a, 0x54, 0x45, 0x4e, 0x53, 0x4f, 0x52, 0x46, 0x4c, 0x4f, 0x57, 0x10,
	0x01, 0x12, 0x08, 0x0a, 0x04, 0x4f, 0x4e, 0x4e, 0x58, 0x10, 0x02, 0x42, 0xa1, 0x01, 0x0a, 0x12,
	0x61, 0x69, 0x2e, 0x76, 0x69, 0x73, 0x6d, 0x61, 0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x74, 0x79,
	0x70, 0x65, 0x42, 0x0e, 0x4d, 0x6f, 0x64, 0x65, 0x6c, 0x54, 0x79, 0x70, 0x65, 0x50, 0x72, 0x6f,
	0x74, 0x6f, 0x50, 0x01, 0x5a, 0x36, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d,
	0x2f, 0x65, 0x2d, 0x63, 0x6f, 0x6e, 0x6f, 0x6d, 0x69, 0x63, 0x2f, 0x76, 0x6d, 0x6c, 0x61, 0x70,
	0x69, 0x73, 0x2f, 0x67, 0x65, 0x6e, 0x2f, 0x67, 0x6f, 0x2f, 0x61, 0x73, 0x67, 0x74, 0x2f, 0x74,
	0x79, 0x70, 0x65, 0x3b, 0x61, 0x73, 0x67, 0x74, 0x74, 0x79, 0x70, 0x65, 0xa2, 0x02, 0x03, 0x41,
	0x54, 0x58, 0xaa, 0x02, 0x09, 0x41, 0x73, 0x67, 0x74, 0x2e, 0x54, 0x79, 0x70, 0x65, 0xca, 0x02,
	0x09, 0x41, 0x73, 0x67, 0x74, 0x5c, 0x54, 0x79, 0x70, 0x65, 0xe2, 0x02, 0x15, 0x41, 0x73, 0x67,
	0x74, 0x5c, 0x54, 0x79, 0x70, 0x65, 0x5c, 0x47, 0x50, 0x42, 0x4d, 0x65, 0x74, 0x61, 0x64, 0x61,
	0x74, 0x61, 0xea, 0x02, 0x0a, 0x41, 0x73, 0x67, 0x74, 0x3a, 0x3a, 0x54, 0x79, 0x70, 0x65, 0x62,
	0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_asgt_type_model_type_proto_rawDescOnce sync.Once
	file_asgt_type_model_type_proto_rawDescData = file_asgt_type_model_type_proto_rawDesc
)

func file_asgt_type_model_type_proto_rawDescGZIP() []byte {
	file_asgt_type_model_type_proto_rawDescOnce.Do(func() {
		file_asgt_type_model_type_proto_rawDescData = protoimpl.X.CompressGZIP(file_asgt_type_model_type_proto_rawDescData)
	})
	return file_asgt_type_model_type_proto_rawDescData
}

var file_asgt_type_model_type_proto_enumTypes = make([]protoimpl.EnumInfo, 1)
var file_asgt_type_model_type_proto_goTypes = []interface{}{
	(ModelType)(0), // 0: asgt.type.ModelType
}
var file_asgt_type_model_type_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_asgt_type_model_type_proto_init() }
func file_asgt_type_model_type_proto_init() {
	if File_asgt_type_model_type_proto != nil {
		return
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_asgt_type_model_type_proto_rawDesc,
			NumEnums:      1,
			NumMessages:   0,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_asgt_type_model_type_proto_goTypes,
		DependencyIndexes: file_asgt_type_model_type_proto_depIdxs,
		EnumInfos:         file_asgt_type_model_type_proto_enumTypes,
	}.Build()
	File_asgt_type_model_type_proto = out.File
	file_asgt_type_model_type_proto_rawDesc = nil
	file_asgt_type_model_type_proto_goTypes = nil
	file_asgt_type_model_type_proto_depIdxs = nil
}
