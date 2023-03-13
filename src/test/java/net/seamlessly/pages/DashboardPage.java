package net.seamlessly.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import net.seamlessly.utilities.*;

import java.util.*;

public class DashboardPage {

    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[@id=\"app-dashboard\"]/h2")
    public WebElement header;



}
