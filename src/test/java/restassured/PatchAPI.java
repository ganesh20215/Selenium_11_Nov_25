package restassured;

import io.restassured.RestAssured;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class PatchAPI {

    @Test
    public void verifyPatchAPI(){
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
        JSONObject js = new JSONObject();

        js.put("firstname","Abhay");
        js.put("lastname","Dongre");

        RestAssured
                .given()
                .header("Content-Type", "application/json")
                .header("Cookie", "token=8eff79ff13fda0d")
                .body(js.toString())
                .log().all()
                .when()
                .patch("booking/2")
                .then().log().all()
                .statusCode(HttpStatus.SC_OK)
                .assertThat()
                .body(
                        "firstname", Matchers.equalTo("Abhay"),
                        "lastname", Matchers.equalTo("Dongre"));
    }
}
