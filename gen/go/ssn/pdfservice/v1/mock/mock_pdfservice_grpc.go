// Code generated by MockGen. DO NOT EDIT.
// Source: gen/go/ssn/pdfservice/v1/pdfservice_grpc.pb.go

// Package mock_pdfservice is a generated GoMock package.
package mock_pdfservice

import (
	context "context"
	reflect "reflect"

	pdfservice "github.com/e-conomic/vmlapis/gen/go/ssn/pdfservice/v1"
	gomock "github.com/golang/mock/gomock"
	grpc "google.golang.org/grpc"
	metadata "google.golang.org/grpc/metadata"
)

// MockPdfServiceClient is a mock of PdfServiceClient interface.
type MockPdfServiceClient struct {
	ctrl     *gomock.Controller
	recorder *MockPdfServiceClientMockRecorder
}

// MockPdfServiceClientMockRecorder is the mock recorder for MockPdfServiceClient.
type MockPdfServiceClientMockRecorder struct {
	mock *MockPdfServiceClient
}

// NewMockPdfServiceClient creates a new mock instance.
func NewMockPdfServiceClient(ctrl *gomock.Controller) *MockPdfServiceClient {
	mock := &MockPdfServiceClient{ctrl: ctrl}
	mock.recorder = &MockPdfServiceClientMockRecorder{mock}
	return mock
}

// EXPECT returns an object that allows the caller to indicate expected use.
func (m *MockPdfServiceClient) EXPECT() *MockPdfServiceClientMockRecorder {
	return m.recorder
}

// InternalRasterizePdf mocks base method.
func (m *MockPdfServiceClient) InternalRasterizePdf(ctx context.Context, in *pdfservice.RasterizePdfRequest, opts ...grpc.CallOption) (pdfservice.PdfService_InternalRasterizePdfClient, error) {
	m.ctrl.T.Helper()
	varargs := []interface{}{ctx, in}
	for _, a := range opts {
		varargs = append(varargs, a)
	}
	ret := m.ctrl.Call(m, "InternalRasterizePdf", varargs...)
	ret0, _ := ret[0].(pdfservice.PdfService_InternalRasterizePdfClient)
	ret1, _ := ret[1].(error)
	return ret0, ret1
}

// InternalRasterizePdf indicates an expected call of InternalRasterizePdf.
func (mr *MockPdfServiceClientMockRecorder) InternalRasterizePdf(ctx, in interface{}, opts ...interface{}) *gomock.Call {
	mr.mock.ctrl.T.Helper()
	varargs := append([]interface{}{ctx, in}, opts...)
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "InternalRasterizePdf", reflect.TypeOf((*MockPdfServiceClient)(nil).InternalRasterizePdf), varargs...)
}

// RasterizePdf mocks base method.
func (m *MockPdfServiceClient) RasterizePdf(ctx context.Context, in *pdfservice.RasterizePdfRequest, opts ...grpc.CallOption) (pdfservice.PdfService_RasterizePdfClient, error) {
	m.ctrl.T.Helper()
	varargs := []interface{}{ctx, in}
	for _, a := range opts {
		varargs = append(varargs, a)
	}
	ret := m.ctrl.Call(m, "RasterizePdf", varargs...)
	ret0, _ := ret[0].(pdfservice.PdfService_RasterizePdfClient)
	ret1, _ := ret[1].(error)
	return ret0, ret1
}

// RasterizePdf indicates an expected call of RasterizePdf.
func (mr *MockPdfServiceClientMockRecorder) RasterizePdf(ctx, in interface{}, opts ...interface{}) *gomock.Call {
	mr.mock.ctrl.T.Helper()
	varargs := append([]interface{}{ctx, in}, opts...)
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "RasterizePdf", reflect.TypeOf((*MockPdfServiceClient)(nil).RasterizePdf), varargs...)
}

