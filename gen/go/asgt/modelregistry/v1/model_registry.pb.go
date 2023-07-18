// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.31.0
// 	protoc        (unknown)
// source: asgt/modelregistry/v1/model_registry.proto

package modelregistry

import (
	_type "github.com/e-conomic/vmlapis/gen/go/asgt/type"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	emptypb "google.golang.org/protobuf/types/known/emptypb"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

type RegisterModelRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Dataset           *_type.Dataset           `protobuf:"bytes,1,opt,name=dataset,proto3" json:"dataset,omitempty"`
	Revision          *_type.Revision          `protobuf:"bytes,2,opt,name=revision,proto3" json:"revision,omitempty"`
	ModelVersion      int64                    `protobuf:"varint,3,opt,name=model_version,json=modelVersion,proto3" json:"model_version,omitempty"`
	Metrics           map[string]int32         `protobuf:"bytes,4,rep,name=metrics,proto3" json:"metrics,omitempty" protobuf_key:"bytes,1,opt,name=key,proto3" protobuf_val:"varint,2,opt,name=value,proto3"`
	TargetMetrics     []*_type.TargetMetrics   `protobuf:"bytes,5,rep,name=target_metrics,json=targetMetrics,proto3" json:"target_metrics,omitempty"`
	InputType         _type.Model_InputType    `protobuf:"varint,6,opt,name=input_type,json=inputType,proto3,enum=asgt.type.Model_InputType" json:"input_type,omitempty"`
	TrainStatistics   *_type.TrainStatistics   `protobuf:"bytes,7,opt,name=train_statistics,json=trainStatistics,proto3" json:"train_statistics,omitempty"`
	DatasetStatistics *_type.DatasetStatistics `protobuf:"bytes,8,opt,name=dataset_statistics,json=datasetStatistics,proto3" json:"dataset_statistics,omitempty"`
}

func (x *RegisterModelRequest) Reset() {
	*x = RegisterModelRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_asgt_modelregistry_v1_model_registry_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *RegisterModelRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*RegisterModelRequest) ProtoMessage() {}

func (x *RegisterModelRequest) ProtoReflect() protoreflect.Message {
	mi := &file_asgt_modelregistry_v1_model_registry_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use RegisterModelRequest.ProtoReflect.Descriptor instead.
func (*RegisterModelRequest) Descriptor() ([]byte, []int) {
	return file_asgt_modelregistry_v1_model_registry_proto_rawDescGZIP(), []int{0}
}

func (x *RegisterModelRequest) GetDataset() *_type.Dataset {
	if x != nil {
		return x.Dataset
	}
	return nil
}

func (x *RegisterModelRequest) GetRevision() *_type.Revision {
	if x != nil {
		return x.Revision
	}
	return nil
}

func (x *RegisterModelRequest) GetModelVersion() int64 {
	if x != nil {
		return x.ModelVersion
	}
	return 0
}

func (x *RegisterModelRequest) GetMetrics() map[string]int32 {
	if x != nil {
		return x.Metrics
	}
	return nil
}

func (x *RegisterModelRequest) GetTargetMetrics() []*_type.TargetMetrics {
	if x != nil {
		return x.TargetMetrics
	}
	return nil
}

func (x *RegisterModelRequest) GetInputType() _type.Model_InputType {
	if x != nil {
		return x.InputType
	}
	return _type.Model_InputType(0)
}

func (x *RegisterModelRequest) GetTrainStatistics() *_type.TrainStatistics {
	if x != nil {
		return x.TrainStatistics
	}
	return nil
}

func (x *RegisterModelRequest) GetDatasetStatistics() *_type.DatasetStatistics {
	if x != nil {
		return x.DatasetStatistics
	}
	return nil
}

type GetCurrentModelRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Dataset *_type.Dataset `protobuf:"bytes,1,opt,name=dataset,proto3" json:"dataset,omitempty"`
}

func (x *GetCurrentModelRequest) Reset() {
	*x = GetCurrentModelRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_asgt_modelregistry_v1_model_registry_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GetCurrentModelRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GetCurrentModelRequest) ProtoMessage() {}

