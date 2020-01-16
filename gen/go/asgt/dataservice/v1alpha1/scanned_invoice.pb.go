// Code generated by protoc-gen-go. DO NOT EDIT.
// source: asgt/dataservice/v1alpha1/scanned_invoice.proto

package dataservice

import proto "github.com/golang/protobuf/proto"
import fmt "fmt"
import math "math"
import v1alpha1 "github.com/e-conomic/vmlapis/gen/go/asgt/jester/v1alpha1"
import _type "github.com/e-conomic/vmlapis/gen/go/asgt/type"
import _ "github.com/e-conomic/vmlapis/gen/go/gen_bq_schema"
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

// Scanned Invoice
type ScannedInvoiceEntry struct {
	Id                   string                               `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	Consumer             string                               `protobuf:"bytes,2,opt,name=consumer,proto3" json:"consumer,omitempty"`
	Dataset              string                               `protobuf:"bytes,3,opt,name=dataset,proto3" json:"dataset,omitempty"`
	Tags                 []string                             `protobuf:"bytes,4,rep,name=tags,proto3" json:"tags,omitempty"`
	Input                *v1alpha1.ScannedInvoiceRequest_Data `protobuf:"bytes,5,opt,name=input,proto3" json:"input,omitempty"`
	TrueValues           []*DataTuple                         `protobuf:"bytes,6,rep,name=true_values,json=trueValues,proto3" json:"true_values,omitempty"`
	PredValues           []*PredictedTuple                    `protobuf:"bytes,7,rep,name=pred_values,json=predValues,proto3" json:"pred_values,omitempty"`
	TimeAdded            uint64                               `protobuf:"varint,8,opt,name=time_added,json=timeAdded,proto3" json:"time_added,omitempty"`
	XXX_NoUnkeyedLiteral struct{}                             `json:"-"`
	XXX_unrecognized     []byte                               `json:"-"`
	XXX_sizecache        int32                                `json:"-"`
}

func (m *ScannedInvoiceEntry) Reset()         { *m = ScannedInvoiceEntry{} }
func (m *ScannedInvoiceEntry) String() string { return proto.CompactTextString(m) }
func (*ScannedInvoiceEntry) ProtoMessage()    {}
func (*ScannedInvoiceEntry) Descriptor() ([]byte, []int) {
	return fileDescriptor_scanned_invoice_c7b4f8b33f0f475e, []int{0}
}
func (m *ScannedInvoiceEntry) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_ScannedInvoiceEntry.Unmarshal(m, b)
}
func (m *ScannedInvoiceEntry) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_ScannedInvoiceEntry.Marshal(b, m, deterministic)
}
func (dst *ScannedInvoiceEntry) XXX_Merge(src proto.Message) {
	xxx_messageInfo_ScannedInvoiceEntry.Merge(dst, src)
}
func (m *ScannedInvoiceEntry) XXX_Size() int {
	return xxx_messageInfo_ScannedInvoiceEntry.Size(m)
}
func (m *ScannedInvoiceEntry) XXX_DiscardUnknown() {
	xxx_messageInfo_ScannedInvoiceEntry.DiscardUnknown(m)
}

var xxx_messageInfo_ScannedInvoiceEntry proto.InternalMessageInfo

func (m *ScannedInvoiceEntry) GetId() string {
	if m != nil {
		return m.Id
	}
	return ""
}

func (m *ScannedInvoiceEntry) GetConsumer() string {
	if m != nil {
		return m.Consumer
	}
	return ""
}

func (m *ScannedInvoiceEntry) GetDataset() string {
	if m != nil {
		return m.Dataset
	}
	return ""
}

func (m *ScannedInvoiceEntry) GetTags() []string {
	if m != nil {
		return m.Tags
	}
	return nil
}

func (m *ScannedInvoiceEntry) GetInput() *v1alpha1.ScannedInvoiceRequest_Data {
	if m != nil {
		return m.Input
	}
	return nil
}

func (m *ScannedInvoiceEntry) GetTrueValues() []*DataTuple {
	if m != nil {
		return m.TrueValues
	}
	return nil
}

func (m *ScannedInvoiceEntry) GetPredValues() []*PredictedTuple {
	if m != nil {
		return m.PredValues
	}
	return nil
}

func (m *ScannedInvoiceEntry) GetTimeAdded() uint64 {
	if m != nil {
		return m.TimeAdded
	}
	return 0
}

type PrepareScannedInvoiceRequest struct {
	Dataset              string                                `protobuf:"bytes,1,opt,name=dataset,proto3" json:"dataset,omitempty"`
	Tags                 []string                              `protobuf:"bytes,2,rep,name=tags,proto3" json:"tags,omitempty"`
	Entries              []*PrepareScannedInvoiceRequest_Entry `protobuf:"bytes,3,rep,name=entries,proto3" json:"entries,omitempty"`
	XXX_NoUnkeyedLiteral struct{}                              `json:"-"`
	XXX_unrecognized     []byte                                `json:"-"`
	XXX_sizecache        int32                                 `json:"-"`
}

func (m *PrepareScannedInvoiceRequest) Reset()         { *m = PrepareScannedInvoiceRequest{} }
func (m *PrepareScannedInvoiceRequest) String() string { return proto.CompactTextString(m) }
func (*PrepareScannedInvoiceRequest) ProtoMessage()    {}
func (*PrepareScannedInvoiceRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_scanned_invoice_c7b4f8b33f0f475e, []int{1}
}
func (m *PrepareScannedInvoiceRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_PrepareScannedInvoiceRequest.Unmarshal(m, b)
}
func (m *PrepareScannedInvoiceRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_PrepareScannedInvoiceRequest.Marshal(b, m, deterministic)
}
func (dst *PrepareScannedInvoiceRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_PrepareScannedInvoiceRequest.Merge(dst, src)
}
func (m *PrepareScannedInvoiceRequest) XXX_Size() int {
	return xxx_messageInfo_PrepareScannedInvoiceRequest.Size(m)
}
func (m *PrepareScannedInvoiceRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_PrepareScannedInvoiceRequest.DiscardUnknown(m)
}

var xxx_messageInfo_PrepareScannedInvoiceRequest proto.InternalMessageInfo

func (m *PrepareScannedInvoiceRequest) GetDataset() string {
	if m != nil {
		return m.Dataset
	}
	return ""
}

func (m *PrepareScannedInvoiceRequest) GetTags() []string {
	if m != nil {
		return m.Tags
	}
	return nil
}

func (m *PrepareScannedInvoiceRequest) GetEntries() []*PrepareScannedInvoiceRequest_Entry {
	if m != nil {
		return m.Entries
	}
	return nil
}

type PrepareScannedInvoiceRequest_Entry struct {
	Id                   string                               `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	Input                *v1alpha1.ScannedInvoiceRequest_Data `protobuf:"bytes,2,opt,name=input,proto3" json:"input,omitempty"`
	Predictions          []*_type.Prediction                  `protobuf:"bytes,3,rep,name=predictions,proto3" json:"predictions,omitempty"`
	XXX_NoUnkeyedLiteral struct{}                             `json:"-"`
	XXX_unrecognized     []byte                               `json:"-"`
	XXX_sizecache        int32                                `json:"-"`
}

