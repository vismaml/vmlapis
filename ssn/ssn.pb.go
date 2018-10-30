// Code generated by protoc-gen-go. DO NOT EDIT.
// source: ssn/ssn.proto

package ssn

import (
	fmt "fmt"
	imageservice "github.com/e-conomic/proto/ssn/imageservice"
	mlservice "github.com/e-conomic/proto/ssn/mlservice"
	proto "github.com/golang/protobuf/proto"
	context "golang.org/x/net/context"
	grpc "google.golang.org/grpc"
	math "math"
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

type RawScanningRequest struct {
	Doc                  []byte   `protobuf:"bytes,1,opt,name=doc,proto3" json:"doc,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *RawScanningRequest) Reset()         { *m = RawScanningRequest{} }
func (m *RawScanningRequest) String() string { return proto.CompactTextString(m) }
func (*RawScanningRequest) ProtoMessage()    {}
func (*RawScanningRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_4c0d42de96027072, []int{0}
}

func (m *RawScanningRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_RawScanningRequest.Unmarshal(m, b)
}
func (m *RawScanningRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_RawScanningRequest.Marshal(b, m, deterministic)
}
func (m *RawScanningRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_RawScanningRequest.Merge(m, src)
}
func (m *RawScanningRequest) XXX_Size() int {
	return xxx_messageInfo_RawScanningRequest.Size(m)
}
func (m *RawScanningRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_RawScanningRequest.DiscardUnknown(m)
}

var xxx_messageInfo_RawScanningRequest proto.InternalMessageInfo

func (m *RawScanningRequest) GetDoc() []byte {
	if m != nil {
		return m.Doc
	}
	return nil
}

type RawScanningResponse struct {
	ImgResp              []*imageservice.OcrScanImageResponse `protobuf:"bytes,1,rep,name=imgResp,proto3" json:"imgResp,omitempty"`
	MlResp               *mlservice.MlResponse                `protobuf:"bytes,2,opt,name=MlResp,proto3" json:"MlResp,omitempty"`
	XXX_NoUnkeyedLiteral struct{}                             `json:"-"`
	XXX_unrecognized     []byte                               `json:"-"`
	XXX_sizecache        int32                                `json:"-"`
}

func (m *RawScanningResponse) Reset()         { *m = RawScanningResponse{} }
func (m *RawScanningResponse) String() string { return proto.CompactTextString(m) }
func (*RawScanningResponse) ProtoMessage()    {}
func (*RawScanningResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_4c0d42de96027072, []int{1}
}

func (m *RawScanningResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_RawScanningResponse.Unmarshal(m, b)
}
func (m *RawScanningResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_RawScanningResponse.Marshal(b, m, deterministic)
}
func (m *RawScanningResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_RawScanningResponse.Merge(m, src)
}
func (m *RawScanningResponse) XXX_Size() int {
	return xxx_messageInfo_RawScanningResponse.Size(m)
}
func (m *RawScanningResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_RawScanningResponse.DiscardUnknown(m)
}

var xxx_messageInfo_RawScanningResponse proto.InternalMessageInfo

func (m *RawScanningResponse) GetImgResp() []*imageservice.OcrScanImageResponse {
	if m != nil {
		return m.ImgResp
	}
	return nil
}

func (m *RawScanningResponse) GetMlResp() *mlservice.MlResponse {
	if m != nil {
		return m.MlResp
	}
	return nil
}

func init() {
	proto.RegisterType((*RawScanningRequest)(nil), "ssn.RawScanningRequest")
	proto.RegisterType((*RawScanningResponse)(nil), "ssn.RawScanningResponse")
}

func init() { proto.RegisterFile("ssn/ssn.proto", fileDescriptor_4c0d42de96027072) }

var fileDescriptor_4c0d42de96027072 = []byte{
	// 219 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x64, 0x90, 0x51, 0x4b, 0x87, 0x30,
	0x14, 0xc5, 0x5b, 0xc2, 0x5f, 0xb8, 0x16, 0xc4, 0x22, 0x12, 0x21, 0x90, 0x05, 0xe1, 0x4b, 0x0b,
	0xec, 0x35, 0x7a, 0x0f, 0x8a, 0x60, 0x7e, 0x02, 0x5b, 0x43, 0x06, 0x7a, 0x67, 0x5e, 0xab, 0xf7,
	0x3e, 0x79, 0x6c, 0xd3, 0x42, 0x7c, 0xbb, 0xf7, 0x9e, 0xdf, 0x19, 0x67, 0x07, 0x4e, 0x89, 0xf0,
	0x8e, 0x08, 0xe5, 0x38, 0xb9, 0xd9, 0xf1, 0x84, 0x08, 0x8b, 0x6b, 0x7f, 0xb3, 0x43, 0xdb, 0x19,
	0x32, 0xd3, 0x97, 0xd5, 0x66, 0xb3, 0x44, 0xb2, 0xb8, 0xf2, 0xd0, 0xd0, 0xaf, 0xc4, 0xdf, 0x14,
	0x65, 0x71, 0x03, 0x5c, 0xb5, 0xdf, 0x8d, 0x6e, 0x11, 0x2d, 0x76, 0xca, 0x7c, 0x7c, 0x1a, 0x9a,
	0xf9, 0x19, 0x24, 0xef, 0x4e, 0xe7, 0xac, 0x64, 0xd5, 0x89, 0xf2, 0xa3, 0xf8, 0x61, 0x70, 0xbe,
	0x01, 0x69, 0x74, 0x48, 0x86, 0x3f, 0x40, 0x6a, 0x87, 0xb0, 0xe6, 0xac, 0x4c, 0xaa, 0xac, 0x16,
	0x72, 0x13, 0xe2, 0x55, 0x4f, 0xde, 0xf3, 0xe4, 0x6f, 0xab, 0x49, 0xad, 0x16, 0x7e, 0x0b, 0x87,
	0x97, 0x3e, 0x98, 0x8f, 0x4b, 0x56, 0x65, 0xf5, 0x85, 0xfc, 0xcf, 0x17, 0x85, 0xc0, 0x2f, 0x50,
	0xfd, 0x0c, 0xd0, 0x10, 0x36, 0x11, 0xe0, 0x8f, 0x90, 0x2e, 0x89, 0xf8, 0xa5, 0xf4, 0xd5, 0xec,
	0x3f, 0x52, 0xe4, 0x7b, 0x21, 0xbe, 0x29, 0x8e, 0xde, 0x0e, 0xa1, 0x81, 0xfb, 0xdf, 0x00, 0x00,
	0x00, 0xff, 0xff, 0x6d, 0xd6, 0xef, 0x64, 0x5b, 0x01, 0x00, 0x00,
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
	RawScan(ctx context.Context, in *RawScanningRequest, opts ...grpc.CallOption) (*RawScanningResponse, error)
}

type ssnServiceClient struct {
	cc *grpc.ClientConn
}

func NewSsnServiceClient(cc *grpc.ClientConn) SsnServiceClient {
	return &ssnServiceClient{cc}
}

func (c *ssnServiceClient) RawScan(ctx context.Context, in *RawScanningRequest, opts ...grpc.CallOption) (*RawScanningResponse, error) {
	out := new(RawScanningResponse)
	err := c.cc.Invoke(ctx, "/ssn.SsnService/RawScan", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// SsnServiceServer is the server API for SsnService service.
type SsnServiceServer interface {
	RawScan(context.Context, *RawScanningRequest) (*RawScanningResponse, error)
}

func RegisterSsnServiceServer(s *grpc.Server, srv SsnServiceServer) {
	s.RegisterService(&_SsnService_serviceDesc, srv)
}

func _SsnService_RawScan_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(RawScanningRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(SsnServiceServer).RawScan(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/ssn.SsnService/RawScan",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(SsnServiceServer).RawScan(ctx, req.(*RawScanningRequest))
	}
	return interceptor(ctx, in, info, handler)
}

var _SsnService_serviceDesc = grpc.ServiceDesc{
	ServiceName: "ssn.SsnService",
	HandlerType: (*SsnServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "RawScan",
			Handler:    _SsnService_RawScan_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "ssn/ssn.proto",
}
