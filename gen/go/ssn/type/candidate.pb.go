// Code generated by protoc-gen-go. DO NOT EDIT.
// source: ssn/type/candidate.proto

package _type

import proto "github.com/golang/protobuf/proto"
import fmt "fmt"
import math "math"
import wrappers "github.com/golang/protobuf/ptypes/wrappers"

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// This is a compile-time assertion to ensure that this generated file
// is compatible with the proto package it is being compiled against.
// A compilation error at this line likely means your copy of the
// proto package needs to be updated.
const _ = proto.ProtoPackageIsVersion2 // please upgrade the proto package

type Confidence_Level int32

const (
	Confidence_UNKNOWN   Confidence_Level = 0
	Confidence_VERY_LOW  Confidence_Level = 1
	Confidence_LOW       Confidence_Level = 2
	Confidence_MID       Confidence_Level = 3
	Confidence_HIGH      Confidence_Level = 4
	Confidence_VERY_HIGH Confidence_Level = 5
)

var Confidence_Level_name = map[int32]string{
	0: "UNKNOWN",
	1: "VERY_LOW",
	2: "LOW",
	3: "MID",
	4: "HIGH",
	5: "VERY_HIGH",
}
var Confidence_Level_value = map[string]int32{
	"UNKNOWN":   0,
	"VERY_LOW":  1,
	"LOW":       2,
	"MID":       3,
	"HIGH":      4,
	"VERY_HIGH": 5,
}

func (x Confidence_Level) String() string {
	return proto.EnumName(Confidence_Level_name, int32(x))
}
func (Confidence_Level) EnumDescriptor() ([]byte, []int) {
	return fileDescriptor_candidate_f752a14b9b6404b6, []int{0, 0}
}

type Candidate_Type int32

const (
	Candidate_UNKNOWN  Candidate_Type = 0
	Candidate_FIELD    Candidate_Type = 1
	Candidate_DOCUMENT Candidate_Type = 2
)

var Candidate_Type_name = map[int32]string{
	0: "UNKNOWN",
	1: "FIELD",
	2: "DOCUMENT",
}
var Candidate_Type_value = map[string]int32{
	"UNKNOWN":  0,
	"FIELD":    1,
	"DOCUMENT": 2,
}

func (x Candidate_Type) String() string {
	return proto.EnumName(Candidate_Type_name, int32(x))
}
func (Candidate_Type) EnumDescriptor() ([]byte, []int) {
	return fileDescriptor_candidate_f752a14b9b6404b6, []int{1, 0}
}

type Confidence struct {
	// A bucketized representation of confidence, which is intended to give clients
	// highly stable results across model upgrades.
	Level Confidence_Level `protobuf:"varint,1,opt,name=level,proto3,enum=ssn.type.Confidence_Level" json:"level,omitempty"`
	// The confidence value
	Value                *wrappers.FloatValue `protobuf:"bytes,2,opt,name=value,proto3" json:"value,omitempty"`
	XXX_NoUnkeyedLiteral struct{}             `json:"-"`
	XXX_unrecognized     []byte               `json:"-"`
	XXX_sizecache        int32                `json:"-"`
}

func (m *Confidence) Reset()         { *m = Confidence{} }
func (m *Confidence) String() string { return proto.CompactTextString(m) }
func (*Confidence) ProtoMessage()    {}
func (*Confidence) Descriptor() ([]byte, []int) {
	return fileDescriptor_candidate_f752a14b9b6404b6, []int{0}
}
func (m *Confidence) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Confidence.Unmarshal(m, b)
}
func (m *Confidence) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Confidence.Marshal(b, m, deterministic)
}
func (dst *Confidence) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Confidence.Merge(dst, src)
}
func (m *Confidence) XXX_Size() int {
	return xxx_messageInfo_Confidence.Size(m)
}
func (m *Confidence) XXX_DiscardUnknown() {
	xxx_messageInfo_Confidence.DiscardUnknown(m)
}

var xxx_messageInfo_Confidence proto.InternalMessageInfo

