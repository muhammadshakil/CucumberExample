package seleniumTests.Pages;

import org.openqa.selenium.support.How;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class testPage extends seleniumTests.Pages.BasePage {


    @FindBy(how = How.CLASS_NAME, using = "site-login__link--user")
    static WebElement loginLink;

    @FindBy(how = How.ID, using = "username")
    static WebElement userName;

    @FindBy(how = How.ID, using = "password")
    static WebElement passWord;

    @FindBy(how = How.ID, using = "signinButton")
    static WebElement signinButton;


    public testPage(WebDriver driver){  this.driver =driver;}



    public void clickOnSignIn(){
        loginLink.click();
    }



    public void returnTest(String i, String j) {

        userName.sendKeys(i);
        passWord.sendKeys(j);
        signinButton.click();

    }

}
