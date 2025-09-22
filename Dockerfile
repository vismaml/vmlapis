FROM buildpack-deps:bullseye-scm

COPY --from=golang:1.20-bullseye /usr/local/go/ /usr/local/go/

ENV PATH=/usr/local/go/bin:${PATH}
ENV GOPATH=/go
ENV PATH=/go/bin:$PATH

# https://buf.build/docs/bsr/authentication
ARG BUF_TOKEN
ENV BUF_TOKEN=${BUF_TOKEN}

RUN mkdir -p ${GOPATH}/src ${GOPATH}/bin

RUN apt-get update && \
  apt-get install -y --no-install-recommends \
  protobuf-compiler-grpc \
  make \
  golang-goprotobuf-dev

ARG BIN=/usr/local/bin
ARG VERSION=1.56.0
RUN curl -sSL \
  https://github.com/bufbuild/buf/releases/download/v${VERSION}/buf-$(uname -s)-$(uname -m) \
  -o ${BIN}/buf && \  
  chmod +x ${BIN}/buf

WORKDIR /app

COPY ["go.mod", "go.sum", "buf.gen.*", "/app/"]
RUN go mod download \
  && go get github.com/golang/mock/mockgen github.com/envoyproxy/protoc-gen-validate \
  && go install github.com/golang/mock/mockgen github.com/envoyproxy/protoc-gen-validate

COPY Makefile /app/
COPY deps deps
COPY scripts scripts
COPY proto proto
RUN make all
