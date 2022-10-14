# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from vml_proto.ssn.annotator.v1 import annotator_pb2 as ssn_dot_annotator_dot_v1_dot_annotator__pb2


class DocumentAnnotatorStub(object):
    """Missing associated documentation comment in .proto file."""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.AnnotateDocument = channel.unary_unary(
                '/ssn.annotator.v1.DocumentAnnotator/AnnotateDocument',
                request_serializer=ssn_dot_annotator_dot_v1_dot_annotator__pb2.DocumentAnnotatorRequest.SerializeToString,
                response_deserializer=ssn_dot_annotator_dot_v1_dot_annotator__pb2.DocumentAnnotatorResponse.FromString,
                )


class DocumentAnnotatorServicer(object):
    """Missing associated documentation comment in .proto file."""

    def AnnotateDocument(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_DocumentAnnotatorServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'AnnotateDocument': grpc.unary_unary_rpc_method_handler(
                    servicer.AnnotateDocument,
                    request_deserializer=ssn_dot_annotator_dot_v1_dot_annotator__pb2.DocumentAnnotatorRequest.FromString,
                    response_serializer=ssn_dot_annotator_dot_v1_dot_annotator__pb2.DocumentAnnotatorResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'ssn.annotator.v1.DocumentAnnotator', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class DocumentAnnotator(object):
    """Missing associated documentation comment in .proto file."""

    @staticmethod
    def AnnotateDocument(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/ssn.annotator.v1.DocumentAnnotator/AnnotateDocument',
            ssn_dot_annotator_dot_v1_dot_annotator__pb2.DocumentAnnotatorRequest.SerializeToString,
            ssn_dot_annotator_dot_v1_dot_annotator__pb2.DocumentAnnotatorResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
