/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonRootName
 */
package br.com.incodee.components.response;

import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.ArrayList;
import java.util.List;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
@JsonRootName(value="receivedResponse")
public class ReceivedMessageResponse
extends BaseResponse {
    private List<ReceivedMessage> receivedMessages = new ArrayList<ReceivedMessage>();

    public List<ReceivedMessage> getReceivedMessages() {
        return this.receivedMessages;
    }

    public void setReceivedMessages(List<ReceivedMessage> receivedMessages) {
        this.receivedMessages = receivedMessages;
    }

    public boolean hasMessages() {
        return this.receivedMessages != null && !this.receivedMessages.isEmpty();
    }
}

