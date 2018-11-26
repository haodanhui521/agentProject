package com.agent.core.util;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {

	public static final String DATE_FORMATE_LONG = "yyyy-MM-dd HH:mm:ss";

	public static final String DATE_FORMATE_SHOT = "yyyy-MM-dd";

	public static final String DATE_FORMAT_8 = "yyyyMMdd";

	public static final String TIME_FORMATE_SHOT = "HH:mm:ss";

	public static final String TIME_FORMAT_8 = "yyMMdd";

    public static final Integer SECOND_IN_24_H = 86400;
    
	public static boolean compareTo(Integer minute, Date dateNew, Date dateOld){
		Calendar calendarNew = Calendar.getInstance();
		Calendar calendar = Calendar.getInstance();
		calendarNew.setTime(dateNew);
		calendar.setTime(dateOld);
		calendarNew.add(Calendar.MINUTE, -1 * minute);
		return calendar.compareTo(calendarNew) != -1 ? false : true;
	}
	public static Date getCurrentDate(){
		DateTime dateTime = DateTime.now();
		return dateTime.toDate();
	}

	public static String getDateShort(){
		DateTime dateTime = DateTime.now();
		return formatDate(dateTime.toDate(),TIME_FORMAT_8);
	}

	public static String getCurDateString() {
		DateTime dateTime = DateTime.now();
		return formatDate(dateTime.toDate(),DATE_FORMATE_SHOT);
	}

	public static String getCurDate() {
		DateTime dateTime = DateTime.now();
		return formatDate(dateTime.toDate(),DATE_FORMATE_LONG);
	}

	public static Date parseDate(String dateStr){
		return parseDate(dateStr, DATE_FORMATE_LONG);
	}

	public static Date parseDate(String dateStr,String dateFormat) {
		DateTimeFormatter format = DateTimeFormat.forPattern(dateFormat);
		DateTime dateTime = format.parseDateTime(dateStr);
		return dateTime.toDate();
	}

	public static String formatDate(Date date) {
		return formatDate(date,DATE_FORMATE_LONG);
	}

	public static String formatDate(Date date,String dateFormat) {
		DateTime dateTime = new DateTime(date);
		return dateTime.toString(dateFormat);
	}

	public static Date addMiniter(Date date,int mins) {
		DateTime dateTime = new DateTime(date);
		DateTime d = dateTime.plusMinutes(mins);
		return d.toDate();
	}

    public static Date addSecond(Date date,int second) {
        DateTime dateTime = new DateTime(date);
        DateTime d = dateTime.plusSeconds(second);
        return d.toDate();
    }

    public static Date addDays(Date date,int days){
        DateTime dateTime = new DateTime(date);
        DateTime d = dateTime.plusDays(days);
        return d.toDate();
    }
    public static Date addYears(Date date,int years){
        DateTime dateTime = new DateTime(date);
        DateTime d = dateTime.plusYears(years);
        return d.toDate();
    }

	public static String getTime(Date date) {
		DateTime dateTime = new DateTime(date);
		String time = dateTime.toString(TIME_FORMATE_SHOT);
		return time;
	}

	public static boolean isBetweenTime(String startTime,String endTime,String time) {
		DateTimeFormatter format = DateTimeFormat.forPattern(TIME_FORMATE_SHOT);
		DateTime dt1 = format.parseDateTime(startTime);
		DateTime dt2 = format.parseDateTime(endTime);
		DateTime dt = format.parseDateTime(time);
		if(dt.isAfter(dt1) && dt.isBefore(dt2)) {
			return true;
		}else {
			return false;
		}
	}

    public static boolean isBetween(Long startTime, Long endTime, String time) throws ParseException {
        Long times = getTimes(time);
        return times>startTime && times<endTime;
    }

    public static Long getTimes(String s) throws ParseException {
        SimpleDateFormat sdformat = new SimpleDateFormat(TIME_FORMATE_SHOT);
        Date date = sdformat.parse(s);
        return date.getTime();
    }

    public static Integer datePassedSeconds(Date date) {
        if(date == null) {
            return 0;
        }

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);

        return hour * 3600 + minute * 60 + second;
    }


	public static void main(String[] args){
		System.out.println(parseDate("2018-11-11 22:11:00"));
	}

}
