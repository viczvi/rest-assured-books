package matchers;

import model.SingleBookResponse;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class SingleBookResponseMatcher extends TypeSafeMatcher<SingleBookResponse> {

    private String expectedKey;

    private SingleBookResponseMatcher(String expectedKey) {
        this.expectedKey = expectedKey;
    }

    @Override
    protected boolean matchesSafely(SingleBookResponse singleBookResponse) {
        return singleBookResponse.getRootElement().toString().contains(expectedKey);
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("Response differs from expected");
    }

    public static Matcher<SingleBookResponse> singleBookResponseMatcher(String expectedKey) {
        return new SingleBookResponseMatcher(expectedKey);
    }
}
