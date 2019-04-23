// Code generated by protoc-gen-go. DO NOT EDIT.
// source: ssn/scanner/v1/scanner.proto

package scanner

import proto "github.com/golang/protobuf/proto"
import fmt "fmt"
import math "math"
import v1 "github.com/e-conomic/vmlapis/gen/go/ssn/mlservice/v1"
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

type Feature_Type int32

const (
	Feature_DOCUMENT_FIELD_DETECTION Feature_Type = 0
	Feature_RAW_TEXT_DETECTION       Feature_Type = 1
)

var Feature_Type_name = map[int32]string{
	0: "DOCUMENT_FIELD_DETECTION",
	1: "RAW_TEXT_DETECTION",
}
var Feature_Type_value = map[string]int32{
	"DOCUMENT_FIELD_DETECTION": 0,
	"RAW_TEXT_DETECTION":       1,
}

func (x Feature_Type) String() string {
	return proto.EnumName(Feature_Type_name, int32(x))
}
func (Feature_Type) EnumDescriptor() ([]byte, []int) {
	return fileDescriptor_scanner_f2bdb0a5a615d1a0, []int{0, 0}
}

type Feature struct {
	Type                 Feature_Type `protobuf:"varint,1,opt,name=type,proto3,enum=ssn.scanner.v1.Feature_Type" json:"type,omitempty"`
	XXX_NoUnkeyedLiteral struct{}     `json:"-"`
	XXX_unrecognized     []byte       `json:"-"`
	XXX_sizecache        int32        `json:"-"`
}

func (m *Feature) Reset()         { *m = Feature{} }
func (m *Feature) String() string { return proto.CompactTextString(m) }
func (*Feature) ProtoMessage()    {}
func (*Feature) Descriptor() ([]byte, []int) {
	return fileDescriptor_scanner_f2bdb0a5a615d1a0, []int{0}
}
func (m *Feature) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Feature.Unmarshal(m, b)
}
func (m *Feature) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Feature.Marshal(b, m, deterministic)
}
func (dst *Feature) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Feature.Merge(dst, src)
}
func (m *Feature) XXX_Size() int {
	return xxx_messageInfo_Feature.Size(m)
}
func (m *Feature) XXX_DiscardUnknown() {
	xxx_messageInfo_Feature.DiscardUnknown(m)
}

var xxx_messageInfo_Feature proto.InternalMessageInfo

func (m *Feature) GetType() Feature_Type {
	if m != nil {
		return m.Type
	}
	return Feature_DOCUMENT_FIELD_DETECTION
}

type ScanRequest struct {
	Image                []byte     `protobuf:"bytes,1,opt,name=image,proto3" json:"image,omitempty"`
	Features             []*Feature `protobuf:"bytes,2,rep,name=features,proto3" json:"features,omitempty"`
	XXX_NoUnkeyedLiteral struct{}   `json:"-"`
	XXX_unrecognized     []byte     `json:"-"`
	XXX_sizecache        int32      `json:"-"`
}

