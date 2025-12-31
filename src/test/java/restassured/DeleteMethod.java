package restassured;

import io.restassured.RestAssured;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class DeleteMethod {

    @Test
    public void verifyDeleteMethod(){
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
        RestAssured
                .given()
                .header("Content-Type", "application/json")
                .header("Cookie", "token=f13ad704e04241c")
                .log().all()
                .when()
                .delete("booking/5")
                .then().log().all()
                .statusCode(HttpStatus.SC_CREATED)
                .assertThat();
    }
}
