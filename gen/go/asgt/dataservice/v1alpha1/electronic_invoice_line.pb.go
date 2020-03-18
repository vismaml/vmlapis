// Code generated by protoc-gen-go. DO NOT EDIT.
// source: asgt/dataservice/v1alpha1/electronic_invoice_line.proto

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

// Electronic Invoice Line BQ schema gen - could be used for adding direct developer data endpoints
type ElectronicInvoiceLineEntry struct {
	Id                   string                                      `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	Consumer             string                                      `protobuf:"bytes,2,opt,name=consumer,proto3" json:"consumer,omitempty"`
	Dataset              string                                      `protobuf:"bytes,3,opt,name=dataset,proto3" json:"dataset,omitempty"`
	Tags                 []string                                    `protobuf:"bytes,4,rep,name=tags,proto3" json:"tags,omitempty"`
	Input                *v1alpha1.ElectronicInvoiceLineRequest_Data `protobuf:"bytes,5,opt,name=input,proto3" json:"input,omitempty"`
	TrueValues           []*DataTuple                                `protobuf:"bytes,6,rep,name=true_values,json=trueValues,proto3" json:"true_values,omitempty"`
	PredValues           []*PredictedTuple                           `protobuf:"bytes,7,rep,name=pred_values,json=predValues,proto3" json:"pred_values,omitempty"`
	TimeAdded            uint64                                      `protobuf:"varint,8,opt,name=time_added,json=timeAdded,proto3" json:"time_added,omitempty"`
	XXX_NoUnkeyedLiteral struct{}                                    `json:"-"`
	XXX_unrecognized     []byte                                      `json:"-"`
	XXX_sizecache        int32                                       `json:"-"`
}

func (m *ElectronicInvoiceLineEntry) Reset()         { *m = ElectronicInvoiceLineEntry{} }
func (m *ElectronicInvoiceLineEntry) String() string { return proto.CompactTextString(m) }
func (*ElectronicInvoiceLineEntry) ProtoMessage()    {}
func (*ElectronicInvoiceLineEntry) Descriptor() ([]byte, []int) {
	return fileDescriptor_electronic_invoice_line_824ab4f15de6c28c, []int{0}
}
func (m *ElectronicInvoiceLineEntry) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_ElectronicInvoiceLineEntry.Unmarshal(m, b)
}
func (m *ElectronicInvoiceLineEntry) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_ElectronicInvoiceLineEntry.Marshal(b, m, deterministic)
}
func (dst *ElectronicInvoiceLineEntry) XXX_Merge(src proto.Message) {
	xxx_messageInfo_ElectronicInvoiceLineEntry.Merge(dst, src)
}
func (m *ElectronicInvoiceLineEntry) XXX_Size() int {
	return xxx_messageInfo_ElectronicInvoiceLineEntry.Size(m)
}
func (m *ElectronicInvoiceLineEntry) XXX_DiscardUnknown() {
	xxx_messageInfo_ElectronicInvoiceLineEntry.DiscardUnknown(m)
}

var xxx_messageInfo_ElectronicInvoiceLineEntry proto.InternalMessageInfo

func (m *ElectronicInvoiceLineEntry) GetId() string {
	if m != nil {
		return m.Id
	}
	return ""
}

func (m *ElectronicInvoiceLineEntry) GetConsumer() string {
	if m != nil {
		return m.Consumer
	}
	return ""
}

func (m *ElectronicInvoiceLineEntry) GetDataset() string {
	if m != nil {
		return m.Dataset
	}
	return ""
}

func (m *ElectronicInvoiceLineEntry) GetTags() []string {
	if m != nil {
		return m.Tags
	}
	return nil
}

func (m *ElectronicInvoiceLineEntry) GetInput() *v1alpha1.ElectronicInvoiceLineRequest_Data {
	if m != nil {
		return m.Input
	}
	return nil
}

func (m *ElectronicInvoiceLineEntry) GetTrueValues() []*DataTuple {
	if m != nil {
		return m.TrueValues
	}
	return nil
}

func (m *ElectronicInvoiceLineEntry) GetPredValues() []*PredictedTuple {
	if m != nil {
		return m.PredValues
	}
	return nil
}

func (m *ElectronicInvoiceLineEntry) GetTimeAdded() uint64 {
	if m != nil {
		return m.TimeAdded
	}
	return 0
}

type PrepareElectronicInvoiceLineRequest struct {
	Dataset              string                                       `protobuf:"bytes,1,opt,name=dataset,proto3" json:"dataset,omitempty"`
	Tags                 []string                                     `protobuf:"bytes,2,rep,name=tags,proto3" json:"tags,omitempty"`
	Entries              []*PrepareElectronicInvoiceLineRequest_Entry `protobuf:"bytes,3,rep,name=entries,proto3" json:"entries,omitempty"`
	XXX_NoUnkeyedLiteral struct{}                                     `json:"-"`
	XXX_unrecognized     []byte                                       `json:"-"`
	XXX_sizecache        int32                                        `json:"-"`
}

func (m *PrepareElectronicInvoiceLineRequest) Reset()         { *m = PrepareElectronicInvoiceLineRequest{} }
func (m *PrepareElectronicInvoiceLineRequest) String() string { return proto.CompactTextString(m) }
func (*PrepareElectronicInvoiceLineRequest) ProtoMessage()    {}
func (*PrepareElectronicInvoiceLineRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_electronic_invoice_line_824ab4f15de6c28c, []int{1}
}
func (m *PrepareElectronicInvoiceLineRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_PrepareElectronicInvoiceLineRequest.Unmarshal(m, b)
}
func (m *PrepareElectronicInvoiceLineRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_PrepareElectronicInvoiceLineRequest.Marshal(b, m, deterministic)
}
func (dst *PrepareElectronicInvoiceLineRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_PrepareElectronicInvoiceLineRequest.Merge(dst, src)
}
func (m *PrepareElectronicInvoiceLineRequest) XXX_Size() int {
	return xxx_messageInfo_PrepareElectronicInvoiceLineRequest.Size(m)
}
func (m *PrepareElectronicInvoiceLineRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_PrepareElectronicInvoiceLineRequest.DiscardUnknown(m)
}

var xxx_messageInfo_PrepareElectronicInvoiceLineRequest proto.InternalMessageInfo

func (m *PrepareElectronicInvoiceLineRequest) GetDataset() string {
	if m != nil {
		return m.Dataset
	}
	return ""
}

func (m *PrepareElectronicInvoiceLineRequest) GetTags() []string {
	if m != nil {
		return m.Tags
	}
	return nil
}

func (m *PrepareElectronicInvoiceLineRequest) GetEntries() []*PrepareElectronicInvoiceLineRequest_Entry {
	if m != nil {
		return m.Entries
	}
	return nil
}

type PrepareElectronicInvoiceLineRequest_Entry struct {
	Id                   string                                      `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	Input                *v1alpha1.ElectronicInvoiceLineRequest_Data `protobuf:"bytes,2,opt,name=input,proto3" json:"input,omitempty"`
	Predictions          []*_type.Prediction                         `protobuf:"bytes,3,rep,name=predictions,proto3" json:"predictions,omitempty"`
	XXX_NoUnkeyedLiteral struct{}                                    `json:"-"`
	XXX_unrecognized     []byte                                      `json:"-"`
	XXX_sizecache        int32                                       `json:"-"`
}

