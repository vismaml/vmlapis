// Code generated by protoc-gen-go. DO NOT EDIT.
// source: ssn/apiserver/v1alpha1/apiserver.proto

package v1alpha1 // import "github.com/e-conomic/proto/ssn/apiserver/v1alpha1"

import proto "github.com/golang/protobuf/proto"
import fmt "fmt"
import math "math"
import v1alpha11 "github.com/e-conomic/proto/ssn/mlservice/v1alpha1"
import v1alpha1 "github.com/e-conomic/proto/ssn/ocrservice/v1alpha1"
import timestamp "github.com/golang/protobuf/ptypes/timestamp"

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

type ScanRequest struct {
	Data                 []byte   `protobuf:"bytes,1,opt,name=data,proto3" json:"data,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *ScanRequest) Reset()         { *m = ScanRequest{} }
func (m *ScanRequest) String() string { return proto.CompactTextString(m) }
func (*ScanRequest) ProtoMessage()    {}
func (*ScanRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_apiserver_2e94fd9506af7bb9, []int{0}
}
func (m *ScanRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_ScanRequest.Unmarshal(m, b)
}
func (m *ScanRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_ScanRequest.Marshal(b, m, deterministic)
}
func (dst *ScanRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_ScanRequest.Merge(dst, src)
}
func (m *ScanRequest) XXX_Size() int {
	return xxx_messageInfo_ScanRequest.Size(m)
}
func (m *ScanRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_ScanRequest.DiscardUnknown(m)
}

var xxx_messageInfo_ScanRequest proto.InternalMessageInfo

func (m *ScanRequest) GetData() []byte {
	if m != nil {
		return m.Data
	}
	return nil
}

type InternalScanResponse struct {
	Ocr                  []*v1alpha1.OcrScanImageResponse `protobuf:"bytes,1,rep,name=ocr,proto3" json:"ocr,omitempty"`
	Ml                   *v1alpha11.MlResponse            `protobuf:"bytes,2,opt,name=ml,proto3" json:"ml,omitempty"`
	XXX_NoUnkeyedLiteral struct{}                         `json:"-"`
	XXX_unrecognized     []byte                           `json:"-"`
	XXX_sizecache        int32                            `json:"-"`
}

func (m *InternalScanResponse) Reset()         { *m = InternalScanResponse{} }
func (m *InternalScanResponse) String() string { return proto.CompactTextString(m) }
func (*InternalScanResponse) ProtoMessage()    {}
func (*InternalScanResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_apiserver_2e94fd9506af7bb9, []int{1}
}
func (m *InternalScanResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_InternalScanResponse.Unmarshal(m, b)
}
func (m *InternalScanResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_InternalScanResponse.Marshal(b, m, deterministic)
}
func (dst *InternalScanResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_InternalScanResponse.Merge(dst, src)
}
func (m *InternalScanResponse) XXX_Size() int {
	return xxx_messageInfo_InternalScanResponse.Size(m)
}
func (m *InternalScanResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_InternalScanResponse.DiscardUnknown(m)
}

var xxx_messageInfo_InternalScanResponse proto.InternalMessageInfo

func (m *InternalScanResponse) GetOcr() []*v1alpha1.OcrScanImageResponse {
	if m != nil {
		return m.Ocr
	}
	return nil
}

func (m *InternalScanResponse) GetMl() *v1alpha11.MlResponse {
	if m != nil {
		return m.Ml
	}
	return nil
}

type ScanResponse struct {
	Ml                   *v1alpha11.MlResponse `protobuf:"bytes,1,opt,name=ml,proto3" json:"ml,omitempty"`
	XXX_NoUnkeyedLiteral struct{}              `json:"-"`
	XXX_unrecognized     []byte                `json:"-"`
	XXX_sizecache        int32                 `json:"-"`
}

func (m *ScanResponse) Reset()         { *m = ScanResponse{} }
func (m *ScanResponse) String() string { return proto.CompactTextString(m) }
func (*ScanResponse) ProtoMessage()    {}
func (*ScanResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_apiserver_2e94fd9506af7bb9, []int{2}
}
func (m *ScanResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_ScanResponse.Unmarshal(m, b)
}
func (m *ScanResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_ScanResponse.Marshal(b, m, deterministic)
}
func (dst *ScanResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_ScanResponse.Merge(dst, src)
}
func (m *ScanResponse) XXX_Size() int {
	return xxx_messageInfo_ScanResponse.Size(m)
}
func (m *ScanResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_ScanResponse.DiscardUnknown(m)
}

var xxx_messageInfo_ScanResponse proto.InternalMessageInfo

func (m *ScanResponse) GetMl() *v1alpha11.MlResponse {
	if m != nil {
		return m.Ml
	}
	return nil
}

type Page struct {
	Index                uint32   `protobuf:"varint,1,opt,name=index,proto3" json:"index,omitempty"`
	Data                 []byte   `protobuf:"bytes,2,opt,name=data,proto3" json:"data,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *Page) Reset()         { *m = Page{} }
func (m *Page) String() string { return proto.CompactTextString(m) }
func (*Page) ProtoMessage()    {}
func (*Page) Descriptor() ([]byte, []int) {
	return fileDescriptor_apiserver_2e94fd9506af7bb9, []int{3}
}
func (m *Page) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Page.Unmarshal(m, b)
}
func (m *Page) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Page.Marshal(b, m, deterministic)
}
func (dst *Page) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Page.Merge(dst, src)
}
func (m *Page) XXX_Size() int {
	return xxx_messageInfo_Page.Size(m)
}
func (m *Page) XXX_DiscardUnknown() {
	xxx_messageInfo_Page.DiscardUnknown(m)
}

