// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.31.0
// 	protoc        (unknown)
// source: asgt/type/dataset_statistics.proto

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

type DatasetStatistics struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	LexicalDiversitySplitOnSpace    float32 `protobuf:"fixed32,2,opt,name=lexical_diversity_split_on_space,json=lexicalDiversitySplitOnSpace,proto3" json:"lexical_diversity_split_on_space,omitempty"`          // lexical diversity of the dataset split on space
	LexicalDiversitySplitOnSpecial  float32 `protobuf:"fixed32,3,opt,name=lexical_diversity_split_on_special,json=lexicalDiversitySplitOnSpecial,proto3" json:"lexical_diversity_split_on_special,omitempty"`    // lexical diversity of the dataset split on special characters
	PercentEmptyStrings             float32 `protobuf:"fixed32,4,opt,name=percent_empty_strings,json=percentEmptyStrings,proto3" json:"percent_empty_strings,omitempty"`                                         // percentage of empty strings in the dataset
	PercentPureNumbersRemoveSpaces  float32 `protobuf:"fixed32,5,opt,name=percent_pure_numbers_remove_spaces,json=percentPureNumbersRemoveSpaces,proto3" json:"percent_pure_numbers_remove_spaces,omitempty"`    // percentage of pure numbers in the dataset after removing spaces
	PercentPureNumbersRemoveSpecial float32 `protobuf:"fixed32,6,opt,name=percent_pure_numbers_remove_special,json=percentPureNumbersRemoveSpecial,proto3" json:"percent_pure_numbers_remove_special,omitempty"` // percentage of pure numbers in the dataset after removing spaces and special characters
	PercentSpecialCharacters        float32 `protobuf:"fixed32,7,opt,name=percent_special_characters,json=percentSpecialCharacters,proto3" json:"percent_special_characters,omitempty"`                          // percentage of special characters in the dataset
	PercentDigits                   float32 `protobuf:"fixed32,8,opt,name=percent_digits,json=percentDigits,proto3" json:"percent_digits,omitempty"`                                                             // percentage of digits in the dataset
	PercentLetters                  float32 `protobuf:"fixed32,9,opt,name=percent_letters,json=percentLetters,proto3" json:"percent_letters,omitempty"`                                                          // percentage of letters in the dataset
	PercentDuplicatesInDataset      float32 `protobuf:"fixed32,10,opt,name=percent_duplicates_in_dataset,json=percentDuplicatesInDataset,proto3" json:"percent_duplicates_in_dataset,omitempty"`                 // percentage of duplicates in the dataset
}

func (x *DatasetStatistics) Reset() {
	*x = DatasetStatistics{}
	if protoimpl.UnsafeEnabled {
		mi := &file_asgt_type_dataset_statistics_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *DatasetStatistics) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DatasetStatistics) ProtoMessage() {}

