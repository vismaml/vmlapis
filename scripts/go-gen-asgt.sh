#!/bin/bash

protoc -I./deps/googleapis -I./deps/tensorflow -I./deps/protoc-gen-openapiv2 -I./proto \
		--go_out=gen/go/ \
		--go-grpc_out=gen/go/ \
		--go_opt=paths=source_relative \
		--go-grpc_opt=paths=source_relative \
		proto/asgt/data/v1/*.proto

protoc -I./deps/googleapis -I./deps/tensorflow -I./deps/protoc-gen-openapiv2 -I./proto \
		--go_out=gen/go/ \
		--go-grpc_out=gen/go/ \
		--go_opt=paths=source_relative \
		--go-grpc_opt=paths=source_relative \
		proto/asgt/jester/v1/*.proto

protoc -I./deps/googleapis -I./deps/tensorflow -I./deps/protoc-gen-openapiv2 -I./proto \
    --openapiv2_out gen/openapiv2/ \
    --openapiv2_opt logtostderr=true \
    --openapiv2_opt allow_merge=true \
    --openapiv2_opt merge_file_name=asgt/v2alpha.json \
		--go_out=gen/go/ \
		--go-grpc_out=gen/go/ \
		--go_opt=paths=source_relative \
		--go-grpc_opt=paths=source_relative \
		proto/asgt/v2alpha/*.proto

# AutoSuggest v1 documentation:
protoc -I./deps/googleapis -I./deps/tensorflow -I./deps/protoc-gen-openapiv2 -I./proto \
    --openapiv2_out gen/openapiv2/ \
    --openapiv2_opt logtostderr=true \
    --openapiv2_opt allow_merge=true \
    --openapiv2_opt merge_file_name=asgt/v1.json \
		proto/asgt/jester/v1/*.proto \
		proto/asgt/data/v1/*.proto

protoc -I./deps/googleapis -I./deps/tensorflow -I./deps/protoc-gen-openapiv2 -I./proto \
		--go_out=gen/go/ \
		--go-grpc_out=gen/go/ \
		--go_opt=paths=source_relative \
		--go-grpc_opt=paths=source_relative \
		proto/asgt/modelregistry/v1/*.proto

protoc -I./deps/googleapis -I./deps/tensorflow -I./deps/protoc-gen-openapiv2 -I./proto \
		--go_out=gen/go/ \
		--go-grpc_out=gen/go/ \
		--go_opt=paths=source_relative \
		--go-grpc_opt=paths=source_relative \
		proto/asgt/type/*.proto
