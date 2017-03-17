/*
 * Decompiled with CFR 0_118.
 */
package br.com.incodee.components.response;

import java.util.Date;

public class ReceivedMessage {
    private Long id;
    private Date dateReceived;
    private String mobile;
    private String body;
    private String shortcode;
    private String mobileOperatorName;
    private String mtId;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateReceived() {
        return this.dateReceived;
    }

    public void setDateReceived(Date dateReceived) {
        this.dateReceived = dateReceived;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getBody() {
        return this.body;
    }

    public void setBody(String body) {
        this.body = body;
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

    public String getMtId() {
        return this.mtId;
    }

    public void setMtId(String mtId) {
        this.mtId = mtId;
    }
}

