package com.viam.sdk.core.rpc;

import io.grpc.CallCredentials;
import io.grpc.CallOptions;
import io.grpc.ClientCall;
import io.grpc.ManagedChannel;
import io.grpc.MethodDescriptor;
import java.util.Optional;

public class BasicManagedChannel extends Channel {

  private final ManagedChannel channel;
  private final CallCredentials callCreds;

  public BasicManagedChannel(final ManagedChannel channel) {
    this(channel, null);
  }

  public BasicManagedChannel(final ManagedChannel channel, final CallCredentials callCreds) {
    this.channel = channel;
    this.callCreds = callCreds;
  }

  @Override
  public <RequestT, ResponseT> ClientCall<RequestT, ResponseT> newCall(
      MethodDescriptor<RequestT, ResponseT> methodDescriptor, CallOptions callOptions) {
    return this.channel.newCall(methodDescriptor, callOptions);
  }

  @Override
  public String authority() {
    return this.channel.authority();
  }

  @Override
  public void close() {

  }

  @Override
  public Optional<CallCredentials> getCallCredentials() {
    return Optional.ofNullable(callCreds);
  }
}
