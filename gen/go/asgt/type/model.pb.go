// Code generated by protoc-gen-go. DO NOT EDIT.
// source: asgt/type/model.proto

package _type

import proto "github.com/golang/protobuf/proto"
import fmt "fmt"
import math "math"
import _ "github.com/e-conomic/vmlapis/gen/go/gen_bq_schema"
import timestamp "github.com/golang/protobuf/ptypes/timestamp"

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// This is a compile-time assertion to ensure that this generated file
// is compatible with the proto package it is being compiled against.
// A compilation error at this line likely means your copy of the
// proto package needs to be updated.
const _ = proto.ProtoPackageIsVersion2 // please upgrade the proto package

type Model struct {
	Version              int64                `protobuf:"varint,3,opt,name=version,proto3" json:"version,omitempty"`
	CreatedAt            *timestamp.Timestamp `protobuf:"bytes,4,opt,name=created_at,json=createdAt,proto3" json:"created_at,omitempty"`
	XXX_NoUnkeyedLiteral struct{}             `json:"-"`
	XXX_unrecognized     []byte               `json:"-"`
	XXX_sizecache        int32                `json:"-"`
}

func (m *Model) Reset()         { *m = Model{} }
func (m *Model) String() string { return proto.CompactTextString(m) }
func (*Model) ProtoMessage()    {}
func (*Model) Descriptor() ([]byte, []int) {
	return fileDescriptor_model_5b4fd770c1f766b2, []int{0}
}
func (m *Model) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Model.Unmarshal(m, b)
}
func (m *Model) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Model.Marshal(b, m, deterministic)
}
func (dst *Model) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Model.Merge(dst, src)
}
func (m *Model) XXX_Size() int {
	return xxx_messageInfo_Model.Size(m)
}
func (m *Model) XXX_DiscardUnknown() {
	xxx_messageInfo_Model.DiscardUnknown(m)
}

var xxx_messageInfo_Model proto.InternalMessageInfo

func (m *Model) GetVersion() int64 {
	if m != nil {
		return m.Version
	}
	return 0
}

func (m *Model) GetCreatedAt() *timestamp.Timestamp {
	if m != nil {
		return m.CreatedAt
	}
	return nil
}

func init() {
	proto.RegisterType((*Model)(nil), "asgt.type.Model")
}

func init() { proto.RegisterFile("asgt/type/model.proto", fileDescriptor_model_5b4fd770c1f766b2) }

var fileDescriptor_model_5b4fd770c1f766b2 = []byte{
	// 195 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xe2, 0x12, 0x4d, 0x2c, 0x4e, 0x2f,
	0xd1, 0x2f, 0xa9, 0x2c, 0x48, 0xd5, 0xcf, 0xcd, 0x4f, 0x49, 0xcd, 0xd1, 0x2b, 0x28, 0xca, 0x2f,
	0xc9, 0x17, 0xe2, 0x04, 0x09, 0xeb, 0x81, 0x84, 0xa5, 0x64, 0xd2, 0x53, 0xf3, 0xe2, 0x93, 0x0a,
	0xe3, 0x8b, 0x93, 0x33, 0x52, 0x73, 0x13, 0xf5, 0x93, 0x0a, 0xe3, 0xd3, 0x32, 0x53, 0x73, 0x52,
	0x20, 0x0a, 0xa5, 0xe4, 0xd3, 0xf3, 0xf3, 0xd3, 0x73, 0x52, 0xf5, 0xc1, 0xbc, 0xa4, 0xd2, 0x34,
	0xfd, 0x92, 0xcc, 0xdc, 0xd4, 0xe2, 0x92, 0xc4, 0xdc, 0x02, 0x88, 0x02, 0xa5, 0x4c, 0x2e, 0x56,
	0x5f, 0x90, 0xc1, 0x42, 0xf2, 0x5c, 0xec, 0x65, 0xa9, 0x45, 0xc5, 0x99, 0xf9, 0x79, 0x12, 0xcc,
	0x0a, 0x8c, 0x1a, 0xcc, 0x4e, 0xac, 0xaf, 0xec, 0x99, 0x38, 0x18, 0x83, 0x60, 0xa2, 0x42, 0x96,
	0x5c, 0x5c, 0xc9, 0x45, 0xa9, 0x89, 0x25, 0xa9, 0x29, 0xf1, 0x89, 0x25, 0x12, 0x2c, 0x0a, 0x8c,
	0x1a, 0xdc, 0x46, 0x52, 0x7a, 0x10, 0xf3, 0xf5, 0x60, 0xe6, 0xeb, 0x85, 0xc0, 0xcc, 0x0f, 0xe2,
	0x84, 0xaa, 0x76, 0x2c, 0xf1, 0x62, 0xe1, 0x60, 0x14, 0x60, 0x76, 0x62, 0x8b, 0x62, 0x01, 0xb9,
	0x38, 0x89, 0x0d, 0xac, 0xd8, 0x18, 0x10, 0x00, 0x00, 0xff, 0xff, 0x07, 0x80, 0xf2, 0x79, 0xdc,
	0x00, 0x00, 0x00,
}
