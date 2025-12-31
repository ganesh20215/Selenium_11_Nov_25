package restassured;

import io.restassured.RestAssured;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class PostRequest {

    @Test
    public void verifyPostMethod(){
        System.out.println("Hello Good Morning");
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
        JSONObject js = new JSONObject();
        JSONObject js2 = new JSONObject();

        js.put("firstname","Jim");
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
                .body(js.toString())
                .log().all()
                .when()
                .post("booking")
                .then().log().all()
                .statusCode(HttpStatus.SC_OK)
                .assertThat()
                        .body("bookingid", Matchers.notNullValue(),
                "booking.firstname", Matchers.equalTo("Jim"),
                "booking.additionalneeds", Matchers.equalTo("Breakfast"));
    }
}