var xxx_messageInfo_Page proto.InternalMessageInfo

func (m *Page) GetIndex() uint32 {
	if m != nil {
		return m.Index
	}
	return 0
}

func (m *Page) GetData() []byte {
	if m != nil {
		return m.Data
	}
	return nil
}

type Document struct {
	Url                  string   `protobuf:"bytes,1,opt,name=url,proto3" json:"url,omitempty"`
	Pages                []*Page  `protobuf:"bytes,3,rep,name=pages,proto3" json:"pages,omitempty"`
	Ocr                  []string `protobuf:"bytes,4,rep,name=ocr,proto3" json:"ocr,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *Document) Reset()         { *m = Document{} }
func (m *Document) String() string { return proto.CompactTextString(m) }
func (*Document) ProtoMessage()    {}
func (*Document) Descriptor() ([]byte, []int) {
	return fileDescriptor_apiserver_2e94fd9506af7bb9, []int{4}
}
func (m *Document) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Document.Unmarshal(m, b)
}
func (m *Document) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Document.Marshal(b, m, deterministic)
}
func (dst *Document) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Document.Merge(dst, src)
}
func (m *Document) XXX_Size() int {
	return xxx_messageInfo_Document.Size(m)
}
func (m *Document) XXX_DiscardUnknown() {
	xxx_messageInfo_Document.DiscardUnknown(m)
}

var xxx_messageInfo_Document proto.InternalMessageInfo

func (m *Document) GetUrl() string {
	if m != nil {
		return m.Url
	}
	return ""
}

func (m *Document) GetPages() []*Page {
	if m != nil {
		return m.Pages
	}
	return nil
}

func (m *Document) GetOcr() []string {
	if m != nil {
		return m.Ocr
	}
	return nil
}

type Callback struct {
	Uri                  string   `protobuf:"bytes,1,opt,name=uri,proto3" json:"uri,omitempty"`
	HmacSigningKey       string   `protobuf:"bytes,2,opt,name=hmacSigningKey,proto3" json:"hmacSigningKey,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *Callback) Reset()         { *m = Callback{} }
func (m *Callback) String() string { return proto.CompactTextString(m) }
func (*Callback) ProtoMessage()    {}
func (*Callback) Descriptor() ([]byte, []int) {
	return fileDescriptor_apiserver_2e94fd9506af7bb9, []int{5}
}
func (m *Callback) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Callback.Unmarshal(m, b)
}
func (m *Callback) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Callback.Marshal(b, m, deterministic)
}
func (dst *Callback) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Callback.Merge(dst, src)
}
func (m *Callback) XXX_Size() int {
	return xxx_messageInfo_Callback.Size(m)
}
func (m *Callback) XXX_DiscardUnknown() {
	xxx_messageInfo_Callback.DiscardUnknown(m)
}

