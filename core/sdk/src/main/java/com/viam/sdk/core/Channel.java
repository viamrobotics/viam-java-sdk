package com.viam.sdk.core;

import io.grpc.CallCredentials;

import java.util.Optional;

public abstract class Channel extends io.grpc.Channel {
    public abstract void close();

    public abstract Optional<CallCredentials> getCallCredentials();
}
