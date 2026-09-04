package Sesiuni;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class Interactions_Sortable_Test {

    @Test
    public void metodaTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
        //*[@class='category-cards']//*[@data-discover='true'] - xpathcompus
        List<WebElement> cardList = driver.findElements(By.xpath("//*[@class='category-cards']//*[@data-discover='true']"));
        cardList.get(4).click();


        Thread.sleep(2000);
        List<WebElement> elementsList = driver.findElements(By.xpath("//*[@class='element-list accordion-collapse collapse show']//*[@data-discover='true']"));
        elementsList.get(0).click();

        WebElement oneElement = driver.findElement(By.xpath("//div[@data-handler-id='T0']"));
        WebElement fiveElement = driver.findElement(By.xpath("//div[@data-handler-id='T8']"));

        Actions action = new Actions(driver);
        //action.sendKeys(Keys.ADD); avem sagetile
        //action.clickAndHold(oneElement).moveToElement(fiveElement).build().perform(); // toate clasele Action au nevoie de perform
        //action.clickAndHold(oneElement).moveToElement(fiveElement).release(oneElement).build().perform();
        //action.dragAndDropBy(oneElement,0, -1000).build().perform();
        action.clickAndHold(oneElement).moveToElement(fiveElement, 0, 15).release().build().perform();





    }
}
