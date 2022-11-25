package com.kh.day02.exercise;
import java.util.Scanner;

public class Exercise_Logical1 {
	public static void main(String [] args) {
		System.out.println("*논리연산 연습문제 1번*");
		System.out.println();
		/* 입력한 정수가 1 ~ 100 사이의 숫자인지 확인하세요!
		 * 숫자는 변수 num에 초기화해주세요
		 * 1부터 100사이의 숫자인가? : true
		 */
		
		boolean result1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("확인할 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		//System.out.println();
		//result1 = (1 <= num) && (100 >= num
		//System.out.println("1부터 100사이의 숫자인가? : " + result1);
		
		if(result1 = (1 <= num) && (100 >= num)) {
			System.out.println("1부터 100사이의 숫자가 맞습니다.");
		}else{
			System.out.println("1부터 100사이의 숫자가 아닙니다.");
		}
		
		
	}
}
