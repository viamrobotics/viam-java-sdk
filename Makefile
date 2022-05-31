PLATFORM=$(shell uname -s | tr '[:upper:]' '[:lower:]')

ifeq ($(PLATFORM),darwin)
	GRPC_JAVA="https://repo1.maven.org/maven2/io/grpc/protoc-gen-grpc-java/1.39.0/protoc-gen-grpc-java-1.39.0-osx-x86_64.exe"
else ifeq ($(PLATFORM),linux)
	GRPC_JAVA="https://repo1.maven.org/maven2/io/grpc/protoc-gen-grpc-java/1.39.0/protoc-gen-grpc-java-1.39.0-linux-x86_64.exe"
else
$(error unknown platform $(PLATFORM))
endif

THIS_DIR := $(dir $(abspath $(lastword $(MAKEFILE_LIST))))

check-%:
	@: $(if $(value $*),,$(error $* is undefined))

buf: check-RDK
	rm -rf core/sdk/src/main/gen
	cd $(RDK) && buf generate --template $(THIS_DIR)buf.gen.yaml
	cd $(RDK) && buf generate --template $(THIS_DIR)buf.gen.yaml buf.build/googleapis/googleapis
	cd $(RDK) && buf generate --template $(THIS_DIR)buf.gen.yaml buf.build/viamrobotics/goutils
	cd $(RDK) && buf generate --template $(THIS_DIR)buf.gen.yaml buf.build/erdaniels/gostream
	mv $(RDK)/core/sdk/src/main/gen ./core/sdk/src/main
	rm -rf core/sdk/src/main/gen/io
	rm -rf core/sdk/src/main/gen/google
	ls core/sdk/src/main/gen/com/google | grep -v api | xargs -I {} rm -rf core/sdk/src/main/gen/com/google/{}

setup:
	sudo curl -o /usr/local/bin/protoc-gen-grpc-java -L ${GRPC_JAVA}
	sudo chmod +x /usr/local/bin/protoc-gen-grpc-java

run_client:
	./gradlew runClient --args="localhost:8080"

run_server:
	./gradlew runServer --args="8080"
