package com.sdsu.edu.cms.common.models.notification;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class NotifyDBModel {

    @JsonProperty("notification_id")
    private String notification_id;
    @JsonProperty("conference_id")
    private String conference_id;
    @JsonProperty("sender_id")
    private String sender_id;
    @JsonProperty("sender_name")
    private String sender_name;
    @JsonProperty("subject")
    private String subject;
    @JsonProperty("receiver")
    private String receiver;
    @JsonProperty("notification_type")
    private String method;
    @JsonProperty("message")
    private String message;
    @JsonProperty("created_on")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date created_on;
    @JsonProperty("priority")
    private String priority;
    @JsonProperty("is_valid")
    private String is_valid;
    @JsonProperty("has_seen")
    private String has_seen;
    @JsonProperty("is_broadcast")
    private boolean is_broadcast;

    public NotifyDBModel() {
    }

    public String getNotification_id() {
        return notification_id;
    }

    public void setNotification_id(String notification_id) {
        this.notification_id = notification_id;
    }

    public String getConference_id() {
        return conference_id;
    }

    public void setConference_id(String conference_id) {
        this.conference_id = conference_id;
    }

    public String getSender_id() {
        return sender_id;
    }

    public void setSender_id(String sender_id) {
        this.sender_id = sender_id;
    }

    public String getSender_name() {
        return sender_name;
    }

    public void setSender_name(String sender_name) {
        this.sender_name = sender_name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreated_on() {
        return created_on;
    }

    public void setCreated_on(Date created_on) {
        this.created_on = created_on;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getIs_valid() {
        return is_valid;
    }

    public void setIs_valid(String is_valid) {
        this.is_valid = is_valid;
    }

    public String getHas_seen() {
        return has_seen;
    }

    public void setHas_seen(String has_seen) {
        this.has_seen = has_seen;
    }

    public boolean isIs_broadcast() {
        return is_broadcast;
    }

    public void setIs_broadcast(boolean is_broadcast) {
        this.is_broadcast = is_broadcast;
    }
}
