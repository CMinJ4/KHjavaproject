package com.kh.day02.operator;

public class Exam_Comparison {
	public static void main(String [] args) {
		System.out.println("*비교연산자 예제*");
		System.out.println();
		// 1 < 2,	3 < 2,	1 == 2,	1 != 1
		// true,	false,	false,	false
		// 비교연산자 : 두 값을 비교하는 연산자, 관계연산자
		// 비교연산자는 조건을 만족하면 true, 아니면 false를 반환함.
		//[자료형] [변수명] [대입연산자] [데이터] [;]
		
		int num1 = 50;
		int num2 = 30;
		
		boolean result = num1 < num2;
		System.out.println("(num1 < num2)의 결과 : " + result);
		
		result = (num1 > num2);
		System.out.println("(num1 > num2)의 결과 : " + result);
		
		result = (num1 == num2); // 두 변수의 값이 같은지 비교할때는 "==" 사용
		System.out.println("(num1 == num2)의 결과 : " + result);
		
		result = (num1 != num2);
		System.out.println("(num1 != num2)의 결과 : " + result);
		
		System.out.println();
		System.out.println();
		
		/*
		어디서 사용할까?
		짝홀 판별 프로그램
		짝수란 무엇인가? 2로 나눴을 때 나머지가 0인 숫자
		*/
		
		int num = 2;
		result = (num % 2 == 0); // num변수 안에 숫자를 2로 나눠서 나온 나머지가 0이면 true
		// 나누기[/]의 결과는 몫, 모듈러스[%]의 결과는 나머지
		System.out.println("숫자 " + num +"은(는) 짝수인가요? : " + result);
	}
}
