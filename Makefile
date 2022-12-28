PLATFORM=$(shell uname -s | tr '[:upper:]' '[:lower:]')

ifeq ($(PLATFORM),darwin)
	GRPC_JAVA="https://repo1.maven.org/maven2/io/grpc/protoc-gen-grpc-java/1.51.1/protoc-gen-grpc-java-1.51.1-osx-x86_64.exe"
else ifeq ($(PLATFORM),linux)
	GRPC_JAVA="https://repo1.maven.org/maven2/io/grpc/protoc-gen-grpc-java/1.51.1/protoc-gen-grpc-java-1.51.1-linux-x86_64.exe"
else
$(error unknown platform $(PLATFORM))
endif

buf:
	rm -rf core/sdk/src/main/gen
	buf generate --template buf.gen.yaml buf.build/viamrobotics/api
	buf generate --template buf.gen.yaml buf.build/viamrobotics/goutils
	buf generate --template buf.gen.yaml buf.build/erdaniels/gostream

setup:
	sudo curl -o /usr/local/bin/protoc-gen-grpc-java -L ${GRPC_JAVA}
	sudo chmod +x /usr/local/bin/protoc-gen-grpc-java

run_client:
	./gradlew runExample1Client --args="localhost:8080"

run_server:
	./gradlew runExample1Server --args="8080"
