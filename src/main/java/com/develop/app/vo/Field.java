package com.develop.app.vo;


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
    "FieldName",
    "FieldLabel",
    "IsNull",
    "ReadOnly",
    "SystemField",
    "Item",
    "ItemElementName"
})
public class Field {

    @JsonProperty("FieldName")
    private String fieldName;
    @JsonProperty("FieldLabel")
    private String fieldLabel;
    @JsonProperty("IsNull")
    private Boolean isNull;
    @JsonProperty("ReadOnly")
    private Boolean readOnly;
    @JsonProperty("SystemField")
    private Boolean systemField;
    @JsonProperty("Item")
    private String item;
    @JsonProperty("ItemElementName")
    private String itemElementName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("FieldName")
    public String getFieldName() {
        return fieldName;
    }

    @JsonProperty("FieldName")
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    @JsonProperty("FieldLabel")
    public String getFieldLabel() {
        return fieldLabel;
    }

    @JsonProperty("FieldLabel")
    public void setFieldLabel(String fieldLabel) {
        this.fieldLabel = fieldLabel;
    }

    @JsonProperty("IsNull")
    public Boolean getIsNull() {
        return isNull;
    }

    @JsonProperty("IsNull")
    public void setIsNull(Boolean isNull) {
        this.isNull = isNull;
    }

    @JsonProperty("ReadOnly")
    public Boolean getReadOnly() {
        return readOnly;
    }

    @JsonProperty("ReadOnly")
    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    @JsonProperty("SystemField")
    public Boolean getSystemField() {
        return systemField;
    }

    @JsonProperty("SystemField")
    public void setSystemField(Boolean systemField) {
        this.systemField = systemField;
    }

    @JsonProperty("Item")
    public String getItem() {
        return item;
    }

    @JsonProperty("Item")
    public void setItem(String item) {
        this.item = item;
    }

    @JsonProperty("ItemElementName")
    public String getItemElementName() {
        return itemElementName;
    }

    @JsonProperty("ItemElementName")
    public void setItemElementName(String itemElementName) {
        this.itemElementName = itemElementName;
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
