package runner;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
    features = "Features",
    glue = "stepDefination",
    plugin = {"pretty", "html:target/cucumber-reports"},
    tags = "@Cart"
)
public class TestRunner extends AbstractTestNGCucumberTests {
}