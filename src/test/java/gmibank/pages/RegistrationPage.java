package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
    public RegistrationPage(){
//        to instantiate to page objects
        PageFactory.initElements(Driver.getDriver(),this);
    }




    @FindBy(id="ssn")
    public WebElement ssn;

    @FindBy(id="firstname")
    public WebElement firstName;

    @FindBy(id="lastname")
    public WebElement lastname;

    @FindBy(id="address")
    public WebElement address;

    @FindBy(id="mobilephone")
    public WebElement phoneNumber;

    @FindBy(id="username")
    public WebElement userName;

    @FindBy(id="email")
    public WebElement email;

    @FindBy(id="firstPassword")
    public WebElement firstPassword;

    @FindBy(name="secondPassword")
    public WebElement secondPassword;

    @FindBy(id="register-submit")
    public WebElement registerButton;

}
