package com.kh.day11.javaapi;

import java.util.Calendar;

public class Exam_Calendar {
	public static void main(String [] args) {
		// ���� ���
		Exam_Calendar exCal = new Exam_Calendar();
		Calendar today = Calendar.getInstance();
		exCal.printCalendar("����", today);
		
		System.out.println();
		// ������ ���
		Calendar someDate = Calendar.getInstance();
		someDate.clear();
		someDate.set(2022, 10, 23);
		someDate.set(Calendar.HOUR_OF_DAY, 9);
		someDate.set(Calendar.MINUTE, 0);
		exCal.printCalendar("������", someDate);
		
		System.out.println();
		// ������ ���
		Calendar endDate = Calendar.getInstance();
		endDate.clear();
		endDate.set(2023, 4, 02);
		endDate.set(Calendar.HOUR_OF_DAY, 17);
		endDate.set(Calendar.MINUTE, 50);
		exCal.printCalendar("������", endDate);
	}
	
	public void printCalendar(String msg, Calendar cal) {
		int year		= cal.get(Calendar.YEAR); // �⵵
		int month		= cal.get(Calendar.MONTH)+1; // ��(0������ �����ϱ� ������ + 1 �ؾ���)
		int day			= cal.get(Calendar.DAY_OF_MONTH); // ��
		int hourOfDay	= cal.get(Calendar.HOUR_OF_DAY); // 24�ð� ǥ��
		int dayOfweek	= cal.get(Calendar.DAY_OF_WEEK); // ����(���ڷγ���)
		int ampm		= cal.get(Calendar.AM_PM); // �������� ��Ÿ��
		char [] st	= {'��', '��', '��', 'ȭ', '��', '��', '��'}; // ���ڷ� ������ ������ �ٲ��ֱ� ���� �ݵ� �迭
		int hour		= cal.get(Calendar.HOUR); // �ð�
		int minute		= cal.get(Calendar.MINUTE); // ��
		int second		= cal.get(Calendar.SECOND); // ��
		int millisecond	= cal.get(Calendar.MILLISECOND); // �и���
		
		// ���� 2022/12/7/������(11��) ���� 11�� 42�� 33�� 234�и���
		System.out.print(msg + " " + year + "/" + month + "/" + day + "/" + st[dayOfweek] + "����(" + hourOfDay + ") ");
		if(ampm == Calendar.AM) {
			System.out.print(" ���� ");
		}else {
			System.out.print(" ���� ");
		}
		System.out.print(hour + "�� " + minute + "�� " + second + "�� " + millisecond + "�и���");
	}
}
