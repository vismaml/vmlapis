// Code generated by protoc-gen-go. DO NOT EDIT.
// source: ovlservice/ovlservice.proto

package ssn

import proto "github.com/golang/protobuf/proto"
import fmt "fmt"
import math "math"

import (
	context "golang.org/x/net/context"
	grpc "google.golang.org/grpc"
)

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// This is a compile-time assertion to ensure that this generated file
// is compatible with the proto package it is being compiled against.
// A compilation error at this line likely means your copy of the
// proto package needs to be updated.
const _ = proto.ProtoPackageIsVersion2 // please upgrade the proto package

type PredictedField struct {
	Value                string   `protobuf:"bytes,1,opt,name=value,proto3" json:"value,omitempty"`
	Confidence           uint32   `protobuf:"varint,2,opt,name=confidence,proto3" json:"confidence,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *PredictedField) Reset()         { *m = PredictedField{} }
func (m *PredictedField) String() string { return proto.CompactTextString(m) }
func (*PredictedField) ProtoMessage()    {}
func (*PredictedField) Descriptor() ([]byte, []int) {
	return fileDescriptor_2a8dc8250c63b52e, []int{0}
}
func (m *PredictedField) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_PredictedField.Unmarshal(m, b)
}
func (m *PredictedField) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_PredictedField.Marshal(b, m, deterministic)
}
func (dst *PredictedField) XXX_Merge(src proto.Message) {
	xxx_messageInfo_PredictedField.Merge(dst, src)
}
func (m *PredictedField) XXX_Size() int {
	return xxx_messageInfo_PredictedField.Size(m)
}
func (m *PredictedField) XXX_DiscardUnknown() {
	xxx_messageInfo_PredictedField.DiscardUnknown(m)
}

var xxx_messageInfo_PredictedField proto.InternalMessageInfo

func (m *PredictedField) GetValue() string {
	if m != nil {
		return m.Value
	}
	return ""
}

func (m *PredictedField) GetConfidence() uint32 {
	if m != nil {
		return m.Confidence
	}
	return 0
}

type OvlRequest struct {
	Ocr                  string   `protobuf:"bytes,1,opt,name=ocr,proto3" json:"ocr,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *OvlRequest) Reset()         { *m = OvlRequest{} }
func (m *OvlRequest) String() string { return proto.CompactTextString(m) }
func (*OvlRequest) ProtoMessage()    {}
func (*OvlRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_2a8dc8250c63b52e, []int{1}
}
func (m *OvlRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_OvlRequest.Unmarshal(m, b)
}
func (m *OvlRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_OvlRequest.Marshal(b, m, deterministic)
}
func (dst *OvlRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_OvlRequest.Merge(dst, src)
}
func (m *OvlRequest) XXX_Size() int {
	return xxx_messageInfo_OvlRequest.Size(m)
}
func (m *OvlRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_OvlRequest.DiscardUnknown(m)
}

var xxx_messageInfo_OvlRequest proto.InternalMessageInfo

func (m *OvlRequest) GetOcr() string {
	if m != nil {
		return m.Ocr
	}
	return ""
}

type OvlResponse struct {
	OrderDate                *PredictedField `protobuf:"bytes,1,opt,name=orderDate,proto3" json:"orderDate,omitempty"`
	PaymentDueDate           *PredictedField `protobuf:"bytes,2,opt,name=paymentDueDate,proto3" json:"paymentDueDate,omitempty"`
	Currency                 *PredictedField `protobuf:"bytes,3,opt,name=currency,proto3" json:"currency,omitempty"`
	TotalVat                 *PredictedField `protobuf:"bytes,4,opt,name=totalVat,proto3" json:"totalVat,omitempty"`
	TotalInclVat             *PredictedField `protobuf:"bytes,5,opt,name=totalInclVat,proto3" json:"totalInclVat,omitempty"`
	TotalExclVat             *PredictedField `protobuf:"bytes,6,opt,name=totalExclVat,proto3" json:"totalExclVat,omitempty"`
	CorporateId              *PredictedField `protobuf:"bytes,7,opt,name=corporateId,proto3" json:"corporateId,omitempty"`
	CountryCode              *PredictedField `protobuf:"bytes,8,opt,name=countryCode,proto3" json:"countryCode,omitempty"`
	DocumentType             *PredictedField `protobuf:"bytes,9,opt,name=documentType,proto3" json:"documentType,omitempty"`
	PaymentMethod            *PredictedField `protobuf:"bytes,10,opt,name=paymentMethod,proto3" json:"paymentMethod,omitempty"`
	CreditCardLastFourDigits *PredictedField `protobuf:"bytes,11,opt,name=creditCardLastFourDigits,proto3" json:"creditCardLastFourDigits,omitempty"`
	// Types that are valid to be assigned to OcrLine:
	//	*OvlResponse_OcrDk
	//	*OvlResponse_OcrSe
	OcrLine isOvlResponse_OcrLine `protobuf_oneof:"ocrLine"`
	// Types that are valid to be assigned to VatDistribution:
	//	*OvlResponse_VatSe
	//	*OvlResponse_VatDk
	VatDistribution      isOvlResponse_VatDistribution `protobuf_oneof:"vatDistribution"`
	XXX_NoUnkeyedLiteral struct{}                      `json:"-"`
	XXX_unrecognized     []byte                        `json:"-"`
	XXX_sizecache        int32                         `json:"-"`
}

func (m *OvlResponse) Reset()         { *m = OvlResponse{} }
func (m *OvlResponse) String() string { return proto.CompactTextString(m) }
func (*OvlResponse) ProtoMessage()    {}
func (*OvlResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_2a8dc8250c63b52e, []int{2}
}
func (m *OvlResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_OvlResponse.Unmarshal(m, b)
}
func (m *OvlResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_OvlResponse.Marshal(b, m, deterministic)
}
func (dst *OvlResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_OvlResponse.Merge(dst, src)
}
func (m *OvlResponse) XXX_Size() int {
	return xxx_messageInfo_OvlResponse.Size(m)
}
func (m *OvlResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_OvlResponse.DiscardUnknown(m)
}

var xxx_messageInfo_OvlResponse proto.InternalMessageInfo

func (m *OvlResponse) GetOrderDate() *PredictedField {
	if m != nil {
		return m.OrderDate
	}
	return nil
}

func (m *OvlResponse) GetPaymentDueDate() *PredictedField {
	if m != nil {
		return m.PaymentDueDate
	}
	return nil
}

func (m *OvlResponse) GetCurrency() *PredictedField {
	if m != nil {
		return m.Currency
	}
	return nil
}

func (m *OvlResponse) GetTotalVat() *PredictedField {
	if m != nil {
		return m.TotalVat
	}
	return nil
}

func (m *OvlResponse) GetTotalInclVat() *PredictedField {
	if m != nil {
		return m.TotalInclVat
	}
	return nil
}

func (m *OvlResponse) GetTotalExclVat() *PredictedField {
	if m != nil {
		return m.TotalExclVat
	}
	return nil
}

func (m *OvlResponse) GetCorporateId() *PredictedField {
	if m != nil {
		return m.CorporateId
	}
	return nil
}

func (m *OvlResponse) GetCountryCode() *PredictedField {
	if m != nil {
		return m.CountryCode
	}
	return nil
}

func (m *OvlResponse) GetDocumentType() *PredictedField {
	if m != nil {
		return m.DocumentType
	}
	return nil
}

func (m *OvlResponse) GetPaymentMethod() *PredictedField {
	if m != nil {
		return m.PaymentMethod
	}
	return nil
}

func (m *OvlResponse) GetCreditCardLastFourDigits() *PredictedField {
	if m != nil {
		return m.CreditCardLastFourDigits
	}
	return nil
}

type isOvlResponse_OcrLine interface {
	isOvlResponse_OcrLine()
}

type OvlResponse_OcrDk struct {
	OcrDk *OvlResponse_OcrLineDk `protobuf:"bytes,12,opt,name=ocrDk,proto3,oneof"`
}

type OvlResponse_OcrSe struct {
	OcrSe *OvlResponse_OcrLineSe `protobuf:"bytes,13,opt,name=ocrSe,proto3,oneof"`
}

func (*OvlResponse_OcrDk) isOvlResponse_OcrLine() {}

func (*OvlResponse_OcrSe) isOvlResponse_OcrLine() {}

func (m *OvlResponse) GetOcrLine() isOvlResponse_OcrLine {
	if m != nil {
		return m.OcrLine
	}
	return nil
}

func (m *OvlResponse) GetOcrDk() *OvlResponse_OcrLineDk {
	if x, ok := m.GetOcrLine().(*OvlResponse_OcrDk); ok {
		return x.OcrDk
	}
	return nil
}

func (m *OvlResponse) GetOcrSe() *OvlResponse_OcrLineSe {
	if x, ok := m.GetOcrLine().(*OvlResponse_OcrSe); ok {
		return x.OcrSe
	}
	return nil
}

type isOvlResponse_VatDistribution interface {
	isOvlResponse_VatDistribution()
}

type OvlResponse_VatSe struct {
	VatSe *OvlResponse_VatDistributionSe `protobuf:"bytes,14,opt,name=vatSe,proto3,oneof"`
}

type OvlResponse_VatDk struct {
	VatDk *OvlResponse_VatDistributionDk `protobuf:"bytes,15,opt,name=vatDk,proto3,oneof"`
}

func (*OvlResponse_VatSe) isOvlResponse_VatDistribution() {}

func (*OvlResponse_VatDk) isOvlResponse_VatDistribution() {}

func (m *OvlResponse) GetVatDistribution() isOvlResponse_VatDistribution {
	if m != nil {
		return m.VatDistribution
	}
	return nil
}

func (m *OvlResponse) GetVatSe() *OvlResponse_VatDistributionSe {
	if x, ok := m.GetVatDistribution().(*OvlResponse_VatSe); ok {
		return x.VatSe
	}
	return nil
}

func (m *OvlResponse) GetVatDk() *OvlResponse_VatDistributionDk {
	if x, ok := m.GetVatDistribution().(*OvlResponse_VatDk); ok {
		return x.VatDk
	}
	return nil
}

// XXX_OneofFuncs is for the internal use of the proto package.
func (*OvlResponse) XXX_OneofFuncs() (func(msg proto.Message, b *proto.Buffer) error, func(msg proto.Message, tag, wire int, b *proto.Buffer) (bool, error), func(msg proto.Message) (n int), []interface{}) {
	return _OvlResponse_OneofMarshaler, _OvlResponse_OneofUnmarshaler, _OvlResponse_OneofSizer, []interface{}{
		(*OvlResponse_OcrDk)(nil),
		(*OvlResponse_OcrSe)(nil),
		(*OvlResponse_VatSe)(nil),
		(*OvlResponse_VatDk)(nil),
	}
}

func _OvlResponse_OneofMarshaler(msg proto.Message, b *proto.Buffer) error {
	m := msg.(*OvlResponse)
	// ocrLine
	switch x := m.OcrLine.(type) {
	case *OvlResponse_OcrDk:
		b.EncodeVarint(12<<3 | proto.WireBytes)
		if err := b.EncodeMessage(x.OcrDk); err != nil {
			return err
		}
	case *OvlResponse_OcrSe:
		b.EncodeVarint(13<<3 | proto.WireBytes)
		if err := b.EncodeMessage(x.OcrSe); err != nil {
			return err
		}
	case nil:
	default:
		return fmt.Errorf("OvlResponse.OcrLine has unexpected type %T", x)
	}
	// vatDistribution
	switch x := m.VatDistribution.(type) {
	case *OvlResponse_VatSe:
		b.EncodeVarint(14<<3 | proto.WireBytes)
		if err := b.EncodeMessage(x.VatSe); err != nil {
			return err
		}
	case *OvlResponse_VatDk:
		b.EncodeVarint(15<<3 | proto.WireBytes)
		if err := b.EncodeMessage(x.VatDk); err != nil {
			return err
		}
	case nil:
	default:
		return fmt.Errorf("OvlResponse.VatDistribution has unexpected type %T", x)
	}
	return nil
}

func _OvlResponse_OneofUnmarshaler(msg proto.Message, tag, wire int, b *proto.Buffer) (bool, error) {
	m := msg.(*OvlResponse)
	switch tag {
	case 12: // ocrLine.ocrDk
		if wire != proto.WireBytes {
			return true, proto.ErrInternalBadWireType
		}
		msg := new(OvlResponse_OcrLineDk)
		err := b.DecodeMessage(msg)
		m.OcrLine = &OvlResponse_OcrDk{msg}
		return true, err
	case 13: // ocrLine.ocrSe
		if wire != proto.WireBytes {
			return true, proto.ErrInternalBadWireType
		}
		msg := new(OvlResponse_OcrLineSe)
		err := b.DecodeMessage(msg)
		m.OcrLine = &OvlResponse_OcrSe{msg}
		return true, err
	case 14: // vatDistribution.vatSe
		if wire != proto.WireBytes {
			return true, proto.ErrInternalBadWireType
		}
		msg := new(OvlResponse_VatDistributionSe)
		err := b.DecodeMessage(msg)
		m.VatDistribution = &OvlResponse_VatSe{msg}
		return true, err
	case 15: // vatDistribution.vatDk
		if wire != proto.WireBytes {
			return true, proto.ErrInternalBadWireType
		}
		msg := new(OvlResponse_VatDistributionDk)
		err := b.DecodeMessage(msg)
		m.VatDistribution = &OvlResponse_VatDk{msg}
		return true, err
	default:
		return false, nil
	}
}

func _OvlResponse_OneofSizer(msg proto.Message) (n int) {
	m := msg.(*OvlResponse)
	// ocrLine
	switch x := m.OcrLine.(type) {
	case *OvlResponse_OcrDk:
		s := proto.Size(x.OcrDk)
		n += 1 // tag and wire
		n += proto.SizeVarint(uint64(s))
		n += s
	case *OvlResponse_OcrSe:
		s := proto.Size(x.OcrSe)
		n += 1 // tag and wire
		n += proto.SizeVarint(uint64(s))
		n += s
	case nil:
	default:
		panic(fmt.Sprintf("proto: unexpected type %T in oneof", x))
	}
	// vatDistribution
	switch x := m.VatDistribution.(type) {
	case *OvlResponse_VatSe:
		s := proto.Size(x.VatSe)
		n += 1 // tag and wire
		n += proto.SizeVarint(uint64(s))
		n += s
	case *OvlResponse_VatDk:
		s := proto.Size(x.VatDk)
		n += 1 // tag and wire
		n += proto.SizeVarint(uint64(s))
		n += s
	case nil:
	default:
		panic(fmt.Sprintf("proto: unexpected type %T in oneof", x))
	}
	return n
}

type OvlResponse_OcrLineDk struct {
	Type                 *PredictedField `protobuf:"bytes,1,opt,name=type,proto3" json:"type,omitempty"`
	PaymentId            *PredictedField `protobuf:"bytes,2,opt,name=paymentId,proto3" json:"paymentId,omitempty"`
	CreditorId           *PredictedField `protobuf:"bytes,3,opt,name=creditorId,proto3" json:"creditorId,omitempty"`
	XXX_NoUnkeyedLiteral struct{}        `json:"-"`
	XXX_unrecognized     []byte          `json:"-"`
	XXX_sizecache        int32           `json:"-"`
}

func (m *OvlResponse_OcrLineDk) Reset()         { *m = OvlResponse_OcrLineDk{} }
func (m *OvlResponse_OcrLineDk) String() string { return proto.CompactTextString(m) }
func (*OvlResponse_OcrLineDk) ProtoMessage()    {}
func (*OvlResponse_OcrLineDk) Descriptor() ([]byte, []int) {
	return fileDescriptor_2a8dc8250c63b52e, []int{2, 0}
}
func (m *OvlResponse_OcrLineDk) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_OvlResponse_OcrLineDk.Unmarshal(m, b)
}
func (m *OvlResponse_OcrLineDk) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_OvlResponse_OcrLineDk.Marshal(b, m, deterministic)
}
func (dst *OvlResponse_OcrLineDk) XXX_Merge(src proto.Message) {
	xxx_messageInfo_OvlResponse_OcrLineDk.Merge(dst, src)
}
func (m *OvlResponse_OcrLineDk) XXX_Size() int {
	return xxx_messageInfo_OvlResponse_OcrLineDk.Size(m)
}
func (m *OvlResponse_OcrLineDk) XXX_DiscardUnknown() {
	xxx_messageInfo_OvlResponse_OcrLineDk.DiscardUnknown(m)
}

