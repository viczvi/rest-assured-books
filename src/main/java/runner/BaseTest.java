package runner;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

import static io.restassured.parsing.Parser.JSON;

public class BaseTest {

    @BeforeAll
    public static void setUp() {
        RestAssured.defaultParser = JSON;
    }
}
