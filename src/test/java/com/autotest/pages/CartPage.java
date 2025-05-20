package com.autotest.pages;

import com.autotest.lib.Wait;
import com.autotest.util.Debugger;
import jdk.nashorn.internal.runtime.Debug;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.autotest.util.GlobalVariables.itemsList;

public class CartPage {
    WebDriver driver;

    private final By cartItems = By.xpath("//div[@class='cart_item']//div[@class='inventory_item_name']");
    private String cartRemoveButton = "//div[@class='inventory_item_name'][text()='product_name']/ancestor::div[@class='cart_item']//button";
    private By checkOutButton = By.id("checkout");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void validateCartForItemsAdded() {
        boolean isItemPresentInCart = false;
        List<WebElement> itemsInCart = driver.findElements(cartItems);

        Assert.assertEquals("Expected number of items and actual number of items in the cart do not match. Expected count = " + itemsList.size() + ". Actual count = " + itemsInCart.size(), itemsList.size(), itemsInCart.size());

        // Compare the list of items added with items currently in the cart
        for (String expectedItem : itemsList) {
            for (WebElement item : itemsInCart) {
                isItemPresentInCart = false;
                Debugger.println(expectedItem);
                Debugger.println(item.getText());
                if (item.getText().equalsIgnoreCase(expectedItem)) {
                    isItemPresentInCart = true;
                    break;
                }
            }
            if (!isItemPresentInCart) {
                Assert.assertTrue("Item not found in cart: " + expectedItem, isItemPresentInCart);
            }
        }
    }

    public void removeItemFromCart(String productName) {
        driver.findElement(By.xpath(cartRemoveButton.replace("product_name", productName))).click();
        itemsList.remove(productName);
    }

    public void goToCheckOut() {
        driver.findElement(checkOutButton).click();
    }
}