func (x *GetCurrentModelRequest) ProtoReflect() protoreflect.Message {
	mi := &file_asgt_modelregistry_v1_model_registry_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GetCurrentModelRequest.ProtoReflect.Descriptor instead.
func (*GetCurrentModelRequest) Descriptor() ([]byte, []int) {
	return file_asgt_modelregistry_v1_model_registry_proto_rawDescGZIP(), []int{1}
}

func (x *GetCurrentModelRequest) GetDataset() *_type.Dataset {
	if x != nil {
		return x.Dataset
	}
	return nil
}

type GetCurrentModelResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Model *_type.Model `protobuf:"bytes,1,opt,name=model,proto3" json:"model,omitempty"`
}

func (x *GetCurrentModelResponse) Reset() {
	*x = GetCurrentModelResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_asgt_modelregistry_v1_model_registry_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GetCurrentModelResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GetCurrentModelResponse) ProtoMessage() {}

func (x *GetCurrentModelResponse) ProtoReflect() protoreflect.Message {
	mi := &file_asgt_modelregistry_v1_model_registry_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GetCurrentModelResponse.ProtoReflect.Descriptor instead.
func (*GetCurrentModelResponse) Descriptor() ([]byte, []int) {
	return file_asgt_modelregistry_v1_model_registry_proto_rawDescGZIP(), []int{2}
}

func (x *GetCurrentModelResponse) GetModel() *_type.Model {
	if x != nil {
		return x.Model
	}
	return nil
}

var File_asgt_modelregistry_v1_model_registry_proto protoreflect.FileDescriptor

var file_asgt_modelregistry_v1_model_registry_proto_rawDesc = []byte{
	0x0a, 0x2a, 0x61, 0x73, 0x67, 0x74, 0x2f, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x72, 0x65, 0x67, 0x69,
	0x73, 0x74, 0x72, 0x79, 0x2f, 0x76, 0x31, 0x2f, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x5f, 0x72, 0x65,
	0x67, 0x69, 0x73, 0x74, 0x72, 0x79, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x15, 0x61, 0x73,
	0x67, 0x74, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x72, 0x65, 0x67, 0x69, 0x73, 0x74, 0x72, 0x79,
	0x2e, 0x76, 0x31, 0x1a, 0x17, 0x61, 0x73, 0x67, 0x74, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x2f, 0x64,
	0x61, 0x74, 0x61, 0x73, 0x65, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x22, 0x61, 0x73,
	0x67, 0x74, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x2f, 0x64, 0x61, 0x74, 0x61, 0x73, 0x65, 0x74, 0x5f,
	0x73, 0x74, 0x61, 0x74, 0x69, 0x73, 0x74, 0x69, 0x63, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x1a, 0x15, 0x61, 0x73, 0x67, 0x74, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x2f, 0x6d, 0x6f, 0x64, 0x65,
	0x6c, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x18, 0x61, 0x73, 0x67, 0x74, 0x2f, 0x74, 0x79,
	0x70, 0x65, 0x2f, 0x72, 0x65, 0x76, 0x69, 0x73, 0x69, 0x6f, 0x6e, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x1a, 0x1e, 0x61, 0x73, 0x67, 0x74, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x2f, 0x74, 0x61, 0x72,
	0x67, 0x65, 0x74, 0x5f, 0x6d, 0x65, 0x74, 0x72, 0x69, 0x63, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x1a, 0x20, 0x61, 0x73, 0x67, 0x74, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x2f, 0x74, 0x72, 0x61,
	0x69, 0x6e, 0x5f, 0x73, 0x74, 0x61, 0x74, 0x69, 0x73, 0x74, 0x69, 0x63, 0x73, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x1a, 0x1b, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x62, 0x75, 0x66, 0x2f, 0x65, 0x6d, 0x70, 0x74, 0x79, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x22, 0xba, 0x04, 0x0a, 0x14, 0x52, 0x65, 0x67, 0x69, 0x73, 0x74, 0x65, 0x72, 0x4d, 0x6f, 0x64,
	0x65, 0x6c, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x2c, 0x0a, 0x07, 0x64, 0x61, 0x74,
	0x61, 0x73, 0x65, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x12, 0x2e, 0x61, 0x73, 0x67,
	0x74, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x44, 0x61, 0x74, 0x61, 0x73, 0x65, 0x74, 0x52, 0x07,
	0x64, 0x61, 0x74, 0x61, 0x73, 0x65, 0x74, 0x12, 0x2f, 0x0a, 0x08, 0x72, 0x65, 0x76, 0x69, 0x73,
	0x69, 0x6f, 0x6e, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x13, 0x2e, 0x61, 0x73, 0x67, 0x74,
	0x2e, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x52, 0x65, 0x76, 0x69, 0x73, 0x69, 0x6f, 0x6e, 0x52, 0x08,
	0x72, 0x65, 0x76, 0x69, 0x73, 0x69, 0x6f, 0x6e, 0x12, 0x23, 0x0a, 0x0d, 0x6d, 0x6f, 0x64, 0x65,
	0x6c, 0x5f, 0x76, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x18, 0x03, 0x20, 0x01, 0x28, 0x03, 0x52,
	0x0c, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x56, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x12, 0x52, 0x0a,
	0x07, 0x6d, 0x65, 0x74, 0x72, 0x69, 0x63, 0x73, 0x18, 0x04, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x38,
	0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x72, 0x65, 0x67, 0x69, 0x73,
	0x74, 0x72, 0x79, 0x2e, 0x76, 0x31, 0x2e, 0x52, 0x65, 0x67, 0x69, 0x73, 0x74, 0x65, 0x72, 0x4d,
	0x6f, 0x64, 0x65, 0x6c, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x4d, 0x65, 0x74, 0x72,
	0x69, 0x63, 0x73, 0x45, 0x6e, 0x74, 0x72, 0x79, 0x52, 0x07, 0x6d, 0x65, 0x74, 0x72, 0x69, 0x63,
	0x73, 0x12, 0x3f, 0x0a, 0x0e, 0x74, 0x61, 0x72, 0x67, 0x65, 0x74, 0x5f, 0x6d, 0x65, 0x74, 0x72,
	0x69, 0x63, 0x73, 0x18, 0x05, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x18, 0x2e, 0x61, 0x73, 0x67, 0x74,
	0x2e, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x54, 0x61, 0x72, 0x67, 0x65, 0x74, 0x4d, 0x65, 0x74, 0x72,
	0x69, 0x63, 0x73, 0x52, 0x0d, 0x74, 0x61, 0x72, 0x67, 0x65, 0x74, 0x4d, 0x65, 0x74, 0x72, 0x69,
	0x63, 0x73, 0x12, 0x39, 0x0a, 0x0a, 0x69, 0x6e, 0x70, 0x75, 0x74, 0x5f, 0x74, 0x79, 0x70, 0x65,
	0x18, 0x06, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x1a, 0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x74, 0x79,
	0x70, 0x65, 0x2e, 0x4d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x49, 0x6e, 0x70, 0x75, 0x74, 0x54, 0x79,
	0x70, 0x65, 0x52, 0x09, 0x69, 0x6e, 0x70, 0x75, 0x74, 0x54, 0x79, 0x70, 0x65, 0x12, 0x45, 0x0a,
	0x10, 0x74, 0x72, 0x61, 0x69, 0x6e, 0x5f, 0x73, 0x74, 0x61, 0x74, 0x69, 0x73, 0x74, 0x69, 0x63,
	0x73, 0x18, 0x07, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1a, 0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x74,
	0x79, 0x70, 0x65, 0x2e, 0x54, 0x72, 0x61, 0x69, 0x6e, 0x53, 0x74, 0x61, 0x74, 0x69, 0x73, 0x74,
	0x69, 0x63, 0x73, 0x52, 0x0f, 0x74, 0x72, 0x61, 0x69, 0x6e, 0x53, 0x74, 0x61, 0x74, 0x69, 0x73,
	0x74, 0x69, 0x63, 0x73, 0x12, 0x4b, 0x0a, 0x12, 0x64, 0x61, 0x74, 0x61, 0x73, 0x65, 0x74, 0x5f,
	0x73, 0x74, 0x61, 0x74, 0x69, 0x73, 0x74, 0x69, 0x63, 0x73, 0x18, 0x08, 0x20, 0x01, 0x28, 0x0b,
	0x32, 0x1c, 0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x44, 0x61, 0x74,
	0x61, 0x73, 0x65, 0x74, 0x53, 0x74, 0x61, 0x74, 0x69, 0x73, 0x74, 0x69, 0x63, 0x73, 0x52, 0x11,
	0x64, 0x61, 0x74, 0x61, 0x73, 0x65, 0x74, 0x53, 0x74, 0x61, 0x74, 0x69, 0x73, 0x74, 0x69, 0x63,
	0x73, 0x1a, 0x3a, 0x0a, 0x0c, 0x4d, 0x65, 0x74, 0x72, 0x69, 0x63, 0x73, 0x45, 0x6e, 0x74, 0x72,
	0x79, 0x12, 0x10, 0x0a, 0x03, 0x6b, 0x65, 0x79, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x03,
	0x6b, 0x65, 0x79, 0x12, 0x14, 0x0a, 0x05, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x18, 0x02, 0x20, 0x01,
	0x28, 0x05, 0x52, 0x05, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x3a, 0x02, 0x38, 0x01, 0x22, 0x46, 0x0a,
	0x16, 0x47, 0x65, 0x74, 0x43, 0x75, 0x72, 0x72, 0x65, 0x6e, 0x74, 0x4d, 0x6f, 0x64, 0x65, 0x6c,
	0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x2c, 0x0a, 0x07, 0x64, 0x61, 0x74, 0x61, 0x73,
	0x65, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x12, 0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e,
	0x74, 0x79, 0x70, 0x65, 0x2e, 0x44, 0x61, 0x74, 0x61, 0x73, 0x65, 0x74, 0x52, 0x07, 0x64, 0x61,
	0x74, 0x61, 0x73, 0x65, 0x74, 0x22, 0x41, 0x0a, 0x17, 0x47, 0x65, 0x74, 0x43, 0x75, 0x72, 0x72,
	0x65, 0x6e, 0x74, 0x4d, 0x6f, 0x64, 0x65, 0x6c, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65,
	0x12, 0x26, 0x0a, 0x05, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32,
	0x10, 0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x4d, 0x6f, 0x64, 0x65,
	0x6c, 0x52, 0x05, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x32, 0xd7, 0x01, 0x0a, 0x0d, 0x4d, 0x6f, 0x64,
	0x65, 0x6c, 0x52, 0x65, 0x67, 0x69, 0x73, 0x74, 0x72, 0x79, 0x12, 0x54, 0x0a, 0x0d, 0x52, 0x65,
	0x67, 0x69, 0x73, 0x74, 0x65, 0x72, 0x4d, 0x6f, 0x64, 0x65, 0x6c, 0x12, 0x2b, 0x2e, 0x61, 0x73,
	0x67, 0x74, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x72, 0x65, 0x67, 0x69, 0x73, 0x74, 0x72, 0x79,
	0x2e, 0x76, 0x31, 0x2e, 0x52, 0x65, 0x67, 0x69, 0x73, 0x74, 0x65, 0x72, 0x4d, 0x6f, 0x64, 0x65,
	0x6c, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x16, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79,
	0x12, 0x70, 0x0a, 0x0f, 0x47, 0x65, 0x74, 0x43, 0x75, 0x72, 0x72, 0x65, 0x6e, 0x74, 0x4d, 0x6f,
	0x64, 0x65, 0x6c, 0x12, 0x2d, 0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c,
	0x72, 0x65, 0x67, 0x69, 0x73, 0x74, 0x72, 0x79, 0x2e, 0x76, 0x31, 0x2e, 0x47, 0x65, 0x74, 0x43,
	0x75, 0x72, 0x72, 0x65, 0x6e, 0x74, 0x4d, 0x6f, 0x64, 0x65, 0x6c, 0x52, 0x65, 0x71, 0x75, 0x65,
	0x73, 0x74, 0x1a, 0x2e, 0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x72,
	0x65, 0x67, 0x69, 0x73, 0x74, 0x72, 0x79, 0x2e, 0x76, 0x31, 0x2e, 0x47, 0x65, 0x74, 0x43, 0x75,
	0x72, 0x72, 0x65, 0x6e, 0x74, 0x4d, 0x6f, 0x64, 0x65, 0x6c, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e,
	0x73, 0x65, 0x42, 0xf3, 0x01, 0x0a, 0x1e, 0x61, 0x69, 0x2e, 0x76, 0x69, 0x73, 0x6d, 0x61, 0x2e,
	0x61, 0x73, 0x67, 0x74, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x72, 0x65, 0x67, 0x69, 0x73, 0x74,
	0x72, 0x79, 0x2e, 0x76, 0x31, 0x42, 0x12, 0x4d, 0x6f, 0x64, 0x65, 0x6c, 0x52, 0x65, 0x67, 0x69,
	0x73, 0x74, 0x72, 0x79, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x47, 0x67, 0x69, 0x74,
	0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x65, 0x2d, 0x63, 0x6f, 0x6e, 0x6f, 0x6d, 0x69,
	0x63, 0x2f, 0x76, 0x6d, 0x6c, 0x61, 0x70, 0x69, 0x73, 0x2f, 0x67, 0x65, 0x6e, 0x2f, 0x67, 0x6f,
	0x2f, 0x61, 0x73, 0x67, 0x74, 0x2f, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x72, 0x65, 0x67, 0x69, 0x73,
	0x74, 0x72, 0x79, 0x2f, 0x76, 0x31, 0x3b, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x72, 0x65, 0x67, 0x69,
	0x73, 0x74, 0x72, 0x79, 0xa2, 0x02, 0x03, 0x41, 0x4d, 0x58, 0xaa, 0x02, 0x15, 0x41, 0x73, 0x67,
	0x74, 0x2e, 0x4d, 0x6f, 0x64, 0x65, 0x6c, 0x72, 0x65, 0x67, 0x69, 0x73, 0x74, 0x72, 0x79, 0x2e,
	0x56, 0x31, 0xca, 0x02, 0x15, 0x41, 0x73, 0x67, 0x74, 0x5c, 0x4d, 0x6f, 0x64, 0x65, 0x6c, 0x72,
	0x65, 0x67, 0x69, 0x73, 0x74, 0x72, 0x79, 0x5c, 0x56, 0x31, 0xe2, 0x02, 0x21, 0x41, 0x73, 0x67,
	0x74, 0x5c, 0x4d, 0x6f, 0x64, 0x65, 0x6c, 0x72, 0x65, 0x67, 0x69, 0x73, 0x74, 0x72, 0x79, 0x5c,
	0x56, 0x31, 0x5c, 0x47, 0x50, 0x42, 0x4d, 0x65, 0x74, 0x61, 0x64, 0x61, 0x74, 0x61, 0xea, 0x02,
	0x17, 0x41, 0x73, 0x67, 0x74, 0x3a, 0x3a, 0x4d, 0x6f, 0x64, 0x65, 0x6c, 0x72, 0x65, 0x67, 0x69,
	0x73, 0x74, 0x72, 0x79, 0x3a, 0x3a, 0x56, 0x31, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_asgt_modelregistry_v1_model_registry_proto_rawDescOnce sync.Once
	file_asgt_modelregistry_v1_model_registry_proto_rawDescData = file_asgt_modelregistry_v1_model_registry_proto_rawDesc
)

func file_asgt_modelregistry_v1_model_registry_proto_rawDescGZIP() []byte {
	file_asgt_modelregistry_v1_model_registry_proto_rawDescOnce.Do(func() {
		file_asgt_modelregistry_v1_model_registry_proto_rawDescData = protoimpl.X.CompressGZIP(file_asgt_modelregistry_v1_model_registry_proto_rawDescData)
	})
	return file_asgt_modelregistry_v1_model_registry_proto_rawDescData
}

var file_asgt_modelregistry_v1_model_registry_proto_msgTypes = make([]protoimpl.MessageInfo, 4)
var file_asgt_modelregistry_v1_model_registry_proto_goTypes = []interface{}{
	(*RegisterModelRequest)(nil),    // 0: asgt.modelregistry.v1.RegisterModelRequest
	(*GetCurrentModelRequest)(nil),  // 1: asgt.modelregistry.v1.GetCurrentModelRequest
	(*GetCurrentModelResponse)(nil), // 2: asgt.modelregistry.v1.GetCurrentModelResponse
	nil,                             // 3: asgt.modelregistry.v1.RegisterModelRequest.MetricsEntry
	(*_type.Dataset)(nil),           // 4: asgt.type.Dataset
	(*_type.Revision)(nil),          // 5: asgt.type.Revision
	(*_type.TargetMetrics)(nil),     // 6: asgt.type.TargetMetrics
	(_type.Model_InputType)(0),      // 7: asgt.type.Model.InputType
	(*_type.TrainStatistics)(nil),   // 8: asgt.type.TrainStatistics
	(*_type.DatasetStatistics)(nil), // 9: asgt.type.DatasetStatistics
	(*_type.Model)(nil),             // 10: asgt.type.Model
	(*emptypb.Empty)(nil),           // 11: google.protobuf.Empty
}
var file_asgt_modelregistry_v1_model_registry_proto_depIdxs = []int32{
	4,  // 0: asgt.modelregistry.v1.RegisterModelRequest.dataset:type_name -> asgt.type.Dataset
	5,  // 1: asgt.modelregistry.v1.RegisterModelRequest.revision:type_name -> asgt.type.Revision
	3,  // 2: asgt.modelregistry.v1.RegisterModelRequest.metrics:type_name -> asgt.modelregistry.v1.RegisterModelRequest.MetricsEntry
	6,  // 3: asgt.modelregistry.v1.RegisterModelRequest.target_metrics:type_name -> asgt.type.TargetMetrics
	7,  // 4: asgt.modelregistry.v1.RegisterModelRequest.input_type:type_name -> asgt.type.Model.InputType
	8,  // 5: asgt.modelregistry.v1.RegisterModelRequest.train_statistics:type_name -> asgt.type.TrainStatistics
	9,  // 6: asgt.modelregistry.v1.RegisterModelRequest.dataset_statistics:type_name -> asgt.type.DatasetStatistics
	4,  // 7: asgt.modelregistry.v1.GetCurrentModelRequest.dataset:type_name -> asgt.type.Dataset
	10, // 8: asgt.modelregistry.v1.GetCurrentModelResponse.model:type_name -> asgt.type.Model
	0,  // 9: asgt.modelregistry.v1.ModelRegistry.RegisterModel:input_type -> asgt.modelregistry.v1.RegisterModelRequest
	1,  // 10: asgt.modelregistry.v1.ModelRegistry.GetCurrentModel:input_type -> asgt.modelregistry.v1.GetCurrentModelRequest
	11, // 11: asgt.modelregistry.v1.ModelRegistry.RegisterModel:output_type -> google.protobuf.Empty
	2,  // 12: asgt.modelregistry.v1.ModelRegistry.GetCurrentModel:output_type -> asgt.modelregistry.v1.GetCurrentModelResponse
	11, // [11:13] is the sub-list for method output_type
	9,  // [9:11] is the sub-list for method input_type
	9,  // [9:9] is the sub-list for extension type_name
	9,  // [9:9] is the sub-list for extension extendee
	0,  // [0:9] is the sub-list for field type_name
}

func init() { file_asgt_modelregistry_v1_model_registry_proto_init() }
func file_asgt_modelregistry_v1_model_registry_proto_init() {
	if File_asgt_modelregistry_v1_model_registry_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_asgt_modelregistry_v1_model_registry_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*RegisterModelRequest); i {
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
		file_asgt_modelregistry_v1_model_registry_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GetCurrentModelRequest); i {
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
		file_asgt_modelregistry_v1_model_registry_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GetCurrentModelResponse); i {
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
			RawDescriptor: file_asgt_modelregistry_v1_model_registry_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   4,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_asgt_modelregistry_v1_model_registry_proto_goTypes,
		DependencyIndexes: file_asgt_modelregistry_v1_model_registry_proto_depIdxs,
		MessageInfos:      file_asgt_modelregistry_v1_model_registry_proto_msgTypes,
	}.Build()
	File_asgt_modelregistry_v1_model_registry_proto = out.File
	file_asgt_modelregistry_v1_model_registry_proto_rawDesc = nil
	file_asgt_modelregistry_v1_model_registry_proto_goTypes = nil
	file_asgt_modelregistry_v1_model_registry_proto_depIdxs = nil
}
