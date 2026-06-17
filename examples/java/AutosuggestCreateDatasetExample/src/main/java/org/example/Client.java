package org.example;

import ai.visma.asgt.v2.BatchCreateExampleRequest;
import ai.visma.asgt.v2.CreateDatasetRequest;
import ai.visma.asgt.v2.DatasetServiceGrpc;
import ai.visma.asgt.v2.type.Data;
import ai.visma.asgt.v2.type.Example;
import ai.visma.asgt.v2.type.TargetValue;
import ai.visma.asgt.v2.type.Transaction;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        createDataset("test_001");
    }

    public static void createDataset(String datasetName) {
        // create a client stub for calling asgt
        ManagedChannel channel = ManagedChannelBuilder.forAddress("api.stag.asgt.visma.ai", 443).build();
        DatasetServiceGrpc.DatasetServiceBlockingStub stub = DatasetServiceGrpc.newBlockingStub(channel);

        // see the class for more info
        AuthenticationCallCredentials credentials = new AuthenticationCallCredentials("demo");

        // Step 1: Create an empty dataset
        CreateDatasetRequest createRequest = CreateDatasetRequest.newBuilder()
                .setDatasetName(datasetName)
                .addAllTags(Arrays.asList("example"))
                .build();

        stub.withCallCredentials(credentials).createDataset(createRequest);
        System.out.println("Dataset '" + datasetName + "' created.");

        // Step 2: Add examples to the dataset
        BatchCreateExampleRequest examplesRequest = BatchCreateExampleRequest.newBuilder()
                .setDatasetName(datasetName)
                .addAllExamples(Arrays.asList(Example.newBuilder()
                        .setData(Data.newBuilder()
                                .setTransaction(Transaction.newBuilder()
                                        .setAmount(2948.39F)
                                        .setText("Are simply this, along with some larger stones or cobbles, leaving a desert")
                                        .build())
                                .build())
                        .addAllTargetValues(Arrays.asList(
                                TargetValue.newBuilder().setName("IsItPricy").setValue("No").build()))
                        .build()))
                .build();

        stub.withCallCredentials(credentials).batchCreateExample(examplesRequest);
        System.out.println("Examples added to '" + datasetName + "'.");
    }
}
