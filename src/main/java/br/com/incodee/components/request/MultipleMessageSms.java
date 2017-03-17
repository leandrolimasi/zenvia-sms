/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonProperty
 *  com.fasterxml.jackson.annotation.JsonRootName
 */
package br.com.incodee.components.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.ArrayList;
import java.util.List;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
@JsonRootName(value="sendSmsMultiRequest")
public class MultipleMessageSms {

    private Integer aggregateId;

    @JsonProperty(value="sendSmsRequestList")
    private List<MessageSmsElement> messages = new ArrayList<MessageSmsElement>();

    public Integer getAggregateId() {
        return this.aggregateId;
    }

    public void setAggregateId(Integer aggregateId) {
        this.aggregateId = aggregateId;
    }

    public List<MessageSmsElement> getMessages() {
        return this.messages;
    }

    public boolean addMessageSms(MessageSmsElement messageSms) {
        return this.messages.add(messageSms);
    }
}

