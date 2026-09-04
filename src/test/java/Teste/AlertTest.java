package Teste;

import Pages.Alert_Page;
import Pages.Common_Page;
import Pages.Home_Page;
import Shared_data.Test_Base_Page;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class AlertTest extends Test_Base_Page {

    @Test
    public void metodaTest() throws InterruptedException {

        Home_Page homePage = new Home_Page(getDriver());
        homePage.clickAlerts();

        Thread.sleep(2000);

        Common_Page commonPage = new Common_Page(getDriver());
        commonPage.clickOnSubMenu("Alerts");

        Thread.sleep(2000);

        Alert_Page alertPage = new Alert_Page(getDriver());
        alertPage.dealWithAlertOK();
        alertPage.dealWithAlertDelay(5);
        alertPage.alertConfirm();
        alertPage.alertPrompt("test");

    }
}
