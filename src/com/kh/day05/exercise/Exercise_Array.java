package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_Array {
	public void exercise1() {
		//길이가 100인 배열을 선언하고 1부터 100까지의 값을
		//순서대로 넣어 그 값을 출력하는 코드를 작성하시오.
		
		int [] nums = new int[100];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = i+1;
			System.out.print(nums[i] + " ");
		}
		
	}
	
	public void exercise2() {
		// 길이가 5인 String 배열을 선언하고
		//"딸기", "복숭아", "키위", "사과", "바나나"로
		//초기화 한 후, for문을 활용하여 바나나가 있으면 바나나를 출력해보세요!.
		
		String [] fruits = new String[5];//배열 변수 생성

		// 핸드메이드 초기화
		fruits[0] = "딸기";
		fruits[1] = "복숭아";
		fruits[2] = "키위";
		fruits[3] = "사과";
		fruits[4] = "바나나";
		
		// 조금 더 편하게 할당과 초기화를 동시에!
		//중괄호 안에 바로 초기화값을 넣어주면 됨.
		String [] fruitGoods = {"딸기", "복숭아", "키위", "사과","바나나"};
		
		//for문을 이용해서 출력하기
		for(int i = 0; i < fruitGoods.length; i++) {
			System.out.print(fruitGoods[i]);
			if(fruitGoods[i] == "키위") {
				System.out.print(" <=== 발견!");
			}
			System.out.println();
		}
	}
	
	public void exercise3() {
		/*
		양의 정수 5개를 입력받아 배열에 저장하고.
		입력받은 값들의 평균을 구하는 프로그램을 작성하시오.
		*/
		
		Scanner sc = new Scanner(System.in);
		int [] input = new int[5];
		int sum = 0;
		
		System.out.println("양의 정수 5개를 입력받아 평균 구하기.");
		System.out.println();
		
		for(int i = 0; i < input.length; i++){
			System.out.print("양의 정수를 입력하세요 : ");
			input[i] = sc.nextInt();
			
			if(input[i] > 0) { //양의 정수인지 확인하는 부분
				sum += input[i]; //입력받은 수의 합을 sum 변수에 저장
			}else if(input[i] < 0) { // 양의 정수가 아니면 실행되는 부분
				System.out.println("다시 입력하세요.");
				i--; // i를 1 줄여주어야 다시 입력받을 수 있다.
			}
		}
		System.out.println("입력하신 수의 평균은 : " + (double)sum/input.length + "입니다.");	
	}
	
	public void exercise4() {
		Scanner sc = new Scanner(System.in);
		int [] input = new int[5];
		int max = 0;
		System.out.println("양의 정수 5개를 입력하세요.");
		
		for(int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
			if(input[i] > 0) {
				if(max < input[i]) {
					max = input[i];
				}
			}else if(input[i] < 0) { // 양의 정수가 아니면 실행되는 부분
				System.out.println("다시 입력하세요.");
				i--; // i를 1 줄여주어야 다시 입력받을 수 있다.
			}
		}
		
		System.out.println("입력하신 수 중 가장 큰 수는 [" + max + "]입니다.");
	}
	
	public void exercise5() {
		/*
		 * 사용자에게 주민번호를 입력 받은 후
		 * 성별 자리 이후부터 *로 저장되어 출력되도록 프로그램을 작성하시오
		 * 210618-1124600 -> 210618-1******
		 * 200518-3233920 -> 200518-3******
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 하나씩 입력하세요. : ");
		String memberNum = sc.next();
		char [] origin = new char[14];
		char [] copy = new char[14]; // 깊은 복사의 시작!
		//char [] copy = origin; 얕은 복사, 이러면 의도한 것이 아니다!
		
		//성별자리 이전까지는 입력받은 memberNum에서 한자리씩 잘라서 넣어주고 성별자리 이후는 *을 origin배열에 저장해준다.
		for(int i = 0; i < origin.length; i++) {
				origin[i] = memberNum.charAt(i);
				System.out.print(origin[i]);
		}
		
		System.out.println();
		
		//입력받은 주민번호를 copy배열에 저장해주면서 성별 이후로 *로 저장해준다.
		for(int i = 0; i < origin.length; i++) {
			if(i < 8) {
				copy[i] = origin[i];
			}else{
				copy[i] = '*';
			}
			System.out.print(copy[i]);
		}
		
		
	}
}
