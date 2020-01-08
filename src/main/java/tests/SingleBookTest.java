package tests;

import model.SingleBookResponse;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static matchers.EmptyBookResponseMatchers.emptyBookResponseMatcher;
import static matchers.SingleBookResponseMatcher.singleBookResponseMatcher;
import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Constants.INVALID_ISBN;
import static utils.Constants.VALID_ISBN;
import static utils.HttpResponseCodes.HTTP_200;
import static utils.Urls.getBooksApiUrl;

class SingleBookTest {

    @Test
    void singleBookByIsbn() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("bibkeys", VALID_ISBN);
        params.put("format", "json");
        SingleBookResponse singleBookResponse = given()
                .params(params)
                .when()
                .get(getBooksApiUrl())
                .then()
                .statusCode(HTTP_200.getCode())
                .extract()
                .as(SingleBookResponse.class);
        assertThat(singleBookResponse, singleBookResponseMatcher(VALID_ISBN));
    }

    @Test
    void noBookFound() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("bibkeys", INVALID_ISBN);
        params.put("format", "json");
        SingleBookResponse singleBookResponse = given()
                .params(params)
                .when()
                .get(getBooksApiUrl())
                .then()
                .statusCode(HTTP_200.getCode())
                .extract()
                .as(SingleBookResponse.class);
        assertThat(singleBookResponse, emptyBookResponseMatcher());
    }
}
