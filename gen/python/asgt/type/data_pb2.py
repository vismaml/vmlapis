# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: asgt/type/data.proto

import sys
_b=sys.version_info[0]<3 and (lambda x:x) or (lambda x:x.encode('latin1'))
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='asgt/type/data.proto',
  package='asgt.type',
  syntax='proto3',
  serialized_options=_b('Z\004type'),
  serialized_pb=_b('\n\x14\x61sgt/type/data.proto\x12\tasgt.type\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x1egoogle/protobuf/wrappers.proto\"\x9c\x02\n\x07Invoice\x12.\n\nissue_date\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12%\n\x08supplier\x18\x02 \x01(\x0b\x32\x13.asgt.type.Supplier\x12\x32\n\x0c\x63ustomer_ref\x18\x03 \x01(\x0b\x32\x1c.google.protobuf.StringValue\x12*\n\x04text\x18\x04 \x01(\x0b\x32\x1c.google.protobuf.StringValue\x12.\n\x08\x63urrency\x18\x06 \x01(\x0b\x32\x1c.google.protobuf.StringValue\x12*\n\x05total\x18\x07 \x01(\x0b\x32\x1b.google.protobuf.FloatValue\"h\n\x0bInvoiceLine\x12*\n\x04text\x18\x08 \x01(\x0b\x32\x1c.google.protobuf.StringValue\x12-\n\x07item_id\x18\t \x01(\x0b\x32\x1c.google.protobuf.StringValue\"s\n\x08Supplier\x12\n\n\x02id\x18\x01 \x01(\t\x12*\n\x04name\x18\x04 \x01(\x0b\x32\x1c.google.protobuf.StringValue\x12/\n\tglobal_id\x18\x05 \x01(\x0b\x32\x1c.google.protobuf.StringValue\"+\n\x0bTransaction\x12\x0c\n\x04text\x18\x01 \x01(\t\x12\x0e\n\x06\x61mount\x18\x02 \x01(\x02\"\x86\x01\n\x04\x44\x61ta\x12+\n\x0btransaction\x18\x01 \x01(\x0b\x32\x16.asgt.type.Transaction\x12#\n\x07invoice\x18\x02 \x01(\x0b\x32\x12.asgt.type.Invoice\x12,\n\x0cinvoice_line\x18\x03 \x01(\x0b\x32\x16.asgt.type.InvoiceLineB\x06Z\x04typeb\x06proto3')
  ,
  dependencies=[google_dot_protobuf_dot_timestamp__pb2.DESCRIPTOR,google_dot_protobuf_dot_wrappers__pb2.DESCRIPTOR,])




_INVOICE = _descriptor.Descriptor(
  name='Invoice',
  full_name='asgt.type.Invoice',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='issue_date', full_name='asgt.type.Invoice.issue_date', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='supplier', full_name='asgt.type.Invoice.supplier', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='customer_ref', full_name='asgt.type.Invoice.customer_ref', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='text', full_name='asgt.type.Invoice.text', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='currency', full_name='asgt.type.Invoice.currency', index=4,
      number=6, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='total', full_name='asgt.type.Invoice.total', index=5,
      number=7, type=11, cpp_type=10, label=1,
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
  serialized_start=101,
  serialized_end=385,
)


_INVOICELINE = _descriptor.Descriptor(
  name='InvoiceLine',
  full_name='asgt.type.InvoiceLine',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='text', full_name='asgt.type.InvoiceLine.text', index=0,
      number=8, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='item_id', full_name='asgt.type.InvoiceLine.item_id', index=1,
      number=9, type=11, cpp_type=10, label=1,
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
  serialized_start=387,
  serialized_end=491,
)


_SUPPLIER = _descriptor.Descriptor(
  name='Supplier',
  full_name='asgt.type.Supplier',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='asgt.type.Supplier.id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='name', full_name='asgt.type.Supplier.name', index=1,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='global_id', full_name='asgt.type.Supplier.global_id', index=2,
      number=5, type=11, cpp_type=10, label=1,
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
  serialized_start=493,
  serialized_end=608,
)


