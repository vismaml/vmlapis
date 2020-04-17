# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: asgt/dataservice/v1alpha1/electronic_invoice_line_data_service.proto

import sys
_b=sys.version_info[0]<3 and (lambda x:x) or (lambda x:x.encode('latin1'))
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from vml_proto.asgt.dataservice.v1alpha1 import delete_pb2 as asgt_dot_dataservice_dot_v1alpha1_dot_delete__pb2
from vml_proto.asgt.type import invoice_line_pb2 as asgt_dot_type_dot_invoice__line__pb2
from vml_proto.asgt.type import retention_policy_pb2 as asgt_dot_type_dot_retention__policy__pb2
from vml_proto.asgt.type import target_value_pb2 as asgt_dot_type_dot_target__value__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='asgt/dataservice/v1alpha1/electronic_invoice_line_data_service.proto',
  package='asgt.dataservice.v1alpha1',
  syntax='proto3',
  serialized_options=_b('Z\013dataservice'),
  serialized_pb=_b('\nDasgt/dataservice/v1alpha1/electronic_invoice_line_data_service.proto\x12\x19\x61sgt.dataservice.v1alpha1\x1a&asgt/dataservice/v1alpha1/delete.proto\x1a\x1c\x61sgt/type/invoice_line.proto\x1a asgt/type/retention_policy.proto\x1a\x1c\x61sgt/type/target_value.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x1bgoogle/protobuf/empty.proto\"v\n\x1f\x45lectronicInvoiceLineEntryInput\x12$\n\x04\x64\x61ta\x18\x01 \x01(\x0b\x32\x16.asgt.type.InvoiceLine\x12-\n\rtarget_values\x18\x02 \x03(\x0b\x32\x16.asgt.type.TargetValue\"\xe3\x01\n)CreateElectronicInvoiceLineDatasetRequest\x12\x14\n\x0c\x64\x61taset_name\x18\x01 \x01(\t\x12\x0c\n\x04tags\x18\x02 \x03(\t\x12\x0f\n\x07targets\x18\x05 \x03(\t\x12K\n\x07\x65ntries\x18\x03 \x03(\x0b\x32:.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput\x12\x34\n\x10retention_policy\x18\x04 \x01(\x0b\x32\x1a.asgt.type.RetentionPolicy\"\x8b\x01\n&AppendElectronicInvoiceLineDataRequest\x12\x14\n\x0c\x64\x61taset_name\x18\x01 \x01(\t\x12K\n\x07\x65ntries\x18\x03 \x03(\x0b\x32:.asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput2\xab\x04\n ElectronicInvoiceLineDataService\x12\xb7\x01\n\"CreateElectronicInvoiceLineDataset\x12\x44.asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest\x1a\x16.google.protobuf.Empty\"3\x82\xd3\xe4\x93\x02-\"(/v1alpha1/electronic-invoice-line:create:\x01*\x12\xb1\x01\n\x1f\x41ppendElectronicInvoiceLineData\x12\x41.asgt.dataservice.v1alpha1.AppendElectronicInvoiceLineDataRequest\x1a\x16.google.protobuf.Empty\"3\x82\xd3\xe4\x93\x02-\"(/v1alpha1/electronic-invoice-line:append:\x01*\x12\x98\x01\n\x1f\x44\x65leteElectronicInvoiceLineData\x12(.asgt.dataservice.v1alpha1.DeleteRequest\x1a\x16.google.protobuf.Empty\"3\x82\xd3\xe4\x93\x02-\"(/v1alpha1/electronic-invoice-line:delete:\x01*B\rZ\x0b\x64\x61taserviceb\x06proto3')
  ,
  dependencies=[asgt_dot_dataservice_dot_v1alpha1_dot_delete__pb2.DESCRIPTOR,asgt_dot_type_dot_invoice__line__pb2.DESCRIPTOR,asgt_dot_type_dot_retention__policy__pb2.DESCRIPTOR,asgt_dot_type_dot_target__value__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_protobuf_dot_empty__pb2.DESCRIPTOR,])




_ELECTRONICINVOICELINEENTRYINPUT = _descriptor.Descriptor(
  name='ElectronicInvoiceLineEntryInput',
  full_name='asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='data', full_name='asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput.data', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='target_values', full_name='asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput.target_values', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=292,
  serialized_end=410,
)


_CREATEELECTRONICINVOICELINEDATASETREQUEST = _descriptor.Descriptor(
  name='CreateElectronicInvoiceLineDatasetRequest',
  full_name='asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='dataset_name', full_name='asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest.dataset_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='tags', full_name='asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest.tags', index=1,
      number=2, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='targets', full_name='asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest.targets', index=2,
      number=5, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='entries', full_name='asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest.entries', index=3,
      number=3, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='retention_policy', full_name='asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest.retention_policy', index=4,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=413,
  serialized_end=640,
)


_APPENDELECTRONICINVOICELINEDATAREQUEST = _descriptor.Descriptor(
  name='AppendElectronicInvoiceLineDataRequest',
  full_name='asgt.dataservice.v1alpha1.AppendElectronicInvoiceLineDataRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='dataset_name', full_name='asgt.dataservice.v1alpha1.AppendElectronicInvoiceLineDataRequest.dataset_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='entries', full_name='asgt.dataservice.v1alpha1.AppendElectronicInvoiceLineDataRequest.entries', index=1,
      number=3, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=643,
  serialized_end=782,
)

