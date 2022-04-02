import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class TestPost {
    @Test
    public void test_post() {

        JSONObject req= new JSONObject();       //test için yeni değerler girildi.
        req.put("id",1);
        req.put("name", "banana");
        req.put("price",75);
        req.put("stock",7);

        given()

                .body(req.toJSONString())
                .when()
                .post("http://localhost:3000/data")
                .then()
                .statusCode(201);       //post metodu çağırıldığı için 201 kodunu verip vermediği test edildi.
    }



}