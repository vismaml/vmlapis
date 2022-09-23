# Generated by the Protocol Buffers compiler. DO NOT EDIT!
# source: cv/cv.proto
# plugin: grpclib.plugin.main
import abc
import typing

import grpclib.const
import grpclib.client
if typing.TYPE_CHECKING:
    import grpclib.server

import google.api.annotations_pb2
import google.api.http_pb2
import ssn.type.candidate_pb2
import cv.cv_pb2


class CvScannerBase(abc.ABC):

    @abc.abstractmethod
    async def ScanDocument(self, stream: 'grpclib.server.Stream[cv.cv_pb2.ScanDocumentRequest, cv.cv_pb2.ScanDocumentResponse]') -> None:
        pass

    def __mapping__(self) -> typing.Dict[str, grpclib.const.Handler]:
        return {
            '/cv.scanner.v1.CvScanner/ScanDocument': grpclib.const.Handler(
                self.ScanDocument,
                grpclib.const.Cardinality.UNARY_UNARY,
                cv.cv_pb2.ScanDocumentRequest,
                cv.cv_pb2.ScanDocumentResponse,
            ),
        }


class CvScannerStub:

    def __init__(self, channel: grpclib.client.Channel) -> None:
        self.ScanDocument = grpclib.client.UnaryUnaryMethod(
            channel,
            '/cv.scanner.v1.CvScanner/ScanDocument',
            cv.cv_pb2.ScanDocumentRequest,
            cv.cv_pb2.ScanDocumentResponse,
        )
