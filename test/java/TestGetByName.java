import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class TestGetByName {
    @Test
    public void test_01()
    {
        baseURI="http://localhost:3000/";

        //isme göre api sorgusu işlemi.

        given()
                .param("name", "grapes")
                .get("/data?id=2")
        .then()
            .statusCode(200)
            .log().all();

    }


}
