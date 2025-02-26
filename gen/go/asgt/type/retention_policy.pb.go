// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.36.5
// 	protoc        (unknown)
// source: asgt/type/retention_policy.proto

package asgttype

import (
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
	unsafe "unsafe"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

type RetentionPolicy struct {
	state         protoimpl.MessageState `protogen:"open.v1"`
	MaxDays       int64                  `protobuf:"varint,1,opt,name=max_days,json=maxDays,proto3" json:"max_days,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *RetentionPolicy) Reset() {
	*x = RetentionPolicy{}
	mi := &file_asgt_type_retention_policy_proto_msgTypes[0]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *RetentionPolicy) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*RetentionPolicy) ProtoMessage() {}

func (x *RetentionPolicy) ProtoReflect() protoreflect.Message {
	mi := &file_asgt_type_retention_policy_proto_msgTypes[0]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use RetentionPolicy.ProtoReflect.Descriptor instead.
func (*RetentionPolicy) Descriptor() ([]byte, []int) {
	return file_asgt_type_retention_policy_proto_rawDescGZIP(), []int{0}
}

func (x *RetentionPolicy) GetMaxDays() int64 {
	if x != nil {
		return x.MaxDays
	}
	return 0
}

var File_asgt_type_retention_policy_proto protoreflect.FileDescriptor

var file_asgt_type_retention_policy_proto_rawDesc = string([]byte{
	0x0a, 0x20, 0x61, 0x73, 0x67, 0x74, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x2f, 0x72, 0x65, 0x74, 0x65,
	0x6e, 0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x70, 0x6f, 0x6c, 0x69, 0x63, 0x79, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x12, 0x09, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x22, 0x2c, 0x0a,
	0x0f, 0x52, 0x65, 0x74, 0x65, 0x6e, 0x74, 0x69, 0x6f, 0x6e, 0x50, 0x6f, 0x6c, 0x69, 0x63, 0x79,
	0x12, 0x19, 0x0a, 0x08, 0x6d, 0x61, 0x78, 0x5f, 0x64, 0x61, 0x79, 0x73, 0x18, 0x01, 0x20, 0x01,
	0x28, 0x03, 0x52, 0x07, 0x6d, 0x61, 0x78, 0x44, 0x61, 0x79, 0x73, 0x42, 0xa7, 0x01, 0x0a, 0x12,
	0x61, 0x69, 0x2e, 0x76, 0x69, 0x73, 0x6d, 0x61, 0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x74, 0x79,
	0x70, 0x65, 0x42, 0x14, 0x52, 0x65, 0x74, 0x65, 0x6e, 0x74, 0x69, 0x6f, 0x6e, 0x50, 0x6f, 0x6c,
	0x69, 0x63, 0x79, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x36, 0x67, 0x69, 0x74, 0x68,
	0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x65, 0x2d, 0x63, 0x6f, 0x6e, 0x6f, 0x6d, 0x69, 0x63,
	0x2f, 0x76, 0x6d, 0x6c, 0x61, 0x70, 0x69, 0x73, 0x2f, 0x67, 0x65, 0x6e, 0x2f, 0x67, 0x6f, 0x2f,
	0x61, 0x73, 0x67, 0x74, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x3b, 0x61, 0x73, 0x67, 0x74, 0x74, 0x79,
	0x70, 0x65, 0xa2, 0x02, 0x03, 0x41, 0x54, 0x58, 0xaa, 0x02, 0x09, 0x41, 0x73, 0x67, 0x74, 0x2e,
	0x54, 0x79, 0x70, 0x65, 0xca, 0x02, 0x09, 0x41, 0x73, 0x67, 0x74, 0x5c, 0x54, 0x79, 0x70, 0x65,
	0xe2, 0x02, 0x15, 0x41, 0x73, 0x67, 0x74, 0x5c, 0x54, 0x79, 0x70, 0x65, 0x5c, 0x47, 0x50, 0x42,
	0x4d, 0x65, 0x74, 0x61, 0x64, 0x61, 0x74, 0x61, 0xea, 0x02, 0x0a, 0x41, 0x73, 0x67, 0x74, 0x3a,
	0x3a, 0x54, 0x79, 0x70, 0x65, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
})

var (
	file_asgt_type_retention_policy_proto_rawDescOnce sync.Once
	file_asgt_type_retention_policy_proto_rawDescData []byte
)

func file_asgt_type_retention_policy_proto_rawDescGZIP() []byte {
	file_asgt_type_retention_policy_proto_rawDescOnce.Do(func() {
		file_asgt_type_retention_policy_proto_rawDescData = protoimpl.X.CompressGZIP(unsafe.Slice(unsafe.StringData(file_asgt_type_retention_policy_proto_rawDesc), len(file_asgt_type_retention_policy_proto_rawDesc)))
	})
	return file_asgt_type_retention_policy_proto_rawDescData
}

var file_asgt_type_retention_policy_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_asgt_type_retention_policy_proto_goTypes = []any{
	(*RetentionPolicy)(nil), // 0: asgt.type.RetentionPolicy
}
var file_asgt_type_retention_policy_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_asgt_type_retention_policy_proto_init() }
func file_asgt_type_retention_policy_proto_init() {
	if File_asgt_type_retention_policy_proto != nil {
		return
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: unsafe.Slice(unsafe.StringData(file_asgt_type_retention_policy_proto_rawDesc), len(file_asgt_type_retention_policy_proto_rawDesc)),
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_asgt_type_retention_policy_proto_goTypes,
		DependencyIndexes: file_asgt_type_retention_policy_proto_depIdxs,
		MessageInfos:      file_asgt_type_retention_policy_proto_msgTypes,
	}.Build()
	File_asgt_type_retention_policy_proto = out.File
	file_asgt_type_retention_policy_proto_goTypes = nil
	file_asgt_type_retention_policy_proto_depIdxs = nil
}
