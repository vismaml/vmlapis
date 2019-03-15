// Code generated by protoc-gen-go. DO NOT EDIT.
// source: ssn/ocrservice/v1/ocrservice.proto

package ocrservice

import proto "github.com/golang/protobuf/proto"
import fmt "fmt"
import math "math"
import v1 "google.golang.org/genproto/googleapis/cloud/vision/v1"

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

type OcrScanImageRequest struct {
	Data                 []byte   `protobuf:"bytes,1,opt,name=data,proto3" json:"data,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *OcrScanImageRequest) Reset()         { *m = OcrScanImageRequest{} }
func (m *OcrScanImageRequest) String() string { return proto.CompactTextString(m) }
func (*OcrScanImageRequest) ProtoMessage()    {}
func (*OcrScanImageRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_ocrservice_95c3a0df2dbeab83, []int{0}
}
func (m *OcrScanImageRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_OcrScanImageRequest.Unmarshal(m, b)
}
func (m *OcrScanImageRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_OcrScanImageRequest.Marshal(b, m, deterministic)
}
func (dst *OcrScanImageRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_OcrScanImageRequest.Merge(dst, src)
}
func (m *OcrScanImageRequest) XXX_Size() int {
	return xxx_messageInfo_OcrScanImageRequest.Size(m)
}
func (m *OcrScanImageRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_OcrScanImageRequest.DiscardUnknown(m)
}

var xxx_messageInfo_OcrScanImageRequest proto.InternalMessageInfo

func (m *OcrScanImageRequest) GetData() []byte {
	if m != nil {
		return m.Data
	}
	return nil
}

type OcrScanImageResponse struct {
	TessHocr             string             `protobuf:"bytes,1,opt,name=tess_hocr,json=tessHocr,proto3" json:"tess_hocr,omitempty"`
	ScaleFactor          float64            `protobuf:"fixed64,2,opt,name=scale_factor,json=scaleFactor,proto3" json:"scale_factor,omitempty"`
	GocrText             *v1.TextAnnotation `protobuf:"bytes,3,opt,name=gocr_text,json=gocrText,proto3" json:"gocr_text,omitempty"`
	XXX_NoUnkeyedLiteral struct{}           `json:"-"`
	XXX_unrecognized     []byte             `json:"-"`
	XXX_sizecache        int32              `json:"-"`
}

func (m *OcrScanImageResponse) Reset()         { *m = OcrScanImageResponse{} }
func (m *OcrScanImageResponse) String() string { return proto.CompactTextString(m) }
func (*OcrScanImageResponse) ProtoMessage()    {}
func (*OcrScanImageResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_ocrservice_95c3a0df2dbeab83, []int{1}
}
func (m *OcrScanImageResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_OcrScanImageResponse.Unmarshal(m, b)
}
func (m *OcrScanImageResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_OcrScanImageResponse.Marshal(b, m, deterministic)
}
func (dst *OcrScanImageResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_OcrScanImageResponse.Merge(dst, src)
}
func (m *OcrScanImageResponse) XXX_Size() int {
	return xxx_messageInfo_OcrScanImageResponse.Size(m)
}
func (m *OcrScanImageResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_OcrScanImageResponse.DiscardUnknown(m)
}

var xxx_messageInfo_OcrScanImageResponse proto.InternalMessageInfo

func (m *OcrScanImageResponse) GetTessHocr() string {
	if m != nil {
		return m.TessHocr
	}
	return ""
}

func (m *OcrScanImageResponse) GetScaleFactor() float64 {
	if m != nil {
		return m.ScaleFactor
	}
	return 0
}

func (m *OcrScanImageResponse) GetGocrText() *v1.TextAnnotation {
	if m != nil {
		return m.GocrText
	}
	return nil
}

func init() {
	proto.RegisterType((*OcrScanImageRequest)(nil), "ssn.ocrservice.v1.OcrScanImageRequest")
	proto.RegisterType((*OcrScanImageResponse)(nil), "ssn.ocrservice.v1.OcrScanImageResponse")
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConn

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion4

// OcrServiceClient is the client API for OcrService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type OcrServiceClient interface {
	OcrScanImage(ctx context.Context, in *OcrScanImageRequest, opts ...grpc.CallOption) (*OcrScanImageResponse, error)
}

type ocrServiceClient struct {
	cc *grpc.ClientConn
}

func NewOcrServiceClient(cc *grpc.ClientConn) OcrServiceClient {
	return &ocrServiceClient{cc}
}

func (c *ocrServiceClient) OcrScanImage(ctx context.Context, in *OcrScanImageRequest, opts ...grpc.CallOption) (*OcrScanImageResponse, error) {
	out := new(OcrScanImageResponse)
	err := c.cc.Invoke(ctx, "/ssn.ocrservice.v1.OcrService/OcrScanImage", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// OcrServiceServer is the server API for OcrService service.
type OcrServiceServer interface {
	OcrScanImage(context.Context, *OcrScanImageRequest) (*OcrScanImageResponse, error)
}

func RegisterOcrServiceServer(s *grpc.Server, srv OcrServiceServer) {
	s.RegisterService(&_OcrService_serviceDesc, srv)
}

func _OcrService_OcrScanImage_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(OcrScanImageRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(OcrServiceServer).OcrScanImage(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/ssn.ocrservice.v1.OcrService/OcrScanImage",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(OcrServiceServer).OcrScanImage(ctx, req.(*OcrScanImageRequest))
	}
	return interceptor(ctx, in, info, handler)
}

var _OcrService_serviceDesc = grpc.ServiceDesc{
	ServiceName: "ssn.ocrservice.v1.OcrService",
	HandlerType: (*OcrServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "OcrScanImage",
			Handler:    _OcrService_OcrScanImage_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "ssn/ocrservice/v1/ocrservice.proto",
}

func init() {
	proto.RegisterFile("ssn/ocrservice/v1/ocrservice.proto", fileDescriptor_ocrservice_95c3a0df2dbeab83)
}

var fileDescriptor_ocrservice_95c3a0df2dbeab83 = []byte{
	// 278 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x84, 0x90, 0x41, 0x4b, 0xc4, 0x30,
	0x14, 0x84, 0x89, 0x8a, 0x6c, 0xb3, 0xbd, 0x18, 0x3d, 0x94, 0xf5, 0x52, 0x7b, 0x58, 0x2b, 0x48,
	0x4a, 0xd7, 0x5f, 0xa0, 0x82, 0xe8, 0x49, 0xa8, 0x9e, 0xbc, 0x94, 0x98, 0x7d, 0xd6, 0x42, 0x37,
	0x6f, 0xcd, 0xcb, 0x96, 0xfd, 0x2f, 0xfe, 0x59, 0x49, 0x0a, 0x5a, 0x51, 0xd8, 0x5b, 0x32, 0xcc,
	0x3c, 0xe6, 0x1b, 0x9e, 0x11, 0x99, 0x02, 0xb5, 0x25, 0xb0, 0x7d, 0xab, 0xa1, 0xe8, 0xcb, 0xd1,
	0x4f, 0xae, 0x2d, 0x3a, 0x14, 0x47, 0x44, 0x46, 0x8e, 0xd4, 0xbe, 0x9c, 0x5d, 0x36, 0x88, 0x4d,
	0x07, 0x85, 0xee, 0x70, 0xb3, 0x2c, 0xfa, 0x96, 0x5a, 0x34, 0x3e, 0xeb, 0x60, 0xeb, 0x6a, 0x65,
	0x0c, 0x3a, 0xe5, 0x5a, 0x34, 0xc3, 0x81, 0xec, 0x82, 0x1f, 0x3f, 0x6a, 0xfb, 0xa4, 0x95, 0x79,
	0x58, 0xa9, 0x06, 0x2a, 0xf8, 0xd8, 0x00, 0x39, 0x21, 0xf8, 0xc1, 0x52, 0x39, 0x95, 0xb0, 0x94,
	0xe5, 0x71, 0x15, 0xde, 0xd9, 0x27, 0xe3, 0x27, 0xbf, 0xbd, 0xb4, 0x46, 0x43, 0x20, 0x4e, 0x79,
	0xe4, 0x80, 0xa8, 0x7e, 0x47, 0x6d, 0x43, 0x22, 0xaa, 0x26, 0x5e, 0xb8, 0x47, 0x6d, 0xc5, 0x19,
	0x8f, 0x49, 0xab, 0x0e, 0xea, 0x37, 0xa5, 0x1d, 0xda, 0x64, 0x2f, 0x65, 0x39, 0xab, 0xa6, 0x41,
	0xbb, 0x0b, 0x92, 0xb8, 0xe5, 0x51, 0x83, 0xda, 0xd6, 0xbe, 0x61, 0xb2, 0x9f, 0xb2, 0x7c, 0xba,
	0x98, 0xcb, 0x81, 0x42, 0x06, 0x0a, 0x39, 0x50, 0xc8, 0xbe, 0x94, 0xcf, 0xb0, 0x75, 0xd7, 0xdf,
	0x10, 0xd5, 0xc4, 0x07, 0xbd, 0xb6, 0x58, 0x71, 0xee, 0xcb, 0x0d, 0x3b, 0x88, 0x9a, 0xc7, 0xe3,
	0xaa, 0x62, 0x2e, 0xff, 0x0c, 0x25, 0xff, 0xe1, 0x9e, 0x9d, 0xef, 0xf4, 0x0d, 0xcc, 0x37, 0xf1,
	0x0b, 0xff, 0x71, 0xbd, 0x1e, 0x86, 0x31, 0xaf, 0xbe, 0x02, 0x00, 0x00, 0xff, 0xff, 0x22, 0x31,
	0x17, 0x62, 0xb3, 0x01, 0x00, 0x00,
}
