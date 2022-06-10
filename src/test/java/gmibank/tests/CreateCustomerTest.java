package gmibank.tests;

import gmibank.pages.CreateCustomerPage;
import gmibank.pages.LoginPage;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import gmibank.utilities.ReusableMethods;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class CreateCustomerTest {
    CreateCustomerPage customerPage = new CreateCustomerPage();
    LoginPage login = new LoginPage();

    @BeforeMethod
    public void logIn(){
        Driver.getDriver().get(ConfigurationReader.getProperty("base_url"));
        login.loginDropdownIcon.click();
        login.signInDropdown.click();
        login.userName.sendKeys(ConfigurationReader.getProperty("employee_username"));
//        login.userName.sendKeys("gino.wintheiser");
        login.password.sendKeys(ConfigurationReader.getProperty("employee_password"));
//        login.password.sendKeys("%B6B*q1!TH");
        login.signInButton.click();
    }
    @Test
    public void createCustomer() throws IOException {

        customerPage.myOperationsDropdown.click();
        customerPage.manageCustomers.click();
        customerPage.createANewCustomer.click();
        customerPage.ssn1.sendKeys("4444-22-333");
        customerPage.firstname.sendKeys("Ali");
        customerPage.lastname.sendKeys("Can");
        customerPage.email.sendKeys("ali@ali.can");
        customerPage.mobilePhoneNumber.sendKeys("333-333-4444");
        customerPage.phoneNumber.sendKeys("333-333-4444");
        customerPage.zipCode.sendKeys("55555");
        customerPage.address.sendKeys("test test");
        customerPage.city.sendKeys("test");
        customerPage.ssn2.sendKeys("4444-22-333");

        Select country = new Select(customerPage.countryDropdown);
        country.selectByVisibleText("VAN");

        customerPage.state.sendKeys("baskale");

        Select user = new Select(customerPage.userDrop);
        user.selectByIndex(2);

        ReusableMethods.selectByIndex(customerPage.accountDropdown, 3);

        customerPage.zelleEnrolledCheckbox.click();
        customerPage.saveButton.click();
        ReusableMethods.getScreenshot("CustomerCreated");



//        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 1000);");


//        System.out.println(h1.getCssValue("color"));
//		  System.out.println(h1.getCssValue("background-color"));
//        assertEquals("rgba(51, 51, 51, 1)", h1.getCssValue("color"));
//        assertEquals("rgba(255, 255, 0, 1)", h1.getCssValue("background-color"));
//    }

//        WebElement h2 = driver.findElement(By.tagName("h2"));
//        System.out.println(h2.getCssValue("border"));
//        System.out.println(h2.getCssValue("border-style"));
//        System.out.println(h2.getCssValue("border-width"));
//        System.out.println(h2.getCssValue("border-color"));
//        System.out.println(h2.getCssValue("border-top-style"));
//        System.out.println(h2.getCssValue("border-left-width"));
//        System.out.println(h2.getCssValue("border-bottom-color"));

    }
}
