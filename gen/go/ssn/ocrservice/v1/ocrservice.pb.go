// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.1
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
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

type GetTextAnnotationRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Document *v1.Document `protobuf:"bytes,2,opt,name=document,proto3" json:"document,omitempty"`
	Preview  bool         `protobuf:"varint,3,opt,name=preview,proto3" json:"preview,omitempty"`
}

func (x *GetTextAnnotationRequest) Reset() {
	*x = GetTextAnnotationRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_ssn_ocrservice_v1_ocrservice_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GetTextAnnotationRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GetTextAnnotationRequest) ProtoMessage() {}

func (x *GetTextAnnotationRequest) ProtoReflect() protoreflect.Message {
	mi := &file_ssn_ocrservice_v1_ocrservice_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
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

type GetTextAnnotationResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	TextAnnotation *_type.TextAnnotation  `protobuf:"bytes,2,opt,name=text_annotation,json=textAnnotation,proto3" json:"text_annotation,omitempty"`
	Image          *wrapperspb.BytesValue `protobuf:"bytes,3,opt,name=image,proto3" json:"image,omitempty"`
}

func (x *GetTextAnnotationResponse) Reset() {
	*x = GetTextAnnotationResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_ssn_ocrservice_v1_ocrservice_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GetTextAnnotationResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GetTextAnnotationResponse) ProtoMessage() {}

func (x *GetTextAnnotationResponse) ProtoReflect() protoreflect.Message {
	mi := &file_ssn_ocrservice_v1_ocrservice_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
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

type OcrScanImageRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Data []byte `protobuf:"bytes,1,opt,name=data,proto3" json:"data,omitempty"`
}

func (x *OcrScanImageRequest) Reset() {
	*x = OcrScanImageRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_ssn_ocrservice_v1_ocrservice_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *OcrScanImageRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*OcrScanImageRequest) ProtoMessage() {}

func (x *OcrScanImageRequest) ProtoReflect() protoreflect.Message {
	mi := &file_ssn_ocrservice_v1_ocrservice_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
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
	return file_ssn_ocrservice_v1_ocrservice_proto_rawDescGZIP(), []int{2}
}

func (x *OcrScanImageRequest) GetData() []byte {
	if x != nil {
		return x.Data
	}
	return nil
}

type OcrScanImageResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	TessHocr string `protobuf:"bytes,1,opt,name=tess_hocr,json=tessHocr,proto3" json:"tess_hocr,omitempty"`
}

func (x *OcrScanImageResponse) Reset() {
	*x = OcrScanImageResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_ssn_ocrservice_v1_ocrservice_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *OcrScanImageResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*OcrScanImageResponse) ProtoMessage() {}

func (x *OcrScanImageResponse) ProtoReflect() protoreflect.Message {
	mi := &file_ssn_ocrservice_v1_ocrservice_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
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
	return file_ssn_ocrservice_v1_ocrservice_proto_rawDescGZIP(), []int{3}
}

func (x *OcrScanImageResponse) GetTessHocr() string {
	if x != nil {
		return x.TessHocr
	}
	return ""
}

var File_ssn_ocrservice_v1_ocrservice_proto protoreflect.FileDescriptor

