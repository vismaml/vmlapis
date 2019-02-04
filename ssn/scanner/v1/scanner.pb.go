// Code generated by protoc-gen-go. DO NOT EDIT.
// source: ssn/scanner/v1/scanner.proto

package scanner // import "github.com/e-conomic/vmlapis/ssn/scanner/v1"

import proto "github.com/golang/protobuf/proto"
import fmt "fmt"
import math "math"
import v1 "github.com/e-conomic/vmlapis/ssn/mlservice/v1"
import v11 "github.com/e-conomic/vmlapis/ssn/ocrservice/v1"
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
	return fileDescriptor_scanner_6d271e2ab7dcfbc3, []int{0, 0}
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
	return fileDescriptor_scanner_6d271e2ab7dcfbc3, []int{0}
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
	return fileDescriptor_scanner_6d271e2ab7dcfbc3, []int{1}
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
	DocumentFieldDetection *v1.MlResponse `protobuf:"bytes,1,opt,name=documentFieldDetection,proto3" json:"documentFieldDetection,omitempty"`
	RawTextDetection       string         `protobuf:"bytes,2,opt,name=rawTextDetection,proto3" json:"rawTextDetection,omitempty"`
	XXX_NoUnkeyedLiteral   struct{}       `json:"-"`
	XXX_unrecognized       []byte         `json:"-"`
	XXX_sizecache          int32          `json:"-"`
}

