package com.cucumber.framework.steps;

import com.cucumber.framework.pages.CurrentPage;
import com.cucumber.framework.pages.FacebookLoginPage;
import cucumber.api.DataTable;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class FacebookUserSteps extends ScenarioSteps {

    FacebookLoginPage facebookLoginPage;
    CurrentPage currentPage;

    @Step
    public void userIsAbleToNavigateToFacebookSite() {
        facebookLoginPage.open();
        Assert.assertEquals(currentPage.getTitle().contains("Facebook – log in or sign up"),true);
    }

    @Step
    public void userCreatesANewFBAccountWithFollowingData(DataTable testData) {
        //Write the code to handle Data Table
        for (Map<String, String> data : testData.asMaps(String.class, String.class)) {
            currentPage.open();
            facebookLoginPage.createNewFbAccount(data);
        }
    }
}
