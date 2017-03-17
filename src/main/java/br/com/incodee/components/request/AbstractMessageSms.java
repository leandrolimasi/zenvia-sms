/*
 * Decompiled with CFR 0_118.
 */
package br.com.incodee.components.request;

import br.com.incodee.components.enums.CallbackOption;

import java.util.Date;

public abstract class AbstractMessageSms
implements MessageSms {
    private String from;
    private String to;
    private Date schedule = new Date();
    private String msg;
    private CallbackOption callbackOption;
    private String id;
    private Date expiryDate;
    private Integer timeToLive;

    public String getFrom() {
        return this.from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return this.to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public CallbackOption getCallbackOption() {
        return this.callbackOption;
    }

    public void setCallbackOption(CallbackOption callbackOption) {
        this.callbackOption = callbackOption;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getTimeToLive() {
        return this.timeToLive;
    }

    public void setTimeToLive(Integer timeToLive) {
        this.timeToLive = timeToLive;
    }

    public Date getSchedule() {
        return this.schedule;
    }

    public void setSchedule(Date schedule) {
        this.schedule = schedule;
    }

    public Date getExpiryDate() {
        return this.expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }
}

