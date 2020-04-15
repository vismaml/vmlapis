// Code generated by protoc-gen-go. DO NOT EDIT.
// source: asgt/dataservice/v1alpha1/bq_entries.proto

package dataservice

import proto "github.com/golang/protobuf/proto"
import fmt "fmt"
import math "math"
import _type "github.com/e-conomic/vmlapis/gen/go/asgt/type"
import _ "github.com/e-conomic/vmlapis/gen/go/gen_bq_schema"
import _ "google.golang.org/genproto/googleapis/api/annotations"

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// This is a compile-time assertion to ensure that this generated file
// is compatible with the proto package it is being compiled against.
// A compilation error at this line likely means your copy of the
// proto package needs to be updated.
const _ = proto.ProtoPackageIsVersion2 // please upgrade the proto package

// Bank BQ schema gen - could be used for adding direct developer data endpoints
type BankEntry struct {
	Id                   string                     `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	Consumer             string                     `protobuf:"bytes,2,opt,name=consumer,proto3" json:"consumer,omitempty"`
	DatasetName          string                     `protobuf:"bytes,3,opt,name=dataset_name,json=datasetName,proto3" json:"dataset_name,omitempty"`
	Tags                 []string                   `protobuf:"bytes,4,rep,name=tags,proto3" json:"tags,omitempty"`
	Data                 *_type.BankTransaction     `protobuf:"bytes,5,opt,name=data,proto3" json:"data,omitempty"`
	Targets              []*_type.TargetValue       `protobuf:"bytes,6,rep,name=targets,proto3" json:"targets,omitempty"`
	Model                *_type.ModelInfo           `protobuf:"bytes,9,opt,name=model,proto3" json:"model,omitempty"`
	Prediction           []*_type.Prediction_Target `protobuf:"bytes,10,rep,name=prediction,proto3" json:"prediction,omitempty"`
	TimeAdded            uint64                     `protobuf:"varint,8,opt,name=time_added,json=timeAdded,proto3" json:"time_added,omitempty"`
	XXX_NoUnkeyedLiteral struct{}                   `json:"-"`
	XXX_unrecognized     []byte                     `json:"-"`
	XXX_sizecache        int32                      `json:"-"`
}

func (m *BankEntry) Reset()         { *m = BankEntry{} }
func (m *BankEntry) String() string { return proto.CompactTextString(m) }
func (*BankEntry) ProtoMessage()    {}
func (*BankEntry) Descriptor() ([]byte, []int) {
	return fileDescriptor_bq_entries_192c619b700cdef2, []int{0}
}
func (m *BankEntry) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_BankEntry.Unmarshal(m, b)
}
func (m *BankEntry) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_BankEntry.Marshal(b, m, deterministic)
}
func (dst *BankEntry) XXX_Merge(src proto.Message) {
	xxx_messageInfo_BankEntry.Merge(dst, src)
}
func (m *BankEntry) XXX_Size() int {
	return xxx_messageInfo_BankEntry.Size(m)
}
func (m *BankEntry) XXX_DiscardUnknown() {
	xxx_messageInfo_BankEntry.DiscardUnknown(m)
}

var xxx_messageInfo_BankEntry proto.InternalMessageInfo

func (m *BankEntry) GetId() string {
	if m != nil {
		return m.Id
	}
	return ""
}

func (m *BankEntry) GetConsumer() string {
	if m != nil {
		return m.Consumer
	}
	return ""
}

func (m *BankEntry) GetDatasetName() string {
	if m != nil {
		return m.DatasetName
	}
	return ""
}

func (m *BankEntry) GetTags() []string {
	if m != nil {
		return m.Tags
	}
	return nil
}

func (m *BankEntry) GetData() *_type.BankTransaction {
	if m != nil {
		return m.Data
	}
	return nil
}

func (m *BankEntry) GetTargets() []*_type.TargetValue {
	if m != nil {
		return m.Targets
	}
	return nil
}

func (m *BankEntry) GetModel() *_type.ModelInfo {
	if m != nil {
		return m.Model
	}
	return nil
}

func (m *BankEntry) GetPrediction() []*_type.Prediction_Target {
	if m != nil {
		return m.Prediction
	}
	return nil
}

func (m *BankEntry) GetTimeAdded() uint64 {
	if m != nil {
		return m.TimeAdded
	}
	return 0
}

// Electronic Invoice Line BQ schema gen - could be used for adding direct developer data endpoints
type ElectronicInvoiceLineEntry struct {
	Id                   string                     `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	Consumer             string                     `protobuf:"bytes,2,opt,name=consumer,proto3" json:"consumer,omitempty"`
	DatasetName          string                     `protobuf:"bytes,3,opt,name=dataset_name,json=datasetName,proto3" json:"dataset_name,omitempty"`
	Tags                 []string                   `protobuf:"bytes,4,rep,name=tags,proto3" json:"tags,omitempty"`
	Data                 *_type.InvoiceLine         `protobuf:"bytes,5,opt,name=data,proto3" json:"data,omitempty"`
	Targets              []*_type.TargetValue       `protobuf:"bytes,6,rep,name=targets,proto3" json:"targets,omitempty"`
	Model                *_type.ModelInfo           `protobuf:"bytes,9,opt,name=model,proto3" json:"model,omitempty"`
	Prediction           []*_type.Prediction_Target `protobuf:"bytes,10,rep,name=prediction,proto3" json:"prediction,omitempty"`
	TimeAdded            uint64                     `protobuf:"varint,8,opt,name=time_added,json=timeAdded,proto3" json:"time_added,omitempty"`
	XXX_NoUnkeyedLiteral struct{}                   `json:"-"`
	XXX_unrecognized     []byte                     `json:"-"`
	XXX_sizecache        int32                      `json:"-"`
}

