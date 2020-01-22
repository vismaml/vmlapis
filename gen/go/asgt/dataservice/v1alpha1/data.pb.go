// Code generated by protoc-gen-go. DO NOT EDIT.
// source: asgt/dataservice/v1alpha1/data.proto

package dataservice

import proto "github.com/golang/protobuf/proto"
import fmt "fmt"
import math "math"

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// This is a compile-time assertion to ensure that this generated file
// is compatible with the proto package it is being compiled against.
// A compilation error at this line likely means your copy of the
// proto package needs to be updated.
const _ = proto.ProtoPackageIsVersion2 // please upgrade the proto package

// Common Data types
type DataTuple struct {
	Target               string   `protobuf:"bytes,1,opt,name=target,proto3" json:"target,omitempty"`
	Value                string   `protobuf:"bytes,2,opt,name=value,proto3" json:"value,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *DataTuple) Reset()         { *m = DataTuple{} }
func (m *DataTuple) String() string { return proto.CompactTextString(m) }
func (*DataTuple) ProtoMessage()    {}
func (*DataTuple) Descriptor() ([]byte, []int) {
	return fileDescriptor_data_77820d9e6ecf759e, []int{0}
}
func (m *DataTuple) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_DataTuple.Unmarshal(m, b)
}
func (m *DataTuple) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_DataTuple.Marshal(b, m, deterministic)
}
func (dst *DataTuple) XXX_Merge(src proto.Message) {
	xxx_messageInfo_DataTuple.Merge(dst, src)
}
func (m *DataTuple) XXX_Size() int {
	return xxx_messageInfo_DataTuple.Size(m)
}
func (m *DataTuple) XXX_DiscardUnknown() {
	xxx_messageInfo_DataTuple.DiscardUnknown(m)
}

var xxx_messageInfo_DataTuple proto.InternalMessageInfo

func (m *DataTuple) GetTarget() string {
	if m != nil {
		return m.Target
	}
	return ""
}

func (m *DataTuple) GetValue() string {
	if m != nil {
		return m.Value
	}
	return ""
}

type PredictedTuple struct {
	Target               string   `protobuf:"bytes,1,opt,name=target,proto3" json:"target,omitempty"`
	Predictions          []string `protobuf:"bytes,2,rep,name=predictions,proto3" json:"predictions,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *PredictedTuple) Reset()         { *m = PredictedTuple{} }
func (m *PredictedTuple) String() string { return proto.CompactTextString(m) }
func (*PredictedTuple) ProtoMessage()    {}
func (*PredictedTuple) Descriptor() ([]byte, []int) {
	return fileDescriptor_data_77820d9e6ecf759e, []int{1}
}
func (m *PredictedTuple) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_PredictedTuple.Unmarshal(m, b)
}
func (m *PredictedTuple) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_PredictedTuple.Marshal(b, m, deterministic)
}
func (dst *PredictedTuple) XXX_Merge(src proto.Message) {
	xxx_messageInfo_PredictedTuple.Merge(dst, src)
}
func (m *PredictedTuple) XXX_Size() int {
	return xxx_messageInfo_PredictedTuple.Size(m)
}
func (m *PredictedTuple) XXX_DiscardUnknown() {
	xxx_messageInfo_PredictedTuple.DiscardUnknown(m)
}

var xxx_messageInfo_PredictedTuple proto.InternalMessageInfo

func (m *PredictedTuple) GetTarget() string {
	if m != nil {
		return m.Target
	}
	return ""
}

func (m *PredictedTuple) GetPredictions() []string {
	if m != nil {
		return m.Predictions
	}
	return nil
}