func (m *PrepareElectronicInvoiceLineRequest_Entry) Reset() {
	*m = PrepareElectronicInvoiceLineRequest_Entry{}
}
func (m *PrepareElectronicInvoiceLineRequest_Entry) String() string {
	return proto.CompactTextString(m)
}
func (*PrepareElectronicInvoiceLineRequest_Entry) ProtoMessage() {}
func (*PrepareElectronicInvoiceLineRequest_Entry) Descriptor() ([]byte, []int) {
	return fileDescriptor_electronic_invoice_line_824ab4f15de6c28c, []int{1, 0}
}
func (m *PrepareElectronicInvoiceLineRequest_Entry) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_PrepareElectronicInvoiceLineRequest_Entry.Unmarshal(m, b)
}
func (m *PrepareElectronicInvoiceLineRequest_Entry) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_PrepareElectronicInvoiceLineRequest_Entry.Marshal(b, m, deterministic)
}
func (dst *PrepareElectronicInvoiceLineRequest_Entry) XXX_Merge(src proto.Message) {
	xxx_messageInfo_PrepareElectronicInvoiceLineRequest_Entry.Merge(dst, src)
}
func (m *PrepareElectronicInvoiceLineRequest_Entry) XXX_Size() int {
	return xxx_messageInfo_PrepareElectronicInvoiceLineRequest_Entry.Size(m)
}
func (m *PrepareElectronicInvoiceLineRequest_Entry) XXX_DiscardUnknown() {
	xxx_messageInfo_PrepareElectronicInvoiceLineRequest_Entry.DiscardUnknown(m)
}

