package responseTemplates;

import builders.SearchResponseBuilder;
import model.SearchResponse;

import static builders.SearchResponseBuilder.aSearchResponse;

public class SearchResponseTemplates {

    public static SearchResponse emptyResponseTemplate() {
        SearchResponseBuilder emptyResponse = aSearchResponse()
                .withNum_found(0)
                .withNumFound(0)
                .withStart(0);
        return emptyResponse.build();
    }
}
