
package com.example.restparser.test1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PublicationDate {

    @SerializedName("milliseconds")
    @Expose
    private Long milliseconds;

    public Long getMilliseconds() {
        return milliseconds;
    }

    public void setMilliseconds(Long milliseconds) {
        this.milliseconds = milliseconds;
    }

    public PublicationDate withMilliseconds(Long milliseconds) {
        this.milliseconds = milliseconds;
        return this;
    }

}
