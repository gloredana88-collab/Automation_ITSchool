package Teste;

import ObjectData.PracticeFormObject;
import ObjectData.TextBoxObject;
import Pages.Common_Page;
import Pages.Home_Page;
import Pages.PracticeFormPage;
import Pages.Text_Box_Page;
import Shared_data.Test_Base_Page;
import XmlReader.XmlDataLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.Map;

public class PracticeFormTest extends Test_Base_Page {
    private Map<String, PracticeFormObject> practiceFormObjectMap;


    @Test
    public void metodaTest() throws InterruptedException {
        practiceFormObjectMap = XmlDataLoader.loadData("C:\\Users\\glore\\IdeaProjects\\AutomationTestingFramework\\src\\test\\resources\\PracticeFormData.xml", PracticeFormObject.class);
        PracticeFormObject data = practiceFormObjectMap.get("dataSet_1");

        Home_Page homePage = new Home_Page(getDriver());
        homePage.clickForms();

        Thread.sleep(2000);

        Common_Page commonPage = new Common_Page(getDriver());
        commonPage.clickOnSubMenu("Practice Form");

        PracticeFormPage practiceFormPage = new PracticeFormPage(getDriver());
        practiceFormPage.completeFirstRegionField(data);
        practiceFormPage.completeGender(data);
        practiceFormPage.uploadPicture();
        practiceFormPage.completeStatesAndCity(data);
        practiceFormPage.completeHobbies(data);
        practiceFormPage.completeCalendar(data);
        practiceFormPage.submit();

//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://demoqa.com/");
//
//        WebElement formsButton = driver.findElement(By.xpath("//h5[text()='Forms']"));
//        formsButton.click();
//
//        Thread.sleep(2000);
//
//        WebElement formsTableButton = driver.findElement(By.xpath("//*[@class='element-list accordion-collapse collapse show']//*[@class='menu-list']//*[@id= 'item-0']"));
//        formsTableButton.click();


//        String gender = "Male";
//        String gender = "Other";
//
//        WebElement maleGenderButton = driver.findElement(By.xpath("//*[@id='gender-radio-1']"));
//
//        WebElement femaleGenderButton = driver.findElement(By.xpath("//*[@id='gender-radio-2']"));
//
//        WebElement otherGenderButton = driver.findElement(By.xpath("//*[@id='gender-radio-3']"));

        //*[@class='col-md-9 col-sm-12']//*[@id= 'gender-radio-1']
        //*[@id= 'gender-radio-3']

//        WebElement maleButton = driver.findElement(By.xpath("//*[@class='col-md-9 col-sm-12']//*[@id= 'gender-radio-1']"));
//        WebElement femaleButton = driver.findElement(By.xpath("//*[@class='col-md-9 col-sm-12']//*[@id= 'gender-radio-2']"));
//        WebElement otherButton = driver.findElement(By.xpath("//*[@class='col-md-9 col-sm-12']//*[@id= 'gender-radio-3']"));


        //if (gender.equals("Male")) {maleButton.click();}
        //else if (gender.equals("Female")) {femaleButton.click();}
        //else otherButton.click();

//        switch (gender) {
//            case "Male":
//                maleButton.click();
//                break;
//            case "Female":
//                femaleButton.click();
//                break;
//            case "Other":
//                otherButton.click();
//        }
    }
}
