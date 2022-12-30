# Viam Java SDK

## Dependencies

* JDK 11+
* Run `make setup buf`

## Pure Java SDK

### Server
* `make run_server`

### Client
* `make run_client`

## Android SDK

### Compiling libwertc.aar

See https://medium.com/@abdularis/how-to-compile-native-webrtc-from-source-for-android-d0bac8e4c933 for instructions. Once built,
put the resulting AAR in `android/libwebrtc`.

## Publishing to mavenLocal

Run `./gradlew install`.
