package restassured;

import io.restassured.RestAssured;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class GetWithQueryParameter {

    @Test
    public void verifyGetWithQueryParam(){
        RestAssured.baseURI = "https://reqres.in/api/users";
        RestAssured
                .given()
                .queryParam("page", "2")
                .header("Content-Type", "application/json")
                .header("x-api-key", "reqres_6cf85fefb2aa4b49a35d645903090fa1")
                .log().all()
                .when()
                .get()
                .then().log().all()
                .statusCode(HttpStatus.SC_OK)
                .assertThat()
                .body("page", Matchers.equalTo(2),
                        "total", Matchers.equalTo(12),
                        "data[0].email", Matchers.notNullValue());
    }
}
