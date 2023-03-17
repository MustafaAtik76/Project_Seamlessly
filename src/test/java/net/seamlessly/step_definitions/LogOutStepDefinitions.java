package net.seamlessly.step_definitions;

import net.seamlessly.pages.LogOutPage;
import net.seamlessly.utilities.BrowserUtils;
import net.seamlessly.utilities.Driver;
import net.seamlessly.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.seamlessly.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class LogOutStepDefinitions {

    LogOutPage logOutPage = new LogOutPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get("https://qa.seamlessly.net/");
    }

    @When("user enters {string} as username")
    public void userEntersAsUsername(String userName) {
        logOutPage.userName.sendKeys(userName);
    }

    @And("user enters {string} as password")
    public void userEntersAsPassword(String password) {
        logOutPage.password.sendKeys(password);
    }

    @And("user clicks login button")
    public void user_clicks_login_button() {
        logOutPage.loginButton.click();
    }

    @Then("user should login successfully")
    public void user_should_login_successfully() {
        BrowserUtils.verifyURLContains("files");
    }


    @When("clicks avatar icon")
    public void clicksAvatarIcon() {
        logOutPage.avatarIcon.click();
    }

    @And("user clicks logout link")
    public void userClicksLogoutLink() {
        logOutPage.logoutLink.click();
    }

    @And("user trys navigating back")
    public void userTrysNavigatingBack() {
        Driver.getDriver().navigate().back();
    }

    @Then("verify user is on the login page")
    public void verifyUserIsOnTheLoginPage() {
        Assert.assertTrue(logOutPage.loginButton.isDisplayed());
    }
}