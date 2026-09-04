package Sesiuni;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Browse_Window_Test {


    @Test
    public void metodaTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
        //*[@class='category-cards']//*[@data-discover='true'] - xpathcompus
        List<WebElement> cardList = driver.findElements(By.xpath("//*[@class='category-cards']//*[@data-discover='true']"));
        cardList.get(2).click();


        Thread.sleep(2000);
        List<WebElement> elementsList = driver.findElements(By.xpath("//*[@class='element-list accordion-collapse collapse show']//*[@data-discover='true']"));
        elementsList.get(0).click();

        WebElement tabButton = driver.findElement(By.id("tabButton"));
        tabButton.click();

        List<String> tabList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabList.get(1));
        WebElement iframeTabButton = driver.findElement(By.id("sampleHeading"));
        System.out.println("Textul din frame este " + iframeTabButton.getText());

        driver.close();
        driver.switchTo().window(tabList.getFirst());

        WebElement newWindow = driver.findElement(By.id("windowButton"));
        newWindow.click();

        List<String> newWindowList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(newWindowList.get(1));

        driver.manage().window().maximize();


        WebElement newWindowButton = driver.findElement(By.id("sampleHeading"));
        System.out.println("Textul din noul window este " + newWindowButton.getText());

        driver.close();
        //driver.switchTo().window(tabList.getFirst());








    }

}
