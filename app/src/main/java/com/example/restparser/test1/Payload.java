
package com.example.restparser.test1;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Payload {

    @SerializedName("resultCode")
    @Expose
    private String resultCode;
    @SerializedName("payload")
    @Expose
    private List<Payload_> payload = null;
    @SerializedName("trackingId")
    @Expose
    private String trackingId;

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public Payload withResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }

    public List<Payload_> getPayload() {
        return payload;
    }

    public void setPayload(List<Payload_> payload) {
        this.payload = payload;
    }

    public Payload withPayload(List<Payload_> payload) {
        this.payload = payload;
        return this;
    }

    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public Payload withTrackingId(String trackingId) {
        this.trackingId = trackingId;
        return this;
    }

}
