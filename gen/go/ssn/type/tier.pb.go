// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.12.4
// source: ssn/type/tier.proto

package ssntype

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

type Tier int32

const (
	// Use the default tier. Defaults to the STANDARD option or account default, if set.
	Tier_DEFAULT  Tier = 0
	Tier_STANDARD Tier = 1
	Tier_PREMIUM  Tier = 2
)

// Enum value maps for Tier.
var (
	Tier_name = map[int32]string{
		0: "DEFAULT",
		1: "STANDARD",
		2: "PREMIUM",
	}
	Tier_value = map[string]int32{
		"DEFAULT":  0,
		"STANDARD": 1,
		"PREMIUM":  2,
	}
)

func (x Tier) Enum() *Tier {
	p := new(Tier)
	*p = x
	return p
}

func (x Tier) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (Tier) Descriptor() protoreflect.EnumDescriptor {
	return file_ssn_type_tier_proto_enumTypes[0].Descriptor()
}

func (Tier) Type() protoreflect.EnumType {
	return &file_ssn_type_tier_proto_enumTypes[0]
}

func (x Tier) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use Tier.Descriptor instead.
func (Tier) EnumDescriptor() ([]byte, []int) {
	return file_ssn_type_tier_proto_rawDescGZIP(), []int{0}
}

var File_ssn_type_tier_proto protoreflect.FileDescriptor

var file_ssn_type_tier_proto_rawDesc = []byte{
	0x0a, 0x13, 0x73, 0x73, 0x6e, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x2f, 0x74, 0x69, 0x65, 0x72, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x08, 0x73, 0x73, 0x6e, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x2a,
	0x2e, 0x0a, 0x04, 0x54, 0x69, 0x65, 0x72, 0x12, 0x0b, 0x0a, 0x07, 0x44, 0x45, 0x46, 0x41, 0x55,
	0x4c, 0x54, 0x10, 0x00, 0x12, 0x0c, 0x0a, 0x08, 0x53, 0x54, 0x41, 0x4e, 0x44, 0x41, 0x52, 0x44,
	0x10, 0x01, 0x12, 0x0b, 0x0a, 0x07, 0x50, 0x52, 0x45, 0x4d, 0x49, 0x55, 0x4d, 0x10, 0x02, 0x42,
	0x36, 0x5a, 0x34, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x65, 0x2d,
	0x63, 0x6f, 0x6e, 0x6f, 0x6d, 0x69, 0x63, 0x2f, 0x76, 0x6d, 0x6c, 0x61, 0x70, 0x69, 0x73, 0x2f,
	0x67, 0x65, 0x6e, 0x2f, 0x67, 0x6f, 0x2f, 0x73, 0x73, 0x6e, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x3b,
	0x73, 0x73, 0x6e, 0x74, 0x79, 0x70, 0x65, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_ssn_type_tier_proto_rawDescOnce sync.Once
	file_ssn_type_tier_proto_rawDescData = file_ssn_type_tier_proto_rawDesc
)

func file_ssn_type_tier_proto_rawDescGZIP() []byte {
	file_ssn_type_tier_proto_rawDescOnce.Do(func() {
		file_ssn_type_tier_proto_rawDescData = protoimpl.X.CompressGZIP(file_ssn_type_tier_proto_rawDescData)
	})
	return file_ssn_type_tier_proto_rawDescData
}

var file_ssn_type_tier_proto_enumTypes = make([]protoimpl.EnumInfo, 1)
var file_ssn_type_tier_proto_goTypes = []interface{}{
	(Tier)(0), // 0: ssn.type.Tier
}
var file_ssn_type_tier_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_ssn_type_tier_proto_init() }
func file_ssn_type_tier_proto_init() {
	if File_ssn_type_tier_proto != nil {
		return
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_ssn_type_tier_proto_rawDesc,
			NumEnums:      1,
			NumMessages:   0,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_ssn_type_tier_proto_goTypes,
		DependencyIndexes: file_ssn_type_tier_proto_depIdxs,
		EnumInfos:         file_ssn_type_tier_proto_enumTypes,
	}.Build()
	File_ssn_type_tier_proto = out.File
	file_ssn_type_tier_proto_rawDesc = nil
	file_ssn_type_tier_proto_goTypes = nil
	file_ssn_type_tier_proto_depIdxs = nil
}
