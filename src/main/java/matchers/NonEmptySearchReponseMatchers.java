package matchers;

import model.SearchResponse;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class NonEmptySearchReponseMatchers extends TypeSafeMatcher<SearchResponse> {
    @Override
    protected boolean matchesSafely(SearchResponse searchResponse) {
        return searchResponse.getDocs().length > 0;
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("Response differs from expected template");
    }

    public static Matcher<SearchResponse> nonEmptySearchReponseMatchers() {
        return new NonEmptySearchReponseMatchers();
    }
}
