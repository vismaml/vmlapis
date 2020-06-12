# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
import grpc

from vml_proto.asgt.jester.v1alpha1 import jester_pb2 as asgt_dot_jester_dot_v1alpha1_dot_jester__pb2


class JesterStub(object):
  # missing associated documentation comment in .proto file
  pass

  def __init__(self, channel):
    """Constructor.

    Args:
      channel: A grpc.Channel.
    """
    self.Suggest = channel.unary_unary(
        '/asgt.jester.v1alpha1.Jester/Suggest',
        request_serializer=asgt_dot_jester_dot_v1alpha1_dot_jester__pb2.SuggestionRequest.SerializeToString,
        response_deserializer=asgt_dot_jester_dot_v1alpha1_dot_jester__pb2.SuggestionResponse.FromString,
        )


class JesterServicer(object):
  # missing associated documentation comment in .proto file
  pass

  def Suggest(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')


def add_JesterServicer_to_server(servicer, server):
  rpc_method_handlers = {
      'Suggest': grpc.unary_unary_rpc_method_handler(
          servicer.Suggest,
          request_deserializer=asgt_dot_jester_dot_v1alpha1_dot_jester__pb2.SuggestionRequest.FromString,
          response_serializer=asgt_dot_jester_dot_v1alpha1_dot_jester__pb2.SuggestionResponse.SerializeToString,
      ),
  }
  generic_handler = grpc.method_handlers_generic_handler(
      'asgt.jester.v1alpha1.Jester', rpc_method_handlers)
  server.add_generic_rpc_handlers((generic_handler,))