var xxx_messageInfo_OvlResponse_OcrLineDk proto.InternalMessageInfo

func (m *OvlResponse_OcrLineDk) GetType() *PredictedField {
	if m != nil {
		return m.Type
	}
	return nil
}

func (m *OvlResponse_OcrLineDk) GetPaymentId() *PredictedField {
	if m != nil {
		return m.PaymentId
	}
	return nil
}

func (m *OvlResponse_OcrLineDk) GetCreditorId() *PredictedField {
	if m != nil {
		return m.CreditorId
	}
	return nil
}

type OvlResponse_OcrLineSe struct {
	PaymentId            *PredictedField `protobuf:"bytes,1,opt,name=paymentId,proto3" json:"paymentId,omitempty"`
	XXX_NoUnkeyedLiteral struct{}        `json:"-"`
	XXX_unrecognized     []byte          `json:"-"`
	XXX_sizecache        int32           `json:"-"`
}

func (m *OvlResponse_OcrLineSe) Reset()         { *m = OvlResponse_OcrLineSe{} }
func (m *OvlResponse_OcrLineSe) String() string { return proto.CompactTextString(m) }
func (*OvlResponse_OcrLineSe) ProtoMessage()    {}
func (*OvlResponse_OcrLineSe) Descriptor() ([]byte, []int) {
	return fileDescriptor_2a8dc8250c63b52e, []int{2, 1}
}
func (m *OvlResponse_OcrLineSe) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_OvlResponse_OcrLineSe.Unmarshal(m, b)
}
func (m *OvlResponse_OcrLineSe) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_OvlResponse_OcrLineSe.Marshal(b, m, deterministic)
}
func (dst *OvlResponse_OcrLineSe) XXX_Merge(src proto.Message) {
	xxx_messageInfo_OvlResponse_OcrLineSe.Merge(dst, src)
}
func (m *OvlResponse_OcrLineSe) XXX_Size() int {
	return xxx_messageInfo_OvlResponse_OcrLineSe.Size(m)
}
func (m *OvlResponse_OcrLineSe) XXX_DiscardUnknown() {
	xxx_messageInfo_OvlResponse_OcrLineSe.DiscardUnknown(m)
}

