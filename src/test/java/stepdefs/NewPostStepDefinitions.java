package stepdefs;


import io.restassured.http.ContentType;
import pojo.Post;
import static io.restassured.RestAssured.given;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class NewPostStepDefinitions {
    private final World world;
    private String uri;

    public NewPostStepDefinitions(World world) {
        this.world = world;
    }

    @Given("^I have an end point posts$")
    public void iHaveAnEndPointPosts() {
        uri = String.format("%s/%s", world.url, "posts");
    }

    @When("^I post with title \"([^\"]*)\" and author \"([^\"]*)\"$")
    public void iPostWithTitleAndAuthor(String title, String author) {
        Post newPost = new Post(title, author);
        world.response = given().
                contentType(ContentType.JSON)
                .body(newPost.toStringJson())
                .when()
                .post(uri);
        ;
    }
}
