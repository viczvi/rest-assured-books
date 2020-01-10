package model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonFormat(shape = JsonFormat.Shape.STRING)
public class ListEntry {

    @JsonProperty("seed_count")
    private Integer seedCount;

    public Integer getSeedCount() {
        return seedCount;
    }

    public void setSeedCount(Integer seedCount) {
        this.seedCount = seedCount;
    }

    public Integer getEditionCount() {
        return editionCount;
    }

    public void setEditionCount(Integer editionCount) {
        this.editionCount = editionCount;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getFullUrl() {
        return fullUrl;
    }

    public void setFullUrl(String fullUrl) {
        this.fullUrl = fullUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("edition_count")
    private Integer editionCount;

    private String url;

    @JsonProperty("last_update")
    private String lastUpdate;

    @JsonProperty("full_url")
    private String fullUrl;

    private String name;
}