// MockPdfService_InternalRasterizePdfClient is a mock of PdfService_InternalRasterizePdfClient interface.
type MockPdfService_InternalRasterizePdfClient struct {
	ctrl     *gomock.Controller
	recorder *MockPdfService_InternalRasterizePdfClientMockRecorder
}

// MockPdfService_InternalRasterizePdfClientMockRecorder is the mock recorder for MockPdfService_InternalRasterizePdfClient.
type MockPdfService_InternalRasterizePdfClientMockRecorder struct {
	mock *MockPdfService_InternalRasterizePdfClient
}

// NewMockPdfService_InternalRasterizePdfClient creates a new mock instance.
func NewMockPdfService_InternalRasterizePdfClient(ctrl *gomock.Controller) *MockPdfService_InternalRasterizePdfClient {
	mock := &MockPdfService_InternalRasterizePdfClient{ctrl: ctrl}
	mock.recorder = &MockPdfService_InternalRasterizePdfClientMockRecorder{mock}
	return mock
}

// EXPECT returns an object that allows the caller to indicate expected use.
func (m *MockPdfService_InternalRasterizePdfClient) EXPECT() *MockPdfService_InternalRasterizePdfClientMockRecorder {
	return m.recorder
}

// CloseSend mocks base method.
func (m *MockPdfService_InternalRasterizePdfClient) CloseSend() error {
	m.ctrl.T.Helper()
	ret := m.ctrl.Call(m, "CloseSend")
	ret0, _ := ret[0].(error)
	return ret0
}

// CloseSend indicates an expected call of CloseSend.
func (mr *MockPdfService_InternalRasterizePdfClientMockRecorder) CloseSend() *gomock.Call {
	mr.mock.ctrl.T.Helper()
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "CloseSend", reflect.TypeOf((*MockPdfService_InternalRasterizePdfClient)(nil).CloseSend))
}

// Context mocks base method.
func (m *MockPdfService_InternalRasterizePdfClient) Context() context.Context {
	m.ctrl.T.Helper()
	ret := m.ctrl.Call(m, "Context")
	ret0, _ := ret[0].(context.Context)
	return ret0
}

// Context indicates an expected call of Context.
func (mr *MockPdfService_InternalRasterizePdfClientMockRecorder) Context() *gomock.Call {
	mr.mock.ctrl.T.Helper()
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "Context", reflect.TypeOf((*MockPdfService_InternalRasterizePdfClient)(nil).Context))
}

// Header mocks base method.
func (m *MockPdfService_InternalRasterizePdfClient) Header() (metadata.MD, error) {
	m.ctrl.T.Helper()
	ret := m.ctrl.Call(m, "Header")
	ret0, _ := ret[0].(metadata.MD)
	ret1, _ := ret[1].(error)
	return ret0, ret1
}

// Header indicates an expected call of Header.
func (mr *MockPdfService_InternalRasterizePdfClientMockRecorder) Header() *gomock.Call {
	mr.mock.ctrl.T.Helper()
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "Header", reflect.TypeOf((*MockPdfService_InternalRasterizePdfClient)(nil).Header))
}

// Recv mocks base method.
func (m *MockPdfService_InternalRasterizePdfClient) Recv() (*pdfservice.RasterizePdfResponse, error) {
	m.ctrl.T.Helper()
	ret := m.ctrl.Call(m, "Recv")
	ret0, _ := ret[0].(*pdfservice.RasterizePdfResponse)
	ret1, _ := ret[1].(error)
	return ret0, ret1
}

// Recv indicates an expected call of Recv.
func (mr *MockPdfService_InternalRasterizePdfClientMockRecorder) Recv() *gomock.Call {
	mr.mock.ctrl.T.Helper()
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "Recv", reflect.TypeOf((*MockPdfService_InternalRasterizePdfClient)(nil).Recv))
}

