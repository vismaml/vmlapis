// Code generated by protoc-gen-go-grpc. DO NOT EDIT.
// versions:
// - protoc-gen-go-grpc v1.2.0
// - protoc             v3.6.1
// source: ssn/mlservice/v2/mlservice.proto

package mlservice

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

// MlServiceClient is the client API for MlService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type MlServiceClient interface {
	FeatureGen(ctx context.Context, in *FeatureGenRequest, opts ...grpc.CallOption) (*FeatureGenResponse, error)
	Predict(ctx context.Context, in *PredictRequest, opts ...grpc.CallOption) (*PredictResponse, error)
	// Convinienve method
	FeatureGenPredict(ctx context.Context, in *FeatureGenPredictRequest, opts ...grpc.CallOption) (*PredictResponse, error)
}

type mlServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewMlServiceClient(cc grpc.ClientConnInterface) MlServiceClient {
	return &mlServiceClient{cc}
}

func (c *mlServiceClient) FeatureGen(ctx context.Context, in *FeatureGenRequest, opts ...grpc.CallOption) (*FeatureGenResponse, error) {
	out := new(FeatureGenResponse)
	err := c.cc.Invoke(ctx, "/ssn.mlservice.v2.MlService/FeatureGen", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *mlServiceClient) Predict(ctx context.Context, in *PredictRequest, opts ...grpc.CallOption) (*PredictResponse, error) {
	out := new(PredictResponse)
	err := c.cc.Invoke(ctx, "/ssn.mlservice.v2.MlService/Predict", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *mlServiceClient) FeatureGenPredict(ctx context.Context, in *FeatureGenPredictRequest, opts ...grpc.CallOption) (*PredictResponse, error) {
	out := new(PredictResponse)
	err := c.cc.Invoke(ctx, "/ssn.mlservice.v2.MlService/FeatureGenPredict", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// MlServiceServer is the server API for MlService service.
// All implementations must embed UnimplementedMlServiceServer
// for forward compatibility
type MlServiceServer interface {
	FeatureGen(context.Context, *FeatureGenRequest) (*FeatureGenResponse, error)
	Predict(context.Context, *PredictRequest) (*PredictResponse, error)
	// Convinienve method
	FeatureGenPredict(context.Context, *FeatureGenPredictRequest) (*PredictResponse, error)
	mustEmbedUnimplementedMlServiceServer()
}

// UnimplementedMlServiceServer must be embedded to have forward compatible implementations.
type UnimplementedMlServiceServer struct {
}

func (UnimplementedMlServiceServer) FeatureGen(context.Context, *FeatureGenRequest) (*FeatureGenResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method FeatureGen not implemented")
}
func (UnimplementedMlServiceServer) Predict(context.Context, *PredictRequest) (*PredictResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Predict not implemented")
}
func (UnimplementedMlServiceServer) FeatureGenPredict(context.Context, *FeatureGenPredictRequest) (*PredictResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method FeatureGenPredict not implemented")
}
func (UnimplementedMlServiceServer) mustEmbedUnimplementedMlServiceServer() {}

// UnsafeMlServiceServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to MlServiceServer will
// result in compilation errors.
type UnsafeMlServiceServer interface {
	mustEmbedUnimplementedMlServiceServer()
}

func RegisterMlServiceServer(s grpc.ServiceRegistrar, srv MlServiceServer) {
	s.RegisterService(&MlService_ServiceDesc, srv)
}

func _MlService_FeatureGen_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(FeatureGenRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(MlServiceServer).FeatureGen(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/ssn.mlservice.v2.MlService/FeatureGen",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(MlServiceServer).FeatureGen(ctx, req.(*FeatureGenRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _MlService_Predict_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(PredictRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(MlServiceServer).Predict(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/ssn.mlservice.v2.MlService/Predict",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(MlServiceServer).Predict(ctx, req.(*PredictRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _MlService_FeatureGenPredict_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(FeatureGenPredictRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(MlServiceServer).FeatureGenPredict(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/ssn.mlservice.v2.MlService/FeatureGenPredict",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(MlServiceServer).FeatureGenPredict(ctx, req.(*FeatureGenPredictRequest))
	}
	return interceptor(ctx, in, info, handler)
}

// MlService_ServiceDesc is the grpc.ServiceDesc for MlService service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var MlService_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "ssn.mlservice.v2.MlService",
	HandlerType: (*MlServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "FeatureGen",
			Handler:    _MlService_FeatureGen_Handler,
		},
		{
			MethodName: "Predict",
			Handler:    _MlService_Predict_Handler,
		},
		{
			MethodName: "FeatureGenPredict",
			Handler:    _MlService_FeatureGenPredict_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "ssn/mlservice/v2/mlservice.proto",
}
