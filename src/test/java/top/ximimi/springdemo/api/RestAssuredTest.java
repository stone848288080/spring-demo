package top.ximimi.springdemo.api;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class RestAssuredTest {



    @Test
    void testGet1(){

        given()
                //.log().all()
        .when()
                .get("https://www.baidu.com/")
        .then()
                //.log().all()
                .statusCode(200);




    }
}
