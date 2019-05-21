package com.cucumber.framework.stepsDef;

import com.cucumber.framework.steps.FacebookUserSteps;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;

import java.util.Map;


public class FacebookUserStepDef {

   @Steps
   FacebookUserSteps facebookUserSteps;

    @Given("^User is able to Navigate to facebook site$")
    public void userIsAbleToNavigateToFacebookSite() {
        facebookUserSteps.userIsAbleToNavigateToFacebookSite();
    }

    @And("^User creates a new FB Account with following data$")
    public void userCreatesANewFBAccountWithFollowingData(DataTable testData) {
        facebookUserSteps.userCreatesANewFBAccountWithFollowingData(testData);
    }
}