var xxx_messageInfo_PrepareElectronicInvoiceLineRequest_Entry proto.InternalMessageInfo

func (m *PrepareElectronicInvoiceLineRequest_Entry) GetId() string {
	if m != nil {
		return m.Id
	}
	return ""
}

func (m *PrepareElectronicInvoiceLineRequest_Entry) GetInput() *v1alpha1.ElectronicInvoiceLineRequest_Data {
	if m != nil {
		return m.Input
	}
	return nil
}

func (m *PrepareElectronicInvoiceLineRequest_Entry) GetPredictions() []*_type.Prediction {
	if m != nil {
		return m.Predictions
	}
	return nil
}

type AddElectronicInvoiceLineDataRequest struct {
	Dataset              string                                       `protobuf:"bytes,1,opt,name=dataset,proto3" json:"dataset,omitempty"`
	Tags                 []string                                     `protobuf:"bytes,2,rep,name=tags,proto3" json:"tags,omitempty"`
	Entries              []*AddElectronicInvoiceLineDataRequest_Entry `protobuf:"bytes,3,rep,name=entries,proto3" json:"entries,omitempty"`
	RetentionPolicy      *RetentionPolicy                             `protobuf:"bytes,4,opt,name=retention_policy,json=retentionPolicy,proto3" json:"retention_policy,omitempty"`
	XXX_NoUnkeyedLiteral struct{}                                     `json:"-"`
	XXX_unrecognized     []byte                                       `json:"-"`
	XXX_sizecache        int32                                        `json:"-"`
}

func (m *AddElectronicInvoiceLineDataRequest) Reset()         { *m = AddElectronicInvoiceLineDataRequest{} }
func (m *AddElectronicInvoiceLineDataRequest) String() string { return proto.CompactTextString(m) }
func (*AddElectronicInvoiceLineDataRequest) ProtoMessage()    {}
func (*AddElectronicInvoiceLineDataRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_electronic_invoice_line_824ab4f15de6c28c, []int{2}
}
func (m *AddElectronicInvoiceLineDataRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_AddElectronicInvoiceLineDataRequest.Unmarshal(m, b)
}
func (m *AddElectronicInvoiceLineDataRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_AddElectronicInvoiceLineDataRequest.Marshal(b, m, deterministic)
}
func (dst *AddElectronicInvoiceLineDataRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_AddElectronicInvoiceLineDataRequest.Merge(dst, src)
}
func (m *AddElectronicInvoiceLineDataRequest) XXX_Size() int {
	return xxx_messageInfo_AddElectronicInvoiceLineDataRequest.Size(m)
}
func (m *AddElectronicInvoiceLineDataRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_AddElectronicInvoiceLineDataRequest.DiscardUnknown(m)
}

var xxx_messageInfo_AddElectronicInvoiceLineDataRequest proto.InternalMessageInfo

func (m *AddElectronicInvoiceLineDataRequest) GetDataset() string {
	if m != nil {
		return m.Dataset
	}
	return ""
}

func (m *AddElectronicInvoiceLineDataRequest) GetTags() []string {
	if m != nil {
		return m.Tags
	}
	return nil
}

func (m *AddElectronicInvoiceLineDataRequest) GetEntries() []*AddElectronicInvoiceLineDataRequest_Entry {
	if m != nil {
		return m.Entries
	}
	return nil
}

func (m *AddElectronicInvoiceLineDataRequest) GetRetentionPolicy() *RetentionPolicy {
	if m != nil {
		return m.RetentionPolicy
	}
	return nil
}

type AddElectronicInvoiceLineDataRequest_Entry struct {
	Input                *v1alpha1.ElectronicInvoiceLineRequest_Data `protobuf:"bytes,1,opt,name=input,proto3" json:"input,omitempty"`
	TrueValues           []*DataTuple                                `protobuf:"bytes,2,rep,name=true_values,json=trueValues,proto3" json:"true_values,omitempty"`
	XXX_NoUnkeyedLiteral struct{}                                    `json:"-"`
	XXX_unrecognized     []byte                                      `json:"-"`
	XXX_sizecache        int32                                       `json:"-"`
}

