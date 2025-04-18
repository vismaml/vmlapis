# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from vml_proto.asgt.jester.v1 import jester_pb2 as asgt_dot_jester_dot_v1_dot_jester__pb2


class JesterStub(object):
    """Missing associated documentation comment in .proto file."""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Suggest = channel.unary_unary(
                '/asgt.jester.v1.Jester/Suggest',
                request_serializer=asgt_dot_jester_dot_v1_dot_jester__pb2.SuggestionRequest.SerializeToString,
                response_deserializer=asgt_dot_jester_dot_v1_dot_jester__pb2.SuggestionResponse.FromString,
                _registered_method=True)
        self.InternalSuggest = channel.unary_unary(
                '/asgt.jester.v1.Jester/InternalSuggest',
                request_serializer=asgt_dot_jester_dot_v1_dot_jester__pb2.SuggestionRequest.SerializeToString,
                response_deserializer=asgt_dot_jester_dot_v1_dot_jester__pb2.SuggestionResponse.FromString,
                _registered_method=True)


class JesterServicer(object):
    """Missing associated documentation comment in .proto file."""

    def Suggest(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def InternalSuggest(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_JesterServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Suggest': grpc.unary_unary_rpc_method_handler(
                    servicer.Suggest,
                    request_deserializer=asgt_dot_jester_dot_v1_dot_jester__pb2.SuggestionRequest.FromString,
                    response_serializer=asgt_dot_jester_dot_v1_dot_jester__pb2.SuggestionResponse.SerializeToString,
            ),
            'InternalSuggest': grpc.unary_unary_rpc_method_handler(
                    servicer.InternalSuggest,
                    request_deserializer=asgt_dot_jester_dot_v1_dot_jester__pb2.SuggestionRequest.FromString,
                    response_serializer=asgt_dot_jester_dot_v1_dot_jester__pb2.SuggestionResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'asgt.jester.v1.Jester', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))
    server.add_registered_method_handlers('asgt.jester.v1.Jester', rpc_method_handlers)


 # This class is part of an EXPERIMENTAL API.
class Jester(object):
    """Missing associated documentation comment in .proto file."""

    @staticmethod
    def Suggest(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(
            request,
            target,
            '/asgt.jester.v1.Jester/Suggest',
            asgt_dot_jester_dot_v1_dot_jester__pb2.SuggestionRequest.SerializeToString,
            asgt_dot_jester_dot_v1_dot_jester__pb2.SuggestionResponse.FromString,
            options,
            channel_credentials,
            insecure,
            call_credentials,
            compression,
            wait_for_ready,
            timeout,
            metadata,
            _registered_method=True)

    @staticmethod
    def InternalSuggest(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(
            request,
            target,
            '/asgt.jester.v1.Jester/InternalSuggest',
            asgt_dot_jester_dot_v1_dot_jester__pb2.SuggestionRequest.SerializeToString,
            asgt_dot_jester_dot_v1_dot_jester__pb2.SuggestionResponse.FromString,
            options,
            channel_credentials,
            insecure,
            call_credentials,
            compression,
            wait_for_ready,
            timeout,
            metadata,
            _registered_method=True)