func (m *ScanRequest) Reset()         { *m = ScanRequest{} }
func (m *ScanRequest) String() string { return proto.CompactTextString(m) }
func (*ScanRequest) ProtoMessage()    {}
func (*ScanRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_scanner_f2bdb0a5a615d1a0, []int{1}
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

func (m *ScanRequest) GetImage() []byte {
	if m != nil {
		return m.Image
	}
	return nil
}

func (m *ScanRequest) GetFeatures() []*Feature {
	if m != nil {
		return m.Features
	}
	return nil
}

type ScanResponse struct {
	DocumentFieldDetection *v1.MlResponse `protobuf:"bytes,1,opt,name=document_field_detection,json=documentFieldDetection,proto3" json:"document_field_detection,omitempty"`
	RawTextDetection       string         `protobuf:"bytes,2,opt,name=raw_text_detection,json=rawTextDetection,proto3" json:"raw_text_detection,omitempty"`
	XXX_NoUnkeyedLiteral   struct{}       `json:"-"`
	XXX_unrecognized       []byte         `json:"-"`
	XXX_sizecache          int32          `json:"-"`
}

func (m *ScanResponse) Reset()         { *m = ScanResponse{} }
func (m *ScanResponse) String() string { return proto.CompactTextString(m) }
func (*ScanResponse) ProtoMessage()    {}
func (*ScanResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_scanner_f2bdb0a5a615d1a0, []int{2}
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

func (m *ScanResponse) GetDocumentFieldDetection() *v1.MlResponse {
	if m != nil {
		return m.DocumentFieldDetection
	}
	return nil
}

func (m *ScanResponse) GetRawTextDetection() string {
	if m != nil {
		return m.RawTextDetection
	}
	return ""
}

func init() {
	proto.RegisterType((*Feature)(nil), "ssn.scanner.v1.Feature")
	proto.RegisterType((*ScanRequest)(nil), "ssn.scanner.v1.ScanRequest")
	proto.RegisterType((*ScanResponse)(nil), "ssn.scanner.v1.ScanResponse")
	proto.RegisterEnum("ssn.scanner.v1.Feature_Type", Feature_Type_name, Feature_Type_value)
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConn

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion4

// ScannerClient is the client API for Scanner service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type ScannerClient interface {
	Scan(ctx context.Context, in *ScanRequest, opts ...grpc.CallOption) (*ScanResponse, error)
}

type scannerClient struct {
	cc *grpc.ClientConn
}

func NewScannerClient(cc *grpc.ClientConn) ScannerClient {
	return &scannerClient{cc}
}

func (c *scannerClient) Scan(ctx context.Context, in *ScanRequest, opts ...grpc.CallOption) (*ScanResponse, error) {
	out := new(ScanResponse)
	err := c.cc.Invoke(ctx, "/ssn.scanner.v1.Scanner/Scan", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// ScannerServer is the server API for Scanner service.
type ScannerServer interface {
	Scan(context.Context, *ScanRequest) (*ScanResponse, error)
}

func RegisterScannerServer(s *grpc.Server, srv ScannerServer) {
	s.RegisterService(&_Scanner_serviceDesc, srv)
}

func _Scanner_Scan_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(ScanRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ScannerServer).Scan(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/ssn.scanner.v1.Scanner/Scan",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ScannerServer).Scan(ctx, req.(*ScanRequest))
	}
	return interceptor(ctx, in, info, handler)
}

var _Scanner_serviceDesc = grpc.ServiceDesc{
	ServiceName: "ssn.scanner.v1.Scanner",
	HandlerType: (*ScannerServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "Scan",
			Handler:    _Scanner_Scan_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "ssn/scanner/v1/scanner.proto",
}

func init() {
	proto.RegisterFile("ssn/scanner/v1/scanner.proto", fileDescriptor_scanner_f2bdb0a5a615d1a0)
}

var fileDescriptor_scanner_f2bdb0a5a615d1a0 = []byte{
	// 384 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x74, 0x92, 0xc1, 0x6e, 0xda, 0x40,
	0x10, 0x86, 0x6b, 0x4a, 0x0b, 0x2c, 0x14, 0xa1, 0x6d, 0x45, 0x2d, 0xea, 0x83, 0xe5, 0x13, 0xaa,
	0x2a, 0xbb, 0xc0, 0xad, 0xea, 0xa5, 0xc5, 0x46, 0x42, 0x2a, 0x20, 0x19, 0x97, 0xa0, 0x5c, 0xac,
	0x8d, 0x19, 0x90, 0x25, 0xb3, 0xeb, 0x78, 0x17, 0x03, 0xd7, 0xbc, 0x42, 0xf2, 0x66, 0x79, 0x85,
	0x3c, 0x48, 0x64, 0x16, 0x13, 0x12, 0x25, 0xb7, 0x9d, 0xf5, 0xf7, 0xff, 0xff, 0xcc, 0x78, 0x91,
	0xc6, 0x39, 0xb5, 0x78, 0x40, 0x28, 0x85, 0xc4, 0x4a, 0x3b, 0xf9, 0xd1, 0x8c, 0x13, 0x26, 0x18,
	0xae, 0x73, 0x4e, 0xcd, 0xfc, 0x2a, 0xed, 0xb4, 0xb4, 0x15, 0x63, 0xab, 0x08, 0x2c, 0x12, 0x87,
	0x16, 0xa1, 0x94, 0x09, 0x22, 0x42, 0x46, 0xb9, 0xa4, 0x5b, 0x7a, 0xe6, 0xb5, 0x8e, 0x38, 0x24,
	0x69, 0x18, 0x40, 0xe6, 0x76, 0x2a, 0x24, 0x61, 0xec, 0x51, 0x69, 0x00, 0x44, 0x6c, 0x12, 0xc0,
	0x3f, 0x51, 0x51, 0xec, 0x63, 0x50, 0x15, 0x5d, 0x69, 0xd7, 0xbb, 0x9a, 0xf9, 0x3c, 0xc9, 0x3c,
	0x62, 0xa6, 0xb7, 0x8f, 0xc1, 0x3d, 0x90, 0xc6, 0x6f, 0x54, 0xcc, 0x2a, 0xac, 0x21, 0xd5, 0x9e,
	0xf4, 0xff, 0x8f, 0x9c, 0xb1, 0xe7, 0x0f, 0x86, 0xce, 0x3f, 0xdb, 0xb7, 0x1d, 0xcf, 0xe9, 0x7b,
	0xc3, 0xc9, 0xb8, 0xf1, 0x0e, 0x37, 0x11, 0x76, 0xff, 0x5c, 0xf8, 0x9e, 0x33, 0xf7, 0xce, 0xee,
	0x15, 0x63, 0x8e, 0xaa, 0xd3, 0x80, 0x50, 0x17, 0xae, 0x37, 0xc0, 0x05, 0xfe, 0x82, 0x3e, 0x84,
	0x6b, 0xb2, 0x92, 0xf9, 0x35, 0x57, 0x16, 0xb8, 0x87, 0xca, 0x4b, 0x19, 0xcc, 0xd5, 0x82, 0xfe,
	0xbe, 0x5d, 0xed, 0x7e, 0x7d, 0xa3, 0x31, 0xf7, 0x04, 0x1a, 0x77, 0x0a, 0xaa, 0x49, 0x6b, 0x1e,
	0x33, 0xca, 0x01, 0xcf, 0x90, 0xba, 0x60, 0xc1, 0x66, 0x0d, 0x54, 0xf8, 0xcb, 0x10, 0xa2, 0x85,
	0xbf, 0x00, 0x01, 0x41, 0xb6, 0xaa, 0x43, 0x5c, 0xf5, 0x38, 0xee, 0xd3, 0x76, 0xd2, 0x8e, 0x39,
	0x8a, 0x72, 0xbd, 0xdb, 0xcc, 0xd5, 0x83, 0x4c, 0x6c, 0xe7, 0x5a, 0xfc, 0x03, 0xe1, 0x84, 0x6c,
	0x7d, 0x01, 0x3b, 0x71, 0xe6, 0x58, 0xd0, 0x95, 0x76, 0xc5, 0x6d, 0x24, 0x64, 0xeb, 0xc1, 0x4e,
	0x9c, 0xe8, 0x2e, 0x41, 0xa5, 0xa9, 0x6c, 0x1b, 0xcf, 0x50, 0x31, 0x3b, 0xe2, 0x6f, 0x2f, 0x87,
	0x39, 0xdb, 0x48, 0x4b, 0x7b, 0xfd, 0xa3, 0xec, 0xc9, 0xf8, 0x7c, 0x73, 0xff, 0x70, 0x5b, 0xf8,
	0x64, 0x94, 0xf3, 0x47, 0xf2, 0x4b, 0xf9, 0xfe, 0xb7, 0x72, 0x59, 0x3a, 0xf2, 0x57, 0x1f, 0x0f,
	0x3f, 0xb8, 0xf7, 0x18, 0x00, 0x00, 0xff, 0xff, 0x01, 0x21, 0xc5, 0x05, 0x50, 0x02, 0x00, 0x00,
}
