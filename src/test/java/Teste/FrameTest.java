package Teste;

import Pages.Common_Page;
import Pages.Frame_Test_Page;
import Pages.Home_Page;
import Pages.Text_Box_Page;
import Shared_data.Test_Base_Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class FrameTest extends Test_Base_Page {
    @Test
    public void metodaFrameTest() throws InterruptedException {

        Home_Page homePage = new Home_Page(getDriver());
        homePage.clickAlerts();

        Thread.sleep(2000);

        Common_Page commonPage = new Common_Page(getDriver());
        commonPage.clickOnSubMenu("Frames");

        Thread.sleep(2000);

        Frame_Test_Page frameTestPage = new Frame_Test_Page(getDriver());

        frameTestPage.sampleReading1();

        homePage.switchToDefault();

        frameTestPage.sampleReading2();

    }
}
