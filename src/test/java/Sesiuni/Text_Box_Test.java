package Sesiuni;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Text_Box_Test {

    @Test
    public void metodaTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
        //*[@class='category-cards']//*[@data-discover='true'] - xpathcompus
        List<WebElement> cardList = driver.findElements(By.xpath("//*[@class='category-cards']//*[@data-discover='true']"));
        cardList.get(0).click();

        //List<WebElement> elementsList = driver.findElements(By.xpath("//*[@class='element-list accordion-collapse collapse show']//*[@data-discover='true']"));
        //elementsList.get(0).click();
        Thread.sleep(2000);
       List<WebElement> elementsList = driver.findElements(By.xpath("//*[@class='element-list accordion-collapse collapse show']//*[@data-discover='true']"));
       elementsList.get(0).click();

        WebElement addFullNameColum = driver.findElement(By.id("userName"));
        addFullNameColum.sendKeys("Loredana");

        WebElement addEmail = driver.findElement(By.id("userEmail"));
        addEmail.sendKeys("testuser@test.com");

        WebElement addCurrentAdress = driver.findElement(By.id("currentAddress"));
        addCurrentAdress.sendKeys("testAdress");

        WebElement addPermanentAdress = driver.findElement(By.id("permanentAddress"));
        addPermanentAdress.sendKeys("testPermanent");

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        //*[@id='userForm']

       //WebElement textBox = driver.findElement(By.id("userForm"));
        //*[@class='element-list accordion-collapse collapse show']//*[@data-discover='true']

        //WebElement textBox = driver.findElement(By.xpath("//*[@id='userForm']//*[@class='col-md-9 col-sm-12']"));
        //String textBoxText = textBox.getText();
       // System.out.println(textBoxText);

        //WebElement fullNameColumn = driver.findElement(By.xpath("//*[@class='border col-md-12 col-sm-12']//*[@id= 'name']"));
        //WebElement emailColumn = driver.findElement(By.xpath("//*[@class='border col-md-12 col-sm-12']//*[@id= 'email']"));
       // WebElement currentAdressColumn = driver.findElement(By.xpath("//*[@class='border col-md-12 col-sm-12']//*[@id= 'currentAddress']"));
       // WebElement permanentAdressColumn = driver.findElement(By.xpath("//*[@class='border col-md-12 col-sm-12']//*[@id= 'permanentAddress']"));

        //WebElement permanentAdressColumn = driver.findElement(By.xpath("//*[@id='userForm']//*[@id='permanentAddress']"));

        //String fullNameColumnText = fullNameColumn.getText();
        //String emailColumnText = emailColumn.getText();
        //String currentAdressColumnText = currentAdressColumn.getText();
        //String permanentAdressColumnText = permanentAdressColumn.getText();

        //Assert.assertTrue(fullNameColumnText.equals("Loredana"));
        //Assert.assertTrue(emailColumnText.equals("testuser@test.com"));
        //Assert.assertTrue(currentAdressColumnText.equals("testAdress"));
       //Assert.assertTrue(permanentAdressColumnText.equals("testPermanent"));

        WebElement name = driver.findElement(By.id("name"));
        assert name.getText().equals("Name:Loredana");

        WebElement email = driver.findElement(By.id("email"));
        assert email.getText().equals("Email:testuser@test.com");

        List<WebElement> infoList = driver.findElements(By.xpath("//*[@class='mb-1']"));
        assert infoList.get(2).getText().equals("Current Address :testAdress");
        assert infoList.get(3).getText().equals("Permananet Address :testPermanent");




    }
}
