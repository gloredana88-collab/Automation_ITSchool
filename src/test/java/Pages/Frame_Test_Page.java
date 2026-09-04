package Pages;

import Helper_Methodes.Alert_Methods;
import Helper_Methodes.Elements_Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

import static java.sql.DriverManager.getDriver;

public class Frame_Test_Page {
    WebDriver driver;
    Elements_Methods elementsMethods;
    Alert_Methods alertMethods;

    public Frame_Test_Page (WebDriver driver) {
        this.driver = driver;
        this.elementsMethods = new Elements_Methods(driver);
        this.alertMethods = new Alert_Methods(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy( id = "frame1")
     WebElement frameOne;

    @FindBy( id = "frame2")
    WebElement frameTwo;

    @FindBy( id = "sampleHeading")
    WebElement sampleReading;


       public void sampleReading1() {
           WebElement frameUnu = frameOne;
           driver.switchTo().frame(frameUnu);
           WebElement iframetext = sampleReading;
//           iframetext.getText();
           System.out.println("Textul din primul frameunu este: " + iframetext.getText());

       }

           public void sampleReading2 () {
               WebElement frameUnuDoi = frameTwo;
               driver.switchTo().frame(frameUnuDoi);
               WebElement iframetextdoi = sampleReading;
//               iframetextdoi.getText();
               System.out.println("Textul din al doilea frame este: " + iframetextdoi.getText());

           }


       }
