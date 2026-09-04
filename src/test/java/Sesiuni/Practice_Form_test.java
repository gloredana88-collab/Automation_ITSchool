package Sesiuni;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice_Form_test {


    @Test
    public void metodaTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");

        WebElement formsButton = driver.findElement(By.xpath("//h5[text()='Forms']"));
        formsButton.click();

        Thread.sleep(2000);

        WebElement formsTableButton = driver.findElement(By.xpath("//*[@class='element-list accordion-collapse collapse show']//*[@class='menu-list']//*[@id= 'item-0']"));
        formsTableButton.click();



        String gender = "Male";

        //*[@class='col-md-9 col-sm-12']//*[@id= 'gender-radio-1']
        //*[@id= 'gender-radio-3']

        WebElement maleButton = driver.findElement(By.xpath("//*[@class='col-md-9 col-sm-12']//*[@id= 'gender-radio-1']"));


        WebElement femaleButton = driver.findElement(By.xpath("//*[@class='col-md-9 col-sm-12']//*[@id= 'gender-radio-2']"));


        WebElement otherButton = driver.findElement(By.xpath("//*[@class='col-md-9 col-sm-12']//*[@id= 'gender-radio-3']"));


        //if (gender.equals("Male")) {maleButton.click();}
        //else if (gender.equals("Female")) {femaleButton.click();}
        //else otherButton.click();

        switch (gender){
            case "Male": maleButton.click();
                break;
            case "Female": femaleButton.click();
                break;
            case "Other":otherButton.click();
        }




    }
}