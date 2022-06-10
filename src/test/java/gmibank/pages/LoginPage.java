package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    /*
    css is faster, reliable and better to use but xpath is  more common. we can write dynamic xpath to locate dynamic elements
    preference : id, name, class, tag, linktext, partiallinktext, xpath, css
     */

//     @FindBy(xpath = "//li[@id='account-menu']")
    @FindBy(id = "account-menu")
    public WebElement loginDropdownIcon;

//    @FindBy(css = "#login-item")
//    @FindBy(xpath = "//a[@id='login-item']")
//    @FindBy(css = ".dropdown-item#login-item")
    @FindBy(id = "login-item")  // best way
    public WebElement signInDropdown;

    @FindBy(xpath = "(//span[text()='Register'])[1]")
    public WebElement registerDropdown;

    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy(xpath = "//button[@type='button']")
    public WebElement cancelButton;



}