// Dataservice
type DeleteRequest struct {
	ModelType            string   `protobuf:"bytes,1,opt,name=model_type,json=modelType,proto3" json:"model_type,omitempty"`
	Dataset              string   `protobuf:"bytes,2,opt,name=dataset,proto3" json:"dataset,omitempty"`
	Tags                 []string `protobuf:"bytes,3,rep,name=tags,proto3" json:"tags,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *DeleteRequest) Reset()         { *m = DeleteRequest{} }
func (m *DeleteRequest) String() string { return proto.CompactTextString(m) }
func (*DeleteRequest) ProtoMessage()    {}
func (*DeleteRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_data_77820d9e6ecf759e, []int{2}
}
func (m *DeleteRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_DeleteRequest.Unmarshal(m, b)
}
func (m *DeleteRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_DeleteRequest.Marshal(b, m, deterministic)
}
func (dst *DeleteRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_DeleteRequest.Merge(dst, src)
}
func (m *DeleteRequest) XXX_Size() int {
	return xxx_messageInfo_DeleteRequest.Size(m)
}
func (m *DeleteRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_DeleteRequest.DiscardUnknown(m)
}

var xxx_messageInfo_DeleteRequest proto.InternalMessageInfo

func (m *DeleteRequest) GetModelType() string {
	if m != nil {
		return m.ModelType
	}
	return ""
}

func (m *DeleteRequest) GetDataset() string {
	if m != nil {
		return m.Dataset
	}
	return ""
}

func (m *DeleteRequest) GetTags() []string {
	if m != nil {
		return m.Tags
	}
	return nil
}

type FeedbackRequest struct {
	Dataset              string                   `protobuf:"bytes,1,opt,name=dataset,proto3" json:"dataset,omitempty"`
	Tags                 []string                 `protobuf:"bytes,2,rep,name=tags,proto3" json:"tags,omitempty"`
	Entries              []*FeedbackRequest_Entry `protobuf:"bytes,3,rep,name=entries,proto3" json:"entries,omitempty"`
	XXX_NoUnkeyedLiteral struct{}                 `json:"-"`
	XXX_unrecognized     []byte                   `json:"-"`
	XXX_sizecache        int32                    `json:"-"`
}

func (m *FeedbackRequest) Reset()         { *m = FeedbackRequest{} }
func (m *FeedbackRequest) String() string { return proto.CompactTextString(m) }
func (*FeedbackRequest) ProtoMessage()    {}
func (*FeedbackRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_data_77820d9e6ecf759e, []int{3}
}
func (m *FeedbackRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_FeedbackRequest.Unmarshal(m, b)
}
func (m *FeedbackRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_FeedbackRequest.Marshal(b, m, deterministic)
}
func (dst *FeedbackRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_FeedbackRequest.Merge(dst, src)
}
func (m *FeedbackRequest) XXX_Size() int {
	return xxx_messageInfo_FeedbackRequest.Size(m)
}
func (m *FeedbackRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_FeedbackRequest.DiscardUnknown(m)
}

var xxx_messageInfo_FeedbackRequest proto.InternalMessageInfo

func (m *FeedbackRequest) GetDataset() string {
	if m != nil {
		return m.Dataset
	}
	return ""
}

func (m *FeedbackRequest) GetTags() []string {
	if m != nil {
		return m.Tags
	}
	return nil
}

func (m *FeedbackRequest) GetEntries() []*FeedbackRequest_Entry {
	if m != nil {
		return m.Entries
	}
	return nil
}

type FeedbackRequest_Entry struct {
	Id                   string       `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	TrueValues           []*DataTuple `protobuf:"bytes,2,rep,name=true_values,json=trueValues,proto3" json:"true_values,omitempty"`
	XXX_NoUnkeyedLiteral struct{}     `json:"-"`
	XXX_unrecognized     []byte       `json:"-"`
	XXX_sizecache        int32        `json:"-"`
}

func (m *FeedbackRequest_Entry) Reset()         { *m = FeedbackRequest_Entry{} }
func (m *FeedbackRequest_Entry) String() string { return proto.CompactTextString(m) }
func (*FeedbackRequest_Entry) ProtoMessage()    {}
func (*FeedbackRequest_Entry) Descriptor() ([]byte, []int) {
	return fileDescriptor_data_77820d9e6ecf759e, []int{3, 0}
}
func (m *FeedbackRequest_Entry) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_FeedbackRequest_Entry.Unmarshal(m, b)
}
func (m *FeedbackRequest_Entry) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_FeedbackRequest_Entry.Marshal(b, m, deterministic)
}
func (dst *FeedbackRequest_Entry) XXX_Merge(src proto.Message) {
	xxx_messageInfo_FeedbackRequest_Entry.Merge(dst, src)
}
func (m *FeedbackRequest_Entry) XXX_Size() int {
	return xxx_messageInfo_FeedbackRequest_Entry.Size(m)
}
func (m *FeedbackRequest_Entry) XXX_DiscardUnknown() {
	xxx_messageInfo_FeedbackRequest_Entry.DiscardUnknown(m)
}

