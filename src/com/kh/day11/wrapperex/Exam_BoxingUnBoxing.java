package com.kh.day11.wrapperex;

public class Exam_BoxingUnBoxing {
	public static void main(String [] args) {
		Integer num = Integer.valueOf(0);
		//Boxing = int���� Integer��
		//UnBoxing = Integer���� int��
		
		//Boxing : ���� Integer.valieOf(0)�� ���� ����
		Integer su = 100; 
		
		int soo = num.intValue(); // �⺻������ �ٽ� �����ؼ� ����ϴ¹�
		// UnBoxing
		soo = num; // �ڿ� .intValue()�� ������ �� �ִ�.
		
		int n = 10;
		Integer intObject = n; // Boxing
		System.out.println("intObject : " + intObject);
		
		int m = intObject + 10; // UnBoxing
		System.out.println("m = " + m);
	}
}
