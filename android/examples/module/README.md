# Android Module Example

## Making a brand new module

1. Until this SDK is published, you should run this from the root directory of the SDK `./gradlew install`
   1. This will push artifacts to a mavenLocal repository that can be used in external projects on the same host 
2. Copy or work with the contents in [standalone-examples/SimpleAndroidModule](../../../standalone-examples/SimpleAndroidModule) (Java) or [standalone-examples/SimpleAndroidModuleKT](../../../standalone-examples/SimpleAndroidModuleKT) (Kotlin) 
   1. Note: Due to locally installing, you'll notice `mavenLocal` added to every repositories configuration block. This will not be needed in the future.
   2. `module.mainEntryClass` must be set and reflects the main class that has an entry point (i.e. `public static void main`)
3. The next command depends on if you are wanting to use a local module or registry
    * For local
        1. `./gradlew pushModuleAdbDebug`
            * This will push files to your selected AVD and you can use the following local module in your machine config:
    ```json
    {
        "name": "android-module",
        "executable_path": "/sdcard/Download/mod.sh",
        "type": "local"
    }
    ```
    * For registry
        1. `./gradlew copyModuleRelease --into </some/path>`
        2. Use the CLI to package the contents of `/some/path` where `mod.sh` is the executable and `module.jar` is the only additional file to be tarballed up.
 

## Building this example

1. From the root directory of the SDK, run: `./gradlew :android:examples:viam-android-sdk-examples-module:build`
2. The next command depends on if you are wanting to use a local module or registry
   * For local
     1. `./gradlew :android:examples:viam-android-sdk-examples-module:pushModuleAdbDebug`
         * This will push files to your selected AVD and you can use the following local module in your machine config:
    ```json
    {
        "name": "android-module",
        "executable_path": "/sdcard/Download/mod.sh",
        "type": "local"
    }
    ```
   * For registry
      1. `./gradlew :android:examples:viam-android-sdk-examples-module:copyModuleRelease --into </some/path>`
      2. Use the CLI to package the contents of `/some/path` where `mod.sh` is the executable and `module.jar` is the only additional file to be tarballed up.

## Development

You can use this example here for local development that does not require gradle installing. If you
do want to test the standalone example, be sure to `./gradlew install`