func (m *ElectronicInvoiceLineEntry) Reset()         { *m = ElectronicInvoiceLineEntry{} }
func (m *ElectronicInvoiceLineEntry) String() string { return proto.CompactTextString(m) }
func (*ElectronicInvoiceLineEntry) ProtoMessage()    {}
func (*ElectronicInvoiceLineEntry) Descriptor() ([]byte, []int) {
	return fileDescriptor_bq_entries_192c619b700cdef2, []int{1}
}
func (m *ElectronicInvoiceLineEntry) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_ElectronicInvoiceLineEntry.Unmarshal(m, b)
}
func (m *ElectronicInvoiceLineEntry) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_ElectronicInvoiceLineEntry.Marshal(b, m, deterministic)
}
func (dst *ElectronicInvoiceLineEntry) XXX_Merge(src proto.Message) {
	xxx_messageInfo_ElectronicInvoiceLineEntry.Merge(dst, src)
}
func (m *ElectronicInvoiceLineEntry) XXX_Size() int {
	return xxx_messageInfo_ElectronicInvoiceLineEntry.Size(m)
}
func (m *ElectronicInvoiceLineEntry) XXX_DiscardUnknown() {
	xxx_messageInfo_ElectronicInvoiceLineEntry.DiscardUnknown(m)
}

var xxx_messageInfo_ElectronicInvoiceLineEntry proto.InternalMessageInfo

func (m *ElectronicInvoiceLineEntry) GetId() string {
	if m != nil {
		return m.Id
	}
	return ""
}

func (m *ElectronicInvoiceLineEntry) GetConsumer() string {
	if m != nil {
		return m.Consumer
	}
	return ""
}

func (m *ElectronicInvoiceLineEntry) GetDatasetName() string {
	if m != nil {
		return m.DatasetName
	}
	return ""
}

func (m *ElectronicInvoiceLineEntry) GetTags() []string {
	if m != nil {
		return m.Tags
	}
	return nil
}

func (m *ElectronicInvoiceLineEntry) GetData() *_type.InvoiceLine {
	if m != nil {
		return m.Data
	}
	return nil
}

func (m *ElectronicInvoiceLineEntry) GetTargets() []*_type.TargetValue {
	if m != nil {
		return m.Targets
	}
	return nil
}

func (m *ElectronicInvoiceLineEntry) GetModel() *_type.ModelInfo {
	if m != nil {
		return m.Model
	}
	return nil
}

func (m *ElectronicInvoiceLineEntry) GetPrediction() []*_type.Prediction_Target {
	if m != nil {
		return m.Prediction
	}
	return nil
}

func (m *ElectronicInvoiceLineEntry) GetTimeAdded() uint64 {
	if m != nil {
		return m.TimeAdded
	}
	return 0
}

