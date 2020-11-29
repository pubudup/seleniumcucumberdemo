import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/feature",
        glue= { "BaseSteps" },
        plugin = { "pretty" },
        monochrome = true
)


public class TestRunner {

}