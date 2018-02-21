package seleniumTests.Specs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class absSteps {

    @When("^I am on X page$")
    public void i_am_on_X_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("hello\n");
    }

    @Then("^I see an element$")
    public void i_see_an_element() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("World");
    }
}
