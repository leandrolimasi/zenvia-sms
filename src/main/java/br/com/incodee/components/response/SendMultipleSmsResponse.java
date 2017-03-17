/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonProperty
 *  com.fasterxml.jackson.annotation.JsonRootName
 */
package br.com.incodee.components.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.ArrayList;
import java.util.List;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
@JsonRootName(value="sendSmsMultiResponse")
public class SendMultipleSmsResponse {
    @JsonProperty(value="sendSmsResponseList")
    private List<SendSmsResponse> responses = new ArrayList<SendSmsResponse>();

    public List<SendSmsResponse> getResponses() {
        return this.responses;
    }

    public void setResponses(List<SendSmsResponse> responses) {
        this.responses = responses;
    }
}

