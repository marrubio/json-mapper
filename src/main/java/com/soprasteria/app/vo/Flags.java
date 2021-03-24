
package com.soprasteria.app.vo;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "IsCold",
    "IsDBRecord",
    "IsCheckedOut",
    "IsCopyRightProtected",
    "IsVoiceAvailable",
    "HasAppendedDocuments",
    "IsProtected",
    "IsDeleted",
    "IsEmail"
})
public class Flags {

    @JsonProperty("IsCold")
    private Boolean isCold;
    @JsonProperty("IsDBRecord")
    private Boolean isDBRecord;
    @JsonProperty("IsCheckedOut")
    private Boolean isCheckedOut;
    @JsonProperty("IsCopyRightProtected")
    private Boolean isCopyRightProtected;
    @JsonProperty("IsVoiceAvailable")
    private Boolean isVoiceAvailable;
    @JsonProperty("HasAppendedDocuments")
    private Boolean hasAppendedDocuments;
    @JsonProperty("IsProtected")
    private Boolean isProtected;
    @JsonProperty("IsDeleted")
    private Boolean isDeleted;
    @JsonProperty("IsEmail")
    private Boolean isEmail;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("IsCold")
    public Boolean getIsCold() {
        return isCold;
    }

    @JsonProperty("IsCold")
    public void setIsCold(Boolean isCold) {
        this.isCold = isCold;
    }

    @JsonProperty("IsDBRecord")
    public Boolean getIsDBRecord() {
        return isDBRecord;
    }

    @JsonProperty("IsDBRecord")
    public void setIsDBRecord(Boolean isDBRecord) {
        this.isDBRecord = isDBRecord;
    }

    @JsonProperty("IsCheckedOut")
    public Boolean getIsCheckedOut() {
        return isCheckedOut;
    }

    @JsonProperty("IsCheckedOut")
    public void setIsCheckedOut(Boolean isCheckedOut) {
        this.isCheckedOut = isCheckedOut;
    }

    @JsonProperty("IsCopyRightProtected")
    public Boolean getIsCopyRightProtected() {
        return isCopyRightProtected;
    }

    @JsonProperty("IsCopyRightProtected")
    public void setIsCopyRightProtected(Boolean isCopyRightProtected) {
        this.isCopyRightProtected = isCopyRightProtected;
    }

    @JsonProperty("IsVoiceAvailable")
    public Boolean getIsVoiceAvailable() {
        return isVoiceAvailable;
    }

    @JsonProperty("IsVoiceAvailable")
    public void setIsVoiceAvailable(Boolean isVoiceAvailable) {
        this.isVoiceAvailable = isVoiceAvailable;
    }

    @JsonProperty("HasAppendedDocuments")
    public Boolean getHasAppendedDocuments() {
        return hasAppendedDocuments;
    }

    @JsonProperty("HasAppendedDocuments")
    public void setHasAppendedDocuments(Boolean hasAppendedDocuments) {
        this.hasAppendedDocuments = hasAppendedDocuments;
    }

    @JsonProperty("IsProtected")
    public Boolean getIsProtected() {
        return isProtected;
    }

    @JsonProperty("IsProtected")
    public void setIsProtected(Boolean isProtected) {
        this.isProtected = isProtected;
    }

    @JsonProperty("IsDeleted")
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    @JsonProperty("IsDeleted")
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @JsonProperty("IsEmail")
    public Boolean getIsEmail() {
        return isEmail;
    }

    @JsonProperty("IsEmail")
    public void setIsEmail(Boolean isEmail) {
        this.isEmail = isEmail;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
