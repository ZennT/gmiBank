package gmibank.base;

import gmibank.pages.CreateCustomerPage;
import gmibank.pages.LoginPage;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    CreateCustomerPage page = new CreateCustomerPage();
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
}
