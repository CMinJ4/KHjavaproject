package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_For4 {
	public static void main(String[] args) {
		/*
		 * - 문제 - 정수를 하나 입력받아서 그 수가 1 ~ 9 사이의 수일 때만 그 수의 구구단을 출력하세요. 단, 조건이 맞지 않으면
		 * " 1 ~ 9사이의 양수를 입력하셔야 합니다"를 출력하세요.
		 */

		Scanner sc = new Scanner(System.in); // 정수를 입력받기 위해 Scanner 변수 생성

		System.out.print("정수 하나를 입력하세요 : ");
		int input = sc.nextInt(); // 정수를 입력받아 input변수에 넣어줌

		// AND && OR ||
		if (input >= 1 && input <= 9) { // 입력받은 정수가 1 ~ 9 사이의 숫자인지 확인
			for (int i = 1; i <= 9; i++) { // 입력받은 정수의 구구단 결과 출력
				System.out.println(input + " * " + i + " = " + input * i);
			}
		} else { // 입력받은 정수가 1 ~ 9 사이의 숫자가 아닐때 출력
			System.out.println("1 ~ 9사이의 양수를 입력하셔야 합니다.");
		}

	}
}
