package net.seamlessly.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.seamlessly.pages.LoginPage;
import net.seamlessly.utilities.BrowserUtils;
import net.seamlessly.utilities.Driver;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get("seamlesslyUrl");
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
    public void user_should_login_successfully() {
        BrowserUtils.verifyURLContains("files");
    }


}