var xxx_messageInfo_OvlResponse_OcrLineSe proto.InternalMessageInfo

func (m *OvlResponse_OcrLineSe) GetPaymentId() *PredictedField {
	if m != nil {
		return m.PaymentId
	}
	return nil
}

type OvlResponse_VatDistributionDk struct {
	VatDistributionDk25  *PredictedField `protobuf:"bytes,1,opt,name=vatDistributionDk25,proto3" json:"vatDistributionDk25,omitempty"`
	XXX_NoUnkeyedLiteral struct{}        `json:"-"`
	XXX_unrecognized     []byte          `json:"-"`
	XXX_sizecache        int32           `json:"-"`
}

func (m *OvlResponse_VatDistributionDk) Reset()         { *m = OvlResponse_VatDistributionDk{} }
func (m *OvlResponse_VatDistributionDk) String() string { return proto.CompactTextString(m) }
func (*OvlResponse_VatDistributionDk) ProtoMessage()    {}
func (*OvlResponse_VatDistributionDk) Descriptor() ([]byte, []int) {
	return fileDescriptor_2a8dc8250c63b52e, []int{2, 2}
}
func (m *OvlResponse_VatDistributionDk) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_OvlResponse_VatDistributionDk.Unmarshal(m, b)
}
func (m *OvlResponse_VatDistributionDk) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_OvlResponse_VatDistributionDk.Marshal(b, m, deterministic)
}
func (dst *OvlResponse_VatDistributionDk) XXX_Merge(src proto.Message) {
	xxx_messageInfo_OvlResponse_VatDistributionDk.Merge(dst, src)
}
func (m *OvlResponse_VatDistributionDk) XXX_Size() int {
	return xxx_messageInfo_OvlResponse_VatDistributionDk.Size(m)
}
func (m *OvlResponse_VatDistributionDk) XXX_DiscardUnknown() {
	xxx_messageInfo_OvlResponse_VatDistributionDk.DiscardUnknown(m)
}