var xxx_messageInfo_Callback proto.InternalMessageInfo

func (m *Callback) GetUri() string {
	if m != nil {
		return m.Uri
	}
	return ""
}

func (m *Callback) GetHmacSigningKey() string {
	if m != nil {
		return m.HmacSigningKey
	}
	return ""
}

type WebRequestContext struct {
	Id                   string   `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	Ip                   string   `protobuf:"bytes,2,opt,name=ip,proto3" json:"ip,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *WebRequestContext) Reset()         { *m = WebRequestContext{} }
func (m *WebRequestContext) String() string { return proto.CompactTextString(m) }
func (*WebRequestContext) ProtoMessage()    {}
func (*WebRequestContext) Descriptor() ([]byte, []int) {
	return fileDescriptor_apiserver_2e94fd9506af7bb9, []int{6}
}
func (m *WebRequestContext) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_WebRequestContext.Unmarshal(m, b)
}
func (m *WebRequestContext) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_WebRequestContext.Marshal(b, m, deterministic)
}
func (dst *WebRequestContext) XXX_Merge(src proto.Message) {
	xxx_messageInfo_WebRequestContext.Merge(dst, src)
}
func (m *WebRequestContext) XXX_Size() int {
	return xxx_messageInfo_WebRequestContext.Size(m)
}
func (m *WebRequestContext) XXX_DiscardUnknown() {
	xxx_messageInfo_WebRequestContext.DiscardUnknown(m)
}

var xxx_messageInfo_WebRequestContext proto.InternalMessageInfo

func (m *WebRequestContext) GetId() string {
	if m != nil {
		return m.Id
	}
	return ""
}

func (m *WebRequestContext) GetIp() string {
	if m != nil {
		return m.Ip
	}
	return ""
}

type Job struct {
	Uuid                 string               `protobuf:"bytes,1,opt,name=uuid,proto3" json:"uuid,omitempty"`
	Ctime                *timestamp.Timestamp `protobuf:"bytes,2,opt,name=ctime,proto3" json:"ctime,omitempty"`
	Ctx                  *WebRequestContext   `protobuf:"bytes,3,opt,name=ctx,proto3" json:"ctx,omitempty"`
	Doc                  *Document            `protobuf:"bytes,4,opt,name=doc,proto3" json:"doc,omitempty"`
	Error                string               `protobuf:"bytes,5,opt,name=error,proto3" json:"error,omitempty"`
	Callback             *Callback            `protobuf:"bytes,6,opt,name=callback,proto3" json:"callback,omitempty"`
	ClientId             string               `protobuf:"bytes,7,opt,name=clientId,proto3" json:"clientId,omitempty"`
	XXX_NoUnkeyedLiteral struct{}             `json:"-"`
	XXX_unrecognized     []byte               `json:"-"`
	XXX_sizecache        int32                `json:"-"`
}

func (m *Job) Reset()         { *m = Job{} }
func (m *Job) String() string { return proto.CompactTextString(m) }
func (*Job) ProtoMessage()    {}
func (*Job) Descriptor() ([]byte, []int) {
	return fileDescriptor_apiserver_2e94fd9506af7bb9, []int{7}
}
func (m *Job) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Job.Unmarshal(m, b)
}
func (m *Job) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Job.Marshal(b, m, deterministic)
}
func (dst *Job) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Job.Merge(dst, src)
}
func (m *Job) XXX_Size() int {
	return xxx_messageInfo_Job.Size(m)
}
func (m *Job) XXX_DiscardUnknown() {
	xxx_messageInfo_Job.DiscardUnknown(m)
}