func (m *PrepareScannedInvoiceRequest_Entry) Reset()         { *m = PrepareScannedInvoiceRequest_Entry{} }
func (m *PrepareScannedInvoiceRequest_Entry) String() string { return proto.CompactTextString(m) }
func (*PrepareScannedInvoiceRequest_Entry) ProtoMessage()    {}
func (*PrepareScannedInvoiceRequest_Entry) Descriptor() ([]byte, []int) {
	return fileDescriptor_scanned_invoice_c7b4f8b33f0f475e, []int{1, 0}
}
func (m *PrepareScannedInvoiceRequest_Entry) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_PrepareScannedInvoiceRequest_Entry.Unmarshal(m, b)
}
func (m *PrepareScannedInvoiceRequest_Entry) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_PrepareScannedInvoiceRequest_Entry.Marshal(b, m, deterministic)
}
func (dst *PrepareScannedInvoiceRequest_Entry) XXX_Merge(src proto.Message) {
	xxx_messageInfo_PrepareScannedInvoiceRequest_Entry.Merge(dst, src)
}
func (m *PrepareScannedInvoiceRequest_Entry) XXX_Size() int {
	return xxx_messageInfo_PrepareScannedInvoiceRequest_Entry.Size(m)
}
func (m *PrepareScannedInvoiceRequest_Entry) XXX_DiscardUnknown() {
	xxx_messageInfo_PrepareScannedInvoiceRequest_Entry.DiscardUnknown(m)
}

