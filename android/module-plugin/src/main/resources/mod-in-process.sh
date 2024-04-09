#!/bin/sh

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
if [ "${FORCE_32}" != "true" ] && [ `getconf LONG_BIT` == "64" ]; then
  LIBRARY_PATH=$LIBRARY_PATH:/system/lib64:/system/product/lib64
else
  LIBRARY_PATH=$LIBRARY_PATH:/system/lib:/system/product/lib
fi

proc_file=$(mktemp -p $_VIAM_FG_TEMP_DIR)
rm $proc_file
trap 'rm -rf -- "$proc_file"' EXIT

intentURI="intent:#Intent;action=com.viam.rdk.fgservice.START_MODULE"
intentURI="$intentURI;S.secret=$_VIAM_FG_SECRET"
intentURI="$intentURI;S.proc_file=$proc_file"
intentURI="$intentURI;S.java_class_path=$SAFE_JAR_PATH"
intentURI="$intentURI;S.java_library_path=$LIBRARY_PATH"
intentURI="$intentURI;S.java_entry_point_class=__MAIN_ENTRY_CLASS__"
saveIFS="$IFS"
IFS=$'\n'
intentURI="$intentURI;S.java_entry_point_args=$*"
IFS=$saveIFS
intentURI="$intentURI;end"
am broadcast --user -3 "$intentURI"

while [ ! -f $proc_file ]; do sleep 0.1; done
cat $proc_file
