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
    "Fields",
    "Flags",
    "Links",
    "Sections",
    "ContentType",
    "HaveMoreTotalPages",
    "HasTextAnnotation",
    "HasXmlDigitalSignatures",
    "AnnotationsPreview",
    "TotalPages",
    "Id",
    "Title",
    "LastModified",
    "LastModifiedSpecified",
    "CreatedAt",
    "CreatedAtSpecified",
    "FileSize",
    "SectionCount",
    "IntellixTrust",
    "VersionStatus",
    "FileCabinetId"
})
public class Item {

    @JsonProperty("Fields")
    private List<Field> fields = null;
    @JsonProperty("Flags")
    private Flags flags;
    @JsonProperty("Links")
    private List<Link> links = null;
    @JsonProperty("Sections")
    private List<Object> sections = null;
    @JsonProperty("ContentType")
    private String contentType;
    @JsonProperty("HaveMoreTotalPages")
    private Boolean haveMoreTotalPages;
    @JsonProperty("HasTextAnnotation")
    private Boolean hasTextAnnotation;
    @JsonProperty("HasXmlDigitalSignatures")
    private Boolean hasXmlDigitalSignatures;
    @JsonProperty("AnnotationsPreview")
    private Boolean annotationsPreview;
    @JsonProperty("TotalPages")
    private Integer totalPages;
    @JsonProperty("Id")
    private Integer id;
    @JsonProperty("Title")
    private String title;
    @JsonProperty("LastModified")
    private String lastModified;
    @JsonProperty("LastModifiedSpecified")
    private Boolean lastModifiedSpecified;
    @JsonProperty("CreatedAt")
    private String createdAt;
    @JsonProperty("CreatedAtSpecified")
    private Boolean createdAtSpecified;
    @JsonProperty("FileSize")
    private Integer fileSize;
    @JsonProperty("SectionCount")
    private Integer sectionCount;
    @JsonProperty("IntellixTrust")
    private String intellixTrust;
    @JsonProperty("VersionStatus")
    private String versionStatus;
    @JsonProperty("FileCabinetId")
    private String fileCabinetId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Fields")
    public List<Field> getFields() {
        return fields;
    }

    @JsonProperty("Fields")
    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    @JsonProperty("Flags")
    public Flags getFlags() {
        return flags;
    }

    @JsonProperty("Flags")
    public void setFlags(Flags flags) {
        this.flags = flags;
    }

    @JsonProperty("Links")
    public List<Link> getLinks() {
        return links;
    }

    @JsonProperty("Links")
    public void setLinks(List<Link> links) {
        this.links = links;
    }

    @JsonProperty("Sections")
    public List<Object> getSections() {
        return sections;
    }

    @JsonProperty("Sections")
    public void setSections(List<Object> sections) {
        this.sections = sections;
    }

    @JsonProperty("ContentType")
    public String getContentType() {
        return contentType;
    }

    @JsonProperty("ContentType")
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    @JsonProperty("HaveMoreTotalPages")
    public Boolean getHaveMoreTotalPages() {
        return haveMoreTotalPages;
    }

    @JsonProperty("HaveMoreTotalPages")
    public void setHaveMoreTotalPages(Boolean haveMoreTotalPages) {
        this.haveMoreTotalPages = haveMoreTotalPages;
    }

    @JsonProperty("HasTextAnnotation")
    public Boolean getHasTextAnnotation() {
        return hasTextAnnotation;
    }

    @JsonProperty("HasTextAnnotation")
    public void setHasTextAnnotation(Boolean hasTextAnnotation) {
        this.hasTextAnnotation = hasTextAnnotation;
    }

    @JsonProperty("HasXmlDigitalSignatures")
    public Boolean getHasXmlDigitalSignatures() {
        return hasXmlDigitalSignatures;
    }

    @JsonProperty("HasXmlDigitalSignatures")
    public void setHasXmlDigitalSignatures(Boolean hasXmlDigitalSignatures) {
        this.hasXmlDigitalSignatures = hasXmlDigitalSignatures;
    }

    @JsonProperty("AnnotationsPreview")
    public Boolean getAnnotationsPreview() {
        return annotationsPreview;
    }

    @JsonProperty("AnnotationsPreview")
    public void setAnnotationsPreview(Boolean annotationsPreview) {
        this.annotationsPreview = annotationsPreview;
    }

    @JsonProperty("TotalPages")
    public Integer getTotalPages() {
        return totalPages;
    }

    @JsonProperty("TotalPages")
    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    @JsonProperty("Id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("Id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("Title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("Title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("LastModified")
    public String getLastModified() {
        return lastModified;
    }

    @JsonProperty("LastModified")
    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    @JsonProperty("LastModifiedSpecified")
    public Boolean getLastModifiedSpecified() {
        return lastModifiedSpecified;
    }

    @JsonProperty("LastModifiedSpecified")
    public void setLastModifiedSpecified(Boolean lastModifiedSpecified) {
        this.lastModifiedSpecified = lastModifiedSpecified;
    }

    @JsonProperty("CreatedAt")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("CreatedAt")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("CreatedAtSpecified")
    public Boolean getCreatedAtSpecified() {
        return createdAtSpecified;
    }

    @JsonProperty("CreatedAtSpecified")
    public void setCreatedAtSpecified(Boolean createdAtSpecified) {
        this.createdAtSpecified = createdAtSpecified;
    }

    @JsonProperty("FileSize")
    public Integer getFileSize() {
        return fileSize;
    }

    @JsonProperty("FileSize")
    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    @JsonProperty("SectionCount")
    public Integer getSectionCount() {
        return sectionCount;
    }

    @JsonProperty("SectionCount")
    public void setSectionCount(Integer sectionCount) {
        this.sectionCount = sectionCount;
    }

    @JsonProperty("IntellixTrust")
    public String getIntellixTrust() {
        return intellixTrust;
    }

    @JsonProperty("IntellixTrust")
    public void setIntellixTrust(String intellixTrust) {
        this.intellixTrust = intellixTrust;
    }

    @JsonProperty("VersionStatus")
    public String getVersionStatus() {
        return versionStatus;
    }

    @JsonProperty("VersionStatus")
    public void setVersionStatus(String versionStatus) {
        this.versionStatus = versionStatus;
    }

    @JsonProperty("FileCabinetId")
    public String getFileCabinetId() {
        return fileCabinetId;
    }

    @JsonProperty("FileCabinetId")
    public void setFileCabinetId(String fileCabinetId) {
        this.fileCabinetId = fileCabinetId;
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