// Scanned Invoice BQ schema gen - could be used for adding direct developer data endpoints
type ScannedInvoiceEntry struct {
	Id                   string                     `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	Consumer             string                     `protobuf:"bytes,2,opt,name=consumer,proto3" json:"consumer,omitempty"`
	DatasetName          string                     `protobuf:"bytes,3,opt,name=dataset_name,json=datasetName,proto3" json:"dataset_name,omitempty"`
	Tags                 []string                   `protobuf:"bytes,4,rep,name=tags,proto3" json:"tags,omitempty"`
	Data                 *_type.ScannedInvoice      `protobuf:"bytes,5,opt,name=data,proto3" json:"data,omitempty"`
	Targets              []*_type.TargetValue       `protobuf:"bytes,6,rep,name=targets,proto3" json:"targets,omitempty"`
	Model                *_type.ModelInfo           `protobuf:"bytes,9,opt,name=model,proto3" json:"model,omitempty"`
	Prediction           []*_type.Prediction_Target `protobuf:"bytes,10,rep,name=prediction,proto3" json:"prediction,omitempty"`
	TimeAdded            uint64                     `protobuf:"varint,8,opt,name=time_added,json=timeAdded,proto3" json:"time_added,omitempty"`
	XXX_NoUnkeyedLiteral struct{}                   `json:"-"`
	XXX_unrecognized     []byte                     `json:"-"`
	XXX_sizecache        int32                      `json:"-"`
}

func (m *ScannedInvoiceEntry) Reset()         { *m = ScannedInvoiceEntry{} }
func (m *ScannedInvoiceEntry) String() string { return proto.CompactTextString(m) }
func (*ScannedInvoiceEntry) ProtoMessage()    {}
func (*ScannedInvoiceEntry) Descriptor() ([]byte, []int) {
	return fileDescriptor_bq_entries_192c619b700cdef2, []int{2}
}
func (m *ScannedInvoiceEntry) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_ScannedInvoiceEntry.Unmarshal(m, b)
}
func (m *ScannedInvoiceEntry) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_ScannedInvoiceEntry.Marshal(b, m, deterministic)
}
func (dst *ScannedInvoiceEntry) XXX_Merge(src proto.Message) {
	xxx_messageInfo_ScannedInvoiceEntry.Merge(dst, src)
}
func (m *ScannedInvoiceEntry) XXX_Size() int {
	return xxx_messageInfo_ScannedInvoiceEntry.Size(m)
}
func (m *ScannedInvoiceEntry) XXX_DiscardUnknown() {
	xxx_messageInfo_ScannedInvoiceEntry.DiscardUnknown(m)
}

var xxx_messageInfo_ScannedInvoiceEntry proto.InternalMessageInfo

func (m *ScannedInvoiceEntry) GetId() string {
	if m != nil {
		return m.Id
	}
	return ""
}

func (m *ScannedInvoiceEntry) GetConsumer() string {
	if m != nil {
		return m.Consumer
	}
	return ""
}

func (m *ScannedInvoiceEntry) GetDatasetName() string {
	if m != nil {
		return m.DatasetName
	}
	return ""
}

func (m *ScannedInvoiceEntry) GetTags() []string {
	if m != nil {
		return m.Tags
	}
	return nil
}

func (m *ScannedInvoiceEntry) GetData() *_type.ScannedInvoice {
	if m != nil {
		return m.Data
	}
	return nil
}

func (m *ScannedInvoiceEntry) GetTargets() []*_type.TargetValue {
	if m != nil {
		return m.Targets
	}
	return nil
}

func (m *ScannedInvoiceEntry) GetModel() *_type.ModelInfo {
	if m != nil {
		return m.Model
	}
	return nil
}

func (m *ScannedInvoiceEntry) GetPrediction() []*_type.Prediction_Target {
	if m != nil {
		return m.Prediction
	}
	return nil
}

func (m *ScannedInvoiceEntry) GetTimeAdded() uint64 {
	if m != nil {
		return m.TimeAdded
	}
	return 0
}

func init() {
	proto.RegisterType((*BankEntry)(nil), "asgt.dataservice.v1alpha1.BankEntry")
	proto.RegisterType((*ElectronicInvoiceLineEntry)(nil), "asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntry")
	proto.RegisterType((*ScannedInvoiceEntry)(nil), "asgt.dataservice.v1alpha1.ScannedInvoiceEntry")
}

func init() {
	proto.RegisterFile("asgt/dataservice/v1alpha1/bq_entries.proto", fileDescriptor_bq_entries_192c619b700cdef2)
}

var fileDescriptor_bq_entries_192c619b700cdef2 = []byte{
	// 619 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xe4, 0x95, 0x51, 0x6a, 0xdb, 0x4e,
	0x10, 0xc6, 0xb1, 0xa3, 0xe4, 0x6f, 0xad, 0xff, 0x29, 0x45, 0x0d, 0x41, 0x31, 0xa1, 0xdd, 0xf8,
	0xc9, 0x84, 0xc4, 0x6a, 0xd2, 0xb7, 0x52, 0x10, 0x71, 0xeb, 0x82, 0xa1, 0x29, 0x41, 0x31, 0x7d,
	0xc8, 0x8b, 0x18, 0x69, 0xc7, 0xf6, 0x62, 0x69, 0xd7, 0xd1, 0xae, 0x0d, 0x3e, 0x40, 0x0f, 0xd1,
	0x03, 0xf4, 0x72, 0x3a, 0x45, 0x59, 0xc9, 0x89, 0xe4, 0x86, 0x5e, 0x20, 0x79, 0xdd, 0xef, 0x9b,
	0x19, 0x69, 0xbe, 0x9f, 0xb4, 0xe4, 0x14, 0xd4, 0x54, 0x7b, 0x0c, 0x34, 0x28, 0xcc, 0x56, 0x3c,
	0x46, 0x6f, 0x75, 0x01, 0xc9, 0x62, 0x06, 0x17, 0x5e, 0x74, 0x1f, 0xa2, 0xd0, 0x19, 0x47, 0xd5,
	0x5f, 0x64, 0x52, 0x4b, 0xe7, 0xc8, 0x78, 0xfb, 0x35, 0x6f, 0xff, 0xc1, 0xdb, 0xa1, 0x45, 0x1b,
	0xbd, 0x5e, 0xa0, 0x17, 0x81, 0x98, 0x87, 0x3a, 0x03, 0xa1, 0x20, 0xd6, 0x5c, 0x8a, 0xb2, 0xb8,
	0x73, 0x5c, 0x39, 0xb8, 0x58, 0x49, 0x1e, 0x63, 0x98, 0x70, 0x81, 0x1b, 0xb5, 0x53, 0xa9, 0xa9,
	0x64, 0x98, 0x84, 0x5c, 0x4c, 0xe4, 0x53, 0x6d, 0x91, 0x21, 0xe3, 0xf5, 0xae, 0xef, 0x2a, 0x4d,
	0xc5, 0x20, 0x04, 0xb2, 0x70, 0xd3, 0xfd, 0xe9, 0x58, 0x0d, 0xd9, 0x14, 0x75, 0xb8, 0x82, 0x64,
	0xf9, 0xa8, 0x4e, 0x51, 0x84, 0xd1, 0x7d, 0xa8, 0xe2, 0x19, 0xa6, 0x60, 0xde, 0x78, 0xc2, 0x31,
	0x61, 0xff, 0x54, 0x35, 0x44, 0x49, 0x55, 0x2b, 0xe5, 0x34, 0x41, 0x0f, 0x16, 0xdc, 0x03, 0x21,
	0xa4, 0x06, 0xf3, 0x5c, 0x9b, 0x5d, 0x75, 0x7f, 0x5a, 0xc4, 0x1e, 0x80, 0x98, 0x0f, 0x85, 0xce,
	0xd6, 0xce, 0x80, 0x34, 0x39, 0x73, 0x1b, 0xb4, 0xd1, 0xb3, 0x07, 0x97, 0xb9, 0xef, 0x75, 0xcf,
	0x47, 0x5f, 0xce, 0x68, 0x0a, 0x3a, 0x9e, 0xa1, 0xa2, 0x43, 0xb1, 0x92, 0x6b, 0x9a, 0xe1, 0xfd,
	0x12, 0x95, 0xa6, 0x9c, 0x51, 0x3e, 0xa1, 0x13, 0x44, 0x16, 0x41, 0x3c, 0xa7, 0x66, 0xdd, 0x41,
	0x93, 0x33, 0xe7, 0x84, 0xb4, 0x62, 0x29, 0xd4, 0x32, 0xc5, 0xcc, 0x6d, 0x16, 0x9d, 0x76, 0x73,
	0xbf, 0xd9, 0x6a, 0x04, 0x8f, 0xc7, 0x4e, 0x8f, 0xfc, 0x5f, 0xa6, 0xa3, 0x43, 0x01, 0x29, 0xba,
	0x3b, 0x75, 0x5b, 0x7b, 0x23, 0x7d, 0x87, 0x14, 0x9d, 0x3b, 0x62, 0x69, 0x98, 0x2a, 0xd7, 0xa2,
	0x3b, 0x3d, 0x7b, 0xf0, 0x35, 0xf7, 0x3f, 0x77, 0xaf, 0xc6, 0x30, 0x55, 0x94, 0xe1, 0x84, 0x0b,
	0x64, 0x34, 0x5a, 0xd3, 0x87, 0xb6, 0x67, 0x14, 0x45, 0xc6, 0xe3, 0x59, 0x79, 0xba, 0x89, 0xde,
	0x3c, 0xe3, 0x0a, 0x12, 0xd4, 0x73, 0x5c, 0x53, 0xae, 0xe8, 0x52, 0x21, 0x0b, 0x8a, 0x9e, 0x4e,
	0x9f, 0x58, 0x66, 0x94, 0xbb, 0x4b, 0x1b, 0xbd, 0xf6, 0x65, 0xa7, 0x5f, 0x50, 0x63, 0x12, 0xe8,
	0x9b, 0x85, 0x8c, 0x2b, 0x32, 0x82, 0xc2, 0xe7, 0xbc, 0x27, 0xff, 0x95, 0xd1, 0x28, 0x77, 0x8f,
	0xee, 0xf4, 0xda, 0x97, 0x87, 0xb5, 0x92, 0x71, 0xa1, 0xfc, 0x30, 0x99, 0x05, 0x0f, 0x36, 0xe7,
	0x94, 0xec, 0x16, 0x94, 0xb8, 0x76, 0x31, 0xe2, 0xa0, 0xe6, 0xbf, 0x36, 0xe7, 0x23, 0x31, 0x91,
	0x41, 0x69, 0x71, 0x3e, 0x11, 0x52, 0x51, 0xe3, 0x92, 0x62, 0xc0, 0x71, 0xad, 0xe0, 0xa6, 0x42,
	0xaa, 0x9c, 0x15, 0xd4, 0xfc, 0x8e, 0x47, 0x88, 0xe6, 0x29, 0x86, 0xc0, 0x18, 0x32, 0xb7, 0x45,
	0x1b, 0x3d, 0x6b, 0xf0, 0x3a, 0xf7, 0xf7, 0x5b, 0x0d, 0xc7, 0x1e, 0x8f, 0xae, 0x87, 0xb7, 0xe3,
	0xab, 0xeb, 0x9b, 0xc0, 0x36, 0x9e, 0x2b, 0x63, 0xf9, 0xf8, 0x2a, 0xf7, 0xdb, 0xc4, 0x2e, 0xbe,
	0x01, 0xf3, 0x72, 0xdd, 0xdf, 0x16, 0xe9, 0x0c, 0x13, 0x8c, 0x75, 0x26, 0x05, 0x8f, 0x47, 0x25,
	0x9b, 0xdf, 0xb8, 0xc0, 0x17, 0x08, 0xc6, 0xe9, 0x16, 0x18, 0xf5, 0x94, 0x6b, 0x7b, 0x79, 0x8e,
	0x50, 0x9c, 0xe4, 0xfe, 0x5b, 0x72, 0x8c, 0x8f, 0x18, 0x84, 0xf5, 0x3f, 0x60, 0xc9, 0xc9, 0x2f,
	0x8b, 0xbc, 0xb9, 0x2d, 0xff, 0x60, 0x9b, 0x65, 0xbc, 0x40, 0x40, 0xce, 0xb7, 0x00, 0x39, 0xaa,
	0x05, 0xb2, 0xbd, 0x9a, 0xe7, 0xc8, 0xc8, 0x51, 0xee, 0x1f, 0x92, 0x83, 0xbf, 0x2e, 0xb1, 0x82,
	0x8d, 0xc1, 0xfe, 0x5d, 0xbb, 0x76, 0xe9, 0x46, 0x7b, 0xc5, 0x0d, 0xf3, 0xe1, 0x4f, 0x00, 0x00,
	0x00, 0xff, 0xff, 0xb1, 0x01, 0xef, 0xdf, 0xbb, 0x07, 0x00, 0x00,
}