var xxx_messageInfo_PrepareScannedInvoiceRequest_Entry proto.InternalMessageInfo

func (m *PrepareScannedInvoiceRequest_Entry) GetId() string {
	if m != nil {
		return m.Id
	}
	return ""
}

func (m *PrepareScannedInvoiceRequest_Entry) GetInput() *v1alpha1.ScannedInvoiceRequest_Data {
	if m != nil {
		return m.Input
	}
	return nil
}

func (m *PrepareScannedInvoiceRequest_Entry) GetPredictions() []*_type.Prediction {
	if m != nil {
		return m.Predictions
	}
	return nil
}

type AddScannedInvoiceDataRequest struct {
	Dataset              string                                `protobuf:"bytes,1,opt,name=dataset,proto3" json:"dataset,omitempty"`
	Tags                 []string                              `protobuf:"bytes,2,rep,name=tags,proto3" json:"tags,omitempty"`
	Entries              []*AddScannedInvoiceDataRequest_Entry `protobuf:"bytes,3,rep,name=entries,proto3" json:"entries,omitempty"`
	RetentionPolicy      *RetentionPolicy                      `protobuf:"bytes,4,opt,name=retention_policy,json=retentionPolicy,proto3" json:"retention_policy,omitempty"`
	XXX_NoUnkeyedLiteral struct{}                              `json:"-"`
	XXX_unrecognized     []byte                                `json:"-"`
	XXX_sizecache        int32                                 `json:"-"`
}

func (m *AddScannedInvoiceDataRequest) Reset()         { *m = AddScannedInvoiceDataRequest{} }
func (m *AddScannedInvoiceDataRequest) String() string { return proto.CompactTextString(m) }
func (*AddScannedInvoiceDataRequest) ProtoMessage()    {}
func (*AddScannedInvoiceDataRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_scanned_invoice_c7b4f8b33f0f475e, []int{2}
}
func (m *AddScannedInvoiceDataRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_AddScannedInvoiceDataRequest.Unmarshal(m, b)
}
func (m *AddScannedInvoiceDataRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_AddScannedInvoiceDataRequest.Marshal(b, m, deterministic)
}
func (dst *AddScannedInvoiceDataRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_AddScannedInvoiceDataRequest.Merge(dst, src)
}
func (m *AddScannedInvoiceDataRequest) XXX_Size() int {
	return xxx_messageInfo_AddScannedInvoiceDataRequest.Size(m)
}
func (m *AddScannedInvoiceDataRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_AddScannedInvoiceDataRequest.DiscardUnknown(m)
}

var xxx_messageInfo_AddScannedInvoiceDataRequest proto.InternalMessageInfo

func (m *AddScannedInvoiceDataRequest) GetDataset() string {
	if m != nil {
		return m.Dataset
	}
	return ""
}

func (m *AddScannedInvoiceDataRequest) GetTags() []string {
	if m != nil {
		return m.Tags
	}
	return nil
}

func (m *AddScannedInvoiceDataRequest) GetEntries() []*AddScannedInvoiceDataRequest_Entry {
	if m != nil {
		return m.Entries
	}
	return nil
}

func (m *AddScannedInvoiceDataRequest) GetRetentionPolicy() *RetentionPolicy {
	if m != nil {
		return m.RetentionPolicy
	}
	return nil
}

type AddScannedInvoiceDataRequest_Entry struct {
	Input                *v1alpha1.ScannedInvoiceRequest_Data `protobuf:"bytes,1,opt,name=input,proto3" json:"input,omitempty"`
	TrueValues           []*DataTuple                         `protobuf:"bytes,2,rep,name=true_values,json=trueValues,proto3" json:"true_values,omitempty"`
	XXX_NoUnkeyedLiteral struct{}                             `json:"-"`
	XXX_unrecognized     []byte                               `json:"-"`
	XXX_sizecache        int32                                `json:"-"`
}

