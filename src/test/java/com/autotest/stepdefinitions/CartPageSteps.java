package com.autotest.stepdefinitions;

import com.autotest.config.SeleniumDriver;
import com.autotest.pages.Pages;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CartPageSteps extends Pages {
    public CartPageSteps(SeleniumDriver driver) {
        super(driver);
    }

    @Then("^the user can see the added items in the cart$")
    @And("^the user can see the cart is updated$")
    public void theUserCanSeeTheAddedItemsInTheCart() {
        cartPage.validateCartForItemsAdded();
    }

    @When("^the user removes item (.*) from the cart$")
    public void theUserRemovesItemFromTheCart(String productName) {
        cartPage.removeItemFromCart(productName);
    }
}
