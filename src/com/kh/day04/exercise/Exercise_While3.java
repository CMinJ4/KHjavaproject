package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_While3 {
	public static void main(String[] args) {
		/*
		 * while문을 이용하여 -1이 입력될 때까지 정수를 입력받고 -1이 입력되면 입력한 수의 합을 구하여라 정수 하나 입력 : 3 정수 하나
		 * 입력 : 4 정수 하나 입력 : 7 정수 하나 입력 : -1 입력하신 수의 합은 : 14
		 */
		
		//for문을 이용하여 해결하기
		Scanner sc = new Scanner(System.in); //정수를 입력받기 위한 sc 변수 선언
		int result = 0; // 결과값을 저장할 result 변수 선언 초기화
		
		/*
		for (;;) { // 무한루프로 돌아갈 for문 
			System.out.print("정수 하나 입력 : ");
			int input = sc.nextInt(); // input 변수에 정수 입력받아 저장
			
			if(input == -1) { // input 변수가 -1이면 for문을 빠져나감
				break;
			}
			
			result += input; // result 변수에 입력받은 정수를 더해서 저장함
		}
		
		System.out.println("입력하신 수의 합은 : " + result);
		*/
		//while문을 이용하여 해결하기
		
		//result = 0;
		
		int input2 = 0;
		
		while(true) {
			System.out.print("정수 하나 입력 : ");
			input2 = sc.nextInt();
			
			if(input2 == -1) {
				break;
			}
			
			result += input2;
		}
		
		System.out.println("입력하신 수의 합은 : " + result);
		
		/*
		int input3 = 0;
		int sum2 = 0;
		do {
			System.out.print("정수 하나 입력 : ");
			input3 = sc.nextInt();
			
			if(input3 != -1) {
				sum2 += input3;
			}
		}while(input3 != -1);
		
		System.out.println("입력하신 수의 합은 : " + sum2);
		*/
	}
}
