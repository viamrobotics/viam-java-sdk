package com.viam.sdk.core;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;

public class MethodNotImplementedException extends StatusRuntimeException {
    public MethodNotImplementedException(final String methodName) {
        super(Status.UNIMPLEMENTED.withDescription(String.format("Method %s not implemented", methodName)));
    }
}
