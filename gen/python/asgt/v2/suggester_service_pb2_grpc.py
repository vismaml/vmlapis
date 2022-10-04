# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from asgt.v2 import suggester_service_pb2 as asgt_dot_v2_dot_suggester__service__pb2


class SuggesterServiceStub(object):
    """Missing associated documentation comment in .proto file."""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Suggest = channel.unary_unary(
                '/asgt.v2.SuggesterService/Suggest',
                request_serializer=asgt_dot_v2_dot_suggester__service__pb2.SuggestRequest.SerializeToString,
                response_deserializer=asgt_dot_v2_dot_suggester__service__pb2.SuggestResponse.FromString,
                )
        self.BatchSuggest = channel.unary_unary(
                '/asgt.v2.SuggesterService/BatchSuggest',
                request_serializer=asgt_dot_v2_dot_suggester__service__pb2.BatchSuggestRequest.SerializeToString,
                response_deserializer=asgt_dot_v2_dot_suggester__service__pb2.BatchSuggestResponse.FromString,
                )
        self.ModelBatchSuggest = channel.unary_unary(
                '/asgt.v2.SuggesterService/ModelBatchSuggest',
                request_serializer=asgt_dot_v2_dot_suggester__service__pb2.BatchSuggestRequest.SerializeToString,
                response_deserializer=asgt_dot_v2_dot_suggester__service__pb2.BatchSuggestResponse.FromString,
                )


class SuggesterServiceServicer(object):
    """Missing associated documentation comment in .proto file."""

    def Suggest(self, request, context):
        """Suggest target values for some input using a dataset, returning an empty result if no model exists.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def BatchSuggest(self, request, context):
        """BatchSuggest target values for multiple inputs using a dataset, returning an empty result if no model exists.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ModelBatchSuggest(self, request, context):
        """Suggest target values for multiple inputs using the most recently trained model in a dataset.
        Returns 404 if a dataset exists, but no model has been trained. This matches the behavior of the v1 API.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_SuggesterServiceServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Suggest': grpc.unary_unary_rpc_method_handler(
                    servicer.Suggest,
                    request_deserializer=asgt_dot_v2_dot_suggester__service__pb2.SuggestRequest.FromString,
                    response_serializer=asgt_dot_v2_dot_suggester__service__pb2.SuggestResponse.SerializeToString,
            ),
            'BatchSuggest': grpc.unary_unary_rpc_method_handler(
                    servicer.BatchSuggest,
                    request_deserializer=asgt_dot_v2_dot_suggester__service__pb2.BatchSuggestRequest.FromString,
                    response_serializer=asgt_dot_v2_dot_suggester__service__pb2.BatchSuggestResponse.SerializeToString,
            ),
            'ModelBatchSuggest': grpc.unary_unary_rpc_method_handler(
                    servicer.ModelBatchSuggest,
                    request_deserializer=asgt_dot_v2_dot_suggester__service__pb2.BatchSuggestRequest.FromString,
                    response_serializer=asgt_dot_v2_dot_suggester__service__pb2.BatchSuggestResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'asgt.v2.SuggesterService', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class SuggesterService(object):
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
        return grpc.experimental.unary_unary(request, target, '/asgt.v2.SuggesterService/Suggest',
            asgt_dot_v2_dot_suggester__service__pb2.SuggestRequest.SerializeToString,
            asgt_dot_v2_dot_suggester__service__pb2.SuggestResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def BatchSuggest(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/asgt.v2.SuggesterService/BatchSuggest',
            asgt_dot_v2_dot_suggester__service__pb2.BatchSuggestRequest.SerializeToString,
            asgt_dot_v2_dot_suggester__service__pb2.BatchSuggestResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ModelBatchSuggest(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/asgt.v2.SuggesterService/ModelBatchSuggest',
            asgt_dot_v2_dot_suggester__service__pb2.BatchSuggestRequest.SerializeToString,
            asgt_dot_v2_dot_suggester__service__pb2.BatchSuggestResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
