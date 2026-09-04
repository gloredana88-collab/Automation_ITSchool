package Pages;

import Helper_Methodes.Alert_Methods;
import Helper_Methodes.Elements_Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Alert_Page {
    WebDriver driver;
    Elements_Methods elementsMethods;
    Alert_Methods alertMethods;

    public Alert_Page (WebDriver driver) {
        this.driver = driver;
        this.elementsMethods = new Elements_Methods(driver);
        this.alertMethods = new Alert_Methods(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy( id = "alertButton")
    WebElement alertElement;
    @FindBy( id = "timerAlertButton")
    WebElement alertTimerButton;
    @FindBy( id = "confirmButton")
    WebElement confirmButton;
    @FindBy( id = "promtButton")
    WebElement promptButton;

    public void dealWithAlertOK(){
        elementsMethods.clickElement(alertElement);
        alertMethods.alertOk();

    }

    public void dealWithAlertDelay(int seconds){
        elementsMethods.clickElement(alertTimerButton);
        alertMethods.alertWithDelay(seconds);
    }

    public void alertConfirm (){
        elementsMethods.clickElement(confirmButton);
        alertMethods.alertConfirm();

    }

    public void alertCancel (){
        elementsMethods.clickElement(confirmButton);
        alertMethods.alertCancel();

    }

    public void alertPrompt (String value){
        elementsMethods.clickElement(promptButton);
        alertMethods.alertText(value);


    }

}
