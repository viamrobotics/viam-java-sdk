package com.viam.sdk.java;

import com.viam.sdk.core.rpc.Channel;
import com.viam.sdk.core.rpc.DialOptions;
import dev.onvoid.webrtc.media.MediaStream;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ForkJoinPool;
import java.util.logging.Logger;

public class Dialer extends com.viam.sdk.core.rpc.Dialer<MediaStream, PeerConnectionFactory> {

  public Dialer() {
    super(new PeerConnectionFactory());
  }

  @Override
  public CompletableFuture<Channel> dialWebRTC(
      final String signalingAddress,
      final String host,
      final DialOptions opts
  ) {
    return super.dialWebRTC(
        signalingAddress,
        host,
        opts,
        ForkJoinPool.commonPool(),
        null,
        Logger.getLogger(Dialer.class.getName())
    );
  }
}
