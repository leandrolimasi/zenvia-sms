/*
 * Decompiled with CFR 0_118.
 */
package br.com.incodee.components.request;

import br.com.incodee.components.enums.CallbackOption;

import java.util.Date;

public interface MessageSms {
    public String getFrom();

    public void setFrom(String var1);

    public String getTo();

    public void setTo(String var1);

    public String getMsg();

    public void setMsg(String var1);

    public CallbackOption getCallbackOption();

    public void setCallbackOption(CallbackOption var1);

    public String getId();

    public void setId(String var1);

    public Integer getTimeToLive();

    public void setTimeToLive(Integer var1);

    public Date getSchedule();

    public void setSchedule(Date var1);

    public Date getExpiryDate();

    public void setExpiryDate(Date var1);
}

