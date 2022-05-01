package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:output/html-report" }, 
features = {"src/test/resources/functionalTests"},glue= {"stepDefinitions"})

public class TestRunner {

}
