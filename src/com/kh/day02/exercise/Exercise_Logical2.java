package com.kh.day02.exercise;
import java.util.Scanner;

public class Exercise_Logical2 {
	public static void main(String [] args) {
		System.out.println("*논리연산 연습문제 2번*");
		System.out.println();
		/*
		 * 문자 A가 대문자인지 소문자인지 확인하세요!
		 * 단, A라는 문자는 변수 word에 초기화해주세요.
		 * 영어 대문자 확인 : true
		 */
		
		//char word = 'A';
		String Sword;
		boolean result1;
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("확인할 알파벳을 입력해주세요 : ");
		char word = sc1.next().charAt(0);
			
		//아스키코드표로 비교해서 결과를 확인한다 숫자 91 미만은 대문자 91이상은 소문자이다.
		//result1 = (word > 64) && (word < 91);
		//System.out.println("영어 대문자 확인 : " + result1);
		
		if((word > 64) && (word < 91)) {
			System.out.println("대문자가 맞습니다.");
		}else {
			System.out.println("대문자가 아닙니다.");
		}
	}
}