package com.smcpartners.shape.crosscutting.activitylogging.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Responsible:</br>
 * 1. </br>
 * <p>
 * <p>
 * Created by johndestefano on 10/3/15.
 * </p>
 * <p>
 * <p>
 * Changes:</br>
 * 1. </br>
 * </p>
 */
public class ClickLogDTO implements Serializable {
    private String userId;
    private int clickLogId;
    /**
     * Limit to 255 characters!
     */
    private String event;
    private Date eventDt;
    private String additionalInfo;

    public ClickLogDTO() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getClickLogId() {
        return clickLogId;
    }

    public void setClickLogId(int clickLogId) {
        this.clickLogId = clickLogId;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public Date getEventDt() {
        return eventDt;
    }

    public void setEventDt(Date eventDt) {
        this.eventDt = eventDt;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
}
