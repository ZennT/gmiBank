package gmibank.tests;

import gmibank.pages.LoginPage;
import gmibank.pages.RegistrationPage;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import org.testng.annotations.Test;

public class RegistrationTest {

    @Test
    public void registrationTest() {
    Driver.getDriver().get(ConfigurationReader.getProperty("base_url"));

    RegistrationPage registrationPage =new RegistrationPage();
    LoginPage loginPage = new LoginPage();


        loginPage.loginDropdownIcon.click();
        loginPage.registerDropdown.click();
        registrationPage.ssn.sendKeys("111681117");
        registrationPage.firstName.sendKeys("Ali");
        registrationPage.lastname.sendKeys("Can");
        registrationPage.address.sendKeys("45 yellow street");
        registrationPage.phoneNumber.sendKeys("9045599990");
        registrationPage.userName.sendKeys("ali");
        registrationPage.email.sendKeys("aliali@yandex.com");
        registrationPage.firstPassword.sendKeys("AliCan123?");
        registrationPage.secondPassword.sendKeys("AliCan123?");
        registrationPage.registerButton.click();
}
}
