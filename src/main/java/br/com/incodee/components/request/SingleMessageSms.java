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

@JsonRootName(value="sendSmsRequest")
public class SingleMessageSms
extends AbstractMessageSms {
    @JsonProperty(value="aggregateId")
    private Integer aggregatorId;

    public Integer getAggregatorId() {
        return this.aggregatorId;
    }

    public void setAggregatorId(Integer aggregatorId) {
        this.aggregatorId = aggregatorId;
    }
}

