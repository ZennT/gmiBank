package gmibank.tests;

import gmibank.base.TestBase;
import gmibank.pages.CreateCustomerPage;
import gmibank.pages.LoginPage;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CssColorWork extends TestBase {

    CreateCustomerPage page = new CreateCustomerPage();
    CreateCustomerPage customerPage = new CreateCustomerPage();

    @Test
    public void save(){
        customerPage.myOperationsDropdown.click();
        customerPage.manageCustomers.click();
        customerPage.createANewCustomer.click();
        System.out.println(page.saveButton.getCssValue("color"));
        System.out.println(page.saveButton.getCssValue("background-color"));
        System.out.println(page.saveButton.getCssValue("border-color"));


    }
}
