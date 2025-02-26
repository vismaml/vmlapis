// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.36.5
// 	protoc        (unknown)
// source: ssn/ocrservice/v1/ocrservice.proto

package ocrservice

import (
	v1 "github.com/e-conomic/vmlapis/gen/go/ssn/annotator/v1"
	_type "github.com/e-conomic/vmlapis/gen/go/ssn/type"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	wrapperspb "google.golang.org/protobuf/types/known/wrapperspb"
	reflect "reflect"
	sync "sync"
	unsafe "unsafe"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

type GetTextAnnotationRequest struct {
	state         protoimpl.MessageState `protogen:"open.v1"`
	Document      *v1.Document           `protobuf:"bytes,2,opt,name=document,proto3" json:"document,omitempty"`
	Preview       bool                   `protobuf:"varint,3,opt,name=preview,proto3" json:"preview,omitempty"`
	PreviewLast   bool                   `protobuf:"varint,4,opt,name=preview_last,json=previewLast,proto3" json:"preview_last,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *GetTextAnnotationRequest) Reset() {
	*x = GetTextAnnotationRequest{}
	mi := &file_ssn_ocrservice_v1_ocrservice_proto_msgTypes[0]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *GetTextAnnotationRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GetTextAnnotationRequest) ProtoMessage() {}

func (x *GetTextAnnotationRequest) ProtoReflect() protoreflect.Message {
	mi := &file_ssn_ocrservice_v1_ocrservice_proto_msgTypes[0]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GetTextAnnotationRequest.ProtoReflect.Descriptor instead.
func (*GetTextAnnotationRequest) Descriptor() ([]byte, []int) {
	return file_ssn_ocrservice_v1_ocrservice_proto_rawDescGZIP(), []int{0}
}

func (x *GetTextAnnotationRequest) GetDocument() *v1.Document {
	if x != nil {
		return x.Document
	}
	return nil
}

func (x *GetTextAnnotationRequest) GetPreview() bool {
	if x != nil {
		return x.Preview
	}
	return false
}

func (x *GetTextAnnotationRequest) GetPreviewLast() bool {
	if x != nil {
		return x.PreviewLast
	}
	return false
}

type GetTextAnnotationResponse struct {
	state          protoimpl.MessageState `protogen:"open.v1"`
	TextAnnotation *_type.TextAnnotation  `protobuf:"bytes,2,opt,name=text_annotation,json=textAnnotation,proto3" json:"text_annotation,omitempty"`
	Image          *wrapperspb.BytesValue `protobuf:"bytes,3,opt,name=image,proto3" json:"image,omitempty"`
	LastImage      *wrapperspb.BytesValue `protobuf:"bytes,4,opt,name=last_image,json=lastImage,proto3" json:"last_image,omitempty"`
	unknownFields  protoimpl.UnknownFields
	sizeCache      protoimpl.SizeCache
}

func (x *GetTextAnnotationResponse) Reset() {
	*x = GetTextAnnotationResponse{}
	mi := &file_ssn_ocrservice_v1_ocrservice_proto_msgTypes[1]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *GetTextAnnotationResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GetTextAnnotationResponse) ProtoMessage() {}

func (x *GetTextAnnotationResponse) ProtoReflect() protoreflect.Message {
	mi := &file_ssn_ocrservice_v1_ocrservice_proto_msgTypes[1]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GetTextAnnotationResponse.ProtoReflect.Descriptor instead.
func (*GetTextAnnotationResponse) Descriptor() ([]byte, []int) {
	return file_ssn_ocrservice_v1_ocrservice_proto_rawDescGZIP(), []int{1}
}

func (x *GetTextAnnotationResponse) GetTextAnnotation() *_type.TextAnnotation {
	if x != nil {
		return x.TextAnnotation
	}
	return nil
}

func (x *GetTextAnnotationResponse) GetImage() *wrapperspb.BytesValue {
	if x != nil {
		return x.Image
	}
	return nil
}

func (x *GetTextAnnotationResponse) GetLastImage() *wrapperspb.BytesValue {
	if x != nil {
		return x.LastImage
	}
	return nil
}

type AsyncCreateOperationRequest struct {
	state         protoimpl.MessageState `protogen:"open.v1"`
	InputPaths    []string               `protobuf:"bytes,1,rep,name=input_paths,json=inputPaths,proto3" json:"input_paths,omitempty"`
	OutputPath    string                 `protobuf:"bytes,2,opt,name=output_path,json=outputPath,proto3" json:"output_path,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *AsyncCreateOperationRequest) Reset() {
	*x = AsyncCreateOperationRequest{}
	mi := &file_ssn_ocrservice_v1_ocrservice_proto_msgTypes[2]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *AsyncCreateOperationRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*AsyncCreateOperationRequest) ProtoMessage() {}

func (x *AsyncCreateOperationRequest) ProtoReflect() protoreflect.Message {
	mi := &file_ssn_ocrservice_v1_ocrservice_proto_msgTypes[2]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use AsyncCreateOperationRequest.ProtoReflect.Descriptor instead.
func (*AsyncCreateOperationRequest) Descriptor() ([]byte, []int) {
	return file_ssn_ocrservice_v1_ocrservice_proto_rawDescGZIP(), []int{2}
}

func (x *AsyncCreateOperationRequest) GetInputPaths() []string {
	if x != nil {
		return x.InputPaths
	}
	return nil
}

func (x *AsyncCreateOperationRequest) GetOutputPath() string {
	if x != nil {
		return x.OutputPath
	}
	return ""
}

type AsyncCreateOperationResponse struct {
	state         protoimpl.MessageState `protogen:"open.v1"`
	OperationName string                 `protobuf:"bytes,1,opt,name=operation_name,json=operationName,proto3" json:"operation_name,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *AsyncCreateOperationResponse) Reset() {
	*x = AsyncCreateOperationResponse{}
	mi := &file_ssn_ocrservice_v1_ocrservice_proto_msgTypes[3]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *AsyncCreateOperationResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*AsyncCreateOperationResponse) ProtoMessage() {}

func (x *AsyncCreateOperationResponse) ProtoReflect() protoreflect.Message {
	mi := &file_ssn_ocrservice_v1_ocrservice_proto_msgTypes[3]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use AsyncCreateOperationResponse.ProtoReflect.Descriptor instead.
func (*AsyncCreateOperationResponse) Descriptor() ([]byte, []int) {
	return file_ssn_ocrservice_v1_ocrservice_proto_rawDescGZIP(), []int{3}
}

func (x *AsyncCreateOperationResponse) GetOperationName() string {
	if x != nil {
		return x.OperationName
	}
	return ""
}

type AsyncGetOperationStatusRequest struct {
	state         protoimpl.MessageState `protogen:"open.v1"`
	OperationName string                 `protobuf:"bytes,1,opt,name=operation_name,json=operationName,proto3" json:"operation_name,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *AsyncGetOperationStatusRequest) Reset() {
	*x = AsyncGetOperationStatusRequest{}
	mi := &file_ssn_ocrservice_v1_ocrservice_proto_msgTypes[4]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *AsyncGetOperationStatusRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*AsyncGetOperationStatusRequest) ProtoMessage() {}

func (x *AsyncGetOperationStatusRequest) ProtoReflect() protoreflect.Message {
	mi := &file_ssn_ocrservice_v1_ocrservice_proto_msgTypes[4]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use AsyncGetOperationStatusRequest.ProtoReflect.Descriptor instead.
func (*AsyncGetOperationStatusRequest) Descriptor() ([]byte, []int) {
	return file_ssn_ocrservice_v1_ocrservice_proto_rawDescGZIP(), []int{4}
}

func (x *AsyncGetOperationStatusRequest) GetOperationName() string {
	if x != nil {
		return x.OperationName
	}
	return ""
}

type AsyncGetOperationStatusResponse struct {
	state         protoimpl.MessageState `protogen:"open.v1"`
	OperationName string                 `protobuf:"bytes,1,opt,name=operation_name,json=operationName,proto3" json:"operation_name,omitempty"`
	Done          bool                   `protobuf:"varint,2,opt,name=done,proto3" json:"done,omitempty"`
	StatusCode    int32                  `protobuf:"varint,3,opt,name=status_code,json=statusCode,proto3" json:"status_code,omitempty"`
	ErrorMessage  string                 `protobuf:"bytes,4,opt,name=error_message,json=errorMessage,proto3" json:"error_message,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *AsyncGetOperationStatusResponse) Reset() {
	*x = AsyncGetOperationStatusResponse{}
	mi := &file_ssn_ocrservice_v1_ocrservice_proto_msgTypes[5]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *AsyncGetOperationStatusResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*AsyncGetOperationStatusResponse) ProtoMessage() {}

func (x *AsyncGetOperationStatusResponse) ProtoReflect() protoreflect.Message {
	mi := &file_ssn_ocrservice_v1_ocrservice_proto_msgTypes[5]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use AsyncGetOperationStatusResponse.ProtoReflect.Descriptor instead.
func (*AsyncGetOperationStatusResponse) Descriptor() ([]byte, []int) {
	return file_ssn_ocrservice_v1_ocrservice_proto_rawDescGZIP(), []int{5}
}

func (x *AsyncGetOperationStatusResponse) GetOperationName() string {
	if x != nil {
		return x.OperationName
	}
	return ""
}

func (x *AsyncGetOperationStatusResponse) GetDone() bool {
	if x != nil {
		return x.Done
	}
	return false
}

func (x *AsyncGetOperationStatusResponse) GetStatusCode() int32 {
	if x != nil {
		return x.StatusCode
	}
	return 0
}

func (x *AsyncGetOperationStatusResponse) GetErrorMessage() string {
	if x != nil {
		return x.ErrorMessage
	}
	return ""
}

type OcrScanImageRequest struct {
	state         protoimpl.MessageState `protogen:"open.v1"`
	Data          []byte                 `protobuf:"bytes,1,opt,name=data,proto3" json:"data,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *OcrScanImageRequest) Reset() {
	*x = OcrScanImageRequest{}
	mi := &file_ssn_ocrservice_v1_ocrservice_proto_msgTypes[6]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *OcrScanImageRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*OcrScanImageRequest) ProtoMessage() {}

func (x *OcrScanImageRequest) ProtoReflect() protoreflect.Message {
	mi := &file_ssn_ocrservice_v1_ocrservice_proto_msgTypes[6]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use OcrScanImageRequest.ProtoReflect.Descriptor instead.
func (*OcrScanImageRequest) Descriptor() ([]byte, []int) {
	return file_ssn_ocrservice_v1_ocrservice_proto_rawDescGZIP(), []int{6}
}

func (x *OcrScanImageRequest) GetData() []byte {
	if x != nil {
		return x.Data
	}
	return nil
}

type OcrScanImageResponse struct {
	state         protoimpl.MessageState `protogen:"open.v1"`
	TessHocr      string                 `protobuf:"bytes,1,opt,name=tess_hocr,json=tessHocr,proto3" json:"tess_hocr,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *OcrScanImageResponse) Reset() {
	*x = OcrScanImageResponse{}
	mi := &file_ssn_ocrservice_v1_ocrservice_proto_msgTypes[7]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *OcrScanImageResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*OcrScanImageResponse) ProtoMessage() {}

func (x *OcrScanImageResponse) ProtoReflect() protoreflect.Message {
	mi := &file_ssn_ocrservice_v1_ocrservice_proto_msgTypes[7]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use OcrScanImageResponse.ProtoReflect.Descriptor instead.
func (*OcrScanImageResponse) Descriptor() ([]byte, []int) {
	return file_ssn_ocrservice_v1_ocrservice_proto_rawDescGZIP(), []int{7}
}

func (x *OcrScanImageResponse) GetTessHocr() string {
	if x != nil {
		return x.TessHocr
	}
	return ""
}

var File_ssn_ocrservice_v1_ocrservice_proto protoreflect.FileDescriptor

var file_ssn_ocrservice_v1_ocrservice_proto_rawDesc = string([]byte{
	0x0a, 0x22, 0x73, 0x73, 0x6e, 0x2f, 0x6f, 0x63, 0x72, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65,
	0x2f, 0x76, 0x31, 0x2f, 0x6f, 0x63, 0x72, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x12, 0x11, 0x73, 0x73, 0x6e, 0x2e, 0x6f, 0x63, 0x72, 0x73, 0x65, 0x72,
	0x76, 0x69, 0x63, 0x65, 0x2e, 0x76, 0x31, 0x1a, 0x1e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x77, 0x72, 0x61, 0x70, 0x70, 0x65, 0x72,
	0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x20, 0x73, 0x73, 0x6e, 0x2f, 0x61, 0x6e, 0x6e,
	0x6f, 0x74, 0x61, 0x74, 0x6f, 0x72, 0x2f, 0x76, 0x31, 0x2f, 0x61, 0x6e, 0x6e, 0x6f, 0x74, 0x61,
	0x74, 0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1e, 0x73, 0x73, 0x6e, 0x2f, 0x74,
	0x79, 0x70, 0x65, 0x2f, 0x74, 0x65, 0x78, 0x74, 0x5f, 0x61, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74,
	0x69, 0x6f, 0x6e, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x8f, 0x01, 0x0a, 0x18, 0x47, 0x65,
	0x74, 0x54, 0x65, 0x78, 0x74, 0x41, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52,
	0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x36, 0x0a, 0x08, 0x64, 0x6f, 0x63, 0x75, 0x6d, 0x65,
	0x6e, 0x74, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1a, 0x2e, 0x73, 0x73, 0x6e, 0x2e, 0x61,
	0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x6f, 0x72, 0x2e, 0x76, 0x31, 0x2e, 0x44, 0x6f, 0x63, 0x75,
	0x6d, 0x65, 0x6e, 0x74, 0x52, 0x08, 0x64, 0x6f, 0x63, 0x75, 0x6d, 0x65, 0x6e, 0x74, 0x12, 0x18,
	0x0a, 0x07, 0x70, 0x72, 0x65, 0x76, 0x69, 0x65, 0x77, 0x18, 0x03, 0x20, 0x01, 0x28, 0x08, 0x52,
	0x07, 0x70, 0x72, 0x65, 0x76, 0x69, 0x65, 0x77, 0x12, 0x21, 0x0a, 0x0c, 0x70, 0x72, 0x65, 0x76,
	0x69, 0x65, 0x77, 0x5f, 0x6c, 0x61, 0x73, 0x74, 0x18, 0x04, 0x20, 0x01, 0x28, 0x08, 0x52, 0x0b,
	0x70, 0x72, 0x65, 0x76, 0x69, 0x65, 0x77, 0x4c, 0x61, 0x73, 0x74, 0x22, 0xcd, 0x01, 0x0a, 0x19,
	0x47, 0x65, 0x74, 0x54, 0x65, 0x78, 0x74, 0x41, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f,
	0x6e, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x41, 0x0a, 0x0f, 0x74, 0x65, 0x78,
	0x74, 0x5f, 0x61, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x02, 0x20, 0x01,
	0x28, 0x0b, 0x32, 0x18, 0x2e, 0x73, 0x73, 0x6e, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x54, 0x65,
	0x78, 0x74, 0x41, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x0e, 0x74, 0x65,
	0x78, 0x74, 0x41, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x31, 0x0a, 0x05,
	0x69, 0x6d, 0x61, 0x67, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1b, 0x2e, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x42, 0x79,
	0x74, 0x65, 0x73, 0x56, 0x61, 0x6c, 0x75, 0x65, 0x52, 0x05, 0x69, 0x6d, 0x61, 0x67, 0x65, 0x12,
	0x3a, 0x0a, 0x0a, 0x6c, 0x61, 0x73, 0x74, 0x5f, 0x69, 0x6d, 0x61, 0x67, 0x65, 0x18, 0x04, 0x20,
	0x01, 0x28, 0x0b, 0x32, 0x1b, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x42, 0x79, 0x74, 0x65, 0x73, 0x56, 0x61, 0x6c, 0x75, 0x65,
	0x52, 0x09, 0x6c, 0x61, 0x73, 0x74, 0x49, 0x6d, 0x61, 0x67, 0x65, 0x22, 0x5f, 0x0a, 0x1b, 0x41,
	0x73, 0x79, 0x6e, 0x63, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x4f, 0x70, 0x65, 0x72, 0x61, 0x74,
	0x69, 0x6f, 0x6e, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x1f, 0x0a, 0x0b, 0x69, 0x6e,
	0x70, 0x75, 0x74, 0x5f, 0x70, 0x61, 0x74, 0x68, 0x73, 0x18, 0x01, 0x20, 0x03, 0x28, 0x09, 0x52,
	0x0a, 0x69, 0x6e, 0x70, 0x75, 0x74, 0x50, 0x61, 0x74, 0x68, 0x73, 0x12, 0x1f, 0x0a, 0x0b, 0x6f,
	0x75, 0x74, 0x70, 0x75, 0x74, 0x5f, 0x70, 0x61, 0x74, 0x68, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09,
	0x52, 0x0a, 0x6f, 0x75, 0x74, 0x70, 0x75, 0x74, 0x50, 0x61, 0x74, 0x68, 0x22, 0x45, 0x0a, 0x1c,
	0x41, 0x73, 0x79, 0x6e, 0x63, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x4f, 0x70, 0x65, 0x72, 0x61,
	0x74, 0x69, 0x6f, 0x6e, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x25, 0x0a, 0x0e,
	0x6f, 0x70, 0x65, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x0d, 0x6f, 0x70, 0x65, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x4e,
	0x61, 0x6d, 0x65, 0x22, 0x47, 0x0a, 0x1e, 0x41, 0x73, 0x79, 0x6e, 0x63, 0x47, 0x65, 0x74, 0x4f,
	0x70, 0x65, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x52, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x25, 0x0a, 0x0e, 0x6f, 0x70, 0x65, 0x72, 0x61, 0x74, 0x69,
	0x6f, 0x6e, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0d, 0x6f,
	0x70, 0x65, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x4e, 0x61, 0x6d, 0x65, 0x22, 0xa2, 0x01, 0x0a,
	0x1f, 0x41, 0x73, 0x79, 0x6e, 0x63, 0x47, 0x65, 0x74, 0x4f, 0x70, 0x65, 0x72, 0x61, 0x74, 0x69,
	0x6f, 0x6e, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65,
	0x12, 0x25, 0x0a, 0x0e, 0x6f, 0x70, 0x65, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x6e, 0x61,
	0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0d, 0x6f, 0x70, 0x65, 0x72, 0x61, 0x74,
	0x69, 0x6f, 0x6e, 0x4e, 0x61, 0x6d, 0x65, 0x12, 0x12, 0x0a, 0x04, 0x64, 0x6f, 0x6e, 0x65, 0x18,
	0x02, 0x20, 0x01, 0x28, 0x08, 0x52, 0x04, 0x64, 0x6f, 0x6e, 0x65, 0x12, 0x1f, 0x0a, 0x0b, 0x73,
	0x74, 0x61, 0x74, 0x75, 0x73, 0x5f, 0x63, 0x6f, 0x64, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x05,
	0x52, 0x0a, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x43, 0x6f, 0x64, 0x65, 0x12, 0x23, 0x0a, 0x0d,
	0x65, 0x72, 0x72, 0x6f, 0x72, 0x5f, 0x6d, 0x65, 0x73, 0x73, 0x61, 0x67, 0x65, 0x18, 0x04, 0x20,
	0x01, 0x28, 0x09, 0x52, 0x0c, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x4d, 0x65, 0x73, 0x73, 0x61, 0x67,
	0x65, 0x22, 0x29, 0x0a, 0x13, 0x4f, 0x63, 0x72, 0x53, 0x63, 0x61, 0x6e, 0x49, 0x6d, 0x61, 0x67,
	0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x12, 0x0a, 0x04, 0x64, 0x61, 0x74, 0x61,
	0x18, 0x01, 0x20, 0x01, 0x28, 0x0c, 0x52, 0x04, 0x64, 0x61, 0x74, 0x61, 0x22, 0x33, 0x0a, 0x14,
	0x4f, 0x63, 0x72, 0x53, 0x63, 0x61, 0x6e, 0x49, 0x6d, 0x61, 0x67, 0x65, 0x52, 0x65, 0x73, 0x70,
	0x6f, 0x6e, 0x73, 0x65, 0x12, 0x1b, 0x0a, 0x09, 0x74, 0x65, 0x73, 0x73, 0x5f, 0x68, 0x6f, 0x63,
	0x72, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x08, 0x74, 0x65, 0x73, 0x73, 0x48, 0x6f, 0x63,
	0x72, 0x32, 0xce, 0x04, 0x0a, 0x0a, 0x4f, 0x63, 0x72, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65,
	0x12, 0x5f, 0x0a, 0x0c, 0x4f, 0x63, 0x72, 0x53, 0x63, 0x61, 0x6e, 0x49, 0x6d, 0x61, 0x67, 0x65,
	0x12, 0x26, 0x2e, 0x73, 0x73, 0x6e, 0x2e, 0x6f, 0x63, 0x72, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63,
	0x65, 0x2e, 0x76, 0x31, 0x2e, 0x4f, 0x63, 0x72, 0x53, 0x63, 0x61, 0x6e, 0x49, 0x6d, 0x61, 0x67,
	0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x27, 0x2e, 0x73, 0x73, 0x6e, 0x2e, 0x6f,
	0x63, 0x72, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x4f, 0x63, 0x72,
	0x53, 0x63, 0x61, 0x6e, 0x49, 0x6d, 0x61, 0x67, 0x65, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73,
	0x65, 0x12, 0x6e, 0x0a, 0x11, 0x47, 0x65, 0x74, 0x54, 0x65, 0x78, 0x74, 0x41, 0x6e, 0x6e, 0x6f,
	0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x2b, 0x2e, 0x73, 0x73, 0x6e, 0x2e, 0x6f, 0x63, 0x72,
	0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x47, 0x65, 0x74, 0x54, 0x65,
	0x78, 0x74, 0x41, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x65, 0x71, 0x75,
	0x65, 0x73, 0x74, 0x1a, 0x2c, 0x2e, 0x73, 0x73, 0x6e, 0x2e, 0x6f, 0x63, 0x72, 0x73, 0x65, 0x72,
	0x76, 0x69, 0x63, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x47, 0x65, 0x74, 0x54, 0x65, 0x78, 0x74, 0x41,
	0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73,
	0x65, 0x12, 0x71, 0x0a, 0x12, 0x47, 0x65, 0x74, 0x54, 0x65, 0x78, 0x74, 0x41, 0x6e, 0x6e, 0x6f,
	0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x12, 0x2b, 0x2e, 0x73, 0x73, 0x6e, 0x2e, 0x6f, 0x63,
	0x72, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x47, 0x65, 0x74, 0x54,
	0x65, 0x78, 0x74, 0x41, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x1a, 0x2c, 0x2e, 0x73, 0x73, 0x6e, 0x2e, 0x6f, 0x63, 0x72, 0x73, 0x65,
	0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x47, 0x65, 0x74, 0x54, 0x65, 0x78, 0x74,
	0x41, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e,
	0x73, 0x65, 0x30, 0x01, 0x12, 0x77, 0x0a, 0x14, 0x41, 0x73, 0x79, 0x6e, 0x63, 0x43, 0x72, 0x65,
	0x61, 0x74, 0x65, 0x4f, 0x70, 0x65, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x2e, 0x2e, 0x73,
	0x73, 0x6e, 0x2e, 0x6f, 0x63, 0x72, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x76, 0x31,
	0x2e, 0x41, 0x73, 0x79, 0x6e, 0x63, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x4f, 0x70, 0x65, 0x72,
	0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x2f, 0x2e, 0x73,
	0x73, 0x6e, 0x2e, 0x6f, 0x63, 0x72, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x76, 0x31,
	0x2e, 0x41, 0x73, 0x79, 0x6e, 0x63, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x4f, 0x70, 0x65, 0x72,
	0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x82, 0x01,
	0x0a, 0x17, 0x41, 0x73, 0x79, 0x6e, 0x63, 0x47, 0x65, 0x74, 0x4f, 0x70, 0x65, 0x72, 0x61, 0x74,
	0x69, 0x6f, 0x6e, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x12, 0x31, 0x2e, 0x73, 0x73, 0x6e, 0x2e,
	0x6f, 0x63, 0x72, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x41, 0x73,
	0x79, 0x6e, 0x63, 0x47, 0x65, 0x74, 0x4f, 0x70, 0x65, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x53,
	0x74, 0x61, 0x74, 0x75, 0x73, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x32, 0x2e, 0x73,
	0x73, 0x6e, 0x2e, 0x6f, 0x63, 0x72, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x76, 0x31,
	0x2e, 0x41, 0x73, 0x79, 0x6e, 0x63, 0x47, 0x65, 0x74, 0x4f, 0x70, 0x65, 0x72, 0x61, 0x74, 0x69,
	0x6f, 0x6e, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65,
	0x30, 0x01, 0x42, 0xd5, 0x01, 0x0a, 0x1a, 0x61, 0x69, 0x2e, 0x76, 0x69, 0x73, 0x6d, 0x61, 0x2e,
	0x73, 0x73, 0x6e, 0x2e, 0x6f, 0x63, 0x72, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x76,
	0x31, 0x42, 0x0f, 0x4f, 0x63, 0x72, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x50, 0x72, 0x6f,
	0x74, 0x6f, 0x50, 0x01, 0x5a, 0x40, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d,
	0x2f, 0x65, 0x2d, 0x63, 0x6f, 0x6e, 0x6f, 0x6d, 0x69, 0x63, 0x2f, 0x76, 0x6d, 0x6c, 0x61, 0x70,
	0x69, 0x73, 0x2f, 0x67, 0x65, 0x6e, 0x2f, 0x67, 0x6f, 0x2f, 0x73, 0x73, 0x6e, 0x2f, 0x6f, 0x63,
	0x72, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2f, 0x76, 0x31, 0x3b, 0x6f, 0x63, 0x72, 0x73,
	0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0xa2, 0x02, 0x03, 0x53, 0x4f, 0x58, 0xaa, 0x02, 0x11, 0x53,
	0x73, 0x6e, 0x2e, 0x4f, 0x63, 0x72, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x56, 0x31,
	0xca, 0x02, 0x11, 0x53, 0x73, 0x6e, 0x5c, 0x4f, 0x63, 0x72, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63,
	0x65, 0x5c, 0x56, 0x31, 0xe2, 0x02, 0x1d, 0x53, 0x73, 0x6e, 0x5c, 0x4f, 0x63, 0x72, 0x73, 0x65,
	0x72, 0x76, 0x69, 0x63, 0x65, 0x5c, 0x56, 0x31, 0x5c, 0x47, 0x50, 0x42, 0x4d, 0x65, 0x74, 0x61,
	0x64, 0x61, 0x74, 0x61, 0xea, 0x02, 0x13, 0x53, 0x73, 0x6e, 0x3a, 0x3a, 0x4f, 0x63, 0x72, 0x73,
	0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x3a, 0x3a, 0x56, 0x31, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x33,
})

var (
	file_ssn_ocrservice_v1_ocrservice_proto_rawDescOnce sync.Once
	file_ssn_ocrservice_v1_ocrservice_proto_rawDescData []byte
)

func file_ssn_ocrservice_v1_ocrservice_proto_rawDescGZIP() []byte {
	file_ssn_ocrservice_v1_ocrservice_proto_rawDescOnce.Do(func() {
		file_ssn_ocrservice_v1_ocrservice_proto_rawDescData = protoimpl.X.CompressGZIP(unsafe.Slice(unsafe.StringData(file_ssn_ocrservice_v1_ocrservice_proto_rawDesc), len(file_ssn_ocrservice_v1_ocrservice_proto_rawDesc)))
	})
	return file_ssn_ocrservice_v1_ocrservice_proto_rawDescData
}

var file_ssn_ocrservice_v1_ocrservice_proto_msgTypes = make([]protoimpl.MessageInfo, 8)
var file_ssn_ocrservice_v1_ocrservice_proto_goTypes = []any{
	(*GetTextAnnotationRequest)(nil),        // 0: ssn.ocrservice.v1.GetTextAnnotationRequest
	(*GetTextAnnotationResponse)(nil),       // 1: ssn.ocrservice.v1.GetTextAnnotationResponse
	(*AsyncCreateOperationRequest)(nil),     // 2: ssn.ocrservice.v1.AsyncCreateOperationRequest
	(*AsyncCreateOperationResponse)(nil),    // 3: ssn.ocrservice.v1.AsyncCreateOperationResponse
	(*AsyncGetOperationStatusRequest)(nil),  // 4: ssn.ocrservice.v1.AsyncGetOperationStatusRequest
	(*AsyncGetOperationStatusResponse)(nil), // 5: ssn.ocrservice.v1.AsyncGetOperationStatusResponse
	(*OcrScanImageRequest)(nil),             // 6: ssn.ocrservice.v1.OcrScanImageRequest
	(*OcrScanImageResponse)(nil),            // 7: ssn.ocrservice.v1.OcrScanImageResponse
	(*v1.Document)(nil),                     // 8: ssn.annotator.v1.Document
	(*_type.TextAnnotation)(nil),            // 9: ssn.type.TextAnnotation
	(*wrapperspb.BytesValue)(nil),           // 10: google.protobuf.BytesValue
}
var file_ssn_ocrservice_v1_ocrservice_proto_depIdxs = []int32{
	8,  // 0: ssn.ocrservice.v1.GetTextAnnotationRequest.document:type_name -> ssn.annotator.v1.Document
	9,  // 1: ssn.ocrservice.v1.GetTextAnnotationResponse.text_annotation:type_name -> ssn.type.TextAnnotation
	10, // 2: ssn.ocrservice.v1.GetTextAnnotationResponse.image:type_name -> google.protobuf.BytesValue
	10, // 3: ssn.ocrservice.v1.GetTextAnnotationResponse.last_image:type_name -> google.protobuf.BytesValue
	6,  // 4: ssn.ocrservice.v1.OcrService.OcrScanImage:input_type -> ssn.ocrservice.v1.OcrScanImageRequest
	0,  // 5: ssn.ocrservice.v1.OcrService.GetTextAnnotation:input_type -> ssn.ocrservice.v1.GetTextAnnotationRequest
	0,  // 6: ssn.ocrservice.v1.OcrService.GetTextAnnotations:input_type -> ssn.ocrservice.v1.GetTextAnnotationRequest
	2,  // 7: ssn.ocrservice.v1.OcrService.AsyncCreateOperation:input_type -> ssn.ocrservice.v1.AsyncCreateOperationRequest
	4,  // 8: ssn.ocrservice.v1.OcrService.AsyncGetOperationStatus:input_type -> ssn.ocrservice.v1.AsyncGetOperationStatusRequest
	7,  // 9: ssn.ocrservice.v1.OcrService.OcrScanImage:output_type -> ssn.ocrservice.v1.OcrScanImageResponse
	1,  // 10: ssn.ocrservice.v1.OcrService.GetTextAnnotation:output_type -> ssn.ocrservice.v1.GetTextAnnotationResponse
	1,  // 11: ssn.ocrservice.v1.OcrService.GetTextAnnotations:output_type -> ssn.ocrservice.v1.GetTextAnnotationResponse
	3,  // 12: ssn.ocrservice.v1.OcrService.AsyncCreateOperation:output_type -> ssn.ocrservice.v1.AsyncCreateOperationResponse
	5,  // 13: ssn.ocrservice.v1.OcrService.AsyncGetOperationStatus:output_type -> ssn.ocrservice.v1.AsyncGetOperationStatusResponse
	9,  // [9:14] is the sub-list for method output_type
	4,  // [4:9] is the sub-list for method input_type
	4,  // [4:4] is the sub-list for extension type_name
	4,  // [4:4] is the sub-list for extension extendee
	0,  // [0:4] is the sub-list for field type_name
}

func init() { file_ssn_ocrservice_v1_ocrservice_proto_init() }
func file_ssn_ocrservice_v1_ocrservice_proto_init() {
	if File_ssn_ocrservice_v1_ocrservice_proto != nil {
		return
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: unsafe.Slice(unsafe.StringData(file_ssn_ocrservice_v1_ocrservice_proto_rawDesc), len(file_ssn_ocrservice_v1_ocrservice_proto_rawDesc)),
			NumEnums:      0,
			NumMessages:   8,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_ssn_ocrservice_v1_ocrservice_proto_goTypes,
		DependencyIndexes: file_ssn_ocrservice_v1_ocrservice_proto_depIdxs,
		MessageInfos:      file_ssn_ocrservice_v1_ocrservice_proto_msgTypes,
	}.Build()
	File_ssn_ocrservice_v1_ocrservice_proto = out.File
	file_ssn_ocrservice_v1_ocrservice_proto_goTypes = nil
	file_ssn_ocrservice_v1_ocrservice_proto_depIdxs = nil
}
