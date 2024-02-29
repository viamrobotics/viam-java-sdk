package com.viam.sdk.core.webrtc;

import java.util.Locale;

public class SessionDescription {

  private final Type type;
  private final String description;

  public SessionDescription(final Type type, final String description) {
    this.type = type;
    this.description = description;
  }

  public String getDescription() {
    return this.description;
  }

  public Type getType() {
    return this.type;
  }

  public String getTypeInCanonicalForm() {
    return this.type.canonicalForm();
  }

  public enum Type {
    OFFER,
    PRANSWER,
    ANSWER,
    ROLLBACK;

    Type() {
    }

    public String canonicalForm() {
      return this.name().toLowerCase(Locale.US);
    }
  }

  public interface Observer {

    void onCreateSuccess(SessionDescription sessionDescription);

    void onSetSuccess();

    void onCreateFailure(final String error);

    void onSetFailure(final String error);
  }
}
