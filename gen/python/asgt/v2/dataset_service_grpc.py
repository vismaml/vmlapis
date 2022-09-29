# Generated by the Protocol Buffers compiler. DO NOT EDIT!
# source: asgt/v2/dataset_service.proto
# plugin: grpclib.plugin.main
import abc
import typing

import grpclib.const
import grpclib.client
if typing.TYPE_CHECKING:
    import grpclib.server

import asgt.type.dataset_pb2
import asgt.v2.type.example_pb2
import asgt.v2.type.training_pb2
import google.api.annotations_pb2
import google.protobuf.empty_pb2
import protoc_gen_openapiv2.options.annotations_pb2
import validate.validate_pb2
import asgt.v2.dataset_service_pb2


class DatasetServiceBase(abc.ABC):

    @abc.abstractmethod
    async def GetDataset(self, stream: 'grpclib.server.Stream[asgt.v2.dataset_service_pb2.GetDatasetRequest, asgt.type.dataset_pb2.Dataset]') -> None:
        pass

    @abc.abstractmethod
    async def CreateDataset(self, stream: 'grpclib.server.Stream[asgt.v2.dataset_service_pb2.CreateDatasetRequest, google.protobuf.empty_pb2.Empty]') -> None:
        pass

    @abc.abstractmethod
    async def CreateOrUpdateDataset(self, stream: 'grpclib.server.Stream[asgt.v2.dataset_service_pb2.CreateOrUpdateDatasetRequest, google.protobuf.empty_pb2.Empty]') -> None:
        pass

    @abc.abstractmethod
    async def DeleteDataset(self, stream: 'grpclib.server.Stream[asgt.v2.dataset_service_pb2.DeleteDatasetRequest, asgt.type.dataset_pb2.Dataset]') -> None:
        pass

    @abc.abstractmethod
    async def DeleteTag(self, stream: 'grpclib.server.Stream[asgt.v2.dataset_service_pb2.DeleteTagRequest, google.protobuf.empty_pb2.Empty]') -> None:
        pass

    @abc.abstractmethod
    async def CreateExample(self, stream: 'grpclib.server.Stream[asgt.v2.dataset_service_pb2.CreateExampleRequest, google.protobuf.empty_pb2.Empty]') -> None:
        pass

    @abc.abstractmethod
    async def CreateOrUpdateExample(self, stream: 'grpclib.server.Stream[asgt.v2.dataset_service_pb2.CreateOrUpdateExampleRequest, google.protobuf.empty_pb2.Empty]') -> None:
        pass

    @abc.abstractmethod
    async def BatchCreateExample(self, stream: 'grpclib.server.Stream[asgt.v2.dataset_service_pb2.BatchCreateExampleRequest, google.protobuf.empty_pb2.Empty]') -> None:
        pass

    @abc.abstractmethod
    async def TruncateDataset(self, stream: 'grpclib.server.Stream[asgt.v2.dataset_service_pb2.TruncateDatasetRequest, google.protobuf.empty_pb2.Empty]') -> None:
        pass

    @abc.abstractmethod
    async def GetDatasetTrainings(self, stream: 'grpclib.server.Stream[asgt.v2.dataset_service_pb2.GetDatasetTrainingsRequest, asgt.v2.dataset_service_pb2.TrainingsResponse]') -> None:
        pass

    @abc.abstractmethod
    async def GetTrainings(self, stream: 'grpclib.server.Stream[asgt.v2.dataset_service_pb2.GetTrainingsRequest, asgt.v2.dataset_service_pb2.TrainingsResponse]') -> None:
        pass

    def __mapping__(self) -> typing.Dict[str, grpclib.const.Handler]:
        return {
            '/asgt.v2.DatasetService/GetDataset': grpclib.const.Handler(
                self.GetDataset,
                grpclib.const.Cardinality.UNARY_UNARY,
                asgt.v2.dataset_service_pb2.GetDatasetRequest,
                asgt.type.dataset_pb2.Dataset,
            ),
            '/asgt.v2.DatasetService/CreateDataset': grpclib.const.Handler(
                self.CreateDataset,
                grpclib.const.Cardinality.UNARY_UNARY,
                asgt.v2.dataset_service_pb2.CreateDatasetRequest,
                google.protobuf.empty_pb2.Empty,
            ),
            '/asgt.v2.DatasetService/CreateOrUpdateDataset': grpclib.const.Handler(
                self.CreateOrUpdateDataset,
                grpclib.const.Cardinality.UNARY_UNARY,
                asgt.v2.dataset_service_pb2.CreateOrUpdateDatasetRequest,
                google.protobuf.empty_pb2.Empty,
            ),
            '/asgt.v2.DatasetService/DeleteDataset': grpclib.const.Handler(
                self.DeleteDataset,
                grpclib.const.Cardinality.UNARY_UNARY,
                asgt.v2.dataset_service_pb2.DeleteDatasetRequest,
                asgt.type.dataset_pb2.Dataset,
            ),
            '/asgt.v2.DatasetService/DeleteTag': grpclib.const.Handler(
                self.DeleteTag,
                grpclib.const.Cardinality.UNARY_UNARY,
                asgt.v2.dataset_service_pb2.DeleteTagRequest,
                google.protobuf.empty_pb2.Empty,
            ),
            '/asgt.v2.DatasetService/CreateExample': grpclib.const.Handler(
                self.CreateExample,
                grpclib.const.Cardinality.UNARY_UNARY,
                asgt.v2.dataset_service_pb2.CreateExampleRequest,
                google.protobuf.empty_pb2.Empty,
            ),
            '/asgt.v2.DatasetService/CreateOrUpdateExample': grpclib.const.Handler(
                self.CreateOrUpdateExample,
                grpclib.const.Cardinality.UNARY_UNARY,
                asgt.v2.dataset_service_pb2.CreateOrUpdateExampleRequest,
                google.protobuf.empty_pb2.Empty,
            ),
            '/asgt.v2.DatasetService/BatchCreateExample': grpclib.const.Handler(
                self.BatchCreateExample,
                grpclib.const.Cardinality.UNARY_UNARY,
                asgt.v2.dataset_service_pb2.BatchCreateExampleRequest,
                google.protobuf.empty_pb2.Empty,
            ),
            '/asgt.v2.DatasetService/TruncateDataset': grpclib.const.Handler(
                self.TruncateDataset,
                grpclib.const.Cardinality.UNARY_UNARY,
                asgt.v2.dataset_service_pb2.TruncateDatasetRequest,
                google.protobuf.empty_pb2.Empty,
            ),
            '/asgt.v2.DatasetService/GetDatasetTrainings': grpclib.const.Handler(
                self.GetDatasetTrainings,
                grpclib.const.Cardinality.UNARY_UNARY,
                asgt.v2.dataset_service_pb2.GetDatasetTrainingsRequest,
                asgt.v2.dataset_service_pb2.TrainingsResponse,
            ),
            '/asgt.v2.DatasetService/GetTrainings': grpclib.const.Handler(
                self.GetTrainings,
                grpclib.const.Cardinality.UNARY_UNARY,
                asgt.v2.dataset_service_pb2.GetTrainingsRequest,
                asgt.v2.dataset_service_pb2.TrainingsResponse,
            ),
        }


