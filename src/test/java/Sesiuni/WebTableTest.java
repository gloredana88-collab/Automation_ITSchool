package Sesiuni;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTableTest {

    @Test
    public void metodaTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");

        //String fistName = "Loredana"; // pentru a aerisi codul putem inlocui datele din cod cu string-urile de aici sesiunea din 02.07
        //String lastName = "testlastname";
        //String age = "20";
        //String Email = "test@test.com";
        //String salary = "15000";
        //String Dep = "accounting";


        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0, 800);"); // 800 pixeli în jos - scroll
        //*[text()='Elements']

        WebElement elementsButton = driver.findElement(By.xpath("//*[text()='Elements']"));
        elementsButton.click();
        //*[text()='Web Tables']
        //span[text()='Web Tables']
        //(//li[@id='item-3'])[1]
        //*[@class='element-list accordion-collapse collapse show']//*[@class='menu-list']//*[@id= 'item-3']
        //*[@class='element-list accordion-collapse collapse show']//[@class='menu-list']//*[@class='btn btn-light ' and contains(@id, 'item-3')]
        //*[@class='element-list accordion-collapse collapse show']//*[@class='menu-list'] //*[@class='btn btn-light ' and contains(@id, 'item-3')]
        Thread.sleep(2000);
        WebElement webTableButton = driver.findElement(By.xpath("//*[text()='Web Tables']"));
        webTableButton.click();
        //WebElement addButton = driver.findElement(By.xpath("//*[@id='addNewRecordButton']"));
        //addButton.click();
        //*[@id='addNewRecordButton']

        Thread.sleep(2000);
        WebElement addButton = driver.findElement(By.id("addNewRecordButton"));
        addButton.click();

        //WebElement addFirstName = driver.findElement(By.xpath("//*[@id=firstName'']"));
        //addButton.click();
        WebElement addFirstNameField = driver.findElement(By.id("firstName"));
        addFirstNameField.sendKeys("Loredana");

        WebElement addLastNameField = driver.findElement(By.id("lastName"));
        addLastNameField.sendKeys("testlastname");

        WebElement addUserEmail = driver.findElement(By.id("userEmail"));
        addUserEmail.sendKeys("test@test.com");

        WebElement addAge = driver.findElement(By.id("age"));
        addAge.sendKeys("20");

        WebElement addSalary = driver.findElement(By.id("salary"));
        addSalary.sendKeys("15000");

        WebElement addDepartament = driver.findElement(By.id("department"));
        addDepartament.sendKeys("accounting");

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();


        WebElement rowAdded = driver.findElement(By.xpath("(//tr)[5]"));
        String rowAddedText = rowAdded.getText();
        System.out.println(rowAddedText);

        //Assert.assertTrue(rowAddedText.contains("Loredana"));
        //Assert.assertTrue(rowAddedText.contains("testlastname"));
        //Assert.assertTrue(rowAddedText.contains("test@test.com"));
        //Assert.assertTrue(rowAddedText.contains(""));
        //Assert.assertTrue(rowAddedText.contains("15000"));
        //Assert.assertTrue(rowAddedText.contains("accounting"));

        WebElement firstNameColumn = driver.findElement(By.xpath("(//tr)[5]//td[1]"));
        WebElement lastNameColumn = driver.findElement(By.xpath("(//tr)[5]//td[2]"));
        WebElement ageColumn = driver.findElement(By.xpath("(//tr)[5]//td[3]"));
        WebElement emailColumn = driver.findElement(By.xpath("(//tr)[5]//td[4]"));
        WebElement salaryColumn = driver.findElement(By.xpath("(//tr)[5]//td[5]"));
        WebElement departamentColumn = driver.findElement(By.xpath("(//tr)[5]//td[6]"));

        String firstNameColumnText = firstNameColumn.getText();
        String lastNameColumnText = lastNameColumn.getText();
        String ageColumnText = ageColumn.getText();
        String emailColumnText = emailColumn.getText();
        String salaryColumnText = salaryColumn.getText();
        String departamentColumnText = departamentColumn.getText();

        Assert.assertTrue(firstNameColumnText.equals("Loredana"));
        Assert.assertTrue(lastNameColumnText.equals("testlastname"));
        Assert.assertTrue(ageColumnText.equals("20"));
        Assert.assertTrue(emailColumnText.equals("test@test.com"));
        Assert.assertEquals(salaryColumnText,"15000");
        Assert.assertTrue(departamentColumnText.equals("accounting"));

        //Assert.assertTrue(departamentColumn.getText().equals("accounting"));




    }
}
