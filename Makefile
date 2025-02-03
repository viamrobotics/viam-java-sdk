.PHONY: buf
buf:
	rm -rf core/sdk/src/main/gen
	rm -rf core/sdk/src/main/resources/protofds
	mkdir -p core/sdk/src/main/resources/protofds
	buf build --as-file-descriptor-set=true -o core/sdk/src/main/resources/protofds/viam.api buf.build/viamrobotics/api:$$(cat api_version.lock)
	buf generate --template buf.gen.yaml buf.build/viamrobotics/api:$$(cat api_version.lock)
	buf generate --template buf.gen.yaml buf.build/viamrobotics/goutils
	buf generate --template buf.gen.yaml buf.build/googleapis/googleapis
	mv core/sdk/src/main/gen/com/viam/component/switch core/sdk/src/main/gen/com/viam/component/nswitch
	find . -type f -name '*.java' -print0 | xargs sed -i '' -e 's/com\.viam\.component\.switch\.v1/com\.viam\.component\.nswitch\.v1/g';

.PHONY: run_client
run_client:
	./gradlew runExample1Client --args="localhost:8080"

.PHONY: run_client_webrtc_auth
run_client_webrtc_auth:
	./gradlew runExample2Client

.PHONY: run_client_grpc_auth
run_client_grpc_auth:
	./gradlew runExample3Client

.PHONY: run_server
run_server:
	./gradlew runExample1Server --args="8080"