var xxx_messageInfo_Job proto.InternalMessageInfo

func (m *Job) GetUuid() string {
	if m != nil {
		return m.Uuid
	}
	return ""
}

func (m *Job) GetCtime() *timestamp.Timestamp {
	if m != nil {
		return m.Ctime
	}
	return nil
}

func (m *Job) GetCtx() *WebRequestContext {
	if m != nil {
		return m.Ctx
	}
	return nil
}

func (m *Job) GetDoc() *Document {
	if m != nil {
		return m.Doc
	}
	return nil
}

func (m *Job) GetError() string {
	if m != nil {
		return m.Error
	}
	return ""
}

func (m *Job) GetCallback() *Callback {
	if m != nil {
		return m.Callback
	}
	return nil
}

func (m *Job) GetClientId() string {
	if m != nil {
		return m.ClientId
	}
	return ""
}

func init() {
	proto.RegisterType((*ScanRequest)(nil), "apiserver.ScanRequest")
	proto.RegisterType((*InternalScanResponse)(nil), "apiserver.InternalScanResponse")
	proto.RegisterType((*ScanResponse)(nil), "apiserver.ScanResponse")
	proto.RegisterType((*Page)(nil), "apiserver.Page")
	proto.RegisterType((*Document)(nil), "apiserver.Document")
	proto.RegisterType((*Callback)(nil), "apiserver.Callback")
	proto.RegisterType((*WebRequestContext)(nil), "apiserver.WebRequestContext")
	proto.RegisterType((*Job)(nil), "apiserver.Job")
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConn

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion4

// SsnServiceClient is the client API for SsnService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type SsnServiceClient interface {
	InternalScan(ctx context.Context, in *ScanRequest, opts ...grpc.CallOption) (*InternalScanResponse, error)
	Scan(ctx context.Context, in *ScanRequest, opts ...grpc.CallOption) (*ScanResponse, error)
}

type ssnServiceClient struct {
	cc *grpc.ClientConn
}

func NewSsnServiceClient(cc *grpc.ClientConn) SsnServiceClient {
	return &ssnServiceClient{cc}
}