func (m *AddScannedInvoiceDataRequest_Entry) Reset()         { *m = AddScannedInvoiceDataRequest_Entry{} }
func (m *AddScannedInvoiceDataRequest_Entry) String() string { return proto.CompactTextString(m) }
func (*AddScannedInvoiceDataRequest_Entry) ProtoMessage()    {}
func (*AddScannedInvoiceDataRequest_Entry) Descriptor() ([]byte, []int) {
	return fileDescriptor_scanned_invoice_c7b4f8b33f0f475e, []int{2, 0}
}
func (m *AddScannedInvoiceDataRequest_Entry) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_AddScannedInvoiceDataRequest_Entry.Unmarshal(m, b)
}
func (m *AddScannedInvoiceDataRequest_Entry) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_AddScannedInvoiceDataRequest_Entry.Marshal(b, m, deterministic)
}
func (dst *AddScannedInvoiceDataRequest_Entry) XXX_Merge(src proto.Message) {
	xxx_messageInfo_AddScannedInvoiceDataRequest_Entry.Merge(dst, src)
}
func (m *AddScannedInvoiceDataRequest_Entry) XXX_Size() int {
	return xxx_messageInfo_AddScannedInvoiceDataRequest_Entry.Size(m)
}
func (m *AddScannedInvoiceDataRequest_Entry) XXX_DiscardUnknown() {
	xxx_messageInfo_AddScannedInvoiceDataRequest_Entry.DiscardUnknown(m)
}

var xxx_messageInfo_AddScannedInvoiceDataRequest_Entry proto.InternalMessageInfo

func (m *AddScannedInvoiceDataRequest_Entry) GetInput() *v1alpha1.ScannedInvoiceRequest_Data {
	if m != nil {
		return m.Input
	}
	return nil
}

func (m *AddScannedInvoiceDataRequest_Entry) GetTrueValues() []*DataTuple {
	if m != nil {
		return m.TrueValues
	}
	return nil
}

func init() {
	proto.RegisterType((*ScannedInvoiceEntry)(nil), "asgt.dataservice.v1alpha1.ScannedInvoiceEntry")
	proto.RegisterType((*PrepareScannedInvoiceRequest)(nil), "asgt.dataservice.v1alpha1.PrepareScannedInvoiceRequest")
	proto.RegisterType((*PrepareScannedInvoiceRequest_Entry)(nil), "asgt.dataservice.v1alpha1.PrepareScannedInvoiceRequest.Entry")
	proto.RegisterType((*AddScannedInvoiceDataRequest)(nil), "asgt.dataservice.v1alpha1.AddScannedInvoiceDataRequest")
	proto.RegisterType((*AddScannedInvoiceDataRequest_Entry)(nil), "asgt.dataservice.v1alpha1.AddScannedInvoiceDataRequest.Entry")
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConn

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion4

// ScannedInvoiceDataserviceClient is the client API for ScannedInvoiceDataservice service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type ScannedInvoiceDataserviceClient interface {
	PrepareScannedInvoice(ctx context.Context, in *PrepareScannedInvoiceRequest, opts ...grpc.CallOption) (*empty.Empty, error)
	ScannedInvoiceFeedback(ctx context.Context, in *FeedbackRequest, opts ...grpc.CallOption) (*empty.Empty, error)
	AddScannedInvoiceData(ctx context.Context, in *AddScannedInvoiceDataRequest, opts ...grpc.CallOption) (*empty.Empty, error)
	DeleteScannedInvoice(ctx context.Context, in *DeleteRequest, opts ...grpc.CallOption) (*empty.Empty, error)
}

type scannedInvoiceDataserviceClient struct {
	cc *grpc.ClientConn
}

func NewScannedInvoiceDataserviceClient(cc *grpc.ClientConn) ScannedInvoiceDataserviceClient {
	return &scannedInvoiceDataserviceClient{cc}
}

