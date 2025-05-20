package com.autotest.pages;

import com.autotest.config.AppConfig;
import com.autotest.lib.SeleniumLib;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class LoginPage {
    WebDriver driver;
    SeleniumLib seleniumLib;
    private final By username = By.id("user-name");
    private final By password = By.id("password");
    private final By loginButton = By.id("login-button");
    private final By pageTitle = By.xpath("//span[@class='title']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        seleniumLib = new SeleniumLib(driver);
    }

    public void accessSwagLabsSite() {
        Properties config = AppConfig.loadConfigProperties("AppConfig.properties");
        String website = config.getProperty("SwagLabs");
        driver.get(website);
    }

    public void userLogsIn() {
        Properties config = AppConfig.loadConfigProperties("AppConfig.properties");
        String userId = config.getProperty("username");
        String passwordCreds = config.getProperty("password");
        driver.findElement(username).sendKeys(userId);
        driver.findElement(password).sendKeys(passwordCreds);
        driver.findElement(loginButton).click();
        Assert.assertTrue("Swag Labs home page not loaded as expected.", driver.findElement(pageTitle).isDisplayed());
    }
}
