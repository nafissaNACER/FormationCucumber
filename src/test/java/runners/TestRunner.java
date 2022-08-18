package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(tags="@Test_Background",features="src/test/resources/features",glue = "steps",
        plugin = { "pretty", "json:target/reports/cucumber.json"}
        )

public class TestRunner {

}
