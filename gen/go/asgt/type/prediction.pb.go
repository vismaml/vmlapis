// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.36.5
// 	protoc        (unknown)
// source: asgt/type/prediction.proto

package asgttype

import (
	_ "github.com/e-conomic/vmlapis/gen/go/gen_bq_schema"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	wrapperspb "google.golang.org/protobuf/types/known/wrapperspb"
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

type Confidence_Level int32

const (
	Confidence_UNKNOWN   Confidence_Level = 0
	Confidence_VERY_LOW  Confidence_Level = 1
	Confidence_LOW       Confidence_Level = 2
	Confidence_MID       Confidence_Level = 3
	Confidence_HIGH      Confidence_Level = 4
	Confidence_VERY_HIGH Confidence_Level = 5
)

// Enum value maps for Confidence_Level.
var (
	Confidence_Level_name = map[int32]string{
		0: "UNKNOWN",
		1: "VERY_LOW",
		2: "LOW",
		3: "MID",
		4: "HIGH",
		5: "VERY_HIGH",
	}
	Confidence_Level_value = map[string]int32{
		"UNKNOWN":   0,
		"VERY_LOW":  1,
		"LOW":       2,
		"MID":       3,
		"HIGH":      4,
		"VERY_HIGH": 5,
	}
)

func (x Confidence_Level) Enum() *Confidence_Level {
	p := new(Confidence_Level)
	*p = x
	return p
}

func (x Confidence_Level) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (Confidence_Level) Descriptor() protoreflect.EnumDescriptor {
	return file_asgt_type_prediction_proto_enumTypes[0].Descriptor()
}

func (Confidence_Level) Type() protoreflect.EnumType {
	return &file_asgt_type_prediction_proto_enumTypes[0]
}

func (x Confidence_Level) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use Confidence_Level.Descriptor instead.
func (Confidence_Level) EnumDescriptor() ([]byte, []int) {
	return file_asgt_type_prediction_proto_rawDescGZIP(), []int{0, 0}
}

// Common types
type Confidence struct {
	state protoimpl.MessageState `protogen:"open.v1"`
	// A bucketized representation of confidence, which is intended to give clients
	// highly stable results across model upgrades.
	Level Confidence_Level `protobuf:"varint,1,opt,name=level,proto3,enum=asgt.type.Confidence_Level" json:"level,omitempty"`
	// The confidence value
	Value         *wrapperspb.FloatValue `protobuf:"bytes,2,opt,name=value,proto3" json:"value,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *Confidence) Reset() {
	*x = Confidence{}
	mi := &file_asgt_type_prediction_proto_msgTypes[0]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *Confidence) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Confidence) ProtoMessage() {}

func (x *Confidence) ProtoReflect() protoreflect.Message {
	mi := &file_asgt_type_prediction_proto_msgTypes[0]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Confidence.ProtoReflect.Descriptor instead.
func (*Confidence) Descriptor() ([]byte, []int) {
	return file_asgt_type_prediction_proto_rawDescGZIP(), []int{0}
}

func (x *Confidence) GetLevel() Confidence_Level {
	if x != nil {
		return x.Level
	}
	return Confidence_UNKNOWN
}

func (x *Confidence) GetValue() *wrapperspb.FloatValue {
	if x != nil {
		return x.Value
	}
	return nil
}

type Prediction struct {
	state         protoimpl.MessageState `protogen:"open.v1"`
	Targets       []*Prediction_Target   `protobuf:"bytes,1,rep,name=targets,proto3" json:"targets,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *Prediction) Reset() {
	*x = Prediction{}
	mi := &file_asgt_type_prediction_proto_msgTypes[1]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *Prediction) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Prediction) ProtoMessage() {}

func (x *Prediction) ProtoReflect() protoreflect.Message {
	mi := &file_asgt_type_prediction_proto_msgTypes[1]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Prediction.ProtoReflect.Descriptor instead.
func (*Prediction) Descriptor() ([]byte, []int) {
	return file_asgt_type_prediction_proto_rawDescGZIP(), []int{1}
}

func (x *Prediction) GetTargets() []*Prediction_Target {
	if x != nil {
		return x.Targets
	}
	return nil
}

type Prediction_Target struct {
	state         protoimpl.MessageState         `protogen:"open.v1"`
	Name          string                         `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	Candidates    []*Prediction_Target_Candidate `protobuf:"bytes,2,rep,name=candidates,proto3" json:"candidates,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *Prediction_Target) Reset() {
	*x = Prediction_Target{}
	mi := &file_asgt_type_prediction_proto_msgTypes[2]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *Prediction_Target) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Prediction_Target) ProtoMessage() {}

