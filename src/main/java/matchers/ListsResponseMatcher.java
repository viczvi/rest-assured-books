package matchers;

import model.ListsResponse;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class ListsResponseMatcher extends TypeSafeMatcher<ListsResponse> {

    private String expectedText;

    private ListsResponseMatcher(String expectedText) {
        this.expectedText = expectedText;
    }

    @Override
    protected boolean matchesSafely(ListsResponse listsResponse) {
        return (listsResponse.getSize() == listsResponse.getEntries().length)
                && listsResponse.getEntries()[0].getUrl().contains(expectedText)
                && listsResponse.getEntries()[0].getFullUrl().contains(expectedText);
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("Response differs from expected");
    }

    public static Matcher<ListsResponse> listsResponseMatcher(String expectedText) {
        return new ListsResponseMatcher(expectedText);
    }
}
