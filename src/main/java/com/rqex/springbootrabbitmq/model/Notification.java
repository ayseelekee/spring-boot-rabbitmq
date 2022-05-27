package com.rqex.springbootrabbitmq.model;


import java.io.Serializable;
import java.util.Date;

public class Notification implements Serializable {
    private String notificationId;
    private Date createdAdd;
    private boolean seen;
    private String message;

    public Notification(String notificationId, Date createdAdd, boolean seen, String message) {
        this.notificationId = notificationId;
        this.createdAdd = createdAdd;
        this.seen = seen;
        this.message = message;
    }

    public String getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId;
    }

    public Date getCreatedAdd() {
        return createdAdd;
    }

    public void setCreatedAdd(Date createdAdd) {
        this.createdAdd = createdAdd;
    }

    public boolean isSeen() {
        return seen;
    }

    public void setSeen(boolean seen) {
        this.seen = seen;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "notificationId='" + notificationId + '\'' +
                ", createdAdd=" + createdAdd +
                ", seen=" + seen +
                ", message='" + message + '\'' +
                '}';
    }
}
