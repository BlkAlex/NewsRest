
package com.example.restparser.test1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Payload_ {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("publicationDate")
    @Expose
    private PublicationDate publicationDate;
    @SerializedName("bankInfoTypeId")
    @Expose
    private Long bankInfoTypeId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Payload_ withId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Payload_ withName(String name) {
        this.name = name;
        return this;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Payload_ withText(String text) {
        this.text = text;
        return this;
    }

    public PublicationDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(PublicationDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Payload_ withPublicationDate(PublicationDate publicationDate) {
        this.publicationDate = publicationDate;
        return this;
    }

    public Long getBankInfoTypeId() {
        return bankInfoTypeId;
    }

    public void setBankInfoTypeId(Long bankInfoTypeId) {
        this.bankInfoTypeId = bankInfoTypeId;
    }

    public Payload_ withBankInfoTypeId(Long bankInfoTypeId) {
        this.bankInfoTypeId = bankInfoTypeId;
        return this;
    }

}
