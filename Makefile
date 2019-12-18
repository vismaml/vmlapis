all:
	@rm -rf gen
	@echo "Generate all the things"
	cd proto && prototool all
	protoc -I./deps/googleapis -I./proto \
		--include_imports --include_source_info \
		--descriptor_set_out=gen/descriptor.bin \
		proto/ssn/annotator/v1/annotator.proto \
		proto/ssn/access/v1/access.proto \
		proto/ssn/dataservice/v1alpha1/dataservice.proto
	./scripts/gomock.sh
	./scripts/py_fixes.sh
	./scripts/js_fixes.sh

docker:
	@rm -rf gen
	docker build -t vmlapis .
	DOCKERID=$$(docker create vmlapis) ;\
	docker cp $$DOCKERID:/app/gen ./ ;\
	docker rm $$DOCKERID

bigquery:
	cp -r ./gen/bq/ssn/dataservice ../ssn-terraform/bq

.PHONY: all
.PHONY: docker
.DEFAULT_GOAL := docker
