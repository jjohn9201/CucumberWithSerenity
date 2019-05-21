package com.cucumber.framework.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.time.temporal.TemporalUnit;
import java.util.Map;

import static java.lang.String.format;
import static java.util.concurrent.TimeUnit.SECONDS;
import static net.bytebuddy.matcher.ElementMatchers.is;

@DefaultUrl("https://www.facebook.com/")
public class FacebookLoginPage extends PageObject {
    CurrentPage currentPage;

    @FindBy(xpath = "//*[@name='firstname']")
      WebElement firstName;

    @FindBy(xpath = "//*[@name='lastname']")
      WebElement lastname;

    @FindBy(xpath = "//*[@name='reg_email__']")
    WebElement reg_email_mobile;

    @FindBy(xpath = "//*[@name='reg_passwd__']")
    WebElement password;

    @FindBy(id="day")
    WebElementFacade day;

    @FindBy(id="month")
    WebElementFacade month;

    @FindBy(id="year")
    WebElementFacade year;

    @FindBy(xpath="//label[contains(text(),'Female')]")
    WebElementFacade femaleRadioButton;

    @FindBy(xpath="//label[contains(text(),'Female')]")
    WebElementFacade maleRadioButton;

    @FindBy(xpath="//button[@id='u_0_11']")
    WebElementFacade signUpButton;


    public void createNewFbAccount(Map<String, String> data) {
        if(data.get("gender").toCharArray().length>1){
            throw  new IllegalStateException(format("Please use M/F for gender column"));
        }

        firstName.sendKeys(data.get("firstName").trim());
        lastname.sendKeys(data.get("surname").trim());
        if(data.get("email_mobile").trim().contains("@")) {
            reg_email_mobile.sendKeys(data.get("email_mobile").trim());
            $("//*[@name='reg_email_confirmation__']").isPresent();
            $("//*[@name='reg_email_confirmation__']").sendKeys(data.get("email_mobile").trim());
        }else{reg_email_mobile.sendKeys(data.get("email_mobile").trim());}

        password.sendKeys(data.get("password"));
        day.selectByVisibleText(data.get("dob").trim().split("/")[0]);
        month.selectByVisibleText(data.get("dob").trim().split("/")[1]);
        year.selectByVisibleText(data.get("dob").trim().split("/")[2]);

        if (data.get("gender").trim().equalsIgnoreCase("F") || data.get("gender").trim().equalsIgnoreCase("FEMALE")){
            femaleRadioButton.click();
        }else if(data.get("gender").trim().equalsIgnoreCase("M") || data.get("gender").trim().equalsIgnoreCase("MALE")){
            femaleRadioButton.click();
        }else{ Assert.fail("Please populate correct values for gender field.");
        }

        $("//button[@id='u_0_11']").getText();
        //waitFor("//*[@id='bluebar_profile_and_home']//span[text()='"+data.get("firstName").trim()+"']");
    }

}
