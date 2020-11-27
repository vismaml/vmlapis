// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.25.0
// 	protoc        v3.6.1
// source: asgt/data/v1/data_service.proto

package data

import (
	_type "github.com/e-conomic/vmlapis/gen/go/asgt/type"
	v1 "github.com/e-conomic/vmlapis/gen/go/ssn/dataservice/v1"
	_ "github.com/envoyproxy/protoc-gen-validate/validate"
	proto "github.com/golang/protobuf/proto"
	empty "github.com/golang/protobuf/ptypes/empty"
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

type CreateRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Name            string                 `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	Type            string                 `protobuf:"bytes,2,opt,name=type,proto3" json:"type,omitempty"`
	Tags            []string               `protobuf:"bytes,3,rep,name=tags,proto3" json:"tags,omitempty"`
	Targets         []string               `protobuf:"bytes,6,rep,name=targets,proto3" json:"targets,omitempty"`
	Samples         []*_type.Sample        `protobuf:"bytes,4,rep,name=samples,proto3" json:"samples,omitempty"`
	RetentionPolicy *_type.RetentionPolicy `protobuf:"bytes,5,opt,name=retention_policy,json=retentionPolicy,proto3" json:"retention_policy,omitempty"`
}

func (x *CreateRequest) Reset() {
	*x = CreateRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_asgt_data_v1_data_service_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CreateRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CreateRequest) ProtoMessage() {}

func (x *CreateRequest) ProtoReflect() protoreflect.Message {
	mi := &file_asgt_data_v1_data_service_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CreateRequest.ProtoReflect.Descriptor instead.
func (*CreateRequest) Descriptor() ([]byte, []int) {
	return file_asgt_data_v1_data_service_proto_rawDescGZIP(), []int{0}
}

func (x *CreateRequest) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *CreateRequest) GetType() string {
	if x != nil {
		return x.Type
	}
	return ""
}

func (x *CreateRequest) GetTags() []string {
	if x != nil {
		return x.Tags
	}
	return nil
}

func (x *CreateRequest) GetTargets() []string {
	if x != nil {
		return x.Targets
	}
	return nil
}

func (x *CreateRequest) GetSamples() []*_type.Sample {
	if x != nil {
		return x.Samples
	}
	return nil
}

func (x *CreateRequest) GetRetentionPolicy() *_type.RetentionPolicy {
	if x != nil {
		return x.RetentionPolicy
	}
	return nil
}

type AppendDataRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Name    string          `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	Type    string          `protobuf:"bytes,2,opt,name=type,proto3" json:"type,omitempty"`
	Samples []*_type.Sample `protobuf:"bytes,3,rep,name=samples,proto3" json:"samples,omitempty"`
}

func (x *AppendDataRequest) Reset() {
	*x = AppendDataRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_asgt_data_v1_data_service_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *AppendDataRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*AppendDataRequest) ProtoMessage() {}

func (x *AppendDataRequest) ProtoReflect() protoreflect.Message {
	mi := &file_asgt_data_v1_data_service_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use AppendDataRequest.ProtoReflect.Descriptor instead.
func (*AppendDataRequest) Descriptor() ([]byte, []int) {
	return file_asgt_data_v1_data_service_proto_rawDescGZIP(), []int{1}
}

func (x *AppendDataRequest) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *AppendDataRequest) GetType() string {
	if x != nil {
		return x.Type
	}
	return ""
}

func (x *AppendDataRequest) GetSamples() []*_type.Sample {
	if x != nil {
		return x.Samples
	}
	return nil
}

type DeleteRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Type string `protobuf:"bytes,1,opt,name=type,proto3" json:"type,omitempty"`
	// Types that are assignable to Match:
	//	*DeleteRequest_Name
	//	*DeleteRequest_Tag
	Match isDeleteRequest_Match `protobuf_oneof:"match"`
}

func (x *DeleteRequest) Reset() {
	*x = DeleteRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_asgt_data_v1_data_service_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *DeleteRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DeleteRequest) ProtoMessage() {}

