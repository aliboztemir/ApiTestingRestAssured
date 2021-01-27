package stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class World {
    final String url = "https://jsonplaceholder.typicode.com";
    Response response;
    private ValidatableResponse json;
    private RequestSpecification request;
    private Scenario scenario;

    @Before
    public void before(Scenario scenario) {
//        System.out.println("Starting - server " + scenario.getName());
//        Runtime rt = Runtime.getRuntime();
//        rt.exec("json-server --watch localJsonServer/db.json");
    }

    //    placeholder methods if needed
    @After
    public void after() {
    }
}
