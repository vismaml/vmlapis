# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
import grpc

from vml_proto.asgt.dataservice.v1alpha1 import delete_pb2 as asgt_dot_dataservice_dot_v1alpha1_dot_delete__pb2
from vml_proto.asgt.dataservice.v1alpha1 import electronic_invoice_line_data_service_pb2 as asgt_dot_dataservice_dot_v1alpha1_dot_electronic__invoice__line__data__service__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2


class ElectronicInvoiceLineDataServiceStub(object):
  # missing associated documentation comment in .proto file
  pass

  def __init__(self, channel):
    """Constructor.

    Args:
      channel: A grpc.Channel.
    """
    self.CreateElectronicInvoiceLineDataset = channel.unary_unary(
        '/asgt.dataservice.v1alpha1.ElectronicInvoiceLineDataService/CreateElectronicInvoiceLineDataset',
        request_serializer=asgt_dot_dataservice_dot_v1alpha1_dot_electronic__invoice__line__data__service__pb2.CreateElectronicInvoiceLineDatasetRequest.SerializeToString,
        response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
        )
    self.AppendElectronicInvoiceLineData = channel.unary_unary(
        '/asgt.dataservice.v1alpha1.ElectronicInvoiceLineDataService/AppendElectronicInvoiceLineData',
        request_serializer=asgt_dot_dataservice_dot_v1alpha1_dot_electronic__invoice__line__data__service__pb2.AppendElectronicInvoiceLineDataRequest.SerializeToString,
        response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
        )
    self.DeleteElectronicInvoiceLineData = channel.unary_unary(
        '/asgt.dataservice.v1alpha1.ElectronicInvoiceLineDataService/DeleteElectronicInvoiceLineData',
        request_serializer=asgt_dot_dataservice_dot_v1alpha1_dot_delete__pb2.DeleteRequest.SerializeToString,
        response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
        )


class ElectronicInvoiceLineDataServiceServicer(object):
  # missing associated documentation comment in .proto file
  pass

  def CreateElectronicInvoiceLineDataset(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def AppendElectronicInvoiceLineData(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def DeleteElectronicInvoiceLineData(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')


def add_ElectronicInvoiceLineDataServiceServicer_to_server(servicer, server):
  rpc_method_handlers = {
      'CreateElectronicInvoiceLineDataset': grpc.unary_unary_rpc_method_handler(
          servicer.CreateElectronicInvoiceLineDataset,
          request_deserializer=asgt_dot_dataservice_dot_v1alpha1_dot_electronic__invoice__line__data__service__pb2.CreateElectronicInvoiceLineDatasetRequest.FromString,
          response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
      ),
      'AppendElectronicInvoiceLineData': grpc.unary_unary_rpc_method_handler(
          servicer.AppendElectronicInvoiceLineData,
          request_deserializer=asgt_dot_dataservice_dot_v1alpha1_dot_electronic__invoice__line__data__service__pb2.AppendElectronicInvoiceLineDataRequest.FromString,
          response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
      ),
      'DeleteElectronicInvoiceLineData': grpc.unary_unary_rpc_method_handler(
          servicer.DeleteElectronicInvoiceLineData,
          request_deserializer=asgt_dot_dataservice_dot_v1alpha1_dot_delete__pb2.DeleteRequest.FromString,
          response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
      ),
  }
  generic_handler = grpc.method_handlers_generic_handler(
      'asgt.dataservice.v1alpha1.ElectronicInvoiceLineDataService', rpc_method_handlers)
  server.add_generic_rpc_handlers((generic_handler,))
