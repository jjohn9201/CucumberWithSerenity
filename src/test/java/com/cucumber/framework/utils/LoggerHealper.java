package com.cucumber.framework.utils;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import com.cucumber.framework.utility.ResourceHelper;

public class LoggerHealper {
    private static boolean root =false;
    public static Logger getLogger(final Class classObj){
        if(LoggerHealper.root){
            return Logger.getLogger(classObj);
        }
        PropertyConfigurator.configure(ResourceHelper.getResourcePath("\\src\\test\\resources\\configFiles\\log4j.properties"));
        LoggerHealper.root=true;
        return Logger.getLogger(classObj);
    }
}
