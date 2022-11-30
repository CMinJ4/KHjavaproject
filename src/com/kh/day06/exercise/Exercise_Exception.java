package com.kh.day06.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception {
	public void practice1() {
		while(true) {
			try {
				Scanner sc = new Scanner(System.in);		
				System.out.print("정수 하나 입력해주세요 : ");
				int num1 = sc.nextInt();
				System.out.print("정수 하나 더 입력해주세요 : ");
				int num2 = sc.nextInt();
				System.out.println("나눠드릴게요 ^^");
				int result = num1 / num2; // 이 부분에서 오류가 생기면 아래 문장을 실행하지 않고 바로 catch문이 실행됨
				System.out.println("몫은 " + result + "입니다~");
				break;// 성공했을시 프로그램을 종료하는 부분
			}catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
			}
			
		}
		
	}
	
	public void practice2() {
		/*
		정수 3개를 입력하세요
		0>>5
		1>>R
		정수가 아닙니다. 다시 입력하세요!
		1>>4
		2>>6
		합은 15
		*/
		
		Scanner sc = new Scanner(System.in);
		int num = 0, sum = 0;
		
		System.out.println("정수 3개를 입력하세요");
		
		for(int i = 0; i < 3; i++) {
			System.out.print(i + ">>");
			try {
				num = sc.nextInt(); //try 안에서 선언한 변수는 그 안에서만 쓸 수 있다(지역변수)
			}catch(InputMismatchException e){
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
				sc.next();	//잘못입력한 값을 초기화시켜줌
				i--;		// 1로 다시 가도록 -1해줌, i++를 만나서 1이 되기 위해서
				continue;	//아래 코드를 스킵 (sum += num; 명령어를 스킵)
			}
			sum += num;
		}
		System.out.println("합은 " + sum);
	}
}