func (x *DeleteRequest) ProtoReflect() protoreflect.Message {
	mi := &file_asgt_data_v1_data_service_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DeleteRequest.ProtoReflect.Descriptor instead.
func (*DeleteRequest) Descriptor() ([]byte, []int) {
	return file_asgt_data_v1_data_service_proto_rawDescGZIP(), []int{2}
}

func (x *DeleteRequest) GetType() string {
	if x != nil {
		return x.Type
	}
	return ""
}

func (m *DeleteRequest) GetMatch() isDeleteRequest_Match {
	if m != nil {
		return m.Match
	}
	return nil
}

func (x *DeleteRequest) GetName() string {
	if x, ok := x.GetMatch().(*DeleteRequest_Name); ok {
		return x.Name
	}
	return ""
}

func (x *DeleteRequest) GetTag() string {
	if x, ok := x.GetMatch().(*DeleteRequest_Tag); ok {
		return x.Tag
	}
	return ""
}

type isDeleteRequest_Match interface {
	isDeleteRequest_Match()
}

type DeleteRequest_Name struct {
	Name string `protobuf:"bytes,2,opt,name=name,proto3,oneof"`
}

type DeleteRequest_Tag struct {
	Tag string `protobuf:"bytes,3,opt,name=tag,proto3,oneof"`
}

func (*DeleteRequest_Name) isDeleteRequest_Match() {}

func (*DeleteRequest_Tag) isDeleteRequest_Match() {}

type GetInfoRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Name string `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	Type string `protobuf:"bytes,2,opt,name=type,proto3" json:"type,omitempty"`
}

func (x *GetInfoRequest) Reset() {
	*x = GetInfoRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_asgt_data_v1_data_service_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GetInfoRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GetInfoRequest) ProtoMessage() {}

func (x *GetInfoRequest) ProtoReflect() protoreflect.Message {
	mi := &file_asgt_data_v1_data_service_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GetInfoRequest.ProtoReflect.Descriptor instead.
func (*GetInfoRequest) Descriptor() ([]byte, []int) {
	return file_asgt_data_v1_data_service_proto_rawDescGZIP(), []int{3}
}

func (x *GetInfoRequest) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *GetInfoRequest) GetType() string {
	if x != nil {
		return x.Type
	}
	return ""
}

type UpdateDatasetRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Name            string                 `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	Type            string                 `protobuf:"bytes,2,opt,name=type,proto3" json:"type,omitempty"`
	RetentionPolicy *_type.RetentionPolicy `protobuf:"bytes,3,opt,name=retention_policy,json=retentionPolicy,proto3" json:"retention_policy,omitempty"`
}

func (x *UpdateDatasetRequest) Reset() {
	*x = UpdateDatasetRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_asgt_data_v1_data_service_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UpdateDatasetRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UpdateDatasetRequest) ProtoMessage() {}

func (x *UpdateDatasetRequest) ProtoReflect() protoreflect.Message {
	mi := &file_asgt_data_v1_data_service_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UpdateDatasetRequest.ProtoReflect.Descriptor instead.
func (*UpdateDatasetRequest) Descriptor() ([]byte, []int) {
	return file_asgt_data_v1_data_service_proto_rawDescGZIP(), []int{4}
}

func (x *UpdateDatasetRequest) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *UpdateDatasetRequest) GetType() string {
	if x != nil {
		return x.Type
	}
	return ""
}

func (x *UpdateDatasetRequest) GetRetentionPolicy() *_type.RetentionPolicy {
	if x != nil {
		return x.RetentionPolicy
	}
	return nil
}

type GetInfoResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Dataset *_type.Dataset `protobuf:"bytes,1,opt,name=dataset,proto3" json:"dataset,omitempty"`
	// The most recently trained model; empty if no model has been trained
	Model *_type.Model `protobuf:"bytes,2,opt,name=model,proto3" json:"model,omitempty"`
}

func (x *GetInfoResponse) Reset() {
	*x = GetInfoResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_asgt_data_v1_data_service_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GetInfoResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GetInfoResponse) ProtoMessage() {}

