package com.homecoo.smarthome.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间格式化工具类
 * @author xiaobai
 * 
 * */
public class DateUtil {
	
	public static Date StringToDate(String dateStr, String formatStr) {
		SimpleDateFormat sdf = new SimpleDateFormat(formatStr);
		Date date = null;
		try {
			date = sdf.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	/**
	 * Date 转 年月日 时分秒
	 * */
	public static String ToYMDhms(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("YY-MM-DD hh:mm:ss");
		String date2 = sdf.format(date);
		return date2;
	}

	/**
	 * Date 转 年月日
	 * */
	public static String ToYMD(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date2 = sdf.format(date);
		return date2;
	}

	/**
	 * Date 转时分秒
	 * */
	public static String Tohms(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
		String date2 = sdf.format(date);
		return date2;
	}

}
