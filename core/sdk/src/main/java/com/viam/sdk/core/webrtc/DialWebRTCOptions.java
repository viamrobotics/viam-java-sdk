package com.viam.sdk.core.webrtc;


import proto.rpc.v1.Auth;

public class DialWebRTCOptions<MediaStreamT> {

  public boolean signalingInsecure;
  public boolean disableTrickleICE;
  public PeerConnection.RTCConfiguration rtcConfig;

  // signalingAuthEntity is the entity to authenticate as to the signaler.
  public String signalingAuthEntity;

  // signalingExternalAuthAddress is the address to perform external auth yet.
  // This is unlikely to be needed since the signaler is typically in the same
  // place where authentication happens.
  public String signalingExternalAuthAddress;

  // signalingExternalAuthToEntity is the entity to authenticate for after
  // externally authenticating.
  // This is unlikely to be needed since the signaler is typically in the same
  // place where authentication happens.
  public String signalingExternalAuthToEntity;

  // signalingCredentials are used to authenticate the request to the signaling server.
  public Auth.Credentials signalingCredentials;

  public String signalingServerAddress;
  public boolean signalingExternalAuthInsecure;

  public String authority;

  public PeerConnection.MediaStreamObserver<MediaStreamT> mediaStreamObserver;

  public DialWebRTCOptions<MediaStreamT> clone() {
    try {
      //noinspection unchecked
      return (DialWebRTCOptions<MediaStreamT>) super.clone();
    } catch (CloneNotSupportedException e) {
      final DialWebRTCOptions<MediaStreamT> opts = new DialWebRTCOptions<>();
      opts.signalingInsecure = this.signalingInsecure;
      opts.disableTrickleICE = this.disableTrickleICE;
      opts.rtcConfig = this.rtcConfig;
      opts.signalingAuthEntity = this.signalingAuthEntity;
      opts.signalingExternalAuthAddress = this.signalingExternalAuthAddress;
      opts.signalingExternalAuthToEntity = this.signalingExternalAuthToEntity;
      opts.signalingCredentials = this.signalingCredentials;
      opts.signalingServerAddress = this.signalingServerAddress;
      opts.signalingExternalAuthInsecure = this.signalingExternalAuthInsecure;
      opts.authority = this.authority;
      opts.mediaStreamObserver = this.mediaStreamObserver;
      return opts;
    }
  }
}
