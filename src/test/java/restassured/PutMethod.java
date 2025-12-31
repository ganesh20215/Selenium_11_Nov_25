package restassured;

import io.restassured.RestAssured;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class PutMethod {

    @Test
    public void verifyPutMethod(){
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
        JSONObject js = new JSONObject();
        JSONObject js2 = new JSONObject();

        js.put("firstname","Ganesh");
        js.put("lastname","Patil");
        js.put("totalprice","123");
        js.put("depositpaid",true);
        js.put("bookingdates",js2);
        js.put("additionalneeds","Breakfast");
        js2.put("checkin", "2018-01-01");
        js2.put("checkout", "2019-01-01");

        RestAssured
                .given()
                .header("Content-Type", "application/json")
                .header("Cookie", "token=7bb0e96a0863b44")
                .body(js.toString())
                .log().all()
                .when()
                .put("booking/2")
                .then().log().all()
                .statusCode(HttpStatus.SC_OK)
                .assertThat()
                .body(
                        "firstname", Matchers.equalTo("Ganesh"),
                        "additionalneeds", Matchers.equalTo("Breakfast"));
    }
}
