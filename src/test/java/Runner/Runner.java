package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources", glue = "Bind" ,plugin = { "pretty",
        "html:target/cucumber.html" }, tags = { "~@ignore" })

public class Runner {
}
