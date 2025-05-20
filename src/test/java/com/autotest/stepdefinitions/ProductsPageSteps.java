package com.autotest.stepdefinitions;

import com.autotest.config.SeleniumDriver;
import com.autotest.pages.Pages;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class ProductsPageSteps extends Pages {
    public ProductsPageSteps(SeleniumDriver driver) {
        super(driver);
    }

    @When("^the user adds item (.*)$")
    public void theUserAddsItems(String product) {
        productsPage.addItem(product);
    }

    @And("^the user goes to the Shopping Cart page$")
    public void theUserGoesToTheShoppingCartPage() {
        productsPage.goToShoppingCart();
    }
}
