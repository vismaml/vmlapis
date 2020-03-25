# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
import grpc

from vml_proto.asgt.dataservice.v1alpha1 import bank_pb2 as asgt_dot_dataservice_dot_v1alpha1_dot_bank__pb2
from vml_proto.asgt.dataservice.v1alpha1 import data_pb2 as asgt_dot_dataservice_dot_v1alpha1_dot_data__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2


class BankDataserviceStub(object):
  # missing associated documentation comment in .proto file
  pass

  def __init__(self, channel):
    """Constructor.

    Args:
      channel: A grpc.Channel.
    """
    self.PrepareBankFeedback = channel.unary_unary(
        '/asgt.dataservice.v1alpha1.BankDataservice/PrepareBankFeedback',
        request_serializer=asgt_dot_dataservice_dot_v1alpha1_dot_bank__pb2.PrepareBankRequest.SerializeToString,
        response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
        )
    self.BankFeedback = channel.unary_unary(
        '/asgt.dataservice.v1alpha1.BankDataservice/BankFeedback',
        request_serializer=asgt_dot_dataservice_dot_v1alpha1_dot_data__pb2.FeedbackRequest.SerializeToString,
        response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
        )
    self.AddBankData = channel.unary_unary(
        '/asgt.dataservice.v1alpha1.BankDataservice/AddBankData',
        request_serializer=asgt_dot_dataservice_dot_v1alpha1_dot_bank__pb2.AddBankDataRequest.SerializeToString,
        response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
        )
    self.DeleteBankData = channel.unary_unary(
        '/asgt.dataservice.v1alpha1.BankDataservice/DeleteBankData',
        request_serializer=asgt_dot_dataservice_dot_v1alpha1_dot_data__pb2.DeleteRequest.SerializeToString,
        response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
        )


class BankDataserviceServicer(object):
  # missing associated documentation comment in .proto file
  pass

  def PrepareBankFeedback(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def BankFeedback(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def AddBankData(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def DeleteBankData(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')


def add_BankDataserviceServicer_to_server(servicer, server):
  rpc_method_handlers = {
      'PrepareBankFeedback': grpc.unary_unary_rpc_method_handler(
          servicer.PrepareBankFeedback,
          request_deserializer=asgt_dot_dataservice_dot_v1alpha1_dot_bank__pb2.PrepareBankRequest.FromString,
          response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
      ),
      'BankFeedback': grpc.unary_unary_rpc_method_handler(
          servicer.BankFeedback,
          request_deserializer=asgt_dot_dataservice_dot_v1alpha1_dot_data__pb2.FeedbackRequest.FromString,
          response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
      ),
      'AddBankData': grpc.unary_unary_rpc_method_handler(
          servicer.AddBankData,
          request_deserializer=asgt_dot_dataservice_dot_v1alpha1_dot_bank__pb2.AddBankDataRequest.FromString,
          response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
      ),
      'DeleteBankData': grpc.unary_unary_rpc_method_handler(
          servicer.DeleteBankData,
          request_deserializer=asgt_dot_dataservice_dot_v1alpha1_dot_data__pb2.DeleteRequest.FromString,
          response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
      ),
  }
  generic_handler = grpc.method_handlers_generic_handler(
      'asgt.dataservice.v1alpha1.BankDataservice', rpc_method_handlers)
  server.add_generic_rpc_handlers((generic_handler,))