// RecvMsg mocks base method.
func (m_2 *MockPdfService_InternalRasterizePdfClient) RecvMsg(m any) error {
	m_2.ctrl.T.Helper()
	ret := m_2.ctrl.Call(m_2, "RecvMsg", m)
	ret0, _ := ret[0].(error)
	return ret0
}

// RecvMsg indicates an expected call of RecvMsg.
func (mr *MockPdfService_InternalRasterizePdfClientMockRecorder) RecvMsg(m interface{}) *gomock.Call {
	mr.mock.ctrl.T.Helper()
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "RecvMsg", reflect.TypeOf((*MockPdfService_InternalRasterizePdfClient)(nil).RecvMsg), m)
}

// SendMsg mocks base method.
func (m_2 *MockPdfService_InternalRasterizePdfClient) SendMsg(m any) error {
	m_2.ctrl.T.Helper()
	ret := m_2.ctrl.Call(m_2, "SendMsg", m)
	ret0, _ := ret[0].(error)
	return ret0
}

// SendMsg indicates an expected call of SendMsg.
func (mr *MockPdfService_InternalRasterizePdfClientMockRecorder) SendMsg(m interface{}) *gomock.Call {
	mr.mock.ctrl.T.Helper()
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "SendMsg", reflect.TypeOf((*MockPdfService_InternalRasterizePdfClient)(nil).SendMsg), m)
}

// Trailer mocks base method.
func (m *MockPdfService_InternalRasterizePdfClient) Trailer() metadata.MD {
	m.ctrl.T.Helper()
	ret := m.ctrl.Call(m, "Trailer")
	ret0, _ := ret[0].(metadata.MD)
	return ret0
}

// Trailer indicates an expected call of Trailer.
func (mr *MockPdfService_InternalRasterizePdfClientMockRecorder) Trailer() *gomock.Call {
	mr.mock.ctrl.T.Helper()
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "Trailer", reflect.TypeOf((*MockPdfService_InternalRasterizePdfClient)(nil).Trailer))
}

// MockPdfService_RasterizePdfClient is a mock of PdfService_RasterizePdfClient interface.
type MockPdfService_RasterizePdfClient struct {
	ctrl     *gomock.Controller
	recorder *MockPdfService_RasterizePdfClientMockRecorder
}

// MockPdfService_RasterizePdfClientMockRecorder is the mock recorder for MockPdfService_RasterizePdfClient.
type MockPdfService_RasterizePdfClientMockRecorder struct {
	mock *MockPdfService_RasterizePdfClient
}

// NewMockPdfService_RasterizePdfClient creates a new mock instance.
func NewMockPdfService_RasterizePdfClient(ctrl *gomock.Controller) *MockPdfService_RasterizePdfClient {
	mock := &MockPdfService_RasterizePdfClient{ctrl: ctrl}
	mock.recorder = &MockPdfService_RasterizePdfClientMockRecorder{mock}
	return mock
}

// EXPECT returns an object that allows the caller to indicate expected use.
func (m *MockPdfService_RasterizePdfClient) EXPECT() *MockPdfService_RasterizePdfClientMockRecorder {
	return m.recorder
}

// CloseSend mocks base method.
func (m *MockPdfService_RasterizePdfClient) CloseSend() error {
	m.ctrl.T.Helper()
	ret := m.ctrl.Call(m, "CloseSend")
	ret0, _ := ret[0].(error)
	return ret0
}

// CloseSend indicates an expected call of CloseSend.
func (mr *MockPdfService_RasterizePdfClientMockRecorder) CloseSend() *gomock.Call {
	mr.mock.ctrl.T.Helper()
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "CloseSend", reflect.TypeOf((*MockPdfService_RasterizePdfClient)(nil).CloseSend))
}

// Context mocks base method.
func (m *MockPdfService_RasterizePdfClient) Context() context.Context {
	m.ctrl.T.Helper()
	ret := m.ctrl.Call(m, "Context")
	ret0, _ := ret[0].(context.Context)
	return ret0
}

