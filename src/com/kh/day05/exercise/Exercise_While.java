package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_While {
	
	public void exercise1() {
		// while문을 이용하여 1 ~ 100 사이의 홀수의 합을 출력하시오.
		int i = 1; // while 문 동작을 위한 변수
		int result = 0; // 결과값을 저장할 변수

		while (i <= 100) { // 1 ~ 100까지 돌아감
			/*
			 * if(i%2 == 1) { // 2로 나눠서 나머지가 1이면 실행. 즉 홀수이면 실행 result += i; // result 변수 안에
			 * result + i의 값을 저장함 } i++; // i 를 1 증가시킴
			 */
			result += i;
			i += 2; // 1에서 2씩 증가하면 계속 홀수임
		}

		System.out.println("1 ~ 100 까지의 홀수의 핲은 : " + result + "입니다."); // 결과출력
	}

	
	
	public void exercise2() {
		/*
		 * - 문제 - 정수를 하나 입력받아서 그 수가 1 ~ 9 사이의 수일 때만 그 수의 구구단을 출력하세요. 단, 조건이 맞지 않으면
		 * " 1 ~ 9사이의 양수를 입력하셔야 합니다"를 출력하세요.
		 */

		Scanner sc = new Scanner(System.in); // 정수를 입력받기 위한 Scanner 변수 선언
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt(); // input 변수에 입력받은 정수 저장
		int i = 1; // while문 사용을 위한 변수 선언

		if (input >= 1 && input <= 9) { // 입력받은 정수가 1 ~ 9 사이 숫자인지 판별후 true면 실행
			while (i <= 9) { // i 가 9일때까지 반복
				System.out.println(input + " * " + i + " = " + input * i); // 출력
				i++; // i 증가
			}
		} else {
			System.out.println("1 ~ 9 사이의 양수를 입력하셔야 합니다."); // 입력받은 정수가 1 ~ 9 사이의 숫자가 아닐시 출력
		}
	}

	
	
	public void exercise3() {
		/*
		 * while문을 이용하여 -1이 입력될 때까지 정수를 입력받고 -1이 입력되면 입력한 수의 합을 구하여라 정수 하나 입력 : 3 정수 하나
		 * 입력 : 4 정수 하나 입력 : 7 정수 하나 입력 : -1 입력하신 수의 합은 : 14
		 */

		// for문을 이용하여 해결하기
		Scanner sc = new Scanner(System.in); // 정수를 입력받기 위한 sc 변수 선언
		int result = 0; // 결과값을 저장할 result 변수 선언 초기화

		/*
		 * for (;;) { // 무한루프로 돌아갈 for문 System.out.print("정수 하나 입력 : "); int input =
		 * sc.nextInt(); // input 변수에 정수 입력받아 저장
		 * 
		 * if(input == -1) { // input 변수가 -1이면 for문을 빠져나감 break; }
		 * 
		 * result += input; // result 변수에 입력받은 정수를 더해서 저장함 }
		 * 
		 * System.out.println("입력하신 수의 합은 : " + result);
		 */
		// while문을 이용하여 해결하기

		// result = 0;

		int input2 = 0;

		while (true) {
			System.out.print("정수 하나 입력 : ");
			input2 = sc.nextInt();

			if (input2 == -1) {
				break;
			}

			result += input2;
		}

		System.out.println("입력하신 수의 합은 : " + result);

		/*
		 * int input3 = 0; int sum2 = 0; do { System.out.print("정수 하나 입력 : "); input3 =
		 * sc.nextInt();
		 * 
		 * if(input3 != -1) { sum2 += input3; } }while(input3 != -1);
		 * 
		 * System.out.println("입력하신s 수의 합은 : " + sum2);
		 */
	}
}
