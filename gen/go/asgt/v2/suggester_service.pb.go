// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.1
// 	protoc        (unknown)
// source: asgt/v2/suggester_service.proto

package v2

import (
	_type "github.com/e-conomic/vmlapis/gen/go/asgt/type"
	_type1 "github.com/e-conomic/vmlapis/gen/go/asgt/v2/type"
	_ "github.com/envoyproxy/protoc-gen-validate/validate"
	_ "github.com/grpc-ecosystem/grpc-gateway/v2/protoc-gen-openapiv2/options"
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

type SuggestOptions struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Maximum number of suggestions to return per target
	SuggestLimit int32 `protobuf:"varint,1,opt,name=suggest_limit,json=suggestLimit,proto3" json:"suggest_limit,omitempty"`
	// Not implemented yet.
	MinConfidence _type.Confidence_Level `protobuf:"varint,2,opt,name=min_confidence,json=minConfidence,proto3,enum=asgt.type.Confidence_Level" json:"min_confidence,omitempty"`
}

func (x *SuggestOptions) Reset() {
	*x = SuggestOptions{}
	if protoimpl.UnsafeEnabled {
		mi := &file_asgt_v2_suggester_service_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SuggestOptions) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SuggestOptions) ProtoMessage() {}

func (x *SuggestOptions) ProtoReflect() protoreflect.Message {
	mi := &file_asgt_v2_suggester_service_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SuggestOptions.ProtoReflect.Descriptor instead.
func (*SuggestOptions) Descriptor() ([]byte, []int) {
	return file_asgt_v2_suggester_service_proto_rawDescGZIP(), []int{0}
}

func (x *SuggestOptions) GetSuggestLimit() int32 {
	if x != nil {
		return x.SuggestLimit
	}
	return 0
}

func (x *SuggestOptions) GetMinConfidence() _type.Confidence_Level {
	if x != nil {
		return x.MinConfidence
	}
	return _type.Confidence_Level(0)
}

type SuggestRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Name of the dataset to make prediction against
	DatasetName string `protobuf:"bytes,1,opt,name=dataset_name,json=datasetName,proto3" json:"dataset_name,omitempty"` // text-no-spaces
	// Input data to use for prediction
	Input   *_type1.Data    `protobuf:"bytes,2,opt,name=input,proto3" json:"input,omitempty"`
	Options *SuggestOptions `protobuf:"bytes,3,opt,name=options,proto3" json:"options,omitempty"`
}

func (x *SuggestRequest) Reset() {
	*x = SuggestRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_asgt_v2_suggester_service_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SuggestRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SuggestRequest) ProtoMessage() {}

func (x *SuggestRequest) ProtoReflect() protoreflect.Message {
	mi := &file_asgt_v2_suggester_service_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SuggestRequest.ProtoReflect.Descriptor instead.
func (*SuggestRequest) Descriptor() ([]byte, []int) {
	return file_asgt_v2_suggester_service_proto_rawDescGZIP(), []int{1}
}

func (x *SuggestRequest) GetDatasetName() string {
	if x != nil {
		return x.DatasetName
	}
	return ""
}

func (x *SuggestRequest) GetInput() *_type1.Data {
	if x != nil {
		return x.Input
	}
	return nil
}

func (x *SuggestRequest) GetOptions() *SuggestOptions {
	if x != nil {
		return x.Options
	}
	return nil
}

type SuggestResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Prediction *_type.Prediction `protobuf:"bytes,1,opt,name=prediction,proto3" json:"prediction,omitempty"`
	Model      *_type.Model      `protobuf:"bytes,2,opt,name=model,proto3" json:"model,omitempty"`
}

func (x *SuggestResponse) Reset() {
	*x = SuggestResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_asgt_v2_suggester_service_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SuggestResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SuggestResponse) ProtoMessage() {}

func (x *SuggestResponse) ProtoReflect() protoreflect.Message {
	mi := &file_asgt_v2_suggester_service_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SuggestResponse.ProtoReflect.Descriptor instead.
func (*SuggestResponse) Descriptor() ([]byte, []int) {
	return file_asgt_v2_suggester_service_proto_rawDescGZIP(), []int{2}
}

func (x *SuggestResponse) GetPrediction() *_type.Prediction {
	if x != nil {
		return x.Prediction
	}
	return nil
}

func (x *SuggestResponse) GetModel() *_type.Model {
	if x != nil {
		return x.Model
	}
	return nil
}

type BatchSuggestRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Name of the dataset to make prediction against
	DatasetName string `protobuf:"bytes,1,opt,name=dataset_name,json=datasetName,proto3" json:"dataset_name,omitempty"` // text-no-spaces
	// Input data to use for prediction
	Inputs  []*_type1.Data  `protobuf:"bytes,2,rep,name=inputs,proto3" json:"inputs,omitempty"`
	Options *SuggestOptions `protobuf:"bytes,3,opt,name=options,proto3" json:"options,omitempty"`
}