_ELECTRONICINVOICELINEENTRYINPUT.fields_by_name['data'].message_type = asgt_dot_type_dot_invoice__line__pb2._INVOICELINE
_ELECTRONICINVOICELINEENTRYINPUT.fields_by_name['target_values'].message_type = asgt_dot_type_dot_target__value__pb2._TARGETVALUE
_CREATEELECTRONICINVOICELINEDATASETREQUEST.fields_by_name['entries'].message_type = _ELECTRONICINVOICELINEENTRYINPUT
_CREATEELECTRONICINVOICELINEDATASETREQUEST.fields_by_name['retention_policy'].message_type = asgt_dot_type_dot_retention__policy__pb2._RETENTIONPOLICY
_APPENDELECTRONICINVOICELINEDATAREQUEST.fields_by_name['entries'].message_type = _ELECTRONICINVOICELINEENTRYINPUT
DESCRIPTOR.message_types_by_name['ElectronicInvoiceLineEntryInput'] = _ELECTRONICINVOICELINEENTRYINPUT
DESCRIPTOR.message_types_by_name['CreateElectronicInvoiceLineDatasetRequest'] = _CREATEELECTRONICINVOICELINEDATASETREQUEST
DESCRIPTOR.message_types_by_name['AppendElectronicInvoiceLineDataRequest'] = _APPENDELECTRONICINVOICELINEDATAREQUEST
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

ElectronicInvoiceLineEntryInput = _reflection.GeneratedProtocolMessageType('ElectronicInvoiceLineEntryInput', (_message.Message,), dict(
  DESCRIPTOR = _ELECTRONICINVOICELINEENTRYINPUT,
  __module__ = 'asgt.dataservice.v1alpha1.electronic_invoice_line_data_service_pb2'
  # @@protoc_insertion_point(class_scope:asgt.dataservice.v1alpha1.ElectronicInvoiceLineEntryInput)
  ))
_sym_db.RegisterMessage(ElectronicInvoiceLineEntryInput)

CreateElectronicInvoiceLineDatasetRequest = _reflection.GeneratedProtocolMessageType('CreateElectronicInvoiceLineDatasetRequest', (_message.Message,), dict(
  DESCRIPTOR = _CREATEELECTRONICINVOICELINEDATASETREQUEST,
  __module__ = 'asgt.dataservice.v1alpha1.electronic_invoice_line_data_service_pb2'
  # @@protoc_insertion_point(class_scope:asgt.dataservice.v1alpha1.CreateElectronicInvoiceLineDatasetRequest)
  ))
_sym_db.RegisterMessage(CreateElectronicInvoiceLineDatasetRequest)

AppendElectronicInvoiceLineDataRequest = _reflection.GeneratedProtocolMessageType('AppendElectronicInvoiceLineDataRequest', (_message.Message,), dict(
  DESCRIPTOR = _APPENDELECTRONICINVOICELINEDATAREQUEST,
  __module__ = 'asgt.dataservice.v1alpha1.electronic_invoice_line_data_service_pb2'
  # @@protoc_insertion_point(class_scope:asgt.dataservice.v1alpha1.AppendElectronicInvoiceLineDataRequest)
  ))
_sym_db.RegisterMessage(AppendElectronicInvoiceLineDataRequest)


DESCRIPTOR._options = None

_ELECTRONICINVOICELINEDATASERVICE = _descriptor.ServiceDescriptor(
  name='ElectronicInvoiceLineDataService',
  full_name='asgt.dataservice.v1alpha1.ElectronicInvoiceLineDataService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  serialized_start=785,
  serialized_end=1340,
  methods=[
  _descriptor.MethodDescriptor(
    name='CreateElectronicInvoiceLineDataset',
    full_name='asgt.dataservice.v1alpha1.ElectronicInvoiceLineDataService.CreateElectronicInvoiceLineDataset',
    index=0,
    containing_service=None,
    input_type=_CREATEELECTRONICINVOICELINEDATASETREQUEST,
    output_type=google_dot_protobuf_dot_empty__pb2._EMPTY,
    serialized_options=_b('\202\323\344\223\002-\"(/v1alpha1/electronic-invoice-line:create:\001*'),
  ),
  _descriptor.MethodDescriptor(
    name='AppendElectronicInvoiceLineData',
    full_name='asgt.dataservice.v1alpha1.ElectronicInvoiceLineDataService.AppendElectronicInvoiceLineData',
    index=1,
    containing_service=None,
    input_type=_APPENDELECTRONICINVOICELINEDATAREQUEST,
    output_type=google_dot_protobuf_dot_empty__pb2._EMPTY,
    serialized_options=_b('\202\323\344\223\002-\"(/v1alpha1/electronic-invoice-line:append:\001*'),
  ),
  _descriptor.MethodDescriptor(
    name='DeleteElectronicInvoiceLineData',
    full_name='asgt.dataservice.v1alpha1.ElectronicInvoiceLineDataService.DeleteElectronicInvoiceLineData',
    index=2,
    containing_service=None,
    input_type=asgt_dot_dataservice_dot_v1alpha1_dot_delete__pb2._DELETEREQUEST,
    output_type=google_dot_protobuf_dot_empty__pb2._EMPTY,
    serialized_options=_b('\202\323\344\223\002-\"(/v1alpha1/electronic-invoice-line:delete:\001*'),
  ),
])
_sym_db.RegisterServiceDescriptor(_ELECTRONICINVOICELINEDATASERVICE)

DESCRIPTOR.services_by_name['ElectronicInvoiceLineDataService'] = _ELECTRONICINVOICELINEDATASERVICE

# @@protoc_insertion_point(module_scope)