func (m *AddElectronicInvoiceLineDataRequest_Entry) Reset() {
	*m = AddElectronicInvoiceLineDataRequest_Entry{}
}
func (m *AddElectronicInvoiceLineDataRequest_Entry) String() string {
	return proto.CompactTextString(m)
}
func (*AddElectronicInvoiceLineDataRequest_Entry) ProtoMessage() {}
func (*AddElectronicInvoiceLineDataRequest_Entry) Descriptor() ([]byte, []int) {
	return fileDescriptor_electronic_invoice_line_824ab4f15de6c28c, []int{2, 0}
}
func (m *AddElectronicInvoiceLineDataRequest_Entry) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_AddElectronicInvoiceLineDataRequest_Entry.Unmarshal(m, b)
}
func (m *AddElectronicInvoiceLineDataRequest_Entry) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_AddElectronicInvoiceLineDataRequest_Entry.Marshal(b, m, deterministic)
}
func (dst *AddElectronicInvoiceLineDataRequest_Entry) XXX_Merge(src proto.Message) {
	xxx_messageInfo_AddElectronicInvoiceLineDataRequest_Entry.Merge(dst, src)
}
func (m *AddElectronicInvoiceLineDataRequest_Entry) XXX_Size() int {
	return xxx_messageInfo_AddElectronicInvoiceLineDataRequest_Entry.Size(m)
}
func (m *AddElectronicInvoiceLineDataRequest_Entry) XXX_DiscardUnknown() {
	xxx_messageInfo_AddElectronicInvoiceLineDataRequest_Entry.DiscardUnknown(m)
}

var xxx_messageInfo_AddElectronicInvoiceLineDataRequest_Entry proto.InternalMessageInfo

func (m *AddElectronicInvoiceLineDataRequest_Entry) GetInput() *v1alpha1.ElectronicInvoiceLineRequest_Data {
	if m != nil {
		return m.Input
	}
	return nil
}

func (m *AddElectronicInvoiceLineDataRequest_Entry) GetTrueValues() []*DataTuple {
	if m != nil {
		return m.TrueValues
	}
	return nil
}

func init() {
	proto.RegisterType((*ElectronicInvoiceLineEntry)(nil), "asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntry")
	proto.RegisterType((*PrepareElectronicInvoiceLineRequest)(nil), "asgt.dataservice.v1alpha1.PrepareElectronicInvoiceLineRequest")
	proto.RegisterType((*PrepareElectronicInvoiceLineRequest_Entry)(nil), "asgt.dataservice.v1alpha1.PrepareElectronicInvoiceLineRequest.Entry")
	proto.RegisterType((*AddElectronicInvoiceLineDataRequest)(nil), "asgt.dataservice.v1alpha1.AddElectronicInvoiceLineDataRequest")
	proto.RegisterType((*AddElectronicInvoiceLineDataRequest_Entry)(nil), "asgt.dataservice.v1alpha1.AddElectronicInvoiceLineDataRequest.Entry")
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConn

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion4

// ElectronicInvoiceLineDataserviceClient is the client API for ElectronicInvoiceLineDataservice service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type ElectronicInvoiceLineDataserviceClient interface {
	PrepareElectronicInvoiceLine(ctx context.Context, in *PrepareElectronicInvoiceLineRequest, opts ...grpc.CallOption) (*empty.Empty, error)
	ElectronicInvoiceLineFeedback(ctx context.Context, in *FeedbackRequest, opts ...grpc.CallOption) (*empty.Empty, error)
	AddElectronicInvoiceLineData(ctx context.Context, in *AddElectronicInvoiceLineDataRequest, opts ...grpc.CallOption) (*empty.Empty, error)
	DeleteElectronicInvoiceLine(ctx context.Context, in *DeleteRequest, opts ...grpc.CallOption) (*empty.Empty, error)
}

type electronicInvoiceLineDataserviceClient struct {
	cc *grpc.ClientConn
}

func NewElectronicInvoiceLineDataserviceClient(cc *grpc.ClientConn) ElectronicInvoiceLineDataserviceClient {
	return &electronicInvoiceLineDataserviceClient{cc}
}

