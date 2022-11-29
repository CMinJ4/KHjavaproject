package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_While2 {
	public static void main(String [] args) {
		
		/*
			- 문제 - 정수를 하나 입력받아서 그 수가 1 ~ 9 사이의 수일 때만 그 수의 구구단을 출력하세요. 단, 조건이 맞지 않으면
			" 1 ~ 9사이의 양수를 입력하셔야 합니다"를 출력하세요.
		 */

		Scanner sc = new Scanner(System.in); // 정수를 입력받기 위한 Scanner 변수 선언
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt(); // input 변수에 입력받은 정수 저장
		int i = 1; // while문 사용을 위한 변수 선언
		
		if(input >= 1 && input <= 9 ) { // 입력받은 정수가 1 ~ 9 사이 숫자인지 판별후 true면 실행
			while(i <= 9) { // i 가 9일때까지 반복
				System.out.println(input + " * " + i + " = " + input*i); // 출력
				i++; // i 증가
			}
		}else {
			System.out.println("1 ~ 9 사이의 양수를 입력하셔야 합니다."); // 입력받은 정수가 1 ~ 9 사이의 숫자가 아닐시 출력
		}
	}
}