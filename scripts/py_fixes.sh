#!/bin/bash
shopt -s globstar

# replace for asgt modules
sed -i 's/from asgt/from vml_proto.asgt/' gen/python/vml_proto/**/*.py
# replace for ssn modules
sed -i 's/from ssn/from vml_proto.ssn/' gen/python/vml_proto/**/*.py
# replace for validate modules
sed -i 's/from validate/from vml_proto.validate/' gen/python/vml_proto/**/*.py
# replace for gen_bq_schema modules
sed -i 's/from gen_bq_schema/from vml_proto.gen_bq_schema/' gen/python/vml_proto/**/*.py
# replace for google modules
sed -i 's/from google.api/from vml_proto.google.api/;s/from google.type/from vml_proto.google.type/' gen/python/vml_proto/**/*.py
# replace for protoc_gen_openapiv2 modules
sed -i 's/from protoc_gen_openapiv2.options/from vml_proto.protoc_gen_openapiv2.options/' gen/python/vml_proto/**/*.py
