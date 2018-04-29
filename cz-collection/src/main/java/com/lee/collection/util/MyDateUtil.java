package com.lee.collection.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyDateUtil {
	public static String DATE_TIME = "yyyy-MM-dd-HH-mm-ss";
	public static String DATE = "yyyy-MM-dd";

	public static Date getMyDate(int i) {
		Calendar c = Calendar.getInstance();

		c.add(Calendar.DATE, i);

		return c.getTime();
	}

	public static String getMyDateString() {
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_TIME);

		String format = sdf.format(new Date());
		return format;
	}
	
	public static String dateFormatUtils(String begin_entrust)
	{
		StringBuilder s = new StringBuilder();
		String[] begins = begin_entrust.split("/");
		s.append(begins[2]).append("-").append(begins[0]).append("-").append(begins[1]);
		return s.toString();
	}
	
}
