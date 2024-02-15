package com.example.mymodule

import com.google.protobuf.Struct
import com.google.protobuf.Value
import com.viam.common.v1.Common
import com.viam.component.generic.v1.GenericServiceGrpc
import com.viam.sdk.android.module.Module
import com.viam.sdk.core.Model
import com.viam.sdk.core.ModelFamily
import com.viam.sdk.core.Registry
import com.viam.sdk.core.Resource
import com.viam.sdk.core.ResourceCreatorRegistration
import com.viam.sdk.core.ResourceManager
import com.viam.sdk.core.ResourceRegistration
import com.viam.sdk.core.component.Generic
import com.viam.sdk.core.component.GenericRPCService
import io.grpc.ManagedChannel
import viam.app.v1.Robot

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        Registry.registerResourceCreator(
                Generic.SUBTYPE,
                MyGeneric.MODEL,
                ResourceCreatorRegistration({ config: Robot.ComponentConfig, dependencies: Map<Common.ResourceName?, Resource?>? ->
                    MyGeneric(
                            config,
                            dependencies
                    )
                }) { config: Robot.ComponentConfig? -> MyGeneric.validateConfig(config) }
        )
        val module = Module(args)
        module.start()
    }

    class MyGeneric(
            config: Robot.ComponentConfig,
            dependencies: Map<Common.ResourceName?, Resource?>?
    ) : Generic(config.name) {
        override fun doCommand(command: Map<String, Value>): Struct {
            val builder = Struct.newBuilder()
            return builder.putFields("hello", Value.newBuilder().setBoolValue(true).build()).build()
        }

        companion object {
            val MODEL = Model(ModelFamily("viam", "generic"), "mygeneric")
            fun validateConfig(config: Robot.ComponentConfig?): Set<String?> {
                return HashSet()
            }
        }
    }
}