var xxx_messageInfo_OvlResponse_VatDistributionDk proto.InternalMessageInfo

func (m *OvlResponse_VatDistributionDk) GetVatDistributionDk25() *PredictedField {
	if m != nil {
		return m.VatDistributionDk25
	}
	return nil
}

type OvlResponse_VatDistributionSe struct {
	VatDistributionSe12  *PredictedField `protobuf:"bytes,1,opt,name=vatDistributionSe12,proto3" json:"vatDistributionSe12,omitempty"`
	VatDistributionSe25  *PredictedField `protobuf:"bytes,2,opt,name=vatDistributionSe25,proto3" json:"vatDistributionSe25,omitempty"`
	XXX_NoUnkeyedLiteral struct{}        `json:"-"`
	XXX_unrecognized     []byte          `json:"-"`
	XXX_sizecache        int32           `json:"-"`
}

func (m *OvlResponse_VatDistributionSe) Reset()         { *m = OvlResponse_VatDistributionSe{} }
func (m *OvlResponse_VatDistributionSe) String() string { return proto.CompactTextString(m) }
func (*OvlResponse_VatDistributionSe) ProtoMessage()    {}
func (*OvlResponse_VatDistributionSe) Descriptor() ([]byte, []int) {
	return fileDescriptor_2a8dc8250c63b52e, []int{2, 3}
}
func (m *OvlResponse_VatDistributionSe) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_OvlResponse_VatDistributionSe.Unmarshal(m, b)
}
func (m *OvlResponse_VatDistributionSe) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_OvlResponse_VatDistributionSe.Marshal(b, m, deterministic)
}
func (dst *OvlResponse_VatDistributionSe) XXX_Merge(src proto.Message) {
	xxx_messageInfo_OvlResponse_VatDistributionSe.Merge(dst, src)
}
func (m *OvlResponse_VatDistributionSe) XXX_Size() int {
	return xxx_messageInfo_OvlResponse_VatDistributionSe.Size(m)
}
func (m *OvlResponse_VatDistributionSe) XXX_DiscardUnknown() {
	xxx_messageInfo_OvlResponse_VatDistributionSe.DiscardUnknown(m)
}

