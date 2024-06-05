# Android Module Example

## Making a brand new module

Copy or work with the contents in [standalone-examples/SimpleAndroidModule](../../../standalone-examples/SimpleAndroidModule)
(Java) or [standalone-examples/SimpleAndroidModuleKT](../../../standalone-examples/SimpleAndroidModuleKT) (Kotlin).

In the module/build.gradle file, set `module.mainEntryClass` to the fully qualified class name of your main class.

## Running your module on a machine

For **local development**, i.e. testing your module without uploading to the registry, run:

```sh
./gradlew pushModuleAdbDebug
```

This will push files to the active device or emulator in adb. Then add this to the modules array in your json config:

```json
{
    "name": "android-module",
    "executable_path": "/sdcard/Download/FOLDER_NAME/module.tar.gz",
    "type": "local"
}
```

Then add a local generic component from the builder with model `viam:generic:mygeneric`.

`FOLDER_NAME` is the root folder of your module, for example `SimpleAndroidModule` or `SimpleAndroidModuleKT` if you're starting from the examples.

For **registry upload**, run:

```sh
./gradlew tarModuleRelease
```

That should create a tarball suitable for upload at `./module/build/outputs/module/release/module.tar.gz`.

## Building this example

From the root directory of the SDK, run:
```sh
./gradlew :android:examples:viam-android-sdk-examples-module:build
```

The next command depends on whether you are installing as a local module or uploading to registry.

For **local**, run:

```sh
./gradlew :android:examples:viam-android-sdk-examples-module:pushModuleAdbDebug
```

Then add a json module and generic component as above in the 'brand new module' instructions. `FOLDER_NAME` in the json will be `viam-java-sdk`.

For **registry**, run:

```sh
./gradlew :android:examples:viam-android-sdk-examples-module:tarModuleRelease
```

That will put your module tarball in `./android/examples/module/build/outputs/module/release/module.tar.gz`.

## Development

You can use this example here for local development that does not require gradle installing. If you
do want to test the standalone example, be sure to `./gradlew install`

