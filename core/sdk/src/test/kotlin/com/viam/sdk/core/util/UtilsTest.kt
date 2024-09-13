package com.viam.sdk.core.util

import com.google.protobuf.*
import com.viam.common.v1.Common
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

class UtilsTest {

    private lateinit var simpleMap : Map<String, Any>
    private lateinit var vector3 : Common.Vector3
    private lateinit var geoPoint : Common.GeoPoint
    private lateinit var orientation : Common.Orientation
    private lateinit var nestedStruct : Map<String, Any>

    private lateinit var vector3val : Value
    private lateinit var geoPointVal : Value
    private lateinit var orientationVal : Value

    @BeforeEach
    fun setup(){
         simpleMap = mapOf("foo" to "bar", "baz" to true)
         vector3 = Common.Vector3.newBuilder().setX(1.0).setY(2.0).setZ(3.0).build()
         geoPoint = Common.GeoPoint.newBuilder().setLatitude(22.0).setLongitude(33.0).build()
         orientation = Common.Orientation.newBuilder().setOX(1.0).setOY(1.0).setOZ(1.0).setTheta(1.0).build()
         nestedStruct = mapOf(
            "vec3" to vector3,
            "geoPoint" to geoPoint,
            "nest" to mapOf("orientation" to orientation, "foo" to "bar", "baz" to true))

         vector3val = Value.newBuilder().setStructValue(
            Struct.newBuilder().putAllFields(mapOf(
                "x" to Value.newBuilder().setNumberValue(1.0).build(),
                "y" to Value.newBuilder().setNumberValue(2.0).build(),
                "z" to Value.newBuilder().setNumberValue(3.0).build(),
                "_type" to Value.newBuilder().setStringValue("vector3").build()))
                .build()).build()
         geoPointVal = Value.newBuilder().setStructValue(
            Struct.newBuilder().putAllFields(mapOf(
                "lat" to Value.newBuilder().setNumberValue(22.0).build(),
                "lng" to Value.newBuilder().setNumberValue(33.0).build(),
                "_type" to Value.newBuilder().setStringValue("geopoint").build()))
                .build()).build()
         orientationVal = Value.newBuilder().setStructValue(
            Struct.newBuilder().putAllFields(mapOf(
                "ox" to Value.newBuilder().setNumberValue(1.0).build(),
                "oy" to Value.newBuilder().setNumberValue(1.0).build(),
                "oz" to Value.newBuilder().setNumberValue(1.0).build(),
                "theta" to Value.newBuilder().setNumberValue(1.0).build(),
                "_type" to Value.newBuilder().setStringValue("orientation_vector_degrees").build()))
                .build()).build()
    }
    @Test
    fun valueToNative(){
        var value = Value.newBuilder().setStringValue("value").build()
        assertEquals("value", Utils.valueToNative(value))

        value = Value.newBuilder().setNumberValue(2.0).build()
        assertEquals(2.0, Utils.valueToNative(value))

        value = Value.newBuilder().setNullValue(NullValue.NULL_VALUE).build()
        assertEquals(NullValue.NULL_VALUE, Utils.valueToNative(value))

        value = Value.newBuilder().setBoolValue(true).build()
        assertEquals(true, Utils.valueToNative(value))

        val struct = Struct.newBuilder()
            .putFields("foo", Value.newBuilder().setStringValue("bar").build())
            .putFields("baz", Value.newBuilder().setBoolValue(true).build())

        value = Value.newBuilder().setStructValue(struct.build()).build()
        assertEquals(simpleMap, Utils.valueToNative(value))

        val list = ListValue.newBuilder()
            .addValues(Value.newBuilder().setBoolValue(true).build())
            .addValues(Value.newBuilder().setNumberValue(1.0).build())
            .addValues(Value.newBuilder().setStringValue("two").build())
            .build()
        value = Value.newBuilder().setListValue(list).build()
        assertEquals(listOf(true, 1.0, "two"), Utils.valueToNative(value))


        assertEquals(vector3, Utils.valueToNative(vector3val))
        assertEquals(geoPoint, Utils.valueToNative(geoPointVal))
        assertEquals(orientation, Utils.valueToNative(orientationVal))


        struct.putFields("orientation", orientationVal)
        val nestedStructVal = Struct.newBuilder().putAllFields(mapOf(
            "vec3" to vector3val,
            "geoPoint" to geoPointVal,
            "nest" to Value.newBuilder().setStructValue(struct.build()).build())).build()
        value = Value.newBuilder().setStructValue(nestedStructVal).build()
        assertEquals(nestedStruct, Utils.valueToNative(value))

    }

    @Test
    fun nativeToValue(){
        var value = Value.newBuilder().setStringValue("abc").build()
        assertEquals(value, Utils.nativeToValue("abc"))
        assertEquals(value, Utils.nativeToValue("abc".toByteArray()))

        value = Value.newBuilder().setNumberValue(1.0).build()
        assertEquals(value, Utils.nativeToValue(1.0))

        value = Value.newBuilder().setBoolValue(false).build()
        assertEquals(value, Utils.nativeToValue(false))

        val struct = Struct.newBuilder()
            .putFields("foo", Value.newBuilder().setStringValue("bar").build())
            .putFields("baz", Value.newBuilder().setBoolValue(true).build())

        value = Value.newBuilder().setStructValue(struct.build()).build()
        assertEquals(value, Utils.nativeToValue(simpleMap))

        val list = ListValue.newBuilder().addAllValues(
            listOf(
                Value.newBuilder().setBoolValue(true).build(),
                Value.newBuilder().setNumberValue(1.0).build(),
                Value.newBuilder().setStringValue("two").build(),
                Value.newBuilder().setStructValue(struct).build()
            )
        )
        value = Value.newBuilder().setListValue(list).build()
        assertEquals(value, Utils.nativeToValue(listOf(true, 1.0, "two", simpleMap)))

        assertEquals(vector3val, Utils.nativeToValue(vector3))
        assertEquals(geoPointVal, Utils.nativeToValue(geoPoint))
        assertEquals(orientationVal, Utils.nativeToValue(orientation))

        //only string are allowed as keys
        assertThrows(IllegalArgumentException::class.java) {Utils.nativeToValue(mapOf(1 to 2, 3 to 4))}
        class UnsupportedType(){}
        assertThrows(IllegalArgumentException::class.java) {Utils.nativeToValue(UnsupportedType())}



    }

    @Test
    fun testSensorReadings(){
        val test = Utils.sensorReadingsNativeToValue(nestedStruct)
        val response = Utils.sensorReadingsValueToNative(test)
        assertEquals(nestedStruct, response)

    }
}