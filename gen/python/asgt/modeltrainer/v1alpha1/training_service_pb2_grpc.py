# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
import grpc

from vml_proto.asgt.modeltrainer.v1alpha1 import training_service_pb2 as asgt_dot_modeltrainer_dot_v1alpha1_dot_training__service__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2


class TrainingServiceStub(object):
  # missing associated documentation comment in .proto file
  pass

  def __init__(self, channel):
    """Constructor.

    Args:
      channel: A grpc.Channel.
    """
    self.TrainModel = channel.unary_unary(
        '/asgt.modeltrainer.v1alpha1.TrainingService/TrainModel',
        request_serializer=asgt_dot_modeltrainer_dot_v1alpha1_dot_training__service__pb2.TrainModelRequest.SerializeToString,
        response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
        )
    self.SetTaskStatus = channel.unary_unary(
        '/asgt.modeltrainer.v1alpha1.TrainingService/SetTaskStatus',
        request_serializer=asgt_dot_modeltrainer_dot_v1alpha1_dot_training__service__pb2.SetTaskStatusRequest.SerializeToString,
        response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
        )


class TrainingServiceServicer(object):
  # missing associated documentation comment in .proto file
  pass

  def TrainModel(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def SetTaskStatus(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')


def add_TrainingServiceServicer_to_server(servicer, server):
  rpc_method_handlers = {
      'TrainModel': grpc.unary_unary_rpc_method_handler(
          servicer.TrainModel,
          request_deserializer=asgt_dot_modeltrainer_dot_v1alpha1_dot_training__service__pb2.TrainModelRequest.FromString,
          response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
      ),
      'SetTaskStatus': grpc.unary_unary_rpc_method_handler(
          servicer.SetTaskStatus,
          request_deserializer=asgt_dot_modeltrainer_dot_v1alpha1_dot_training__service__pb2.SetTaskStatusRequest.FromString,
          response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
      ),
  }
  generic_handler = grpc.method_handlers_generic_handler(
      'asgt.modeltrainer.v1alpha1.TrainingService', rpc_method_handlers)
  server.add_generic_rpc_handlers((generic_handler,))