var xxx_messageInfo_OvlResponse_VatDistributionSe proto.InternalMessageInfo

func (m *OvlResponse_VatDistributionSe) GetVatDistributionSe12() *PredictedField {
	if m != nil {
		return m.VatDistributionSe12
	}
	return nil
}

func (m *OvlResponse_VatDistributionSe) GetVatDistributionSe25() *PredictedField {
	if m != nil {
		return m.VatDistributionSe25
	}
	return nil
}

func init() {
	proto.RegisterType((*PredictedField)(nil), "ssn.PredictedField")
	proto.RegisterType((*OvlRequest)(nil), "ssn.OvlRequest")
	proto.RegisterType((*OvlResponse)(nil), "ssn.OvlResponse")
	proto.RegisterType((*OvlResponse_OcrLineDk)(nil), "ssn.OvlResponse.OcrLineDk")
	proto.RegisterType((*OvlResponse_OcrLineSe)(nil), "ssn.OvlResponse.OcrLineSe")
	proto.RegisterType((*OvlResponse_VatDistributionDk)(nil), "ssn.OvlResponse.VatDistributionDk")
	proto.RegisterType((*OvlResponse_VatDistributionSe)(nil), "ssn.OvlResponse.VatDistributionSe")
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConn

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion4

// OvlServiceClient is the client API for OvlService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type OvlServiceClient interface {
	GetPrediction(ctx context.Context, in *OvlRequest, opts ...grpc.CallOption) (*OvlResponse, error)
}

