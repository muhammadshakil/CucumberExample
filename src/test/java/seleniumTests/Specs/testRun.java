package seleniumTests.Specs;

import seleniumTests.Pages.testPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;


public class testRun extends seleniumTests.Pages.BasePage {


    WebDriver driver;
    testPage test;


    @Given("^user navigates to Facebook$")
    public void user_navigates_to_Facebook() throws Exception {


       driver = initDesktopBrowser();

        test = PageFactory.initElements(driver, testPage.class);

        // Write code here that turns the phrase above into concrete actions
        test.clickOnSignIn();
    }

    @When("^I enter correct \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_enter_correct_and(String arg1, String arg2) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        test.returnTest(arg1,arg2);
    }

    @Then("^login should be successful$")
    public void login_should_be_successful() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("successfull");
        afterMethod();
    }




}
