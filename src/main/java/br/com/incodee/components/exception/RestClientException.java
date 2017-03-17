/*
 * Decompiled with CFR 0_118.
 */
package br.com.incodee.components.exception;

public class RestClientException
extends Exception {
    private static final long serialVersionUID = 5193367681847173296L;

    public RestClientException() {
    }

    public RestClientException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public RestClientException(String message, Throwable cause) {
        super(message, cause);
    }

    public RestClientException(String message) {
        super(message);
    }

    public RestClientException(Throwable cause) {
        super(cause);
    }
}