_TRANSACTION = _descriptor.Descriptor(
  name='Transaction',
  full_name='asgt.type.Transaction',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='text', full_name='asgt.type.Transaction.text', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='amount', full_name='asgt.type.Transaction.amount', index=1,
      number=2, type=2, cpp_type=6, label=1,
      has_default_value=False, default_value=float(0),
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
  serialized_start=610,
  serialized_end=653,
)


_DATA = _descriptor.Descriptor(
  name='Data',
  full_name='asgt.type.Data',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='transaction', full_name='asgt.type.Data.transaction', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='invoice', full_name='asgt.type.Data.invoice', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='invoice_line', full_name='asgt.type.Data.invoice_line', index=2,
      number=3, type=11, cpp_type=10, label=1,
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
  serialized_start=656,
  serialized_end=790,
)

_INVOICE.fields_by_name['issue_date'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_INVOICE.fields_by_name['supplier'].message_type = _SUPPLIER
_INVOICE.fields_by_name['customer_ref'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_INVOICE.fields_by_name['text'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_INVOICE.fields_by_name['currency'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_INVOICE.fields_by_name['total'].message_type = google_dot_protobuf_dot_wrappers__pb2._FLOATVALUE
_INVOICELINE.fields_by_name['text'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_INVOICELINE.fields_by_name['item_id'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_SUPPLIER.fields_by_name['name'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_SUPPLIER.fields_by_name['global_id'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_DATA.fields_by_name['transaction'].message_type = _TRANSACTION
_DATA.fields_by_name['invoice'].message_type = _INVOICE
_DATA.fields_by_name['invoice_line'].message_type = _INVOICELINE
DESCRIPTOR.message_types_by_name['Invoice'] = _INVOICE
DESCRIPTOR.message_types_by_name['InvoiceLine'] = _INVOICELINE
DESCRIPTOR.message_types_by_name['Supplier'] = _SUPPLIER
DESCRIPTOR.message_types_by_name['Transaction'] = _TRANSACTION
DESCRIPTOR.message_types_by_name['Data'] = _DATA
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Invoice = _reflection.GeneratedProtocolMessageType('Invoice', (_message.Message,), dict(
  DESCRIPTOR = _INVOICE,
  __module__ = 'asgt.type.data_pb2'
  # @@protoc_insertion_point(class_scope:asgt.type.Invoice)
  ))
_sym_db.RegisterMessage(Invoice)

InvoiceLine = _reflection.GeneratedProtocolMessageType('InvoiceLine', (_message.Message,), dict(
  DESCRIPTOR = _INVOICELINE,
  __module__ = 'asgt.type.data_pb2'
  # @@protoc_insertion_point(class_scope:asgt.type.InvoiceLine)
  ))
_sym_db.RegisterMessage(InvoiceLine)

Supplier = _reflection.GeneratedProtocolMessageType('Supplier', (_message.Message,), dict(
  DESCRIPTOR = _SUPPLIER,
  __module__ = 'asgt.type.data_pb2'
  # @@protoc_insertion_point(class_scope:asgt.type.Supplier)
  ))
_sym_db.RegisterMessage(Supplier)

Transaction = _reflection.GeneratedProtocolMessageType('Transaction', (_message.Message,), dict(
  DESCRIPTOR = _TRANSACTION,
  __module__ = 'asgt.type.data_pb2'
  # @@protoc_insertion_point(class_scope:asgt.type.Transaction)
  ))
_sym_db.RegisterMessage(Transaction)

Data = _reflection.GeneratedProtocolMessageType('Data', (_message.Message,), dict(
  DESCRIPTOR = _DATA,
  __module__ = 'asgt.type.data_pb2'
  # @@protoc_insertion_point(class_scope:asgt.type.Data)
  ))
_sym_db.RegisterMessage(Data)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
