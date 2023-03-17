package net.seamlessly.pages;

import net.seamlessly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {
    public LogOutPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "expand")
    public WebElement avatarIcon;

    @FindBy(xpath = "//li[@data-id='logout']")
    public WebElement logoutLink;

    @FindBy(id = "user")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "submit-form")
    public WebElement loginButton;



}