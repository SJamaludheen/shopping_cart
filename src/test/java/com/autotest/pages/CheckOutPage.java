package com.autotest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {
    WebDriver driver;

    private final By firstName = By.id("first-name");
    private final By lastName = By.id("last-name");
    private final By postCode = By.id("postal-code");
    private final By continueButton = By.id("continue");

    public CheckOutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void completeOrderDetails() {
        driver.findElement(firstName).sendKeys("Adam");
        driver.findElement(lastName).sendKeys("Smith");
        driver.findElement(postCode).sendKeys("60134");
        driver.findElement(continueButton).click();
    }
}
