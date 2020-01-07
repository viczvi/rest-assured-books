package matchers;

import model.SearchResponse;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

import static responseTemplates.SearchResponseTemplates.emptyResponseTemplate;

public class EmptySearchResponseMatchers extends TypeSafeMatcher<SearchResponse> {

    @Override
    protected boolean matchesSafely(SearchResponse searchResponse) {
        return (searchResponse.getNumFound() == emptyResponseTemplate().getNumFound())
                & (searchResponse.getNum_found() == emptyResponseTemplate().getNum_found()
                & (searchResponse.getStart() == emptyResponseTemplate().getStart()));
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("Response differs from expected template");

    }

    public static Matcher<SearchResponse> emptySearchResponse() {
        return new EmptySearchResponseMatchers();
    }
}
