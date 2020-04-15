# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
import grpc

from asgt.dataservice.v1alpha1 import data_service_pb2 as asgt_dot_dataservice_dot_v1alpha1_dot_data__service__pb2


class DataServiceStub(object):
  # missing associated documentation comment in .proto file
  pass

  def __init__(self, channel):
    """Constructor.

    Args:
      channel: A grpc.Channel.
    """
    self.GetDataset = channel.unary_unary(
        '/asgt.dataservice.v1alpha1.DataService/GetDataset',
        request_serializer=asgt_dot_dataservice_dot_v1alpha1_dot_data__service__pb2.GetDatasetRequest.SerializeToString,
        response_deserializer=asgt_dot_dataservice_dot_v1alpha1_dot_data__service__pb2.GetDatasetResponse.FromString,
        )


class DataServiceServicer(object):
  # missing associated documentation comment in .proto file
  pass

  def GetDataset(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')


def add_DataServiceServicer_to_server(servicer, server):
  rpc_method_handlers = {
      'GetDataset': grpc.unary_unary_rpc_method_handler(
          servicer.GetDataset,
          request_deserializer=asgt_dot_dataservice_dot_v1alpha1_dot_data__service__pb2.GetDatasetRequest.FromString,
          response_serializer=asgt_dot_dataservice_dot_v1alpha1_dot_data__service__pb2.GetDatasetResponse.SerializeToString,
      ),
  }
  generic_handler = grpc.method_handlers_generic_handler(
      'asgt.dataservice.v1alpha1.DataService', rpc_method_handlers)
  server.add_generic_rpc_handlers((generic_handler,))
