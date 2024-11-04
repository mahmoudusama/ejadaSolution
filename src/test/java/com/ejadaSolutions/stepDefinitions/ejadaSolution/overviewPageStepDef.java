package com.ejadaSolutions.stepDefinitions.ejadaSolution;

import com.ejadaSolutions.common.ui.base.BaseWebDriver;
import com.ejadaSolutions.common.ui.uiAutomation.JSUtils;
import com.ejadaSolutions.project.CheckoutPage;
import com.ejadaSolutions.project.OverviewPage;
import io.cucumber.java.en.Then;

public class overviewPageStepDef extends BaseWebDriver {
    private final OverviewPage overviewPage  = new OverviewPage();

    @Then("user verify that URL matched with {string}")
    public void validateUrl(String url) {
        overviewPage.assertUrl(url);
    }

    @Then("user validate total price are equal item price")
    public void validatePrice() {
        overviewPage.validateTotalPrice();
    }

    @Then("user click on Finish")
    public void clickOnFinish() {
        overviewPage.clickFinish();
    }



}