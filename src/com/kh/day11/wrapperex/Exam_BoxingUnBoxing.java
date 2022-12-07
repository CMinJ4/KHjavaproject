package com.kh.day11.wrapperex;

public class Exam_BoxingUnBoxing {
	public static void main(String [] args) {
		Integer num = Integer.valueOf(0);
		//Boxing = int에서 Integer로
		//UnBoxing = Integer에서 int로
		
		//Boxing : 위에 Integer.valieOf(0)을 생략 가능
		Integer su = 100; 
		
		int soo = num.intValue(); // 기본형으로 다시 변경해서 사용하는법
		// UnBoxing
		soo = num; // 뒤에 .intValue()를 생략할 수 있다.
		
		int n = 10;
		Integer intObject = n; // Boxing
		System.out.println("intObject : " + intObject);
		
		int m = intObject + 10; // UnBoxing
		System.out.println("m = " + m);
	}
}
