// Code generated by protoc-gen-go. DO NOT EDIT.
// source: asgt/modelregistry/v1alpha1/model_registry.proto

package modelregistry

import proto "github.com/golang/protobuf/proto"
import fmt "fmt"
import math "math"
import _type "github.com/e-conomic/vmlapis/gen/go/asgt/type"
import empty "github.com/golang/protobuf/ptypes/empty"

import (
	context "golang.org/x/net/context"
	grpc "google.golang.org/grpc"
)

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// This is a compile-time assertion to ensure that this generated file
// is compatible with the proto package it is being compiled against.
// A compilation error at this line likely means your copy of the
// proto package needs to be updated.
const _ = proto.ProtoPackageIsVersion2 // please upgrade the proto package

type RegisterModelRequest struct {
	Dataset              *_type.Dataset  `protobuf:"bytes,1,opt,name=dataset,proto3" json:"dataset,omitempty"`
	Revision             *_type.Revision `protobuf:"bytes,2,opt,name=revision,proto3" json:"revision,omitempty"`
	ModelVersion         int64           `protobuf:"varint,3,opt,name=model_version,json=modelVersion,proto3" json:"model_version,omitempty"`
	XXX_NoUnkeyedLiteral struct{}        `json:"-"`
	XXX_unrecognized     []byte          `json:"-"`
	XXX_sizecache        int32           `json:"-"`
}

func (m *RegisterModelRequest) Reset()         { *m = RegisterModelRequest{} }
func (m *RegisterModelRequest) String() string { return proto.CompactTextString(m) }
func (*RegisterModelRequest) ProtoMessage()    {}
func (*RegisterModelRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_model_registry_33c1ee7a5d04852c, []int{0}
}
func (m *RegisterModelRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_RegisterModelRequest.Unmarshal(m, b)
}
func (m *RegisterModelRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_RegisterModelRequest.Marshal(b, m, deterministic)
}
func (dst *RegisterModelRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_RegisterModelRequest.Merge(dst, src)
}
func (m *RegisterModelRequest) XXX_Size() int {
	return xxx_messageInfo_RegisterModelRequest.Size(m)
}
func (m *RegisterModelRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_RegisterModelRequest.DiscardUnknown(m)
}

var xxx_messageInfo_RegisterModelRequest proto.InternalMessageInfo

func (m *RegisterModelRequest) GetDataset() *_type.Dataset {
	if m != nil {
		return m.Dataset
	}
	return nil
}

func (m *RegisterModelRequest) GetRevision() *_type.Revision {
	if m != nil {
		return m.Revision
	}
	return nil
}

func (m *RegisterModelRequest) GetModelVersion() int64 {
	if m != nil {
		return m.ModelVersion
	}
	return 0
}

type GetCurrentModelRequest struct {
	Dataset              *_type.Dataset `protobuf:"bytes,1,opt,name=dataset,proto3" json:"dataset,omitempty"`
	XXX_NoUnkeyedLiteral struct{}       `json:"-"`
	XXX_unrecognized     []byte         `json:"-"`
	XXX_sizecache        int32          `json:"-"`
}

func (m *GetCurrentModelRequest) Reset()         { *m = GetCurrentModelRequest{} }
func (m *GetCurrentModelRequest) String() string { return proto.CompactTextString(m) }
func (*GetCurrentModelRequest) ProtoMessage()    {}
func (*GetCurrentModelRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_model_registry_33c1ee7a5d04852c, []int{1}
}
func (m *GetCurrentModelRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_GetCurrentModelRequest.Unmarshal(m, b)
}
func (m *GetCurrentModelRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_GetCurrentModelRequest.Marshal(b, m, deterministic)
}
func (dst *GetCurrentModelRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_GetCurrentModelRequest.Merge(dst, src)
}
func (m *GetCurrentModelRequest) XXX_Size() int {
	return xxx_messageInfo_GetCurrentModelRequest.Size(m)
}
func (m *GetCurrentModelRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_GetCurrentModelRequest.DiscardUnknown(m)
}

var xxx_messageInfo_GetCurrentModelRequest proto.InternalMessageInfo

func (m *GetCurrentModelRequest) GetDataset() *_type.Dataset {
	if m != nil {
		return m.Dataset
	}
	return nil
}

type GetCurrentModelResponse struct {
	Model                *_type.Model `protobuf:"bytes,1,opt,name=model,proto3" json:"model,omitempty"`
	XXX_NoUnkeyedLiteral struct{}     `json:"-"`
	XXX_unrecognized     []byte       `json:"-"`
	XXX_sizecache        int32        `json:"-"`
}

