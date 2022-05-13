package jsonstart;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class APICall {


    public static Response login(String jsondata){
        Response res =
                given().
                        header("Content-Type","application/json").
                        body(jsondata).
                        when().
                                post("http://mall.lemonban.com:8107/login").
                        then().
                        log().all().
                        extract().response();

        return res;

    }
}
