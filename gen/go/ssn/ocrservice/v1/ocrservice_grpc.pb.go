// Code generated by protoc-gen-go-grpc. DO NOT EDIT.

package ocrservice

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion6

// OcrServiceClient is the client API for OcrService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type OcrServiceClient interface {
	OcrScanImage(ctx context.Context, in *OcrScanImageRequest, opts ...grpc.CallOption) (*OcrScanImageResponse, error)
	GetTextAnnotation(ctx context.Context, in *GetTextAnnotationRequest, opts ...grpc.CallOption) (*GetTextAnnotationResponse, error)
}

type ocrServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewOcrServiceClient(cc grpc.ClientConnInterface) OcrServiceClient {
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

func (c *ocrServiceClient) GetTextAnnotation(ctx context.Context, in *GetTextAnnotationRequest, opts ...grpc.CallOption) (*GetTextAnnotationResponse, error) {
	out := new(GetTextAnnotationResponse)
	err := c.cc.Invoke(ctx, "/ssn.ocrservice.v1.OcrService/GetTextAnnotation", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// OcrServiceServer is the server API for OcrService service.
// All implementations must embed UnimplementedOcrServiceServer
// for forward compatibility
type OcrServiceServer interface {
	OcrScanImage(context.Context, *OcrScanImageRequest) (*OcrScanImageResponse, error)
	GetTextAnnotation(context.Context, *GetTextAnnotationRequest) (*GetTextAnnotationResponse, error)
	mustEmbedUnimplementedOcrServiceServer()
}

// UnimplementedOcrServiceServer must be embedded to have forward compatible implementations.
type UnimplementedOcrServiceServer struct {
}

func (*UnimplementedOcrServiceServer) OcrScanImage(context.Context, *OcrScanImageRequest) (*OcrScanImageResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method OcrScanImage not implemented")
}
func (*UnimplementedOcrServiceServer) GetTextAnnotation(context.Context, *GetTextAnnotationRequest) (*GetTextAnnotationResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetTextAnnotation not implemented")
}
func (*UnimplementedOcrServiceServer) mustEmbedUnimplementedOcrServiceServer() {}

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

func _OcrService_GetTextAnnotation_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetTextAnnotationRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(OcrServiceServer).GetTextAnnotation(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/ssn.ocrservice.v1.OcrService/GetTextAnnotation",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(OcrServiceServer).GetTextAnnotation(ctx, req.(*GetTextAnnotationRequest))
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
		{
			MethodName: "GetTextAnnotation",
			Handler:    _OcrService_GetTextAnnotation_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "ssn/ocrservice/v1/ocrservice.proto",
}
