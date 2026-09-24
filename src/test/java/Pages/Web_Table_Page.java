package Pages;

import Helper_Methodes.Elements_Methods;
import Logger.LoggerUtility;
import ObjectData.WebTableObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.awt.SystemColor.text;
import static org.testng.AssertJUnit.assertEquals;

public class Web_Table_Page {
    WebDriver driver;
    Elements_Methods elementsMethods;


    public Web_Table_Page (WebDriver driver) {
        this.driver = driver;
        this.elementsMethods = new Elements_Methods(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy ( id = "addNewRecordButton")
    WebElement addButton;

    @FindBy ( id = "firstName")
    WebElement addFirstNameField;

    @FindBy ( id = "lastName")
    WebElement addLastNameField;

    @FindBy ( id = "age")
    WebElement addAge;

    @FindBy ( id = "userEmail")
    WebElement addUserEmail;


    @FindBy ( id = "salary")
    WebElement addSalary;

    @FindBy ( id = "department")
    WebElement addDepartament;

    @FindBy ( id = "submit")
    WebElement submitButton;

//    @FindBy(xpath = "(//tr)[5]//td[1]" ) //de eliminat pentru test 2
//     WebElement firstNameColumn;
//    @FindBy(xpath = "(//tr)[5]//td[2]" )
//    WebElement lastNameColumn;
//    @FindBy(xpath = "(//tr)[5]//td[3]" )
//    WebElement ageColumn;
//    @FindBy(xpath = "(//tr)[5]//td[4]" )
//    WebElement emailColumn;
//    @FindBy(xpath = "(//tr)[5]//td[5]" )
//    WebElement salaryColumn;
//    @FindBy(xpath = "(//tr)[5]//td[6]" )
//    WebElement departamentColumn;



    public String[] addEntry( //test 2
            String enterFirstName,
            String enterLastName,
            String enterAge,
            String enterEmail,
            String enterSalary,
            String enterDep) {

        clickOnAddButton();

        setAddFirstNameField(enterFirstName);
        addLastNameField(enterLastName);
        addAge(enterAge);
        addUserEmail(enterEmail);
        addSalary(enterSalary);
        addDepartament(enterDep);

        clickOnSubmitButton();

        return new String[]{
                enterFirstName,
                enterLastName,
                enterAge,
                enterEmail,
                enterSalary,
                enterDep
        };
    }

//    public void addEntry (WebTableObject webTableObject){
//        clickOnAddButton();
          //LoggerUtility.infoTestCase("User clicked on add button")
//        setAddFirstNameField(webTableObject.getEnterFirstName());
          //LoggerUtility.infoTestCase("User entered First name")
//        addLastNameField(webTableObject.getEnterLastName());
//        addAge(webTableObject.getEnterAge());
//        addUserEmail(webTableObject.getEnterEmail());
//        addSalary(webTableObject.getEnterSalary());
//        addDepartament(webTableObject.getEnterDep());
//        clickOnSubmitButton();
//
//
//    } // de eliminat pentru test 2

    public void clickOnAddButton(){
        elementsMethods.clickElement(addButton);
    }

    public void setAddFirstNameField(String enterFirstName){
        elementsMethods.fillText(addFirstNameField, enterFirstName);

    }
    public void addLastNameField(String enterLastName){
        elementsMethods.fillText(addLastNameField, enterLastName);

    }

    public void addAge(String enterAge){
        elementsMethods.fillText(addAge, enterAge);

    }
    public void addUserEmail(String enterEmail){
        elementsMethods.fillText(addUserEmail, enterEmail);

    }


    public void addSalary(String enterSalary){
        elementsMethods.fillText(addSalary, enterSalary);

    }


    public void addDepartament(String enterDep){
        elementsMethods.fillText(addDepartament, enterDep);

    }

    public void clickOnSubmitButton(){
        elementsMethods.clickElement(submitButton);

    }

//    public void verifyEntry(WebTableObject webTableObject ){
//
//        Assert.assertTrue(firstNameColumn.getText().equals(webTableObject.getEnterFirstName()));
//        Assert.assertTrue(lastNameColumn.getText().equals(webTableObject.getEnterLastName()));
//        Assert.assertTrue(ageColumn.getText().equals(webTableObject.getEnterAge()));
//        Assert.assertTrue(emailColumn.getText().equals(webTableObject.getEnterEmail()));
//        Assert.assertEquals(salaryColumn.getText(),webTableObject.getEnterSalary());
//        Assert.assertTrue(departamentColumn.getText().equals(webTableObject.getEnterDep()));
//
//    } // de elimminat pentru test 2



//    public void assertAllRows(List<String[]> expectedData) {
//
//        List<WebElement> rows = driver.findElements(
//                By.xpath("(//tr)[position() >= 5]")
//        );
//
//        System.out.println("Expected rows: " + expectedData.size());
//        System.out.println("Actual rows: " + rows.size());
//
//        for (WebElement row : rows) {
//            System.out.println("ROW: " + row.getText());
//        }
//    } - ddoar pentru simulare nu e nevoie in test 2



    public void assertAllRows(List<String[]> expectedData) {

        List<WebElement> rows = driver.findElements(
                By.xpath("(//tr)[position() >= 5]")
        );

        org.testng.Assert.assertEquals(
                rows.size(),
                expectedData.size(),
                "Numarul de randuri este diferit!"
        );

        for (int i = 0; i < rows.size(); i++) {

            List<WebElement> columns = rows.get(i).findElements(
                    By.xpath("./td")
            );

            for (int j = 0; j < 6; j++) {

                String expectedValue = expectedData.get(i)[j];
                String actualValue = columns.get(j).getText();

                org.testng.Assert.assertEquals(
                        actualValue,
                        expectedValue,
                        "Valoare gresita la randul "
                                + (i + 5)
                                + ", coloana "
                                + (j + 1)
                );
            }
        }
    }




}
