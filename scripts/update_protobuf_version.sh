#!/bin/bash
ls -la
# Extract protobuf version from generated Python files
PROTOBUF_VERSION=$(find gen/python/vml_proto -name "*.py" -exec grep "# Protobuf Python Version:" {} \; | head -1 | sed 's/.*: \([0-9.]*\).*/\1/')

if [ -z "$PROTOBUF_VERSION" ]; then
    echo "Warning: Could not extract protobuf version from generated files"
    echo "Using generic protobuf dependency without version constraint"
    VERSION_CONSTRAINT="protobuf"
else
    echo "Found protobuf version in generated files: $PROTOBUF_VERSION"
    # Use compatible release operator with exact version (e.g., "~=5.29.3")
    VERSION_CONSTRAINT="protobuf~=${PROTOBUF_VERSION}"
    echo "Using protobuf constraint: $VERSION_CONSTRAINT"
fi

# Update pyproject.toml using sed
sed -i.bak "s/\"protobuf[^\"]*\"/\"$VERSION_CONSTRAINT\"/" pyproject.toml

if [ $? -eq 0 ]; then
    rm -f pyproject.toml.bak
    echo "✅ Successfully updated pyproject.toml with protobuf constraint: $VERSION_CONSTRAINT"
else
    echo "❌ Error updating pyproject.toml"
    exit 1
fi
