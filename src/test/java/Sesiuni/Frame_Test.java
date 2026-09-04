package Sesiuni;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Frame_Test {




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
        elementsList.get(2).click();


        WebElement iframeElement = driver.findElement(By.id("frame1"));
        driver.switchTo().frame(iframeElement);
        WebElement iframetext = driver.findElement(By.id("sampleHeading"));
        //iframetext.getText();
        //System.out.println("Textul din primul frame este " + iframetext);
        //sau
        System.out.println("Textul din primul frameunu este " + iframetext.getText());

        driver.switchTo().defaultContent();

        WebElement iframeElementDoi = driver.findElement(By.id("frame2"));
        driver.switchTo().frame(iframeElementDoi);
        WebElement iframetextDoi = driver.findElement(By.id("sampleHeading"));
        //iframetextDoi.getText();
        //System.out.println("Textul din primul frame este " + iframetext);
        //sau
        System.out.println("Textul din al doilea frame este " + iframetextDoi.getText());


    }


}
