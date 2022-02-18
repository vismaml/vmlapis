# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from vml_proto.asgt.type import dataset_pb2 as asgt_dot_type_dot_dataset__pb2
from vml_proto.asgt.v2 import dataset_service_pb2 as asgt_dot_v2_dot_dataset__service__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2


class DatasetServiceStub(object):
    """Missing associated documentation comment in .proto file."""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.GetDataset = channel.unary_unary(
                '/asgt.v2.DatasetService/GetDataset',
                request_serializer=asgt_dot_v2_dot_dataset__service__pb2.GetDatasetRequest.SerializeToString,
                response_deserializer=asgt_dot_type_dot_dataset__pb2.Dataset.FromString,
                )
        self.CreateDataset = channel.unary_unary(
                '/asgt.v2.DatasetService/CreateDataset',
                request_serializer=asgt_dot_v2_dot_dataset__service__pb2.CreateDatasetRequest.SerializeToString,
                response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
                )
        self.CreateOrUpdateDataset = channel.unary_unary(
                '/asgt.v2.DatasetService/CreateOrUpdateDataset',
                request_serializer=asgt_dot_v2_dot_dataset__service__pb2.CreateOrUpdateDatasetRequest.SerializeToString,
                response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
                )
        self.DeleteDataset = channel.unary_unary(
                '/asgt.v2.DatasetService/DeleteDataset',
                request_serializer=asgt_dot_v2_dot_dataset__service__pb2.DeleteDatasetRequest.SerializeToString,
                response_deserializer=asgt_dot_type_dot_dataset__pb2.Dataset.FromString,
                )
        self.DeleteTag = channel.unary_unary(
                '/asgt.v2.DatasetService/DeleteTag',
                request_serializer=asgt_dot_v2_dot_dataset__service__pb2.DeleteTagRequest.SerializeToString,
                response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
                )
        self.CreateExample = channel.unary_unary(
                '/asgt.v2.DatasetService/CreateExample',
                request_serializer=asgt_dot_v2_dot_dataset__service__pb2.CreateExampleRequest.SerializeToString,
                response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
                )
        self.CreateOrUpdateExample = channel.unary_unary(
                '/asgt.v2.DatasetService/CreateOrUpdateExample',
                request_serializer=asgt_dot_v2_dot_dataset__service__pb2.CreateOrUpdateExampleRequest.SerializeToString,
                response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
                )
        self.BatchCreateExample = channel.unary_unary(
                '/asgt.v2.DatasetService/BatchCreateExample',
                request_serializer=asgt_dot_v2_dot_dataset__service__pb2.BatchCreateExampleRequest.SerializeToString,
                response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
                )
        self.TruncateDataset = channel.unary_unary(
                '/asgt.v2.DatasetService/TruncateDataset',
                request_serializer=asgt_dot_v2_dot_dataset__service__pb2.TruncateDatasetRequest.SerializeToString,
                response_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
                )
        self.GetDatasetTrainings = channel.unary_unary(
                '/asgt.v2.DatasetService/GetDatasetTrainings',
                request_serializer=asgt_dot_v2_dot_dataset__service__pb2.GetDatasetTrainingsRequest.SerializeToString,
                response_deserializer=asgt_dot_v2_dot_dataset__service__pb2.TrainingsResponse.FromString,
                )
        self.GetTrainings = channel.unary_unary(
                '/asgt.v2.DatasetService/GetTrainings',
                request_serializer=asgt_dot_v2_dot_dataset__service__pb2.GetTrainingsRequest.SerializeToString,
                response_deserializer=asgt_dot_v2_dot_dataset__service__pb2.TrainingsResponse.FromString,
                )


