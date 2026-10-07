using Asgt.V2;
using Asgt.V2.Type;
using Grpc.Core;
using Grpc.Net.Client;
using DatasetService = Asgt.V2.DatasetService;

namespace ConsoleApp1;

static class Program
{
    public static void Main(string[] args)
    {
        createDataset("test_001");
    }

    static void createDataset(String datasetName)
    {
        // create a client
        using var channel = GrpcChannel.ForAddress("https://api.stag.asgt.visma.ai:443");
        var client = new DatasetService.DatasetServiceClient(channel);

        var metadata = new Metadata();
        metadata.Add("authorization", "Bearer demo");

        // Step 1: Create an empty dataset
        var createRequest = new CreateDatasetRequest
        {
            DatasetName = datasetName,
            Tags = { "example" },
        };

        client.CreateDataset(createRequest, metadata);
        Console.WriteLine($"Dataset '{datasetName}' created.");

        // Step 2: Add examples to the dataset
        var examples = createExamples();
        var examplesRequest = new BatchCreateExampleRequest
        {
            DatasetName = datasetName,
            Examples = { examples },
        };

        client.BatchCreateExample(examplesRequest, metadata);
        Console.WriteLine($"Examples added to '{datasetName}'.");
    }

    static List<Example> createExamples()
    {
        var examples = new List<Example>();
        examples.Add(new Example
            {
                Data = new Data
                {
                    Transaction = new Transaction
                    {
                        Amount = 2948.39f,
                        Text = "Are simply this, along with some larger stones or cobbles, leaving a desert"
                    }
                },
                TargetValues =
                {
                    new TargetValue { Name = "IsItPricy", Value = "No" }
                }
            }
        );
        return examples;
    }
}
