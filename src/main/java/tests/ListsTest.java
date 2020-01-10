package tests;

import model.ListsRequest;
import model.ListsResponse;
import org.junit.jupiter.api.Test;
import runner.BaseTest;

import static builders.ListsRequestBuilder.aListsRequest;
import static io.restassured.RestAssured.given;
import static matchers.ListsResponseMatcher.listsResponseMatcher;
import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Constants.OL_PASSWORD;
import static utils.Constants.OL_USER;
import static utils.HttpResponseCodes.HTTP_200;
import static utils.HttpResponseCodes.HTTP_403;
import static utils.Urls.getListsApiUrl;

class ListsTest extends BaseTest {

    @Test
    void getListTest() {
        ListsResponse listsResponse = given()
                .when()
                .get(String.format(getListsApiUrl(), OL_USER))
                .then()
                .statusCode(HTTP_200.getCode())
                .extract()
                .as(ListsResponse.class);
        assertThat(listsResponse, listsResponseMatcher(OL_USER));
    }

    @Test
    void createListWithoutAuthTest() {
        ListsRequest newList = aListsRequest()
                .withName("testList")
                .withDescription("testDescription")
                .build();
        given()
                .when()
                .body(newList)
                .post(String.format(getListsApiUrl(), OL_USER))
                .then()
                .statusCode(HTTP_403.getCode());
    }

    @Test
    void createListWithAuthTest() {
        ListsRequest newList = aListsRequest()
                .withName("testList")
                .withDescription("testDescription")
                .build();
        given()
                .body(newList)
                .auth()
                .basic(OL_USER, OL_PASSWORD)
                .when()
                .post(String.format(getListsApiUrl(), OL_USER))
                .then()
                .statusCode(200);
    }
}

