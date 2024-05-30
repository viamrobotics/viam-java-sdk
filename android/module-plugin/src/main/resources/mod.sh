#!/bin/sh

CWD=`pwd`
JAR_PATH=./module.jar

ABI_LIST=`getprop ro.product.cpu.abilist`
ABI_ARRAY=(${ABI_LIST//,/ })

LIBRARY_PATH=
for abi in "${ABI_ARRAY[@]}"
do
  NEXT_PATH_TMP=$JAR_PATH!/lib/$abi
  if [ -z "$LIBRARY_PATH" ]; then
    LIBRARY_PATH=$NEXT_PATH_TMP
  else
    LIBRARY_PATH=$LIBRARY_PATH:$NEXT_PATH_TMP
  fi
done
FORCE_32=__FORCE_32__
if [ "${FORCE_32}" != "true" ] && [ `getconf LONG_BIT` == "64" ]; then
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
${APP_PROCESS_NAME} -Djava.class.path="$JAR_PATH" -Djava.library.path="$LIBRARY_PATH" \
            /system/bin __MAIN_ENTRY_CLASS__ "$@"
exit $?
