# Generated by the Protocol Buffers compiler. DO NOT EDIT!
# source: ssn/ocrservice/v1/ocrservice.proto
# plugin: grpclib.plugin.main
import abc
import typing

import grpclib.const
import grpclib.client
if typing.TYPE_CHECKING:
    import grpclib.server

import google.protobuf.wrappers_pb2
import ssn.annotator.v1.annotator_pb2
import ssn.type.text_annotation_pb2
import ssn.ocrservice.v1.ocrservice_pb2


class OcrServiceBase(abc.ABC):

    @abc.abstractmethod
    async def OcrScanImage(self, stream: 'grpclib.server.Stream[ssn.ocrservice.v1.ocrservice_pb2.OcrScanImageRequest, ssn.ocrservice.v1.ocrservice_pb2.OcrScanImageResponse]') -> None:
        pass

    @abc.abstractmethod
    async def GetTextAnnotation(self, stream: 'grpclib.server.Stream[ssn.ocrservice.v1.ocrservice_pb2.GetTextAnnotationRequest, ssn.ocrservice.v1.ocrservice_pb2.GetTextAnnotationResponse]') -> None:
        pass

    def __mapping__(self) -> typing.Dict[str, grpclib.const.Handler]:
        return {
            '/ssn.ocrservice.v1.OcrService/OcrScanImage': grpclib.const.Handler(
                self.OcrScanImage,
                grpclib.const.Cardinality.UNARY_UNARY,
                ssn.ocrservice.v1.ocrservice_pb2.OcrScanImageRequest,
                ssn.ocrservice.v1.ocrservice_pb2.OcrScanImageResponse,
            ),
            '/ssn.ocrservice.v1.OcrService/GetTextAnnotation': grpclib.const.Handler(
                self.GetTextAnnotation,
                grpclib.const.Cardinality.UNARY_UNARY,
                ssn.ocrservice.v1.ocrservice_pb2.GetTextAnnotationRequest,
                ssn.ocrservice.v1.ocrservice_pb2.GetTextAnnotationResponse,
            ),
        }


class OcrServiceStub:

    def __init__(self, channel: grpclib.client.Channel) -> None:
        self.OcrScanImage = grpclib.client.UnaryUnaryMethod(
            channel,
            '/ssn.ocrservice.v1.OcrService/OcrScanImage',
            ssn.ocrservice.v1.ocrservice_pb2.OcrScanImageRequest,
            ssn.ocrservice.v1.ocrservice_pb2.OcrScanImageResponse,
        )
        self.GetTextAnnotation = grpclib.client.UnaryUnaryMethod(
            channel,
            '/ssn.ocrservice.v1.OcrService/GetTextAnnotation',
            ssn.ocrservice.v1.ocrservice_pb2.GetTextAnnotationRequest,
            ssn.ocrservice.v1.ocrservice_pb2.GetTextAnnotationResponse,
        )