// Context indicates an expected call of Context.
func (mr *MockPdfService_RasterizePdfClientMockRecorder) Context() *gomock.Call {
	mr.mock.ctrl.T.Helper()
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "Context", reflect.TypeOf((*MockPdfService_RasterizePdfClient)(nil).Context))
}

// Header mocks base method.
func (m *MockPdfService_RasterizePdfClient) Header() (metadata.MD, error) {
	m.ctrl.T.Helper()
	ret := m.ctrl.Call(m, "Header")
	ret0, _ := ret[0].(metadata.MD)
	ret1, _ := ret[1].(error)
	return ret0, ret1
}

// Header indicates an expected call of Header.
func (mr *MockPdfService_RasterizePdfClientMockRecorder) Header() *gomock.Call {
	mr.mock.ctrl.T.Helper()
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "Header", reflect.TypeOf((*MockPdfService_RasterizePdfClient)(nil).Header))
}

// Recv mocks base method.
func (m *MockPdfService_RasterizePdfClient) Recv() (*pdfservice.RasterizePdfResponse, error) {
	m.ctrl.T.Helper()
	ret := m.ctrl.Call(m, "Recv")
	ret0, _ := ret[0].(*pdfservice.RasterizePdfResponse)
	ret1, _ := ret[1].(error)
	return ret0, ret1
}

// Recv indicates an expected call of Recv.
func (mr *MockPdfService_RasterizePdfClientMockRecorder) Recv() *gomock.Call {
	mr.mock.ctrl.T.Helper()
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "Recv", reflect.TypeOf((*MockPdfService_RasterizePdfClient)(nil).Recv))
}

// RecvMsg mocks base method.
func (m_2 *MockPdfService_RasterizePdfClient) RecvMsg(m any) error {
	m_2.ctrl.T.Helper()
	ret := m_2.ctrl.Call(m_2, "RecvMsg", m)
	ret0, _ := ret[0].(error)
	return ret0
}

// RecvMsg indicates an expected call of RecvMsg.
func (mr *MockPdfService_RasterizePdfClientMockRecorder) RecvMsg(m interface{}) *gomock.Call {
	mr.mock.ctrl.T.Helper()
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "RecvMsg", reflect.TypeOf((*MockPdfService_RasterizePdfClient)(nil).RecvMsg), m)
}

// SendMsg mocks base method.
func (m_2 *MockPdfService_RasterizePdfClient) SendMsg(m any) error {
	m_2.ctrl.T.Helper()
	ret := m_2.ctrl.Call(m_2, "SendMsg", m)
	ret0, _ := ret[0].(error)
	return ret0
}

// SendMsg indicates an expected call of SendMsg.
func (mr *MockPdfService_RasterizePdfClientMockRecorder) SendMsg(m interface{}) *gomock.Call {
	mr.mock.ctrl.T.Helper()
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "SendMsg", reflect.TypeOf((*MockPdfService_RasterizePdfClient)(nil).SendMsg), m)
}

// Trailer mocks base method.
func (m *MockPdfService_RasterizePdfClient) Trailer() metadata.MD {
	m.ctrl.T.Helper()
	ret := m.ctrl.Call(m, "Trailer")
	ret0, _ := ret[0].(metadata.MD)
	return ret0
}

// Trailer indicates an expected call of Trailer.
func (mr *MockPdfService_RasterizePdfClientMockRecorder) Trailer() *gomock.Call {
	mr.mock.ctrl.T.Helper()
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "Trailer", reflect.TypeOf((*MockPdfService_RasterizePdfClient)(nil).Trailer))
}

// MockPdfServiceServer is a mock of PdfServiceServer interface.
type MockPdfServiceServer struct {
	ctrl     *gomock.Controller
	recorder *MockPdfServiceServerMockRecorder
}

// MockPdfServiceServerMockRecorder is the mock recorder for MockPdfServiceServer.
type MockPdfServiceServerMockRecorder struct {
	mock *MockPdfServiceServer
}

