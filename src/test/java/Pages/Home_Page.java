package Pages;

import Helper_Methodes.Elements_Methods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {

    WebDriver driver;
    Elements_Methods elementsMethods;

//    JavascriptExecutor js;

    public Home_Page(WebDriver driver) {
        this.driver = driver;
//        this.js = (JavascriptExecutor) driver;
        this.elementsMethods = new Elements_Methods(driver);
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//*[text()='Elements']")
    WebElement elementsButton;

    @FindBy(xpath = "//*[text()='Forms']")
    WebElement formsButton;

    @FindBy(xpath = "//*[text()='Alerts, Frame & Windows']")
    WebElement alertsButton;

    public void clickElements(){
        elementsMethods.clickElement(elementsButton);
    }

    public void clickAlerts(){
        elementsMethods.clickElement(alertsButton);
    }


    public void clickForms(){
        elementsMethods.clickElement(formsButton);
    }

    public void switchToDefault (){driver.switchTo().defaultContent();}

}

//public void clickElementsWithJavaScripts()
//{
//    JavascriptExecutor js = (JavascriptExecutor) driver;
//    js.executeScript("arguments[0].click();", elementsButton);
//}
