package com.cucumber.framework.Hooks;

import com.cucumber.framework.utils.LoggerHealper;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.log4j.Logger;


import static java.lang.String.format;


public class Hooks {
    private static boolean beforeRun = false;
    private static Logger log = LoggerHealper.getLogger(Hooks.class);

    @Before
    public void beforeEachScenario(Scenario scenario){
        log.info(format("============================= Executing Scenario : %s =============================",scenario.getName()));
    }

    @After
    public void afterEachScenario(Scenario scenario){
        log.info("============================= End of Scenario =============================");
    }

}