func (x *GetInfoResponse) ProtoReflect() protoreflect.Message {
	mi := &file_asgt_data_v1_data_service_proto_msgTypes[5]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GetInfoResponse.ProtoReflect.Descriptor instead.
func (*GetInfoResponse) Descriptor() ([]byte, []int) {
	return file_asgt_data_v1_data_service_proto_rawDescGZIP(), []int{5}
}

func (x *GetInfoResponse) GetDataset() *_type.Dataset {
	if x != nil {
		return x.Dataset
	}
	return nil
}

func (x *GetInfoResponse) GetModel() *_type.Model {
	if x != nil {
		return x.Model
	}
	return nil
}

type RegisterQueryStatsRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Dataset   string   `protobuf:"bytes,1,opt,name=dataset,proto3" json:"dataset,omitempty"`
	ModelType string   `protobuf:"bytes,2,opt,name=model_type,json=modelType,proto3" json:"model_type,omitempty"`
	BatchSize int32    `protobuf:"varint,3,opt,name=batch_size,json=batchSize,proto3" json:"batch_size,omitempty"`
	Tags      []string `protobuf:"bytes,4,rep,name=tags,proto3" json:"tags,omitempty"`
}

func (x *RegisterQueryStatsRequest) Reset() {
	*x = RegisterQueryStatsRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_asgt_data_v1_data_service_proto_msgTypes[6]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *RegisterQueryStatsRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*RegisterQueryStatsRequest) ProtoMessage() {}

