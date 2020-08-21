// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.23.0
// 	protoc        v3.6.1
// source: asgt/jester/v1/jester.proto

package jester

import (
	_type "github.com/e-conomic/vmlapis/gen/go/asgt/type"
	proto "github.com/golang/protobuf/proto"
	_ "google.golang.org/genproto/googleapis/api/annotations"
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

// This is a compile-time assertion that a sufficiently up-to-date version
// of the legacy proto package is being used.
const _ = proto.ProtoPackageIsVersion4

// AutoSuggest
type SuggestionResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Predictions []*_type.Prediction `protobuf:"bytes,1,rep,name=predictions,proto3" json:"predictions,omitempty"`
	Model       *_type.Model        `protobuf:"bytes,2,opt,name=model,proto3" json:"model,omitempty"`
}

func (x *SuggestionResponse) Reset() {
	*x = SuggestionResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_asgt_jester_v1_jester_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SuggestionResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SuggestionResponse) ProtoMessage() {}

func (x *SuggestionResponse) ProtoReflect() protoreflect.Message {
	mi := &file_asgt_jester_v1_jester_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SuggestionResponse.ProtoReflect.Descriptor instead.
func (*SuggestionResponse) Descriptor() ([]byte, []int) {
	return file_asgt_jester_v1_jester_proto_rawDescGZIP(), []int{0}
}

func (x *SuggestionResponse) GetPredictions() []*_type.Prediction {
	if x != nil {
		return x.Predictions
	}
	return nil
}

func (x *SuggestionResponse) GetModel() *_type.Model {
	if x != nil {
		return x.Model
	}
	return nil
}

type SuggestionOptions struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	SuggestionLimit int32                  `protobuf:"varint,1,opt,name=suggestion_limit,json=suggestionLimit,proto3" json:"suggestion_limit,omitempty"`
	MinConfidence   _type.Confidence_Level `protobuf:"varint,2,opt,name=min_confidence,json=minConfidence,proto3,enum=asgt.type.Confidence_Level" json:"min_confidence,omitempty"`
}

func (x *SuggestionOptions) Reset() {
	*x = SuggestionOptions{}
	if protoimpl.UnsafeEnabled {
		mi := &file_asgt_jester_v1_jester_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SuggestionOptions) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SuggestionOptions) ProtoMessage() {}

