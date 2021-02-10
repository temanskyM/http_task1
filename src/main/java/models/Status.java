package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Status {
    private final String verified;
    private final String sentCount;
    private final String feedback;

    public Status(
            @JsonProperty("verified") String verified,
            @JsonProperty("sentCount") String sentCount,
            @JsonProperty("feedback") String feedback) {
        this.verified = verified;
        this.sentCount = sentCount;
        this.feedback = feedback;
    }

    public String getVerified() {
        return verified;
    }

    public String getSentCount() {
        return sentCount;
    }

    public String getFeedback() {
        return feedback;
    }

    @Override
    public String toString() {
        return "Status{" +
                "verified='" + verified + '\'' +
                ", sentCount='" + sentCount + '\'' +
                ", feedback='" + feedback + '\'' +
                '}';
    }
}