func (x *BatchSuggestRequest) Reset() {
	*x = BatchSuggestRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_asgt_v2_suggester_service_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *BatchSuggestRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*BatchSuggestRequest) ProtoMessage() {}

func (x *BatchSuggestRequest) ProtoReflect() protoreflect.Message {
	mi := &file_asgt_v2_suggester_service_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use BatchSuggestRequest.ProtoReflect.Descriptor instead.
func (*BatchSuggestRequest) Descriptor() ([]byte, []int) {
	return file_asgt_v2_suggester_service_proto_rawDescGZIP(), []int{3}
}

func (x *BatchSuggestRequest) GetDatasetName() string {
	if x != nil {
		return x.DatasetName
	}
	return ""
}

func (x *BatchSuggestRequest) GetInputs() []*_type1.Data {
	if x != nil {
		return x.Inputs
	}
	return nil
}

func (x *BatchSuggestRequest) GetOptions() *SuggestOptions {
	if x != nil {
		return x.Options
	}
	return nil
}

type BatchSuggestResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Predictions []*_type.Prediction `protobuf:"bytes,1,rep,name=predictions,proto3" json:"predictions,omitempty"`
	Model       *_type.Model        `protobuf:"bytes,2,opt,name=model,proto3" json:"model,omitempty"`
}

func (x *BatchSuggestResponse) Reset() {
	*x = BatchSuggestResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_asgt_v2_suggester_service_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *BatchSuggestResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*BatchSuggestResponse) ProtoMessage() {}

