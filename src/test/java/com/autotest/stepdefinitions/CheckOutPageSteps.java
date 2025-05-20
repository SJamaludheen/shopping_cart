package com.autotest.stepdefinitions;

import com.autotest.config.SeleniumDriver;
import com.autotest.pages.Pages;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckOutPageSteps extends Pages {

    public CheckOutPageSteps(SeleniumDriver driver) {
        super(driver);
    }

    @When("^the user fills in details to check out$")
    public void theUserFillsInDetailsToCheckOut() {
        cartPage.goToCheckOut();
        checkOutPage.completeOrderDetails();
    }

    @Then("^the user sees (.*) message$")
    public void theUserSeesOrderCompleteMessage(String message) {
        checkOutOverviewPage.completeOrder(message);
    }
}
