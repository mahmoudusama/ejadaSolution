package com.ejadaSolutions.stepDefinitions.ejadaSolution;

import com.ejadaSolutions.common.ui.base.BaseWebDriver;
import com.ejadaSolutions.common.ui.uiAutomation.JSUtils;
import com.ejadaSolutions.project.CompletePage;
import com.ejadaSolutions.project.OverviewPage;
import io.cucumber.java.en.Then;

public class completePageStepDef extends BaseWebDriver {
    private final CompletePage completePage  = new CompletePage();

    @Then("user validate {string} and {string} messages are shown")
    public void validateUrl(String firstMessage, String secondMessage) {
        completePage.assertMessage(firstMessage);
        completePage.assertMessage(secondMessage);
    }
}