func (x *DatasetStatistics) ProtoReflect() protoreflect.Message {
	mi := &file_asgt_type_dataset_statistics_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DatasetStatistics.ProtoReflect.Descriptor instead.
func (*DatasetStatistics) Descriptor() ([]byte, []int) {
	return file_asgt_type_dataset_statistics_proto_rawDescGZIP(), []int{0}
}

func (x *DatasetStatistics) GetLexicalDiversitySplitOnSpace() float32 {
	if x != nil {
		return x.LexicalDiversitySplitOnSpace
	}
	return 0
}

func (x *DatasetStatistics) GetLexicalDiversitySplitOnSpecial() float32 {
	if x != nil {
		return x.LexicalDiversitySplitOnSpecial
	}
	return 0
}

func (x *DatasetStatistics) GetPercentEmptyStrings() float32 {
	if x != nil {
		return x.PercentEmptyStrings
	}
	return 0
}

func (x *DatasetStatistics) GetPercentPureNumbersRemoveSpaces() float32 {
	if x != nil {
		return x.PercentPureNumbersRemoveSpaces
	}
	return 0
}

func (x *DatasetStatistics) GetPercentPureNumbersRemoveSpecial() float32 {
	if x != nil {
		return x.PercentPureNumbersRemoveSpecial
	}
	return 0
}

func (x *DatasetStatistics) GetPercentSpecialCharacters() float32 {
	if x != nil {
		return x.PercentSpecialCharacters
	}
	return 0
}

func (x *DatasetStatistics) GetPercentDigits() float32 {
	if x != nil {
		return x.PercentDigits
	}
	return 0
}

func (x *DatasetStatistics) GetPercentLetters() float32 {
	if x != nil {
		return x.PercentLetters
	}
	return 0
}

func (x *DatasetStatistics) GetPercentDuplicatesInDataset() float32 {
	if x != nil {
		return x.PercentDuplicatesInDataset
	}
	return 0
}

var File_asgt_type_dataset_statistics_proto protoreflect.FileDescriptor

var file_asgt_type_dataset_statistics_proto_rawDesc = []byte{
	0x0a, 0x22, 0x61, 0x73, 0x67, 0x74, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x2f, 0x64, 0x61, 0x74, 0x61,
	0x73, 0x65, 0x74, 0x5f, 0x73, 0x74, 0x61, 0x74, 0x69, 0x73, 0x74, 0x69, 0x63, 0x73, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x12, 0x09, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x22,
	0xcc, 0x04, 0x0a, 0x11, 0x44, 0x61, 0x74, 0x61, 0x73, 0x65, 0x74, 0x53, 0x74, 0x61, 0x74, 0x69,
	0x73, 0x74, 0x69, 0x63, 0x73, 0x12, 0x46, 0x0a, 0x20, 0x6c, 0x65, 0x78, 0x69, 0x63, 0x61, 0x6c,
	0x5f, 0x64, 0x69, 0x76, 0x65, 0x72, 0x73, 0x69, 0x74, 0x79, 0x5f, 0x73, 0x70, 0x6c, 0x69, 0x74,
	0x5f, 0x6f, 0x6e, 0x5f, 0x73, 0x70, 0x61, 0x63, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x02, 0x52,
	0x1c, 0x6c, 0x65, 0x78, 0x69, 0x63, 0x61, 0x6c, 0x44, 0x69, 0x76, 0x65, 0x72, 0x73, 0x69, 0x74,
	0x79, 0x53, 0x70, 0x6c, 0x69, 0x74, 0x4f, 0x6e, 0x53, 0x70, 0x61, 0x63, 0x65, 0x12, 0x4a, 0x0a,
	0x22, 0x6c, 0x65, 0x78, 0x69, 0x63, 0x61, 0x6c, 0x5f, 0x64, 0x69, 0x76, 0x65, 0x72, 0x73, 0x69,
	0x74, 0x79, 0x5f, 0x73, 0x70, 0x6c, 0x69, 0x74, 0x5f, 0x6f, 0x6e, 0x5f, 0x73, 0x70, 0x65, 0x63,
	0x69, 0x61, 0x6c, 0x18, 0x03, 0x20, 0x01, 0x28, 0x02, 0x52, 0x1e, 0x6c, 0x65, 0x78, 0x69, 0x63,
	0x61, 0x6c, 0x44, 0x69, 0x76, 0x65, 0x72, 0x73, 0x69, 0x74, 0x79, 0x53, 0x70, 0x6c, 0x69, 0x74,
	0x4f, 0x6e, 0x53, 0x70, 0x65, 0x63, 0x69, 0x61, 0x6c, 0x12, 0x32, 0x0a, 0x15, 0x70, 0x65, 0x72,
	0x63, 0x65, 0x6e, 0x74, 0x5f, 0x65, 0x6d, 0x70, 0x74, 0x79, 0x5f, 0x73, 0x74, 0x72, 0x69, 0x6e,
	0x67, 0x73, 0x18, 0x04, 0x20, 0x01, 0x28, 0x02, 0x52, 0x13, 0x70, 0x65, 0x72, 0x63, 0x65, 0x6e,
	0x74, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72, 0x69, 0x6e, 0x67, 0x73, 0x12, 0x4a, 0x0a,
	0x22, 0x70, 0x65, 0x72, 0x63, 0x65, 0x6e, 0x74, 0x5f, 0x70, 0x75, 0x72, 0x65, 0x5f, 0x6e, 0x75,
	0x6d, 0x62, 0x65, 0x72, 0x73, 0x5f, 0x72, 0x65, 0x6d, 0x6f, 0x76, 0x65, 0x5f, 0x73, 0x70, 0x61,
	0x63, 0x65, 0x73, 0x18, 0x05, 0x20, 0x01, 0x28, 0x02, 0x52, 0x1e, 0x70, 0x65, 0x72, 0x63, 0x65,
	0x6e, 0x74, 0x50, 0x75, 0x72, 0x65, 0x4e, 0x75, 0x6d, 0x62, 0x65, 0x72, 0x73, 0x52, 0x65, 0x6d,
	0x6f, 0x76, 0x65, 0x53, 0x70, 0x61, 0x63, 0x65, 0x73, 0x12, 0x4c, 0x0a, 0x23, 0x70, 0x65, 0x72,
	0x63, 0x65, 0x6e, 0x74, 0x5f, 0x70, 0x75, 0x72, 0x65, 0x5f, 0x6e, 0x75, 0x6d, 0x62, 0x65, 0x72,
	0x73, 0x5f, 0x72, 0x65, 0x6d, 0x6f, 0x76, 0x65, 0x5f, 0x73, 0x70, 0x65, 0x63, 0x69, 0x61, 0x6c,
	0x18, 0x06, 0x20, 0x01, 0x28, 0x02, 0x52, 0x1f, 0x70, 0x65, 0x72, 0x63, 0x65, 0x6e, 0x74, 0x50,
	0x75, 0x72, 0x65, 0x4e, 0x75, 0x6d, 0x62, 0x65, 0x72, 0x73, 0x52, 0x65, 0x6d, 0x6f, 0x76, 0x65,
	0x53, 0x70, 0x65, 0x63, 0x69, 0x61, 0x6c, 0x12, 0x3c, 0x0a, 0x1a, 0x70, 0x65, 0x72, 0x63, 0x65,
	0x6e, 0x74, 0x5f, 0x73, 0x70, 0x65, 0x63, 0x69, 0x61, 0x6c, 0x5f, 0x63, 0x68, 0x61, 0x72, 0x61,
	0x63, 0x74, 0x65, 0x72, 0x73, 0x18, 0x07, 0x20, 0x01, 0x28, 0x02, 0x52, 0x18, 0x70, 0x65, 0x72,
	0x63, 0x65, 0x6e, 0x74, 0x53, 0x70, 0x65, 0x63, 0x69, 0x61, 0x6c, 0x43, 0x68, 0x61, 0x72, 0x61,
	0x63, 0x74, 0x65, 0x72, 0x73, 0x12, 0x25, 0x0a, 0x0e, 0x70, 0x65, 0x72, 0x63, 0x65, 0x6e, 0x74,
	0x5f, 0x64, 0x69, 0x67, 0x69, 0x74, 0x73, 0x18, 0x08, 0x20, 0x01, 0x28, 0x02, 0x52, 0x0d, 0x70,
	0x65, 0x72, 0x63, 0x65, 0x6e, 0x74, 0x44, 0x69, 0x67, 0x69, 0x74, 0x73, 0x12, 0x27, 0x0a, 0x0f,
	0x70, 0x65, 0x72, 0x63, 0x65, 0x6e, 0x74, 0x5f, 0x6c, 0x65, 0x74, 0x74, 0x65, 0x72, 0x73, 0x18,
	0x09, 0x20, 0x01, 0x28, 0x02, 0x52, 0x0e, 0x70, 0x65, 0x72, 0x63, 0x65, 0x6e, 0x74, 0x4c, 0x65,
	0x74, 0x74, 0x65, 0x72, 0x73, 0x12, 0x41, 0x0a, 0x1d, 0x70, 0x65, 0x72, 0x63, 0x65, 0x6e, 0x74,
	0x5f, 0x64, 0x75, 0x70, 0x6c, 0x69, 0x63, 0x61, 0x74, 0x65, 0x73, 0x5f, 0x69, 0x6e, 0x5f, 0x64,
	0x61, 0x74, 0x61, 0x73, 0x65, 0x74, 0x18, 0x0a, 0x20, 0x01, 0x28, 0x02, 0x52, 0x1a, 0x70, 0x65,
	0x72, 0x63, 0x65, 0x6e, 0x74, 0x44, 0x75, 0x70, 0x6c, 0x69, 0x63, 0x61, 0x74, 0x65, 0x73, 0x49,
	0x6e, 0x44, 0x61, 0x74, 0x61, 0x73, 0x65, 0x74, 0x4a, 0x04, 0x08, 0x01, 0x10, 0x02, 0x42, 0xa9,
	0x01, 0x0a, 0x12, 0x61, 0x69, 0x2e, 0x76, 0x69, 0x73, 0x6d, 0x61, 0x2e, 0x61, 0x73, 0x67, 0x74,
	0x2e, 0x74, 0x79, 0x70, 0x65, 0x42, 0x16, 0x44, 0x61, 0x74, 0x61, 0x73, 0x65, 0x74, 0x53, 0x74,
	0x61, 0x74, 0x69, 0x73, 0x74, 0x69, 0x63, 0x73, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a,
	0x36, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x65, 0x2d, 0x63, 0x6f,
	0x6e, 0x6f, 0x6d, 0x69, 0x63, 0x2f, 0x76, 0x6d, 0x6c, 0x61, 0x70, 0x69, 0x73, 0x2f, 0x67, 0x65,
	0x6e, 0x2f, 0x67, 0x6f, 0x2f, 0x61, 0x73, 0x67, 0x74, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x3b, 0x61,
	0x73, 0x67, 0x74, 0x74, 0x79, 0x70, 0x65, 0xa2, 0x02, 0x03, 0x41, 0x54, 0x58, 0xaa, 0x02, 0x09,
	0x41, 0x73, 0x67, 0x74, 0x2e, 0x54, 0x79, 0x70, 0x65, 0xca, 0x02, 0x09, 0x41, 0x73, 0x67, 0x74,
	0x5c, 0x54, 0x79, 0x70, 0x65, 0xe2, 0x02, 0x15, 0x41, 0x73, 0x67, 0x74, 0x5c, 0x54, 0x79, 0x70,
	0x65, 0x5c, 0x47, 0x50, 0x42, 0x4d, 0x65, 0x74, 0x61, 0x64, 0x61, 0x74, 0x61, 0xea, 0x02, 0x0a,
	0x41, 0x73, 0x67, 0x74, 0x3a, 0x3a, 0x54, 0x79, 0x70, 0x65, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x33,
}

var (
	file_asgt_type_dataset_statistics_proto_rawDescOnce sync.Once
	file_asgt_type_dataset_statistics_proto_rawDescData = file_asgt_type_dataset_statistics_proto_rawDesc
)

func file_asgt_type_dataset_statistics_proto_rawDescGZIP() []byte {
	file_asgt_type_dataset_statistics_proto_rawDescOnce.Do(func() {
		file_asgt_type_dataset_statistics_proto_rawDescData = protoimpl.X.CompressGZIP(file_asgt_type_dataset_statistics_proto_rawDescData)
	})
	return file_asgt_type_dataset_statistics_proto_rawDescData
}

var file_asgt_type_dataset_statistics_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_asgt_type_dataset_statistics_proto_goTypes = []interface{}{
	(*DatasetStatistics)(nil), // 0: asgt.type.DatasetStatistics
}
var file_asgt_type_dataset_statistics_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_asgt_type_dataset_statistics_proto_init() }
func file_asgt_type_dataset_statistics_proto_init() {
	if File_asgt_type_dataset_statistics_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_asgt_type_dataset_statistics_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*DatasetStatistics); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_asgt_type_dataset_statistics_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_asgt_type_dataset_statistics_proto_goTypes,
		DependencyIndexes: file_asgt_type_dataset_statistics_proto_depIdxs,
		MessageInfos:      file_asgt_type_dataset_statistics_proto_msgTypes,
	}.Build()
	File_asgt_type_dataset_statistics_proto = out.File
	file_asgt_type_dataset_statistics_proto_rawDesc = nil
	file_asgt_type_dataset_statistics_proto_goTypes = nil
	file_asgt_type_dataset_statistics_proto_depIdxs = nil
}
