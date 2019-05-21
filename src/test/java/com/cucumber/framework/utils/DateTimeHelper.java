package com.cucumber.framework.utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @author bsingh5
 *
 */
public class DateTimeHelper {

	public static String getCurrentDateTime() {

		DateFormat dateFormat = new SimpleDateFormat("_yyyy-MM-dd_HH-mm-ss");
		Calendar cal = Calendar.getInstance();
		String time = "" + dateFormat.format(cal.getTime());
		return time;
	}

	public static String getCurrentDateTime(final String dtFormat) {
		DateFormat dateFormat = new SimpleDateFormat(dtFormat);
		Calendar cal = Calendar.getInstance();
		String time = "" + dateFormat.format(cal.getTime());
		return time;
	}

	public static String getCurrentDate() {
		return getCurrentDateTime().substring(0, 11);
	}

	public  static String getCurrentDatePlus(final  int days, final String format){
		DateFormat dateFormat = new SimpleDateFormat(format);
		Date dt = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(dt);
		cal.add(Calendar.DATE,1);
		return  ""+dateFormat.format(cal.getTime());
	}
}
