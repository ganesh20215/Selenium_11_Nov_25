package restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GetRequest {

    //RestAssured : Use for configure and initialise API request
    //RequestSpecification : to define http request (Include headers, parameter, body)
    //Response : It represent the http response return by server
    //validations with hamcrest classes or hard and soft assertion

    @Test
    public void verifySimpleGetRequest(){
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
        SoftAssert sf = new SoftAssert();
        Response response = RestAssured.given()
                .header("Content-Type", "application/json")
                .log().all()
                .when()
                .get("/booking")
                .then().log().all()
                .statusCode(HttpStatus.SC_OK)
                .extract().response();
        sf.assertNotNull(response.jsonPath().getString("[0].bookingid"));
        sf.assertNotNull(response.jsonPath().getString("[1].bookingid"));
        sf.assertAll();
    }
}


