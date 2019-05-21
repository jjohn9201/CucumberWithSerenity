
package com.cucumber.framework.configreader;


import com.cucumber.framework.utility.ResourceHelper;

import java.util.Properties;

public class PropertyFileReader implements ConfigReader{

	private Properties prop = null;

	public PropertyFileReader() {
		prop = new Properties();
		try {
			prop.load(ResourceHelper.getResourcePathInputStream("/src/main/resources/configfile/config.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getPropertyValue(String propertyName) {
		return prop.getProperty(propertyName);
	}


}
