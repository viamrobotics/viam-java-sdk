package com.viam.sdk.java;

import com.viam.sdk.core.rpc.Channel;
import com.viam.sdk.core.rpc.DialOptions;
import com.viam.sdk.java.webrtc.PeerConnectionFactory;
import dev.onvoid.webrtc.media.MediaStream;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ForkJoinPool;
import java.util.logging.Logger;

public class RobotClientFactory extends
    com.viam.sdk.core.rpc.Dialer<MediaStream, PeerConnectionFactory> {

  public RobotClientFactory() {
    super(new PeerConnectionFactory());
  }

  @Override
  public CompletableFuture<Channel> dialWebRTCInternal(
      final String signalingAddress,
      final String host,
      final DialOptions<MediaStream> opts
  ) {
    return super.dialWebRTC(
        signalingAddress,
        host,
        opts,
        ForkJoinPool.commonPool(),
        Logger.getLogger(RobotClientFactory.class.getName())
    );
  }
}