func (x *Prediction_Target) ProtoReflect() protoreflect.Message {
	mi := &file_asgt_type_prediction_proto_msgTypes[2]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Prediction_Target.ProtoReflect.Descriptor instead.
func (*Prediction_Target) Descriptor() ([]byte, []int) {
	return file_asgt_type_prediction_proto_rawDescGZIP(), []int{1, 0}
}

func (x *Prediction_Target) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *Prediction_Target) GetCandidates() []*Prediction_Target_Candidate {
	if x != nil {
		return x.Candidates
	}
	return nil
}

type Prediction_Target_Candidate struct {
	state         protoimpl.MessageState `protogen:"open.v1"`
	Value         string                 `protobuf:"bytes,1,opt,name=value,proto3" json:"value,omitempty"`
	Confidence    *Confidence            `protobuf:"bytes,2,opt,name=confidence,proto3" json:"confidence,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *Prediction_Target_Candidate) Reset() {
	*x = Prediction_Target_Candidate{}
	mi := &file_asgt_type_prediction_proto_msgTypes[3]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *Prediction_Target_Candidate) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Prediction_Target_Candidate) ProtoMessage() {}

func (x *Prediction_Target_Candidate) ProtoReflect() protoreflect.Message {
	mi := &file_asgt_type_prediction_proto_msgTypes[3]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Prediction_Target_Candidate.ProtoReflect.Descriptor instead.
func (*Prediction_Target_Candidate) Descriptor() ([]byte, []int) {
	return file_asgt_type_prediction_proto_rawDescGZIP(), []int{1, 0, 0}
}

func (x *Prediction_Target_Candidate) GetValue() string {
	if x != nil {
		return x.Value
	}
	return ""
}

func (x *Prediction_Target_Candidate) GetConfidence() *Confidence {
	if x != nil {
		return x.Confidence
	}
	return nil
}

var File_asgt_type_prediction_proto protoreflect.FileDescriptor

var file_asgt_type_prediction_proto_rawDesc = string([]byte{
	0x0a, 0x1a, 0x61, 0x73, 0x67, 0x74, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x2f, 0x70, 0x72, 0x65, 0x64,
	0x69, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x09, 0x61, 0x73,
	0x67, 0x74, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x1a, 0x1c, 0x67, 0x65, 0x6e, 0x5f, 0x62, 0x71, 0x5f,
	0x73, 0x63, 0x68, 0x65, 0x6d, 0x61, 0x2f, 0x62, 0x71, 0x5f, 0x66, 0x69, 0x65, 0x6c, 0x64, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x77, 0x72, 0x61, 0x70, 0x70, 0x65, 0x72, 0x73, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0xc1, 0x01, 0x0a, 0x0a, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x64,
	0x65, 0x6e, 0x63, 0x65, 0x12, 0x31, 0x0a, 0x05, 0x6c, 0x65, 0x76, 0x65, 0x6c, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x0e, 0x32, 0x1b, 0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x2e,
	0x43, 0x6f, 0x6e, 0x66, 0x69, 0x64, 0x65, 0x6e, 0x63, 0x65, 0x2e, 0x4c, 0x65, 0x76, 0x65, 0x6c,
	0x52, 0x05, 0x6c, 0x65, 0x76, 0x65, 0x6c, 0x12, 0x31, 0x0a, 0x05, 0x76, 0x61, 0x6c, 0x75, 0x65,
	0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1b, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x46, 0x6c, 0x6f, 0x61, 0x74, 0x56, 0x61,
	0x6c, 0x75, 0x65, 0x52, 0x05, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x22, 0x4d, 0x0a, 0x05, 0x4c, 0x65,
	0x76, 0x65, 0x6c, 0x12, 0x0b, 0x0a, 0x07, 0x55, 0x4e, 0x4b, 0x4e, 0x4f, 0x57, 0x4e, 0x10, 0x00,
	0x12, 0x0c, 0x0a, 0x08, 0x56, 0x45, 0x52, 0x59, 0x5f, 0x4c, 0x4f, 0x57, 0x10, 0x01, 0x12, 0x07,
	0x0a, 0x03, 0x4c, 0x4f, 0x57, 0x10, 0x02, 0x12, 0x07, 0x0a, 0x03, 0x4d, 0x49, 0x44, 0x10, 0x03,
	0x12, 0x08, 0x0a, 0x04, 0x48, 0x49, 0x47, 0x48, 0x10, 0x04, 0x12, 0x0d, 0x0a, 0x09, 0x56, 0x45,
	0x52, 0x59, 0x5f, 0x48, 0x49, 0x47, 0x48, 0x10, 0x05, 0x22, 0x8c, 0x02, 0x0a, 0x0a, 0x50, 0x72,
	0x65, 0x64, 0x69, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x36, 0x0a, 0x07, 0x74, 0x61, 0x72, 0x67,
	0x65, 0x74, 0x73, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x1c, 0x2e, 0x61, 0x73, 0x67, 0x74,
	0x2e, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x50, 0x72, 0x65, 0x64, 0x69, 0x63, 0x74, 0x69, 0x6f, 0x6e,
	0x2e, 0x54, 0x61, 0x72, 0x67, 0x65, 0x74, 0x52, 0x07, 0x74, 0x61, 0x72, 0x67, 0x65, 0x74, 0x73,
	0x1a, 0xc5, 0x01, 0x0a, 0x06, 0x54, 0x61, 0x72, 0x67, 0x65, 0x74, 0x12, 0x12, 0x0a, 0x04, 0x6e,
	0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12,
	0x46, 0x0a, 0x0a, 0x63, 0x61, 0x6e, 0x64, 0x69, 0x64, 0x61, 0x74, 0x65, 0x73, 0x18, 0x02, 0x20,
	0x03, 0x28, 0x0b, 0x32, 0x26, 0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x2e,
	0x50, 0x72, 0x65, 0x64, 0x69, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x2e, 0x54, 0x61, 0x72, 0x67, 0x65,
	0x74, 0x2e, 0x43, 0x61, 0x6e, 0x64, 0x69, 0x64, 0x61, 0x74, 0x65, 0x52, 0x0a, 0x63, 0x61, 0x6e,
	0x64, 0x69, 0x64, 0x61, 0x74, 0x65, 0x73, 0x1a, 0x5f, 0x0a, 0x09, 0x43, 0x61, 0x6e, 0x64, 0x69,
	0x64, 0x61, 0x74, 0x65, 0x12, 0x1b, 0x0a, 0x05, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x09, 0x42, 0x05, 0xea, 0x3f, 0x02, 0x08, 0x01, 0x52, 0x05, 0x76, 0x61, 0x6c, 0x75,
	0x65, 0x12, 0x35, 0x0a, 0x0a, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x64, 0x65, 0x6e, 0x63, 0x65, 0x18,
	0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x15, 0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x74, 0x79, 0x70,
	0x65, 0x2e, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x64, 0x65, 0x6e, 0x63, 0x65, 0x52, 0x0a, 0x63, 0x6f,
	0x6e, 0x66, 0x69, 0x64, 0x65, 0x6e, 0x63, 0x65, 0x42, 0xa2, 0x01, 0x0a, 0x12, 0x61, 0x69, 0x2e,
	0x76, 0x69, 0x73, 0x6d, 0x61, 0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x42,
	0x0f, 0x50, 0x72, 0x65, 0x64, 0x69, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x50, 0x72, 0x6f, 0x74, 0x6f,
	0x50, 0x01, 0x5a, 0x36, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x65,
	0x2d, 0x63, 0x6f, 0x6e, 0x6f, 0x6d, 0x69, 0x63, 0x2f, 0x76, 0x6d, 0x6c, 0x61, 0x70, 0x69, 0x73,
	0x2f, 0x67, 0x65, 0x6e, 0x2f, 0x67, 0x6f, 0x2f, 0x61, 0x73, 0x67, 0x74, 0x2f, 0x74, 0x79, 0x70,
	0x65, 0x3b, 0x61, 0x73, 0x67, 0x74, 0x74, 0x79, 0x70, 0x65, 0xa2, 0x02, 0x03, 0x41, 0x54, 0x58,
	0xaa, 0x02, 0x09, 0x41, 0x73, 0x67, 0x74, 0x2e, 0x54, 0x79, 0x70, 0x65, 0xca, 0x02, 0x09, 0x41,
	0x73, 0x67, 0x74, 0x5c, 0x54, 0x79, 0x70, 0x65, 0xe2, 0x02, 0x15, 0x41, 0x73, 0x67, 0x74, 0x5c,
	0x54, 0x79, 0x70, 0x65, 0x5c, 0x47, 0x50, 0x42, 0x4d, 0x65, 0x74, 0x61, 0x64, 0x61, 0x74, 0x61,
	0xea, 0x02, 0x0a, 0x41, 0x73, 0x67, 0x74, 0x3a, 0x3a, 0x54, 0x79, 0x70, 0x65, 0x62, 0x06, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x33,
})

var (
	file_asgt_type_prediction_proto_rawDescOnce sync.Once
	file_asgt_type_prediction_proto_rawDescData []byte
)

func file_asgt_type_prediction_proto_rawDescGZIP() []byte {
	file_asgt_type_prediction_proto_rawDescOnce.Do(func() {
		file_asgt_type_prediction_proto_rawDescData = protoimpl.X.CompressGZIP(unsafe.Slice(unsafe.StringData(file_asgt_type_prediction_proto_rawDesc), len(file_asgt_type_prediction_proto_rawDesc)))
	})
	return file_asgt_type_prediction_proto_rawDescData
}

var file_asgt_type_prediction_proto_enumTypes = make([]protoimpl.EnumInfo, 1)
var file_asgt_type_prediction_proto_msgTypes = make([]protoimpl.MessageInfo, 4)
var file_asgt_type_prediction_proto_goTypes = []any{
	(Confidence_Level)(0),               // 0: asgt.type.Confidence.Level
	(*Confidence)(nil),                  // 1: asgt.type.Confidence
	(*Prediction)(nil),                  // 2: asgt.type.Prediction
	(*Prediction_Target)(nil),           // 3: asgt.type.Prediction.Target
	(*Prediction_Target_Candidate)(nil), // 4: asgt.type.Prediction.Target.Candidate
	(*wrapperspb.FloatValue)(nil),       // 5: google.protobuf.FloatValue
}
var file_asgt_type_prediction_proto_depIdxs = []int32{
	0, // 0: asgt.type.Confidence.level:type_name -> asgt.type.Confidence.Level
	5, // 1: asgt.type.Confidence.value:type_name -> google.protobuf.FloatValue
	3, // 2: asgt.type.Prediction.targets:type_name -> asgt.type.Prediction.Target
	4, // 3: asgt.type.Prediction.Target.candidates:type_name -> asgt.type.Prediction.Target.Candidate
	1, // 4: asgt.type.Prediction.Target.Candidate.confidence:type_name -> asgt.type.Confidence
	5, // [5:5] is the sub-list for method output_type
	5, // [5:5] is the sub-list for method input_type
	5, // [5:5] is the sub-list for extension type_name
	5, // [5:5] is the sub-list for extension extendee
	0, // [0:5] is the sub-list for field type_name
}

func init() { file_asgt_type_prediction_proto_init() }
func file_asgt_type_prediction_proto_init() {
	if File_asgt_type_prediction_proto != nil {
		return
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: unsafe.Slice(unsafe.StringData(file_asgt_type_prediction_proto_rawDesc), len(file_asgt_type_prediction_proto_rawDesc)),
			NumEnums:      1,
			NumMessages:   4,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_asgt_type_prediction_proto_goTypes,
		DependencyIndexes: file_asgt_type_prediction_proto_depIdxs,
		EnumInfos:         file_asgt_type_prediction_proto_enumTypes,
		MessageInfos:      file_asgt_type_prediction_proto_msgTypes,
	}.Build()
	File_asgt_type_prediction_proto = out.File
	file_asgt_type_prediction_proto_goTypes = nil
	file_asgt_type_prediction_proto_depIdxs = nil
}
