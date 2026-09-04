package Shared_data;

import Shared_data.browser.Browser_Factory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Test_Base_Page {
    private WebDriver driver;

    @BeforeMethod
    public void initialiseBrowser(){
//        this.driver = new ChromeDriver();
//        driver.manage().window().maximize();
        driver = new Browser_Factory().getBrowserFactory();
        driver.get("https://demoqa.com/");
    }

    @AfterMethod
    public void clearBrowser(){
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
