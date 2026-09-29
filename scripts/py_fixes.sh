#!/bin/bash
# Prefix the imports in the generated Python modules with the vml_proto package.
#
# Portable across GNU sed (Linux CI) and BSD sed (macOS): `-i.bak` is accepted by
# both, whereas a bare `-i` is GNU-only and BSD sed treats the script as the
# backup suffix. `find` replaces bash 4's globstar, which macOS bash 3.2 lacks.
set -euo pipefail

find gen/python/vml_proto -name '*.py' -exec sed -i.bak \
	-e 's/from asgt/from vml_proto.asgt/' \
	-e 's/from ssn/from vml_proto.ssn/' \
	-e 's/from validate/from vml_proto.validate/' \
	-e 's/from gen_bq_schema/from vml_proto.gen_bq_schema/' \
	-e 's/from google.api/from vml_proto.google.api/' \
	-e 's/from google.type/from vml_proto.google.type/' \
	-e 's/from protoc_gen_openapiv2.options/from vml_proto.protoc_gen_openapiv2.options/' \
	{} +

find gen/python/vml_proto -name '*.py.bak' -delete
