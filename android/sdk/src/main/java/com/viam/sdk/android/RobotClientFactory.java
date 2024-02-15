package com.viam.sdk.android;

import android.content.Context;
import com.viam.sdk.android.webrtc.PeerConnectionFactory;
import com.viam.sdk.core.rpc.Channel;
import com.viam.sdk.core.rpc.DialOptions;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.logging.Logger;
import org.webrtc.EglBase;
import org.webrtc.MediaStream;

public class RobotClientFactory extends
    com.viam.sdk.core.rpc.Dialer<MediaStream, PeerConnectionFactory> {

  public RobotClientFactory(final Context applicationContext) {
    super(new PeerConnectionFactory(applicationContext));
  }

  @Override
  public CompletableFuture<Channel> dialWebRTCInternal(
      final String signalingAddress,
      final String host,
      final DialOptions<MediaStream> opts
  ) {
    final Executor executor = Executors.newCachedThreadPool(Executors.defaultThreadFactory());
    return this.dialWebRTC(
        signalingAddress,
        host,
        opts,
        executor,
        Logger.getLogger(RobotClientFactory.class.getName())
    );
  }

  public EglBase getEGLBase() {
    return this.getPeerConnectionFactory().getEGLBase();
  }
}
