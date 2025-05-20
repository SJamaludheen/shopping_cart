package com.autotest.pages;

import com.autotest.lib.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.autotest.util.GlobalVariables.itemsList;

public class ProductsPage {
    WebDriver driver;

    private String addCartButton = "//div[@class='inventory_item_name '][text()='product_name']/ancestor::div[@class='inventory_item']//button";
    private By cartLink = By.xpath("//a[@class='shopping_cart_link']");

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addItem(String productName) {
        driver.findElement(By.xpath(addCartButton.replace("product_name", productName))).click();
        itemsList.add(productName);
    }

    public void goToShoppingCart() {
        driver.findElement(cartLink).click();
    }
}
