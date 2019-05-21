package com.cucumber.framework.runner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = { "classpath:features" }, glue = {"classpath:com.cucumber.framewor.stepsDef"},
        plugin = {"pretty", "html:target/cucumber-html-report"}, tags={"@FBSmokeTest"}, monochrome = true)
public class Runner {
}
