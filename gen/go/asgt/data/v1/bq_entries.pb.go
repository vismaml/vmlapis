// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.31.0
// 	protoc        (unknown)
// source: asgt/data/v1/bq_entries.proto

package data

import (
	_type "github.com/e-conomic/vmlapis/gen/go/asgt/type"
	_ "github.com/e-conomic/vmlapis/gen/go/gen_bq_schema"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

// BQ schema gen - could be used for adding direct developer data endpoints
type Entry struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Id           string                     `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	Consumer     string                     `protobuf:"bytes,2,opt,name=consumer,proto3" json:"consumer,omitempty"`
	DatasetName  string                     `protobuf:"bytes,3,opt,name=dataset_name,json=datasetName,proto3" json:"dataset_name,omitempty"`
	DatasetType  string                     `protobuf:"bytes,12,opt,name=dataset_type,json=datasetType,proto3" json:"dataset_type,omitempty"`
	DatasetId    string                     `protobuf:"bytes,11,opt,name=dataset_id,json=datasetId,proto3" json:"dataset_id,omitempty"`
	Tags         []string                   `protobuf:"bytes,4,rep,name=tags,proto3" json:"tags,omitempty"`
	Data         *_type.Data                `protobuf:"bytes,5,opt,name=data,proto3" json:"data,omitempty"`
	TargetValues []*_type.TargetValue       `protobuf:"bytes,6,rep,name=target_values,json=targetValues,proto3" json:"target_values,omitempty"`
	Model        *_type.Model               `protobuf:"bytes,9,opt,name=model,proto3" json:"model,omitempty"`
	Prediction   []*_type.Prediction_Target `protobuf:"bytes,10,rep,name=prediction,proto3" json:"prediction,omitempty"`
	TimeAdded    uint64                     `protobuf:"varint,8,opt,name=time_added,json=timeAdded,proto3" json:"time_added,omitempty"`
}

func (x *Entry) Reset() {
	*x = Entry{}
	if protoimpl.UnsafeEnabled {
		mi := &file_asgt_data_v1_bq_entries_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Entry) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Entry) ProtoMessage() {}

func (x *Entry) ProtoReflect() protoreflect.Message {
	mi := &file_asgt_data_v1_bq_entries_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Entry.ProtoReflect.Descriptor instead.
func (*Entry) Descriptor() ([]byte, []int) {
	return file_asgt_data_v1_bq_entries_proto_rawDescGZIP(), []int{0}
}

func (x *Entry) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

func (x *Entry) GetConsumer() string {
	if x != nil {
		return x.Consumer
	}
	return ""
}

func (x *Entry) GetDatasetName() string {
	if x != nil {
		return x.DatasetName
	}
	return ""
}

func (x *Entry) GetDatasetType() string {
	if x != nil {
		return x.DatasetType
	}
	return ""
}

func (x *Entry) GetDatasetId() string {
	if x != nil {
		return x.DatasetId
	}
	return ""
}

func (x *Entry) GetTags() []string {
	if x != nil {
		return x.Tags
	}
	return nil
}

func (x *Entry) GetData() *_type.Data {
	if x != nil {
		return x.Data
	}
	return nil
}

func (x *Entry) GetTargetValues() []*_type.TargetValue {
	if x != nil {
		return x.TargetValues
	}
	return nil
}

func (x *Entry) GetModel() *_type.Model {
	if x != nil {
		return x.Model
	}
	return nil
}

func (x *Entry) GetPrediction() []*_type.Prediction_Target {
	if x != nil {
		return x.Prediction
	}
	return nil
}

func (x *Entry) GetTimeAdded() uint64 {
	if x != nil {
		return x.TimeAdded
	}
	return 0
}

var File_asgt_data_v1_bq_entries_proto protoreflect.FileDescriptor

var file_asgt_data_v1_bq_entries_proto_rawDesc = []byte{
	0x0a, 0x1d, 0x61, 0x73, 0x67, 0x74, 0x2f, 0x64, 0x61, 0x74, 0x61, 0x2f, 0x76, 0x31, 0x2f, 0x62,
	0x71, 0x5f, 0x65, 0x6e, 0x74, 0x72, 0x69, 0x65, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12,
	0x13, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63,
	0x65, 0x2e, 0x76, 0x31, 0x1a, 0x14, 0x61, 0x73, 0x67, 0x74, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x2f,
	0x64, 0x61, 0x74, 0x61, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x15, 0x61, 0x73, 0x67, 0x74,
	0x2f, 0x74, 0x79, 0x70, 0x65, 0x2f, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x1a, 0x1a, 0x61, 0x73, 0x67, 0x74, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x2f, 0x70, 0x72, 0x65,
	0x64, 0x69, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1c, 0x61,
	0x73, 0x67, 0x74, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x2f, 0x74, 0x61, 0x72, 0x67, 0x65, 0x74, 0x5f,
	0x76, 0x61, 0x6c, 0x75, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1c, 0x67, 0x65, 0x6e,
	0x5f, 0x62, 0x71, 0x5f, 0x73, 0x63, 0x68, 0x65, 0x6d, 0x61, 0x2f, 0x62, 0x71, 0x5f, 0x66, 0x69,
	0x65, 0x6c, 0x64, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1c, 0x67, 0x65, 0x6e, 0x5f, 0x62,
	0x71, 0x5f, 0x73, 0x63, 0x68, 0x65, 0x6d, 0x61, 0x2f, 0x62, 0x71, 0x5f, 0x74, 0x61, 0x62, 0x6c,
	0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0xe5, 0x04, 0x0a, 0x05, 0x45, 0x6e, 0x74, 0x72,
	0x79, 0x12, 0x42, 0x0a, 0x02, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x32, 0xea,
	0x3f, 0x2f, 0x22, 0x2d, 0x49, 0x44, 0x2c, 0x20, 0x6d, 0x61, 0x74, 0x63, 0x68, 0x65, 0x73, 0x20,
	0x45, 0x6e, 0x76, 0x6f, 0x79, 0x20, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x20, 0x69, 0x64,
	0x20, 0x69, 0x66, 0x20, 0x66, 0x65, 0x65, 0x64, 0x62, 0x61, 0x63, 0x6b, 0x20, 0x64, 0x61, 0x74,
	0x61, 0x52, 0x02, 0x69, 0x64, 0x12, 0x21, 0x0a, 0x08, 0x63, 0x6f, 0x6e, 0x73, 0x75, 0x6d, 0x65,
	0x72, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x42, 0x05, 0xea, 0x3f, 0x02, 0x08, 0x01, 0x52, 0x08,
	0x63, 0x6f, 0x6e, 0x73, 0x75, 0x6d, 0x65, 0x72, 0x12, 0x28, 0x0a, 0x0c, 0x64, 0x61, 0x74, 0x61,
	0x73, 0x65, 0x74, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x42, 0x05,
	0xea, 0x3f, 0x02, 0x08, 0x01, 0x52, 0x0b, 0x64, 0x61, 0x74, 0x61, 0x73, 0x65, 0x74, 0x4e, 0x61,
	0x6d, 0x65, 0x12, 0x28, 0x0a, 0x0c, 0x64, 0x61, 0x74, 0x61, 0x73, 0x65, 0x74, 0x5f, 0x74, 0x79,
	0x70, 0x65, 0x18, 0x0c, 0x20, 0x01, 0x28, 0x09, 0x42, 0x05, 0xea, 0x3f, 0x02, 0x08, 0x01, 0x52,
	0x0b, 0x64, 0x61, 0x74, 0x61, 0x73, 0x65, 0x74, 0x54, 0x79, 0x70, 0x65, 0x12, 0x3a, 0x0a, 0x0a,
	0x64, 0x61, 0x74, 0x61, 0x73, 0x65, 0x74, 0x5f, 0x69, 0x64, 0x18, 0x0b, 0x20, 0x01, 0x28, 0x09,
	0x42, 0x1b, 0xea, 0x3f, 0x18, 0x08, 0x01, 0x22, 0x14, 0x75, 0x6e, 0x69, 0x71, 0x75, 0x65, 0x20,
	0x49, 0x44, 0x20, 0x6f, 0x66, 0x20, 0x64, 0x61, 0x74, 0x61, 0x73, 0x65, 0x74, 0x52, 0x09, 0x64,
	0x61, 0x74, 0x61, 0x73, 0x65, 0x74, 0x49, 0x64, 0x12, 0x5a, 0x0a, 0x04, 0x74, 0x61, 0x67, 0x73,
	0x18, 0x04, 0x20, 0x03, 0x28, 0x09, 0x42, 0x46, 0xea, 0x3f, 0x43, 0x22, 0x41, 0x54, 0x61, 0x67,
	0x73, 0x20, 0x64, 0x65, 0x66, 0x69, 0x6e, 0x65, 0x64, 0x20, 0x62, 0x79, 0x20, 0x63, 0x6f, 0x6e,
	0x73, 0x75, 0x6d, 0x65, 0x72, 0x2c, 0x20, 0x65, 0x6e, 0x72, 0x69, 0x63, 0x68, 0x65, 0x64, 0x20,
	0x62, 0x79, 0x20, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x20, 0x69, 0x66, 0x20, 0x76, 0x61,
	0x6c, 0x65, 0x74, 0x6b, 0x65, 0x79, 0x20, 0x69, 0x73, 0x20, 0x75, 0x73, 0x65, 0x64, 0x52, 0x04,
	0x74, 0x61, 0x67, 0x73, 0x12, 0x23, 0x0a, 0x04, 0x64, 0x61, 0x74, 0x61, 0x18, 0x05, 0x20, 0x01,
	0x28, 0x0b, 0x32, 0x0f, 0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x44,
	0x61, 0x74, 0x61, 0x52, 0x04, 0x64, 0x61, 0x74, 0x61, 0x12, 0x3b, 0x0a, 0x0d, 0x74, 0x61, 0x72,
	0x67, 0x65, 0x74, 0x5f, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x73, 0x18, 0x06, 0x20, 0x03, 0x28, 0x0b,
	0x32, 0x16, 0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x54, 0x61, 0x72,
	0x67, 0x65, 0x74, 0x56, 0x61, 0x6c, 0x75, 0x65, 0x52, 0x0c, 0x74, 0x61, 0x72, 0x67, 0x65, 0x74,
	0x56, 0x61, 0x6c, 0x75, 0x65, 0x73, 0x12, 0x26, 0x0a, 0x05, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x18,
	0x09, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x10, 0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x74, 0x79, 0x70,
	0x65, 0x2e, 0x4d, 0x6f, 0x64, 0x65, 0x6c, 0x52, 0x05, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x12, 0x3c,
	0x0a, 0x0a, 0x70, 0x72, 0x65, 0x64, 0x69, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x0a, 0x20, 0x03,
	0x28, 0x0b, 0x32, 0x1c, 0x2e, 0x61, 0x73, 0x67, 0x74, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x2e, 0x50,
	0x72, 0x65, 0x64, 0x69, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x2e, 0x54, 0x61, 0x72, 0x67, 0x65, 0x74,
	0x52, 0x0a, 0x70, 0x72, 0x65, 0x64, 0x69, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x2f, 0x0a, 0x0a,
	0x74, 0x69, 0x6d, 0x65, 0x5f, 0x61, 0x64, 0x64, 0x65, 0x64, 0x18, 0x08, 0x20, 0x01, 0x28, 0x04,
	0x42, 0x10, 0xea, 0x3f, 0x0d, 0x08, 0x01, 0x12, 0x09, 0x54, 0x49, 0x4d, 0x45, 0x53, 0x54, 0x41,
	0x4d, 0x50, 0x52, 0x09, 0x74, 0x69, 0x6d, 0x65, 0x41, 0x64, 0x64, 0x65, 0x64, 0x3a, 0x10, 0xea,
	0x3f, 0x0d, 0x0a, 0x0b, 0x73, 0x61, 0x6d, 0x70, 0x6c, 0x65, 0x5f, 0x64, 0x61, 0x74, 0x61, 0x42,
	0xd3, 0x01, 0x0a, 0x1c, 0x61, 0x69, 0x2e, 0x76, 0x69, 0x73, 0x6d, 0x61, 0x2e, 0x61, 0x73, 0x67,
	0x74, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x76, 0x31,
	0x42, 0x0e, 0x42, 0x71, 0x45, 0x6e, 0x74, 0x72, 0x69, 0x65, 0x73, 0x50, 0x72, 0x6f, 0x74, 0x6f,
	0x50, 0x01, 0x5a, 0x35, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x65,
	0x2d, 0x63, 0x6f, 0x6e, 0x6f, 0x6d, 0x69, 0x63, 0x2f, 0x76, 0x6d, 0x6c, 0x61, 0x70, 0x69, 0x73,
	0x2f, 0x67, 0x65, 0x6e, 0x2f, 0x67, 0x6f, 0x2f, 0x61, 0x73, 0x67, 0x74, 0x2f, 0x64, 0x61, 0x74,
	0x61, 0x2f, 0x76, 0x31, 0x3b, 0x64, 0x61, 0x74, 0x61, 0xa2, 0x02, 0x03, 0x41, 0x44, 0x58, 0xaa,
	0x02, 0x13, 0x41, 0x73, 0x67, 0x74, 0x2e, 0x44, 0x61, 0x74, 0x61, 0x73, 0x65, 0x72, 0x76, 0x69,
	0x63, 0x65, 0x2e, 0x56, 0x31, 0xca, 0x02, 0x13, 0x41, 0x73, 0x67, 0x74, 0x5c, 0x44, 0x61, 0x74,
	0x61, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x5c, 0x56, 0x31, 0xe2, 0x02, 0x1f, 0x41, 0x73,
	0x67, 0x74, 0x5c, 0x44, 0x61, 0x74, 0x61, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x5c, 0x56,
	0x31, 0x5c, 0x47, 0x50, 0x42, 0x4d, 0x65, 0x74, 0x61, 0x64, 0x61, 0x74, 0x61, 0xea, 0x02, 0x15,
	0x41, 0x73, 0x67, 0x74, 0x3a, 0x3a, 0x44, 0x61, 0x74, 0x61, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63,
	0x65, 0x3a, 0x3a, 0x56, 0x31, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_asgt_data_v1_bq_entries_proto_rawDescOnce sync.Once
	file_asgt_data_v1_bq_entries_proto_rawDescData = file_asgt_data_v1_bq_entries_proto_rawDesc
)

func file_asgt_data_v1_bq_entries_proto_rawDescGZIP() []byte {
	file_asgt_data_v1_bq_entries_proto_rawDescOnce.Do(func() {
		file_asgt_data_v1_bq_entries_proto_rawDescData = protoimpl.X.CompressGZIP(file_asgt_data_v1_bq_entries_proto_rawDescData)
	})
	return file_asgt_data_v1_bq_entries_proto_rawDescData
}

var file_asgt_data_v1_bq_entries_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_asgt_data_v1_bq_entries_proto_goTypes = []interface{}{
	(*Entry)(nil),                   // 0: asgt.dataservice.v1.Entry
	(*_type.Data)(nil),              // 1: asgt.type.Data
	(*_type.TargetValue)(nil),       // 2: asgt.type.TargetValue
	(*_type.Model)(nil),             // 3: asgt.type.Model
	(*_type.Prediction_Target)(nil), // 4: asgt.type.Prediction.Target
}
var file_asgt_data_v1_bq_entries_proto_depIdxs = []int32{
	1, // 0: asgt.dataservice.v1.Entry.data:type_name -> asgt.type.Data
	2, // 1: asgt.dataservice.v1.Entry.target_values:type_name -> asgt.type.TargetValue
	3, // 2: asgt.dataservice.v1.Entry.model:type_name -> asgt.type.Model
	4, // 3: asgt.dataservice.v1.Entry.prediction:type_name -> asgt.type.Prediction.Target
	4, // [4:4] is the sub-list for method output_type
	4, // [4:4] is the sub-list for method input_type
	4, // [4:4] is the sub-list for extension type_name
	4, // [4:4] is the sub-list for extension extendee
	0, // [0:4] is the sub-list for field type_name
}

func init() { file_asgt_data_v1_bq_entries_proto_init() }
func file_asgt_data_v1_bq_entries_proto_init() {
	if File_asgt_data_v1_bq_entries_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_asgt_data_v1_bq_entries_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Entry); i {
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
			RawDescriptor: file_asgt_data_v1_bq_entries_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_asgt_data_v1_bq_entries_proto_goTypes,
		DependencyIndexes: file_asgt_data_v1_bq_entries_proto_depIdxs,
		MessageInfos:      file_asgt_data_v1_bq_entries_proto_msgTypes,
	}.Build()
	File_asgt_data_v1_bq_entries_proto = out.File
	file_asgt_data_v1_bq_entries_proto_rawDesc = nil
	file_asgt_data_v1_bq_entries_proto_goTypes = nil
	file_asgt_data_v1_bq_entries_proto_depIdxs = nil
}
