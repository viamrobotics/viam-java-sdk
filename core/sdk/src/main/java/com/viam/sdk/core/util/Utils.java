package com.viam.sdk.core.util;

import com.google.protobuf.*;
import com.viam.common.v1.Common;

import java.util.*;

public class Utils {
    public static Object valueToNative(Value v) {
        switch (v.getKindCase()) {
            case STRUCT_VALUE: {
                Map<String, Value> structMap = v.getStructValue().getFieldsMap();
                if (structMap.get("_type") != null) {
                    switch (structMap.get("_type").getStringValue()) {
                        case ("vector3"): {
                            return Common.Vector3.newBuilder().setX(structMap.get("x").getNumberValue()).setY(structMap.get("y").getNumberValue()).setZ(structMap.get("z").getNumberValue()).build();
                        }
                        case ("geopoint"): {
                            return Common.GeoPoint.newBuilder().setLatitude(structMap.get("lat").getNumberValue()).setLongitude(structMap.get("lng").getNumberValue()).build();
                        }
                        case ("orientation_vector_degrees"): {
                            return Common.Orientation.newBuilder().setOX(structMap.get("ox").getNumberValue()).setOY(structMap.get("oy").getNumberValue()).setOZ(structMap.get("oz").getNumberValue()).setTheta(structMap.get("theta").getNumberValue()).build();
                        }
                    }

                } else {
                    Map<String, Object> nativeMap = new HashMap<>();
                    for (Map.Entry<String, Value> entry : structMap.entrySet()) {
                        nativeMap.put(entry.getKey(), valueToNative(entry.getValue()));
                    }
                    return nativeMap;

                }


            }
            case LIST_VALUE: {
                List<Object> list = new ArrayList<>();
                for (Value val : v.getListValue().getValuesList()) {
                    list.add(valueToNative(val));
                }
                return list;

            }
            case BOOL_VALUE:
                return v.getBoolValue();
            case NUMBER_VALUE:
                return v.getNumberValue();
            case STRING_VALUE:
                return v.getStringValue();
            case NULL_VALUE:
                return v.getNullValue();
            default:
                return v;
        }


    }

    public static Value nativeToValue(Object obj) throws IllegalArgumentException {
        if (obj instanceof Common.Vector3) {
            Struct struct = Struct.newBuilder()
                    .putFields("x", Value.newBuilder().setNumberValue(((Common.Vector3) obj).getX()).build())
                    .putFields("y", Value.newBuilder().setNumberValue(((Common.Vector3) obj).getY()).build())
                    .putFields("z", Value.newBuilder().setNumberValue(((Common.Vector3) obj).getZ()).build())
                    .putFields("_type", Value.newBuilder().setStringValue("vector3").build())
                    .build();
            return Value.newBuilder().setStructValue(struct).build();

        } else if (obj instanceof Common.GeoPoint) {
            Struct struct = Struct.newBuilder()
                    .putFields("lat", Value.newBuilder().setNumberValue(((Common.GeoPoint) obj).getLatitude()).build())
                    .putFields("lng", Value.newBuilder().setNumberValue(((Common.GeoPoint) obj).getLongitude()).build())
                    .putFields("_type", Value.newBuilder().setStringValue("geopoint").build())
                    .build();
            return Value.newBuilder().setStructValue(struct).build();
        } else if (obj instanceof Common.Orientation) {
            Struct struct = Struct.newBuilder()
                    .putFields("ox", Value.newBuilder().setNumberValue(((Common.Orientation) obj).getOX()).build())
                    .putFields("oy", Value.newBuilder().setNumberValue(((Common.Orientation) obj).getOY()).build())
                    .putFields("oz", Value.newBuilder().setNumberValue(((Common.Orientation) obj).getOZ()).build())
                    .putFields("theta", Value.newBuilder().setNumberValue(((Common.Orientation) obj).getTheta()).build())
                    .putFields("_type", Value.newBuilder().setStringValue("orientation_vector_degrees").build())
                    .build();
            return Value.newBuilder().setStructValue(struct).build();

        } else if (obj instanceof Number) {
            return Value.newBuilder().setNumberValue((double) obj).build();
        } else if (obj instanceof String) {
            return Value.newBuilder().setStringValue((String) obj).build();
        } else if(obj instanceof byte[]){
            return Value.newBuilder().setStringValue(new String((byte[]) obj)).build();
        }else if (obj instanceof Boolean) {
            return Value.newBuilder().setBoolValue((Boolean) obj).build();
        } else if (obj instanceof List) {
            ListValue.Builder listBuilder = ListValue.newBuilder();
            for (Object o : (List<Object>) obj) {
                listBuilder.addValues(nativeToValue(o));
            }
            return Value.newBuilder().setListValue(listBuilder.build()).build();
        } else if (obj instanceof Map) {
            Struct.Builder structBuilder = Struct.newBuilder();
            for (Map.Entry<Object, Object> entry : ((Map<Object, Object>) obj).entrySet()) {
                if(!(entry.getKey() instanceof String)) throw new IllegalArgumentException();
                else structBuilder.putFields((String) entry.getKey(), nativeToValue(entry.getValue()));
            }
            return Value.newBuilder().setStructValue(structBuilder.build()).build();

        }
        else throw new IllegalArgumentException();
    }

    public static Map<String, Value> sensorReadingsNativeToValue(Map<String, Object> readings) {
        Map<String, Value> valueMap = new HashMap<>();
        for (Map.Entry<String, Object> entry : readings.entrySet()) {
            valueMap.put(entry.getKey(), nativeToValue(entry.getValue()));
        }
        return valueMap;
    }

    public static Map<String, Object> sensorReadingsValueToNative(Map<String, Value> readings) {
        Map<String, Object> map = new HashMap<>();
        for (Map.Entry<String, Value> entry : readings.entrySet()) {
            map.put(entry.getKey(), valueToNative(entry.getValue()));

        }
        return map;
    }


}