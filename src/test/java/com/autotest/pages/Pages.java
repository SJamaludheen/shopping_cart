package com.autotest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.autotest.config.SeleniumDriver;

public class Pages {
    protected WebDriver driver;

    //Initialize all the Pages created in this class
    protected LoginPage loginPage;
    protected ProductsPage productsPage;
    protected CartPage cartPage;
    protected CheckOutPage checkOutPage;
    protected CheckOutOverviewPage checkOutOverviewPage;

    public Pages(SeleniumDriver driver) {
        this.driver = driver;
        PageObjects();
    }

    public void PageObjects() {
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        productsPage = PageFactory.initElements(driver, ProductsPage.class);
        cartPage = PageFactory.initElements(driver, CartPage.class);
        checkOutPage = PageFactory.initElements(driver, CheckOutPage.class);
        checkOutOverviewPage = PageFactory.initElements(driver, CheckOutOverviewPage.class);
    }
}