func (x *BatchSuggestResponse) ProtoReflect() protoreflect.Message {
	mi := &file_asgt_v2_suggester_service_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use BatchSuggestResponse.ProtoReflect.Descriptor instead.
func (*BatchSuggestResponse) Descriptor() ([]byte, []int) {
	return file_asgt_v2_suggester_service_proto_rawDescGZIP(), []int{4}
}

func (x *BatchSuggestResponse) GetPredictions() []*_type.Prediction {
	if x != nil {
		return x.Predictions
	}
	return nil
}

func (x *BatchSuggestResponse) GetModel() *_type.Model {
	if x != nil {
		return x.Model
	}
	return nil
}

var File_asgt_v2_suggester_service_proto protoreflect.FileDescriptor

var file_asgt_v2_suggester_service_proto_rawDesc = []byte{
	0x0a, 0x1f, 0x61, 0x73, 0x67, 0x74, 0x2f, 0x76, 0x32, 0x2f, 0x73, 0x75, 0x67, 0x67, 0x65, 0x73,
	0x74, 0x65, 0x72, 0x5f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x12, 0x07, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x76, 0x32, 0x1a, 0x15, 0x61, 0x73, 0x67, 0x74,
	0x2f, 0x74, 0x79, 0x70, 0x65, 0x2f, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x1a, 0x1a, 0x61, 0x73, 0x67, 0x74, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x2f, 0x70, 0x72, 0x65,
	0x64, 0x69, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x17, 0x61,
	0x73, 0x67, 0x74, 0x2f, 0x76, 0x32, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x2f, 0x64, 0x61, 0x74, 0x61,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1c, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61,
	0x70, 0x69, 0x2f, 0x61, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x63, 0x2d, 0x67, 0x65, 0x6e,
	0x2d, 0x6f, 0x70, 0x65, 0x6e, 0x61, 0x70, 0x69, 0x76, 0x32, 0x2f, 0x6f, 0x70, 0x74, 0x69, 0x6f,
	0x6e, 0x73, 0x2f, 0x61, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x17, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x2f, 0x76,
	0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x9e, 0x01,
	0x0a, 0x0e, 0x53, 0x75, 0x67, 0x67, 0x65, 0x73, 0x74, 0x4f, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x73,
	0x12, 0x23, 0x0a, 0x0d, 0x73, 0x75, 0x67, 0x67, 0x65, 0x73, 0x74, 0x5f, 0x6c, 0x69, 0x6d, 0x69,
	0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x05, 0x52, 0x0c, 0x73, 0x75, 0x67, 0x67, 0x65, 0x73, 0x74,
	0x4c, 0x69, 0x6d, 0x69, 0x74, 0x12, 0x4c, 0x0a, 0x0e, 0x6d, 0x69, 0x6e, 0x5f, 0x63, 0x6f, 0x6e,
	0x66, 0x69, 0x64, 0x65, 0x6e, 0x63, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x1b, 0x2e,
	0x61, 0x73, 0x67, 0x74, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x64,
	0x65, 0x6e, 0x63, 0x65, 0x2e, 0x4c, 0x65, 0x76, 0x65, 0x6c, 0x42, 0x08, 0xfa, 0x42, 0x05, 0x82,
	0x01, 0x02, 0x10, 0x01, 0x52, 0x0d, 0x6d, 0x69, 0x6e, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x64, 0x65,
	0x6e, 0x63, 0x65, 0x3a, 0x19, 0x92, 0x41, 0x16, 0x32, 0x14, 0x7b, 0x22, 0x73, 0x75, 0x67, 0x67,
	0x65, 0x73, 0x74, 0x5f, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x22, 0x3a, 0x20, 0x33, 0x7d, 0x22, 0xba,
	0x01, 0x0a, 0x0e, 0x53, 0x75, 0x67, 0x67, 0x65, 0x73, 0x74, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73,
	0x74, 0x12, 0x4b, 0x0a, 0x0c, 0x64, 0x61, 0x74, 0x61, 0x73, 0x65, 0x74, 0x5f, 0x6e, 0x61, 0x6d,
	0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x28, 0xfa, 0x42, 0x25, 0x72, 0x23, 0x28, 0x80,
	0x02, 0x32, 0x1e, 0x5e, 0x5b, 0x41, 0x2d, 0x5a, 0x61, 0x2d, 0x7a, 0x30, 0x2d, 0x39, 0x2e, 0x5d,
	0x5b, 0x41, 0x2d, 0x5a, 0x61, 0x2d, 0x7a, 0x30, 0x2d, 0x39, 0x5f, 0x2e, 0x3e, 0x2d, 0x5d, 0x2a,
	0x24, 0x52, 0x0b, 0x64, 0x61, 0x74, 0x61, 0x73, 0x65, 0x74, 0x4e, 0x61, 0x6d, 0x65, 0x12, 0x28,
	0x0a, 0x05, 0x69, 0x6e, 0x70, 0x75, 0x74, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x12, 0x2e,
	0x61, 0x73, 0x67, 0x74, 0x2e, 0x76, 0x32, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x44, 0x61, 0x74,
	0x61, 0x52, 0x05, 0x69, 0x6e, 0x70, 0x75, 0x74, 0x12, 0x31, 0x0a, 0x07, 0x6f, 0x70, 0x74, 0x69,
	0x6f, 0x6e, 0x73, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x17, 0x2e, 0x61, 0x73, 0x67, 0x74,
	0x2e, 0x76, 0x32, 0x2e, 0x53, 0x75, 0x67, 0x67, 0x65, 0x73, 0x74, 0x4f, 0x70, 0x74, 0x69, 0x6f,
	0x6e, 0x73, 0x52, 0x07, 0x6f, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x22, 0x70, 0x0a, 0x0f, 0x53,
	0x75, 0x67, 0x67, 0x65, 0x73, 0x74, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x35,
	0x0a, 0x0a, 0x70, 0x72, 0x65, 0x64, 0x69, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x01, 0x20, 0x01,
	0x28, 0x0b, 0x32, 0x15, 0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x50,
	0x72, 0x65, 0x64, 0x69, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x0a, 0x70, 0x72, 0x65, 0x64, 0x69,
	0x63, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x26, 0x0a, 0x05, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x18, 0x02,
	0x20, 0x01, 0x28, 0x0b, 0x32, 0x10, 0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x74, 0x79, 0x70, 0x65,
	0x2e, 0x4d, 0x6f, 0x64, 0x65, 0x6c, 0x52, 0x05, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x22, 0xc1, 0x01,
	0x0a, 0x13, 0x42, 0x61, 0x74, 0x63, 0x68, 0x53, 0x75, 0x67, 0x67, 0x65, 0x73, 0x74, 0x52, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x4b, 0x0a, 0x0c, 0x64, 0x61, 0x74, 0x61, 0x73, 0x65, 0x74,
	0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x28, 0xfa, 0x42, 0x25,
	0x72, 0x23, 0x28, 0x80, 0x02, 0x32, 0x1e, 0x5e, 0x5b, 0x41, 0x2d, 0x5a, 0x61, 0x2d, 0x7a, 0x30,
	0x2d, 0x39, 0x2e, 0x5d, 0x5b, 0x41, 0x2d, 0x5a, 0x61, 0x2d, 0x7a, 0x30, 0x2d, 0x39, 0x5f, 0x2e,
	0x3e, 0x2d, 0x5d, 0x2a, 0x24, 0x52, 0x0b, 0x64, 0x61, 0x74, 0x61, 0x73, 0x65, 0x74, 0x4e, 0x61,
	0x6d, 0x65, 0x12, 0x2a, 0x0a, 0x06, 0x69, 0x6e, 0x70, 0x75, 0x74, 0x73, 0x18, 0x02, 0x20, 0x03,
	0x28, 0x0b, 0x32, 0x12, 0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x76, 0x32, 0x2e, 0x74, 0x79, 0x70,
	0x65, 0x2e, 0x44, 0x61, 0x74, 0x61, 0x52, 0x06, 0x69, 0x6e, 0x70, 0x75, 0x74, 0x73, 0x12, 0x31,
	0x0a, 0x07, 0x6f, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32,
	0x17, 0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x76, 0x32, 0x2e, 0x53, 0x75, 0x67, 0x67, 0x65, 0x73,
	0x74, 0x4f, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x52, 0x07, 0x6f, 0x70, 0x74, 0x69, 0x6f, 0x6e,
	0x73, 0x22, 0x77, 0x0a, 0x14, 0x42, 0x61, 0x74, 0x63, 0x68, 0x53, 0x75, 0x67, 0x67, 0x65, 0x73,
	0x74, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x37, 0x0a, 0x0b, 0x70, 0x72, 0x65,
	0x64, 0x69, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x15,
	0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x50, 0x72, 0x65, 0x64, 0x69,
	0x63, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x0b, 0x70, 0x72, 0x65, 0x64, 0x69, 0x63, 0x74, 0x69, 0x6f,
	0x6e, 0x73, 0x12, 0x26, 0x0a, 0x05, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x18, 0x02, 0x20, 0x01, 0x28,
	0x0b, 0x32, 0x10, 0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x4d, 0x6f,
	0x64, 0x65, 0x6c, 0x52, 0x05, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x32, 0xbb, 0x03, 0x0a, 0x10, 0x53,
	0x75, 0x67, 0x67, 0x65, 0x73, 0x74, 0x65, 0x72, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x12,
	0x6c, 0x0a, 0x07, 0x53, 0x75, 0x67, 0x67, 0x65, 0x73, 0x74, 0x12, 0x17, 0x2e, 0x61, 0x73, 0x67,
	0x74, 0x2e, 0x76, 0x32, 0x2e, 0x53, 0x75, 0x67, 0x67, 0x65, 0x73, 0x74, 0x52, 0x65, 0x71, 0x75,
	0x65, 0x73, 0x74, 0x1a, 0x18, 0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x76, 0x32, 0x2e, 0x53, 0x75,
	0x67, 0x67, 0x65, 0x73, 0x74, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x2e, 0x82,
	0xd3, 0xe4, 0x93, 0x02, 0x28, 0x3a, 0x01, 0x2a, 0x22, 0x23, 0x2f, 0x76, 0x32, 0x2f, 0x64, 0x61,
	0x74, 0x61, 0x73, 0x65, 0x74, 0x73, 0x2f, 0x7b, 0x64, 0x61, 0x74, 0x61, 0x73, 0x65, 0x74, 0x5f,
	0x6e, 0x61, 0x6d, 0x65, 0x7d, 0x3a, 0x73, 0x75, 0x67, 0x67, 0x65, 0x73, 0x74, 0x12, 0x80, 0x01,
	0x0a, 0x0c, 0x42, 0x61, 0x74, 0x63, 0x68, 0x53, 0x75, 0x67, 0x67, 0x65, 0x73, 0x74, 0x12, 0x1c,
	0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x76, 0x32, 0x2e, 0x42, 0x61, 0x74, 0x63, 0x68, 0x53, 0x75,
	0x67, 0x67, 0x65, 0x73, 0x74, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x1d, 0x2e, 0x61,
	0x73, 0x67, 0x74, 0x2e, 0x76, 0x32, 0x2e, 0x42, 0x61, 0x74, 0x63, 0x68, 0x53, 0x75, 0x67, 0x67,
	0x65, 0x73, 0x74, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x33, 0x82, 0xd3, 0xe4,
	0x93, 0x02, 0x2d, 0x3a, 0x01, 0x2a, 0x22, 0x28, 0x2f, 0x76, 0x32, 0x2f, 0x64, 0x61, 0x74, 0x61,
	0x73, 0x65, 0x74, 0x73, 0x2f, 0x7b, 0x64, 0x61, 0x74, 0x61, 0x73, 0x65, 0x74, 0x5f, 0x6e, 0x61,
	0x6d, 0x65, 0x7d, 0x3a, 0x62, 0x61, 0x74, 0x63, 0x68, 0x53, 0x75, 0x67, 0x67, 0x65, 0x73, 0x74,
	0x12, 0x8b, 0x01, 0x0a, 0x11, 0x4d, 0x6f, 0x64, 0x65, 0x6c, 0x42, 0x61, 0x74, 0x63, 0x68, 0x53,
	0x75, 0x67, 0x67, 0x65, 0x73, 0x74, 0x12, 0x1c, 0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x76, 0x32,
	0x2e, 0x42, 0x61, 0x74, 0x63, 0x68, 0x53, 0x75, 0x67, 0x67, 0x65, 0x73, 0x74, 0x52, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x1a, 0x1d, 0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x76, 0x32, 0x2e, 0x42,
	0x61, 0x74, 0x63, 0x68, 0x53, 0x75, 0x67, 0x67, 0x65, 0x73, 0x74, 0x52, 0x65, 0x73, 0x70, 0x6f,
	0x6e, 0x73, 0x65, 0x22, 0x39, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x33, 0x3a, 0x01, 0x2a, 0x22, 0x2e,
	0x2f, 0x76, 0x32, 0x2f, 0x64, 0x61, 0x74, 0x61, 0x73, 0x65, 0x74, 0x73, 0x2f, 0x7b, 0x64, 0x61,
	0x74, 0x61, 0x73, 0x65, 0x74, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x7d, 0x2f, 0x6d, 0x6f, 0x64, 0x65,
	0x6c, 0x3a, 0x62, 0x61, 0x74, 0x63, 0x68, 0x53, 0x75, 0x67, 0x67, 0x65, 0x73, 0x74, 0x1a, 0x28,
	0x92, 0x41, 0x25, 0x12, 0x23, 0x4d, 0x61, 0x6b, 0x65, 0x20, 0x70, 0x72, 0x65, 0x64, 0x69, 0x63,
	0x74, 0x69, 0x6f, 0x6e, 0x73, 0x20, 0x61, 0x67, 0x61, 0x69, 0x6e, 0x73, 0x74, 0x20, 0x61, 0x20,
	0x64, 0x61, 0x74, 0x61, 0x73, 0x65, 0x74, 0x2e, 0x42, 0x6a, 0x5a, 0x2b, 0x67, 0x69, 0x74, 0x68,
	0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x65, 0x2d, 0x63, 0x6f, 0x6e, 0x6f, 0x6d, 0x69, 0x63,
	0x2f, 0x76, 0x6d, 0x6c, 0x61, 0x70, 0x69, 0x73, 0x2f, 0x67, 0x65, 0x6e, 0x2f, 0x67, 0x6f, 0x2f,
	0x61, 0x73, 0x67, 0x74, 0x2f, 0x76, 0x32, 0x92, 0x41, 0x3a, 0x12, 0x11, 0x0a, 0x0b, 0x41, 0x75,
	0x74, 0x6f, 0x53, 0x75, 0x67, 0x67, 0x65, 0x73, 0x74, 0x32, 0x02, 0x76, 0x32, 0x2a, 0x01, 0x02,
	0x32, 0x10, 0x61, 0x70, 0x70, 0x6c, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x2f, 0x6a, 0x73,
	0x6f, 0x6e, 0x3a, 0x10, 0x61, 0x70, 0x70, 0x6c, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x2f,
	0x6a, 0x73, 0x6f, 0x6e, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_asgt_v2_suggester_service_proto_rawDescOnce sync.Once
	file_asgt_v2_suggester_service_proto_rawDescData = file_asgt_v2_suggester_service_proto_rawDesc
)

func file_asgt_v2_suggester_service_proto_rawDescGZIP() []byte {
	file_asgt_v2_suggester_service_proto_rawDescOnce.Do(func() {
		file_asgt_v2_suggester_service_proto_rawDescData = protoimpl.X.CompressGZIP(file_asgt_v2_suggester_service_proto_rawDescData)
	})
	return file_asgt_v2_suggester_service_proto_rawDescData
}

var file_asgt_v2_suggester_service_proto_msgTypes = make([]protoimpl.MessageInfo, 5)
var file_asgt_v2_suggester_service_proto_goTypes = []interface{}{
	(*SuggestOptions)(nil),       // 0: asgt.v2.SuggestOptions
	(*SuggestRequest)(nil),       // 1: asgt.v2.SuggestRequest
	(*SuggestResponse)(nil),      // 2: asgt.v2.SuggestResponse
	(*BatchSuggestRequest)(nil),  // 3: asgt.v2.BatchSuggestRequest
	(*BatchSuggestResponse)(nil), // 4: asgt.v2.BatchSuggestResponse
	(_type.Confidence_Level)(0),  // 5: asgt.type.Confidence.Level
	(*_type1.Data)(nil),          // 6: asgt.v2.type.Data
	(*_type.Prediction)(nil),     // 7: asgt.type.Prediction
	(*_type.Model)(nil),          // 8: asgt.type.Model
}
var file_asgt_v2_suggester_service_proto_depIdxs = []int32{
	5,  // 0: asgt.v2.SuggestOptions.min_confidence:type_name -> asgt.type.Confidence.Level
	6,  // 1: asgt.v2.SuggestRequest.input:type_name -> asgt.v2.type.Data
	0,  // 2: asgt.v2.SuggestRequest.options:type_name -> asgt.v2.SuggestOptions
	7,  // 3: asgt.v2.SuggestResponse.prediction:type_name -> asgt.type.Prediction
	8,  // 4: asgt.v2.SuggestResponse.model:type_name -> asgt.type.Model
	6,  // 5: asgt.v2.BatchSuggestRequest.inputs:type_name -> asgt.v2.type.Data
	0,  // 6: asgt.v2.BatchSuggestRequest.options:type_name -> asgt.v2.SuggestOptions
	7,  // 7: asgt.v2.BatchSuggestResponse.predictions:type_name -> asgt.type.Prediction
	8,  // 8: asgt.v2.BatchSuggestResponse.model:type_name -> asgt.type.Model
	1,  // 9: asgt.v2.SuggesterService.Suggest:input_type -> asgt.v2.SuggestRequest
	3,  // 10: asgt.v2.SuggesterService.BatchSuggest:input_type -> asgt.v2.BatchSuggestRequest
	3,  // 11: asgt.v2.SuggesterService.ModelBatchSuggest:input_type -> asgt.v2.BatchSuggestRequest
	2,  // 12: asgt.v2.SuggesterService.Suggest:output_type -> asgt.v2.SuggestResponse
	4,  // 13: asgt.v2.SuggesterService.BatchSuggest:output_type -> asgt.v2.BatchSuggestResponse
	4,  // 14: asgt.v2.SuggesterService.ModelBatchSuggest:output_type -> asgt.v2.BatchSuggestResponse
	12, // [12:15] is the sub-list for method output_type
	9,  // [9:12] is the sub-list for method input_type
	9,  // [9:9] is the sub-list for extension type_name
	9,  // [9:9] is the sub-list for extension extendee
	0,  // [0:9] is the sub-list for field type_name
}

func init() { file_asgt_v2_suggester_service_proto_init() }
func file_asgt_v2_suggester_service_proto_init() {
	if File_asgt_v2_suggester_service_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_asgt_v2_suggester_service_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SuggestOptions); i {
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
		file_asgt_v2_suggester_service_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SuggestRequest); i {
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
		file_asgt_v2_suggester_service_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SuggestResponse); i {
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
		file_asgt_v2_suggester_service_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*BatchSuggestRequest); i {
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
		file_asgt_v2_suggester_service_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*BatchSuggestResponse); i {
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
			RawDescriptor: file_asgt_v2_suggester_service_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   5,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_asgt_v2_suggester_service_proto_goTypes,
		DependencyIndexes: file_asgt_v2_suggester_service_proto_depIdxs,
		MessageInfos:      file_asgt_v2_suggester_service_proto_msgTypes,
	}.Build()
	File_asgt_v2_suggester_service_proto = out.File
	file_asgt_v2_suggester_service_proto_rawDesc = nil
	file_asgt_v2_suggester_service_proto_goTypes = nil
	file_asgt_v2_suggester_service_proto_depIdxs = nil
}