func (c *ssnServiceClient) InternalScan(ctx context.Context, in *ScanRequest, opts ...grpc.CallOption) (*InternalScanResponse, error) {
	out := new(InternalScanResponse)
	err := c.cc.Invoke(ctx, "/apiserver.SsnService/InternalScan", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *ssnServiceClient) Scan(ctx context.Context, in *ScanRequest, opts ...grpc.CallOption) (*ScanResponse, error) {
	out := new(ScanResponse)
	err := c.cc.Invoke(ctx, "/apiserver.SsnService/Scan", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// SsnServiceServer is the server API for SsnService service.
type SsnServiceServer interface {
	InternalScan(context.Context, *ScanRequest) (*InternalScanResponse, error)
	Scan(context.Context, *ScanRequest) (*ScanResponse, error)
}

func RegisterSsnServiceServer(s *grpc.Server, srv SsnServiceServer) {
	s.RegisterService(&_SsnService_serviceDesc, srv)
}

func _SsnService_InternalScan_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(ScanRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(SsnServiceServer).InternalScan(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/apiserver.SsnService/InternalScan",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(SsnServiceServer).InternalScan(ctx, req.(*ScanRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _SsnService_Scan_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(ScanRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(SsnServiceServer).Scan(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/apiserver.SsnService/Scan",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(SsnServiceServer).Scan(ctx, req.(*ScanRequest))
	}
	return interceptor(ctx, in, info, handler)
}

var _SsnService_serviceDesc = grpc.ServiceDesc{
	ServiceName: "apiserver.SsnService",
	HandlerType: (*SsnServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "InternalScan",
			Handler:    _SsnService_InternalScan_Handler,
		},
		{
			MethodName: "Scan",
			Handler:    _SsnService_Scan_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "ssn/apiserver/v1alpha1/apiserver.proto",
}

func init() {
	proto.RegisterFile("ssn/apiserver/v1alpha1/apiserver.proto", fileDescriptor_apiserver_2e94fd9506af7bb9)
}

var fileDescriptor_apiserver_2e94fd9506af7bb9 = []byte{
	// 547 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x84, 0x94, 0x5d, 0x6f, 0xd3, 0x3c,
	0x14, 0xc7, 0x9f, 0x24, 0xed, 0x9e, 0xee, 0x6c, 0x0c, 0x30, 0x03, 0xa2, 0x0a, 0x69, 0x25, 0xd2,
	0xa6, 0xde, 0x90, 0xac, 0xad, 0xb8, 0xe0, 0x96, 0xed, 0xa6, 0x20, 0x04, 0x4a, 0x41, 0x48, 0xdc,
	0x39, 0x8e, 0x49, 0x2d, 0x12, 0x3b, 0x73, 0x9c, 0xa9, 0x7c, 0x00, 0xbe, 0x00, 0x9f, 0x18, 0xd9,
	0xce, 0x1b, 0x74, 0x82, 0x3b, 0xfb, 0xf8, 0x77, 0xfe, 0xe7, 0x35, 0x81, 0x8b, 0xaa, 0xe2, 0x11,
	0x2e, 0x59, 0x45, 0xe5, 0x2d, 0x95, 0xd1, 0xed, 0x02, 0xe7, 0xe5, 0x16, 0x2f, 0x7a, 0x53, 0x58,
	0x4a, 0xa1, 0x04, 0x3a, 0xec, 0x0c, 0xd3, 0xb3, 0x4c, 0x88, 0x2c, 0xa7, 0x91, 0x79, 0x48, 0xea,
	0xaf, 0x91, 0x62, 0x05, 0xad, 0x14, 0x2e, 0x4a, 0xcb, 0x4e, 0xe7, 0x5a, 0x53, 0x10, 0xa9, 0x79,
	0x46, 0x68, 0x2f, 0xda, 0xdb, 0x1a, 0xd2, 0x44, 0x2f, 0xf2, 0x3d, 0xb0, 0x33, 0x59, 0x2e, 0x78,
	0x0e, 0x47, 0x1b, 0x82, 0x79, 0x4c, 0x6f, 0x6a, 0x5a, 0x29, 0x84, 0x60, 0x94, 0x62, 0x85, 0x7d,
	0x67, 0xe6, 0xcc, 0x8f, 0x63, 0x73, 0x0e, 0x6e, 0xe0, 0x74, 0xcd, 0x15, 0x95, 0x1c, 0xe7, 0x16,
	0xad, 0x4a, 0xc1, 0x2b, 0x8a, 0x96, 0xe0, 0x09, 0x22, 0x7d, 0x67, 0xe6, 0xcd, 0x8f, 0x96, 0xb3,
	0x70, 0x90, 0xc2, 0x7b, 0x22, 0x35, 0xb9, 0x2e, 0x70, 0x46, 0x5b, 0x3c, 0xd6, 0x30, 0x3a, 0x07,
	0xb7, 0xc8, 0x7d, 0x77, 0xe6, 0xcc, 0x8f, 0x96, 0x8f, 0xc3, 0x3e, 0x99, 0x77, 0x79, 0xc7, 0xb9,
	0x45, 0x1e, 0xbc, 0x84, 0xe3, 0xdf, 0x42, 0x59, 0x37, 0xe7, 0x5f, 0x6e, 0x97, 0x30, 0xfa, 0x80,
	0x33, 0x8a, 0x4e, 0x61, 0xcc, 0x78, 0x4a, 0x77, 0xc6, 0xe3, 0x5e, 0x6c, 0x2f, 0x5d, 0x6d, 0xee,
	0xa0, 0xb6, 0x4f, 0x30, 0xb9, 0x16, 0xa4, 0x2e, 0x28, 0x57, 0xe8, 0x01, 0x78, 0xb5, 0xb4, 0x51,
	0x0e, 0x63, 0x7d, 0x44, 0xe7, 0x30, 0x2e, 0x71, 0x46, 0x2b, 0xdf, 0x33, 0x35, 0xde, 0x0f, 0xfb,
	0xd9, 0xe9, 0x38, 0xb1, 0x7d, 0xd5, 0x8e, 0xba, 0x11, 0xa3, 0x99, 0xa7, 0x1d, 0x05, 0x91, 0xc1,
	0x35, 0x4c, 0xae, 0x70, 0x9e, 0x27, 0x98, 0x7c, 0xb3, 0xb2, 0xac, 0x97, 0x65, 0xe8, 0x02, 0x4e,
	0xb6, 0x05, 0x26, 0x1b, 0x96, 0x71, 0xc6, 0xb3, 0xb7, 0xf4, 0xbb, 0x49, 0xe9, 0x30, 0xfe, 0xc3,
	0x1a, 0xac, 0xe0, 0xe1, 0x67, 0x9a, 0x34, 0xa3, 0xb9, 0x12, 0x5c, 0xd1, 0x9d, 0x42, 0x27, 0xe0,
	0xb2, 0xb4, 0x51, 0x73, 0x59, 0x6a, 0xee, 0x65, 0x23, 0xe0, 0xb2, 0x32, 0xf8, 0xe1, 0x82, 0xf7,
	0x46, 0x24, 0xba, 0xda, 0xba, 0xee, 0x48, 0x73, 0x46, 0x97, 0x30, 0x26, 0x7a, 0xa5, 0x9a, 0x01,
	0x4c, 0x43, 0xbb, 0x6f, 0x61, 0xbb, 0x6f, 0xe1, 0xc7, 0x76, 0xdf, 0x62, 0x0b, 0xa2, 0x10, 0x3c,
	0xa2, 0x76, 0xbe, 0x67, 0xf8, 0x67, 0x83, 0xfa, 0xf7, 0x12, 0x8b, 0x35, 0x88, 0xce, 0xc1, 0x4b,
	0x05, 0xf1, 0x47, 0x86, 0x7f, 0x34, 0xe0, 0xdb, 0x2e, 0xc7, 0xfa, 0x5d, 0x0f, 0x88, 0x4a, 0x29,
	0xa4, 0x3f, 0x36, 0xd9, 0xd9, 0x0b, 0x8a, 0x60, 0x42, 0x9a, 0xae, 0xf9, 0x07, 0x7b, 0x0a, 0x6d,
	0x43, 0xe3, 0x0e, 0x42, 0x53, 0x98, 0x90, 0x9c, 0x51, 0xae, 0xd6, 0xa9, 0xff, 0xbf, 0x51, 0xea,
	0xee, 0xcb, 0x9f, 0x0e, 0xc0, 0xa6, 0xe2, 0x1b, 0xbb, 0x29, 0x68, 0x0d, 0xc7, 0xc3, 0x25, 0x46,
	0x4f, 0x06, 0xca, 0x83, 0x0f, 0x60, 0x7a, 0x36, 0xb0, 0xdf, 0xb5, 0xf5, 0xc1, 0x7f, 0xe8, 0x15,
	0x8c, 0xfe, 0x2a, 0xf1, 0x74, 0xcf, 0xde, 0xba, 0xbe, 0x5e, 0x7d, 0x59, 0x64, 0x4c, 0x6d, 0xeb,
	0x24, 0x24, 0xa2, 0x88, 0xe8, 0x0b, 0x22, 0xb8, 0x28, 0x18, 0xb1, 0x1f, 0x7c, 0x74, 0xf7, 0x0f,
	0x23, 0x39, 0x30, 0xaf, 0xab, 0x5f, 0x01, 0x00, 0x00, 0xff, 0xff, 0xe8, 0x17, 0xd1, 0x7a, 0x51,
	0x04, 0x00, 0x00,
}
