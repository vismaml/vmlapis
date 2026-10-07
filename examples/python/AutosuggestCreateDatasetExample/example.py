import grpc
from vml_proto.asgt.v2.dataset_service_pb2 import (
    CreateDatasetRequest,
    BatchCreateExampleRequest,
)
from vml_proto.asgt.v2.dataset_service_pb2_grpc import DatasetServiceStub
from vml_proto.asgt.v2.type.data_pb2 import Data, Transaction
from vml_proto.asgt.v2.type.example_pb2 import Example
from vml_proto.asgt.v2.type.target_value_pb2 import TargetValue


def create_dataset(dataset_name):
    scc = grpc.ssl_channel_credentials()
    token = grpc.access_token_call_credentials("demo")
    credentials = grpc.composite_channel_credentials(scc, token)
    channel = grpc.secure_channel("api.stag.asgt.visma.ai:443", credentials)

    client = DatasetServiceStub(channel)

    # Step 1: Create an empty dataset
    create_rqst = CreateDatasetRequest(
        dataset_name=dataset_name,
        tags=["example"],
    )
    client.CreateDataset(create_rqst)
    print(f"Dataset '{dataset_name}' created.")

    # Step 2: Add examples to the dataset
    examples_rqst = BatchCreateExampleRequest(
        dataset_name=dataset_name,
        examples=[
            Example(
                data=Data(
                    transaction=Transaction(
                        amount=2948.39,
                        text="Are simply this, along with some larger stones or cobbles, leaving a desert",
                    )
                ),
                target_values=[
                    TargetValue(name="IsItPricy", value="No")
                ],
            )
        ],
    )
    response = client.BatchCreateExample(examples_rqst)
    print(f"Examples added to '{dataset_name}'.")
    print(response)


if __name__ == "__main__":
    create_dataset("test_001")