type ovlServiceClient struct {
	cc *grpc.ClientConn
}

func NewOvlServiceClient(cc *grpc.ClientConn) OvlServiceClient {
	return &ovlServiceClient{cc}
}

func (c *ovlServiceClient) GetPrediction(ctx context.Context, in *OvlRequest, opts ...grpc.CallOption) (*OvlResponse, error) {
	out := new(OvlResponse)
	err := c.cc.Invoke(ctx, "/ssn.OvlService/GetPrediction", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// OvlServiceServer is the server API for OvlService service.
type OvlServiceServer interface {
	GetPrediction(context.Context, *OvlRequest) (*OvlResponse, error)
}

func RegisterOvlServiceServer(s *grpc.Server, srv OvlServiceServer) {
	s.RegisterService(&_OvlService_serviceDesc, srv)
}

func _OvlService_GetPrediction_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(OvlRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(OvlServiceServer).GetPrediction(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/ssn.OvlService/GetPrediction",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(OvlServiceServer).GetPrediction(ctx, req.(*OvlRequest))
	}
	return interceptor(ctx, in, info, handler)
}

var _OvlService_serviceDesc = grpc.ServiceDesc{
	ServiceName: "ssn.OvlService",
	HandlerType: (*OvlServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "GetPrediction",
			Handler:    _OvlService_GetPrediction_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "ovlservice/ovlservice.proto",
}

func init() { proto.RegisterFile("ovlservice/ovlservice.proto", fileDescriptor_2a8dc8250c63b52e) }

var fileDescriptor_2a8dc8250c63b52e = []byte{
	// 564 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x94, 0x95, 0x5f, 0x6f, 0xd3, 0x3c,
	0x14, 0x87, 0x97, 0x75, 0xdd, 0xd6, 0xd3, 0xb5, 0xdd, 0xbc, 0xf7, 0xc2, 0xca, 0x2b, 0x4d, 0x53,
	0x6f, 0xd8, 0x55, 0xa7, 0x65, 0x54, 0x08, 0x90, 0xb8, 0xe8, 0xb2, 0xb2, 0x4a, 0x43, 0x45, 0x09,
	0xda, 0x05, 0x77, 0x99, 0x7d, 0x80, 0xa8, 0xc5, 0x2e, 0xb6, 0x53, 0xd1, 0xef, 0xc2, 0x0d, 0x1f,
	0x8d, 0x6f, 0x82, 0xe2, 0x84, 0xfe, 0x4f, 0x18, 0x77, 0x6e, 0xf4, 0x3c, 0x3f, 0x9f, 0x9c, 0xf8,
	0xb8, 0xf0, 0xbf, 0x9c, 0x8e, 0x35, 0xaa, 0x69, 0xcc, 0xf0, 0x72, 0xb1, 0xec, 0x4c, 0x94, 0x34,
	0x92, 0x54, 0xb4, 0x16, 0xed, 0x3e, 0x34, 0xdf, 0x2b, 0xe4, 0x31, 0x33, 0xc8, 0xfb, 0x31, 0x8e,
	0x39, 0xf9, 0x0f, 0xaa, 0xd3, 0x68, 0x9c, 0x20, 0x75, 0xce, 0x9d, 0x8b, 0x5a, 0x90, 0xfd, 0x20,
	0x67, 0x00, 0x4c, 0x8a, 0x4f, 0x31, 0x47, 0xc1, 0x90, 0xee, 0x9e, 0x3b, 0x17, 0x8d, 0x60, 0xe9,
	0x49, 0xfb, 0x0c, 0x60, 0x38, 0x1d, 0x07, 0xf8, 0x2d, 0x41, 0x6d, 0xc8, 0x31, 0x54, 0x24, 0x53,
	0x79, 0x42, 0xba, 0x6c, 0xff, 0x02, 0xa8, 0x5b, 0x40, 0x4f, 0xa4, 0xd0, 0x48, 0xae, 0xa0, 0x26,
	0x15, 0x47, 0xe5, 0x47, 0x26, 0xdb, 0xa9, 0xee, 0x9d, 0x76, 0xb4, 0x16, 0x9d, 0xd5, 0x6a, 0x82,
	0x05, 0x45, 0x5e, 0x43, 0x73, 0x12, 0xcd, 0xbe, 0xa2, 0x30, 0x7e, 0x82, 0xd6, 0xdb, 0x2d, 0xf6,
	0xd6, 0x50, 0x72, 0x09, 0x87, 0x2c, 0x51, 0x0a, 0x05, 0x9b, 0xd1, 0x4a, 0xb1, 0x36, 0x87, 0x52,
	0xc1, 0x48, 0x13, 0x8d, 0x1f, 0x22, 0x43, 0xf7, 0x4a, 0x84, 0x3f, 0x10, 0x79, 0x01, 0x47, 0x76,
	0x3d, 0x10, 0xcc, 0x4a, 0xd5, 0x62, 0x69, 0x05, 0x9c, 0x8b, 0xb7, 0xdf, 0x33, 0x71, 0xff, 0x6f,
	0x62, 0x0e, 0x92, 0x2e, 0xd4, 0x99, 0x54, 0x13, 0xa9, 0x22, 0x83, 0x03, 0x4e, 0x0f, 0x8a, 0xbd,
	0x65, 0x2e, 0xd3, 0x12, 0x61, 0xd4, 0xec, 0x46, 0x72, 0xa4, 0x87, 0xa5, 0xda, 0x9c, 0x4b, 0xcb,
	0xe4, 0x92, 0x25, 0x69, 0x53, 0x3f, 0xcc, 0x26, 0x48, 0x6b, 0x25, 0x65, 0x2e, 0x83, 0xe4, 0x25,
	0x34, 0xf2, 0x8f, 0xf1, 0x0e, 0xcd, 0x17, 0xc9, 0x29, 0x14, 0x9b, 0xab, 0x24, 0x19, 0x02, 0x65,
	0x29, 0x60, 0x6e, 0x22, 0xc5, 0xef, 0x23, 0x6d, 0xfa, 0x32, 0x51, 0x7e, 0xfc, 0x39, 0x36, 0x9a,
	0xd6, 0x8b, 0x53, 0x0a, 0x25, 0xe2, 0x41, 0x55, 0x32, 0xe5, 0x8f, 0xe8, 0x91, 0xb5, 0x5d, 0x6b,
	0x2f, 0x9d, 0xcb, 0xce, 0x90, 0xa9, 0xfb, 0x58, 0xa0, 0x3f, 0xba, 0xdb, 0x09, 0x32, 0x34, 0x77,
	0x42, 0xa4, 0x8d, 0x72, 0x27, 0xc4, 0xdc, 0x09, 0x91, 0xbc, 0x4a, 0x87, 0xc8, 0x84, 0x48, 0x9b,
	0xd6, 0x69, 0x6f, 0x38, 0x0f, 0x91, 0xf1, 0x63, 0x6d, 0x54, 0xfc, 0x98, 0x98, 0x58, 0x8a, 0x10,
	0xef, 0x9c, 0x20, 0x53, 0x72, 0xd7, 0x1f, 0xd1, 0xd6, 0xd3, 0x5c, 0x7f, 0x94, 0xbb, 0xfe, 0xc8,
	0xfd, 0xe1, 0x40, 0x6d, 0xfe, 0x0a, 0xe4, 0x19, 0xec, 0x99, 0xf4, 0x53, 0x95, 0xcc, 0x97, 0x05,
	0xd2, 0x69, 0xcc, 0x1b, 0x3f, 0xe0, 0x65, 0x53, 0xb5, 0xa0, 0xc8, 0x35, 0x40, 0xd6, 0x65, 0xa9,
	0x06, 0xbc, 0x6c, 0xa4, 0x96, 0x30, 0xf7, 0xcd, 0xbc, 0xba, 0x70, 0x6d, 0x53, 0xe7, 0x29, 0x9b,
	0xba, 0x1f, 0xe1, 0x64, 0xe3, 0xe5, 0xc9, 0x2d, 0x9c, 0x4e, 0xd7, 0x1f, 0x7a, 0xdd, 0xb2, 0xc4,
	0x6d, 0xbc, 0xfb, 0xd3, 0xd9, 0x08, 0x0f, 0x71, 0x4b, 0x78, 0x88, 0x57, 0xde, 0xbf, 0x84, 0xa7,
	0xfc, 0xd6, 0x18, 0xaf, 0x5b, 0xd6, 0xea, 0x6d, 0x7c, 0xaf, 0x06, 0x07, 0x32, 0xeb, 0x5f, 0xef,
	0x04, 0x5a, 0x6b, 0x84, 0xd7, 0xb3, 0x77, 0x70, 0x98, 0x5d, 0xf2, 0xe4, 0x39, 0x34, 0xde, 0xa2,
	0xc9, 0x53, 0x63, 0x29, 0x48, 0x6b, 0x71, 0x90, 0xec, 0x2d, 0xed, 0x1e, 0xaf, 0x9f, 0xac, 0xf6,
	0xce, 0xe3, 0xbe, 0xfd, 0x6f, 0xb8, 0xfe, 0x1d, 0x00, 0x00, 0xff, 0xff, 0x52, 0xda, 0x1b, 0x41,
	0x3a, 0x06, 0x00, 0x00,
}
