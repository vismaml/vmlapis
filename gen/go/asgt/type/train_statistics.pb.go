// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.33.0
// 	protoc        (unknown)
// source: asgt/type/train_statistics.proto

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

type FeatureStat_Type int32

const (
	FeatureStat_INT    FeatureStat_Type = 0
	FeatureStat_FLOAT  FeatureStat_Type = 1
	FeatureStat_STRING FeatureStat_Type = 2
	FeatureStat_BYTES  FeatureStat_Type = 3
	FeatureStat_STRUCT FeatureStat_Type = 4
)

// Enum value maps for FeatureStat_Type.
var (
	FeatureStat_Type_name = map[int32]string{
		0: "INT",
		1: "FLOAT",
		2: "STRING",
		3: "BYTES",
		4: "STRUCT",
	}
	FeatureStat_Type_value = map[string]int32{
		"INT":    0,
		"FLOAT":  1,
		"STRING": 2,
		"BYTES":  3,
		"STRUCT": 4,
	}
)

func (x FeatureStat_Type) Enum() *FeatureStat_Type {
	p := new(FeatureStat_Type)
	*p = x
	return p
}

func (x FeatureStat_Type) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (FeatureStat_Type) Descriptor() protoreflect.EnumDescriptor {
	return file_asgt_type_train_statistics_proto_enumTypes[0].Descriptor()
}

func (FeatureStat_Type) Type() protoreflect.EnumType {
	return &file_asgt_type_train_statistics_proto_enumTypes[0]
}

func (x FeatureStat_Type) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use FeatureStat_Type.Descriptor instead.
func (FeatureStat_Type) EnumDescriptor() ([]byte, []int) {
	return file_asgt_type_train_statistics_proto_rawDescGZIP(), []int{2, 0}
}

type TargetStat struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	ClassName string `protobuf:"bytes,1,opt,name=class_name,json=className,proto3" json:"class_name,omitempty"`
	// name of the target class in a target (classification task)
	RelativeDatasetProportion float32 `protobuf:"fixed32,2,opt,name=relative_dataset_proportion,json=relativeDatasetProportion,proto3" json:"relative_dataset_proportion,omitempty"`
	// percentage of samples belonging to a single class
	AbsoluteDatasetProportion int32 `protobuf:"varint,3,opt,name=absolute_dataset_proportion,json=absoluteDatasetProportion,proto3" json:"absolute_dataset_proportion,omitempty"` // number of samples belonging to a single class
}

func (x *TargetStat) Reset() {
	*x = TargetStat{}
	if protoimpl.UnsafeEnabled {
		mi := &file_asgt_type_train_statistics_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *TargetStat) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*TargetStat) ProtoMessage() {}

func (x *TargetStat) ProtoReflect() protoreflect.Message {
	mi := &file_asgt_type_train_statistics_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use TargetStat.ProtoReflect.Descriptor instead.
func (*TargetStat) Descriptor() ([]byte, []int) {
	return file_asgt_type_train_statistics_proto_rawDescGZIP(), []int{0}
}

func (x *TargetStat) GetClassName() string {
	if x != nil {
		return x.ClassName
	}
	return ""
}

func (x *TargetStat) GetRelativeDatasetProportion() float32 {
	if x != nil {
		return x.RelativeDatasetProportion
	}
	return 0
}

func (x *TargetStat) GetAbsoluteDatasetProportion() int32 {
	if x != nil {
		return x.AbsoluteDatasetProportion
	}
	return 0
}

type TargetStats struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	TargetStats []*TargetStat `protobuf:"bytes,1,rep,name=target_stats,json=targetStats,proto3" json:"target_stats,omitempty"` // statistics of classes in a single target (classification task)
}

func (x *TargetStats) Reset() {
	*x = TargetStats{}
	if protoimpl.UnsafeEnabled {
		mi := &file_asgt_type_train_statistics_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *TargetStats) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*TargetStats) ProtoMessage() {}

