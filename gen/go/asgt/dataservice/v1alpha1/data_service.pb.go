// Code generated by protoc-gen-go. DO NOT EDIT.
// source: asgt/dataservice/v1alpha1/data_service.proto

package dataservice

import proto "github.com/golang/protobuf/proto"
import fmt "fmt"
import math "math"
import _type "github.com/e-conomic/vmlapis/gen/go/asgt/type"

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

type GetDatasetRequest struct {
	Consumer             string   `protobuf:"bytes,1,opt,name=consumer,proto3" json:"consumer,omitempty"`
	DatasetName          string   `protobuf:"bytes,2,opt,name=dataset_name,json=datasetName,proto3" json:"dataset_name,omitempty"`
	DatasetType          string   `protobuf:"bytes,3,opt,name=dataset_type,json=datasetType,proto3" json:"dataset_type,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *GetDatasetRequest) Reset()         { *m = GetDatasetRequest{} }
func (m *GetDatasetRequest) String() string { return proto.CompactTextString(m) }
func (*GetDatasetRequest) ProtoMessage()    {}
func (*GetDatasetRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_data_service_0c16696108429aa6, []int{0}
}
func (m *GetDatasetRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_GetDatasetRequest.Unmarshal(m, b)
}
func (m *GetDatasetRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_GetDatasetRequest.Marshal(b, m, deterministic)
}
func (dst *GetDatasetRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_GetDatasetRequest.Merge(dst, src)
}
func (m *GetDatasetRequest) XXX_Size() int {
	return xxx_messageInfo_GetDatasetRequest.Size(m)
}
func (m *GetDatasetRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_GetDatasetRequest.DiscardUnknown(m)
}

var xxx_messageInfo_GetDatasetRequest proto.InternalMessageInfo

func (m *GetDatasetRequest) GetConsumer() string {
	if m != nil {
		return m.Consumer
	}
	return ""
}

func (m *GetDatasetRequest) GetDatasetName() string {
	if m != nil {
		return m.DatasetName
	}
	return ""
}

func (m *GetDatasetRequest) GetDatasetType() string {
	if m != nil {
		return m.DatasetType
	}
	return ""
}

type GetDatasetResponse struct {
	Info                 *_type.DatasetInfo `protobuf:"bytes,1,opt,name=info,proto3" json:"info,omitempty"`
	XXX_NoUnkeyedLiteral struct{}           `json:"-"`
	XXX_unrecognized     []byte             `json:"-"`
	XXX_sizecache        int32              `json:"-"`
}

func (m *GetDatasetResponse) Reset()         { *m = GetDatasetResponse{} }
func (m *GetDatasetResponse) String() string { return proto.CompactTextString(m) }
func (*GetDatasetResponse) ProtoMessage()    {}
func (*GetDatasetResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_data_service_0c16696108429aa6, []int{1}
}
func (m *GetDatasetResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_GetDatasetResponse.Unmarshal(m, b)
}
func (m *GetDatasetResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_GetDatasetResponse.Marshal(b, m, deterministic)
}
func (dst *GetDatasetResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_GetDatasetResponse.Merge(dst, src)
}
func (m *GetDatasetResponse) XXX_Size() int {
	return xxx_messageInfo_GetDatasetResponse.Size(m)
}
func (m *GetDatasetResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_GetDatasetResponse.DiscardUnknown(m)
}

var xxx_messageInfo_GetDatasetResponse proto.InternalMessageInfo

func (m *GetDatasetResponse) GetInfo() *_type.DatasetInfo {
	if m != nil {
		return m.Info
	}
	return nil
}

func init() {
	proto.RegisterType((*GetDatasetRequest)(nil), "asgt.dataservice.v1alpha1.GetDatasetRequest")
	proto.RegisterType((*GetDatasetResponse)(nil), "asgt.dataservice.v1alpha1.GetDatasetResponse")
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConn

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion4

// DataServiceClient is the client API for DataService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type DataServiceClient interface {
	GetDataset(ctx context.Context, in *GetDatasetRequest, opts ...grpc.CallOption) (*GetDatasetResponse, error)
}

type dataServiceClient struct {
	cc *grpc.ClientConn
}

func NewDataServiceClient(cc *grpc.ClientConn) DataServiceClient {
	return &dataServiceClient{cc}
}

func (c *dataServiceClient) GetDataset(ctx context.Context, in *GetDatasetRequest, opts ...grpc.CallOption) (*GetDatasetResponse, error) {
	out := new(GetDatasetResponse)
	err := c.cc.Invoke(ctx, "/asgt.dataservice.v1alpha1.DataService/GetDataset", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// DataServiceServer is the server API for DataService service.
type DataServiceServer interface {
	GetDataset(context.Context, *GetDatasetRequest) (*GetDatasetResponse, error)
}

func RegisterDataServiceServer(s *grpc.Server, srv DataServiceServer) {
	s.RegisterService(&_DataService_serviceDesc, srv)
}

func _DataService_GetDataset_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetDatasetRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(DataServiceServer).GetDataset(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/asgt.dataservice.v1alpha1.DataService/GetDataset",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(DataServiceServer).GetDataset(ctx, req.(*GetDatasetRequest))
	}
	return interceptor(ctx, in, info, handler)
}

var _DataService_serviceDesc = grpc.ServiceDesc{
	ServiceName: "asgt.dataservice.v1alpha1.DataService",
	HandlerType: (*DataServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "GetDataset",
			Handler:    _DataService_GetDataset_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "asgt/dataservice/v1alpha1/data_service.proto",
}

func init() {
	proto.RegisterFile("asgt/dataservice/v1alpha1/data_service.proto", fileDescriptor_data_service_0c16696108429aa6)
}

var fileDescriptor_data_service_0c16696108429aa6 = []byte{
	// 242 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xe2, 0xd2, 0x49, 0x2c, 0x4e, 0x2f,
	0xd1, 0x4f, 0x49, 0x2c, 0x49, 0x2c, 0x4e, 0x2d, 0x2a, 0xcb, 0x4c, 0x4e, 0xd5, 0x2f, 0x33, 0x4c,
	0xcc, 0x29, 0xc8, 0x48, 0x34, 0x04, 0x0b, 0xc6, 0x43, 0x45, 0xf5, 0x0a, 0x8a, 0xf2, 0x4b, 0xf2,
	0x85, 0x24, 0x41, 0xaa, 0xf5, 0x90, 0x54, 0xeb, 0xc1, 0x54, 0x4b, 0xc9, 0x80, 0x0d, 0x2a, 0xa9,
	0x2c, 0x48, 0x85, 0x9a, 0x56, 0x12, 0x9f, 0x99, 0x97, 0x96, 0x0f, 0xd1, 0xa8, 0x54, 0xca, 0x25,
	0xe8, 0x9e, 0x5a, 0xe2, 0x02, 0x91, 0x08, 0x4a, 0x2d, 0x2c, 0x4d, 0x2d, 0x2e, 0x11, 0x92, 0xe2,
	0xe2, 0x48, 0xce, 0xcf, 0x2b, 0x2e, 0xcd, 0x4d, 0x2d, 0x92, 0x60, 0x54, 0x60, 0xd4, 0xe0, 0x0c,
	0x82, 0xf3, 0x85, 0x14, 0xb9, 0x78, 0x60, 0xc6, 0xe4, 0x25, 0xe6, 0xa6, 0x4a, 0x30, 0x81, 0xe5,
	0xb9, 0xa1, 0x62, 0x7e, 0x89, 0xb9, 0xa9, 0xc8, 0x4a, 0x40, 0xd6, 0x4a, 0x30, 0xa3, 0x28, 0x09,
	0xa9, 0x2c, 0x48, 0x55, 0x72, 0xe0, 0x12, 0x42, 0xb6, 0xb6, 0xb8, 0x20, 0x3f, 0xaf, 0x38, 0x55,
	0x48, 0x8b, 0x8b, 0x05, 0xe4, 0x34, 0xb0, 0x9d, 0xdc, 0x46, 0x62, 0x7a, 0x60, 0x4f, 0x81, 0x8c,
	0xd0, 0x83, 0xaa, 0xf4, 0xcc, 0x4b, 0xcb, 0x0f, 0x02, 0xab, 0x31, 0xaa, 0xe0, 0xe2, 0x06, 0x09,
	0x06, 0x43, 0xbc, 0x2b, 0x94, 0xc9, 0xc5, 0x85, 0x30, 0x50, 0x48, 0x47, 0x0f, 0x67, 0x78, 0xe8,
	0x61, 0x78, 0x57, 0x4a, 0x97, 0x48, 0xd5, 0x10, 0x57, 0x3a, 0xf1, 0x46, 0x71, 0x23, 0x29, 0x4d,
	0x62, 0x03, 0x07, 0xa4, 0x31, 0x20, 0x00, 0x00, 0xff, 0xff, 0x6f, 0x70, 0x39, 0x86, 0xb1, 0x01,
	0x00, 0x00,
}
