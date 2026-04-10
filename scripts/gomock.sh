#!/bin/bash

FILES=(
    "gen/go/ssn/ocrservice/v1/ocrservice_grpc.pb.go"
    "gen/go/ssn/mlservice/v2/mlservice_grpc.pb.go"
    "gen/go/ssn/pdfservice/v1/pdfservice_grpc.pb.go"
    "gen/go/ssn/annotator/v1/annotator_grpc.pb.go"
    "gen/go/ssn/dataservice/v1/dataservice_grpc.pb.go"
    "gen/go/ssn/documentdataservice/v1/document_data_service_grpc.pb.go"
)
	

for FILE in ${FILES[@]}; do
    FILENAME_WITH_EXT=$(basename -- "$FILE")
    DIRNAME=$(dirname -- "$FILE")
    FILENAME="${FILENAME_WITH_EXT%.pb.go}"
    mockgen -source "$FILE" -destination "$DIRNAME"/mock/mock_"$FILENAME".go
    echo $FILE "->" "$DIRNAME"/mock/mock_"$FILENAME".go
done
