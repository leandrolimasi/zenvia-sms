/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonRootName
 */
package br.com.incodee.components.response;

import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.Date;

@JsonRootName(value="getSmsStatusResp")
public class GetSmsStatusResponse
extends BaseResponse {
    private String id;
    private Date received;
    private String shortcode;
    private String mobileOperatorName;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getReceived() {
        return this.received;
    }

    public void setReceived(Date received) {
        this.received = received;
    }

    public String getShortcode() {
        return this.shortcode;
    }

    public void setShortcode(String shortcode) {
        this.shortcode = shortcode;
    }

    public String getMobileOperatorName() {
        return this.mobileOperatorName;
    }

    public void setMobileOperatorName(String mobileOperatorName) {
        this.mobileOperatorName = mobileOperatorName;
    }
}

