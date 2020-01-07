package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BookDetails {

    @JsonProperty("bib_key")
    private String bibKey;

    private String preview;

    @JsonProperty("thumbnail_url")
    private String thumbnailUrl;

    public String getBibKey() {
        return bibKey;
    }

    public void setBibKey(String bibKey) {
        this.bibKey = bibKey;
    }

    public BookDetails() {
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getPreviewUrl() {
        return previewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    public String getInfoUrl() {
        return infoUrl;
    }

    public void setInfoUrl(String infoUrl) {
        this.infoUrl = infoUrl;
    }

    @JsonProperty("preview_url")
    private String previewUrl;

    @JsonProperty("info_url")
    private String infoUrl;
}
