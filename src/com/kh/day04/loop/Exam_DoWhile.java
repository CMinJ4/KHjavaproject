package com.kh.day04.loop;

import java.util.Scanner;

public class Exam_DoWhile {
	public static void main(String [] args) {
		// 입력한 수가 -1이 될때까지 ~~ 하시오.
		System.out.println("입력받은 모든 정수의 합 구하기.");
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		int sum = 0;
		
		do {
			sum += input;
			System.out.print("정수 입력 : ");
			input = sc.nextInt();
		}while(input != -1);
		
		System.out.println("결과 : " + sum);
	}
}