func (x *RegisterQueryStatsRequest) ProtoReflect() protoreflect.Message {
	mi := &file_asgt_data_v1_data_service_proto_msgTypes[6]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use RegisterQueryStatsRequest.ProtoReflect.Descriptor instead.
func (*RegisterQueryStatsRequest) Descriptor() ([]byte, []int) {
	return file_asgt_data_v1_data_service_proto_rawDescGZIP(), []int{6}
}

func (x *RegisterQueryStatsRequest) GetDataset() string {
	if x != nil {
		return x.Dataset
	}
	return ""
}

func (x *RegisterQueryStatsRequest) GetModelType() string {
	if x != nil {
		return x.ModelType
	}
	return ""
}

func (x *RegisterQueryStatsRequest) GetBatchSize() int32 {
	if x != nil {
		return x.BatchSize
	}
	return 0
}

func (x *RegisterQueryStatsRequest) GetTags() []string {
	if x != nil {
		return x.Tags
	}
	return nil
}

var File_asgt_data_v1_data_service_proto protoreflect.FileDescriptor

var file_asgt_data_v1_data_service_proto_rawDesc = []byte{
	0x0a, 0x1f, 0x61, 0x73, 0x67, 0x74, 0x2f, 0x64, 0x61, 0x74, 0x61, 0x2f, 0x76, 0x31, 0x2f, 0x64,
	0x61, 0x74, 0x61, 0x5f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x12, 0x13, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x73, 0x65, 0x72, 0x76,
	0x69, 0x63, 0x65, 0x2e, 0x76, 0x31, 0x1a, 0x17, 0x61, 0x73, 0x67, 0x74, 0x2f, 0x74, 0x79, 0x70,
	0x65, 0x2f, 0x64, 0x61, 0x74, 0x61, 0x73, 0x65, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a,
	0x15, 0x61, 0x73, 0x67, 0x74, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x2f, 0x6d, 0x6f, 0x64, 0x65, 0x6c,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x20, 0x61, 0x73, 0x67, 0x74, 0x2f, 0x74, 0x79, 0x70,
	0x65, 0x2f, 0x72, 0x65, 0x74, 0x65, 0x6e, 0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x70, 0x6f, 0x6c, 0x69,
	0x63, 0x79, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x16, 0x61, 0x73, 0x67, 0x74, 0x2f, 0x74,
	0x79, 0x70, 0x65, 0x2f, 0x73, 0x61, 0x6d, 0x70, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x1a, 0x1c, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x61, 0x6e, 0x6e,
	0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1b,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f,
	0x65, 0x6d, 0x70, 0x74, 0x79, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x24, 0x73, 0x73, 0x6e,
	0x2f, 0x64, 0x61, 0x74, 0x61, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2f, 0x76, 0x31, 0x2f,
	0x64, 0x61, 0x74, 0x61, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x1a, 0x17, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x2f, 0x76, 0x61, 0x6c, 0x69,
	0x64, 0x61, 0x74, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0xf8, 0x01, 0x0a, 0x0d, 0x43,
	0x72, 0x65, 0x61, 0x74, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x12, 0x0a, 0x04,
	0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65,
	0x12, 0x12, 0x0a, 0x04, 0x74, 0x79, 0x70, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04,
	0x74, 0x79, 0x70, 0x65, 0x12, 0x12, 0x0a, 0x04, 0x74, 0x61, 0x67, 0x73, 0x18, 0x03, 0x20, 0x03,
	0x28, 0x09, 0x52, 0x04, 0x74, 0x61, 0x67, 0x73, 0x12, 0x37, 0x0a, 0x07, 0x74, 0x61, 0x72, 0x67,
	0x65, 0x74, 0x73, 0x18, 0x06, 0x20, 0x03, 0x28, 0x09, 0x42, 0x1d, 0xfa, 0x42, 0x1a, 0x92, 0x01,
	0x17, 0x22, 0x15, 0x72, 0x13, 0x28, 0x80, 0x02, 0x32, 0x0e, 0x5e, 0x5b, 0x30, 0x2d, 0x39, 0x41,
	0x2d, 0x5a, 0x61, 0x2d, 0x7a, 0x5d, 0x2b, 0x24, 0x52, 0x07, 0x74, 0x61, 0x72, 0x67, 0x65, 0x74,
	0x73, 0x12, 0x2b, 0x0a, 0x07, 0x73, 0x61, 0x6d, 0x70, 0x6c, 0x65, 0x73, 0x18, 0x04, 0x20, 0x03,
	0x28, 0x0b, 0x32, 0x11, 0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x53,
	0x61, 0x6d, 0x70, 0x6c, 0x65, 0x52, 0x07, 0x73, 0x61, 0x6d, 0x70, 0x6c, 0x65, 0x73, 0x12, 0x45,
	0x0a, 0x10, 0x72, 0x65, 0x74, 0x65, 0x6e, 0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x70, 0x6f, 0x6c, 0x69,
	0x63, 0x79, 0x18, 0x05, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1a, 0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e,
	0x74, 0x79, 0x70, 0x65, 0x2e, 0x52, 0x65, 0x74, 0x65, 0x6e, 0x74, 0x69, 0x6f, 0x6e, 0x50, 0x6f,
	0x6c, 0x69, 0x63, 0x79, 0x52, 0x0f, 0x72, 0x65, 0x74, 0x65, 0x6e, 0x74, 0x69, 0x6f, 0x6e, 0x50,
	0x6f, 0x6c, 0x69, 0x63, 0x79, 0x22, 0x68, 0x0a, 0x11, 0x41, 0x70, 0x70, 0x65, 0x6e, 0x64, 0x44,
	0x61, 0x74, 0x61, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x12, 0x0a, 0x04, 0x6e, 0x61,
	0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x12,
	0x0a, 0x04, 0x74, 0x79, 0x70, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x74, 0x79,
	0x70, 0x65, 0x12, 0x2b, 0x0a, 0x07, 0x73, 0x61, 0x6d, 0x70, 0x6c, 0x65, 0x73, 0x18, 0x03, 0x20,
	0x03, 0x28, 0x0b, 0x32, 0x11, 0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x2e,
	0x53, 0x61, 0x6d, 0x70, 0x6c, 0x65, 0x52, 0x07, 0x73, 0x61, 0x6d, 0x70, 0x6c, 0x65, 0x73, 0x22,
	0x56, 0x0a, 0x0d, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74,
	0x12, 0x12, 0x0a, 0x04, 0x74, 0x79, 0x70, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04,
	0x74, 0x79, 0x70, 0x65, 0x12, 0x14, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x02, 0x20, 0x01,
	0x28, 0x09, 0x48, 0x00, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x12, 0x0a, 0x03, 0x74, 0x61,
	0x67, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x48, 0x00, 0x52, 0x03, 0x74, 0x61, 0x67, 0x42, 0x07,
	0x0a, 0x05, 0x6d, 0x61, 0x74, 0x63, 0x68, 0x22, 0x38, 0x0a, 0x0e, 0x47, 0x65, 0x74, 0x49, 0x6e,
	0x66, 0x6f, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x12, 0x0a, 0x04, 0x6e, 0x61, 0x6d,
	0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x12, 0x0a,
	0x04, 0x74, 0x79, 0x70, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x74, 0x79, 0x70,
	0x65, 0x22, 0x85, 0x01, 0x0a, 0x14, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x44, 0x61, 0x74, 0x61,
	0x73, 0x65, 0x74, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x12, 0x0a, 0x04, 0x6e, 0x61,
	0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x12,
	0x0a, 0x04, 0x74, 0x79, 0x70, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x74, 0x79,
	0x70, 0x65, 0x12, 0x45, 0x0a, 0x10, 0x72, 0x65, 0x74, 0x65, 0x6e, 0x74, 0x69, 0x6f, 0x6e, 0x5f,
	0x70, 0x6f, 0x6c, 0x69, 0x63, 0x79, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1a, 0x2e, 0x61,
	0x73, 0x67, 0x74, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x52, 0x65, 0x74, 0x65, 0x6e, 0x74, 0x69,
	0x6f, 0x6e, 0x50, 0x6f, 0x6c, 0x69, 0x63, 0x79, 0x52, 0x0f, 0x72, 0x65, 0x74, 0x65, 0x6e, 0x74,
	0x69, 0x6f, 0x6e, 0x50, 0x6f, 0x6c, 0x69, 0x63, 0x79, 0x22, 0x67, 0x0a, 0x0f, 0x47, 0x65, 0x74,
	0x49, 0x6e, 0x66, 0x6f, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x2c, 0x0a, 0x07,
	0x64, 0x61, 0x74, 0x61, 0x73, 0x65, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x12, 0x2e,
	0x61, 0x73, 0x67, 0x74, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x44, 0x61, 0x74, 0x61, 0x73, 0x65,
	0x74, 0x52, 0x07, 0x64, 0x61, 0x74, 0x61, 0x73, 0x65, 0x74, 0x12, 0x26, 0x0a, 0x05, 0x6d, 0x6f,
	0x64, 0x65, 0x6c, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x10, 0x2e, 0x61, 0x73, 0x67, 0x74,
	0x2e, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x4d, 0x6f, 0x64, 0x65, 0x6c, 0x52, 0x05, 0x6d, 0x6f, 0x64,
	0x65, 0x6c, 0x22, 0x87, 0x01, 0x0a, 0x19, 0x52, 0x65, 0x67, 0x69, 0x73, 0x74, 0x65, 0x72, 0x51,
	0x75, 0x65, 0x72, 0x79, 0x53, 0x74, 0x61, 0x74, 0x73, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74,
	0x12, 0x18, 0x0a, 0x07, 0x64, 0x61, 0x74, 0x61, 0x73, 0x65, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28,
	0x09, 0x52, 0x07, 0x64, 0x61, 0x74, 0x61, 0x73, 0x65, 0x74, 0x12, 0x1d, 0x0a, 0x0a, 0x6d, 0x6f,
	0x64, 0x65, 0x6c, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x09,
	0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x54, 0x79, 0x70, 0x65, 0x12, 0x1d, 0x0a, 0x0a, 0x62, 0x61, 0x74,
	0x63, 0x68, 0x5f, 0x73, 0x69, 0x7a, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x05, 0x52, 0x09, 0x62,
	0x61, 0x74, 0x63, 0x68, 0x53, 0x69, 0x7a, 0x65, 0x12, 0x12, 0x0a, 0x04, 0x74, 0x61, 0x67, 0x73,
	0x18, 0x04, 0x20, 0x03, 0x28, 0x09, 0x52, 0x04, 0x74, 0x61, 0x67, 0x73, 0x32, 0xfa, 0x05, 0x0a,
	0x0b, 0x44, 0x61, 0x74, 0x61, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x12, 0x69, 0x0a, 0x0d,
	0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x44, 0x61, 0x74, 0x61, 0x73, 0x65, 0x74, 0x12, 0x22, 0x2e,
	0x61, 0x73, 0x67, 0x74, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65,
	0x2e, 0x76, 0x31, 0x2e, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73,
	0x74, 0x1a, 0x16, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x62, 0x75, 0x66, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x22, 0x1c, 0x82, 0xd3, 0xe4, 0x93, 0x02,
	0x16, 0x22, 0x11, 0x2f, 0x76, 0x31, 0x2f, 0x7b, 0x74, 0x79, 0x70, 0x65, 0x7d, 0x3a, 0x63, 0x72,
	0x65, 0x61, 0x74, 0x65, 0x3a, 0x01, 0x2a, 0x12, 0x71, 0x0a, 0x0a, 0x41, 0x70, 0x70, 0x65, 0x6e,
	0x64, 0x44, 0x61, 0x74, 0x61, 0x12, 0x26, 0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x64, 0x61, 0x74,
	0x61, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x41, 0x70, 0x70, 0x65,
	0x6e, 0x64, 0x44, 0x61, 0x74, 0x61, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x16, 0x2e,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e,
	0x45, 0x6d, 0x70, 0x74, 0x79, 0x22, 0x23, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x1d, 0x22, 0x18, 0x2f,
	0x76, 0x31, 0x2f, 0x7b, 0x74, 0x79, 0x70, 0x65, 0x7d, 0x2f, 0x7b, 0x6e, 0x61, 0x6d, 0x65, 0x7d,
	0x3a, 0x61, 0x70, 0x70, 0x65, 0x6e, 0x64, 0x3a, 0x01, 0x2a, 0x12, 0x66, 0x0a, 0x0a, 0x44, 0x65,
	0x6c, 0x65, 0x74, 0x65, 0x44, 0x61, 0x74, 0x61, 0x12, 0x22, 0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e,
	0x64, 0x61, 0x74, 0x61, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x44,
	0x65, 0x6c, 0x65, 0x74, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x16, 0x2e, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x45,
	0x6d, 0x70, 0x74, 0x79, 0x22, 0x1c, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x16, 0x22, 0x11, 0x2f, 0x76,
	0x31, 0x2f, 0x7b, 0x74, 0x79, 0x70, 0x65, 0x7d, 0x3a, 0x64, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x3a,
	0x01, 0x2a, 0x12, 0x74, 0x0a, 0x07, 0x47, 0x65, 0x74, 0x49, 0x6e, 0x66, 0x6f, 0x12, 0x23, 0x2e,
	0x61, 0x73, 0x67, 0x74, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65,
	0x2e, 0x76, 0x31, 0x2e, 0x47, 0x65, 0x74, 0x49, 0x6e, 0x66, 0x6f, 0x52, 0x65, 0x71, 0x75, 0x65,
	0x73, 0x74, 0x1a, 0x24, 0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x73, 0x65,
	0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x47, 0x65, 0x74, 0x49, 0x6e, 0x66, 0x6f,
	0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x1e, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x18,
	0x12, 0x16, 0x2f, 0x76, 0x31, 0x2f, 0x7b, 0x74, 0x79, 0x70, 0x65, 0x7d, 0x2f, 0x7b, 0x6e, 0x61,
	0x6d, 0x65, 0x7d, 0x3a, 0x69, 0x6e, 0x66, 0x6f, 0x12, 0x77, 0x0a, 0x0d, 0x55, 0x70, 0x64, 0x61,
	0x74, 0x65, 0x44, 0x61, 0x74, 0x61, 0x73, 0x65, 0x74, 0x12, 0x29, 0x2e, 0x61, 0x73, 0x67, 0x74,
	0x2e, 0x64, 0x61, 0x74, 0x61, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x76, 0x31, 0x2e,
	0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x44, 0x61, 0x74, 0x61, 0x73, 0x65, 0x74, 0x52, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x1a, 0x16, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x22, 0x23, 0x82, 0xd3,
	0xe4, 0x93, 0x02, 0x1d, 0x1a, 0x18, 0x2f, 0x76, 0x31, 0x2f, 0x7b, 0x74, 0x79, 0x70, 0x65, 0x7d,
	0x2f, 0x7b, 0x6e, 0x61, 0x6d, 0x65, 0x7d, 0x3a, 0x75, 0x70, 0x64, 0x61, 0x74, 0x65, 0x3a, 0x01,
	0x2a, 0x12, 0x5c, 0x0a, 0x12, 0x52, 0x65, 0x67, 0x69, 0x73, 0x74, 0x65, 0x72, 0x51, 0x75, 0x65,
	0x72, 0x79, 0x53, 0x74, 0x61, 0x74, 0x73, 0x12, 0x2e, 0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x64,
	0x61, 0x74, 0x61, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x52, 0x65,
	0x67, 0x69, 0x73, 0x74, 0x65, 0x72, 0x51, 0x75, 0x65, 0x72, 0x79, 0x53, 0x74, 0x61, 0x74, 0x73,
	0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x16, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x12,
	0x58, 0x0a, 0x13, 0x43, 0x61, 0x6c, 0x6c, 0x73, 0x50, 0x65, 0x72, 0x4d, 0x6f, 0x6e, 0x74, 0x68,
	0x4d, 0x65, 0x74, 0x72, 0x69, 0x63, 0x12, 0x16, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x1a, 0x29,
	0x2e, 0x73, 0x73, 0x6e, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65,
	0x2e, 0x76, 0x31, 0x2e, 0x43, 0x61, 0x6c, 0x6c, 0x73, 0x50, 0x65, 0x72, 0x4d, 0x6f, 0x6e, 0x74,
	0x68, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x42, 0x37, 0x5a, 0x35, 0x67, 0x69, 0x74,
	0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x65, 0x2d, 0x63, 0x6f, 0x6e, 0x6f, 0x6d, 0x69,
	0x63, 0x2f, 0x76, 0x6d, 0x6c, 0x61, 0x70, 0x69, 0x73, 0x2f, 0x67, 0x65, 0x6e, 0x2f, 0x67, 0x6f,
	0x2f, 0x61, 0x73, 0x67, 0x74, 0x2f, 0x64, 0x61, 0x74, 0x61, 0x2f, 0x76, 0x31, 0x3b, 0x64, 0x61,
	0x74, 0x61, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_asgt_data_v1_data_service_proto_rawDescOnce sync.Once
	file_asgt_data_v1_data_service_proto_rawDescData = file_asgt_data_v1_data_service_proto_rawDesc
)

func file_asgt_data_v1_data_service_proto_rawDescGZIP() []byte {
	file_asgt_data_v1_data_service_proto_rawDescOnce.Do(func() {
		file_asgt_data_v1_data_service_proto_rawDescData = protoimpl.X.CompressGZIP(file_asgt_data_v1_data_service_proto_rawDescData)
	})
	return file_asgt_data_v1_data_service_proto_rawDescData
}

var file_asgt_data_v1_data_service_proto_msgTypes = make([]protoimpl.MessageInfo, 7)
var file_asgt_data_v1_data_service_proto_goTypes = []interface{}{
	(*CreateRequest)(nil),             // 0: asgt.dataservice.v1.CreateRequest
	(*AppendDataRequest)(nil),         // 1: asgt.dataservice.v1.AppendDataRequest
	(*DeleteRequest)(nil),             // 2: asgt.dataservice.v1.DeleteRequest
	(*GetInfoRequest)(nil),            // 3: asgt.dataservice.v1.GetInfoRequest
	(*UpdateDatasetRequest)(nil),      // 4: asgt.dataservice.v1.UpdateDatasetRequest
	(*GetInfoResponse)(nil),           // 5: asgt.dataservice.v1.GetInfoResponse
	(*RegisterQueryStatsRequest)(nil), // 6: asgt.dataservice.v1.RegisterQueryStatsRequest
	(*_type.Sample)(nil),              // 7: asgt.type.Sample
	(*_type.RetentionPolicy)(nil),     // 8: asgt.type.RetentionPolicy
	(*_type.Dataset)(nil),             // 9: asgt.type.Dataset
	(*_type.Model)(nil),               // 10: asgt.type.Model
	(*empty.Empty)(nil),               // 11: google.protobuf.Empty
	(*v1.CallsPerMonthResponse)(nil),  // 12: ssn.dataservice.v1.CallsPerMonthResponse
}
var file_asgt_data_v1_data_service_proto_depIdxs = []int32{
	7,  // 0: asgt.dataservice.v1.CreateRequest.samples:type_name -> asgt.type.Sample
	8,  // 1: asgt.dataservice.v1.CreateRequest.retention_policy:type_name -> asgt.type.RetentionPolicy
	7,  // 2: asgt.dataservice.v1.AppendDataRequest.samples:type_name -> asgt.type.Sample
	8,  // 3: asgt.dataservice.v1.UpdateDatasetRequest.retention_policy:type_name -> asgt.type.RetentionPolicy
	9,  // 4: asgt.dataservice.v1.GetInfoResponse.dataset:type_name -> asgt.type.Dataset
	10, // 5: asgt.dataservice.v1.GetInfoResponse.model:type_name -> asgt.type.Model
	0,  // 6: asgt.dataservice.v1.DataService.CreateDataset:input_type -> asgt.dataservice.v1.CreateRequest
	1,  // 7: asgt.dataservice.v1.DataService.AppendData:input_type -> asgt.dataservice.v1.AppendDataRequest
	2,  // 8: asgt.dataservice.v1.DataService.DeleteData:input_type -> asgt.dataservice.v1.DeleteRequest
	3,  // 9: asgt.dataservice.v1.DataService.GetInfo:input_type -> asgt.dataservice.v1.GetInfoRequest
	4,  // 10: asgt.dataservice.v1.DataService.UpdateDataset:input_type -> asgt.dataservice.v1.UpdateDatasetRequest
	6,  // 11: asgt.dataservice.v1.DataService.RegisterQueryStats:input_type -> asgt.dataservice.v1.RegisterQueryStatsRequest
	11, // 12: asgt.dataservice.v1.DataService.CallsPerMonthMetric:input_type -> google.protobuf.Empty
	11, // 13: asgt.dataservice.v1.DataService.CreateDataset:output_type -> google.protobuf.Empty
	11, // 14: asgt.dataservice.v1.DataService.AppendData:output_type -> google.protobuf.Empty
	11, // 15: asgt.dataservice.v1.DataService.DeleteData:output_type -> google.protobuf.Empty
	5,  // 16: asgt.dataservice.v1.DataService.GetInfo:output_type -> asgt.dataservice.v1.GetInfoResponse
	11, // 17: asgt.dataservice.v1.DataService.UpdateDataset:output_type -> google.protobuf.Empty
	11, // 18: asgt.dataservice.v1.DataService.RegisterQueryStats:output_type -> google.protobuf.Empty
	12, // 19: asgt.dataservice.v1.DataService.CallsPerMonthMetric:output_type -> ssn.dataservice.v1.CallsPerMonthResponse
	13, // [13:20] is the sub-list for method output_type
	6,  // [6:13] is the sub-list for method input_type
	6,  // [6:6] is the sub-list for extension type_name
	6,  // [6:6] is the sub-list for extension extendee
	0,  // [0:6] is the sub-list for field type_name
}

func init() { file_asgt_data_v1_data_service_proto_init() }
func file_asgt_data_v1_data_service_proto_init() {
	if File_asgt_data_v1_data_service_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_asgt_data_v1_data_service_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CreateRequest); i {
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
		file_asgt_data_v1_data_service_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*AppendDataRequest); i {
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
		file_asgt_data_v1_data_service_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*DeleteRequest); i {
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
		file_asgt_data_v1_data_service_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GetInfoRequest); i {
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
		file_asgt_data_v1_data_service_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*UpdateDatasetRequest); i {
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
		file_asgt_data_v1_data_service_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GetInfoResponse); i {
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
		file_asgt_data_v1_data_service_proto_msgTypes[6].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*RegisterQueryStatsRequest); i {
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
	file_asgt_data_v1_data_service_proto_msgTypes[2].OneofWrappers = []interface{}{
		(*DeleteRequest_Name)(nil),
		(*DeleteRequest_Tag)(nil),
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_asgt_data_v1_data_service_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   7,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_asgt_data_v1_data_service_proto_goTypes,
		DependencyIndexes: file_asgt_data_v1_data_service_proto_depIdxs,
		MessageInfos:      file_asgt_data_v1_data_service_proto_msgTypes,
	}.Build()
	File_asgt_data_v1_data_service_proto = out.File
	file_asgt_data_v1_data_service_proto_rawDesc = nil
	file_asgt_data_v1_data_service_proto_goTypes = nil
	file_asgt_data_v1_data_service_proto_depIdxs = nil
}
