package Shared_data;

import Logger.LoggerUtility;
import Shared_data.browser.Browser_Factory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

public class Test_Base_Page {
    private WebDriver driver;

    public String testName;

    @BeforeMethod
    public void initialiseBrowser(){
//        this.driver = new ChromeDriver();
//        driver.manage().window().maximize();
        testName = this.getClass().getSimpleName();
        driver = new Browser_Factory().getBrowserFactory();
        LoggerUtility.infoTestCase("=== The browser started succesfully ===");
        LoggerUtility.startTestCase(testName);

        driver.get("https://demoqa.com/");
    }

    @AfterMethod
    public void clearBrowser(ITestResult result){
        driver.quit();
        if (result.getStatus() == ITestResult.FAILURE){
            LoggerUtility.errorLog(result.getThrowable().getMessage());
        }
        LoggerUtility.infoTestCase("=== The browser closed succesfully ===");
        LoggerUtility.endTestCase(testName);
    }

    @AfterSuite
    public void finishLogFiles(){
        LoggerUtility.mergeFiles();
    }

    public WebDriver getDriver() {
        return driver;
    }


}