func (m *Confidence) GetLevel() Confidence_Level {
	if m != nil {
		return m.Level
	}
	return Confidence_UNKNOWN
}

func (m *Confidence) GetValue() *wrappers.FloatValue {
	if m != nil {
		return m.Value
	}
	return nil
}

type Candidate struct {
	// Normalized value 01-01-2019
	Value string `protobuf:"bytes,1,opt,name=value,proto3" json:"value,omitempty"`
	// The text as found on the document "1. Jan"
	// useful for overlays
	Text string `protobuf:"bytes,2,opt,name=text,proto3" json:"text,omitempty"`
	// Confidence
	Confidence *Confidence `protobuf:"bytes,3,opt,name=confidence,proto3" json:"confidence,omitempty"`
	// The bounding box for the block.
	// The vertices are in the order of top-left, top-right, bottom-right,
	// bottom-left. When a rotation of the bounding box is detected the rotation
	// is represented as around the top-left corner as defined when the text is
	// read in the 'natural' orientation.
	// For example:
	//
	// * when the text is horizontal it might look like:
	//
	//         0----1
	//         |    |
	//         3----2
	//
	// * when it's rotated 180 degrees around the top-left corner it becomes:
	//
	//         2----3
	//         |    |
	//         1----0
	//
	//   and the vertex order will still be (0, 1, 2, 3).
	BoundingBox *BoundingPoly `protobuf:"bytes,4,opt,name=bounding_box,json=boundingBox,proto3" json:"bounding_box,omitempty"`
	// Indicate the type of the candidate
	Type Candidate_Type `protobuf:"varint,5,opt,name=type,proto3,enum=ssn.type.Candidate_Type" json:"type,omitempty"`
	// A reference to the page where the candidate was found.
	// page_ref start from 1.
	PageRef              uint32   `protobuf:"varint,6,opt,name=page_ref,json=pageRef,proto3" json:"page_ref,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *Candidate) Reset()         { *m = Candidate{} }
func (m *Candidate) String() string { return proto.CompactTextString(m) }
func (*Candidate) ProtoMessage()    {}
func (*Candidate) Descriptor() ([]byte, []int) {
	return fileDescriptor_candidate_f752a14b9b6404b6, []int{1}
}
func (m *Candidate) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Candidate.Unmarshal(m, b)
}
func (m *Candidate) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Candidate.Marshal(b, m, deterministic)
}
func (dst *Candidate) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Candidate.Merge(dst, src)
}
func (m *Candidate) XXX_Size() int {
	return xxx_messageInfo_Candidate.Size(m)
}
func (m *Candidate) XXX_DiscardUnknown() {
	xxx_messageInfo_Candidate.DiscardUnknown(m)
}

var xxx_messageInfo_Candidate proto.InternalMessageInfo

func (m *Candidate) GetValue() string {
	if m != nil {
		return m.Value
	}
	return ""
}

func (m *Candidate) GetText() string {
	if m != nil {
		return m.Text
	}
	return ""
}

func (m *Candidate) GetConfidence() *Confidence {
	if m != nil {
		return m.Confidence
	}
	return nil
}

func (m *Candidate) GetBoundingBox() *BoundingPoly {
	if m != nil {
		return m.BoundingBox
	}
	return nil
}

func (m *Candidate) GetType() Candidate_Type {
	if m != nil {
		return m.Type
	}
	return Candidate_UNKNOWN
}

func (m *Candidate) GetPageRef() uint32 {
	if m != nil {
		return m.PageRef
	}
	return 0
}

type LineCandidate struct {
	// Text of the line without the amount
	// Example: "3 Dark and Stormy"
	Text string `protobuf:"bytes,1,opt,name=text,proto3" json:"text,omitempty"`
	// Normalized amount (price) of the line
	// Example: 300.0
	Amount float64 `protobuf:"fixed64,2,opt,name=amount,proto3" json:"amount,omitempty"`
	// A reference to the page where the line was found.
	// page_ref start from 1.
	PageRef              uint32   `protobuf:"varint,6,opt,name=page_ref,json=pageRef,proto3" json:"page_ref,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *LineCandidate) Reset()         { *m = LineCandidate{} }
func (m *LineCandidate) String() string { return proto.CompactTextString(m) }
func (*LineCandidate) ProtoMessage()    {}
func (*LineCandidate) Descriptor() ([]byte, []int) {
	return fileDescriptor_candidate_f752a14b9b6404b6, []int{2}
}
func (m *LineCandidate) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_LineCandidate.Unmarshal(m, b)
}
func (m *LineCandidate) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_LineCandidate.Marshal(b, m, deterministic)
}
func (dst *LineCandidate) XXX_Merge(src proto.Message) {
	xxx_messageInfo_LineCandidate.Merge(dst, src)
}
func (m *LineCandidate) XXX_Size() int {
	return xxx_messageInfo_LineCandidate.Size(m)
}
func (m *LineCandidate) XXX_DiscardUnknown() {
	xxx_messageInfo_LineCandidate.DiscardUnknown(m)
}

