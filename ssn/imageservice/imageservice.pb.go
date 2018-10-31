// Code generated by protoc-gen-go. DO NOT EDIT.
// source: ssn/imageservice/imageservice.proto

package imageservice

import (
	fmt "fmt"
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

type RasterizePdfRequest_Format int32

const (
	RasterizePdfRequest_PNG RasterizePdfRequest_Format = 0
)

var RasterizePdfRequest_Format_name = map[int32]string{
	0: "PNG",
}

var RasterizePdfRequest_Format_value = map[string]int32{
	"PNG": 0,
}

func (x RasterizePdfRequest_Format) String() string {
	return proto.EnumName(RasterizePdfRequest_Format_name, int32(x))
}

func (RasterizePdfRequest_Format) EnumDescriptor() ([]byte, []int) {
	return fileDescriptor_f52ba60e79477746, []int{0, 0}
}

type RasterizePdfRequest struct {
	Data                 []byte                     `protobuf:"bytes,1,opt,name=data,proto3" json:"data,omitempty"`
	Dpi                  uint32                     `protobuf:"varint,2,opt,name=dpi,proto3" json:"dpi,omitempty"`
	Format               RasterizePdfRequest_Format `protobuf:"varint,3,opt,name=format,proto3,enum=imageservice.RasterizePdfRequest_Format" json:"format,omitempty"`
	XXX_NoUnkeyedLiteral struct{}                   `json:"-"`
	XXX_unrecognized     []byte                     `json:"-"`
	XXX_sizecache        int32                      `json:"-"`
}

func (m *RasterizePdfRequest) Reset()         { *m = RasterizePdfRequest{} }
func (m *RasterizePdfRequest) String() string { return proto.CompactTextString(m) }
func (*RasterizePdfRequest) ProtoMessage()    {}
func (*RasterizePdfRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_f52ba60e79477746, []int{0}
}

func (m *RasterizePdfRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_RasterizePdfRequest.Unmarshal(m, b)
}
func (m *RasterizePdfRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_RasterizePdfRequest.Marshal(b, m, deterministic)
}
func (m *RasterizePdfRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_RasterizePdfRequest.Merge(m, src)
}
func (m *RasterizePdfRequest) XXX_Size() int {
	return xxx_messageInfo_RasterizePdfRequest.Size(m)
}
func (m *RasterizePdfRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_RasterizePdfRequest.DiscardUnknown(m)
}

var xxx_messageInfo_RasterizePdfRequest proto.InternalMessageInfo

func (m *RasterizePdfRequest) GetData() []byte {
	if m != nil {
		return m.Data
	}
	return nil
}

func (m *RasterizePdfRequest) GetDpi() uint32 {
	if m != nil {
		return m.Dpi
	}
	return 0
}

func (m *RasterizePdfRequest) GetFormat() RasterizePdfRequest_Format {
	if m != nil {
		return m.Format
	}
	return RasterizePdfRequest_PNG
}

type RasterizePdfResponse struct {
	Index                uint32   `protobuf:"varint,1,opt,name=index,proto3" json:"index,omitempty"`
	Data                 []byte   `protobuf:"bytes,2,opt,name=data,proto3" json:"data,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *RasterizePdfResponse) Reset()         { *m = RasterizePdfResponse{} }
func (m *RasterizePdfResponse) String() string { return proto.CompactTextString(m) }
func (*RasterizePdfResponse) ProtoMessage()    {}
func (*RasterizePdfResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_f52ba60e79477746, []int{1}
}

func (m *RasterizePdfResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_RasterizePdfResponse.Unmarshal(m, b)
}
func (m *RasterizePdfResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_RasterizePdfResponse.Marshal(b, m, deterministic)
}
func (m *RasterizePdfResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_RasterizePdfResponse.Merge(m, src)
}
func (m *RasterizePdfResponse) XXX_Size() int {
	return xxx_messageInfo_RasterizePdfResponse.Size(m)
}
func (m *RasterizePdfResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_RasterizePdfResponse.DiscardUnknown(m)
}

var xxx_messageInfo_RasterizePdfResponse proto.InternalMessageInfo

func (m *RasterizePdfResponse) GetIndex() uint32 {
	if m != nil {
		return m.Index
	}
	return 0
}

func (m *RasterizePdfResponse) GetData() []byte {
	if m != nil {
		return m.Data
	}
	return nil
}

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
	return fileDescriptor_f52ba60e79477746, []int{2}
}

func (m *OcrScanImageRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_OcrScanImageRequest.Unmarshal(m, b)
}
func (m *OcrScanImageRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_OcrScanImageRequest.Marshal(b, m, deterministic)
}
func (m *OcrScanImageRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_OcrScanImageRequest.Merge(m, src)
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
	TessHocr             string   `protobuf:"bytes,1,opt,name=tessHocr,proto3" json:"tessHocr,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *OcrScanImageResponse) Reset()         { *m = OcrScanImageResponse{} }
func (m *OcrScanImageResponse) String() string { return proto.CompactTextString(m) }
func (*OcrScanImageResponse) ProtoMessage()    {}
func (*OcrScanImageResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_f52ba60e79477746, []int{3}
}

func (m *OcrScanImageResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_OcrScanImageResponse.Unmarshal(m, b)
}
func (m *OcrScanImageResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_OcrScanImageResponse.Marshal(b, m, deterministic)
}
func (m *OcrScanImageResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_OcrScanImageResponse.Merge(m, src)
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

func init() {
	proto.RegisterEnum("imageservice.RasterizePdfRequest_Format", RasterizePdfRequest_Format_name, RasterizePdfRequest_Format_value)
	proto.RegisterType((*RasterizePdfRequest)(nil), "imageservice.RasterizePdfRequest")
	proto.RegisterType((*RasterizePdfResponse)(nil), "imageservice.RasterizePdfResponse")
	proto.RegisterType((*OcrScanImageRequest)(nil), "imageservice.OcrScanImageRequest")
	proto.RegisterType((*OcrScanImageResponse)(nil), "imageservice.OcrScanImageResponse")
}

func init() {
	proto.RegisterFile("ssn/imageservice/imageservice.proto", fileDescriptor_f52ba60e79477746)
}

var fileDescriptor_f52ba60e79477746 = []byte{
	// 310 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x7c, 0x52, 0xcb, 0x4e, 0xc3, 0x30,
	0x10, 0xac, 0x5b, 0x28, 0xb0, 0x4a, 0x51, 0x71, 0x7b, 0xa8, 0x7a, 0x0a, 0xe6, 0x12, 0x84, 0x9a,
	0xa0, 0xf0, 0x03, 0x15, 0x07, 0x1e, 0x17, 0xa8, 0xdc, 0x03, 0x82, 0x9b, 0xeb, 0xb8, 0xc5, 0x87,
	0xc4, 0xc1, 0x76, 0x11, 0xe2, 0x2b, 0xf8, 0x26, 0xbe, 0x0c, 0xd5, 0xa9, 0x4a, 0x12, 0x45, 0xbd,
	0xed, 0x8e, 0x66, 0x67, 0x67, 0x47, 0x0b, 0x17, 0xc6, 0x64, 0x91, 0x4c, 0xd9, 0x4a, 0x18, 0xa1,
	0x3f, 0x25, 0x17, 0x95, 0x26, 0xcc, 0xb5, 0xb2, 0x0a, 0x7b, 0x65, 0x8c, 0xfc, 0x20, 0x18, 0x50,
	0x66, 0xac, 0xd0, 0xf2, 0x5b, 0xcc, 0x92, 0x25, 0x15, 0x1f, 0x6b, 0x61, 0x2c, 0xc6, 0x70, 0x90,
	0x30, 0xcb, 0x46, 0xc8, 0x47, 0x81, 0x47, 0x5d, 0x8d, 0xfb, 0xd0, 0x49, 0x72, 0x39, 0x6a, 0xfb,
	0x28, 0xe8, 0xd1, 0x4d, 0x89, 0xa7, 0xd0, 0x5d, 0x2a, 0x9d, 0x32, 0x3b, 0xea, 0xf8, 0x28, 0x38,
	0x8d, 0x83, 0xb0, 0xb2, 0xb0, 0x41, 0x38, 0xbc, 0x73, 0x7c, 0xba, 0x9d, 0x23, 0x67, 0xd0, 0x2d,
	0x10, 0x7c, 0x04, 0x9d, 0xd9, 0xd3, 0x7d, 0xbf, 0x45, 0xa6, 0x30, 0xac, 0x0e, 0x9a, 0x5c, 0x65,
	0x46, 0xe0, 0x21, 0x1c, 0xca, 0x2c, 0x11, 0x5f, 0xce, 0x53, 0x8f, 0x16, 0xcd, 0xce, 0x68, 0xfb,
	0xdf, 0x28, 0xb9, 0x84, 0xc1, 0x33, 0xd7, 0x73, 0xce, 0xb2, 0xc7, 0x8d, 0x9d, 0x3d, 0x37, 0x91,
	0x18, 0x86, 0x55, 0xea, 0x76, 0xd9, 0x18, 0x8e, 0xad, 0x30, 0xe6, 0x41, 0x71, 0xed, 0xf8, 0x27,
	0x74, 0xd7, 0xc7, 0xbf, 0x08, 0x3c, 0xc7, 0x9e, 0x17, 0x77, 0xe2, 0x17, 0xf0, 0xca, 0x22, 0xf8,
	0xbc, 0x1a, 0x43, 0x83, 0x97, 0x31, 0xd9, 0x47, 0x29, 0x3c, 0x90, 0x16, 0x7e, 0x05, 0xaf, 0x1c,
	0x45, 0x5d, 0xb8, 0x21, 0xdf, 0xba, 0x70, 0x53, 0x92, 0xa4, 0x75, 0x8d, 0x6e, 0x27, 0x6f, 0x57,
	0x2b, 0x69, 0xdf, 0xd7, 0x8b, 0x90, 0xab, 0x34, 0x12, 0x13, 0xae, 0x32, 0x95, 0x4a, 0x1e, 0xb9,
	0x27, 0x89, 0xea, 0x8f, 0xb4, 0xe8, 0x3a, 0xfc, 0xe6, 0x2f, 0x00, 0x00, 0xff, 0xff, 0xd5, 0x54,
	0x37, 0x80, 0x63, 0x02, 0x00, 0x00,
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConn

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion4

// ImageServiceClient is the client API for ImageService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type ImageServiceClient interface {
	OcrScanImage(ctx context.Context, in *OcrScanImageRequest, opts ...grpc.CallOption) (*OcrScanImageResponse, error)
	RasterizePdf(ctx context.Context, in *RasterizePdfRequest, opts ...grpc.CallOption) (ImageService_RasterizePdfClient, error)
}

type imageServiceClient struct {
	cc *grpc.ClientConn
}

func NewImageServiceClient(cc *grpc.ClientConn) ImageServiceClient {
	return &imageServiceClient{cc}
}

func (c *imageServiceClient) OcrScanImage(ctx context.Context, in *OcrScanImageRequest, opts ...grpc.CallOption) (*OcrScanImageResponse, error) {
	out := new(OcrScanImageResponse)
	err := c.cc.Invoke(ctx, "/imageservice.ImageService/OcrScanImage", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *imageServiceClient) RasterizePdf(ctx context.Context, in *RasterizePdfRequest, opts ...grpc.CallOption) (ImageService_RasterizePdfClient, error) {
	stream, err := c.cc.NewStream(ctx, &_ImageService_serviceDesc.Streams[0], "/imageservice.ImageService/RasterizePdf", opts...)
	if err != nil {
		return nil, err
	}
	x := &imageServiceRasterizePdfClient{stream}
	if err := x.ClientStream.SendMsg(in); err != nil {
		return nil, err
	}
	if err := x.ClientStream.CloseSend(); err != nil {
		return nil, err
	}
	return x, nil
}

type ImageService_RasterizePdfClient interface {
	Recv() (*RasterizePdfResponse, error)
	grpc.ClientStream
}

type imageServiceRasterizePdfClient struct {
	grpc.ClientStream
}

func (x *imageServiceRasterizePdfClient) Recv() (*RasterizePdfResponse, error) {
	m := new(RasterizePdfResponse)
	if err := x.ClientStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

// ImageServiceServer is the server API for ImageService service.
type ImageServiceServer interface {
	OcrScanImage(context.Context, *OcrScanImageRequest) (*OcrScanImageResponse, error)
	RasterizePdf(*RasterizePdfRequest, ImageService_RasterizePdfServer) error
}

func RegisterImageServiceServer(s *grpc.Server, srv ImageServiceServer) {
	s.RegisterService(&_ImageService_serviceDesc, srv)
}

func _ImageService_OcrScanImage_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(OcrScanImageRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ImageServiceServer).OcrScanImage(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/imageservice.ImageService/OcrScanImage",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ImageServiceServer).OcrScanImage(ctx, req.(*OcrScanImageRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _ImageService_RasterizePdf_Handler(srv interface{}, stream grpc.ServerStream) error {
	m := new(RasterizePdfRequest)
	if err := stream.RecvMsg(m); err != nil {
		return err
	}
	return srv.(ImageServiceServer).RasterizePdf(m, &imageServiceRasterizePdfServer{stream})
}

type ImageService_RasterizePdfServer interface {
	Send(*RasterizePdfResponse) error
	grpc.ServerStream
}

type imageServiceRasterizePdfServer struct {
	grpc.ServerStream
}

func (x *imageServiceRasterizePdfServer) Send(m *RasterizePdfResponse) error {
	return x.ServerStream.SendMsg(m)
}

var _ImageService_serviceDesc = grpc.ServiceDesc{
	ServiceName: "imageservice.ImageService",
	HandlerType: (*ImageServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "OcrScanImage",
			Handler:    _ImageService_OcrScanImage_Handler,
		},
	},
	Streams: []grpc.StreamDesc{
		{
			StreamName:    "RasterizePdf",
			Handler:       _ImageService_RasterizePdf_Handler,
			ServerStreams: true,
		},
	},
	Metadata: "ssn/imageservice/imageservice.proto",
}
