# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
import grpc

from vml_proto.ssn.access.v1 import access_pb2 as ssn_dot_access_dot_v1_dot_access__pb2


class AccessStub(object):
  # missing associated documentation comment in .proto file
  pass

  def __init__(self, channel):
    """Constructor.

    Args:
      channel: A grpc.Channel.
    """
    self.GenerateValetKey = channel.unary_unary(
        '/ssn.access.v1.Access/GenerateValetKey',
        request_serializer=ssn_dot_access_dot_v1_dot_access__pb2.ValetKeyRequest.SerializeToString,
        response_deserializer=ssn_dot_access_dot_v1_dot_access__pb2.ValetKeyResponse.FromString,
        )


class AccessServicer(object):
  # missing associated documentation comment in .proto file
  pass

  def GenerateValetKey(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')


def add_AccessServicer_to_server(servicer, server):
  rpc_method_handlers = {
      'GenerateValetKey': grpc.unary_unary_rpc_method_handler(
          servicer.GenerateValetKey,
          request_deserializer=ssn_dot_access_dot_v1_dot_access__pb2.ValetKeyRequest.FromString,
          response_serializer=ssn_dot_access_dot_v1_dot_access__pb2.ValetKeyResponse.SerializeToString,
      ),
  }
  generic_handler = grpc.method_handlers_generic_handler(
      'ssn.access.v1.Access', rpc_method_handlers)
  server.add_generic_rpc_handlers((generic_handler,))