var xxx_messageInfo_LineCandidate proto.InternalMessageInfo

func (m *LineCandidate) GetText() string {
	if m != nil {
		return m.Text
	}
	return ""
}

func (m *LineCandidate) GetAmount() float64 {
	if m != nil {
		return m.Amount
	}
	return 0
}

func (m *LineCandidate) GetPageRef() uint32 {
	if m != nil {
		return m.PageRef
	}
	return 0
}

func init() {
	proto.RegisterType((*Confidence)(nil), "ssn.type.Confidence")
	proto.RegisterType((*Candidate)(nil), "ssn.type.Candidate")
	proto.RegisterType((*LineCandidate)(nil), "ssn.type.LineCandidate")
	proto.RegisterEnum("ssn.type.Confidence_Level", Confidence_Level_name, Confidence_Level_value)
	proto.RegisterEnum("ssn.type.Candidate_Type", Candidate_Type_name, Candidate_Type_value)
}

func init() { proto.RegisterFile("ssn/type/candidate.proto", fileDescriptor_candidate_f752a14b9b6404b6) }

var fileDescriptor_candidate_f752a14b9b6404b6 = []byte{
	// 426 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x7c, 0x91, 0xcd, 0x6e, 0xda, 0x40,
	0x10, 0xc7, 0xbb, 0x60, 0x03, 0x1e, 0x42, 0x65, 0xad, 0xa2, 0x74, 0x4b, 0xa5, 0x0a, 0xf9, 0xc4,
	0x21, 0x5a, 0xda, 0xb4, 0x97, 0x5e, 0xf9, 0x48, 0x83, 0xca, 0x47, 0xb5, 0x4a, 0x88, 0xda, 0x0b,
	0x32, 0x30, 0x58, 0x48, 0xce, 0xae, 0xe5, 0x8f, 0x14, 0x3f, 0x4c, 0xdf, 0xa5, 0x8f, 0x56, 0xed,
	0x1a, 0x03, 0x95, 0xaa, 0xdc, 0x66, 0x76, 0x7e, 0x3b, 0xf3, 0x9f, 0xff, 0x00, 0x4b, 0x12, 0xd9,
	0x4b, 0xf3, 0x08, 0x7b, 0x6b, 0x5f, 0x6e, 0x76, 0x1b, 0x3f, 0x45, 0x1e, 0xc5, 0x2a, 0x55, 0xb4,
	0x91, 0x24, 0x92, 0xeb, 0x4a, 0xfb, 0x7d, 0xa0, 0x54, 0x10, 0x62, 0xcf, 0xbc, 0xaf, 0xb2, 0x6d,
	0xef, 0x57, 0xec, 0x47, 0x11, 0xc6, 0x49, 0x41, 0xb6, 0xdf, 0x1c, 0x7b, 0x04, 0xa8, 0x9e, 0x30,
	0x8d, 0xf3, 0xa2, 0xe0, 0xfd, 0x21, 0x00, 0x03, 0x25, 0xb7, 0xbb, 0x0d, 0xca, 0x35, 0xd2, 0x0f,
	0x60, 0x87, 0xf8, 0x8c, 0x21, 0x23, 0x1d, 0xd2, 0x7d, 0x7d, 0xd3, 0xe6, 0xe5, 0x04, 0x7e, 0x82,
	0xf8, 0x44, 0x13, 0xa2, 0x00, 0xe9, 0x47, 0xb0, 0x9f, 0xfd, 0x30, 0x43, 0x56, 0xe9, 0x90, 0x6e,
	0xf3, 0xe6, 0x1d, 0x2f, 0x94, 0xf0, 0x52, 0x09, 0xbf, 0x0d, 0x95, 0x9f, 0x2e, 0x34, 0x22, 0x0a,
	0xd2, 0x9b, 0x82, 0x6d, 0x5a, 0xd0, 0x26, 0xd4, 0x1f, 0x66, 0xdf, 0x66, 0xf3, 0xc7, 0x99, 0xfb,
	0x8a, 0x5e, 0x40, 0x63, 0x31, 0x12, 0x3f, 0x96, 0x93, 0xf9, 0xa3, 0x4b, 0x68, 0x1d, 0xaa, 0x3a,
	0xa8, 0xe8, 0x60, 0x3a, 0x1e, 0xba, 0x55, 0xda, 0x00, 0xeb, 0x6e, 0xfc, 0xf5, 0xce, 0xb5, 0x68,
	0x0b, 0x1c, 0x43, 0x9a, 0xd4, 0xf6, 0x7e, 0x57, 0xc0, 0x19, 0x94, 0xce, 0xd0, 0xcb, 0x52, 0x8f,
	0xde, 0xc0, 0x39, 0x8c, 0xa4, 0x14, 0xac, 0x14, 0xf7, 0xa9, 0x11, 0xe9, 0x08, 0x13, 0xd3, 0xcf,
	0x00, 0xeb, 0xe3, 0x52, 0xac, 0x6a, 0xe4, 0x5f, 0xfe, 0x6f, 0x61, 0x71, 0xc6, 0xd1, 0x2f, 0x70,
	0xb1, 0x52, 0x99, 0xdc, 0xec, 0x64, 0xb0, 0x5c, 0xa9, 0x3d, 0xb3, 0xcc, 0xbf, 0xab, 0xd3, 0xbf,
	0xfe, 0xa1, 0xfa, 0x5d, 0x85, 0xb9, 0x68, 0x96, 0x6c, 0x5f, 0xed, 0xe9, 0x35, 0x58, 0x9a, 0x60,
	0xb6, 0xf1, 0x96, 0x9d, 0x8d, 0x3a, 0xde, 0xf5, 0x3e, 0x8f, 0x50, 0x18, 0x8a, 0xbe, 0x85, 0x46,
	0xe4, 0x07, 0xb8, 0x8c, 0x71, 0xcb, 0x6a, 0x1d, 0xd2, 0x6d, 0x89, 0xba, 0xce, 0x05, 0x6e, 0xbd,
	0x6b, 0xb0, 0x34, 0xf8, 0xaf, 0x7f, 0x0e, 0xd8, 0xb7, 0xe3, 0xd1, 0x64, 0xe8, 0x12, 0x6d, 0xe5,
	0x70, 0x3e, 0x78, 0x98, 0x8e, 0x66, 0xf7, 0x6e, 0xc5, 0x5b, 0x40, 0x6b, 0xb2, 0x93, 0x78, 0xb2,
	0xa8, 0x34, 0x83, 0x9c, 0x99, 0x71, 0x05, 0x35, 0xff, 0x49, 0x65, 0xb2, 0xb0, 0x88, 0x88, 0x43,
	0xf6, 0x82, 0x8a, 0x7e, 0xed, 0xa7, 0x11, 0xba, 0xaa, 0x99, 0x53, 0x7f, 0xfa, 0x1b, 0x00, 0x00,
	0xff, 0xff, 0xa4, 0x5a, 0x05, 0xc1, 0xa8, 0x02, 0x00, 0x00,
}
