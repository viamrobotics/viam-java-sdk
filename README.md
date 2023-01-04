# Viam Java SDK

## Dependencies

* JDK 11+
* Run `make setup buf`

## Pure Java SDK

### Server
* `make run_server`

### Client
* `make run_client`

## Building Dependencies

### Android SDK - Compiling libwertc.aar

See https://medium.com/@abdularis/how-to-compile-native-webrtc-from-source-for-android-d0bac8e4c933 for instructions. Once built,
put the resulting AAR in `android/libwebrtc`.

### webrtc-java on MacOS M1 (aarch64)

As of Dec 2022, mac/aarch64 builds of webrtc-java are not available. To build, checkout https://github.com/devopvoid/webrtc-java and build using `mvn install`. The build will take 30+ minutes as it has to checkout a ~15gb webrtc source package and toolchain (Tip: fast and stable wifi conneciton is key). The artifact will be installed in the default gradle package directory.

## Publishing to mavenLocal

Run `./gradlew install`.
