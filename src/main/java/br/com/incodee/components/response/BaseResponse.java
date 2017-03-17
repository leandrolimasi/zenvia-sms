/*
 * Decompiled with CFR 0_118.
 */
package br.com.incodee.components.response;

public abstract class BaseResponse {
    private String statusCode;
    private String statusDescription;
    private String detailCode;
    private String detailDescription;

    public String getStatusCode() {
        return this.statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusDescription() {
        return this.statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public String getDetailCode() {
        return this.detailCode;
    }

    public void setDetailCode(String detailCode) {
        this.detailCode = detailCode;
    }

    public String getDetailDescription() {
        return this.detailDescription;
    }

    public void setDetailDescription(String detailDescription) {
        this.detailDescription = detailDescription;
    }

    public String toString() {
        return this.getClass().getSimpleName() + " [statusCode=" + this.statusCode + ", statusDescription=" + this.statusDescription + ", detailCode=" + this.detailCode + ", detailDescription=" + this.detailDescription + "]";
    }
}

