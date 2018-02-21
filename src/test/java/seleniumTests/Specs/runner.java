package seleniumTests.Specs;

import cucumber.api.junit.Cucumber;

@org.junit.runner.RunWith(Cucumber.class)
@cucumber.api.CucumberOptions(
        features = "src/test/resources",
        glue = "seleniumTests",
        plugin = {"html:target/cucumber-html-report"})

public class runner {


}
