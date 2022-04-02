import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

//200 kodu ile tüm data'lar çağırıldı.

public class TestGet {
    @Test
    public void test_get() {
        baseURI = "http://localhost:3000/";

                given()
                .get("data")
                        .then()
                        .statusCode(200)
                        .log().all();
    }
}