func (m *ScanResponse) Reset()         { *m = ScanResponse{} }
func (m *ScanResponse) String() string { return proto.CompactTextString(m) }
func (*ScanResponse) ProtoMessage()    {}
func (*ScanResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_scanner_6d271e2ab7dcfbc3, []int{2}
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

type DebugScanResponse struct {
	ScanResponse         *ScanResponse               `protobuf:"bytes,1,opt,name=scanResponse,proto3" json:"scanResponse,omitempty"`
	InternalOcrResponses []*v11.OcrScanImageResponse `protobuf:"bytes,2,rep,name=internalOcrResponses,proto3" json:"internalOcrResponses,omitempty"`
	XXX_NoUnkeyedLiteral struct{}                    `json:"-"`
	XXX_unrecognized     []byte                      `json:"-"`
	XXX_sizecache        int32                       `json:"-"`
}

func (m *DebugScanResponse) Reset()         { *m = DebugScanResponse{} }
func (m *DebugScanResponse) String() string { return proto.CompactTextString(m) }
func (*DebugScanResponse) ProtoMessage()    {}
func (*DebugScanResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_scanner_6d271e2ab7dcfbc3, []int{3}
}
func (m *DebugScanResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_DebugScanResponse.Unmarshal(m, b)
}
func (m *DebugScanResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_DebugScanResponse.Marshal(b, m, deterministic)
}
func (dst *DebugScanResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_DebugScanResponse.Merge(dst, src)
}
func (m *DebugScanResponse) XXX_Size() int {
	return xxx_messageInfo_DebugScanResponse.Size(m)
}
func (m *DebugScanResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_DebugScanResponse.DiscardUnknown(m)
}

var xxx_messageInfo_DebugScanResponse proto.InternalMessageInfo

func (m *DebugScanResponse) GetScanResponse() *ScanResponse {
	if m != nil {
		return m.ScanResponse
	}
	return nil
}

func (m *DebugScanResponse) GetInternalOcrResponses() []*v11.OcrScanImageResponse {
	if m != nil {
		return m.InternalOcrResponses
	}
	return nil
}

func init() {
	proto.RegisterType((*Feature)(nil), "ssn.scanner.v1.Feature")
	proto.RegisterType((*ScanRequest)(nil), "ssn.scanner.v1.ScanRequest")
	proto.RegisterType((*ScanResponse)(nil), "ssn.scanner.v1.ScanResponse")
	proto.RegisterType((*DebugScanResponse)(nil), "ssn.scanner.v1.DebugScanResponse")
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
	DebugScan(ctx context.Context, in *ScanRequest, opts ...grpc.CallOption) (*DebugScanResponse, error)
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

func (c *scannerClient) DebugScan(ctx context.Context, in *ScanRequest, opts ...grpc.CallOption) (*DebugScanResponse, error) {
	out := new(DebugScanResponse)
	err := c.cc.Invoke(ctx, "/ssn.scanner.v1.Scanner/DebugScan", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// ScannerServer is the server API for Scanner service.
type ScannerServer interface {
	Scan(context.Context, *ScanRequest) (*ScanResponse, error)
	DebugScan(context.Context, *ScanRequest) (*DebugScanResponse, error)
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

func _Scanner_DebugScan_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(ScanRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ScannerServer).DebugScan(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/ssn.scanner.v1.Scanner/DebugScan",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ScannerServer).DebugScan(ctx, req.(*ScanRequest))
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
		{
			MethodName: "DebugScan",
			Handler:    _Scanner_DebugScan_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "ssn/scanner/v1/scanner.proto",
}

func init() {
	proto.RegisterFile("ssn/scanner/v1/scanner.proto", fileDescriptor_scanner_6d271e2ab7dcfbc3)
}

var fileDescriptor_scanner_6d271e2ab7dcfbc3 = []byte{
	// 484 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x7c, 0x53, 0xcd, 0x6e, 0xd3, 0x40,
	0x10, 0xae, 0x43, 0xa0, 0xed, 0x24, 0x54, 0x65, 0xa9, 0x4a, 0x14, 0x72, 0x08, 0xbe, 0x10, 0x55,
	0xc2, 0x26, 0x89, 0xb8, 0x00, 0x07, 0xa0, 0x71, 0xa4, 0x48, 0xa4, 0x91, 0x5c, 0x03, 0x15, 0x1c,
	0xa2, 0xcd, 0x76, 0x30, 0x96, 0xec, 0x5d, 0xe3, 0x5d, 0x1b, 0x72, 0xe5, 0x09, 0x90, 0x78, 0x11,
	0xc4, 0xab, 0xf0, 0x0a, 0x3c, 0x08, 0xb2, 0x1d, 0x27, 0x76, 0xff, 0x6e, 0x33, 0xe3, 0xef, 0xfb,
	0xe6, 0xdb, 0xcf, 0xbb, 0xd0, 0x91, 0x92, 0x9b, 0x92, 0x51, 0xce, 0x31, 0x32, 0x93, 0x7e, 0x51,
	0x1a, 0x61, 0x24, 0x94, 0x20, 0x7b, 0x52, 0x72, 0xa3, 0x18, 0x25, 0xfd, 0xb6, 0x9e, 0xa2, 0x05,
	0x8b, 0x24, 0x46, 0x89, 0xc7, 0x30, 0x25, 0x6c, 0xba, 0x9c, 0xd3, 0xee, 0xa6, 0x98, 0xc0, 0x2f,
	0x41, 0xd6, 0xcd, 0x0a, 0xd1, 0x71, 0x85, 0x70, 0x7d, 0x34, 0x69, 0xe8, 0x99, 0x94, 0x73, 0xa1,
	0xa8, 0xf2, 0x04, 0x97, 0xf9, 0x57, 0x7d, 0x09, 0xdb, 0x63, 0xa4, 0x2a, 0x8e, 0x90, 0x3c, 0x85,
	0xba, 0x5a, 0x86, 0xd8, 0xd2, 0xba, 0x5a, 0x6f, 0x6f, 0xd0, 0x31, 0xaa, 0x6e, 0x8c, 0x15, 0xcc,
	0x70, 0x96, 0x21, 0xda, 0x19, 0x52, 0x7f, 0x09, 0xf5, 0xb4, 0x23, 0x1d, 0x68, 0x8d, 0x66, 0xc7,
	0xef, 0xa6, 0xd6, 0x89, 0x33, 0x1f, 0x4f, 0xac, 0xb7, 0xa3, 0xf9, 0xc8, 0x72, 0xac, 0x63, 0x67,
	0x32, 0x3b, 0xd9, 0xdf, 0x22, 0x87, 0x40, 0xec, 0xd7, 0x1f, 0xe6, 0x8e, 0x75, 0xe6, 0x94, 0xe6,
	0x9a, 0x7e, 0x06, 0x8d, 0x53, 0x46, 0xb9, 0x8d, 0x5f, 0x63, 0x94, 0x8a, 0x1c, 0xc0, 0x6d, 0x2f,
	0xa0, 0x6e, 0xbe, 0xbf, 0x69, 0xe7, 0x0d, 0x19, 0xc2, 0xce, 0xe7, 0x7c, 0xb1, 0x6c, 0xd5, 0xba,
	0xb7, 0x7a, 0x8d, 0xc1, 0x83, 0x6b, 0x8c, 0xd9, 0x6b, 0xa0, 0xfe, 0x53, 0x83, 0x66, 0x2e, 0x2d,
	0x43, 0xc1, 0x25, 0x12, 0x07, 0x0e, 0xcf, 0x05, 0x8b, 0x03, 0xe4, 0x6a, 0xec, 0xa1, 0x7f, 0x3e,
	0x42, 0x85, 0x2c, 0x8d, 0x21, 0x5b, 0xd6, 0x58, 0x1d, 0x76, 0x93, 0x5c, 0xd2, 0x37, 0xa6, 0x7e,
	0xc1, 0xb6, 0xaf, 0xe1, 0x92, 0x23, 0xd8, 0x8f, 0xe8, 0x37, 0x07, 0xbf, 0xab, 0x8d, 0x5e, 0xad,
	0xab, 0xf5, 0x76, 0xed, 0x4b, 0x73, 0xfd, 0x8f, 0x06, 0xf7, 0x46, 0xb8, 0x88, 0xdd, 0x8a, 0xaf,
	0x57, 0xd0, 0x94, 0xa5, 0xbe, 0xe2, 0xa6, 0x74, 0xc2, 0x32, 0xc7, 0xae, 0x30, 0xc8, 0x27, 0x38,
	0xf0, 0xb8, 0xc2, 0x88, 0x53, 0x7f, 0xc6, 0xa2, 0x62, 0x5c, 0x64, 0xf5, 0x38, 0x53, 0x2a, 0x5d,
	0x9a, 0xa4, 0x6f, 0xcc, 0x58, 0x94, 0xea, 0x4d, 0xd2, 0x78, 0xd7, 0xa2, 0x57, 0x8a, 0x0c, 0x7e,
	0x6b, 0xb0, 0x7d, 0x9a, 0xdb, 0x20, 0xef, 0xa1, 0x9e, 0x96, 0xe4, 0xe1, 0xd5, 0xe6, 0xb2, 0x7f,
	0xd8, 0xbe, 0xd1, 0xb9, 0x7e, 0xff, 0xc7, 0xdf, 0x7f, 0xbf, 0x6a, 0x77, 0xf5, 0x9d, 0xe2, 0xea,
	0x3f, 0xd7, 0x8e, 0xc8, 0x14, 0x76, 0xd7, 0xb9, 0xdc, 0x2c, 0xfe, 0xe8, 0xe2, 0xc7, 0x4b, 0x79,
	0xea, 0x5b, 0x6f, 0x9e, 0x7d, 0x1c, 0xba, 0x9e, 0xfa, 0x12, 0x2f, 0x0c, 0x26, 0x02, 0x13, 0x9f,
	0x30, 0xc1, 0x45, 0xe0, 0x31, 0x33, 0x09, 0x7c, 0x1a, 0x7a, 0xd2, 0xac, 0x3e, 0xc0, 0x17, 0xab,
	0x72, 0x71, 0x27, 0x7b, 0x0d, 0xc3, 0xff, 0x01, 0x00, 0x00, 0xff, 0xff, 0xd9, 0x1a, 0xce, 0xdf,
	0xa1, 0x03, 0x00, 0x00,
}
