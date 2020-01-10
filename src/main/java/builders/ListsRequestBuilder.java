package builders;

import model.ListsRequest;

public final class ListsRequestBuilder {
    private String name;
    private String description;
    private String[] tags;
    private String[] seeds;

    private ListsRequestBuilder() {
    }

    public static ListsRequestBuilder aListsRequest() {
        return new ListsRequestBuilder();
    }

    public ListsRequestBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public ListsRequestBuilder withDescription(String description) {
        this.description = description;
        return this;
    }

    public ListsRequestBuilder withTags(String[] tags) {
        this.tags = tags;
        return this;
    }

    public ListsRequestBuilder withSeeds(String[] seeds) {
        this.seeds = seeds;
        return this;
    }

    public ListsRequest build() {
        ListsRequest listsRequest = new ListsRequest();
        listsRequest.setName(name);
        listsRequest.setDescription(description);
        listsRequest.setTags(tags);
        listsRequest.setSeeds(seeds);
        return listsRequest;
    }
}
