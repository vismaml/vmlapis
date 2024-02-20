# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from cv.scanner.v1 import scanner_pb2 as cv_dot_scanner_dot_v1_dot_scanner__pb2


class ScannerStub(object):
    """Missing associated documentation comment in .proto file."""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.ScanCV = channel.unary_unary(
                '/cv.scanner.v1.Scanner/ScanCV',
                request_serializer=cv_dot_scanner_dot_v1_dot_scanner__pb2.ScanCVRequest.SerializeToString,
                response_deserializer=cv_dot_scanner_dot_v1_dot_scanner__pb2.ScanCVResponse.FromString,
                )


class ScannerServicer(object):
    """Missing associated documentation comment in .proto file."""

    def ScanCV(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_ScannerServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'ScanCV': grpc.unary_unary_rpc_method_handler(
                    servicer.ScanCV,
                    request_deserializer=cv_dot_scanner_dot_v1_dot_scanner__pb2.ScanCVRequest.FromString,
                    response_serializer=cv_dot_scanner_dot_v1_dot_scanner__pb2.ScanCVResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'cv.scanner.v1.Scanner', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Scanner(object):
    """Missing associated documentation comment in .proto file."""

    @staticmethod
    def ScanCV(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/cv.scanner.v1.Scanner/ScanCV',
            cv_dot_scanner_dot_v1_dot_scanner__pb2.ScanCVRequest.SerializeToString,
            cv_dot_scanner_dot_v1_dot_scanner__pb2.ScanCVResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
