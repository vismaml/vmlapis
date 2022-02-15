// Code generated by protoc-gen-go-grpc. DO NOT EDIT.
// versions:
// - protoc-gen-go-grpc v1.2.0
// - protoc             v3.6.1
// source: asgt/modelregistry/v1/model_registry.proto

package modelregistry

import (
	context "context"
	empty "github.com/golang/protobuf/ptypes/empty"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
// Requires gRPC-Go v1.32.0 or later.
const _ = grpc.SupportPackageIsVersion7

// ModelRegistryClient is the client API for ModelRegistry service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type ModelRegistryClient interface {
	RegisterModel(ctx context.Context, in *RegisterModelRequest, opts ...grpc.CallOption) (*empty.Empty, error)
	GetCurrentModel(ctx context.Context, in *GetCurrentModelRequest, opts ...grpc.CallOption) (*GetCurrentModelResponse, error)
}

type modelRegistryClient struct {
	cc grpc.ClientConnInterface
}

func NewModelRegistryClient(cc grpc.ClientConnInterface) ModelRegistryClient {
	return &modelRegistryClient{cc}
}

func (c *modelRegistryClient) RegisterModel(ctx context.Context, in *RegisterModelRequest, opts ...grpc.CallOption) (*empty.Empty, error) {
	out := new(empty.Empty)
	err := c.cc.Invoke(ctx, "/asgt.modelregistry.v1.ModelRegistry/RegisterModel", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *modelRegistryClient) GetCurrentModel(ctx context.Context, in *GetCurrentModelRequest, opts ...grpc.CallOption) (*GetCurrentModelResponse, error) {
	out := new(GetCurrentModelResponse)
	err := c.cc.Invoke(ctx, "/asgt.modelregistry.v1.ModelRegistry/GetCurrentModel", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// ModelRegistryServer is the server API for ModelRegistry service.
// All implementations must embed UnimplementedModelRegistryServer
// for forward compatibility
type ModelRegistryServer interface {
	RegisterModel(context.Context, *RegisterModelRequest) (*empty.Empty, error)
	GetCurrentModel(context.Context, *GetCurrentModelRequest) (*GetCurrentModelResponse, error)
	mustEmbedUnimplementedModelRegistryServer()
}

// UnimplementedModelRegistryServer must be embedded to have forward compatible implementations.
type UnimplementedModelRegistryServer struct {
}

func (UnimplementedModelRegistryServer) RegisterModel(context.Context, *RegisterModelRequest) (*empty.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method RegisterModel not implemented")
}
func (UnimplementedModelRegistryServer) GetCurrentModel(context.Context, *GetCurrentModelRequest) (*GetCurrentModelResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetCurrentModel not implemented")
}
func (UnimplementedModelRegistryServer) mustEmbedUnimplementedModelRegistryServer() {}

// UnsafeModelRegistryServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to ModelRegistryServer will
// result in compilation errors.
type UnsafeModelRegistryServer interface {
	mustEmbedUnimplementedModelRegistryServer()
}

func RegisterModelRegistryServer(s grpc.ServiceRegistrar, srv ModelRegistryServer) {
	s.RegisterService(&ModelRegistry_ServiceDesc, srv)
}

func _ModelRegistry_RegisterModel_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(RegisterModelRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ModelRegistryServer).RegisterModel(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/asgt.modelregistry.v1.ModelRegistry/RegisterModel",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ModelRegistryServer).RegisterModel(ctx, req.(*RegisterModelRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _ModelRegistry_GetCurrentModel_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetCurrentModelRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ModelRegistryServer).GetCurrentModel(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/asgt.modelregistry.v1.ModelRegistry/GetCurrentModel",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ModelRegistryServer).GetCurrentModel(ctx, req.(*GetCurrentModelRequest))
	}
	return interceptor(ctx, in, info, handler)
}

// ModelRegistry_ServiceDesc is the grpc.ServiceDesc for ModelRegistry service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var ModelRegistry_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "asgt.modelregistry.v1.ModelRegistry",
	HandlerType: (*ModelRegistryServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "RegisterModel",
			Handler:    _ModelRegistry_RegisterModel_Handler,
		},
		{
			MethodName: "GetCurrentModel",
			Handler:    _ModelRegistry_GetCurrentModel_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "asgt/modelregistry/v1/model_registry.proto",
}