var xxx_messageInfo_FeedbackRequest_Entry proto.InternalMessageInfo

func (m *FeedbackRequest_Entry) GetId() string {
	if m != nil {
		return m.Id
	}
	return ""
}

func (m *FeedbackRequest_Entry) GetTrueValues() []*DataTuple {
	if m != nil {
		return m.TrueValues
	}
	return nil
}

type RetentionPolicy struct {
	// Types that are valid to be assigned to Policy:
	//	*RetentionPolicy_MaxDays
	//	*RetentionPolicy_MaxRecords
	Policy               isRetentionPolicy_Policy `protobuf_oneof:"policy"`
	XXX_NoUnkeyedLiteral struct{}                 `json:"-"`
	XXX_unrecognized     []byte                   `json:"-"`
	XXX_sizecache        int32                    `json:"-"`
}

func (m *RetentionPolicy) Reset()         { *m = RetentionPolicy{} }
func (m *RetentionPolicy) String() string { return proto.CompactTextString(m) }
func (*RetentionPolicy) ProtoMessage()    {}
func (*RetentionPolicy) Descriptor() ([]byte, []int) {
	return fileDescriptor_data_77820d9e6ecf759e, []int{4}
}
func (m *RetentionPolicy) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_RetentionPolicy.Unmarshal(m, b)
}
func (m *RetentionPolicy) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_RetentionPolicy.Marshal(b, m, deterministic)
}
func (dst *RetentionPolicy) XXX_Merge(src proto.Message) {
	xxx_messageInfo_RetentionPolicy.Merge(dst, src)
}
func (m *RetentionPolicy) XXX_Size() int {
	return xxx_messageInfo_RetentionPolicy.Size(m)
}
func (m *RetentionPolicy) XXX_DiscardUnknown() {
	xxx_messageInfo_RetentionPolicy.DiscardUnknown(m)
}

var xxx_messageInfo_RetentionPolicy proto.InternalMessageInfo

type isRetentionPolicy_Policy interface {
	isRetentionPolicy_Policy()
}

type RetentionPolicy_MaxDays struct {
	MaxDays int64 `protobuf:"varint,1,opt,name=max_days,json=maxDays,proto3,oneof"`
}

type RetentionPolicy_MaxRecords struct {
	MaxRecords int64 `protobuf:"varint,2,opt,name=max_records,json=maxRecords,proto3,oneof"`
}

func (*RetentionPolicy_MaxDays) isRetentionPolicy_Policy() {}

func (*RetentionPolicy_MaxRecords) isRetentionPolicy_Policy() {}

func (m *RetentionPolicy) GetPolicy() isRetentionPolicy_Policy {
	if m != nil {
		return m.Policy
	}
	return nil
}

func (m *RetentionPolicy) GetMaxDays() int64 {
	if x, ok := m.GetPolicy().(*RetentionPolicy_MaxDays); ok {
		return x.MaxDays
	}
	return 0
}

func (m *RetentionPolicy) GetMaxRecords() int64 {
	if x, ok := m.GetPolicy().(*RetentionPolicy_MaxRecords); ok {
		return x.MaxRecords
	}
	return 0
}

// XXX_OneofFuncs is for the internal use of the proto package.
func (*RetentionPolicy) XXX_OneofFuncs() (func(msg proto.Message, b *proto.Buffer) error, func(msg proto.Message, tag, wire int, b *proto.Buffer) (bool, error), func(msg proto.Message) (n int), []interface{}) {
	return _RetentionPolicy_OneofMarshaler, _RetentionPolicy_OneofUnmarshaler, _RetentionPolicy_OneofSizer, []interface{}{
		(*RetentionPolicy_MaxDays)(nil),
		(*RetentionPolicy_MaxRecords)(nil),
	}
}