func (c *electronicInvoiceLineDataserviceClient) PrepareElectronicInvoiceLine(ctx context.Context, in *PrepareElectronicInvoiceLineRequest, opts ...grpc.CallOption) (*empty.Empty, error) {
	out := new(empty.Empty)
	err := c.cc.Invoke(ctx, "/asgt.dataservice.v1alpha1.ElectronicInvoiceLineDataservice/PrepareElectronicInvoiceLine", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *electronicInvoiceLineDataserviceClient) ElectronicInvoiceLineFeedback(ctx context.Context, in *FeedbackRequest, opts ...grpc.CallOption) (*empty.Empty, error) {
	out := new(empty.Empty)
	err := c.cc.Invoke(ctx, "/asgt.dataservice.v1alpha1.ElectronicInvoiceLineDataservice/ElectronicInvoiceLineFeedback", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *electronicInvoiceLineDataserviceClient) AddElectronicInvoiceLineData(ctx context.Context, in *AddElectronicInvoiceLineDataRequest, opts ...grpc.CallOption) (*empty.Empty, error) {
	out := new(empty.Empty)
	err := c.cc.Invoke(ctx, "/asgt.dataservice.v1alpha1.ElectronicInvoiceLineDataservice/AddElectronicInvoiceLineData", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *electronicInvoiceLineDataserviceClient) DeleteElectronicInvoiceLine(ctx context.Context, in *DeleteRequest, opts ...grpc.CallOption) (*empty.Empty, error) {
	out := new(empty.Empty)
	err := c.cc.Invoke(ctx, "/asgt.dataservice.v1alpha1.ElectronicInvoiceLineDataservice/DeleteElectronicInvoiceLine", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// ElectronicInvoiceLineDataserviceServer is the server API for ElectronicInvoiceLineDataservice service.
type ElectronicInvoiceLineDataserviceServer interface {
	PrepareElectronicInvoiceLine(context.Context, *PrepareElectronicInvoiceLineRequest) (*empty.Empty, error)
	ElectronicInvoiceLineFeedback(context.Context, *FeedbackRequest) (*empty.Empty, error)
	AddElectronicInvoiceLineData(context.Context, *AddElectronicInvoiceLineDataRequest) (*empty.Empty, error)
	DeleteElectronicInvoiceLine(context.Context, *DeleteRequest) (*empty.Empty, error)
}

func RegisterElectronicInvoiceLineDataserviceServer(s *grpc.Server, srv ElectronicInvoiceLineDataserviceServer) {
	s.RegisterService(&_ElectronicInvoiceLineDataservice_serviceDesc, srv)
}

func _ElectronicInvoiceLineDataservice_PrepareElectronicInvoiceLine_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(PrepareElectronicInvoiceLineRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ElectronicInvoiceLineDataserviceServer).PrepareElectronicInvoiceLine(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/asgt.dataservice.v1alpha1.ElectronicInvoiceLineDataservice/PrepareElectronicInvoiceLine",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ElectronicInvoiceLineDataserviceServer).PrepareElectronicInvoiceLine(ctx, req.(*PrepareElectronicInvoiceLineRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _ElectronicInvoiceLineDataservice_ElectronicInvoiceLineFeedback_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(FeedbackRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ElectronicInvoiceLineDataserviceServer).ElectronicInvoiceLineFeedback(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/asgt.dataservice.v1alpha1.ElectronicInvoiceLineDataservice/ElectronicInvoiceLineFeedback",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ElectronicInvoiceLineDataserviceServer).ElectronicInvoiceLineFeedback(ctx, req.(*FeedbackRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _ElectronicInvoiceLineDataservice_AddElectronicInvoiceLineData_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(AddElectronicInvoiceLineDataRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ElectronicInvoiceLineDataserviceServer).AddElectronicInvoiceLineData(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/asgt.dataservice.v1alpha1.ElectronicInvoiceLineDataservice/AddElectronicInvoiceLineData",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ElectronicInvoiceLineDataserviceServer).AddElectronicInvoiceLineData(ctx, req.(*AddElectronicInvoiceLineDataRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _ElectronicInvoiceLineDataservice_DeleteElectronicInvoiceLine_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DeleteRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ElectronicInvoiceLineDataserviceServer).DeleteElectronicInvoiceLine(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/asgt.dataservice.v1alpha1.ElectronicInvoiceLineDataservice/DeleteElectronicInvoiceLine",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ElectronicInvoiceLineDataserviceServer).DeleteElectronicInvoiceLine(ctx, req.(*DeleteRequest))
	}
	return interceptor(ctx, in, info, handler)
}

var _ElectronicInvoiceLineDataservice_serviceDesc = grpc.ServiceDesc{
	ServiceName: "asgt.dataservice.v1alpha1.ElectronicInvoiceLineDataservice",
	HandlerType: (*ElectronicInvoiceLineDataserviceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "PrepareElectronicInvoiceLine",
			Handler:    _ElectronicInvoiceLineDataservice_PrepareElectronicInvoiceLine_Handler,
		},
		{
			MethodName: "ElectronicInvoiceLineFeedback",
			Handler:    _ElectronicInvoiceLineDataservice_ElectronicInvoiceLineFeedback_Handler,
		},
		{
			MethodName: "AddElectronicInvoiceLineData",
			Handler:    _ElectronicInvoiceLineDataservice_AddElectronicInvoiceLineData_Handler,
		},
		{
			MethodName: "DeleteElectronicInvoiceLine",
			Handler:    _ElectronicInvoiceLineDataservice_DeleteElectronicInvoiceLine_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "asgt/dataservice/v1alpha1/electronic_invoice_line.proto",
}

func init() {
	proto.RegisterFile("asgt/dataservice/v1alpha1/electronic_invoice_line.proto", fileDescriptor_electronic_invoice_line_824ab4f15de6c28c)
}

var fileDescriptor_electronic_invoice_line_824ab4f15de6c28c = []byte{
	// 825 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xb4, 0x55, 0x41, 0x6f, 0xe3, 0x44,
	0x14, 0x96, 0x9d, 0x74, 0xdb, 0x4e, 0xb4, 0xb0, 0x1a, 0x09, 0x64, 0xb2, 0x05, 0xa6, 0xde, 0x0a,
	0x65, 0xcb, 0xae, 0xad, 0x76, 0x0f, 0x95, 0x7a, 0x20, 0x4a, 0x48, 0x56, 0x2a, 0xa2, 0x52, 0x64,
	0x02, 0x87, 0x3d, 0x60, 0x4d, 0x3c, 0x2f, 0xc9, 0xb0, 0xce, 0xd8, 0xb5, 0xc7, 0x91, 0x72, 0xe5,
	0x27, 0xc0, 0x85, 0x0b, 0xe2, 0x88, 0xc4, 0x0f, 0xe0, 0x8f, 0x20, 0xfe, 0x01, 0xa7, 0x9c, 0xf9,
	0x01, 0x68, 0xc6, 0x76, 0x12, 0x50, 0xe2, 0xac, 0x80, 0x1e, 0x3d, 0xf3, 0xde, 0xf7, 0xde, 0xfb,
	0xbe, 0x6f, 0x9e, 0xd1, 0x15, 0x4d, 0x27, 0xd2, 0x65, 0x54, 0xd2, 0x14, 0x92, 0x39, 0x0f, 0xc0,
	0x9d, 0x5f, 0xd0, 0x30, 0x9e, 0xd2, 0x0b, 0x17, 0x42, 0x08, 0x64, 0x12, 0x09, 0x1e, 0xf8, 0x5c,
	0xcc, 0x23, 0x1e, 0x80, 0x1f, 0x72, 0x01, 0x4e, 0x9c, 0x44, 0x32, 0xc2, 0xef, 0xa9, 0x44, 0x67,
	0x23, 0xd1, 0x29, 0x13, 0x9b, 0x67, 0xbb, 0x31, 0xd5, 0x61, 0x0e, 0xd0, 0x3c, 0xd5, 0x51, 0xdf,
	0x40, 0x2a, 0x21, 0x59, 0x07, 0xe4, 0xdf, 0x45, 0x48, 0x53, 0x87, 0xc8, 0x45, 0x0c, 0x6e, 0x9c,
	0x00, 0xe3, 0x81, 0xe4, 0x91, 0x28, 0xee, 0x4e, 0x26, 0x20, 0xfc, 0xd1, 0x9d, 0x9f, 0x06, 0x53,
	0x98, 0x51, 0x77, 0x74, 0xe7, 0x8f, 0x39, 0x84, 0x6c, 0xe7, 0xad, 0xa4, 0xa3, 0x10, 0x56, 0xb7,
	0x51, 0x34, 0x09, 0xc1, 0xa5, 0x31, 0x77, 0xa9, 0x10, 0x91, 0xa4, 0x0a, 0x38, 0x2d, 0x6e, 0x1f,
	0x17, 0xb7, 0xfa, 0x6b, 0x94, 0x8d, 0x5d, 0x98, 0xc5, 0x72, 0x91, 0x5f, 0xda, 0xbf, 0xd6, 0x51,
	0xb3, 0xbf, 0x22, 0xe6, 0x26, 0xe7, 0xe5, 0x73, 0x2e, 0xa0, 0x2f, 0x64, 0xb2, 0xc0, 0x5d, 0x64,
	0x72, 0x66, 0x19, 0xc4, 0x68, 0x1d, 0x77, 0x2f, 0x97, 0x6d, 0xd7, 0x7e, 0x7e, 0xd3, 0x7b, 0x46,
	0x66, 0x54, 0x06, 0x53, 0x48, 0x49, 0x5f, 0xcc, 0xa3, 0x05, 0x49, 0xe0, 0x2e, 0x83, 0x54, 0x12,
	0xce, 0x08, 0x1f, 0x93, 0x31, 0x00, 0x1b, 0xd1, 0xe0, 0x35, 0x51, 0xd4, 0x78, 0x26, 0x67, 0xf8,
	0x14, 0x1d, 0x05, 0x91, 0x48, 0xb3, 0x19, 0x24, 0x96, 0xa9, 0x91, 0x0e, 0x96, 0x6d, 0xf3, 0xc8,
	0xf0, 0x56, 0xc7, 0xf8, 0x43, 0x74, 0x98, 0xd3, 0x2b, 0xad, 0xda, 0x66, 0x44, 0x79, 0x8a, 0x5f,
	0xa1, 0xba, 0xa4, 0x93, 0xd4, 0xaa, 0x93, 0x5a, 0xeb, 0xb8, 0xfb, 0x72, 0xd9, 0xfe, 0xd4, 0xee,
	0x0c, 0xe9, 0x24, 0x25, 0x0c, 0xc6, 0x5c, 0x00, 0x23, 0xa3, 0x05, 0x29, 0xd1, 0x9e, 0x11, 0x10,
	0x09, 0x0f, 0xa6, 0xf9, 0x69, 0x21, 0x99, 0x6a, 0x6d, 0x4e, 0x43, 0x90, 0xaf, 0x61, 0x41, 0x78,
	0x4a, 0xb2, 0x14, 0x98, 0xa7, 0x31, 0xf1, 0x2d, 0x3a, 0xe0, 0x22, 0xce, 0xa4, 0x75, 0x40, 0x8c,
	0x56, 0xe3, 0xf2, 0xca, 0xd1, 0x4e, 0x28, 0x84, 0x2b, 0x85, 0x74, 0xb6, 0x92, 0xe4, 0xe5, 0xa3,
	0x3b, 0x3d, 0x35, 0x6b, 0x8e, 0x82, 0xfb, 0xa8, 0x21, 0x93, 0x0c, 0xfc, 0x39, 0x0d, 0x33, 0x48,
	0xad, 0x07, 0xa4, 0xd6, 0x6a, 0x5c, 0x9e, 0x39, 0x3b, 0xed, 0xa5, 0x93, 0x87, 0x59, 0x1c, 0x82,
	0x87, 0x54, 0xe2, 0x57, 0x3a, 0x0f, 0x7f, 0x86, 0x1a, 0xca, 0x23, 0x25, 0xcc, 0xa1, 0x86, 0x79,
	0x5a, 0x01, 0x33, 0xc8, 0x1d, 0x05, 0xac, 0xc0, 0x52, 0xd9, 0x05, 0x96, 0x8b, 0x90, 0xe4, 0x33,
	0xf0, 0x29, 0x63, 0xc0, 0xac, 0x23, 0x62, 0xb4, 0xea, 0xdd, 0x47, 0xcb, 0xf6, 0xc3, 0x23, 0x03,
	0x1f, 0x0f, 0x6f, 0x6e, 0xfb, 0x5f, 0x0c, 0x3b, 0xb7, 0x03, 0xef, 0x58, 0xc5, 0x74, 0x54, 0xc8,
	0xf5, 0xe9, 0xb2, 0xfd, 0x01, 0x3a, 0xd9, 0xf1, 0x60, 0x7c, 0x55, 0xde, 0xfe, 0xdd, 0x44, 0x4f,
	0x06, 0x09, 0xc4, 0x34, 0x81, 0x2a, 0x6a, 0xb0, 0xb5, 0x96, 0x56, 0xdb, 0x68, 0xad, 0x29, 0x2e,
	0x34, 0x35, 0x95, 0xa6, 0x85, 0x16, 0x5f, 0xa3, 0x43, 0x10, 0x32, 0xe1, 0x90, 0x5a, 0x35, 0x3d,
	0x71, 0xaf, 0x7a, 0xe2, 0x7d, 0xe5, 0x1d, 0x6d, 0x63, 0xaf, 0x04, 0x6d, 0xfe, 0x64, 0xa0, 0x83,
	0xdc, 0xd9, 0x6f, 0xad, 0x9d, 0xad, 0x5d, 0xba, 0x72, 0x81, 0xf9, 0xbf, 0xb8, 0xe0, 0x2a, 0x97,
	0x2f, 0x7f, 0xe2, 0xe5, 0x30, 0xef, 0xe4, 0xa0, 0x6a, 0x01, 0x94, 0x72, 0xf1, 0x48, 0x78, 0x9b,
	0x91, 0xf6, 0x2f, 0x35, 0xf4, 0xa4, 0xc3, 0xd8, 0xd6, 0x42, 0xba, 0xc0, 0xfd, 0xf3, 0xfa, 0x06,
	0xe5, 0xff, 0xc1, 0x2b, 0xfe, 0x12, 0x3d, 0x4a, 0x40, 0x82, 0x50, 0x33, 0xf8, 0x71, 0x14, 0xf2,
	0x60, 0x61, 0xd5, 0x35, 0x91, 0xe7, 0x15, 0x85, 0xbc, 0x32, 0x65, 0xa0, 0x33, 0xbc, 0xb7, 0x93,
	0xbf, 0x1f, 0x34, 0x7f, 0x5c, 0xc9, 0xb5, 0x92, 0xc7, 0xb8, 0x8f, 0x47, 0x6a, 0xfe, 0xbb, 0x47,
	0x7a, 0xf9, 0x67, 0x1d, 0x91, 0x9d, 0x54, 0x15, 0x18, 0x78, 0x8e, 0x4e, 0xaa, 0x9c, 0x8a, 0x3f,
	0xf9, 0x6f, 0x16, 0x6f, 0xbe, 0xeb, 0xe4, 0x0b, 0xde, 0x29, 0x17, 0xbc, 0xd3, 0x57, 0x0b, 0x1e,
	0xff, 0x60, 0xa0, 0xf7, 0xb7, 0x26, 0xbe, 0x2c, 0x56, 0x34, 0xae, 0xd2, 0xa6, 0x0c, 0xda, 0x53,
	0xc5, 0x7e, 0xf1, 0xed, 0x6f, 0x7f, 0x7c, 0x6f, 0x3e, 0xb7, 0x5b, 0xdb, 0x7e, 0xb4, 0xc5, 0xda,
	0x50, 0x5b, 0xe3, 0xba, 0xfc, 0x31, 0x5c, 0x1b, 0xe7, 0xf8, 0x67, 0x03, 0x9d, 0x54, 0xb9, 0xac,
	0x92, 0x93, 0x37, 0xb0, 0xe7, 0xce, 0x6e, 0x5d, 0xdd, 0xed, 0x53, 0xfb, 0x6c, 0x5f, 0xb7, 0xaa,
	0xb2, 0xea, 0xf4, 0x3b, 0x03, 0x3d, 0xee, 0x41, 0x08, 0x72, 0x87, 0x78, 0xad, 0x2a, 0xcf, 0xe8,
	0xbc, 0x7d, 0x2d, 0x5d, 0xe8, 0x96, 0x3e, 0xb6, 0x3f, 0xda, 0xdb, 0x92, 0x86, 0xbb, 0x36, 0xce,
	0xbb, 0x0f, 0x5f, 0x35, 0x36, 0x0a, 0x8e, 0x1e, 0x68, 0xc4, 0x17, 0x7f, 0x05, 0x00, 0x00, 0xff,
	0xff, 0xb8, 0x0f, 0x70, 0x0c, 0xfc, 0x08, 0x00, 0x00,
}