// NewMockPdfServiceServer creates a new mock instance.
func NewMockPdfServiceServer(ctrl *gomock.Controller) *MockPdfServiceServer {
	mock := &MockPdfServiceServer{ctrl: ctrl}
	mock.recorder = &MockPdfServiceServerMockRecorder{mock}
	return mock
}

// EXPECT returns an object that allows the caller to indicate expected use.
func (m *MockPdfServiceServer) EXPECT() *MockPdfServiceServerMockRecorder {
	return m.recorder
}

// InternalRasterizePdf mocks base method.
func (m *MockPdfServiceServer) InternalRasterizePdf(arg0 *pdfservice.RasterizePdfRequest, arg1 pdfservice.PdfService_InternalRasterizePdfServer) error {
	m.ctrl.T.Helper()
	ret := m.ctrl.Call(m, "InternalRasterizePdf", arg0, arg1)
	ret0, _ := ret[0].(error)
	return ret0
}

// InternalRasterizePdf indicates an expected call of InternalRasterizePdf.
func (mr *MockPdfServiceServerMockRecorder) InternalRasterizePdf(arg0, arg1 interface{}) *gomock.Call {
	mr.mock.ctrl.T.Helper()
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "InternalRasterizePdf", reflect.TypeOf((*MockPdfServiceServer)(nil).InternalRasterizePdf), arg0, arg1)
}

// RasterizePdf mocks base method.
func (m *MockPdfServiceServer) RasterizePdf(arg0 *pdfservice.RasterizePdfRequest, arg1 pdfservice.PdfService_RasterizePdfServer) error {
	m.ctrl.T.Helper()
	ret := m.ctrl.Call(m, "RasterizePdf", arg0, arg1)
	ret0, _ := ret[0].(error)
	return ret0
}

// RasterizePdf indicates an expected call of RasterizePdf.
func (mr *MockPdfServiceServerMockRecorder) RasterizePdf(arg0, arg1 interface{}) *gomock.Call {
	mr.mock.ctrl.T.Helper()
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "RasterizePdf", reflect.TypeOf((*MockPdfServiceServer)(nil).RasterizePdf), arg0, arg1)
}

// MockUnsafePdfServiceServer is a mock of UnsafePdfServiceServer interface.
type MockUnsafePdfServiceServer struct {
	ctrl     *gomock.Controller
	recorder *MockUnsafePdfServiceServerMockRecorder
}

// MockUnsafePdfServiceServerMockRecorder is the mock recorder for MockUnsafePdfServiceServer.
type MockUnsafePdfServiceServerMockRecorder struct {
	mock *MockUnsafePdfServiceServer
}

// NewMockUnsafePdfServiceServer creates a new mock instance.
func NewMockUnsafePdfServiceServer(ctrl *gomock.Controller) *MockUnsafePdfServiceServer {
	mock := &MockUnsafePdfServiceServer{ctrl: ctrl}
	mock.recorder = &MockUnsafePdfServiceServerMockRecorder{mock}
	return mock
}

// EXPECT returns an object that allows the caller to indicate expected use.
func (m *MockUnsafePdfServiceServer) EXPECT() *MockUnsafePdfServiceServerMockRecorder {
	return m.recorder
}

// mustEmbedUnimplementedPdfServiceServer mocks base method.
func (m *MockUnsafePdfServiceServer) mustEmbedUnimplementedPdfServiceServer() {
	m.ctrl.T.Helper()
	m.ctrl.Call(m, "mustEmbedUnimplementedPdfServiceServer")
}

// mustEmbedUnimplementedPdfServiceServer indicates an expected call of mustEmbedUnimplementedPdfServiceServer.
func (mr *MockUnsafePdfServiceServerMockRecorder) mustEmbedUnimplementedPdfServiceServer() *gomock.Call {
	mr.mock.ctrl.T.Helper()
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "mustEmbedUnimplementedPdfServiceServer", reflect.TypeOf((*MockUnsafePdfServiceServer)(nil).mustEmbedUnimplementedPdfServiceServer))
}

