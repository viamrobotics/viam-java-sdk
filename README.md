# Viam Java SDK

> [!WARNING]  
> This is an alpha release of the Viam Java SDK. 
> No guarantees are made to the stability of the API.

## Installation

This SDK provides Java and Android libraries. To install, add appropriate dependency to your gradle file:

```groovy
// build.gradle

dependencies {
    // For Java
    implementation 'com.viam:viam-java-sdk'

    // For Android
    implementation 'com.viam:viam-android-sdk'
}
```

The SDK also provides additional packages to enable various functionality:

* `viam-java-sdk-mlmodel-service` and `viam-android-sdk-mlmodel-service` for [machine learning models](https://docs.viam.com/ml/)
* `viam-android-module` for running modules on Android

See examples for more information:
* [Java Examples](https://github.com/viamrobotics/viam-java-sdk/tree/main/java/examples/src/main/java/com/viam/sdk/java/examples)
* [Android Examples](https://github.com/viamrobotics/viam-java-sdk/tree/main/android/examples)


## Dependencies

* JDK 21+ (source is Java 11 compatible) (be sure to set `JAVA_HOME`)
* Run `make setup buf`

## Pure Java SDK

### Server

* `make run_server`

### Client

* `make run_client`

## Publishing to mavenLocal

Run `./gradlew install`.

## Known Issues

* Android 10 (the min supported at API 29) testing appears to show that webrtc video decoding is
  failing. This needs to be looked into but could be a simple fix of passing in different decoder
  factory settings. Android 14 works great.
* Custom modular APIs not yet supported
* These libraries use protobuf-lite, not protobuf-java. See further discussion
  at https://github.com/protocolbuffers/protobuf/issues/8104
