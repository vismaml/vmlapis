// Code generated by protoc-gen-go. DO NOT EDIT.
// source: asgt/dataservice/v1alpha1/scanned_invoice_data_service.proto

package dataservice

import proto "github.com/golang/protobuf/proto"
import fmt "fmt"
import math "math"
import _type "github.com/e-conomic/vmlapis/gen/go/asgt/type"
import empty "github.com/golang/protobuf/ptypes/empty"
import _ "google.golang.org/genproto/googleapis/api/annotations"

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

type ScannedInvoiceEntryInput struct {
	Data                 *_type.ScannedInvoice `protobuf:"bytes,1,opt,name=data,proto3" json:"data,omitempty"`
	TargetValues         []*_type.TargetValue  `protobuf:"bytes,2,rep,name=target_values,json=targetValues,proto3" json:"target_values,omitempty"`
	XXX_NoUnkeyedLiteral struct{}              `json:"-"`
	XXX_unrecognized     []byte                `json:"-"`
	XXX_sizecache        int32                 `json:"-"`
}

func (m *ScannedInvoiceEntryInput) Reset()         { *m = ScannedInvoiceEntryInput{} }
func (m *ScannedInvoiceEntryInput) String() string { return proto.CompactTextString(m) }
func (*ScannedInvoiceEntryInput) ProtoMessage()    {}
func (*ScannedInvoiceEntryInput) Descriptor() ([]byte, []int) {
	return fileDescriptor_scanned_invoice_data_service_33f654a785cd6fbc, []int{0}
}
func (m *ScannedInvoiceEntryInput) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_ScannedInvoiceEntryInput.Unmarshal(m, b)
}
func (m *ScannedInvoiceEntryInput) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_ScannedInvoiceEntryInput.Marshal(b, m, deterministic)
}
func (dst *ScannedInvoiceEntryInput) XXX_Merge(src proto.Message) {
	xxx_messageInfo_ScannedInvoiceEntryInput.Merge(dst, src)
}
func (m *ScannedInvoiceEntryInput) XXX_Size() int {
	return xxx_messageInfo_ScannedInvoiceEntryInput.Size(m)
}
func (m *ScannedInvoiceEntryInput) XXX_DiscardUnknown() {
	xxx_messageInfo_ScannedInvoiceEntryInput.DiscardUnknown(m)
}

var xxx_messageInfo_ScannedInvoiceEntryInput proto.InternalMessageInfo

func (m *ScannedInvoiceEntryInput) GetData() *_type.ScannedInvoice {
	if m != nil {
		return m.Data
	}
	return nil
}

func (m *ScannedInvoiceEntryInput) GetTargetValues() []*_type.TargetValue {
	if m != nil {
		return m.TargetValues
	}
	return nil
}

type CreateScannedInvoiceDatasetRequest struct {
	DatasetName          string                      `protobuf:"bytes,1,opt,name=dataset_name,json=datasetName,proto3" json:"dataset_name,omitempty"`
	Tags                 []string                    `protobuf:"bytes,2,rep,name=tags,proto3" json:"tags,omitempty"`
	Targets              []string                    `protobuf:"bytes,5,rep,name=targets,proto3" json:"targets,omitempty"`
	Entries              []*ScannedInvoiceEntryInput `protobuf:"bytes,3,rep,name=entries,proto3" json:"entries,omitempty"`
	RetentionPolicy      *_type.RetentionPolicy      `protobuf:"bytes,4,opt,name=retention_policy,json=retentionPolicy,proto3" json:"retention_policy,omitempty"`
	XXX_NoUnkeyedLiteral struct{}                    `json:"-"`
	XXX_unrecognized     []byte                      `json:"-"`
	XXX_sizecache        int32                       `json:"-"`
}

func (m *CreateScannedInvoiceDatasetRequest) Reset()         { *m = CreateScannedInvoiceDatasetRequest{} }
func (m *CreateScannedInvoiceDatasetRequest) String() string { return proto.CompactTextString(m) }
func (*CreateScannedInvoiceDatasetRequest) ProtoMessage()    {}
func (*CreateScannedInvoiceDatasetRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_scanned_invoice_data_service_33f654a785cd6fbc, []int{1}
}
func (m *CreateScannedInvoiceDatasetRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_CreateScannedInvoiceDatasetRequest.Unmarshal(m, b)
}
func (m *CreateScannedInvoiceDatasetRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_CreateScannedInvoiceDatasetRequest.Marshal(b, m, deterministic)
}
func (dst *CreateScannedInvoiceDatasetRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_CreateScannedInvoiceDatasetRequest.Merge(dst, src)
}
func (m *CreateScannedInvoiceDatasetRequest) XXX_Size() int {
	return xxx_messageInfo_CreateScannedInvoiceDatasetRequest.Size(m)
}
func (m *CreateScannedInvoiceDatasetRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_CreateScannedInvoiceDatasetRequest.DiscardUnknown(m)
}

