# Generated by the Protocol Buffers compiler. DO NOT EDIT!
# source: ssn/access/v1/access.proto
# plugin: grpclib.plugin.main
import abc
import typing

import grpclib.const
import grpclib.client
if typing.TYPE_CHECKING:
    import grpclib.server

import google.api.annotations_pb2
import ssn.access.v1.access_pb2


class AccessBase(abc.ABC):

    @abc.abstractmethod
    async def GenerateValetKey(self, stream: 'grpclib.server.Stream[ssn.access.v1.access_pb2.ValetKeyRequest, ssn.access.v1.access_pb2.ValetKeyResponse]') -> None:
        pass

    def __mapping__(self) -> typing.Dict[str, grpclib.const.Handler]:
        return {
            '/ssn.access.v1.Access/GenerateValetKey': grpclib.const.Handler(
                self.GenerateValetKey,
                grpclib.const.Cardinality.UNARY_UNARY,
                ssn.access.v1.access_pb2.ValetKeyRequest,
                ssn.access.v1.access_pb2.ValetKeyResponse,
            ),
        }


class AccessStub:

    def __init__(self, channel: grpclib.client.Channel) -> None:
        self.GenerateValetKey = grpclib.client.UnaryUnaryMethod(
            channel,
            '/ssn.access.v1.Access/GenerateValetKey',
            ssn.access.v1.access_pb2.ValetKeyRequest,
            ssn.access.v1.access_pb2.ValetKeyResponse,
        )
