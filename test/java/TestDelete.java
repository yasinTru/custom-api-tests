import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class TestDelete {
    @Test
    public void test_delete()
    {
        //var olmayan id'lerde 404, mevcut olup silme işlemi gerçekleşenlerde 200 kodu çıktısı.

        baseURI = "http://localhost:3000/";

        when()
                .delete("/data/5")
                .then()
                .statusCode(200);


    }


}
