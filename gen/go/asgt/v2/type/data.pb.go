// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.1
// 	protoc        (unknown)
// source: asgt/v2/type/data.proto

package asgttype

import (
	_ "github.com/envoyproxy/protoc-gen-validate/validate"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	timestamppb "google.golang.org/protobuf/types/known/timestamppb"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

// Used in scanned-invoice requests.
type Invoice struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Invoice text from the SmartScan product.
	Text string `protobuf:"bytes,1,opt,name=text,proto3" json:"text,omitempty"`
}

func (x *Invoice) Reset() {
	*x = Invoice{}
	if protoimpl.UnsafeEnabled {
		mi := &file_asgt_v2_type_data_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Invoice) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Invoice) ProtoMessage() {}

func (x *Invoice) ProtoReflect() protoreflect.Message {
	mi := &file_asgt_v2_type_data_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Invoice.ProtoReflect.Descriptor instead.
func (*Invoice) Descriptor() ([]byte, []int) {
	return file_asgt_v2_type_data_proto_rawDescGZIP(), []int{0}
}

func (x *Invoice) GetText() string {
	if x != nil {
		return x.Text
	}
	return ""
}

// Used in bank requests.
type Transaction struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Text of the bank transaction.
	Text string `protobuf:"bytes,1,opt,name=text,proto3" json:"text,omitempty"`
	// Amount of the transaction.
	Amount float32 `protobuf:"fixed32,2,opt,name=amount,proto3" json:"amount,omitempty"`
}

func (x *Transaction) Reset() {
	*x = Transaction{}
	if protoimpl.UnsafeEnabled {
		mi := &file_asgt_v2_type_data_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Transaction) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Transaction) ProtoMessage() {}

func (x *Transaction) ProtoReflect() protoreflect.Message {
	mi := &file_asgt_v2_type_data_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Transaction.ProtoReflect.Descriptor instead.
func (*Transaction) Descriptor() ([]byte, []int) {
	return file_asgt_v2_type_data_proto_rawDescGZIP(), []int{1}
}

func (x *Transaction) GetText() string {
	if x != nil {
		return x.Text
	}
	return ""
}

func (x *Transaction) GetAmount() float32 {
	if x != nil {
		return x.Amount
	}
	return 0
}

// Used in electronic-invoice-line requests.
type InvoiceLine struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Id of the product (item).
	ItemId string `protobuf:"bytes,1,opt,name=item_id,json=itemId,proto3" json:"item_id,omitempty"`
	// Text of the invoice line.
	Text      string                 `protobuf:"bytes,2,opt,name=text,proto3" json:"text,omitempty"`
	IssueDate *timestamppb.Timestamp `protobuf:"bytes,3,opt,name=issue_date,json=issueDate,proto3" json:"issue_date,omitempty"`
	// Supplier of the invoice.
	Supplier *Supplier `protobuf:"bytes,4,opt,name=supplier,proto3" json:"supplier,omitempty"`
	// reference to the customer.
	CustomerRef string `protobuf:"bytes,5,opt,name=customer_ref,json=customerRef,proto3" json:"customer_ref,omitempty"`
	// Amount of the invoice line.
	Amount float32 `protobuf:"fixed32,7,opt,name=amount,proto3" json:"amount,omitempty"`
}

func (x *InvoiceLine) Reset() {
	*x = InvoiceLine{}
	if protoimpl.UnsafeEnabled {
		mi := &file_asgt_v2_type_data_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *InvoiceLine) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*InvoiceLine) ProtoMessage() {}