var xxx_messageInfo_CreateScannedInvoiceDatasetRequest proto.InternalMessageInfo

func (m *CreateScannedInvoiceDatasetRequest) GetDatasetName() string {
	if m != nil {
		return m.DatasetName
	}
	return ""
}

func (m *CreateScannedInvoiceDatasetRequest) GetTags() []string {
	if m != nil {
		return m.Tags
	}
	return nil
}

func (m *CreateScannedInvoiceDatasetRequest) GetTargets() []string {
	if m != nil {
		return m.Targets
	}
	return nil
}

func (m *CreateScannedInvoiceDatasetRequest) GetEntries() []*ScannedInvoiceEntryInput {
	if m != nil {
		return m.Entries
	}
	return nil
}

func (m *CreateScannedInvoiceDatasetRequest) GetRetentionPolicy() *_type.RetentionPolicy {
	if m != nil {
		return m.RetentionPolicy
	}
	return nil
}

type AppendScannedInvoiceDataRequest struct {
	DatasetName          string                      `protobuf:"bytes,1,opt,name=dataset_name,json=datasetName,proto3" json:"dataset_name,omitempty"`
	Entries              []*ScannedInvoiceEntryInput `protobuf:"bytes,3,rep,name=entries,proto3" json:"entries,omitempty"`
	XXX_NoUnkeyedLiteral struct{}                    `json:"-"`
	XXX_unrecognized     []byte                      `json:"-"`
	XXX_sizecache        int32                       `json:"-"`
}

func (m *AppendScannedInvoiceDataRequest) Reset()         { *m = AppendScannedInvoiceDataRequest{} }
func (m *AppendScannedInvoiceDataRequest) String() string { return proto.CompactTextString(m) }
func (*AppendScannedInvoiceDataRequest) ProtoMessage()    {}
func (*AppendScannedInvoiceDataRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_scanned_invoice_data_service_33f654a785cd6fbc, []int{2}
}
func (m *AppendScannedInvoiceDataRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_AppendScannedInvoiceDataRequest.Unmarshal(m, b)
}
func (m *AppendScannedInvoiceDataRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_AppendScannedInvoiceDataRequest.Marshal(b, m, deterministic)
}
func (dst *AppendScannedInvoiceDataRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_AppendScannedInvoiceDataRequest.Merge(dst, src)
}
func (m *AppendScannedInvoiceDataRequest) XXX_Size() int {
	return xxx_messageInfo_AppendScannedInvoiceDataRequest.Size(m)
}
func (m *AppendScannedInvoiceDataRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_AppendScannedInvoiceDataRequest.DiscardUnknown(m)
}

var xxx_messageInfo_AppendScannedInvoiceDataRequest proto.InternalMessageInfo

func (m *AppendScannedInvoiceDataRequest) GetDatasetName() string {
	if m != nil {
		return m.DatasetName
	}
	return ""
}

func (m *AppendScannedInvoiceDataRequest) GetEntries() []*ScannedInvoiceEntryInput {
	if m != nil {
		return m.Entries
	}
	return nil
}

func init() {
	proto.RegisterType((*ScannedInvoiceEntryInput)(nil), "asgt.dataservice.v1alpha1.ScannedInvoiceEntryInput")
	proto.RegisterType((*CreateScannedInvoiceDatasetRequest)(nil), "asgt.dataservice.v1alpha1.CreateScannedInvoiceDatasetRequest")
	proto.RegisterType((*AppendScannedInvoiceDataRequest)(nil), "asgt.dataservice.v1alpha1.AppendScannedInvoiceDataRequest")
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConn

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion4

// ScannedInvoiceDataServiceClient is the client API for ScannedInvoiceDataService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type ScannedInvoiceDataServiceClient interface {
	CreateScannedInvoiceDataset(ctx context.Context, in *CreateScannedInvoiceDatasetRequest, opts ...grpc.CallOption) (*empty.Empty, error)
	AppendScannedInvoiceData(ctx context.Context, in *AppendScannedInvoiceDataRequest, opts ...grpc.CallOption) (*empty.Empty, error)
	DeleteScannedInvoiceData(ctx context.Context, in *DeleteRequest, opts ...grpc.CallOption) (*empty.Empty, error)
	GetScannedInvoiceInfo(ctx context.Context, in *GetInfoRequest, opts ...grpc.CallOption) (*GetInfoResponse, error)
}

