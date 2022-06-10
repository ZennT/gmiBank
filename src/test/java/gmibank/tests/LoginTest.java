package gmibank.tests;

import gmibank.pages.LoginPage;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

    LoginPage login = new LoginPage();


    @BeforeMethod
    public void setUp(){
        Driver.getDriver().get(ConfigurationReader.getProperty("base_url"));
    }

    @Test
    public void signIn() {
        login.loginDropdownIcon.click();
        login.signInDropdown.click();
        login.userName.sendKeys(ConfigurationReader.getProperty("employee_username"));
//        login.userName.sendKeys("gino.wintheiser");
        login.password.sendKeys(ConfigurationReader.getProperty("employee_password"));
//        login.password.sendKeys("%B6B*q1!TH");
        login.signInButton.click();

    }

//    @AfterMethod
//    public void tearDown(){
//        Driver.closeDriver();
//    }

}
