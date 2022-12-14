package com.kh.day11.javaapi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

// 간단하게 날짜 불러오는법
public class Exam_Date {
	public static void main(String [] args) {
		System.out.println("[SimpleDateFormat 사용]");
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat trans = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String transDate1 = trans.format(date);
		System.out.println(transDate1);
		
		SimpleDateFormat trans2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SS"); // ss = 초 SS = 밀리초
		String transDate2 = trans2.format(date);
		System.out.println(transDate2);
		
		System.out.println();
		System.out.println("[GregorianCalendar 사용]");
		Calendar calendar = new GregorianCalendar();
		System.out.println(calendar.getTime());
		String changed = trans2.format(calendar.getTime());
		System.out.println("changed : " + changed);
	}
}
