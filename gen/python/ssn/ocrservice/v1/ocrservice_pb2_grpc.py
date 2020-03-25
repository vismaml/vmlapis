# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
import grpc

from vml_proto.ssn.ocrservice.v1 import ocrservice_pb2 as ssn_dot_ocrservice_dot_v1_dot_ocrservice__pb2


class OcrServiceStub(object):
  """Interface exported by the server.
  """

  def __init__(self, channel):
    """Constructor.

    Args:
      channel: A grpc.Channel.
    """
    self.OcrScanImage = channel.unary_unary(
        '/ssn.ocrservice.v1.OcrService/OcrScanImage',
        request_serializer=ssn_dot_ocrservice_dot_v1_dot_ocrservice__pb2.OcrScanImageRequest.SerializeToString,
        response_deserializer=ssn_dot_ocrservice_dot_v1_dot_ocrservice__pb2.OcrScanImageResponse.FromString,
        )
    self.GetTextAnnotation = channel.unary_unary(
        '/ssn.ocrservice.v1.OcrService/GetTextAnnotation',
        request_serializer=ssn_dot_ocrservice_dot_v1_dot_ocrservice__pb2.GetTextAnnotationRequest.SerializeToString,
        response_deserializer=ssn_dot_ocrservice_dot_v1_dot_ocrservice__pb2.GetTextAnnotationResponse.FromString,
        )


class OcrServiceServicer(object):
  """Interface exported by the server.
  """

  def OcrScanImage(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def GetTextAnnotation(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')


def add_OcrServiceServicer_to_server(servicer, server):
  rpc_method_handlers = {
      'OcrScanImage': grpc.unary_unary_rpc_method_handler(
          servicer.OcrScanImage,
          request_deserializer=ssn_dot_ocrservice_dot_v1_dot_ocrservice__pb2.OcrScanImageRequest.FromString,
          response_serializer=ssn_dot_ocrservice_dot_v1_dot_ocrservice__pb2.OcrScanImageResponse.SerializeToString,
      ),
      'GetTextAnnotation': grpc.unary_unary_rpc_method_handler(
          servicer.GetTextAnnotation,
          request_deserializer=ssn_dot_ocrservice_dot_v1_dot_ocrservice__pb2.GetTextAnnotationRequest.FromString,
          response_serializer=ssn_dot_ocrservice_dot_v1_dot_ocrservice__pb2.GetTextAnnotationResponse.SerializeToString,
      ),
  }
  generic_handler = grpc.method_handlers_generic_handler(
      'ssn.ocrservice.v1.OcrService', rpc_method_handlers)
  server.add_generic_rpc_handlers((generic_handler,))