func _RetentionPolicy_OneofMarshaler(msg proto.Message, b *proto.Buffer) error {
	m := msg.(*RetentionPolicy)
	// policy
	switch x := m.Policy.(type) {
	case *RetentionPolicy_MaxDays:
		b.EncodeVarint(1<<3 | proto.WireVarint)
		b.EncodeVarint(uint64(x.MaxDays))
	case *RetentionPolicy_MaxRecords:
		b.EncodeVarint(2<<3 | proto.WireVarint)
		b.EncodeVarint(uint64(x.MaxRecords))
	case nil:
	default:
		return fmt.Errorf("RetentionPolicy.Policy has unexpected type %T", x)
	}
	return nil
}

func _RetentionPolicy_OneofUnmarshaler(msg proto.Message, tag, wire int, b *proto.Buffer) (bool, error) {
	m := msg.(*RetentionPolicy)
	switch tag {
	case 1: // policy.max_days
		if wire != proto.WireVarint {
			return true, proto.ErrInternalBadWireType
		}
		x, err := b.DecodeVarint()
		m.Policy = &RetentionPolicy_MaxDays{int64(x)}
		return true, err
	case 2: // policy.max_records
		if wire != proto.WireVarint {
			return true, proto.ErrInternalBadWireType
		}
		x, err := b.DecodeVarint()
		m.Policy = &RetentionPolicy_MaxRecords{int64(x)}
		return true, err
	default:
		return false, nil
	}
}

func _RetentionPolicy_OneofSizer(msg proto.Message) (n int) {
	m := msg.(*RetentionPolicy)
	// policy
	switch x := m.Policy.(type) {
	case *RetentionPolicy_MaxDays:
		n += 1 // tag and wire
		n += proto.SizeVarint(uint64(x.MaxDays))
	case *RetentionPolicy_MaxRecords:
		n += 1 // tag and wire
		n += proto.SizeVarint(uint64(x.MaxRecords))
	case nil:
	default:
		panic(fmt.Sprintf("proto: unexpected type %T in oneof", x))
	}
	return n
}

func init() {
	proto.RegisterType((*DataTuple)(nil), "asgt.dataservice.v1alpha1.DataTuple")
	proto.RegisterType((*PredictedTuple)(nil), "asgt.dataservice.v1alpha1.PredictedTuple")
	proto.RegisterType((*DeleteRequest)(nil), "asgt.dataservice.v1alpha1.DeleteRequest")
	proto.RegisterType((*FeedbackRequest)(nil), "asgt.dataservice.v1alpha1.FeedbackRequest")
	proto.RegisterType((*FeedbackRequest_Entry)(nil), "asgt.dataservice.v1alpha1.FeedbackRequest.Entry")
	proto.RegisterType((*RetentionPolicy)(nil), "asgt.dataservice.v1alpha1.RetentionPolicy")
}

func init() {
	proto.RegisterFile("asgt/dataservice/v1alpha1/data.proto", fileDescriptor_data_77820d9e6ecf759e)
}