class DatasetServiceServicer(object):
    """Missing associated documentation comment in .proto file."""

    def GetDataset(self, request, context):
        """Get the basic information about a dataset. This matches the behavior of the v1 API's info operation.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def CreateDataset(self, request, context):
        """Create a new dataset. Since no examples are provided in this operation, the training won't be scheduled
        until CreateExample or BatchCreateExample is called after the creation of the dataset.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def CreateOrUpdateDataset(self, request, context):
        """Create a new dataset. If a dataset with such name already exsits, it will be updated with the
        provided data.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DeleteDataset(self, request, context):
        """Delete a dataset with the specified name.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DeleteTag(self, request, context):
        """Delete all datasets (and their examples) containing the specified tag.
        The datasets' names are not considered in this request - only the tag names is.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def CreateExample(self, request, context):
        """Uploads a new single example.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def CreateOrUpdateExample(self, request, context):
        """Not implemented yet.
        Uploads or updates a new single example.
        If the specified example already exists, the example
        is updated with the provided values according to provided ID.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def BatchCreateExample(self, request, context):
        """Upload multiple examples at once. This matches the behavior of the v1 API's append operation.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def TruncateDataset(self, request, context):
        """Truncate a dataset. Use this operation to remove examples in a dataset used for future training without
        removing existing models.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetDatasetTrainings(self, request, context):
        """Get the specified number of the most recent dataset's trainings.
        Number of requested trainings has to be larger than 0 but no larger than 100.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetTrainings(self, request, context):
        """Get the specified number of the most recent trainings accross all consumer's datasets.
        Number of requested trainings has to be larger than 0 but no larger than 100.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_DatasetServiceServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'GetDataset': grpc.unary_unary_rpc_method_handler(
                    servicer.GetDataset,
                    request_deserializer=asgt_dot_v2_dot_dataset__service__pb2.GetDatasetRequest.FromString,
                    response_serializer=asgt_dot_type_dot_dataset__pb2.Dataset.SerializeToString,
            ),
            'CreateDataset': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateDataset,
                    request_deserializer=asgt_dot_v2_dot_dataset__service__pb2.CreateDatasetRequest.FromString,
                    response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
            ),
            'CreateOrUpdateDataset': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateOrUpdateDataset,
                    request_deserializer=asgt_dot_v2_dot_dataset__service__pb2.CreateOrUpdateDatasetRequest.FromString,
                    response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
            ),
            'DeleteDataset': grpc.unary_unary_rpc_method_handler(
                    servicer.DeleteDataset,
                    request_deserializer=asgt_dot_v2_dot_dataset__service__pb2.DeleteDatasetRequest.FromString,
                    response_serializer=asgt_dot_type_dot_dataset__pb2.Dataset.SerializeToString,
            ),
            'DeleteTag': grpc.unary_unary_rpc_method_handler(
                    servicer.DeleteTag,
                    request_deserializer=asgt_dot_v2_dot_dataset__service__pb2.DeleteTagRequest.FromString,
                    response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
            ),
            'CreateExample': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateExample,
                    request_deserializer=asgt_dot_v2_dot_dataset__service__pb2.CreateExampleRequest.FromString,
                    response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
            ),
            'CreateOrUpdateExample': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateOrUpdateExample,
                    request_deserializer=asgt_dot_v2_dot_dataset__service__pb2.CreateOrUpdateExampleRequest.FromString,
                    response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
            ),
            'BatchCreateExample': grpc.unary_unary_rpc_method_handler(
                    servicer.BatchCreateExample,
                    request_deserializer=asgt_dot_v2_dot_dataset__service__pb2.BatchCreateExampleRequest.FromString,
                    response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
            ),
            'TruncateDataset': grpc.unary_unary_rpc_method_handler(
                    servicer.TruncateDataset,
                    request_deserializer=asgt_dot_v2_dot_dataset__service__pb2.TruncateDatasetRequest.FromString,
                    response_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
            ),
            'GetDatasetTrainings': grpc.unary_unary_rpc_method_handler(
                    servicer.GetDatasetTrainings,
                    request_deserializer=asgt_dot_v2_dot_dataset__service__pb2.GetDatasetTrainingsRequest.FromString,
                    response_serializer=asgt_dot_v2_dot_dataset__service__pb2.TrainingsResponse.SerializeToString,
            ),
            'GetTrainings': grpc.unary_unary_rpc_method_handler(
                    servicer.GetTrainings,
                    request_deserializer=asgt_dot_v2_dot_dataset__service__pb2.GetTrainingsRequest.FromString,
                    response_serializer=asgt_dot_v2_dot_dataset__service__pb2.TrainingsResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'asgt.v2.DatasetService', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class DatasetService(object):
    """Missing associated documentation comment in .proto file."""

    @staticmethod
    def GetDataset(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/asgt.v2.DatasetService/GetDataset',
            asgt_dot_v2_dot_dataset__service__pb2.GetDatasetRequest.SerializeToString,
            asgt_dot_type_dot_dataset__pb2.Dataset.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def CreateDataset(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/asgt.v2.DatasetService/CreateDataset',
            asgt_dot_v2_dot_dataset__service__pb2.CreateDatasetRequest.SerializeToString,
            google_dot_protobuf_dot_empty__pb2.Empty.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def CreateOrUpdateDataset(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/asgt.v2.DatasetService/CreateOrUpdateDataset',
            asgt_dot_v2_dot_dataset__service__pb2.CreateOrUpdateDatasetRequest.SerializeToString,
            google_dot_protobuf_dot_empty__pb2.Empty.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DeleteDataset(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/asgt.v2.DatasetService/DeleteDataset',
            asgt_dot_v2_dot_dataset__service__pb2.DeleteDatasetRequest.SerializeToString,
            asgt_dot_type_dot_dataset__pb2.Dataset.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DeleteTag(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/asgt.v2.DatasetService/DeleteTag',
            asgt_dot_v2_dot_dataset__service__pb2.DeleteTagRequest.SerializeToString,
            google_dot_protobuf_dot_empty__pb2.Empty.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def CreateExample(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/asgt.v2.DatasetService/CreateExample',
            asgt_dot_v2_dot_dataset__service__pb2.CreateExampleRequest.SerializeToString,
            google_dot_protobuf_dot_empty__pb2.Empty.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def CreateOrUpdateExample(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/asgt.v2.DatasetService/CreateOrUpdateExample',
            asgt_dot_v2_dot_dataset__service__pb2.CreateOrUpdateExampleRequest.SerializeToString,
            google_dot_protobuf_dot_empty__pb2.Empty.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def BatchCreateExample(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/asgt.v2.DatasetService/BatchCreateExample',
            asgt_dot_v2_dot_dataset__service__pb2.BatchCreateExampleRequest.SerializeToString,
            google_dot_protobuf_dot_empty__pb2.Empty.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def TruncateDataset(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/asgt.v2.DatasetService/TruncateDataset',
            asgt_dot_v2_dot_dataset__service__pb2.TruncateDatasetRequest.SerializeToString,
            google_dot_protobuf_dot_empty__pb2.Empty.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetDatasetTrainings(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/asgt.v2.DatasetService/GetDatasetTrainings',
            asgt_dot_v2_dot_dataset__service__pb2.GetDatasetTrainingsRequest.SerializeToString,
            asgt_dot_v2_dot_dataset__service__pb2.TrainingsResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetTrainings(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/asgt.v2.DatasetService/GetTrainings',
            asgt_dot_v2_dot_dataset__service__pb2.GetTrainingsRequest.SerializeToString,
            asgt_dot_v2_dot_dataset__service__pb2.TrainingsResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)
