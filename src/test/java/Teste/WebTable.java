package Teste;

import Pages.Common_Page;
import Pages.Home_Page;
import Pages.Web_Table_Page;
import Shared_data.Test_Base_Page;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class WebTable extends Test_Base_Page {

    @Test
    public void metodaTest() throws InterruptedException {
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://demoqa.com/");


//        String enterFirstName = "Loredana";
//        String enterLastName = "testlastname";
//        String enterAge = "20";
//        String enterEmail = "test@test.com";
//        String enterSalary = "15000";
//        String enterDep = "accounting";


        Home_Page homePage = new Home_Page(getDriver());
        homePage.clickElements();

        Thread.sleep(2000);


        Common_Page commonPage = new Common_Page(getDriver());
        commonPage.clickOnSubMenu("Web Tables");

        Thread.sleep(2000);

        Web_Table_Page webTablePage = new Web_Table_Page(getDriver());


//        webTablePage.addEntry(enterFirstName,enterLastName,enterAge,enterEmail,enterSalary, enterDep);
//        webTablePage.addEntry("Loredana", "Popa","56", "test@test.com","5460", "it");
//        webTablePage.addEntry("Serban","ionescu", "34", "test.serbam@test.com", "56446", "Complaints");


//        WebElement rowAdded = getDriver().findElement(By.xpath("(//tr)[5]"));
//        String rowAddedText = rowAdded.getText();
//        System.out.println(rowAddedText);
//
//        webTablePage.verifyEntry(enterFirstName,enterLastName,enterEmail,enterAge,enterSalary, enterDep);


        List<String[]> expectedData = new ArrayList<>();
        expectedData.add(webTablePage.addEntry("Loredana", "Popa","56", "test@test.com","5460", "it"));
        expectedData.add(webTablePage.addEntry("Serban","ionescu", "34", "test.serbam@test.com", "56446", "Complaints"));
        expectedData.add(webTablePage.addEntry("Maria","Popescu", "12","testMaria@test.com", "355", "receptie"));



        List<WebElement> rowsAdded = getDriver().findElements(
                By.xpath("//tr[position() >= 4]")
        );
        for (WebElement row : rowsAdded) {
            System.out.println("ROW: " + row.getText());
        }


        Thread.sleep(2000);

        webTablePage.assertAllRows(expectedData);




    }
}

