package builders;

import model.Docs;
import model.SearchResponse;

public final class SearchResponseBuilder {
    private Integer start;
    private Integer num_found;
    private Integer numFound;
    private Docs[] docs;

    private SearchResponseBuilder() {
    }

    public static SearchResponseBuilder aSearchResponse() {
        return new SearchResponseBuilder();
    }

    public SearchResponseBuilder withStart(Integer start) {
        this.start = start;
        return this;
    }

    public SearchResponseBuilder withNum_found(Integer num_found) {
        this.num_found = num_found;
        return this;
    }

    public SearchResponseBuilder withNumFound(Integer numFound) {
        this.numFound = numFound;
        return this;
    }

    public SearchResponseBuilder withDocs(Docs[] docs) {
        this.docs = docs;
        return this;
    }

    public SearchResponse build() {
        SearchResponse searchResponse = new SearchResponse();
        searchResponse.setStart(start);
        searchResponse.setNum_found(num_found);
        searchResponse.setNumFound(numFound);
        searchResponse.setDocs(docs);
        return searchResponse;
    }
}
