#!/bin/sh

# These exports are necessary for app_process to have the right runtime setup. These were inferred
# from reading AOSP code and following straces.
export ANDROID_DATA="/data"
export ANDROID_ROOT="/system"
export ANDROID_TZDATA_ROOT="/apex/com.android.tzdata"
export ANDROID_RUNTIME_ROOT="/apex/com.android.runtime"
export BOOTCLASSPATH=/apex/com.android.runtime/javalib/core-oj.jar:/apex/com.android.runtime/javalib/core-libart.jar:/apex/com.android.runtime/javalib/okhttp.jar:/apex/com.android.runtime/javalib/bouncycastle.jar:/apex/com.android.runtime/javalib/apache-xml.jar:/system/framework/framework.jar:/system/framework/ext.jar:/system/framework/telephony-common.jar:/system/framework/voip-common.jar:/system/framework/ims-common.jar:/system/framework/android.test.base.jar:/apex/com.android.conscrypt/javalib/conscrypt.jar:/apex/com.android.media/javalib/updatable-media.jar

CWD=`pwd`
JAR_PATH=__MODULE_JAR_PATH__
JAR_PARENT_PATH="$(realpath $(dirname "$JAR_PATH"))"

# only copy the jar if it is not next to our script
if [ "$JAR_PARENT_PATH" == "$CWD" ]; then
  SAFE_JAR_PATH=$JAR_PATH
else
  SAFE_JAR_PATH=$(mktemp -d -p `pwd`)
  cp $JAR_PATH $SAFE_JAR_PATH/module.jar
  SAFE_JAR_PATH=$SAFE_JAR_PATH/module.jar
fi

ABI_LIST=`getprop ro.product.cpu.abilist`
ABI_ARRAY=(${ABI_LIST//,/ })

LIBRARY_PATH=
for abi in "${ABI_ARRAY[@]}"
do
  NEXT_PATH_TMP=$SAFE_JAR_PATH!/lib/$abi
  if [ -z "$LIBRARY_PATH" ]; then
    LIBRARY_PATH=$NEXT_PATH_TMP
  else
    LIBRARY_PATH=$LIBRARY_PATH:$NEXT_PATH_TMP
  fi
done
FORCE_32=__FORCE_32__
if [ "${FORCE_32}" != "true" ] && `getconf LONG_BIT` == "64" ]; then
  LIBRARY_PATH=$LIBRARY_PATH:/system/lib64:/system/product/lib64
else
  LIBRARY_PATH=$LIBRARY_PATH:/system/lib:/system/product/lib
fi

APP_PROCESS_NAME=app_process
if [ "${FORCE_32}" == "true" ]; then
  APP_PROCESS_NAME=app_process32
fi

# Note: May want to include /lib/arm64 and variants within the temp dir in the future.
#       More details at https://cs.android.com/android/platform/superproject/main/+/main:frameworks/base/core/java/android/app/LoadedApk.java

# app_process is the closest thing to being able to run a Zygote without actually running an
# [Native]Activity. It will give us all the android runtime dependencies we need.
${APP_PROCESS_NAME} -Djava.class.path="$SAFE_JAR_PATH" -Djava.library.path="$LIBRARY_PATH" \
            /system/bin __MAIN_ENTRY_CLASS__ "$@"
echo $?
