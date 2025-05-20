Feature: Swag Labs Shopping Cart

  Scenario: Validate user can add items to cart and remove items from cart and complete an order
    Given the user logs in to the application
    When the user adds item Sauce Labs Backpack
    And the user adds item Sauce Labs Bike Light
    And the user goes to the Shopping Cart page
    Then the user can see the added items in the cart
    When the user removes item Sauce Labs Bike Light from the cart
    Then the user can see the cart is updated
    When the user fills in details to check out
    Then the user sees Thank you for your order! message