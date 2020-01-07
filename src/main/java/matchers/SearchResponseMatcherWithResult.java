package matchers;

import model.Docs;
import model.SearchResponse;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class SearchResponseMatcherWithResult extends TypeSafeMatcher<SearchResponse> {

    private String expectedResult;

    private SearchResponseMatcherWithResult(String expectedResult) {
        this.expectedResult = expectedResult;
    }

    @Override
    protected boolean matchesSafely(SearchResponse searchResponse) {
        List<String> titles = Arrays.stream(searchResponse.getDocs()).map(Docs::getTitle).collect(toList());
        return searchResponse.getDocs().length > 0 && titles.contains(expectedResult);
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("Response differs from expected template");
    }

    public static Matcher<SearchResponse> searchResponseMatcherWithResult(String expectedResult) {
        return new SearchResponseMatcherWithResult(expectedResult);
    }
}
