package com.viam.sdk.core.webrtc;

public class ICECandidateErrorEvent {

  public final String address;
  public final int port;
  public final String url;
  public final int errorCode;
  public final String errorText;

  public ICECandidateErrorEvent(
      final String address,
      final int port,
      final String url,
      final int errorCode,
      final String errorText
  ) {
    this.address = address;
    this.port = port;
    this.url = url;
    this.errorCode = errorCode;
    this.errorText = errorText;
  }
}
