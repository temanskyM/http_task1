package models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;

public class Fact {
    private final String type;
    private final Status status;
    private final Boolean deleted;
    private final String _id;
    private final String user;
    private final String text;
    private final int __v;
    private final String source;
    private final Timestamp updatedAt;
    private final Timestamp createdAt;
    private final Boolean used;

    public Fact(
            @JsonProperty("type") String type,
            @JsonProperty("status") Status status,
            @JsonProperty("deleted") Boolean deleted,
            @JsonProperty("_id") String _id,
            @JsonProperty("user") String user,
            @JsonProperty("text") String text,
            @JsonProperty("__v") int __v,
            @JsonProperty("source") String source,
            @JsonProperty("updatedAt") Timestamp updatedAt,
            @JsonProperty("createdAt") Timestamp createdAt,
            @JsonProperty("used") Boolean used) {
        this.type = type;
        this.status = status;
        this.deleted = deleted;
        this._id = _id;
        this.user = user;
        this.text = text;
        this.__v = __v;
        this.source = source;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
        this.used = used;
    }

    public String getType() {
        return type;
    }

    public Status getStatus() {
        return status;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public String get_id() {
        return _id;
    }

    public String getUser() {
        return user;
    }

    public String getText() {
        return text;
    }

    public int get__v() {
        return __v;
    }

    public String getSource() {
        return source;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public Boolean getUsed() {
        return used;
    }

    @Override
    public String toString() {
        return "Fact{" +
                "type='" + type + '\'' +
                ", status=" + status +
                ", deleted=" + deleted +
                ", _id='" + _id + '\'' +
                ", user='" + user + '\'' +
                ", text='" + text + '\'' +
                ", __v=" + __v +
                ", source='" + source + '\'' +
                ", updatedAt=" + updatedAt +
                ", createdAt=" + createdAt +
                ", used=" + used +
                '}';
    }
}
