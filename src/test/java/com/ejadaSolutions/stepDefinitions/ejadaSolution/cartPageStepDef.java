package com.ejadaSolutions.stepDefinitions.ejadaSolution;

import com.ejadaSolutions.common.ui.base.BaseWebDriver;
import com.ejadaSolutions.common.ui.uiAutomation.JSUtils;
import com.ejadaSolutions.project.CartPage;
import com.ejadaSolutions.project.ProductsPage;
import io.cucumber.java.en.Then;

public class cartPageStepDef extends BaseWebDriver {
    private final CartPage cartPage  = new CartPage();

    @Then("validate {string} product is added to cart")
    public void validateErrorMessage(String product) {
        cartPage.assertProductInCart(product);
    }
    @Then("user clicks on {string} button in cart page")
    public void buttonsInCart(String button) {
        switch (button.toLowerCase()) {
            case "continue shopping":
                cartPage.clickConShopping();
                break;
            case "checkout":
                cartPage.clickCheckout();
                break;
            default:
                log.warn("Unknown button: {}", button);
                break;
        }
    }



}