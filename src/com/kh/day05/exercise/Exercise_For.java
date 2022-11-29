package com.kh.day05.exercise;

import java.util.Scanner;
//exercise 메소드로 묶어서 하나로 만들기.

public class Exercise_For {
	
	public void exercise1() {
		// For1누적합
		// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10
		int result = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1부터 몇까지의 숫자의 합을 구하시겠습니까? : ");
		int input = sc.nextInt();
		int count = 1;
		System.out.println();
		
		for(int i = 1; i <= input; i++) {
			result += i;
			System.out.print(i);
			
			if(count == 10) {
				System.out.println();
				count = 0;
			}
			
			if(i < input) {
				System.out.print(" + ");
			}
			count ++;
			
			
		}
		System.out.println();
		System.out.println(" 의 값은 : " + result + " 입니다.");
	}
			
	public void exercise2() {
		//For2
		//1부터 10까지의 덧셈을 표시하고 합도 구하시오	
		int result = 0; //결과값을 저장할 변수
		
		for(int i = 1; i <= 10; i++) {
			result += i;//result 변수 안에 1 부터 10까지 더한 값을 저장해준다.
			System.out.print(i);//숫자를 출력해주는 부분 
			
			if(i <= 9) { // 숫자 1 ~ 10 사이에 +라는 문자를 넣어주기 위해 정해준 범위
				System.out.print(" + ");//+를 출력해주는 부분 마지막 10 뒤에는 출력하지 않는다.
			}else {
				System.out.print(" = ");
			}
		}
		System.out.println(result);//결과값을 출력하는 부분
	}
			
	public void exercise3() {
		//For3
		int result = 0;
		
		for(int i = 1; i <= 9; i++){
			result = 2 * i;
			
			System.out.println("2 * " + i + " = " + result);
		}
	}
	
	public void exercise4() {
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
