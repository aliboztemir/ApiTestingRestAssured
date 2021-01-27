import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/cucumber-html-report", "json:target/cucumber-json-report.json"},
        features = {"src/test/features"},
        glue = "stepdefs",
        tags = "@test")
public class RunCucumberTest extends AbstractTestNGCucumberTests {
}
