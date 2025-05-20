package com.autotest.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutOverviewPage {
    WebDriver driver;
    private final By finishButton = By.id("finish");
    private final By completeMessage = By.xpath("//h2[@class='complete-header']");
    public CheckOutOverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    public void completeOrder(String message) {
        driver.findElement(finishButton).click();
        Assert.assertEquals("Expected order complete message is not displayed.", message, driver.findElement(completeMessage).getText());
    }
}
