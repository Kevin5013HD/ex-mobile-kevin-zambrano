package runner;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/SwagLab.feature",
        glue = "steps",
        tags="@LoginTheApp"
)
public class TestRunner {}