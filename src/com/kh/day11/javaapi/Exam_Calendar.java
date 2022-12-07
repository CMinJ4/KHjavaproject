package com.kh.day11.javaapi;

import java.util.Calendar;

public class Exam_Calendar {
	public static void main(String [] args) {
		// 현재 출력
		Exam_Calendar exCal = new Exam_Calendar();
		Calendar today = Calendar.getInstance();
		exCal.printCalendar("현재", today);
		
		System.out.println();
		// 개강일 출력
		Calendar someDate = Calendar.getInstance();
		someDate.clear();
		someDate.set(2022, 10, 23);
		someDate.set(Calendar.HOUR_OF_DAY, 9);
		someDate.set(Calendar.MINUTE, 0);
		exCal.printCalendar("개강일", someDate);
		
		System.out.println();
		// 종강일 출력
		Calendar endDate = Calendar.getInstance();
		endDate.clear();
		endDate.set(2023, 4, 02);
		endDate.set(Calendar.HOUR_OF_DAY, 17);
		endDate.set(Calendar.MINUTE, 50);
		exCal.printCalendar("종강일", endDate);
	}
	
	public void printCalendar(String msg, Calendar cal) {
		int year		= cal.get(Calendar.YEAR); // 년도
		int month		= cal.get(Calendar.MONTH)+1; // 월(0월부터 시작하기 때문에 + 1 해야함)
		int day			= cal.get(Calendar.DAY_OF_MONTH); // 일
		int hourOfDay	= cal.get(Calendar.HOUR_OF_DAY); // 24시간 표시
		int dayOfweek	= cal.get(Calendar.DAY_OF_WEEK); // 요일(숫자로나옴)
		int ampm		= cal.get(Calendar.AM_PM); // 오전오후 나타냄
		char [] st	= {'토', '일', '월', '화', '수', '목', '금'}; // 숫자로 나오는 요일을 바꿔주기 위해 반든 배열
		int hour		= cal.get(Calendar.HOUR); // 시간
		int minute		= cal.get(Calendar.MINUTE); // 분
		int second		= cal.get(Calendar.SECOND); // 초
		int millisecond	= cal.get(Calendar.MILLISECOND); // 밀리초
		
		// 현재 2022/12/7/수요일(11시) 오전 11시 42분 33초 234밀리초
		System.out.print(msg + " " + year + "/" + month + "/" + day + "/" + st[dayOfweek] + "요일(" + hourOfDay + ") ");
		if(ampm == Calendar.AM) {
			System.out.print(" 오전 ");
		}else {
			System.out.print(" 오후 ");
		}
		System.out.print(hour + "시 " + minute + "분 " + second + "초 " + millisecond + "밀리초");
	}
}
