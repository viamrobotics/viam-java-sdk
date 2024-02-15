package com.viam.sdk.core.rpc;

import com.viam.sdk.core.webrtc.DialWebRTCOptions;
import proto.rpc.v1.Auth.Credentials;

public class DialOptions {

  public boolean insecure;
  public String authEntity;
  public Credentials credentials;
  public DialWebRTCOptions webrtcOptions;
  public String externalAuthAddress;
  public String externalAuthToEntity;
  public boolean externalAuthInsecure;
  public String authority;

  public DialOptions clone() {
    try {
      return (DialOptions) super.clone();
    } catch (CloneNotSupportedException e) {
      final DialOptions opts = new DialOptions();
      opts.insecure = this.insecure;
      opts.authEntity = this.authEntity;
      opts.credentials = this.credentials;
      opts.webrtcOptions = this.webrtcOptions.clone();
      opts.externalAuthAddress = this.externalAuthAddress;
      opts.externalAuthToEntity = this.externalAuthToEntity;
      opts.externalAuthInsecure = this.externalAuthInsecure;
      opts.authority = this.authority;
      return opts;
    }
  }
}
