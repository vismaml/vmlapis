package main

import (
	"context"
	"fmt"

	v2 "github.com/e-conomic/vmlapis/gen/go/asgt/v2"
	asgttype "github.com/e-conomic/vmlapis/gen/go/asgt/v2/type"
	"google.golang.org/grpc"
	"google.golang.org/grpc/credentials"
	"google.golang.org/grpc/metadata"
)

func main() {
	CreateDataset("test_001")
}

func CreateDataset(datasetName string) {
	// create connection
	conn, err := grpc.NewClient("api.stag.asgt.visma.ai:443", grpc.WithTransportCredentials(credentials.NewTLS(nil)))
	if err != nil {
		fmt.Println(err)
		return
	}

	// create client
	client := v2.NewDatasetServiceClient(conn)

	// add token metadata
	ctx := metadata.AppendToOutgoingContext(context.Background(), "authorization", "Bearer "+"demo")

	// Step 1: Create an empty dataset
	createRequest := &v2.CreateDatasetRequest{
		DatasetName: datasetName,
		Tags:        []string{"example"},
	}

	_, err = client.CreateDataset(ctx, createRequest)
	if err != nil {
		fmt.Println(err)
		return
	}
	fmt.Printf("Dataset '%s' created.\n", datasetName)

	// Step 2: Add examples to the dataset
	examplesRequest := &v2.BatchCreateExampleRequest{
		DatasetName: datasetName,
		Examples: []*asgttype.Example{
			{
				Data: &asgttype.Data{
					DataStructure: &asgttype.Data_Transaction{
						Transaction: &asgttype.Transaction{
							Amount: 2948.39,
							Text:   "Are simply this, along with some larger stones or cobbles, leaving a desert",
						},
					},
				},
				TargetValues: []*asgttype.TargetValue{
					{Name: "IsItPricy", Value: "No"},
				},
			},
		},
	}

	_, err = client.BatchCreateExample(ctx, examplesRequest)
	if err != nil {
		fmt.Println(err)
		return
	}
	fmt.Printf("Examples added to '%s'.\n", datasetName)
}
