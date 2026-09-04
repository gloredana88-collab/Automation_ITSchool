package Pages;

import Helper_Methodes.Elements_Methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Common_Page {
    WebDriver driver;
    Elements_Methods elementsMethods;

    public Common_Page(WebDriver driver) {
        this.driver = driver;
        this.elementsMethods = new Elements_Methods(driver);
        PageFactory.initElements(driver,this);//fara aceasta linie nu se gaseste elementul din spate

    }

//    @FindBy(xpath = "//span[@class='text']")
//    List<WebElement> elements;
//
//    public void clickOnSubMenu(String text) {
//        elementsMethods.selectElementFromListByText(elements,text);
//    }

    @FindBy(xpath = "//span[@class='text']")
    List<WebElement> elements;

    public void clickOnSubMenu(String text)
    {
        elementsMethods.selectElementFromListByText(elements,text);
    }
}



