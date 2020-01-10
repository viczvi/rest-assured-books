package model;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.STRING)
public class ListsRequest {

    private String name;

    private String description;

    private String[] tags;

    private String[] seeds;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public String[] getSeeds() {
        return seeds;
    }

    public void setSeeds(String[] seeds) {
        this.seeds = seeds;
    }
}
