/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang.StringUtils
 */
package br.com.incodee.components.domain;

import org.apache.commons.lang.StringUtils;

import java.util.Date;

public class ReceivedMessageFilter {
    private final Date start;
    private final Date end;
    private final String referenceMessageId;
    private final String mobile;

    private ReceivedMessageFilter(Builder builder) {
        this.start = builder.start;
        this.end = builder.end;
        this.referenceMessageId = builder.referenceMessageId;
        this.mobile = builder.mobile;
    }

    public Date getStart() {
        return this.start;
    }

    public Date getEnd() {
        return this.end;
    }

    public String getReferenceMessageId() {
        return this.referenceMessageId;
    }

    public String getMobile() {
        return this.mobile;
    }

    public boolean definesReferenceMessageId() {
        return StringUtils.isNotBlank((String)this.referenceMessageId);
    }

    public boolean definesMobile() {
        return StringUtils.isNotBlank((String)this.mobile);
    }

    public static class Builder {
        private Date start;
        private Date end;
        private String referenceMessageId;
        private String mobile;

        public Builder(Date start, Date end) {
            if (start == null || end == null || start.after(end)) {
                throw new IllegalArgumentException("Start date must be before end date");
            }
            this.start = start;
            this.end = end;
        }

        public ReceivedMessageFilter build() {
            return new ReceivedMessageFilter(this);
        }

        public Builder starting(Date start) {
            if (start == null || this.end != null && start.after(this.end)) {
                throw new IllegalArgumentException("Start date cannot be null and must be before end date");
            }
            this.start = start;
            return this;
        }

        public Builder ending(Date end) {
            if (end == null || this.start != null && end.before(this.start)) {
                throw new IllegalArgumentException("End date cannot be null and must be after start date");
            }
            this.end = end;
            return this;
        }

        public Builder byReferenceMessageId(String referenceMessageId) {
            this.referenceMessageId = referenceMessageId;
            return this;
        }

        public Builder byMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
    }

}