var file_ssn_ocrservice_v1_ocrservice_proto_rawDesc = []byte{
	0x0a, 0x22, 0x73, 0x73, 0x6e, 0x2f, 0x6f, 0x63, 0x72, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65,
	0x2f, 0x76, 0x31, 0x2f, 0x6f, 0x63, 0x72, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x12, 0x11, 0x73, 0x73, 0x6e, 0x2e, 0x6f, 0x63, 0x72, 0x73, 0x65, 0x72,
	0x76, 0x69, 0x63, 0x65, 0x2e, 0x76, 0x31, 0x1a, 0x20, 0x73, 0x73, 0x6e, 0x2f, 0x61, 0x6e, 0x6e,
	0x6f, 0x74, 0x61, 0x74, 0x6f, 0x72, 0x2f, 0x76, 0x31, 0x2f, 0x61, 0x6e, 0x6e, 0x6f, 0x74, 0x61,
	0x74, 0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1e, 0x73, 0x73, 0x6e, 0x2f, 0x74,
	0x79, 0x70, 0x65, 0x2f, 0x74, 0x65, 0x78, 0x74, 0x5f, 0x61, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74,
	0x69, 0x6f, 0x6e, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1e, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x77, 0x72, 0x61, 0x70, 0x70,
	0x65, 0x72, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x6c, 0x0a, 0x18, 0x47, 0x65, 0x74,
	0x54, 0x65, 0x78, 0x74, 0x41, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x36, 0x0a, 0x08, 0x64, 0x6f, 0x63, 0x75, 0x6d, 0x65, 0x6e,
	0x74, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1a, 0x2e, 0x73, 0x73, 0x6e, 0x2e, 0x61, 0x6e,
	0x6e, 0x6f, 0x74, 0x61, 0x74, 0x6f, 0x72, 0x2e, 0x76, 0x31, 0x2e, 0x44, 0x6f, 0x63, 0x75, 0x6d,
	0x65, 0x6e, 0x74, 0x52, 0x08, 0x64, 0x6f, 0x63, 0x75, 0x6d, 0x65, 0x6e, 0x74, 0x12, 0x18, 0x0a,
	0x07, 0x70, 0x72, 0x65, 0x76, 0x69, 0x65, 0x77, 0x18, 0x03, 0x20, 0x01, 0x28, 0x08, 0x52, 0x07,
	0x70, 0x72, 0x65, 0x76, 0x69, 0x65, 0x77, 0x22, 0x91, 0x01, 0x0a, 0x19, 0x47, 0x65, 0x74, 0x54,
	0x65, 0x78, 0x74, 0x41, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x65, 0x73,
	0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x41, 0x0a, 0x0f, 0x74, 0x65, 0x78, 0x74, 0x5f, 0x61, 0x6e,
	0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x18,
	0x2e, 0x73, 0x73, 0x6e, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x54, 0x65, 0x78, 0x74, 0x41, 0x6e,
	0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x0e, 0x74, 0x65, 0x78, 0x74, 0x41, 0x6e,
	0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x31, 0x0a, 0x05, 0x69, 0x6d, 0x61, 0x67,
	0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1b, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x42, 0x79, 0x74, 0x65, 0x73, 0x56,
	0x61, 0x6c, 0x75, 0x65, 0x52, 0x05, 0x69, 0x6d, 0x61, 0x67, 0x65, 0x22, 0x29, 0x0a, 0x13, 0x4f,
	0x63, 0x72, 0x53, 0x63, 0x61, 0x6e, 0x49, 0x6d, 0x61, 0x67, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65,
	0x73, 0x74, 0x12, 0x12, 0x0a, 0x04, 0x64, 0x61, 0x74, 0x61, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0c,
	0x52, 0x04, 0x64, 0x61, 0x74, 0x61, 0x22, 0x33, 0x0a, 0x14, 0x4f, 0x63, 0x72, 0x53, 0x63, 0x61,
	0x6e, 0x49, 0x6d, 0x61, 0x67, 0x65, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x1b,
	0x0a, 0x09, 0x74, 0x65, 0x73, 0x73, 0x5f, 0x68, 0x6f, 0x63, 0x72, 0x18, 0x01, 0x20, 0x01, 0x28,
	0x09, 0x52, 0x08, 0x74, 0x65, 0x73, 0x73, 0x48, 0x6f, 0x63, 0x72, 0x32, 0xdd, 0x01, 0x0a, 0x0a,
	0x4f, 0x63, 0x72, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x12, 0x5f, 0x0a, 0x0c, 0x4f, 0x63,
	0x72, 0x53, 0x63, 0x61, 0x6e, 0x49, 0x6d, 0x61, 0x67, 0x65, 0x12, 0x26, 0x2e, 0x73, 0x73, 0x6e,
	0x2e, 0x6f, 0x63, 0x72, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x4f,
	0x63, 0x72, 0x53, 0x63, 0x61, 0x6e, 0x49, 0x6d, 0x61, 0x67, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65,
	0x73, 0x74, 0x1a, 0x27, 0x2e, 0x73, 0x73, 0x6e, 0x2e, 0x6f, 0x63, 0x72, 0x73, 0x65, 0x72, 0x76,
	0x69, 0x63, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x4f, 0x63, 0x72, 0x53, 0x63, 0x61, 0x6e, 0x49, 0x6d,
	0x61, 0x67, 0x65, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x6e, 0x0a, 0x11, 0x47,
	0x65, 0x74, 0x54, 0x65, 0x78, 0x74, 0x41, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e,
	0x12, 0x2b, 0x2e, 0x73, 0x73, 0x6e, 0x2e, 0x6f, 0x63, 0x72, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63,
	0x65, 0x2e, 0x76, 0x31, 0x2e, 0x47, 0x65, 0x74, 0x54, 0x65, 0x78, 0x74, 0x41, 0x6e, 0x6e, 0x6f,
	0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x2c, 0x2e,
	0x73, 0x73, 0x6e, 0x2e, 0x6f, 0x63, 0x72, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x76,
	0x31, 0x2e, 0x47, 0x65, 0x74, 0x54, 0x65, 0x78, 0x74, 0x41, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74,
	0x69, 0x6f, 0x6e, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x42, 0x53, 0x42, 0x0f, 0x4f,
	0x63, 0x72, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x5a, 0x40,
	0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x65, 0x2d, 0x63, 0x6f, 0x6e,
	0x6f, 0x6d, 0x69, 0x63, 0x2f, 0x76, 0x6d, 0x6c, 0x61, 0x70, 0x69, 0x73, 0x2f, 0x67, 0x65, 0x6e,
	0x2f, 0x67, 0x6f, 0x2f, 0x73, 0x73, 0x6e, 0x2f, 0x6f, 0x63, 0x72, 0x73, 0x65, 0x72, 0x76, 0x69,
	0x63, 0x65, 0x2f, 0x76, 0x31, 0x3b, 0x6f, 0x63, 0x72, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65,
	0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_ssn_ocrservice_v1_ocrservice_proto_rawDescOnce sync.Once
	file_ssn_ocrservice_v1_ocrservice_proto_rawDescData = file_ssn_ocrservice_v1_ocrservice_proto_rawDesc
)

