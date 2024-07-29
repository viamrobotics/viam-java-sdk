package com.viam.sdk.core.rpc;

import io.grpc.*;
import io.grpc.stub.MetadataUtils;

import java.util.Optional;

import com.viam.sdk.core.util.Metadata;

public class BasicManagedChannel extends Channel {

  private final io.grpc.Channel channel;
  private final CallCredentials callCreds;

  public BasicManagedChannel(final ManagedChannel channel) {
    this(channel, null);
  }

  public BasicManagedChannel(final ManagedChannel channel, final CallCredentials callCreds) {
    ClientInterceptor versionInterceptor = MetadataUtils.newAttachHeadersInterceptor(Metadata.getVERSION_METADATA());
    this.channel = ClientInterceptors.intercept(channel, versionInterceptor);
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
