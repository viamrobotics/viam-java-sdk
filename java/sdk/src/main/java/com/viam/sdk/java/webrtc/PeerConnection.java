package com.viam.sdk.java.webrtc;

import com.viam.sdk.core.webrtc.ICECandidate;
import com.viam.sdk.core.webrtc.SessionDescription;
import dev.onvoid.webrtc.CreateSessionDescriptionObserver;
import dev.onvoid.webrtc.RTCAnswerOptions;
import dev.onvoid.webrtc.RTCDataChannelInit;
import dev.onvoid.webrtc.RTCIceCandidate;
import dev.onvoid.webrtc.RTCOfferOptions;
import dev.onvoid.webrtc.RTCPeerConnection;
import dev.onvoid.webrtc.RTCSdpType;
import dev.onvoid.webrtc.RTCSessionDescription;
import dev.onvoid.webrtc.SetSessionDescriptionObserver;

public class PeerConnection implements com.viam.sdk.core.webrtc.PeerConnection {

  private final RTCPeerConnection nativePeerConnection;

  public PeerConnection(final RTCPeerConnection nativePeerConnection) {
    this.nativePeerConnection = nativePeerConnection;
  }

  private static SessionDescription toSessionDescription(
      final RTCSessionDescription sessionDescription) {
    final SessionDescription.Type ourType;
    switch (sessionDescription.sdpType) {
      case OFFER:
        ourType = SessionDescription.Type.OFFER;
        break;
      case PR_ANSWER:
        ourType = SessionDescription.Type.PRANSWER;
        break;
      case ANSWER:
        ourType = SessionDescription.Type.ANSWER;
        break;
      case ROLLBACK:
        ourType = SessionDescription.Type.ROLLBACK;
        break;
      default:
        throw new IllegalStateException("unknown sdp type: " + sessionDescription.sdpType);
    }
    return new SessionDescription(ourType, sessionDescription.sdp);
  }

  private static RTCSessionDescription toNativeSessionDescription(
      final SessionDescription sessionDescription) {
    final RTCSdpType sdpType;
    switch (sessionDescription.type) {
      case OFFER:
        sdpType = RTCSdpType.OFFER;
        break;
      case PRANSWER:
        sdpType = RTCSdpType.PR_ANSWER;
        break;
      case ANSWER:
        sdpType = RTCSdpType.ANSWER;
        break;
      case ROLLBACK:
        sdpType = RTCSdpType.ROLLBACK;
        break;
      default:
        throw new IllegalStateException("unknown sdp type: " + sessionDescription.type);
    }
    return new RTCSessionDescription(sdpType, sessionDescription.description);
  }

  @Override
  public DataChannel createDataChannel(final String label, final DataChannel.Init dataChanInit) {
    final RTCDataChannelInit nativeInit = new RTCDataChannelInit();
    nativeInit.ordered = dataChanInit.ordered;
    nativeInit.maxRetransmits = dataChanInit.maxRetransmits;
    nativeInit.protocol = dataChanInit.protocol;
    nativeInit.negotiated = dataChanInit.negotiated;
    nativeInit.id = dataChanInit.id;

    return new DataChannel(nativePeerConnection.createDataChannel(label, nativeInit));
  }

  @Override
  public SessionDescription getLocalDescription() {
    return toSessionDescription(this.nativePeerConnection.getLocalDescription());
  }

  @Override
  public SessionDescription getRemoteDescription() {
    return toSessionDescription(this.nativePeerConnection.getRemoteDescription());
  }

  @Override
  public void createOffer(final SessionDescription.Observer observer) {
    this.nativePeerConnection.createOffer(new RTCOfferOptions(),
        toNativeCreateSDPObserver(observer));
  }

  @Override
  public void createAnswer(final SessionDescription.Observer observer) {
    this.nativePeerConnection.createAnswer(new RTCAnswerOptions(),
        toNativeCreateSDPObserver(observer));
  }

  @Override
  public void setLocalDescription(final SessionDescription.Observer observer,
      SessionDescription sdp) {
    this.nativePeerConnection.setLocalDescription(toNativeSessionDescription(sdp),
        toNativeSetSDPObserver(observer));
  }

  @Override
  public void setRemoteDescription(final SessionDescription.Observer observer,
      final SessionDescription sdp) {
    this.nativePeerConnection.setRemoteDescription(toNativeSessionDescription(sdp),
        toNativeSetSDPObserver(observer));
  }

  @Override
  public void addIceCandidate(final ICECandidate candidate) {
    this.nativePeerConnection.addIceCandidate(
        new RTCIceCandidate(candidate.sdpMid, candidate.sdpMLineIndex, candidate.sdp));
  }

  @Override
  public void close() {
    this.nativePeerConnection.close();
  }

  private SetSessionDescriptionObserver toNativeSetSDPObserver(
      final SessionDescription.Observer observer) {
    return new SetSessionDescriptionObserver() {
      @Override
      public void onSuccess() {
        observer.onSetSuccess();
      }

      @Override
      public void onFailure(final String s) {
        observer.onSetFailure(s);
      }
    };
  }

  private CreateSessionDescriptionObserver toNativeCreateSDPObserver(
      final SessionDescription.Observer observer) {
    return new CreateSessionDescriptionObserver() {
      @Override
      public void onSuccess(final RTCSessionDescription sessionDescription) {
        observer.onCreateSuccess(toSessionDescription(sessionDescription));
      }

      @Override
      public void onFailure(final String s) {
        observer.onCreateFailure(s);
      }
    };
  }
}
