# Viam Java SDK

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
* Android 10 (the min supported at API 29) testing appears to show that webrtc video decoding is failing. This needs to be looked into but could be a simple fix of passing in different decoder factory settings. Android 14 works great.
