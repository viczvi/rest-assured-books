package matchers;

import model.SingleBookResponse;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

import static utils.Constants.EMPTY_JSON;

public class EmptyBookResponseMatchers extends TypeSafeMatcher<SingleBookResponse> {

    @Override
    protected boolean matchesSafely(SingleBookResponse singleBookResponse) {
        return singleBookResponse.getRootElement().toString().equals(EMPTY_JSON);
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("Response differs from expected");
    }

    public static Matcher<SingleBookResponse> emptyBookResponseMatcher() {
        return new EmptyBookResponseMatchers();
    }
}
