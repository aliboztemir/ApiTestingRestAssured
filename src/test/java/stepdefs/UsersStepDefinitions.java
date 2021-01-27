package stepdefs;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class UsersStepDefinitions {
    private final World world;
    private String uri;
    private RequestSpecification request;
    private Response response;

    public UsersStepDefinitions(World world) {
        this.world = world;
    }

    @Given("^I have a service to request list of users$")
    public void iHaveAServiceToRequestListOfUsers() {
        request = given();
        uri = String.format("%s/%s", world.url, "users");
        get(uri).then().assertThat().statusCode(200);

    }

    @When("^I request list of users$")
    public void iRequestListOfUsers() {
        response = request
                .get(uri);
        world.response = response;
    }

}
