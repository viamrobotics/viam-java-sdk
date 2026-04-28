# Viam Java SDK

Public Java/Kotlin SDK for the Viam robotics platform. Core SDK is written in Kotlin and exposed as a JVM library; tests use JUnit 5. Built with Gradle.

## Codebase Structure

```
core/sdk/src/main/kotlin/com/viam/sdk/core/
  component/<name>/                 — Hardware component types (arm, base, motor, etc.)
    <Name>.kt                       — Abstract base class extending Component
    <Name>RPCClient.kt              — gRPC client wrapper (extends <Name>)
    <Name>RPCService.kt             — gRPC service handler (module side)
  service/                          — Service types
  rpc/                              — Channel and connection management
  util/                             — Shared utilities
core/sdk/src/main/gen/              — Auto-generated protobuf code (NEVER EDIT, regenerated from viamrobotics/api)
core/sdk/src/test/                  — JUnit 5 test suite
examples/                           — Example modules and clients
```

All component clients follow the same pattern: `<Name>RPCClient` extends `<Name>` (the abstract base) and wraps the corresponding `<Name>ServiceGrpc.<Name>ServiceBlockingStub` from the generated stubs.

## Conventions

- **Language**: Kotlin (compiled to JVM bytecode, exposed as a Java library).
- **Build**: Gradle (`./gradlew`).
- **Method signatures** for RPC client methods follow this pattern:
  ```kotlin
  override fun methodName(arg1: Type1, extra: Struct): ReturnType {
      val request = MethodNameRequest.newBuilder()
          .setName(this.name.name)
          .setExtra(extra)
          .build()
      val response = this.client.methodName(request)
      return response.someField
  }
  ```
- **Channel credentials**: handle `channel.callCredentials.isPresent` in the `init` block of every RPC client. See `ArmRPCClient.kt` for the canonical example.
- **Testing**: JUnit 5 (`junit-jupiter`). Tests live under `core/sdk/src/test/`.

## Protected Paths

Enforced via `.claude/settings.ci.json`:

- `core/sdk/src/main/gen/**` — generated protobuf code.
- `.github/**` — CI workflows.
- `Makefile` — build glue.

## Verification Commands

- Build: `./gradlew build`
- Run tests: `./gradlew test`
- Full check (build + test + lint): `./gradlew check`
- Make examples check: `make check-examples`