var fileDescriptor_data_77820d9e6ecf759e = []byte{
	// 371 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x7c, 0x52, 0x4d, 0x8f, 0xd3, 0x30,
	0x10, 0x25, 0x29, 0xdb, 0x6e, 0x26, 0xda, 0x5d, 0xc9, 0x42, 0x28, 0x80, 0x90, 0x4a, 0xb4, 0x87,
	0x3d, 0xa5, 0xb4, 0x9c, 0xb8, 0x56, 0x2d, 0x42, 0x3d, 0x55, 0x56, 0xc5, 0x01, 0x10, 0xd5, 0x34,
	0x1e, 0x95, 0x88, 0x7c, 0x61, 0x4f, 0xaa, 0xe6, 0x37, 0xf3, 0x27, 0x50, 0x9c, 0x04, 0x22, 0xc4,
	0xf6, 0xe6, 0x79, 0xf3, 0xe6, 0xbd, 0xf1, 0xb3, 0xe1, 0x1e, 0xcd, 0x91, 0x67, 0x0a, 0x19, 0x0d,
	0xe9, 0x53, 0x12, 0xd3, 0xec, 0x34, 0xc7, 0xb4, 0xfc, 0x8e, 0x73, 0x0b, 0x46, 0xa5, 0x2e, 0xb8,
	0x10, 0x2f, 0x1a, 0x56, 0x34, 0x60, 0x45, 0x3d, 0x2b, 0x7c, 0x0f, 0xde, 0x0a, 0x19, 0x77, 0x55,
	0x99, 0x92, 0x78, 0x0e, 0x63, 0x46, 0x7d, 0x24, 0x0e, 0x9c, 0xa9, 0xf3, 0xe0, 0xc9, 0xae, 0x12,
	0xcf, 0xe0, 0xea, 0x84, 0x69, 0x45, 0x81, 0x6b, 0xe1, 0xb6, 0x08, 0x37, 0x70, 0xbb, 0xd5, 0xa4,
	0x92, 0x98, 0x49, 0x5d, 0x9e, 0x9f, 0x82, 0x5f, 0xb6, 0xcc, 0xa4, 0xc8, 0x4d, 0xe0, 0x4e, 0x47,
	0x0f, 0x9e, 0x1c, 0x42, 0xe1, 0x57, 0xb8, 0x59, 0x51, 0x4a, 0x4c, 0x92, 0x7e, 0x56, 0x64, 0x58,
	0xbc, 0x06, 0xc8, 0x0a, 0x45, 0xe9, 0x9e, 0xeb, 0x92, 0x3a, 0x39, 0xcf, 0x22, 0xbb, 0xba, 0x24,
	0x11, 0xc0, 0xa4, 0xbd, 0x0e, 0x77, 0x3b, 0xf5, 0xa5, 0x10, 0xf0, 0x94, 0xf1, 0x68, 0x82, 0x91,
	0x35, 0xb1, 0xe7, 0xf0, 0x97, 0x03, 0x77, 0x1f, 0x88, 0xd4, 0x01, 0xe3, 0x1f, 0xbd, 0xc1, 0x40,
	0xc1, 0xf9, 0xbf, 0x82, 0xfb, 0x57, 0x41, 0x6c, 0x60, 0x42, 0x39, 0xeb, 0x84, 0x5a, 0x61, 0x7f,
	0xf1, 0x36, 0x7a, 0x34, 0xd3, 0xe8, 0x1f, 0xab, 0x68, 0x9d, 0xb3, 0xae, 0x65, 0x2f, 0xf0, 0xf2,
	0x1b, 0x5c, 0x59, 0x44, 0xdc, 0x82, 0x9b, 0xa8, 0xce, 0xdd, 0x4d, 0x94, 0x58, 0x83, 0xcf, 0xba,
	0xa2, 0xbd, 0x8d, 0xb7, 0xf5, 0xf7, 0x17, 0xf7, 0x17, 0x8c, 0xfe, 0xbc, 0x9c, 0x84, 0x66, 0xf0,
	0x93, 0x9d, 0x0b, 0xbf, 0xc0, 0x9d, 0x24, 0xa6, 0xbc, 0x49, 0x76, 0x5b, 0xa4, 0x49, 0x5c, 0x8b,
	0x57, 0x70, 0x9d, 0xe1, 0x79, 0xaf, 0xb0, 0x36, 0xd6, 0x6f, 0xf4, 0xf1, 0x89, 0x9c, 0x64, 0x78,
	0x5e, 0x61, 0x6d, 0xc4, 0x1b, 0xf0, 0x9b, 0xa6, 0xa6, 0xb8, 0xd0, 0xca, 0xd8, 0x3c, 0x9b, 0x3e,
	0x64, 0x78, 0x96, 0x2d, 0xb6, 0xbc, 0x86, 0x71, 0x69, 0x95, 0x96, 0x37, 0x9f, 0xfd, 0xc1, 0x2a,
	0x87, 0xb1, 0xfd, 0x60, 0xef, 0x7e, 0x07, 0x00, 0x00, 0xff, 0xff, 0x7d, 0x9c, 0xe8, 0x67, 0x88,
	0x02, 0x00, 0x00,
}