func (x *SuggestionOptions) ProtoReflect() protoreflect.Message {
	mi := &file_asgt_jester_v1_jester_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SuggestionOptions.ProtoReflect.Descriptor instead.
func (*SuggestionOptions) Descriptor() ([]byte, []int) {
	return file_asgt_jester_v1_jester_proto_rawDescGZIP(), []int{1}
}

func (x *SuggestionOptions) GetSuggestionLimit() int32 {
	if x != nil {
		return x.SuggestionLimit
	}
	return 0
}

func (x *SuggestionOptions) GetMinConfidence() _type.Confidence_Level {
	if x != nil {
		return x.MinConfidence
	}
	return _type.Confidence_UNKNOWN
}

type SuggestionRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Name    string             `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	Type    string             `protobuf:"bytes,2,opt,name=type,proto3" json:"type,omitempty"`
	Inputs  []*_type.Data      `protobuf:"bytes,3,rep,name=inputs,proto3" json:"inputs,omitempty"`
	Options *SuggestionOptions `protobuf:"bytes,4,opt,name=options,proto3" json:"options,omitempty"`
	Tags    []string           `protobuf:"bytes,5,rep,name=tags,proto3" json:"tags,omitempty"`
}

func (x *SuggestionRequest) Reset() {
	*x = SuggestionRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_asgt_jester_v1_jester_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SuggestionRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SuggestionRequest) ProtoMessage() {}

func (x *SuggestionRequest) ProtoReflect() protoreflect.Message {
	mi := &file_asgt_jester_v1_jester_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SuggestionRequest.ProtoReflect.Descriptor instead.
func (*SuggestionRequest) Descriptor() ([]byte, []int) {
	return file_asgt_jester_v1_jester_proto_rawDescGZIP(), []int{2}
}

func (x *SuggestionRequest) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *SuggestionRequest) GetType() string {
	if x != nil {
		return x.Type
	}
	return ""
}

func (x *SuggestionRequest) GetInputs() []*_type.Data {
	if x != nil {
		return x.Inputs
	}
	return nil
}

func (x *SuggestionRequest) GetOptions() *SuggestionOptions {
	if x != nil {
		return x.Options
	}
	return nil
}

func (x *SuggestionRequest) GetTags() []string {
	if x != nil {
		return x.Tags
	}
	return nil
}

var File_asgt_jester_v1_jester_proto protoreflect.FileDescriptor

var file_asgt_jester_v1_jester_proto_rawDesc = []byte{
	0x0a, 0x1b, 0x61, 0x73, 0x67, 0x74, 0x2f, 0x6a, 0x65, 0x73, 0x74, 0x65, 0x72, 0x2f, 0x76, 0x31,
	0x2f, 0x6a, 0x65, 0x73, 0x74, 0x65, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0e, 0x61,
	0x73, 0x67, 0x74, 0x2e, 0x6a, 0x65, 0x73, 0x74, 0x65, 0x72, 0x2e, 0x76, 0x31, 0x1a, 0x14, 0x61,
	0x73, 0x67, 0x74, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x2f, 0x64, 0x61, 0x74, 0x61, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x1a, 0x15, 0x61, 0x73, 0x67, 0x74, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x2f, 0x6d,
	0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1a, 0x61, 0x73, 0x67, 0x74,
	0x2f, 0x74, 0x79, 0x70, 0x65, 0x2f, 0x70, 0x72, 0x65, 0x64, 0x69, 0x63, 0x74, 0x69, 0x6f, 0x6e,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1c, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61,
	0x70, 0x69, 0x2f, 0x61, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x22, 0x75, 0x0a, 0x12, 0x53, 0x75, 0x67, 0x67, 0x65, 0x73, 0x74, 0x69,
	0x6f, 0x6e, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x37, 0x0a, 0x0b, 0x70, 0x72,
	0x65, 0x64, 0x69, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32,
	0x15, 0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x50, 0x72, 0x65, 0x64,
	0x69, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x0b, 0x70, 0x72, 0x65, 0x64, 0x69, 0x63, 0x74, 0x69,
	0x6f, 0x6e, 0x73, 0x12, 0x26, 0x0a, 0x05, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x18, 0x02, 0x20, 0x01,
	0x28, 0x0b, 0x32, 0x10, 0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x4d,
	0x6f, 0x64, 0x65, 0x6c, 0x52, 0x05, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x22, 0x82, 0x01, 0x0a, 0x11,
	0x53, 0x75, 0x67, 0x67, 0x65, 0x73, 0x74, 0x69, 0x6f, 0x6e, 0x4f, 0x70, 0x74, 0x69, 0x6f, 0x6e,
	0x73, 0x12, 0x29, 0x0a, 0x10, 0x73, 0x75, 0x67, 0x67, 0x65, 0x73, 0x74, 0x69, 0x6f, 0x6e, 0x5f,
	0x6c, 0x69, 0x6d, 0x69, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x05, 0x52, 0x0f, 0x73, 0x75, 0x67,
	0x67, 0x65, 0x73, 0x74, 0x69, 0x6f, 0x6e, 0x4c, 0x69, 0x6d, 0x69, 0x74, 0x12, 0x42, 0x0a, 0x0e,
	0x6d, 0x69, 0x6e, 0x5f, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x64, 0x65, 0x6e, 0x63, 0x65, 0x18, 0x02,
	0x20, 0x01, 0x28, 0x0e, 0x32, 0x1b, 0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x74, 0x79, 0x70, 0x65,
	0x2e, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x64, 0x65, 0x6e, 0x63, 0x65, 0x2e, 0x4c, 0x65, 0x76, 0x65,
	0x6c, 0x52, 0x0d, 0x6d, 0x69, 0x6e, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x64, 0x65, 0x6e, 0x63, 0x65,
	0x22, 0xb5, 0x01, 0x0a, 0x11, 0x53, 0x75, 0x67, 0x67, 0x65, 0x73, 0x74, 0x69, 0x6f, 0x6e, 0x52,
	0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x12, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x12, 0x0a, 0x04, 0x74, 0x79,
	0x70, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x74, 0x79, 0x70, 0x65, 0x12, 0x27,
	0x0a, 0x06, 0x69, 0x6e, 0x70, 0x75, 0x74, 0x73, 0x18, 0x03, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x0f,
	0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x44, 0x61, 0x74, 0x61, 0x52,
	0x06, 0x69, 0x6e, 0x70, 0x75, 0x74, 0x73, 0x12, 0x3b, 0x0a, 0x07, 0x6f, 0x70, 0x74, 0x69, 0x6f,
	0x6e, 0x73, 0x18, 0x04, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x21, 0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e,
	0x6a, 0x65, 0x73, 0x74, 0x65, 0x72, 0x2e, 0x76, 0x31, 0x2e, 0x53, 0x75, 0x67, 0x67, 0x65, 0x73,
	0x74, 0x69, 0x6f, 0x6e, 0x4f, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x52, 0x07, 0x6f, 0x70, 0x74,
	0x69, 0x6f, 0x6e, 0x73, 0x12, 0x12, 0x0a, 0x04, 0x74, 0x61, 0x67, 0x73, 0x18, 0x05, 0x20, 0x03,
	0x28, 0x09, 0x52, 0x04, 0x74, 0x61, 0x67, 0x73, 0x32, 0x80, 0x01, 0x0a, 0x06, 0x4a, 0x65, 0x73,
	0x74, 0x65, 0x72, 0x12, 0x76, 0x0a, 0x07, 0x53, 0x75, 0x67, 0x67, 0x65, 0x73, 0x74, 0x12, 0x21,
	0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x6a, 0x65, 0x73, 0x74, 0x65, 0x72, 0x2e, 0x76, 0x31, 0x2e,
	0x53, 0x75, 0x67, 0x67, 0x65, 0x73, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73,
	0x74, 0x1a, 0x22, 0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x6a, 0x65, 0x73, 0x74, 0x65, 0x72, 0x2e,
	0x76, 0x31, 0x2e, 0x53, 0x75, 0x67, 0x67, 0x65, 0x73, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x65, 0x73,
	0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x24, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x1e, 0x22, 0x19, 0x2f,
	0x76, 0x31, 0x2f, 0x7b, 0x74, 0x79, 0x70, 0x65, 0x7d, 0x2f, 0x7b, 0x6e, 0x61, 0x6d, 0x65, 0x7d,
	0x3a, 0x73, 0x75, 0x67, 0x67, 0x65, 0x73, 0x74, 0x3a, 0x01, 0x2a, 0x42, 0x3b, 0x5a, 0x39, 0x67,
	0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x65, 0x2d, 0x63, 0x6f, 0x6e, 0x6f,
	0x6d, 0x69, 0x63, 0x2f, 0x76, 0x6d, 0x6c, 0x61, 0x70, 0x69, 0x73, 0x2f, 0x67, 0x65, 0x6e, 0x2f,
	0x67, 0x6f, 0x2f, 0x61, 0x73, 0x67, 0x74, 0x2f, 0x6a, 0x65, 0x73, 0x74, 0x65, 0x72, 0x2f, 0x76,
	0x31, 0x3b, 0x6a, 0x65, 0x73, 0x74, 0x65, 0x72, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_asgt_jester_v1_jester_proto_rawDescOnce sync.Once
	file_asgt_jester_v1_jester_proto_rawDescData = file_asgt_jester_v1_jester_proto_rawDesc
)

func file_asgt_jester_v1_jester_proto_rawDescGZIP() []byte {
	file_asgt_jester_v1_jester_proto_rawDescOnce.Do(func() {
		file_asgt_jester_v1_jester_proto_rawDescData = protoimpl.X.CompressGZIP(file_asgt_jester_v1_jester_proto_rawDescData)
	})
	return file_asgt_jester_v1_jester_proto_rawDescData
}

var file_asgt_jester_v1_jester_proto_msgTypes = make([]protoimpl.MessageInfo, 3)
var file_asgt_jester_v1_jester_proto_goTypes = []interface{}{
	(*SuggestionResponse)(nil),  // 0: asgt.jester.v1.SuggestionResponse
	(*SuggestionOptions)(nil),   // 1: asgt.jester.v1.SuggestionOptions
	(*SuggestionRequest)(nil),   // 2: asgt.jester.v1.SuggestionRequest
	(*_type.Prediction)(nil),    // 3: asgt.type.Prediction
	(*_type.Model)(nil),         // 4: asgt.type.Model
	(_type.Confidence_Level)(0), // 5: asgt.type.Confidence.Level
	(*_type.Data)(nil),          // 6: asgt.type.Data
}
var file_asgt_jester_v1_jester_proto_depIdxs = []int32{
	3, // 0: asgt.jester.v1.SuggestionResponse.predictions:type_name -> asgt.type.Prediction
	4, // 1: asgt.jester.v1.SuggestionResponse.model:type_name -> asgt.type.Model
	5, // 2: asgt.jester.v1.SuggestionOptions.min_confidence:type_name -> asgt.type.Confidence.Level
	6, // 3: asgt.jester.v1.SuggestionRequest.inputs:type_name -> asgt.type.Data
	1, // 4: asgt.jester.v1.SuggestionRequest.options:type_name -> asgt.jester.v1.SuggestionOptions
	2, // 5: asgt.jester.v1.Jester.Suggest:input_type -> asgt.jester.v1.SuggestionRequest
	0, // 6: asgt.jester.v1.Jester.Suggest:output_type -> asgt.jester.v1.SuggestionResponse
	6, // [6:7] is the sub-list for method output_type
	5, // [5:6] is the sub-list for method input_type
	5, // [5:5] is the sub-list for extension type_name
	5, // [5:5] is the sub-list for extension extendee
	0, // [0:5] is the sub-list for field type_name
}

func init() { file_asgt_jester_v1_jester_proto_init() }
func file_asgt_jester_v1_jester_proto_init() {
	if File_asgt_jester_v1_jester_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_asgt_jester_v1_jester_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SuggestionResponse); i {
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
		file_asgt_jester_v1_jester_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SuggestionOptions); i {
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
		file_asgt_jester_v1_jester_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SuggestionRequest); i {
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
			RawDescriptor: file_asgt_jester_v1_jester_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   3,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_asgt_jester_v1_jester_proto_goTypes,
		DependencyIndexes: file_asgt_jester_v1_jester_proto_depIdxs,
		MessageInfos:      file_asgt_jester_v1_jester_proto_msgTypes,
	}.Build()
	File_asgt_jester_v1_jester_proto = out.File
	file_asgt_jester_v1_jester_proto_rawDesc = nil
	file_asgt_jester_v1_jester_proto_goTypes = nil
	file_asgt_jester_v1_jester_proto_depIdxs = nil
}