func (c *scannedInvoiceDataserviceClient) PrepareScannedInvoice(ctx context.Context, in *PrepareScannedInvoiceRequest, opts ...grpc.CallOption) (*empty.Empty, error) {
	out := new(empty.Empty)
	err := c.cc.Invoke(ctx, "/asgt.dataservice.v1alpha1.ScannedInvoiceDataservice/PrepareScannedInvoice", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *scannedInvoiceDataserviceClient) ScannedInvoiceFeedback(ctx context.Context, in *FeedbackRequest, opts ...grpc.CallOption) (*empty.Empty, error) {
	out := new(empty.Empty)
	err := c.cc.Invoke(ctx, "/asgt.dataservice.v1alpha1.ScannedInvoiceDataservice/ScannedInvoiceFeedback", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *scannedInvoiceDataserviceClient) AddScannedInvoiceData(ctx context.Context, in *AddScannedInvoiceDataRequest, opts ...grpc.CallOption) (*empty.Empty, error) {
	out := new(empty.Empty)
	err := c.cc.Invoke(ctx, "/asgt.dataservice.v1alpha1.ScannedInvoiceDataservice/AddScannedInvoiceData", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *scannedInvoiceDataserviceClient) DeleteScannedInvoice(ctx context.Context, in *DeleteRequest, opts ...grpc.CallOption) (*empty.Empty, error) {
	out := new(empty.Empty)
	err := c.cc.Invoke(ctx, "/asgt.dataservice.v1alpha1.ScannedInvoiceDataservice/DeleteScannedInvoice", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// ScannedInvoiceDataserviceServer is the server API for ScannedInvoiceDataservice service.
type ScannedInvoiceDataserviceServer interface {
	PrepareScannedInvoice(context.Context, *PrepareScannedInvoiceRequest) (*empty.Empty, error)
	ScannedInvoiceFeedback(context.Context, *FeedbackRequest) (*empty.Empty, error)
	AddScannedInvoiceData(context.Context, *AddScannedInvoiceDataRequest) (*empty.Empty, error)
	DeleteScannedInvoice(context.Context, *DeleteRequest) (*empty.Empty, error)
}

func RegisterScannedInvoiceDataserviceServer(s *grpc.Server, srv ScannedInvoiceDataserviceServer) {
	s.RegisterService(&_ScannedInvoiceDataservice_serviceDesc, srv)
}

func _ScannedInvoiceDataservice_PrepareScannedInvoice_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(PrepareScannedInvoiceRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ScannedInvoiceDataserviceServer).PrepareScannedInvoice(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/asgt.dataservice.v1alpha1.ScannedInvoiceDataservice/PrepareScannedInvoice",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ScannedInvoiceDataserviceServer).PrepareScannedInvoice(ctx, req.(*PrepareScannedInvoiceRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _ScannedInvoiceDataservice_ScannedInvoiceFeedback_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(FeedbackRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ScannedInvoiceDataserviceServer).ScannedInvoiceFeedback(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/asgt.dataservice.v1alpha1.ScannedInvoiceDataservice/ScannedInvoiceFeedback",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ScannedInvoiceDataserviceServer).ScannedInvoiceFeedback(ctx, req.(*FeedbackRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _ScannedInvoiceDataservice_AddScannedInvoiceData_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(AddScannedInvoiceDataRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ScannedInvoiceDataserviceServer).AddScannedInvoiceData(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/asgt.dataservice.v1alpha1.ScannedInvoiceDataservice/AddScannedInvoiceData",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ScannedInvoiceDataserviceServer).AddScannedInvoiceData(ctx, req.(*AddScannedInvoiceDataRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _ScannedInvoiceDataservice_DeleteScannedInvoice_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DeleteRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ScannedInvoiceDataserviceServer).DeleteScannedInvoice(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/asgt.dataservice.v1alpha1.ScannedInvoiceDataservice/DeleteScannedInvoice",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ScannedInvoiceDataserviceServer).DeleteScannedInvoice(ctx, req.(*DeleteRequest))
	}
	return interceptor(ctx, in, info, handler)
}

var _ScannedInvoiceDataservice_serviceDesc = grpc.ServiceDesc{
	ServiceName: "asgt.dataservice.v1alpha1.ScannedInvoiceDataservice",
	HandlerType: (*ScannedInvoiceDataserviceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "PrepareScannedInvoice",
			Handler:    _ScannedInvoiceDataservice_PrepareScannedInvoice_Handler,
		},
		{
			MethodName: "ScannedInvoiceFeedback",
			Handler:    _ScannedInvoiceDataservice_ScannedInvoiceFeedback_Handler,
		},
		{
			MethodName: "AddScannedInvoiceData",
			Handler:    _ScannedInvoiceDataservice_AddScannedInvoiceData_Handler,
		},
		{
			MethodName: "DeleteScannedInvoice",
			Handler:    _ScannedInvoiceDataservice_DeleteScannedInvoice_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "asgt/dataservice/v1alpha1/scanned_invoice.proto",
}

func init() {
	proto.RegisterFile("asgt/dataservice/v1alpha1/scanned_invoice.proto", fileDescriptor_scanned_invoice_c7b4f8b33f0f475e)
}

var fileDescriptor_scanned_invoice_c7b4f8b33f0f475e = []byte{
	// 812 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xb4, 0x55, 0xdd, 0x6e, 0xe3, 0x44,
	0x18, 0x95, 0x9d, 0x74, 0xdb, 0x4e, 0xb4, 0xb0, 0x1a, 0xb6, 0x95, 0x1b, 0x8a, 0x98, 0x5a, 0x2b,
	0x14, 0xaa, 0x62, 0xb3, 0xe5, 0xa2, 0x52, 0x25, 0x14, 0xb5, 0x34, 0x45, 0x45, 0x5a, 0x29, 0xf2,
	0x06, 0x90, 0xf6, 0xc6, 0x9a, 0x78, 0xbe, 0x24, 0xc3, 0x3a, 0x63, 0xd7, 0x1e, 0x47, 0x0a, 0x97,
	0x5c, 0x72, 0x09, 0x02, 0x71, 0x8f, 0x78, 0x0f, 0xde, 0x81, 0x57, 0xe0, 0x2a, 0x4f, 0x81, 0x3c,
	0x63, 0xe7, 0x8f, 0xc4, 0x2b, 0x15, 0xf6, 0xd2, 0x33, 0xdf, 0x39, 0xf3, 0xcd, 0x39, 0xe7, 0x1b,
	0x23, 0x97, 0xa6, 0x43, 0xe9, 0x32, 0x2a, 0x69, 0x0a, 0xc9, 0x84, 0x07, 0xe0, 0x4e, 0x9e, 0xd3,
	0x30, 0x1e, 0xd1, 0xe7, 0x6e, 0x1a, 0x50, 0x21, 0x80, 0xf9, 0x5c, 0x4c, 0x22, 0x1e, 0x80, 0x13,
	0x27, 0x91, 0x8c, 0xf0, 0x51, 0x0e, 0x70, 0x96, 0x00, 0x4e, 0x09, 0x68, 0x3e, 0xdb, 0xce, 0x95,
	0x2f, 0x6a, 0x82, 0xe6, 0x89, 0xaa, 0xfa, 0x0e, 0x52, 0x09, 0xc9, 0xa2, 0x40, 0x7f, 0x17, 0x25,
	0x4d, 0x55, 0x22, 0xa7, 0x31, 0xb8, 0x71, 0x02, 0x8c, 0x07, 0x92, 0x47, 0xa2, 0xd8, 0x3b, 0x1e,
	0x82, 0xf0, 0xfb, 0xf7, 0x7e, 0x1a, 0x8c, 0x60, 0x4c, 0xdd, 0xfe, 0xbd, 0x3f, 0xe0, 0x10, 0xb2,
	0xad, 0xbb, 0x92, 0xf6, 0x43, 0x98, 0xef, 0x46, 0xd1, 0x30, 0x04, 0x97, 0xc6, 0xdc, 0xa5, 0x42,
	0x44, 0x92, 0xe6, 0xc4, 0x69, 0xb1, 0xfb, 0x7e, 0xb1, 0xab, 0xbe, 0xfa, 0xd9, 0xc0, 0x85, 0x71,
	0x2c, 0xa7, 0x7a, 0xd3, 0xfe, 0xa3, 0x8e, 0xde, 0x7b, 0xa9, 0x05, 0xb9, 0xd3, 0x7a, 0x74, 0x84,
	0x4c, 0xa6, 0xf8, 0x4b, 0x64, 0x72, 0x66, 0x19, 0xc4, 0x68, 0xed, 0x5f, 0x5f, 0xcc, 0xda, 0xae,
	0xfd, 0xc9, 0xdd, 0xcd, 0x19, 0x19, 0x53, 0x19, 0x8c, 0x20, 0x25, 0x1d, 0x31, 0x89, 0xa6, 0x24,
	0x81, 0xfb, 0x0c, 0x52, 0x49, 0x38, 0x23, 0x7c, 0x40, 0x06, 0x00, 0xac, 0x4f, 0x83, 0xd7, 0x24,
	0xd7, 0x64, 0xd6, 0x36, 0xf7, 0x0c, 0xcf, 0xe4, 0x0c, 0x9f, 0xa0, 0xbd, 0x20, 0x12, 0x69, 0x36,
	0x86, 0xc4, 0x32, 0x15, 0xdd, 0x8e, 0xde, 0x9c, 0x2f, 0xe3, 0x0f, 0xd1, 0xae, 0x16, 0x57, 0x5a,
	0xb5, 0xe5, 0x8a, 0x72, 0x15, 0xbf, 0x42, 0x75, 0x49, 0x87, 0xa9, 0x55, 0x27, 0xb5, 0xd6, 0xfe,
	0xf5, 0xed, 0xac, 0xfd, 0x85, 0x7d, 0xd5, 0xa3, 0xc3, 0x94, 0x30, 0x18, 0x70, 0x01, 0x8c, 0xf4,
	0xa7, 0xa4, 0x64, 0x3b, 0x23, 0x20, 0x12, 0x1e, 0x8c, 0xf4, 0x6a, 0x61, 0x58, 0xde, 0xdf, 0x84,
	0x86, 0x20, 0x5f, 0xc3, 0x94, 0xf0, 0x94, 0x64, 0x29, 0x30, 0x4f, 0x71, 0xe2, 0x5b, 0xb4, 0xc3,
	0x45, 0x9c, 0x49, 0x6b, 0x87, 0x18, 0xad, 0xc6, 0xf9, 0xa7, 0x8e, 0xca, 0x41, 0x61, 0x5b, 0x69,
	0xa3, 0xb3, 0x2a, 0x91, 0xa7, 0x2f, 0xee, 0xdc, 0x50, 0x49, 0x3d, 0x0d, 0xc7, 0x1d, 0xd4, 0x90,
	0x49, 0x06, 0xfe, 0x84, 0x86, 0x19, 0xa4, 0xd6, 0x23, 0x52, 0x6b, 0x35, 0xce, 0x9f, 0x39, 0x5b,
	0x53, 0xa5, 0xc0, 0xbd, 0x2c, 0x0e, 0xc1, 0x43, 0x39, 0xf0, 0x1b, 0x85, 0xc3, 0x5f, 0xa1, 0x46,
	0x1e, 0x8d, 0x92, 0x66, 0x57, 0xd1, 0x7c, 0x5c, 0x41, 0xd3, 0xd5, 0x41, 0x02, 0x56, 0x70, 0xe5,
	0xe8, 0x82, 0xcb, 0x45, 0x48, 0xf2, 0x31, 0xf8, 0x94, 0x31, 0x60, 0xd6, 0x1e, 0x31, 0x5a, 0xf5,
	0xeb, 0x27, 0xb3, 0xf6, 0xe3, 0x3d, 0x03, 0xef, 0xf7, 0xee, 0x5e, 0x74, 0x5e, 0xf6, 0xae, 0x5e,
	0x74, 0xbd, 0xfd, 0xbc, 0xe6, 0x2a, 0x2f, 0xb9, 0x3c, 0x9a, 0xb5, 0x0f, 0xd1, 0xd3, 0xb5, 0xf9,
	0xf0, 0xf3, 0x63, 0xed, 0x3f, 0x4d, 0x74, 0xdc, 0x4d, 0x20, 0xa6, 0x09, 0x6c, 0xd4, 0x02, 0x5b,
	0x0b, 0x13, 0x55, 0x6a, 0x16, 0xee, 0xe1, 0xc2, 0x3d, 0x33, 0x77, 0xaf, 0x50, 0xfd, 0x5b, 0xb4,
	0x0b, 0x42, 0x26, 0x1c, 0x52, 0xab, 0xa6, 0xae, 0xf8, 0x79, 0xf5, 0x15, 0xb7, 0x9e, 0xeb, 0xa8,
	0xb8, 0x7a, 0x25, 0x5b, 0xf3, 0x37, 0x03, 0xed, 0xe8, 0x04, 0xbf, 0xb3, 0x48, 0xb0, 0x0a, 0xe2,
	0xdc, 0x68, 0xf3, 0xbf, 0x19, 0x7d, 0xa1, 0x1d, 0xd2, 0xc3, 0x5b, 0xb6, 0x7f, 0xa0, 0xd9, 0xf2,
	0xd1, 0x2e, 0x1d, 0xe1, 0x91, 0xf0, 0x96, 0x2b, 0xed, 0x5f, 0x6a, 0xe8, 0xf8, 0x8a, 0xb1, 0xd5,
	0x13, 0x14, 0xf3, 0xdb, 0x97, 0xb0, 0xea, 0xdc, 0x35, 0x09, 0xf1, 0xd7, 0xe8, 0x49, 0x02, 0x12,
	0x44, 0xde, 0xb5, 0x1f, 0x47, 0x21, 0x0f, 0xa6, 0x56, 0x5d, 0x69, 0x76, 0x5a, 0x71, 0x82, 0x57,
	0x42, 0xba, 0x0a, 0xe1, 0xbd, 0x9b, 0xac, 0x2e, 0x34, 0x7f, 0x9d, 0x3b, 0x33, 0x77, 0xc2, 0xf8,
	0x5f, 0x47, 0xce, 0x7c, 0xd8, 0xc8, 0x9d, 0xff, 0x5e, 0x47, 0x47, 0xff, 0x16, 0xa7, 0x00, 0xe3,
	0x11, 0x3a, 0xd8, 0x98, 0x3f, 0x7c, 0xf1, 0xc0, 0xc4, 0x36, 0x0f, 0x1d, 0xfd, 0x20, 0x3b, 0xe5,
	0x83, 0xec, 0x74, 0xf2, 0x07, 0x19, 0xff, 0x68, 0xa0, 0xc3, 0x55, 0xc4, 0x6d, 0xf1, 0xa4, 0xe2,
	0x2a, 0xe1, 0xcb, 0xa2, 0x37, 0xd0, 0xdb, 0x67, 0x3f, 0xfc, 0xf5, 0xf7, 0xcf, 0xe6, 0x47, 0xf6,
	0xc9, 0xe2, 0xe7, 0x54, 0x3e, 0xd9, 0x97, 0xc5, 0xc8, 0x17, 0x13, 0x7f, 0x69, 0x9c, 0xe2, 0x9f,
	0x0c, 0x74, 0xb0, 0x31, 0x34, 0x95, 0xf7, 0xae, 0x8a, 0xd9, 0xd6, 0xc6, 0x5a, 0xaa, 0x31, 0xdb,
	0xfe, 0x60, 0xf5, 0xb7, 0xba, 0xa1, 0xa9, 0xef, 0xd1, 0xd3, 0x1b, 0x08, 0x41, 0xae, 0x5b, 0xd1,
	0xaa, 0xf2, 0x5c, 0x01, 0xde, 0xd4, 0x03, 0x51, 0x3d, 0x34, 0xed, 0x83, 0xb5, 0x1e, 0x98, 0x42,
	0x5f, 0x1a, 0xa7, 0xd7, 0x8f, 0x5f, 0x35, 0x96, 0xf8, 0xfb, 0x8f, 0x14, 0xc1, 0x67, 0xff, 0x04,
	0x00, 0x00, 0xff, 0xff, 0xc4, 0xd0, 0x16, 0x32, 0x68, 0x08, 0x00, 0x00,
}
