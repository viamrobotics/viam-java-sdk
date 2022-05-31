package com.viam.sdk.core.webrtc;

import java.util.Locale;

public class SessionDescription {
    public final Type type;
    public final String description;

    public SessionDescription(final Type type, final String description) {
        this.type = type;
        this.description = description;
    }

    String getDescription() {
        return this.description;
    }

    String getTypeInCanonicalForm() {
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
