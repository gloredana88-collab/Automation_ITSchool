package Teste;

import ObjectData.TextBoxObject;
import Pages.Common_Page;
import Pages.Home_Page;
import Pages.Text_Box_Page;
import Pages.Web_Table_Page;
import Shared_data.Test_Base_Page;
import XmlReader.XmlDataLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class TextBoxTest extends Test_Base_Page {
    private Map<String, TextBoxObject> textBoxObjectMap;

    @Test
    public void metodaTest() throws InterruptedException {

        textBoxObjectMap = XmlDataLoader.loadData("C:\\Users\\glore\\IdeaProjects\\AutomationTestingFramework\\src\\test\\resources\\TextBoxData.xml", TextBoxObject.class);
        TextBoxObject data = textBoxObjectMap.get("dataSet_1");

        Home_Page homePage = new Home_Page(getDriver());
        homePage.clickElements();

        Thread.sleep(2000);

        Common_Page commonPage = new Common_Page(getDriver());
        commonPage.clickOnSubMenu("Text Box");

        Thread.sleep(2000);

        Text_Box_Page textBoxPage = new Text_Box_Page(getDriver());
        textBoxPage.entryTextBox(data);

        textBoxPage.dateinserate();

        textBoxPage.verificareEntryText(data);

    }
}