class DatasetServiceStub:

    def __init__(self, channel: grpclib.client.Channel) -> None:
        self.GetDataset = grpclib.client.UnaryUnaryMethod(
            channel,
            '/asgt.v2.DatasetService/GetDataset',
            asgt.v2.dataset_service_pb2.GetDatasetRequest,
            asgt.type.dataset_pb2.Dataset,
        )
        self.CreateDataset = grpclib.client.UnaryUnaryMethod(
            channel,
            '/asgt.v2.DatasetService/CreateDataset',
            asgt.v2.dataset_service_pb2.CreateDatasetRequest,
            google.protobuf.empty_pb2.Empty,
        )
        self.CreateOrUpdateDataset = grpclib.client.UnaryUnaryMethod(
            channel,
            '/asgt.v2.DatasetService/CreateOrUpdateDataset',
            asgt.v2.dataset_service_pb2.CreateOrUpdateDatasetRequest,
            google.protobuf.empty_pb2.Empty,
        )
        self.DeleteDataset = grpclib.client.UnaryUnaryMethod(
            channel,
            '/asgt.v2.DatasetService/DeleteDataset',
            asgt.v2.dataset_service_pb2.DeleteDatasetRequest,
            asgt.type.dataset_pb2.Dataset,
        )
        self.DeleteTag = grpclib.client.UnaryUnaryMethod(
            channel,
            '/asgt.v2.DatasetService/DeleteTag',
            asgt.v2.dataset_service_pb2.DeleteTagRequest,
            google.protobuf.empty_pb2.Empty,
        )
        self.CreateExample = grpclib.client.UnaryUnaryMethod(
            channel,
            '/asgt.v2.DatasetService/CreateExample',
            asgt.v2.dataset_service_pb2.CreateExampleRequest,
            google.protobuf.empty_pb2.Empty,
        )
        self.CreateOrUpdateExample = grpclib.client.UnaryUnaryMethod(
            channel,
            '/asgt.v2.DatasetService/CreateOrUpdateExample',
            asgt.v2.dataset_service_pb2.CreateOrUpdateExampleRequest,
            google.protobuf.empty_pb2.Empty,
        )
        self.BatchCreateExample = grpclib.client.UnaryUnaryMethod(
            channel,
            '/asgt.v2.DatasetService/BatchCreateExample',
            asgt.v2.dataset_service_pb2.BatchCreateExampleRequest,
            google.protobuf.empty_pb2.Empty,
        )
        self.TruncateDataset = grpclib.client.UnaryUnaryMethod(
            channel,
            '/asgt.v2.DatasetService/TruncateDataset',
            asgt.v2.dataset_service_pb2.TruncateDatasetRequest,
            google.protobuf.empty_pb2.Empty,
        )
        self.GetDatasetTrainings = grpclib.client.UnaryUnaryMethod(
            channel,
            '/asgt.v2.DatasetService/GetDatasetTrainings',
            asgt.v2.dataset_service_pb2.GetDatasetTrainingsRequest,
            asgt.v2.dataset_service_pb2.TrainingsResponse,
        )
        self.GetTrainings = grpclib.client.UnaryUnaryMethod(
            channel,
            '/asgt.v2.DatasetService/GetTrainings',
            asgt.v2.dataset_service_pb2.GetTrainingsRequest,
            asgt.v2.dataset_service_pb2.TrainingsResponse,
        )