func (m *GetCurrentModelResponse) Reset()         { *m = GetCurrentModelResponse{} }
func (m *GetCurrentModelResponse) String() string { return proto.CompactTextString(m) }
func (*GetCurrentModelResponse) ProtoMessage()    {}
func (*GetCurrentModelResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_model_registry_33c1ee7a5d04852c, []int{2}
}
func (m *GetCurrentModelResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_GetCurrentModelResponse.Unmarshal(m, b)
}
func (m *GetCurrentModelResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_GetCurrentModelResponse.Marshal(b, m, deterministic)
}
func (dst *GetCurrentModelResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_GetCurrentModelResponse.Merge(dst, src)
}
func (m *GetCurrentModelResponse) XXX_Size() int {
	return xxx_messageInfo_GetCurrentModelResponse.Size(m)
}
func (m *GetCurrentModelResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_GetCurrentModelResponse.DiscardUnknown(m)
}

var xxx_messageInfo_GetCurrentModelResponse proto.InternalMessageInfo

func (m *GetCurrentModelResponse) GetModel() *_type.Model {
	if m != nil {
		return m.Model
	}
	return nil
}

func init() {
	proto.RegisterType((*RegisterModelRequest)(nil), "asgt.modelregistry.v1alpha1.RegisterModelRequest")
	proto.RegisterType((*GetCurrentModelRequest)(nil), "asgt.modelregistry.v1alpha1.GetCurrentModelRequest")
	proto.RegisterType((*GetCurrentModelResponse)(nil), "asgt.modelregistry.v1alpha1.GetCurrentModelResponse")
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConn

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion4

// ModelRegistryClient is the client API for ModelRegistry service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type ModelRegistryClient interface {
	RegisterModel(ctx context.Context, in *RegisterModelRequest, opts ...grpc.CallOption) (*empty.Empty, error)
	GetCurrentModel(ctx context.Context, in *GetCurrentModelRequest, opts ...grpc.CallOption) (*GetCurrentModelResponse, error)
}

type modelRegistryClient struct {
	cc *grpc.ClientConn
}

func NewModelRegistryClient(cc *grpc.ClientConn) ModelRegistryClient {
	return &modelRegistryClient{cc}
}

