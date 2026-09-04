package Sesiuni;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Wait_Test {


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
        elementsList.get(1).click();

        WebElement alertElement = driver.findElement(By.id("alertButton"));
        WebElement alertTimerButton = driver.findElement(By.id("timerAlertButton"));
        WebElement confirmButton = driver.findElement(By.id("confirmButton"));
        WebElement promptButton = driver.findElement(By.id("promtButton"));

        alertElement.click();
        Alert alertOk =  driver.switchTo().alert();
        alertOk.accept();

        alertTimerButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert5Seconds = driver.switchTo().alert();
        alertOk.accept();


        //wait.until(ExpectedConditions.elementToBeClickable(confirmButton));
        confirmButton.click();
        Alert alertConfirm =  driver.switchTo().alert();
        alertConfirm.dismiss();

        promptButton.click();
        Alert alertprompt =  driver.switchTo().alert();
        alertprompt.sendKeys("Lore");
        alertprompt.accept();



    }
}
