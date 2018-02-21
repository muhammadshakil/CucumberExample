package seleniumTests.Pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.Before;
import cucumber.api.java.After;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class BasePage {


    public static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

 public BasePage() {getDriver();}


    public WebDriver initDesktopBrowser() {

        System.setProperty("webdriver.gecko.driver", "geckodriver");
        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://uat-revamp.skysports.com");
        return driver;
    }


    public void afterMethod() {

        driver.quit();

    }

}
