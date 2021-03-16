package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.Assert;
import pojo.User;
import resources.APIResources;
import resources.TestData;
import resources.Utils;

import java.io.FileNotFoundException;

import static io.restassured.RestAssured.given;

public class UserStepDefination {
    RequestSpecification requestSpecification;
    ResponseSpecification responseSpecification;
    TestData testData = new TestData();
    Utils utils = new Utils();
    Response response;
    User user;

    @Given("Create user payload with {string} {string} {string} {string} {string} {string} {string} {string}")
    public void create_user_payload_with(String id, String username, String firstName, String lastName, String email, String password, String phone, String userStatus) throws FileNotFoundException {
        user = testData.addUserPayload(Integer.parseInt(id), username, firstName, lastName, email, password, phone, Integer.parseInt(userStatus));
        requestSpecification = given().spec(utils.getRequestSpecification());
    }

    @Given("{string} is the path parameter")
    public void is_the_path_parameter(String pathParam) throws FileNotFoundException {
        requestSpecification = given().spec(utils.getRequestSpecification()).pathParam("userName", pathParam);
    }

    @When("Call {string} with {string} request")
    public void call_with_request(String resource, String httpMethod) throws FileNotFoundException {
        responseSpecification = new ResponseSpecBuilder().expectContentType(ContentType.JSON).build();
        if (httpMethod.equalsIgnoreCase("POST")) {
            response = requestSpecification.body(user).when().post(APIResources.valueOf(resource).getResource()).then().spec(responseSpecification).extract().response();

        } else if (httpMethod.equalsIgnoreCase("GET")) {
            response = requestSpecification.when().get(APIResources.valueOf(resource).getResource() + "/{userName}").then().spec(responseSpecification).extract().response();

        } else if (httpMethod.equalsIgnoreCase("PUT")) {
            response = requestSpecification.body(user).when().put(APIResources.valueOf(resource).getResource() + "/{userName}").then().spec(responseSpecification).extract().response();

        } else {
            responseSpecification = new ResponseSpecBuilder().expectStatusCode(200).build();
            response = requestSpecification.when().delete(APIResources.valueOf(resource).getResource() + "/{userName}").then().spec(responseSpecification).extract().response();

        }
    }


    @Then("API call is success with status code {int}")
    public void api_call_is_success_with_status_code(Integer responseCode) {
        Assert.assertEquals((Integer) response.getStatusCode(), responseCode);
    }

    @Then("{string} in response body is {string}")
    public void in_response_body_is(String key, String expectedValue) {
        Assert.assertEquals(utils.getJsonPath(response, key), expectedValue);
    }

}