type scannedInvoiceDataServiceClient struct {
	cc *grpc.ClientConn
}

func NewScannedInvoiceDataServiceClient(cc *grpc.ClientConn) ScannedInvoiceDataServiceClient {
	return &scannedInvoiceDataServiceClient{cc}
}

func (c *scannedInvoiceDataServiceClient) CreateScannedInvoiceDataset(ctx context.Context, in *CreateScannedInvoiceDatasetRequest, opts ...grpc.CallOption) (*empty.Empty, error) {
	out := new(empty.Empty)
	err := c.cc.Invoke(ctx, "/asgt.dataservice.v1alpha1.ScannedInvoiceDataService/CreateScannedInvoiceDataset", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *scannedInvoiceDataServiceClient) AppendScannedInvoiceData(ctx context.Context, in *AppendScannedInvoiceDataRequest, opts ...grpc.CallOption) (*empty.Empty, error) {
	out := new(empty.Empty)
	err := c.cc.Invoke(ctx, "/asgt.dataservice.v1alpha1.ScannedInvoiceDataService/AppendScannedInvoiceData", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *scannedInvoiceDataServiceClient) DeleteScannedInvoiceData(ctx context.Context, in *DeleteRequest, opts ...grpc.CallOption) (*empty.Empty, error) {
	out := new(empty.Empty)
	err := c.cc.Invoke(ctx, "/asgt.dataservice.v1alpha1.ScannedInvoiceDataService/DeleteScannedInvoiceData", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *scannedInvoiceDataServiceClient) GetScannedInvoiceInfo(ctx context.Context, in *GetInfoRequest, opts ...grpc.CallOption) (*GetInfoResponse, error) {
	out := new(GetInfoResponse)
	err := c.cc.Invoke(ctx, "/asgt.dataservice.v1alpha1.ScannedInvoiceDataService/GetScannedInvoiceInfo", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// ScannedInvoiceDataServiceServer is the server API for ScannedInvoiceDataService service.
type ScannedInvoiceDataServiceServer interface {
	CreateScannedInvoiceDataset(context.Context, *CreateScannedInvoiceDatasetRequest) (*empty.Empty, error)
	AppendScannedInvoiceData(context.Context, *AppendScannedInvoiceDataRequest) (*empty.Empty, error)
	DeleteScannedInvoiceData(context.Context, *DeleteRequest) (*empty.Empty, error)
	GetScannedInvoiceInfo(context.Context, *GetInfoRequest) (*GetInfoResponse, error)
}

func RegisterScannedInvoiceDataServiceServer(s *grpc.Server, srv ScannedInvoiceDataServiceServer) {
	s.RegisterService(&_ScannedInvoiceDataService_serviceDesc, srv)
}

func _ScannedInvoiceDataService_CreateScannedInvoiceDataset_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CreateScannedInvoiceDatasetRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ScannedInvoiceDataServiceServer).CreateScannedInvoiceDataset(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/asgt.dataservice.v1alpha1.ScannedInvoiceDataService/CreateScannedInvoiceDataset",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ScannedInvoiceDataServiceServer).CreateScannedInvoiceDataset(ctx, req.(*CreateScannedInvoiceDatasetRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _ScannedInvoiceDataService_AppendScannedInvoiceData_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(AppendScannedInvoiceDataRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ScannedInvoiceDataServiceServer).AppendScannedInvoiceData(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/asgt.dataservice.v1alpha1.ScannedInvoiceDataService/AppendScannedInvoiceData",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ScannedInvoiceDataServiceServer).AppendScannedInvoiceData(ctx, req.(*AppendScannedInvoiceDataRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _ScannedInvoiceDataService_DeleteScannedInvoiceData_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DeleteRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ScannedInvoiceDataServiceServer).DeleteScannedInvoiceData(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/asgt.dataservice.v1alpha1.ScannedInvoiceDataService/DeleteScannedInvoiceData",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ScannedInvoiceDataServiceServer).DeleteScannedInvoiceData(ctx, req.(*DeleteRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _ScannedInvoiceDataService_GetScannedInvoiceInfo_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetInfoRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ScannedInvoiceDataServiceServer).GetScannedInvoiceInfo(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/asgt.dataservice.v1alpha1.ScannedInvoiceDataService/GetScannedInvoiceInfo",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ScannedInvoiceDataServiceServer).GetScannedInvoiceInfo(ctx, req.(*GetInfoRequest))
	}
	return interceptor(ctx, in, info, handler)
}

var _ScannedInvoiceDataService_serviceDesc = grpc.ServiceDesc{
	ServiceName: "asgt.dataservice.v1alpha1.ScannedInvoiceDataService",
	HandlerType: (*ScannedInvoiceDataServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "CreateScannedInvoiceDataset",
			Handler:    _ScannedInvoiceDataService_CreateScannedInvoiceDataset_Handler,
		},
		{
			MethodName: "AppendScannedInvoiceData",
			Handler:    _ScannedInvoiceDataService_AppendScannedInvoiceData_Handler,
		},
		{
			MethodName: "DeleteScannedInvoiceData",
			Handler:    _ScannedInvoiceDataService_DeleteScannedInvoiceData_Handler,
		},
		{
			MethodName: "GetScannedInvoiceInfo",
			Handler:    _ScannedInvoiceDataService_GetScannedInvoiceInfo_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "asgt/dataservice/v1alpha1/scanned_invoice_data_service.proto",
}

func init() {
	proto.RegisterFile("asgt/dataservice/v1alpha1/scanned_invoice_data_service.proto", fileDescriptor_scanned_invoice_data_service_33f654a785cd6fbc)
}

var fileDescriptor_scanned_invoice_data_service_33f654a785cd6fbc = []byte{
	// 559 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xac, 0x94, 0xcf, 0x6f, 0xd3, 0x30,
	0x14, 0xc7, 0x95, 0xae, 0x63, 0x9a, 0xbb, 0x09, 0x64, 0x89, 0x29, 0xed, 0x10, 0x2b, 0xe1, 0x87,
	0xba, 0xa2, 0x25, 0x5a, 0x77, 0x2b, 0x70, 0x00, 0x56, 0x4d, 0x3d, 0x80, 0x50, 0x86, 0x38, 0x70,
	0x89, 0xbc, 0xf6, 0xb5, 0x44, 0x6a, 0x6d, 0x13, 0xbf, 0x56, 0xea, 0x15, 0x09, 0x24, 0xc4, 0x71,
	0x27, 0xc4, 0x89, 0xbf, 0x89, 0x7f, 0x81, 0x3f, 0x04, 0xd9, 0x71, 0x68, 0xbb, 0x92, 0x0c, 0xc4,
	0x6e, 0xb1, 0xdf, 0xf7, 0xbd, 0xf7, 0xf1, 0xd7, 0x2f, 0x26, 0x8f, 0x99, 0x1a, 0x62, 0xd0, 0x67,
	0xc8, 0x14, 0x24, 0xd3, 0xb8, 0x07, 0xc1, 0xf4, 0x90, 0x8d, 0xe4, 0x3b, 0x76, 0x18, 0xa8, 0x1e,
	0xe3, 0x1c, 0xfa, 0x51, 0xcc, 0xa7, 0x22, 0xee, 0x41, 0xa4, 0x45, 0x91, 0x55, 0xf9, 0x32, 0x11,
	0x28, 0x68, 0x55, 0x67, 0xfb, 0x0b, 0xd9, 0x7e, 0x96, 0x5d, 0x7b, 0x90, 0x5f, 0xb8, 0x0f, 0x23,
	0x40, 0x5b, 0xa2, 0x76, 0x2f, 0x5f, 0x17, 0xf3, 0x81, 0xb0, 0xaa, 0xba, 0x51, 0xe1, 0x4c, 0x42,
	0x90, 0x00, 0x02, 0xc7, 0x58, 0xf0, 0x48, 0x8a, 0x51, 0xdc, 0x9b, 0x59, 0xc5, 0xde, 0x5c, 0x71,
	0x01, 0xdc, 0x0a, 0x6e, 0xcd, 0x05, 0xc8, 0x92, 0x21, 0x60, 0x34, 0x65, 0xa3, 0xc9, 0xef, 0xe8,
	0x50, 0x88, 0xe1, 0x08, 0x02, 0x26, 0xe3, 0x80, 0x71, 0x2e, 0x90, 0xe9, 0x16, 0xca, 0x46, 0x77,
	0x6d, 0xd4, 0xac, 0xce, 0x26, 0x83, 0x00, 0xc6, 0x12, 0x6d, 0x67, 0xef, 0x93, 0x43, 0xdc, 0xd3,
	0xb4, 0x65, 0x37, 0xed, 0xd8, 0xe1, 0x98, 0xcc, 0xba, 0x5c, 0x4e, 0x90, 0x1e, 0x90, 0xb2, 0x3e,
	0x9b, 0xeb, 0xd4, 0x9d, 0x46, 0xa5, 0x55, 0xf5, 0x8d, 0x61, 0x1a, 0xc2, 0x5f, 0x4e, 0x09, 0x8d,
	0x8c, 0x3e, 0x22, 0xdb, 0x8b, 0x70, 0xca, 0x2d, 0xd5, 0xd7, 0x1a, 0x95, 0xd6, 0xce, 0x42, 0xde,
	0x6b, 0x13, 0x7f, 0xa3, 0xc3, 0xe1, 0x16, 0xce, 0x17, 0xca, 0xfb, 0x52, 0x22, 0xde, 0xf3, 0x04,
	0x18, 0xc2, 0x72, 0xed, 0x63, 0x63, 0x2e, 0x86, 0xf0, 0x7e, 0x02, 0x0a, 0xe9, 0x1d, 0xb2, 0x95,
	0xda, 0x8d, 0x11, 0x67, 0x63, 0x30, 0x68, 0x9b, 0x61, 0xc5, 0xee, 0xbd, 0x64, 0x63, 0xa0, 0x94,
	0x94, 0x91, 0x0d, 0xd3, 0xee, 0x9b, 0xa1, 0xf9, 0xa6, 0x2e, 0xd9, 0x48, 0xbb, 0x29, 0x77, 0xdd,
	0x6c, 0x67, 0x4b, 0xfa, 0x82, 0x6c, 0x00, 0xc7, 0x24, 0x06, 0xe5, 0xae, 0x19, 0xdc, 0x23, 0x3f,
	0x77, 0x2e, 0xfc, 0x3c, 0xa7, 0xc2, 0xac, 0x06, 0xed, 0x90, 0x1b, 0x17, 0xef, 0xd8, 0x2d, 0x1b,
	0xfb, 0x6a, 0x0b, 0x36, 0x84, 0x99, 0xe4, 0x95, 0x51, 0x84, 0xd7, 0x93, 0xe5, 0x0d, 0xef, 0xdc,
	0x21, 0x7b, 0x4f, 0xa5, 0x04, 0xde, 0x5f, 0x75, 0xe3, 0x1f, 0xac, 0xb8, 0xda, 0xc3, 0xb5, 0x3e,
	0xae, 0x93, 0xea, 0x2a, 0xcf, 0x69, 0x5a, 0x88, 0x7e, 0x77, 0xc8, 0x6e, 0xc1, 0x0d, 0xd2, 0x27,
	0x05, 0xbd, 0x2f, 0xbf, 0xf9, 0xda, 0x8e, 0x9f, 0xce, 0xb1, 0x9f, 0xcd, 0xb1, 0xdf, 0xd1, 0x73,
	0xec, 0x3d, 0xfc, 0xf0, 0xe3, 0xe7, 0x79, 0xe9, 0xbe, 0x57, 0x5f, 0xf9, 0xf9, 0x0f, 0xec, 0x3f,
	0xd4, 0xee, 0x99, 0xea, 0x6d, 0xa7, 0x49, 0xbf, 0x39, 0xc4, 0xcd, 0xf3, 0x95, 0xb6, 0x0b, 0x00,
	0x2f, 0xb9, 0x8c, 0xff, 0xa1, 0x63, 0xa6, 0xb4, 0xa6, 0xfb, 0xec, 0x10, 0xf7, 0xd8, 0xbc, 0x2f,
	0x7f, 0xa0, 0x6b, 0x14, 0xd0, 0xa5, 0x49, 0x57, 0xc0, 0x92, 0xbe, 0x6e, 0x9a, 0xe5, 0xab, 0x43,
	0x6e, 0x9e, 0x00, 0x2e, 0x83, 0x74, 0xf9, 0x40, 0xd0, 0xfd, 0x02, 0x90, 0x13, 0x40, 0xad, 0xc9,
	0x48, 0x9a, 0x7f, 0x23, 0x55, 0x52, 0x70, 0x05, 0xde, 0xbe, 0xa1, 0xbb, 0xeb, 0xdd, 0xce, 0xa7,
	0xd3, 0x6f, 0x6a, 0xdb, 0x69, 0x3e, 0xdb, 0x7e, 0x5b, 0x59, 0x28, 0x79, 0x76, 0xcd, 0x9c, 0xf3,
	0xe8, 0x57, 0x00, 0x00, 0x00, 0xff, 0xff, 0x40, 0xbc, 0x9b, 0x2c, 0x0f, 0x06, 0x00, 0x00,
}
