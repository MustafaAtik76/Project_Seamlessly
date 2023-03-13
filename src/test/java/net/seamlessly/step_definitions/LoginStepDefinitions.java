package net.seamlessly.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.seamlessly.pages.DashboardPage;
import net.seamlessly.pages.LoginPage;
import net.seamlessly.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get("https://qa.seamlessly.net/");
    }

    @When("user enters {string} as username")
    public void user_enters_as_username(String userName) {
        loginPage.userName.sendKeys(userName);
    }

    @When("user enters {string} as password")
    public void user_enters_as_password(String password) {
        loginPage.password.sendKeys(password);
    }

    @When("user clicks login button")
    public void user_clicks_login_button() {
        loginPage.loginButton.click();
    }

    @Then("user should login successfully")
    public void user_should_login_successfully() throws InterruptedException {
        Thread.sleep(3000);
        String actual = dashboardPage.header.getText();
        String expected = "Hello";
        Assert.assertEquals(expected, actual);
    }

    @When("user clicks Enter Key")
    public void user_clicks_enter_key() {
        loginPage.password.sendKeys(Keys.ENTER);
    }

    @When("user enters {string} to username field")
    public void user_enters_to_username_field(String username) {
        loginPage.userName.sendKeys(username);

    }

    @When("user enters {string} to password field")
    public void user_enters_to_password_field(String password) {
        loginPage.password.sendKeys(password);

    }

    @Then("Wrong username or password Message Displayed")
    public void wrong_username_or_password_message_displayed() {
        String expectedWarningMessage = "Wrong username or password.";
        String actualWarningMessage = loginPage.invalidCredentialsWarning.getText();
        Assert.assertEquals(actualWarningMessage, expectedWarningMessage);

    }
    @When("user leave blank {string} to username field")
    public void user_leave_blank_to_username_field(String username) {
        loginPage.userName.sendKeys(username);
    }
    @When("user leave blank {string} to password field")
    public void user_leave_blank_to_password_field(String password) {
        loginPage.password.sendKeys(password);
    }

    @Then("Please Fill Out UserName Field Displayed")
    public void pleaseFillOutThisFieldDisplayed() {
        String expectedMessage = "Please fill out this field.";
        String actualMessage = Driver.getDriver().findElement(By.name("user")).getAttribute("validationMessage");
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Then("Please Fill Out Password Field Displayed")
    public void pleaseFillOutPasswordFieldDisplayed() {
        String expectedMessage = "Please fill out this field.";
        String actualMessage = Driver.getDriver().findElement(By.name("password")).getAttribute("validationMessage");
        Assert.assertEquals(actualMessage, expectedMessage);
    }
}