func (x *TargetStats) ProtoReflect() protoreflect.Message {
	mi := &file_asgt_type_train_statistics_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use TargetStats.ProtoReflect.Descriptor instead.
func (*TargetStats) Descriptor() ([]byte, []int) {
	return file_asgt_type_train_statistics_proto_rawDescGZIP(), []int{1}
}

func (x *TargetStats) GetTargetStats() []*TargetStat {
	if x != nil {
		return x.TargetStats
	}
	return nil
}

type FeatureStat struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	FeatureName string `protobuf:"bytes,1,opt,name=feature_name,json=featureName,proto3" json:"feature_name,omitempty"`
	// name of the feature
	FeatureType FeatureStat_Type `protobuf:"varint,2,opt,name=feature_type,json=featureType,proto3,enum=asgt.type.FeatureStat_Type" json:"feature_type,omitempty"`
	// type of the feature
	InformationGain float32 `protobuf:"fixed32,3,opt,name=information_gain,json=informationGain,proto3" json:"information_gain,omitempty"` // information gain of a feature regarding to target (classification task)
}

func (x *FeatureStat) Reset() {
	*x = FeatureStat{}
	if protoimpl.UnsafeEnabled {
		mi := &file_asgt_type_train_statistics_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *FeatureStat) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*FeatureStat) ProtoMessage() {}

func (x *FeatureStat) ProtoReflect() protoreflect.Message {
	mi := &file_asgt_type_train_statistics_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use FeatureStat.ProtoReflect.Descriptor instead.
func (*FeatureStat) Descriptor() ([]byte, []int) {
	return file_asgt_type_train_statistics_proto_rawDescGZIP(), []int{2}
}

func (x *FeatureStat) GetFeatureName() string {
	if x != nil {
		return x.FeatureName
	}
	return ""
}

func (x *FeatureStat) GetFeatureType() FeatureStat_Type {
	if x != nil {
		return x.FeatureType
	}
	return FeatureStat_INT
}

func (x *FeatureStat) GetInformationGain() float32 {
	if x != nil {
		return x.InformationGain
	}
	return 0
}

type FeatureStats struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	FeatureStats []*FeatureStat `protobuf:"bytes,1,rep,name=feature_stats,json=featureStats,proto3" json:"feature_stats,omitempty"` // feature statistics for each feature
}

func (x *FeatureStats) Reset() {
	*x = FeatureStats{}
	if protoimpl.UnsafeEnabled {
		mi := &file_asgt_type_train_statistics_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *FeatureStats) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*FeatureStats) ProtoMessage() {}

func (x *FeatureStats) ProtoReflect() protoreflect.Message {
	mi := &file_asgt_type_train_statistics_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use FeatureStats.ProtoReflect.Descriptor instead.
func (*FeatureStats) Descriptor() ([]byte, []int) {
	return file_asgt_type_train_statistics_proto_rawDescGZIP(), []int{3}
}

func (x *FeatureStats) GetFeatureStats() []*FeatureStat {
	if x != nil {
		return x.FeatureStats
	}
	return nil
}

type TrainStatistics struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	TargetStatsByTarget  map[string]*TargetStats  `protobuf:"bytes,1,rep,name=target_stats_by_target,json=targetStatsByTarget,proto3" json:"target_stats_by_target,omitempty" protobuf_key:"bytes,1,opt,name=key,proto3" protobuf_val:"bytes,2,opt,name=value,proto3"`    // target statistics for each target (classification task)
	FeatureStatsByTarget map[string]*FeatureStats `protobuf:"bytes,2,rep,name=feature_stats_by_target,json=featureStatsByTarget,proto3" json:"feature_stats_by_target,omitempty" protobuf_key:"bytes,1,opt,name=key,proto3" protobuf_val:"bytes,2,opt,name=value,proto3"` // feature statistics for each target (classification task)
	SimilarityIndex      float32                  `protobuf:"fixed32,3,opt,name=similarity_index,json=similarityIndex,proto3" json:"similarity_index,omitempty"`                                                                                                          // measure of train/test similarity
}

func (x *TrainStatistics) Reset() {
	*x = TrainStatistics{}
	if protoimpl.UnsafeEnabled {
		mi := &file_asgt_type_train_statistics_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *TrainStatistics) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*TrainStatistics) ProtoMessage() {}