// MockPdfService_InternalRasterizePdfServer is a mock of PdfService_InternalRasterizePdfServer interface.
type MockPdfService_InternalRasterizePdfServer struct {
	ctrl     *gomock.Controller
	recorder *MockPdfService_InternalRasterizePdfServerMockRecorder
}

// MockPdfService_InternalRasterizePdfServerMockRecorder is the mock recorder for MockPdfService_InternalRasterizePdfServer.
type MockPdfService_InternalRasterizePdfServerMockRecorder struct {
	mock *MockPdfService_InternalRasterizePdfServer
}

// NewMockPdfService_InternalRasterizePdfServer creates a new mock instance.
func NewMockPdfService_InternalRasterizePdfServer(ctrl *gomock.Controller) *MockPdfService_InternalRasterizePdfServer {
	mock := &MockPdfService_InternalRasterizePdfServer{ctrl: ctrl}
	mock.recorder = &MockPdfService_InternalRasterizePdfServerMockRecorder{mock}
	return mock
}

// EXPECT returns an object that allows the caller to indicate expected use.
func (m *MockPdfService_InternalRasterizePdfServer) EXPECT() *MockPdfService_InternalRasterizePdfServerMockRecorder {
	return m.recorder
}

// Context mocks base method.
func (m *MockPdfService_InternalRasterizePdfServer) Context() context.Context {
	m.ctrl.T.Helper()
	ret := m.ctrl.Call(m, "Context")
	ret0, _ := ret[0].(context.Context)
	return ret0
}

// Context indicates an expected call of Context.
func (mr *MockPdfService_InternalRasterizePdfServerMockRecorder) Context() *gomock.Call {
	mr.mock.ctrl.T.Helper()
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "Context", reflect.TypeOf((*MockPdfService_InternalRasterizePdfServer)(nil).Context))
}

// RecvMsg mocks base method.
func (m_2 *MockPdfService_InternalRasterizePdfServer) RecvMsg(m any) error {
	m_2.ctrl.T.Helper()
	ret := m_2.ctrl.Call(m_2, "RecvMsg", m)
	ret0, _ := ret[0].(error)
	return ret0
}

// RecvMsg indicates an expected call of RecvMsg.
func (mr *MockPdfService_InternalRasterizePdfServerMockRecorder) RecvMsg(m interface{}) *gomock.Call {
	mr.mock.ctrl.T.Helper()
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "RecvMsg", reflect.TypeOf((*MockPdfService_InternalRasterizePdfServer)(nil).RecvMsg), m)
}

// Send mocks base method.
func (m *MockPdfService_InternalRasterizePdfServer) Send(arg0 *pdfservice.RasterizePdfResponse) error {
	m.ctrl.T.Helper()
	ret := m.ctrl.Call(m, "Send", arg0)
	ret0, _ := ret[0].(error)
	return ret0
}

// Send indicates an expected call of Send.
func (mr *MockPdfService_InternalRasterizePdfServerMockRecorder) Send(arg0 interface{}) *gomock.Call {
	mr.mock.ctrl.T.Helper()
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "Send", reflect.TypeOf((*MockPdfService_InternalRasterizePdfServer)(nil).Send), arg0)
}

// SendHeader mocks base method.
func (m *MockPdfService_InternalRasterizePdfServer) SendHeader(arg0 metadata.MD) error {
	m.ctrl.T.Helper()
	ret := m.ctrl.Call(m, "SendHeader", arg0)
	ret0, _ := ret[0].(error)
	return ret0
}

// SendHeader indicates an expected call of SendHeader.
func (mr *MockPdfService_InternalRasterizePdfServerMockRecorder) SendHeader(arg0 interface{}) *gomock.Call {
	mr.mock.ctrl.T.Helper()
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "SendHeader", reflect.TypeOf((*MockPdfService_InternalRasterizePdfServer)(nil).SendHeader), arg0)
}

