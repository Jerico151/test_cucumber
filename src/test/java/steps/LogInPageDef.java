package steps;

import config.UserConfig;
import io.cucumber.java.en.Then;
import pages.LogInPage;

public class LogInPageDef {
    LogInPage logInPage = new LogInPage();


    @Then("Input login")
    public void inputLogin() {
        logInPage.inputLogin(UserConfig.USER_LOGIN);

    }

    @Then("Input Password")
    public void inputPassword() {
        logInPage.inputPassword(UserConfig.USER_PASSWORD);
    }
}
