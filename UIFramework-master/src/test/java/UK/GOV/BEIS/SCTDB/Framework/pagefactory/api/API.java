package UK.GOV.BEIS.SCTDB.Framework.pagefactory.api;

import UK.GOV.BEIS.SCTDB.Framework.utilities.Reusable;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class API {

    Response response;
    Reusable ReusableObj;

    public void setEndPoint(String Endpoint){
        RestAssured.basePath="/"+Endpoint;
        //RestAssured.baseURI=ReusableObj.getProperty("basepath.url");
        RestAssured.baseURI="https://subsidy-search-service.azurewebsites.net";
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }


    public void getResponseForPOST(String Payload){
     response = given()
                .when()
                        .body(Payload)
                        .contentType(ContentType.JSON)
                        .post()
                .then()
                        .extract()
                        .response();
    }

    public void getResponseForGET(){
        response = given()
                .when()
                .get()
                .then()
                .extract()
                .response();
    }


    public void validateResponse(int StatusCode){

        assertEquals("Error in Validating Status Code:",StatusCode, response.getStatusCode());
        //assertTrue(response.getBody().jsonPath().getMap("$").size()>0);

    }
}
