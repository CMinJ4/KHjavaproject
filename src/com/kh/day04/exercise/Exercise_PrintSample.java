package com.kh.day04.exercise;
//삭제 단축키 : ctrl + d -> 한줄씩 지울 수 있음

public class Exercise_PrintSample {
	public static void main(String []args) {
		/*
		System.out.println 에서
		정수 + 문자열 -> 문자열
		*/
		System.out.println(1 + "1"); //-> 출력 11 앞에 1은 숫자, 뒤에 숫자 1은 문자
		
		// 문자 + 문자 -> 문자
		System.out.println('1' + '1');
		
		// 정수 + 정수 + 문자열 + 정수 -> 문자열
		System.out.println(10 + 20 + "Hello" + 7);
		
		//printf에 대하여 알아보자
		//println, print -> 줄바꿈의 차이가 있다.
		System.out.print("정수 입력 : "); // 바로 옆에 입력받음.
		System.out.println();//줄바꿈
		System.out.println("정수 입력 : "); // 줄바꾸고 입력받음.
		int num1 = 100;
		System.out.printf("정수 출력 : %d %d\n",20, num1); // 정수출력 \n은 prinf에서 줄바꿈의 역할을 합니다.
		String words = "World";
		System.out.printf("문자열 출력 : %s %s","Hello" , words); // 문자열 출력
	}
}
