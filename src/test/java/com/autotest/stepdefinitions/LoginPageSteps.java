package com.autotest.stepdefinitions;

import com.autotest.pages.Pages;
import com.autotest.config.SeleniumDriver;
import cucumber.api.java.en.Given;

public class LoginPageSteps extends Pages {

    public LoginPageSteps(SeleniumDriver driver) {
        super(driver);
    }

    @Given("^the user logs in to the application$")
    public void theUserLogsInToTheApplication() {
        loginPage.accessSwagLabsSite();
        loginPage.userLogsIn();
    }
}