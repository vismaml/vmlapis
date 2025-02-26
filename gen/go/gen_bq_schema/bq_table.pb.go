// Copyright 2014 Google Inc. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.36.5
// 	protoc        (unknown)
// source: gen_bq_schema/bq_table.proto

package gen_bq_schema

import (
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	descriptorpb "google.golang.org/protobuf/types/descriptorpb"
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

type BigQueryMessageOptions struct {
	state protoimpl.MessageState `protogen:"open.v1"`
	// Specifies a name of table in BigQuery for the message.
	//
	// If not blank, indicates the message is a type of record to be stored into BigQuery.
	TableName string `protobuf:"bytes,1,opt,name=table_name,json=tableName,proto3" json:"table_name,omitempty"`
	// If true, BigQuery field names will default to a field's JSON name,
	// not its original/proto field name.
	UseJsonNames  bool `protobuf:"varint,2,opt,name=use_json_names,json=useJsonNames,proto3" json:"use_json_names,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *BigQueryMessageOptions) Reset() {
	*x = BigQueryMessageOptions{}
	mi := &file_gen_bq_schema_bq_table_proto_msgTypes[0]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *BigQueryMessageOptions) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*BigQueryMessageOptions) ProtoMessage() {}

func (x *BigQueryMessageOptions) ProtoReflect() protoreflect.Message {
	mi := &file_gen_bq_schema_bq_table_proto_msgTypes[0]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use BigQueryMessageOptions.ProtoReflect.Descriptor instead.
func (*BigQueryMessageOptions) Descriptor() ([]byte, []int) {
	return file_gen_bq_schema_bq_table_proto_rawDescGZIP(), []int{0}
}

func (x *BigQueryMessageOptions) GetTableName() string {
	if x != nil {
		return x.TableName
	}
	return ""
}

func (x *BigQueryMessageOptions) GetUseJsonNames() bool {
	if x != nil {
		return x.UseJsonNames
	}
	return false
}

var file_gen_bq_schema_bq_table_proto_extTypes = []protoimpl.ExtensionInfo{
	{
		ExtendedType:  (*descriptorpb.MessageOptions)(nil),
		ExtensionType: (*BigQueryMessageOptions)(nil),
		Field:         1021,
		Name:          "gen_bq_schema.bigquery_opts",
		Tag:           "bytes,1021,opt,name=bigquery_opts",
		Filename:      "gen_bq_schema/bq_table.proto",
	},
}

// Extension fields to descriptorpb.MessageOptions.
var (
	// BigQuery message schema generation options.
	//
	// The field number is a globally unique id for this option, assigned by
	// protobuf-global-extension-registry@google.com
	//
	// optional gen_bq_schema.BigQueryMessageOptions bigquery_opts = 1021;
	E_BigqueryOpts = &file_gen_bq_schema_bq_table_proto_extTypes[0]
)

var File_gen_bq_schema_bq_table_proto protoreflect.FileDescriptor

var file_gen_bq_schema_bq_table_proto_rawDesc = string([]byte{
	0x0a, 0x1c, 0x67, 0x65, 0x6e, 0x5f, 0x62, 0x71, 0x5f, 0x73, 0x63, 0x68, 0x65, 0x6d, 0x61, 0x2f,
	0x62, 0x71, 0x5f, 0x74, 0x61, 0x62, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0d,
	0x67, 0x65, 0x6e, 0x5f, 0x62, 0x71, 0x5f, 0x73, 0x63, 0x68, 0x65, 0x6d, 0x61, 0x1a, 0x20, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x64,
	0x65, 0x73, 0x63, 0x72, 0x69, 0x70, 0x74, 0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22,
	0x5d, 0x0a, 0x16, 0x42, 0x69, 0x67, 0x51, 0x75, 0x65, 0x72, 0x79, 0x4d, 0x65, 0x73, 0x73, 0x61,
	0x67, 0x65, 0x4f, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x12, 0x1d, 0x0a, 0x0a, 0x74, 0x61, 0x62,
	0x6c, 0x65, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x09, 0x74,
	0x61, 0x62, 0x6c, 0x65, 0x4e, 0x61, 0x6d, 0x65, 0x12, 0x24, 0x0a, 0x0e, 0x75, 0x73, 0x65, 0x5f,
	0x6a, 0x73, 0x6f, 0x6e, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x73, 0x18, 0x02, 0x20, 0x01, 0x28, 0x08,
	0x52, 0x0c, 0x75, 0x73, 0x65, 0x4a, 0x73, 0x6f, 0x6e, 0x4e, 0x61, 0x6d, 0x65, 0x73, 0x3a, 0x6c,
	0x0a, 0x0d, 0x62, 0x69, 0x67, 0x71, 0x75, 0x65, 0x72, 0x79, 0x5f, 0x6f, 0x70, 0x74, 0x73, 0x12,
	0x1f, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75,
	0x66, 0x2e, 0x4d, 0x65, 0x73, 0x73, 0x61, 0x67, 0x65, 0x4f, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x73,
	0x18, 0xfd, 0x07, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x25, 0x2e, 0x67, 0x65, 0x6e, 0x5f, 0x62, 0x71,
	0x5f, 0x73, 0x63, 0x68, 0x65, 0x6d, 0x61, 0x2e, 0x42, 0x69, 0x67, 0x51, 0x75, 0x65, 0x72, 0x79,
	0x4d, 0x65, 0x73, 0x73, 0x61, 0x67, 0x65, 0x4f, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x52, 0x0c,
	0x62, 0x69, 0x67, 0x71, 0x75, 0x65, 0x72, 0x79, 0x4f, 0x70, 0x74, 0x73, 0x42, 0xb3, 0x01, 0x0a,
	0x16, 0x61, 0x69, 0x2e, 0x76, 0x69, 0x73, 0x6d, 0x61, 0x2e, 0x67, 0x65, 0x6e, 0x5f, 0x62, 0x71,
	0x5f, 0x73, 0x63, 0x68, 0x65, 0x6d, 0x61, 0x42, 0x0c, 0x42, 0x71, 0x54, 0x61, 0x62, 0x6c, 0x65,
	0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x3f, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e,
	0x63, 0x6f, 0x6d, 0x2f, 0x65, 0x2d, 0x63, 0x6f, 0x6e, 0x6f, 0x6d, 0x69, 0x63, 0x2f, 0x76, 0x6d,
	0x6c, 0x61, 0x70, 0x69, 0x73, 0x2f, 0x67, 0x65, 0x6e, 0x2f, 0x67, 0x6f, 0x2f, 0x67, 0x65, 0x6e,
	0x5f, 0x62, 0x71, 0x5f, 0x73, 0x63, 0x68, 0x65, 0x6d, 0x61, 0x3b, 0x67, 0x65, 0x6e, 0x5f, 0x62,
	0x71, 0x5f, 0x73, 0x63, 0x68, 0x65, 0x6d, 0x61, 0xa2, 0x02, 0x03, 0x47, 0x58, 0x58, 0xaa, 0x02,
	0x0b, 0x47, 0x65, 0x6e, 0x42, 0x71, 0x53, 0x63, 0x68, 0x65, 0x6d, 0x61, 0xca, 0x02, 0x0b, 0x47,
	0x65, 0x6e, 0x42, 0x71, 0x53, 0x63, 0x68, 0x65, 0x6d, 0x61, 0xe2, 0x02, 0x17, 0x47, 0x65, 0x6e,
	0x42, 0x71, 0x53, 0x63, 0x68, 0x65, 0x6d, 0x61, 0x5c, 0x47, 0x50, 0x42, 0x4d, 0x65, 0x74, 0x61,
	0x64, 0x61, 0x74, 0x61, 0xea, 0x02, 0x0b, 0x47, 0x65, 0x6e, 0x42, 0x71, 0x53, 0x63, 0x68, 0x65,
	0x6d, 0x61, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
})

var (
	file_gen_bq_schema_bq_table_proto_rawDescOnce sync.Once
	file_gen_bq_schema_bq_table_proto_rawDescData []byte
)

func file_gen_bq_schema_bq_table_proto_rawDescGZIP() []byte {
	file_gen_bq_schema_bq_table_proto_rawDescOnce.Do(func() {
		file_gen_bq_schema_bq_table_proto_rawDescData = protoimpl.X.CompressGZIP(unsafe.Slice(unsafe.StringData(file_gen_bq_schema_bq_table_proto_rawDesc), len(file_gen_bq_schema_bq_table_proto_rawDesc)))
	})
	return file_gen_bq_schema_bq_table_proto_rawDescData
}

var file_gen_bq_schema_bq_table_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_gen_bq_schema_bq_table_proto_goTypes = []any{
	(*BigQueryMessageOptions)(nil),      // 0: gen_bq_schema.BigQueryMessageOptions
	(*descriptorpb.MessageOptions)(nil), // 1: google.protobuf.MessageOptions
}
var file_gen_bq_schema_bq_table_proto_depIdxs = []int32{
	1, // 0: gen_bq_schema.bigquery_opts:extendee -> google.protobuf.MessageOptions
	0, // 1: gen_bq_schema.bigquery_opts:type_name -> gen_bq_schema.BigQueryMessageOptions
	2, // [2:2] is the sub-list for method output_type
	2, // [2:2] is the sub-list for method input_type
	1, // [1:2] is the sub-list for extension type_name
	0, // [0:1] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_gen_bq_schema_bq_table_proto_init() }
func file_gen_bq_schema_bq_table_proto_init() {
	if File_gen_bq_schema_bq_table_proto != nil {
		return
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: unsafe.Slice(unsafe.StringData(file_gen_bq_schema_bq_table_proto_rawDesc), len(file_gen_bq_schema_bq_table_proto_rawDesc)),
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 1,
			NumServices:   0,
		},
		GoTypes:           file_gen_bq_schema_bq_table_proto_goTypes,
		DependencyIndexes: file_gen_bq_schema_bq_table_proto_depIdxs,
		MessageInfos:      file_gen_bq_schema_bq_table_proto_msgTypes,
		ExtensionInfos:    file_gen_bq_schema_bq_table_proto_extTypes,
	}.Build()
	File_gen_bq_schema_bq_table_proto = out.File
	file_gen_bq_schema_bq_table_proto_goTypes = nil
	file_gen_bq_schema_bq_table_proto_depIdxs = nil
}
