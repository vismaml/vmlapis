all: 
	@rm -rf gen
	@echo "Generate all the things"

#	general code generation for all the supported languages
	buf generate proto --template buf.gen.all.yaml --verbose

#	grpc client/server code for all services (customer-facing and internal) - needs separate generation since 
#	python and js don't ignore .proto files with no grpc endpoints (results in too many empty grpc files generated) 
	buf generate proto --template buf.gen.grpc.yaml \
		--exclude-path proto/asgt/type \
		--exclude-path proto/asgt/v2/type \
		--exclude-path proto/ssn/type \
		--exclude-path proto/gen_bq_schema \
		--exclude-path proto/ssn/dataservice \
		--include-imports \
		--verbose

#	grpc C# plugin generates all files to root folder
#       this results in ssn/dataservice and asgt/dataservice being generated under the same filename "DataserviceGrpc.cs" which will overwrite whichever gets generated first
#	this workaround generates asgt/dataservice first, renames the file and then generates the other one (see exclude paths above and below)

	mv gen/csharp/DataServiceGrpc.cs gen/csharp/DataServiceAsgtGrpc.cs

	buf generate proto --template buf.gen.grpc.yaml \
		--exclude-path proto/asgt/type \
		--exclude-path proto/asgt/v2/type \
		--exclude-path proto/ssn/type \
		--exclude-path proto/gen_bq_schema \
		--exclude-path proto/asgt/data \
		--include-imports \
		--verbose

#	generates .pyi files for python intellisense
	buf generate proto --template buf.gen.python.yaml --include-imports

#	server-side validation, only targeting go code and only for asgt v2 api
	buf generate proto --template buf.gen.validate.go.yaml --path proto/asgt/v2  --verbose

#	openapiv2 (documentation and swagger) for asgt 
	sed "s/{_FILE_NAME}/asgt\/v1.json/g" buf.gen.openapiv2.yaml > buf.gen.openapiv2.asgt.v1.yaml
	buf generate proto --template buf.gen.openapiv2.asgt.v1.yaml --path proto/asgt/data/v1 --path proto/asgt/jester/v1  --verbose
	sed "s/{_FILE_NAME}/asgt\/v2.json/g" buf.gen.openapiv2.yaml > buf.gen.openapiv2.asgt.v2.yaml
	buf generate proto --template buf.gen.openapiv2.asgt.v2.yaml --path proto/asgt/v2 --exclude-path proto/asgt/v2/type  --verbose
	rm buf.gen.openapiv2.asgt.v1.yaml buf.gen.openapiv2.asgt.v2.yaml

#	openapiv2 (documentation and swagger) for ssn 
	sed "s/{_FILE_NAME}/ssn\/v1.json/g" buf.gen.openapiv2.yaml > buf.gen.openapiv2.ssn.v1.yaml
	buf generate proto --template buf.gen.openapiv2.ssn.v1.yaml --path proto/ssn/annotator --path proto/ssn/dataservice --path proto/ssn/asyncton  --verbose
	rm buf.gen.openapiv2.ssn.v1.yaml

#	descriptor (binary) generated from the service code, only needed for customer-facing services
	buf build proto -o gen/descriptor.bin \
		--path proto/ssn/annotator/v1/annotator.proto \
		--path proto/ssn/asyncton/v1/asyncton.proto \
		--path proto/ssn/access/v1/access.proto \
		--path proto/ssn/dataservice/v1/dataservice.proto \
		--path proto/asgt/jester/v1/jester.proto \
		--path proto/asgt/data/v1/data_service.proto \
		--path proto/asgt/v2/dataset_service.proto \
		--path proto/asgt/v2/suggester_service.proto \
		--path proto/cv/scanner/v1/scanner.proto \


#	extra generation of dependencies for js, java and C# since it can only use local .proto files (for now)
	buf generate deps --template buf.gen.deps.yaml

#	generate mock methods for the ssn's main services
	./scripts/gomock.sh

#	rewrite python import prefixes to match the hosted package name
	./scripts/py_fixes.sh

docker:
#	format files in the proto/ directory
	buf format proto -w

#	check for breaking changes against master branch
	buf breaking proto --against ".git#branch=master,subdir=proto"

	@rm -rf gen
	
#	run the code generation in docker and copy files to local directory in the end
	docker build --progress plain --build-arg BUF_TOKEN=$$BUF_TOKEN -t vmlapis .
	DOCKERID=$$(docker create vmlapis) ;\
	docker cp $$DOCKERID:/app/gen ./ ;\
	docker rm $$DOCKERID

.PHONY: all
.PHONY: docker
.DEFAULT_GOAL := docker