// SendMsg mocks base method.
func (m_2 *MockPdfService_InternalRasterizePdfServer) SendMsg(m any) error {
	m_2.ctrl.T.Helper()
	ret := m_2.ctrl.Call(m_2, "SendMsg", m)
	ret0, _ := ret[0].(error)
	return ret0
}

// SendMsg indicates an expected call of SendMsg.
func (mr *MockPdfService_InternalRasterizePdfServerMockRecorder) SendMsg(m interface{}) *gomock.Call {
	mr.mock.ctrl.T.Helper()
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "SendMsg", reflect.TypeOf((*MockPdfService_InternalRasterizePdfServer)(nil).SendMsg), m)
}

// SetHeader mocks base method.
func (m *MockPdfService_InternalRasterizePdfServer) SetHeader(arg0 metadata.MD) error {
	m.ctrl.T.Helper()
	ret := m.ctrl.Call(m, "SetHeader", arg0)
	ret0, _ := ret[0].(error)
	return ret0
}

// SetHeader indicates an expected call of SetHeader.
func (mr *MockPdfService_InternalRasterizePdfServerMockRecorder) SetHeader(arg0 interface{}) *gomock.Call {
	mr.mock.ctrl.T.Helper()
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "SetHeader", reflect.TypeOf((*MockPdfService_InternalRasterizePdfServer)(nil).SetHeader), arg0)
}

// SetTrailer mocks base method.
func (m *MockPdfService_InternalRasterizePdfServer) SetTrailer(arg0 metadata.MD) {
	m.ctrl.T.Helper()
	m.ctrl.Call(m, "SetTrailer", arg0)
}

// SetTrailer indicates an expected call of SetTrailer.
func (mr *MockPdfService_InternalRasterizePdfServerMockRecorder) SetTrailer(arg0 interface{}) *gomock.Call {
	mr.mock.ctrl.T.Helper()
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "SetTrailer", reflect.TypeOf((*MockPdfService_InternalRasterizePdfServer)(nil).SetTrailer), arg0)
}

// MockPdfService_RasterizePdfServer is a mock of PdfService_RasterizePdfServer interface.
type MockPdfService_RasterizePdfServer struct {
	ctrl     *gomock.Controller
	recorder *MockPdfService_RasterizePdfServerMockRecorder
}

// MockPdfService_RasterizePdfServerMockRecorder is the mock recorder for MockPdfService_RasterizePdfServer.
type MockPdfService_RasterizePdfServerMockRecorder struct {
	mock *MockPdfService_RasterizePdfServer
}

// NewMockPdfService_RasterizePdfServer creates a new mock instance.
func NewMockPdfService_RasterizePdfServer(ctrl *gomock.Controller) *MockPdfService_RasterizePdfServer {
	mock := &MockPdfService_RasterizePdfServer{ctrl: ctrl}
	mock.recorder = &MockPdfService_RasterizePdfServerMockRecorder{mock}
	return mock
}

// EXPECT returns an object that allows the caller to indicate expected use.
func (m *MockPdfService_RasterizePdfServer) EXPECT() *MockPdfService_RasterizePdfServerMockRecorder {
	return m.recorder
}

// Context mocks base method.
func (m *MockPdfService_RasterizePdfServer) Context() context.Context {
	m.ctrl.T.Helper()
	ret := m.ctrl.Call(m, "Context")
	ret0, _ := ret[0].(context.Context)
	return ret0
}

// Context indicates an expected call of Context.
func (mr *MockPdfService_RasterizePdfServerMockRecorder) Context() *gomock.Call {
	mr.mock.ctrl.T.Helper()
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "Context", reflect.TypeOf((*MockPdfService_RasterizePdfServer)(nil).Context))
}

