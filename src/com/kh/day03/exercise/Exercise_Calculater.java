//계산기 프로그램 만들기
package com.kh.day03.exercise;

import java.util.Scanner;

public class Exercise_Calculater {
	public static void main(String[] args) {
		// 두 개의 정수를 입력받고 연산자를 입력받아서
		// 계산하는 계산기 프로그램을 작성하세요!!
		// 정수를 입력해주세요 : 11
		// 정수를 한번 더 입력해주세요 : 22
		// 연산자를 입력해주세요(+,-,*,/,%) : %
		// 결과 : 11 % 22 = 11

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 : ");
		double input1 = sc.nextDouble(); // 변수 선언 후 정수를 입력받음

		System.out.print("정수를 한번 더 입력해주세요 : ");
		double input2 = sc.nextDouble(); // 변수 선언 후 정수를 입력받음

		System.out.print("연산자를 입력해주세요(+,-,*,/,%) : ");
		char operator = sc.next().charAt(0); // 변수 선언 후 연산자를 문자로 입력받음

		double result = 0; //결과값을 저장해줄 변수선언

		System.out.println();
		
		if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') { // 연산자를 올바르게 입력받았는지 확인함.
			if (operator == '+') { // 더하기 연산자
				result = input1 + input2;
			} else if (operator == '-') { // 빼기 연산
				result = input1 - input2;
			} else if (operator == '*') { // 곱하기 연산
				result = input1 * input2;
			} else if (operator == '/') { // 나누기 연산
				result = input1 / input2;
			} else if (operator == '%') { // 나머지구하는 연산
				result = input1 % input2;
			}

			System.out.println("결과 : " + input1 + " " + operator + " " + input2 + " = " + result); // 결과를 출력함
		} else { // 연산자를 잘못 입력했을때 출력
			System.out.println("연산자를 잘못 입력하셨습니다.");
		}
	}
}