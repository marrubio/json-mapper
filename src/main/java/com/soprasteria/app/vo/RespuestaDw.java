package com.soprasteria.app.vo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Count",
    "Items",
    "Links",
    "TimeStamp"
})
public class RespuestaDw {

    @JsonProperty("Count")
    private Count count;
    @JsonProperty("Items")
    private List<Item> items = null;
    @JsonProperty("Links")
    private List<Link_> links = null;
    @JsonProperty("TimeStamp")
    private String timeStamp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Count")
    public Count getCount() {
        return count;
    }

    @JsonProperty("Count")
    public void setCount(Count count) {
        this.count = count;
    }

    @JsonProperty("Items")
    public List<Item> getItems() {
        return items;
    }

    @JsonProperty("Items")
    public void setItems(List<Item> items) {
        this.items = items;
    }

    @JsonProperty("Links")
    public List<Link_> getLinks() {
        return links;
    }

    @JsonProperty("Links")
    public void setLinks(List<Link_> links) {
        this.links = links;
    }

    @JsonProperty("TimeStamp")
    public String getTimeStamp() {
        return timeStamp;
    }

    @JsonProperty("TimeStamp")
    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
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
