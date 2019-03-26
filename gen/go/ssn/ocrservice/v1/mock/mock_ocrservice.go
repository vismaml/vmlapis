// Code generated by MockGen. DO NOT EDIT.
// Source: gen/go/ssn/ocrservice/v1/ocrservice.pb.go

// Package mock_ocrservice is a generated GoMock package.
package mock_ocrservice

import (
	x "github.com/e-conomic/vmlapis/gen/go/ssn/ocrservice/v1"
	gomock "github.com/golang/mock/gomock"
	context "golang.org/x/net/context"
	grpc "google.golang.org/grpc"
	reflect "reflect"
)

// MockOcrServiceClient is a mock of OcrServiceClient interface
type MockOcrServiceClient struct {
	ctrl     *gomock.Controller
	recorder *MockOcrServiceClientMockRecorder
}

// MockOcrServiceClientMockRecorder is the mock recorder for MockOcrServiceClient
type MockOcrServiceClientMockRecorder struct {
	mock *MockOcrServiceClient
}

// NewMockOcrServiceClient creates a new mock instance
func NewMockOcrServiceClient(ctrl *gomock.Controller) *MockOcrServiceClient {
	mock := &MockOcrServiceClient{ctrl: ctrl}
	mock.recorder = &MockOcrServiceClientMockRecorder{mock}
	return mock
}

// EXPECT returns an object that allows the caller to indicate expected use
func (m *MockOcrServiceClient) EXPECT() *MockOcrServiceClientMockRecorder {
	return m.recorder
}

// OcrScanImage mocks base method
func (m *MockOcrServiceClient) OcrScanImage(ctx context.Context, in *x.OcrScanImageRequest, opts ...grpc.CallOption) (*x.OcrScanImageResponse, error) {
	m.ctrl.T.Helper()
	varargs := []interface{}{ctx, in}
	for _, a := range opts {
		varargs = append(varargs, a)
	}
	ret := m.ctrl.Call(m, "OcrScanImage", varargs...)
	ret0, _ := ret[0].(*x.OcrScanImageResponse)
	ret1, _ := ret[1].(error)
	return ret0, ret1
}

// OcrScanImage indicates an expected call of OcrScanImage
func (mr *MockOcrServiceClientMockRecorder) OcrScanImage(ctx, in interface{}, opts ...interface{}) *gomock.Call {
	mr.mock.ctrl.T.Helper()
	varargs := append([]interface{}{ctx, in}, opts...)
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "OcrScanImage", reflect.TypeOf((*MockOcrServiceClient)(nil).OcrScanImage), varargs...)
}

// GetTextAnnotation mocks base method
func (m *MockOcrServiceClient) GetTextAnnotation(ctx context.Context, in *x.GetTextAnnotationRequest, opts ...grpc.CallOption) (*x.GetTextAnnotationResponse, error) {
	m.ctrl.T.Helper()
	varargs := []interface{}{ctx, in}
	for _, a := range opts {
		varargs = append(varargs, a)
	}
	ret := m.ctrl.Call(m, "GetTextAnnotation", varargs...)
	ret0, _ := ret[0].(*x.GetTextAnnotationResponse)
	ret1, _ := ret[1].(error)
	return ret0, ret1
}

// GetTextAnnotation indicates an expected call of GetTextAnnotation
func (mr *MockOcrServiceClientMockRecorder) GetTextAnnotation(ctx, in interface{}, opts ...interface{}) *gomock.Call {
	mr.mock.ctrl.T.Helper()
	varargs := append([]interface{}{ctx, in}, opts...)
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "GetTextAnnotation", reflect.TypeOf((*MockOcrServiceClient)(nil).GetTextAnnotation), varargs...)
}

// MockOcrServiceServer is a mock of OcrServiceServer interface
type MockOcrServiceServer struct {
	ctrl     *gomock.Controller
	recorder *MockOcrServiceServerMockRecorder
}

// MockOcrServiceServerMockRecorder is the mock recorder for MockOcrServiceServer
type MockOcrServiceServerMockRecorder struct {
	mock *MockOcrServiceServer
}

// NewMockOcrServiceServer creates a new mock instance
func NewMockOcrServiceServer(ctrl *gomock.Controller) *MockOcrServiceServer {
	mock := &MockOcrServiceServer{ctrl: ctrl}
	mock.recorder = &MockOcrServiceServerMockRecorder{mock}
	return mock
}

// EXPECT returns an object that allows the caller to indicate expected use
func (m *MockOcrServiceServer) EXPECT() *MockOcrServiceServerMockRecorder {
	return m.recorder
}

// OcrScanImage mocks base method
func (m *MockOcrServiceServer) OcrScanImage(arg0 context.Context, arg1 *x.OcrScanImageRequest) (*x.OcrScanImageResponse, error) {
	m.ctrl.T.Helper()
	ret := m.ctrl.Call(m, "OcrScanImage", arg0, arg1)
	ret0, _ := ret[0].(*x.OcrScanImageResponse)
	ret1, _ := ret[1].(error)
	return ret0, ret1
}

// OcrScanImage indicates an expected call of OcrScanImage
func (mr *MockOcrServiceServerMockRecorder) OcrScanImage(arg0, arg1 interface{}) *gomock.Call {
	mr.mock.ctrl.T.Helper()
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "OcrScanImage", reflect.TypeOf((*MockOcrServiceServer)(nil).OcrScanImage), arg0, arg1)
}

// GetTextAnnotation mocks base method
func (m *MockOcrServiceServer) GetTextAnnotation(arg0 context.Context, arg1 *x.GetTextAnnotationRequest) (*x.GetTextAnnotationResponse, error) {
	m.ctrl.T.Helper()
	ret := m.ctrl.Call(m, "GetTextAnnotation", arg0, arg1)
	ret0, _ := ret[0].(*x.GetTextAnnotationResponse)
	ret1, _ := ret[1].(error)
	return ret0, ret1
}

// GetTextAnnotation indicates an expected call of GetTextAnnotation
func (mr *MockOcrServiceServerMockRecorder) GetTextAnnotation(arg0, arg1 interface{}) *gomock.Call {
	mr.mock.ctrl.T.Helper()
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "GetTextAnnotation", reflect.TypeOf((*MockOcrServiceServer)(nil).GetTextAnnotation), arg0, arg1)
}
