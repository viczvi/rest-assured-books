package model;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.STRING)
public class ListsResponse {

    private ListEntry[] entries;

    private Links links;

    private Integer size;

    public ListEntry[] getEntries() {
        return entries;
    }

    public void setEntries(ListEntry[] entries) {
        this.entries = entries;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
