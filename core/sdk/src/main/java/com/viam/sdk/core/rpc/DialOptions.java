package com.viam.sdk.core.rpc;

import com.viam.sdk.core.webrtc.DialWebRTCOptions;
import proto.rpc.v1.Auth.Credentials;

public class DialOptions<MediaStreamT> {

  public boolean insecure;
  public String authEntity;
  public Credentials credentials;
  public DialWebRTCOptions<MediaStreamT> webrtcOptions;
  public String externalAuthAddress;
  public String externalAuthToEntity;
  public boolean externalAuthInsecure;
  public String authority;

  public DialOptions<MediaStreamT> clone() {
    try {
      return (DialOptions<MediaStreamT>) super.clone();
    } catch (CloneNotSupportedException e) {
      final DialOptions<MediaStreamT> opts = new DialOptions<>();
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