func (x *TrainStatistics) ProtoReflect() protoreflect.Message {
	mi := &file_asgt_type_train_statistics_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use TrainStatistics.ProtoReflect.Descriptor instead.
func (*TrainStatistics) Descriptor() ([]byte, []int) {
	return file_asgt_type_train_statistics_proto_rawDescGZIP(), []int{4}
}

func (x *TrainStatistics) GetTargetStatsByTarget() map[string]*TargetStats {
	if x != nil {
		return x.TargetStatsByTarget
	}
	return nil
}

func (x *TrainStatistics) GetFeatureStatsByTarget() map[string]*FeatureStats {
	if x != nil {
		return x.FeatureStatsByTarget
	}
	return nil
}

func (x *TrainStatistics) GetSimilarityIndex() float32 {
	if x != nil {
		return x.SimilarityIndex
	}
	return 0
}

var File_asgt_type_train_statistics_proto protoreflect.FileDescriptor

var file_asgt_type_train_statistics_proto_rawDesc = []byte{
	0x0a, 0x20, 0x61, 0x73, 0x67, 0x74, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x2f, 0x74, 0x72, 0x61, 0x69,
	0x6e, 0x5f, 0x73, 0x74, 0x61, 0x74, 0x69, 0x73, 0x74, 0x69, 0x63, 0x73, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x12, 0x09, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x22, 0xab, 0x01,
	0x0a, 0x0a, 0x54, 0x61, 0x72, 0x67, 0x65, 0x74, 0x53, 0x74, 0x61, 0x74, 0x12, 0x1d, 0x0a, 0x0a,
	0x63, 0x6c, 0x61, 0x73, 0x73, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09,
	0x52, 0x09, 0x63, 0x6c, 0x61, 0x73, 0x73, 0x4e, 0x61, 0x6d, 0x65, 0x12, 0x3e, 0x0a, 0x1b, 0x72,
	0x65, 0x6c, 0x61, 0x74, 0x69, 0x76, 0x65, 0x5f, 0x64, 0x61, 0x74, 0x61, 0x73, 0x65, 0x74, 0x5f,
	0x70, 0x72, 0x6f, 0x70, 0x6f, 0x72, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x02, 0x20, 0x01, 0x28, 0x02,
	0x52, 0x19, 0x72, 0x65, 0x6c, 0x61, 0x74, 0x69, 0x76, 0x65, 0x44, 0x61, 0x74, 0x61, 0x73, 0x65,
	0x74, 0x50, 0x72, 0x6f, 0x70, 0x6f, 0x72, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x3e, 0x0a, 0x1b, 0x61,
	0x62, 0x73, 0x6f, 0x6c, 0x75, 0x74, 0x65, 0x5f, 0x64, 0x61, 0x74, 0x61, 0x73, 0x65, 0x74, 0x5f,
	0x70, 0x72, 0x6f, 0x70, 0x6f, 0x72, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x03, 0x20, 0x01, 0x28, 0x05,
	0x52, 0x19, 0x61, 0x62, 0x73, 0x6f, 0x6c, 0x75, 0x74, 0x65, 0x44, 0x61, 0x74, 0x61, 0x73, 0x65,
	0x74, 0x50, 0x72, 0x6f, 0x70, 0x6f, 0x72, 0x74, 0x69, 0x6f, 0x6e, 0x22, 0x47, 0x0a, 0x0b, 0x54,
	0x61, 0x72, 0x67, 0x65, 0x74, 0x53, 0x74, 0x61, 0x74, 0x73, 0x12, 0x38, 0x0a, 0x0c, 0x74, 0x61,
	0x72, 0x67, 0x65, 0x74, 0x5f, 0x73, 0x74, 0x61, 0x74, 0x73, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b,
	0x32, 0x15, 0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x54, 0x61, 0x72,
	0x67, 0x65, 0x74, 0x53, 0x74, 0x61, 0x74, 0x52, 0x0b, 0x74, 0x61, 0x72, 0x67, 0x65, 0x74, 0x53,
	0x74, 0x61, 0x74, 0x73, 0x22, 0xda, 0x01, 0x0a, 0x0b, 0x46, 0x65, 0x61, 0x74, 0x75, 0x72, 0x65,
	0x53, 0x74, 0x61, 0x74, 0x12, 0x21, 0x0a, 0x0c, 0x66, 0x65, 0x61, 0x74, 0x75, 0x72, 0x65, 0x5f,
	0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0b, 0x66, 0x65, 0x61, 0x74,
	0x75, 0x72, 0x65, 0x4e, 0x61, 0x6d, 0x65, 0x12, 0x3e, 0x0a, 0x0c, 0x66, 0x65, 0x61, 0x74, 0x75,
	0x72, 0x65, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x1b, 0x2e,
	0x61, 0x73, 0x67, 0x74, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x46, 0x65, 0x61, 0x74, 0x75, 0x72,
	0x65, 0x53, 0x74, 0x61, 0x74, 0x2e, 0x54, 0x79, 0x70, 0x65, 0x52, 0x0b, 0x66, 0x65, 0x61, 0x74,
	0x75, 0x72, 0x65, 0x54, 0x79, 0x70, 0x65, 0x12, 0x29, 0x0a, 0x10, 0x69, 0x6e, 0x66, 0x6f, 0x72,
	0x6d, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x67, 0x61, 0x69, 0x6e, 0x18, 0x03, 0x20, 0x01, 0x28,
	0x02, 0x52, 0x0f, 0x69, 0x6e, 0x66, 0x6f, 0x72, 0x6d, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x47, 0x61,
	0x69, 0x6e, 0x22, 0x3d, 0x0a, 0x04, 0x54, 0x79, 0x70, 0x65, 0x12, 0x07, 0x0a, 0x03, 0x49, 0x4e,
	0x54, 0x10, 0x00, 0x12, 0x09, 0x0a, 0x05, 0x46, 0x4c, 0x4f, 0x41, 0x54, 0x10, 0x01, 0x12, 0x0a,
	0x0a, 0x06, 0x53, 0x54, 0x52, 0x49, 0x4e, 0x47, 0x10, 0x02, 0x12, 0x09, 0x0a, 0x05, 0x42, 0x59,
	0x54, 0x45, 0x53, 0x10, 0x03, 0x12, 0x0a, 0x0a, 0x06, 0x53, 0x54, 0x52, 0x55, 0x43, 0x54, 0x10,
	0x04, 0x22, 0x4b, 0x0a, 0x0c, 0x46, 0x65, 0x61, 0x74, 0x75, 0x72, 0x65, 0x53, 0x74, 0x61, 0x74,
	0x73, 0x12, 0x3b, 0x0a, 0x0d, 0x66, 0x65, 0x61, 0x74, 0x75, 0x72, 0x65, 0x5f, 0x73, 0x74, 0x61,
	0x74, 0x73, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x16, 0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e,
	0x74, 0x79, 0x70, 0x65, 0x2e, 0x46, 0x65, 0x61, 0x74, 0x75, 0x72, 0x65, 0x53, 0x74, 0x61, 0x74,
	0x52, 0x0c, 0x66, 0x65, 0x61, 0x74, 0x75, 0x72, 0x65, 0x53, 0x74, 0x61, 0x74, 0x73, 0x22, 0xd5,
	0x03, 0x0a, 0x0f, 0x54, 0x72, 0x61, 0x69, 0x6e, 0x53, 0x74, 0x61, 0x74, 0x69, 0x73, 0x74, 0x69,
	0x63, 0x73, 0x12, 0x68, 0x0a, 0x16, 0x74, 0x61, 0x72, 0x67, 0x65, 0x74, 0x5f, 0x73, 0x74, 0x61,
	0x74, 0x73, 0x5f, 0x62, 0x79, 0x5f, 0x74, 0x61, 0x72, 0x67, 0x65, 0x74, 0x18, 0x01, 0x20, 0x03,
	0x28, 0x0b, 0x32, 0x33, 0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x54,
	0x72, 0x61, 0x69, 0x6e, 0x53, 0x74, 0x61, 0x74, 0x69, 0x73, 0x74, 0x69, 0x63, 0x73, 0x2e, 0x54,
	0x61, 0x72, 0x67, 0x65, 0x74, 0x53, 0x74, 0x61, 0x74, 0x73, 0x42, 0x79, 0x54, 0x61, 0x72, 0x67,
	0x65, 0x74, 0x45, 0x6e, 0x74, 0x72, 0x79, 0x52, 0x13, 0x74, 0x61, 0x72, 0x67, 0x65, 0x74, 0x53,
	0x74, 0x61, 0x74, 0x73, 0x42, 0x79, 0x54, 0x61, 0x72, 0x67, 0x65, 0x74, 0x12, 0x6b, 0x0a, 0x17,
	0x66, 0x65, 0x61, 0x74, 0x75, 0x72, 0x65, 0x5f, 0x73, 0x74, 0x61, 0x74, 0x73, 0x5f, 0x62, 0x79,
	0x5f, 0x74, 0x61, 0x72, 0x67, 0x65, 0x74, 0x18, 0x02, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x34, 0x2e,
	0x61, 0x73, 0x67, 0x74, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x54, 0x72, 0x61, 0x69, 0x6e, 0x53,
	0x74, 0x61, 0x74, 0x69, 0x73, 0x74, 0x69, 0x63, 0x73, 0x2e, 0x46, 0x65, 0x61, 0x74, 0x75, 0x72,
	0x65, 0x53, 0x74, 0x61, 0x74, 0x73, 0x42, 0x79, 0x54, 0x61, 0x72, 0x67, 0x65, 0x74, 0x45, 0x6e,
	0x74, 0x72, 0x79, 0x52, 0x14, 0x66, 0x65, 0x61, 0x74, 0x75, 0x72, 0x65, 0x53, 0x74, 0x61, 0x74,
	0x73, 0x42, 0x79, 0x54, 0x61, 0x72, 0x67, 0x65, 0x74, 0x12, 0x29, 0x0a, 0x10, 0x73, 0x69, 0x6d,
	0x69, 0x6c, 0x61, 0x72, 0x69, 0x74, 0x79, 0x5f, 0x69, 0x6e, 0x64, 0x65, 0x78, 0x18, 0x03, 0x20,
	0x01, 0x28, 0x02, 0x52, 0x0f, 0x73, 0x69, 0x6d, 0x69, 0x6c, 0x61, 0x72, 0x69, 0x74, 0x79, 0x49,
	0x6e, 0x64, 0x65, 0x78, 0x1a, 0x5e, 0x0a, 0x18, 0x54, 0x61, 0x72, 0x67, 0x65, 0x74, 0x53, 0x74,
	0x61, 0x74, 0x73, 0x42, 0x79, 0x54, 0x61, 0x72, 0x67, 0x65, 0x74, 0x45, 0x6e, 0x74, 0x72, 0x79,
	0x12, 0x10, 0x0a, 0x03, 0x6b, 0x65, 0x79, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x03, 0x6b,
	0x65, 0x79, 0x12, 0x2c, 0x0a, 0x05, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28,
	0x0b, 0x32, 0x16, 0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x54, 0x61,
	0x72, 0x67, 0x65, 0x74, 0x53, 0x74, 0x61, 0x74, 0x73, 0x52, 0x05, 0x76, 0x61, 0x6c, 0x75, 0x65,
	0x3a, 0x02, 0x38, 0x01, 0x1a, 0x60, 0x0a, 0x19, 0x46, 0x65, 0x61, 0x74, 0x75, 0x72, 0x65, 0x53,
	0x74, 0x61, 0x74, 0x73, 0x42, 0x79, 0x54, 0x61, 0x72, 0x67, 0x65, 0x74, 0x45, 0x6e, 0x74, 0x72,
	0x79, 0x12, 0x10, 0x0a, 0x03, 0x6b, 0x65, 0x79, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x03,
	0x6b, 0x65, 0x79, 0x12, 0x2d, 0x0a, 0x05, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x18, 0x02, 0x20, 0x01,
	0x28, 0x0b, 0x32, 0x17, 0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x46,
	0x65, 0x61, 0x74, 0x75, 0x72, 0x65, 0x53, 0x74, 0x61, 0x74, 0x73, 0x52, 0x05, 0x76, 0x61, 0x6c,
	0x75, 0x65, 0x3a, 0x02, 0x38, 0x01, 0x42, 0xa7, 0x01, 0x0a, 0x12, 0x61, 0x69, 0x2e, 0x76, 0x69,
	0x73, 0x6d, 0x61, 0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x42, 0x14, 0x54,
	0x72, 0x61, 0x69, 0x6e, 0x53, 0x74, 0x61, 0x74, 0x69, 0x73, 0x74, 0x69, 0x63, 0x73, 0x50, 0x72,
	0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x36, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f,
	0x6d, 0x2f, 0x65, 0x2d, 0x63, 0x6f, 0x6e, 0x6f, 0x6d, 0x69, 0x63, 0x2f, 0x76, 0x6d, 0x6c, 0x61,
	0x70, 0x69, 0x73, 0x2f, 0x67, 0x65, 0x6e, 0x2f, 0x67, 0x6f, 0x2f, 0x61, 0x73, 0x67, 0x74, 0x2f,
	0x74, 0x79, 0x70, 0x65, 0x3b, 0x61, 0x73, 0x67, 0x74, 0x74, 0x79, 0x70, 0x65, 0xa2, 0x02, 0x03,
	0x41, 0x54, 0x58, 0xaa, 0x02, 0x09, 0x41, 0x73, 0x67, 0x74, 0x2e, 0x54, 0x79, 0x70, 0x65, 0xca,
	0x02, 0x09, 0x41, 0x73, 0x67, 0x74, 0x5c, 0x54, 0x79, 0x70, 0x65, 0xe2, 0x02, 0x15, 0x41, 0x73,
	0x67, 0x74, 0x5c, 0x54, 0x79, 0x70, 0x65, 0x5c, 0x47, 0x50, 0x42, 0x4d, 0x65, 0x74, 0x61, 0x64,
	0x61, 0x74, 0x61, 0xea, 0x02, 0x0a, 0x41, 0x73, 0x67, 0x74, 0x3a, 0x3a, 0x54, 0x79, 0x70, 0x65,
	0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_asgt_type_train_statistics_proto_rawDescOnce sync.Once
	file_asgt_type_train_statistics_proto_rawDescData = file_asgt_type_train_statistics_proto_rawDesc
)

func file_asgt_type_train_statistics_proto_rawDescGZIP() []byte {
	file_asgt_type_train_statistics_proto_rawDescOnce.Do(func() {
		file_asgt_type_train_statistics_proto_rawDescData = protoimpl.X.CompressGZIP(file_asgt_type_train_statistics_proto_rawDescData)
	})
	return file_asgt_type_train_statistics_proto_rawDescData
}

var file_asgt_type_train_statistics_proto_enumTypes = make([]protoimpl.EnumInfo, 1)
var file_asgt_type_train_statistics_proto_msgTypes = make([]protoimpl.MessageInfo, 7)
var file_asgt_type_train_statistics_proto_goTypes = []interface{}{
	(FeatureStat_Type)(0),   // 0: asgt.type.FeatureStat.Type
	(*TargetStat)(nil),      // 1: asgt.type.TargetStat
	(*TargetStats)(nil),     // 2: asgt.type.TargetStats
	(*FeatureStat)(nil),     // 3: asgt.type.FeatureStat
	(*FeatureStats)(nil),    // 4: asgt.type.FeatureStats
	(*TrainStatistics)(nil), // 5: asgt.type.TrainStatistics
	nil,                     // 6: asgt.type.TrainStatistics.TargetStatsByTargetEntry
	nil,                     // 7: asgt.type.TrainStatistics.FeatureStatsByTargetEntry
}
var file_asgt_type_train_statistics_proto_depIdxs = []int32{
	1, // 0: asgt.type.TargetStats.target_stats:type_name -> asgt.type.TargetStat
	0, // 1: asgt.type.FeatureStat.feature_type:type_name -> asgt.type.FeatureStat.Type
	3, // 2: asgt.type.FeatureStats.feature_stats:type_name -> asgt.type.FeatureStat
	6, // 3: asgt.type.TrainStatistics.target_stats_by_target:type_name -> asgt.type.TrainStatistics.TargetStatsByTargetEntry
	7, // 4: asgt.type.TrainStatistics.feature_stats_by_target:type_name -> asgt.type.TrainStatistics.FeatureStatsByTargetEntry
	2, // 5: asgt.type.TrainStatistics.TargetStatsByTargetEntry.value:type_name -> asgt.type.TargetStats
	4, // 6: asgt.type.TrainStatistics.FeatureStatsByTargetEntry.value:type_name -> asgt.type.FeatureStats
	7, // [7:7] is the sub-list for method output_type
	7, // [7:7] is the sub-list for method input_type
	7, // [7:7] is the sub-list for extension type_name
	7, // [7:7] is the sub-list for extension extendee
	0, // [0:7] is the sub-list for field type_name
}

func init() { file_asgt_type_train_statistics_proto_init() }
func file_asgt_type_train_statistics_proto_init() {
	if File_asgt_type_train_statistics_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_asgt_type_train_statistics_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*TargetStat); i {
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
		file_asgt_type_train_statistics_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*TargetStats); i {
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
		file_asgt_type_train_statistics_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*FeatureStat); i {
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
		file_asgt_type_train_statistics_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*FeatureStats); i {
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
		file_asgt_type_train_statistics_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*TrainStatistics); i {
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
			RawDescriptor: file_asgt_type_train_statistics_proto_rawDesc,
			NumEnums:      1,
			NumMessages:   7,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_asgt_type_train_statistics_proto_goTypes,
		DependencyIndexes: file_asgt_type_train_statistics_proto_depIdxs,
		EnumInfos:         file_asgt_type_train_statistics_proto_enumTypes,
		MessageInfos:      file_asgt_type_train_statistics_proto_msgTypes,
	}.Build()
	File_asgt_type_train_statistics_proto = out.File
	file_asgt_type_train_statistics_proto_rawDesc = nil
	file_asgt_type_train_statistics_proto_goTypes = nil
	file_asgt_type_train_statistics_proto_depIdxs = nil
}
