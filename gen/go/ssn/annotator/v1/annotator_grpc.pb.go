// Code generated by protoc-gen-go-grpc. DO NOT EDIT.
// versions:
// - protoc-gen-go-grpc v1.2.0
// - protoc             v3.12.3
// source: ssn/annotator/v1/annotator.proto

package annotator

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
// Requires gRPC-Go v1.32.0 or later.
const _ = grpc.SupportPackageIsVersion7

// DocumentAnnotatorClient is the client API for DocumentAnnotator service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type DocumentAnnotatorClient interface {
	AnnotateDocument(ctx context.Context, in *DocumentAnnotatorRequest, opts ...grpc.CallOption) (*DocumentAnnotatorResponse, error)
}

type documentAnnotatorClient struct {
	cc grpc.ClientConnInterface
}

func NewDocumentAnnotatorClient(cc grpc.ClientConnInterface) DocumentAnnotatorClient {
	return &documentAnnotatorClient{cc}
}

func (c *documentAnnotatorClient) AnnotateDocument(ctx context.Context, in *DocumentAnnotatorRequest, opts ...grpc.CallOption) (*DocumentAnnotatorResponse, error) {
	out := new(DocumentAnnotatorResponse)
	err := c.cc.Invoke(ctx, "/ssn.annotator.v1.DocumentAnnotator/AnnotateDocument", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// DocumentAnnotatorServer is the server API for DocumentAnnotator service.
// All implementations must embed UnimplementedDocumentAnnotatorServer
// for forward compatibility
type DocumentAnnotatorServer interface {
	AnnotateDocument(context.Context, *DocumentAnnotatorRequest) (*DocumentAnnotatorResponse, error)
	mustEmbedUnimplementedDocumentAnnotatorServer()
}

// UnimplementedDocumentAnnotatorServer must be embedded to have forward compatible implementations.
type UnimplementedDocumentAnnotatorServer struct {
}

func (UnimplementedDocumentAnnotatorServer) AnnotateDocument(context.Context, *DocumentAnnotatorRequest) (*DocumentAnnotatorResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method AnnotateDocument not implemented")
}
func (UnimplementedDocumentAnnotatorServer) mustEmbedUnimplementedDocumentAnnotatorServer() {}

// UnsafeDocumentAnnotatorServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to DocumentAnnotatorServer will
// result in compilation errors.
type UnsafeDocumentAnnotatorServer interface {
	mustEmbedUnimplementedDocumentAnnotatorServer()
}

func RegisterDocumentAnnotatorServer(s grpc.ServiceRegistrar, srv DocumentAnnotatorServer) {
	s.RegisterService(&DocumentAnnotator_ServiceDesc, srv)
}

func _DocumentAnnotator_AnnotateDocument_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DocumentAnnotatorRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(DocumentAnnotatorServer).AnnotateDocument(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/ssn.annotator.v1.DocumentAnnotator/AnnotateDocument",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(DocumentAnnotatorServer).AnnotateDocument(ctx, req.(*DocumentAnnotatorRequest))
	}
	return interceptor(ctx, in, info, handler)
}

// DocumentAnnotator_ServiceDesc is the grpc.ServiceDesc for DocumentAnnotator service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var DocumentAnnotator_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "ssn.annotator.v1.DocumentAnnotator",
	HandlerType: (*DocumentAnnotatorServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "AnnotateDocument",
			Handler:    _DocumentAnnotator_AnnotateDocument_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "ssn/annotator/v1/annotator.proto",
}