func (x *InvoiceLine) ProtoReflect() protoreflect.Message {
	mi := &file_asgt_v2_type_data_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use InvoiceLine.ProtoReflect.Descriptor instead.
func (*InvoiceLine) Descriptor() ([]byte, []int) {
	return file_asgt_v2_type_data_proto_rawDescGZIP(), []int{2}
}

func (x *InvoiceLine) GetItemId() string {
	if x != nil {
		return x.ItemId
	}
	return ""
}

func (x *InvoiceLine) GetText() string {
	if x != nil {
		return x.Text
	}
	return ""
}

func (x *InvoiceLine) GetIssueDate() *timestamppb.Timestamp {
	if x != nil {
		return x.IssueDate
	}
	return nil
}

func (x *InvoiceLine) GetSupplier() *Supplier {
	if x != nil {
		return x.Supplier
	}
	return nil
}

func (x *InvoiceLine) GetCustomerRef() string {
	if x != nil {
		return x.CustomerRef
	}
	return ""
}

func (x *InvoiceLine) GetAmount() float32 {
	if x != nil {
		return x.Amount
	}
	return 0
}

type Supplier struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Id of the supplier; not nullable.
	Id string `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	// Name of the supplier.
	Name string `protobuf:"bytes,2,opt,name=name,proto3" json:"name,omitempty"`
	// Global ID of the supplier.
	GlobalId string `protobuf:"bytes,3,opt,name=global_id,json=globalId,proto3" json:"global_id,omitempty"`
}

func (x *Supplier) Reset() {
	*x = Supplier{}
	if protoimpl.UnsafeEnabled {
		mi := &file_asgt_v2_type_data_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Supplier) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Supplier) ProtoMessage() {}

func (x *Supplier) ProtoReflect() protoreflect.Message {
	mi := &file_asgt_v2_type_data_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Supplier.ProtoReflect.Descriptor instead.
func (*Supplier) Descriptor() ([]byte, []int) {
	return file_asgt_v2_type_data_proto_rawDescGZIP(), []int{3}
}

func (x *Supplier) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

func (x *Supplier) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *Supplier) GetGlobalId() string {
	if x != nil {
		return x.GlobalId
	}
	return ""
}

// Specifies data structure for dataset creation. Only one of Transaction, Invoice, InvoiceLine
// structures can be used at a time.
type Data struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Types that are assignable to DataStructure:
	//	*Data_Transaction
	//	*Data_Invoice
	//	*Data_InvoiceLine
	DataStructure isData_DataStructure `protobuf_oneof:"data_structure"`
}

func (x *Data) Reset() {
	*x = Data{}
	if protoimpl.UnsafeEnabled {
		mi := &file_asgt_v2_type_data_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Data) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Data) ProtoMessage() {}

func (x *Data) ProtoReflect() protoreflect.Message {
	mi := &file_asgt_v2_type_data_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Data.ProtoReflect.Descriptor instead.
func (*Data) Descriptor() ([]byte, []int) {
	return file_asgt_v2_type_data_proto_rawDescGZIP(), []int{4}
}

func (m *Data) GetDataStructure() isData_DataStructure {
	if m != nil {
		return m.DataStructure
	}
	return nil
}

func (x *Data) GetTransaction() *Transaction {
	if x, ok := x.GetDataStructure().(*Data_Transaction); ok {
		return x.Transaction
	}
	return nil
}

func (x *Data) GetInvoice() *Invoice {
	if x, ok := x.GetDataStructure().(*Data_Invoice); ok {
		return x.Invoice
	}
	return nil
}

func (x *Data) GetInvoiceLine() *InvoiceLine {
	if x, ok := x.GetDataStructure().(*Data_InvoiceLine); ok {
		return x.InvoiceLine
	}
	return nil
}

type isData_DataStructure interface {
	isData_DataStructure()
}

type Data_Transaction struct {
	// Transaction-level information; at this time used only with bank transactions
	Transaction *Transaction `protobuf:"bytes,1,opt,name=transaction,proto3,oneof"`
}

type Data_Invoice struct {
	// Invoice-level information for e-invoices and scanned invoices and receipts
	Invoice *Invoice `protobuf:"bytes,2,opt,name=invoice,proto3,oneof"`
}

type Data_InvoiceLine struct {
	// Line-level information for e-invoices; use one sample per invoice line
	InvoiceLine *InvoiceLine `protobuf:"bytes,3,opt,name=invoice_line,json=invoiceLine,proto3,oneof"`
}

func (*Data_Transaction) isData_DataStructure() {}

func (*Data_Invoice) isData_DataStructure() {}

func (*Data_InvoiceLine) isData_DataStructure() {}

var File_asgt_v2_type_data_proto protoreflect.FileDescriptor

var file_asgt_v2_type_data_proto_rawDesc = []byte{
	0x0a, 0x17, 0x61, 0x73, 0x67, 0x74, 0x2f, 0x76, 0x32, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x2f, 0x64,
	0x61, 0x74, 0x61, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0c, 0x61, 0x73, 0x67, 0x74, 0x2e,
	0x76, 0x32, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x1a, 0x1f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x74, 0x69, 0x6d, 0x65, 0x73, 0x74, 0x61,
	0x6d, 0x70, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x17, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61,
	0x74, 0x65, 0x2f, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x22, 0x1d, 0x0a, 0x07, 0x49, 0x6e, 0x76, 0x6f, 0x69, 0x63, 0x65, 0x12, 0x12, 0x0a, 0x04,
	0x74, 0x65, 0x78, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x74, 0x65, 0x78, 0x74,
	0x22, 0x39, 0x0a, 0x0b, 0x54, 0x72, 0x61, 0x6e, 0x73, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x12,
	0x12, 0x0a, 0x04, 0x74, 0x65, 0x78, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x74,
	0x65, 0x78, 0x74, 0x12, 0x16, 0x0a, 0x06, 0x61, 0x6d, 0x6f, 0x75, 0x6e, 0x74, 0x18, 0x02, 0x20,
	0x01, 0x28, 0x02, 0x52, 0x06, 0x61, 0x6d, 0x6f, 0x75, 0x6e, 0x74, 0x22, 0xe4, 0x01, 0x0a, 0x0b,
	0x49, 0x6e, 0x76, 0x6f, 0x69, 0x63, 0x65, 0x4c, 0x69, 0x6e, 0x65, 0x12, 0x17, 0x0a, 0x07, 0x69,
	0x74, 0x65, 0x6d, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x06, 0x69, 0x74,
	0x65, 0x6d, 0x49, 0x64, 0x12, 0x12, 0x0a, 0x04, 0x74, 0x65, 0x78, 0x74, 0x18, 0x02, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x04, 0x74, 0x65, 0x78, 0x74, 0x12, 0x39, 0x0a, 0x0a, 0x69, 0x73, 0x73, 0x75,
	0x65, 0x5f, 0x64, 0x61, 0x74, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1a, 0x2e, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x54,
	0x69, 0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d, 0x70, 0x52, 0x09, 0x69, 0x73, 0x73, 0x75, 0x65, 0x44,
	0x61, 0x74, 0x65, 0x12, 0x32, 0x0a, 0x08, 0x73, 0x75, 0x70, 0x70, 0x6c, 0x69, 0x65, 0x72, 0x18,
	0x04, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x16, 0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x76, 0x32, 0x2e,
	0x74, 0x79, 0x70, 0x65, 0x2e, 0x53, 0x75, 0x70, 0x70, 0x6c, 0x69, 0x65, 0x72, 0x52, 0x08, 0x73,
	0x75, 0x70, 0x70, 0x6c, 0x69, 0x65, 0x72, 0x12, 0x21, 0x0a, 0x0c, 0x63, 0x75, 0x73, 0x74, 0x6f,
	0x6d, 0x65, 0x72, 0x5f, 0x72, 0x65, 0x66, 0x18, 0x05, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0b, 0x63,
	0x75, 0x73, 0x74, 0x6f, 0x6d, 0x65, 0x72, 0x52, 0x65, 0x66, 0x12, 0x16, 0x0a, 0x06, 0x61, 0x6d,
	0x6f, 0x75, 0x6e, 0x74, 0x18, 0x07, 0x20, 0x01, 0x28, 0x02, 0x52, 0x06, 0x61, 0x6d, 0x6f, 0x75,
	0x6e, 0x74, 0x22, 0x64, 0x0a, 0x08, 0x53, 0x75, 0x70, 0x70, 0x6c, 0x69, 0x65, 0x72, 0x12, 0x27,
	0x0a, 0x02, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x17, 0xfa, 0x42, 0x14, 0x72,
	0x12, 0x28, 0x40, 0x32, 0x0e, 0x5e, 0x5b, 0x41, 0x2d, 0x5a, 0x61, 0x2d, 0x7a, 0x30, 0x2d, 0x39,
	0x5d, 0x2a, 0x24, 0x52, 0x02, 0x69, 0x64, 0x12, 0x12, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18,
	0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x1b, 0x0a, 0x09, 0x67,
	0x6c, 0x6f, 0x62, 0x61, 0x6c, 0x5f, 0x69, 0x64, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x08,
	0x67, 0x6c, 0x6f, 0x62, 0x61, 0x6c, 0x49, 0x64, 0x22, 0xca, 0x01, 0x0a, 0x04, 0x44, 0x61, 0x74,
	0x61, 0x12, 0x3d, 0x0a, 0x0b, 0x74, 0x72, 0x61, 0x6e, 0x73, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e,
	0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x19, 0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x76, 0x32,
	0x2e, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x54, 0x72, 0x61, 0x6e, 0x73, 0x61, 0x63, 0x74, 0x69, 0x6f,
	0x6e, 0x48, 0x00, 0x52, 0x0b, 0x74, 0x72, 0x61, 0x6e, 0x73, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e,
	0x12, 0x31, 0x0a, 0x07, 0x69, 0x6e, 0x76, 0x6f, 0x69, 0x63, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28,
	0x0b, 0x32, 0x15, 0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x76, 0x32, 0x2e, 0x74, 0x79, 0x70, 0x65,
	0x2e, 0x49, 0x6e, 0x76, 0x6f, 0x69, 0x63, 0x65, 0x48, 0x00, 0x52, 0x07, 0x69, 0x6e, 0x76, 0x6f,
	0x69, 0x63, 0x65, 0x12, 0x3e, 0x0a, 0x0c, 0x69, 0x6e, 0x76, 0x6f, 0x69, 0x63, 0x65, 0x5f, 0x6c,
	0x69, 0x6e, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x19, 0x2e, 0x61, 0x73, 0x67, 0x74,
	0x2e, 0x76, 0x32, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x49, 0x6e, 0x76, 0x6f, 0x69, 0x63, 0x65,
	0x4c, 0x69, 0x6e, 0x65, 0x48, 0x00, 0x52, 0x0b, 0x69, 0x6e, 0x76, 0x6f, 0x69, 0x63, 0x65, 0x4c,
	0x69, 0x6e, 0x65, 0x42, 0x10, 0x0a, 0x0e, 0x64, 0x61, 0x74, 0x61, 0x5f, 0x73, 0x74, 0x72, 0x75,
	0x63, 0x74, 0x75, 0x72, 0x65, 0x42, 0x3b, 0x5a, 0x39, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e,
	0x63, 0x6f, 0x6d, 0x2f, 0x65, 0x2d, 0x63, 0x6f, 0x6e, 0x6f, 0x6d, 0x69, 0x63, 0x2f, 0x76, 0x6d,
	0x6c, 0x61, 0x70, 0x69, 0x73, 0x2f, 0x67, 0x65, 0x6e, 0x2f, 0x67, 0x6f, 0x2f, 0x61, 0x73, 0x67,
	0x74, 0x2f, 0x76, 0x32, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x3b, 0x61, 0x73, 0x67, 0x74, 0x74, 0x79,
	0x70, 0x65, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_asgt_v2_type_data_proto_rawDescOnce sync.Once
	file_asgt_v2_type_data_proto_rawDescData = file_asgt_v2_type_data_proto_rawDesc
)

func file_asgt_v2_type_data_proto_rawDescGZIP() []byte {
	file_asgt_v2_type_data_proto_rawDescOnce.Do(func() {
		file_asgt_v2_type_data_proto_rawDescData = protoimpl.X.CompressGZIP(file_asgt_v2_type_data_proto_rawDescData)
	})
	return file_asgt_v2_type_data_proto_rawDescData
}

var file_asgt_v2_type_data_proto_msgTypes = make([]protoimpl.MessageInfo, 5)
var file_asgt_v2_type_data_proto_goTypes = []interface{}{
	(*Invoice)(nil),               // 0: asgt.v2.type.Invoice
	(*Transaction)(nil),           // 1: asgt.v2.type.Transaction
	(*InvoiceLine)(nil),           // 2: asgt.v2.type.InvoiceLine
	(*Supplier)(nil),              // 3: asgt.v2.type.Supplier
	(*Data)(nil),                  // 4: asgt.v2.type.Data
	(*timestamppb.Timestamp)(nil), // 5: google.protobuf.Timestamp
}
var file_asgt_v2_type_data_proto_depIdxs = []int32{
	5, // 0: asgt.v2.type.InvoiceLine.issue_date:type_name -> google.protobuf.Timestamp
	3, // 1: asgt.v2.type.InvoiceLine.supplier:type_name -> asgt.v2.type.Supplier
	1, // 2: asgt.v2.type.Data.transaction:type_name -> asgt.v2.type.Transaction
	0, // 3: asgt.v2.type.Data.invoice:type_name -> asgt.v2.type.Invoice
	2, // 4: asgt.v2.type.Data.invoice_line:type_name -> asgt.v2.type.InvoiceLine
	5, // [5:5] is the sub-list for method output_type
	5, // [5:5] is the sub-list for method input_type
	5, // [5:5] is the sub-list for extension type_name
	5, // [5:5] is the sub-list for extension extendee
	0, // [0:5] is the sub-list for field type_name
}

func init() { file_asgt_v2_type_data_proto_init() }
func file_asgt_v2_type_data_proto_init() {
	if File_asgt_v2_type_data_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_asgt_v2_type_data_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Invoice); i {
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
		file_asgt_v2_type_data_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Transaction); i {
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
		file_asgt_v2_type_data_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*InvoiceLine); i {
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
		file_asgt_v2_type_data_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Supplier); i {
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
		file_asgt_v2_type_data_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Data); i {
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
	file_asgt_v2_type_data_proto_msgTypes[4].OneofWrappers = []interface{}{
		(*Data_Transaction)(nil),
		(*Data_Invoice)(nil),
		(*Data_InvoiceLine)(nil),
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_asgt_v2_type_data_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   5,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_asgt_v2_type_data_proto_goTypes,
		DependencyIndexes: file_asgt_v2_type_data_proto_depIdxs,
		MessageInfos:      file_asgt_v2_type_data_proto_msgTypes,
	}.Build()
	File_asgt_v2_type_data_proto = out.File
	file_asgt_v2_type_data_proto_rawDesc = nil
	file_asgt_v2_type_data_proto_goTypes = nil
	file_asgt_v2_type_data_proto_depIdxs = nil
}
