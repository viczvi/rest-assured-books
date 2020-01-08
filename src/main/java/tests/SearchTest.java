package tests;

import model.SearchResponse;
import org.junit.jupiter.api.Test;
import runner.BaseTest;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static matchers.EmptySearchResponseMatchers.emptySearchResponse;
import static matchers.NonEmptySearchReponseMatchers.nonEmptySearchReponseMatchers;
import static matchers.SearchResponseMatcherWithResult.searchResponseMatcherWithResult;
import static org.hamcrest.MatcherAssert.assertThat;
import static utils.HttpResponseCodes.HTTP_200;
import static utils.Urls.getSearchApiUrl;

class SearchTest extends BaseTest {

    @Test
    void basicEmptySearch() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("q", "tttest");
        SearchResponse searchResponse = given()
                .params(params)
                .when()
                .get(getSearchApiUrl())
                .then()
                .statusCode(HTTP_200.getCode())
                .extract()
                .as(SearchResponse.class);
        assertThat(searchResponse, emptySearchResponse());
    }

    @Test
    void basicNonEmptySearch() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("q", "test");
        SearchResponse searchResponse = given()
                .params(params)
                .when()
                .get(getSearchApiUrl())
                .then()
                .statusCode(HTTP_200.getCode())
                .extract()
                .as(SearchResponse.class);
        assertThat(searchResponse, nonEmptySearchReponseMatchers());
    }

    @Test
    void searchByTitle() {
        String searchKeyword = "isbn";
        Map<String, String> params = new HashMap<>();
        params.put("title", searchKeyword);
        SearchResponse searchResponse = given()
                .params(params)
                .when()
                .get(getSearchApiUrl())
                .then()
                .statusCode(HTTP_200.getCode())
                .extract()
                .as(SearchResponse.class);
        assertThat(searchResponse, searchResponseMatcherWithResult(searchKeyword));
    }
}
