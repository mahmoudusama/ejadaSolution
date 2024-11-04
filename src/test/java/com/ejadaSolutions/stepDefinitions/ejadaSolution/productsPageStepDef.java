package com.ejadaSolutions.stepDefinitions.ejadaSolution;

import com.ejadaSolutions.common.ui.base.BaseWebDriver;
import com.ejadaSolutions.common.ui.uiAutomation.JSUtils;
import com.ejadaSolutions.project.LoginPage;
import com.ejadaSolutions.project.ProductsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class productsPageStepDef extends BaseWebDriver {
    private final ProductsPage productsPage  = new ProductsPage();


    @Then("user clicks on {string} icon")
    @Then("user adds {string} to the cart")
    public void addProductsCart(String product) {
        switch (product.toLowerCase()) {
            case "fleece jacket":
                productsPage.clickFirstProduct();
                break;
            case "backpack":
                productsPage.clickSecondProduct();
                break;
            case "cart":
                productsPage.clickCartIcon();
                break;
            default:
                log.warn("Unknown product: {}", product);
                break;
        }
    }



}