// RecvMsg mocks base method.
func (m_2 *MockPdfService_RasterizePdfServer) RecvMsg(m any) error {
	m_2.ctrl.T.Helper()
	ret := m_2.ctrl.Call(m_2, "RecvMsg", m)
	ret0, _ := ret[0].(error)
	return ret0
}

// RecvMsg indicates an expected call of RecvMsg.
func (mr *MockPdfService_RasterizePdfServerMockRecorder) RecvMsg(m interface{}) *gomock.Call {
	mr.mock.ctrl.T.Helper()
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "RecvMsg", reflect.TypeOf((*MockPdfService_RasterizePdfServer)(nil).RecvMsg), m)
}

// Send mocks base method.
func (m *MockPdfService_RasterizePdfServer) Send(arg0 *pdfservice.RasterizePdfResponse) error {
	m.ctrl.T.Helper()
	ret := m.ctrl.Call(m, "Send", arg0)
	ret0, _ := ret[0].(error)
	return ret0
}

// Send indicates an expected call of Send.
func (mr *MockPdfService_RasterizePdfServerMockRecorder) Send(arg0 interface{}) *gomock.Call {
	mr.mock.ctrl.T.Helper()
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "Send", reflect.TypeOf((*MockPdfService_RasterizePdfServer)(nil).Send), arg0)
}

// SendHeader mocks base method.
func (m *MockPdfService_RasterizePdfServer) SendHeader(arg0 metadata.MD) error {
	m.ctrl.T.Helper()
	ret := m.ctrl.Call(m, "SendHeader", arg0)
	ret0, _ := ret[0].(error)
	return ret0
}

// SendHeader indicates an expected call of SendHeader.
func (mr *MockPdfService_RasterizePdfServerMockRecorder) SendHeader(arg0 interface{}) *gomock.Call {
	mr.mock.ctrl.T.Helper()
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "SendHeader", reflect.TypeOf((*MockPdfService_RasterizePdfServer)(nil).SendHeader), arg0)
}

// SendMsg mocks base method.
func (m_2 *MockPdfService_RasterizePdfServer) SendMsg(m any) error {
	m_2.ctrl.T.Helper()
	ret := m_2.ctrl.Call(m_2, "SendMsg", m)
	ret0, _ := ret[0].(error)
	return ret0
}

// SendMsg indicates an expected call of SendMsg.
func (mr *MockPdfService_RasterizePdfServerMockRecorder) SendMsg(m interface{}) *gomock.Call {
	mr.mock.ctrl.T.Helper()
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "SendMsg", reflect.TypeOf((*MockPdfService_RasterizePdfServer)(nil).SendMsg), m)
}

// SetHeader mocks base method.
func (m *MockPdfService_RasterizePdfServer) SetHeader(arg0 metadata.MD) error {
	m.ctrl.T.Helper()
	ret := m.ctrl.Call(m, "SetHeader", arg0)
	ret0, _ := ret[0].(error)
	return ret0
}

// SetHeader indicates an expected call of SetHeader.
func (mr *MockPdfService_RasterizePdfServerMockRecorder) SetHeader(arg0 interface{}) *gomock.Call {
	mr.mock.ctrl.T.Helper()
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "SetHeader", reflect.TypeOf((*MockPdfService_RasterizePdfServer)(nil).SetHeader), arg0)
}

// SetTrailer mocks base method.
func (m *MockPdfService_RasterizePdfServer) SetTrailer(arg0 metadata.MD) {
	m.ctrl.T.Helper()
	m.ctrl.Call(m, "SetTrailer", arg0)
}

// SetTrailer indicates an expected call of SetTrailer.
func (mr *MockPdfService_RasterizePdfServerMockRecorder) SetTrailer(arg0 interface{}) *gomock.Call {
	mr.mock.ctrl.T.Helper()
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "SetTrailer", reflect.TypeOf((*MockPdfService_RasterizePdfServer)(nil).SetTrailer), arg0)
}