func file_ssn_ocrservice_v1_ocrservice_proto_rawDescGZIP() []byte {
	file_ssn_ocrservice_v1_ocrservice_proto_rawDescOnce.Do(func() {
		file_ssn_ocrservice_v1_ocrservice_proto_rawDescData = protoimpl.X.CompressGZIP(file_ssn_ocrservice_v1_ocrservice_proto_rawDescData)
	})
	return file_ssn_ocrservice_v1_ocrservice_proto_rawDescData
}

var file_ssn_ocrservice_v1_ocrservice_proto_msgTypes = make([]protoimpl.MessageInfo, 4)
var file_ssn_ocrservice_v1_ocrservice_proto_goTypes = []interface{}{
	(*GetTextAnnotationRequest)(nil),  // 0: ssn.ocrservice.v1.GetTextAnnotationRequest
	(*GetTextAnnotationResponse)(nil), // 1: ssn.ocrservice.v1.GetTextAnnotationResponse
	(*OcrScanImageRequest)(nil),       // 2: ssn.ocrservice.v1.OcrScanImageRequest
	(*OcrScanImageResponse)(nil),      // 3: ssn.ocrservice.v1.OcrScanImageResponse
	(*v1.Document)(nil),               // 4: ssn.annotator.v1.Document
	(*_type.TextAnnotation)(nil),      // 5: ssn.type.TextAnnotation
	(*wrapperspb.BytesValue)(nil),     // 6: google.protobuf.BytesValue
}
var file_ssn_ocrservice_v1_ocrservice_proto_depIdxs = []int32{
	4, // 0: ssn.ocrservice.v1.GetTextAnnotationRequest.document:type_name -> ssn.annotator.v1.Document
	5, // 1: ssn.ocrservice.v1.GetTextAnnotationResponse.text_annotation:type_name -> ssn.type.TextAnnotation
	6, // 2: ssn.ocrservice.v1.GetTextAnnotationResponse.image:type_name -> google.protobuf.BytesValue
	2, // 3: ssn.ocrservice.v1.OcrService.OcrScanImage:input_type -> ssn.ocrservice.v1.OcrScanImageRequest
	0, // 4: ssn.ocrservice.v1.OcrService.GetTextAnnotation:input_type -> ssn.ocrservice.v1.GetTextAnnotationRequest
	3, // 5: ssn.ocrservice.v1.OcrService.OcrScanImage:output_type -> ssn.ocrservice.v1.OcrScanImageResponse
	1, // 6: ssn.ocrservice.v1.OcrService.GetTextAnnotation:output_type -> ssn.ocrservice.v1.GetTextAnnotationResponse
	5, // [5:7] is the sub-list for method output_type
	3, // [3:5] is the sub-list for method input_type
	3, // [3:3] is the sub-list for extension type_name
	3, // [3:3] is the sub-list for extension extendee
	0, // [0:3] is the sub-list for field type_name
}

func init() { file_ssn_ocrservice_v1_ocrservice_proto_init() }
func file_ssn_ocrservice_v1_ocrservice_proto_init() {
	if File_ssn_ocrservice_v1_ocrservice_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_ssn_ocrservice_v1_ocrservice_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GetTextAnnotationRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_ssn_ocrservice_v1_ocrservice_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GetTextAnnotationResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_ssn_ocrservice_v1_ocrservice_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*OcrScanImageRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_ssn_ocrservice_v1_ocrservice_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*OcrScanImageResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_ssn_ocrservice_v1_ocrservice_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   4,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_ssn_ocrservice_v1_ocrservice_proto_goTypes,
		DependencyIndexes: file_ssn_ocrservice_v1_ocrservice_proto_depIdxs,
		MessageInfos:      file_ssn_ocrservice_v1_ocrservice_proto_msgTypes,
	}.Build()
	File_ssn_ocrservice_v1_ocrservice_proto = out.File
	file_ssn_ocrservice_v1_ocrservice_proto_rawDesc = nil
	file_ssn_ocrservice_v1_ocrservice_proto_goTypes = nil
	file_ssn_ocrservice_v1_ocrservice_proto_depIdxs = nil
}