func (c *modelRegistryClient) RegisterModel(ctx context.Context, in *RegisterModelRequest, opts ...grpc.CallOption) (*empty.Empty, error) {
	out := new(empty.Empty)
	err := c.cc.Invoke(ctx, "/asgt.modelregistry.v1alpha1.ModelRegistry/RegisterModel", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *modelRegistryClient) GetCurrentModel(ctx context.Context, in *GetCurrentModelRequest, opts ...grpc.CallOption) (*GetCurrentModelResponse, error) {
	out := new(GetCurrentModelResponse)
	err := c.cc.Invoke(ctx, "/asgt.modelregistry.v1alpha1.ModelRegistry/GetCurrentModel", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// ModelRegistryServer is the server API for ModelRegistry service.
type ModelRegistryServer interface {
	RegisterModel(context.Context, *RegisterModelRequest) (*empty.Empty, error)
	GetCurrentModel(context.Context, *GetCurrentModelRequest) (*GetCurrentModelResponse, error)
}

func RegisterModelRegistryServer(s *grpc.Server, srv ModelRegistryServer) {
	s.RegisterService(&_ModelRegistry_serviceDesc, srv)
}

func _ModelRegistry_RegisterModel_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(RegisterModelRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ModelRegistryServer).RegisterModel(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/asgt.modelregistry.v1alpha1.ModelRegistry/RegisterModel",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ModelRegistryServer).RegisterModel(ctx, req.(*RegisterModelRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _ModelRegistry_GetCurrentModel_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetCurrentModelRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ModelRegistryServer).GetCurrentModel(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/asgt.modelregistry.v1alpha1.ModelRegistry/GetCurrentModel",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ModelRegistryServer).GetCurrentModel(ctx, req.(*GetCurrentModelRequest))
	}
	return interceptor(ctx, in, info, handler)
}

var _ModelRegistry_serviceDesc = grpc.ServiceDesc{
	ServiceName: "asgt.modelregistry.v1alpha1.ModelRegistry",
	HandlerType: (*ModelRegistryServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "RegisterModel",
			Handler:    _ModelRegistry_RegisterModel_Handler,
		},
		{
			MethodName: "GetCurrentModel",
			Handler:    _ModelRegistry_GetCurrentModel_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "asgt/modelregistry/v1alpha1/model_registry.proto",
}

func init() {
	proto.RegisterFile("asgt/modelregistry/v1alpha1/model_registry.proto", fileDescriptor_model_registry_33c1ee7a5d04852c)
}

var fileDescriptor_model_registry_33c1ee7a5d04852c = []byte{
	// 326 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x9c, 0x51, 0x4d, 0x4b, 0xc3, 0x40,
	0x10, 0x25, 0x16, 0x3f, 0x18, 0x0d, 0x95, 0x55, 0xdb, 0x92, 0x5e, 0x4a, 0x05, 0xe9, 0x41, 0x76,
	0x6d, 0xeb, 0x1f, 0xf0, 0xfb, 0xe4, 0x65, 0x0f, 0x1e, 0x7a, 0x91, 0x94, 0x8e, 0x31, 0x90, 0x66,
	0xe3, 0xee, 0x26, 0x50, 0xf0, 0x97, 0xf8, 0x0f, 0xfd, 0x17, 0x92, 0xdd, 0x8d, 0x6d, 0xb4, 0x14,
	0xf4, 0x38, 0x6f, 0xe6, 0xbd, 0x79, 0xbc, 0x07, 0x17, 0xa1, 0x8a, 0x34, 0x9b, 0x8b, 0x19, 0x26,
	0x12, 0xa3, 0x58, 0x69, 0xb9, 0x60, 0xc5, 0x30, 0x4c, 0xb2, 0xd7, 0x70, 0x68, 0xe1, 0xe7, 0x0a,
	0xa7, 0x99, 0x14, 0x5a, 0x90, 0x6e, 0xc9, 0xa0, 0x35, 0x06, 0xad, 0x18, 0x41, 0xdb, 0xc8, 0xe9,
	0x45, 0x86, 0x6c, 0x16, 0xea, 0x50, 0xa1, 0xb6, 0xac, 0xe0, 0x64, 0xb9, 0x30, 0x54, 0x07, 0x77,
	0x96, 0xb0, 0xc4, 0x22, 0x56, 0xb1, 0x48, 0xdd, 0xa6, 0x1b, 0x09, 0x11, 0x25, 0xc8, 0xcc, 0x34,
	0xcd, 0x5f, 0x18, 0xce, 0x33, 0xed, 0x3c, 0xf4, 0x3f, 0x3c, 0x38, 0xe6, 0xe6, 0x39, 0xca, 0xc7,
	0x52, 0x8e, 0xe3, 0x5b, 0x8e, 0x4a, 0x93, 0x73, 0xd8, 0x75, 0x7f, 0x3b, 0x5e, 0xcf, 0x1b, 0xec,
	0x8f, 0x08, 0x35, 0x76, 0xcb, 0x0f, 0xf4, 0xd6, 0x6e, 0x78, 0x75, 0x42, 0x18, 0xec, 0x55, 0x5f,
	0x3b, 0x5b, 0xe6, 0xfc, 0x68, 0xe5, 0x9c, 0xbb, 0x15, 0xff, 0x3e, 0x22, 0xa7, 0xe0, 0xdb, 0x4c,
	0x0a, 0x94, 0x86, 0xd5, 0xe8, 0x79, 0x83, 0x06, 0x3f, 0x30, 0xe0, 0x93, 0xc5, 0xfa, 0xf7, 0xd0,
	0x7a, 0x40, 0x7d, 0x93, 0x4b, 0x89, 0xa9, 0xfe, 0xbf, 0xbb, 0xfe, 0x15, 0xb4, 0x7f, 0xe9, 0xa8,
	0x4c, 0xa4, 0x0a, 0xc9, 0x19, 0x6c, 0x9b, 0x97, 0x4e, 0xe6, 0x70, 0x45, 0xc6, 0x1e, 0xda, 0xf5,
	0xe8, 0xd3, 0x03, 0xdf, 0x31, 0x6d, 0x53, 0x64, 0x02, 0x7e, 0x2d, 0x38, 0x32, 0xa4, 0x1b, 0xfa,
	0xa4, 0xeb, 0x42, 0x0e, 0x5a, 0xd4, 0x76, 0x43, 0xab, 0x6e, 0xe8, 0x5d, 0xd9, 0x0d, 0x79, 0x87,
	0xe6, 0x0f, 0xc3, 0x64, 0xbc, 0x51, 0x7d, 0x7d, 0x4c, 0xc1, 0xe5, 0xdf, 0x48, 0x36, 0x93, 0xeb,
	0xe6, 0xc4, 0xaf, 0x31, 0xa6, 0x3b, 0xc6, 0xde, 0xf8, 0x2b, 0x00, 0x00, 0xff, 0xff, 0x55, 0x54,
	0xce, 0x89, 0xe3, 0x02, 0x00, 0x00,
}
