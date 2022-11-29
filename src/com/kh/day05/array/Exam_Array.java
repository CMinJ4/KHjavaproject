package com.kh.day05.array;

import java.util.Random;

public class Exam_Array {
	public static void main(String [] args) {
		
		// 배열에 1 ~ 10 사이의 랜덤한 수 넣어서 출력하기
		Random rand = new Random();
		int [] randNums = new int[10];
		
		for(int i = 0; i < 10; i++) {
			randNums[i] = rand.nextInt(30)+1;
		}
		
		for(int i = 0; i < randNums.length; i++) {
			System.out.println(randNums[i]);
		}
		//---------------------------------------------------
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		int num;
		//배열은[선언, 할당, 초기화]로 이루어진다
		int [] nums = new int[10];
		System.out.println(nums[0]); 
		
		nums[0] = 10; 
		nums[1] = 20;
		nums[2] = 30;
		
		System.out.println("첫번째 값 : " + nums[0]);
		System.out.println("두번째 값 : " + nums[1]);
		System.out.println("세번째 값 : " + nums[2]);
		System.out.println("배열의 크기 : " + nums.length);
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
		}
		
		for(int i = 0; i < nums.length; i++) {
		//nums 배열을 모두 100으로 초기화해줌
			nums[i] = 100;
		}
		
		System.out.println();
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
		}
	}
}
