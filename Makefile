buf:
	rm -rf core/sdk/src/main/gen
	rm -rf core/sdk/src/main/resources/protofds
	mkdir -p core/sdk/src/main/resources/protofds
	buf build --as-file-descriptor-set=true -o core/sdk/src/main/resources/protofds/viam.api buf.build/viamrobotics/api 
	buf generate --template buf.gen.yaml buf.build/viamrobotics/api
	buf generate --template buf.gen.yaml buf.build/viamrobotics/goutils
	buf generate --template buf.gen.yaml buf.build/googleapis/googleapis

run_client:
	./gradlew runExample1Client --args="localhost:8080"

run_client_webrtc_auth:
	./gradlew runExample2Client

run_client_grpc_auth:
	./gradlew runExample3Client

run_server:
	./gradlew runExample1Server --args="8080"
